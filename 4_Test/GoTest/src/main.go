package main

import (
	"crypto/md5"
	"encoding/base64"
	"fmt"
	json "github.com/bitly/go-simplejson"
	"io/ioutil"
	"net/http"
	"strconv"
	"strings"
)

func main() {
	/*encrypted_song_id := */ encrypt_id("5676778534263558")
	/*song := "http://m1.music.126.net/" + encrypted_song_id + "/" + "5676778534263558" + ".mp3"
	song = strings.Replace(song, "http://m", "http://p", -1)
	fmt.Println(song)*/
	fmt.Println(songDetail("771835", "75949"))
	/*b1 := []byte("3go8&$8*3*3h0k(2)2")
	b2 := []byte("5676778534263558")
	for i := 0; i < len(b2); i++ {
		fmt.Println(b2[i] ^ b1[i%len(b1)])
	}*/
	/*s := HttpGet("http://music.163.com/api/album/" + "75949" + "?id=" + "75949")
	j, _ := json.NewJson(s)
	fmt.Println(j)*/
}

func encrypt_id(id string) string {
	byte1 := []byte("3go8&$8*3*3h0k(2)2")
	byte2 := []byte(id)

	for i := 0; i < len(byte2); i++ {
		//fmt.Println(strconv.Itoa(byte2[i]) + "^" + strconv.Itoa(byte1[i%len(byte1)]) + "=" + strconv.Itoa(byte2[i]^byte1[i%len(byte1)]))
		byte2[i] = byte2[i] ^ byte1[i%len(byte1)]
	}

	m := md5.New()
	m.Write(byte2)
	s := base64.StdEncoding.EncodeToString(m.Sum(nil))
	fmt.Println(s)
	m.Reset()
	s = strings.Replace(s, "+", "-", -1)
	s = strings.Replace(s, "/", "_", -1)
	return s
}

func songDetail(songId string, albumId string) string {
	//s := HttpGet("http://music.163.com/api/song/detail/?id=" + songId + "&ids=%5B" + songId + "%5D")
	s := HttpGet("http://music.163.com/api/album/" + albumId + "?id=" + albumId)
	j, _ := json.NewJson(s)
	songs := j.Get("album").Get("songs")
	arr, _ := songs.Array()
	url := ""
	for i := 0; i < len(arr); i++ {
		id, _ := songs.GetIndex(i).Get("id").Int()
		sid, _ := strconv.Atoi(songId)
		if id == sid {
			dfsId, _ := songs.GetIndex(i).Get("hMusic").Get("dfsId").Int()
			if dfsId == 0 {
				dfsId, _ = songs.GetIndex(i).Get("mMusic").Get("dfsId").Int()
			} else if dfsId == 0 {
				dfsId, _ = songs.GetIndex(i).Get("lMusic").Get("dfsId").Int()
			}
			encrypted_song_id := encrypt_id(strconv.Itoa(dfsId))
			url = "http://p1.music.126.net/" + encrypted_song_id + "/" + strconv.Itoa(dfsId) + ".mp3"
		}
	}
	return string(url)
}

func HttpGet(url string) (body []byte) {
	client := &http.Client{}
	reqest, err := http.NewRequest("GET", url, nil)
	if err != nil {
		return
	}
	reqest.Header.Set("Cookie", "appver=1.5.0.75771")
	reqest.Header.Set("Referer", "http://music.163.com/")

	response, err := client.Do(reqest)
	defer response.Body.Close()

	if err != nil {
		return
	}

	if response.StatusCode == 200 {
		body, err = ioutil.ReadAll(response.Body)
		if err != nil {
			return
		}
	}
	return
}

# API分析

## 获取歌曲文件

go版

```
func encrypt_id(id string) string {
	byte1 := []byte("3go8&$8*3*3h0k(2)2")
	byte2 := []byte(id)
	for i := 0; i < len(byte2); i++ {
		byte2[i] = byte2[i] ^ byte1[i%len(byte1)]
	}
	m := md5.New()
	m.Write(byte2)
	s := base64.StdEncoding.EncodeToString(m.Sum(nil))
	m.Reset()
	s = strings.Replace(s, "+", "-", -1)
	s = strings.Replace(s, "/", "_", -1)
	return s
}
```

php版
```
import md5

def encrypted_id(id):
    byte1 = bytearray('3go8&$8*3*3h0k(2)2')
    byte2 = bytearray(id)
    byte1_len = len(byte1)
    for i in xrange(len(byte2)):
        byte2[i] = byte2[i]^byte1[i%byte1_len]
    m = md5.new()
    m.update(byte2)
    result = m.digest().encode('base64')[:-1]
    result = result.replace('/', '_')
    result = result.replace('+', '-')
    return result
```

python版
```
# 歌曲加密算法, 基于https://github.com/yanunon/NeteaseCloudMusic脚本实现
def encrypted_id(id):
    magic = bytearray('3go8&$8*3*3h0k(2)2', 'u8')
    song_id = bytearray(id, 'u8')
    magic_len = len(magic)
    for i, sid in enumerate(song_id):
        song_id[i] = sid ^ magic[i % magic_len]
    m = hashlib.md5(song_id)
    result = m.digest()
    result = base64.b64encode(result)
    result = result.replace(b'/', b'_')
    result = result.replace(b'+', b'-')
    return result.decode('utf-8')
```

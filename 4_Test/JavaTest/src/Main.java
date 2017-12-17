import netscape.javascript.JSObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Main {

    public static void main(String[] args) throws Exception{
        String songId = "771835";
        String albumId = "75949";
        String dfsId = "5676778534263558";
        //System.out.println(encrypt_id("5676778534263558"));
        System.out.println(getUrl(songId,albumId));
    }

    private static String getUrl (String songId, String albumId){
        String url = "";
        String response = HttpRequest.sendGet("http://music.163.com/api/album/"+albumId,"");
        try {
            JSONObject json = new JSONObject(response);
            JSONArray songs = json.getJSONObject("album").getJSONArray("songs");
            for (int i = 0; i < songs.length(); i++){
                JSONObject song = songs.getJSONObject(i);
                String id = song.getString("id");
                if (id.equals(songId)){
                    url = song.getString("mp3Url");
                    if (!url.equals("")){
                        return url;
                    }
                    String dfsId;
                    dfsId = song.getJSONObject("hMusic").getString("dfsId");
                    if (dfsId.equals("0")){
                        dfsId = song.getJSONObject("mMusic").getString("dfsId");
                    }
                    if (dfsId.equals("0")){
                        dfsId = song.getJSONObject("lMusic").getString("dfsId");
                    }
                    url = "http://p1.music.126.net/" + encrypt_id(dfsId) + "/" + dfsId + ".mp3";
                }
            }
        } catch (JSONException e) {
            return url;
        }
        return url;
    }

    private static String encrypt_id(String dfsId) {
        byte[] b1 = "3go8&$8*3*3h0k(2)2".getBytes();
        byte[] b2 = dfsId.getBytes();
        for (int i = 0; i < b2.length; i++){
            b2[i] = (byte) (b2[i] ^ b1[i%b1.length]);
        }
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(b2);
            byte[] encryption = md5.digest();
            String encrypt_id = new String(Base64.getEncoder().encode(encryption));
            md5.reset();
            encrypt_id = encrypt_id.replace("+", "-");
            encrypt_id = encrypt_id.replace("/", "_");
            return encrypt_id;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }
}

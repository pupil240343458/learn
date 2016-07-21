package musicData;

import com.opensymphony.xwork2.ActionSupport;
import net.sf.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by pupil on 2016/7/20.
 */
public class musicSearchControl extends ActionSupport {
    private String songName;
    private String songImg;
    private String albumName;
    private String artistName;
    private String musicLink;

    private String searchValue;
    @Override
    public String execute() throws Exception {
        String strURL = ("http://www.xiami.com/search?key=" + searchValue);
        URL url = new URL(strURL);
        HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
        InputStreamReader input = new InputStreamReader(httpConn.getInputStream(), "utf-8");
        BufferedReader bufReader = new BufferedReader(input);
        String line = "";
        StringBuilder contentBuf = new StringBuilder();
        while ((line = bufReader.readLine()) != null) {
            contentBuf.append(line);
        }
        String buf = contentBuf.toString();
        int end = buf.indexOf("\" name=\"recommendids\"");
        int begin=buf.lastIndexOf("\"",end-1);
        String result = buf.substring(begin+1,end);

        URL dataUrl=new URL("http://www.xiami.com/widget/xml-single/uid/0/sid/"+result);
        HttpURLConnection dataHttpUrlConnection = (HttpURLConnection) dataUrl.openConnection();
        InputStreamReader dataInput = new InputStreamReader(dataHttpUrlConnection.getInputStream(), "utf-8");
        BufferedReader dataBuffer = new BufferedReader(dataInput);
        StringBuilder dataBuilder = new StringBuilder();
        while ((line = dataBuffer.readLine()) != null) {
            dataBuilder.append(line);
        }
        buf = dataBuilder.toString();

        int beginSongName=buf.indexOf("<song_name><![CDATA[");
        
        return SUCCESS;
    }

    public void setSearchValue(String searchValue) {
        this.searchValue = searchValue;
    }

    public String getSongName() {
        return songName;
    }

    public String getSongImg() {
        return songImg;
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getMusicLink() {
        return musicLink;
    }
}

package to.msn.wings.music;

/**
 * １件分のデータ
 */
public class ListItem {

    /*フィールド*/
    private long id = 0;          //ID名
    private  String name = null;  //名前
    private int icon = 0;         //アイコン画像（リソースID）
    private  int song_id = 0;     //曲のid

    /*ゲッター＆セッター*/
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public int getSong_id() {
        return song_id;
    }

    public void setSong_id(int song_id) {
        this.song_id = song_id;
    }
}

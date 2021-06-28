package to.msn.wings.music;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ListDataSource {

    private static final String[] names =
            {
                    "jazz_in_paris", "the_coldest_shoulder", "おおさそり", "がいこつ", "メーダー",
                    "リカント", "キメラ", "よろいのきし", "ドラゴン", "ゴーム"
            };


    private static final int[] song_id =
            {
                    R.raw.jazz_in_paris,
                    R.raw.the_coldest_shoulder,
                    R.raw.jazz_in_paris,
                    R.raw.the_coldest_shoulder,
                    R.raw.jazz_in_paris,
                    R.raw.the_coldest_shoulder,
                    R.raw.jazz_in_paris,
                    R.raw.the_coldest_shoulder,
                    R.raw.jazz_in_paris,
                    R.raw.the_coldest_shoulder,

            };




    public static String[] getAllNames() {
        return names;
    }

    public static int[] getSong_id(){
        return song_id;
    }
}

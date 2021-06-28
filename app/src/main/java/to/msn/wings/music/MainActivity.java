package to.msn.wings.music;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Button sendButton = findViewById(R.id.send_button);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), SubActivity.class);
                startActivity(intent);
            }
        });*/


        //リスト用データを配列で準備
        String[] names =
                {
                        "jazz_in_paris", "the_coldest_shoulder", "おおさそり", "がいこつ", "メーダー",
                        "リカント", "キメラ", "よろいのきし", "ドラゴン", "ゴーレム"
                };

        int[] icons =
                {
                        R.drawable.monster01, R.drawable.monster02,
                        R.drawable.monster03, R.drawable.monster04,
                        R.drawable.monster05, R.drawable.monster06,
                        R.drawable.monster07, R.drawable.monster08,
                        R.drawable.monster09, R.drawable.monster10
                };

       int[] song_id =
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

        //ArrayListにリスト用データを詰め替える
        ArrayList<ListItem> data = new ArrayList<>();
        for(int i = 0; i < names.length; i++){
            //乱数を使ってIDを取得
            Random rnd = new Random();
            long id = rnd.nextLong();

            //１件分のデータを設定
            ListItem item = new ListItem();
            item.setId(id);          //ID
            item.setName(names[i]);  //名前
            item.setIcon(icons[i]);  //アイコン画像
            item.setSong_id(song_id[i]);

            //ArrayListに追加
            data.add(item);
        }

        //リスト用データとリスト用レイアウトをアダプターに設定
        MyListAdapter adapter = new MyListAdapter(this, data, R.layout.list_item);

        //ListViewにアダプターを登録
        ListView list = findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener
                (
                        new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                Intent intent = new Intent(getApplication(), SubActivity.class);
                                ListView list = findViewById(R.id.list);
                                ListItem s = (ListItem) list.getItemAtPosition(position);
                                String song = s.getName();
                                int song_id = s.getSong_id();

                                intent.putExtra("song", song);
                                intent.putExtra("id", song_id);

                                startActivity(intent);
                            }
                        }
                );
    }
}

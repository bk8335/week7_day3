package example.codeclan.com.lionslistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class PlayerListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_list);

        PlayerList playerList = new PlayerList();
        ArrayList<Player> list = playerList.getList();

        PlayerListAdapter playerAdapter = new PlayerListAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(playerAdapter);

    }
}

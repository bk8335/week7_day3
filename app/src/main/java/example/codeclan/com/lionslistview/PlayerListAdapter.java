package example.codeclan.com.lionslistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.country;

/**
 * Created by user on 19/04/2017.
 */

public class PlayerListAdapter extends ArrayAdapter<Player> {

    public PlayerListAdapter(Context context, ArrayList<Player> players) {
        super(context, 0, players);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {

        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.player_item, parent, false);
        }

        Player currentPlayer = getItem(position);

        TextView country = (TextView) listItemView.findViewById(R.id.country);
        country.setText(currentPlayer.getCountry());

        TextView name = (TextView) listItemView.findViewById(R.id.name);
        name.setText(currentPlayer.getName());

        TextView playerPosition = (TextView) listItemView.findViewById(R.id.playerPosition);
        playerPosition.setText(currentPlayer.getPlayerPosition());

        return listItemView;
    }

}

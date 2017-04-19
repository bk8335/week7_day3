package example.codeclan.com.lionslistview;

/**
 * Created by user on 19/04/2017.
 */

public class Player {

    private String country;
    private String name;
    private String playerPosition;

    public Player(String country, String name, String playerPosition) {
        this.country = country;
        this.name = name;
        this.playerPosition = playerPosition;
    }


    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }

    public String getPlayerPosition() {
        return playerPosition;
    }

}

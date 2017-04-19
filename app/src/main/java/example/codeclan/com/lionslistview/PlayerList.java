package example.codeclan.com.lionslistview;

import java.util.ArrayList;

/**
 * Created by user on 19/04/2017.
 */

public class PlayerList {

    private ArrayList<Player> list;

    public PlayerList() {
        list = new ArrayList<Player>();
        list.add(new Player("SCO", "Stuart Hogg", "Full-back"));
        list.add(new Player("IRE", "Jarryd Payne", "Full-back/Wing"));
        list.add(new Player("WAL", "Leigh 'overrated' Halfpenny", "Full-back"));
        list.add(new Player("ENG", "Anthony Watson", "Wing"));
        list.add(new Player("ENG", "Elliot Daly", "Wing/Centre"));
        list.add(new Player("WAL", "George 'concussed' North", "Wing"));
        list.add(new Player("WAL", "Liam 'not actually that bad' Williams", "Wing"));
        list.add(new Player("ENG", "Jack Nowell", "Wing"));
        list.add(new Player("IRE", "Robbie Henshaw", "Centre"));
        list.add(new Player("ENG", "Jonathan Joseph", "Centre"));
        list.add(new Player("WAL", "Jonathan 'how am I here?' Davies", "Centre"));
        list.add(new Player("SCO", "Tommy Seymour", "Wing"));
        list.add(new Player("ENG", "Ben Te'o", "Centre"));
        list.add(new Player("ENG", "Owen Farrell", "Fly-half"));
        list.add(new Player("IRE", "Jonathan Sexton", "Fly-half"));
        list.add(new Player("WAL", "Rhys 'deserves this on merit' Webb", "Scrum-half"));
        list.add(new Player("WAL", "Dan 'I'm an annoying footballer' Biggar", "Referee"));
        list.add(new Player("ENG", "Ben Youngs", "Scrum-half"));
        list.add(new Player("IRE", "Connor Murray", "Scrum-half"));
    }

    public ArrayList<Player> getList() {
        return new ArrayList<Player>(list);
    }

}

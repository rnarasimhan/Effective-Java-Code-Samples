package chapter8;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: raghuveer_n
 * Date: 1/6/13
 * Time: 9:28 AM
 * To change this template use File | Settings | File Templates.
 */
public class Item46 {

    enum Suit { CLUB, DIAMOND, HEART, SPADE};

    enum Rank {ACE, DEUCE, THREE, FOUR, FIVE, SIX};

    static Collection<Suit> suits = Arrays.asList(Suit.values());
    static Collection<Rank> ranks = Arrays.asList(Rank.values());

    public static void main (String[] args)
    {
        for(Iterator<Suit> i = suits.iterator();i.hasNext();)
            for(Iterator<Rank> j = ranks.iterator();j.hasNext();)
                System.out.println("Suit = "+i.next()+" Rank = "+j.next());

    }

}

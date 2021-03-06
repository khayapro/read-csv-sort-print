package main.java.comparators;

import main.java.model.Trade;

import java.util.Comparator;

/**
 * Created by khaya.mathebula on 21/11/2017.
 */
public class TradeCodeComparator implements Comparator<Trade> {
    @Override
    public int compare(Trade o1, Trade o2) {
        return o1.getCode().compareTo(o2.getCode());
    }
}

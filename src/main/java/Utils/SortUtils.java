package main.java.Utils;

import main.java.comparators.TradeChainedComparator;
import main.java.comparators.TradeCodeComparator;
import main.java.comparators.TradeQuantityComparator;
import main.java.model.Trade;
import java.util.List;

/**
 * Created by khaya.mathebula on 21/11/2017.
 *
 */
public class SortUtils {

    /**
     * Sorting trades by Quality and then by Code
     * @param trades - unsorted list
     * @return List<Trade>
     */
    public static List<Trade> sortList(final List<Trade> trades){
        trades.sort(new TradeChainedComparator(new TradeQuantityComparator(), new TradeCodeComparator()));
        return trades;
    }
}

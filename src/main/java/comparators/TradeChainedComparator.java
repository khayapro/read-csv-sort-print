package main.java.comparators;

import main.java.model.Trade;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by khaya.mathebula on 21/11/2017.
 *
 */
public class TradeChainedComparator implements Comparator<Trade> {

    private List<Comparator<Trade>> comparatorList;

    @SafeVarargs
    public TradeChainedComparator(final Comparator<Trade> ...comparators){
        comparatorList = Arrays.asList(comparators);
    }
    @Override
    public int compare(Trade o1, Trade o2) {
        for (Comparator<Trade> tradeComparator : comparatorList) {
            int result = tradeComparator.compare(o1, o2);
            if (result != 0) {
                return result;
            }
        }
        return 0;
    }
}

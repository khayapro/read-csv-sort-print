package Utils;

import model.Trade;

import java.util.Comparator;
import java.util.List;

/**
 * Created by khaya.mathebula on 21/11/2017.
 *
 */
public class SortUtils {

    public static List<Trade> sortList(final List<Trade> trades){
        //list sorting implementation based on the Quantity and Code
        trades.sort(Comparator.comparingInt(Trade::getQuantity));
        //return a sorted list
        return trades;
    }
}

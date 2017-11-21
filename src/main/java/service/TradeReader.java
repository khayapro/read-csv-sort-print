package main.java.service;

import java.io.IOException;
import java.util.List;
import main.java.model.Trade;

/**
 * Created by khaya.mathebula on 21/11/2017.
 *
 */
public interface TradeReader {

    /**
     * Getting all trades from a file, based on implementation of this interface,
     * could be getting trades from a .txt file or .csv file, all depend on the implementation
     * @return List<Trade>
     * @throws IOException If an I/O error occurs
     */
    List<Trade> getTrades() throws IOException;
}

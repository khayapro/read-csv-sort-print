package service;

import Utils.SortUtils;
import model.Trade;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by khaya.mathebula on 21/11/2017.
 *
 */
public class CSVTradeReader implements TradeReader {

    private static final String CSV_FILE_PATH = "C:\\Users\\khaya.mathebula\\Desktop\\trades.csv";
    private static final String DELIMETER = ",";

    @Override
    public List<Trade> getTrades() throws IOException {
        return readTradeFile();
    }

    private List<Trade> readTradeFile() throws IOException {
        final List<Trade> trades = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(CSV_FILE_PATH))){
            String line;
            String ignoreHeaderLine = reader.readLine();
            while((line = reader.readLine()) != null){
                String[] values = line.split(DELIMETER);
                trades.add(createTrade(values));
            }
            return SortUtils.sortList(trades);
        }
    }

    /**
     * Creating a instance of Trade per line read
     * @param values - attributes to instantiate a Trade instance
     * @return Trade
     */
    private Trade createTrade(String[] values){
        return new Trade(values[0], Double.parseDouble(values[1]), Integer.parseInt(values[2]),
                Double.parseDouble(values[3]), values[4]);
    }
}

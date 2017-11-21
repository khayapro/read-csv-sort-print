import main.java.model.Trade;
import main.java.service.CSVTradeReader;
import main.java.service.TradeReader;
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        final TradeReader reader = new CSVTradeReader();
        try {
            List<Trade> trades = reader.getTrades();
            trades.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

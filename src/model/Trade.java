package model;

import java.util.Comparator;

/**
 * Created by khaya.mathebula on 20/11/2017.
 *
 */
public class Trade  {

    private String code;
    private Double price;
    private Integer quantity;
    private Double value;
    private String side;

    public Trade(String code, Double price, Integer quantity, Double value, String side) {
        this.code = code;
        this.price = price;
        this.quantity = quantity;
        this.value = value;
        this.side = side;
    }

    public String getCode() {
        return code;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getValue() {
        return value;
    }

    public String getSide() {
        return side;
    }

    @Override
    public String toString() {
        return "model.Trade{" +
                "code='" + code + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", value=" + value +
                ", side='" + side + '\'' +
                '}';
    }

}

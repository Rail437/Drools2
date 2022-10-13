package model;

public class Balance {
    private String type;
    private String charCode;
    private String amount;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCharCode() {
        return charCode;
    }

    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Balance{" +
                "type='" + type + '\'' +
                ", charCode='" + charCode + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}

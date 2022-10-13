package model;

public class CardData {
    private String cardHolderName;
    private String cardID;
    private String virtualCardNum;

    private Status status;

    private String cardType;
    private String paySystem;
    private String tarif;
    private String branchID;
    private String overdueDebtAmount;

    public CardData() {
    }

    public CardData(Status status) {
        this.status = status;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public String getVirtualCardNum() {
        return virtualCardNum;
    }

    public void setVirtualCardNum(String virtualCardNum) {
        this.virtualCardNum = virtualCardNum;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getPaySystem() {
        return paySystem;
    }

    public void setPaySystem(String paySystem) {
        this.paySystem = paySystem;
    }

    public String getTarif() {
        return tarif;
    }

    public void setTarif(String tarif) {
        this.tarif = tarif;
    }

    public String getBranchID() {
        return branchID;
    }

    public void setBranchID(String branchID) {
        this.branchID = branchID;
    }

    public String getOverdueDebtAmount() {
        return overdueDebtAmount;
    }

    public void setOverdueDebtAmount(String overdueDebtAmount) {
        this.overdueDebtAmount = overdueDebtAmount;
    }

    @Override
    public String toString() {
        return "CardData{" +
                "cardHolderName='" + cardHolderName + '\'' +
                ", cardID='" + cardID + '\'' +
                ", virtualCardNum='" + virtualCardNum + '\'' +
                ", status=" + status +
                ", cardType='" + cardType + '\'' +
                ", paySystem='" + paySystem + '\'' +
                ", tarif='" + tarif + '\'' +
                ", branchID='" + branchID + '\'' +
                ", overdueDebtAmount='" + overdueDebtAmount + '\'' +
                '}';
    }
}

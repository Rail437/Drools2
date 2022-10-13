package model;

public class Status {
    private String statusMsg;
    private String statusCode;
    private String status3C;
    private String plasticStatus;

    public Status() {
    }

    public Status(String statusMsg, String statusCode, String status3C, String plasticStatus) {
        this.statusMsg = statusMsg;
        this.statusCode = statusCode;
        this.status3C = status3C;
        this.plasticStatus = plasticStatus;
    }

    public String getStatusMsg() {
        return statusMsg;
    }

    public void setStatusMsg(String statusMsg) {
        this.statusMsg = statusMsg;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatus3C() {
        return status3C;
    }

    public void setStatus3C(String status3C) {
        this.status3C = status3C;
    }

    public String getPlasticStatus() {
        return plasticStatus;
    }

    public void setPlasticStatus(String plasticStatus) {
        this.plasticStatus = plasticStatus;
    }

    @Override
    public String toString() {
        return "Status{" +
                "statusMsg='" + statusMsg + '\'' +
                ", statusCode='" + statusCode + '\'' +
                ", status3C='" + status3C + '\'' +
                ", plasticStatus='" + plasticStatus + '\'' +
                '}';
    }
}

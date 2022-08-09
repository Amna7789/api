package com.Amy.Api.domain;

public class ResultAnnounceDTO {
    double sum;
    double percentage;
    String statusType;
    String des;

    public ResultAnnounceDTO() {

    }

    public ResultAnnounceDTO(double sum, double percentage, String statusType, String des) {
        this.sum = sum;
        this.percentage = percentage;
        this.statusType = statusType;
        this.des = des;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public String getStatusType() {
        return statusType;
    }

    public void setStatusType(String statusType) {
        this.statusType = statusType;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}

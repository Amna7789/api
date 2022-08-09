package com.Amy.Api.domain;

public class ResultDTO {
    double sum;
    double percentage;
    String status;
    String desc;

    public ResultDTO() {
    }

    public ResultDTO(double sum, double percentage, String status, String desc) {
        this.sum = sum;
        this.percentage = percentage;
        this.status = status;
        this.desc = desc;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}


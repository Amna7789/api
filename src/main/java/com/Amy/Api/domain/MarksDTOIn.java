package com.Amy.Api.domain;

public class MarksDTOIn {

    int eng;
    int comp;
    int math;
    int phy;
    int chem;

    double sum;

    public MarksDTOIn() {
    }

    public MarksDTOIn(int eng, int comp, int math, int phy, int chem) {
        this.eng = eng;
        this.comp = comp;
        this.math = math;
        this.phy = phy;
        this.chem = chem;
    }

    public int getEng() {
        return eng;
    }



    public int getComp() {
        return comp;
    }

    public void setComp(int comp) {
        this.comp = comp;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getPhy() {
        return phy;
    }

    public void setPhy(int phy) {
        this.phy = phy;
    }

    public int getChem() {
        return chem;
    }

    public void setChem(int chem) {
        this.chem = chem;
    }
}

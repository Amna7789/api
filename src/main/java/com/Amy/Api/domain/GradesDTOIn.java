package com.Amy.Api.domain;

public class GradesDTOIn {
    int math;
    int phy;
    int bio;
    int java;
    int PHP;

    public GradesDTOIn() {
    }

    public GradesDTOIn(int math, int phy, int bio, int java, int PHP) {
        this.math = math;
        this.phy = phy;
        this.bio = bio;
        this.java = java;
        this.PHP = PHP;
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

    public int getBio() {
        return bio;
    }

    public void setBio(int bio) {
        this.bio = bio;
    }

    public int getJava() {
        return java;
    }

    public void setJava(int java) {
        this.java = java;
    }

    public int getPHP() {
        return PHP;
    }

    public void setPHP(int PHP) {
        this.PHP = PHP;
    }
}

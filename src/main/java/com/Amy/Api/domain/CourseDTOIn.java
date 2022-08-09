package com.Amy.Api.domain;

public class CourseDTOIn {
    String java;
    String chem;
    String php;
    String css;

    public CourseDTOIn() {
    }

    public CourseDTOIn(String java, String chem, String php, String css) {
        this.java = java;
        this.chem = chem;
        this.php = php;
        this.css = css;
    }

    public String getJava() {
        return java;
    }

    public void setJava(String java) {
        this.java = java;
    }

    public String getChem() {
        return chem;
    }

    public void setChem(String chem) {
        this.chem = chem;
    }

    public String getPhp() {
        return php;
    }

    public void setPhp(String php) {
        this.php = php;
    }

    public String getCss() {
        return css;
    }

    public void setCss(String css) {
        this.css = css;
    }
}

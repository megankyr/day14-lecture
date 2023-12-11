package com.ssf.day14lecture.model;

public class FormData {
    private String name;
    private String phoneno;
    private int pax;
    private boolean vegan;
    private String comments;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhoneno() {
        return phoneno;
    }
    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }
    public int getPax() {
        return pax;
    }
    public void setPax(int pax) {
        this.pax = pax;
    }
    public boolean isVegan() {
        return vegan;
    }
    public void setVegan(boolean vegan) {
        this.vegan = vegan;
    }
    public String getComments() {
        return comments;
    }
    public void setComments(String comments) {
        this.comments = comments;
    }

}

package com.example.document;

public class WebPage {
    private String address;
    private String title;
    private String contents;

    public WebPage(String address, String title, String contents) {
        this.address = address;
        this.title = title;
        this.contents = contents;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}

package com.models;

public class Album {
    private final String title;
    private final Integer releaseDate;
    public final String band;

    public Album(String title, Integer releaseDate, String band){
        this.releaseDate = releaseDate;
        this.title = title;
        this.band = band;
    }

    public String getBand() {
        return band;
    }

    public String getTitle() {
        return title;
    }

    public Integer getReleaseDate() {
        return releaseDate;
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append(band);
        sb.append(" ");
        sb.append(title);
        sb.append(" ");
        sb.append(releaseDate);
        return sb.toString();
    }

}

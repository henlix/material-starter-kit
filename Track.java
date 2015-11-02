package org.sopt.material.model;

import java.io.Serializable;

public class Track implements Serializable {

    private static long ID_COUNTER = 1;

    private final long id = ID_COUNTER++;
    public long id() { return id; }

    private String artist;
    public String artist() { return artist; }
    public void artist(String artist) { this.artist = artist; }

    private String title;
    public String title() { return title; }
    public void title(String title) { this.title = title; }

    private String label;
    public String label() { return label; }
    public void label(String label) { this.label = label; }

    private String genre;
    public String genre() { return genre; }
    public void genre(String genre) { this.genre = genre; }

    private float price;
    public float price() { return price; }
    public void price(float price) { this.price = price; }

    private int artwork;
    public int artwork() { return artwork; }
    public void artwork(int artwork) { this.artwork = artwork; }


    public Track(String artist, String title, String label, String genre, float price, int artwork) {

        artist(artist);
        title(title);
        label(label);
        genre(genre);
        price(price);
        artwork(artwork);
    }
}

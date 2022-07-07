package ru.netology.films;

public class Films {
    private String filmName;
    public Films(String filmName){
        this.filmName=filmName;
    }

    public void set(String newFilmName) {
        this.filmName = newFilmName;
    }

    public String get() {
        return this.filmName;
    }
}

package ru.netology.films;

public class FilmManager {
    private Films[] films = new Films[0];

    private int limit = 10;

    public FilmManager() {
    }

    public FilmManager(int limit) {
        this.limit = limit;
    }


    public void add(Films film) {
        Films[] tmp = new Films[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public Films[] findAll() {
        return films;
    }

    public Films[] findLast() {
        Films[] films = findAll();
        Films[] result;
        if (limit < films.length) {
            result = new Films[limit];
        } else {
            result = new Films[films.length];
        }
        for (int i = 0; i < result.length; i++) {
            result[i] = films[films.length - i - 1];
        }
        return result;
    }
}

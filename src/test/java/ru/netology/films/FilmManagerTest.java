package ru.netology.films;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilmManagerTest {
    Films film1 = new Films("Alice in Wonderland");
    Films film2 = new Films("Belgrad Hotel");
    Films film3 = new Films("Vpered");
    Films film4 = new Films("Pride and Prejudice");
    Films film5 = new Films("War and Peace");
    Films film6 = new Films("Alice in Wonderland");
    Films film7 = new Films("Alice in Wonderland");
    Films film8 = new Films("Alice in Wonderland");
    Films film9 = new Films("Alice in Wonderland");
    Films film10 = new Films("Alice in Wonderland");

    @Test
    void shouldAddFilms() {
        FilmManager manager = new FilmManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        Films[] actual = manager.findAll();
        Films[] expected = {film1, film2, film3};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindLastBiggerLimit() {
        FilmManager manager = new FilmManager(3);
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        Films[] actual = manager.findLast();
        Films[] expected = {film5, film4, film3};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindLastLessLimit() {
        FilmManager manager = new FilmManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        Films[] actual = manager.findLast();
        Films[] expected = {film5, film4, film3, film2, film1};
        assertArrayEquals(expected, actual);
    }
}

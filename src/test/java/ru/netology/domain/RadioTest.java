package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    //текущий канал
    @Test
    public void shouldCurrentChannal() {
        Radio radioman = new Radio();

        radioman.setCurrentChannel(2);
        int expected = 2;
        int actual = radioman.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentChannalFirst() {
        Radio radioman = new Radio();

        radioman.setCurrentChannel(0);
        int expected = 0;
        int actual = radioman.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentChannalLast() {
        Radio radioman = new Radio();

        radioman.setCurrentChannel(9);
        int expected = 9;
        int actual = radioman.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentChannalUnderLimit1() {
        Radio radioman = new Radio();

        radioman.setCurrentChannel(-1);
        int expected = 0;
        int actual = radioman.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentChannalUnderLimit2() {
        Radio radioman = new Radio();

        radioman.setCurrentChannel(10);
        int expected = 0;
        int actual = radioman.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextChannal() {
        Radio radioman = new Radio();
        radioman.NextCannel(2);
        int expected = 3;
        int actual = radioman.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextChannallast() {
        Radio radioman = new Radio();
        radioman.NextCannel(9);
        int expected = 0;
        int actual = radioman.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextChannalUnderLimit1() {
        Radio radioman = new Radio();
        radioman.NextCannel(-1);
        int expected = 0;
        int actual = radioman.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextChannalUnderLimit2() {
        Radio radioman = new Radio();
        radioman.NextCannel(10);
        int expected = 0;
        int actual = radioman.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldprevChannal() {
        Radio radioman = new Radio();
        radioman.prevCannel(5);
        int expected = 4;
        int actual = radioman.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldprevChannalFirst() {
        Radio radioman = new Radio();
        radioman.prevCannel(0);
        int expected = 9;
        int actual = radioman.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldprevChannalUnderLimit() {
        Radio radioman = new Radio();
        radioman.prevCannel(-1);
        int expected = 9;
        int actual = radioman.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldprevChannalUnderLimit2() {
        Radio radioman = new Radio();
        radioman.prevCannel(10);
        int expected = 9;
        int actual = radioman.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolume() {
        Radio radioman = new Radio();
        radioman.setCurrentVolume(2);
        int expected = 2;
        int actual = radioman.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolumeFirst() {
        Radio radioman = new Radio();

        radioman.setCurrentVolume(0);
        int expected = 0;
        int actual = radioman.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolumeLast() {
        Radio radioman = new Radio();

        radioman.setCurrentVolume(10);
        int expected = 10;
        int actual = radioman.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolumeUnderLimit1() {
        Radio radioman = new Radio();

        radioman.setCurrentVolume(-1);
        int expected = 0;
        int actual = radioman.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolumeUnderLimit2() {
        Radio radioman = new Radio();

        radioman.setCurrentVolume(11);
        int expected = 0;
        int actual = radioman.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radioman = new Radio();
        radioman.increaseVolume(6);
        int expected = 7;
        int actual = radioman.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumelast() {
        Radio radioman = new Radio();
        radioman.increaseVolume(9);
        int expected = 10;
        int actual = radioman.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeFirst() {
        Radio radioman = new Radio();
        radioman.increaseVolume(0);
        int expected = 1;
        int actual = radioman.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeLimit1() {
        Radio radioman = new Radio();
        radioman.increaseVolume(-1);
        int expected = 0;
        int actual = radioman.getCurrentVolume();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldDecreaseVolume() {
        Radio radioman = new Radio();
        radioman.decreaseVolume(8);
        int expected = 7;
        int actual = radioman.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeFirst() {
        Radio radioman = new Radio();
        radioman.decreaseVolume(0);
        int expected = 0;
        int actual = radioman.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumelast() {
        Radio radioman = new Radio();
        radioman.decreaseVolume(10);
        int expected = 9;
        int actual = radioman.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeUnderLimit() {
        Radio radioman = new Radio();
        radioman.decreaseVolume(-1);
        int expected = 0;
        int actual = radioman.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeUnderLimit2() {
        Radio radioman = new Radio();
        radioman.decreaseVolume(11);
        int expected = 10;
        int actual = radioman.getCurrentVolume();
        assertEquals(expected, actual);
    }
}
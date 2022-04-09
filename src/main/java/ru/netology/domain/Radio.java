package ru.netology.domain;

public class Radio {

    private int currentChannel;
    private int currentVolume;

    //отдать текущую станцию
    public int getCurrentChannel() {
        return currentChannel;
    }

    //отдать текущий уровень громкости
    public int getCurrentVolume() {

        return currentVolume;
    }

    //меняет станцию на новую с ограничениями
    public void setCurrentChannel(int currentChannel) {

        if (currentChannel > 9) {
            return;
        }
        if (currentChannel < 0) {
            return;
        }
        currentChannel = currentChannel;
        this.currentChannel = currentChannel;
    }

    public void prevCannel(int prevChannel) {
        if (prevChannel <= 0) {
            setCurrentChannel(9);
        } else {
            setCurrentChannel(prevChannel - 1);
        }
    }

    public void NextCannel(int nextChannel) {
        if (currentChannel >= 9) {
            setCurrentChannel(0);
        } else {
            setCurrentChannel(nextChannel + 1);
        }
    }

    //меняет звук на новый с ограничениями
    public void setCurrentVolume(int currentVolume) {

        if (currentVolume > 10) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        currentVolume = currentVolume;
        this.currentVolume = currentVolume;
    }

    public void increaseVolume(int increaseVolume) {
        if (currentVolume > 10) {
            return;
        } else {
            setCurrentVolume(increaseVolume + 1);
        }

    }

    public void decreaseVolume(int decreaseVolume) {
        if (currentVolume < 0) {
            return;
        } else {
            setCurrentVolume(decreaseVolume - 1);
        }

    }


}
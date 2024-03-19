package org.example.SmartHouse.services;
public class VolumeControl {
    private int currentVolume;

    public VolumeControl() {
        this.currentVolume = 0;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.currentVolume = volume;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
            if (currentVolume == 100)
                return;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume -1;
            if (currentVolume == 0)
                return;
        }
    }
}
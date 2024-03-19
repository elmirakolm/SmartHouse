package org.example.SmartHouse.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VolumeControlTest {


    @Test
    public void testIncreaseVolumeFromFifty() {
        VolumeControl volumeControl = new VolumeControl();
        volumeControl.setCurrentVolume(50);
        volumeControl.increaseVolume();

        int expected = 51;
        int actual = volumeControl.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolumeFromNinetyNine() {
        VolumeControl volumeControl = new VolumeControl();
        volumeControl.setCurrentVolume(99);
        volumeControl.increaseVolume();

        int expected = 100;
        int actual = volumeControl.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolumeFromMaximum() {
        VolumeControl volumeControl = new VolumeControl();
        volumeControl.setCurrentVolume(100);
        volumeControl.increaseVolume();

        int expected = 100;
        int actual = volumeControl.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolumeFromOne() {
        VolumeControl volumeControl = new VolumeControl();
        volumeControl.setCurrentVolume(1);
        volumeControl.decreaseVolume();

        int expected = 0;
        int actual = volumeControl.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolumeFromZero() {
        VolumeControl volumeControl = new VolumeControl();
        volumeControl.setCurrentVolume(0);
        volumeControl.decreaseVolume();

        int expected = 0;
        int actual = volumeControl.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolumeFromTwo() {
        VolumeControl volumeControl = new VolumeControl();
        volumeControl.setCurrentVolume(2);
        volumeControl.decreaseVolume();

        int expected = 1;
        int actual = volumeControl.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
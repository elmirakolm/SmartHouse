package org.example.SmartHouse.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StationControlTest {

    @Test
    public void testSetCurrentStationInRange() {
        StationControl stationControl = new StationControl();
        stationControl.setCurrentStation(5);

        int expected = 5;
        int actual = stationControl.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentStationOutOfRange() {
        StationControl stationControl = new StationControl();
        stationControl.setCurrentStation(10);

        int expected = 0; // ожидаем, что значение останется прежним (0)
        int actual = stationControl.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextFromNine() {
        StationControl stationControl = new StationControl();
        stationControl.setCurrentStation(9);
        stationControl.next();

        int expected = 0;
        int actual = stationControl.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevFromZero() {
        StationControl stationControl = new StationControl();
        stationControl.setCurrentStation(0);
        stationControl.prev();

        int expected = 9;
        int actual = stationControl.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNext() {
        StationControl stationControl = new StationControl();
        stationControl.setCurrentStation(3);
        stationControl.next();

        int expected = 4;
        int actual = stationControl.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrev() {
        StationControl stationControl = new StationControl();
        stationControl.setCurrentStation(7);
        stationControl.prev();

        int expected = 6;
        int actual = stationControl.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
}

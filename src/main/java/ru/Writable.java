package ru.Veronika;

import org.apache.hadoop.io.Writable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class FlightWritable implements Writable {
    
    public FlightWritable(int destAirportID, float arrDelay, float cancelled, float airTime) {
        this.destAirportID = destAirportID;
        this.arrDelay = arrDelay;
        this.cancelled = cancelled;
        this.airTime = airTime;
    }
}


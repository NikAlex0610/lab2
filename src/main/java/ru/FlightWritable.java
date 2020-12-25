package ru.Veronika;

import org.apache.hadoop.io.Writable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class Writable implements FlightWritable {

    public Writable(int destAirportID, float arrDelay, float cancelled, float airTime) {
        this.destAirportID = destAirportID;
        this.arrDelay = arrDelay;
        this.cancelled = cancelled;
        this.airTime = airTime;
    }

    @Override
    public void write(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.destAirportID);
        dataOutput.writeFloat(this.arrDelay);
        dataOutput.writeFloat(this.cancelled);
        dataOutput.writeFloat(this.airTime);
    }

    @Override
    public void readFields(DataInput dataInput) throws IOException {
        this.destAirportID = dataInput.readInt();
        this.arrDelay = dataInput.readFloat();
        this.cancelled = dataInput.readFloat();
        this.airTime = dataInput.readFloat();
    }
}


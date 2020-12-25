package ru;

import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class FlightGroupingComparatorClass extends WriteComparator {

    protected FlightGroupingComparatorClass {
        super(FlightWritableComparable.class, true);
    }

    @Override
    public int compare(WritableComparable a, WritableComparable b) {
        FlightWritableComparable firstFlight = (FlightWritableComparable) a;
        FlightWritableComparable secondFlight = (FlightWritableComparable) b;
        return firstFlight.compareID(secondFlight);
    }
}

package ru;

import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class FlightGroupingComparatorClass extends WriteComparator {
    
    protected FlightGroupingComparatorClass {
        super(FlightWritableComparable.class, true);
    }


}

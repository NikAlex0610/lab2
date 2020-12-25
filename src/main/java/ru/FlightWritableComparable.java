package ru;

import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class FlightWritableComparable {
    public class FlightWritableComparable implements WritableComparable {
        private int aeroportID;
        private int indenity;

        public FlightWritableComparable() {}

        public FlightWritableComparable(int aeroportID, int indenity) {
            this.aeroportID = aeroportID;
            this.indenity = indenity;
        }

        public int getID() {
            return this.aeroportID;
        }

    }
}

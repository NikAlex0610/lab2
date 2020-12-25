package ru;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import javax.naming.Context;
import java.io.IOException;
import java.util.Iterator;

public class FlightReduce extends Reducer<FlightWritableComparable, Text, Text, Text>{

    private static final int TOCOUNT = 0;
    private static final float ZERO = 0.0F;

    @Override
    protected void reduce(FlightWritableComparable key, Iterator<Text> values, Context context)
            throws IOException, InterruptedException {

    }
}

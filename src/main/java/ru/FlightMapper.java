package ru;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class FlightMapper extends Mapper<LongWritable, Text, FlightWritableComparable, Text> {

    private static final String DELIMITER = ",";
    private static final String NULLSTR = "";
    private static final int FORDELAY = 1;
    private static final float ZERO = 0.0F;
    private static final int DESTAEROPORTID = 14;
    private static final int ARRDELAY = 17;

    private static float checkNull(String current) {
        
    }

    @Override
    public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        if (key.get() > 0) {
            String[] table = value.toString().split(DELIMITER);
            int destAeroportID = Integer.parseInt(table[DESTAEROPORTID]);
            float arrDelay = checkNull(table[ARRDELAY]);
            if (arrDelay > ZERO) {
                FlightWritableComparable currentKey = new FlightWritableComparable(destAeroportID, FORDELAY);
                context.write(currentKey, new Text(table[ARRDELAY]));
            }
        }
    }
}

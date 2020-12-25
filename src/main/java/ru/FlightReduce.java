package ru;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import javax.naming.Context;
import javax.xml.soap.Text;
import java.io.IOException;
import java.util.Iterator;

public class FlightReduce extends Reducer<FlightWritableComparable, Text, Text, Text>{

    private static final int TOCOUNT = 0;
    private static final float ZERO = 0.0F;

    @Override
    protected void reduce(FlightWritableComparable key, Iterator<Text> values, Context context)
            throws IOException, InterruptedException {
        Iterator<Text> iter = values.iterator();
        Text nameInfo = new Text(iter.next());
        int count = TOCOUNT;
        float max, min, average = ZERO;
        while (iter.hasNext()) {
            float currentValue = Float.parseFloat(iter.next().toString());
            if (count == TOCOUNT)
                min = currentValue;
            if (currentValue < min)
                min = currentValue;
            else if (currentValue > max)
                max = currentValue;
            average += currentValue;
            count++;
        }
        if (count != TOCOUNT) {
            average /= count;
            context.write(nameInfo, new Text("MINDELAY: " + min + "; MAXDELAY: " + max + "; AVERAGE: " + average + ";"));
        }
    }
}

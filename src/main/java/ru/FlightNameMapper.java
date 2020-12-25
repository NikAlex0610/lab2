package ru;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Mapper;
import java.io.IOException;


public class FlightNameMapper extends Mapper<LongWritable, Text, FlightWritableComparable, Text>{

    private static final String DELIMITER = "\",";
    private static final int FORNAMEAEROPORT = 0;
    
}

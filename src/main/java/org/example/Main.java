package org.example;

import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("Process Started");
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        BusinessLogic.Entry_point(env);
        env.execute("Dispensation-Ack Process Started!!!!!");
    }
}
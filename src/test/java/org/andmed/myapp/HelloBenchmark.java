package org.andmed.myapp;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.util.ClassUtils;


public class HelloBenchmark {
    @Benchmark
    public void wellHelloThere() {
        // this method was intentionally left blank.
    }

    public static void main(String[] args) throws Exception {
        Options opt = new OptionsBuilder()
                .include(HelloBenchmark.class.getSimpleName())
                .forks(2)
                .build();
        new Runner(opt).run();
    }
}

package org.andmed.myapp;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.util.ClassUtils;

@Fork(1)
public class HelloBenchmark {

    @Measurement(iterations = 3)
    @Warmup(iterations = 3)
    @Benchmark
    public void wellHelloThere() {
        // this method was intentionally left blank.
    }

    public static void main(String[] args) throws Exception {
        Options opt = new OptionsBuilder()
                .include(HelloBenchmark.class.getSimpleName())
                .build();
        new Runner(opt).run();
    }
}

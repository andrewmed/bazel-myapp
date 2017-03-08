### [Bazel](https://bazel.build) empty project

##### For:
* Java
* C

##### With:
* JNI
* Junit
* JMH

### How to use

```shell
andy@laptop:~/repo/bazel-myapp$ bazel run //src/test/java/org/andmed/myapp:HelloBenchmark 
INFO: Found 1 target...
Target //src/test/java/org/andmed/myapp:HelloBenchmark up-to-date:
  bazel-bin/src/test/java/org/andmed/myapp/HelloBenchmark.jar
  bazel-bin/src/test/java/org/andmed/myapp/HelloBenchmark
INFO: Elapsed time: 0.231s, Critical Path: 0.00s

INFO: Running command line: bazel-bin/src/test/java/org/andmed/myapp/HelloBenchmark
# JMH 1.18-SNAPSHOT (released today)
# VM version: JDK 1.8.0_111, VM 25.111-b14
# VM invoker: /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java
# VM options: <none>
# Warmup: 3 iterations, 1 s each
# Measurement: 3 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: org.andmed.myapp.HelloBenchmark.wellHelloThere

# Run progress: 0.00% complete, ETA 00:00:06
# Fork: 1 of 1
# Warmup Iteration   1: 2069957621.550 ops/s
# Warmup Iteration   2: 2070688993.972 ops/s
# Warmup Iteration   3: 2087170968.092 ops/s
Iteration   1: 2086839201.533 ops/s
Iteration   2: 2059166784.582 ops/s
Iteration   3: 1989650998.865 ops/s


Result "org.andmed.myapp.HelloBenchmark.wellHelloThere":
  2045218994.993 ±(99.9%) 913515553.405 ops/s [Average]
  (min, avg, max) = (1989650998.865, 2045218994.993, 2086839201.533), stdev = 50072870.002
  CI (99.9%): [1131703441.588, 2958734548.398] (assumes normal distribution)


# Run complete. Total time: 00:00:06

Benchmark                       Mode  Cnt           Score           Error  Units
HelloBenchmark.wellHelloThere  thrpt    3  2045218994.993 ± 913515553.405  ops/s
andy@laptop:~/repo/bazel-myapp$ 
```

```shell
andy@laptop:~/repo/bazel-myapp$ bazel test //src/test/java/org/andmed/devtools:UnixTests 
INFO: Found 1 test target...
Target //src/test/java/org/andmed/devtools:UnixTests up-to-date:
  bazel-bin/src/test/java/org/andmed/devtools/UnixTests.jar
  bazel-bin/src/test/java/org/andmed/devtools/UnixTests
INFO: Elapsed time: 0.925s, Critical Path: 0.61s
//src/test/java/org/andmed/devtools:UnixTests                            PASSED in 0.5s

Executed 1 out of 1 test: 1 test passes.
```

```shell
andy@laptop:~/repo/bazel-myapp$ bazel test //src/test/native:dummy_test 
INFO: Found 1 test target...
Target //src/test/native:dummy_test up-to-date:
  bazel-bin/src/test/native/dummy_test
INFO: Elapsed time: 0.235s, Critical Path: 0.00s
//src/test/native:dummy_test                                    (cached) PASSED in 0.1s
```


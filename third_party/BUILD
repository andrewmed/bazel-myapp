package(default_visibility = ["//visibility:public"])

#
#filegroup( // fixme
#    name = "srcs",
#    srcs = glob(
#        ["**"],
#    ),
#)
#
java_import(
    name = "jmh_lib",
    jars = [
        "jmh/jmh-generator-annprocess/target/jmh-generator-annprocess-1.18-SNAPSHOT.jar",
        "jmh/jmh-core-benchmarks/target/benchmarks.jar",
    ],
)

java_plugin(
    name = "jmh_processor",
    processor_class = "org.openjdk.jmh.generators.BenchmarkProcessor",
    deps = [
        ":jmh_lib",
    ],
)

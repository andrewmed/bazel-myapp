package(
    default_visibility = ["__subpackages__"],
)

filegroup(
    name = "srcs",
    srcs = glob(["**"]) + [
    ],
    visibility = ["//src:__pkg__"],
)

java_test(
    name = "HelloTests",
    size = "small",
    srcs = glob(["HelloTests.java"]),
    deps = [
        "//external:junit4",
        "//src/main/java/org/andmed/myapp:hello",
    ],
)

java_binary(
    name = "HelloBenchmark",
    srcs = ["HelloBenchmark.java"],
    plugins = ["//external:jmh_processor"],
    deps = ["//external:jmh_lib"],
)

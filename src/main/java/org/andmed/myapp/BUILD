package(
    default_visibility = ["//src:__subpackages__"],
)

filegroup(
    name = "srcs",
    srcs = glob(["**"]) + [
    ],
    visibility = [
        "//src:__pkg__",
    ],
)

java_binary(
    name = "hello/Hello",
    runtime_deps = [
        ":hello",
    ],
)

java_library(
    name = "hello",
    srcs = glob(["hello/*.java"]),
)

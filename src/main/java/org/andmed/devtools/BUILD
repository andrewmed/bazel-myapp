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

#   Java interfaces to various native UNIX system services.
java_library(
    name = "unix",
    srcs = glob([
        "unix/*.java",
    ]),
    deps = ["//src/main/native:libunix.so"],
)

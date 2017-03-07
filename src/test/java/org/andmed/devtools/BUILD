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
    name = "UnixTests",
    size = "small",
    srcs = glob(["UnixTests.java"]),
    #    jvm_flags = ["-Djava.library.path=$(GENDIR)/src/main/native"],
    deps = [
        "//src/main/java/org/andmed/devtools:unix",
        "//third_party:junit4",
    ],
)

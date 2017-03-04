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
    name = "app_test",
    size = "small",
    srcs = glob(["hello/*.java"] + [
        "AllTests.java",
    ]),
    test_class = "org.andmed.myapp.AllTests",
    deps = [
        "//src/main/java/org/andmed/myapp:hello_main",
        "//third_party:junit4",
    ],
)

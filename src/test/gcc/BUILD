# Description:
package(default_visibility = ["//src:__subpackages__"])

filegroup(
    name = "srcs",
    srcs = glob(["**"]),
    visibility = ["//src:__pkg__"],
)

cc_test(
    name = "hello_test",
    srcs = glob([
        "hello_test.c",
    ]),
    deps = [
        "//src/main/gcc:hello",
        #        "//third_party:gtest",
    ],
)

#test_suite(name = "all_tests")

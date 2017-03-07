package(
    default_visibility = ["//src:__subpackages__"],
)

cc_library(
    name = "hello",
    srcs = glob(["hello/*.c"]),
    hdrs = glob(["hello/*.h"]),
)

filegroup(
    name = "srcs",
    srcs = glob(["**"]),
    visibility = ["//src:__pkg__"],
)

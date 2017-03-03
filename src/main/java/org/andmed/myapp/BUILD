package(
    default_visibility = ["//src:__subpackages__"],
)

filegroup(
    name = "srcs",
    srcs = glob(["**"]) + [
    ],
    visibility = [
        "//src:__pkg__",
        "//src/test/shell/bazel:__pkg__",
    ],
)

java_binary (
  name = "hello.Hello",
  main_class = "org.andmed.myapp.hello.Hello",
  runtime_deps = [
    ":hello_main",
  ],
)

java_library(
  name = "hello_main",
  srcs = glob(["hello/*.java"]),
  deps = [],
)

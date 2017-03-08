workspace (name = "myapp")

load("@bazel_tools//tools/build_defs/repo:maven_rules.bzl", "maven_jar")

maven_jar(name = "junit_412", artifact = "junit:junit:4.12")
bind(
    name = "junit4",
    actual = "@junit_412//jar",
)

bind(
    name = "jmh_lib",
    actual = "//third_party:jmh_lib"
)
bind(
    name = "jmh_processor",
    actual = "//third_party:jmh_processor"
)

filegroup(
    name = "srcs",
    srcs = glob(
        ["*"],
        exclude = [
            "bazel-*",  # convenience symlinks
            "out",  # IntelliJ with setup-intellij.sh
            "output",  # output of compile.sh
            ".*",  # mainly .git* files
        ],
    ) + [
        #         "//site:srcs",
        "//src:srcs",
        "//third_party:srcs",
    ],
    visibility = ["//visibility:private"],
)

load("@bazel_tools//tools/build_defs/pkg:pkg.bzl", "pkg_tar", "pkg_deb")

pkg_tar(
    name = "myapp-srcs",
    files = [":srcs"],
    #    package_dir = "lib",
    strip_prefix = ".",
    visibility = ["//:__subpackages__"],
)

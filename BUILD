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
        # "//site:srcs",
        #"//src:srcs",
        "//third_party:srcs",
    ],
    visibility = ["//visibility:private"],
)

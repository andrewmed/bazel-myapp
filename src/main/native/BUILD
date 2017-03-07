genrule(
    name = "copy_link_jni_md_header",
    srcs = ["@local_jdk//:jni_md_header-linux"],
    outs = ["jni_md.h"],
    cmd = "cp -f $< $@",
)

genrule(
    name = "copy_link_jni_header",
    srcs = ["@local_jdk//:jni_header"],
    outs = ["jni.h"],
    cmd = "cp -f $< $@",
)

cc_binary(
    name = "libunix.so",
    srcs = [
        "unix_jni.c",
        ":jni.h",
        ":jni_md.h",
    ],
    copts = [
        "-fPIC",
    ],
    includes = ["."],  # For jni headers.
    linkshared = 1,
    visibility = ["//src:__subpackages__"],
)

filegroup(
    name = "srcs",
    srcs = glob(["**"]),
    visibility = ["//src:__pkg__"],
)

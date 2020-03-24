SUMMARY = "A customized image for development purposes."
LICENSE = "MIT"
inherit core-image

IMAGE_FEATURES += "read-only-rootfs"

# Add recipes for image
IMAGE_INSTALL_append = " test-packagegroup"

SUMMARY = "A customized image for development purposes."
LICENSE = "MIT"
inherit core-image

EXTRA_IMAGE_FEATURES_append = " package-management"

IMAGE_FEATURES += "read-only-rootfs"

# Add recipes for image
IMAGE_INSTALL_append = " test-packagegroup"

DESCRIPTION="Simple helloworld application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
                        
SRC_URI="file://src/helloWorldC.c \
	file://CMakeLists.txt \
	file://src/CMakeLists.txt"

S="${WORKDIR}"

inherit cmake



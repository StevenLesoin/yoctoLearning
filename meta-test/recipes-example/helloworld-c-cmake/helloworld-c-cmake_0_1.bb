DESCRIPTION="Simple helloworld application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
 
inherit cmake

SRCREV="${AUTOREV}"
                       
SRC_URI="git://github.com/StevenLesoin/helloWorldC.git \
	file://CMakeLists.txt \
	file://src/CMakeLists.txt"

S="${WORKDIR}"

do_configure_prepend(){
	cd ${S}
	cp git/helloWorldC.c src/
}

FILES_${PN} += "${bindir}/helloWorldC_cmake"



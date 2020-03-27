DESCRIPTION="Simple helloworld application build with autotools"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
                        
inherit autotools

SRCREV = "${AUTOREV}"

SRC_URI="file://configure.ac \
	file://Makefile.am \
	file://src/Makefile.am \
	git://github.com/StevenLesoin/helloWorldC.git "

S="${WORKDIR}"
B="${S}"

do_configure_prepend(){
	touch NEWS README AUTHORS ChangeLog 
	cp git/helloWorldC.c src/
}

FILES_${PN} += "${bindir}/helloWorldC_autotools"


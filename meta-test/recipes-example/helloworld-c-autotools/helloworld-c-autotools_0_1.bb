DESCRIPTION="Simple helloworld application build with autotools"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
                        
inherit autotools

SRC_URI="file://configure.ac \
	file://Makefile.am \
	file://src/Makefile.am \
	file://src/helloWorldC.c "

S="${WORKDIR}"
B="${S}"

do_configure_prepend(){
	cd ${S}
	touch NEWS README AUTHORS ChangeLog 
}

FILES_${PN} += "${bindir}/helloWorldC_autotools"


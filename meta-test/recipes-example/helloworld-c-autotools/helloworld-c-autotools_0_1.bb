DESCRIPTION="Simple helloworld application build with autotools"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
                        
inherit autotools

SRC_URI="file://autogen.sh \
	file://configure.ac \
	file://Makefile.am \
	file://src/Makefile.am \
	file://src/helloWorldC.c "

S="${WORKDIR}"

do_configure_prepend(){
	cd ${S}
	bash autogen.sh
	./configure
}

do_install_append(){
	install -d ${D}${bindir}
	install -m 0755 ${S}/src/helloWorldC_autotools ${D}${bindir}
}

FILES_${PN} += "${bindir}/helloWorldC_autotools"


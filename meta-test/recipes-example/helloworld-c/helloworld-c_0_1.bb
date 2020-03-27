DESCRIPTION="Simple helloworld application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
              
SRCREV = "${AUTOREV}"
          
SRC_URI="git://github.com/StevenLesoin/helloWorldC.git"

S="${WORKDIR}/git"

do_compile(){
	${CC} helloWorldC.c ${LDFLAGS} -o helloWorldC
}

do_install(){
	install -d ${D}${bindir}
	install -m 0755 helloWorldC ${D}${bindir}
}

FILES_${PN} += "${bindir}/helloWorldC"

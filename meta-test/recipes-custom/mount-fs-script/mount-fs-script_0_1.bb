SUMMARY = "Custom script for Yocto training"
SECTION = "custom"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

RDEPENDS_${PN} += "bash"
                        
SRC_URI = "file://set_fs_type.sh"

do_install() {
     install -d ${D}${sbindir}
     install -m 0755 ${WORKDIR}/set_fs_type.sh ${D}${sbindir}
}

FILES_${PN} += "${sbindir}/set_fs_type.sh"


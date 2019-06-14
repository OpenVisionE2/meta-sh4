DESCRIPTION = "Mount spark root as usb."
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://${OPENVISION_BASE}/LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

RDEPENDS_${PN} = "kernel-module-yaffs"

SRC_URI = "file://mountspark"

FILES_${PN} = "${sysconfdir}"

do_install () {
    install -d ${D}${sysconfdir}/init.d
    install ${WORKDIR}/mountspark ${D}${sysconfdir}/init.d
}

INITSCRIPT_NAME = "mountspark"
INITSCRIPT_PARAMS = "start 39 S ."

inherit update-rc.d


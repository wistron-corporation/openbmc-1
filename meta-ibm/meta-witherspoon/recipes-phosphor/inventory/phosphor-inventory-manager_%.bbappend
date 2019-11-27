FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
PACKAGECONFIG_append_ibm-ac-server = " associations"
SRC_URI_append_ibm-ac-server = " file://associations.json"
PACKAGECONFIG_append_mihawk = " associations"
SRC_URI_append_mihawk = " file://associations.json"

DEPENDS_append_ibm-ac-server = " inventory-cleanup"

do_install_append_ibm-ac-server() {
    install -d ${D}${base_datadir}
    install -m 0755 ${WORKDIR}/associations.json ${D}${base_datadir}/associations.json
}
do_install_append_mihawk() {
    install -d ${D}${base_datadir}
    install -m 0755 ${WORKDIR}/associations.json ${D}${base_datadir}/associations.json
}

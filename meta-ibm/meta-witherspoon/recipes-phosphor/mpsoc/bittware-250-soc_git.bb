SUMMARY = "Bittware 250 SoC "
DESCRIPTION = "This module creates inventory and sensor of Bittware 250 SoC"

inherit meson pkgconfig
inherit obmc-phosphor-dbus-service

DEPENDS += "phosphor-logging"
DEPENDS += "sdbusplus"
DEPENDS += "phosphor-dbus-interfaces"
DEPENDS += "sdeventplus"
DEPENDS += "nlohmann-json"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${S}/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI += "git://github.com/wistron-corporation/bittware-soc.git;protocol=git"
SRCREV = "15fb73f75b38cd708b8ea3d6a2f25a26d596b59c"

S = "${WORKDIR}/git"

DBUS_SERVICE_${PN} = "xyz.openbmc_project.bittware.manager.service"
SUMMARY = "Bittware 250 SoC "
DESCRIPTION = "This module creates inventory and sensor of Bittware 250 SoC"

inherit meson pkgconfig

DEPENDS += "phosphor-logging"
DEPENDS += "sdbusplus"
DEPENDS += "phosphor-dbus-interfaces"
DEPENDS += "sdeventplus"
DEPENDS += "nlohmann-json"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${S}/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI += "git://github.com/wistron-corporation/bittware-soc.git;protocol=git"
SRCREV = "243c8b830c4cdaf48d54c9054e0e7be1b6d5a6d7"

S = "${WORKDIR}/git"
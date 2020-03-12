PR = "r1"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${PHOSPHORBASE}/COPYING.apache-2.0;md5=34400b68072d710fecd0a2940a0d1658"

inherit meson pkgconfig
inherit obmc-phosphor-dbus-service
inherit obmc-phosphor-systemd
inherit phosphor-dbus-yaml
inherit pythonnative

DEPENDS += "sdbusplus"
DEPENDS += "phosphor-dbus-interfaces"
DEPENDS += "sdeventplus"
DEPENDS += "phosphor-logging"
DEPENDS += "sdbusplus-native"
DEPENDS += "autoconf-archive-native"
DEPENDS += "nlohmann-json"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

EXTRA_OEMESON_append_mihawk += "-Dplatform=mihawk"

SRC_URI := "git://github.com/wistron-corporation/phosphor-nvme;branch=test1"
SRCREV := "1f0c442459676d99ad6da810ac22476ee7025116"
S = "${WORKDIR}/git"

SRC_URI += " file://mihawk_config.json;subdir=git"

DBUS_SERVICE_${PN} = "xyz.openbmc_project.nvme.manager.service"

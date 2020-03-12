SUMMARY = "Wistron OEM commands"
DESCRIPTION = "Wistron OEM commands"
HOMEPAGE = "https://github.com/openbmc/wistron-ipmi-oem"
PR = "r1"
PV = "0.1+git${SRCPV}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fa818a259cbed7ce8bc2a22d35a464fc"

inherit autotools pkgconfig
inherit obmc-phosphor-ipmiprovider-symlink

DEPENDS += "phosphor-ipmi-host"
DEPENDS += "autoconf-archive-native"
DEPENDS += "sdbusplus sdbusplus-native"
DEPENDS += "phosphor-dbus-interfaces phosphor-dbus-interfaces-native"
DEPENDS += "openpower-dbus-interfaces openpower-dbus-interfaces-native"
DEPENDS += "sdbus++-native"

S = "${WORKDIR}/git"
SRC_URI = "git://github.com/wistron-corporation/wistron-ipmi-oem"
SRCREV = "40dcb916e21b55e3fe2c3bb9a5a2b7ff1d3ccb60"

FILES_${PN}_append = " ${libdir}/ipmid-providers/lib*${SOLIBS}"
FILES_${PN}_append = " ${libdir}/host-ipmid/lib*${SOLIBS}"
FILES_${PN}-dev_append = " ${libdir}/ipmid-providers/lib*${SOLIBSDEV} ${libdir}/ipmid-providers/*.la"

HOSTIPMI_PROVIDER_LIBRARY += "libwistronoem.so"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
SRC_URI_append_ibm-ac-server = " file://witherspoon.cfg"
SRC_URI_append_mihawk += " file://mihawk.cfg"
SRC_URI_append_mihawk += " file://0001-wistron-wps.patch"
SRC_URI_append_mihawk += " file://0002-Change-the-name-of-mihawk-led.patch"
SRC_URI_append_mihawk += " file://0003-Add-aliases-for-i2c-and-add-thermal-sensor.patch"
SRC_URI_append_witherspoon-128 = " file://0001-ARM-dts-Aspeed-Witherspoon-128-Update-BMC-partitioni.patch"

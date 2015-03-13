# Copyright (C) 2010-2012 O.S. Systems Software Ltda. All Rights Reserved
# Released under the MIT license

DESCRIPTION = "FreeRDP RDP client"
HOMEPAGE = "http://www.freerdp.com"
DEPENDS = "openssl"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

inherit pkgconfig cmake

RDEPENDS_${PN} += "wayland libasound"

ARM_INSTRUCTION_SET = "arm"

do_compile() {
	oe_runmake
}

EXTRA_OECMAKE += "\
                  -DWITH_X11=OFF \
                  -DWITH_WAYLAND=ON \
                  -DWITH_SERVER=ON \
                  -DWITH_ALSA=ON \
                  -DWITH_SSE2=OFF \
                  -DCMAKE_MODULE_PATH=${workdir} \
                  -DARM_FP_ABI=hard \                  
"

do_install_append() {
	rm -rf ${D}/usr/lib/cmake
}

PACKAGES =+ "libfreerdp"

LEAD_SONAME = "libfreerdp.so"
#FILES_libfreerdp = "${libdir}/lib*${SOLIBS}"

PACKAGES_DYNAMIC += "^libfreerdp-plugin-.*"

FILES_${PN} += "${libdir}/freerdp"

FILES_${PN}-dbg += "${libdir}/freerdp/.debug"



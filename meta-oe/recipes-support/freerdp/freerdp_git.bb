# Copyright (C) 2010-2012, O.S. Systems Software Ltda.
# Released under the MIT license

include freerdp.inc

inherit gitpkgv

PV = "1.2.0+gitr${SRCPV}"
PKGV = "${GITPKGVTAG}"

EXTRA_OECMAKE += "-DWITH_MANPAGES=OFF"

SRCREV = "780d451afad21a22d2af6bd030ee71311856f038"
SRC_URI += "\
	git://github.com/FreeRDP/FreeRDP.git;branch=master \
"

S = "${WORKDIR}/git"

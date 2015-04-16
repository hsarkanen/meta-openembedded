# Copyright (C) 2010-2012, O.S. Systems Software Ltda.
# Released under the MIT license

include freerdp.inc

inherit gitpkgv

PV = "1.1.0+gitr${SRCPV}"
PKGV = "${GITPKGVTAG}"

EXTRA_OECMAKE += "-DWITH_MANPAGES=OFF"

SRCREV = "2604ff20bd12e810cfeed735b80dbe90020d781c"
SRC_URI += "\
	git://github.com/FreeRDP/FreeRDP.git;branch=stable-1.1 \
"

S = "${WORKDIR}/git"

# Copyright (C) 2010-2012, O.S. Systems Software Ltda.
# Released under the MIT license

include freerdp.inc

inherit gitpkgv

PV = "1.2.0+gitr${SRCPV}"
PKGV = "${GITPKGVTAG}"

EXTRA_OECMAKE += "-DWITH_MANPAGES=OFF"

SRCREV = "3f371b22ad67033c366e41f459747796a95633b8"
SRC_URI += "\
	git://github.com/FreeRDP/FreeRDP.git;branch=master \
"

S = "${WORKDIR}/git"

# (c) Copyright 2012  Hewlett-Packard Development Company, L.P. 


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"
SECTION = "webos/libs"

DESCRIPTION = "PmStateMachineEngine"

DEPENDS = "pmloglib"
RDEPENDS = "pmloglib"

inherit webos_component
inherit webos_public_repo
inherit webos_enhanced_submissions
inherit webos_cmake
inherit webos_library

PR = "${WEBOS_SUBMISSION}"
SRC_URI = "${OPENWEBOS_GIT_REPO}/${PN};tag=${PR};protocol=git"
S="${WORKDIR}/git"


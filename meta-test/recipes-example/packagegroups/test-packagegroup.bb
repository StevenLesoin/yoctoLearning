DESCRIPTION = "My Custom Package Groups"

inherit packagegroup

PACKAGES = "\
	test-packagegroup \
	"

RDEPENDS_test-packagegroup = "\
	mount-fs-script \
	helloworld-c \
	helloworld-c-autotools \
	"

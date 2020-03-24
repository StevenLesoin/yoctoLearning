#!/bin/bash

help()
{
echo "Example : set_fs_type [option]"
echo "Available option are :\n
	-h or --help	Print this help message
	rw 		Mount rootfs in read/write mode
	ro 		Mount rootfs in read only mode"
}

res=1

nbOptionAvailable=1

if [ "$#" = "1" ];then
	if [ $1 = "rw" ];then
		mount / -o rw,remount
		res=0
	elif [ "$1" = "ro" ];then
		mount / -o ro,remount
		res=0
	elif [ "$1" = "--help" ] || [ "$1" = "-h" ];then
		help
		res=0
	else
		echo "Error : wrong option set"
		help
	fi 
else
	echo "Error : Only one option must be set"
	help
fi

exit $res



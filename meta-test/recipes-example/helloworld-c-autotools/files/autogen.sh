#!/bin/bash 

aclocal \
&& touch NEWS README AUTHORS ChangeLog \
&& automake --add-missing \
&& autoconf 

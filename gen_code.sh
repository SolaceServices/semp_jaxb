#!/bin/bash

if [ "$#" -lt 3 ]; then
        echo "USAGE: $0 <format> <gen-ver> <full-ver>"
	echo "	format = hardware or software"
	echo "	gen_ver = r8_4_0 or r8_4VMR"
	echo "	full_ver = 8.4.0.48"
        exit 0
fi
format=$1
gen_ver=$2
full_ver=$3

# gen_ver=r8_3VMR
# full_ver=8.3.0.1004

rm -rf src/main/java/com/solacesystems/semp_jaxb/$gen_ver
mkdir -p src/main/java/com/solacesystems/semp_jaxb/$gen_ver

xjc -p com.solacesystems.semp_jaxb.$gen_ver.request \
	-d src/main/java \
	xsd/$format/$full_ver/semp-rpc-soltr.xsd \
	-b xsd/$format/$full_ver/semp-rpc-soltr-jaxb-bindings.xsd

xjc -p com.solacesystems.semp_jaxb.$gen_ver.reply \
	-d src/main/java \
	xsd/$format/$full_ver/semp-rpc-reply-soltr.xsd \
	-b xsd/$format/$full_ver/semp-rpc-reply-soltr-jaxb-bindings.xsd

cp pom.xml pom.xml.bak
sed "s/__GEN_VER__/$gen_ver/" pom.tmpl | sed "s/__FULL_VER__/$full_ver/" > pom.xml

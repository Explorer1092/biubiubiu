#!/bin/bash
echo "start replay"
echo -e "\n"
echo "端口为:9090"
sudo ./goreplay --input-raw :9090  --output-file %Y%m%d.log
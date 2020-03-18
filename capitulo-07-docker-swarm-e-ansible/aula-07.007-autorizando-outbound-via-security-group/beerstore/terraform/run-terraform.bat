#!/bin/bash
echo "Provisioning infrastructure..."
echo "Finding my public ip address..."
for /F %%I in ('curl http://ipinfo.io/ip') do set MY_PUBLIC_IP=%%I
echo "... your public ip is %MY_PUBLIC_IP%"
echo "Starting Terraform..."
%userprofile%\terraform apply -var "my_public_ip=%MY_PUBLIC_IP%/32"
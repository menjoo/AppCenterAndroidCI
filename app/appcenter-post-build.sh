#!/usr/bin/env bash

echo "Executing post-build bash script"

if [ "$APPCENTER_BRANCH" == "master" ];
then
    echo "TODO push git tag"
    echo "current build is $APPCENTER_BUILD_ID"
fi

#!/bin/bash

TEST="curl http://localhost/ -H $CT"
echo $TEST

RESPONSE=`$TEST`
echo $RESPONSE

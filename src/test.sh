#!/bin/bash
  
TEST="curl http://localhost:8080/"
echo $TEST

RESPONSE=`$TEST`
echo $RESPONSE

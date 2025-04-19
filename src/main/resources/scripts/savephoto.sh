#!/bin/bash

if [ "$1" == "yes" ]; then
    sleep 0.4
    ffmpeg -f v4l2 -video_size 280x280 -i /dev/video0 -frames:v 1 image.webcam.jpg
fi

import picamera
import sys

fileName = str(sys.argv[1])

camera = picamera.PiCamera()

camera.capture(fileName)

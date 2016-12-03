
import sys
import time
from grovepi import *

# Connect the Grove LED to digital port D4
led = 4
led = int(str(sys.argv[1]))
switch = int(str(sys.argv[2]))

if (switch == 1):
    switch = 255
else:
    switch = 0

try:
    analogWrite(led,switch)
except IOError:
    print ("Error")

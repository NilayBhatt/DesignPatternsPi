
import sys
import time
from grovepi import *

# Connect the Grove LED to digital port D4
led = 4
led = int(str(sys.argv[1]))
switch = int(str(sys.argv[2]))


while True:
    try:
        digitalWrite(led,switch)
    except KeyboardInterrupt:	# Turn LED off before stopping
        digitalWrite(led,0)
        break
    except IOError:				# Print "Error" if communication error encountered
        print ("Error")

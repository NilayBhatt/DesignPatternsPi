from grovepi import *
from grove_rgb_lcd import *

dht_sensor_port = 7  # Connect the DHt sensor to port 7
dht_sensor_type = 0  # change this depending on your sensor type
# Note the dht_sensor_type below may need to be changed depending on which DHT sensor you have:
#  0 - DHT11 - blue one - comes with the GrovePi+ Starter Kit
#  1 - DHT22 - white one, aka DHT Pro or AM2302
#  2 - DHT21 - black one, aka AM2301

try:
    # This part of the code gets the temperature and the humidity from the GrovePi sensor.
    [temp, hum] = dht(dht_sensor_port, dht_sensor_type)  # Get the temperature and Humidity from the DHT sensor

    # Standard out for the temperature in celsius
    print("temp =", temp)

    # The following code adds the text to the digital display on the sensor.
    t = str(temp)
    h = str(hum)

    setRGB(0, 128, 64)
    setRGB(0, 255, 0)
    setText("Temp:" + t + "C      " + "Humidity :" + h + "%")
except (IOError, TypeError) as e:
    print("{0}".format(e))
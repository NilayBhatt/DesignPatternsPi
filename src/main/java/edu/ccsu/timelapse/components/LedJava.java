package edu.ccsu.timelapse.components;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

/**
 * This method is a concrete strategy that turns led on using JAVA code.
 * This code uses pi4J libraries.
 */
public class LedJava implements LedOnOffStrategy {

    private final GpioController gpio = GpioFactory.getInstance();

    private final GpioPinDigitalOutput led = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_04, "MyLED", PinState.LOW);

    /**
     * Turns on the led.
     *
     */
    public void turnOn() {
        led.high();
    }

    /**
     * Turns off the led
     *
     */
    public void turnOff(){
        led.low();
    }

    /**
     * finds if the led is on or not.
     *
     * @return true if led is on.
     */
    public boolean isLedSet() {
        return this.led.isHigh();
    }

    /**
     * Finds whether the objects are equal to each other
     * @param object o
     * @return true if the objects are equal
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof LedJava)){
        	return false;
        }

        LedJava ledJava = (LedJava) o;

        if (this.gpio != null ? !this.gpio.equals(ledJava.gpio) : ledJava.gpio != null) {
        	return false;
        }
        
        return this.led != null ? this.led.equals(ledJava.led) : ledJava.led == null;

    }

    /**
     * Gets the hash code of the object.
     * 
     * @return int hashcode
     */
    @Override
    public int hashCode() {
        int result = gpio != null ? gpio.hashCode() : 0;
        result = 31 * result + (led != null ? led.hashCode() : 0);
        return result;
    }
}

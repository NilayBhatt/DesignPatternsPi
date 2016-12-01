package edu.ccsu.timelapse.components;

/**
 * This method is a concrete strategy that turns led on using
 * JAVA code.
 * This code uses pi4J libraries.
 * Created by Nilay on 11/30/2016.
 */

import com.pi4j.io.gpio.*;

public class LedJava implements LedOnStrategy {

    private final GpioController gpio = GpioFactory.getInstance();

    private final GpioPinDigitalOutput led = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, "MyLED", PinState.LOW);

    /**
     * Turns on the led.
     *
     */
    public void execute() {
        led.high();
    }

    /**
     * Turns of the led
     *
     */
    public void unexecute(){
        led.low();
    }

    /**
     * finds if the led is on or not.
     *
     * @return true if led is set for this Account instance.
     */
    public boolean isLedSet() {
        return this.led.isHigh();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LedJava)) return false;

        LedJava ledJava = (LedJava) o;

        if (gpio != null ? !gpio.equals(ledJava.gpio) : ledJava.gpio != null) return false;
        return led != null ? led.equals(ledJava.led) : ledJava.led == null;

    }

    @Override
    public int hashCode() {
        int result = gpio != null ? gpio.hashCode() : 0;
        result = 31 * result + (led != null ? led.hashCode() : 0);
        return result;
    }
}

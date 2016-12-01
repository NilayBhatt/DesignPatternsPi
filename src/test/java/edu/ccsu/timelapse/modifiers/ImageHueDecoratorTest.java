/**
 * Test Class for ImageHueDecorator class
 *
 * @author Edmir Alagic, Nilay Bhatt, Lukasz Brodowski, Deepankar Malhan, Sabahudin Mujcinovic
 */
package edu.ccsu.timelapse.modifiers;

import edu.ccsu.timelapse.models.Image;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Nilay on 11/22/2016.
 */
public class ImageHueDecoratorTest {
    @Test
    public void process() throws Exception {
        Image testImage = new Image("testImage.jpg");
        ImageHueDecorator imageHueDecorator = new ImageHueDecorator(100);
        imageHueDecorator.process(testImage);

        assertTrue(testImage.getHue() == 100);
    }

}
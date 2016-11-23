package edu.ccsu.timelapse.modifiers;

import edu.ccsu.timelapse.models.Image;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Nilay on 11/21/2016.
 */
public class ImageTimeDecoratorTest {
    @Test
    public void process() throws Exception {
        Image testImage = new Image("testImage");
        ImageDecorator imageDecorator = new ImageTimeDecorator(testImage);
        imageDecorator.process();

        if(testImage.getCreatedAt() != null) {
            assertTrue(true);
        }
        else
            assertTrue(false);


    }
}

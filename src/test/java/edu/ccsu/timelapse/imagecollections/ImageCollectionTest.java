/**
 * Test Class for ImageCollection class
 *
 * @author Edmir Alagic, Nilay Bhatt, Lukasz Brodowski, Deepankar Malhan, Sabahudin Mujcinovic
 */
package edu.ccsu.timelapse.imagecollections;

import edu.ccsu.timelapse.models.Image;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class ImageCollectionTest {

    @Test
    public void addElements() throws Exception {

        Image testImage = (Image) new Image().setPath("testImage.png");
        ImageComposite imageCollection = new ImageComposite();
        try {
            imageCollection.addElements(testImage);
        } catch (Exception e) {
            assertFalse(true);
        }

        assertTrue(true);
    }

    @Test
    public void removeElement() throws Exception {
        Image testImage = (Image) new Image().setPath("testImage.png");
        ImageComposite imageCollection = new ImageComposite();
        try {
            imageCollection.addElements(testImage);
            imageCollection.removeElement(testImage);
        } catch (Exception e) {
            assertFalse(true);
        }

        assertTrue(true);

    }

    @Test
    public void toSString() throws Exception {
        Image testImage = (Image) new Image().setPath("testImage.png");
        ImageComposite imageCollection = new ImageComposite();
        imageCollection.addElements(testImage);

        assertTrue(imageCollection.toString().equals(testImage.toString() + " "));
    }

    @Test
    public void equalsTrue() throws Exception {
        Image testImage = (Image) new Image().setPath("testImage.png");
        ImageComposite imageCollection = new ImageComposite();
        imageCollection.addElements(testImage);
        ImageComposite imageCollection1 = new ImageComposite();
        imageCollection1.addElements(testImage);

        assertTrue(imageCollection.equals(imageCollection1));
    }

    @Test
    public void equalsFalse() throws Exception {
        Image testImage = (Image) new Image().setPath("testImage.png");
        ImageComposite imageCollection = new ImageComposite();
        imageCollection.addElements(testImage);
        Image testImage1 = (Image) new Image().setPath("testImage.png");
        ImageComposite imageCollection1 = new ImageComposite();
        imageCollection1.addElements(testImage1);

        assertFalse(imageCollection.equals(imageCollection1));
    }

    @Test
    public void hashCCode() throws Exception {
        Image testImage = (Image) new Image().setPath("testImage.png");
        ImageComposite imageCollection = new ImageComposite();
        imageCollection.addElements(testImage);
        ImageComposite imageCollection1 = new ImageComposite();
        imageCollection1.addElements(testImage);

        assertEquals(imageCollection.hashCode(),imageCollection1.hashCode());
    }

    @Test
    public void getElements() throws Exception {
        Image testImage = (Image) new Image().setPath("testImage.png");
        ImageComposite imageCollection = new ImageComposite();
        imageCollection.addElements(testImage);

        List<ImageComponent> images = imageCollection.getElements();

        if(images.get(0) instanceof Image) {
            assertTrue(images.get(0).equals(testImage));
        } else {
            Assert.fail();
        }
    }

}
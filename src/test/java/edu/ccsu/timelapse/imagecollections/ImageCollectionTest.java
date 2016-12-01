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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class ImageCollectionTest {

    @Test
    public void addElements() throws Exception {

        Image testImage = new Image("testImage.png");
        ImageCollection imageCollection = new ImageCollection();
        try {
            imageCollection.addElements(testImage);
        } catch (Exception e) {
            assertFalse(true);
        }

        assertTrue(true);
    }

    @Test
    public void removeElement() throws Exception {
        Image testImage = new Image("testImage.png");
        ImageCollection imageCollection = new ImageCollection();
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
        Image testImage = new Image("testImage.png");
        String s = "{\n[";
        s += testImage.toString();
        s+= "]\n}";
        ImageCollection imageCollection = new ImageCollection();
        imageCollection.addElements(testImage);

        assertTrue(imageCollection.toString().equals(s));
    }

    @Test
    public void equalsTrue() throws Exception {
        Image testImage = new Image("testImage.png");
        ImageCollection imageCollection = new ImageCollection();
        imageCollection.addElements(testImage);
        ImageCollection imageCollection1 = new ImageCollection();
        imageCollection1.addElements(testImage);

        assertTrue(imageCollection.equals(imageCollection1));
    }

    @Test
    public void equalsFalse() throws Exception {
        Image testImage = new Image("testImage.png");
        ImageCollection imageCollection = new ImageCollection();
        imageCollection.addElements(testImage);
        Image testImage1 = new Image("testImage.jpg");
        ImageCollection imageCollection1 = new ImageCollection();
        imageCollection1.addElements(testImage1);

        assertFalse(imageCollection.equals(imageCollection1));
    }

    @Test
    public void hashCCode() throws Exception {
        Image testImage = new Image("testImage.png");
        ImageCollection imageCollection = new ImageCollection();
        imageCollection.addElements(testImage);
        ImageCollection imageCollection1 = new ImageCollection();
        imageCollection1.addElements(testImage);

        assertEquals(imageCollection.hashCode(),imageCollection1.hashCode());
    }

    @Test
    public void getElements() throws Exception {
        Image testImage = new Image("testImage.png");
        ImageCollection imageCollection = new ImageCollection();
        imageCollection.addElements(testImage);

        ArrayList<ImageComposite> images = imageCollection.getElements();

        if(images.get(0) instanceof Image) {
            assertTrue(images.get(0).equals(testImage));
        } else {
            Assert.fail();
        }
    }

}
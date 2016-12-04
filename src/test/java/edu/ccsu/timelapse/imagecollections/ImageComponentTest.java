/**
 * Test Class for ImageCollection class
 *
 * @author Edmir Alagic, Nilay Bhatt, Lukasz Brodowski, Deepankar Malhan, Sabahudin Mujcinovic
 */
package edu.ccsu.timelapse.imagecollections;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class ImageComponentTest {

    @Test
    public void addElements() throws Exception {

        ImageComponent testImage = new ConcreteImageComponent();
        testImage.getImage().setPath("testImage.png");
        ImageComponent imageCollection = new ImageComposite("TestingImageComponentAddElementComposite");
        try {
            imageCollection.addComponent(testImage);
        } catch (Exception e) {
            assertFalse(true);
        }

        assertTrue(true);
    }

    @Test
    public void removeElement() throws Exception {
        ImageComponent testImage = new ConcreteImageComponent();
        testImage.getImage().setPath("testImage.png");
        ImageComponent imageCollection = new ImageComposite("TestingImageComponentRemoveElementComposite");
        try {
            imageCollection.addComponent(testImage);
            imageCollection.removeComponent(testImage);
        } catch (Exception e) {
            assertFalse(true);
        }

        assertTrue(true);

    }

    @Test
    public void toSString() throws Exception {
        ImageComponent testImage = new ConcreteImageComponent();
        testImage.getImage().setPath("testImage.png");
        ImageComponent imageCollection = new ImageComposite("TestingImageComponentToStringComposite");
        imageCollection.addComponent(testImage);

        assertTrue(imageCollection.toString().equals(testImage.toString() + " "));
    }

    @Test
    public void equalsTrue() throws Exception {
        ImageComponent testImage = new ConcreteImageComponent();
        testImage.getImage().setPath("testImage.png");
        ImageComponent imageCollection = new ImageComposite("TestingImageComponentEqualsTrueComposite");
        imageCollection.addComponent(testImage);
        ImageComponent imageCollection1 = new ImageComposite("TestingImageComponentEqualsTrueComposite02");
        imageCollection1.addComponent(testImage);

        // TODO: This can never be true because imageCollection1 is the parent of (and thus contains) imageCollection
        assertTrue(imageCollection.equals(imageCollection1));
    }

    @Test
    public void equalsFalse() throws Exception {
        ImageComponent testImage = new ConcreteImageComponent();
        testImage.getImage().setPath("testImage.png");
        ImageComponent imageCollection = new ImageComposite("TestingImageComponentEqualsFalseComposite");
        imageCollection.addComponent(testImage);
        ImageComponent testImage1 = new ConcreteImageComponent();
        testImage1.getImage().setPath("testImage.png");
        ImageComponent imageCollection1 = new ImageComposite("TestingImageComponentEqualsFalseComposite2");
        imageCollection1.addComponent(testImage1);

        assertFalse(imageCollection.equals(imageCollection1));
    }

    @Test
    public void hashCCode() throws Exception {
        ImageComponent testImage = new ConcreteImageComponent();
        testImage.getImage().setPath("testImage.png");
        ImageComponent imageCollection = new ImageComposite("TestingImageComponentHashCodeComposite");
        imageCollection.addComponent(testImage);
        ImageComponent imageCollection1 = new ImageComposite("TestingImageComponentHashCodeComposite02");
        imageCollection1.addComponent(testImage);

        assertEquals(imageCollection.hashCode(),imageCollection1.hashCode());
    }

}
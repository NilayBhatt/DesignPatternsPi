package edu.ccsu.timelapse.imagecollections;

import edu.ccsu.timelapse.models.Image;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Nilay on 12/7/2016.
 */
public class ConcreteImageComponentTest {
    @Test
    public void getImage() throws Exception {
        Image image = new Image();

        ConcreteImageComponent concreteImageComponent = new ConcreteImageComponent();

        assertEquals(concreteImageComponent.getImage(), image);
    }

    @Test
    public void toSString() throws Exception {
        Image image = new Image();

        ConcreteImageComponent concreteImageComponent = new ConcreteImageComponent();

        assertEquals(concreteImageComponent.toString(), image.toString());
    }

    @Test
    public void hashCCode() throws Exception {
        ConcreteImageComponent concreteImageComponent = new ConcreteImageComponent();
        ConcreteImageComponent concreteImageComponent2 = new ConcreteImageComponent();
        assertEquals(concreteImageComponent.hashCode(), concreteImageComponent2.hashCode());
    }

    @Test
    public void equals() throws Exception {
        ConcreteImageComponent concreteImageComponent = new ConcreteImageComponent();
        ConcreteImageComponent concreteImageComponent2 = new ConcreteImageComponent();
        assertTrue(concreteImageComponent.equals(concreteImageComponent2));
    }

}
package edu.ccsu.timelapse.imagecollections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class ImageCompositeTest {
    @Test
    public void getElements() throws Exception {
        ImageComposite imageComposite = new ImageComposite();
        List<ImageComponent> elements = new ArrayList<ImageComponent>();

        assertEquals(imageComposite.getElements(),elements);
    }

    @Test
    public void iterator() throws Exception {
        ImageComposite imageComposite = new ImageComposite();
        List<ImageComponent> elements = new ArrayList<ImageComponent>();

        assertTrue(imageComposite.iterator() instanceof Iterator);
    }

    @Test
    public void toSString() throws Exception {
        ImageComposite imageComposite = new ImageComposite();
        List<ImageComponent> elements = new ArrayList<ImageComponent>();
        String output = "";

        for (ImageComponent composite : elements) {
            output += composite.toString() + " ";
        }

        assertEquals(imageComposite.toString(),output);
    }

    @Test
    public void equals() throws Exception {
        ImageComposite imageComposite = new ImageComposite();
        ImageComposite imageComposite1 = new ImageComposite();

        assertTrue(imageComposite.equals(imageComposite1));
    }

    @Test
    public void hashCCode() throws Exception {
        ImageComposite imageComposite = new ImageComposite();
        ImageComposite imageComposite1 = new ImageComposite();

        assertEquals(imageComposite.hashCode(), imageComposite1.hashCode());
    }

    @Test

}
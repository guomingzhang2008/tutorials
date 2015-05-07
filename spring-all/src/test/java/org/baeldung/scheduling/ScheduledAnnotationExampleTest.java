package org.baeldung.scheduling;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { SpringSchedulingConfig.class }, loader = AnnotationConfigContextLoader.class)
public class ScheduledAnnotationExampleTest {

    @Test
    public void testScheduledAnnotation() throws InterruptedException {
        Thread.sleep(5000);
    }
}

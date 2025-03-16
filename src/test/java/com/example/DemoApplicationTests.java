package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class DemoApplicationTests {

    @Test
    public void testActiveService() {
        ActiveService service = new ActiveService();
        assertNotNull(service);
        // You can add more tests as needed
    }
}

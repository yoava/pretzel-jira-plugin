package ut.org.pretzel.jira;

import org.junit.Test;
import org.pretzel.jira.MyPluginComponent;
import org.pretzel.jira.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}
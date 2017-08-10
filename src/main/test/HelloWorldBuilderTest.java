package org.jenkinsci.plugins.myfirstplugin;

import static org.junit.Assert.*;

/**
 * Created by David on 8/10/17.
 */
public class HelloWorldBuilderTest {
    @org.junit.Test
    public void setSleepTime() throws Exception {
    }

    @org.junit.Test
    public void getSleepTime() throws Exception {
    }

    @org.junit.Test
    public void getName() throws Exception {
        assertThat(builder.getName(), is(builderName));
    }

    @org.junit.Test
    public void perform() throws Exception {
    }

    private String builderName = "Builder name";
    private HelloWorldBuilder builder = new HelloWorldBuilder(builderName);

    @org.junit.Test
    public void getDescriptor() throws Exception {
        assertThat(builder.getName(), notNullValue());
    }
}
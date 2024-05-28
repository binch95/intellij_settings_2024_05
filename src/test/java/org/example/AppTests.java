package org.example;

public class AppTests {
    @Test
    void t1(){
        assertThat(new App().plus(a:10,b:20)).isEqualsTo(30);
    }


}

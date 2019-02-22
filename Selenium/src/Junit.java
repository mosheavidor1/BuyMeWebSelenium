import org.junit.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING) //(Click on F and choose fixmethod-then()and then ctrl+enter and choose methosorters)


public class Junit {

    @BeforeClass
    public static void before(){
        System.out.println(0);
    }

    @Test
    public void test01_login(){
        System.out.println(1);

        int a =4;
        int b= 6;

        Assert.assertEquals(a,b);


    }

    @Test
    public void test02_click_button() {
        System.out.println(1);


    }




    @AfterClass //we wiil put static only to before class and after class
    public static void after(){
        System.out.println(2);
    }


}


package Class6;

import org.junit.*;

public class TestAnnotations {

    @BeforeClass public static void
    AnnotationsBefore(){
        System.out.println("AnnotationsBefore");

    }
    @Before
    public void AnnotationsB(){
        System.out.println("AnnotationsB");
    }
    @Test public void
    AnnotationsTest(){
        System.out.println("AnnotationsTest");
    }
    @After
    public void afterAnnotations(){
        System.out.println("afterAnnotations");
    }
    @AfterClass
    public static void afterA(){
        System.out.println("afterA");
    }


}
package Class6.NewClass6;

import org.junit.*;

    public class TestAnnotations2 {


        @Before
        public void AnnotationsB() {
            System.out.println("AnnotationsB");
        }


        @BeforeClass
        public static void
        AnnotationsBefore() {
            System.out.println("AnnotationsBefore");

        }


        @After
        public void afterAnnotations() {
            System.out.println("afterAnnotations");
        }



        @AfterClass
        public static void afterA() {
            System.out.println("afterA");
        }

        @Test
        public void
        AnnotationsTest() {
            System.out.println("AnnotationsTest");
        }




    }



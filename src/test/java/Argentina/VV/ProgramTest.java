package Argentina.VV;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class ProgramTest {

    Program program;

    @Before
    public void setUp() throws Exception {
        System.out.println("Setup");
        program = new Program();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After test");
    }

    @Test
    public void main() {
        //Given
        Scanner sc1 = new Scanner("400");
        Scanner sc2 = new Scanner("10");
        //When
//        String[] inputs = {String.valueOf(sc1), String.valueOf(sc2)};


//        String result = Program.main(new String[]{"400", "10"});
        //Then
        assertEquals("Pesos", Program.main(new String[]{String.valueOf(sc1), String.valueOf(sc2)}));


    }
}
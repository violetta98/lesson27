package Facade;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Hillel9 on 24.08.2017.
 */
public class Memory {

    public void load(long position, byte[] data) {
        System.out.println("position = " + Arrays.toString(data));
    }

}

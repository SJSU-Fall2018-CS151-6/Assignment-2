import java.io.*;
import java.util.*;
import java.math.*;

public class StringComparator implements Comparator<String> {
    public int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }
}

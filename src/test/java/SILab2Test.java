import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    SILab2 lab = new SILab2();
    Angle a;
    @Test
    void everyStatementTest() {
        RuntimeException ex;
        List<Angle> list = new ArrayList<>();
        a=new Angle(15,60,23);
        list.add(a);
        ex=assertThrows(RuntimeException.class, () -> lab.function(list));
        assertTrue(ex.getMessage().contains("The minutes of the angle are not valid!"));
        list.clear();
        a=new Angle(50,42,-5);
        list.add(a);
        ex=assertThrows(RuntimeException.class, () -> lab.function(list));
        assertTrue(ex.getMessage().contains("The seconds of the angle are not valid"));
        list.clear();
        a=new Angle(360,32,18);
        list.add(a);
        ex=assertThrows(RuntimeException.class, () -> lab.function(list));
        assertTrue(ex.getMessage().contains("The angle is greater then the maximum"));
        list.clear();
        a=new Angle(-2,10,52);
        list.add(a);
        ex=assertThrows(RuntimeException.class, () -> lab.function(list));
        assertTrue(ex.getMessage().contains("The angle is smaller or greater then the minimum"));
        list.clear();
        a=new Angle(65,35,5);
        list.add(a);
        assertEquals(236105, lab.function(list).get(0));
        list.clear();
        a=new Angle(360,0,0);
        list.add(a);
        assertEquals(1296000, lab.function(list).get(0));
    }
    @Test
    void everyBranchTest() {
        RuntimeException ex;
        List<Angle> list = new ArrayList<>();
        a=new Angle(15,60,23);
        list.add(a);
        ex=assertThrows(RuntimeException.class, () -> lab.function(list));
        assertTrue(ex.getMessage().contains("The minutes of the angle are not valid!"));
        list.clear();
        a=new Angle(50,42,-5);
        list.add(a);
        ex=assertThrows(RuntimeException.class, () -> lab.function(list));
        assertTrue(ex.getMessage().contains("The seconds of the angle are not valid"));
        list.clear();
        a=new Angle(360,32,18);
        list.add(a);
        ex=assertThrows(RuntimeException.class, () -> lab.function(list));
        assertTrue(ex.getMessage().contains("The angle is greater then the maximum"));
        list.clear();
        a=new Angle(-2,10,52);
        list.add(a);
        ex=assertThrows(RuntimeException.class, () -> lab.function(list));
        assertTrue(ex.getMessage().contains("The angle is smaller or greater then the minimum"));
        list.clear();
        a=new Angle(65,35,5);
        list.add(a);
        assertEquals(236105, lab.function(list).get(0));
        list.clear();
        a=new Angle(360,0,0);
        list.add(a);
        assertEquals(1296000, lab.function(list).get(0));
    }
}
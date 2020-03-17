import animals.Eagle;
import animals.NoName;
import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class Test {
 @org.junit.jupiter.api.Test
 public void trueUnitTest(){
     Zoo zoo=new Zoo();
     Eagle eagle=new Eagle(21,21,21);
     String result= zoo.addToAviary(eagle);
     Assert.assertEquals(result,"Eagle!");
 }

    @org.junit.jupiter.api.Test
    public void falseUnitTest(){
        Zoo zoo=new Zoo();
        NoName no=new NoName(12345,12,12,"Kot!");
        Assert.assertEquals(zoo.addToAviary(no),"Animal doesn't exist and wasn't added(");
    }
}
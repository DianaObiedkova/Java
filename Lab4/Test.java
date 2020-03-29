import animals.Eagle;
import animals.NoName;
import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

import static junit.framework.TestCase.fail;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


class Test {
 @org.junit.jupiter.api.Test
 public void trueUnitTest() throws Exception {
     Zoo zoo=new Zoo();
     Eagle eagle=new Eagle(21,21,21);
     Boolean result= zoo.addToAviary(eagle);
     Assert.assertEquals(result,true);
 }

    @org.junit.jupiter.api.Test
    public void falseUnitTest0() {
        Zoo zoo=new Zoo();
        NoName no=new NoName(12345,12,12,"Kot!");
        try{
            zoo.addToAviary(no);
            fail();
        }
        catch(Exception e){
            assertThat(e.getMessage(),is("Animal doesn't exist and wasn't added("));
        }
    }

    @org.junit.jupiter.api.Test
    public void falseUnitTest1() {
        Zoo zoo=new Zoo();
        NoName no=new NoName(12345,12,12,"Kot!");
        try{
            zoo.removeFromAviary(no);
            fail();
        }
        catch(Exception e){
            assertThat(e.getMessage(),is("Animal doesn't exist and wasn't removed("));
        }
    }

    @org.junit.jupiter.api.Test
    public void falseUnitTest2() {
        Zoo zoo=new Zoo();
        NoName no=new NoName(12345,12,12,"Kot!");
        try{
            zoo.aviaries.get(0).removeAnimal(no);
            fail();
        }
        catch(Exception e){
            assertThat(e.getMessage(),is("There was a problem with removal..."));
        }
    }
}
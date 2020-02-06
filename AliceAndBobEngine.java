
/**
 * Write a description of class AliceAndBobEngine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AliceAndBobEngine
{
    String result;
    
    AliceAndBobEngine(){
        result = "";
    }

    //HINT: LOOK AT THE TESTS TO SEE WHAT IS EXPECTED FOR DIFFERENT CONDITIONS
    public String evaluateAliceOrBob(String input){
    
    if (input.equals("Alice")){
    return "Hello " + input;
    }
    else if (input.equals("Alicia") || input.equals("Bobert")){
    return "I DON'T KNOW YOU, YOU ARE SCARY"; 
    }
    else if (input.equals("Bob")){
    return "Hello " + input;
    }
    else {
        return "No good input";
    }
       
   }
}

       /*AliceAndBobEngine aliceAndBobEngineTest = new AliceAndBobEngine();
        
        assertEquals("Hello Bob", aliceAndBobEngineTest.evaluateAliceOrBob("Bob"));
        assertNotEquals("Hello Alice", aliceAndBobEngineTest.evaluateAliceOrBob("Pamela. Pamela the tropical citrus tree."));
        
        assertEquals("I DON'T KNOW YOU, YOU ARE SCARY", aliceAndBobEngineTest.evaluateAliceOrBob("Bobert"));
        assertNotEquals("I DON'T KNOW YOU, YOU ARE SCARY", aliceAndBobEngineTest.evaluateAliceOrBob("Bob"));/*



   /* AliceAndBobEngine aliceAndBobEngineTest = new AliceAndBobEngine();
        
        assertEquals("Hello Alice", aliceAndBobEngineTest.evaluateAliceOrBob("Alice"));
        assertNotEquals("Hello Alice", aliceAndBobEngineTest.evaluateAliceOrBob("Jeff. Jeff the Elephant."));
        
        assertEquals("I DON'T KNOW YOU, YOU ARE SCARY", aliceAndBobEngineTest.evaluateAliceOrBob("Alicia"));
        assertNotEquals("I DON'T KNOW YOU, YOU ARE SCARY", aliceAndBobEngineTest.evaluateAliceOrBob("Alice"));
        */
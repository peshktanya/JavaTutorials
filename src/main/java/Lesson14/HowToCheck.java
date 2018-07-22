package Lesson14;

public class HowToCheck {
    public static void main(String[] args) {
        Object unknownObject = null;

        //right way - avoid NullPointerException even if unknownObject is null
        if("knownObject".equals(unknownObject)){
            System.err.println("better coding avoided NullPointerException");
        }

        //wrong way - may cause NullPointerException
       /* if(unknownObject.equals("knownObject")){
            System.err.println("This may result in NullPointerException if unknownObject is null");
        }*/


    }



}

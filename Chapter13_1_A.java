/********************************************************************************************************************
 ********************************************************************************************************************
 *****                                   Chapter 13: Problem 1, Part a                                          *****
 *****__________________________________________________________________________________________________________*****
 *****     1.  Implement the Edible interface on page 510 and then the code in listing 13.7 on pages 510-511.   *****
 *****                          Run the TestEdible program and examine the output.                              *****
 *****                                       Next, do the following.                                            *****
 *****----------------------------------------------------------------------------------------------------------*****
 *****              a.  Remove the first @Override (in Chicken right before the howToEat method).               *****
 *****                                    Compile and run your program.                                         *****
 *****                                                                                                          *****
 *****__________________________________________________________________________________________________________*****
 *****                                            Questions:                                                    *****
 *****                                Q-1a_a - Does the program compile?                                        *****
 *****                                 Q-1a_b - Does it run as expected?                                        *****
 *****                        Q-1a_c - What is the significance of @Override then?                              *****
 *****----------------------------------------------------------------------------------------------------------*****
 *****                                            Answers:                                                      *****
 *****                          	        Q-1a_a - Answer: Yes                                                *****
 *****                                      Q-1a_b - Answer: Yes                                                *****
 *****                  Q-1a_c - Answer: To signify that this method is being over-ridden from a                *****
 *****                                previous version in the parent class.                                     *****
 *****----------------------------------------------------------------------------------------------------------*****
 *****                                Course Provided Solution (13_1_A):                                        *****
 *****                              Yes, it compiles and runs as expected.                                      *****
 *****      The reason for using @Override is to alert the compiler that we are overriding a method that,       *****
 *****                 should we specify something incorrectly, should be alerted to us.                        *****
 *****                               So if we had implemented howToEat wrong,                                   *****
 *****     having @Override forces the compiler to check that our method is correctly specified and if not,     *****
 *****   we get a syntax error. But if we specify the method properly, removing @Override has no consequence.   *****
 ********************************************************************************************************************
 ********************************************************************************************************************/

public class Chapter13_1_A {

    public static void main(String[] args) {

        Object[] objects = {new Tiger(), new Chicken(), new Apple()};

        for(int i = 0; i < objects.length; i++){
            if(objects[i] instanceof Edible)
                System.out.println(((Edible)objects[i]).howToEat());

            if(objects[i] instanceof Animal)
                System.out.println(((Animal)objects[i]).sound());
        }
    }
}


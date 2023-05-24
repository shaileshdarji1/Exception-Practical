public class Voter {
    public void eligible(int age) throws YoungAgeException{
        if(age<18){
            throw new YoungAgeException("You are not eligible for vote");
        }
        else{
            System.out.println("You are eligible for vote");
        }
    }
}

public class Magpie2
{
    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()        
    {   
        String[] randomRes = {"Fine", "Never heard that", "Maybe", "What?","Yah!", "Okay"};
        final int NUMBER_OF_RESPONSES = 6;
        int whichResponse = (int)(Math.random() * 6);

        String response = randomRes[whichResponse];
        return response;
    }

//Not yet finished 
        public static String chooseNumFromOneToTen() {
        int answer = (int)(Math.random() * 10) + 1;
        return String.valueOf(answer);
    }

     /**
     * Get a default greeting 	
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello! What do you want to ask me... If you want me to go to bed just tell me : It's time to go to bed now!";
    }

    /**
     * Gives a response to a user statement
     * 
     * @param statement the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        if(statement.indexOf("my")>=0){
            return "I don't know.";
        }else{
            if (statement.indexOf("hello")>=0) {
                return "Hello!!!!!!";
            } else if (statement.indexOf("color")>=0) {
                return "green how about you"; // change this to a continued response.
            } else if (statement.indexOf("school")>=0) {
                return "I HATE SCHOOL!!!!!!";
            } else if(statement.indexOf("tv")>=0){
                return "i love peppa pig!!!";
            }else if(statement.indexOf("age")>=0){
                return "i am five";
            }else if(statement.indexOf("favourite food")>=0){
                return "candy and ice cream!!!";
            }else if(statement.indexOf("food")>=0){
                return "I hate vegetables";
            }else if(statement.indexOf("hate")>=0){
                return "Spiders are disgusting!";
            }else if(statement.indexOf("toy")>=0){
                return "toy train!";
            }else if(statement.indexOf("weather")>=0){
                return "Rainy Days!";
            }else if(statement.indexOf("holiday")>=0){
                return "Christmas Holidays!!!";
            }else if(statement.indexOf("grade")>=0){
                return "I'm a 1st grader!";
            }else if(statement.indexOf("hobby")>=0){
                return "Playing games!!!";
            }else if(statement.indexOf("job")>=0){
                return "Maybe a pilot?";
            }else if(statement.indexOf("song")>=0){
                return "Baby Shark!!!";
            }else if (statement.indexOf("hi")>=0) {
                return "Hello!!!!!!";
            }else if (statement.indexOf("name")>=0) {
                return "My name is James.";
            }else if(statement.indexOf("number") >= 0){
             return Magpie2.chooseNumFromOneToTen();
      }
    
    String response = "";        
    response = getRandomResponse();       
    return response;
    }

    }
}
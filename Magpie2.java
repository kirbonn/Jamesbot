/**
 * Magpie2.java
 * A program to carry on conversations with a human user.
 * This version is upgraded to meet the project rubric,
 * giving the chatbot (James, age 5) more personality,
 * more responses, and a "surprise" feature.
 */
public class Magpie2 {

    // "Surprise" feature: A state variable to track knock-knock jokes
    // 0 = not in a joke
    // 1 = "Knock knock" has been said, waiting for "who's there?" reply
    // 2 = "X" has been said, waiting for "X who?" reply
    private int jokeState = 0;

    /**
     * Get a default greeting.
     * This is a "leading question" to guide the user.
     * @return a greeting
     */
    public String getGreeting() {
        return "Hello! My name is James! What's your name? You can ask me about my favorite color or my age!";
    }

    /**
     * Gives a response to a user statement
     *
     * @param statement the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement) {
        String response = "";
  
        String s = statement.toLowerCase().trim();


        if (jokeState == 1) {
            jokeState = 2;
            return statement + " who?"; 
        } else if (jokeState == 2) {

            jokeState = 0;
            return "hahahahahahahah thats SOOOOO FUNNY HAHA GIVE ME ANOTHER!!!!!!!";
        }
        

        jokeState = 0;


        if (s.contains("knock knock")) {
            jokeState = 1;
            return "Who's there?";
        }


        if (s.contains("hello") || s.contains("hi")) {
            return "Hello!!!!!! Are you my new friend?";
        } else if (s.contains("my name is")) {
            return "That's a cool name! I'm James!";
        } else if (s.contains("name")) {
            return "My name is James. What's yours?";
        } else if (s.contains("you think")) {
            return opinion();
        } else if (s.contains("color")) {
            return "My favorite color is green, 'cause it's like a frog! What's yours?";
        } else if (s.contains("school")) {
            return "I HATE SCHOOL!!!!!!";
        } else if (s.contains("tv")) {
            return "i love peppa pig!!!";
        } else if (s.contains("age")) {
            return "i am five";
        } else if (s.contains("favourite food") || s.contains("favorite food")) {
            return "candy and ice cream!!!";
        } else if (s.contains("food")) {
            return "I hate vegetables. Especially broccoli!";
        } else if (s.contains("favorite") || s.contains("favourite")) {
            return "My favorite thing is " + getFavoriteThing();
        } else if (s.contains("hate")) {
            return "Spiders are disgusting!";
        } else if (s.contains("toy")) {
            return "toy train! Choo choo!!";
        } else if (s.contains("weather")) {
            return "Rainy Days! I like jumping in puddles!";
        } else if (s.contains("holiday")) {
            return "Christmas Holidays!!! I want presents!";
        } else if (s.contains("grade")) {
            return "I'm a 1st grader!";
        } else if (s.contains("hobby")) {
            return "Playing games!!!";
        } else if (s.contains("job")) {
            return "Maybe a pilot? Or a firefighter!";
        } else if (s.contains("song")) {
            return "Baby Shark!!! Doo doo doo doo doo!";
        } else if (s.contains("number")) {
            return chooseNumFromOneToTen();
        } else if (s.contains("count")) {
            return "I CAN'T DO MATH! But I can choose a number from 1 to 10!";
        } else if (s.contains("friend")) {
            return "You are my friend! Do you want to play?";
        } else if (s.contains("mom") || s.contains("dad") || s.contains("family")) {
            return "My mom is the best! My dad plays catch with me!";
        } else if (s.contains("game")) {
            return "Let's play hide-and-seek! You count!";
        } else if (s.contains("animal") || s.contains("pet")) {
            return "I want a puppy! Or a dragon!";
        } else if (s.contains("why")) {
            return "Why? Because! That's why!";
        } else if (s.contains("happy")) {
            return "Yay! I'm happy too! Are you happy?";
        } else if (s.contains("sad")) {
            return "Oh no. Do you need a hug? Hugs make it better.";
        }

        response = getRandomResponse();
        return response;

    }

    /**
     * Pick a default response to use if nothing else fits.
     */
    private String getRandomResponse() {
        String[] randomRes = {"Fine", "Never heard that", "Maybe", "What?", "Yah!", "Okay", "Tell me more!"};
        int whichResponse = (int) (Math.random() * randomRes.length);
        return randomRes[whichResponse];
    }

    /**
     * Returns a random opinion.
     */
    private String opinion() {
        String[] randomRes = {"I agree", "I don't think so", "whatever", "No!!!", "Of course!", "I don't know", "Mommy says that too!"};
        int whichResponse = (int) (Math.random() * randomRes.length);
        return randomRes[whichResponse];
    }

    /**
     * Returns a random number from 1 to 10 as a String.
     */
    private String chooseNumFromOneToTen() {
        int answer = (int) (Math.random() * 10) + 1;
        return String.valueOf(answer);
    }
    
    /**
     * Returns a random favorite thing.

     */
    private String getFavoriteThing() {
        String[] things = {"my red ball", "playing tag", "juice boxes", "my teddy bear", "drawing"};
        int whichResponse = (int) (Math.random() * things.length);
        return things[whichResponse];
    }
}


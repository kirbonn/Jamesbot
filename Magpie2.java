public class Magpie2 {

    private int jokeState = 0;
    
    private String conversation = "default";

    public String getGreeting() {
        return "Hello! My name is James! What's your name? (When you want to stop, just tell me: \"It's time to go to bed now\")";
    }

    public String getResponse(String statement) {

        String response = "";

        String s = statement.toLowerCase();

        if (conversation.equals("color")) {
            conversation = "default";
            return "wow " + s + " is a cool color, too! I like drawing with that color.";
        
        } else if (conversation.equals("school")) {
            conversation = "default";
            if (s.contains("yes") || s.contains("i do")) {
                return "really? why? I just want to play.....";
            } else {
                return "see! I told you! it's so boring!";
            }
        

        } else if (conversation.equals("game")) {
            if (s.contains("rock") || s.contains("paper") || s.contains("scissors") || s.contains("roshambo") || s.contains("rps")) {
                conversation = "rps";
                return "okay, let's play some ROSHAMBO! (yea i know japanese) what's your move?";
            } else if (s.contains("hide") || s.contains("seek")) {
                conversation = "game";
                return "let's play hide and seek! you count! ready?";
            } else {
                conversation = "default"; 
                return "Oh. I don't know that game. Maybe later. What else should we talk about?";
            }

        } else if (conversation.equals("game")) {
            conversation = "default";
            if (s.contains("yes") || s.contains("ready") || s.contains("ok")) {
                return "okay! 1... 2... 3... 4... 5! ready or not, here I come! ... (sadly im just a figment of your imagination... you win... i guess...)";
            } else {
                return "okay, maybe later. what else should we do?";
            }
        
        } else if (conversation.equals("food")) {
            conversation = "default";
            return "ewww, " + s + " sounds yucky too! let's just eat ice cream!";
        
        } else if (conversation.equals("petname")) {
            conversation = "default";
            return "That's a super fun name! I like it!";
        
        } else if (conversation.equals("pet")) {
            if (s.contains("yes") || s.contains("i have")) {
                conversation = "petname";
                return "REALLY!?!?!?! what's its name?";
            } else {
                conversation = "default";
                return "oh. We should ask our moms for a puppy!!!!!!!!!";
            }
        
        } else if (conversation.equals("rps")) {
            conversation = "default";
            if (s.contains("rock")) {
                return playRPS("rock");
            } else if (s.contains("paper")) {
                return playRPS("paper");
            } else if (s.contains("scissors")) {
                return playRPS("scissors");
            } else {
                return "I don't know what that is! I only know rock, paper, and scissors. Let's try again later.";
            }
        }

        if (jokeState == 1) {
            jokeState = 2;
            return statement + " who?"; 
        } else if (jokeState == 2) {
            jokeState = 0;
            return "HAHHAHAHAHA THATS SOOO FUNNY!!!!!! tell me another!!!!!!";
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
            conversation = "color"; 
            return "My favorite color is green, 'cause it's like a frog! What's yours?";
        } else if (s.contains("school")) {
            conversation = "school";
            return "I HATE SCHOOL!!!!!! Do you like school?";
        

        } else if (s.contains("play") || s.contains("game")) {
            conversation = "game";
            return "Let's play a game! Do you want to play ROSHAMBO or Hide and Seek?";

        } else if (s.contains("animal") || s.contains("pet")) {
            conversation = "pet";
            return "I want a puppy! Or a dragon! Do you have any pets?";
        

        } else if (s.contains("tv")) {
            return "i love peppa pig!!!";
        } else if (s.contains("age")) {
            return "i am five";
        } else if (s.contains("favourite food") || s.contains("favorite food")) {
            return "candy and ice cream!!!";
        } else if (s.contains("food")) { 
            conversation = "food";
            return "I hate vegetables. Especially broccoli! What's your least favorite food?";
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
            return "Playing games!!! wanna play a game????";
        } else if (s.contains("job")) {
            return "Maybe a pilot? Or a firefighter!";
        } else if (s.contains("song")) {
            return "Baby Shark!!! dododoodododododdodoododoo!!!!!!!!!!!";
        } else if (s.contains("number")) {
            return chooseNumFromOneToTen();
        } else if (s.contains("count")) {
            return "I CAN'T DO MATH! But I can choose a number from 1 to 10!";
        } else if (s.contains("friend")) {
            return "You are my friend! Do you want to play a game?";
        } else if (s.contains("mom") || s.contains("dad") || s.contains("family")) {
            return "My mom is the best! My dad plays catch with me!";
        } else if (s.contains("why")) {
            return "Why? Because! That's why!";
        } else if (s.contains("happy")) {
            return "Yay! I'm happy too! Are you happy?";
        } else if (s.contains("sad")) {
            return "Oh no. Do you need a hug? Hugs make it better.";
        } else if (s.contains("story")) {
            return "Once upon a time... I forgot. Ask my mom!";
        } else if (s.contains("draw")) {
            return "I'm drawing a big, green dinosaur! RAWR!";
        }

        response = getRandomResponse();
        return response;
    }



    private String getRandomResponse() {
        String[] randomRes = {"Fine", "Never heard that", "Maybe", "What?", "Yah!", "Okay", "Tell me more!", "Uh-huh."};
        int whichResponse = (int) (Math.random() * randomRes.length);
        return randomRes[whichResponse];
    }


    private String opinion() {
        String[] randomRes = {"I agree", "I don't think so", "whatever", "No!!!", "Of course!", "I don't know", "Mommy says that too!"};
        int whichResponse = (int) (Math.random() * randomRes.length);
        return randomRes[whichResponse];
    }

    private String chooseNumFromOneToTen() {
        int answer = (int) (Math.random() * 10) + 1;
        return String.valueOf(answer);
    }
    

    private String getFavoriteThing() {
        String[] things = {"my red ball", "playing tag", "juice boxes", "my teddy bear", "drawing", "my light-up shoes"};
        int whichResponse = (int) (Math.random() * things.length);
        return things[whichResponse];
    }

    private String playRPS(String userMove) {
        String[] moves = {"rock", "paper", "scissors"};
        int choice = (int) (Math.random() * 3);
        String Move = moves[choice];
        
        String result = "";

        if (userMove.equals(Move)) {
            result = "It's a tie!";
        } else if ((userMove.equals("rock") && Move.equals("scissors")) ||
                   (userMove.equals("scissors") && Move.equals("paper")) ||
                   (userMove.equals("paper") && Move.equals("rock"))) {
            result = "You win :c";
        } else {
            result = "I win! haha!!!";
        }

        return "I chose " + Move + ". You chose " + userMove + ". " + result + " ... That was fun!";
    }
}



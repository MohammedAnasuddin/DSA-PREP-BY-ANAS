package Strings;

import java.util.* ;
import java.io.*; 
public class Strings_encodedMessage {
    public static void main(String[] args) {
    // String message = "tY75QbV6LjN2FzG3W1nD4cS7XoR8lP0mK9uH6iA4qE2wM3xZvC1gB5yT7uI8eR4oL2pS9aF6jD8vC0nB4mX5nH3bV7cA1zF6wM9xK8jU7hI0lN3pO2qE9rT6yJ4gA1zH5tY8uU2kX3jD9cA4zE7oR1qW3sF8mV6bT7uN2cX0lQ4wM8yN9bV6lC3bX5kU4gN3hJ2kM5jB7vT8yG0iL2eN5vH7gW1qB4sF6kN8hY0nT7iM3pX9kZ2mQ4wC7xV1gT6hJ3iB9oX5cT2yV4bH6jN0qZ7wD9iM4nT8yG1aS3fG5hK7eB8jT1lY0wX2zB6cN8yM0lF7kN3qH6tJ2uY9kW5xT0rG9zF2eC3jM6vQ0cT5gY8xS7oL9bR1yU4wJ2qB8vM4cG3hY9xZ1mT3nB5kD6rV0zE8hW7iB3mQ4nH8vF6uT1cJ7xV9yM2nS5hT0uJ3mB6fY8oQ2gN4kF7xV1jC3nH6bT0zX8mS9bR1yV4kQ5gA2jD6bV3nC8xW0zH5fJ7mV4yQ0cX9jB5vR3kF6nV2hT8yG5cS2dF9hJ6zV0nX8mB7vW1kN4gT6yH3cS7xM9jK2uN5cB0wQ3gA7mV4hS1eQ5bJ3nT6vY8kF0zA1xW9kZ2jN6gT0mQ8fD3nV7cS6gQ0vF9zH2xW4yK8iF3lN9mZ0xV6kY3nT1gM5dJ8fA2yN6kW0uV8zX2jS4mB9cW5yE7nV2hJ1gT4oM0iY7xW4nH1qS9xV6kA3jD5gT8vW0zX2bY6kF3nC8xW4yK9iF0lN9mZ1xV7kY2nT1gM5dJ8fA2yN6kW0uV8zX2jS4mB9cW5yE7nV2hJ1gT4oM0iY7xW4nH1qS9xV6kA3jD5gT8vW0zX2bY6kF3nC8xW4yK9iF0lN9mZ1xV7kY2nT1gM5dJ8fA2yN6kW0uV8zX2jS4mB9cW5yE7nV2hJ1gT4oM0iY7xW4nH1qS9xV6kA3jD5gT8vW0zX2bY6kF3nC8xW4yK9iF0lN9mZ1xV7kY2nT1gM5dJ8fA2yN6kW0uV8zX2jS4mB9cW5yE7nV2hJ1gT4oM0iY7xW4nH1qS9xV6kA3jD5gT8vW0zX2bY6kF3nC8xW4yK9iF0lN9mZ1xV7kY2nT1gM5dJ8fA2yN6kW0uV8zX2jS4mB9cW5yE7nV2hJ1gT4oM0iY7xW4nH1qS9xV6kA3jD5gT8vW0zX2bY6kF3nC8xW4yK9iF0lN9mZ1xV7kY2nT1gM5dJ8fA2yN6kW0uV8zX2jS4mB9cW5yE7nV2hJ1gT4oM0iY7xW4nH1qS9xV6kA3jD5gT8vW0zX2bY6kF3nC8xW4yK9iF0lN9mZ1xV7kY2nT1gM5dJ8fA2yN6kW0uV8zX2jS4mB9cW5yE7nV2hJ1gT4oM0iY7xW4nH1qS9xV6kA3jD5gT8vW0zX2bY6kF3nC8xW4yK9iF0lN9mZ1xV7kY2nT1gM5dJ8fA2yN6kW0uV8zX2jS4mB9cW5yE7nV2hJ1gT4oM0iY7xW4nH1qS9xV6kA3jD5gT8vW0zX2bY6kF3nC8xW4yK9iF0lN9mZ";
    String message = "bbbb";         
    encode(message);

    
    }
	public static String encode(String message) {

        // use stringbuilder
        StringBuilder encodeMsg = new StringBuilder(100000);
        String charCount = " ";
        System.out.println("Message :"+message);
        System.out.println("Message Length:  "+message.length());
    
    
        int i, count=1;
        if(message.length()==1){
            
            System.out.println("Returning: "+message.charAt(0)+"1");
            return message.charAt(0)+"1";
        }
    
        for(i = 0;i<message.length();i++){ 
        System.out.println("------------------------");
        System.out.println("i ="+i);
    

    
        



        if(i<message.length()-1){
            System.out.println("Current element: "+message.charAt(i));
            System.out.println("Compare element: "+message.charAt(i+1));
            System.out.println( message.charAt(i+1)+" = "+message.charAt(i));

            if(message.charAt(i+1) == message.charAt(i) ){ 
            
                System.out.println("Both are equal incrementing count");
                count++;
                charCount = message.charAt(i)+String.valueOf(count);
                System.out.println("Current charCount: "+charCount);
                continue;

            
        }

        else{

        
            System.out.print("Differrent elemensts stoping the compare ");
            System.out.println("adding charCount to encodeMsg");
            charCount = message.charAt(i)+String.valueOf(count);
            encodeMsg.append(charCount);
            
            System.out.println("Enccoded Message: "+encodeMsg);
            count =1;
            continue;
        }

        }
        else{
            if(message.charAt(i) == message.charAt(i-1)){
                System.out.println("last Element hence comparing with previous element");
                charCount = message.charAt(i)+String.valueOf(count);
                encodeMsg.append(charCount);

            }
            else{
                charCount = message.charAt(i)+"1";
                encodeMsg.append(charCount);
                
                
            }
        }



            
            
            }
            
        



        //O(n^2)

        System.out.println("Returning: "+encodeMsg);

		return encodeMsg.toString();
	}
}
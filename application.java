class Main {

  public static void main(String[] args) {
    
    int first = 10;
    int second = 20;

    // add two numbers
    int sum = first + second;
    System.out.println(first + " + " + second + " = "  + sum);
  }
}

# code changes for the feature-101 by vivek

public class MultiplyTwoNumbers {

    public static void main(String[] args) {

        float first = 1.5f;
        float second = 2.0f;

        float product = first * second;

        System.out.println("The product is: " + product);
    }
}
# code changes for feature 102 by ethan on april 2024
var rpcClient = SolanaRpcClient.build()
    .testResponse((_, body) -> {
        final var json = new String(body);
        System.out.println(json); // The JSON string can be written to a file if large
        return true;
    })
    .createClient();

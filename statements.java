package numbers;

public interface statements {
    String welcome = "Welcome to Amazing Numbers!";
    String instruction =
            "Supported requests:\n" +
                    "- enter a natural number to know its properties;\n" +
                    "- enter two natural numbers to obtain the properties of the list:\n" +
                    "  * the first parameter represents a starting number;\n" +
                    "  * the second parameters show how many consecutive numbers are to be processed;\n" +
                    "- two natural numbers and properties to search for;\n" +
                    "- a property preceded by minus must not be present in numbers;\n" +
                    "- separate the parameters with one space;\n" +
                    "- enter 0 to exit.\n";
    String firstParError = "The first parameter should be a natural number or zero\n";
    String secondParError = "The second parameter should be a natural number\n";
    String availableProperties ="Available properties: \n[EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, HAPPY, SAD]";
    String exclusiveProperties = "[-EVEN, -ODD, -BUZZ, -DUCK, -PALINDROMIC, -GAPFUL, -SPY, -SQUARE, -SUNNY, -JUMPING, -HAPPY, -SAD]";
    String mutuallyProperties1 = "The request contains mutually exclusive properties [ODD, EVEN]";
    String mutuallyProperties2 = "The request contains mutually exclusive properties [SUNNY, SQUARE]";
    String mutuallyProperties3 = "The request contains mutually exclusive properties [SPY, DUCK]";
    String mutuallyProperties4 = "The request contains mutually exclusive properties [HAPPY, SAD]";
    String mutuallyExclusiveProperties1 = "The request contains mutually exclusive properties [-ODD, ODD]";
    String mutuallyExclusiveProperties2 = "The request contains mutually exclusive properties [-EVEN, EVEN]";
    String mutuallyExclusiveProperties3 = "The request contains mutually exclusive properties [-BUZZ, BUZZ]";
    String mutuallyExclusiveProperties4 = "The request contains mutually exclusive properties [-DUCK, DUCK]";
    String mutuallyExclusiveProperties5 = "The request contains mutually exclusive properties [-PALINDROMIC, PALINDROMIC]";
    String mutuallyExclusiveProperties6 = "The request contains mutually exclusive properties [-GAPFUL, GAPFUL]";
    String mutuallyExclusiveProperties7 = "The request contains mutually exclusive properties [-SPY, SPY]";
    String mutuallyExclusiveProperties8 = "The request contains mutually exclusive properties [-SQUARE, SQUARE]";
    String mutuallyExclusiveProperties9 = "The request contains mutually exclusive properties [-SUNNY, SUNNY]";
    String mutuallyExclusiveProperties10 = "The request contains mutually exclusive properties [-JUMPING, JUMPING]";
    String mutuallyExclusiveProperties11 = "The request contains mutually exclusive properties [-HAPPY, HAPPY]";
    String mutuallyExclusiveProperties12 = "The request contains mutually exclusive properties [-SAD, SAD]";
    String mutuallyProperties5 = "The request contains mutually exclusive properties [-ODD, -EVEN]";
    String mutuallyProperties6 = "The request contains mutually exclusive properties [-SUNNY, -SQUARE]";
    String mutuallyProperties7 = "The request contains mutually exclusive properties [-SPY, -DUCK]";
    String mutuallyProperties8 = "The request contains mutually exclusive properties [-HAPPY, -SAD]";

}

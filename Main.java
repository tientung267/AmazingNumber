package numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main implements statements{
    public void check() {
        Scanner scanner = new Scanner(System.in);
        propertiesCheck prop = new propertiesCheck();
        System.out.println(welcome + "\n" + "\n");
        System.out.println(instruction);
        boolean turn = true;

        while (turn) {
            System.out.print("Enter a request: ");
            String input = scanner.nextLine();
            String[] inputs = input.split("\\s+");
            if (inputs[0].equals("0")) {
                System.out.print("Goodbye!");
                turn = false;
            } else if (Long.parseLong(inputs[0]) < 0) {
                System.out.println(firstParError);
            } else if (inputs.length == 1) {
                try {
                    prop.properties(Long.parseLong(inputs[0]));
                } catch (Exception e) {
                    System.out.println(firstParError);
                }
            } else if (inputs.length == 2) {
                try {
                    long secondPar = Long.parseLong(inputs[1]);
                    if (secondPar > 0) {
                        for (long i = 0; i < secondPar; i++) {
                            System.out.println(prop.propWithPars((Long.parseLong(inputs[0]) + i)));
                        }
                    } else {
                        System.out.println(secondParError);
                    }
                } catch (Exception e) {
                    System.out.println(secondParError);
                }
            }  else {
                try {
                    long secondPar = Long.parseLong(inputs[1]);
                    if (secondPar > 0) {
                        if (illegaleProperties(inputs)){ // Überprüfen, ob es illegale Eingenschaften gibt.

                        } else {

                            if (exclusiveProperties(inputs)) { //Überprüfen exklusive Eigenschaften

                            } else {
                                checkProp(inputs, prop);
                            }
                        }
                    } else {
                        System.out.println(secondParError);
                    }
                } catch (Exception e) {
                    System.out.println(secondParError);
                }
            }
        }
    }

    public void checkProp (String[] inputs, propertiesCheck prop) {

        String property;

        ArrayList<String> neededProperties = new ArrayList<>();
        ArrayList<String> noNeededProperties = new ArrayList<>();
        try {
            long secondPar = Long.parseLong(inputs[1]);
            if (secondPar > 0) {
                int counter = 0;

                //Sortiere Properties mit Minus und ohne Minus in Input
                for (int j = 2; j < inputs.length; j++) {
                    if (inputs[j].contains("-")) {
                        noNeededProperties.add(inputs[j]);
                    } else {
                        neededProperties.add(inputs[j]);
                    }
                }

                for (long i = 0;; i++) {
                    int matchedProperty = 0;
                    int exclusiveProperty = 0;
                    property = prop.propWithPars(Long.parseLong(inputs[0]) + i);

                    // überprüfen, ob eine Zahl genügende matchedProperty hat und ob illegale Eigenschaften in Eingaben vorliegt.
                    for (int j = 0; j < neededProperties.size(); j++) {
                        if (property.contains(neededProperties.get(j).toLowerCase())) {
                            matchedProperty++;
                        }
                    }

                    // überprüfen, ob eine Zahl keine ausgeschlossene Eigenschaften hat (exclusive Property)
                    for (int j = 0; j < noNeededProperties.size(); j++) {
                        if (noNeededProperties.isEmpty()) {
                            exclusiveProperty = 0;
                        }
                        else if (property.contains(noNeededProperties.get(j).toLowerCase().replaceAll("-",""))) {
                            exclusiveProperty++;
                        }
                    }

                    if (matchedProperty == neededProperties.size() && exclusiveProperty == 0) {
                        System.out.println(prop.propWithPars(Long.parseLong(inputs[0]) + i));
                        counter++;
                    }

                    if (counter == secondPar) {
                        break;
                    }
                }
            } else {
                System.out.println(this.secondParError);
            }
        } catch (Exception e) {
            System.out.println(this.secondParError);
        }
    }

    public boolean illegaleProperties (String[] inputs) {
        int check = 0;
        String wrongProperty = "";
        // Überprüfen ungültige Eigenschaften
        for (int j = 2; j < inputs.length; j++) {
            if (!availableProperties.contains(inputs[j].toUpperCase().replaceAll("-", ""))
                    || !exclusiveProperties.contains(inputs[j].toUpperCase())) {
                check++;
                if (wrongProperty.equals("")) {
                    wrongProperty = wrongProperty + inputs[j];
                } else {
                    wrongProperty += ", " + inputs[j];
                }
            }
        }
        if (check > 0) {
            if (check == 1) {
                System.out.println("The property [" + wrongProperty.replaceAll(", ","").toUpperCase() + "] is wrong.");
            } else {
                System.out.println("The Properties [" + wrongProperty +"] are wrong");
            }
            System.out.println(availableProperties);
            return true;
        }
        return false;
    }

    public boolean exclusiveProperties (String[] inputs) {
        ArrayList<String> inputsAL = new ArrayList<>();
        inputsAL.addAll(Arrays.asList(inputs).subList(2, inputs.length));
        for (int i = 0; i < inputsAL.size(); i++) {
            if (inputsAL.contains("odd") && inputsAL.contains("even")) {
                System.out.println(mutuallyProperties1);
                return true;
            }
            if (inputsAL.contains("duck") && inputsAL.contains("spy")) {
                System.out.println(mutuallyProperties2);
                return true;
            }
            if (inputsAL.contains("sunny") && inputsAL.contains("square")) {
                System.out.println(mutuallyProperties3);
                return true;
            }
            if (inputsAL.contains("happy") && inputsAL.contains("sad")) {
                System.out.println(mutuallyProperties4);
                return true;
            }
            if (inputsAL.contains("odd") && inputsAL.contains("-odd")) {
                System.out.println(mutuallyExclusiveProperties1);
                return true;
            }
            if (inputsAL.contains("duck") && inputsAL.contains("-duck")) {
                System.out.println(mutuallyExclusiveProperties4);
                return true;
            }
            if (inputsAL.contains("square") && inputsAL.contains("-square")) {
                System.out.println(mutuallyExclusiveProperties8);
                return true;
            }
            if (inputsAL.contains("happy") && inputsAL.contains("-happy")) {
                System.out.println(mutuallyExclusiveProperties11);
                return true;
            }
            if (inputsAL.contains("-even") && inputsAL.contains("even")) {
                System.out.println(mutuallyExclusiveProperties2);
                return true;
            }
            if (inputsAL.contains("-spy") && inputsAL.contains("spy")) {
                System.out.println(mutuallyExclusiveProperties7);
                return true;
            }
            if (inputsAL.contains("sunny") && inputsAL.contains("-sunny")) {
                System.out.println(mutuallyExclusiveProperties9);
                return true;
            }
            if (inputsAL.contains("-sad") && inputsAL.contains("sad")) {
                System.out.println(mutuallyExclusiveProperties12);
                return true;
            }
            if (inputsAL.contains("-buzz") && inputsAL.contains("buzz")) {
                System.out.println(mutuallyExclusiveProperties3);
                return true;
            }
            if (inputsAL.contains("-palindromic") && inputsAL.contains("palindromic")) {
                System.out.println(mutuallyExclusiveProperties5);
                return true;
            }
            if (inputsAL.contains("-gapful") && inputsAL.contains("gapful")) {
                System.out.println(mutuallyExclusiveProperties6);
                return true;
            }
            if (inputsAL.contains("-jumping") && inputsAL.contains("jumping")) {
                System.out.println(mutuallyExclusiveProperties10);
                return true;
            }
            if (inputsAL.contains("-odd") && inputsAL.contains("-even")) {
                System.out.println(mutuallyProperties5);
                return true;
            }
            if (inputsAL.contains("-sunny") && inputsAL.contains("-square")) {
                System.out.println(mutuallyProperties6);
                return true;
            }
            if (inputsAL.contains("-spy") && inputsAL.contains("-duck")) {
                System.out.println(mutuallyProperties7);
                return true;
            }
            if (inputsAL.contains("-happy") && inputsAL.contains("-sad")) {
                System.out.println(mutuallyProperties8);
                return true;
            }

        }
        return false;
    }

}

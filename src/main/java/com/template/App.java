package com.template;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {

    // 1. Sum of Two Integers
    public int sum(int a, int b) {
        int resultado = a + b;
        return resultado;
    }

    // 2. Check Even or Odd
    public boolean isEven(int number) {

        return number % 2 == 0;
    }

    // 3. Maximum of Two Numbers
    public int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // 4. Factorial of a Number
    public int factorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // 5. Count Characters in a String
    public int countChars(String input) {
        if (input == null) return 0;

        int count = 0;
        for (int i = 0; i < input.length(); i++) {

            char c = input.charAt(i);
            count++;
        }
        return count;
    }


    // 6. Reverse a String
    public String reverse(String input) {
        if (input == null) return "";
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }
        return reversed;
    }


    // 7. Check Prime Number
    public boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2 || number == 3) return true;
        if (number % 2 == 0) return false;


        for (int i = 3; i <= number / i; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


    // 8. Find the Smallest Element in an Array
    public int findMin(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("array must not be null/empty");
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    // 9. Sum of Elements in an Array
    public int arraySum(int[] array) {
        if (array == null || array.length == 0) return 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    // 10. Convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        double v = celsius * 9.0 / 5.0 + 32.0;
        return v;
    }

    // 11. Sum of Elements in a List
    public int sumList(List<Integer> list) {
        // TODO: Implement this method
        return 0;
    }

    // 12. Find the Largest Element in a List
    public int findMax(List<Integer> list) {
        // TODO: Implement this method
        return 0;
    }

    // 13. Filter Even Numbers from a List
    public List<Integer> filterEvenNumbers(List<Integer> list) {
        // TODO: Implement this method
        return new ArrayList<>();
    }

    // 14. Concatenate Two Lists
    public List<String> concatenateLists(List<String> list1, List<String> list2) {
        // TODO: Implement this method
        return new ArrayList<>();
    }

    // 15. Check if List Contains Element
    public boolean listContains(List<String> list, String element) {
        // TODO: Implement this method
        return false;
    }

    // 16. Convert Strings to Uppercase
    public List<String> toUpperCase(List<String> list) {
        // TODO: Implement this method
        return new ArrayList<>();
    }

    // 17. Remove Duplicates from a List
    public List<Integer> removeDuplicates(List<Integer> list) {
        // TODO: Implement this method
        return new ArrayList<>();
    }

    // 18. Convert List to Set for Unique Elements
    public Set<Integer> listToSet(List<Integer> list) {
        // TODO: Implement this method
        return new HashSet<>();
    }

    // 19. Check if Map Contains Key
    public boolean mapContainsKey(Map<String, String> map, String key) {
        // TODO: Implement this method
        return false;
    }

    // 20. Check if Map Contains Value
    public boolean mapContainsValue(Map<String, String> map, String value) {
        // TODO: Implement this method
        return false;
    }

    // 21. Iterate Over a Map
    public List<String> iterateMap(Map<String, String> map) {
        // TODO: Implement this method
        return new ArrayList<>();
    }
}

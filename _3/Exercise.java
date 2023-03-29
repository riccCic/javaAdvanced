package javaOopAdvanced._3;

import java.util.*;

import static java.util.stream.Collectors.toSet;

public class Exercise {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }


    /**
     * 1: Complete the function that removes any duplicates by using a set
     * then recreates a new list of unique items
     * <p>
     * You can reset a list by using list = new ArrayList<>();
     */
    private static void exercise1() {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "a", "b", "c", "a", "b", "c"));

        // Your code here
        Set<String> set = new HashSet<>();
        set.addAll(list);
        list = new ArrayList<>();
        list.addAll(set);

        if (list.size() == 3) {
            System.out.println("Exercise 1: Success");
        } else {
            System.out.println("Exercise 1: Failed");
        }
    }

    /**
     * 2: Write a method that takes a List of Strings or a Set of Strings and returns a Set of Strings.
     * the method should take a collection as a parameter
     */
    private static void exercise2() {
        // Your code here
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "kiwi", "banana");
        Set<String> set = Set.of("apple", "banana");
        Set<String> set1 = toSet(list);  // <-- uncomment
        Set<String> set2 = toSet(set);   //<-- uncomment
    }

    // Write your method for exercise 2 here
    public static Set<String> toSet(Collection<String> collection) {
        return new HashSet<>(collection);
    }

    /**
     * 3: Follow the instructions in the comments
     */
    private static void exercise3() {
        String str = "the fox and the lazy dog saw another fox with another not lazy dog";
        List<String> words = Arrays.stream(str.split(" ")).toList();
        Map<String, Integer> wordCount = new HashMap<>();

        // Write code to count the number of occurrences of each word in the String `words`
        // and store the counts in the Map `wordCount`, note you will need to first get the previous value
        // from the Map and then increment it by 1, if no previous value exists, use 0 as the previous value.

        // Your code here
        for (String word : words) {
            Integer count = wordCount.get(word);
            if (count == null) {
                wordCount.put(word, 1);
            } else {
                wordCount.put(word, count + 1);
            }
        }

        System.out.println("Parola conta: " + wordCount);
    }


        }


    /**
     * 4: Answer the following questions
     *
     *    What is the best data structure to use in the following scenarios, chose either a List, Set or Map
     *    and explain why you chose that data structure.
     *
     *    1 - You want to store the students in order of their arrival
     *    Answer: linkedList cosi gli studenti, possono essere concatenati tra loro, e quindi avere una successione
     *
     *    2 - You want to store the students in a class and their grades
     *    Answer: hashMap così possiamo vedere sia la key, che sarebbe lo studente, e sia il value, che sarebbe il voto
     *
     *    3 - You want to store the countries in the world in order of age
     *    Answer: treeMap cosi mettendo il value come età, me li ordina in base all età minore e così via
     *
     *    4 - You want to store the products available for purchase in an online store, along with their corresponding prices.
     *    Answer: hashmap, non abbaimo bisogno di un ordine, ma cosi, possiamo risalire subito al valore del prodotto
     *
     *    5 - You want to store the employees at a company in the order you added them
     *    Answer:un arreyList o anche una linkedLIst(che sarebbe più precisa, forse), così con l indice, possiamo andare a vedere chi è arrivato per primo, e via dicendo
     *
     *    6 - You want to store the cities in a particular state, along with their populations.
     *    Answer: un hashMap cosi puoi aggiungere il valore della popolazione, forse anche un hashSet perchè le città sono uniche
     *
     *    7 - You want to store the books in a library, along with their authors and publication dates.
     *    Answer:un hashMap, cosi li puoi dare string  e puoi creare un oggetto chiamato libro, e puoi mettere tutto le specifiche che vuoi  nell oggetto libro
     *
     *    8 - You want to store the courses offered at a university, along with the professors teaching each course.
     *    Answer:hashSet, perche i nomi dei corsi sono unici, e poi come secondo parametro, anche se dovesse avere gli stessi professori, non fa niente
     *
     *    9 - You want to store the movies in a movie rental store, along with their ratings and release dates.
     *    Answer:hashMap, o un hashSet, però sarebbe più indicato un hash map
     *
     *    10 - You want to store the flights available for booking on an airline, along with their destinations and departure times.
     *    Answer:treeMap
     *
     *    11 - You want to store the articles on a news website, along with their titles and publication dates.
     *    Answer: treeMap
     *
     *    12 - You want to store the songs in a music streaming service, along with their artists and album names.
     *    Answer:hash Map
     */





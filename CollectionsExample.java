// before java JDK 1.2

import java.util.*;
import java.util.Map.Entry;

class CollectionsExample {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4, 5 };
        Vector<Integer> v = new Vector<>();
        Hashtable<Integer, String> h = new Hashtable<>();

        // adding elements into the vector
        v.add(5);
        v.add(13);

        // Adding elements into hashtables
        h.put(1, "Arunkumar");
        h.put(2, "karthikeyan");

        // Accessing through the index
        System.out.println(arr[1]);
        System.out.println(arr[3]);
        // System.out.println(arr[4]); // Throws an error indexOutOfBoundExc

        System.out.println(v.get(0));
        System.out.println(v.get(1));
        // System.out.println(v.get(10)); // Throws an error indexOutOfBoundException

        System.out.println(h.get(1));
        System.out.println(h.get(2));
        System.out.println(h.get(5)); // provide null value while accessing the data which is no in return null

    }
}

// ArrayList collections

class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<>();

        products.add("laptop");
        products.add("One plus mobile");
        products.add("iphone");
        products.add("neckband");

        System.out.println("All products : " + products);

        System.out.println(products.get(0));

        products.remove("iphone");

        System.out.println("After removing products : " + products);

        System.out.println(products.size());

        products.add(1, "washing machine");

        System.out.println(products.contains("AC"));
        System.out.println(products.contains("laptop"));

        System.out.println(products.indexOf("neckband"));
    }
}

// LinkedList Example
class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> cartoons = new LinkedList<>();

        cartoons.add("Doraemon");
        cartoons.add("Tom and Jerry");
        cartoons.add("Chotta bheem");
        cartoons.add("Might raju");

        System.out.println("cartoons : " + cartoons);
        cartoons.add("Jackie chan");
        // Just adding
        System.out.println("cartoons : " + cartoons);

        cartoons.addFirst("courage");
        cartoons.addLast("Jee bhoom boy");

        System.out.println(cartoons.remove("Tom jerry")); // is not there
        cartoons.remove("Tom and Jerry");

        System.out.println("cartoons : " + cartoons);

        // cartoons.
        System.out.println(cartoons.indexOf("Chotta bheem"));

        System.out.println(cartoons.get(2));

        System.out.println(cartoons.contains("Dora"));
    }
}

// Hashset Examples => elements are unordered

class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> numbers = new HashSet<>();

        numbers.add("one");
        numbers.add("two");
        numbers.add("three");
        numbers.add("four");
        numbers.add("five");
        numbers.add("six");

        // Adding duplicates
        numbers.add("two");
        numbers.add("one");

        for (String num : numbers) {
            System.out.println("num : " + num);
        }

        System.out.println("looping using iterator : ");
        Iterator<String> itr = numbers.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}

// How hashSet stores values in arraybucket based on the index

class HowHashSetStoresValueBasedOnIndex {
    public static void main(String[] args) {

        String s = "Hello";
        String name = "arun";
        String name1 = "kumar";
        String name2 = "arun";

        int hash = s.hashCode();
        int hash1 = name.hashCode();
        int hash2 = name1.hashCode();
        int hash3 = name2.hashCode();

        System.out.println(hash); // 60609650
        System.out.println(hash1); // 3003018
        System.out.println(hash2); // 102410164
        System.out.println(hash3); // 3003018

        int n = 16; // default capacity of hashMap

        int bucketIndex = (n - 1) & hash;
        int bucketIndex1 = (n - 1) & hash1;
        int bucketIndex2 = (n - 1) & hash2;
        int bucketIndex3 = (n - 1) & hash3;

        System.out.println(bucketIndex); // 2
        System.out.println(bucketIndex1); // 10
        System.out.println(bucketIndex2); // 4
        System.out.println(bucketIndex3); // 10

    }
}

// LinkedHashset Examples => elements are unordered

class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> alphabets = new LinkedHashSet<>();

        alphabets.add("A");
        alphabets.add("B");
        alphabets.add("C");
        alphabets.add("D");
        alphabets.add("E");

        // Adding duplicates
        alphabets.add("E");
        alphabets.add("B");

        alphabets.remove("C");

        System.out.println("Alphabets : " + alphabets);

        for (String alpha : alphabets) {
            System.out.println("alpha : " + alpha);
        }

    }
}

// TreeSet

class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Tablet");
        set.add("Smartphone");
        set.add("Smartphone");
        set.add("Laptop");
        set.add("Apple");

        System.out.println(set); // Elements will print in sorted Order
    }
}

// HashMap

class HashMapExample {
    public static void main(String[] args) {
        Map<String, String> stateCapitals = new HashMap<>();

        stateCapitals.put("Maharashtra", "Mumbai");
        stateCapitals.put("Karnataka", "Bengaluru");
        stateCapitals.put("Tamil Nadu", "Chennai");
        stateCapitals.put("Uttar Pradesh", "Lucknow");
        stateCapitals.put("West bengal", "Kolkata");

        // System.out.println(stateCapitals);

        for (Map.Entry<String, String> entry : stateCapitals.entrySet()) {
            System.out.println("State : " + entry.getKey() + ", captial : " + entry.getValue());
        }

    }
}

// SynchronizedExample

class SynchronizedListExample {
    public static void main(String[] args) {
        List<String> electronicList = new ArrayList<>();

        List<String> synchronizedElecronicsList = Collections.synchronizedList(electronicList);
        synchronizedElecronicsList.add("Laptop");
        synchronizedElecronicsList.add("Smartphone");
        synchronizedElecronicsList.add("Tablet");

        System.out.println("Synchronized List : " + synchronizedElecronicsList);

        synchronized (synchronizedElecronicsList) {
            for (String item : synchronizedElecronicsList) {
                System.out.println("list item : " + item);
            }
        }
    }
}

class UnmodifiableSetExample {
    public static void main(String[] args) {
        Set<String> elecronicsSet = new HashSet<>();

        elecronicsSet.add("Laptop");
        elecronicsSet.add("Smartphone");
        elecronicsSet.add("Tablet");

        Set<String> unmodifiableElectronicsSet = Collections.unmodifiableSet(elecronicsSet);

        // elecronicsSet.add("apple");
        // unmodifiableElectronicsSet.add("Smartwatch"); // throws an error

        System.out.println(elecronicsSet);
        System.out.println(unmodifiableElectronicsSet);

    }
}
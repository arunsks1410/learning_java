import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class StreamApiExample {

        public void testSequentialStream() {
                IntStream.rangeClosed(1, 1_000_000)
                                .map(i -> i * 2)
                                .sum();
        }

        public void testParallelStream() {
                IntStream.rangeClosed(1, 1_000_000)
                                .parallel()
                                .map(i -> i * 2)
                                .sum();
        }

        public static void main(String[] args) {

                List<Integer> numbers = Arrays.asList(2, 5, 1, 2, 4, 6, 7, 8, 9);

                numbers.stream().filter(n -> n % 2 == 0).map(n -> n * 10)
                                .forEach(n -> System.out.println(n));

                List<String> items = Arrays.asList("kodewala", "Academy", "Bangalore");

                // Creating Stream from the list
                Stream<String> stream = items.stream();
                System.out.println("using forEach to loop >>>>> ");
                items.forEach(item -> System.out.println(item));

                System.out.println("using stream API to loop");
                stream.forEach(item -> System.out.println(item));

                // parallel Stream
                System.out.println("-------- paralled stream ---------");
                List<String> fruits = Arrays.asList("Apple", "banana", "muskmelon", "lemon", "cherry");

                List<String> result = fruits.stream().filter(fruit -> fruit.length() > 5)
                                .map(fruit -> fruit.toUpperCase())
                                .sorted().collect(Collectors.toList());

                result.forEach((res) -> System.out.println(res));

                System.out.println("parallel processing.... ");

                fruits.parallelStream()
                                .forEach(item -> System.out.println(Thread.currentThread()
                                                .getName() + "-" + item));

                // System.out.println("result : " + result);

                System.out.println(ForkJoinPool.commonPool().getParallelism());

                // Terminal operation

                List<String> cityNames = Arrays.asList("Bangalore", "Chennai", "Delhi", "Hyderabad");

                List<String> output = cityNames.stream()
                                .filter(name -> name.startsWith("B")).map(name -> name.toUpperCase())
                                .collect(Collectors.toList());

                List<Integer> numericalValues = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
                System.out.println("output : " + output);

                // Filtering method

                Stream<Integer> res = numericalValues.stream().filter(num -> num % 3 == 0);

                res.forEach(num -> System.out.println(num));

                // Map Method

                List<String> animals = Arrays.asList("Dog", "Cat", "Elephant", "Camel", "zebra");

                Stream<String> animalResult = animals.stream()
                                .map(animal -> animal.toUpperCase());

                animalResult.forEach((animal) -> System.out.println(animal));

                // distinct

                List<String> stringList = Arrays.asList("one", "two", "three", "four", "two", "three");

                // List<String> op = stringList.stream()
                // .distinct().collect(Collectors.toList());
                // System.out.println("op : " + op);

                Stream<String> op = stringList.stream()
                                .distinct();

                op.forEach((num) -> System.out.println(num));

                // System.out.println("op : " + op);

                // limit
                System.out.println("---- limit ----");
                stringList.stream().limit(2).forEach((num) -> System.out.println(num));

                // peek
                System.out.println("------------ peek ------------- ");

                List<String> peakList = Arrays.asList("abc", "def", "ghi", "klm");

                Stream<String> peeked = peakList.stream().peek(value -> System.out.println("peeking : " + value));
                peeked.forEach((ele) -> System.out.println("final : " + ele));

                // Sorting
                System.out.println("------ Sort ------ ");
                List<String> list = Arrays.asList("cba", "caa", "aaa", "abc", "bac", "bba");
                System.out.println(list.stream().sorted());
                // Stream<String> listRes =
                List<String> sortedString = list.stream().sorted()
                                .collect(Collectors.toList());

                System.out.println("sorted String : " + sortedString);
                // list.stream().sorted()
                // .forEach(val -> System.out.println(val));

                // Custom sorting
                List<String> doubleDigitNumbers = Arrays.asList("eleven", "twelve", "Thirdteen", "fourteen", "sixteen",
                                "seventeeen", "eighteen");
                doubleDigitNumbers.stream().sorted((s1, s2) -> s1.length() - s2.length())
                                .forEach((val) -> System.out.println(val));

                // skip
                System.out.println("---------- skipping method -------- ");
                doubleDigitNumbers.stream().skip(2).forEach(num -> System.out.println(num));

                System.out.println("--------- Terminal operation --------- ");

                // Terminal Operations
                List<String> countries = Arrays.asList("India", "Indonesia", "Srilanka", "Dubai", "Malasiya",
                                "Singapore",
                                "Cuba");

                long count = countries.stream().filter(country -> country
                                .startsWith("I")).count();

                System.out.println("countires starts with I : " + count);

                // forEach
                System.out.println(" ----   For each   ----");
                List<String> names = Arrays.asList("Arun", "karan", "karthi", "bala");
                names.stream().forEach((name) -> System.out.println(name));

                // toArray
                List<String> vehicles = Arrays.asList("bike", "car", "bus", "train");
                String[] vechihleArray = vehicles.stream()
                                .toArray(size -> new String[size]);
                System.out.println("vehicle Array : " + Arrays.toString(vechihleArray));
                // vechihleArray.add("helooo");
                // cannot add because toArray will return the
                // size of fixed array

                // reduce
                int sum = Arrays.asList(1, 2, 3, 4, 5).stream().reduce(0, (a, b) -> a + b);
                System.out.println("sum : " + sum);

                // collect

                List<String> locations = Arrays.asList("Bangalore", "BTM", "Kodewala");
                List<String> upperCaseNames = locations.stream()
                                .map((place) -> place.toUpperCase())
                                .collect(Collectors.toList());
                System.out.println("upperCaseNames  : " + upperCaseNames);

                // min
                int minValue = Arrays.asList(5, 56, 78, 9989, 1, 34)
                                .stream().min((a, b) -> a - b).get();
                System.out.println("Min value : " + minValue);

                // max
                int maxValue = Arrays.asList(5, 56, 78, 9989, 1, 34)
                                .stream().max((a, b) -> a - b).get();
                System.out.println("Max value : " + maxValue);

                // count
                long numbersCount = Arrays.asList(5, 56, 78, 9989, 1, 34)
                                .stream().count();
                System.out.println("numbersCount : " + numbersCount);

                // Lazy operations in java Streams
                List<String> districts = Arrays.asList("Chennai", "Coimbatore", "Salem", "Rameshwaram", "Madurai",
                                "Sivagangai");

                districts.stream().filter((district) -> {
                        System.out.println("inside filter ---- ");
                        System.out.println(district);
                        return district.startsWith("C");
                }).map((district) -> {
                        System.out.println("inside map :------ ");
                        System.out.println(district);
                        return district.toUpperCase();
                }).forEach((district) -> {
                        System.out.println("inside forEach >>>> ");
                        System.out.println("district : " + district);
                });

                // Collectors Methods

                // toList()
                List<Integer> streamToList = Stream.of(1, 2, 3, 45, 67, 453, 231)
                                .collect(Collectors.toList());
                System.out.println("Stream to list : " + streamToList);

                // toSet()
                Set<String> streamToSet = Stream.of("red", "black", "brown", "grey", "yellow", "orange", "red",
                                "brown").collect(Collectors.toSet());

                System.out.println("streamToSet : " + streamToSet);

                // toCollection()
                System.out.println("---- toCOllections ----- ");
                LinkedList<String> streamToLinkedList = Stream.of("A", "B", "C")
                                .collect(Collectors
                                                .toCollection(() -> new LinkedList<>()));

                System.out.println("StreamToLinkedList : " + streamToLinkedList);

                // joining
                String streamToJoinedString = Stream.of("Dog", "cats")
                                .collect(Collectors.joining(", "));

                System.out.println("streamToJoinedString : " + streamToJoinedString);

                // Counting

                long totalCount = Stream.of("a", "b", "c").collect(Collectors.counting());
                System.out.println("totalCount : " + totalCount);

                // GroupinBY
                Map<Integer, List<String>> groupingBy = Stream
                                .of("one", "two", "three", "four", "six", "seven", "eight")
                                .collect(Collectors.groupingBy(num -> num.length()));

                System.out.println("Grouping By : " + groupingBy);

                // PartioningBy

                Map<Boolean, List<Integer>> partitioned = Stream.of(1, 2, 3, 4, 5)
                                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

                System.out.println("partitioned : " + partitioned);

                // Interview questions programs

                // 1. Find the second highest number in a list

                List<Integer> numArray = Arrays.asList(10, 20, 30, 40, 50, 30);
                Optional<Integer> secondMax = numArray.stream()
                                .sorted((a, b) -> b - a).skip(1).findFirst();

                System.out.println("second max : " + secondMax);

                Integer thridMax = numArray.stream()
                                .sorted(Comparator.reverseOrder())
                                .skip(20).findFirst().orElse(-1);
                System.out.println("third max : " + thridMax);

                Optional<Integer> fourthMax = numArray.stream()
                                .sorted((a, b) -> b - a).skip(30).findFirst().map(x -> x + 10);

                System.out.println("fourthMax : " + fourthMax);

                // 2. Count the frequency of each character

                String input = "banana";

                Map<Character, Long> freq = input.chars().mapToObj(ch -> (char) ch)
                                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

                System.out.println("frequency : " + freq);

                // 3. Find all duplicate elements in a list
                List<Integer> nums = Arrays.asList(1, 2, 3, 2, 4, 5, 1);
                Set<Integer> duplicates = nums.stream()
                                .filter(n -> Collections.frequency(nums, n) > 1)
                                .collect(Collectors.toSet());
                System.out.println("duplicates : " + duplicates);

                // 4. Reverse each word in a sentence
                String sentence = "kodewala is Java Training Academy";

                String resultOfSentence = Arrays.stream(sentence.split(" "))
                                .map(word -> new StringBuilder(word)
                                                .reverse().toString())
                                .collect(Collectors.joining(sentence));

                System.out.println("resultOfSentence : " + resultOfSentence);

                // 5. Find the longest string in a list
                List<String> words = Arrays.asList("cat", "elephant", "tiger", "hippopotamus");
                String longest = words.stream().max(Comparator.comparingInt(String::length)).orElse("");

                System.out.println("longest : " + longest);

                // 6. Sort a list of strings by length

                List<String> words1 = Arrays.asList("banana", "apple", "kiwi", "grape");
                words1.stream().sorted(Comparator.comparingInt(w -> w.length()))
                                .forEach(word -> System.out.println(word));

                // 7. Merge two lists and remove duplicates
                List<Integer> list1 = Arrays.asList(1, 2, 3);
                List<Integer> list2 = Arrays.asList(3, 4, 5);

                List<Integer> merged = Stream.concat(list1.stream(),
                                list2.stream()).distinct()
                                .collect(Collectors.toList());

                System.out.println("merged : " + merged);

                // 8. Find first non-repeated character in a string

                String input1 = "HelloH";
                Character firstNonRepeat = input.chars().mapToObj(c -> (char) c)
                                .filter(ch -> input1.indexOf(ch) == input1.lastIndexOf(ch))
                                .findFirst().orElse(null);

                System.out.println("first Non Repeating : " + firstNonRepeat);

                // 9. Group String by their length

                List<String> words2 = Arrays.asList("one", "two", "five", "four", "six", "seven");
                Map<Integer, List<String>> grouped = words2.stream()
                                .collect(Collectors.groupingBy(s -> s.length()));

                System.out.println("grouped : " + grouped);

                // 10. Find the sum of squares of even numbers
                List<Integer> nums1 = Arrays.asList(1, 2, 3, 4, 5);
                int sum1 = nums1.stream().filter(n -> n % 2 == 0)
                                .mapToInt(n -> n * n).sum();

                System.out.println("Sum of squares of even numbers : " + sum1);

                // Parallel processing
                System.out.println("---- paralled processing ---- ");
                List<String> houseHoldThings = Arrays.asList("Furniture", "Tv", "PC", "WashingMachine", "Fridge",
                                "Table");
                System.out.println(houseHoldThings.parallelStream().findFirst().get());
                System.out.println(houseHoldThings.parallelStream().findAny().get());

                // Stream.generate vs stream.iterate
                System.out.println("Stream generate ");

                Stream.generate(() -> Math.random())
                                .limit(5).forEach(i -> System.out.println(i));

                // stream generate doesn't depends on previous one

                System.out.println("Stream iterate ");

                // stream iterate depends on previous one

                Stream.iterate(555, n -> n * 10).limit(5)
                                .forEach(i -> System.out.println(i));

                // handling exceptions in streams
                System.out.println("------ Handling exception in streams ---- ");
                Stream.of(1, 2, "one", 45.67).forEach(v -> {
                        try {
                                System.out.println(v);
                        } catch (Exception e) {
                                System.out.println("inside cach : " + e);
                        }
                });

                // List<Object> diffTypesVal = Arrays.asList("one", 1, " tow", true);

                // Stream.of(1,2).map(v -> System.out.println(v));

                List<Integer> nums3 = Arrays.asList(9, 3, 7, 1, 5);

                nums3.parallelStream()
                                .sorted()
                                .forEach(System.out::println);

                // Example for short circuiting in streams
                System.out.println("------ short circuit example ----- ");

                List<Integer> numberss = List.of(1, 2, 3, 4, 5);

                boolean resultss = numberss.stream()
                                .anyMatch(n -> n > 3); // stops after finding 4
                System.out.println(resultss);

        }

}

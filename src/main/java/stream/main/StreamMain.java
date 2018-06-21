package stream.main;

import stream.book.BookDirectory;
import stream.forumuser.Forum;
import stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args){

        final List<ForumUser> forumUsersList = new ArrayList<>();

//        Processor processor = new Processor();
//        processor.execute(() -> System.out.println("" +
//                "This is an example text."));
//
//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
//
//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//        System.out.println(poemBeautifier.beautify("aaa",(desc)-> desc+"ABC"));
//        System.out.println(poemBeautifier.beautify("aaa",(desc)-> desc.toUpperCase()));
//        String str = "CBA";
//        System.out.println(poemBeautifier.beautify("aaa",(desc)-> desc+str));
//        System.out.println(poemBeautifier.beautify("aaa",(desc)-> "XYZ".toLowerCase()+desc.toUpperCase()));
//
//        System.out.println("Using Stream to generate even numbers from 1 to 20");
//        NumbersGenerator.generateEven(20);

//        People.getList().stream()
////                .map(s->s.toUpperCase()) can exchange lambda expression with ref to methods
//                .map(String::toUpperCase)
//                .filter(s -> s.length() > 11)
//                .map(s -> s.substring(0, s.indexOf(' ') + 2)+ ".")
//                .filter(s -> s.substring(0,1).equals("M"))
//                .forEach(System.out::println);

        BookDirectory theBookDirectory = new BookDirectory();

//        theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .forEach(System.out::println);

//        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .collect(Collectors.toList());
//
//        System.out.println("# elements: " + theResultListOfBooks.size());
//        theResultListOfBooks.stream()
//                .forEach(System.out::println);


//        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .collect(Collectors.toMap(Book::getSignature, book -> book));

//        System.out.println("# elements: " + theResultMapOfBooks.size());
//        theResultMapOfBooks.entrySet().stream()
//                .map(entry -> entry.getKey() + ": " + entry.getValue())
//                .forEach(System.out::println);


//        String theResultStringOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .map(Book::toString)
//                .collect(Collectors.joining(",\n","<<",">>"));
//
//        System.out.println(theResultStringOfBooks);

        Forum forum = new Forum();
        forumUsersList.add(new ForumUser(1, "A", 'M', LocalDate.of(1993, 1, 1), 11));
        forumUsersList.add(new ForumUser(2, "B", 'F', LocalDate.of(1992, 2, 2), 4));
        forumUsersList.add(new ForumUser(3, "C", 'M', LocalDate.of(1991, 3, 3), 0));
        forumUsersList.add(new ForumUser(4, "D", 'F', LocalDate.of(1995, 4, 4), 1));
        forumUsersList.add(new ForumUser(5, "E", 'M', LocalDate.of(1996, 5, 5), 9));
        forumUsersList.add(new ForumUser(6, "F", 'F', LocalDate.of(1994, 6, 6), 10));
        forumUsersList.add(new ForumUser(7, "G", 'M', LocalDate.of(1997, 7, 20), 11));
        forumUsersList.add(new ForumUser(8, "H", 'F', LocalDate.of(1998, 8, 19), 8));
        forumUsersList.add(new ForumUser(9, "I", 'M', LocalDate.of(1999, 9, 18), 16));
        forumUsersList.add(new ForumUser(10, "J", 'F', LocalDate.of(1990, 10, 17), 7));
        forumUsersList.add(new ForumUser(11, "K", 'M', LocalDate.of(1999, 11, 16), 17));
        forumUsersList.add(new ForumUser(12, "L", 'F', LocalDate.of(1990, 12, 15), 6));
        forumUsersList.add(new ForumUser(13, "M", 'M', LocalDate.of(1991, 1, 14), 5));
        forumUsersList.add(new ForumUser(14, "N", 'F', LocalDate.of(1992, 2, 13), 15));
        forumUsersList.add(new ForumUser(15, "O", 'M', LocalDate.of(1994, 3, 12), 10));
        forumUsersList.add(new ForumUser(16, "P", 'F', LocalDate.of(1995, 4, 11), 3));
        forumUsersList.add(new ForumUser(17, "R", 'M', LocalDate.of(1996, 5, 10), 22));
        forumUsersList.add(new ForumUser(18, "S", 'F', LocalDate.of(1997, 6, 11), 2));
        forumUsersList.add(new ForumUser(19, "T", 'M', LocalDate.of(1998, 7, 21), 1));
        forumUsersList.add(new ForumUser(20, "Z", 'F', LocalDate.of(1990, 8, 31), 111));


        Map<Integer, ForumUser> theResultMapOfForumUsers = forum.getUserList(forumUsersList).stream()
                .filter(forumUser -> (forumUser.getGender().equals('M')))
                .filter(forumUser -> (forumUser.getPostNumber() > 1))
                .filter(forumUser -> (forumUser.getBirthDate().isBefore(LocalDate.of(1995,
                1, 1))))
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser ));

        System.out.println("# elements: " + theResultMapOfForumUsers.size());
        theResultMapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": "  + entry.getValue())
                .forEach(System.out::println);
    }
}
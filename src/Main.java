import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] books = {"I am a King","5 Good Habits","Good vs Bad","Drifting Sand","Google V/S MSN","The dance of an atom"};

        System.out.println("Welcome to the Library");
        System.out.println("Please find below collection of books");
        for (String bk : books){
            System.out.println(bk);
        }

        System.out.println("Press 1 to search the location");
        System.out.println("Press 2 to change the book with another book");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(input==1){
            System.out.println("Enter the name of the book you want to search");
            String book = sc.nextLine();
            GetBook gb = new GetBook(books,book);
            gb.findBook();
        }
        else{
                System.out.println("Enter the name of the book you want to change");
                String oldBook = sc.next();
                System.out.println(" Enter the new book name");
                String newBook = sc.next();
                UpdateLibraryRecord gb = new UpdateLibraryRecord(books,oldBook, newBook);
                gb.changeName();
        }
    }
}
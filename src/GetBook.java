public class GetBook {
    String[] books;
    String book;
    String[] location ={"1st Floor","2nd Floor","3rd Floor","4th Floor","5th Floor","6th Floor"};
    GetBook(String[] books, String book){
        this.books=books;
        this.book=book;
    }

    public void findBook(){

        for (int i = 0; i < books.length; i++) {
            if(books[i].equals(book)){
                System.out.println("Location is"+location[i]);
                break;
            }
        }
        System.out.println("This book does not exist");

    }


}

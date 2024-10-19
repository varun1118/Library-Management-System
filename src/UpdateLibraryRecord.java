public class UpdateLibraryRecord {
    String[] books;
    String oldBook;
    String newBook;

    UpdateLibraryRecord(String[] books, String oldBook, String newBook){
        this.books=books;
        this.oldBook=oldBook;
        this.newBook=newBook;
    }
    int change =0;
    public void changeName(){
        for (int i = 0; i < books.length; i++) {
            if(books[i].equals(oldBook)){
                books[i]=newBook;
                change=1;
            }
        }
        if(change==0){
            System.out.println("This book does not exist");
        }
    }
}

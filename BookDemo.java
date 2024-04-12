public class BookDemo {
    public static void main(String[] args) {
        System.out.println("Enter Auther Name : "+args[0]);
        String name = args[0];
        Book b1;
        System.out.println("Enter Auther Name : "+args[1]); 
        String publication = args[1];
        System.out.println("Enter Auther Name : "+args[2]);
        String title = args[2];
        if(publication=="bookpublication"){
            b1 = new BookPublication(name,title);
        }
        else{
            b1 = new PaperPublication(name,title);
        }
    }
}
class Book{
    private String autherName;
    Book(String name){
        autherName = name;
    }
    void printDetails(){

    }
}

class BookPublication extends Book{
    private String title;
    BookPublication(String name,String title){
        super(name);
        this.title = title;
    }
    void printDetails(){
        System.out.println("The name of Auther is : ");
    }
}

class PaperPublication extends Book{
    private String title;
    PaperPublication(String name,String title){
        super(name);
        this.title = title;
    }
    void printDetails(){

    }
}

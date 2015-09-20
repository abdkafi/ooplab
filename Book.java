/**
 * Created by Antique_Coder on 20-Sep-15.
 */
public class Book {
    private String name;
    private Author author;
    private double price;
    private int stock;
    public Book(String name, Author author){
        this.name=name;
        this.author=author;
    }
    public Book(String name, Author author, double price, int stock){
        this.name=name;
        this.author=author;
        this.price=price;
        this.stock=stock;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void borrowBook(int num){
        if(num>stock)
            System.out.println("Borrowing amount exceeds the current stock!");
        else
            stock-=num;
    }
    public void returnBook(int num){
        stock+=num;
    }
    public double getPrice(){
        return this.price;
    }
    public String getName(){
        return this.name;
    }
    public int getStock(){
        return this.stock;
    }
    public String getAuthorName(){
        return this.author.name;
    }
    public void print(){
        //cout+"Author: "+getAuthorName()+" Name: "+getName()+" Price: "+getPrice()+" Stock: "+getStock()+endl;
        System.out.println("Author: "+getAuthorName()+" Name: "+getName()+" Price: "+getPrice()+" Stock: "+getStock());
    }
    public void setStock(int num){
        this.stock=num;
    }
    public Author getAuthor(){
        return this.author;
    }
};
/*Book::Book(String name, Author author){

        }
        Book::Book(String name, Author author, double price, int stock){
        
        }
        void Book::setName(String name){
        
        }
        void Book::setPrice(double price){
        
        }
        void Book::borrowBook(int num){
        
        }
        void Book::returnBook(int num){
        
        }

        double Book::getPrice(){
        
        }
        String Book::getName(){
        
        }
        int Book::getStock(){
        
        }
        String Book::getAuthorName(){
        
        }
        void Book::setStock(int num){
       
        }
        void Book::print(){
        
        }
        Author Book::getAuthor(){
        
        }*/

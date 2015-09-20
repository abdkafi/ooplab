/**
 * Created by Antique_Coder on 20-Sep-15.
 */
public class Author {
    private String email;
    public String name;
    public Author(){};
    public Author(String name){
        this.name=name;
    }
    public Author(String name, String email){
        this.name=name;
        this.email=email;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void print(){
        System.out.println(this.name+"at"+this.email);
    }
};

/*public Author::Author() {

        }
        Author::Author(String name) {

        }
        Author::Author(String name, String email){

        }
        String Author::getName(){

        }

        String Author::getEmail(){

        }
        void Author::setEmail(String email){


        }
        void Author::print(){

        }*/


package movies;


public class Movie {

    public  Movie(String name, String category){
        this.category = category;

        this.name = name;

    }


    public String name;
    public String category;

    public String getName(){
        return name;
    }

    public void setName(){
        this.name = name;
    }
    public  String getCategory(){
        return category;
    }

    public void setCategory(){
        this.category = category;
    }




            }


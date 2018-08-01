package movies;
//BLUEPRINT

//public class Movie {
//
//    public  Movie(String name, String category){
//        this.category = category;
//
//        this.name = name;
//    }
//
//
//    public String name;
//    public String category;
//
//    public String getName(){
//        return name;
//    }
//
//    public void setName(){
//        this.name = name;
//    }
//    public  String getCategory(){
//        return category;
//    }
//
//    public void setCategory(){
//        this.category = category;
//    }
//
//
//
//
//            }

public class Movie {
//Constructors allows you to create copies


//each movie has one of these
    private String name;
    private String category;

//constructor for movies to copy - movie arrays need a blueprint to copy
    public Movie(String name, String category){
        this.name = name;
        this.category = category;
    }

//how to access the above private properties
    public String getName() {
        return this.name;
    }
    public String getCategory() {
        return this.category;
    }

//how to establish the name
    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
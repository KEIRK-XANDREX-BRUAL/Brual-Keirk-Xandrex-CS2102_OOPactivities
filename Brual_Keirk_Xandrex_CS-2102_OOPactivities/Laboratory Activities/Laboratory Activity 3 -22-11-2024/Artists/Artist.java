public class Artist {
    
    private String name;
    private String nationality;
    private int age;
    private String specialty;

    public Artist(String name, String nationality, int age, String specialty){
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.specialty = specialty;
    }

    public String getName(){
        return name;
    }

    public String getNationality(){
        return nationality;
    }

    public int getAge(){
        return age;
    }

    public String getSpecialty(){
        return specialty;
    }

    public String setName(String name){
        this.name = name;
        return this.name;
    }

    public String setNationality(String nationality){
        this.nationality = nationality;
        return this.nationality;
    }

    public int setAge(int age){
        this.age = age;
        return this.age;
    }

    public String setSpecialty(String specialty){
        this.specialty = specialty;
        return this.specialty;
    }

    public void displayInfo(){
        System.out.println("Artist Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Specialty: " + specialty);
    }
}

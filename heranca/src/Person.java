public class Person {
     private String name;
     private int age;
     private String gender;
     public void birthday(){
         setAge(getAge()+1);
     }

     public String getName(){
         return name;
     }

     public void setName(String name){
         this.name = name;
     }

     public void setAge(int age){
         this.age = age;
     }

     public int getAge(){
         return age;
     }

     public void setGender(String gender){
         this.gender = gender;
     }

     public String getGender(){
         return gender;
     }

    @Override
    public String toString() {
        return "Person " +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'';
    }
}

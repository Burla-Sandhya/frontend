package enumset;

public  enum Second {
    giri("He is networking","25","Male"),
    jain("she is medical","24","Female"),
    ksytra("She is developer","23","Female"),
    deerav("He is a boy","22","Male"),
    vishnu("He is freelancer","30","Male"),
    ashkan("He is an actor","42","Male");

    private final String domain;
    private final String age;
    private final String gender;
    
    Second(String inputDomain,String inputAge,String inputGender){
        domain=inputDomain;
        age=inputAge;
        gender=inputGender;
    }
    String getDomain(){
        return domain;
    }
    String getAge(){
        return age;
    }
    String getGender(){
        return gender;
    }
}
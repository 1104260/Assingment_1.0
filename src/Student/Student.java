package Student;

public class Student {

    public static void main(String[] args) {
        System.out.println(" Im bad programmer ");
        StudentName BS=new StudentName();
        BS.Insert("Jamal");
        BS.Insert("Tayyab");
        BS.Insert("Kasum");
        BS.Insert("Imtiaz Ali");
        BS.Insert("Faisal");
        BS.Insert("Junaid");
        BS.Insert("Noman");
        BS.Insert("Imdad");
        BS.Insert("Kareem");
        BS.Insert("Hameed");
        
        BS.getNames();
        BS.Sort();
        BS.getNames();
    }
    
}

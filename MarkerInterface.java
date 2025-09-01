import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class SaveStudent {
    public static void main(String[] args) {
        try {
            Student s1 = new Student("Arunkumar", 26);
            FileOutputStream fos = new FileOutputStream("student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(s1);
            oos.close();
            fos.close();

        } catch (Exception e) {
            System.out.println("Exception  : " + e);
        }

    }
}

class ReadStudent {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("student.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student s = (Student) ois.readObject();

            System.out.println("name : " + s.name);
            System.out.println("age : " + s.age);

            fis.close();
            ois.close();

        } catch (Exception e) {
            System.out.println("Exception  : " + e);
        }

    }
}

// cloneable example

class SuperHero implements Cloneable {
    String name;
    String superPower;

    SuperHero(String name, String superPower) {
        this.name = name;
        this.superPower = superPower;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("inside of clone override !!!! ");
        return super.clone();
    }
}

class MarkerInterfaceMain {

    public static void main(String[] args) {

        try {

            SuperHero sh = new SuperHero("spiderman", "can fly and walk in wall");
            System.out.println("sh : " + sh);
            System.out.println("name : " + sh.name + "superpower : " + sh.superPower);

            SuperHero sh2 = (SuperHero) sh.clone();
            System.out.println("object cloned using interface !!! ");
            System.out.println("sh2 object : " + sh2);
            System.out.println("name : " + sh2.name + "superpower : " + sh2.superPower);

        } catch (Exception e) {
            System.out.println("Exception  : " + e);
        }

    }

}
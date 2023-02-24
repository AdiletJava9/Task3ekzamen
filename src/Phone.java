import java.util.Arrays;
import java.util.Scanner;

public class Phone implements PhoneInterface {
    private String brand;
    private String name;
    private int password;
    private Contact[] contacts;

    public Phone(String brand, String name, int password, Contact[] contacts) {
        this.brand = brand;
        this.name = name;
        this.password = password;
        this.contacts = contacts;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", password=" + password +
                ", contacts=" + Arrays.toString(contacts) +
                '}';
    }

    @Override
    public String turnOn() {
        System.out.println("Password?");
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        if (s == getPassword()) {
            System.out.println("Phone ON");
        } else {
            System.out.println("Error!!!");
        }
        return "";
    }

    @Override
    public String call(long phoneNumber) {
        for (Contact c : contacts) {
            if (c.getPhoneNumber() == phoneNumber) {
                return "You calling to: " + phoneNumber + " " + c.getFullName();
            }

        }
//        System.out.println("PhoneNumber?");
//        Scanner scanner = new Scanner(System.in);
//        long s1 = scanner.nextLong();
//        if (s1 == phoneNumber) {
//            System.out.println("Vam zvonit" + phoneNumber + " " + );
//        } else {
//            System.out.println("error!!");
//        }
//        return "";
        return "error";
    }

    @Override
    public String call(String fullName) {
        System.out.println("FullName?");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.equals(fullName)) {
            System.out.println("contakt" + fullName);
        } else {
            System.out.println("Error!!");
        }
        return "";
    }


    @Override
    public String searchContact(String fullName) {
        System.out.println("FullName");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (fullName.equals(s)) {
            System.out.println("Contact:" + fullName);
        } else {
            System.out.println("Error");
        }
        return "";
    }

    @Override
    public String getAllContacts() {
        for (Contact c : contacts) {
            System.out.println(c);
        }
        return "";
    }


    @Override
    public Contact updateName(String newName, String oldName) {
        for (Contact replace : contacts) {
            if (replace.getFullName().equals(oldName)) {
                replace.setFullName(newName);
                return replace;
            }
        }
        return null;
    }


}

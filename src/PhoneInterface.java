public interface PhoneInterface {
    String turnOn();
    String call(long phoneNumber);
    String call( String fullName);
    String searchContact( String  fullName);
    String getAllContacts();
    Contact updateName(String newName,String oldName);
}

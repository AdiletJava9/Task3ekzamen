public class Main {
    public static void main(String[] args) {
//        * 2 класс тузунуз
// * Contact(phoneNumber, fullName)
//                * Phone(brand, name, password, Contacts[] contacts)
// * PhoneInterface деген interface тузунуз, turnOn(); телефонду жандырат, пароль сурайт анан ошол пароль туура болсо "Телефон жанды" деп кайтарат метод.
//                * call(); деген 2 метод бар бироосу параметрине телефон номер сурайт анан издейт эгер тапса номер менен ошол номерди жана ошол номер кандай атта сакталган болсо ошол аты менен чалып жатасыз деп кайтарып берет
// * call(); дагы бир методу атын жазасыз эгер ошол ат менен сакталган контакт табылса ошол контакттын атын жана ошол номерди кайтарып ушуга чалып жатасыз деп кайтарып берет
//                * searchContact(); деген методдун жардамы менен контакттарды издейсиз параметрине бир контактын аты жазылат, ошол ат менен контакт табылса ошол контакты(Contact) кайтарып берет
//                * Contact updateName(); бул методдун жардамы менен контакттын атын озгортсо болот, параметрине 2 соз алат ( эскиАты, жаныАты)
// * getAllContacts(); бул метод бир телефондун ичиндеги контактардын баарын алып берет
//                * main - ден класстардын объееттерин тузуп программанызды иштетиниз

        Contact contact = new Contact(708819031,"Adilet Islambek uulu");
        Contact contact1 = new Contact(708909675," ");
        Contact contact2 = new Contact(708789043,"Tursunay Arzykulova");
        Contact contact3 = new Contact(708678934,"Manasbek uulu Ruslan");
        Contact [] contacts={contact,contact1,contact2,contact3};
        Phone phone = new Phone("Apple","Iphone",5555,contacts);
        while (true) {
            phone.turnOn();
            phone.call(708819031);
            phone.call("Adilet Islambek uulu");
            phone.searchContact("Manasbek uulu Ruslan");
            phone.getAllContacts();
            System.out.println(phone.updateName("Madina", "Adilet Islambek uulu"));
        }
    }
}
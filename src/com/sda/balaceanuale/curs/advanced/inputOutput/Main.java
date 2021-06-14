package com.sda.balaceanuale.curs.advanced.inputOutput;

import java.io.*;

public class Main {

    public static void writeExample() {
        File file = new File("test.txt");
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Bogdan was here!");

        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {

            try {
                bufferedWriter.close();
            } catch (IOException exception) {
                exception.printStackTrace();
            }

        }
    }

    public static void readExample() {
        File file = new File("test.txt");
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            do {
                line = bufferedReader.readLine();
                if (line != null) {
                    System.out.println(line);
                }
            } while (line != null);

        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("Am terminat");
            try {
                bufferedReader.close();
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }


    }

    public static void main(String[] args) {
        serialization();

    }

    private static Person setup() {
        Person person1 = new Person("Bogdan");
        Person person2 = new Person("Teo");
        Person person3 = new Person("Vlad");

//        it breaks encapsulation, you shouldn't know that the person has a "List" of friends
//        List<Person> friends1 = new ArrayList<>();
//        friends1.add(person2);
//        friends1.add(person3);
//        person1.setFriends(friends1);
        person1.addFriend(person2);
        person1.addFriend(person3);

        Wallet wallet = new Wallet("Gucci");
        Card ingGold = new Card("ING", "1212121212");
        wallet.addCard(ingGold);
        person1.setWallet(wallet);

        System.out.println(person1);
        return person1;
    }

    private static void serialization() {
//        Person person1 = setup();
//        doSerialization(person1);
        Person deserializedPerson = doDeserialization();
        System.out.println("After deserialization: " + deserializedPerson);
    }

    private static Person doDeserialization() {
        File file = new File("serializationFileForPerson.txt");
        ObjectInputStream objectInputStream = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            Person person = (Person) objectInputStream.readObject();
            return person;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                objectInputStream.close();
            } catch (IOException exception) {
                exception.printStackTrace();
            }

        }
        return null;
    }

    private static void doSerialization(Person person) {
        File file = new File("serializationFileForPerson.txt");
        ObjectOutputStream objectOutputStream = null;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(person);

        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            try {
                objectOutputStream.close();
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }
}

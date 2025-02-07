package ua.com.alicecompany.models;

import jakarta.persistence.*;

@Entity
@Table(name = "item")
public class Item {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "item_name")
    private String item_name;

    @ManyToOne
    @JoinColumn(name = "person_id", referencedColumnName = "id")
    private Person person;

    public Item() {
    }

    public Item(String item_name, Person person) {
        this.item_name = item_name;
        this.person = person;
    }

    public Item(String item_name) {
        this.item_name = item_name;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", item_name='" + item_name + '\'' +
                '}';
    }
}
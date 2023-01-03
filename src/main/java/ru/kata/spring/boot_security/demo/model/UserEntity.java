package ru.kata.spring.boot_security.demo.model;


import javax.persistence.*;

@Entity
@Table(name = "user", schema = "mydbtest", catalog = "")
public class UserEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic
    @Column(name = "name", nullable = true, length = 45)
    private String name;
    @Basic
    @Column(name = "surname", nullable = true, length = 45)
    private String surname;
    @Basic
    @Column(name = "age", nullable = true)
    private Integer age;

    public UserEntity() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        UserEntity that = (UserEntity) o;
//
//        if (id != that.id) return false;
//        if (name != null ? !name.equals(that.name) : that.name != null) return false;
//        if (surname != null ? !surname.equals(that.surname) : that.surname != null) return false;
//        if (age != null ? !age.equals(that.age) : that.age != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public Long hashCode() {
//        Long result = id;
//        result = 31 * result + (name != null ? name.hashCode() : 0);
//        result = 31 * result + (surname != null ? surname.hashCode() : 0);
//        result = 31 * result + (age != null ? age.hashCode() : 0);
//        return result;
//    }
}

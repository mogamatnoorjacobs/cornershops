package www.cput.ac.za.cornershops.Domain;

import java.io.Serializable;

/**
 * Created by noor on 07/08/2017.
 */
public class PersonDetails implements Serializable{
    private Long id;
    private String firstName;
    private String lastName;


    public PersonDetails() {
    }


    public Long getID() {
        return id;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private PersonDetails(Builder builder)
    {
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    public static class Builder{
        private Long id;
        private String firstName;
        private String lastName;

        public Builder id(Long value)
        {
            this.id = value;
            return this;
        }

        public Builder firstName(String value)
        {
            this.firstName = value;
            return this;
        }

        public Builder lastName(String value)
        {
            this.lastName = value;
            return this;
        }


        public PersonDetails build(){
            return new PersonDetails(this);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PersonDetails personDetails = (PersonDetails) o;

            return id.equals(personDetails.id);
        }

        @Override
        public int hashCode() {
            return id.hashCode();
        }

    }

}

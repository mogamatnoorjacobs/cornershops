package www.cput.ac.za.cornershops.Domain;

import sun.applet.Main;

import java.io.Serializable;

/**
 * Created by noor on 07/08/2017.
 */
public class MainCategories implements Serializable
{
    private Long categoryId;
    private String category;


    public MainCategories() {
    }


    public Long getCatergoryId() {
        return categoryId;
    }


    public String getcategory() {
        return category;
    }


    private MainCategories(Builder builder)
    {
        this.categoryId = builder.categoryId;
        this.category = builder.category;

    }

    public static class Builder{
        private Long categoryId;
        private String category;


        public Builder categoryId(Long value)
        {
            this.categoryId = value;
            return this;
        }

        public Builder category(String value)
        {
            this.category = value;
            return this;
        }


        public MainCategories build(){
            return new MainCategories(this);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MainCategories mainCategories = (MainCategories) o;

            return categoryId.equals(mainCategories.categoryId);
        }

        @Override
        public int hashCode() {
            return categoryId.hashCode();
        }

    }
}

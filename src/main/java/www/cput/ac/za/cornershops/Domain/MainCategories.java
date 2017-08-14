package www.cput.ac.za.cornershops.Domain;

import sun.applet.Main;

import java.io.Serializable;

/**
 * Created by noor on 07/08/2017.
 */
public class MainCategories implements Serializable,CategoryInterface
{
    private String categoryId;
    private String category;


    public MainCategories() {
    }


    public String getCatergoryId() {
        return categoryId;
    }


    public String getCategory() {
        return category;
    }


    private MainCategories(Builder builder)
    {
        this.categoryId = builder.categoryId;
        this.category = builder.category;

    }

    public static class Builder{
        private String categoryId;
        private String category;


        public Builder categoryId(String value)
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

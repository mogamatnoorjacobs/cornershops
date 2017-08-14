package www.cput.ac.za.cornershops.Domain;

import sun.applet.Main;

import java.io.Serializable;

/**
 * Created by noor on 07/08/2017.
 */
public class SubCategories implements Serializable, CategoryInterface{

    private String subCategoryId;
    private String subCategory;
    private MainCategories mainCategories;

    public SubCategories() {
    }


    public String getCatergoryId() {
        return subCategoryId;
    }


    public String getCategory() {
        return subCategory;
    }

    public MainCategories getMainCategories() {
        return mainCategories;
    }

    private SubCategories(Builder builder)
    {
        this.subCategoryId = builder.subCategoryId;
        this.subCategory = builder.subCategory;
        this.mainCategories=builder.mainCategories;

    }

    public static class Builder{
        private String subCategoryId;
        private String subCategory;
        private MainCategories mainCategories;

        public Builder subCategoryId(String value)
        {
            this.subCategoryId = value;
            return this;
        }

        public Builder subCategory(String value)
        {
            this.subCategory = value;
            return this;
        }

        public Builder mainCategories(MainCategories value)
        {
            this.mainCategories=value;
            return this;
        }

        public SubCategories build(){
            return new SubCategories(this);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SubCategories subCategories = (SubCategories) o;

            return subCategoryId.equals(subCategories.subCategoryId);
        }

        @Override
        public int hashCode() {
            return subCategoryId.hashCode();
        }

    }
}

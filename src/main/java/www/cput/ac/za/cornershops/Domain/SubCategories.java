package www.cput.ac.za.cornershops.Domain;

import java.io.Serializable;

/**
 * Created by noor on 07/08/2017.
 */
public class SubCategories implements Serializable{

    private Long subCategoryId;
    private String subCategory;


    public SubCategories() {
    }


    public Long getSubCategoryId() {
        return subCategoryId;
    }


    public String getSubCategory() {
        return subCategory;
    }


    private SubCategories(Builder builder)
    {
        this.subCategoryId = builder.subCategoryId;
        this.subCategory = builder.subCategory;

    }

    public static class Builder{
        private Long subCategoryId;
        private String subCategory;


        public Builder subCategoryId(Long value)
        {
            this.subCategoryId = value;
            return this;
        }

        public Builder subCategory(String value)
        {
            this.subCategory = value;
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

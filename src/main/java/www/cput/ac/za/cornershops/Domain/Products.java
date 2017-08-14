package www.cput.ac.za.cornershops.Domain;

import java.io.Serializable;

/**
 * Created by noor on 07/08/2017.
 */
public class Products implements Serializable{

    private String productID;
    private String productName;
    private String productDescription;
    private SubCategories subCategories;

    public Products(){}

    public String getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public SubCategories getSubCategories() {
        return subCategories;
    }

    private Products(Builder builder)
    {
        this.productID = builder.productID;
        this.productName = builder.productName;
        this.productDescription = builder.productDescription;
        this.subCategories=builder.subCategories;
    }

    public static class Builder{
        private String productID;
        private String productName;
        private String productDescription;
        private SubCategories subCategories;


        public Builder productID(String value)
        {
            this.productID = value;
            return this;
        }

        public Builder productName(String value)
        {
            this.productName = value;
            return this;
        }

        public Builder productDescription(String value)
        {
            this.productDescription = value;
            return this;
        }
        public Builder subCategories(SubCategories value)
        {
            this.subCategories=value;
            return this;
        }

        public Products build(){
            return new Products(this);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Products products = (Products) o;

            return productID.equals(products.productID);
        }

        @Override
        public int hashCode() {
            return productID.hashCode();
        }

    }


}

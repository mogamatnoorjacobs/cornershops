package www.cput.ac.za.cornershops.Domain;

import java.io.Serializable;

/**
 * Created by noor on 07/08/2017.
 */
public class Products implements Serializable{

    private Long productID;
    private String productName;
    private String productDescription;

    public Products(){}

    public Long getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }


    private Products(Builder builder)
    {
        this.productID = builder.productID;
        this.productName = builder.productName;
        this.productDescription = builder.productDescription;
    }

    public static class Builder{
        private Long productID;
        private String productName;
        private String productDescription;

        public Builder productID(Long value)
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

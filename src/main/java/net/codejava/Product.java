package net.codejava;

import com.sun.org.apache.xpath.internal.operations.Bool;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @Column(name = "product_id")
    @GeneratedValue
    private Integer productId;

    @Column(name = "product_type", nullable = false)
    private String productType;

    @Column(name = "complete_product", nullable = false)
    private Boolean completeProduct;

    @Column(name = "scaled_product", nullable = false)
    private Boolean scaledProduct;

    @Column(name = "filleted_product", nullable = false)
    private Boolean filletedProduct;

    @Column(name = "complete_product_price", nullable = false)
    private float complete_product_price;

    @Column(name = "scaled_product_price", nullable = false)
    private float scaled_product_price;

    @Column(name = "filleted_product_price", nullable = false)
    private float filleted_product_price;

    @Column(name = "final_product_price", nullable = false)
    private float final_product_price;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Boolean getCompleteProduct() {
        return completeProduct;
    }

    public void setCompleteProduct(Boolean completeProduct) {
        this.completeProduct = completeProduct;
    }

    public Boolean getScaledProduct() {
        return scaledProduct;
    }

    public void setScaledProduct(Boolean scaledProduct) {
        this.scaledProduct = scaledProduct;
    }

    public Boolean getFilletedProduct() {
        return filletedProduct;
    }

    public void setFilletedProduct(Boolean filletedProduct) {
        this.filletedProduct = filletedProduct;
    }

    public float getComplete_product_price() {
        return complete_product_price;
    }

    public void setComplete_product_price(float complete_product_price) {
        this.complete_product_price = complete_product_price;
    }

    public float getScaled_product_price() {
        return scaled_product_price;
    }

    public void setScaled_product_price(float scaled_product_price) {
        this.scaled_product_price = scaled_product_price;
    }

    public float getFilleted_product_price() {
        return filleted_product_price;
    }

    public void setFilleted_product_price(float filleted_product_price) {
        this.filleted_product_price = filleted_product_price;
    }

    public float getFinal_product_price() {
        return final_product_price;
    }

    public void setFinal_product_price(float final_product_price) {
        this.final_product_price = final_product_price;
    }
}

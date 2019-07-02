package com.item.pojo;

import java.io.Serializable;

public class Supplier implements Serializable {
    private Long supplierId;

    private String supplierCode;

    private String supplierName;

    private Boolean supplierType;

    private String linkMan;

    private String phone;

    private String address;

    private Boolean supplierStatus;

    private static final long serialVersionUID = 1L;

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode == null ? null : supplierCode.trim();
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    public Boolean getSupplierType() {
        return supplierType;
    }

    public void setSupplierType(Boolean supplierType) {
        this.supplierType = supplierType;
    }

    public String getLinkMan() {
        return linkMan;
    }

    public void setLinkMan(String linkMan) {
        this.linkMan = linkMan == null ? null : linkMan.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Boolean getSupplierStatus() {
        return supplierStatus;
    }

    public void setSupplierStatus(Boolean supplierStatus) {
        this.supplierStatus = supplierStatus;
    }
}
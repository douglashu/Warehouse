package com.bbld.warehouse.bean;

import java.util.List;

/**
 * 库存盘点详情
 * Created by likey on 2017/6/8.
 */

public class InventoryInfo {
    /**"status": 0,
     "mes": "成功",
     "Info": {}*/
    private int status;
    private String mes;
    private InventoryInfoInfo Info;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public InventoryInfoInfo getInfo() {
        return Info;
    }

    public void setInfo(InventoryInfoInfo info) {
        Info = info;
    }

    public static class InventoryInfoInfo{
        private String InventoryID;
        private String InventoryNumber;
        private String InventoryDate;
        private String InventoryRemark;
        private String InventoryStatus;
        private String ProductCount;
        private int CanOperation;
        private List<InventoryInfoProductList> ProductList;

        public int getCanOperation() {
            return CanOperation;
        }

        public void setCanOperation(int canOperation) {
            CanOperation = canOperation;
        }

        public String getInventoryID() {
            return InventoryID;
        }

        public void setInventoryID(String inventoryID) {
            InventoryID = inventoryID;
        }

        public String getInventoryNumber() {
            return InventoryNumber;
        }

        public void setInventoryNumber(String inventoryNumber) {
            InventoryNumber = inventoryNumber;
        }

        public String getInventoryDate() {
            return InventoryDate;
        }

        public void setInventoryDate(String inventoryDate) {
            InventoryDate = inventoryDate;
        }

        public String getInventoryRemark() {
            return InventoryRemark;
        }

        public void setInventoryRemark(String inventoryRemark) {
            InventoryRemark = inventoryRemark;
        }

        public String getInventoryStatus() {
            return InventoryStatus;
        }

        public void setInventoryStatus(String inventoryStatus) {
            InventoryStatus = inventoryStatus;
        }

        public String getProductCount() {
            return ProductCount;
        }

        public void setProductCount(String productCount) {
            ProductCount = productCount;
        }

        public List<InventoryInfoProductList> getProductList() {
            return ProductList;
        }

        public void setProductList(List<InventoryInfoProductList> productList) {
            ProductList = productList;
        }

        public static class InventoryInfoProductList{
            /**"ProductID": "33",
             "ProductName": "商品23",
             "ProductImg": "http://182.92.183.143:8060//UploadFile/3d481a3b9915417289709dbd605b42ae.png",
             "ProductSpec": "1",
             "ProductCount": "0",
             "Unit": "盒"*/
            private String ProductID;
            private String ProductName;
            private String ProductImg;
            private String ProductSpec;
            private String ProductCount;
            private String Unit;

            public String getProductID() {
                return ProductID;
            }

            public void setProductID(String productID) {
                ProductID = productID;
            }

            public String getProductName() {
                return ProductName;
            }

            public void setProductName(String productName) {
                ProductName = productName;
            }

            public String getProductImg() {
                return ProductImg;
            }

            public void setProductImg(String productImg) {
                ProductImg = productImg;
            }

            public String getProductSpec() {
                return ProductSpec;
            }

            public void setProductSpec(String productSpec) {
                ProductSpec = productSpec;
            }

            public String getProductCount() {
                return ProductCount;
            }

            public void setProductCount(String productCount) {
                ProductCount = productCount;
            }

            public String getUnit() {
                return Unit;
            }

            public void setUnit(String unit) {
                Unit = unit;
            }
        }
    }
}

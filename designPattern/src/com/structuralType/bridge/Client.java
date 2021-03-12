package com.structuralType.bridge;

public class Client {
    public static void main(String[] args) {
        Phone folderPhone = new FolderPhone(new HuaWei());
        folderPhone.call();
        folderPhone.open();
        folderPhone.close();
    }
}

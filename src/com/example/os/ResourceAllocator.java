package com.example.os;

import com.example.os.Requestor;
import com.example.os.RamAllocator;

public class ResourceAllocator implements Requestor, RamAllocator {
    // RAM value has initialized
    public int RAM = 20;

    // resource checker..
    private void resourceChecker(String requestorName, int requestedResource) {

        if (requestedResource <= this.RAM) {
            System.out.println(requestorName + " requesting " + requestedResource + " resources....");
            ramManager(requestorName, requestedResource);
        } else {
            System.out.println("Insufficient resource..wait a while....:)");
        }


    }

    //It overrides request method a
    @Override
    public void request(String requestorName, int requestedResource) {
        resourceChecker(requestorName, requestedResource);


    }

    // RAM manager method has implemented
    @Override
    public void ramManager(String appName, int ramCount) {
        System.out.println(ramCount + " GB allocated for " + appName + "....");
    }

    // main method
    public static void main(String[] args) {
        ResourceAllocator a1 = new ResourceAllocator();
        a1.request("PUBG", 10);


    }


}

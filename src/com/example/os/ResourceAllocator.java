package com.example.os;
import  com.example.os.Requestor;
import com.example.os.RamAllocator;
public class ResourceAllocator implements Requestor,RamAllocator {
    private void resourceChecker(String requestorName, int requestedResource){
        int RAM=20;
        if(requestedResource<=RAM){
            System.out.println(requestorName +" requesting " +requestedResource+ " resources....");
            ramManager(requestorName,requestedResource);
        }
        else {
            System.out.println(("Insufficient resource..wait a while....:)"));
        }


    }
    @Override
    public void request(String requestorName, int requestedResource) {
        resourceChecker(requestorName,requestedResource);


    }
    @Override
    public void ramManager(String appName,int ramCount){
        System.out.println(ramCount + " GB allocated for "+appName+"....");
    }

    public static void main(String[] args){
        ResourceAllocator a1= new ResourceAllocator();
        a1.request("PUBG",10);




    }


}

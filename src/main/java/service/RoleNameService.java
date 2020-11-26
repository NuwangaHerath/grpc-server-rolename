package service;
import com.devicedemo.grpc.Service;
import com.devicedemo.grpc.serviceGrpc;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;

import java.util.*;

public class RoleNameService extends serviceGrpc.serviceImplBase{
    String rolename;
    public RoleNameService(){
        rolename = "testimage";
    }

    @Override
    public void getRoleName(Service.Request request, StreamObserver<Service.Response> responseObserver) {
        System.out.println("method getRoleName called");
        Service.Response.Builder response = Service.Response.newBuilder();
        response.setResponsemessage(rolename);
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}

package server;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import service.RoleNameService;

import java.io.IOException;

public class ServiceServer {

    public static void main(String[] args) throws IOException, InterruptedException {

        Server server = ServerBuilder.forPort(8010).addService(new RoleNameService()).build();

        server.start();
        System.out.println("Server started at "+ server.getPort());

        server.awaitTermination();
        server.shutdown();
    }
}

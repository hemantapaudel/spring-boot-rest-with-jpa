package com.myrest.example.application;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.AmazonEC2ClientBuilder;
import com.amazonaws.services.ec2.model.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SpringRestWithJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringRestWithJpaApplication.class, args);

       /* AmazonEC2 amazonEC2Client = AmazonEC2ClientBuilder.standard()
                .withRegion(Regions.AP_SOUTH_1)
                .build();

        CreateSecurityGroupRequest csgr = new CreateSecurityGroupRequest("java-ec2-security-group", "My security group");
        CreateSecurityGroupResult createSecurityGroupResult = amazonEC2Client.createSecurityGroup(csgr);

        System.out.println(createSecurityGroupResult.getGroupId());

        IpRange ipRange1 = new IpRange().withCidrIp("0.0.0.0/0");


        IpPermission ipPermission1 = new IpPermission().withIpv4Ranges(Arrays.asList(ipRange1))
                .withIpProtocol("tcp")
                .withFromPort(22)
                .withToPort(22);

        IpPermission ipPermission2 = new IpPermission().withIpv4Ranges(Arrays.asList(ipRange1))
                .withIpProtocol("tcp")
                .withFromPort(3000)
                .withToPort(3000);

        AuthorizeSecurityGroupIngressRequest authorizeSecurityGroupIngressRequest =
                new AuthorizeSecurityGroupIngressRequest().withGroupName("java-ec2-security-group").withIpPermissions(ipPermission1, ipPermission2);


        amazonEC2Client.authorizeSecurityGroupIngress(authorizeSecurityGroupIngressRequest);


        CreateKeyPairResult createKeyPairResult = amazonEC2Client.createKeyPair(new CreateKeyPairRequest().withKeyName("Java-ec2-kaypair"));

        KeyPair keyPair = createKeyPairResult.getKeyPair();
        String privateKey = keyPair.getKeyMaterial();
        System.out.println("=====privateKey ="+privateKey);


        RunInstancesRequest runInstancesRequest = new RunInstancesRequest()
                .withImageId("ami-03b5297d565ef30a6")
                .withInstanceType(InstanceType.T2Micro)
                .withMinCount(1)
                .withMaxCount(1)
                .withKeyName("Java-ec2-kaypair")
                .withSecurityGroups("java-ec2-security-group");

        RunInstancesResult result = amazonEC2Client.runInstances(runInstancesRequest);
        System.out.println("result ="+result.toString());*/



    }

}

package com.picpay.mock.server;

import lombok.Data;

import java.util.LinkedList;
import java.util.List;

@Data
public class MockServer {

    private List<MockedServices> mockedServices = new LinkedList<>();

}

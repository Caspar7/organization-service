package com.dyc.organization.client;

import com.dyc.organization.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class EmployeeClientHystrix implements EmployeeClient{

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeClientHystrix.class);

    @Override
    public List<Employee> findByOrganization(Long organizationId) {
        return null;
    }
}

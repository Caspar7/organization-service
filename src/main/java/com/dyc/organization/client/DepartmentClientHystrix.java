package com.dyc.organization.client;

import com.dyc.organization.model.Department;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DepartmentClientHystrix implements DepartmentClient{

    private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentClientHystrix.class);


    @Override
    public List<Department> findByOrganization(Long organizationId) {
        return null;
    }

    @Override
    public List<Department> findByOrganizationWithEmployees(Long organizationId) {
        return null;
    }
}

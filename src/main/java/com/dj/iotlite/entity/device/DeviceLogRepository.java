package com.dj.iotlite.entity.device;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceLogRepository extends CrudRepository<DeviceLog, Long>, JpaSpecificationExecutor<DeviceLog>, JpaRepository<DeviceLog, Long> {

}

package appkubedelivery.appkubeDemoApis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import appkubedelivery.appkubeDemoApis.enity.EmailQueue;

public interface EmailQueueRepository extends JpaRepository<EmailQueue, Long> {
	
}
 
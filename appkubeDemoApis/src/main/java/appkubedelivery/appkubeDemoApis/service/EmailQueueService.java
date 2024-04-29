package appkubedelivery.appkubeDemoApis.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import appkubedelivery.appkubeDemoApis.enity.EmailQueue;
import appkubedelivery.appkubeDemoApis.repository.EmailQueueRepository;
@Service
public class EmailQueueService {
	  @Autowired
	    private EmailQueueRepository emailQueueRepository;

	    public List<EmailQueue> getAllEmails() {
	        return emailQueueRepository.findAll();
	    }

	    public Optional<EmailQueue> getEmailById(Long id) {
	        return emailQueueRepository.findById(id);
	    }

	    public EmailQueue saveEmail(EmailQueue email) {
	        return emailQueueRepository.save(email);
	    }

	    public void deleteEmail(Long id) {
	        emailQueueRepository.deleteById(id);
	    }
}

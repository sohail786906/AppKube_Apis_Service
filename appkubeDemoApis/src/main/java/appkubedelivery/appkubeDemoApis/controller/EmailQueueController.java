package appkubedelivery.appkubeDemoApis.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import appkubedelivery.appkubeDemoApis.enity.EmailQueue;
import appkubedelivery.appkubeDemoApis.service.EmailQueueService;

@RestController
@RequestMapping("/emails")

public class EmailQueueController {
	 @Autowired
	    private EmailQueueService emailQueueService;
	    @GetMapping
	    public List<EmailQueue> getAllEmails() {
	        return emailQueueService.getAllEmails();
	    }
	    @GetMapping("/{id}")
	    public Optional<EmailQueue> getEmailById(@PathVariable Long id) {
	        return emailQueueService.getEmailById(id);
	             
	    
	    }
	    @PostMapping("post")
	    public EmailQueue createEmail(@RequestBody EmailQueue email) {
	        return emailQueueService.saveEmail(email);
	    }
	    @PutMapping("/{update}")
	    public EmailQueue updateEmail(@PathVariable Long id, @RequestBody EmailQueue updatedEmail) {
	        updatedEmail.setId(id); // Ensure ID is set
	        return emailQueueService.saveEmail(updatedEmail);
	    }
	    @DeleteMapping("/{id}")
	    public void deleteEmail(@PathVariable Long id) {
	        emailQueueService.deleteEmail(id);
	    }

}

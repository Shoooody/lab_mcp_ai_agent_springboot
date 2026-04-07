package com.mrxshoody.ai_agent_spring_boot.web;

import com.mrxshoody.ai_agent_spring_boot.service.AgentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AgentController {

    private final AgentService agentService;

    public AgentController(AgentService agentService) {
        this.agentService = agentService;
    }

    @PostMapping("/run")
    public String run(@RequestBody String prompt) {
        return agentService.run(prompt);
    }
}

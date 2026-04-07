package com.mrxshoody.ai_agent_spring_boot.service;

import com.mrxshoody.ai_agent_spring_boot.agent.BacklogAgent;
import org.springframework.stereotype.Service;

@Service
public class AgentService {
    private final BacklogAgent backlogAgent;

    public AgentService(BacklogAgent backlogAgent) {
        this.backlogAgent = backlogAgent;
    }

    public String run(String prompt) {
        return backlogAgent.handle(prompt);
    }
}
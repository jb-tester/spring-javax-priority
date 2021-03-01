package com.mytests.spring.priority_test;

import com.mytests.spring.priority_test.demo.DemoService;
import com.mytests.spring.priority_test.dummy.DummyService;
import com.mytests.spring.priority_test.metapriority.MetaService;
import org.springframework.stereotype.Component;

@Component
public class UseServicesByPriority {
    private final DemoService demoService;
    private final DummyService dummyService;
    private final MetaService metaService;

    public UseServicesByPriority(DemoService demoService, DummyService dummyService, MetaService metaService) {
        this.demoService = demoService;
        this.dummyService = dummyService;
        this.metaService = metaService;
    }

    @Override
    public String toString() {
        return "Autowired: " 
                + demoService.toString()+", "
                + dummyService.toString()+", "
                + metaService.toString();
    }
}

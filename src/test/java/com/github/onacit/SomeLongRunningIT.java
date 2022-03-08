package com.github.onacit;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("long-running")
@Slf4j
class SomeLongRunningIT {

    @Test
    void test() {
        log.debug("integration test long-running...");
    }
}

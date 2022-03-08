package com.github.onacit;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("long-running")
@Slf4j
class SomeLongRunningTest {

    @Test
    void test() {
        log.debug("test long running...");
    }
}

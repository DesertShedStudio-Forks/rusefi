package com.rusefi.functional_tests;

import com.rusefi.config.generated.Integration;
import com.rusefi.core.MessagesCentral;

import static com.rusefi.TestingUtils.assertNull;

public enum TestHelper {
    INSTANCE;

    private String criticalError;

    TestHelper() {
        MessagesCentral.getInstance().addListener((clazz, message) -> {
            if (message.startsWith(Integration.CRITICAL_PREFIX))
                criticalError = message;
        });
    }

    public void assertNotFatal() {
        assertNull("Fatal not expected: " + criticalError, criticalError);
    }
}

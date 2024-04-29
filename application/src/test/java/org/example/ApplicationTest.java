package org.example;

import org.junit.jupiter.api.Test;
import org.openapitools.client.model.Problem;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class ApplicationTest {

    @Test
    void ableToReferToClassGeneratedByContractModuleButOriginatingFromCommonModule() {
        assertDoesNotThrow(() -> {
            // Demonstrating that we can refer to Problem which is defined by
            // common/src/main/resources/common/problem.yml even though we
            // only depend on contract-v1.
            new Problem();
        });
    }
}

package br.com.daniel.dev.api.aws.springcloudv1.adapter.http.spring.controller;

import br.com.daniel.dev.api.aws.springcloudv1.adapter.http.spring.controller.aws.ParamStoreController;
import br.com.daniel.dev.api.aws.springcloudv1.config.aws.ParamStoreConfig;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class ParamStoreControllerTest {

    @Mock
    private ParamStoreConfig paramStoreConfig;

    @InjectMocks
    private ParamStoreController paramStoreController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        when(paramStoreConfig.getParamStoreHelloWord()).thenReturn("Hello, ParamStore!");
    }

    @Test
    public void testGetParamStoreConfiguration() {
        // Act
        String result = paramStoreController.getParamStoreConfigurarion();

        // Assert
        assertEquals("Hello, ParamStore!", result);
    }

    @AfterEach
    void tearDown() {
    }
}
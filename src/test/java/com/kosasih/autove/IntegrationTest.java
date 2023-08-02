package com.kosasih.autove;

import com.kosasih.autove.AutoveApp;
import com.kosasih.autove.config.AsyncSyncConfiguration;
import com.kosasih.autove.config.EmbeddedElasticsearch;
import com.kosasih.autove.config.EmbeddedKafka;
import com.kosasih.autove.config.EmbeddedSQL;
import com.kosasih.autove.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { AutoveApp.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
@EmbeddedKafka
public @interface IntegrationTest {
}

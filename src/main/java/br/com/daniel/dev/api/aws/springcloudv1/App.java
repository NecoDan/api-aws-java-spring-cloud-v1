package br.com.daniel.dev.api.aws.springcloudv1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.activation.DataSource;
import javax.persistence.EntityManagerFactory;
import java.net.URISyntaxException;

@SpringBootApplication
//@EnableJpaRepositories("br.com.daniel.dev.api.aws.springcloudv1.adapter.repository")
//@EntityScan(basePackages = {"br.com.daniel.dev.api.aws.springcloudv1.adapter.entity"})
public class App {

//    private static String prop_db_url  = "spring.datasource.url";
//
//    @Autowired
//    private Environment env;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory() throws URISyntaxException {
//        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
//        entityManagerFactoryBean.setDataSource(new DataSource(env.getProperty(prop_db_url)));
//        entityManagerFactoryBean.setPackagesToScan("br.com.daniel.dev.api.aws.springcloudv1.adapter.repository");
//        //additional config of factory
//        return entityManagerFactoryBean;
//    }
//
//    @Bean(name = "transactionManager")
//    public PlatformTransactionManager jpaTransactionManager(EntityManagerFactory entityManagerFactory) throws URISyntaxException {
//        JpaTransactionManager transactionManager = new JpaTransactionManager();
//        transactionManager.setEntityManagerFactory(entityManagerFactory);
//        return transactionManager;
//    }

}

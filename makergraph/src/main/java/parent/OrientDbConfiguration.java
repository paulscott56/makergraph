package parent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.orient.commons.repository.config.EnableOrientRepositories;
import org.springframework.data.orient.object.OrientObjectDatabaseFactory;
import org.springframework.data.orient.object.repository.support.OrientObjectRepositoryFactoryBean;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Configuration
@EnableOrientRepositories(basePackages = "za.co.paulscott.makergraph.repository", repositoryFactoryBeanClass = OrientObjectRepositoryFactoryBean.class)
public class OrientDbConfiguration {

    @Autowired
    private OrientObjectDatabaseFactory factory;

    @PostConstruct
    @Transactional
    public void registerEntities() {
        factory.db().getEntityManager().registerEntityClasses("za.co.paulscott.makergraph.model");
    }

}
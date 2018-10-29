# Spring Initialzation and Destruction lifecycle callbacks example

## How is it configured in example

1. Custom Service implements InitializingBean, DisposableBean to define afterPropertiesSet() and destroy() methods for respective interfaces. It also has @PostConstruct and @PreDestroy methods
2. In application class, customService2 Bean is defined with configuration providing init-method and destroy-methods. 
3. Running the application shows the sequence in which methods are called

## Importing and running project

1. Import project as Maven project
2. Run application as Spring Boot Application
3. Observe log to see the sequence of execution

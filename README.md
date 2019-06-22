in case of setter injection ::>>
-------------------------------------

in this class we are making a object of customerRepository = new customerRepositoryImpl();
* but instead of that we are using setter injection.
* so for that here we removed new and created constructor for the class in which we want to call method
* and in bean xml file pass object of that.

*<bean name="foo" class="com.pluralsight.repositoty.HibernateCustomerRepositoryImpl" />

    <bean name="customerService"
          class="com.pluralsight.service.CustomerServiceImpl">
        <property name="customerRepository" ref="foo"></property>
    </bean>

here we created bean of both class and pass the bean of class for which we created object .

Constructor injection is index based while setter injection is name based.


in case of Constructor injection ::>>
-------------------------------------


<bean name="customerRepository" class="com.pluralsight.repositoty.HibernateCustomerRepositoryImpl" />

    <bean name="customerService"
          class="com.pluralsight.service.CustomerServiceImpl">
        <constructor-arg index="0" ref="customerRepository"/>
    </bean>

in case of Constructor Autowire ::>>
-------------------------------------
Spring automaticallys wires Beans
byTypes
byName
constructor
no

constructor
-----------
<bean name="customerRepository" class="com.pluralsight.repositoty.HibernateCustomerRepositoryImpl" />

    <bean name="customerService"
          class="com.pluralsight.service.CustomerServiceImpl" autowire="constructor">
        <!--<constructor-arg index="0" ref="customerRepository"/>-->
        <!--<property name="customerRepository" ref="foo"></property>-->
</bean>



byTypes:
----------

    <bean name="customerService"
          class="com.pluralsight.service.CustomerServiceImpl" autowire="byType">

it will lookup for argument at customerRepository setter injection method.

byType doesn't care about bean name and method naming convention but not same case with byName.


-------------------------------------
AUTOWIRE:--

 <context:annotation-config/>
    
    <context:component-scan base-package="com.pluralsight"/>



this tells that we are using annotation configuration and it starts scanning from base package specified.


@component - any thing inside our application we marked as beans(any pojo-plain old java object).
@service - business logic layer.
@Repository - data base layer what ever we choose like jpa,hibernate.

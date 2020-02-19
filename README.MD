# MavenHibernateTest
This is just a very simple project to get started learning Maven and Hibernate.

#### Maven
I've come to understand some basics for how pom.xml works and added dependencies for MySQL Connector and Hibernate.
Auto-import is enabled.

#### Hibernate

###### Requirements
A database called "aliens" (Silly name, I know, but it's just a test) must be active on a localhost server.

###### What I've learned
I've learned some basics for how Hibernate handles database transactions and annotates entities.
Here an object of Person.java is saved to the database called "aliens". If the table that relates to the
Person.java class does not exist, \<property name="hbm2ddl.auto">create\</property> in the hibernate.cfg.xml file
makes sure that the table is created automatically.

Objects are annotated as entities and can be joined via relational mapping annotations, although that is not tested here yet.

In this case, a Session instance is created via SessionFactory. A transaction ensures that all or nothing gets updated
to the database and the sesson.save method saves the Person objects to the database table.

###### Moving forward
Alternatively EntityManager and the persist method via JPA works well to do the same. This is an extremely basic example so far
just to get started, but I've learned a lot reading about alternative ways to use Hibernate. Objects can be managed with CRUD
operations, and unlike just using the MySQL Connector with JDBC it's not necessary to manually map the objects so it's a lot
more time efficient. If necessary, native SQL queries can still be sent and result sets dealt with, but especially standard object
management is very effecient comparatively using Hibernate.
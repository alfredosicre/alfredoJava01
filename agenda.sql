CREATE DATABASE  IF NOT EXISTS `11_agenda` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `11_agenda`;
-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: agenda
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `contactos`
--

DROP TABLE IF EXISTS `contactos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contactos` (
  `idcontactos` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `apellidos` varchar(45) DEFAULT NULL,
  `apodo` varchar(45) DEFAULT NULL,
  `tipo_via` varchar(45) DEFAULT NULL,
  `via` varchar(45) DEFAULT NULL,
  `numero` int DEFAULT NULL,
  `piso` int DEFAULT NULL,
  `puerta` varchar(45) DEFAULT NULL,
  `codigo_postal` varchar(45) DEFAULT NULL,
  `ciudad` varchar(45) DEFAULT NULL,
  `provincia` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idcontactos`)
) ENGINE=InnoDB AUTO_INCREMENT=123 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contactos`
--

LOCK TABLES `contactos` WRITE;
/*!40000 ALTER TABLE `contactos` DISABLE KEYS */;
INSERT INTO `contactos` VALUES (4,'Kadeem','Lopez','Aliquam','Plaza','4524 Tellus Road',83,10,'C','57860','Lugo','Galicia'),(5,'Elton','Simon Ewing','aliquet','Plaza','239-2788 Tristique Avenue',17,3,'F','56884','Telde','Canarias'),(6,'Nehru','Bruce Macias','aliquet','Calle','8560 Cursus, Rd.',5,9,'C','59617','L Hospitalet de Llobregat','Cataluña'),(7,'Kieran','Malik Burke','amet','Plaza','Ap #474-2092 Quis Av.',26,2,'D','56270','Santa Cruz de Tenerife','Canarias'),(9,'Kasper','Palmer Roberts','ante','Calle','Ap #444-7890 Nam St.',43,2,'D','8723','Gijon','Principado de Asturias'),(10,'Mannix','Wylie Duffy','augue','Avendia','881-4665 Pede. Street',52,6,'C','45179','Palencia','Castilla y Leon'),(11,'George','Xenos Villarreal','commodo','Plaza','837-9352 Nostra, Road',40,2,'B','73842','Zaragoza','Aragon'),(12,'Malcolm','Kyle Michael','commodo','Avendia','Ap #195-7361 Nulla St.',57,9,'C','47844','Murcia','Murcia'),(13,'Clinton','Porter Buck','congue','Avendia','7016 Consectetuer Rd.',49,0,'C','88213','Donosti','Pais Vasco'),(14,'Charles','Zeus Baird','consectetuer','Calle','991-1071 Urna, Av.',87,3,'F','32964','Torrejon de Ardoz','Comunidad de Madrid'),(15,'Alden','Valentine Lucas','Cras','Avendia','7327 Morbi Rd.',14,6,'A','24098','Getafe','Comunidad de Madrid'),(16,'Alden','Nissim Tate','Cum','Plaza','P.O. Box 164, 1054 Amet, St.',93,3,'B','50669','Telde','Canarias'),(17,'Dalton','Carson Marshall','cursus','Plaza','1808 Nisl. Av.',2,8,'D','29912','Ourense','Galicia'),(18,'Warren','Oren Buckner','cursus','Avendia','435-9032 Egestas St.',62,5,'C','2904','Fuenlabrada','Comunidad de Madrid'),(19,'Alfonso','Lewis Dickerson','diam','Plaza','Ap #752-8655 Tempor Avenue',14,4,'C','50215','Alacant','Comunidad Valenciana'),(20,'Theodore','Yasir Britt','dictum','Calle','5965 Gravida Av.',22,8,'F','96515','Mataro','Cataluña'),(22,'Boris','Chandler Battle','dolor','Avendia','5702 Arcu Road',90,10,'B','84311','Elx','Comunidad Valenciana'),(23,'Magee','Baxter Fox','Duis','Avendia','Ap #994-7351 Aliquet Ave',42,0,'D','17733','Sabadell','Cataluña'),(24,'Dennis','Armand Blackwell','eget','Plaza','Ap #403-7822 Ornare, Street',88,2,'A','29113','Alcobendas','Comunidad de Madrid'),(25,'Colton','Yasir Cain','enim','Avendia','Ap #599-1761 Luctus Road',9,1,'B','42065','Palma de Mallorca','Islas Baleares'),(26,'Derek','Rigel Farley','enim','Avendia','P.O. Box 570, 7423 Pharetra. Rd.',72,5,'F','77814','Sabadell','Cataluña'),(27,'Hamilton','Duncan Kirby','enim','Calle','Ap #888-4255 Eu Rd.',76,6,'C','97796','Badalona','Cataluña'),(28,'Oren','Adam Sellers','erat','Calle','619-3008 Lorem Rd.',100,4,'D','25163','Torrevieja','Comunidad Valenciana'),(29,'Troy','Hilel Delacruz','eros','Calle','185-1850 Quis Road',14,4,'B','16845','Torrejon de Ardoz','Comunidad de Madrid'),(30,'Ferris','Jordan Schroeder','et','Calle','P.O. Box 788, 8567 Et St.',71,5,'B','33895','Parla','Comunidad de Madrid'),(31,'Emerson','Xenos Charles','eu','Plaza','184-5820 Turpis. Road',6,3,'B','81665','Alacant','Comunidad Valenciana'),(32,'Jared','Tanner Raymond','eu','Calle','397-5479 Nisl. Ave',23,7,'D','1984','Jaen','Andalucia'),(33,'Moses','Ezra Richards','eu','Plaza','651-1276 Euismod Street',58,9,'B','1221','Alcorcon','Comunidad de Madrid'),(35,'Deacon','Gavin Arnold','facilisis','Plaza','443-512 Id St.',77,4,'A','57593','Elx','Comunidad Valenciana'),(36,'Harding','Aladdin Burt','facilisis','Plaza','5911 Ut St.',64,9,'B','94957','Teruel','Aragon'),(37,'Hector','Emmanuel Sawyer','facilisis','Calle','Ap #915-4703 Auctor Rd.',72,2,'F','9626','Castello','Comunidad Valenciana'),(38,'Cyrus','Brent Velazquez','faucibus','Calle','Ap #108-8830 Libero. Street',60,4,'A','54920','Lugo','Galicia'),(39,'Ray','Bruno Hensley','felis.','Calle','P.O. Box 841, 7116 Diam Rd.',58,3,'C','97312','Elx','Comunidad Valenciana'),(40,'Phillip','Oren Fitzpatrick','fermentum','Calle','3331 Ut Avenue',71,5,'A','85992','Baracaldo','Pais Vasco'),(41,'Jeremy','Arsenio Wong','feugiat','Avendia','1892 Felis, Ave',86,7,'B','10219','Pamplona','Comunidad Foral de Navarra'),(42,'Keith','Basil Preston','Fusce','Calle','820-9639 Maecenas St.',89,0,'B','61028','Alacant','Comunidad Valenciana'),(43,'Otto','Mannix Wilson','habitant','Calle','566-4276 Dictum Rd.',37,6,'C','40794','Santa Coloma de Gramenet','Cataluña'),(44,'Arden','James Cooper','hymenaeos','Calle','8909 Consequat, Street',18,6,'F','73158','Barcelona','Cataluña'),(45,'Thomas','Justin Alexander','iaculis','Avendia','168-2069 Sed Road',85,1,'C','75862','Valencia','Comunidad Valenciana'),(46,'Melvin','Gavin Hampton','iaculis','Avendia','Ap #621-5405 Leo. Ave',57,4,'A','58033','Torrejon de Ardoz','Comunidad de Madrid'),(47,'Akeem','Ishmael Blackwell','id','Avendia','957-1867 Nunc. Rd.',12,1,'D','97922','Torrejon de Ardoz','Comunidad de Madrid'),(48,'Roth','Cairo Gay','in','Plaza','P.O. Box 540, 6461 Ante Avenue',77,8,'A','51791','Badalona','Cataluña'),(49,'Raja','Gavin Newton','interdum','Plaza','366-5035 In St.',16,10,'F','32000','Santa Coloma de Gramenet','Cataluña'),(50,'Elton','Guy Floyd','ipsum','Calle','814-3894 Dictum Avenue',53,7,'D','27672','Madrid','Comunidad de Madrid'),(51,'Jorge','Cardozo Jimenez','Jorgito','Avenida','Castellana',16,0,'','28100','Madrid','Comunidad de Madrid'),(53,'Griffin','Murphy Nicholson','ligula','Avendia','P.O. Box 950, 3316 Molestie Rd.',11,9,'A','37626','Marbella','Andalucia'),(54,'Michael','Rudyard Leonard','ligula','Plaza','P.O. Box 730, 1041 Eu, Rd.',82,5,'C','76532','San Cristobal de la Laguna','Canarias'),(55,'Zephania','Hyatt Luna','lorem','Avendia','Ap #481-8961 Aliquam St.',35,5,'F','36757','Sabadell','Cataluña'),(56,'Brett','Trevor Shields','Maecenas','Avendia','4967 Fringilla Rd.',23,4,'B','6957','Palencia','Castilla y Leon'),(57,'Abdul','Burke Sharpe','magna','Avendia','P.O. Box 694, 6362 Cras St.',43,4,'B','85261','Valencia','Comunidad Valenciana'),(58,'Zephania','Ian Morin','magnis','Plaza','P.O. Box 763, 969 Commodo Rd.',98,8,'D','24849','Torrejon de Ardoz','Comunidad de Madrid'),(59,'Aladdin','Paul Warren','massa','Plaza','4256 Nam St.',44,3,'F','35872','Tarrasa','Cataluña'),(60,'Tad','Caesar Keller','mattis','Calle','P.O. Box 329, 1813 Magnis Street',20,7,'B','88320','Gasteiz','Pais Vasco'),(61,'Anthony','Quinn Calhoun','mauris','Plaza','2407 Condimentum. Street',42,4,'D','66852','Badalona','Cataluña'),(62,'Orson','Curran Walter','Mauris','Plaza','Ap #271-4041 Tellus Rd.',78,5,'A','45795','Alcobendas','Comunidad de Madrid'),(63,'Barry','Vance Parrish','mauris','Avendia','4564 Maecenas Rd.',72,8,'A','69733','Madrid','Comunidad de Madrid'),(64,'Cooper','Brock Townsend','molestie','Calle','482-9088 Nunc Street',93,5,'F','41572','Cartagena','Murcia'),(65,'Ciaran','Nissim Donovan','mollis','Plaza','P.O. Box 177, 9624 Libero Av.',11,6,'D','15412','Bilbo','Pais Vasco'),(66,'Hayes','Derek Burns','montes','Avendia','229-8427 Aliquam Rd.',13,6,'B','64699','Cadiz','Andalucia'),(67,'Kareem','Honorato Colon','montes','Avendia','Ap #712-5270 Aliquam Rd.',17,3,'C','88317','Tarrasa','Cataluña'),(68,'Reece','Jelani Freeman','mus.','Avendia','Ap #625-3796 Quisque St.',6,0,'D','26506','Baracaldo','Pais Vasco'),(70,'Dominic','Barrett Patrick','neque','Plaza','P.O. Box 892, 8473 Vitae Street',71,9,'C','46716','Badajoz','Extremadura'),(71,'Leonard','Orson Gray','neque','Plaza','9164 Mi St.',61,5,'F','83757','Pamplona','Comunidad Foral de Navarra'),(72,'Jamal','Steel Flynn','netus','Calle','P.O. Box 238, 9914 Habitant Rd.',8,10,'F','90395','Gijon','Principado de Asturias'),(73,'Vincent','Mufutau Mcintosh','non','Plaza','Ap #840-6612 Neque Avenue',48,9,'C','26106','Pamplona','Comunidad Foral de Navarra'),(74,'Elijah','Camden Sullivan','non','Calle','7327 Integer St.',77,0,'B','65747','Ciudad Real','Castilla - La Mancha'),(75,'Warren','Arsenio William','Nulla','Plaza','8595 Non, Avenue',80,3,'C','17514','Ciudad Real','Castilla - La Mancha'),(76,'Nasim','Edan Yates','nunc','Calle','Ap #625-559 Mauris. St.',39,5,'F','84271','Alacant','Comunidad Valenciana'),(77,'Tarik','Wallace Chen','nunc','Avendia','624-5961 Congue. St.',88,10,'D','94027','Parla','Comunidad de Madrid'),(78,'Salvador','Jonas Franks','orci','Plaza','P.O. Box 458, 6372 Sem St.',13,3,'A','17637','Getafe','Comunidad de Madrid'),(79,'Abdul','Perry Travis','ornare','Plaza','2629 Mollis Avenue',89,9,'B','13996','L Hospitalet de Llobregat','Cataluña'),(80,'Brandon','Jasper Hancock','Proin','Avendia','172-8569 Gravida Rd.',7,10,'C','35062','Ourense','Galicia'),(81,'Dexter','Lyle Atkinson','Proin','Avendia','4004 Vitae Rd.',62,3,'F','18188','Teruel','Aragon'),(82,'Berk','Hector Weber','quis','Calle','978-7004 Sociis Road',52,7,'C','53794','Murcia','Murcia'),(83,'Byron','Armand Stafford','Quisque','Avendia','1336 Mauris St.',48,10,'B','84578','Badalona','Cataluña'),(84,'Gabriel','Byron Bass','ridiculus','Plaza','P.O. Box 258, 1909 Nulla Av.',86,7,'F','94303','Caceres','Extremadura'),(85,'Elton','Oleg Bean','sapien','Avendia','620-6981 Nam Av.',95,10,'A','11607','Palma de Mallorca','Islas Baleares'),(86,'Simon','Brady Howard','scelerisque','Calle','Ap #961-1952 Mauris Road',26,2,'F','57170','Elx','Comunidad Valenciana'),(87,'Jacob','Aaron Bradford','sed','Plaza','8231 Ante Avenue',38,0,'B','89349','Palma de Mallorca','Islas Baleares'),(88,'Trevor','Sawyer Moses','sociis','Plaza','P.O. Box 852, 7819 Erat Rd.',14,6,'F','82510','Pamplona','Comunidad Foral de Navarra'),(89,'Driscoll','Jameson Christian','Suspendisse','Avendia','766-4147 Velit Road',15,8,'C','21237','Albacete','Castilla - La Mancha'),(90,'Tyrone','Solomon Grant','tellus','Plaza','8196 Dictum Rd.',18,1,'F','84478','Sevilla','Andalucia'),(91,'Ignatius','Amos Cooley','tellus','Avendia','P.O. Box 638, 7633 Amet, St.',44,3,'C','98822','Tarragona','Cataluña'),(92,'Trevor','Tad Solis','tellus','Plaza','Ap #847-442 Justo St.',18,10,'A','39962','Reus','Cataluña'),(93,'Acton','Owen Mcleod','tincidunt','Plaza','914-1381 Ullamcorper St.',3,1,'D','28051','Gijon','Principado de Asturias'),(94,'Marvin','Forrest Reyes','tincidunt','Avendia','1715 Morbi St.',64,2,'D','56402','Avila','Castilla y Leon'),(95,'Jorge','Ramirez','Toro Bravo','Calle','EspaÃ±a',368,3,'B','29400','Ronda','Malaga'),(96,'Carl','Hammett Branch','tristique','Plaza','P.O. Box 482, 409 Consequat Av.',63,9,'A','41104','Pamplona','Comunidad Foral de Navarra'),(97,'Connor','Mannix Torres','turpis','Calle','Ap #741-3708 Nunc St.',19,9,'A','86499','Las Palmas','Canarias'),(98,'Price','Elliott Sutton','ut','Avendia','P.O. Box 130, 2675 Eu, Ave',37,3,'F','61867','Cuenca','Castilla - La Mancha'),(99,'Howard','Vernon Hawkins','varius','Plaza','258 Ridiculus St.',97,10,'A','8241','Salamanca','Castilla y Leon'),(100,'Giacomo','Walker Hebert','vehicula','Plaza','659-8470 Ultricies Ave',62,6,'B','87999','Mataro','Cataluña'),(101,'Felix','Channing Howe','Vivamus','Plaza','7658 Ultricies St.',7,2,'F','47279','Gijon','Asturias'),(102,'Aladdin','Chase Banks','vulputate','Calle','Ap #792-8740 Vitae, Rd.',96,7,'D','30672','Parla','Comunidad de Madrid'),(121,'Claudio','Lopez','Boby','calle','Salta',1755,1,'B','2000','Rosario','Santa Fe'),(122,'ddd','ffff','asdf','','',0,0,'','','','');
/*!40000 ALTER TABLE `contactos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `correos`
--

DROP TABLE IF EXISTS `correos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `correos` (
  `id_correo` int NOT NULL AUTO_INCREMENT,
  `fk_contacto` int DEFAULT NULL,
  `correo` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`id_correo`),
  KEY `id_contacto_idx` (`fk_contacto`),
  CONSTRAINT `id_contacto` FOREIGN KEY (`fk_contacto`) REFERENCES `contactos` (`idcontactos`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=152 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `correos`
--

LOCK TABLES `correos` WRITE;
/*!40000 ALTER TABLE `correos` DISABLE KEYS */;
INSERT INTO `correos` VALUES (7,5,'jorge.ramirez@gmail.com'),(8,6,'toro_bravo@gmail.com'),(9,7,'tristique.senectus@egestas.com'),(11,9,'urna.Ut@eulacus.com'),(12,10,'ut@Nullamfeugiatplacerat.com'),(13,11,'Donec.feugiat.metus@Suspendisse.com'),(14,12,'sed.est@ultrices.ca'),(15,13,'et@orci.org'),(16,13,'gravida.sagittis.Duis@nequepellentesquemassa.com'),(17,14,'egestas@ante.org'),(18,14,'dictum.mi@habitant.com'),(19,15,'In@NuncmaurisMorbi.net'),(20,15,'dictum@ac.net'),(21,16,'laoreet@aliquetmagnaa.edu'),(22,16,'vehicula.Pellentesque.tincidunt@magnaPhasellusdolor.co.uk'),(23,17,'lacinia.at.iaculis@sitamet.co.uk'),(24,18,'sit@Aliquam.co.uk'),(25,19,'Nunc@ac.com'),(26,19,'et.lacinia.vitae@Sedcongue.ca'),(27,20,'Nulla.interdum@nectempus.edu'),(30,22,'condimentum.Donec@Loremipsumdolor.ca'),(31,22,'eget@estcongue.net'),(32,23,'urna.et@Pellentesquehabitantmorbi.edu'),(34,25,'Sed.et@Pellentesqueut.net'),(35,26,'nec.mauris.blandit@auctorveliteget.co.uk'),(36,27,'id@interdumlibero.co.uk'),(38,29,'Pellentesque.tincidunt@etnetuset.ca'),(39,30,'magna.Suspendisse.tristique@scelerisquedui.com'),(40,31,'ac@massa.net'),(41,32,'dictum.eu.placerat@at.net'),(42,33,'tincidunt@non.edu'),(44,35,'sem.vitae@in.org'),(46,37,'taciti.sociosqu.ad@at.ca'),(47,38,'convallis.ante.lectus@libero.co.uk'),(48,39,'adipiscing@lacus.ca'),(49,40,'Nunc@ac.com'),(51,42,'semper.pretium@dolor.ca'),(52,43,'laoreet@aliquetmagnaa.edu'),(53,44,'ipsum@consectetuermauris.ca'),(54,44,'eu.dolor.egestas@Suspendissecommodo.edu'),(55,45,'vitae.odio.sagittis@nonlaciniaat.com'),(56,46,'neque@quisturpis.ca'),(57,47,'Sed@loremut.net'),(58,47,'eu.elit@fringillaestMauris.net'),(59,48,'dolor.egestas@ipsum.co.uk'),(60,49,'eu.dolor.egestas@Suspendissecommodo.edu'),(61,50,'sit.amet@vitaealiquetnec.ca'),(62,51,'enim.nisl@MorbimetusVivamus.com'),(65,53,'porta.elit.a@Mauris.co.uk'),(66,54,'arcu@etcommodo.com'),(67,55,'Cras@arcuCurabitur.net'),(68,56,'Nulla.interdum@nectempus.edu'),(69,56,'natoque@Mauris.edu'),(70,57,'neque@quisturpis.ca'),(71,57,'lacus.Aliquam.rutrum@tempusloremfringilla.org'),(72,58,'Ut.sagittis.lobortis@fringilla.org'),(73,58,'at@dolor.org'),(74,59,'toro_bravo@gmail.com'),(75,59,'Vivamus@leoinlobortis.edu'),(76,60,'condimentum.Donec@Loremipsumdolor.ca'),(77,61,'id.blandit.at@enimnon.net'),(78,61,'metus.vitae@nec.co.uk'),(79,62,'In@NuncmaurisMorbi.net'),(80,63,'et.commodo.at@utpharetra.com'),(81,63,'adipiscing@lacus.ca'),(82,64,'pellentesque.Sed@nisiCumsociis.ca'),(83,65,'Pellentesque.tincidunt@etnetuset.ca'),(84,65,'faucibus.leo.in@Morbiaccumsanlaoreet.edu'),(85,66,'dui.Fusce@quis.co.uk'),(86,67,'eget.magna@feugiat.com'),(87,68,'velit.eget@mauris.net'),(89,70,'Proin.ultrices.Duis@eget.org'),(90,71,'Cras@ametnulla.net'),(91,72,'dictum.ultricies.ligula@lectusCum.ca'),(92,73,'adipiscing.lacus@urnaNullamlobortis.co.uk'),(93,74,'odio@pharetra.net'),(94,75,'natoque.penatibus.et@pede.edu'),(95,76,'eu.elit@fringillaestMauris.net'),(96,77,'libero.at@auctorMauris.co.uk'),(97,78,'augue.eu@Sednunc.edu'),(98,79,'nulla@lorem.ca'),(99,79,'arcu@etcommodo.com'),(100,80,'libero.at@auctorMauris.co.uk'),(101,80,'ac.metus.vitae@ornarefacilisiseget.ca'),(102,81,'Etiam.gravida@nectellus.org'),(103,82,'velit.eget@mauris.net'),(104,82,'Phasellus.dolor@liberolacusvarius.co.uk'),(105,83,'Suspendisse@tincidunt.ca'),(106,83,'vitae.odio.sagittis@nonlaciniaat.com'),(107,84,'Ut.tincidunt.vehicula@dictumplacerat.co.uk'),(108,85,'venenatis.a@amifringilla.com'),(109,86,'dapibus@egestas.co.uk'),(111,88,'Mauris.quis@Proinnon.co.uk'),(112,89,'conubia.nostra@consequatdolor.edu'),(113,90,'gravida.sagittis.Duis@nequepellentesquemassa.com'),(115,92,'dictum.mi@habitant.com'),(116,93,'Aliquam@liberoettristique.ca'),(117,93,'tincidunt@non.edu'),(118,94,'Nulla.semper@Nam.com'),(119,95,'pharetra.ut@orciDonecnibh.ca'),(120,96,'Mauris.quis@Proinnon.co.uk'),(121,96,'pharetra.felis.eget@dictumeueleifend.org'),(122,97,'in.aliquet.lobortis@pharetraQuisqueac.net'),(123,98,'metus.vitae@nec.co.uk'),(124,99,'Integer.urna@ProinultricesDuis.co.uk'),(126,101,'neque@auctornon.net'),(127,102,'tincidunt@orci.net'),(128,102,'enim.consequat.purus@Sedetlibero.ca'),(130,87,'ullamcorper.Duis@pedemalesuadavel.org'),(133,4,'epelayo@suempresa.com'),(134,28,'tincidunt@orci.net'),(135,36,'Aenean.egestas@et.org'),(136,91,'quam.dignissim@eget.com'),(137,24,'urna@ornarefacilisis.co.uk'),(149,100,'eleifend.vitae.erat@blanditmattisCras.ca'),(150,100,'plopezgrieco@gmail.com'),(151,100,'nuevo@gmail.com');
/*!40000 ALTER TABLE `correos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `telefonos`
--

DROP TABLE IF EXISTS `telefonos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `telefonos` (
  `id_telefono` int NOT NULL AUTO_INCREMENT,
  `fk_contacto` int DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_telefono`),
  KEY `contactos_idx` (`fk_contacto`),
  CONSTRAINT `contactos` FOREIGN KEY (`fk_contacto`) REFERENCES `contactos` (`idcontactos`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=203 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `telefonos`
--

LOCK TABLES `telefonos` WRITE;
/*!40000 ALTER TABLE `telefonos` DISABLE KEYS */;
INSERT INTO `telefonos` VALUES (9,5,'605240353'),(10,5,'606278042'),(11,6,'602828314'),(12,7,'604468766'),(14,9,'608822357'),(15,9,'607321648'),(16,10,'608611984'),(17,10,'602868086'),(18,11,'602776336'),(19,11,'607003433'),(20,12,'606233210'),(21,12,'609229263'),(22,13,'604503826'),(23,13,'608656607'),(24,14,'609139285'),(26,14,'602537821'),(27,15,'608279215'),(28,16,'605336519'),(29,16,'600816364'),(30,17,'601554414'),(31,17,'602659752'),(32,18,'606135984'),(33,19,'603465717'),(34,19,'609984415'),(35,20,'608471748'),(36,20,'603744018'),(38,22,'602225891'),(39,23,'600344325'),(40,23,'603562661'),(43,25,'609314064'),(44,25,'603548872'),(45,26,'609661983'),(46,26,'605915924'),(47,27,'601438217'),(50,29,'607238641'),(51,29,'605878501'),(52,29,'605265541'),(53,30,'606792595'),(54,30,'600444308'),(55,31,'601207912'),(56,31,'608835448'),(57,32,'602358405'),(58,32,'608526117'),(59,33,'600943910'),(63,35,'603635907'),(64,35,'602686512'),(67,37,'608632623'),(68,38,'606635452'),(69,38,'603688996'),(70,39,'607055797'),(71,39,'604299218'),(72,40,'609485586'),(73,40,'608313269'),(75,42,'605843574'),(76,42,'608367272'),(77,42,'607065533'),(78,43,'608141488'),(79,43,'604982025'),(80,44,'605199212'),(81,44,'601928527'),(82,45,'606710433'),(83,46,'607313789'),(84,46,'606397057'),(85,47,'605430502'),(86,47,'602755472'),(87,48,'606462868'),(88,48,'608556316'),(89,49,'607431662'),(90,49,'600020566'),(91,50,'605190656'),(92,50,'609140289'),(93,51,'604202135'),(94,51,'609415525'),(95,51,'606475065'),(98,53,'603700566'),(99,53,'604928293'),(100,54,'607885761'),(101,54,'601642331'),(102,54,'609535314'),(103,55,'601145639'),(104,55,'605689247'),(105,56,'609414659'),(106,56,'602955870'),(107,57,'602287533'),(108,57,'602138215'),(109,58,'606649256'),(110,58,'608368367'),(111,58,'602383463'),(112,59,'605093801'),(113,60,'600427598'),(114,60,'608825771'),(115,61,'601413453'),(116,61,'607700685'),(117,62,'608483063'),(118,62,'605962200'),(119,63,'600328464'),(120,63,'606413076'),(121,64,'605739383'),(122,64,'603394390'),(123,65,'601280903'),(124,66,'606702224'),(125,67,'605813957'),(126,67,'604143395'),(127,67,'606371304'),(128,68,'608592148'),(129,68,'608213628'),(132,70,'604060176'),(133,70,'604905766'),(134,71,'604873885'),(135,71,'608955145'),(136,72,'604019686'),(137,72,'600394541'),(138,73,'607530654'),(139,74,'601327804'),(140,74,'602011271'),(141,75,'603078930'),(142,75,'607813718'),(143,76,'609069380'),(144,76,'608370629'),(145,77,'604503789'),(146,78,'602882477'),(147,78,'608663151'),(148,79,'602456281'),(149,79,'603346214'),(150,80,'606208992'),(151,80,'604966869'),(152,81,'609960019'),(153,82,'608012191'),(154,82,'604158134'),(155,83,'609777446'),(156,84,'609960855'),(157,84,'600839705'),(158,85,'600054458'),(159,85,'600565564'),(160,86,'605263899'),(161,86,'602817252'),(163,88,'608084741'),(164,88,'609088030'),(165,89,'606667640'),(166,90,'604291174'),(167,90,'606550034'),(170,92,'601167912'),(171,92,'600738023'),(172,93,'606988799'),(173,93,'604416690'),(174,94,'608724159'),(175,94,'607155172'),(176,95,'608832399'),(177,95,'604903645'),(178,95,'600072626'),(179,96,'609316876'),(180,96,'605052709'),(181,97,'605943865'),(182,97,'601988815'),(183,97,'603975849'),(184,98,'604398162'),(185,98,'607116342'),(186,99,'601651202'),(187,99,'604903356'),(188,100,'608972074'),(189,100,'602327657'),(190,101,'602298622'),(191,101,'609403018'),(192,102,'606184189'),(193,102,'601336719'),(201,57,'607607607'),(202,100,'12345678');
/*!40000 ALTER TABLE `telefonos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-11-30 19:47:35

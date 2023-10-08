create table product (
  id                             varchar(36),  -- uuid
  -- -------------------------------------------------
  name          	 			 varchar(50),
  price           	 	         double,
  status           	 	         varchar(20),
  primary key (id)
);
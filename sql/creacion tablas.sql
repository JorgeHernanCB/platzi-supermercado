-- -----------------------------------------------------
-- Table "CATEGORIAS"
-- -----------------------------------------------------
CREATE TABLE CATEGORIAS (
  "id_categoria" NUMBER NOT NULL,
  "descripcion" VARCHAR2(45) NOT NULL,
  "estado" NUMBER NOT NULL,
  PRIMARY KEY ("id_categoria"));


-- -----------------------------------------------------
-- Table "PRODUCTOS"
-- -----------------------------------------------------
CREATE TABLE  PRODUCTOS (
  "id_producto" NUMBER NOT NULL,
  "nombre" VARCHAR2(45) NULL,
  "id_categoria" INT NOT NULL,
  "codigo_barras" VARCHAR2(150) NULL,
  "precio_venta" NUMBER(16,2) NULL,
  "cantidad_stock" INT NOT NULL,
  "estado" NUMBER NULL,
  PRIMARY KEY ("id_producto"),
  CONSTRAINT "fk_PRODUCTOS_CATEGORIAS"
    FOREIGN KEY ("id_categoria")
    REFERENCES CATEGORIAS ("id_categoria"));


-- -----------------------------------------------------
-- Table "CLIENTES"
-- -----------------------------------------------------
CREATE TABLE  CLIENTES (
  "id" VARCHAR2(20) NOT NULL,
  "nombre" VARCHAR2(40) NULL,
  "apellidos" VARCHAR2(100) NULL,
  "celular" NUMERIC NULL,
  "direccion" VARCHAR2(80) NULL,
  "correo_electronico" VARCHAR2(70) NULL,
  PRIMARY KEY ("id"));


-- -----------------------------------------------------
-- Table "COMPRAS"
-- -----------------------------------------------------
CREATE TABLE  COMPRAS (
  "id_compra" NUMBER NOT NULL,
  "id_cliente" VARCHAR2(20) NOT NULL,
  "fecha" TIMESTAMP NULL,
  "medio_pago" CHAR(1) NULL,
  "comentario" VARCHAR2(300) NULL,
  "estado" CHAR(1) NULL,
  PRIMARY KEY ("id_compra"),
  CONSTRAINT "fk_COMPRAS_CLIENTES1"
    FOREIGN KEY ("id_cliente")
    REFERENCES CLIENTES ("id"));


-- -----------------------------------------------------
-- Table "COMPRAS_PRODUCTOS"
-- -----------------------------------------------------
CREATE TABLE  COMPRAS_PRODUCTOS (
  "id_compra" INT NOT NULL,
  "id_producto" INT NOT NULL,
  "cantidad" INT NULL,
  "total" DECIMAL(16,2) NULL,
  "estado" NUMBER NULL,
  PRIMARY KEY ("id_compra", "id_producto"),
  CONSTRAINT "fk_COMPRAS_PRODUCTOS_PRODUCTOS1"
    FOREIGN KEY ("id_producto")
    REFERENCES PRODUCTOS ("id_producto"),
  CONSTRAINT "fk_COMPRAS_PRODUCTOS_COMPRAS1"
    FOREIGN KEY ("id_compra")
    REFERENCES COMPRAS ("id_compra"));
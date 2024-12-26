CREATE TABLE laboratoire(
   id SERIAL,
   label VARCHAR(50)  NOT NULL,
   PRIMARY KEY(id)
);

CREATE TABLE maladie(
   id INTEGER,
   label VARCHAR(50) ,
   PRIMARY KEY(id)
);

CREATE TABLE medicament(
   id SERIAL,
   label VARCHAR(50) ,
   en_stock INTEGER,
   labo_id INTEGER NOT NULL,
   PRIMARY KEY(id),
   FOREIGN KEY(labo_id) REFERENCES laboratoire(id)
);

CREATE TABLE medicament_maladie(
   id VARCHAR(50) ,
   maladie_id INTEGER NOT NULL,
   medicament_id INTEGER NOT NULL,
   PRIMARY KEY(id),
   FOREIGN KEY(maladie_id) REFERENCES maladie(id),
   FOREIGN KEY(medicament_id) REFERENCES medicament(id)
);

CREATE TABLE stock(
   id VARCHAR(50) ,
   date_mouvement VARCHAR(50) ,
   entree INTEGER,
   sortie INTEGER NOT NULL,
   medicament_id INTEGER NOT NULL,
   PRIMARY KEY(id),
   FOREIGN KEY(medicament_id) REFERENCES medicament(id)
);

CREATE TABLE vente(
   id SERIAL,
   date_vente TIMESTAMP NOT NULL,
   name VARCHAR(50) ,
   PRIMARY KEY(id)
);

CREATE TABLE vente_detaitls(
   id INTEGER,
   qte INTEGER,
   vente_id INTEGER NOT NULL,
   PRIMARY KEY(id),
   FOREIGN KEY(vente_id) REFERENCES vente(id)
);

CREATE TABLE medicament_maladie_non_compatible(
   id INTEGER,
   medicamen_id INTEGER NOT NULL,
   maladie_id INTEGER NOT NULL,
   PRIMARY KEY(id),
   FOREIGN KEY(medicamen_id) REFERENCES medicament(id),
   FOREIGN KEY(maladie_id) REFERENCES maladie(id)
);

CREATE TABLE Asso_6(
   medicament_id INTEGER,
   id INTEGER,
   PRIMARY KEY(medicament_id, id),
   FOREIGN KEY(medicament_id) REFERENCES medicament(id),
   FOREIGN KEY(id) REFERENCES vente_detaitls(id)
);

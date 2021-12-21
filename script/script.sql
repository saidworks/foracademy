DROP DATABASE IF EXISTS for_academy;
CREATE DATABASE for_academy;
USE for_academy;

CREATE TABLE utilisateur(
    id_user int(11) NOT NULL AUTO_INCREMENT,
    nom_user varchar(20),
    prenom_user varchar(20),
    genre_user boolean,
    telephone varchar(25),
    email varchar(55),
    password varchar(255),
    status_user boolean ,
    PRIMARY KEY (id_user),
    id_adress int,
    id_role int
    );

CREATE TABLE role(
    id_role int(11) NOT NULL AUTO_INCREMENT,
    nom_role varchar(11),
    PRIMARY KEY(id_role)
);
CREATE TABLE adresse(
    id_adress int(11) NOT NULL AUTO_INCREMENT,
    line_adress varchar(100),
    ville_adress varchar(25),
    code_postale_adress int (10),
    PRIMARY KEY (id_adress)
);
CREATE TABLE admin(
    id_admin int (11),
    PRIMARY KEY (id_admin)
);

CREATE TABLE secretaire(
    id_secretaire int ,
    date_recrutement_secret DATE,
    PRIMARY KEY (id_secretaire)
);

CREATE TABLE cheffabrique(
    id_cheffabrique int,
    date_recrutement_cheffabrique DATE,
    PRIMARY KEY (id_cheffabrique)
);

CREATE TABLE formateur(
    id_formateur int ,
    date_recrutement_formateur DATE,
    PRIMARY KEY (id_formateur),
    id_specialite int
);

CREATE TABLE etudiant(
    id_etudiant int (11),
    id_class int,
    id_specialite int,
    id_promo int,
    PRIMARY KEY (id_etudiant)
);

CREATE TABLE specialite(
    id_specialite int(11) NOT NULL AUTO_INCREMENT,
    nom_specialite varchar(11),
    PRIMARY KEY(id_specialite)
);
CREATE TABLE classe(
    id_class int(11) NOT NULL AUTO_INCREMENT,
    nom_class varchar(11),
    horaire_debut_class TIME,
    horaire_fin_class TIME,
    PRIMARY KEY(id_class),
    id_formateur int
);

CREATE TABLE promotion(
    id_promo int(11) NOT NULL AUTO_INCREMENT,
    nom_promo varchar(11),
    date_debut_promo DATE,
    date_fin_promo DATE,

    PRIMARY KEY(id_promo)
);
CREATE TABLE evenement(
    id_evenement int(11) NOT NULL AUTO_INCREMENT,
    nom_evenement varchar(11),
    date_debut_evenement DATETIME,
    date_fin_evenement DATETIME,
    status_evenement boolean,
    id_user int,

    PRIMARY KEY(id_evenement)
);


CREATE TABLE pointage(
    id_pointage int(11) NOT NULL AUTO_INCREMENT,
    h_arrivee_pointage DATETIME,
    h_depart_pointage DATETIME,
    date_pointage DATE,
    id_user int,

    PRIMARY KEY(id_pointage)
);

    ALTER TABLE pointage add constraint FK_userPoint Foreign key(id_user)  references utilisateur (id_user);
    ALTER TABLE utilisateur add constraint FK_role Foreign key(id_role) references role (id_role);
    ALTER TABLE utilisateur add constraint FK_adresse Foreign key(id_adress) references adresse (id_adress);
    ALTER TABLE admin add constraint FK_admin_user Foreign key(id_admin) references utilisateur (id_user);
    ALTER TABLE secretaire add constraint FK_secretaire Foreign key(id_secretaire) references utilisateur (id_user);
    ALTER TABLE cheffabrique add constraint FK_cheffabrique Foreign key(id_cheffabrique) references utilisateur (id_user);
    ALTER TABLE formateur add constraint FK_formateur Foreign key(id_formateur) references utilisateur (id_user);
    ALTER TABLE formateur add constraint FK_specialitFormateur Foreign key(id_specialite ) references specialite (id_specialite);
    ALTER TABLE etudiant add constraint FK_etudiant Foreign key(id_etudiant ) references utilisateur (id_user);
    ALTER TABLE etudiant add constraint FK_promo Foreign key(id_promo ) references promotion (id_promo);
    ALTER TABLE etudiant add constraint FK_specialiteEtudiant Foreign key(id_specialite ) references specialite (id_specialite);
    ALTER TABLE etudiant add constraint FK_class Foreign key(id_class ) references classe (id_class);
    ALTER TABLE classe add constraint FK_formateurClass Foreign key(id_formateur ) references formateur (id_formateur);
    ALTER TABLE evenement add constraint FK_userEvent Foreign key(id_user) references utilisateur (id_user);
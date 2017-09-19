BEGIN;

DROP TABLE IF EXISTS user_club;
DROP TABLE IF EXISTS "user";
DROP TABLE IF EXISTS club;
DROP TABLE IF EXISTS team;
DROP TABLE IF EXISTS team_class;
DROP TABLE IF EXISTS match;
DROP TABLE IF EXISTS field;

CREATE TABLE "user"
(
  uid                        SERIAL       NOT NULL,
  email_address              VARCHAR(255) NOT NULL UNIQUE,
  encrypted_password         VARCHAR(255) NOT NULL,
  email_address_confirmed_at TIMESTAMP,
  role                       INTEGER      NOT NULL,
  PRIMARY KEY (uid)
);

CREATE TABLE club
(
  uid  SERIAL      NOT NULL,
  name VARCHAR(50) NOT NULL UNIQUE,
  PRIMARY KEY (uid)
);

CREATE TABLE user_club
(
  user_uid INTEGER NOT NULL,
  club_uid INTEGER NOT NULL,
  PRIMARY KEY (user_uid, club_uid)
);
ALTER TABLE user_club
  ADD CONSTRAINT fk_user_club_user FOREIGN KEY (user_uid) REFERENCES "user" (uid);
ALTER TABLE user_club
  ADD CONSTRAINT fk_user_club_club FOREIGN KEY (club_uid) REFERENCES club (uid);

CREATE TABLE team_class
(
  uid          SERIAL      NOT NULL,
  abbreviation VARCHAR(10) NOT NULL UNIQUE,
  name         VARCHAR(20) NOT NULL UNIQUE,
  field_size   INTEGER     NOT NULL,
  PRIMARY KEY (uid)
);

CREATE TABLE team
(
  uid            SERIAL       NOT NULL,
  club_uid       INTEGER      NOT NULL,
  name           VARCHAR(100) NOT NULL,
  team_class_uid INTEGER      NOT NULL,
  gender         INTEGER      NOT NULL,
  PRIMARY KEY (uid)
);
ALTER TABLE team
  ADD CONSTRAINT fk_team_club FOREIGN KEY (club_uid) REFERENCES team (uid);

CREATE TABLE field
(
  uid        SERIAL      NOT NULL,
  club_uid   INTEGER     NOT NULL,
  name       VARCHAR(50) NOT NULL,
  field_size INTEGER     NOT NULL,
  PRIMARY KEY (uid)
);

CREATE TABLE match
(
  uid SERIAL NOT NULL,
  PRIMARY KEY (uid)
);

END;
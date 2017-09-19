BEGIN;

DROP TABLE IF EXISTS "user";

CREATE TABLE "user"
(
  uid                       SERIAL       NOT NULL,
  email_address              VARCHAR(20)  NOT NULL UNIQUE,
  encrypted_password        VARCHAR(255) NOT NULL,
  phone_number_confirmed_at TIMESTAMP,
  role                      INTEGER      NOT NULL,
  PRIMARY KEY (uid)
);

END;
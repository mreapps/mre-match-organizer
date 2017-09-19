BEGIN;

INSERT INTO "user" (email_address, encrypted_password, email_address_confirmed_at, role) VALUES
  ('espen@simensen.priv.no', '7d3cab515dc32e1313b16ece3f42e8f7a53fe8465d903bcacbe07a53611120d7d8daae46fdd8d1e9', current_timestamp, 9),
  ('camillaenger@hotmail.com', '7d3cab515dc32e1313b16ece3f42e8f7a53fe8465d903bcacbe07a53611120d7d8daae46fdd8d1e9', current_timestamp, 1),
  ('vetle@simensen.priv.no', '7d3cab515dc32e1313b16ece3f42e8f7a53fe8465d903bcacbe07a53611120d7d8daae46fdd8d1e9', NULL, 1)
;

INSERT INTO club (name) VALUES ('Vind IL');

INSERT INTO user_club (user_uid, club_uid) VALUES (1, 1), (2, 1);

INSERT INTO team_class (abbreviation, name, field_size) VALUES
  ('G-2006', 'Gutter født i 2006', 7),
  ('G-2007', 'Gutter født i 2007', 5),
  ('G-2008', 'Gutter født i 2008', 5),
  ('G-2009', 'Gutter født i 2009', 5),
  ('G-2010', 'Gutter født i 2010', 5),
  ('G-2011', 'Gutter født i 2011', 3),
  ('J-2006', 'Jenter født i 2006', 7),
  ('J-2007', 'Jenter født i 2007', 5),
  ('J-2008', 'Jenter født i 2008', 5),
  ('J-2009', 'Jenter født i 2009', 5),
  ('J-2010', 'Jenter født i 2010', 5),
  ('J-2011', 'Jenter født i 2011', 3)
;

INSERT INTO team (club_uid, name, team_class_uid, gender) VALUES
  (1, 'Vind G2007 - 1', 2, 1),
  (1, 'Vind G2007 - 2', 2, 1),
  (1, 'Vind G2007 - 3', 2, 1),
  (1, 'Vind G2007 - 4', 2, 1),
  (1, 'Vind G2007 - 5', 2, 1),
  (1, 'Vind G2007 - 6', 1, 1)
;

INSERT INTO field (club_uid, name, field_size) VALUES
  (1, 'Ballsletta 1', 5),
  (1, 'Ballsletta 2', 5),
  (1, 'Ballsletta 3', 5),
  (1, 'Ballsletta 4', 5),
  (1, 'Ballsletta 5', 5),
  (1, 'Ballsletta 6', 5)
;

END;
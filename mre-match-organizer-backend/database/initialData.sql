BEGIN;

INSERT INTO "user" (email_address, encrypted_password, email_address_confirmed_at, role) VALUES
  ('espen@simensen.priv.no', '7d3cab515dc32e1313b16ece3f42e8f7a53fe8465d903bcacbe07a53611120d7d8daae46fdd8d1e9', current_timestamp, 9),
  ('camillaenger@hotmail.com', '7d3cab515dc32e1313b16ece3f42e8f7a53fe8465d903bcacbe07a53611120d7d8daae46fdd8d1e9', current_timestamp, 1),
  ('vetle@simensen.priv.no', '7d3cab515dc32e1313b16ece3f42e8f7a53fe8465d903bcacbe07a53611120d7d8daae46fdd8d1e9', NULL, 1)
;

END;
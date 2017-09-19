BEGIN;

INSERT INTO "user" (phone_number, encrypted_password, phone_number_confirmed_at, role) VALUES
  ('95731327', '7d3cab515dc32e1313b16ece3f42e8f7a53fe8465d903bcacbe07a53611120d7d8daae46fdd8d1e9', current_timestamp, 9),
  ('98074157', '7d3cab515dc32e1313b16ece3f42e8f7a53fe8465d903bcacbe07a53611120d7d8daae46fdd8d1e9', current_timestamp, 1),
  ('97194029', '7d3cab515dc32e1313b16ece3f42e8f7a53fe8465d903bcacbe07a53611120d7d8daae46fdd8d1e9', NULL, 1)
;

INSERT into message (user_uid, sender, recipient, message_body, message_sent) VALUES
  ((select uid from "user" where phone_number='95731327'), 'Bart Simpson', '98074157', 'Do the Bartman', current_timestamp),
  ((select uid from "user" where phone_number='95731327'), 'Bart Simpson', '98074157', 'Do the Bartman!', current_timestamp),
  ((select uid from "user" where phone_number='95731327'), 'Lisa Simpson', '98074157', 'This town is just one piece of trash away from a toxic nightmare! But I knew you wouldn''t listen. So I took the liberty of pouring water from the lake in all your drinking glasses! ', current_timestamp),
  ((select uid from "user" where phone_number='98074157'), 'Bart Simpson', '98074157', 'Do the Bartman!!', current_timestamp),
  ((select uid from "user" where phone_number='98074157'), 'Homer Simpson', '98074157', 'Doh!', current_timestamp),
  ((select uid from "user" where phone_number='95731327'), 'Bart Simpson', '98074157', 'Do the Bartman!!!', current_timestamp)
;

END;
#!/bin/bash

psql -U fuzzms < fuzzms.ddl
psql -U fuzzms < initialData.sql

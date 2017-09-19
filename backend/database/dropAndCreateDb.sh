#!/bin/bash

psql -U matchorganizer < matchorganizer.ddl
psql -U matchorganizer < initialData.sql

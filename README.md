# GolfersStats
The backend of golfers stats
Uses Eclipse Jee 2018-12

1) Create a new empty Workspace in Eclipse
2) Type cmd into Cortana Search and start the command prompt
3) Change directory in command prompt to the new workspace directory
4) Then use the clone command:   git clone https://github.com/MattBell-SA/GolfersStats.git
5) In Eclipse, go to File -> Import and in the Wizard select General/Projects from Folder or Archive.
6) Select all and click Finish.
7) Build and run on Tomcat 8.0 server.

8) Create the database in PostgreSQL 10.6 using pgAdmin4:

CREATE DATABASE golf
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'English_United States.1252'
    LC_CTYPE = 'English_United States.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;


CREATE SCHEMA public
    AUTHORIZATION postgres;

COMMENT ON SCHEMA public
    IS 'standard public schema';

GRANT ALL ON SCHEMA public TO postgres;

GRANT ALL ON SCHEMA public TO PUBLIC;


CREATE SEQUENCE public."GOLFER_GOLFER_ID_seq";

ALTER SEQUENCE public."GOLFER_GOLFER_ID_seq"
    OWNER TO postgres;

CREATE TABLE public."GOLFER"
(
    "GOLFER_ID" integer NOT NULL DEFAULT nextval('"GOLFER_GOLFER_ID_seq"'::regclass),
    "GOLFER_TITLE" character varying(10) COLLATE pg_catalog."default",
    "GOLFER_NAME" character varying(200) COLLATE pg_catalog."default",
    "GOLFER_ADRESS" character varying(200) COLLATE pg_catalog."default",
    "GOLFER_HOME_COURSE" character varying(200) COLLATE pg_catalog."default",
    CONSTRAINT "GOLFER_ID_PK" PRIMARY KEY ("GOLFER_ID")
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public."GOLFER"
    OWNER to postgres;


9) Insert Data

INSERT INTO public."GOLFER"(
	"GOLFER_TITLE", "GOLFER_NAME", "GOLFER_ADRESS", "GOLFER_HOME_COURSE")
	VALUES ('Mr', 'John Rahm', 'New York', 'Royal New York');
  
INSERT INTO public."GOLFER"(
	"GOLFER_TITLE", "GOLFER_NAME", "GOLFER_ADRESS", "GOLFER_HOME_COURSE")
	VALUES ('Mr', 'Tiger Woods', 'California', 'Royal California');
  
INSERT INTO public."GOLFER"(
	"GOLFER_TITLE", "GOLFER_NAME", "GOLFER_ADRESS", "GOLFER_HOME_COURSE")
	VALUES ('Mr', 'Sergio Garcia', 'Satiago', 'Royal Norwood');


10) Go to http://localhost:8084/GolfersStats/rest/golfer

Json should appear:

[{"golferId":1,"golferTitle":"Mr","golferName":"Sam Newman","golferAddress":"22 Waterfall Gully","golferHomeCourse":"Royal Adelaide"},{"golferId":2,"golferTitle":"Mr","golferName":"Barry Newman","golferAddress":"666 Waterford Court","golferHomeCourse":"North Adelaide"},{"golferId":3,"golferTitle":"Mrs","golferName":"Annika Sorenstam","golferAddress":"Sandiago","golferHomeCourse":"Hollywood Golf Course"},{"golferId":4,"golferTitle":"Mrs","golferName":"Annika Sorenstam","golferAddress":"Sandiago","golferHomeCourse":"Hollywood Golf Course"},{"golferId":8,"golferTitle":"Mr","golferName":"Tiger Woods","golferAddress":"Los Angeles","golferHomeCourse":"Royal Los Angeles "},{"golferId":9,"golferTitle":"Mr","golferName":"Phil Mickelson","golferAddress":"New York","golferHomeCourse":"Royal New York"},{"golferId":10,"golferTitle":"Mr","golferName":"Phil Mickelson","golferAddress":"New York","golferHomeCourse":"Royal New York"},{"golferId":7,"golferTitle":"Mr","golferName":"Ted William","golferAddress":"Adelaide","golferHomeCourse":"Kooyonga Golf course"}]

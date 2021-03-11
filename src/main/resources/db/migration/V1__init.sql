--
-- PostgreSQL database dump
--

-- Dumped from database version 13.1
-- Dumped by pg_dump version 13.1

-- Started on 2021-03-11 22:51:56

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 203 (class 1259 OID 24587)
-- Name: account; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.account (
    id integer NOT NULL,
    balance integer NOT NULL
);


ALTER TABLE public.account OWNER TO postgres;

--
-- TOC entry 204 (class 1259 OID 24592)
-- Name: contest; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.contest (
    id integer NOT NULL
);


ALTER TABLE public.contest OWNER TO postgres;

--
-- TOC entry 200 (class 1259 OID 16413)
-- Name: hibernate_sequence; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.hibernate_sequence
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.hibernate_sequence OWNER TO postgres;

--
-- TOC entry 205 (class 1259 OID 24597)
-- Name: novel; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.novel (
    id integer NOT NULL
);


ALTER TABLE public.novel OWNER TO postgres;

--
-- TOC entry 206 (class 1259 OID 24602)
-- Name: translation; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.translation (
    id integer NOT NULL
);


ALTER TABLE public.translation OWNER TO postgres;

--
-- TOC entry 201 (class 1259 OID 16415)
-- Name: user_role; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.user_role (
    user_id bigint NOT NULL,
    roles character varying(255)
);


ALTER TABLE public.user_role OWNER TO postgres;

--
-- TOC entry 202 (class 1259 OID 16418)
-- Name: usr; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.usr (
    id bigint NOT NULL,
    email character varying(255),
    password character varying(255),
    username character varying(255)
);


ALTER TABLE public.usr OWNER TO postgres;

--
-- TOC entry 2874 (class 2606 OID 24591)
-- Name: account account_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.account
    ADD CONSTRAINT account_pkey PRIMARY KEY (id);


--
-- TOC entry 2876 (class 2606 OID 24596)
-- Name: contest contest_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.contest
    ADD CONSTRAINT contest_pkey PRIMARY KEY (id);


--
-- TOC entry 2878 (class 2606 OID 24601)
-- Name: novel novel_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.novel
    ADD CONSTRAINT novel_pkey PRIMARY KEY (id);


--
-- TOC entry 2880 (class 2606 OID 24606)
-- Name: translation translation_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.translation
    ADD CONSTRAINT translation_pkey PRIMARY KEY (id);


--
-- TOC entry 2872 (class 2606 OID 16425)
-- Name: usr usr_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usr
    ADD CONSTRAINT usr_pkey PRIMARY KEY (id);


--
-- TOC entry 2881 (class 2606 OID 16426)
-- Name: user_role fkfpm8swft53ulq2hl11yplpr5; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.user_role
    ADD CONSTRAINT fkfpm8swft53ulq2hl11yplpr5 FOREIGN KEY (user_id) REFERENCES public.usr(id);


-- Completed on 2021-03-11 22:51:56

--
-- PostgreSQL database dump complete
--


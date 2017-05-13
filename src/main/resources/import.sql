-- Table: public.weixin_app

DROP TABLE public.weixin_app;

CREATE TABLE public.weixin_app
(
    id uuid NOT NULL,
    app_id text COLLATE pg_catalog."default" NOT NULL,
    secret text COLLATE pg_catalog."default" NOT NULL,
    token text COLLATE pg_catalog."default" NOT NULL,
    ase_key text COLLATE pg_catalog."default",
    access_path text COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT weixin_app_pkey PRIMARY KEY (id),
    CONSTRAINT weixin_app_app_id_key UNIQUE (app_id),
    CONSTRAINT weixin_app_access_path_key UNIQUE (access_path)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.weixin_app
    OWNER to weixin;

INSERT INTO public.weixin_app (id, app_id, secret, token, ase_key, access_path) VALUES ('8e703264-b036-44b7-8222-398981a96d6e','wx063a8d6f8bcc4dc8', 'cfd5293de6b00362d128a8525cbbfbf1','ZjpostItZone9380','KFzHEy5OUevazBn8EeJXc9DGTca1q83p07TgorZpwvk','app01');

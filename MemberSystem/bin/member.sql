DROP TABLE bigMEMBER CASCADE CONSTRAINTS
CREATE TABLE BIGMEMBER(
ID VARCHAR2(500),
PW VARCHAR2(500),
NICK VARCHAR2(500)
);

INSERT INTO BIGMEMBER VALUES('PBK', '1234', '호두아빠');

insert into BIGMEMBER
values ('saga1897', 'kbs010203', '판다');

select * from bigmember;
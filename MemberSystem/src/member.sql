DROP TABLE bigMEMBER CASCADE CONSTRAINTS
CREATE TABLE BIGMEMBER(
ID VARCHAR2(500),
PW VARCHAR2(500),
NICK VARCHAR2(500)
);

INSERT INTO BIGMEMBER VALUES('PBK', '1234', 'ȣ�ξƺ�');

insert into BIGMEMBER
values ('saga1897', 'kbs010203', '�Ǵ�');

select * from bigmember;
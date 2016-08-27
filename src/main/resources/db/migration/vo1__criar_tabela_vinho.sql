/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  jose2
 * Created: 27/08/2016
 */
CREATE TABLE vinho(
        codigo SERIAL,
        nome VARCHAR(50) NOT NULL,
        tipo VARCHAR(50) NOT NULL,
        safra INT NOT NULL,
        volume INT NOT NULL,
        valor NUMERIC(10,2) NOT NULL,
        PRIMARY KEY (codigo)
  )

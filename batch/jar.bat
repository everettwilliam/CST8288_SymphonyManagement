@ECHO

cd ..

jar -cvfm CST8288_014_F16Project1_Holden-Everett_Sawyer-Victoria_Chubarev-Nadia_Jani-Tejasvirajes_Patterson-Kevin_Abdulhussain-Noor_SRC.jar manifest\manifestSRC.txt src
jar -cvfm CST8288_014_F16Project1_Holden-Everett_Sawyer-Victoria_Chubarev-Nadia_Jani-Tejasvirajes_Patterson-Kevin_Abdulhussain-Noor_BIN.jar manifest\manifestBIN.txt symphony\domain symphony\test
jar -cvfm CST8288_014_F16Project1_Holden-Everett_Sawyer-Victoria_Chubarev-Nadia_Jani-Tejasvirajes_Patterson-Kevin_Abdulhussain-Noor_DOC.jar manifest\manifestDOC.txt docs UML.jpg USECASE.jpg SEQDIAG.jpg

PAUSE

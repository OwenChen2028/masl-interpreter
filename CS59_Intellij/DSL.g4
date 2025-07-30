grammar DSL;

parse : statement* EOF;

statement : (' ' | ENDL)* ( declaration
                          | conditional | loop
                          | genStmt | printStmt ) '.' ENDL*;

declaration : numDec | listDec | templateDec;

numDec : ( (ID ' = ' expression) | numOp );

numOp : ('Increment ' ID) | ('Decrement ' ID);

listDec : ID ': ' possibleStr (', ' possibleStr)*;

templateDec : 'Begin Template ' ID ':' ENDL*
          (' ' | ENDL)* content ENDL* (' ' | ENDL)*
          'End Template';

conditional : 'Begin Check, If [' expression ']:' ENDL*
              statement*? (' ' | ENDL)*
              'End Check';

loop : 'Begin Loop, ' ( 'Repeat [' expression '] Times'
                      | 'While [' expression ']' ) ':' ENDL*
        statement*? (' ' | ENDL)*
        'End Loop';
        
genStmt : 'Generate ' ID;

printStmt : 'Print ' (possibleStr | expression);

expression : ( possibleNum (OP possibleNum)* )
           | ( possibleStr ' In ' ID );

possibleNum : NUM | ID | indexedID;

possibleStr : STR | ID | indexedID;

content : (substitution | CNT)*?;

substitution : (ID | indexedID);

indexedID : ID ' (' (expression | ('"Count"' | '"Random"')) ')';

CNT : ('`' .*? '{')
    | ('}' .*? '{')
    | ('}' .*? '`')
    | ('`' .*? '`');

ID : [a-zA-Z] [a-zA-Z0-9]*;
NUM : [0-9]+;
OP : ' ' ('+' | '-' | '*' | '/' | 'Mod'
         | 'Is' | '>=' | '<=' | '>' | '<'
         | 'And' | 'Or' | 'Not') ' ';
STR : '"' .*? '"';
ENDL : ('\r')? '\n';

COMMENT : '/*' .*? '*/' -> skip;
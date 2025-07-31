grammar DSL;

parse : statement* EOF;

statement : (' ' | ENDL)* ( declaration
                          | operation
                          | conditional | loop
                          | genStmt | ioStmt ) '.' (' ' | ENDL)*?;

declaration : numDec | listDec | templateDec;

numDec : ID ' = ' expression;

listDec : ID ': ' possibleStr (', ' possibleStr)*;

operation : numOp | listOp;

numOp : ('Increment ' ID)
      | ('Decrement ' ID);

listOp : 'Assign ' + (ID | indexedID) + ' To ' + possibleStr;

templateDec : 'Begin Template ' ID ':' ENDL*
              (' ' | ENDL)* content ENDL* (' ' | ENDL)*
              'End Template';

conditional : 'Begin Check, If ' expression ':' ENDL*
              statement*? (' ' | ENDL)*
              'End Check';

loop : 'Begin Loop, ' ( 'Repeat ' expression ' Times'
                      | 'While ' expression ) ':' ENDL*
        statement*? (' ' | ENDL)*
        'End Loop';
        
genStmt : 'Generate ' ID;

ioStmt : ( 'Read ' (ID | indexedID) )
       | ( 'Write ' (possibleStr | expression) );

expression : ( possibleNum (OP possibleNum)* )
           | ( possibleStr ' In ' ID );

possibleNum : NUM | ID | indexedID;

possibleStr : STR | ID | indexedID;

content : (substitution | BODY)*?;

substitution : (ID | indexedID);

indexedID : ID ' (' (expression | ('"Count"' | '"Random"')) ')';

BODY : ('`' .*? '{')
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
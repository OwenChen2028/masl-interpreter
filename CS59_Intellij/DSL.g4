grammar DSL;

parse : (statement)* statement? EOF;

statement : ( declaration
            | operation
            | conditional | loop
            | genStmt | ioStmt ) '.';

declaration : numDec | listDec | templateDec;

numDec : ID ' = ' expression;

listDec : ID ': ' possibleStr (', ' possibleStr)*;

operation : numOp | listOp;

numOp : ('Increment ' ID)
      | ('Decrement ' ID);

listOp : 'Assign ' + (ID | indexedID) + ' To ' + possibleStr;

templateDec : 'Begin Template ' ID ':\n'
              content
              '\nEnd Template';

conditional : 'Begin Check, If ' expression ':\n'
              statement*?
              '\nEnd Check';

loop : 'Begin Loop, ' ( 'Repeat ' expression ' Times'
                      | 'While ' expression ) ':\n'
        statement*?
        '\nEnd Loop';
        
genStmt : 'Generate ' ID;

ioStmt : ( 'Read ' (ID | indexedID) )
       | ( 'Write ' (possibleStr | expression) );

expression : ('Not ')? ( possibleNum (OP possibleNum)* )
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
OP : ('+' | '-' | '*' | '/' | ' Mod '
    | ' Is ' | '>=' | '<=' | '>' | '<'
    | ' And ' | ' Or ');
STR : '"' .*? '"';

WS : [ \t\r\n] -> skip;
COMMENT : '/*' .*? '*/' -> skip;
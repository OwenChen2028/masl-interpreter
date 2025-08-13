    grammar DSL;

    start : statement* EOF;

    statement : ( declaration
                | operation
                | conditional | loop
                | genStmt | ioStmt ) '.';

    declaration : numDec | listDec | templateDec;

    numDec : ID '=' expression;

    listDec : ID ':' possibleStr (',' possibleStr)*;

    operation : numOp | listOp;

    numOp : incOp | decOp;

    incOp : 'Increment ' ID (' By ' expression)?;

    decOp : 'Decrement ' ID (' By ' expression)?;

    listOp : setOp | randOp;

    setOp : 'Set ' ID ('(' expression ')')? ' To ' possibleStr;

    randOp : 'Randomize ' ID;

    templateDec : 'Begin Template ' ID ':'
                  content
                  'End Template';

    conditional : 'Begin Check,'
                  'If ' expression ':'
                  statement*?
                  'End Check';

    loop : repeatLoop | whileLoop;

    repeatLoop : 'Begin Loop,'
                 ('Incrementing ' ID ',')?
                 'Repeat ' expression ' Times:'
                 statement*?
                 'End Loop';

    whileLoop : 'Begin Loop,'
                ('Incrementing ' ID ',')?
                'While ' expression ':'
                statement*?
                'End Loop';

    genStmt : 'Generate ' ID;

    ioStmt : readStmt | writeStmt;

    readStmt : 'Read ' ID;

    writeStmt : 'Write ' (possibleStr | expression);

    expression : possibleNum (OP possibleNum)*;

    possibleNum : NUM | ID | indexedID;

    possibleStr : STR | ID | indexedID;

    indexedID : ID '(' expression ')';

    content : contentItem*?;

    contentItem : possibleStr | BODY;

    BODY : ('`' (~'`')*? '{')
         | ('}' (~'`')*? '{')
         | ('}' (~'`')*? '`')
         | ('`' (~'`')*? '`');

    ID : [a-zA-Z] [a-zA-Z0-9_]*;
    NUM : '-'? [0-9]+;
    OP : ('+' | '-' | '*' | '/' | ' Mod '
        | ' Is ' | ' Isn\'t ' | '>=' | '<=' | '>' | '<'
        | ' And ' | ' Or ');
    STR : '"' .*? '"';

    COMMENT : ('/*' .*? '*/') -> skip;
    WS : [ \t\r\n] -> skip;
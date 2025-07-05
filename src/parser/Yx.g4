grammar Yx;

// The gramma for the parser.
program: (varDeclaration|funcDeclaration|classDeclaration)* EOF;

type: Int|Bool|Void|Str;

varDef: Identifier('=' expr)? ;
varDeclaration
    :type varDef(','varDef)* ';' ;

parameter: type Identifier;
parameterList: parameter (',' parameter)*;
funcDeclaration: type Identifier '('parameterList?')' block ;

constructorDeclaration
    :Identifier '(' parameterList? ')' block
    ;

classMember
    : varDeclaration
    | funcDeclaration
    | constructorDeclaration
    ;

classDeclaration
    : 'class' Identifier '{' classMember* '}'
    ;

block
    :'{'statement*'}'
    ;

statement
    : block                                     # blockstmt
    | If '(' expr ')' trueStmt=statement
      (Else falseStmt=statement)?               # ifstmt
    | While '(' expr ')' statement              # whilestmt
    | For '(' (initializationStatement=statement)';'(forConditionExpression=expr)';'(stepExpression=expr)
      bodyStatement=statement                   # forstmt
    | Return expr ';'                           # returnstmt
    | (Break|Continue)';'                       # jmpstmt
    | varDeclaration                            # varDefstmt
    | expr';'                                   # expressionstmt
    |';'                                        # emptystmt
    ;

literal
    :Integer
    |True
    |False
    |String
    ;

argumentList
    : expr(','expr)*
    ;

expr
    :   '(' expr ')'                                        # subExpr

    |   expr op=('++'|'--')                                 # postfix
    |   expr '(' argumentList? ')'                          # functionCall
    |   expr  '.' Identifier                                # memberAccess

    |   <assoc=right> op=('++' | '--') expr                 # unaryExpr
    |   <assoc=right> op=('+' | '-') expr                   # unaryExpr
    |   <assoc=right> op=('!' | '~') expr                   # unaryExpr

    |   lhs=expr op=('*' | '/' | '%') rhs=expr              # binaryExpr
    |   lhs=expr op=('+' | '-') rhs=expr                    # binaryExpr
    |   lhs=expr op=('<<' | '>>') rhs=expr                  # binaryExpr
    |   lhs=expr op=('>=' | '>' | '<=' | '<') rhs=expr      # binaryExpr
    |   lhs=expr op=('==' | '!=') rhs=expr                  # binaryExpr
    |   lhs=expr op='&' rhs=expr                            # binaryExpr
    |   lhs=expr op='^' rhs=expr                            # binaryExpr
    |   lhs=expr op='|' rhs=expr                            # binaryExpr
    |   lhs=expr op='&&' rhs=expr                           # binaryExpr
    |   lhs=expr op='||' rhs=expr                           # binaryExpr

    |   <assoc=right> expr '?' expr ':' expr                # ternary
    |   expr '=' expr                                       # assignment

    |   Identifier                                          # variable
    |   literal                                             # constant
    ;

// The gamma for the lexer.
Identifier: [a-z][a-zA-Z_0-9]*;

Int:'int';
Bool:'bool';
Void:'void';
Str:'string';

Integer
    :[1-9][0-9]*
    |'0'
    ;
String
   : '"' ( '\\' . | ~[\\"] )* '"'
   ;
True:'true';
False:'flase';

SelfAdd:'++';
SelfMinus:'--';
Plus:'+';
Minus:'-';
Mult:'*';
Div:'/';
Mod:'%';

GreatThan:'>';
LessThan:'<';
GEThan:'>=';
LEThan:'<=';
NEqual:'!=';
Equal:'==';

LogicAnd:'&&';
LogicOr:'||';
LogicNot:'!';
And:'&';
Or:'|';
Xor:'^';
Not:'~';

LeftShift:'<<';
RightShift:'>>';

Assign:'=';

LParen:'(';
RParen:')';
LBracket:'[';
RBracket:']';
LBrace:'{';
RBrace:'}';

Question:'?';
Colon:':';
Semi:';';
Comma:',';
Dot:'.';

If:'if';
Else:'else';
For:'for';
While:'while';
Break:'break';
Continue:'continue';
Return:'return';

WhiteSpace
    :   [ \t\r\n]+
        -> skip
    ;

BlockComment
    : '/*' .*? '*/'
    -> skip
    ;

LineComment
    : '//' ~[\r\n]*
    -> skip
    ;
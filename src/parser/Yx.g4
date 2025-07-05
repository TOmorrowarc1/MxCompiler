grammar Yx;

// The gramma for the parser.
program: (varDeclaration|funcDeclaration|classDeclaration)* EOF;

type: Int|Bool|Void|Str;

varDeclaration
    :type varDef(','varDef)* ';' ;
varDef: Identifier('=' expr)? ;

funcDeclaration: type Identifier '('parameterList?')' block ;
parameterList: parameter (',' parameter)*;
parameter: type Identifier;
functionCall: Identifier'('argumentList?')';
argumentList: expr(','expr)*;

classDeclaration
    : 'class' Identifier '{' classMember* '}'
    ;

classMember
    : varDeclaration
    | funcDeclaration
    | constructorDeclaration
    ;

constructorDeclaration
    :Identifier '(' parameterList? ')' block
    ;

block
    :'{'statement*'}'
    ;

statement
    : block                                     #blockstmt
    | If '(' expr ')' trueStmt=statement
      (Else falseStmt=statement)?               #ifstmt
    | While '(' expr ')' statement              #whilestmt
    | For '(' (initializationStatement=statement)';'(forConditionExpression=expr)';'(stepExpression=expr)
      bodyStatement=statement                   #forstmt
    | Return expr ';'                           #returnstmt
    | (Break|Continue)';'                       #jmpstmt
    | varDeclaration                            #varDefstmt
    | expr';'                                   #expressionstmt
    |';'                                        #emptystmt
    ;

expr:assignmentExpr;

assignmentExpr
    : logicOrExpr                                           #assignOrExpr
    | <assoc=right> unaryExpr '=' assignmentExpr            #assignExpr
    ;

logicOrExpr
    : logicAndExpr                                          #logicOrAndExpr
    | lhs=logicAndExpr LogicOr rhs=logicAndExpr             #logicOrBinaryExpr
    ;

logicAndExpr
    : bitOrExpr                                          #logicAndbitExpr
    | lhs=bitAndExpr LogicAnd rhs=bitAndExpr             #logicAndBinaryExpr
    ;

bitOrExpr
    : bitAndExpr                                   #bitOrAndExpr
    | lhs=bitAndExpr Or rhs=bitAndExpr             #bitOrBinaryExpr
    ;

bitAndExpr
    : equalExpr                                  #bitAndEqualExpr
    | lhs=equalExpr And rhs=equalExpr            #bitAndBinaryExpr
    ;

equalExpr
    : compareExpr                                           #equalCompareExpr
    | lhs=compareExpr op=(Equal|NEqual) rhs=compareExpr     #equalBinaryExpr
    ;

compareExpr
    : shiftExpr                                                             #compareShiftExpr
    | lhs=shiftExpr op=(GreatThan|GEThan|LEThan|LessThan) rhs=shiftExpr     #compareBinaryExpr
    ;

shiftExpr
    : addExpr                                               #shiftAddExpr
    | lhs=addExpr op=(LeftShift|RightShift) rhs=addExpr     #shiftBinaryExpr
    ;

addExpr
    : multExpr                                      #addMultExpr
    | lhs=multExpr op=(Plus|Minus) rhs=multExpr     #addBinaryExpr
    ;

multExpr
    : unaryExpr                                     #multUnaryExpr
    | lhs=unaryExpr op=(Mult|Div|Mod) rhs=unaryExpr #multBinaryExpr
    ;

unaryExpr
    : postfixExpr                               #unaryPostfixExpr
    | op=(SelfAdd|SelfMinus) postfixExpr        #unaryPrefixIncDecExpr
    | op=(Minus|LogicNot|Not) postfixExpr       #unaryOpExpr
    ;

postfixExpr
    : primary                           #postfixPrimaryExpr
    | primary op=(SelfAdd|SelfMinus)    #postfixIncDecExpr
    | postfixExpr '.' Identifier        #postfixMember
    | postfixExpr '(' argumentList? ')' #postfixMemberFunction
    ;

primary
    :'(' expr ')'                       #primaryExpr
    | literal                           #primaryLiteral
    | Identifier                        #primaryIdentifier
    | functionCall                      #primaryFunction
    ;

literal
    :Integer
    |True
    |False
    |String
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
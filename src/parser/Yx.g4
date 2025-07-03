grammar Yx;

// The gramma for the parser.
program: function* EOF;

function: Int 'main()' block ;

block:'{'statement*'}';

statement
    : block                                     #blockstmt
    | If '(' expr ')' trueStmt=statement
      (Else falseStmt=statement)?               #ifstmt
    | While '(' expr ')' statement              #whilestmt
    | For '(' (initializationStatement=statement)';'(forConditionExpression=expr)';'(stepExpression=expr)
      bodyStatement=statement                   #forstmt
    | Return expr ';'                           #returnstmt
    | Break ';'                                 #breakstmt
    | Continue ';'                              #continuestmt
    | varDef ';'                                #varDefstmt
    | expr';'                                   #expressionstmt
    |';'                                        #emptystmt
    ;

varDef
    : Int def (','def)* ';'                     #intvardef
    | Bool def (',' def) ';'                    #boolvardef
    ;
def: Identifier('=' expr)? ;


expr:assignmentExpr;

assignmentExpr
    : logicOrExpr                                           #lastLevelExpr
    | <assoc=right> Identifier '=' assignmentExpr           #assignExpr
    ;

logicOrExpr
    : logicAndExpr                                          #logicOrUnaryExpr
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
    ;

primary
    :'(' expr ')'
    | literal
    | Identifier
    ;

literal
    :Integer
    |True
    |False
    ;
// The gamma for the lexer.
Identifier: [a-z][a-zA-Z_0-9]*;

Int:'int';
Bool:'bool';
Void:'void';

Integer
    :[1-9][0-9]*
    |'0'
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

WS:     [ \t\r\n]+ -> skip; // 忽略空白字符
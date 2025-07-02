grammar Yx;

// The gramma for the parser.
expr:   expr ('+'|'-') expr  # AddSub
    |   INT                  # Number
    |   '(' expr ')'         # Parens
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
grammar Yx;

//I jump the array constant for convinience, acturally it should distiguish from block statement.
// The gramma for the parser.
program
    :   (declaration)* EOF
    ;

declaration
    :varDeclaration
    |funcDeclaration
    |classDeclaration
    ;

baseType
    :   Int|Bool|Void|Str|Identifier
    ;

type
    :   baseType(LBrack RBrack)*
    ;

varDef
    :   Identifier('=' expr)?
    ;

varDeclaration
    :   type varDef(','varDef)* ';'
    ;

parameter
    :   type Identifier
    ;
parameterList
    :   parameter (',' parameter)*
    ;
funcDeclaration
    :   type Identifier '('parameterList?')' block
    ;

constructorDeclaration
    :   Identifier '(' ')' block
    ;

classMember
    :   varDeclaration
    |   funcDeclaration
    |   constructorDeclaration
    ;

classDeclaration
    :   'class' Identifier '{' classMember* '}' ';'
    ;

block
    :   '{'statement*'}'
    ;

statement
    :   block                                     # blockstmt
    |   If '(' expr ')' trueStmt=statement
        (Else falseStmt=statement)?               # ifstmt
    |   While '(' expr ')' statement              # whilestmt
    |   For '(' (initializationStatement=statement)(forConditionExpression=expr)';'(stepExpression=expr) ')'
        bodyStatement=statement                   # forstmt
    |   Return expr? ';'                          # returnstmt
    |   (Break|Continue)';'                       # jmpstmt
    |   varDeclaration                            # varDefstmt
    |   expr';'                                   # expressionstmt
    |   ';'                                       # emptystmt
    ;

literal
    :   Integer
    |   True
    |   False
    |   String
    |   Null
    ;

argumentList
    :   expr(','expr)*
    ;

newTarget
    :   Identifier('('')')?                                   # newClass
    |   baseType('[' expr ']')+('['']')*                      # newArray
    ;

expr
    :   '(' expr ')'                                        # subExpr

    |   expr op=('++'|'--')                                 # postfix
    |   expr '(' argumentList? ')'                          # functionCall
    |   array=expr '[' index=expr ']'                       # arrayVisit
    |   expr  '.' Identifier                                # classAccess

    |   <assoc=right> op=('++' | '--') expr                 # unaryExpr
    |   <assoc=right> op='-' expr                           # unaryExpr
    |   <assoc=right> op=('!' | '~') expr                   # unaryExpr
    |   <assoc=right> New newTarget                         # newExpr

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

    |   <assoc=right> condition=expr '?' trueExpr=expr ':' falseExpr=expr
                                                            # ternary
    |   lhs=expr '=' rhs=expr                               # assignment

    |   This                                                # thisExpr
    |   Identifier                                          # variable
    |   literal                                             # constant
    ;

// The gamma for the lexer.
Int:'int';
Bool:'bool';
Void:'void';
Str:'string';

True:'true';
False:'false';
Null:'null';

If:'if';
Else:'else';
For:'for';
While:'while';
Break:'break';
Continue:'continue';
Return:'return';
New:'new';
This:'this';

Identifier: [a-zA-Z_][a-zA-Z_0-9]*;
LParent:'(';
RParent:')';
LBrack:'[';
RBrack:']';

Integer
    :[1-9][0-9]*
    |'0'
    ;

String
   : '"' ( '\\' . | ~[\\"] )* '"'
   ;

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
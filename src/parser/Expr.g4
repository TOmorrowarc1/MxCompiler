grammar Expr;

// 语法规则（允许整数加减法，如 "1+2-3"）
expr:   expr ('+'|'-') expr  # AddSub
    |   INT                  # Number
    |   '(' expr ')'         # Parens
    ;

// 词法规则
INT:    [0-9]+;             // 匹配整数
WS:     [ \t\r\n]+ -> skip; // 忽略空白字符
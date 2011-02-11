lexer grammar InternalPhysis;
@header {
package com.itemis.mobile.physis.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'datamodel' ;
T12 : '{' ;
T13 : '}' ;
T14 : 'type' ;
T15 : 'entity' ;
T16 : ':' ;
T17 : '[]' ;

// $ANTLR src "../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g" 468
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g" 470
RULE_INT : ('0'..'9')+;

// $ANTLR src "../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g" 472
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g" 474
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g" 476
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g" 478
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g" 480
RULE_ANY_OTHER : .;



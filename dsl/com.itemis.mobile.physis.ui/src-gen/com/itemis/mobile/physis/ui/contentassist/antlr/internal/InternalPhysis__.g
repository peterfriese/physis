lexer grammar InternalPhysis;
@header {
package com.itemis.mobile.physis.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'datamodel' ;
T12 : '{' ;
T13 : '}' ;
T14 : 'type' ;
T15 : 'entity' ;
T16 : '[]' ;

// $ANTLR src "../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g" 877
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g" 879
RULE_INT : ('0'..'9')+;

// $ANTLR src "../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g" 881
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g" 883
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g" 885
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g" 887
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g" 889
RULE_ANY_OTHER : .;



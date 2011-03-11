/*
* generated by Xtext
*/
grammar InternalPhysis;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package com.itemis.mobile.physis.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package com.itemis.mobile.physis.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.itemis.mobile.physis.services.PhysisGrammarAccess;

}

@parser::members {
 
 	private PhysisGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(PhysisGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleModel
entryRuleModel 
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getModelAccess().getDatamodelsAssignment()); }
(rule__Model__DatamodelsAssignment)*
{ after(grammarAccess.getModelAccess().getDatamodelsAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleDataModel
entryRuleDataModel 
:
{ before(grammarAccess.getDataModelRule()); }
	 ruleDataModel
{ after(grammarAccess.getDataModelRule()); } 
	 EOF 
;

// Rule DataModel
ruleDataModel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getDataModelAccess().getGroup()); }
(rule__DataModel__Group__0)
{ after(grammarAccess.getDataModelAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleType
entryRuleType 
:
{ before(grammarAccess.getTypeRule()); }
	 ruleType
{ after(grammarAccess.getTypeRule()); } 
	 EOF 
;

// Rule Type
ruleType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getTypeAccess().getAlternatives()); }
(rule__Type__Alternatives)
{ after(grammarAccess.getTypeAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMappingClause
entryRuleMappingClause 
:
{ before(grammarAccess.getMappingClauseRule()); }
	 ruleMappingClause
{ after(grammarAccess.getMappingClauseRule()); } 
	 EOF 
;

// Rule MappingClause
ruleMappingClause
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMappingClauseAccess().getGroup()); }
(rule__MappingClause__Group__0)
{ after(grammarAccess.getMappingClauseAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleSimpleType
entryRuleSimpleType 
:
{ before(grammarAccess.getSimpleTypeRule()); }
	 ruleSimpleType
{ after(grammarAccess.getSimpleTypeRule()); } 
	 EOF 
;

// Rule SimpleType
ruleSimpleType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getSimpleTypeAccess().getGroup()); }
(rule__SimpleType__Group__0)
{ after(grammarAccess.getSimpleTypeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleEntity
entryRuleEntity 
:
{ before(grammarAccess.getEntityRule()); }
	 ruleEntity
{ after(grammarAccess.getEntityRule()); } 
	 EOF 
;

// Rule Entity
ruleEntity
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEntityAccess().getGroup()); }
(rule__Entity__Group__0)
{ after(grammarAccess.getEntityAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAttribute
entryRuleAttribute 
:
{ before(grammarAccess.getAttributeRule()); }
	 ruleAttribute
{ after(grammarAccess.getAttributeRule()); } 
	 EOF 
;

// Rule Attribute
ruleAttribute
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAttributeAccess().getGroup()); }
(rule__Attribute__Group__0)
{ after(grammarAccess.getAttributeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}




// Rule Platform
rulePlatform
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPlatformAccess().getAlternatives()); }
(rule__Platform__Alternatives)
{ after(grammarAccess.getPlatformAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Type__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0()); }
	ruleSimpleType
{ after(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); }
	ruleEntity
{ after(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Platform__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPlatformAccess().getIOSEnumLiteralDeclaration_0()); }
(	'iOS' 
)
{ after(grammarAccess.getPlatformAccess().getIOSEnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getPlatformAccess().getAndroidEnumLiteralDeclaration_1()); }
(	'Android' 
)
{ after(grammarAccess.getPlatformAccess().getAndroidEnumLiteralDeclaration_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__DataModel__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataModel__Group__0__Impl
	rule__DataModel__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DataModel__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataModelAccess().getDatamodelKeyword_0()); }

	'datamodel' 

{ after(grammarAccess.getDataModelAccess().getDatamodelKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataModel__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataModel__Group__1__Impl
	rule__DataModel__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DataModel__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataModelAccess().getNameAssignment_1()); }
(rule__DataModel__NameAssignment_1)
{ after(grammarAccess.getDataModelAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataModel__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataModel__Group__2__Impl
	rule__DataModel__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DataModel__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataModel__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataModel__Group__3__Impl
	rule__DataModel__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DataModel__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataModelAccess().getTypesAssignment_3()); }
(rule__DataModel__TypesAssignment_3)*
{ after(grammarAccess.getDataModelAccess().getTypesAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataModel__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataModel__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DataModel__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MappingClause__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MappingClause__Group__0__Impl
	rule__MappingClause__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MappingClause__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMappingClauseAccess().getIsKeyword_0()); }

	'is' 

{ after(grammarAccess.getMappingClauseAccess().getIsKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MappingClause__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MappingClause__Group__1__Impl
	rule__MappingClause__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MappingClause__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMappingClauseAccess().getMappedTypeAssignment_1()); }
(rule__MappingClause__MappedTypeAssignment_1)
{ after(grammarAccess.getMappingClauseAccess().getMappedTypeAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MappingClause__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MappingClause__Group__2__Impl
	rule__MappingClause__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MappingClause__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMappingClauseAccess().getOnPlatformKeyword_2()); }

	'on platform' 

{ after(grammarAccess.getMappingClauseAccess().getOnPlatformKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MappingClause__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MappingClause__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MappingClause__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMappingClauseAccess().getPlatformAssignment_3()); }
(rule__MappingClause__PlatformAssignment_3)
{ after(grammarAccess.getMappingClauseAccess().getPlatformAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__SimpleType__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SimpleType__Group__0__Impl
	rule__SimpleType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleType__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0()); }

	'type' 

{ after(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SimpleType__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SimpleType__Group__1__Impl
	rule__SimpleType__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleType__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSimpleTypeAccess().getNameAssignment_1()); }
(rule__SimpleType__NameAssignment_1)
{ after(grammarAccess.getSimpleTypeAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SimpleType__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SimpleType__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleType__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSimpleTypeAccess().getMappingsAssignment_2()); }
(rule__SimpleType__MappingsAssignment_2)*
{ after(grammarAccess.getSimpleTypeAccess().getMappingsAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Entity__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group__0__Impl
	rule__Entity__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getEntityKeyword_0()); }

	'entity' 

{ after(grammarAccess.getEntityAccess().getEntityKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group__1__Impl
	rule__Entity__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getNameAssignment_1()); }
(rule__Entity__NameAssignment_1)
{ after(grammarAccess.getEntityAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group__2__Impl
	rule__Entity__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group__3__Impl
	rule__Entity__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getAttributesAssignment_3()); }
(rule__Entity__AttributesAssignment_3)*
{ after(grammarAccess.getEntityAccess().getAttributesAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Attribute__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group__0__Impl
	rule__Attribute__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getNameAssignment_0()); }
(rule__Attribute__NameAssignment_0)
{ after(grammarAccess.getAttributeAccess().getNameAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group__1__Impl
	rule__Attribute__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getColonKeyword_1()); }

	':' 

{ after(grammarAccess.getAttributeAccess().getColonKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group__2__Impl
	rule__Attribute__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getTypeAssignment_2()); }
(rule__Attribute__TypeAssignment_2)
{ after(grammarAccess.getAttributeAccess().getTypeAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getMultiplicityAssignment_3()); }
(rule__Attribute__MultiplicityAssignment_3)?
{ after(grammarAccess.getAttributeAccess().getMultiplicityAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}











rule__Model__DatamodelsAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getDatamodelsDataModelParserRuleCall_0()); }
	ruleDataModel{ after(grammarAccess.getModelAccess().getDatamodelsDataModelParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DataModel__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataModelAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getDataModelAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DataModel__TypesAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataModelAccess().getTypesTypeParserRuleCall_3_0()); }
	ruleType{ after(grammarAccess.getDataModelAccess().getTypesTypeParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MappingClause__MappedTypeAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMappingClauseAccess().getMappedTypeIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getMappingClauseAccess().getMappedTypeIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MappingClause__PlatformAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMappingClauseAccess().getPlatformPlatformEnumRuleCall_3_0()); }
	rulePlatform{ after(grammarAccess.getMappingClauseAccess().getPlatformPlatformEnumRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleType__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleType__MappingsAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSimpleTypeAccess().getMappingsMappingClauseParserRuleCall_2_0()); }
	ruleMappingClause{ after(grammarAccess.getSimpleTypeAccess().getMappingsMappingClauseParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__AttributesAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0()); }
	ruleAttribute{ after(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__NameAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); }
	RULE_ID{ after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__TypeAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_2_0()); }
(
{ before(grammarAccess.getAttributeAccess().getTypeTypeIDTerminalRuleCall_2_0_1()); }
	RULE_ID{ after(grammarAccess.getAttributeAccess().getTypeTypeIDTerminalRuleCall_2_0_1()); }
)
{ after(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__MultiplicityAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getMultiplicityLeftSquareBracketRightSquareBracketKeyword_3_0()); }
(
{ before(grammarAccess.getAttributeAccess().getMultiplicityLeftSquareBracketRightSquareBracketKeyword_3_0()); }

	'[]' 

{ after(grammarAccess.getAttributeAccess().getMultiplicityLeftSquareBracketRightSquareBracketKeyword_3_0()); }
)

{ after(grammarAccess.getAttributeAccess().getMultiplicityLeftSquareBracketRightSquareBracketKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;



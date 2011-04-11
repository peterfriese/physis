/*
* generated by Xtext
*/
grammar InternalPhysis;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package com.itemis.mobile.physis.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package com.itemis.mobile.physis.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.itemis.mobile.physis.services.PhysisGrammarAccess;

}

@parser::members {

 	private PhysisGrammarAccess grammarAccess;
 	
    public InternalPhysisParser(TokenStream input, PhysisGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Model";	
   	}
   	
   	@Override
   	protected PhysisGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getDatamodelsDataModelParserRuleCall_0()); 
	    }
		lv_datamodels_0_0=ruleDataModel		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"datamodels",
        		lv_datamodels_0_0, 
        		"DataModel");
	        afterParserOrEnumRuleCall();
	    }

)
)*
;





// Entry rule entryRuleDataModel
entryRuleDataModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDataModelRule()); }
	 iv_ruleDataModel=ruleDataModel 
	 { $current=$iv_ruleDataModel.current; } 
	 EOF 
;

// Rule DataModel
ruleDataModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='datamodel' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getDataModelAccess().getDatamodelKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getDataModelAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDataModelRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDataModelAccess().getEntitiesEntityParserRuleCall_3_0()); 
	    }
		lv_entities_3_0=ruleEntity		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDataModelRule());
	        }
       		add(
       			$current, 
       			"entities",
        		lv_entities_3_0, 
        		"Entity");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleDateType
entryRuleDateType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDateTypeRule()); }
	 iv_ruleDateType=ruleDateType 
	 { $current=$iv_ruleDateType.current; } 
	 EOF 
;

// Rule DateType
ruleDateType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getDateTypeAccess().getDateTypeAction_0(),
            $current);
    }
)	otherlv_1='Date' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getDateTypeAccess().getDateKeyword_1());
    }
)
;





// Entry rule entryRuleIntegerType
entryRuleIntegerType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getIntegerTypeRule()); }
	 iv_ruleIntegerType=ruleIntegerType 
	 { $current=$iv_ruleIntegerType.current; } 
	 EOF 
;

// Rule IntegerType
ruleIntegerType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getIntegerTypeAccess().getIntegerTypeAction_0(),
            $current);
    }
)	otherlv_1='Integer' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getIntegerTypeAccess().getIntegerKeyword_1());
    }
)
;





// Entry rule entryRuleDoubleType
entryRuleDoubleType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDoubleTypeRule()); }
	 iv_ruleDoubleType=ruleDoubleType 
	 { $current=$iv_ruleDoubleType.current; } 
	 EOF 
;

// Rule DoubleType
ruleDoubleType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getDoubleTypeAccess().getDoubleTypeAction_0(),
            $current);
    }
)	otherlv_1='Double' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getDoubleTypeAccess().getDoubleKeyword_1());
    }
)
;





// Entry rule entryRuleFloatType
entryRuleFloatType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFloatTypeRule()); }
	 iv_ruleFloatType=ruleFloatType 
	 { $current=$iv_ruleFloatType.current; } 
	 EOF 
;

// Rule FloatType
ruleFloatType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getFloatTypeAccess().getFloatTypeAction_0(),
            $current);
    }
)	otherlv_1='Float' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getFloatTypeAccess().getFloatKeyword_1());
    }
)
;





// Entry rule entryRuleStringType
entryRuleStringType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStringTypeRule()); }
	 iv_ruleStringType=ruleStringType 
	 { $current=$iv_ruleStringType.current; } 
	 EOF 
;

// Rule StringType
ruleStringType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getStringTypeAccess().getStringTypeAction_0(),
            $current);
    }
)	otherlv_1='String' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getStringTypeAccess().getStringKeyword_1());
    }
)
;





// Entry rule entryRuleBooleanType
entryRuleBooleanType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBooleanTypeRule()); }
	 iv_ruleBooleanType=ruleBooleanType 
	 { $current=$iv_ruleBooleanType.current; } 
	 EOF 
;

// Rule BooleanType
ruleBooleanType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0(),
            $current);
    }
)	otherlv_1='Boolean' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getBooleanTypeAccess().getBooleanKeyword_1());
    }
)
;





// Entry rule entryRuleBuiltInType
entryRuleBuiltInType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBuiltInTypeRule()); }
	 iv_ruleBuiltInType=ruleBuiltInType 
	 { $current=$iv_ruleBuiltInType.current; } 
	 EOF 
;

// Rule BuiltInType
ruleBuiltInType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getBuiltInTypeAccess().getDateTypeParserRuleCall_0()); 
    }
    this_DateType_0=ruleDateType
    { 
        $current = $this_DateType_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getBuiltInTypeAccess().getIntegerTypeParserRuleCall_1()); 
    }
    this_IntegerType_1=ruleIntegerType
    { 
        $current = $this_IntegerType_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getBuiltInTypeAccess().getDoubleTypeParserRuleCall_2()); 
    }
    this_DoubleType_2=ruleDoubleType
    { 
        $current = $this_DoubleType_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getBuiltInTypeAccess().getFloatTypeParserRuleCall_3()); 
    }
    this_FloatType_3=ruleFloatType
    { 
        $current = $this_FloatType_3.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getBuiltInTypeAccess().getStringTypeParserRuleCall_4()); 
    }
    this_StringType_4=ruleStringType
    { 
        $current = $this_StringType_4.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getBuiltInTypeAccess().getBooleanTypeParserRuleCall_5()); 
    }
    this_BooleanType_5=ruleBooleanType
    { 
        $current = $this_BooleanType_5.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleReference
entryRuleReference returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getReferenceRule()); }
	 iv_ruleReference=ruleReference 
	 { $current=$iv_ruleReference.current; } 
	 EOF 
;

// Rule Reference
ruleReference returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getReferenceAccess().getTypeReferenceParserRuleCall_0()); 
    }
    this_TypeReference_0=ruleTypeReference
    { 
        $current = $this_TypeReference_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getReferenceAccess().getBuiltInTypeParserRuleCall_1()); 
    }
    this_BuiltInType_1=ruleBuiltInType
    { 
        $current = $this_BuiltInType_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleTypeReference
entryRuleTypeReference returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTypeReferenceRule()); }
	 iv_ruleTypeReference=ruleTypeReference 
	 { $current=$iv_ruleTypeReference.current; } 
	 EOF 
;

// Rule TypeReference
ruleTypeReference returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getTypeReferenceRule());
	        }
        }
	otherlv_0=RULE_ID
	{
		newLeafNode(otherlv_0, grammarAccess.getTypeReferenceAccess().getTypeEntityCrossReference_0()); 
	}

)
)
;





// Entry rule entryRuleEntity
entryRuleEntity returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEntityRule()); }
	 iv_ruleEntity=ruleEntity 
	 { $current=$iv_ruleEntity.current; } 
	 EOF 
;

// Rule Entity
ruleEntity returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='entity' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEntityRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0()); 
	    }
		lv_attributes_3_0=ruleAttribute		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEntityRule());
	        }
       		add(
       			$current, 
       			"attributes",
        		lv_attributes_3_0, 
        		"Attribute");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleAttribute
entryRuleAttribute returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAttributeRule()); }
	 iv_ruleAttribute=ruleAttribute 
	 { $current=$iv_ruleAttribute.current; } 
	 EOF 
;

// Rule Attribute
ruleAttribute returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAttributeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)	otherlv_1=':' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeReferenceParserRuleCall_2_0()); 
	    }
		lv_type_2_0=ruleReference		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAttributeRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_2_0, 
        		"Reference");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_multiplicity_3_0=	'[]' 
    {
        newLeafNode(lv_multiplicity_3_0, grammarAccess.getAttributeAccess().getMultiplicityLeftSquareBracketRightSquareBracketKeyword_3_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAttributeRule());
	        }
       		setWithLastConsumed($current, "multiplicity", true, "[]");
	    }

)
)?)
;







RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;



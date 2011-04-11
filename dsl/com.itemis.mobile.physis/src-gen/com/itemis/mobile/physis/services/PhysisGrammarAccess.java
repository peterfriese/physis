/*
* generated by Xtext
*/

package com.itemis.mobile.physis.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class PhysisGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Assignment cDatamodelsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cDatamodelsDataModelParserRuleCall_0 = (RuleCall)cDatamodelsAssignment.eContents().get(0);
		
		//Model:
		//	datamodels+=DataModel*;
		public ParserRule getRule() { return rule; }

		//datamodels+=DataModel*
		public Assignment getDatamodelsAssignment() { return cDatamodelsAssignment; }

		//DataModel
		public RuleCall getDatamodelsDataModelParserRuleCall_0() { return cDatamodelsDataModelParserRuleCall_0; }
	}

	public class DataModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "DataModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDatamodelKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cEntitiesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cEntitiesEntityParserRuleCall_3_0 = (RuleCall)cEntitiesAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//DataModel:
		//	"datamodel" name=ID "{" entities+=Entity* "}";
		public ParserRule getRule() { return rule; }

		//"datamodel" name=ID "{" entities+=Entity* "}"
		public Group getGroup() { return cGroup; }

		//"datamodel"
		public Keyword getDatamodelKeyword_0() { return cDatamodelKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//entities+=Entity*
		public Assignment getEntitiesAssignment_3() { return cEntitiesAssignment_3; }

		//Entity
		public RuleCall getEntitiesEntityParserRuleCall_3_0() { return cEntitiesEntityParserRuleCall_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class DateTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "DateType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDateTypeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cDateKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//DateType:
		//	{DateType} "Date";
		public ParserRule getRule() { return rule; }

		//{DateType} "Date"
		public Group getGroup() { return cGroup; }

		//{DateType}
		public Action getDateTypeAction_0() { return cDateTypeAction_0; }

		//"Date"
		public Keyword getDateKeyword_1() { return cDateKeyword_1; }
	}

	public class IntegerTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "IntegerType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cIntegerTypeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cIntegerKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//IntegerType:
		//	{IntegerType} "Integer";
		public ParserRule getRule() { return rule; }

		//{IntegerType} "Integer"
		public Group getGroup() { return cGroup; }

		//{IntegerType}
		public Action getIntegerTypeAction_0() { return cIntegerTypeAction_0; }

		//"Integer"
		public Keyword getIntegerKeyword_1() { return cIntegerKeyword_1; }
	}

	public class DoubleTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "DoubleType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDoubleTypeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cDoubleKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//DoubleType:
		//	{DoubleType} "Double";
		public ParserRule getRule() { return rule; }

		//{DoubleType} "Double"
		public Group getGroup() { return cGroup; }

		//{DoubleType}
		public Action getDoubleTypeAction_0() { return cDoubleTypeAction_0; }

		//"Double"
		public Keyword getDoubleKeyword_1() { return cDoubleKeyword_1; }
	}

	public class FloatTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FloatType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cFloatTypeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cFloatKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//FloatType:
		//	{FloatType} "Float";
		public ParserRule getRule() { return rule; }

		//{FloatType} "Float"
		public Group getGroup() { return cGroup; }

		//{FloatType}
		public Action getFloatTypeAction_0() { return cFloatTypeAction_0; }

		//"Float"
		public Keyword getFloatKeyword_1() { return cFloatKeyword_1; }
	}

	public class StringTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "StringType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cStringTypeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cStringKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//StringType:
		//	{StringType} "String";
		public ParserRule getRule() { return rule; }

		//{StringType} "String"
		public Group getGroup() { return cGroup; }

		//{StringType}
		public Action getStringTypeAction_0() { return cStringTypeAction_0; }

		//"String"
		public Keyword getStringKeyword_1() { return cStringKeyword_1; }
	}

	public class BooleanTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "BooleanType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cBooleanTypeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cBooleanKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//BooleanType:
		//	{BooleanType} "Boolean";
		public ParserRule getRule() { return rule; }

		//{BooleanType} "Boolean"
		public Group getGroup() { return cGroup; }

		//{BooleanType}
		public Action getBooleanTypeAction_0() { return cBooleanTypeAction_0; }

		//"Boolean"
		public Keyword getBooleanKeyword_1() { return cBooleanKeyword_1; }
	}

	public class BuiltInTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "BuiltInType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDateTypeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIntegerTypeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cDoubleTypeParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cFloatTypeParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cStringTypeParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cBooleanTypeParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		
		//BuiltInType:
		//	DateType | IntegerType | DoubleType | FloatType | StringType | BooleanType;
		public ParserRule getRule() { return rule; }

		//DateType | IntegerType | DoubleType | FloatType | StringType | BooleanType
		public Alternatives getAlternatives() { return cAlternatives; }

		//DateType
		public RuleCall getDateTypeParserRuleCall_0() { return cDateTypeParserRuleCall_0; }

		//IntegerType
		public RuleCall getIntegerTypeParserRuleCall_1() { return cIntegerTypeParserRuleCall_1; }

		//DoubleType
		public RuleCall getDoubleTypeParserRuleCall_2() { return cDoubleTypeParserRuleCall_2; }

		//FloatType
		public RuleCall getFloatTypeParserRuleCall_3() { return cFloatTypeParserRuleCall_3; }

		//StringType
		public RuleCall getStringTypeParserRuleCall_4() { return cStringTypeParserRuleCall_4; }

		//BooleanType
		public RuleCall getBooleanTypeParserRuleCall_5() { return cBooleanTypeParserRuleCall_5; }
	}

	public class ReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Reference");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cTypeReferenceParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cBuiltInTypeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Reference:
		//	TypeReference | BuiltInType;
		public ParserRule getRule() { return rule; }

		//TypeReference | BuiltInType
		public Alternatives getAlternatives() { return cAlternatives; }

		//TypeReference
		public RuleCall getTypeReferenceParserRuleCall_0() { return cTypeReferenceParserRuleCall_0; }

		//BuiltInType
		public RuleCall getBuiltInTypeParserRuleCall_1() { return cBuiltInTypeParserRuleCall_1; }
	}

	public class TypeReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TypeReference");
		private final Assignment cTypeAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cTypeEntityCrossReference_0 = (CrossReference)cTypeAssignment.eContents().get(0);
		private final RuleCall cTypeEntityIDTerminalRuleCall_0_1 = (RuleCall)cTypeEntityCrossReference_0.eContents().get(1);
		
		//TypeReference:
		//	type=[Entity];
		public ParserRule getRule() { return rule; }

		//type=[Entity]
		public Assignment getTypeAssignment() { return cTypeAssignment; }

		//[Entity]
		public CrossReference getTypeEntityCrossReference_0() { return cTypeEntityCrossReference_0; }

		//ID
		public RuleCall getTypeEntityIDTerminalRuleCall_0_1() { return cTypeEntityIDTerminalRuleCall_0_1; }
	}

	public class EntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Entity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEntityKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAttributesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAttributesAttributeParserRuleCall_3_0 = (RuleCall)cAttributesAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Entity:
		//	"entity" name=ID "{" attributes+=Attribute* "}";
		public ParserRule getRule() { return rule; }

		//"entity" name=ID "{" attributes+=Attribute* "}"
		public Group getGroup() { return cGroup; }

		//"entity"
		public Keyword getEntityKeyword_0() { return cEntityKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//attributes+=Attribute*
		public Assignment getAttributesAssignment_3() { return cAttributesAssignment_3; }

		//Attribute
		public RuleCall getAttributesAttributeParserRuleCall_3_0() { return cAttributesAttributeParserRuleCall_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class AttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Attribute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeReferenceParserRuleCall_2_0 = (RuleCall)cTypeAssignment_2.eContents().get(0);
		private final Assignment cMultiplicityAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final Keyword cMultiplicityLeftSquareBracketRightSquareBracketKeyword_3_0 = (Keyword)cMultiplicityAssignment_3.eContents().get(0);
		
		//Attribute:
		//	name=ID ":" type=Reference multiplicity?="[]"?;
		public ParserRule getRule() { return rule; }

		//name=ID ":" type=Reference multiplicity?="[]"?
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//":"
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }

		//type=Reference
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }

		//Reference
		public RuleCall getTypeReferenceParserRuleCall_2_0() { return cTypeReferenceParserRuleCall_2_0; }

		//multiplicity?="[]"?
		public Assignment getMultiplicityAssignment_3() { return cMultiplicityAssignment_3; }

		//"[]"
		public Keyword getMultiplicityLeftSquareBracketRightSquareBracketKeyword_3_0() { return cMultiplicityLeftSquareBracketRightSquareBracketKeyword_3_0; }
	}
	
	
	public class PlatformElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "Platform");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cIOSEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cIOSIOSKeyword_0_0 = (Keyword)cIOSEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cAndroidEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cAndroidAndroidKeyword_1_0 = (Keyword)cAndroidEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum Platform:
		//	iOS | Android;
		public EnumRule getRule() { return rule; }

		//iOS | Android
		public Alternatives getAlternatives() { return cAlternatives; }

		//iOS
		public EnumLiteralDeclaration getIOSEnumLiteralDeclaration_0() { return cIOSEnumLiteralDeclaration_0; }

		//"iOS"
		public Keyword getIOSIOSKeyword_0_0() { return cIOSIOSKeyword_0_0; }

		//Android
		public EnumLiteralDeclaration getAndroidEnumLiteralDeclaration_1() { return cAndroidEnumLiteralDeclaration_1; }

		//"Android"
		public Keyword getAndroidAndroidKeyword_1_0() { return cAndroidAndroidKeyword_1_0; }
	}
	
	private ModelElements pModel;
	private PlatformElements unknownRulePlatform;
	private DataModelElements pDataModel;
	private DateTypeElements pDateType;
	private IntegerTypeElements pIntegerType;
	private DoubleTypeElements pDoubleType;
	private FloatTypeElements pFloatType;
	private StringTypeElements pStringType;
	private BooleanTypeElements pBooleanType;
	private BuiltInTypeElements pBuiltInType;
	private ReferenceElements pReference;
	private TypeReferenceElements pTypeReference;
	private EntityElements pEntity;
	private AttributeElements pAttribute;
	
	private final GrammarProvider grammarProvider;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public PhysisGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammarProvider = grammarProvider;
		this.gaTerminals = gaTerminals;
	}
	
	public Grammar getGrammar() {	
		return grammarProvider.getGrammar(this);
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	datamodels+=DataModel*;
	public ModelElements getModelAccess() {
		return (pModel != null) ? pModel : (pModel = new ModelElements());
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//enum Platform:
	//	iOS | Android;
	public PlatformElements getPlatformAccess() {
		return (unknownRulePlatform != null) ? unknownRulePlatform : (unknownRulePlatform = new PlatformElements());
	}
	
	public EnumRule getPlatformRule() {
		return getPlatformAccess().getRule();
	}

	//DataModel:
	//	"datamodel" name=ID "{" entities+=Entity* "}";
	public DataModelElements getDataModelAccess() {
		return (pDataModel != null) ? pDataModel : (pDataModel = new DataModelElements());
	}
	
	public ParserRule getDataModelRule() {
		return getDataModelAccess().getRule();
	}

	//DateType:
	//	{DateType} "Date";
	public DateTypeElements getDateTypeAccess() {
		return (pDateType != null) ? pDateType : (pDateType = new DateTypeElements());
	}
	
	public ParserRule getDateTypeRule() {
		return getDateTypeAccess().getRule();
	}

	//IntegerType:
	//	{IntegerType} "Integer";
	public IntegerTypeElements getIntegerTypeAccess() {
		return (pIntegerType != null) ? pIntegerType : (pIntegerType = new IntegerTypeElements());
	}
	
	public ParserRule getIntegerTypeRule() {
		return getIntegerTypeAccess().getRule();
	}

	//DoubleType:
	//	{DoubleType} "Double";
	public DoubleTypeElements getDoubleTypeAccess() {
		return (pDoubleType != null) ? pDoubleType : (pDoubleType = new DoubleTypeElements());
	}
	
	public ParserRule getDoubleTypeRule() {
		return getDoubleTypeAccess().getRule();
	}

	//FloatType:
	//	{FloatType} "Float";
	public FloatTypeElements getFloatTypeAccess() {
		return (pFloatType != null) ? pFloatType : (pFloatType = new FloatTypeElements());
	}
	
	public ParserRule getFloatTypeRule() {
		return getFloatTypeAccess().getRule();
	}

	//StringType:
	//	{StringType} "String";
	public StringTypeElements getStringTypeAccess() {
		return (pStringType != null) ? pStringType : (pStringType = new StringTypeElements());
	}
	
	public ParserRule getStringTypeRule() {
		return getStringTypeAccess().getRule();
	}

	//BooleanType:
	//	{BooleanType} "Boolean";
	public BooleanTypeElements getBooleanTypeAccess() {
		return (pBooleanType != null) ? pBooleanType : (pBooleanType = new BooleanTypeElements());
	}
	
	public ParserRule getBooleanTypeRule() {
		return getBooleanTypeAccess().getRule();
	}

	//BuiltInType:
	//	DateType | IntegerType | DoubleType | FloatType | StringType | BooleanType;
	public BuiltInTypeElements getBuiltInTypeAccess() {
		return (pBuiltInType != null) ? pBuiltInType : (pBuiltInType = new BuiltInTypeElements());
	}
	
	public ParserRule getBuiltInTypeRule() {
		return getBuiltInTypeAccess().getRule();
	}

	//Reference:
	//	TypeReference | BuiltInType;
	public ReferenceElements getReferenceAccess() {
		return (pReference != null) ? pReference : (pReference = new ReferenceElements());
	}
	
	public ParserRule getReferenceRule() {
		return getReferenceAccess().getRule();
	}

	//TypeReference:
	//	type=[Entity];
	public TypeReferenceElements getTypeReferenceAccess() {
		return (pTypeReference != null) ? pTypeReference : (pTypeReference = new TypeReferenceElements());
	}
	
	public ParserRule getTypeReferenceRule() {
		return getTypeReferenceAccess().getRule();
	}

	//Entity:
	//	"entity" name=ID "{" attributes+=Attribute* "}";
	public EntityElements getEntityAccess() {
		return (pEntity != null) ? pEntity : (pEntity = new EntityElements());
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
	}

	//Attribute:
	//	name=ID ":" type=Reference multiplicity?="[]"?;
	public AttributeElements getAttributeAccess() {
		return (pAttribute != null) ? pAttribute : (pAttribute = new AttributeElements());
	}
	
	public ParserRule getAttributeRule() {
		return getAttributeAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}

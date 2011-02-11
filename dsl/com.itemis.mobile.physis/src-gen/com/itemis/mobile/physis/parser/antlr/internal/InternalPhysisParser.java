package com.itemis.mobile.physis.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import com.itemis.mobile.physis.services.PhysisGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPhysisParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'datamodel'", "'{'", "'}'", "'type'", "'entity'", "':'", "'[]'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalPhysisParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g"; }



     	private PhysisGrammarAccess grammarAccess;
     	
        public InternalPhysisParser(TokenStream input, IAstFactory factory, PhysisGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected PhysisGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleModel
    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:77:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:78:2: (iv_ruleModel= ruleModel EOF )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:79:2: iv_ruleModel= ruleModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelRule(), currentNode); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();
            _fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleModel


    // $ANTLR start ruleModel
    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:86:1: ruleModel returns [EObject current=null] : ( (lv_datamodels_0_0= ruleDataModel ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_datamodels_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:91:6: ( ( (lv_datamodels_0_0= ruleDataModel ) )* )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:92:1: ( (lv_datamodels_0_0= ruleDataModel ) )*
            {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:92:1: ( (lv_datamodels_0_0= ruleDataModel ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:93:1: (lv_datamodels_0_0= ruleDataModel )
            	    {
            	    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:93:1: (lv_datamodels_0_0= ruleDataModel )
            	    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:94:3: lv_datamodels_0_0= ruleDataModel
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getDatamodelsDataModelParserRuleCall_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDataModel_in_ruleModel130);
            	    lv_datamodels_0_0=ruleDataModel();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"datamodels",
            	    	        		lv_datamodels_0_0, 
            	    	        		"DataModel", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleModel


    // $ANTLR start entryRuleDataModel
    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:124:1: entryRuleDataModel returns [EObject current=null] : iv_ruleDataModel= ruleDataModel EOF ;
    public final EObject entryRuleDataModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataModel = null;


        try {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:125:2: (iv_ruleDataModel= ruleDataModel EOF )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:126:2: iv_ruleDataModel= ruleDataModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDataModelRule(), currentNode); 
            pushFollow(FOLLOW_ruleDataModel_in_entryRuleDataModel166);
            iv_ruleDataModel=ruleDataModel();
            _fsp--;

             current =iv_ruleDataModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataModel176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDataModel


    // $ANTLR start ruleDataModel
    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:133:1: ruleDataModel returns [EObject current=null] : ( 'datamodel' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_types_3_0= ruleType ) )* '}' ) ;
    public final EObject ruleDataModel() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_types_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:138:6: ( ( 'datamodel' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_types_3_0= ruleType ) )* '}' ) )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:139:1: ( 'datamodel' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_types_3_0= ruleType ) )* '}' )
            {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:139:1: ( 'datamodel' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_types_3_0= ruleType ) )* '}' )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:139:3: 'datamodel' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_types_3_0= ruleType ) )* '}'
            {
            match(input,11,FOLLOW_11_in_ruleDataModel211); 

                    createLeafNode(grammarAccess.getDataModelAccess().getDatamodelKeyword_0(), null); 
                
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:143:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:144:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:144:1: (lv_name_1_0= RULE_ID )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:145:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataModel228); 

            			createLeafNode(grammarAccess.getDataModelAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDataModelRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleDataModel243); 

                    createLeafNode(grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:171:1: ( (lv_types_3_0= ruleType ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=14 && LA2_0<=15)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:172:1: (lv_types_3_0= ruleType )
            	    {
            	    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:172:1: (lv_types_3_0= ruleType )
            	    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:173:3: lv_types_3_0= ruleType
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDataModelAccess().getTypesTypeParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleType_in_ruleDataModel264);
            	    lv_types_3_0=ruleType();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDataModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"types",
            	    	        		lv_types_3_0, 
            	    	        		"Type", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match(input,13,FOLLOW_13_in_ruleDataModel275); 

                    createLeafNode(grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDataModel


    // $ANTLR start entryRuleType
    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:207:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:208:2: (iv_ruleType= ruleType EOF )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:209:2: iv_ruleType= ruleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType311);
            iv_ruleType=ruleType();
            _fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType321); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleType


    // $ANTLR start ruleType
    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:216:1: ruleType returns [EObject current=null] : (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleType_0 = null;

        EObject this_Entity_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:221:6: ( (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity ) )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:222:1: (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity )
            {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:222:1: (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("222:1: (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity )", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:223:5: this_SimpleType_0= ruleSimpleType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSimpleType_in_ruleType368);
                    this_SimpleType_0=ruleSimpleType();
                    _fsp--;

                     
                            current = this_SimpleType_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:233:5: this_Entity_1= ruleEntity
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getEntityParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEntity_in_ruleType395);
                    this_Entity_1=ruleEntity();
                    _fsp--;

                     
                            current = this_Entity_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleType


    // $ANTLR start entryRuleSimpleType
    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:249:1: entryRuleSimpleType returns [EObject current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final EObject entryRuleSimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleType = null;


        try {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:250:2: (iv_ruleSimpleType= ruleSimpleType EOF )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:251:2: iv_ruleSimpleType= ruleSimpleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSimpleTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleSimpleType_in_entryRuleSimpleType430);
            iv_ruleSimpleType=ruleSimpleType();
            _fsp--;

             current =iv_ruleSimpleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleType440); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSimpleType


    // $ANTLR start ruleSimpleType
    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:258:1: ruleSimpleType returns [EObject current=null] : ( 'type' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSimpleType() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:263:6: ( ( 'type' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:264:1: ( 'type' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:264:1: ( 'type' ( (lv_name_1_0= RULE_ID ) ) )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:264:3: 'type' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,14,FOLLOW_14_in_ruleSimpleType475); 

                    createLeafNode(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0(), null); 
                
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:268:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:269:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:269:1: (lv_name_1_0= RULE_ID )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:270:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleType492); 

            			createLeafNode(grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSimpleTypeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSimpleType


    // $ANTLR start entryRuleEntity
    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:300:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:301:2: (iv_ruleEntity= ruleEntity EOF )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:302:2: iv_ruleEntity= ruleEntity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEntityRule(), currentNode); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity533);
            iv_ruleEntity=ruleEntity();
            _fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity543); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEntity


    // $ANTLR start ruleEntity
    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:309:1: ruleEntity returns [EObject current=null] : ( 'entity' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_attributes_3_0= ruleAttribute ) )* '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_attributes_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:314:6: ( ( 'entity' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_attributes_3_0= ruleAttribute ) )* '}' ) )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:315:1: ( 'entity' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_attributes_3_0= ruleAttribute ) )* '}' )
            {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:315:1: ( 'entity' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_attributes_3_0= ruleAttribute ) )* '}' )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:315:3: 'entity' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_attributes_3_0= ruleAttribute ) )* '}'
            {
            match(input,15,FOLLOW_15_in_ruleEntity578); 

                    createLeafNode(grammarAccess.getEntityAccess().getEntityKeyword_0(), null); 
                
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:319:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:320:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:320:1: (lv_name_1_0= RULE_ID )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:321:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity595); 

            			createLeafNode(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleEntity610); 

                    createLeafNode(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:347:1: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:348:1: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:348:1: (lv_attributes_3_0= ruleAttribute )
            	    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:349:3: lv_attributes_3_0= ruleAttribute
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleEntity631);
            	    lv_attributes_3_0=ruleAttribute();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"attributes",
            	    	        		lv_attributes_3_0, 
            	    	        		"Attribute", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match(input,13,FOLLOW_13_in_ruleEntity642); 

                    createLeafNode(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEntity


    // $ANTLR start entryRuleAttribute
    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:383:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:384:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:385:2: iv_ruleAttribute= ruleAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute678);
            iv_ruleAttribute=ruleAttribute();
            _fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute688); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAttribute


    // $ANTLR start ruleAttribute
    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:392:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ':' ( ( RULE_ID ) ) ( (lv_multiplicity_3_0= '[]' ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_multiplicity_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:397:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ':' ( ( RULE_ID ) ) ( (lv_multiplicity_3_0= '[]' ) )? ) )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:398:1: ( ( (lv_name_0_0= RULE_ID ) ) ':' ( ( RULE_ID ) ) ( (lv_multiplicity_3_0= '[]' ) )? )
            {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:398:1: ( ( (lv_name_0_0= RULE_ID ) ) ':' ( ( RULE_ID ) ) ( (lv_multiplicity_3_0= '[]' ) )? )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:398:2: ( (lv_name_0_0= RULE_ID ) ) ':' ( ( RULE_ID ) ) ( (lv_multiplicity_3_0= '[]' ) )?
            {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:398:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:399:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:399:1: (lv_name_0_0= RULE_ID )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:400:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute730); 

            			createLeafNode(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,16,FOLLOW_16_in_ruleAttribute745); 

                    createLeafNode(grammarAccess.getAttributeAccess().getColonKeyword_1(), null); 
                
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:426:1: ( ( RULE_ID ) )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:427:1: ( RULE_ID )
            {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:427:1: ( RULE_ID )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:428:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute763); 

            		createLeafNode(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_2_0(), "type"); 
            	

            }


            }

            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:440:2: ( (lv_multiplicity_3_0= '[]' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:441:1: (lv_multiplicity_3_0= '[]' )
                    {
                    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:441:1: (lv_multiplicity_3_0= '[]' )
                    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:442:3: lv_multiplicity_3_0= '[]'
                    {
                    lv_multiplicity_3_0=(Token)input.LT(1);
                    match(input,17,FOLLOW_17_in_ruleAttribute781); 

                            createLeafNode(grammarAccess.getAttributeAccess().getMultiplicityLeftSquareBracketRightSquareBracketKeyword_3_0(), "multiplicity"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "multiplicity", true, "[]", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAttribute


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataModel_in_ruleModel130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleDataModel_in_entryRuleDataModel166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataModel176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleDataModel211 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataModel228 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDataModel243 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_ruleType_in_ruleDataModel264 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_13_in_ruleDataModel275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_ruleType368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleType395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType430 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSimpleType475 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleType492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleEntity578 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity595 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEntity610 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEntity631 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleEntity642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute678 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute730 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAttribute745 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute763 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleAttribute781 = new BitSet(new long[]{0x0000000000000002L});

}
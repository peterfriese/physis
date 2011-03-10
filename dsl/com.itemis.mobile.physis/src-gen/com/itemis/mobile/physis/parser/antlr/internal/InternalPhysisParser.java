package com.itemis.mobile.physis.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
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
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalPhysisParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPhysisParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPhysisParser.tokenNames; }
    public String getGrammarFileName() { return "../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g"; }



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



    // $ANTLR start "entryRuleModel"
    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:76:1: ruleModel returns [EObject current=null] : ( (lv_datamodels_0_0= ruleDataModel ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_datamodels_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:79:28: ( ( (lv_datamodels_0_0= ruleDataModel ) )* )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:80:1: ( (lv_datamodels_0_0= ruleDataModel ) )*
            {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:80:1: ( (lv_datamodels_0_0= ruleDataModel ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:81:1: (lv_datamodels_0_0= ruleDataModel )
            	    {
            	    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:81:1: (lv_datamodels_0_0= ruleDataModel )
            	    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:82:3: lv_datamodels_0_0= ruleDataModel
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getDatamodelsDataModelParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDataModel_in_ruleModel130);
            	    lv_datamodels_0_0=ruleDataModel();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"datamodels",
            	            		lv_datamodels_0_0, 
            	            		"DataModel");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDataModel"
    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:106:1: entryRuleDataModel returns [EObject current=null] : iv_ruleDataModel= ruleDataModel EOF ;
    public final EObject entryRuleDataModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataModel = null;


        try {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:107:2: (iv_ruleDataModel= ruleDataModel EOF )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:108:2: iv_ruleDataModel= ruleDataModel EOF
            {
             newCompositeNode(grammarAccess.getDataModelRule()); 
            pushFollow(FOLLOW_ruleDataModel_in_entryRuleDataModel166);
            iv_ruleDataModel=ruleDataModel();

            state._fsp--;

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
    // $ANTLR end "entryRuleDataModel"


    // $ANTLR start "ruleDataModel"
    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:115:1: ruleDataModel returns [EObject current=null] : (otherlv_0= 'datamodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_types_3_0= ruleType ) )* otherlv_4= '}' ) ;
    public final EObject ruleDataModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_types_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:118:28: ( (otherlv_0= 'datamodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_types_3_0= ruleType ) )* otherlv_4= '}' ) )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:119:1: (otherlv_0= 'datamodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_types_3_0= ruleType ) )* otherlv_4= '}' )
            {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:119:1: (otherlv_0= 'datamodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_types_3_0= ruleType ) )* otherlv_4= '}' )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:119:3: otherlv_0= 'datamodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_types_3_0= ruleType ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleDataModel213); 

                	newLeafNode(otherlv_0, grammarAccess.getDataModelAccess().getDatamodelKeyword_0());
                
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:123:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:124:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:124:1: (lv_name_1_0= RULE_ID )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:125:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataModel230); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDataModelAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDataModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleDataModel247); 

                	newLeafNode(otherlv_2, grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:145:1: ( (lv_types_3_0= ruleType ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=14 && LA2_0<=15)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:146:1: (lv_types_3_0= ruleType )
            	    {
            	    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:146:1: (lv_types_3_0= ruleType )
            	    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:147:3: lv_types_3_0= ruleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDataModelAccess().getTypesTypeParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleType_in_ruleDataModel268);
            	    lv_types_3_0=ruleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDataModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"types",
            	            		lv_types_3_0, 
            	            		"Type");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleDataModel281); 

                	newLeafNode(otherlv_4, grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataModel"


    // $ANTLR start "entryRuleType"
    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:175:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:176:2: (iv_ruleType= ruleType EOF )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:177:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType317);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType327); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:184:1: ruleType returns [EObject current=null] : (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleType_0 = null;

        EObject this_Entity_1 = null;


         enterRule(); 
            
        try {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:187:28: ( (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity ) )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:188:1: (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity )
            {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:188:1: (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity )
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
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:189:5: this_SimpleType_0= ruleSimpleType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSimpleType_in_ruleType374);
                    this_SimpleType_0=ruleSimpleType();

                    state._fsp--;

                     
                            current = this_SimpleType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:199:5: this_Entity_1= ruleEntity
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEntity_in_ruleType401);
                    this_Entity_1=ruleEntity();

                    state._fsp--;

                     
                            current = this_Entity_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleSimpleType"
    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:215:1: entryRuleSimpleType returns [EObject current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final EObject entryRuleSimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleType = null;


        try {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:216:2: (iv_ruleSimpleType= ruleSimpleType EOF )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:217:2: iv_ruleSimpleType= ruleSimpleType EOF
            {
             newCompositeNode(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_ruleSimpleType_in_entryRuleSimpleType436);
            iv_ruleSimpleType=ruleSimpleType();

            state._fsp--;

             current =iv_ruleSimpleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleType446); 

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
    // $ANTLR end "entryRuleSimpleType"


    // $ANTLR start "ruleSimpleType"
    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:224:1: ruleSimpleType returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSimpleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:227:28: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:228:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:228:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:228:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleSimpleType483); 

                	newLeafNode(otherlv_0, grammarAccess.getSimpleTypeAccess().getTypeKeyword_0());
                
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:232:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:233:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:233:1: (lv_name_1_0= RULE_ID )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:234:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleType500); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleType"


    // $ANTLR start "entryRuleEntity"
    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:258:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:259:2: (iv_ruleEntity= ruleEntity EOF )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:260:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity541);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity551); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:267:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributes_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:270:28: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' ) )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:271:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )
            {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:271:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:271:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleEntity588); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
                
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:275:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:276:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:276:1: (lv_name_1_0= RULE_ID )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:277:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity605); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEntity622); 

                	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:297:1: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:298:1: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:298:1: (lv_attributes_3_0= ruleAttribute )
            	    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:299:3: lv_attributes_3_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleEntity643);
            	    lv_attributes_3_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_3_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleEntity656); 

                	newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:327:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:328:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:329:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute692);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute702); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:336:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= '[]' ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_multiplicity_3_0=null;

         enterRule(); 
            
        try {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:339:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= '[]' ) )? ) )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:340:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= '[]' ) )? )
            {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:340:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= '[]' ) )? )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:340:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= '[]' ) )?
            {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:340:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:341:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:341:1: (lv_name_0_0= RULE_ID )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:342:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute744); 

            			newLeafNode(lv_name_0_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleAttribute761); 

                	newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
                
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:362:1: ( (otherlv_2= RULE_ID ) )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:363:1: (otherlv_2= RULE_ID )
            {
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:363:1: (otherlv_2= RULE_ID )
            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:364:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute781); 

            		newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getTypeTypeCrossReference_2_0()); 
            	

            }


            }

            // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:375:2: ( (lv_multiplicity_3_0= '[]' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:376:1: (lv_multiplicity_3_0= '[]' )
                    {
                    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:376:1: (lv_multiplicity_3_0= '[]' )
                    // ../com.itemis.mobile.physis/src-gen/com/itemis/mobile/physis/parser/antlr/internal/InternalPhysis.g:377:3: lv_multiplicity_3_0= '[]'
                    {
                    lv_multiplicity_3_0=(Token)match(input,17,FOLLOW_17_in_ruleAttribute799); 

                            newLeafNode(lv_multiplicity_3_0, grammarAccess.getAttributeAccess().getMultiplicityLeftSquareBracketRightSquareBracketKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "multiplicity", true, "[]");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataModel_in_ruleModel130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleDataModel_in_entryRuleDataModel166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataModel176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleDataModel213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataModel230 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDataModel247 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_ruleType_in_ruleDataModel268 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_13_in_ruleDataModel281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_ruleType374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleType401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType436 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSimpleType483 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleType500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleEntity588 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity605 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEntity622 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEntity643 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleEntity656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute692 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute744 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAttribute761 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute781 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleAttribute799 = new BitSet(new long[]{0x0000000000000002L});

}
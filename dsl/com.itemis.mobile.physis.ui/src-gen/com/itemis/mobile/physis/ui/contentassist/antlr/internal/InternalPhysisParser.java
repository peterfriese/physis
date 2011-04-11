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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPhysisParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'datamodel'", "'{'", "'}'", "'Date'", "'Integer'", "'Double'", "'Float'", "'String'", "'Boolean'", "'entity'", "':'", "'[]'"
    };
    public static final int RULE_ID=4;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalPhysisParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPhysisParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPhysisParser.tokenNames; }
    public String getGrammarFileName() { return "../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g"; }


     
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




    // $ANTLR start "entryRuleModel"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:62:1: ( ruleModel EOF )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:63:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:70:1: ruleModel : ( ( rule__Model__DatamodelsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:74:2: ( ( ( rule__Model__DatamodelsAssignment )* ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:75:1: ( ( rule__Model__DatamodelsAssignment )* )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:75:1: ( ( rule__Model__DatamodelsAssignment )* )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:76:1: ( rule__Model__DatamodelsAssignment )*
            {
             before(grammarAccess.getModelAccess().getDatamodelsAssignment()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:77:1: ( rule__Model__DatamodelsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:77:2: rule__Model__DatamodelsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__DatamodelsAssignment_in_ruleModel94);
            	    rule__Model__DatamodelsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getDatamodelsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDataModel"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:89:1: entryRuleDataModel : ruleDataModel EOF ;
    public final void entryRuleDataModel() throws RecognitionException {
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:90:1: ( ruleDataModel EOF )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:91:1: ruleDataModel EOF
            {
             before(grammarAccess.getDataModelRule()); 
            pushFollow(FOLLOW_ruleDataModel_in_entryRuleDataModel122);
            ruleDataModel();

            state._fsp--;

             after(grammarAccess.getDataModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataModel129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataModel"


    // $ANTLR start "ruleDataModel"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:98:1: ruleDataModel : ( ( rule__DataModel__Group__0 ) ) ;
    public final void ruleDataModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:102:2: ( ( ( rule__DataModel__Group__0 ) ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:103:1: ( ( rule__DataModel__Group__0 ) )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:103:1: ( ( rule__DataModel__Group__0 ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:104:1: ( rule__DataModel__Group__0 )
            {
             before(grammarAccess.getDataModelAccess().getGroup()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:105:1: ( rule__DataModel__Group__0 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:105:2: rule__DataModel__Group__0
            {
            pushFollow(FOLLOW_rule__DataModel__Group__0_in_ruleDataModel155);
            rule__DataModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataModel"


    // $ANTLR start "entryRuleDateType"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:117:1: entryRuleDateType : ruleDateType EOF ;
    public final void entryRuleDateType() throws RecognitionException {
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:118:1: ( ruleDateType EOF )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:119:1: ruleDateType EOF
            {
             before(grammarAccess.getDateTypeRule()); 
            pushFollow(FOLLOW_ruleDateType_in_entryRuleDateType182);
            ruleDateType();

            state._fsp--;

             after(grammarAccess.getDateTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateType189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDateType"


    // $ANTLR start "ruleDateType"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:126:1: ruleDateType : ( ( rule__DateType__Group__0 ) ) ;
    public final void ruleDateType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:130:2: ( ( ( rule__DateType__Group__0 ) ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:131:1: ( ( rule__DateType__Group__0 ) )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:131:1: ( ( rule__DateType__Group__0 ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:132:1: ( rule__DateType__Group__0 )
            {
             before(grammarAccess.getDateTypeAccess().getGroup()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:133:1: ( rule__DateType__Group__0 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:133:2: rule__DateType__Group__0
            {
            pushFollow(FOLLOW_rule__DateType__Group__0_in_ruleDateType215);
            rule__DateType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDateTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDateType"


    // $ANTLR start "entryRuleIntegerType"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:145:1: entryRuleIntegerType : ruleIntegerType EOF ;
    public final void entryRuleIntegerType() throws RecognitionException {
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:146:1: ( ruleIntegerType EOF )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:147:1: ruleIntegerType EOF
            {
             before(grammarAccess.getIntegerTypeRule()); 
            pushFollow(FOLLOW_ruleIntegerType_in_entryRuleIntegerType242);
            ruleIntegerType();

            state._fsp--;

             after(grammarAccess.getIntegerTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerType249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntegerType"


    // $ANTLR start "ruleIntegerType"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:154:1: ruleIntegerType : ( ( rule__IntegerType__Group__0 ) ) ;
    public final void ruleIntegerType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:158:2: ( ( ( rule__IntegerType__Group__0 ) ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:159:1: ( ( rule__IntegerType__Group__0 ) )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:159:1: ( ( rule__IntegerType__Group__0 ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:160:1: ( rule__IntegerType__Group__0 )
            {
             before(grammarAccess.getIntegerTypeAccess().getGroup()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:161:1: ( rule__IntegerType__Group__0 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:161:2: rule__IntegerType__Group__0
            {
            pushFollow(FOLLOW_rule__IntegerType__Group__0_in_ruleIntegerType275);
            rule__IntegerType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerType"


    // $ANTLR start "entryRuleDoubleType"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:173:1: entryRuleDoubleType : ruleDoubleType EOF ;
    public final void entryRuleDoubleType() throws RecognitionException {
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:174:1: ( ruleDoubleType EOF )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:175:1: ruleDoubleType EOF
            {
             before(grammarAccess.getDoubleTypeRule()); 
            pushFollow(FOLLOW_ruleDoubleType_in_entryRuleDoubleType302);
            ruleDoubleType();

            state._fsp--;

             after(grammarAccess.getDoubleTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleType309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDoubleType"


    // $ANTLR start "ruleDoubleType"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:182:1: ruleDoubleType : ( ( rule__DoubleType__Group__0 ) ) ;
    public final void ruleDoubleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:186:2: ( ( ( rule__DoubleType__Group__0 ) ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:187:1: ( ( rule__DoubleType__Group__0 ) )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:187:1: ( ( rule__DoubleType__Group__0 ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:188:1: ( rule__DoubleType__Group__0 )
            {
             before(grammarAccess.getDoubleTypeAccess().getGroup()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:189:1: ( rule__DoubleType__Group__0 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:189:2: rule__DoubleType__Group__0
            {
            pushFollow(FOLLOW_rule__DoubleType__Group__0_in_ruleDoubleType335);
            rule__DoubleType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDoubleTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDoubleType"


    // $ANTLR start "entryRuleFloatType"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:201:1: entryRuleFloatType : ruleFloatType EOF ;
    public final void entryRuleFloatType() throws RecognitionException {
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:202:1: ( ruleFloatType EOF )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:203:1: ruleFloatType EOF
            {
             before(grammarAccess.getFloatTypeRule()); 
            pushFollow(FOLLOW_ruleFloatType_in_entryRuleFloatType362);
            ruleFloatType();

            state._fsp--;

             after(grammarAccess.getFloatTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatType369); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFloatType"


    // $ANTLR start "ruleFloatType"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:210:1: ruleFloatType : ( ( rule__FloatType__Group__0 ) ) ;
    public final void ruleFloatType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:214:2: ( ( ( rule__FloatType__Group__0 ) ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:215:1: ( ( rule__FloatType__Group__0 ) )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:215:1: ( ( rule__FloatType__Group__0 ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:216:1: ( rule__FloatType__Group__0 )
            {
             before(grammarAccess.getFloatTypeAccess().getGroup()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:217:1: ( rule__FloatType__Group__0 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:217:2: rule__FloatType__Group__0
            {
            pushFollow(FOLLOW_rule__FloatType__Group__0_in_ruleFloatType395);
            rule__FloatType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFloatTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFloatType"


    // $ANTLR start "entryRuleStringType"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:229:1: entryRuleStringType : ruleStringType EOF ;
    public final void entryRuleStringType() throws RecognitionException {
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:230:1: ( ruleStringType EOF )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:231:1: ruleStringType EOF
            {
             before(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_ruleStringType_in_entryRuleStringType422);
            ruleStringType();

            state._fsp--;

             after(grammarAccess.getStringTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringType429); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringType"


    // $ANTLR start "ruleStringType"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:238:1: ruleStringType : ( ( rule__StringType__Group__0 ) ) ;
    public final void ruleStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:242:2: ( ( ( rule__StringType__Group__0 ) ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:243:1: ( ( rule__StringType__Group__0 ) )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:243:1: ( ( rule__StringType__Group__0 ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:244:1: ( rule__StringType__Group__0 )
            {
             before(grammarAccess.getStringTypeAccess().getGroup()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:245:1: ( rule__StringType__Group__0 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:245:2: rule__StringType__Group__0
            {
            pushFollow(FOLLOW_rule__StringType__Group__0_in_ruleStringType455);
            rule__StringType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringType"


    // $ANTLR start "entryRuleBooleanType"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:257:1: entryRuleBooleanType : ruleBooleanType EOF ;
    public final void entryRuleBooleanType() throws RecognitionException {
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:258:1: ( ruleBooleanType EOF )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:259:1: ruleBooleanType EOF
            {
             before(grammarAccess.getBooleanTypeRule()); 
            pushFollow(FOLLOW_ruleBooleanType_in_entryRuleBooleanType482);
            ruleBooleanType();

            state._fsp--;

             after(grammarAccess.getBooleanTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanType489); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanType"


    // $ANTLR start "ruleBooleanType"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:266:1: ruleBooleanType : ( ( rule__BooleanType__Group__0 ) ) ;
    public final void ruleBooleanType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:270:2: ( ( ( rule__BooleanType__Group__0 ) ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:271:1: ( ( rule__BooleanType__Group__0 ) )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:271:1: ( ( rule__BooleanType__Group__0 ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:272:1: ( rule__BooleanType__Group__0 )
            {
             before(grammarAccess.getBooleanTypeAccess().getGroup()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:273:1: ( rule__BooleanType__Group__0 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:273:2: rule__BooleanType__Group__0
            {
            pushFollow(FOLLOW_rule__BooleanType__Group__0_in_ruleBooleanType515);
            rule__BooleanType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanType"


    // $ANTLR start "entryRuleBuiltInType"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:285:1: entryRuleBuiltInType : ruleBuiltInType EOF ;
    public final void entryRuleBuiltInType() throws RecognitionException {
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:286:1: ( ruleBuiltInType EOF )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:287:1: ruleBuiltInType EOF
            {
             before(grammarAccess.getBuiltInTypeRule()); 
            pushFollow(FOLLOW_ruleBuiltInType_in_entryRuleBuiltInType542);
            ruleBuiltInType();

            state._fsp--;

             after(grammarAccess.getBuiltInTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltInType549); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBuiltInType"


    // $ANTLR start "ruleBuiltInType"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:294:1: ruleBuiltInType : ( ( rule__BuiltInType__Alternatives ) ) ;
    public final void ruleBuiltInType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:298:2: ( ( ( rule__BuiltInType__Alternatives ) ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:299:1: ( ( rule__BuiltInType__Alternatives ) )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:299:1: ( ( rule__BuiltInType__Alternatives ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:300:1: ( rule__BuiltInType__Alternatives )
            {
             before(grammarAccess.getBuiltInTypeAccess().getAlternatives()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:301:1: ( rule__BuiltInType__Alternatives )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:301:2: rule__BuiltInType__Alternatives
            {
            pushFollow(FOLLOW_rule__BuiltInType__Alternatives_in_ruleBuiltInType575);
            rule__BuiltInType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBuiltInTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBuiltInType"


    // $ANTLR start "entryRuleReference"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:313:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:314:1: ( ruleReference EOF )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:315:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference602);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference609); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:322:1: ruleReference : ( ( rule__Reference__Alternatives ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:326:2: ( ( ( rule__Reference__Alternatives ) ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:327:1: ( ( rule__Reference__Alternatives ) )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:327:1: ( ( rule__Reference__Alternatives ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:328:1: ( rule__Reference__Alternatives )
            {
             before(grammarAccess.getReferenceAccess().getAlternatives()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:329:1: ( rule__Reference__Alternatives )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:329:2: rule__Reference__Alternatives
            {
            pushFollow(FOLLOW_rule__Reference__Alternatives_in_ruleReference635);
            rule__Reference__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleTypeReference"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:341:1: entryRuleTypeReference : ruleTypeReference EOF ;
    public final void entryRuleTypeReference() throws RecognitionException {
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:342:1: ( ruleTypeReference EOF )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:343:1: ruleTypeReference EOF
            {
             before(grammarAccess.getTypeReferenceRule()); 
            pushFollow(FOLLOW_ruleTypeReference_in_entryRuleTypeReference662);
            ruleTypeReference();

            state._fsp--;

             after(grammarAccess.getTypeReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeReference669); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeReference"


    // $ANTLR start "ruleTypeReference"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:350:1: ruleTypeReference : ( ( rule__TypeReference__TypeAssignment ) ) ;
    public final void ruleTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:354:2: ( ( ( rule__TypeReference__TypeAssignment ) ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:355:1: ( ( rule__TypeReference__TypeAssignment ) )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:355:1: ( ( rule__TypeReference__TypeAssignment ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:356:1: ( rule__TypeReference__TypeAssignment )
            {
             before(grammarAccess.getTypeReferenceAccess().getTypeAssignment()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:357:1: ( rule__TypeReference__TypeAssignment )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:357:2: rule__TypeReference__TypeAssignment
            {
            pushFollow(FOLLOW_rule__TypeReference__TypeAssignment_in_ruleTypeReference695);
            rule__TypeReference__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTypeReferenceAccess().getTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeReference"


    // $ANTLR start "entryRuleEntity"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:369:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:370:1: ( ruleEntity EOF )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:371:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity722);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity729); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:378:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:382:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:383:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:383:1: ( ( rule__Entity__Group__0 ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:384:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:385:1: ( rule__Entity__Group__0 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:385:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity755);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:397:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:398:1: ( ruleAttribute EOF )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:399:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute782);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute789); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:406:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:410:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:411:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:411:1: ( ( rule__Attribute__Group__0 ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:412:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:413:1: ( rule__Attribute__Group__0 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:413:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute815);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "rule__BuiltInType__Alternatives"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:427:1: rule__BuiltInType__Alternatives : ( ( ruleDateType ) | ( ruleIntegerType ) | ( ruleDoubleType ) | ( ruleFloatType ) | ( ruleStringType ) | ( ruleBooleanType ) );
    public final void rule__BuiltInType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:431:1: ( ( ruleDateType ) | ( ruleIntegerType ) | ( ruleDoubleType ) | ( ruleFloatType ) | ( ruleStringType ) | ( ruleBooleanType ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            case 17:
                {
                alt2=4;
                }
                break;
            case 18:
                {
                alt2=5;
                }
                break;
            case 19:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:432:1: ( ruleDateType )
                    {
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:432:1: ( ruleDateType )
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:433:1: ruleDateType
                    {
                     before(grammarAccess.getBuiltInTypeAccess().getDateTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDateType_in_rule__BuiltInType__Alternatives853);
                    ruleDateType();

                    state._fsp--;

                     after(grammarAccess.getBuiltInTypeAccess().getDateTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:438:6: ( ruleIntegerType )
                    {
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:438:6: ( ruleIntegerType )
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:439:1: ruleIntegerType
                    {
                     before(grammarAccess.getBuiltInTypeAccess().getIntegerTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIntegerType_in_rule__BuiltInType__Alternatives870);
                    ruleIntegerType();

                    state._fsp--;

                     after(grammarAccess.getBuiltInTypeAccess().getIntegerTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:444:6: ( ruleDoubleType )
                    {
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:444:6: ( ruleDoubleType )
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:445:1: ruleDoubleType
                    {
                     before(grammarAccess.getBuiltInTypeAccess().getDoubleTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDoubleType_in_rule__BuiltInType__Alternatives887);
                    ruleDoubleType();

                    state._fsp--;

                     after(grammarAccess.getBuiltInTypeAccess().getDoubleTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:450:6: ( ruleFloatType )
                    {
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:450:6: ( ruleFloatType )
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:451:1: ruleFloatType
                    {
                     before(grammarAccess.getBuiltInTypeAccess().getFloatTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleFloatType_in_rule__BuiltInType__Alternatives904);
                    ruleFloatType();

                    state._fsp--;

                     after(grammarAccess.getBuiltInTypeAccess().getFloatTypeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:456:6: ( ruleStringType )
                    {
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:456:6: ( ruleStringType )
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:457:1: ruleStringType
                    {
                     before(grammarAccess.getBuiltInTypeAccess().getStringTypeParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleStringType_in_rule__BuiltInType__Alternatives921);
                    ruleStringType();

                    state._fsp--;

                     after(grammarAccess.getBuiltInTypeAccess().getStringTypeParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:462:6: ( ruleBooleanType )
                    {
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:462:6: ( ruleBooleanType )
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:463:1: ruleBooleanType
                    {
                     before(grammarAccess.getBuiltInTypeAccess().getBooleanTypeParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleBooleanType_in_rule__BuiltInType__Alternatives938);
                    ruleBooleanType();

                    state._fsp--;

                     after(grammarAccess.getBuiltInTypeAccess().getBooleanTypeParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuiltInType__Alternatives"


    // $ANTLR start "rule__Reference__Alternatives"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:473:1: rule__Reference__Alternatives : ( ( ruleTypeReference ) | ( ruleBuiltInType ) );
    public final void rule__Reference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:477:1: ( ( ruleTypeReference ) | ( ruleBuiltInType ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=14 && LA3_0<=19)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:478:1: ( ruleTypeReference )
                    {
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:478:1: ( ruleTypeReference )
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:479:1: ruleTypeReference
                    {
                     before(grammarAccess.getReferenceAccess().getTypeReferenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTypeReference_in_rule__Reference__Alternatives970);
                    ruleTypeReference();

                    state._fsp--;

                     after(grammarAccess.getReferenceAccess().getTypeReferenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:484:6: ( ruleBuiltInType )
                    {
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:484:6: ( ruleBuiltInType )
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:485:1: ruleBuiltInType
                    {
                     before(grammarAccess.getReferenceAccess().getBuiltInTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBuiltInType_in_rule__Reference__Alternatives987);
                    ruleBuiltInType();

                    state._fsp--;

                     after(grammarAccess.getReferenceAccess().getBuiltInTypeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Alternatives"


    // $ANTLR start "rule__DataModel__Group__0"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:498:1: rule__DataModel__Group__0 : rule__DataModel__Group__0__Impl rule__DataModel__Group__1 ;
    public final void rule__DataModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:502:1: ( rule__DataModel__Group__0__Impl rule__DataModel__Group__1 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:503:2: rule__DataModel__Group__0__Impl rule__DataModel__Group__1
            {
            pushFollow(FOLLOW_rule__DataModel__Group__0__Impl_in_rule__DataModel__Group__01018);
            rule__DataModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__1_in_rule__DataModel__Group__01021);
            rule__DataModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__0"


    // $ANTLR start "rule__DataModel__Group__0__Impl"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:510:1: rule__DataModel__Group__0__Impl : ( 'datamodel' ) ;
    public final void rule__DataModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:514:1: ( ( 'datamodel' ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:515:1: ( 'datamodel' )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:515:1: ( 'datamodel' )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:516:1: 'datamodel'
            {
             before(grammarAccess.getDataModelAccess().getDatamodelKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__DataModel__Group__0__Impl1049); 
             after(grammarAccess.getDataModelAccess().getDatamodelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__0__Impl"


    // $ANTLR start "rule__DataModel__Group__1"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:529:1: rule__DataModel__Group__1 : rule__DataModel__Group__1__Impl rule__DataModel__Group__2 ;
    public final void rule__DataModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:533:1: ( rule__DataModel__Group__1__Impl rule__DataModel__Group__2 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:534:2: rule__DataModel__Group__1__Impl rule__DataModel__Group__2
            {
            pushFollow(FOLLOW_rule__DataModel__Group__1__Impl_in_rule__DataModel__Group__11080);
            rule__DataModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__2_in_rule__DataModel__Group__11083);
            rule__DataModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__1"


    // $ANTLR start "rule__DataModel__Group__1__Impl"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:541:1: rule__DataModel__Group__1__Impl : ( ( rule__DataModel__NameAssignment_1 ) ) ;
    public final void rule__DataModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:545:1: ( ( ( rule__DataModel__NameAssignment_1 ) ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:546:1: ( ( rule__DataModel__NameAssignment_1 ) )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:546:1: ( ( rule__DataModel__NameAssignment_1 ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:547:1: ( rule__DataModel__NameAssignment_1 )
            {
             before(grammarAccess.getDataModelAccess().getNameAssignment_1()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:548:1: ( rule__DataModel__NameAssignment_1 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:548:2: rule__DataModel__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DataModel__NameAssignment_1_in_rule__DataModel__Group__1__Impl1110);
            rule__DataModel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__1__Impl"


    // $ANTLR start "rule__DataModel__Group__2"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:558:1: rule__DataModel__Group__2 : rule__DataModel__Group__2__Impl rule__DataModel__Group__3 ;
    public final void rule__DataModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:562:1: ( rule__DataModel__Group__2__Impl rule__DataModel__Group__3 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:563:2: rule__DataModel__Group__2__Impl rule__DataModel__Group__3
            {
            pushFollow(FOLLOW_rule__DataModel__Group__2__Impl_in_rule__DataModel__Group__21140);
            rule__DataModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__3_in_rule__DataModel__Group__21143);
            rule__DataModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__2"


    // $ANTLR start "rule__DataModel__Group__2__Impl"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:570:1: rule__DataModel__Group__2__Impl : ( '{' ) ;
    public final void rule__DataModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:574:1: ( ( '{' ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:575:1: ( '{' )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:575:1: ( '{' )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:576:1: '{'
            {
             before(grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__DataModel__Group__2__Impl1171); 
             after(grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__2__Impl"


    // $ANTLR start "rule__DataModel__Group__3"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:589:1: rule__DataModel__Group__3 : rule__DataModel__Group__3__Impl rule__DataModel__Group__4 ;
    public final void rule__DataModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:593:1: ( rule__DataModel__Group__3__Impl rule__DataModel__Group__4 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:594:2: rule__DataModel__Group__3__Impl rule__DataModel__Group__4
            {
            pushFollow(FOLLOW_rule__DataModel__Group__3__Impl_in_rule__DataModel__Group__31202);
            rule__DataModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__4_in_rule__DataModel__Group__31205);
            rule__DataModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__3"


    // $ANTLR start "rule__DataModel__Group__3__Impl"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:601:1: rule__DataModel__Group__3__Impl : ( ( rule__DataModel__EntitiesAssignment_3 )* ) ;
    public final void rule__DataModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:605:1: ( ( ( rule__DataModel__EntitiesAssignment_3 )* ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:606:1: ( ( rule__DataModel__EntitiesAssignment_3 )* )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:606:1: ( ( rule__DataModel__EntitiesAssignment_3 )* )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:607:1: ( rule__DataModel__EntitiesAssignment_3 )*
            {
             before(grammarAccess.getDataModelAccess().getEntitiesAssignment_3()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:608:1: ( rule__DataModel__EntitiesAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:608:2: rule__DataModel__EntitiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__DataModel__EntitiesAssignment_3_in_rule__DataModel__Group__3__Impl1232);
            	    rule__DataModel__EntitiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getDataModelAccess().getEntitiesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__3__Impl"


    // $ANTLR start "rule__DataModel__Group__4"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:618:1: rule__DataModel__Group__4 : rule__DataModel__Group__4__Impl ;
    public final void rule__DataModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:622:1: ( rule__DataModel__Group__4__Impl )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:623:2: rule__DataModel__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__DataModel__Group__4__Impl_in_rule__DataModel__Group__41263);
            rule__DataModel__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__4"


    // $ANTLR start "rule__DataModel__Group__4__Impl"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:629:1: rule__DataModel__Group__4__Impl : ( '}' ) ;
    public final void rule__DataModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:633:1: ( ( '}' ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:634:1: ( '}' )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:634:1: ( '}' )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:635:1: '}'
            {
             before(grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__DataModel__Group__4__Impl1291); 
             after(grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__4__Impl"


    // $ANTLR start "rule__DateType__Group__0"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:658:1: rule__DateType__Group__0 : rule__DateType__Group__0__Impl rule__DateType__Group__1 ;
    public final void rule__DateType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:662:1: ( rule__DateType__Group__0__Impl rule__DateType__Group__1 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:663:2: rule__DateType__Group__0__Impl rule__DateType__Group__1
            {
            pushFollow(FOLLOW_rule__DateType__Group__0__Impl_in_rule__DateType__Group__01332);
            rule__DateType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DateType__Group__1_in_rule__DateType__Group__01335);
            rule__DateType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateType__Group__0"


    // $ANTLR start "rule__DateType__Group__0__Impl"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:670:1: rule__DateType__Group__0__Impl : ( () ) ;
    public final void rule__DateType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:674:1: ( ( () ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:675:1: ( () )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:675:1: ( () )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:676:1: ()
            {
             before(grammarAccess.getDateTypeAccess().getDateTypeAction_0()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:677:1: ()
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:679:1: 
            {
            }

             after(grammarAccess.getDateTypeAccess().getDateTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateType__Group__0__Impl"


    // $ANTLR start "rule__DateType__Group__1"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:689:1: rule__DateType__Group__1 : rule__DateType__Group__1__Impl ;
    public final void rule__DateType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:693:1: ( rule__DateType__Group__1__Impl )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:694:2: rule__DateType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DateType__Group__1__Impl_in_rule__DateType__Group__11393);
            rule__DateType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateType__Group__1"


    // $ANTLR start "rule__DateType__Group__1__Impl"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:700:1: rule__DateType__Group__1__Impl : ( 'Date' ) ;
    public final void rule__DateType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:704:1: ( ( 'Date' ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:705:1: ( 'Date' )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:705:1: ( 'Date' )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:706:1: 'Date'
            {
             before(grammarAccess.getDateTypeAccess().getDateKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__DateType__Group__1__Impl1421); 
             after(grammarAccess.getDateTypeAccess().getDateKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateType__Group__1__Impl"


    // $ANTLR start "rule__IntegerType__Group__0"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:723:1: rule__IntegerType__Group__0 : rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1 ;
    public final void rule__IntegerType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:727:1: ( rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:728:2: rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1
            {
            pushFollow(FOLLOW_rule__IntegerType__Group__0__Impl_in_rule__IntegerType__Group__01456);
            rule__IntegerType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerType__Group__1_in_rule__IntegerType__Group__01459);
            rule__IntegerType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerType__Group__0"


    // $ANTLR start "rule__IntegerType__Group__0__Impl"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:735:1: rule__IntegerType__Group__0__Impl : ( () ) ;
    public final void rule__IntegerType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:739:1: ( ( () ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:740:1: ( () )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:740:1: ( () )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:741:1: ()
            {
             before(grammarAccess.getIntegerTypeAccess().getIntegerTypeAction_0()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:742:1: ()
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:744:1: 
            {
            }

             after(grammarAccess.getIntegerTypeAccess().getIntegerTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerType__Group__0__Impl"


    // $ANTLR start "rule__IntegerType__Group__1"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:754:1: rule__IntegerType__Group__1 : rule__IntegerType__Group__1__Impl ;
    public final void rule__IntegerType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:758:1: ( rule__IntegerType__Group__1__Impl )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:759:2: rule__IntegerType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__IntegerType__Group__1__Impl_in_rule__IntegerType__Group__11517);
            rule__IntegerType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerType__Group__1"


    // $ANTLR start "rule__IntegerType__Group__1__Impl"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:765:1: rule__IntegerType__Group__1__Impl : ( 'Integer' ) ;
    public final void rule__IntegerType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:769:1: ( ( 'Integer' ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:770:1: ( 'Integer' )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:770:1: ( 'Integer' )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:771:1: 'Integer'
            {
             before(grammarAccess.getIntegerTypeAccess().getIntegerKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__IntegerType__Group__1__Impl1545); 
             after(grammarAccess.getIntegerTypeAccess().getIntegerKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerType__Group__1__Impl"


    // $ANTLR start "rule__DoubleType__Group__0"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:788:1: rule__DoubleType__Group__0 : rule__DoubleType__Group__0__Impl rule__DoubleType__Group__1 ;
    public final void rule__DoubleType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:792:1: ( rule__DoubleType__Group__0__Impl rule__DoubleType__Group__1 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:793:2: rule__DoubleType__Group__0__Impl rule__DoubleType__Group__1
            {
            pushFollow(FOLLOW_rule__DoubleType__Group__0__Impl_in_rule__DoubleType__Group__01580);
            rule__DoubleType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DoubleType__Group__1_in_rule__DoubleType__Group__01583);
            rule__DoubleType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleType__Group__0"


    // $ANTLR start "rule__DoubleType__Group__0__Impl"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:800:1: rule__DoubleType__Group__0__Impl : ( () ) ;
    public final void rule__DoubleType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:804:1: ( ( () ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:805:1: ( () )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:805:1: ( () )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:806:1: ()
            {
             before(grammarAccess.getDoubleTypeAccess().getDoubleTypeAction_0()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:807:1: ()
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:809:1: 
            {
            }

             after(grammarAccess.getDoubleTypeAccess().getDoubleTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleType__Group__0__Impl"


    // $ANTLR start "rule__DoubleType__Group__1"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:819:1: rule__DoubleType__Group__1 : rule__DoubleType__Group__1__Impl ;
    public final void rule__DoubleType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:823:1: ( rule__DoubleType__Group__1__Impl )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:824:2: rule__DoubleType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DoubleType__Group__1__Impl_in_rule__DoubleType__Group__11641);
            rule__DoubleType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleType__Group__1"


    // $ANTLR start "rule__DoubleType__Group__1__Impl"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:830:1: rule__DoubleType__Group__1__Impl : ( 'Double' ) ;
    public final void rule__DoubleType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:834:1: ( ( 'Double' ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:835:1: ( 'Double' )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:835:1: ( 'Double' )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:836:1: 'Double'
            {
             before(grammarAccess.getDoubleTypeAccess().getDoubleKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__DoubleType__Group__1__Impl1669); 
             after(grammarAccess.getDoubleTypeAccess().getDoubleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleType__Group__1__Impl"


    // $ANTLR start "rule__FloatType__Group__0"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:853:1: rule__FloatType__Group__0 : rule__FloatType__Group__0__Impl rule__FloatType__Group__1 ;
    public final void rule__FloatType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:857:1: ( rule__FloatType__Group__0__Impl rule__FloatType__Group__1 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:858:2: rule__FloatType__Group__0__Impl rule__FloatType__Group__1
            {
            pushFollow(FOLLOW_rule__FloatType__Group__0__Impl_in_rule__FloatType__Group__01704);
            rule__FloatType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FloatType__Group__1_in_rule__FloatType__Group__01707);
            rule__FloatType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatType__Group__0"


    // $ANTLR start "rule__FloatType__Group__0__Impl"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:865:1: rule__FloatType__Group__0__Impl : ( () ) ;
    public final void rule__FloatType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:869:1: ( ( () ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:870:1: ( () )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:870:1: ( () )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:871:1: ()
            {
             before(grammarAccess.getFloatTypeAccess().getFloatTypeAction_0()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:872:1: ()
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:874:1: 
            {
            }

             after(grammarAccess.getFloatTypeAccess().getFloatTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatType__Group__0__Impl"


    // $ANTLR start "rule__FloatType__Group__1"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:884:1: rule__FloatType__Group__1 : rule__FloatType__Group__1__Impl ;
    public final void rule__FloatType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:888:1: ( rule__FloatType__Group__1__Impl )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:889:2: rule__FloatType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FloatType__Group__1__Impl_in_rule__FloatType__Group__11765);
            rule__FloatType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatType__Group__1"


    // $ANTLR start "rule__FloatType__Group__1__Impl"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:895:1: rule__FloatType__Group__1__Impl : ( 'Float' ) ;
    public final void rule__FloatType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:899:1: ( ( 'Float' ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:900:1: ( 'Float' )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:900:1: ( 'Float' )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:901:1: 'Float'
            {
             before(grammarAccess.getFloatTypeAccess().getFloatKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__FloatType__Group__1__Impl1793); 
             after(grammarAccess.getFloatTypeAccess().getFloatKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatType__Group__1__Impl"


    // $ANTLR start "rule__StringType__Group__0"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:918:1: rule__StringType__Group__0 : rule__StringType__Group__0__Impl rule__StringType__Group__1 ;
    public final void rule__StringType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:922:1: ( rule__StringType__Group__0__Impl rule__StringType__Group__1 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:923:2: rule__StringType__Group__0__Impl rule__StringType__Group__1
            {
            pushFollow(FOLLOW_rule__StringType__Group__0__Impl_in_rule__StringType__Group__01828);
            rule__StringType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringType__Group__1_in_rule__StringType__Group__01831);
            rule__StringType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__0"


    // $ANTLR start "rule__StringType__Group__0__Impl"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:930:1: rule__StringType__Group__0__Impl : ( () ) ;
    public final void rule__StringType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:934:1: ( ( () ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:935:1: ( () )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:935:1: ( () )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:936:1: ()
            {
             before(grammarAccess.getStringTypeAccess().getStringTypeAction_0()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:937:1: ()
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:939:1: 
            {
            }

             after(grammarAccess.getStringTypeAccess().getStringTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__0__Impl"


    // $ANTLR start "rule__StringType__Group__1"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:949:1: rule__StringType__Group__1 : rule__StringType__Group__1__Impl ;
    public final void rule__StringType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:953:1: ( rule__StringType__Group__1__Impl )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:954:2: rule__StringType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__StringType__Group__1__Impl_in_rule__StringType__Group__11889);
            rule__StringType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__1"


    // $ANTLR start "rule__StringType__Group__1__Impl"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:960:1: rule__StringType__Group__1__Impl : ( 'String' ) ;
    public final void rule__StringType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:964:1: ( ( 'String' ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:965:1: ( 'String' )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:965:1: ( 'String' )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:966:1: 'String'
            {
             before(grammarAccess.getStringTypeAccess().getStringKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__StringType__Group__1__Impl1917); 
             after(grammarAccess.getStringTypeAccess().getStringKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__1__Impl"


    // $ANTLR start "rule__BooleanType__Group__0"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:983:1: rule__BooleanType__Group__0 : rule__BooleanType__Group__0__Impl rule__BooleanType__Group__1 ;
    public final void rule__BooleanType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:987:1: ( rule__BooleanType__Group__0__Impl rule__BooleanType__Group__1 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:988:2: rule__BooleanType__Group__0__Impl rule__BooleanType__Group__1
            {
            pushFollow(FOLLOW_rule__BooleanType__Group__0__Impl_in_rule__BooleanType__Group__01952);
            rule__BooleanType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanType__Group__1_in_rule__BooleanType__Group__01955);
            rule__BooleanType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanType__Group__0"


    // $ANTLR start "rule__BooleanType__Group__0__Impl"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:995:1: rule__BooleanType__Group__0__Impl : ( () ) ;
    public final void rule__BooleanType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:999:1: ( ( () ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1000:1: ( () )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1000:1: ( () )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1001:1: ()
            {
             before(grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1002:1: ()
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1004:1: 
            {
            }

             after(grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanType__Group__0__Impl"


    // $ANTLR start "rule__BooleanType__Group__1"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1014:1: rule__BooleanType__Group__1 : rule__BooleanType__Group__1__Impl ;
    public final void rule__BooleanType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1018:1: ( rule__BooleanType__Group__1__Impl )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1019:2: rule__BooleanType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BooleanType__Group__1__Impl_in_rule__BooleanType__Group__12013);
            rule__BooleanType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanType__Group__1"


    // $ANTLR start "rule__BooleanType__Group__1__Impl"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1025:1: rule__BooleanType__Group__1__Impl : ( 'Boolean' ) ;
    public final void rule__BooleanType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1029:1: ( ( 'Boolean' ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1030:1: ( 'Boolean' )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1030:1: ( 'Boolean' )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1031:1: 'Boolean'
            {
             before(grammarAccess.getBooleanTypeAccess().getBooleanKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__BooleanType__Group__1__Impl2041); 
             after(grammarAccess.getBooleanTypeAccess().getBooleanKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanType__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1048:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1052:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1053:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__02076);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__02079);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1060:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1064:1: ( ( 'entity' ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1065:1: ( 'entity' )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1065:1: ( 'entity' )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1066:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Entity__Group__0__Impl2107); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1079:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1083:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1084:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__12138);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__12141);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1091:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1095:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1096:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1096:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1097:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1098:1: ( rule__Entity__NameAssignment_1 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1098:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl2168);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1108:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1112:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1113:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__22198);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__22201);
            rule__Entity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1120:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1124:1: ( ( '{' ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1125:1: ( '{' )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1125:1: ( '{' )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1126:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Entity__Group__2__Impl2229); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1139:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1143:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1144:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__32260);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__32263);
            rule__Entity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1151:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__AttributesAssignment_3 )* ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1155:1: ( ( ( rule__Entity__AttributesAssignment_3 )* ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1156:1: ( ( rule__Entity__AttributesAssignment_3 )* )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1156:1: ( ( rule__Entity__AttributesAssignment_3 )* )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1157:1: ( rule__Entity__AttributesAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_3()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1158:1: ( rule__Entity__AttributesAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1158:2: rule__Entity__AttributesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Entity__AttributesAssignment_3_in_rule__Entity__Group__3__Impl2290);
            	    rule__Entity__AttributesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAttributesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1168:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1172:1: ( rule__Entity__Group__4__Impl )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1173:2: rule__Entity__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__42321);
            rule__Entity__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1179:1: rule__Entity__Group__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1183:1: ( ( '}' ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1184:1: ( '}' )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1184:1: ( '}' )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1185:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Entity__Group__4__Impl2349); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1208:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1212:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1213:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__02390);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__02393);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1220:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1224:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1225:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1225:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1226:1: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1227:1: ( rule__Attribute__NameAssignment_0 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1227:2: rule__Attribute__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__0__Impl2420);
            rule__Attribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1237:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1241:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1242:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__12450);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__12453);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1249:1: rule__Attribute__Group__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1253:1: ( ( ':' ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1254:1: ( ':' )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1254:1: ( ':' )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1255:1: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__Attribute__Group__1__Impl2481); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1268:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1272:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1273:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__22512);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__22515);
            rule__Attribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1280:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__TypeAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1284:1: ( ( ( rule__Attribute__TypeAssignment_2 ) ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1285:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1285:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1286:1: ( rule__Attribute__TypeAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1287:1: ( rule__Attribute__TypeAssignment_2 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1287:2: rule__Attribute__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__TypeAssignment_2_in_rule__Attribute__Group__2__Impl2542);
            rule__Attribute__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1297:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1301:1: ( rule__Attribute__Group__3__Impl )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1302:2: rule__Attribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__32572);
            rule__Attribute__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1308:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__MultiplicityAssignment_3 )? ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1312:1: ( ( ( rule__Attribute__MultiplicityAssignment_3 )? ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1313:1: ( ( rule__Attribute__MultiplicityAssignment_3 )? )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1313:1: ( ( rule__Attribute__MultiplicityAssignment_3 )? )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1314:1: ( rule__Attribute__MultiplicityAssignment_3 )?
            {
             before(grammarAccess.getAttributeAccess().getMultiplicityAssignment_3()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1315:1: ( rule__Attribute__MultiplicityAssignment_3 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1315:2: rule__Attribute__MultiplicityAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Attribute__MultiplicityAssignment_3_in_rule__Attribute__Group__3__Impl2599);
                    rule__Attribute__MultiplicityAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getMultiplicityAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Model__DatamodelsAssignment"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1334:1: rule__Model__DatamodelsAssignment : ( ruleDataModel ) ;
    public final void rule__Model__DatamodelsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1338:1: ( ( ruleDataModel ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1339:1: ( ruleDataModel )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1339:1: ( ruleDataModel )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1340:1: ruleDataModel
            {
             before(grammarAccess.getModelAccess().getDatamodelsDataModelParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleDataModel_in_rule__Model__DatamodelsAssignment2643);
            ruleDataModel();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDatamodelsDataModelParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DatamodelsAssignment"


    // $ANTLR start "rule__DataModel__NameAssignment_1"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1349:1: rule__DataModel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1353:1: ( ( RULE_ID ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1354:1: ( RULE_ID )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1354:1: ( RULE_ID )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1355:1: RULE_ID
            {
             before(grammarAccess.getDataModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataModel__NameAssignment_12674); 
             after(grammarAccess.getDataModelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__NameAssignment_1"


    // $ANTLR start "rule__DataModel__EntitiesAssignment_3"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1364:1: rule__DataModel__EntitiesAssignment_3 : ( ruleEntity ) ;
    public final void rule__DataModel__EntitiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1368:1: ( ( ruleEntity ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1369:1: ( ruleEntity )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1369:1: ( ruleEntity )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1370:1: ruleEntity
            {
             before(grammarAccess.getDataModelAccess().getEntitiesEntityParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__DataModel__EntitiesAssignment_32705);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getDataModelAccess().getEntitiesEntityParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__EntitiesAssignment_3"


    // $ANTLR start "rule__TypeReference__TypeAssignment"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1379:1: rule__TypeReference__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__TypeReference__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1383:1: ( ( ( RULE_ID ) ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1384:1: ( ( RULE_ID ) )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1384:1: ( ( RULE_ID ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1385:1: ( RULE_ID )
            {
             before(grammarAccess.getTypeReferenceAccess().getTypeEntityCrossReference_0()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1386:1: ( RULE_ID )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1387:1: RULE_ID
            {
             before(grammarAccess.getTypeReferenceAccess().getTypeEntityIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeReference__TypeAssignment2740); 
             after(grammarAccess.getTypeReferenceAccess().getTypeEntityIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getTypeReferenceAccess().getTypeEntityCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReference__TypeAssignment"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1398:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1402:1: ( ( RULE_ID ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1403:1: ( RULE_ID )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1403:1: ( RULE_ID )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1404:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_12775); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__AttributesAssignment_3"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1413:1: rule__Entity__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1417:1: ( ( ruleAttribute ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1418:1: ( ruleAttribute )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1418:1: ( ruleAttribute )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1419:1: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_32806);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__AttributesAssignment_3"


    // $ANTLR start "rule__Attribute__NameAssignment_0"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1428:1: rule__Attribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1432:1: ( ( RULE_ID ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1433:1: ( RULE_ID )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1433:1: ( RULE_ID )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1434:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_02837); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_0"


    // $ANTLR start "rule__Attribute__TypeAssignment_2"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1443:1: rule__Attribute__TypeAssignment_2 : ( ruleReference ) ;
    public final void rule__Attribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1447:1: ( ( ruleReference ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1448:1: ( ruleReference )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1448:1: ( ruleReference )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1449:1: ruleReference
            {
             before(grammarAccess.getAttributeAccess().getTypeReferenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleReference_in_rule__Attribute__TypeAssignment_22868);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeReferenceParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_2"


    // $ANTLR start "rule__Attribute__MultiplicityAssignment_3"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1458:1: rule__Attribute__MultiplicityAssignment_3 : ( ( '[]' ) ) ;
    public final void rule__Attribute__MultiplicityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1462:1: ( ( ( '[]' ) ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1463:1: ( ( '[]' ) )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1463:1: ( ( '[]' ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1464:1: ( '[]' )
            {
             before(grammarAccess.getAttributeAccess().getMultiplicityLeftSquareBracketRightSquareBracketKeyword_3_0()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1465:1: ( '[]' )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1466:1: '[]'
            {
             before(grammarAccess.getAttributeAccess().getMultiplicityLeftSquareBracketRightSquareBracketKeyword_3_0()); 
            match(input,22,FOLLOW_22_in_rule__Attribute__MultiplicityAssignment_32904); 
             after(grammarAccess.getAttributeAccess().getMultiplicityLeftSquareBracketRightSquareBracketKeyword_3_0()); 

            }

             after(grammarAccess.getAttributeAccess().getMultiplicityLeftSquareBracketRightSquareBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__MultiplicityAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DatamodelsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleDataModel_in_entryRuleDataModel122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataModel129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__0_in_ruleDataModel155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateType_in_entryRuleDateType182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDateType189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateType__Group__0_in_ruleDateType215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerType_in_entryRuleIntegerType242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerType249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerType__Group__0_in_ruleIntegerType275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_entryRuleDoubleType302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleType309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleType__Group__0_in_ruleDoubleType335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_entryRuleFloatType362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatType369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatType__Group__0_in_ruleFloatType395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_entryRuleStringType422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringType429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__Group__0_in_ruleStringType455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_entryRuleBooleanType482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanType489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanType__Group__0_in_ruleBooleanType515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltInType_in_entryRuleBuiltInType542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltInType549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BuiltInType__Alternatives_in_ruleBuiltInType575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Alternatives_in_ruleReference635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeReference_in_entryRuleTypeReference662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeReference669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeReference__TypeAssignment_in_ruleTypeReference695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateType_in_rule__BuiltInType__Alternatives853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerType_in_rule__BuiltInType__Alternatives870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_rule__BuiltInType__Alternatives887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_rule__BuiltInType__Alternatives904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_rule__BuiltInType__Alternatives921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_rule__BuiltInType__Alternatives938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeReference_in_rule__Reference__Alternatives970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltInType_in_rule__Reference__Alternatives987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__0__Impl_in_rule__DataModel__Group__01018 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataModel__Group__1_in_rule__DataModel__Group__01021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__DataModel__Group__0__Impl1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__1__Impl_in_rule__DataModel__Group__11080 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__DataModel__Group__2_in_rule__DataModel__Group__11083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__NameAssignment_1_in_rule__DataModel__Group__1__Impl1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__2__Impl_in_rule__DataModel__Group__21140 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_rule__DataModel__Group__3_in_rule__DataModel__Group__21143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__DataModel__Group__2__Impl1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__3__Impl_in_rule__DataModel__Group__31202 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_rule__DataModel__Group__4_in_rule__DataModel__Group__31205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__EntitiesAssignment_3_in_rule__DataModel__Group__3__Impl1232 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__4__Impl_in_rule__DataModel__Group__41263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__DataModel__Group__4__Impl1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateType__Group__0__Impl_in_rule__DateType__Group__01332 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__DateType__Group__1_in_rule__DateType__Group__01335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateType__Group__1__Impl_in_rule__DateType__Group__11393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__DateType__Group__1__Impl1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerType__Group__0__Impl_in_rule__IntegerType__Group__01456 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__IntegerType__Group__1_in_rule__IntegerType__Group__01459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerType__Group__1__Impl_in_rule__IntegerType__Group__11517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__IntegerType__Group__1__Impl1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleType__Group__0__Impl_in_rule__DoubleType__Group__01580 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__DoubleType__Group__1_in_rule__DoubleType__Group__01583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleType__Group__1__Impl_in_rule__DoubleType__Group__11641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__DoubleType__Group__1__Impl1669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatType__Group__0__Impl_in_rule__FloatType__Group__01704 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__FloatType__Group__1_in_rule__FloatType__Group__01707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatType__Group__1__Impl_in_rule__FloatType__Group__11765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__FloatType__Group__1__Impl1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__Group__0__Impl_in_rule__StringType__Group__01828 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__StringType__Group__1_in_rule__StringType__Group__01831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__Group__1__Impl_in_rule__StringType__Group__11889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__StringType__Group__1__Impl1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanType__Group__0__Impl_in_rule__BooleanType__Group__01952 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__BooleanType__Group__1_in_rule__BooleanType__Group__01955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanType__Group__1__Impl_in_rule__BooleanType__Group__12013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__BooleanType__Group__1__Impl2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__02076 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__02079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Entity__Group__0__Impl2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__12138 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__12141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__22198 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__22201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Entity__Group__2__Impl2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__32260 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__32263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__AttributesAssignment_3_in_rule__Entity__Group__3__Impl2290 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__42321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Entity__Group__4__Impl2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__02390 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__02393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__0__Impl2420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__12450 = new BitSet(new long[]{0x00000000000FC010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__12453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Attribute__Group__1__Impl2481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__22512 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__22515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_2_in_rule__Attribute__Group__2__Impl2542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__32572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__MultiplicityAssignment_3_in_rule__Attribute__Group__3__Impl2599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataModel_in_rule__Model__DatamodelsAssignment2643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataModel__NameAssignment_12674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__DataModel__EntitiesAssignment_32705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeReference__TypeAssignment2740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_12775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_32806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_02837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__Attribute__TypeAssignment_22868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Attribute__MultiplicityAssignment_32904 = new BitSet(new long[]{0x0000000000000002L});

}
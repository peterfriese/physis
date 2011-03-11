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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'iOS'", "'Android'", "'datamodel'", "'{'", "'}'", "'is'", "'on platform'", "'type'", "'entity'", "':'", "'[]'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
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

                if ( (LA1_0==13) ) {
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


    // $ANTLR start "entryRuleType"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:117:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:118:1: ( ruleType EOF )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:119:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType182);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType189); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:126:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:130:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:131:1: ( ( rule__Type__Alternatives ) )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:131:1: ( ( rule__Type__Alternatives ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:132:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:133:1: ( rule__Type__Alternatives )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:133:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType215);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleMappingClause"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:145:1: entryRuleMappingClause : ruleMappingClause EOF ;
    public final void entryRuleMappingClause() throws RecognitionException {
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:146:1: ( ruleMappingClause EOF )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:147:1: ruleMappingClause EOF
            {
             before(grammarAccess.getMappingClauseRule()); 
            pushFollow(FOLLOW_ruleMappingClause_in_entryRuleMappingClause242);
            ruleMappingClause();

            state._fsp--;

             after(grammarAccess.getMappingClauseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMappingClause249); 

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
    // $ANTLR end "entryRuleMappingClause"


    // $ANTLR start "ruleMappingClause"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:154:1: ruleMappingClause : ( ( rule__MappingClause__Group__0 ) ) ;
    public final void ruleMappingClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:158:2: ( ( ( rule__MappingClause__Group__0 ) ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:159:1: ( ( rule__MappingClause__Group__0 ) )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:159:1: ( ( rule__MappingClause__Group__0 ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:160:1: ( rule__MappingClause__Group__0 )
            {
             before(grammarAccess.getMappingClauseAccess().getGroup()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:161:1: ( rule__MappingClause__Group__0 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:161:2: rule__MappingClause__Group__0
            {
            pushFollow(FOLLOW_rule__MappingClause__Group__0_in_ruleMappingClause275);
            rule__MappingClause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMappingClauseAccess().getGroup()); 

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
    // $ANTLR end "ruleMappingClause"


    // $ANTLR start "entryRuleSimpleType"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:173:1: entryRuleSimpleType : ruleSimpleType EOF ;
    public final void entryRuleSimpleType() throws RecognitionException {
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:174:1: ( ruleSimpleType EOF )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:175:1: ruleSimpleType EOF
            {
             before(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_ruleSimpleType_in_entryRuleSimpleType302);
            ruleSimpleType();

            state._fsp--;

             after(grammarAccess.getSimpleTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleType309); 

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
    // $ANTLR end "entryRuleSimpleType"


    // $ANTLR start "ruleSimpleType"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:182:1: ruleSimpleType : ( ( rule__SimpleType__Group__0 ) ) ;
    public final void ruleSimpleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:186:2: ( ( ( rule__SimpleType__Group__0 ) ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:187:1: ( ( rule__SimpleType__Group__0 ) )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:187:1: ( ( rule__SimpleType__Group__0 ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:188:1: ( rule__SimpleType__Group__0 )
            {
             before(grammarAccess.getSimpleTypeAccess().getGroup()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:189:1: ( rule__SimpleType__Group__0 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:189:2: rule__SimpleType__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleType__Group__0_in_ruleSimpleType335);
            rule__SimpleType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleSimpleType"


    // $ANTLR start "entryRuleEntity"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:201:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:202:1: ( ruleEntity EOF )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:203:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity362);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity369); 

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
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:210:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:214:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:215:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:215:1: ( ( rule__Entity__Group__0 ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:216:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:217:1: ( rule__Entity__Group__0 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:217:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity395);
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
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:229:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:230:1: ( ruleAttribute EOF )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:231:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute422);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute429); 

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
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:238:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:242:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:243:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:243:1: ( ( rule__Attribute__Group__0 ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:244:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:245:1: ( rule__Attribute__Group__0 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:245:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute455);
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


    // $ANTLR start "rulePlatform"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:258:1: rulePlatform : ( ( rule__Platform__Alternatives ) ) ;
    public final void rulePlatform() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:262:1: ( ( ( rule__Platform__Alternatives ) ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:263:1: ( ( rule__Platform__Alternatives ) )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:263:1: ( ( rule__Platform__Alternatives ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:264:1: ( rule__Platform__Alternatives )
            {
             before(grammarAccess.getPlatformAccess().getAlternatives()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:265:1: ( rule__Platform__Alternatives )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:265:2: rule__Platform__Alternatives
            {
            pushFollow(FOLLOW_rule__Platform__Alternatives_in_rulePlatform492);
            rule__Platform__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAccess().getAlternatives()); 

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
    // $ANTLR end "rulePlatform"


    // $ANTLR start "rule__Type__Alternatives"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:276:1: rule__Type__Alternatives : ( ( ruleSimpleType ) | ( ruleEntity ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:280:1: ( ( ruleSimpleType ) | ( ruleEntity ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            else if ( (LA2_0==19) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:281:1: ( ruleSimpleType )
                    {
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:281:1: ( ruleSimpleType )
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:282:1: ruleSimpleType
                    {
                     before(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSimpleType_in_rule__Type__Alternatives527);
                    ruleSimpleType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:287:6: ( ruleEntity )
                    {
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:287:6: ( ruleEntity )
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:288:1: ruleEntity
                    {
                     before(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEntity_in_rule__Type__Alternatives544);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Platform__Alternatives"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:298:1: rule__Platform__Alternatives : ( ( ( 'iOS' ) ) | ( ( 'Android' ) ) );
    public final void rule__Platform__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:302:1: ( ( ( 'iOS' ) ) | ( ( 'Android' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:303:1: ( ( 'iOS' ) )
                    {
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:303:1: ( ( 'iOS' ) )
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:304:1: ( 'iOS' )
                    {
                     before(grammarAccess.getPlatformAccess().getIOSEnumLiteralDeclaration_0()); 
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:305:1: ( 'iOS' )
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:305:3: 'iOS'
                    {
                    match(input,11,FOLLOW_11_in_rule__Platform__Alternatives577); 

                    }

                     after(grammarAccess.getPlatformAccess().getIOSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:310:6: ( ( 'Android' ) )
                    {
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:310:6: ( ( 'Android' ) )
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:311:1: ( 'Android' )
                    {
                     before(grammarAccess.getPlatformAccess().getAndroidEnumLiteralDeclaration_1()); 
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:312:1: ( 'Android' )
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:312:3: 'Android'
                    {
                    match(input,12,FOLLOW_12_in_rule__Platform__Alternatives598); 

                    }

                     after(grammarAccess.getPlatformAccess().getAndroidEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__Platform__Alternatives"


    // $ANTLR start "rule__DataModel__Group__0"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:324:1: rule__DataModel__Group__0 : rule__DataModel__Group__0__Impl rule__DataModel__Group__1 ;
    public final void rule__DataModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:328:1: ( rule__DataModel__Group__0__Impl rule__DataModel__Group__1 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:329:2: rule__DataModel__Group__0__Impl rule__DataModel__Group__1
            {
            pushFollow(FOLLOW_rule__DataModel__Group__0__Impl_in_rule__DataModel__Group__0631);
            rule__DataModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__1_in_rule__DataModel__Group__0634);
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
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:336:1: rule__DataModel__Group__0__Impl : ( 'datamodel' ) ;
    public final void rule__DataModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:340:1: ( ( 'datamodel' ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:341:1: ( 'datamodel' )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:341:1: ( 'datamodel' )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:342:1: 'datamodel'
            {
             before(grammarAccess.getDataModelAccess().getDatamodelKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__DataModel__Group__0__Impl662); 
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
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:355:1: rule__DataModel__Group__1 : rule__DataModel__Group__1__Impl rule__DataModel__Group__2 ;
    public final void rule__DataModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:359:1: ( rule__DataModel__Group__1__Impl rule__DataModel__Group__2 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:360:2: rule__DataModel__Group__1__Impl rule__DataModel__Group__2
            {
            pushFollow(FOLLOW_rule__DataModel__Group__1__Impl_in_rule__DataModel__Group__1693);
            rule__DataModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__2_in_rule__DataModel__Group__1696);
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
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:367:1: rule__DataModel__Group__1__Impl : ( ( rule__DataModel__NameAssignment_1 ) ) ;
    public final void rule__DataModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:371:1: ( ( ( rule__DataModel__NameAssignment_1 ) ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:372:1: ( ( rule__DataModel__NameAssignment_1 ) )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:372:1: ( ( rule__DataModel__NameAssignment_1 ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:373:1: ( rule__DataModel__NameAssignment_1 )
            {
             before(grammarAccess.getDataModelAccess().getNameAssignment_1()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:374:1: ( rule__DataModel__NameAssignment_1 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:374:2: rule__DataModel__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DataModel__NameAssignment_1_in_rule__DataModel__Group__1__Impl723);
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
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:384:1: rule__DataModel__Group__2 : rule__DataModel__Group__2__Impl rule__DataModel__Group__3 ;
    public final void rule__DataModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:388:1: ( rule__DataModel__Group__2__Impl rule__DataModel__Group__3 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:389:2: rule__DataModel__Group__2__Impl rule__DataModel__Group__3
            {
            pushFollow(FOLLOW_rule__DataModel__Group__2__Impl_in_rule__DataModel__Group__2753);
            rule__DataModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__3_in_rule__DataModel__Group__2756);
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
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:396:1: rule__DataModel__Group__2__Impl : ( '{' ) ;
    public final void rule__DataModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:400:1: ( ( '{' ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:401:1: ( '{' )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:401:1: ( '{' )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:402:1: '{'
            {
             before(grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__DataModel__Group__2__Impl784); 
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
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:415:1: rule__DataModel__Group__3 : rule__DataModel__Group__3__Impl rule__DataModel__Group__4 ;
    public final void rule__DataModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:419:1: ( rule__DataModel__Group__3__Impl rule__DataModel__Group__4 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:420:2: rule__DataModel__Group__3__Impl rule__DataModel__Group__4
            {
            pushFollow(FOLLOW_rule__DataModel__Group__3__Impl_in_rule__DataModel__Group__3815);
            rule__DataModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__4_in_rule__DataModel__Group__3818);
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
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:427:1: rule__DataModel__Group__3__Impl : ( ( rule__DataModel__TypesAssignment_3 )* ) ;
    public final void rule__DataModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:431:1: ( ( ( rule__DataModel__TypesAssignment_3 )* ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:432:1: ( ( rule__DataModel__TypesAssignment_3 )* )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:432:1: ( ( rule__DataModel__TypesAssignment_3 )* )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:433:1: ( rule__DataModel__TypesAssignment_3 )*
            {
             before(grammarAccess.getDataModelAccess().getTypesAssignment_3()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:434:1: ( rule__DataModel__TypesAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=18 && LA4_0<=19)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:434:2: rule__DataModel__TypesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__DataModel__TypesAssignment_3_in_rule__DataModel__Group__3__Impl845);
            	    rule__DataModel__TypesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getDataModelAccess().getTypesAssignment_3()); 

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
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:444:1: rule__DataModel__Group__4 : rule__DataModel__Group__4__Impl ;
    public final void rule__DataModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:448:1: ( rule__DataModel__Group__4__Impl )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:449:2: rule__DataModel__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__DataModel__Group__4__Impl_in_rule__DataModel__Group__4876);
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
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:455:1: rule__DataModel__Group__4__Impl : ( '}' ) ;
    public final void rule__DataModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:459:1: ( ( '}' ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:460:1: ( '}' )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:460:1: ( '}' )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:461:1: '}'
            {
             before(grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__DataModel__Group__4__Impl904); 
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


    // $ANTLR start "rule__MappingClause__Group__0"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:484:1: rule__MappingClause__Group__0 : rule__MappingClause__Group__0__Impl rule__MappingClause__Group__1 ;
    public final void rule__MappingClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:488:1: ( rule__MappingClause__Group__0__Impl rule__MappingClause__Group__1 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:489:2: rule__MappingClause__Group__0__Impl rule__MappingClause__Group__1
            {
            pushFollow(FOLLOW_rule__MappingClause__Group__0__Impl_in_rule__MappingClause__Group__0945);
            rule__MappingClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MappingClause__Group__1_in_rule__MappingClause__Group__0948);
            rule__MappingClause__Group__1();

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
    // $ANTLR end "rule__MappingClause__Group__0"


    // $ANTLR start "rule__MappingClause__Group__0__Impl"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:496:1: rule__MappingClause__Group__0__Impl : ( 'is' ) ;
    public final void rule__MappingClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:500:1: ( ( 'is' ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:501:1: ( 'is' )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:501:1: ( 'is' )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:502:1: 'is'
            {
             before(grammarAccess.getMappingClauseAccess().getIsKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__MappingClause__Group__0__Impl976); 
             after(grammarAccess.getMappingClauseAccess().getIsKeyword_0()); 

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
    // $ANTLR end "rule__MappingClause__Group__0__Impl"


    // $ANTLR start "rule__MappingClause__Group__1"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:515:1: rule__MappingClause__Group__1 : rule__MappingClause__Group__1__Impl rule__MappingClause__Group__2 ;
    public final void rule__MappingClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:519:1: ( rule__MappingClause__Group__1__Impl rule__MappingClause__Group__2 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:520:2: rule__MappingClause__Group__1__Impl rule__MappingClause__Group__2
            {
            pushFollow(FOLLOW_rule__MappingClause__Group__1__Impl_in_rule__MappingClause__Group__11007);
            rule__MappingClause__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MappingClause__Group__2_in_rule__MappingClause__Group__11010);
            rule__MappingClause__Group__2();

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
    // $ANTLR end "rule__MappingClause__Group__1"


    // $ANTLR start "rule__MappingClause__Group__1__Impl"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:527:1: rule__MappingClause__Group__1__Impl : ( ( rule__MappingClause__MappedTypeAssignment_1 ) ) ;
    public final void rule__MappingClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:531:1: ( ( ( rule__MappingClause__MappedTypeAssignment_1 ) ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:532:1: ( ( rule__MappingClause__MappedTypeAssignment_1 ) )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:532:1: ( ( rule__MappingClause__MappedTypeAssignment_1 ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:533:1: ( rule__MappingClause__MappedTypeAssignment_1 )
            {
             before(grammarAccess.getMappingClauseAccess().getMappedTypeAssignment_1()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:534:1: ( rule__MappingClause__MappedTypeAssignment_1 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:534:2: rule__MappingClause__MappedTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__MappingClause__MappedTypeAssignment_1_in_rule__MappingClause__Group__1__Impl1037);
            rule__MappingClause__MappedTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingClauseAccess().getMappedTypeAssignment_1()); 

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
    // $ANTLR end "rule__MappingClause__Group__1__Impl"


    // $ANTLR start "rule__MappingClause__Group__2"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:544:1: rule__MappingClause__Group__2 : rule__MappingClause__Group__2__Impl rule__MappingClause__Group__3 ;
    public final void rule__MappingClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:548:1: ( rule__MappingClause__Group__2__Impl rule__MappingClause__Group__3 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:549:2: rule__MappingClause__Group__2__Impl rule__MappingClause__Group__3
            {
            pushFollow(FOLLOW_rule__MappingClause__Group__2__Impl_in_rule__MappingClause__Group__21067);
            rule__MappingClause__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MappingClause__Group__3_in_rule__MappingClause__Group__21070);
            rule__MappingClause__Group__3();

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
    // $ANTLR end "rule__MappingClause__Group__2"


    // $ANTLR start "rule__MappingClause__Group__2__Impl"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:556:1: rule__MappingClause__Group__2__Impl : ( 'on platform' ) ;
    public final void rule__MappingClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:560:1: ( ( 'on platform' ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:561:1: ( 'on platform' )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:561:1: ( 'on platform' )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:562:1: 'on platform'
            {
             before(grammarAccess.getMappingClauseAccess().getOnPlatformKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__MappingClause__Group__2__Impl1098); 
             after(grammarAccess.getMappingClauseAccess().getOnPlatformKeyword_2()); 

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
    // $ANTLR end "rule__MappingClause__Group__2__Impl"


    // $ANTLR start "rule__MappingClause__Group__3"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:575:1: rule__MappingClause__Group__3 : rule__MappingClause__Group__3__Impl ;
    public final void rule__MappingClause__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:579:1: ( rule__MappingClause__Group__3__Impl )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:580:2: rule__MappingClause__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MappingClause__Group__3__Impl_in_rule__MappingClause__Group__31129);
            rule__MappingClause__Group__3__Impl();

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
    // $ANTLR end "rule__MappingClause__Group__3"


    // $ANTLR start "rule__MappingClause__Group__3__Impl"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:586:1: rule__MappingClause__Group__3__Impl : ( ( rule__MappingClause__PlatformAssignment_3 ) ) ;
    public final void rule__MappingClause__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:590:1: ( ( ( rule__MappingClause__PlatformAssignment_3 ) ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:591:1: ( ( rule__MappingClause__PlatformAssignment_3 ) )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:591:1: ( ( rule__MappingClause__PlatformAssignment_3 ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:592:1: ( rule__MappingClause__PlatformAssignment_3 )
            {
             before(grammarAccess.getMappingClauseAccess().getPlatformAssignment_3()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:593:1: ( rule__MappingClause__PlatformAssignment_3 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:593:2: rule__MappingClause__PlatformAssignment_3
            {
            pushFollow(FOLLOW_rule__MappingClause__PlatformAssignment_3_in_rule__MappingClause__Group__3__Impl1156);
            rule__MappingClause__PlatformAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMappingClauseAccess().getPlatformAssignment_3()); 

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
    // $ANTLR end "rule__MappingClause__Group__3__Impl"


    // $ANTLR start "rule__SimpleType__Group__0"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:611:1: rule__SimpleType__Group__0 : rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1 ;
    public final void rule__SimpleType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:615:1: ( rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:616:2: rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleType__Group__0__Impl_in_rule__SimpleType__Group__01194);
            rule__SimpleType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleType__Group__1_in_rule__SimpleType__Group__01197);
            rule__SimpleType__Group__1();

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
    // $ANTLR end "rule__SimpleType__Group__0"


    // $ANTLR start "rule__SimpleType__Group__0__Impl"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:623:1: rule__SimpleType__Group__0__Impl : ( 'type' ) ;
    public final void rule__SimpleType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:627:1: ( ( 'type' ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:628:1: ( 'type' )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:628:1: ( 'type' )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:629:1: 'type'
            {
             before(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__SimpleType__Group__0__Impl1225); 
             after(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0()); 

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
    // $ANTLR end "rule__SimpleType__Group__0__Impl"


    // $ANTLR start "rule__SimpleType__Group__1"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:642:1: rule__SimpleType__Group__1 : rule__SimpleType__Group__1__Impl rule__SimpleType__Group__2 ;
    public final void rule__SimpleType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:646:1: ( rule__SimpleType__Group__1__Impl rule__SimpleType__Group__2 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:647:2: rule__SimpleType__Group__1__Impl rule__SimpleType__Group__2
            {
            pushFollow(FOLLOW_rule__SimpleType__Group__1__Impl_in_rule__SimpleType__Group__11256);
            rule__SimpleType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleType__Group__2_in_rule__SimpleType__Group__11259);
            rule__SimpleType__Group__2();

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
    // $ANTLR end "rule__SimpleType__Group__1"


    // $ANTLR start "rule__SimpleType__Group__1__Impl"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:654:1: rule__SimpleType__Group__1__Impl : ( ( rule__SimpleType__NameAssignment_1 ) ) ;
    public final void rule__SimpleType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:658:1: ( ( ( rule__SimpleType__NameAssignment_1 ) ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:659:1: ( ( rule__SimpleType__NameAssignment_1 ) )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:659:1: ( ( rule__SimpleType__NameAssignment_1 ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:660:1: ( rule__SimpleType__NameAssignment_1 )
            {
             before(grammarAccess.getSimpleTypeAccess().getNameAssignment_1()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:661:1: ( rule__SimpleType__NameAssignment_1 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:661:2: rule__SimpleType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SimpleType__NameAssignment_1_in_rule__SimpleType__Group__1__Impl1286);
            rule__SimpleType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleTypeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__SimpleType__Group__1__Impl"


    // $ANTLR start "rule__SimpleType__Group__2"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:671:1: rule__SimpleType__Group__2 : rule__SimpleType__Group__2__Impl ;
    public final void rule__SimpleType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:675:1: ( rule__SimpleType__Group__2__Impl )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:676:2: rule__SimpleType__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SimpleType__Group__2__Impl_in_rule__SimpleType__Group__21316);
            rule__SimpleType__Group__2__Impl();

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
    // $ANTLR end "rule__SimpleType__Group__2"


    // $ANTLR start "rule__SimpleType__Group__2__Impl"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:682:1: rule__SimpleType__Group__2__Impl : ( ( rule__SimpleType__MappingsAssignment_2 )* ) ;
    public final void rule__SimpleType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:686:1: ( ( ( rule__SimpleType__MappingsAssignment_2 )* ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:687:1: ( ( rule__SimpleType__MappingsAssignment_2 )* )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:687:1: ( ( rule__SimpleType__MappingsAssignment_2 )* )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:688:1: ( rule__SimpleType__MappingsAssignment_2 )*
            {
             before(grammarAccess.getSimpleTypeAccess().getMappingsAssignment_2()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:689:1: ( rule__SimpleType__MappingsAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:689:2: rule__SimpleType__MappingsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__SimpleType__MappingsAssignment_2_in_rule__SimpleType__Group__2__Impl1343);
            	    rule__SimpleType__MappingsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSimpleTypeAccess().getMappingsAssignment_2()); 

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
    // $ANTLR end "rule__SimpleType__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:705:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:709:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:710:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01380);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01383);
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
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:717:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:721:1: ( ( 'entity' ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:722:1: ( 'entity' )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:722:1: ( 'entity' )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:723:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Entity__Group__0__Impl1411); 
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
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:736:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:740:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:741:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11442);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11445);
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
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:748:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:752:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:753:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:753:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:754:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:755:1: ( rule__Entity__NameAssignment_1 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:755:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl1472);
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
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:765:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:769:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:770:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21502);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21505);
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
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:777:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:781:1: ( ( '{' ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:782:1: ( '{' )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:782:1: ( '{' )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:783:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Entity__Group__2__Impl1533); 
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
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:796:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:800:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:801:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31564);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31567);
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
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:808:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__AttributesAssignment_3 )* ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:812:1: ( ( ( rule__Entity__AttributesAssignment_3 )* ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:813:1: ( ( rule__Entity__AttributesAssignment_3 )* )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:813:1: ( ( rule__Entity__AttributesAssignment_3 )* )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:814:1: ( rule__Entity__AttributesAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_3()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:815:1: ( rule__Entity__AttributesAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:815:2: rule__Entity__AttributesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Entity__AttributesAssignment_3_in_rule__Entity__Group__3__Impl1594);
            	    rule__Entity__AttributesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:825:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:829:1: ( rule__Entity__Group__4__Impl )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:830:2: rule__Entity__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41625);
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
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:836:1: rule__Entity__Group__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:840:1: ( ( '}' ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:841:1: ( '}' )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:841:1: ( '}' )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:842:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__Entity__Group__4__Impl1653); 
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
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:865:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:869:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:870:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__01694);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__01697);
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
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:877:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:881:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:882:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:882:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:883:1: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:884:1: ( rule__Attribute__NameAssignment_0 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:884:2: rule__Attribute__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__0__Impl1724);
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
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:894:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:898:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:899:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__11754);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__11757);
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
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:906:1: rule__Attribute__Group__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:910:1: ( ( ':' ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:911:1: ( ':' )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:911:1: ( ':' )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:912:1: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__Attribute__Group__1__Impl1785); 
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
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:925:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:929:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:930:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__21816);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__21819);
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
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:937:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__TypeAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:941:1: ( ( ( rule__Attribute__TypeAssignment_2 ) ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:942:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:942:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:943:1: ( rule__Attribute__TypeAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:944:1: ( rule__Attribute__TypeAssignment_2 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:944:2: rule__Attribute__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__TypeAssignment_2_in_rule__Attribute__Group__2__Impl1846);
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
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:954:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:958:1: ( rule__Attribute__Group__3__Impl )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:959:2: rule__Attribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__31876);
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
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:965:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__MultiplicityAssignment_3 )? ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:969:1: ( ( ( rule__Attribute__MultiplicityAssignment_3 )? ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:970:1: ( ( rule__Attribute__MultiplicityAssignment_3 )? )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:970:1: ( ( rule__Attribute__MultiplicityAssignment_3 )? )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:971:1: ( rule__Attribute__MultiplicityAssignment_3 )?
            {
             before(grammarAccess.getAttributeAccess().getMultiplicityAssignment_3()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:972:1: ( rule__Attribute__MultiplicityAssignment_3 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:972:2: rule__Attribute__MultiplicityAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Attribute__MultiplicityAssignment_3_in_rule__Attribute__Group__3__Impl1903);
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
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:991:1: rule__Model__DatamodelsAssignment : ( ruleDataModel ) ;
    public final void rule__Model__DatamodelsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:995:1: ( ( ruleDataModel ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:996:1: ( ruleDataModel )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:996:1: ( ruleDataModel )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:997:1: ruleDataModel
            {
             before(grammarAccess.getModelAccess().getDatamodelsDataModelParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleDataModel_in_rule__Model__DatamodelsAssignment1947);
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
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1006:1: rule__DataModel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1010:1: ( ( RULE_ID ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1011:1: ( RULE_ID )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1011:1: ( RULE_ID )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1012:1: RULE_ID
            {
             before(grammarAccess.getDataModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataModel__NameAssignment_11978); 
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


    // $ANTLR start "rule__DataModel__TypesAssignment_3"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1021:1: rule__DataModel__TypesAssignment_3 : ( ruleType ) ;
    public final void rule__DataModel__TypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1025:1: ( ( ruleType ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1026:1: ( ruleType )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1026:1: ( ruleType )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1027:1: ruleType
            {
             before(grammarAccess.getDataModelAccess().getTypesTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__DataModel__TypesAssignment_32009);
            ruleType();

            state._fsp--;

             after(grammarAccess.getDataModelAccess().getTypesTypeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__DataModel__TypesAssignment_3"


    // $ANTLR start "rule__MappingClause__MappedTypeAssignment_1"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1036:1: rule__MappingClause__MappedTypeAssignment_1 : ( RULE_ID ) ;
    public final void rule__MappingClause__MappedTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1040:1: ( ( RULE_ID ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1041:1: ( RULE_ID )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1041:1: ( RULE_ID )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1042:1: RULE_ID
            {
             before(grammarAccess.getMappingClauseAccess().getMappedTypeIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MappingClause__MappedTypeAssignment_12040); 
             after(grammarAccess.getMappingClauseAccess().getMappedTypeIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__MappingClause__MappedTypeAssignment_1"


    // $ANTLR start "rule__MappingClause__PlatformAssignment_3"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1051:1: rule__MappingClause__PlatformAssignment_3 : ( rulePlatform ) ;
    public final void rule__MappingClause__PlatformAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1055:1: ( ( rulePlatform ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1056:1: ( rulePlatform )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1056:1: ( rulePlatform )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1057:1: rulePlatform
            {
             before(grammarAccess.getMappingClauseAccess().getPlatformPlatformEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_rulePlatform_in_rule__MappingClause__PlatformAssignment_32071);
            rulePlatform();

            state._fsp--;

             after(grammarAccess.getMappingClauseAccess().getPlatformPlatformEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__MappingClause__PlatformAssignment_3"


    // $ANTLR start "rule__SimpleType__NameAssignment_1"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1066:1: rule__SimpleType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SimpleType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1070:1: ( ( RULE_ID ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1071:1: ( RULE_ID )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1071:1: ( RULE_ID )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1072:1: RULE_ID
            {
             before(grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleType__NameAssignment_12102); 
             after(grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__SimpleType__NameAssignment_1"


    // $ANTLR start "rule__SimpleType__MappingsAssignment_2"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1081:1: rule__SimpleType__MappingsAssignment_2 : ( ruleMappingClause ) ;
    public final void rule__SimpleType__MappingsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1085:1: ( ( ruleMappingClause ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1086:1: ( ruleMappingClause )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1086:1: ( ruleMappingClause )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1087:1: ruleMappingClause
            {
             before(grammarAccess.getSimpleTypeAccess().getMappingsMappingClauseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleMappingClause_in_rule__SimpleType__MappingsAssignment_22133);
            ruleMappingClause();

            state._fsp--;

             after(grammarAccess.getSimpleTypeAccess().getMappingsMappingClauseParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__SimpleType__MappingsAssignment_2"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1096:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1100:1: ( ( RULE_ID ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1101:1: ( RULE_ID )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1101:1: ( RULE_ID )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1102:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_12164); 
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
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1111:1: rule__Entity__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1115:1: ( ( ruleAttribute ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1116:1: ( ruleAttribute )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1116:1: ( ruleAttribute )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1117:1: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_32195);
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
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1126:1: rule__Attribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1130:1: ( ( RULE_ID ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1131:1: ( RULE_ID )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1131:1: ( RULE_ID )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1132:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_02226); 
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
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1141:1: rule__Attribute__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Attribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1145:1: ( ( ( RULE_ID ) ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1146:1: ( ( RULE_ID ) )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1146:1: ( ( RULE_ID ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1147:1: ( RULE_ID )
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_2_0()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1148:1: ( RULE_ID )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1149:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__TypeAssignment_22261); 
             after(grammarAccess.getAttributeAccess().getTypeTypeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_2_0()); 

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
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1160:1: rule__Attribute__MultiplicityAssignment_3 : ( ( '[]' ) ) ;
    public final void rule__Attribute__MultiplicityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1164:1: ( ( ( '[]' ) ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1165:1: ( ( '[]' ) )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1165:1: ( ( '[]' ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1166:1: ( '[]' )
            {
             before(grammarAccess.getAttributeAccess().getMultiplicityLeftSquareBracketRightSquareBracketKeyword_3_0()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1167:1: ( '[]' )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:1168:1: '[]'
            {
             before(grammarAccess.getAttributeAccess().getMultiplicityLeftSquareBracketRightSquareBracketKeyword_3_0()); 
            match(input,21,FOLLOW_21_in_rule__Attribute__MultiplicityAssignment_32301); 
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
    public static final BitSet FOLLOW_rule__Model__DatamodelsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleDataModel_in_entryRuleDataModel122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataModel129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__0_in_ruleDataModel155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingClause_in_entryRuleMappingClause242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMappingClause249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingClause__Group__0_in_ruleMappingClause275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__0_in_ruleSimpleType335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Alternatives_in_rulePlatform492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_rule__Type__Alternatives527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Type__Alternatives544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Platform__Alternatives577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Platform__Alternatives598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__0__Impl_in_rule__DataModel__Group__0631 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataModel__Group__1_in_rule__DataModel__Group__0634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__DataModel__Group__0__Impl662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__1__Impl_in_rule__DataModel__Group__1693 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__DataModel__Group__2_in_rule__DataModel__Group__1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__NameAssignment_1_in_rule__DataModel__Group__1__Impl723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__2__Impl_in_rule__DataModel__Group__2753 = new BitSet(new long[]{0x00000000000C8000L});
    public static final BitSet FOLLOW_rule__DataModel__Group__3_in_rule__DataModel__Group__2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__DataModel__Group__2__Impl784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__3__Impl_in_rule__DataModel__Group__3815 = new BitSet(new long[]{0x00000000000C8000L});
    public static final BitSet FOLLOW_rule__DataModel__Group__4_in_rule__DataModel__Group__3818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__TypesAssignment_3_in_rule__DataModel__Group__3__Impl845 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__4__Impl_in_rule__DataModel__Group__4876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__DataModel__Group__4__Impl904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingClause__Group__0__Impl_in_rule__MappingClause__Group__0945 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MappingClause__Group__1_in_rule__MappingClause__Group__0948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__MappingClause__Group__0__Impl976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingClause__Group__1__Impl_in_rule__MappingClause__Group__11007 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__MappingClause__Group__2_in_rule__MappingClause__Group__11010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingClause__MappedTypeAssignment_1_in_rule__MappingClause__Group__1__Impl1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingClause__Group__2__Impl_in_rule__MappingClause__Group__21067 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__MappingClause__Group__3_in_rule__MappingClause__Group__21070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__MappingClause__Group__2__Impl1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingClause__Group__3__Impl_in_rule__MappingClause__Group__31129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingClause__PlatformAssignment_3_in_rule__MappingClause__Group__3__Impl1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__0__Impl_in_rule__SimpleType__Group__01194 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__1_in_rule__SimpleType__Group__01197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__SimpleType__Group__0__Impl1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__1__Impl_in_rule__SimpleType__Group__11256 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__2_in_rule__SimpleType__Group__11259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__NameAssignment_1_in_rule__SimpleType__Group__1__Impl1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__2__Impl_in_rule__SimpleType__Group__21316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__MappingsAssignment_2_in_rule__SimpleType__Group__2__Impl1343 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01380 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Entity__Group__0__Impl1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11442 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21502 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Entity__Group__2__Impl1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31564 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__AttributesAssignment_3_in_rule__Entity__Group__3__Impl1594 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Entity__Group__4__Impl1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__01694 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__01697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__0__Impl1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__11754 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__11757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Attribute__Group__1__Impl1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__21816 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__21819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_2_in_rule__Attribute__Group__2__Impl1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__31876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__MultiplicityAssignment_3_in_rule__Attribute__Group__3__Impl1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataModel_in_rule__Model__DatamodelsAssignment1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataModel__NameAssignment_11978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__DataModel__TypesAssignment_32009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MappingClause__MappedTypeAssignment_12040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlatform_in_rule__MappingClause__PlatformAssignment_32071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleType__NameAssignment_12102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingClause_in_rule__SimpleType__MappingsAssignment_22133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_12164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_32195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_02226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__TypeAssignment_22261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Attribute__MultiplicityAssignment_32301 = new BitSet(new long[]{0x0000000000000002L});

}
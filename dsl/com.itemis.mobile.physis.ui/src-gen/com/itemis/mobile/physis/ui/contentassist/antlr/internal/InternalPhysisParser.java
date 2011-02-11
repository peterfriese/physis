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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'datamodel'", "'{'", "'}'", "'type'", "'entity'", "'[]'"
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




    // $ANTLR start entryRuleModel
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:62:1: ( ruleModel EOF )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:63:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();
            _fsp--;

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
    // $ANTLR end entryRuleModel


    // $ANTLR start ruleModel
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
            	    _fsp--;


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
    // $ANTLR end ruleModel


    // $ANTLR start entryRuleDataModel
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:89:1: entryRuleDataModel : ruleDataModel EOF ;
    public final void entryRuleDataModel() throws RecognitionException {
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:90:1: ( ruleDataModel EOF )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:91:1: ruleDataModel EOF
            {
             before(grammarAccess.getDataModelRule()); 
            pushFollow(FOLLOW_ruleDataModel_in_entryRuleDataModel122);
            ruleDataModel();
            _fsp--;

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
    // $ANTLR end entryRuleDataModel


    // $ANTLR start ruleDataModel
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
            _fsp--;


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
    // $ANTLR end ruleDataModel


    // $ANTLR start entryRuleType
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:117:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:118:1: ( ruleType EOF )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:119:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType182);
            ruleType();
            _fsp--;

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
    // $ANTLR end entryRuleType


    // $ANTLR start ruleType
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
            _fsp--;


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
    // $ANTLR end ruleType


    // $ANTLR start entryRuleSimpleType
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:145:1: entryRuleSimpleType : ruleSimpleType EOF ;
    public final void entryRuleSimpleType() throws RecognitionException {
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:146:1: ( ruleSimpleType EOF )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:147:1: ruleSimpleType EOF
            {
             before(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_ruleSimpleType_in_entryRuleSimpleType242);
            ruleSimpleType();
            _fsp--;

             after(grammarAccess.getSimpleTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleType249); 

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
    // $ANTLR end entryRuleSimpleType


    // $ANTLR start ruleSimpleType
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:154:1: ruleSimpleType : ( ( rule__SimpleType__Group__0 ) ) ;
    public final void ruleSimpleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:158:2: ( ( ( rule__SimpleType__Group__0 ) ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:159:1: ( ( rule__SimpleType__Group__0 ) )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:159:1: ( ( rule__SimpleType__Group__0 ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:160:1: ( rule__SimpleType__Group__0 )
            {
             before(grammarAccess.getSimpleTypeAccess().getGroup()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:161:1: ( rule__SimpleType__Group__0 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:161:2: rule__SimpleType__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleType__Group__0_in_ruleSimpleType275);
            rule__SimpleType__Group__0();
            _fsp--;


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
    // $ANTLR end ruleSimpleType


    // $ANTLR start entryRuleEntity
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:173:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:174:1: ( ruleEntity EOF )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:175:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity302);
            ruleEntity();
            _fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity309); 

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
    // $ANTLR end entryRuleEntity


    // $ANTLR start ruleEntity
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:182:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:186:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:187:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:187:1: ( ( rule__Entity__Group__0 ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:188:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:189:1: ( rule__Entity__Group__0 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:189:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity335);
            rule__Entity__Group__0();
            _fsp--;


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
    // $ANTLR end ruleEntity


    // $ANTLR start entryRuleAttribute
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:201:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:202:1: ( ruleAttribute EOF )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:203:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute362);
            ruleAttribute();
            _fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute369); 

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
    // $ANTLR end entryRuleAttribute


    // $ANTLR start ruleAttribute
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:210:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:214:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:215:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:215:1: ( ( rule__Attribute__Group__0 ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:216:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:217:1: ( rule__Attribute__Group__0 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:217:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute395);
            rule__Attribute__Group__0();
            _fsp--;


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
    // $ANTLR end ruleAttribute


    // $ANTLR start rule__Type__Alternatives
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:229:1: rule__Type__Alternatives : ( ( ruleSimpleType ) | ( ruleEntity ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:233:1: ( ( ruleSimpleType ) | ( ruleEntity ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("229:1: rule__Type__Alternatives : ( ( ruleSimpleType ) | ( ruleEntity ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:234:1: ( ruleSimpleType )
                    {
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:234:1: ( ruleSimpleType )
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:235:1: ruleSimpleType
                    {
                     before(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSimpleType_in_rule__Type__Alternatives431);
                    ruleSimpleType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:240:6: ( ruleEntity )
                    {
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:240:6: ( ruleEntity )
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:241:1: ruleEntity
                    {
                     before(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEntity_in_rule__Type__Alternatives448);
                    ruleEntity();
                    _fsp--;

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
    // $ANTLR end rule__Type__Alternatives


    // $ANTLR start rule__DataModel__Group__0
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:253:1: rule__DataModel__Group__0 : rule__DataModel__Group__0__Impl rule__DataModel__Group__1 ;
    public final void rule__DataModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:257:1: ( rule__DataModel__Group__0__Impl rule__DataModel__Group__1 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:258:2: rule__DataModel__Group__0__Impl rule__DataModel__Group__1
            {
            pushFollow(FOLLOW_rule__DataModel__Group__0__Impl_in_rule__DataModel__Group__0478);
            rule__DataModel__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__1_in_rule__DataModel__Group__0481);
            rule__DataModel__Group__1();
            _fsp--;


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
    // $ANTLR end rule__DataModel__Group__0


    // $ANTLR start rule__DataModel__Group__0__Impl
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:265:1: rule__DataModel__Group__0__Impl : ( 'datamodel' ) ;
    public final void rule__DataModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:269:1: ( ( 'datamodel' ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:270:1: ( 'datamodel' )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:270:1: ( 'datamodel' )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:271:1: 'datamodel'
            {
             before(grammarAccess.getDataModelAccess().getDatamodelKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__DataModel__Group__0__Impl509); 
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
    // $ANTLR end rule__DataModel__Group__0__Impl


    // $ANTLR start rule__DataModel__Group__1
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:284:1: rule__DataModel__Group__1 : rule__DataModel__Group__1__Impl rule__DataModel__Group__2 ;
    public final void rule__DataModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:288:1: ( rule__DataModel__Group__1__Impl rule__DataModel__Group__2 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:289:2: rule__DataModel__Group__1__Impl rule__DataModel__Group__2
            {
            pushFollow(FOLLOW_rule__DataModel__Group__1__Impl_in_rule__DataModel__Group__1540);
            rule__DataModel__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__2_in_rule__DataModel__Group__1543);
            rule__DataModel__Group__2();
            _fsp--;


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
    // $ANTLR end rule__DataModel__Group__1


    // $ANTLR start rule__DataModel__Group__1__Impl
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:296:1: rule__DataModel__Group__1__Impl : ( ( rule__DataModel__NameAssignment_1 ) ) ;
    public final void rule__DataModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:300:1: ( ( ( rule__DataModel__NameAssignment_1 ) ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:301:1: ( ( rule__DataModel__NameAssignment_1 ) )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:301:1: ( ( rule__DataModel__NameAssignment_1 ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:302:1: ( rule__DataModel__NameAssignment_1 )
            {
             before(grammarAccess.getDataModelAccess().getNameAssignment_1()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:303:1: ( rule__DataModel__NameAssignment_1 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:303:2: rule__DataModel__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DataModel__NameAssignment_1_in_rule__DataModel__Group__1__Impl570);
            rule__DataModel__NameAssignment_1();
            _fsp--;


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
    // $ANTLR end rule__DataModel__Group__1__Impl


    // $ANTLR start rule__DataModel__Group__2
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:313:1: rule__DataModel__Group__2 : rule__DataModel__Group__2__Impl rule__DataModel__Group__3 ;
    public final void rule__DataModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:317:1: ( rule__DataModel__Group__2__Impl rule__DataModel__Group__3 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:318:2: rule__DataModel__Group__2__Impl rule__DataModel__Group__3
            {
            pushFollow(FOLLOW_rule__DataModel__Group__2__Impl_in_rule__DataModel__Group__2600);
            rule__DataModel__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__3_in_rule__DataModel__Group__2603);
            rule__DataModel__Group__3();
            _fsp--;


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
    // $ANTLR end rule__DataModel__Group__2


    // $ANTLR start rule__DataModel__Group__2__Impl
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:325:1: rule__DataModel__Group__2__Impl : ( '{' ) ;
    public final void rule__DataModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:329:1: ( ( '{' ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:330:1: ( '{' )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:330:1: ( '{' )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:331:1: '{'
            {
             before(grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__DataModel__Group__2__Impl631); 
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
    // $ANTLR end rule__DataModel__Group__2__Impl


    // $ANTLR start rule__DataModel__Group__3
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:344:1: rule__DataModel__Group__3 : rule__DataModel__Group__3__Impl rule__DataModel__Group__4 ;
    public final void rule__DataModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:348:1: ( rule__DataModel__Group__3__Impl rule__DataModel__Group__4 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:349:2: rule__DataModel__Group__3__Impl rule__DataModel__Group__4
            {
            pushFollow(FOLLOW_rule__DataModel__Group__3__Impl_in_rule__DataModel__Group__3662);
            rule__DataModel__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__4_in_rule__DataModel__Group__3665);
            rule__DataModel__Group__4();
            _fsp--;


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
    // $ANTLR end rule__DataModel__Group__3


    // $ANTLR start rule__DataModel__Group__3__Impl
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:356:1: rule__DataModel__Group__3__Impl : ( ( rule__DataModel__TypesAssignment_3 )* ) ;
    public final void rule__DataModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:360:1: ( ( ( rule__DataModel__TypesAssignment_3 )* ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:361:1: ( ( rule__DataModel__TypesAssignment_3 )* )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:361:1: ( ( rule__DataModel__TypesAssignment_3 )* )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:362:1: ( rule__DataModel__TypesAssignment_3 )*
            {
             before(grammarAccess.getDataModelAccess().getTypesAssignment_3()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:363:1: ( rule__DataModel__TypesAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=14 && LA3_0<=15)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:363:2: rule__DataModel__TypesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__DataModel__TypesAssignment_3_in_rule__DataModel__Group__3__Impl692);
            	    rule__DataModel__TypesAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end rule__DataModel__Group__3__Impl


    // $ANTLR start rule__DataModel__Group__4
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:373:1: rule__DataModel__Group__4 : rule__DataModel__Group__4__Impl ;
    public final void rule__DataModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:377:1: ( rule__DataModel__Group__4__Impl )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:378:2: rule__DataModel__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__DataModel__Group__4__Impl_in_rule__DataModel__Group__4723);
            rule__DataModel__Group__4__Impl();
            _fsp--;


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
    // $ANTLR end rule__DataModel__Group__4


    // $ANTLR start rule__DataModel__Group__4__Impl
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:384:1: rule__DataModel__Group__4__Impl : ( '}' ) ;
    public final void rule__DataModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:388:1: ( ( '}' ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:389:1: ( '}' )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:389:1: ( '}' )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:390:1: '}'
            {
             before(grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__DataModel__Group__4__Impl751); 
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
    // $ANTLR end rule__DataModel__Group__4__Impl


    // $ANTLR start rule__SimpleType__Group__0
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:413:1: rule__SimpleType__Group__0 : rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1 ;
    public final void rule__SimpleType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:417:1: ( rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:418:2: rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleType__Group__0__Impl_in_rule__SimpleType__Group__0792);
            rule__SimpleType__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SimpleType__Group__1_in_rule__SimpleType__Group__0795);
            rule__SimpleType__Group__1();
            _fsp--;


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
    // $ANTLR end rule__SimpleType__Group__0


    // $ANTLR start rule__SimpleType__Group__0__Impl
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:425:1: rule__SimpleType__Group__0__Impl : ( 'type' ) ;
    public final void rule__SimpleType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:429:1: ( ( 'type' ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:430:1: ( 'type' )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:430:1: ( 'type' )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:431:1: 'type'
            {
             before(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__SimpleType__Group__0__Impl823); 
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
    // $ANTLR end rule__SimpleType__Group__0__Impl


    // $ANTLR start rule__SimpleType__Group__1
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:444:1: rule__SimpleType__Group__1 : rule__SimpleType__Group__1__Impl ;
    public final void rule__SimpleType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:448:1: ( rule__SimpleType__Group__1__Impl )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:449:2: rule__SimpleType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SimpleType__Group__1__Impl_in_rule__SimpleType__Group__1854);
            rule__SimpleType__Group__1__Impl();
            _fsp--;


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
    // $ANTLR end rule__SimpleType__Group__1


    // $ANTLR start rule__SimpleType__Group__1__Impl
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:455:1: rule__SimpleType__Group__1__Impl : ( ( rule__SimpleType__NameAssignment_1 ) ) ;
    public final void rule__SimpleType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:459:1: ( ( ( rule__SimpleType__NameAssignment_1 ) ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:460:1: ( ( rule__SimpleType__NameAssignment_1 ) )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:460:1: ( ( rule__SimpleType__NameAssignment_1 ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:461:1: ( rule__SimpleType__NameAssignment_1 )
            {
             before(grammarAccess.getSimpleTypeAccess().getNameAssignment_1()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:462:1: ( rule__SimpleType__NameAssignment_1 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:462:2: rule__SimpleType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SimpleType__NameAssignment_1_in_rule__SimpleType__Group__1__Impl881);
            rule__SimpleType__NameAssignment_1();
            _fsp--;


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
    // $ANTLR end rule__SimpleType__Group__1__Impl


    // $ANTLR start rule__Entity__Group__0
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:476:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:480:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:481:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__0915);
            rule__Entity__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__0918);
            rule__Entity__Group__1();
            _fsp--;


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
    // $ANTLR end rule__Entity__Group__0


    // $ANTLR start rule__Entity__Group__0__Impl
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:488:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:492:1: ( ( 'entity' ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:493:1: ( 'entity' )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:493:1: ( 'entity' )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:494:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Entity__Group__0__Impl946); 
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
    // $ANTLR end rule__Entity__Group__0__Impl


    // $ANTLR start rule__Entity__Group__1
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:507:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:511:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:512:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__1977);
            rule__Entity__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__1980);
            rule__Entity__Group__2();
            _fsp--;


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
    // $ANTLR end rule__Entity__Group__1


    // $ANTLR start rule__Entity__Group__1__Impl
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:519:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:523:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:524:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:524:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:525:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:526:1: ( rule__Entity__NameAssignment_1 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:526:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl1007);
            rule__Entity__NameAssignment_1();
            _fsp--;


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
    // $ANTLR end rule__Entity__Group__1__Impl


    // $ANTLR start rule__Entity__Group__2
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:536:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:540:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:541:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21037);
            rule__Entity__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21040);
            rule__Entity__Group__3();
            _fsp--;


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
    // $ANTLR end rule__Entity__Group__2


    // $ANTLR start rule__Entity__Group__2__Impl
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:548:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:552:1: ( ( '{' ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:553:1: ( '{' )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:553:1: ( '{' )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:554:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Entity__Group__2__Impl1068); 
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
    // $ANTLR end rule__Entity__Group__2__Impl


    // $ANTLR start rule__Entity__Group__3
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:567:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:571:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:572:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31099);
            rule__Entity__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31102);
            rule__Entity__Group__4();
            _fsp--;


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
    // $ANTLR end rule__Entity__Group__3


    // $ANTLR start rule__Entity__Group__3__Impl
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:579:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__AttributesAssignment_3 )* ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:583:1: ( ( ( rule__Entity__AttributesAssignment_3 )* ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:584:1: ( ( rule__Entity__AttributesAssignment_3 )* )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:584:1: ( ( rule__Entity__AttributesAssignment_3 )* )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:585:1: ( rule__Entity__AttributesAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_3()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:586:1: ( rule__Entity__AttributesAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:586:2: rule__Entity__AttributesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Entity__AttributesAssignment_3_in_rule__Entity__Group__3__Impl1129);
            	    rule__Entity__AttributesAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end rule__Entity__Group__3__Impl


    // $ANTLR start rule__Entity__Group__4
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:596:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:600:1: ( rule__Entity__Group__4__Impl )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:601:2: rule__Entity__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41160);
            rule__Entity__Group__4__Impl();
            _fsp--;


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
    // $ANTLR end rule__Entity__Group__4


    // $ANTLR start rule__Entity__Group__4__Impl
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:607:1: rule__Entity__Group__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:611:1: ( ( '}' ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:612:1: ( '}' )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:612:1: ( '}' )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:613:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Entity__Group__4__Impl1188); 
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
    // $ANTLR end rule__Entity__Group__4__Impl


    // $ANTLR start rule__Attribute__Group__0
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:636:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:640:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:641:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__01229);
            rule__Attribute__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__01232);
            rule__Attribute__Group__1();
            _fsp--;


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
    // $ANTLR end rule__Attribute__Group__0


    // $ANTLR start rule__Attribute__Group__0__Impl
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:648:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:652:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:653:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:653:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:654:1: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:655:1: ( rule__Attribute__NameAssignment_0 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:655:2: rule__Attribute__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__0__Impl1259);
            rule__Attribute__NameAssignment_0();
            _fsp--;


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
    // $ANTLR end rule__Attribute__Group__0__Impl


    // $ANTLR start rule__Attribute__Group__1
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:665:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:669:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:670:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__11289);
            rule__Attribute__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__11292);
            rule__Attribute__Group__2();
            _fsp--;


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
    // $ANTLR end rule__Attribute__Group__1


    // $ANTLR start rule__Attribute__Group__1__Impl
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:677:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__TypeAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:681:1: ( ( ( rule__Attribute__TypeAssignment_1 ) ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:682:1: ( ( rule__Attribute__TypeAssignment_1 ) )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:682:1: ( ( rule__Attribute__TypeAssignment_1 ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:683:1: ( rule__Attribute__TypeAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_1()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:684:1: ( rule__Attribute__TypeAssignment_1 )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:684:2: rule__Attribute__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Attribute__TypeAssignment_1_in_rule__Attribute__Group__1__Impl1319);
            rule__Attribute__TypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_1()); 

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
    // $ANTLR end rule__Attribute__Group__1__Impl


    // $ANTLR start rule__Attribute__Group__2
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:694:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:698:1: ( rule__Attribute__Group__2__Impl )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:699:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__21349);
            rule__Attribute__Group__2__Impl();
            _fsp--;


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
    // $ANTLR end rule__Attribute__Group__2


    // $ANTLR start rule__Attribute__Group__2__Impl
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:705:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__MultiplicityAssignment_2 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:709:1: ( ( ( rule__Attribute__MultiplicityAssignment_2 )? ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:710:1: ( ( rule__Attribute__MultiplicityAssignment_2 )? )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:710:1: ( ( rule__Attribute__MultiplicityAssignment_2 )? )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:711:1: ( rule__Attribute__MultiplicityAssignment_2 )?
            {
             before(grammarAccess.getAttributeAccess().getMultiplicityAssignment_2()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:712:1: ( rule__Attribute__MultiplicityAssignment_2 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:712:2: rule__Attribute__MultiplicityAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Attribute__MultiplicityAssignment_2_in_rule__Attribute__Group__2__Impl1376);
                    rule__Attribute__MultiplicityAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getMultiplicityAssignment_2()); 

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
    // $ANTLR end rule__Attribute__Group__2__Impl


    // $ANTLR start rule__Model__DatamodelsAssignment
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:729:1: rule__Model__DatamodelsAssignment : ( ruleDataModel ) ;
    public final void rule__Model__DatamodelsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:733:1: ( ( ruleDataModel ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:734:1: ( ruleDataModel )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:734:1: ( ruleDataModel )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:735:1: ruleDataModel
            {
             before(grammarAccess.getModelAccess().getDatamodelsDataModelParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleDataModel_in_rule__Model__DatamodelsAssignment1418);
            ruleDataModel();
            _fsp--;

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
    // $ANTLR end rule__Model__DatamodelsAssignment


    // $ANTLR start rule__DataModel__NameAssignment_1
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:744:1: rule__DataModel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:748:1: ( ( RULE_ID ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:749:1: ( RULE_ID )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:749:1: ( RULE_ID )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:750:1: RULE_ID
            {
             before(grammarAccess.getDataModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataModel__NameAssignment_11449); 
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
    // $ANTLR end rule__DataModel__NameAssignment_1


    // $ANTLR start rule__DataModel__TypesAssignment_3
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:759:1: rule__DataModel__TypesAssignment_3 : ( ruleType ) ;
    public final void rule__DataModel__TypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:763:1: ( ( ruleType ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:764:1: ( ruleType )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:764:1: ( ruleType )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:765:1: ruleType
            {
             before(grammarAccess.getDataModelAccess().getTypesTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__DataModel__TypesAssignment_31480);
            ruleType();
            _fsp--;

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
    // $ANTLR end rule__DataModel__TypesAssignment_3


    // $ANTLR start rule__SimpleType__NameAssignment_1
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:774:1: rule__SimpleType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SimpleType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:778:1: ( ( RULE_ID ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:779:1: ( RULE_ID )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:779:1: ( RULE_ID )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:780:1: RULE_ID
            {
             before(grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleType__NameAssignment_11511); 
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
    // $ANTLR end rule__SimpleType__NameAssignment_1


    // $ANTLR start rule__Entity__NameAssignment_1
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:789:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:793:1: ( ( RULE_ID ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:794:1: ( RULE_ID )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:794:1: ( RULE_ID )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:795:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_11542); 
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
    // $ANTLR end rule__Entity__NameAssignment_1


    // $ANTLR start rule__Entity__AttributesAssignment_3
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:804:1: rule__Entity__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:808:1: ( ( ruleAttribute ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:809:1: ( ruleAttribute )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:809:1: ( ruleAttribute )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:810:1: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_31573);
            ruleAttribute();
            _fsp--;

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
    // $ANTLR end rule__Entity__AttributesAssignment_3


    // $ANTLR start rule__Attribute__NameAssignment_0
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:819:1: rule__Attribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:823:1: ( ( RULE_ID ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:824:1: ( RULE_ID )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:824:1: ( RULE_ID )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:825:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_01604); 
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
    // $ANTLR end rule__Attribute__NameAssignment_0


    // $ANTLR start rule__Attribute__TypeAssignment_1
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:834:1: rule__Attribute__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Attribute__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:838:1: ( ( ( RULE_ID ) ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:839:1: ( ( RULE_ID ) )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:839:1: ( ( RULE_ID ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:840:1: ( RULE_ID )
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_1_0()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:841:1: ( RULE_ID )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:842:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__TypeAssignment_11639); 
             after(grammarAccess.getAttributeAccess().getTypeTypeIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_1_0()); 

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
    // $ANTLR end rule__Attribute__TypeAssignment_1


    // $ANTLR start rule__Attribute__MultiplicityAssignment_2
    // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:853:1: rule__Attribute__MultiplicityAssignment_2 : ( ( '[]' ) ) ;
    public final void rule__Attribute__MultiplicityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:857:1: ( ( ( '[]' ) ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:858:1: ( ( '[]' ) )
            {
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:858:1: ( ( '[]' ) )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:859:1: ( '[]' )
            {
             before(grammarAccess.getAttributeAccess().getMultiplicityLeftSquareBracketRightSquareBracketKeyword_2_0()); 
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:860:1: ( '[]' )
            // ../com.itemis.mobile.physis.ui/src-gen/com/itemis/mobile/physis/ui/contentassist/antlr/internal/InternalPhysis.g:861:1: '[]'
            {
             before(grammarAccess.getAttributeAccess().getMultiplicityLeftSquareBracketRightSquareBracketKeyword_2_0()); 
            match(input,16,FOLLOW_16_in_rule__Attribute__MultiplicityAssignment_21679); 
             after(grammarAccess.getAttributeAccess().getMultiplicityLeftSquareBracketRightSquareBracketKeyword_2_0()); 

            }

             after(grammarAccess.getAttributeAccess().getMultiplicityLeftSquareBracketRightSquareBracketKeyword_2_0()); 

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
    // $ANTLR end rule__Attribute__MultiplicityAssignment_2


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DatamodelsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleDataModel_in_entryRuleDataModel122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataModel129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__0_in_ruleDataModel155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__0_in_ruleSimpleType275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_rule__Type__Alternatives431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Type__Alternatives448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__0__Impl_in_rule__DataModel__Group__0478 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataModel__Group__1_in_rule__DataModel__Group__0481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__DataModel__Group__0__Impl509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__1__Impl_in_rule__DataModel__Group__1540 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__DataModel__Group__2_in_rule__DataModel__Group__1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__NameAssignment_1_in_rule__DataModel__Group__1__Impl570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__2__Impl_in_rule__DataModel__Group__2600 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_rule__DataModel__Group__3_in_rule__DataModel__Group__2603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__DataModel__Group__2__Impl631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__3__Impl_in_rule__DataModel__Group__3662 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__DataModel__Group__4_in_rule__DataModel__Group__3665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__TypesAssignment_3_in_rule__DataModel__Group__3__Impl692 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__4__Impl_in_rule__DataModel__Group__4723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__DataModel__Group__4__Impl751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__0__Impl_in_rule__SimpleType__Group__0792 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__1_in_rule__SimpleType__Group__0795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SimpleType__Group__0__Impl823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__1__Impl_in_rule__SimpleType__Group__1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__NameAssignment_1_in_rule__SimpleType__Group__1__Impl881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__0915 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__0918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Entity__Group__0__Impl946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__1977 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__1980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21037 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Entity__Group__2__Impl1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31099 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__AttributesAssignment_3_in_rule__Entity__Group__3__Impl1129 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Entity__Group__4__Impl1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__01229 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__01232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__0__Impl1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__11289 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__11292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_1_in_rule__Attribute__Group__1__Impl1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__21349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__MultiplicityAssignment_2_in_rule__Attribute__Group__2__Impl1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataModel_in_rule__Model__DatamodelsAssignment1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataModel__NameAssignment_11449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__DataModel__TypesAssignment_31480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleType__NameAssignment_11511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_11542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_31573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_01604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__TypeAssignment_11639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Attribute__MultiplicityAssignment_21679 = new BitSet(new long[]{0x0000000000000002L});

}
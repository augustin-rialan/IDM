package xtext.insa.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import xtext.insa.services.QcmGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQcmParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'Qcm'", "'{'", "'question'", "'}'", "'domaine'", "','", "'Question'", "'reponse'", "'intitule'", "'Reponse'", "'data'", "'value'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalQcmParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQcmParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQcmParser.tokenNames; }
    public String getGrammarFileName() { return "InternalQcm.g"; }


    	private QcmGrammarAccess grammarAccess;

    	public void setGrammarAccess(QcmGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleQcm"
    // InternalQcm.g:53:1: entryRuleQcm : ruleQcm EOF ;
    public final void entryRuleQcm() throws RecognitionException {
        try {
            // InternalQcm.g:54:1: ( ruleQcm EOF )
            // InternalQcm.g:55:1: ruleQcm EOF
            {
             before(grammarAccess.getQcmRule()); 
            pushFollow(FOLLOW_1);
            ruleQcm();

            state._fsp--;

             after(grammarAccess.getQcmRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQcm"


    // $ANTLR start "ruleQcm"
    // InternalQcm.g:62:1: ruleQcm : ( ( rule__Qcm__Group__0 ) ) ;
    public final void ruleQcm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:66:2: ( ( ( rule__Qcm__Group__0 ) ) )
            // InternalQcm.g:67:2: ( ( rule__Qcm__Group__0 ) )
            {
            // InternalQcm.g:67:2: ( ( rule__Qcm__Group__0 ) )
            // InternalQcm.g:68:3: ( rule__Qcm__Group__0 )
            {
             before(grammarAccess.getQcmAccess().getGroup()); 
            // InternalQcm.g:69:3: ( rule__Qcm__Group__0 )
            // InternalQcm.g:69:4: rule__Qcm__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Qcm__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQcmAccess().getGroup()); 

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
    // $ANTLR end "ruleQcm"


    // $ANTLR start "entryRuleEString"
    // InternalQcm.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalQcm.g:79:1: ( ruleEString EOF )
            // InternalQcm.g:80:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalQcm.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalQcm.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalQcm.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalQcm.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalQcm.g:94:3: ( rule__EString__Alternatives )
            // InternalQcm.g:94:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleQuestion"
    // InternalQcm.g:103:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // InternalQcm.g:104:1: ( ruleQuestion EOF )
            // InternalQcm.g:105:1: ruleQuestion EOF
            {
             before(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_1);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // InternalQcm.g:112:1: ruleQuestion : ( ( rule__Question__Group__0 ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:116:2: ( ( ( rule__Question__Group__0 ) ) )
            // InternalQcm.g:117:2: ( ( rule__Question__Group__0 ) )
            {
            // InternalQcm.g:117:2: ( ( rule__Question__Group__0 ) )
            // InternalQcm.g:118:3: ( rule__Question__Group__0 )
            {
             before(grammarAccess.getQuestionAccess().getGroup()); 
            // InternalQcm.g:119:3: ( rule__Question__Group__0 )
            // InternalQcm.g:119:4: rule__Question__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getGroup()); 

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
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleReponse"
    // InternalQcm.g:128:1: entryRuleReponse : ruleReponse EOF ;
    public final void entryRuleReponse() throws RecognitionException {
        try {
            // InternalQcm.g:129:1: ( ruleReponse EOF )
            // InternalQcm.g:130:1: ruleReponse EOF
            {
             before(grammarAccess.getReponseRule()); 
            pushFollow(FOLLOW_1);
            ruleReponse();

            state._fsp--;

             after(grammarAccess.getReponseRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleReponse"


    // $ANTLR start "ruleReponse"
    // InternalQcm.g:137:1: ruleReponse : ( ( rule__Reponse__Group__0 ) ) ;
    public final void ruleReponse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:141:2: ( ( ( rule__Reponse__Group__0 ) ) )
            // InternalQcm.g:142:2: ( ( rule__Reponse__Group__0 ) )
            {
            // InternalQcm.g:142:2: ( ( rule__Reponse__Group__0 ) )
            // InternalQcm.g:143:3: ( rule__Reponse__Group__0 )
            {
             before(grammarAccess.getReponseAccess().getGroup()); 
            // InternalQcm.g:144:3: ( rule__Reponse__Group__0 )
            // InternalQcm.g:144:4: rule__Reponse__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Reponse__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReponseAccess().getGroup()); 

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
    // $ANTLR end "ruleReponse"


    // $ANTLR start "entryRuleEBoolean"
    // InternalQcm.g:153:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalQcm.g:154:1: ( ruleEBoolean EOF )
            // InternalQcm.g:155:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalQcm.g:162:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:166:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalQcm.g:167:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalQcm.g:167:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalQcm.g:168:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalQcm.g:169:3: ( rule__EBoolean__Alternatives )
            // InternalQcm.g:169:4: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalQcm.g:177:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:181:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalQcm.g:182:2: ( RULE_STRING )
                    {
                    // InternalQcm.g:182:2: ( RULE_STRING )
                    // InternalQcm.g:183:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQcm.g:188:2: ( RULE_ID )
                    {
                    // InternalQcm.g:188:2: ( RULE_ID )
                    // InternalQcm.g:189:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalQcm.g:198:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:202:1: ( ( 'true' ) | ( 'false' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalQcm.g:203:2: ( 'true' )
                    {
                    // InternalQcm.g:203:2: ( 'true' )
                    // InternalQcm.g:204:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQcm.g:209:2: ( 'false' )
                    {
                    // InternalQcm.g:209:2: ( 'false' )
                    // InternalQcm.g:210:3: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

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
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__Qcm__Group__0"
    // InternalQcm.g:219:1: rule__Qcm__Group__0 : rule__Qcm__Group__0__Impl rule__Qcm__Group__1 ;
    public final void rule__Qcm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:223:1: ( rule__Qcm__Group__0__Impl rule__Qcm__Group__1 )
            // InternalQcm.g:224:2: rule__Qcm__Group__0__Impl rule__Qcm__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Qcm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Qcm__Group__1();

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
    // $ANTLR end "rule__Qcm__Group__0"


    // $ANTLR start "rule__Qcm__Group__0__Impl"
    // InternalQcm.g:231:1: rule__Qcm__Group__0__Impl : ( 'Qcm' ) ;
    public final void rule__Qcm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:235:1: ( ( 'Qcm' ) )
            // InternalQcm.g:236:1: ( 'Qcm' )
            {
            // InternalQcm.g:236:1: ( 'Qcm' )
            // InternalQcm.g:237:2: 'Qcm'
            {
             before(grammarAccess.getQcmAccess().getQcmKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getQcmAccess().getQcmKeyword_0()); 

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
    // $ANTLR end "rule__Qcm__Group__0__Impl"


    // $ANTLR start "rule__Qcm__Group__1"
    // InternalQcm.g:246:1: rule__Qcm__Group__1 : rule__Qcm__Group__1__Impl rule__Qcm__Group__2 ;
    public final void rule__Qcm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:250:1: ( rule__Qcm__Group__1__Impl rule__Qcm__Group__2 )
            // InternalQcm.g:251:2: rule__Qcm__Group__1__Impl rule__Qcm__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Qcm__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Qcm__Group__2();

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
    // $ANTLR end "rule__Qcm__Group__1"


    // $ANTLR start "rule__Qcm__Group__1__Impl"
    // InternalQcm.g:258:1: rule__Qcm__Group__1__Impl : ( '{' ) ;
    public final void rule__Qcm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:262:1: ( ( '{' ) )
            // InternalQcm.g:263:1: ( '{' )
            {
            // InternalQcm.g:263:1: ( '{' )
            // InternalQcm.g:264:2: '{'
            {
             before(grammarAccess.getQcmAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getQcmAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Qcm__Group__1__Impl"


    // $ANTLR start "rule__Qcm__Group__2"
    // InternalQcm.g:273:1: rule__Qcm__Group__2 : rule__Qcm__Group__2__Impl rule__Qcm__Group__3 ;
    public final void rule__Qcm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:277:1: ( rule__Qcm__Group__2__Impl rule__Qcm__Group__3 )
            // InternalQcm.g:278:2: rule__Qcm__Group__2__Impl rule__Qcm__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Qcm__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Qcm__Group__3();

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
    // $ANTLR end "rule__Qcm__Group__2"


    // $ANTLR start "rule__Qcm__Group__2__Impl"
    // InternalQcm.g:285:1: rule__Qcm__Group__2__Impl : ( ( rule__Qcm__Group_2__0 )? ) ;
    public final void rule__Qcm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:289:1: ( ( ( rule__Qcm__Group_2__0 )? ) )
            // InternalQcm.g:290:1: ( ( rule__Qcm__Group_2__0 )? )
            {
            // InternalQcm.g:290:1: ( ( rule__Qcm__Group_2__0 )? )
            // InternalQcm.g:291:2: ( rule__Qcm__Group_2__0 )?
            {
             before(grammarAccess.getQcmAccess().getGroup_2()); 
            // InternalQcm.g:292:2: ( rule__Qcm__Group_2__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalQcm.g:292:3: rule__Qcm__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Qcm__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQcmAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Qcm__Group__2__Impl"


    // $ANTLR start "rule__Qcm__Group__3"
    // InternalQcm.g:300:1: rule__Qcm__Group__3 : rule__Qcm__Group__3__Impl rule__Qcm__Group__4 ;
    public final void rule__Qcm__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:304:1: ( rule__Qcm__Group__3__Impl rule__Qcm__Group__4 )
            // InternalQcm.g:305:2: rule__Qcm__Group__3__Impl rule__Qcm__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Qcm__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Qcm__Group__4();

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
    // $ANTLR end "rule__Qcm__Group__3"


    // $ANTLR start "rule__Qcm__Group__3__Impl"
    // InternalQcm.g:312:1: rule__Qcm__Group__3__Impl : ( 'question' ) ;
    public final void rule__Qcm__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:316:1: ( ( 'question' ) )
            // InternalQcm.g:317:1: ( 'question' )
            {
            // InternalQcm.g:317:1: ( 'question' )
            // InternalQcm.g:318:2: 'question'
            {
             before(grammarAccess.getQcmAccess().getQuestionKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getQcmAccess().getQuestionKeyword_3()); 

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
    // $ANTLR end "rule__Qcm__Group__3__Impl"


    // $ANTLR start "rule__Qcm__Group__4"
    // InternalQcm.g:327:1: rule__Qcm__Group__4 : rule__Qcm__Group__4__Impl rule__Qcm__Group__5 ;
    public final void rule__Qcm__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:331:1: ( rule__Qcm__Group__4__Impl rule__Qcm__Group__5 )
            // InternalQcm.g:332:2: rule__Qcm__Group__4__Impl rule__Qcm__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Qcm__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Qcm__Group__5();

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
    // $ANTLR end "rule__Qcm__Group__4"


    // $ANTLR start "rule__Qcm__Group__4__Impl"
    // InternalQcm.g:339:1: rule__Qcm__Group__4__Impl : ( '{' ) ;
    public final void rule__Qcm__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:343:1: ( ( '{' ) )
            // InternalQcm.g:344:1: ( '{' )
            {
            // InternalQcm.g:344:1: ( '{' )
            // InternalQcm.g:345:2: '{'
            {
             before(grammarAccess.getQcmAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getQcmAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Qcm__Group__4__Impl"


    // $ANTLR start "rule__Qcm__Group__5"
    // InternalQcm.g:354:1: rule__Qcm__Group__5 : rule__Qcm__Group__5__Impl rule__Qcm__Group__6 ;
    public final void rule__Qcm__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:358:1: ( rule__Qcm__Group__5__Impl rule__Qcm__Group__6 )
            // InternalQcm.g:359:2: rule__Qcm__Group__5__Impl rule__Qcm__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Qcm__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Qcm__Group__6();

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
    // $ANTLR end "rule__Qcm__Group__5"


    // $ANTLR start "rule__Qcm__Group__5__Impl"
    // InternalQcm.g:366:1: rule__Qcm__Group__5__Impl : ( ( rule__Qcm__QuestionAssignment_5 ) ) ;
    public final void rule__Qcm__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:370:1: ( ( ( rule__Qcm__QuestionAssignment_5 ) ) )
            // InternalQcm.g:371:1: ( ( rule__Qcm__QuestionAssignment_5 ) )
            {
            // InternalQcm.g:371:1: ( ( rule__Qcm__QuestionAssignment_5 ) )
            // InternalQcm.g:372:2: ( rule__Qcm__QuestionAssignment_5 )
            {
             before(grammarAccess.getQcmAccess().getQuestionAssignment_5()); 
            // InternalQcm.g:373:2: ( rule__Qcm__QuestionAssignment_5 )
            // InternalQcm.g:373:3: rule__Qcm__QuestionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Qcm__QuestionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getQcmAccess().getQuestionAssignment_5()); 

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
    // $ANTLR end "rule__Qcm__Group__5__Impl"


    // $ANTLR start "rule__Qcm__Group__6"
    // InternalQcm.g:381:1: rule__Qcm__Group__6 : rule__Qcm__Group__6__Impl rule__Qcm__Group__7 ;
    public final void rule__Qcm__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:385:1: ( rule__Qcm__Group__6__Impl rule__Qcm__Group__7 )
            // InternalQcm.g:386:2: rule__Qcm__Group__6__Impl rule__Qcm__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Qcm__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Qcm__Group__7();

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
    // $ANTLR end "rule__Qcm__Group__6"


    // $ANTLR start "rule__Qcm__Group__6__Impl"
    // InternalQcm.g:393:1: rule__Qcm__Group__6__Impl : ( ( rule__Qcm__Group_6__0 )* ) ;
    public final void rule__Qcm__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:397:1: ( ( ( rule__Qcm__Group_6__0 )* ) )
            // InternalQcm.g:398:1: ( ( rule__Qcm__Group_6__0 )* )
            {
            // InternalQcm.g:398:1: ( ( rule__Qcm__Group_6__0 )* )
            // InternalQcm.g:399:2: ( rule__Qcm__Group_6__0 )*
            {
             before(grammarAccess.getQcmAccess().getGroup_6()); 
            // InternalQcm.g:400:2: ( rule__Qcm__Group_6__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalQcm.g:400:3: rule__Qcm__Group_6__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Qcm__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getQcmAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Qcm__Group__6__Impl"


    // $ANTLR start "rule__Qcm__Group__7"
    // InternalQcm.g:408:1: rule__Qcm__Group__7 : rule__Qcm__Group__7__Impl rule__Qcm__Group__8 ;
    public final void rule__Qcm__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:412:1: ( rule__Qcm__Group__7__Impl rule__Qcm__Group__8 )
            // InternalQcm.g:413:2: rule__Qcm__Group__7__Impl rule__Qcm__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Qcm__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Qcm__Group__8();

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
    // $ANTLR end "rule__Qcm__Group__7"


    // $ANTLR start "rule__Qcm__Group__7__Impl"
    // InternalQcm.g:420:1: rule__Qcm__Group__7__Impl : ( '}' ) ;
    public final void rule__Qcm__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:424:1: ( ( '}' ) )
            // InternalQcm.g:425:1: ( '}' )
            {
            // InternalQcm.g:425:1: ( '}' )
            // InternalQcm.g:426:2: '}'
            {
             before(grammarAccess.getQcmAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getQcmAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Qcm__Group__7__Impl"


    // $ANTLR start "rule__Qcm__Group__8"
    // InternalQcm.g:435:1: rule__Qcm__Group__8 : rule__Qcm__Group__8__Impl ;
    public final void rule__Qcm__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:439:1: ( rule__Qcm__Group__8__Impl )
            // InternalQcm.g:440:2: rule__Qcm__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Qcm__Group__8__Impl();

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
    // $ANTLR end "rule__Qcm__Group__8"


    // $ANTLR start "rule__Qcm__Group__8__Impl"
    // InternalQcm.g:446:1: rule__Qcm__Group__8__Impl : ( '}' ) ;
    public final void rule__Qcm__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:450:1: ( ( '}' ) )
            // InternalQcm.g:451:1: ( '}' )
            {
            // InternalQcm.g:451:1: ( '}' )
            // InternalQcm.g:452:2: '}'
            {
             before(grammarAccess.getQcmAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getQcmAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Qcm__Group__8__Impl"


    // $ANTLR start "rule__Qcm__Group_2__0"
    // InternalQcm.g:462:1: rule__Qcm__Group_2__0 : rule__Qcm__Group_2__0__Impl rule__Qcm__Group_2__1 ;
    public final void rule__Qcm__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:466:1: ( rule__Qcm__Group_2__0__Impl rule__Qcm__Group_2__1 )
            // InternalQcm.g:467:2: rule__Qcm__Group_2__0__Impl rule__Qcm__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__Qcm__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Qcm__Group_2__1();

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
    // $ANTLR end "rule__Qcm__Group_2__0"


    // $ANTLR start "rule__Qcm__Group_2__0__Impl"
    // InternalQcm.g:474:1: rule__Qcm__Group_2__0__Impl : ( 'domaine' ) ;
    public final void rule__Qcm__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:478:1: ( ( 'domaine' ) )
            // InternalQcm.g:479:1: ( 'domaine' )
            {
            // InternalQcm.g:479:1: ( 'domaine' )
            // InternalQcm.g:480:2: 'domaine'
            {
             before(grammarAccess.getQcmAccess().getDomaineKeyword_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getQcmAccess().getDomaineKeyword_2_0()); 

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
    // $ANTLR end "rule__Qcm__Group_2__0__Impl"


    // $ANTLR start "rule__Qcm__Group_2__1"
    // InternalQcm.g:489:1: rule__Qcm__Group_2__1 : rule__Qcm__Group_2__1__Impl ;
    public final void rule__Qcm__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:493:1: ( rule__Qcm__Group_2__1__Impl )
            // InternalQcm.g:494:2: rule__Qcm__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Qcm__Group_2__1__Impl();

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
    // $ANTLR end "rule__Qcm__Group_2__1"


    // $ANTLR start "rule__Qcm__Group_2__1__Impl"
    // InternalQcm.g:500:1: rule__Qcm__Group_2__1__Impl : ( ( rule__Qcm__DomaineAssignment_2_1 ) ) ;
    public final void rule__Qcm__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:504:1: ( ( ( rule__Qcm__DomaineAssignment_2_1 ) ) )
            // InternalQcm.g:505:1: ( ( rule__Qcm__DomaineAssignment_2_1 ) )
            {
            // InternalQcm.g:505:1: ( ( rule__Qcm__DomaineAssignment_2_1 ) )
            // InternalQcm.g:506:2: ( rule__Qcm__DomaineAssignment_2_1 )
            {
             before(grammarAccess.getQcmAccess().getDomaineAssignment_2_1()); 
            // InternalQcm.g:507:2: ( rule__Qcm__DomaineAssignment_2_1 )
            // InternalQcm.g:507:3: rule__Qcm__DomaineAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Qcm__DomaineAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getQcmAccess().getDomaineAssignment_2_1()); 

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
    // $ANTLR end "rule__Qcm__Group_2__1__Impl"


    // $ANTLR start "rule__Qcm__Group_6__0"
    // InternalQcm.g:516:1: rule__Qcm__Group_6__0 : rule__Qcm__Group_6__0__Impl rule__Qcm__Group_6__1 ;
    public final void rule__Qcm__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:520:1: ( rule__Qcm__Group_6__0__Impl rule__Qcm__Group_6__1 )
            // InternalQcm.g:521:2: rule__Qcm__Group_6__0__Impl rule__Qcm__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__Qcm__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Qcm__Group_6__1();

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
    // $ANTLR end "rule__Qcm__Group_6__0"


    // $ANTLR start "rule__Qcm__Group_6__0__Impl"
    // InternalQcm.g:528:1: rule__Qcm__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Qcm__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:532:1: ( ( ',' ) )
            // InternalQcm.g:533:1: ( ',' )
            {
            // InternalQcm.g:533:1: ( ',' )
            // InternalQcm.g:534:2: ','
            {
             before(grammarAccess.getQcmAccess().getCommaKeyword_6_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getQcmAccess().getCommaKeyword_6_0()); 

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
    // $ANTLR end "rule__Qcm__Group_6__0__Impl"


    // $ANTLR start "rule__Qcm__Group_6__1"
    // InternalQcm.g:543:1: rule__Qcm__Group_6__1 : rule__Qcm__Group_6__1__Impl ;
    public final void rule__Qcm__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:547:1: ( rule__Qcm__Group_6__1__Impl )
            // InternalQcm.g:548:2: rule__Qcm__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Qcm__Group_6__1__Impl();

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
    // $ANTLR end "rule__Qcm__Group_6__1"


    // $ANTLR start "rule__Qcm__Group_6__1__Impl"
    // InternalQcm.g:554:1: rule__Qcm__Group_6__1__Impl : ( ( rule__Qcm__QuestionAssignment_6_1 ) ) ;
    public final void rule__Qcm__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:558:1: ( ( ( rule__Qcm__QuestionAssignment_6_1 ) ) )
            // InternalQcm.g:559:1: ( ( rule__Qcm__QuestionAssignment_6_1 ) )
            {
            // InternalQcm.g:559:1: ( ( rule__Qcm__QuestionAssignment_6_1 ) )
            // InternalQcm.g:560:2: ( rule__Qcm__QuestionAssignment_6_1 )
            {
             before(grammarAccess.getQcmAccess().getQuestionAssignment_6_1()); 
            // InternalQcm.g:561:2: ( rule__Qcm__QuestionAssignment_6_1 )
            // InternalQcm.g:561:3: rule__Qcm__QuestionAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Qcm__QuestionAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getQcmAccess().getQuestionAssignment_6_1()); 

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
    // $ANTLR end "rule__Qcm__Group_6__1__Impl"


    // $ANTLR start "rule__Question__Group__0"
    // InternalQcm.g:570:1: rule__Question__Group__0 : rule__Question__Group__0__Impl rule__Question__Group__1 ;
    public final void rule__Question__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:574:1: ( rule__Question__Group__0__Impl rule__Question__Group__1 )
            // InternalQcm.g:575:2: rule__Question__Group__0__Impl rule__Question__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Question__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__1();

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
    // $ANTLR end "rule__Question__Group__0"


    // $ANTLR start "rule__Question__Group__0__Impl"
    // InternalQcm.g:582:1: rule__Question__Group__0__Impl : ( 'Question' ) ;
    public final void rule__Question__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:586:1: ( ( 'Question' ) )
            // InternalQcm.g:587:1: ( 'Question' )
            {
            // InternalQcm.g:587:1: ( 'Question' )
            // InternalQcm.g:588:2: 'Question'
            {
             before(grammarAccess.getQuestionAccess().getQuestionKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getQuestionKeyword_0()); 

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
    // $ANTLR end "rule__Question__Group__0__Impl"


    // $ANTLR start "rule__Question__Group__1"
    // InternalQcm.g:597:1: rule__Question__Group__1 : rule__Question__Group__1__Impl rule__Question__Group__2 ;
    public final void rule__Question__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:601:1: ( rule__Question__Group__1__Impl rule__Question__Group__2 )
            // InternalQcm.g:602:2: rule__Question__Group__1__Impl rule__Question__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Question__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__2();

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
    // $ANTLR end "rule__Question__Group__1"


    // $ANTLR start "rule__Question__Group__1__Impl"
    // InternalQcm.g:609:1: rule__Question__Group__1__Impl : ( '{' ) ;
    public final void rule__Question__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:613:1: ( ( '{' ) )
            // InternalQcm.g:614:1: ( '{' )
            {
            // InternalQcm.g:614:1: ( '{' )
            // InternalQcm.g:615:2: '{'
            {
             before(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Question__Group__1__Impl"


    // $ANTLR start "rule__Question__Group__2"
    // InternalQcm.g:624:1: rule__Question__Group__2 : rule__Question__Group__2__Impl rule__Question__Group__3 ;
    public final void rule__Question__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:628:1: ( rule__Question__Group__2__Impl rule__Question__Group__3 )
            // InternalQcm.g:629:2: rule__Question__Group__2__Impl rule__Question__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Question__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__3();

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
    // $ANTLR end "rule__Question__Group__2"


    // $ANTLR start "rule__Question__Group__2__Impl"
    // InternalQcm.g:636:1: rule__Question__Group__2__Impl : ( ( rule__Question__Group_2__0 )? ) ;
    public final void rule__Question__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:640:1: ( ( ( rule__Question__Group_2__0 )? ) )
            // InternalQcm.g:641:1: ( ( rule__Question__Group_2__0 )? )
            {
            // InternalQcm.g:641:1: ( ( rule__Question__Group_2__0 )? )
            // InternalQcm.g:642:2: ( rule__Question__Group_2__0 )?
            {
             before(grammarAccess.getQuestionAccess().getGroup_2()); 
            // InternalQcm.g:643:2: ( rule__Question__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalQcm.g:643:3: rule__Question__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Question__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Question__Group__2__Impl"


    // $ANTLR start "rule__Question__Group__3"
    // InternalQcm.g:651:1: rule__Question__Group__3 : rule__Question__Group__3__Impl rule__Question__Group__4 ;
    public final void rule__Question__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:655:1: ( rule__Question__Group__3__Impl rule__Question__Group__4 )
            // InternalQcm.g:656:2: rule__Question__Group__3__Impl rule__Question__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Question__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__4();

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
    // $ANTLR end "rule__Question__Group__3"


    // $ANTLR start "rule__Question__Group__3__Impl"
    // InternalQcm.g:663:1: rule__Question__Group__3__Impl : ( 'reponse' ) ;
    public final void rule__Question__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:667:1: ( ( 'reponse' ) )
            // InternalQcm.g:668:1: ( 'reponse' )
            {
            // InternalQcm.g:668:1: ( 'reponse' )
            // InternalQcm.g:669:2: 'reponse'
            {
             before(grammarAccess.getQuestionAccess().getReponseKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getReponseKeyword_3()); 

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
    // $ANTLR end "rule__Question__Group__3__Impl"


    // $ANTLR start "rule__Question__Group__4"
    // InternalQcm.g:678:1: rule__Question__Group__4 : rule__Question__Group__4__Impl rule__Question__Group__5 ;
    public final void rule__Question__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:682:1: ( rule__Question__Group__4__Impl rule__Question__Group__5 )
            // InternalQcm.g:683:2: rule__Question__Group__4__Impl rule__Question__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Question__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__5();

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
    // $ANTLR end "rule__Question__Group__4"


    // $ANTLR start "rule__Question__Group__4__Impl"
    // InternalQcm.g:690:1: rule__Question__Group__4__Impl : ( '{' ) ;
    public final void rule__Question__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:694:1: ( ( '{' ) )
            // InternalQcm.g:695:1: ( '{' )
            {
            // InternalQcm.g:695:1: ( '{' )
            // InternalQcm.g:696:2: '{'
            {
             before(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Question__Group__4__Impl"


    // $ANTLR start "rule__Question__Group__5"
    // InternalQcm.g:705:1: rule__Question__Group__5 : rule__Question__Group__5__Impl rule__Question__Group__6 ;
    public final void rule__Question__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:709:1: ( rule__Question__Group__5__Impl rule__Question__Group__6 )
            // InternalQcm.g:710:2: rule__Question__Group__5__Impl rule__Question__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Question__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__6();

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
    // $ANTLR end "rule__Question__Group__5"


    // $ANTLR start "rule__Question__Group__5__Impl"
    // InternalQcm.g:717:1: rule__Question__Group__5__Impl : ( ( rule__Question__ReponseAssignment_5 ) ) ;
    public final void rule__Question__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:721:1: ( ( ( rule__Question__ReponseAssignment_5 ) ) )
            // InternalQcm.g:722:1: ( ( rule__Question__ReponseAssignment_5 ) )
            {
            // InternalQcm.g:722:1: ( ( rule__Question__ReponseAssignment_5 ) )
            // InternalQcm.g:723:2: ( rule__Question__ReponseAssignment_5 )
            {
             before(grammarAccess.getQuestionAccess().getReponseAssignment_5()); 
            // InternalQcm.g:724:2: ( rule__Question__ReponseAssignment_5 )
            // InternalQcm.g:724:3: rule__Question__ReponseAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Question__ReponseAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getReponseAssignment_5()); 

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
    // $ANTLR end "rule__Question__Group__5__Impl"


    // $ANTLR start "rule__Question__Group__6"
    // InternalQcm.g:732:1: rule__Question__Group__6 : rule__Question__Group__6__Impl rule__Question__Group__7 ;
    public final void rule__Question__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:736:1: ( rule__Question__Group__6__Impl rule__Question__Group__7 )
            // InternalQcm.g:737:2: rule__Question__Group__6__Impl rule__Question__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Question__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__7();

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
    // $ANTLR end "rule__Question__Group__6"


    // $ANTLR start "rule__Question__Group__6__Impl"
    // InternalQcm.g:744:1: rule__Question__Group__6__Impl : ( ( rule__Question__Group_6__0 )* ) ;
    public final void rule__Question__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:748:1: ( ( ( rule__Question__Group_6__0 )* ) )
            // InternalQcm.g:749:1: ( ( rule__Question__Group_6__0 )* )
            {
            // InternalQcm.g:749:1: ( ( rule__Question__Group_6__0 )* )
            // InternalQcm.g:750:2: ( rule__Question__Group_6__0 )*
            {
             before(grammarAccess.getQuestionAccess().getGroup_6()); 
            // InternalQcm.g:751:2: ( rule__Question__Group_6__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalQcm.g:751:3: rule__Question__Group_6__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Question__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getQuestionAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Question__Group__6__Impl"


    // $ANTLR start "rule__Question__Group__7"
    // InternalQcm.g:759:1: rule__Question__Group__7 : rule__Question__Group__7__Impl rule__Question__Group__8 ;
    public final void rule__Question__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:763:1: ( rule__Question__Group__7__Impl rule__Question__Group__8 )
            // InternalQcm.g:764:2: rule__Question__Group__7__Impl rule__Question__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Question__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__8();

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
    // $ANTLR end "rule__Question__Group__7"


    // $ANTLR start "rule__Question__Group__7__Impl"
    // InternalQcm.g:771:1: rule__Question__Group__7__Impl : ( '}' ) ;
    public final void rule__Question__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:775:1: ( ( '}' ) )
            // InternalQcm.g:776:1: ( '}' )
            {
            // InternalQcm.g:776:1: ( '}' )
            // InternalQcm.g:777:2: '}'
            {
             before(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Question__Group__7__Impl"


    // $ANTLR start "rule__Question__Group__8"
    // InternalQcm.g:786:1: rule__Question__Group__8 : rule__Question__Group__8__Impl ;
    public final void rule__Question__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:790:1: ( rule__Question__Group__8__Impl )
            // InternalQcm.g:791:2: rule__Question__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group__8__Impl();

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
    // $ANTLR end "rule__Question__Group__8"


    // $ANTLR start "rule__Question__Group__8__Impl"
    // InternalQcm.g:797:1: rule__Question__Group__8__Impl : ( '}' ) ;
    public final void rule__Question__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:801:1: ( ( '}' ) )
            // InternalQcm.g:802:1: ( '}' )
            {
            // InternalQcm.g:802:1: ( '}' )
            // InternalQcm.g:803:2: '}'
            {
             before(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Question__Group__8__Impl"


    // $ANTLR start "rule__Question__Group_2__0"
    // InternalQcm.g:813:1: rule__Question__Group_2__0 : rule__Question__Group_2__0__Impl rule__Question__Group_2__1 ;
    public final void rule__Question__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:817:1: ( rule__Question__Group_2__0__Impl rule__Question__Group_2__1 )
            // InternalQcm.g:818:2: rule__Question__Group_2__0__Impl rule__Question__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__Question__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group_2__1();

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
    // $ANTLR end "rule__Question__Group_2__0"


    // $ANTLR start "rule__Question__Group_2__0__Impl"
    // InternalQcm.g:825:1: rule__Question__Group_2__0__Impl : ( 'intitule' ) ;
    public final void rule__Question__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:829:1: ( ( 'intitule' ) )
            // InternalQcm.g:830:1: ( 'intitule' )
            {
            // InternalQcm.g:830:1: ( 'intitule' )
            // InternalQcm.g:831:2: 'intitule'
            {
             before(grammarAccess.getQuestionAccess().getIntituleKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getIntituleKeyword_2_0()); 

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
    // $ANTLR end "rule__Question__Group_2__0__Impl"


    // $ANTLR start "rule__Question__Group_2__1"
    // InternalQcm.g:840:1: rule__Question__Group_2__1 : rule__Question__Group_2__1__Impl ;
    public final void rule__Question__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:844:1: ( rule__Question__Group_2__1__Impl )
            // InternalQcm.g:845:2: rule__Question__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group_2__1__Impl();

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
    // $ANTLR end "rule__Question__Group_2__1"


    // $ANTLR start "rule__Question__Group_2__1__Impl"
    // InternalQcm.g:851:1: rule__Question__Group_2__1__Impl : ( ( rule__Question__IntituleAssignment_2_1 ) ) ;
    public final void rule__Question__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:855:1: ( ( ( rule__Question__IntituleAssignment_2_1 ) ) )
            // InternalQcm.g:856:1: ( ( rule__Question__IntituleAssignment_2_1 ) )
            {
            // InternalQcm.g:856:1: ( ( rule__Question__IntituleAssignment_2_1 ) )
            // InternalQcm.g:857:2: ( rule__Question__IntituleAssignment_2_1 )
            {
             before(grammarAccess.getQuestionAccess().getIntituleAssignment_2_1()); 
            // InternalQcm.g:858:2: ( rule__Question__IntituleAssignment_2_1 )
            // InternalQcm.g:858:3: rule__Question__IntituleAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Question__IntituleAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getIntituleAssignment_2_1()); 

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
    // $ANTLR end "rule__Question__Group_2__1__Impl"


    // $ANTLR start "rule__Question__Group_6__0"
    // InternalQcm.g:867:1: rule__Question__Group_6__0 : rule__Question__Group_6__0__Impl rule__Question__Group_6__1 ;
    public final void rule__Question__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:871:1: ( rule__Question__Group_6__0__Impl rule__Question__Group_6__1 )
            // InternalQcm.g:872:2: rule__Question__Group_6__0__Impl rule__Question__Group_6__1
            {
            pushFollow(FOLLOW_11);
            rule__Question__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group_6__1();

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
    // $ANTLR end "rule__Question__Group_6__0"


    // $ANTLR start "rule__Question__Group_6__0__Impl"
    // InternalQcm.g:879:1: rule__Question__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Question__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:883:1: ( ( ',' ) )
            // InternalQcm.g:884:1: ( ',' )
            {
            // InternalQcm.g:884:1: ( ',' )
            // InternalQcm.g:885:2: ','
            {
             before(grammarAccess.getQuestionAccess().getCommaKeyword_6_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getCommaKeyword_6_0()); 

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
    // $ANTLR end "rule__Question__Group_6__0__Impl"


    // $ANTLR start "rule__Question__Group_6__1"
    // InternalQcm.g:894:1: rule__Question__Group_6__1 : rule__Question__Group_6__1__Impl ;
    public final void rule__Question__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:898:1: ( rule__Question__Group_6__1__Impl )
            // InternalQcm.g:899:2: rule__Question__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group_6__1__Impl();

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
    // $ANTLR end "rule__Question__Group_6__1"


    // $ANTLR start "rule__Question__Group_6__1__Impl"
    // InternalQcm.g:905:1: rule__Question__Group_6__1__Impl : ( ( rule__Question__ReponseAssignment_6_1 ) ) ;
    public final void rule__Question__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:909:1: ( ( ( rule__Question__ReponseAssignment_6_1 ) ) )
            // InternalQcm.g:910:1: ( ( rule__Question__ReponseAssignment_6_1 ) )
            {
            // InternalQcm.g:910:1: ( ( rule__Question__ReponseAssignment_6_1 ) )
            // InternalQcm.g:911:2: ( rule__Question__ReponseAssignment_6_1 )
            {
             before(grammarAccess.getQuestionAccess().getReponseAssignment_6_1()); 
            // InternalQcm.g:912:2: ( rule__Question__ReponseAssignment_6_1 )
            // InternalQcm.g:912:3: rule__Question__ReponseAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Question__ReponseAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getReponseAssignment_6_1()); 

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
    // $ANTLR end "rule__Question__Group_6__1__Impl"


    // $ANTLR start "rule__Reponse__Group__0"
    // InternalQcm.g:921:1: rule__Reponse__Group__0 : rule__Reponse__Group__0__Impl rule__Reponse__Group__1 ;
    public final void rule__Reponse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:925:1: ( rule__Reponse__Group__0__Impl rule__Reponse__Group__1 )
            // InternalQcm.g:926:2: rule__Reponse__Group__0__Impl rule__Reponse__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Reponse__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reponse__Group__1();

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
    // $ANTLR end "rule__Reponse__Group__0"


    // $ANTLR start "rule__Reponse__Group__0__Impl"
    // InternalQcm.g:933:1: rule__Reponse__Group__0__Impl : ( 'Reponse' ) ;
    public final void rule__Reponse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:937:1: ( ( 'Reponse' ) )
            // InternalQcm.g:938:1: ( 'Reponse' )
            {
            // InternalQcm.g:938:1: ( 'Reponse' )
            // InternalQcm.g:939:2: 'Reponse'
            {
             before(grammarAccess.getReponseAccess().getReponseKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getReponseAccess().getReponseKeyword_0()); 

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
    // $ANTLR end "rule__Reponse__Group__0__Impl"


    // $ANTLR start "rule__Reponse__Group__1"
    // InternalQcm.g:948:1: rule__Reponse__Group__1 : rule__Reponse__Group__1__Impl rule__Reponse__Group__2 ;
    public final void rule__Reponse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:952:1: ( rule__Reponse__Group__1__Impl rule__Reponse__Group__2 )
            // InternalQcm.g:953:2: rule__Reponse__Group__1__Impl rule__Reponse__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Reponse__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reponse__Group__2();

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
    // $ANTLR end "rule__Reponse__Group__1"


    // $ANTLR start "rule__Reponse__Group__1__Impl"
    // InternalQcm.g:960:1: rule__Reponse__Group__1__Impl : ( '{' ) ;
    public final void rule__Reponse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:964:1: ( ( '{' ) )
            // InternalQcm.g:965:1: ( '{' )
            {
            // InternalQcm.g:965:1: ( '{' )
            // InternalQcm.g:966:2: '{'
            {
             before(grammarAccess.getReponseAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getReponseAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Reponse__Group__1__Impl"


    // $ANTLR start "rule__Reponse__Group__2"
    // InternalQcm.g:975:1: rule__Reponse__Group__2 : rule__Reponse__Group__2__Impl rule__Reponse__Group__3 ;
    public final void rule__Reponse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:979:1: ( rule__Reponse__Group__2__Impl rule__Reponse__Group__3 )
            // InternalQcm.g:980:2: rule__Reponse__Group__2__Impl rule__Reponse__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Reponse__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reponse__Group__3();

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
    // $ANTLR end "rule__Reponse__Group__2"


    // $ANTLR start "rule__Reponse__Group__2__Impl"
    // InternalQcm.g:987:1: rule__Reponse__Group__2__Impl : ( ( rule__Reponse__Group_2__0 )? ) ;
    public final void rule__Reponse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:991:1: ( ( ( rule__Reponse__Group_2__0 )? ) )
            // InternalQcm.g:992:1: ( ( rule__Reponse__Group_2__0 )? )
            {
            // InternalQcm.g:992:1: ( ( rule__Reponse__Group_2__0 )? )
            // InternalQcm.g:993:2: ( rule__Reponse__Group_2__0 )?
            {
             before(grammarAccess.getReponseAccess().getGroup_2()); 
            // InternalQcm.g:994:2: ( rule__Reponse__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalQcm.g:994:3: rule__Reponse__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reponse__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReponseAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Reponse__Group__2__Impl"


    // $ANTLR start "rule__Reponse__Group__3"
    // InternalQcm.g:1002:1: rule__Reponse__Group__3 : rule__Reponse__Group__3__Impl rule__Reponse__Group__4 ;
    public final void rule__Reponse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:1006:1: ( rule__Reponse__Group__3__Impl rule__Reponse__Group__4 )
            // InternalQcm.g:1007:2: rule__Reponse__Group__3__Impl rule__Reponse__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Reponse__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reponse__Group__4();

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
    // $ANTLR end "rule__Reponse__Group__3"


    // $ANTLR start "rule__Reponse__Group__3__Impl"
    // InternalQcm.g:1014:1: rule__Reponse__Group__3__Impl : ( ( rule__Reponse__Group_3__0 )? ) ;
    public final void rule__Reponse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:1018:1: ( ( ( rule__Reponse__Group_3__0 )? ) )
            // InternalQcm.g:1019:1: ( ( rule__Reponse__Group_3__0 )? )
            {
            // InternalQcm.g:1019:1: ( ( rule__Reponse__Group_3__0 )? )
            // InternalQcm.g:1020:2: ( rule__Reponse__Group_3__0 )?
            {
             before(grammarAccess.getReponseAccess().getGroup_3()); 
            // InternalQcm.g:1021:2: ( rule__Reponse__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalQcm.g:1021:3: rule__Reponse__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reponse__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReponseAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Reponse__Group__3__Impl"


    // $ANTLR start "rule__Reponse__Group__4"
    // InternalQcm.g:1029:1: rule__Reponse__Group__4 : rule__Reponse__Group__4__Impl ;
    public final void rule__Reponse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:1033:1: ( rule__Reponse__Group__4__Impl )
            // InternalQcm.g:1034:2: rule__Reponse__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reponse__Group__4__Impl();

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
    // $ANTLR end "rule__Reponse__Group__4"


    // $ANTLR start "rule__Reponse__Group__4__Impl"
    // InternalQcm.g:1040:1: rule__Reponse__Group__4__Impl : ( '}' ) ;
    public final void rule__Reponse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:1044:1: ( ( '}' ) )
            // InternalQcm.g:1045:1: ( '}' )
            {
            // InternalQcm.g:1045:1: ( '}' )
            // InternalQcm.g:1046:2: '}'
            {
             before(grammarAccess.getReponseAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getReponseAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Reponse__Group__4__Impl"


    // $ANTLR start "rule__Reponse__Group_2__0"
    // InternalQcm.g:1056:1: rule__Reponse__Group_2__0 : rule__Reponse__Group_2__0__Impl rule__Reponse__Group_2__1 ;
    public final void rule__Reponse__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:1060:1: ( rule__Reponse__Group_2__0__Impl rule__Reponse__Group_2__1 )
            // InternalQcm.g:1061:2: rule__Reponse__Group_2__0__Impl rule__Reponse__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__Reponse__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reponse__Group_2__1();

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
    // $ANTLR end "rule__Reponse__Group_2__0"


    // $ANTLR start "rule__Reponse__Group_2__0__Impl"
    // InternalQcm.g:1068:1: rule__Reponse__Group_2__0__Impl : ( 'data' ) ;
    public final void rule__Reponse__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:1072:1: ( ( 'data' ) )
            // InternalQcm.g:1073:1: ( 'data' )
            {
            // InternalQcm.g:1073:1: ( 'data' )
            // InternalQcm.g:1074:2: 'data'
            {
             before(grammarAccess.getReponseAccess().getDataKeyword_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getReponseAccess().getDataKeyword_2_0()); 

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
    // $ANTLR end "rule__Reponse__Group_2__0__Impl"


    // $ANTLR start "rule__Reponse__Group_2__1"
    // InternalQcm.g:1083:1: rule__Reponse__Group_2__1 : rule__Reponse__Group_2__1__Impl ;
    public final void rule__Reponse__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:1087:1: ( rule__Reponse__Group_2__1__Impl )
            // InternalQcm.g:1088:2: rule__Reponse__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reponse__Group_2__1__Impl();

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
    // $ANTLR end "rule__Reponse__Group_2__1"


    // $ANTLR start "rule__Reponse__Group_2__1__Impl"
    // InternalQcm.g:1094:1: rule__Reponse__Group_2__1__Impl : ( ( rule__Reponse__DataAssignment_2_1 ) ) ;
    public final void rule__Reponse__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:1098:1: ( ( ( rule__Reponse__DataAssignment_2_1 ) ) )
            // InternalQcm.g:1099:1: ( ( rule__Reponse__DataAssignment_2_1 ) )
            {
            // InternalQcm.g:1099:1: ( ( rule__Reponse__DataAssignment_2_1 ) )
            // InternalQcm.g:1100:2: ( rule__Reponse__DataAssignment_2_1 )
            {
             before(grammarAccess.getReponseAccess().getDataAssignment_2_1()); 
            // InternalQcm.g:1101:2: ( rule__Reponse__DataAssignment_2_1 )
            // InternalQcm.g:1101:3: rule__Reponse__DataAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Reponse__DataAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getReponseAccess().getDataAssignment_2_1()); 

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
    // $ANTLR end "rule__Reponse__Group_2__1__Impl"


    // $ANTLR start "rule__Reponse__Group_3__0"
    // InternalQcm.g:1110:1: rule__Reponse__Group_3__0 : rule__Reponse__Group_3__0__Impl rule__Reponse__Group_3__1 ;
    public final void rule__Reponse__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:1114:1: ( rule__Reponse__Group_3__0__Impl rule__Reponse__Group_3__1 )
            // InternalQcm.g:1115:2: rule__Reponse__Group_3__0__Impl rule__Reponse__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Reponse__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reponse__Group_3__1();

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
    // $ANTLR end "rule__Reponse__Group_3__0"


    // $ANTLR start "rule__Reponse__Group_3__0__Impl"
    // InternalQcm.g:1122:1: rule__Reponse__Group_3__0__Impl : ( 'value' ) ;
    public final void rule__Reponse__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:1126:1: ( ( 'value' ) )
            // InternalQcm.g:1127:1: ( 'value' )
            {
            // InternalQcm.g:1127:1: ( 'value' )
            // InternalQcm.g:1128:2: 'value'
            {
             before(grammarAccess.getReponseAccess().getValueKeyword_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getReponseAccess().getValueKeyword_3_0()); 

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
    // $ANTLR end "rule__Reponse__Group_3__0__Impl"


    // $ANTLR start "rule__Reponse__Group_3__1"
    // InternalQcm.g:1137:1: rule__Reponse__Group_3__1 : rule__Reponse__Group_3__1__Impl ;
    public final void rule__Reponse__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:1141:1: ( rule__Reponse__Group_3__1__Impl )
            // InternalQcm.g:1142:2: rule__Reponse__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reponse__Group_3__1__Impl();

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
    // $ANTLR end "rule__Reponse__Group_3__1"


    // $ANTLR start "rule__Reponse__Group_3__1__Impl"
    // InternalQcm.g:1148:1: rule__Reponse__Group_3__1__Impl : ( ( rule__Reponse__ValueAssignment_3_1 ) ) ;
    public final void rule__Reponse__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:1152:1: ( ( ( rule__Reponse__ValueAssignment_3_1 ) ) )
            // InternalQcm.g:1153:1: ( ( rule__Reponse__ValueAssignment_3_1 ) )
            {
            // InternalQcm.g:1153:1: ( ( rule__Reponse__ValueAssignment_3_1 ) )
            // InternalQcm.g:1154:2: ( rule__Reponse__ValueAssignment_3_1 )
            {
             before(grammarAccess.getReponseAccess().getValueAssignment_3_1()); 
            // InternalQcm.g:1155:2: ( rule__Reponse__ValueAssignment_3_1 )
            // InternalQcm.g:1155:3: rule__Reponse__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Reponse__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getReponseAccess().getValueAssignment_3_1()); 

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
    // $ANTLR end "rule__Reponse__Group_3__1__Impl"


    // $ANTLR start "rule__Qcm__DomaineAssignment_2_1"
    // InternalQcm.g:1164:1: rule__Qcm__DomaineAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Qcm__DomaineAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:1168:1: ( ( ruleEString ) )
            // InternalQcm.g:1169:2: ( ruleEString )
            {
            // InternalQcm.g:1169:2: ( ruleEString )
            // InternalQcm.g:1170:3: ruleEString
            {
             before(grammarAccess.getQcmAccess().getDomaineEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQcmAccess().getDomaineEStringParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Qcm__DomaineAssignment_2_1"


    // $ANTLR start "rule__Qcm__QuestionAssignment_5"
    // InternalQcm.g:1179:1: rule__Qcm__QuestionAssignment_5 : ( ruleQuestion ) ;
    public final void rule__Qcm__QuestionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:1183:1: ( ( ruleQuestion ) )
            // InternalQcm.g:1184:2: ( ruleQuestion )
            {
            // InternalQcm.g:1184:2: ( ruleQuestion )
            // InternalQcm.g:1185:3: ruleQuestion
            {
             before(grammarAccess.getQcmAccess().getQuestionQuestionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQcmAccess().getQuestionQuestionParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Qcm__QuestionAssignment_5"


    // $ANTLR start "rule__Qcm__QuestionAssignment_6_1"
    // InternalQcm.g:1194:1: rule__Qcm__QuestionAssignment_6_1 : ( ruleQuestion ) ;
    public final void rule__Qcm__QuestionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:1198:1: ( ( ruleQuestion ) )
            // InternalQcm.g:1199:2: ( ruleQuestion )
            {
            // InternalQcm.g:1199:2: ( ruleQuestion )
            // InternalQcm.g:1200:3: ruleQuestion
            {
             before(grammarAccess.getQcmAccess().getQuestionQuestionParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQcmAccess().getQuestionQuestionParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Qcm__QuestionAssignment_6_1"


    // $ANTLR start "rule__Question__IntituleAssignment_2_1"
    // InternalQcm.g:1209:1: rule__Question__IntituleAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Question__IntituleAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:1213:1: ( ( ruleEString ) )
            // InternalQcm.g:1214:2: ( ruleEString )
            {
            // InternalQcm.g:1214:2: ( ruleEString )
            // InternalQcm.g:1215:3: ruleEString
            {
             before(grammarAccess.getQuestionAccess().getIntituleEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getIntituleEStringParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Question__IntituleAssignment_2_1"


    // $ANTLR start "rule__Question__ReponseAssignment_5"
    // InternalQcm.g:1224:1: rule__Question__ReponseAssignment_5 : ( ruleReponse ) ;
    public final void rule__Question__ReponseAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:1228:1: ( ( ruleReponse ) )
            // InternalQcm.g:1229:2: ( ruleReponse )
            {
            // InternalQcm.g:1229:2: ( ruleReponse )
            // InternalQcm.g:1230:3: ruleReponse
            {
             before(grammarAccess.getQuestionAccess().getReponseReponseParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleReponse();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getReponseReponseParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Question__ReponseAssignment_5"


    // $ANTLR start "rule__Question__ReponseAssignment_6_1"
    // InternalQcm.g:1239:1: rule__Question__ReponseAssignment_6_1 : ( ruleReponse ) ;
    public final void rule__Question__ReponseAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:1243:1: ( ( ruleReponse ) )
            // InternalQcm.g:1244:2: ( ruleReponse )
            {
            // InternalQcm.g:1244:2: ( ruleReponse )
            // InternalQcm.g:1245:3: ruleReponse
            {
             before(grammarAccess.getQuestionAccess().getReponseReponseParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReponse();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getReponseReponseParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Question__ReponseAssignment_6_1"


    // $ANTLR start "rule__Reponse__DataAssignment_2_1"
    // InternalQcm.g:1254:1: rule__Reponse__DataAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Reponse__DataAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:1258:1: ( ( ruleEString ) )
            // InternalQcm.g:1259:2: ( ruleEString )
            {
            // InternalQcm.g:1259:2: ( ruleEString )
            // InternalQcm.g:1260:3: ruleEString
            {
             before(grammarAccess.getReponseAccess().getDataEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReponseAccess().getDataEStringParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Reponse__DataAssignment_2_1"


    // $ANTLR start "rule__Reponse__ValueAssignment_3_1"
    // InternalQcm.g:1269:1: rule__Reponse__ValueAssignment_3_1 : ( ruleEBoolean ) ;
    public final void rule__Reponse__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQcm.g:1273:1: ( ( ruleEBoolean ) )
            // InternalQcm.g:1274:2: ( ruleEBoolean )
            {
            // InternalQcm.g:1274:2: ( ruleEBoolean )
            // InternalQcm.g:1275:3: ruleEBoolean
            {
             before(grammarAccess.getReponseAccess().getValueEBooleanParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getReponseAccess().getValueEBooleanParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Reponse__ValueAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001810000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001800L});

}
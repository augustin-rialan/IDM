package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Qcm'", "'{'", "'question'", "'}'", "'domaine'", "','", "'Question'", "'reponse'", "'intitule'", "'Reponse'", "'data'", "'value'"
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
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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
    // InternalMyDsl.g:53:1: entryRuleQcm : ruleQcm EOF ;
    public final void entryRuleQcm() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleQcm EOF )
            // InternalMyDsl.g:55:1: ruleQcm EOF
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
    // InternalMyDsl.g:62:1: ruleQcm : ( ( rule__Qcm__Group__0 ) ) ;
    public final void ruleQcm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Qcm__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Qcm__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Qcm__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Qcm__Group__0 )
            {
             before(grammarAccess.getQcmAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Qcm__Group__0 )
            // InternalMyDsl.g:69:4: rule__Qcm__Group__0
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
    // InternalMyDsl.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleEString EOF )
            // InternalMyDsl.g:80:1: ruleEString EOF
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
    // InternalMyDsl.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:94:4: rule__EString__Alternatives
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
    // InternalMyDsl.g:103:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleQuestion EOF )
            // InternalMyDsl.g:105:1: ruleQuestion EOF
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
    // InternalMyDsl.g:112:1: ruleQuestion : ( ( rule__Question__Group__0 ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Question__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Question__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Question__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Question__Group__0 )
            {
             before(grammarAccess.getQuestionAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Question__Group__0 )
            // InternalMyDsl.g:119:4: rule__Question__Group__0
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
    // InternalMyDsl.g:128:1: entryRuleReponse : ruleReponse EOF ;
    public final void entryRuleReponse() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleReponse EOF )
            // InternalMyDsl.g:130:1: ruleReponse EOF
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
    // InternalMyDsl.g:137:1: ruleReponse : ( ( rule__Reponse__Group__0 ) ) ;
    public final void ruleReponse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Reponse__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Reponse__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Reponse__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Reponse__Group__0 )
            {
             before(grammarAccess.getReponseAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Reponse__Group__0 )
            // InternalMyDsl.g:144:4: rule__Reponse__Group__0
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


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:152:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:156:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalMyDsl.g:157:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:157:2: ( RULE_STRING )
                    // InternalMyDsl.g:158:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:163:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:163:2: ( RULE_ID )
                    // InternalMyDsl.g:164:3: RULE_ID
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


    // $ANTLR start "rule__Qcm__Group__0"
    // InternalMyDsl.g:173:1: rule__Qcm__Group__0 : rule__Qcm__Group__0__Impl rule__Qcm__Group__1 ;
    public final void rule__Qcm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:177:1: ( rule__Qcm__Group__0__Impl rule__Qcm__Group__1 )
            // InternalMyDsl.g:178:2: rule__Qcm__Group__0__Impl rule__Qcm__Group__1
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
    // InternalMyDsl.g:185:1: rule__Qcm__Group__0__Impl : ( 'Qcm' ) ;
    public final void rule__Qcm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:189:1: ( ( 'Qcm' ) )
            // InternalMyDsl.g:190:1: ( 'Qcm' )
            {
            // InternalMyDsl.g:190:1: ( 'Qcm' )
            // InternalMyDsl.g:191:2: 'Qcm'
            {
             before(grammarAccess.getQcmAccess().getQcmKeyword_0()); 
            match(input,11,FOLLOW_2); 
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
    // InternalMyDsl.g:200:1: rule__Qcm__Group__1 : rule__Qcm__Group__1__Impl rule__Qcm__Group__2 ;
    public final void rule__Qcm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:204:1: ( rule__Qcm__Group__1__Impl rule__Qcm__Group__2 )
            // InternalMyDsl.g:205:2: rule__Qcm__Group__1__Impl rule__Qcm__Group__2
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
    // InternalMyDsl.g:212:1: rule__Qcm__Group__1__Impl : ( '{' ) ;
    public final void rule__Qcm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:1: ( ( '{' ) )
            // InternalMyDsl.g:217:1: ( '{' )
            {
            // InternalMyDsl.g:217:1: ( '{' )
            // InternalMyDsl.g:218:2: '{'
            {
             before(grammarAccess.getQcmAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalMyDsl.g:227:1: rule__Qcm__Group__2 : rule__Qcm__Group__2__Impl rule__Qcm__Group__3 ;
    public final void rule__Qcm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:231:1: ( rule__Qcm__Group__2__Impl rule__Qcm__Group__3 )
            // InternalMyDsl.g:232:2: rule__Qcm__Group__2__Impl rule__Qcm__Group__3
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
    // InternalMyDsl.g:239:1: rule__Qcm__Group__2__Impl : ( ( rule__Qcm__Group_2__0 )? ) ;
    public final void rule__Qcm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:243:1: ( ( ( rule__Qcm__Group_2__0 )? ) )
            // InternalMyDsl.g:244:1: ( ( rule__Qcm__Group_2__0 )? )
            {
            // InternalMyDsl.g:244:1: ( ( rule__Qcm__Group_2__0 )? )
            // InternalMyDsl.g:245:2: ( rule__Qcm__Group_2__0 )?
            {
             before(grammarAccess.getQcmAccess().getGroup_2()); 
            // InternalMyDsl.g:246:2: ( rule__Qcm__Group_2__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:246:3: rule__Qcm__Group_2__0
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
    // InternalMyDsl.g:254:1: rule__Qcm__Group__3 : rule__Qcm__Group__3__Impl rule__Qcm__Group__4 ;
    public final void rule__Qcm__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:258:1: ( rule__Qcm__Group__3__Impl rule__Qcm__Group__4 )
            // InternalMyDsl.g:259:2: rule__Qcm__Group__3__Impl rule__Qcm__Group__4
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
    // InternalMyDsl.g:266:1: rule__Qcm__Group__3__Impl : ( 'question' ) ;
    public final void rule__Qcm__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:270:1: ( ( 'question' ) )
            // InternalMyDsl.g:271:1: ( 'question' )
            {
            // InternalMyDsl.g:271:1: ( 'question' )
            // InternalMyDsl.g:272:2: 'question'
            {
             before(grammarAccess.getQcmAccess().getQuestionKeyword_3()); 
            match(input,13,FOLLOW_2); 
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
    // InternalMyDsl.g:281:1: rule__Qcm__Group__4 : rule__Qcm__Group__4__Impl rule__Qcm__Group__5 ;
    public final void rule__Qcm__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:285:1: ( rule__Qcm__Group__4__Impl rule__Qcm__Group__5 )
            // InternalMyDsl.g:286:2: rule__Qcm__Group__4__Impl rule__Qcm__Group__5
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
    // InternalMyDsl.g:293:1: rule__Qcm__Group__4__Impl : ( '{' ) ;
    public final void rule__Qcm__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:297:1: ( ( '{' ) )
            // InternalMyDsl.g:298:1: ( '{' )
            {
            // InternalMyDsl.g:298:1: ( '{' )
            // InternalMyDsl.g:299:2: '{'
            {
             before(grammarAccess.getQcmAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,12,FOLLOW_2); 
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
    // InternalMyDsl.g:308:1: rule__Qcm__Group__5 : rule__Qcm__Group__5__Impl rule__Qcm__Group__6 ;
    public final void rule__Qcm__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:312:1: ( rule__Qcm__Group__5__Impl rule__Qcm__Group__6 )
            // InternalMyDsl.g:313:2: rule__Qcm__Group__5__Impl rule__Qcm__Group__6
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
    // InternalMyDsl.g:320:1: rule__Qcm__Group__5__Impl : ( ( rule__Qcm__QuestionAssignment_5 ) ) ;
    public final void rule__Qcm__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:324:1: ( ( ( rule__Qcm__QuestionAssignment_5 ) ) )
            // InternalMyDsl.g:325:1: ( ( rule__Qcm__QuestionAssignment_5 ) )
            {
            // InternalMyDsl.g:325:1: ( ( rule__Qcm__QuestionAssignment_5 ) )
            // InternalMyDsl.g:326:2: ( rule__Qcm__QuestionAssignment_5 )
            {
             before(grammarAccess.getQcmAccess().getQuestionAssignment_5()); 
            // InternalMyDsl.g:327:2: ( rule__Qcm__QuestionAssignment_5 )
            // InternalMyDsl.g:327:3: rule__Qcm__QuestionAssignment_5
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
    // InternalMyDsl.g:335:1: rule__Qcm__Group__6 : rule__Qcm__Group__6__Impl rule__Qcm__Group__7 ;
    public final void rule__Qcm__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:339:1: ( rule__Qcm__Group__6__Impl rule__Qcm__Group__7 )
            // InternalMyDsl.g:340:2: rule__Qcm__Group__6__Impl rule__Qcm__Group__7
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
    // InternalMyDsl.g:347:1: rule__Qcm__Group__6__Impl : ( ( rule__Qcm__Group_6__0 )* ) ;
    public final void rule__Qcm__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:351:1: ( ( ( rule__Qcm__Group_6__0 )* ) )
            // InternalMyDsl.g:352:1: ( ( rule__Qcm__Group_6__0 )* )
            {
            // InternalMyDsl.g:352:1: ( ( rule__Qcm__Group_6__0 )* )
            // InternalMyDsl.g:353:2: ( rule__Qcm__Group_6__0 )*
            {
             before(grammarAccess.getQcmAccess().getGroup_6()); 
            // InternalMyDsl.g:354:2: ( rule__Qcm__Group_6__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:354:3: rule__Qcm__Group_6__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Qcm__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // InternalMyDsl.g:362:1: rule__Qcm__Group__7 : rule__Qcm__Group__7__Impl rule__Qcm__Group__8 ;
    public final void rule__Qcm__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:1: ( rule__Qcm__Group__7__Impl rule__Qcm__Group__8 )
            // InternalMyDsl.g:367:2: rule__Qcm__Group__7__Impl rule__Qcm__Group__8
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
    // InternalMyDsl.g:374:1: rule__Qcm__Group__7__Impl : ( '}' ) ;
    public final void rule__Qcm__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:378:1: ( ( '}' ) )
            // InternalMyDsl.g:379:1: ( '}' )
            {
            // InternalMyDsl.g:379:1: ( '}' )
            // InternalMyDsl.g:380:2: '}'
            {
             before(grammarAccess.getQcmAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_2); 
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
    // InternalMyDsl.g:389:1: rule__Qcm__Group__8 : rule__Qcm__Group__8__Impl ;
    public final void rule__Qcm__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:393:1: ( rule__Qcm__Group__8__Impl )
            // InternalMyDsl.g:394:2: rule__Qcm__Group__8__Impl
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
    // InternalMyDsl.g:400:1: rule__Qcm__Group__8__Impl : ( '}' ) ;
    public final void rule__Qcm__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:404:1: ( ( '}' ) )
            // InternalMyDsl.g:405:1: ( '}' )
            {
            // InternalMyDsl.g:405:1: ( '}' )
            // InternalMyDsl.g:406:2: '}'
            {
             before(grammarAccess.getQcmAccess().getRightCurlyBracketKeyword_8()); 
            match(input,14,FOLLOW_2); 
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
    // InternalMyDsl.g:416:1: rule__Qcm__Group_2__0 : rule__Qcm__Group_2__0__Impl rule__Qcm__Group_2__1 ;
    public final void rule__Qcm__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:420:1: ( rule__Qcm__Group_2__0__Impl rule__Qcm__Group_2__1 )
            // InternalMyDsl.g:421:2: rule__Qcm__Group_2__0__Impl rule__Qcm__Group_2__1
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
    // InternalMyDsl.g:428:1: rule__Qcm__Group_2__0__Impl : ( 'domaine' ) ;
    public final void rule__Qcm__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:432:1: ( ( 'domaine' ) )
            // InternalMyDsl.g:433:1: ( 'domaine' )
            {
            // InternalMyDsl.g:433:1: ( 'domaine' )
            // InternalMyDsl.g:434:2: 'domaine'
            {
             before(grammarAccess.getQcmAccess().getDomaineKeyword_2_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalMyDsl.g:443:1: rule__Qcm__Group_2__1 : rule__Qcm__Group_2__1__Impl ;
    public final void rule__Qcm__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:447:1: ( rule__Qcm__Group_2__1__Impl )
            // InternalMyDsl.g:448:2: rule__Qcm__Group_2__1__Impl
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
    // InternalMyDsl.g:454:1: rule__Qcm__Group_2__1__Impl : ( ( rule__Qcm__DomaineAssignment_2_1 ) ) ;
    public final void rule__Qcm__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:458:1: ( ( ( rule__Qcm__DomaineAssignment_2_1 ) ) )
            // InternalMyDsl.g:459:1: ( ( rule__Qcm__DomaineAssignment_2_1 ) )
            {
            // InternalMyDsl.g:459:1: ( ( rule__Qcm__DomaineAssignment_2_1 ) )
            // InternalMyDsl.g:460:2: ( rule__Qcm__DomaineAssignment_2_1 )
            {
             before(grammarAccess.getQcmAccess().getDomaineAssignment_2_1()); 
            // InternalMyDsl.g:461:2: ( rule__Qcm__DomaineAssignment_2_1 )
            // InternalMyDsl.g:461:3: rule__Qcm__DomaineAssignment_2_1
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
    // InternalMyDsl.g:470:1: rule__Qcm__Group_6__0 : rule__Qcm__Group_6__0__Impl rule__Qcm__Group_6__1 ;
    public final void rule__Qcm__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:474:1: ( rule__Qcm__Group_6__0__Impl rule__Qcm__Group_6__1 )
            // InternalMyDsl.g:475:2: rule__Qcm__Group_6__0__Impl rule__Qcm__Group_6__1
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
    // InternalMyDsl.g:482:1: rule__Qcm__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Qcm__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:486:1: ( ( ',' ) )
            // InternalMyDsl.g:487:1: ( ',' )
            {
            // InternalMyDsl.g:487:1: ( ',' )
            // InternalMyDsl.g:488:2: ','
            {
             before(grammarAccess.getQcmAccess().getCommaKeyword_6_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMyDsl.g:497:1: rule__Qcm__Group_6__1 : rule__Qcm__Group_6__1__Impl ;
    public final void rule__Qcm__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:501:1: ( rule__Qcm__Group_6__1__Impl )
            // InternalMyDsl.g:502:2: rule__Qcm__Group_6__1__Impl
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
    // InternalMyDsl.g:508:1: rule__Qcm__Group_6__1__Impl : ( ( rule__Qcm__QuestionAssignment_6_1 ) ) ;
    public final void rule__Qcm__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:512:1: ( ( ( rule__Qcm__QuestionAssignment_6_1 ) ) )
            // InternalMyDsl.g:513:1: ( ( rule__Qcm__QuestionAssignment_6_1 ) )
            {
            // InternalMyDsl.g:513:1: ( ( rule__Qcm__QuestionAssignment_6_1 ) )
            // InternalMyDsl.g:514:2: ( rule__Qcm__QuestionAssignment_6_1 )
            {
             before(grammarAccess.getQcmAccess().getQuestionAssignment_6_1()); 
            // InternalMyDsl.g:515:2: ( rule__Qcm__QuestionAssignment_6_1 )
            // InternalMyDsl.g:515:3: rule__Qcm__QuestionAssignment_6_1
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
    // InternalMyDsl.g:524:1: rule__Question__Group__0 : rule__Question__Group__0__Impl rule__Question__Group__1 ;
    public final void rule__Question__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:528:1: ( rule__Question__Group__0__Impl rule__Question__Group__1 )
            // InternalMyDsl.g:529:2: rule__Question__Group__0__Impl rule__Question__Group__1
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
    // InternalMyDsl.g:536:1: rule__Question__Group__0__Impl : ( 'Question' ) ;
    public final void rule__Question__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:540:1: ( ( 'Question' ) )
            // InternalMyDsl.g:541:1: ( 'Question' )
            {
            // InternalMyDsl.g:541:1: ( 'Question' )
            // InternalMyDsl.g:542:2: 'Question'
            {
             before(grammarAccess.getQuestionAccess().getQuestionKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyDsl.g:551:1: rule__Question__Group__1 : rule__Question__Group__1__Impl rule__Question__Group__2 ;
    public final void rule__Question__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:555:1: ( rule__Question__Group__1__Impl rule__Question__Group__2 )
            // InternalMyDsl.g:556:2: rule__Question__Group__1__Impl rule__Question__Group__2
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
    // InternalMyDsl.g:563:1: rule__Question__Group__1__Impl : ( '{' ) ;
    public final void rule__Question__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:567:1: ( ( '{' ) )
            // InternalMyDsl.g:568:1: ( '{' )
            {
            // InternalMyDsl.g:568:1: ( '{' )
            // InternalMyDsl.g:569:2: '{'
            {
             before(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalMyDsl.g:578:1: rule__Question__Group__2 : rule__Question__Group__2__Impl rule__Question__Group__3 ;
    public final void rule__Question__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:582:1: ( rule__Question__Group__2__Impl rule__Question__Group__3 )
            // InternalMyDsl.g:583:2: rule__Question__Group__2__Impl rule__Question__Group__3
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
    // InternalMyDsl.g:590:1: rule__Question__Group__2__Impl : ( ( rule__Question__Group_2__0 )? ) ;
    public final void rule__Question__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:594:1: ( ( ( rule__Question__Group_2__0 )? ) )
            // InternalMyDsl.g:595:1: ( ( rule__Question__Group_2__0 )? )
            {
            // InternalMyDsl.g:595:1: ( ( rule__Question__Group_2__0 )? )
            // InternalMyDsl.g:596:2: ( rule__Question__Group_2__0 )?
            {
             before(grammarAccess.getQuestionAccess().getGroup_2()); 
            // InternalMyDsl.g:597:2: ( rule__Question__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:597:3: rule__Question__Group_2__0
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
    // InternalMyDsl.g:605:1: rule__Question__Group__3 : rule__Question__Group__3__Impl rule__Question__Group__4 ;
    public final void rule__Question__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:609:1: ( rule__Question__Group__3__Impl rule__Question__Group__4 )
            // InternalMyDsl.g:610:2: rule__Question__Group__3__Impl rule__Question__Group__4
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
    // InternalMyDsl.g:617:1: rule__Question__Group__3__Impl : ( 'reponse' ) ;
    public final void rule__Question__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:621:1: ( ( 'reponse' ) )
            // InternalMyDsl.g:622:1: ( 'reponse' )
            {
            // InternalMyDsl.g:622:1: ( 'reponse' )
            // InternalMyDsl.g:623:2: 'reponse'
            {
             before(grammarAccess.getQuestionAccess().getReponseKeyword_3()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:632:1: rule__Question__Group__4 : rule__Question__Group__4__Impl rule__Question__Group__5 ;
    public final void rule__Question__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:636:1: ( rule__Question__Group__4__Impl rule__Question__Group__5 )
            // InternalMyDsl.g:637:2: rule__Question__Group__4__Impl rule__Question__Group__5
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
    // InternalMyDsl.g:644:1: rule__Question__Group__4__Impl : ( '{' ) ;
    public final void rule__Question__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:648:1: ( ( '{' ) )
            // InternalMyDsl.g:649:1: ( '{' )
            {
            // InternalMyDsl.g:649:1: ( '{' )
            // InternalMyDsl.g:650:2: '{'
            {
             before(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,12,FOLLOW_2); 
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
    // InternalMyDsl.g:659:1: rule__Question__Group__5 : rule__Question__Group__5__Impl rule__Question__Group__6 ;
    public final void rule__Question__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:663:1: ( rule__Question__Group__5__Impl rule__Question__Group__6 )
            // InternalMyDsl.g:664:2: rule__Question__Group__5__Impl rule__Question__Group__6
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
    // InternalMyDsl.g:671:1: rule__Question__Group__5__Impl : ( ( rule__Question__ReponseAssignment_5 ) ) ;
    public final void rule__Question__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:675:1: ( ( ( rule__Question__ReponseAssignment_5 ) ) )
            // InternalMyDsl.g:676:1: ( ( rule__Question__ReponseAssignment_5 ) )
            {
            // InternalMyDsl.g:676:1: ( ( rule__Question__ReponseAssignment_5 ) )
            // InternalMyDsl.g:677:2: ( rule__Question__ReponseAssignment_5 )
            {
             before(grammarAccess.getQuestionAccess().getReponseAssignment_5()); 
            // InternalMyDsl.g:678:2: ( rule__Question__ReponseAssignment_5 )
            // InternalMyDsl.g:678:3: rule__Question__ReponseAssignment_5
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
    // InternalMyDsl.g:686:1: rule__Question__Group__6 : rule__Question__Group__6__Impl rule__Question__Group__7 ;
    public final void rule__Question__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:690:1: ( rule__Question__Group__6__Impl rule__Question__Group__7 )
            // InternalMyDsl.g:691:2: rule__Question__Group__6__Impl rule__Question__Group__7
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
    // InternalMyDsl.g:698:1: rule__Question__Group__6__Impl : ( ( rule__Question__Group_6__0 )* ) ;
    public final void rule__Question__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:702:1: ( ( ( rule__Question__Group_6__0 )* ) )
            // InternalMyDsl.g:703:1: ( ( rule__Question__Group_6__0 )* )
            {
            // InternalMyDsl.g:703:1: ( ( rule__Question__Group_6__0 )* )
            // InternalMyDsl.g:704:2: ( rule__Question__Group_6__0 )*
            {
             before(grammarAccess.getQuestionAccess().getGroup_6()); 
            // InternalMyDsl.g:705:2: ( rule__Question__Group_6__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:705:3: rule__Question__Group_6__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Question__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalMyDsl.g:713:1: rule__Question__Group__7 : rule__Question__Group__7__Impl rule__Question__Group__8 ;
    public final void rule__Question__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:717:1: ( rule__Question__Group__7__Impl rule__Question__Group__8 )
            // InternalMyDsl.g:718:2: rule__Question__Group__7__Impl rule__Question__Group__8
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
    // InternalMyDsl.g:725:1: rule__Question__Group__7__Impl : ( '}' ) ;
    public final void rule__Question__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:729:1: ( ( '}' ) )
            // InternalMyDsl.g:730:1: ( '}' )
            {
            // InternalMyDsl.g:730:1: ( '}' )
            // InternalMyDsl.g:731:2: '}'
            {
             before(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_2); 
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
    // InternalMyDsl.g:740:1: rule__Question__Group__8 : rule__Question__Group__8__Impl ;
    public final void rule__Question__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:744:1: ( rule__Question__Group__8__Impl )
            // InternalMyDsl.g:745:2: rule__Question__Group__8__Impl
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
    // InternalMyDsl.g:751:1: rule__Question__Group__8__Impl : ( '}' ) ;
    public final void rule__Question__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:755:1: ( ( '}' ) )
            // InternalMyDsl.g:756:1: ( '}' )
            {
            // InternalMyDsl.g:756:1: ( '}' )
            // InternalMyDsl.g:757:2: '}'
            {
             before(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_8()); 
            match(input,14,FOLLOW_2); 
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
    // InternalMyDsl.g:767:1: rule__Question__Group_2__0 : rule__Question__Group_2__0__Impl rule__Question__Group_2__1 ;
    public final void rule__Question__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:771:1: ( rule__Question__Group_2__0__Impl rule__Question__Group_2__1 )
            // InternalMyDsl.g:772:2: rule__Question__Group_2__0__Impl rule__Question__Group_2__1
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
    // InternalMyDsl.g:779:1: rule__Question__Group_2__0__Impl : ( 'intitule' ) ;
    public final void rule__Question__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:783:1: ( ( 'intitule' ) )
            // InternalMyDsl.g:784:1: ( 'intitule' )
            {
            // InternalMyDsl.g:784:1: ( 'intitule' )
            // InternalMyDsl.g:785:2: 'intitule'
            {
             before(grammarAccess.getQuestionAccess().getIntituleKeyword_2_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:794:1: rule__Question__Group_2__1 : rule__Question__Group_2__1__Impl ;
    public final void rule__Question__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:798:1: ( rule__Question__Group_2__1__Impl )
            // InternalMyDsl.g:799:2: rule__Question__Group_2__1__Impl
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
    // InternalMyDsl.g:805:1: rule__Question__Group_2__1__Impl : ( ( rule__Question__IntituleAssignment_2_1 ) ) ;
    public final void rule__Question__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:809:1: ( ( ( rule__Question__IntituleAssignment_2_1 ) ) )
            // InternalMyDsl.g:810:1: ( ( rule__Question__IntituleAssignment_2_1 ) )
            {
            // InternalMyDsl.g:810:1: ( ( rule__Question__IntituleAssignment_2_1 ) )
            // InternalMyDsl.g:811:2: ( rule__Question__IntituleAssignment_2_1 )
            {
             before(grammarAccess.getQuestionAccess().getIntituleAssignment_2_1()); 
            // InternalMyDsl.g:812:2: ( rule__Question__IntituleAssignment_2_1 )
            // InternalMyDsl.g:812:3: rule__Question__IntituleAssignment_2_1
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
    // InternalMyDsl.g:821:1: rule__Question__Group_6__0 : rule__Question__Group_6__0__Impl rule__Question__Group_6__1 ;
    public final void rule__Question__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:825:1: ( rule__Question__Group_6__0__Impl rule__Question__Group_6__1 )
            // InternalMyDsl.g:826:2: rule__Question__Group_6__0__Impl rule__Question__Group_6__1
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
    // InternalMyDsl.g:833:1: rule__Question__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Question__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:837:1: ( ( ',' ) )
            // InternalMyDsl.g:838:1: ( ',' )
            {
            // InternalMyDsl.g:838:1: ( ',' )
            // InternalMyDsl.g:839:2: ','
            {
             before(grammarAccess.getQuestionAccess().getCommaKeyword_6_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMyDsl.g:848:1: rule__Question__Group_6__1 : rule__Question__Group_6__1__Impl ;
    public final void rule__Question__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:852:1: ( rule__Question__Group_6__1__Impl )
            // InternalMyDsl.g:853:2: rule__Question__Group_6__1__Impl
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
    // InternalMyDsl.g:859:1: rule__Question__Group_6__1__Impl : ( ( rule__Question__ReponseAssignment_6_1 ) ) ;
    public final void rule__Question__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:863:1: ( ( ( rule__Question__ReponseAssignment_6_1 ) ) )
            // InternalMyDsl.g:864:1: ( ( rule__Question__ReponseAssignment_6_1 ) )
            {
            // InternalMyDsl.g:864:1: ( ( rule__Question__ReponseAssignment_6_1 ) )
            // InternalMyDsl.g:865:2: ( rule__Question__ReponseAssignment_6_1 )
            {
             before(grammarAccess.getQuestionAccess().getReponseAssignment_6_1()); 
            // InternalMyDsl.g:866:2: ( rule__Question__ReponseAssignment_6_1 )
            // InternalMyDsl.g:866:3: rule__Question__ReponseAssignment_6_1
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
    // InternalMyDsl.g:875:1: rule__Reponse__Group__0 : rule__Reponse__Group__0__Impl rule__Reponse__Group__1 ;
    public final void rule__Reponse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:879:1: ( rule__Reponse__Group__0__Impl rule__Reponse__Group__1 )
            // InternalMyDsl.g:880:2: rule__Reponse__Group__0__Impl rule__Reponse__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:887:1: rule__Reponse__Group__0__Impl : ( () ) ;
    public final void rule__Reponse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:891:1: ( ( () ) )
            // InternalMyDsl.g:892:1: ( () )
            {
            // InternalMyDsl.g:892:1: ( () )
            // InternalMyDsl.g:893:2: ()
            {
             before(grammarAccess.getReponseAccess().getReponseAction_0()); 
            // InternalMyDsl.g:894:2: ()
            // InternalMyDsl.g:894:3: 
            {
            }

             after(grammarAccess.getReponseAccess().getReponseAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reponse__Group__0__Impl"


    // $ANTLR start "rule__Reponse__Group__1"
    // InternalMyDsl.g:902:1: rule__Reponse__Group__1 : rule__Reponse__Group__1__Impl rule__Reponse__Group__2 ;
    public final void rule__Reponse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:906:1: ( rule__Reponse__Group__1__Impl rule__Reponse__Group__2 )
            // InternalMyDsl.g:907:2: rule__Reponse__Group__1__Impl rule__Reponse__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:914:1: rule__Reponse__Group__1__Impl : ( ( rule__Reponse__ValueAssignment_1 )? ) ;
    public final void rule__Reponse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:918:1: ( ( ( rule__Reponse__ValueAssignment_1 )? ) )
            // InternalMyDsl.g:919:1: ( ( rule__Reponse__ValueAssignment_1 )? )
            {
            // InternalMyDsl.g:919:1: ( ( rule__Reponse__ValueAssignment_1 )? )
            // InternalMyDsl.g:920:2: ( rule__Reponse__ValueAssignment_1 )?
            {
             before(grammarAccess.getReponseAccess().getValueAssignment_1()); 
            // InternalMyDsl.g:921:2: ( rule__Reponse__ValueAssignment_1 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:921:3: rule__Reponse__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reponse__ValueAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReponseAccess().getValueAssignment_1()); 

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
    // InternalMyDsl.g:929:1: rule__Reponse__Group__2 : rule__Reponse__Group__2__Impl rule__Reponse__Group__3 ;
    public final void rule__Reponse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:933:1: ( rule__Reponse__Group__2__Impl rule__Reponse__Group__3 )
            // InternalMyDsl.g:934:2: rule__Reponse__Group__2__Impl rule__Reponse__Group__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:941:1: rule__Reponse__Group__2__Impl : ( 'Reponse' ) ;
    public final void rule__Reponse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:945:1: ( ( 'Reponse' ) )
            // InternalMyDsl.g:946:1: ( 'Reponse' )
            {
            // InternalMyDsl.g:946:1: ( 'Reponse' )
            // InternalMyDsl.g:947:2: 'Reponse'
            {
             before(grammarAccess.getReponseAccess().getReponseKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getReponseAccess().getReponseKeyword_2()); 

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
    // InternalMyDsl.g:956:1: rule__Reponse__Group__3 : rule__Reponse__Group__3__Impl rule__Reponse__Group__4 ;
    public final void rule__Reponse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:960:1: ( rule__Reponse__Group__3__Impl rule__Reponse__Group__4 )
            // InternalMyDsl.g:961:2: rule__Reponse__Group__3__Impl rule__Reponse__Group__4
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
    // InternalMyDsl.g:968:1: rule__Reponse__Group__3__Impl : ( '{' ) ;
    public final void rule__Reponse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:972:1: ( ( '{' ) )
            // InternalMyDsl.g:973:1: ( '{' )
            {
            // InternalMyDsl.g:973:1: ( '{' )
            // InternalMyDsl.g:974:2: '{'
            {
             before(grammarAccess.getReponseAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getReponseAccess().getLeftCurlyBracketKeyword_3()); 

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
    // InternalMyDsl.g:983:1: rule__Reponse__Group__4 : rule__Reponse__Group__4__Impl rule__Reponse__Group__5 ;
    public final void rule__Reponse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:987:1: ( rule__Reponse__Group__4__Impl rule__Reponse__Group__5 )
            // InternalMyDsl.g:988:2: rule__Reponse__Group__4__Impl rule__Reponse__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Reponse__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reponse__Group__5();

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
    // InternalMyDsl.g:995:1: rule__Reponse__Group__4__Impl : ( ( rule__Reponse__Group_4__0 )? ) ;
    public final void rule__Reponse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:999:1: ( ( ( rule__Reponse__Group_4__0 )? ) )
            // InternalMyDsl.g:1000:1: ( ( rule__Reponse__Group_4__0 )? )
            {
            // InternalMyDsl.g:1000:1: ( ( rule__Reponse__Group_4__0 )? )
            // InternalMyDsl.g:1001:2: ( rule__Reponse__Group_4__0 )?
            {
             before(grammarAccess.getReponseAccess().getGroup_4()); 
            // InternalMyDsl.g:1002:2: ( rule__Reponse__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:1002:3: rule__Reponse__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reponse__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReponseAccess().getGroup_4()); 

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


    // $ANTLR start "rule__Reponse__Group__5"
    // InternalMyDsl.g:1010:1: rule__Reponse__Group__5 : rule__Reponse__Group__5__Impl ;
    public final void rule__Reponse__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1014:1: ( rule__Reponse__Group__5__Impl )
            // InternalMyDsl.g:1015:2: rule__Reponse__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reponse__Group__5__Impl();

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
    // $ANTLR end "rule__Reponse__Group__5"


    // $ANTLR start "rule__Reponse__Group__5__Impl"
    // InternalMyDsl.g:1021:1: rule__Reponse__Group__5__Impl : ( '}' ) ;
    public final void rule__Reponse__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1025:1: ( ( '}' ) )
            // InternalMyDsl.g:1026:1: ( '}' )
            {
            // InternalMyDsl.g:1026:1: ( '}' )
            // InternalMyDsl.g:1027:2: '}'
            {
             before(grammarAccess.getReponseAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getReponseAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Reponse__Group__5__Impl"


    // $ANTLR start "rule__Reponse__Group_4__0"
    // InternalMyDsl.g:1037:1: rule__Reponse__Group_4__0 : rule__Reponse__Group_4__0__Impl rule__Reponse__Group_4__1 ;
    public final void rule__Reponse__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1041:1: ( rule__Reponse__Group_4__0__Impl rule__Reponse__Group_4__1 )
            // InternalMyDsl.g:1042:2: rule__Reponse__Group_4__0__Impl rule__Reponse__Group_4__1
            {
            pushFollow(FOLLOW_9);
            rule__Reponse__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reponse__Group_4__1();

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
    // $ANTLR end "rule__Reponse__Group_4__0"


    // $ANTLR start "rule__Reponse__Group_4__0__Impl"
    // InternalMyDsl.g:1049:1: rule__Reponse__Group_4__0__Impl : ( 'data' ) ;
    public final void rule__Reponse__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1053:1: ( ( 'data' ) )
            // InternalMyDsl.g:1054:1: ( 'data' )
            {
            // InternalMyDsl.g:1054:1: ( 'data' )
            // InternalMyDsl.g:1055:2: 'data'
            {
             before(grammarAccess.getReponseAccess().getDataKeyword_4_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getReponseAccess().getDataKeyword_4_0()); 

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
    // $ANTLR end "rule__Reponse__Group_4__0__Impl"


    // $ANTLR start "rule__Reponse__Group_4__1"
    // InternalMyDsl.g:1064:1: rule__Reponse__Group_4__1 : rule__Reponse__Group_4__1__Impl ;
    public final void rule__Reponse__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1068:1: ( rule__Reponse__Group_4__1__Impl )
            // InternalMyDsl.g:1069:2: rule__Reponse__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reponse__Group_4__1__Impl();

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
    // $ANTLR end "rule__Reponse__Group_4__1"


    // $ANTLR start "rule__Reponse__Group_4__1__Impl"
    // InternalMyDsl.g:1075:1: rule__Reponse__Group_4__1__Impl : ( ( rule__Reponse__DataAssignment_4_1 ) ) ;
    public final void rule__Reponse__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1079:1: ( ( ( rule__Reponse__DataAssignment_4_1 ) ) )
            // InternalMyDsl.g:1080:1: ( ( rule__Reponse__DataAssignment_4_1 ) )
            {
            // InternalMyDsl.g:1080:1: ( ( rule__Reponse__DataAssignment_4_1 ) )
            // InternalMyDsl.g:1081:2: ( rule__Reponse__DataAssignment_4_1 )
            {
             before(grammarAccess.getReponseAccess().getDataAssignment_4_1()); 
            // InternalMyDsl.g:1082:2: ( rule__Reponse__DataAssignment_4_1 )
            // InternalMyDsl.g:1082:3: rule__Reponse__DataAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Reponse__DataAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getReponseAccess().getDataAssignment_4_1()); 

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
    // $ANTLR end "rule__Reponse__Group_4__1__Impl"


    // $ANTLR start "rule__Qcm__DomaineAssignment_2_1"
    // InternalMyDsl.g:1091:1: rule__Qcm__DomaineAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Qcm__DomaineAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1095:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1096:2: ( ruleEString )
            {
            // InternalMyDsl.g:1096:2: ( ruleEString )
            // InternalMyDsl.g:1097:3: ruleEString
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
    // InternalMyDsl.g:1106:1: rule__Qcm__QuestionAssignment_5 : ( ruleQuestion ) ;
    public final void rule__Qcm__QuestionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1110:1: ( ( ruleQuestion ) )
            // InternalMyDsl.g:1111:2: ( ruleQuestion )
            {
            // InternalMyDsl.g:1111:2: ( ruleQuestion )
            // InternalMyDsl.g:1112:3: ruleQuestion
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
    // InternalMyDsl.g:1121:1: rule__Qcm__QuestionAssignment_6_1 : ( ruleQuestion ) ;
    public final void rule__Qcm__QuestionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1125:1: ( ( ruleQuestion ) )
            // InternalMyDsl.g:1126:2: ( ruleQuestion )
            {
            // InternalMyDsl.g:1126:2: ( ruleQuestion )
            // InternalMyDsl.g:1127:3: ruleQuestion
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
    // InternalMyDsl.g:1136:1: rule__Question__IntituleAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Question__IntituleAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1140:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1141:2: ( ruleEString )
            {
            // InternalMyDsl.g:1141:2: ( ruleEString )
            // InternalMyDsl.g:1142:3: ruleEString
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
    // InternalMyDsl.g:1151:1: rule__Question__ReponseAssignment_5 : ( ruleReponse ) ;
    public final void rule__Question__ReponseAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1155:1: ( ( ruleReponse ) )
            // InternalMyDsl.g:1156:2: ( ruleReponse )
            {
            // InternalMyDsl.g:1156:2: ( ruleReponse )
            // InternalMyDsl.g:1157:3: ruleReponse
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
    // InternalMyDsl.g:1166:1: rule__Question__ReponseAssignment_6_1 : ( ruleReponse ) ;
    public final void rule__Question__ReponseAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1170:1: ( ( ruleReponse ) )
            // InternalMyDsl.g:1171:2: ( ruleReponse )
            {
            // InternalMyDsl.g:1171:2: ( ruleReponse )
            // InternalMyDsl.g:1172:3: ruleReponse
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


    // $ANTLR start "rule__Reponse__ValueAssignment_1"
    // InternalMyDsl.g:1181:1: rule__Reponse__ValueAssignment_1 : ( ( 'value' ) ) ;
    public final void rule__Reponse__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1185:1: ( ( ( 'value' ) ) )
            // InternalMyDsl.g:1186:2: ( ( 'value' ) )
            {
            // InternalMyDsl.g:1186:2: ( ( 'value' ) )
            // InternalMyDsl.g:1187:3: ( 'value' )
            {
             before(grammarAccess.getReponseAccess().getValueValueKeyword_1_0()); 
            // InternalMyDsl.g:1188:3: ( 'value' )
            // InternalMyDsl.g:1189:4: 'value'
            {
             before(grammarAccess.getReponseAccess().getValueValueKeyword_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getReponseAccess().getValueValueKeyword_1_0()); 

            }

             after(grammarAccess.getReponseAccess().getValueValueKeyword_1_0()); 

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
    // $ANTLR end "rule__Reponse__ValueAssignment_1"


    // $ANTLR start "rule__Reponse__DataAssignment_4_1"
    // InternalMyDsl.g:1200:1: rule__Reponse__DataAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Reponse__DataAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1204:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1205:2: ( ruleEString )
            {
            // InternalMyDsl.g:1205:2: ( ruleEString )
            // InternalMyDsl.g:1206:3: ruleEString
            {
             before(grammarAccess.getReponseAccess().getDataEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReponseAccess().getDataEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Reponse__DataAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000204000L});

}
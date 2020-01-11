package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Qcm'", "'{'", "'domaine'", "'question'", "','", "'}'", "'Question'", "'intitule'", "'reponse'", "'value'", "'Reponse'", "'data'"
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Qcm";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleQcm"
    // InternalMyDsl.g:64:1: entryRuleQcm returns [EObject current=null] : iv_ruleQcm= ruleQcm EOF ;
    public final EObject entryRuleQcm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQcm = null;


        try {
            // InternalMyDsl.g:64:44: (iv_ruleQcm= ruleQcm EOF )
            // InternalMyDsl.g:65:2: iv_ruleQcm= ruleQcm EOF
            {
             newCompositeNode(grammarAccess.getQcmRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQcm=ruleQcm();

            state._fsp--;

             current =iv_ruleQcm; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQcm"


    // $ANTLR start "ruleQcm"
    // InternalMyDsl.g:71:1: ruleQcm returns [EObject current=null] : (otherlv_0= 'Qcm' otherlv_1= '{' (otherlv_2= 'domaine' ( (lv_domaine_3_0= ruleEString ) ) )? otherlv_4= 'question' otherlv_5= '{' ( (lv_question_6_0= ruleQuestion ) ) (otherlv_7= ',' ( (lv_question_8_0= ruleQuestion ) ) )* otherlv_9= '}' otherlv_10= '}' ) ;
    public final EObject ruleQcm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_domaine_3_0 = null;

        EObject lv_question_6_0 = null;

        EObject lv_question_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'Qcm' otherlv_1= '{' (otherlv_2= 'domaine' ( (lv_domaine_3_0= ruleEString ) ) )? otherlv_4= 'question' otherlv_5= '{' ( (lv_question_6_0= ruleQuestion ) ) (otherlv_7= ',' ( (lv_question_8_0= ruleQuestion ) ) )* otherlv_9= '}' otherlv_10= '}' ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'Qcm' otherlv_1= '{' (otherlv_2= 'domaine' ( (lv_domaine_3_0= ruleEString ) ) )? otherlv_4= 'question' otherlv_5= '{' ( (lv_question_6_0= ruleQuestion ) ) (otherlv_7= ',' ( (lv_question_8_0= ruleQuestion ) ) )* otherlv_9= '}' otherlv_10= '}' )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'Qcm' otherlv_1= '{' (otherlv_2= 'domaine' ( (lv_domaine_3_0= ruleEString ) ) )? otherlv_4= 'question' otherlv_5= '{' ( (lv_question_6_0= ruleQuestion ) ) (otherlv_7= ',' ( (lv_question_8_0= ruleQuestion ) ) )* otherlv_9= '}' otherlv_10= '}' )
            // InternalMyDsl.g:79:3: otherlv_0= 'Qcm' otherlv_1= '{' (otherlv_2= 'domaine' ( (lv_domaine_3_0= ruleEString ) ) )? otherlv_4= 'question' otherlv_5= '{' ( (lv_question_6_0= ruleQuestion ) ) (otherlv_7= ',' ( (lv_question_8_0= ruleQuestion ) ) )* otherlv_9= '}' otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getQcmAccess().getQcmKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getQcmAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:87:3: (otherlv_2= 'domaine' ( (lv_domaine_3_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:88:4: otherlv_2= 'domaine' ( (lv_domaine_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getQcmAccess().getDomaineKeyword_2_0());
                    			
                    // InternalMyDsl.g:92:4: ( (lv_domaine_3_0= ruleEString ) )
                    // InternalMyDsl.g:93:5: (lv_domaine_3_0= ruleEString )
                    {
                    // InternalMyDsl.g:93:5: (lv_domaine_3_0= ruleEString )
                    // InternalMyDsl.g:94:6: lv_domaine_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getQcmAccess().getDomaineEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_domaine_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQcmRule());
                    						}
                    						set(
                    							current,
                    							"domaine",
                    							lv_domaine_3_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getQcmAccess().getQuestionKeyword_3());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getQcmAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMyDsl.g:120:3: ( (lv_question_6_0= ruleQuestion ) )
            // InternalMyDsl.g:121:4: (lv_question_6_0= ruleQuestion )
            {
            // InternalMyDsl.g:121:4: (lv_question_6_0= ruleQuestion )
            // InternalMyDsl.g:122:5: lv_question_6_0= ruleQuestion
            {

            					newCompositeNode(grammarAccess.getQcmAccess().getQuestionQuestionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_question_6_0=ruleQuestion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQcmRule());
            					}
            					add(
            						current,
            						"question",
            						lv_question_6_0,
            						"org.xtext.example.mydsl.MyDsl.Question");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:139:3: (otherlv_7= ',' ( (lv_question_8_0= ruleQuestion ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:140:4: otherlv_7= ',' ( (lv_question_8_0= ruleQuestion ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_7); 

            	    				newLeafNode(otherlv_7, grammarAccess.getQcmAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalMyDsl.g:144:4: ( (lv_question_8_0= ruleQuestion ) )
            	    // InternalMyDsl.g:145:5: (lv_question_8_0= ruleQuestion )
            	    {
            	    // InternalMyDsl.g:145:5: (lv_question_8_0= ruleQuestion )
            	    // InternalMyDsl.g:146:6: lv_question_8_0= ruleQuestion
            	    {

            	    						newCompositeNode(grammarAccess.getQcmAccess().getQuestionQuestionParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_question_8_0=ruleQuestion();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getQcmRule());
            	    						}
            	    						add(
            	    							current,
            	    							"question",
            	    							lv_question_8_0,
            	    							"org.xtext.example.mydsl.MyDsl.Question");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_9=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_9, grammarAccess.getQcmAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getQcmAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleQcm"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:176:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:176:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:177:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:183:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:189:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:190:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:190:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:191:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:199:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleQuestion"
    // InternalMyDsl.g:210:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // InternalMyDsl.g:210:49: (iv_ruleQuestion= ruleQuestion EOF )
            // InternalMyDsl.g:211:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // InternalMyDsl.g:217:1: ruleQuestion returns [EObject current=null] : (otherlv_0= 'Question' otherlv_1= '{' (otherlv_2= 'intitule' ( (lv_intitule_3_0= ruleEString ) ) )? otherlv_4= 'reponse' otherlv_5= '{' ( (lv_reponse_6_0= ruleReponse ) ) (otherlv_7= ',' ( (lv_reponse_8_0= ruleReponse ) ) )* otherlv_9= '}' otherlv_10= '}' ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_intitule_3_0 = null;

        EObject lv_reponse_6_0 = null;

        EObject lv_reponse_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:223:2: ( (otherlv_0= 'Question' otherlv_1= '{' (otherlv_2= 'intitule' ( (lv_intitule_3_0= ruleEString ) ) )? otherlv_4= 'reponse' otherlv_5= '{' ( (lv_reponse_6_0= ruleReponse ) ) (otherlv_7= ',' ( (lv_reponse_8_0= ruleReponse ) ) )* otherlv_9= '}' otherlv_10= '}' ) )
            // InternalMyDsl.g:224:2: (otherlv_0= 'Question' otherlv_1= '{' (otherlv_2= 'intitule' ( (lv_intitule_3_0= ruleEString ) ) )? otherlv_4= 'reponse' otherlv_5= '{' ( (lv_reponse_6_0= ruleReponse ) ) (otherlv_7= ',' ( (lv_reponse_8_0= ruleReponse ) ) )* otherlv_9= '}' otherlv_10= '}' )
            {
            // InternalMyDsl.g:224:2: (otherlv_0= 'Question' otherlv_1= '{' (otherlv_2= 'intitule' ( (lv_intitule_3_0= ruleEString ) ) )? otherlv_4= 'reponse' otherlv_5= '{' ( (lv_reponse_6_0= ruleReponse ) ) (otherlv_7= ',' ( (lv_reponse_8_0= ruleReponse ) ) )* otherlv_9= '}' otherlv_10= '}' )
            // InternalMyDsl.g:225:3: otherlv_0= 'Question' otherlv_1= '{' (otherlv_2= 'intitule' ( (lv_intitule_3_0= ruleEString ) ) )? otherlv_4= 'reponse' otherlv_5= '{' ( (lv_reponse_6_0= ruleReponse ) ) (otherlv_7= ',' ( (lv_reponse_8_0= ruleReponse ) ) )* otherlv_9= '}' otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getQuestionAccess().getQuestionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:233:3: (otherlv_2= 'intitule' ( (lv_intitule_3_0= ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:234:4: otherlv_2= 'intitule' ( (lv_intitule_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getQuestionAccess().getIntituleKeyword_2_0());
                    			
                    // InternalMyDsl.g:238:4: ( (lv_intitule_3_0= ruleEString ) )
                    // InternalMyDsl.g:239:5: (lv_intitule_3_0= ruleEString )
                    {
                    // InternalMyDsl.g:239:5: (lv_intitule_3_0= ruleEString )
                    // InternalMyDsl.g:240:6: lv_intitule_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getQuestionAccess().getIntituleEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_intitule_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQuestionRule());
                    						}
                    						set(
                    							current,
                    							"intitule",
                    							lv_intitule_3_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getQuestionAccess().getReponseKeyword_3());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMyDsl.g:266:3: ( (lv_reponse_6_0= ruleReponse ) )
            // InternalMyDsl.g:267:4: (lv_reponse_6_0= ruleReponse )
            {
            // InternalMyDsl.g:267:4: (lv_reponse_6_0= ruleReponse )
            // InternalMyDsl.g:268:5: lv_reponse_6_0= ruleReponse
            {

            					newCompositeNode(grammarAccess.getQuestionAccess().getReponseReponseParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_reponse_6_0=ruleReponse();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuestionRule());
            					}
            					add(
            						current,
            						"reponse",
            						lv_reponse_6_0,
            						"org.xtext.example.mydsl.MyDsl.Reponse");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:285:3: (otherlv_7= ',' ( (lv_reponse_8_0= ruleReponse ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:286:4: otherlv_7= ',' ( (lv_reponse_8_0= ruleReponse ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_12); 

            	    				newLeafNode(otherlv_7, grammarAccess.getQuestionAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalMyDsl.g:290:4: ( (lv_reponse_8_0= ruleReponse ) )
            	    // InternalMyDsl.g:291:5: (lv_reponse_8_0= ruleReponse )
            	    {
            	    // InternalMyDsl.g:291:5: (lv_reponse_8_0= ruleReponse )
            	    // InternalMyDsl.g:292:6: lv_reponse_8_0= ruleReponse
            	    {

            	    						newCompositeNode(grammarAccess.getQuestionAccess().getReponseReponseParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_reponse_8_0=ruleReponse();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getQuestionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"reponse",
            	    							lv_reponse_8_0,
            	    							"org.xtext.example.mydsl.MyDsl.Reponse");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_9=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_9, grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleReponse"
    // InternalMyDsl.g:322:1: entryRuleReponse returns [EObject current=null] : iv_ruleReponse= ruleReponse EOF ;
    public final EObject entryRuleReponse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReponse = null;


        try {
            // InternalMyDsl.g:322:48: (iv_ruleReponse= ruleReponse EOF )
            // InternalMyDsl.g:323:2: iv_ruleReponse= ruleReponse EOF
            {
             newCompositeNode(grammarAccess.getReponseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReponse=ruleReponse();

            state._fsp--;

             current =iv_ruleReponse; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleReponse"


    // $ANTLR start "ruleReponse"
    // InternalMyDsl.g:329:1: ruleReponse returns [EObject current=null] : ( () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'Reponse' otherlv_3= '{' (otherlv_4= 'data' ( (lv_data_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleReponse() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_data_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:335:2: ( ( () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'Reponse' otherlv_3= '{' (otherlv_4= 'data' ( (lv_data_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalMyDsl.g:336:2: ( () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'Reponse' otherlv_3= '{' (otherlv_4= 'data' ( (lv_data_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalMyDsl.g:336:2: ( () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'Reponse' otherlv_3= '{' (otherlv_4= 'data' ( (lv_data_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalMyDsl.g:337:3: () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'Reponse' otherlv_3= '{' (otherlv_4= 'data' ( (lv_data_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalMyDsl.g:337:3: ()
            // InternalMyDsl.g:338:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReponseAccess().getReponseAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:344:3: ( (lv_value_1_0= 'value' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:345:4: (lv_value_1_0= 'value' )
                    {
                    // InternalMyDsl.g:345:4: (lv_value_1_0= 'value' )
                    // InternalMyDsl.g:346:5: lv_value_1_0= 'value'
                    {
                    lv_value_1_0=(Token)match(input,20,FOLLOW_13); 

                    					newLeafNode(lv_value_1_0, grammarAccess.getReponseAccess().getValueValueKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getReponseRule());
                    					}
                    					setWithLastConsumed(current, "value", true, "value");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getReponseAccess().getReponseKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getReponseAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:366:3: (otherlv_4= 'data' ( (lv_data_5_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:367:4: otherlv_4= 'data' ( (lv_data_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getReponseAccess().getDataKeyword_4_0());
                    			
                    // InternalMyDsl.g:371:4: ( (lv_data_5_0= ruleEString ) )
                    // InternalMyDsl.g:372:5: (lv_data_5_0= ruleEString )
                    {
                    // InternalMyDsl.g:372:5: (lv_data_5_0= ruleEString )
                    // InternalMyDsl.g:373:6: lv_data_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getReponseAccess().getDataEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_data_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReponseRule());
                    						}
                    						set(
                    							current,
                    							"data",
                    							lv_data_5_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getReponseAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleReponse"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000410000L});

}
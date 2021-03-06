/*
 * generated by Xtext 2.19.0
 */
package xtext.insa.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class QcmGrammarAccess extends AbstractGrammarElementFinder {
	
	public class QcmElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "xtext.insa.Qcm.Qcm");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cQcmKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cDomaineKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cDomaineAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cDomaineEStringParserRuleCall_2_1_0 = (RuleCall)cDomaineAssignment_2_1.eContents().get(0);
		private final Keyword cQuestionKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cQuestionAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cQuestionQuestionParserRuleCall_5_0 = (RuleCall)cQuestionAssignment_5.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cCommaKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cQuestionAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cQuestionQuestionParserRuleCall_6_1_0 = (RuleCall)cQuestionAssignment_6_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//Qcm:
		//	'Qcm'
		//	'{' ('domaine' domaine=EString)?
		//	'question' '{' question+=Question ("," question+=Question)* '}'
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Qcm' '{' ('domaine' domaine=EString)? 'question' '{' question+=Question ("," question+=Question)* '}' '}'
		public Group getGroup() { return cGroup; }
		
		//'Qcm'
		public Keyword getQcmKeyword_0() { return cQcmKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//('domaine' domaine=EString)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'domaine'
		public Keyword getDomaineKeyword_2_0() { return cDomaineKeyword_2_0; }
		
		//domaine=EString
		public Assignment getDomaineAssignment_2_1() { return cDomaineAssignment_2_1; }
		
		//EString
		public RuleCall getDomaineEStringParserRuleCall_2_1_0() { return cDomaineEStringParserRuleCall_2_1_0; }
		
		//'question'
		public Keyword getQuestionKeyword_3() { return cQuestionKeyword_3; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }
		
		//question+=Question
		public Assignment getQuestionAssignment_5() { return cQuestionAssignment_5; }
		
		//Question
		public RuleCall getQuestionQuestionParserRuleCall_5_0() { return cQuestionQuestionParserRuleCall_5_0; }
		
		//("," question+=Question)*
		public Group getGroup_6() { return cGroup_6; }
		
		//","
		public Keyword getCommaKeyword_6_0() { return cCommaKeyword_6_0; }
		
		//question+=Question
		public Assignment getQuestionAssignment_6_1() { return cQuestionAssignment_6_1; }
		
		//Question
		public RuleCall getQuestionQuestionParserRuleCall_6_1_0() { return cQuestionQuestionParserRuleCall_6_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "xtext.insa.Qcm.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString:
		//	STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class QuestionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "xtext.insa.Qcm.Question");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cQuestionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cIntituleKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cIntituleAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cIntituleEStringParserRuleCall_2_1_0 = (RuleCall)cIntituleAssignment_2_1.eContents().get(0);
		private final Keyword cReponseKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cReponseAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cReponseReponseParserRuleCall_5_0 = (RuleCall)cReponseAssignment_5.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cCommaKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cReponseAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cReponseReponseParserRuleCall_6_1_0 = (RuleCall)cReponseAssignment_6_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//Question:
		//	'Question'
		//	'{' ('intitule' intitule=EString)?
		//	'reponse' '{' reponse+=Reponse ("," reponse+=Reponse)* '}'
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Question' '{' ('intitule' intitule=EString)? 'reponse' '{' reponse+=Reponse ("," reponse+=Reponse)* '}' '}'
		public Group getGroup() { return cGroup; }
		
		//'Question'
		public Keyword getQuestionKeyword_0() { return cQuestionKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//('intitule' intitule=EString)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'intitule'
		public Keyword getIntituleKeyword_2_0() { return cIntituleKeyword_2_0; }
		
		//intitule=EString
		public Assignment getIntituleAssignment_2_1() { return cIntituleAssignment_2_1; }
		
		//EString
		public RuleCall getIntituleEStringParserRuleCall_2_1_0() { return cIntituleEStringParserRuleCall_2_1_0; }
		
		//'reponse'
		public Keyword getReponseKeyword_3() { return cReponseKeyword_3; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }
		
		//reponse+=Reponse
		public Assignment getReponseAssignment_5() { return cReponseAssignment_5; }
		
		//Reponse
		public RuleCall getReponseReponseParserRuleCall_5_0() { return cReponseReponseParserRuleCall_5_0; }
		
		//("," reponse+=Reponse)*
		public Group getGroup_6() { return cGroup_6; }
		
		//","
		public Keyword getCommaKeyword_6_0() { return cCommaKeyword_6_0; }
		
		//reponse+=Reponse
		public Assignment getReponseAssignment_6_1() { return cReponseAssignment_6_1; }
		
		//Reponse
		public RuleCall getReponseReponseParserRuleCall_6_1_0() { return cReponseReponseParserRuleCall_6_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
	}
	public class ReponseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "xtext.insa.Qcm.Reponse");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cReponseKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cDataKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cDataAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cDataEStringParserRuleCall_2_1_0 = (RuleCall)cDataAssignment_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cValueKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cValueAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cValueEBooleanParserRuleCall_3_1_0 = (RuleCall)cValueAssignment_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Reponse:
		//	'Reponse'
		//	'{' ('data' data=EString)? ('value' value=EBoolean)?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Reponse' '{' ('data' data=EString)? ('value' value=EBoolean)? '}'
		public Group getGroup() { return cGroup; }
		
		//'Reponse'
		public Keyword getReponseKeyword_0() { return cReponseKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//('data' data=EString)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'data'
		public Keyword getDataKeyword_2_0() { return cDataKeyword_2_0; }
		
		//data=EString
		public Assignment getDataAssignment_2_1() { return cDataAssignment_2_1; }
		
		//EString
		public RuleCall getDataEStringParserRuleCall_2_1_0() { return cDataEStringParserRuleCall_2_1_0; }
		
		//('value' value=EBoolean)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'value'
		public Keyword getValueKeyword_3_0() { return cValueKeyword_3_0; }
		
		//value=EBoolean
		public Assignment getValueAssignment_3_1() { return cValueAssignment_3_1; }
		
		//EBoolean
		public RuleCall getValueEBooleanParserRuleCall_3_1_0() { return cValueEBooleanParserRuleCall_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class EBooleanElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "xtext.insa.Qcm.EBoolean");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cTrueKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cFalseKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//EBoolean ecore::EBoolean:
		//	'true' | 'false';
		@Override public ParserRule getRule() { return rule; }
		
		//'true' | 'false'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'true'
		public Keyword getTrueKeyword_0() { return cTrueKeyword_0; }
		
		//'false'
		public Keyword getFalseKeyword_1() { return cFalseKeyword_1; }
	}
	
	
	private final QcmElements pQcm;
	private final EStringElements pEString;
	private final QuestionElements pQuestion;
	private final ReponseElements pReponse;
	private final EBooleanElements pEBoolean;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public QcmGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pQcm = new QcmElements();
		this.pEString = new EStringElements();
		this.pQuestion = new QuestionElements();
		this.pReponse = new ReponseElements();
		this.pEBoolean = new EBooleanElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("xtext.insa.Qcm".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Qcm:
	//	'Qcm'
	//	'{' ('domaine' domaine=EString)?
	//	'question' '{' question+=Question ("," question+=Question)* '}'
	//	'}';
	public QcmElements getQcmAccess() {
		return pQcm;
	}
	
	public ParserRule getQcmRule() {
		return getQcmAccess().getRule();
	}
	
	//EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//Question:
	//	'Question'
	//	'{' ('intitule' intitule=EString)?
	//	'reponse' '{' reponse+=Reponse ("," reponse+=Reponse)* '}'
	//	'}';
	public QuestionElements getQuestionAccess() {
		return pQuestion;
	}
	
	public ParserRule getQuestionRule() {
		return getQuestionAccess().getRule();
	}
	
	//Reponse:
	//	'Reponse'
	//	'{' ('data' data=EString)? ('value' value=EBoolean)?
	//	'}';
	public ReponseElements getReponseAccess() {
		return pReponse;
	}
	
	public ParserRule getReponseRule() {
		return getReponseAccess().getRule();
	}
	
	//EBoolean ecore::EBoolean:
	//	'true' | 'false';
	public EBooleanElements getEBooleanAccess() {
		return pEBoolean;
	}
	
	public ParserRule getEBooleanRule() {
		return getEBooleanAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}

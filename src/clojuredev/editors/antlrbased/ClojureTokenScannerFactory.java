/*******************************************************************************
 * Copyright (c) 2008 Laurent Petit.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: 
 *    Laurent PETIT - initial API and implementation
 *******************************************************************************/
package clojuredev.editors.antlrbased;


import org.eclipse.jface.resource.ColorRegistry;

import clojuredev.lexers.ClojureLexer;
import clojuredev.utils.editors.antlrbased.AntlrBasedTokenScanner;
import clojuredev.utils.editors.antlrbased.IScanContext;
import clojuredev.utils.editors.antlrbased.TokenScannerUtils;


public final class ClojureTokenScannerFactory {

	public AntlrBasedTokenScanner create(final ColorRegistry colorProvider, IScanContext scanContext) {
		return new AntlrBasedTokenScanner(new ClojureLexer(), scanContext) {
			@Override
			protected void initAntlrTokenTypeToJFaceTokenMap() {
				TokenScannerUtils u = new TokenScannerUtils(this, colorProvider);
				
				u.addTokenType(ClojureLexer.STRING); 
				u.addTokenType(ClojureLexer.NUMBER);
				u.addTokenType(ClojureLexer.CHARACTER);
				u.addTokenType(ClojureLexer.NIL);
				u.addTokenType(ClojureLexer.BOOLEAN);
				u.addTokenType(ClojureLexer.SYMBOL);
				u.addTokenType(IScanContext.SymbolType.FUNCTION);
				u.addTokenType(IScanContext.SymbolType.GLOBAL_VAR);
				u.addTokenType(IScanContext.SymbolType.MACRO);
				u.addTokenType(IScanContext.SymbolType.SPECIAL_FORM);
				u.addTokenType(ClojureLexer.SPECIAL_FORM);
				u.addTokenType(ClojureLexer.METADATA_TYPEHINT);
//				u.addBoldToken(IScanContext.SymbolType.FUNCTION);
//				u.addBoldToken(IScanContext.SymbolType.GLOBAL_VAR);
//				u.addBoldToken(IScanContext.SymbolType.MACRO);
//				u.addBoldToken(IScanContext.SymbolType.SPECIAL_FORM);
//				u.addBoldToken(ClojureLexer.SPECIAL_FORM);
				u.addTokenType(ClojureLexer.T24);//'&'=20
				u.addTokenType(ClojureLexer.OPEN_PAREN);//'('=21
				u.addTokenType(ClojureLexer.CLOSE_PAREN);//')'=22
				u.addTokenType(ClojureLexer.T25);//'['=23
				u.addTokenType(ClojureLexer.T26);//']'=24
				u.addTokenType(ClojureLexer.T27);//'{'=25
				u.addTokenType(ClojureLexer.T28);//'}'=26
				u.addTokenType(ClojureLexer.T29);//'\''=27
				u.addTokenType(ClojureLexer.T30);//'^'=28
				u.addTokenType(ClojureLexer.T31);//'@'=29
				u.addTokenType(ClojureLexer.T32);//'#'=30
				u.addTokenType(ClojureLexer.KEYWORD);
				u.addTokenType(ClojureLexer.SYNTAX_QUOTE);
				u.addTokenType(ClojureLexer.UNQUOTE_SPLICING);
				u.addTokenType(ClojureLexer.UNQUOTE);
				u.addTokenType(ClojureLexer.COMMENT);
//				u.addItalicToken(ClojureLexer.COMMENT);
				u.addTokenType(ClojureLexer.SPACE);
				u.addTokenType(ClojureLexer.LAMBDA_ARG);			
			}
		};
	}
}

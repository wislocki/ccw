/*******************************************************************************
 * Copyright (c) 2009 Stephan Muehlstrasser and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: 
 *    Stephan Muehlstrasser - Initial implementation
 *    Stephan Muehlstrasser - Enabling/disabling of syntax coloring
 *******************************************************************************/

package ccw.preferences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.graphics.RGB;

import ccw.CCWPlugin;
import clojure.lang.Keyword;

/**
 * Constant definitions for plug-in preferences
 */
public class PreferenceConstants {
	
	public static Keyword stringToken = Keyword.intern("string");
	public static Keyword regexToken = Keyword.intern("regex");
	public static Keyword intToken = Keyword.intern("int");
	public static Keyword floatToken = Keyword.intern("float");
	public static Keyword charToken = Keyword.intern("char");
//	public static Keyword literalSymbolToken = Keyword.intern("literalSymbol");

//	public static Keyword symbolToken = Keyword.intern("symbol");

	public static Keyword FUNCTION_Token = Keyword.intern("FUNCTION");
	public static Keyword callableFUNCTION_Token = Keyword.intern("callableFUNCTION");
	public static Keyword MACRO_Token = Keyword.intern("MACRO");
	public static Keyword callableMACRO_Token = Keyword.intern("callableMACRO");
	public static Keyword SPECIAL_FORM_Token = Keyword.intern("SPECIAL_FORM");
	public static Keyword callableSPECIAL_FORM_Token = Keyword.intern("callableSPECIAL_FORM");
	public static Keyword GLOBAL_VAR_Token = Keyword.intern("GLOBAL_VAR");
	public static Keyword callableGLOBAL_VAR_Token = Keyword.intern("callableGLOBAL_VAR");
	public static Keyword JAVA_CLASS_Token = Keyword.intern("JAVA_CLASS");
	public static Keyword callableJAVA_CLASS_Token = Keyword.intern("callableJAVA_CLASS");
	public static Keyword JAVA_INSTANCE_METHOD_Token = Keyword.intern("JAVA_INSTANCE_METHOD");
	public static Keyword callableJAVA_INSTANCE_METHOD_Token = Keyword.intern("callableJAVA_INSTANCE_METHOD");
	public static Keyword JAVA_STATIC_METHOD_Token = Keyword.intern("JAVA_STATIC_METHOD");
	public static Keyword callableJAVA_STATIC_METHOD_Token = Keyword.intern("callableJAVA_STATIC_METHOD");
	public static Keyword RAW_SYMBOL_Token = Keyword.intern("RAW_SYMBOL");
	public static Keyword callable_RAW_SYMBOL_Token = Keyword.intern("callableRAW_SYMBOL");
	
	public static final Keyword deactivatedRainbowParen = Keyword.intern("deactivated-rainbow-paren");
	public static final Keyword rainbowParenLevel1 = Keyword.intern("rainbow-paren-level-1");
	public static final Keyword rainbowParenLevel2 = Keyword.intern("rainbow-paren-level-2");
	public static final Keyword rainbowParenLevel3 = Keyword.intern("rainbow-paren-level-3");
	public static final Keyword rainbowParenLevel4 = Keyword.intern("rainbow-paren-level-4");
	public static final Keyword rainbowParenLevel5 = Keyword.intern("rainbow-paren-level-5");
	public static final Keyword rainbowParenLevel6 = Keyword.intern("rainbow-paren-level-6");
	public static final Keyword rainbowParenLevel7 = Keyword.intern("rainbow-paren-level-7");
	public static final Keyword rainbowParenLevel8 = Keyword.intern("rainbow-paren-level-8");

	public static Keyword keywordToken = Keyword.intern("keyword");
	public static Keyword commentToken = Keyword.intern("comment");
	public static Keyword whitespaceToken = Keyword.intern("whitespace");
	public static Keyword metaToken = Keyword.intern("meta");
	
	/** 
	 * Set of tokens keywords for which syntax color information can be retrieved
	 * from preferences via the <code>getColorizableToken()</code> method
	 */
	public static final Set<Keyword> colorizableTokens;
	
	/** List of tokens, ordered to be displayed on the preferences page. */
	public static final List<Keyword> orderedColorizableTokens; // FIXME: use it, or remove it
	
	static {
		orderedColorizableTokens = Collections.unmodifiableList(
				new ArrayList<Keyword>() {
			{
				add(stringToken);
				add(regexToken);
				add(intToken);
				add(floatToken);
				add(charToken);
				add(FUNCTION_Token);
				add(callableFUNCTION_Token);
				add(MACRO_Token);
				add(callableMACRO_Token);
				add(SPECIAL_FORM_Token);
				add(callableSPECIAL_FORM_Token);
				add(GLOBAL_VAR_Token);
				add(callableGLOBAL_VAR_Token);
				add(JAVA_CLASS_Token);
				add(callableJAVA_CLASS_Token);
				add(JAVA_INSTANCE_METHOD_Token);
				add(callableJAVA_INSTANCE_METHOD_Token);
				add(JAVA_STATIC_METHOD_Token);
				add(callableJAVA_STATIC_METHOD_Token);
				add(RAW_SYMBOL_Token);
				add(callable_RAW_SYMBOL_Token);
				add(keywordToken);
				add(commentToken);
				add(metaToken);
				add(deactivatedRainbowParen);
				add(rainbowParenLevel1);
				add(rainbowParenLevel2);
				add(rainbowParenLevel3);
				add(rainbowParenLevel4);
				add(rainbowParenLevel5);
				add(rainbowParenLevel6);
				add(rainbowParenLevel7);
				add(rainbowParenLevel8);
			}
		});
		
		colorizableTokens = Collections.unmodifiableSet(
				new HashSet<Keyword>(orderedColorizableTokens));
	}
	
	
    public static final String CCW_PREFERENCE_PREFIX = "ccw.preferences"; //$NON-NLS-1$
    
	public static final String SWITCH_TO_NS_ON_REPL_STARTUP = CCW_PREFERENCE_PREFIX + ".switch_to_ns_on_repl_startup"; //$NON-NLS-1$

	public static final String USE_STRICT_STRUCTURAL_EDITING_MODE_BY_DEFAULT = CCW_PREFERENCE_PREFIX + ".use_strict_structural_editing_mode_by_default"; //$NON-NLS-1$
	public static final String SHOW_RAINBOW_PARENS_BY_DEFAULT = CCW_PREFERENCE_PREFIX + ".show_rainbow_parens_by_default"; //$NON-NLS-1$

	public static final String USE_TAB_FOR_REINDENTING_LINE = CCW_PREFERENCE_PREFIX + ".use_tab_for_reindenting_line"; //$NON-NLS-1$
	
	public static final String EDITOR_COLORING_PREFIX = "editor_color"; //$NON-NLS-1$
	
    public static final String EDITOR_ESCAPE_ON_PASTE = CCW_PREFERENCE_PREFIX + ".escape_on_paste"; //$NON-NLS-1$

    public static final String REPL_VIEW_AUTO_EVAL_ON_ENTER_ACTIVE = CCW_PREFERENCE_PREFIX + ".repl_view_autoeval_on_enter_active"; //$NON-NLS-1$
    public static final String REPL_VIEW_DISPLAY_HINTS = CCW_PREFERENCE_PREFIX + ".repl_view_display_hints"; //$NON-NLS-1$
    
    public static final String EDITOR_BOLD_SUFFIX = ".bold"; //$NON-NLS-1$
    public static final String EDITOR_ITALIC_SUFFIX = ".italic"; //$NON-NLS-1$
    /* TODO enable these once text attributes are used in the editor
    public static final String EDITOR_UNDERLINE_SUFFIX = ".underline"; //$NON-NLS-1$
    public static final String EDITOR_STRIKETHROUGH_SUFFIX = ".strikethrough"; //$NON-NLS-1$
    */
    
    public static final String EDITOR_COLORING_ENABLED_SUFFIX = ".enabled"; //$NON-NLS-1$

    public static class ColorizableToken {
    	public final RGB rgb;
    	public final Boolean isBold;
    	public final Boolean isItalic;
    	public ColorizableToken(RGB rgb, Boolean isBold, Boolean isItalic) {
    		this.rgb = rgb;
    		this.isBold = isBold;
    		this.isItalic = isItalic;
    	}
    }
    
    public static String getTokenPreferenceKey(Keyword token) {
    	return CCW_PREFERENCE_PREFIX + "." + EDITOR_COLORING_PREFIX + "." + token.getName(); //$NON-NLS-1$
    }
    public static ColorizableToken getColorizableToken(IPreferenceStore store, Keyword token, RGB defaultColor) {
    	String tokenKey = getTokenPreferenceKey(token);
    	return new ColorizableToken(
    			CCWPlugin.getPreferenceRGB(store, tokenKey, defaultColor),
    			store.getBoolean(SyntaxColoringPreferencePage.getEnabledPreferenceKey(tokenKey)) 
    				? store.getBoolean(SyntaxColoringPreferencePage.getBoldPreferenceKey(tokenKey)) 
    				: null,
    			store.getBoolean(SyntaxColoringPreferencePage.getEnabledPreferenceKey(tokenKey))
    				? store.getBoolean(SyntaxColoringPreferencePage.getItalicPreferenceKey(tokenKey)) 
    				: null);
    }

}

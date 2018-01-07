/* The following code was generated by JFlex 1.4.3 on 07/01/18 12.09 */

/*
 * Copyright 2008 Ayman Al-Sairafi ayman.alsairafi@gmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License
 *       at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jsyntaxpane.lexers;


import jsyntaxpane.Token;
import jsyntaxpane.TokenType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 07/01/18 12.09 from the specification file
 * <tt>C:/Users/Rum/Desktop/jsyntaxpane-master/jsyntaxpane/src/main/jflex/jsyntaxpane/lexers/dosbatch.flex</tt>
 */
public final class DOSBatchLexer extends DefaultJFlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int ECHO_TEXT = 2;
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\27\1\0\1\5\2\0\1\4\16\27\10\0\1\26\1\25\12\0"+
    "\12\41\1\36\5\0\1\6\1\13\1\33\1\12\1\23\1\2\1\17"+
    "\1\7\1\31\1\16\1\37\1\34\1\14\1\3\1\32\1\10\1\21"+
    "\1\37\1\1\1\20\1\11\1\35\1\24\1\37\1\15\1\22\1\37"+
    "\4\0\1\40\1\0\1\13\1\33\1\12\1\23\1\2\1\17\1\7"+
    "\1\31\1\16\1\37\1\34\1\14\1\3\1\32\1\10\1\21\1\37"+
    "\1\1\1\20\1\11\1\35\1\24\1\37\1\15\1\22\1\37\4\0"+
    "\41\27\2\0\4\26\4\0\1\26\2\0\1\27\7\0\1\26\4\0"+
    "\1\26\5\0\27\26\1\0\37\26\1\0\u01ca\26\4\0\14\26\16\0"+
    "\5\26\7\0\1\26\1\0\1\26\21\0\160\27\5\26\1\0\2\26"+
    "\2\0\4\26\10\0\1\26\1\0\3\26\1\0\1\26\1\0\24\26"+
    "\1\0\123\26\1\0\213\26\1\0\5\27\2\0\236\26\11\0\46\26"+
    "\2\0\1\26\7\0\47\26\7\0\1\26\1\0\55\27\1\0\1\27"+
    "\1\0\2\27\1\0\2\27\1\0\1\27\10\0\33\26\5\0\3\26"+
    "\15\0\5\27\6\0\1\26\4\0\13\27\5\0\53\26\25\27\12\30"+
    "\4\0\2\26\1\27\143\26\1\0\1\26\10\27\1\0\6\27\2\26"+
    "\2\27\1\0\4\27\2\26\12\30\3\26\2\0\1\26\17\0\1\27"+
    "\1\26\1\27\36\26\33\27\2\0\131\26\13\27\1\26\16\0\12\30"+
    "\41\26\11\27\2\26\4\0\1\26\5\0\26\26\4\27\1\26\11\27"+
    "\1\26\3\27\1\26\5\27\22\0\31\26\3\27\104\0\1\26\1\0"+
    "\13\26\67\0\33\27\1\0\4\27\66\26\3\27\1\26\22\27\1\26"+
    "\7\27\12\26\2\27\2\0\12\30\1\0\7\26\1\0\7\26\1\0"+
    "\3\27\1\0\10\26\2\0\2\26\2\0\26\26\1\0\7\26\1\0"+
    "\1\26\3\0\4\26\2\0\1\27\1\26\7\27\2\0\2\27\2\0"+
    "\3\27\1\26\10\0\1\27\4\0\2\26\1\0\3\26\2\27\2\0"+
    "\12\30\4\26\7\0\1\26\5\0\3\27\1\0\6\26\4\0\2\26"+
    "\2\0\26\26\1\0\7\26\1\0\2\26\1\0\2\26\1\0\2\26"+
    "\2\0\1\27\1\0\5\27\4\0\2\27\2\0\3\27\3\0\1\27"+
    "\7\0\4\26\1\0\1\26\7\0\12\30\2\27\3\26\1\27\13\0"+
    "\3\27\1\0\11\26\1\0\3\26\1\0\26\26\1\0\7\26\1\0"+
    "\2\26\1\0\5\26\2\0\1\27\1\26\10\27\1\0\3\27\1\0"+
    "\3\27\2\0\1\26\17\0\2\26\2\27\2\0\12\30\1\0\1\26"+
    "\17\0\3\27\1\0\10\26\2\0\2\26\2\0\26\26\1\0\7\26"+
    "\1\0\2\26\1\0\5\26\2\0\1\27\1\26\7\27\2\0\2\27"+
    "\2\0\3\27\10\0\2\27\4\0\2\26\1\0\3\26\2\27\2\0"+
    "\12\30\1\0\1\26\20\0\1\27\1\26\1\0\6\26\3\0\3\26"+
    "\1\0\4\26\3\0\2\26\1\0\1\26\1\0\2\26\3\0\2\26"+
    "\3\0\3\26\3\0\14\26\4\0\5\27\3\0\3\27\1\0\4\27"+
    "\2\0\1\26\6\0\1\27\16\0\12\30\11\0\1\26\7\0\3\27"+
    "\1\0\10\26\1\0\3\26\1\0\27\26\1\0\12\26\1\0\5\26"+
    "\3\0\1\26\7\27\1\0\3\27\1\0\4\27\7\0\2\27\1\0"+
    "\2\26\6\0\2\26\2\27\2\0\12\30\22\0\2\27\1\0\10\26"+
    "\1\0\3\26\1\0\27\26\1\0\12\26\1\0\5\26\2\0\1\27"+
    "\1\26\7\27\1\0\3\27\1\0\4\27\7\0\2\27\7\0\1\26"+
    "\1\0\2\26\2\27\2\0\12\30\1\0\2\26\17\0\2\27\1\0"+
    "\10\26\1\0\3\26\1\0\51\26\2\0\1\26\7\27\1\0\3\27"+
    "\1\0\4\27\1\26\10\0\1\27\10\0\2\26\2\27\2\0\12\30"+
    "\12\0\6\26\2\0\2\27\1\0\22\26\3\0\30\26\1\0\11\26"+
    "\1\0\1\26\2\0\7\26\3\0\1\27\4\0\6\27\1\0\1\27"+
    "\1\0\10\27\22\0\2\27\15\0\60\26\1\27\2\26\7\27\4\0"+
    "\10\26\10\27\1\0\12\30\47\0\2\26\1\0\1\26\2\0\2\26"+
    "\1\0\1\26\2\0\1\26\6\0\4\26\1\0\7\26\1\0\3\26"+
    "\1\0\1\26\1\0\1\26\2\0\2\26\1\0\4\26\1\27\2\26"+
    "\6\27\1\0\2\27\1\26\2\0\5\26\1\0\1\26\1\0\6\27"+
    "\2\0\12\30\2\0\4\26\40\0\1\26\27\0\2\27\6\0\12\30"+
    "\13\0\1\27\1\0\1\27\1\0\1\27\4\0\2\27\10\26\1\0"+
    "\44\26\4\0\24\27\1\0\2\27\5\26\13\27\1\0\44\27\11\0"+
    "\1\27\71\0\53\26\24\27\1\26\12\30\6\0\6\26\4\27\4\26"+
    "\3\27\1\26\3\27\2\26\7\27\3\26\4\27\15\26\14\27\1\26"+
    "\1\27\12\30\4\27\2\0\46\26\1\0\1\26\5\0\1\26\2\0"+
    "\53\26\1\0\u014d\26\1\0\4\26\2\0\7\26\1\0\1\26\1\0"+
    "\4\26\2\0\51\26\1\0\4\26\2\0\41\26\1\0\4\26\2\0"+
    "\7\26\1\0\1\26\1\0\4\26\2\0\17\26\1\0\71\26\1\0"+
    "\4\26\2\0\103\26\2\0\3\27\40\0\20\26\20\0\125\26\14\0"+
    "\u026c\26\2\0\21\26\1\0\32\26\5\0\113\26\3\0\3\26\17\0"+
    "\15\26\1\0\4\26\3\27\13\0\22\26\3\27\13\0\22\26\2\27"+
    "\14\0\15\26\1\0\3\26\1\0\2\27\14\0\64\26\40\27\3\0"+
    "\1\26\3\0\2\26\1\27\2\0\12\30\41\0\3\27\2\0\12\30"+
    "\6\0\130\26\10\0\51\26\1\27\1\26\5\0\106\26\12\0\35\26"+
    "\3\0\14\27\4\0\14\27\12\0\12\30\36\26\2\0\5\26\13\0"+
    "\54\26\4\0\21\27\7\26\2\27\6\0\12\30\46\0\27\26\5\27"+
    "\4\0\65\26\12\27\1\0\35\27\2\0\1\27\12\30\6\0\12\30"+
    "\15\0\1\26\130\0\5\27\57\26\21\27\7\26\4\0\12\30\21\0"+
    "\11\27\14\0\3\27\36\26\15\27\2\26\12\30\54\26\16\27\14\0"+
    "\44\26\24\27\10\0\12\30\3\0\3\26\12\30\44\26\122\0\3\27"+
    "\1\0\25\27\4\26\1\27\4\26\3\27\2\26\11\0\300\26\47\27"+
    "\25\0\4\27\u0116\26\2\0\6\26\2\0\46\26\2\0\6\26\2\0"+
    "\10\26\1\0\1\26\1\0\1\26\1\0\1\26\1\0\37\26\2\0"+
    "\65\26\1\0\7\26\1\0\1\26\3\0\3\26\1\0\7\26\3\0"+
    "\4\26\2\0\6\26\4\0\15\26\5\0\3\26\1\0\7\26\16\0"+
    "\5\27\32\0\5\27\20\0\2\26\23\0\1\26\13\0\5\27\5\0"+
    "\6\27\1\0\1\26\15\0\1\26\20\0\15\26\3\0\33\26\25\0"+
    "\15\27\4\0\1\27\3\0\14\27\21\0\1\26\4\0\1\26\2\0"+
    "\12\26\1\0\1\26\3\0\5\26\6\0\1\26\1\0\1\26\1\0"+
    "\1\26\1\0\4\26\1\0\13\26\2\0\4\26\5\0\5\26\4\0"+
    "\1\26\21\0\51\26\u0a77\0\57\26\1\0\57\26\1\0\205\26\6\0"+
    "\4\26\3\27\2\26\14\0\46\26\1\0\1\26\5\0\1\26\2\0"+
    "\70\26\7\0\1\26\17\0\1\27\27\26\11\0\7\26\1\0\7\26"+
    "\1\0\7\26\1\0\7\26\1\0\7\26\1\0\7\26\1\0\7\26"+
    "\1\0\7\26\1\0\40\27\57\0\1\26\u01d5\0\3\26\31\0\11\26"+
    "\6\27\1\0\5\26\2\0\5\26\4\0\126\26\2\0\2\27\2\0"+
    "\3\26\1\0\132\26\1\0\4\26\5\0\51\26\3\0\136\26\21\0"+
    "\33\26\65\0\20\26\u0200\0\u19b6\26\112\0\u51cd\26\63\0\u048d\26\103\0"+
    "\56\26\2\0\u010d\26\3\0\20\26\12\30\2\26\24\0\57\26\1\27"+
    "\4\0\12\27\1\0\31\26\7\0\1\27\120\26\2\27\45\0\11\26"+
    "\2\0\147\26\2\0\4\26\1\0\4\26\14\0\13\26\115\0\12\26"+
    "\1\27\3\26\1\27\4\26\1\27\27\26\5\27\20\0\1\26\7\0"+
    "\64\26\14\0\2\27\62\26\21\27\13\0\12\30\6\0\22\27\6\26"+
    "\3\0\1\26\4\0\12\30\34\26\10\27\2\0\27\26\15\27\14\0"+
    "\35\26\3\0\4\27\57\26\16\27\16\0\1\26\12\30\46\0\51\26"+
    "\16\27\11\0\3\26\1\27\10\26\2\27\2\0\12\30\6\0\27\26"+
    "\3\0\1\26\1\27\4\0\60\26\1\27\1\26\3\27\2\26\2\27"+
    "\5\26\2\27\1\26\1\27\1\26\30\0\3\26\2\0\13\26\5\27"+
    "\2\0\3\26\2\27\12\0\6\26\2\0\6\26\2\0\6\26\11\0"+
    "\7\26\1\0\7\26\221\0\43\26\10\27\1\0\2\27\2\0\12\30"+
    "\6\0\u2ba4\26\14\0\27\26\4\0\61\26\u2104\0\u016e\26\2\0\152\26"+
    "\46\0\7\26\14\0\5\26\5\0\1\26\1\27\12\26\1\0\15\26"+
    "\1\0\5\26\1\0\1\26\1\0\2\26\1\0\2\26\1\0\154\26"+
    "\41\0\u016b\26\22\0\100\26\2\0\66\26\50\0\15\26\3\0\20\27"+
    "\20\0\7\27\14\0\2\26\30\0\3\26\31\0\1\26\6\0\5\26"+
    "\1\0\207\26\2\0\1\27\4\0\1\26\13\0\12\30\7\0\32\26"+
    "\4\0\1\26\1\0\32\26\13\0\131\26\3\0\6\26\2\0\6\26"+
    "\2\0\6\26\2\0\3\26\3\0\2\26\3\0\2\26\22\0\3\27"+
    "\4\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\3\3\1\2\1\4\15\3\1\2"+
    "\3\3\1\2\2\1\1\5\1\1\2\3\1\4\20\3"+
    "\1\4\25\3\1\0\1\6\3\3\1\7\1\1\1\6"+
    "\1\4\3\3\1\4\25\3\1\4\1\3\1\4\11\3"+
    "\1\4\1\10\2\3\1\10\1\11\1\3\2\11\6\3"+
    "\1\12\2\3\1\4\7\3\1\4\24\3";

  private static int [] zzUnpackAction() {
    int [] result = new int[164];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\42\0\104\0\146\0\210\0\252\0\314\0\104"+
    "\0\356\0\u0110\0\u0132\0\u0154\0\u0176\0\u0198\0\u01ba\0\u01dc"+
    "\0\u01fe\0\u0220\0\u0242\0\u0264\0\u0286\0\u02a8\0\u02ca\0\u02ec"+
    "\0\u030e\0\u0330\0\u0352\0\u0374\0\104\0\u0396\0\u03b8\0\u03da"+
    "\0\u0110\0\u03fc\0\u041e\0\u0440\0\u0462\0\u0484\0\u04a6\0\u04c8"+
    "\0\u04ea\0\u050c\0\u052e\0\u0550\0\u0572\0\u0594\0\u05b6\0\u05d8"+
    "\0\u05fa\0\u061c\0\u063e\0\u0660\0\u0682\0\u06a4\0\u06c6\0\u06e8"+
    "\0\u070a\0\u072c\0\u074e\0\u0770\0\u0792\0\u07b4\0\u07d6\0\u07f8"+
    "\0\u081a\0\u083c\0\u085e\0\u0880\0\u08a2\0\u08c4\0\u08e6\0\u0908"+
    "\0\u092a\0\u094c\0\u096e\0\u0990\0\u09b2\0\u09d4\0\u09f6\0\u0a18"+
    "\0\u0a3a\0\u0a5c\0\u0a7e\0\u0aa0\0\u0ac2\0\u0ae4\0\u0b06\0\u0b28"+
    "\0\u0b4a\0\u0b6c\0\u0b8e\0\u0bb0\0\u0bd2\0\u0bf4\0\u0c16\0\u0c38"+
    "\0\u0c5a\0\u0c7c\0\u0c9e\0\u0cc0\0\u0ce2\0\u0d04\0\u0d26\0\u0d48"+
    "\0\u0d6a\0\u0d8c\0\u0dae\0\u0b6c\0\u0dd0\0\u0df2\0\u0e14\0\u0e36"+
    "\0\u0e58\0\u0e7a\0\u0e9c\0\u0ebe\0\u0ee0\0\u0f02\0\104\0\u0f24"+
    "\0\u0f46\0\u0352\0\u0f68\0\u0a18\0\u0f8a\0\104\0\u0fac\0\u0fce"+
    "\0\u0ff0\0\u1012\0\u1034\0\u1056\0\u0110\0\u1078\0\u109a\0\u10bc"+
    "\0\u10de\0\u1100\0\u1122\0\u1144\0\u1166\0\u1188\0\u11aa\0\u11cc"+
    "\0\u11ee\0\u1210\0\u1232\0\u1254\0\u1276\0\u1298\0\u12ba\0\u12dc"+
    "\0\u12fe\0\u1320\0\u1342\0\u1364\0\u1386\0\u13a8\0\u13ca\0\u13ec"+
    "\0\u140e\0\u1430\0\u1452\0\u1474";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[164];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\1\5\1\6\1\7\1\3\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\12\1\24\1\25\1\26\3\12\1\27"+
    "\1\12\1\30\1\31\1\12\1\32\3\12\4\33\1\34"+
    "\1\35\17\33\1\36\14\33\43\0\1\12\1\37\1\40"+
    "\3\0\14\12\1\41\1\12\1\0\10\12\1\0\3\12"+
    "\1\0\1\42\2\12\3\0\3\12\1\43\1\12\1\44"+
    "\1\45\7\12\1\0\4\12\1\46\3\12\1\0\3\12"+
    "\1\0\3\12\3\0\1\12\1\47\12\12\1\41\1\12"+
    "\1\0\6\12\1\40\1\12\1\0\3\12\5\0\1\3"+
    "\35\0\1\50\2\12\3\0\1\12\1\51\14\12\1\0"+
    "\10\12\1\0\3\12\1\0\3\12\3\0\16\12\1\0"+
    "\10\12\1\0\3\12\1\0\1\52\2\12\3\0\7\12"+
    "\1\53\3\12\1\54\2\12\1\0\10\12\1\0\3\12"+
    "\1\0\2\12\1\55\3\0\1\12\1\56\2\12\1\57"+
    "\1\60\6\12\1\41\1\12\1\0\3\12\1\61\4\12"+
    "\1\0\3\12\1\0\3\12\3\0\2\12\1\62\6\12"+
    "\1\63\1\64\3\12\1\0\10\12\1\0\3\12\1\0"+
    "\3\12\3\0\4\12\1\65\11\12\1\0\10\12\1\0"+
    "\3\12\1\0\3\12\3\0\3\12\1\66\12\12\1\0"+
    "\10\12\1\0\3\12\1\0\3\12\3\0\10\12\1\41"+
    "\5\12\1\0\10\12\1\0\3\12\1\0\3\12\3\0"+
    "\1\12\1\67\1\70\1\41\3\12\1\71\6\12\1\0"+
    "\10\12\1\0\3\12\1\0\1\12\1\72\1\12\3\0"+
    "\1\12\1\73\1\74\13\12\1\0\3\12\1\75\3\12"+
    "\1\76\1\0\3\12\1\0\1\77\2\12\3\0\1\12"+
    "\1\100\2\12\1\101\11\12\1\0\7\12\1\102\1\0"+
    "\3\12\1\0\1\12\1\103\1\12\3\0\1\12\1\104"+
    "\2\12\1\105\2\12\1\106\6\12\1\0\10\12\1\0"+
    "\3\12\1\0\1\12\1\107\1\12\3\0\1\12\1\103"+
    "\14\12\1\0\10\12\1\0\3\12\1\0\3\110\3\0"+
    "\16\110\1\0\1\110\1\0\1\111\5\110\1\0\2\110"+
    "\1\111\1\0\1\12\1\112\1\12\3\0\16\12\1\0"+
    "\10\12\1\0\3\12\1\0\1\113\2\12\3\0\16\12"+
    "\1\0\10\12\1\0\3\12\1\0\1\12\1\114\1\12"+
    "\3\0\16\12\1\0\10\12\1\0\3\12\1\0\3\115"+
    "\3\0\16\115\4\0\5\115\1\0\1\115\2\0\5\33"+
    "\1\0\41\33\1\35\35\33\3\116\1\33\1\0\1\33"+
    "\16\116\1\33\1\116\1\33\1\117\5\116\1\33\2\116"+
    "\1\117\1\0\2\12\1\120\3\0\3\12\1\121\5\12"+
    "\1\122\1\123\3\12\1\0\4\12\1\124\3\12\1\0"+
    "\3\12\1\0\3\12\3\0\14\12\1\125\1\12\1\0"+
    "\10\12\1\0\3\12\1\0\1\126\2\12\3\0\4\12"+
    "\1\44\11\12\1\0\10\12\1\0\3\12\1\0\3\12"+
    "\3\0\16\12\1\0\3\12\1\127\4\12\1\0\3\12"+
    "\1\0\3\12\3\0\11\12\1\130\4\12\1\0\10\12"+
    "\1\0\3\12\1\0\3\12\3\0\7\12\1\131\6\12"+
    "\1\0\10\12\1\0\3\12\1\0\3\12\3\0\14\12"+
    "\1\132\1\12\1\0\10\12\1\0\3\12\1\0\1\130"+
    "\2\12\3\0\14\12\2\130\1\0\10\12\1\0\3\12"+
    "\1\0\3\12\3\0\4\12\1\133\11\12\1\0\10\12"+
    "\1\0\3\12\1\0\3\12\3\0\2\12\1\134\13\12"+
    "\1\0\10\12\1\0\3\12\1\0\1\12\1\130\1\12"+
    "\3\0\16\12\1\0\10\12\1\0\3\12\1\0\2\12"+
    "\1\130\3\0\2\12\1\135\13\12\1\0\10\12\1\0"+
    "\3\12\1\0\3\12\3\0\12\12\1\130\3\12\1\0"+
    "\10\12\1\0\3\12\1\0\3\12\3\0\14\12\1\41"+
    "\1\12\1\0\10\12\1\0\3\12\1\0\2\12\1\136"+
    "\3\0\5\12\1\137\4\12\1\140\3\12\1\0\4\12"+
    "\1\141\3\12\1\0\3\12\1\0\3\12\3\0\3\12"+
    "\1\142\1\12\1\103\10\12\1\0\10\12\1\0\3\12"+
    "\1\0\3\12\3\0\11\12\1\41\4\12\1\0\10\12"+
    "\1\0\3\12\1\0\3\12\3\0\3\12\1\143\10\12"+
    "\1\125\1\12\1\0\6\12\1\144\1\12\1\0\3\12"+
    "\1\0\3\12\3\0\2\12\1\145\13\12\1\0\10\12"+
    "\1\0\3\12\1\0\3\12\3\0\11\12\1\146\4\12"+
    "\1\0\10\12\1\0\3\12\1\0\3\12\3\0\12\12"+
    "\1\147\3\12\1\0\10\12\1\0\3\12\1\0\3\12"+
    "\3\0\16\12\1\0\5\12\1\150\2\12\1\0\3\12"+
    "\1\0\3\12\3\0\1\12\1\151\14\12\1\0\10\12"+
    "\1\0\3\12\1\0\1\152\2\12\3\0\16\12\1\0"+
    "\10\12\1\0\3\12\1\0\3\12\3\0\13\12\1\54"+
    "\2\12\1\0\10\12\1\0\3\12\1\0\3\12\3\0"+
    "\16\12\1\0\4\12\1\153\3\12\1\0\3\12\1\0"+
    "\3\12\3\0\2\12\1\154\13\12\1\0\10\12\1\0"+
    "\3\12\1\0\1\155\2\12\3\0\16\12\1\0\10\12"+
    "\1\0\3\12\1\0\3\12\3\0\4\12\1\73\11\12"+
    "\1\0\10\12\1\0\3\12\1\0\3\12\3\0\7\12"+
    "\1\156\6\12\1\0\10\12\1\0\3\12\1\0\3\12"+
    "\3\0\16\12\1\0\5\12\1\157\2\12\1\0\3\12"+
    "\1\0\3\12\3\0\1\12\1\160\5\12\1\161\6\12"+
    "\1\0\10\12\1\0\3\12\1\0\3\12\3\0\12\12"+
    "\1\55\3\12\1\0\10\12\1\0\3\12\1\0\3\12"+
    "\3\0\2\12\1\162\13\12\1\0\7\12\1\44\1\0"+
    "\3\12\1\0\3\12\3\0\11\12\1\163\4\12\1\0"+
    "\10\12\1\0\3\12\1\0\3\12\3\0\5\12\1\41"+
    "\10\12\1\0\10\12\1\0\3\12\1\0\3\12\3\0"+
    "\11\12\1\164\4\12\1\0\10\12\1\0\3\12\1\0"+
    "\3\12\3\0\2\12\1\130\13\12\1\0\10\12\1\0"+
    "\3\12\1\0\1\41\2\12\3\0\11\12\1\165\4\12"+
    "\1\0\10\12\1\0\3\12\1\0\1\166\2\12\3\0"+
    "\16\12\1\0\10\12\1\0\3\12\1\0\3\110\3\0"+
    "\16\110\1\167\10\110\1\0\3\110\30\0\1\111\10\0"+
    "\1\111\1\0\3\12\3\0\5\12\1\143\10\12\1\0"+
    "\10\12\1\0\3\12\1\0\1\12\1\170\1\12\3\0"+
    "\16\12\1\0\10\12\1\0\3\12\1\0\3\12\3\0"+
    "\13\12\1\171\2\12\1\0\10\12\1\0\3\12\1\0"+
    "\3\115\3\0\16\115\4\0\5\115\1\0\3\115\1\33"+
    "\3\116\1\33\1\0\1\33\16\116\1\172\10\116\1\33"+
    "\3\116\5\33\1\0\22\33\1\117\10\33\1\117\1\173"+
    "\3\174\1\175\1\176\1\173\16\174\1\173\10\174\1\173"+
    "\3\174\1\0\3\12\3\0\1\12\1\177\14\12\1\0"+
    "\10\12\1\0\3\12\1\0\3\12\3\0\2\12\1\200"+
    "\13\12\1\0\10\12\1\0\3\12\1\0\3\12\3\0"+
    "\5\12\1\201\10\12\1\0\10\12\1\0\3\12\1\0"+
    "\3\12\3\0\4\12\1\202\11\12\1\0\10\12\1\0"+
    "\3\12\1\0\3\12\3\0\7\12\1\203\6\12\1\0"+
    "\10\12\1\0\3\12\1\0\3\12\3\0\1\12\1\204"+
    "\14\12\1\0\10\12\1\0\3\12\1\0\3\12\3\0"+
    "\1\12\1\205\14\12\1\0\10\12\1\0\3\12\1\0"+
    "\1\12\1\41\1\12\3\0\16\12\1\0\10\12\1\0"+
    "\3\12\1\0\3\12\3\0\2\12\1\41\6\12\1\155"+
    "\4\12\1\0\10\12\1\0\3\12\1\0\3\12\3\0"+
    "\5\12\1\206\10\12\1\0\10\12\1\0\3\12\1\0"+
    "\3\12\3\0\10\12\1\207\5\12\1\0\10\12\1\0"+
    "\3\12\1\0\3\12\3\0\1\12\1\41\14\12\1\0"+
    "\10\12\1\0\3\12\1\0\3\12\3\0\5\12\1\130"+
    "\10\12\1\0\10\12\1\0\3\12\1\0\3\12\3\0"+
    "\12\12\1\210\3\12\1\0\10\12\1\0\3\12\1\0"+
    "\3\12\3\0\1\12\1\203\14\12\1\0\10\12\1\0"+
    "\3\12\1\0\3\12\3\0\13\12\1\41\2\12\1\0"+
    "\10\12\1\0\3\12\1\0\3\12\3\0\15\12\1\211"+
    "\1\0\10\12\1\0\3\12\1\0\3\12\3\0\5\12"+
    "\1\60\10\12\1\0\10\12\1\0\3\12\1\0\3\12"+
    "\3\0\12\12\1\41\3\12\1\0\10\12\1\0\3\12"+
    "\1\0\3\12\3\0\14\12\1\212\1\12\1\0\4\12"+
    "\1\213\3\12\1\0\3\12\1\0\1\214\2\12\3\0"+
    "\16\12\1\0\10\12\1\0\3\12\1\0\3\12\3\0"+
    "\1\12\1\215\14\12\1\0\10\12\1\0\3\12\1\0"+
    "\1\12\1\216\1\12\3\0\16\12\1\0\10\12\1\0"+
    "\3\12\1\0\1\12\1\103\1\12\3\0\16\12\1\0"+
    "\10\12\1\0\3\12\1\0\3\12\3\0\12\12\1\140"+
    "\3\12\1\0\10\12\1\0\3\12\1\0\2\12\1\217"+
    "\3\0\16\12\1\0\10\12\1\0\3\12\1\0\3\12"+
    "\3\0\14\12\1\220\1\12\1\0\10\12\1\0\3\12"+
    "\1\0\3\12\3\0\2\12\1\41\13\12\1\0\10\12"+
    "\1\0\3\12\1\0\3\12\3\0\10\12\1\155\5\12"+
    "\1\0\10\12\1\0\3\12\1\0\3\12\3\0\11\12"+
    "\1\155\4\12\1\0\10\12\1\0\3\12\1\0\2\12"+
    "\1\221\3\0\16\12\1\0\10\12\1\0\3\12\1\0"+
    "\3\12\3\0\16\12\1\0\4\12\1\155\3\12\1\0"+
    "\3\12\1\0\3\12\3\0\16\12\1\0\3\12\1\41"+
    "\4\12\1\0\3\12\1\0\3\12\3\0\16\12\1\0"+
    "\3\12\1\55\4\12\1\0\3\12\1\0\3\12\3\0"+
    "\16\12\1\0\6\12\1\222\1\12\1\0\3\12\1\0"+
    "\3\12\3\0\16\12\1\0\6\12\1\223\1\12\1\0"+
    "\3\12\1\0\3\12\3\0\7\12\1\224\6\12\1\0"+
    "\10\12\1\0\3\12\1\0\3\12\3\0\4\12\1\225"+
    "\11\12\1\0\10\12\1\0\3\12\1\0\3\12\3\0"+
    "\16\12\1\0\5\12\1\41\2\12\1\0\3\12\4\173"+
    "\1\175\1\176\34\173\5\0\1\176\35\0\3\12\3\0"+
    "\15\12\1\226\1\0\10\12\1\0\3\12\1\0\3\12"+
    "\3\0\1\12\1\227\14\12\1\0\10\12\1\0\3\12"+
    "\1\0\3\12\3\0\4\12\1\230\11\12\1\0\10\12"+
    "\1\0\3\12\1\0\2\12\1\130\3\0\16\12\1\0"+
    "\10\12\1\0\3\12\1\0\1\41\2\12\3\0\16\12"+
    "\1\0\10\12\1\0\3\12\1\0\1\231\2\12\3\0"+
    "\16\12\1\0\10\12\1\0\3\12\1\0\3\12\3\0"+
    "\1\12\1\232\14\12\1\0\10\12\1\0\3\12\1\0"+
    "\3\12\3\0\2\12\1\233\13\12\1\0\10\12\1\0"+
    "\3\12\1\0\3\12\3\0\4\12\1\234\11\12\1\0"+
    "\10\12\1\0\3\12\1\0\1\12\1\73\1\12\3\0"+
    "\16\12\1\0\10\12\1\0\3\12\1\0\3\12\3\0"+
    "\11\12\1\225\4\12\1\0\10\12\1\0\3\12\1\0"+
    "\3\12\3\0\2\12\1\235\13\12\1\0\10\12\1\0"+
    "\3\12\1\0\3\12\3\0\7\12\1\171\6\12\1\0"+
    "\10\12\1\0\3\12\1\0\3\12\3\0\3\12\1\41"+
    "\12\12\1\0\10\12\1\0\3\12\1\0\3\12\3\0"+
    "\16\12\1\0\4\12\1\55\3\12\1\0\3\12\1\0"+
    "\3\12\3\0\4\12\1\155\11\12\1\0\10\12\1\0"+
    "\3\12\1\0\3\12\3\0\11\12\1\236\4\12\1\0"+
    "\10\12\1\0\3\12\1\0\3\12\3\0\12\12\1\155"+
    "\3\12\1\0\10\12\1\0\3\12\1\0\1\12\1\140"+
    "\1\12\3\0\16\12\1\0\10\12\1\0\3\12\1\0"+
    "\3\12\3\0\3\12\1\237\12\12\1\0\10\12\1\0"+
    "\3\12\1\0\3\12\3\0\10\12\1\140\5\12\1\0"+
    "\10\12\1\0\3\12\1\0\3\12\3\0\16\12\1\0"+
    "\6\12\1\41\1\12\1\0\3\12\1\0\1\12\1\203"+
    "\1\12\3\0\16\12\1\0\10\12\1\0\3\12\1\0"+
    "\1\130\2\12\3\0\16\12\1\0\10\12\1\0\3\12"+
    "\1\0\3\12\3\0\3\12\1\130\12\12\1\0\10\12"+
    "\1\0\3\12\1\0\3\12\3\0\5\12\1\240\10\12"+
    "\1\0\10\12\1\0\3\12\1\0\3\12\3\0\3\12"+
    "\1\241\12\12\1\0\10\12\1\0\3\12\1\0\3\12"+
    "\3\0\4\12\1\242\11\12\1\0\10\12\1\0\3\12"+
    "\1\0\3\12\3\0\3\12\1\155\12\12\1\0\10\12"+
    "\1\0\3\12\1\0\3\12\3\0\10\12\1\60\5\12"+
    "\1\0\10\12\1\0\3\12\1\0\3\12\3\0\2\12"+
    "\1\203\13\12\1\0\10\12\1\0\3\12\1\0\3\12"+
    "\3\0\1\12\1\243\14\12\1\0\10\12\1\0\3\12"+
    "\1\0\1\12\1\244\1\12\3\0\16\12\1\0\10\12"+
    "\1\0\3\12\1\0\3\12\3\0\4\12\1\103\11\12"+
    "\1\0\10\12\1\0\3\12\1\0\3\12\3\0\16\12"+
    "\1\0\5\12\1\103\2\12\1\0\3\12\1\0\2\12"+
    "\1\143\3\0\12\12\1\140\3\12\1\0\10\12\1\0"+
    "\3\12\1\0\3\12\3\0\15\12\1\150\1\0\10\12"+
    "\1\0\3\12";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5270];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\1\1\11\4\1\1\11\24\1\1\11\52\1"+
    "\1\0\56\1\1\11\6\1\1\11\46\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[164];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    /**
     * Create an empty lexer, yyrset will be called later to reset and assign
     * the reader
     */
    public DOSBatchLexer() {
        super();
    }

    @Override
    public int yychar() {
        return yychar;
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public DOSBatchLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public DOSBatchLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 2262) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 5: 
          { yybegin(YYINITIAL) ;
          }
        case 11: break;
        case 8: 
          { return token(TokenType.STRING2);
          }
        case 12: break;
        case 10: 
          { yybegin(ECHO_TEXT);
                 return token(TokenType.KEYWORD);
          }
        case 13: break;
        case 4: 
          { return token(TokenType.KEYWORD);
          }
        case 14: break;
        case 7: 
          { return token(TokenType.TYPE3);
          }
        case 15: break;
        case 6: 
          { return token(TokenType.KEYWORD2);
          }
        case 16: break;
        case 3: 
          { return token(TokenType.IDENTIFIER);
          }
        case 17: break;
        case 1: 
          { return token(TokenType.STRING);
          }
        case 18: break;
        case 9: 
          { return token(TokenType.COMMENT);
          }
        case 19: break;
        case 2: 
          { /* skip */
          }
        case 20: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
              {
                return null;
              }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}

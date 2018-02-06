/* The following code was generated by JFlex 1.4.3 on 06/02/18 22.34 */

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
 * on 06/02/18 22.34 from the specification file
 * <tt>C:/Users/Rum/Desktop/jsyntaxpane-master/jsyntaxpane/src/main/jflex/jsyntaxpane/lexers/xml.flex</tt>
 */
public final class XmlLexer extends DefaultJFlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int INSTR = 8;
  public static final int YYINITIAL = 0;
  public static final int COMMENT = 2;
  public static final int CDATA = 4;
  public static final int TAG = 6;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4, 4
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\1\1\2\2\0\1\2\22\0\1\1\1\4\1\24\1\30"+
    "\2\0\1\26\1\25\5\0\1\5\1\11\1\22\12\12\1\7\1\27"+
    "\1\3\1\23\1\6\1\13\1\0\1\17\1\7\1\15\1\16\1\7"+
    "\16\7\1\20\6\7\1\14\1\0\1\21\1\0\1\7\1\0\32\10"+
    "\74\0\1\11\10\0\27\0\1\0\37\0\1\0\u0208\0\160\0\16\0"+
    "\1\0\u02e1\0\12\31\206\0\12\31\306\0\12\31\u019c\0\12\31\166\0"+
    "\12\31\166\0\12\31\166\0\12\31\166\0\12\31\166\0\12\31\166\0"+
    "\12\31\166\0\12\31\166\0\12\31\340\0\12\31\166\0\12\31\106\0"+
    "\12\31\u0116\0\12\31\106\0\12\31\146\0\u06e0\0\12\31\46\0\12\31"+
    "\u012c\0\12\31\200\0\12\31\246\0\12\31\6\0\12\31\266\0\12\31"+
    "\126\0\12\31\206\0\12\31\6\0\12\31\u03a6\0\14\0\2\0\63\0"+
    "\57\0\u0120\0\u0a70\0\u03f0\0\21\0\u761f\0\12\31\u02a6\0\12\31\46\0"+
    "\12\31\306\0\12\31\166\0\12\31\u0196\0\12\31\u2c06\0\u0800\0\u1000\0"+
    "\u0900\0\u04d0\0\40\0\u0120\0\12\31\344\0\2\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\5\0\7\1\1\2\5\1\1\0\1\3\13\0\1\4"+
    "\1\5\1\0\1\6\1\0\1\7\2\0\1\10\1\0"+
    "\1\11\2\0\1\12\1\0\1\13\1\14\2\0\1\15"+
    "\1\16\4\0\1\17";

  private static int [] zzUnpackAction() {
    int [] result = new int[57];
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
    "\0\0\0\32\0\64\0\116\0\150\0\202\0\234\0\266"+
    "\0\320\0\352\0\u0104\0\u011e\0\202\0\u0138\0\u0152\0\u016c"+
    "\0\u0186\0\u01a0\0\u01ba\0\u01d4\0\u01ee\0\u0208\0\u0222\0\u023c"+
    "\0\320\0\u0256\0\u0270\0\u0104\0\u028a\0\u02a4\0\u0138\0\202"+
    "\0\202\0\u016c\0\202\0\u0186\0\202\0\u02be\0\u02d8\0\u02f2"+
    "\0\u030c\0\202\0\u0326\0\u0340\0\202\0\u035a\0\202\0\202"+
    "\0\u0374\0\u038e\0\202\0\202\0\u03a8\0\u03c2\0\u03dc\0\u03f6"+
    "\0\202";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[57];
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
    "\3\6\1\7\22\6\1\10\3\6\5\11\1\12\24\11"+
    "\21\13\1\14\10\13\6\6\1\15\2\16\4\6\4\16"+
    "\1\6\1\17\1\6\1\20\1\21\13\6\2\16\2\6"+
    "\1\22\1\6\4\16\3\6\1\20\1\21\4\6\36\0"+
    "\1\23\2\0\2\24\2\0\1\25\1\0\4\24\1\0"+
    "\1\26\17\0\1\27\17\0\1\30\1\0\5\31\1\32"+
    "\31\31\1\33\24\31\21\34\1\35\31\34\1\36\10\34"+
    "\5\0\1\37\1\0\4\37\2\0\4\37\2\0\1\40"+
    "\14\0\1\41\23\0\2\42\1\0\21\42\1\43\5\42"+
    "\2\44\1\0\22\44\1\43\4\44\6\0\1\45\30\0"+
    "\1\46\6\0\1\47\22\0\1\24\1\0\4\24\2\0"+
    "\4\24\20\0\2\50\4\0\4\50\20\0\2\51\4\0"+
    "\4\51\21\0\1\27\16\0\1\52\14\0\1\53\16\0"+
    "\1\53\5\31\1\54\31\31\1\54\1\55\23\31\21\34"+
    "\1\56\16\34\1\57\12\34\1\56\10\34\5\0\1\60"+
    "\41\0\1\61\21\0\1\50\1\0\4\50\2\0\4\50"+
    "\12\0\2\62\2\0\1\51\1\63\4\51\2\0\4\51"+
    "\23\0\1\53\14\0\1\52\1\0\1\53\5\31\1\54"+
    "\1\64\23\31\6\34\1\64\12\34\1\56\10\34\16\0"+
    "\1\65\14\0\2\62\3\0\1\63\42\0\1\66\32\0"+
    "\1\67\30\0\1\70\26\0\1\71\15\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1040];
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
    "\5\0\1\11\6\1\1\11\5\1\1\0\1\1\13\0"+
    "\2\11\1\0\1\11\1\0\1\11\2\0\1\1\1\0"+
    "\1\11\2\0\1\11\1\0\2\11\2\0\2\11\4\0"+
    "\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[57];
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
    public XmlLexer() {
        super();
    }

    @Override
    public int yychar() {
        return yychar;
    }

    private static final byte TAG_OPEN      =  1;
    private static final byte TAG_CLOSE     = -1;

    private static final byte INSTR_OPEN    =  2;
    private static final byte INSTR_CLOSE   = -2;

    private static final byte CDATA_OPEN    =  3;
    private static final byte CDATA_CLOSE   = -3;

    private static final byte COMMENT_OPEN  =  4;
    private static final byte COMMENT_CLOSE = -4;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public XmlLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public XmlLexer(java.io.InputStream in) {
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
    while (i < 274) {
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
        case 12: 
          { yybegin(COMMENT);
                                     return token(TokenType.COMMENT2, COMMENT_OPEN);
          }
        case 16: break;
        case 10: 
          { yybegin(YYINITIAL);
                                     return token(TokenType.COMMENT2, COMMENT_CLOSE);
          }
        case 17: break;
        case 5: 
          { yybegin(YYINITIAL);
                                     return token(TokenType.TYPE, TAG_CLOSE);
          }
        case 18: break;
        case 15: 
          { yybegin(CDATA);
                                     return token(TokenType.COMMENT2, CDATA_OPEN);
          }
        case 19: break;
        case 11: 
          { yybegin(YYINITIAL);
                                     return token(TokenType.COMMENT2, CDATA_CLOSE);
          }
        case 20: break;
        case 2: 
          { yybegin(YYINITIAL);
                                     return token(TokenType.TYPE);
          }
        case 21: break;
        case 9: 
          { return token(TokenType.KEYWORD2);
          }
        case 22: break;
        case 13: 
          { return token(TokenType.TYPE, TAG_CLOSE);
          }
        case 23: break;
        case 4: 
          { return token(TokenType.IDENTIFIER);
          }
        case 24: break;
        case 3: 
          { yybegin(TAG);
                                     return token(TokenType.TYPE, TAG_OPEN);
          }
        case 25: break;
        case 6: 
          { return token(TokenType.STRING);
          }
        case 26: break;
        case 14: 
          { yypushback(3);
                                     return token(TokenType.COMMENT);
          }
        case 27: break;
        case 7: 
          { yybegin(YYINITIAL);
                                     return token(TokenType.TYPE2, INSTR_CLOSE);
          }
        case 28: break;
        case 1: 
          { 
          }
        case 29: break;
        case 8: 
          { yybegin(INSTR);
                                     return token(TokenType.TYPE2, INSTR_OPEN);
          }
        case 30: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            switch (zzLexicalState) {
            case INSTR: {
              return null;
            }
            case 58: break;
            case YYINITIAL: {
              return null;
            }
            case 59: break;
            case COMMENT: {
              return null;
            }
            case 60: break;
            case CDATA: {
              return null;
            }
            case 61: break;
            case TAG: {
              return null;
            }
            case 62: break;
            default:
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

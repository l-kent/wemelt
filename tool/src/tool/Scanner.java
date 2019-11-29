/* The following code was generated by JFlex 1.6.1 */

package tool;

import beaver.Symbol;
import tool.Parser.Terminals;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>tool/src/tool/Scanner.flex</tt>
 */
class Scanner extends beaver.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\2\1\5\1\6\1\1\22\0\1\3\1\17\1\0"+
    "\1\7\1\0\1\21\1\27\1\0\1\11\1\12\1\10\1\22\1\33"+
    "\1\23\1\0\1\4\1\64\11\102\1\32\1\34\1\24\1\26\1\25"+
    "\2\0\1\75\3\101\1\73\1\74\1\62\1\77\1\100\2\101\1\51"+
    "\1\52\1\53\1\76\1\65\1\101\1\54\1\66\1\71\1\72\1\101"+
    "\1\55\3\101\1\13\1\0\1\14\1\30\1\50\1\0\1\57\1\67"+
    "\1\47\1\35\1\43\1\44\1\101\1\40\1\41\2\101\1\42\1\63"+
    "\1\46\1\36\2\101\1\60\1\45\1\61\1\101\1\56\1\37\1\101"+
    "\1\70\1\101\1\15\1\31\1\16\1\20\6\0\1\5\u1fa2\0\1\5"+
    "\1\5\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\1\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\12\31\1\32\3\31\2\0\2\2\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\31\1\45\3\31\1\46\10\31\1\47\3\31"+
    "\2\0\1\50\12\31\1\51\1\31\1\52\3\31\1\0"+
    "\1\31\1\53\3\31\1\54\2\31\1\55\1\31\1\56"+
    "\1\57\1\31\1\60\1\61\1\62\1\31\1\63\3\31"+
    "\1\64\1\31\1\65\1\66\3\31\1\67\1\31\1\70"+
    "\1\31\1\71";

  private static int [] zzUnpackAction() {
    int [] result = new int[125];
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
    "\0\0\0\103\0\206\0\311\0\u010c\0\103\0\103\0\103"+
    "\0\103\0\103\0\103\0\103\0\u014f\0\103\0\103\0\103"+
    "\0\u0192\0\u01d5\0\u0218\0\u025b\0\u029e\0\103\0\u02e1\0\103"+
    "\0\103\0\103\0\u0324\0\u0367\0\u03aa\0\u03ed\0\u0430\0\u0473"+
    "\0\u04b6\0\u04f9\0\u053c\0\u057f\0\u05c2\0\u0605\0\u0648\0\u068b"+
    "\0\u010c\0\u06ce\0\u0711\0\103\0\103\0\103\0\103\0\103"+
    "\0\u0754\0\103\0\103\0\103\0\103\0\u0367\0\u0797\0\u0367"+
    "\0\u07da\0\u081d\0\u0860\0\u0367\0\u08a3\0\u08e6\0\u0929\0\u096c"+
    "\0\u09af\0\u09f2\0\u0a35\0\u0a78\0\u0367\0\u0abb\0\u0afe\0\u0b41"+
    "\0\u0b84\0\u0bc7\0\103\0\u0c0a\0\u0c4d\0\u0c90\0\u0cd3\0\u0d16"+
    "\0\u0d59\0\u0d9c\0\u0ddf\0\u0e22\0\u0e65\0\u0367\0\u0ea8\0\u0367"+
    "\0\u0eeb\0\u0f2e\0\u0f71\0\u0fb4\0\u0ff7\0\u0367\0\u103a\0\u107d"+
    "\0\u10c0\0\u0367\0\u1103\0\u1146\0\u0367\0\u1189\0\u0367\0\u0367"+
    "\0\u11cc\0\u0367\0\u0367\0\u0367\0\u120f\0\u0367\0\u1252\0\u1295"+
    "\0\u12d8\0\u0367\0\u131b\0\u0367\0\u135e\0\u13a1\0\u13e4\0\u1427"+
    "\0\u0367\0\u146a\0\u0367\0\u14ad\0\u0367";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[125];
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
    "\1\2\3\3\1\4\1\2\1\3\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\1\35\1\34\1\36"+
    "\1\34\1\37\1\40\3\34\1\41\1\42\1\34\1\43"+
    "\1\44\7\34\1\45\4\34\1\46\2\34\1\47\2\34"+
    "\1\50\2\34\1\45\104\0\3\3\2\0\1\3\100\0"+
    "\1\51\3\0\1\52\72\0\1\51\1\53\1\54\2\51"+
    "\2\0\74\51\26\0\1\55\101\0\1\56\101\0\1\57"+
    "\1\0\1\60\101\0\1\61\1\62\102\0\1\63\103\0"+
    "\1\64\104\0\1\65\106\0\1\34\1\66\44\34\35\0"+
    "\46\34\35\0\3\34\1\67\42\34\35\0\7\34\1\70"+
    "\36\34\35\0\5\34\1\71\40\34\35\0\6\34\1\72"+
    "\37\34\35\0\4\34\1\73\7\34\1\74\1\75\3\34"+
    "\1\76\1\77\2\34\1\100\2\34\1\101\1\102\14\34"+
    "\35\0\41\34\1\103\4\34\35\0\1\34\1\104\44\34"+
    "\35\0\20\34\1\105\25\34\64\0\1\45\15\0\1\45"+
    "\35\0\17\34\1\106\26\34\35\0\40\34\1\107\5\34"+
    "\35\0\43\34\1\110\2\34\10\111\1\112\72\111\2\0"+
    "\1\54\125\0\1\113\112\0\4\34\1\114\41\34\35\0"+
    "\10\34\1\115\35\34\35\0\11\34\1\116\34\34\35\0"+
    "\11\34\1\117\34\34\35\0\1\34\1\120\44\34\35\0"+
    "\22\34\1\121\23\34\35\0\23\34\1\122\22\34\35\0"+
    "\22\34\1\123\23\34\35\0\13\34\1\124\32\34\35\0"+
    "\24\34\1\125\21\34\35\0\20\34\1\126\25\34\35\0"+
    "\17\34\1\127\1\130\25\34\35\0\35\34\1\131\10\34"+
    "\35\0\14\34\1\132\31\34\35\0\25\34\1\133\20\34"+
    "\10\111\1\134\72\111\4\0\1\54\3\0\1\112\127\0"+
    "\5\34\1\135\40\34\35\0\6\34\1\136\37\34\35\0"+
    "\12\34\1\137\33\34\35\0\21\34\1\140\24\34\35\0"+
    "\1\141\45\34\35\0\23\34\1\142\22\34\35\0\23\34"+
    "\1\143\22\34\35\0\26\34\1\144\17\34\35\0\27\34"+
    "\1\145\16\34\35\0\22\34\1\146\23\34\35\0\20\34"+
    "\1\147\25\34\35\0\36\34\1\150\7\34\35\0\31\34"+
    "\1\151\14\34\35\0\42\34\1\152\3\34\4\111\1\54"+
    "\3\111\1\134\72\111\35\0\6\34\1\153\37\34\35\0"+
    "\6\34\1\154\37\34\35\0\22\34\1\155\23\34\35\0"+
    "\6\34\1\156\37\34\35\0\22\34\1\157\23\34\35\0"+
    "\26\34\1\160\17\34\35\0\32\34\1\161\13\34\35\0"+
    "\36\34\1\162\7\34\35\0\23\34\1\163\22\34\35\0"+
    "\33\34\1\164\12\34\35\0\22\34\1\165\23\34\35\0"+
    "\5\34\1\166\40\34\35\0\4\34\1\167\41\34\35\0"+
    "\13\34\1\170\32\34\35\0\6\34\1\171\37\34\35\0"+
    "\22\34\1\172\23\34\35\0\27\34\1\173\16\34\35\0"+
    "\11\34\1\174\34\34\35\0\24\34\1\175\21\34";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5360];
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
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\3\1\7\11\1\1\3\11\5\1\1\11"+
    "\1\1\3\11\16\1\2\0\1\1\5\11\1\1\4\11"+
    "\23\1\2\0\1\11\20\1\1\0\41\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[125];
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
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    Symbol resolve(String name) {
      if (name.matches("r[0-9]+") || name.startsWith("r_")) {
          return newToken(Terminals.REG_ID, name);
      } else {
          return newToken(Terminals.ID,   name);
      }
    }

	Symbol newToken(short id)
	{
		return newToken(id, yytext());
	}

	Symbol newToken(short id, Object value)
	{
		return new Symbol(id, yyline + 1, yycolumn + 1, yylength(), value);
	}


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Scanner(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 216) {
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
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
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
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
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
   * Internal scan buffer is resized down to its initial length, if it has grown.
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
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
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
  public Symbol nextToken() throws java.io.IOException, Scanner.Exception {
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

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
          { 	return newToken(Terminals.EOF);
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { throw new Scanner.Exception("unexpected character '" + yytext() + "'");
            }
          case 58: break;
          case 2: 
            { 
            }
          case 59: break;
          case 3: 
            { return newToken(Terminals.DIV);
            }
          case 60: break;
          case 4: 
            { return newToken(Terminals.STAR);
            }
          case 61: break;
          case 5: 
            { return newToken(Terminals.LPAREN);
            }
          case 62: break;
          case 6: 
            { return newToken(Terminals.RPAREN);
            }
          case 63: break;
          case 7: 
            { return newToken(Terminals.LBRACK);
            }
          case 64: break;
          case 8: 
            { return newToken(Terminals.RBRACK);
            }
          case 65: break;
          case 9: 
            { return newToken(Terminals.LBRACE);
            }
          case 66: break;
          case 10: 
            { return newToken(Terminals.RBRACE);
            }
          case 67: break;
          case 11: 
            { return newToken(Terminals.BANG);
            }
          case 68: break;
          case 12: 
            { return newToken(Terminals.TILDE);
            }
          case 69: break;
          case 13: 
            { return newToken(Terminals.MOD);
            }
          case 70: break;
          case 14: 
            { return newToken(Terminals.PLUS);
            }
          case 71: break;
          case 15: 
            { return newToken(Terminals.MINUS);
            }
          case 72: break;
          case 16: 
            { return newToken(Terminals.LT);
            }
          case 73: break;
          case 17: 
            { return newToken(Terminals.GT);
            }
          case 74: break;
          case 18: 
            { return newToken(Terminals.ASG);
            }
          case 75: break;
          case 19: 
            { return newToken(Terminals.AMP);
            }
          case 76: break;
          case 20: 
            { return newToken(Terminals.CARET);
            }
          case 77: break;
          case 21: 
            { return newToken(Terminals.PIPE);
            }
          case 78: break;
          case 22: 
            { return newToken(Terminals.COLON);
            }
          case 79: break;
          case 23: 
            { return newToken(Terminals.COMMA);
            }
          case 80: break;
          case 24: 
            { return newToken(Terminals.SEMICOLON);
            }
          case 81: break;
          case 25: 
            { return resolve(yytext());
            }
          case 82: break;
          case 26: 
            { return newToken(Terminals.NUM, new Integer(yytext()));
            }
          case 83: break;
          case 27: 
            { return newToken(Terminals.NEQ);
            }
          case 84: break;
          case 28: 
            { return newToken(Terminals.MAPSTO);
            }
          case 85: break;
          case 29: 
            { return newToken(Terminals.SHL);
            }
          case 86: break;
          case 30: 
            { return newToken(Terminals.LE);
            }
          case 87: break;
          case 31: 
            { return newToken(Terminals.SHR);
            }
          case 88: break;
          case 32: 
            { return newToken(Terminals.GE);
            }
          case 89: break;
          case 33: 
            { return newToken(Terminals.EQ);
            }
          case 90: break;
          case 34: 
            { return newToken(Terminals.AND);
            }
          case 91: break;
          case 35: 
            { return newToken(Terminals.OR);
            }
          case 92: break;
          case 36: 
            { return newToken(Terminals.DO);
            }
          case 93: break;
          case 37: 
            { return newToken(Terminals.IF);
            }
          case 94: break;
          case 38: 
            { return newToken(Terminals.LPRED);
            }
          case 95: break;
          case 39: 
            { return newToken(Terminals.RW);
            }
          case 96: break;
          case 40: 
            { return newToken(Terminals.ASHR);
            }
          case 97: break;
          case 41: 
            { return newToken(Terminals.LOW);
            }
          case 98: break;
          case 42: 
            { return newToken(Terminals.NOW);
            }
          case 99: break;
          case 43: 
            { return newToken(Terminals.ELSE);
            }
          case 100: break;
          case 44: 
            { return newToken(Terminals.VAR);
            }
          case 101: break;
          case 45: 
            { return newToken(Terminals.P_0);
            }
          case 102: break;
          case 46: 
            { return newToken(Terminals.NORW);
            }
          case 103: break;
          case 47: 
            { return newToken(Terminals.TRUE);
            }
          case 104: break;
          case 48: 
            { return newToken(Terminals.HIGH);
            }
          case 105: break;
          case 49: 
            { return newToken(Terminals.WHILE);
            }
          case 106: break;
          case 50: 
            { return newToken(Terminals.FENCE);
            }
          case 107: break;
          case 51: 
            { return newToken(Terminals.MODE);
            }
          case 108: break;
          case 52: 
            { return newToken(Terminals.FALSE);
            }
          case 109: break;
          case 53: 
            { return newToken(Terminals.ARRAY);
            }
          case 110: break;
          case 54: 
            { return newToken(Terminals.GAMMA);
            }
          case 111: break;
          case 55: 
            { return newToken(Terminals.STABLE);
            }
          case 112: break;
          case 56: 
            { return newToken(Terminals.GAMMA_0);
            }
          case 113: break;
          case 57: 
            { return newToken(Terminals.INVARIANT);
            }
          case 114: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
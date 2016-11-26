/* The following code was generated by JFlex 1.4.4 on 11/26/16 3:33 PM */

package consulo.fsharp.lang.lexer;

import com.intellij.lexer.LexerBase;
import com.intellij.psi.tree.IElementType;
import consulo.fsharp.lang.psi.FSharpTokenTypes;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.4
 * on 11/26/16 3:33 PM from the specification file
 * <tt>R:/_github.com/consulo/consulo-fsharp/src/consulo/fsharp/lang/lexer/fsharp.flex</tt>
 */
public class _FSharpLexer extends LexerBase {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int PREPROCESSOR_DIRECTIVE = 2;

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
    "\11\1\1\0\1\3\1\0\1\4\1\2\16\1\4\0\1\4\1\0"+
    "\1\0\1\0\1\7\2\0\1\0\2\0\1\0\1\0\1\0\1\0"+
    "\1\11\1\5\1\1\11\1\6\0\1\6\1\7\1\7\1\7\1\7"+
    "\1\7\1\7\5\7\1\7\1\7\2\7\1\7\4\7\1\7\2\7"+
    "\1\7\2\7\1\0\1\0\2\0\1\7\1\0\1\7\1\7\1\7"+
    "\1\7\1\14\1\7\5\7\1\16\1\7\1\15\1\12\1\13\3\7"+
    "\1\10\1\7\1\7\1\17\1\7\2\7\4\0\41\1\2\0\4\7"+
    "\4\0\1\7\2\0\1\1\7\0\1\7\4\0\1\7\5\0\27\7"+
    "\1\0\37\7\1\0\u01ca\7\4\0\14\7\16\0\5\7\7\0\1\7"+
    "\1\0\1\7\21\0\160\1\5\7\1\0\2\7\2\0\4\7\10\0"+
    "\1\7\1\0\3\7\1\0\1\7\1\0\24\7\1\0\123\7\1\0"+
    "\213\7\1\0\5\1\2\0\236\7\11\0\46\7\2\0\1\7\7\0"+
    "\47\7\7\0\1\7\1\0\55\1\1\0\1\1\1\0\2\1\1\0"+
    "\2\1\1\0\1\1\10\0\33\7\5\0\3\7\15\0\5\1\6\0"+
    "\1\7\4\0\13\1\5\0\53\7\37\1\4\0\2\7\1\1\143\7"+
    "\1\0\1\7\10\1\1\0\6\1\2\7\2\1\1\0\4\1\2\7"+
    "\12\1\3\7\2\0\1\7\17\0\1\1\1\7\1\1\36\7\33\1"+
    "\2\0\131\7\13\1\1\7\16\0\12\1\41\7\11\1\2\7\4\0"+
    "\1\7\5\0\26\7\4\1\1\7\11\1\1\7\3\1\1\7\5\1"+
    "\22\0\31\7\3\1\104\0\1\7\1\0\13\7\67\0\33\1\1\0"+
    "\4\1\66\7\3\1\1\7\22\1\1\7\7\1\12\7\2\1\2\0"+
    "\12\1\1\0\7\7\1\0\7\7\1\0\3\1\1\0\10\7\2\0"+
    "\2\7\2\0\26\7\1\0\7\7\1\0\1\7\3\0\4\7\2\0"+
    "\1\1\1\7\7\1\2\0\2\1\2\0\3\1\1\7\10\0\1\1"+
    "\4\0\2\7\1\0\3\7\2\1\2\0\12\1\4\7\7\0\1\7"+
    "\5\0\3\1\1\0\6\7\4\0\2\7\2\0\26\7\1\0\7\7"+
    "\1\0\2\7\1\0\2\7\1\0\2\7\2\0\1\1\1\0\5\1"+
    "\4\0\2\1\2\0\3\1\3\0\1\1\7\0\4\7\1\0\1\7"+
    "\7\0\14\1\3\7\1\1\13\0\3\1\1\0\11\7\1\0\3\7"+
    "\1\0\26\7\1\0\7\7\1\0\2\7\1\0\5\7\2\0\1\1"+
    "\1\7\10\1\1\0\3\1\1\0\3\1\2\0\1\7\17\0\2\7"+
    "\2\1\2\0\12\1\1\0\1\7\17\0\3\1\1\0\10\7\2\0"+
    "\2\7\2\0\26\7\1\0\7\7\1\0\2\7\1\0\5\7\2\0"+
    "\1\1\1\7\7\1\2\0\2\1\2\0\3\1\10\0\2\1\4\0"+
    "\2\7\1\0\3\7\2\1\2\0\12\1\1\0\1\7\20\0\1\1"+
    "\1\7\1\0\6\7\3\0\3\7\1\0\4\7\3\0\2\7\1\0"+
    "\1\7\1\0\2\7\3\0\2\7\3\0\3\7\3\0\14\7\4\0"+
    "\5\1\3\0\3\1\1\0\4\1\2\0\1\7\6\0\1\1\16\0"+
    "\12\1\11\0\1\7\7\0\3\1\1\0\10\7\1\0\3\7\1\0"+
    "\27\7\1\0\12\7\1\0\5\7\3\0\1\7\7\1\1\0\3\1"+
    "\1\0\4\1\7\0\2\1\1\0\2\7\6\0\2\7\2\1\2\0"+
    "\12\1\22\0\2\1\1\0\10\7\1\0\3\7\1\0\27\7\1\0"+
    "\12\7\1\0\5\7\2\0\1\1\1\7\7\1\1\0\3\1\1\0"+
    "\4\1\7\0\2\1\7\0\1\7\1\0\2\7\2\1\2\0\12\1"+
    "\1\0\2\7\17\0\2\1\1\0\10\7\1\0\3\7\1\0\51\7"+
    "\2\0\1\7\7\1\1\0\3\1\1\0\4\1\1\7\10\0\1\1"+
    "\10\0\2\7\2\1\2\0\12\1\12\0\6\7\2\0\2\1\1\0"+
    "\22\7\3\0\30\7\1\0\11\7\1\0\1\7\2\0\7\7\3\0"+
    "\1\1\4\0\6\1\1\0\1\1\1\0\10\1\22\0\2\1\15\0"+
    "\60\7\1\1\2\7\7\1\4\0\10\7\10\1\1\0\12\1\47\0"+
    "\2\7\1\0\1\7\2\0\2\7\1\0\1\7\2\0\1\7\6\0"+
    "\4\7\1\0\7\7\1\0\3\7\1\0\1\7\1\0\1\7\2\0"+
    "\2\7\1\0\4\7\1\1\2\7\6\1\1\0\2\1\1\7\2\0"+
    "\5\7\1\0\1\7\1\0\6\1\2\0\12\1\2\0\4\7\40\0"+
    "\1\7\27\0\2\1\6\0\12\1\13\0\1\1\1\0\1\1\1\0"+
    "\1\1\4\0\2\1\10\7\1\0\44\7\4\0\24\1\1\0\2\1"+
    "\5\7\13\1\1\0\44\1\11\0\1\1\71\0\53\7\24\1\1\7"+
    "\12\1\6\0\6\7\4\1\4\7\3\1\1\7\3\1\2\7\7\1"+
    "\3\7\4\1\15\7\14\1\1\7\17\1\2\0\46\7\1\0\1\7"+
    "\5\0\1\7\2\0\53\7\1\0\u014d\7\1\0\4\7\2\0\7\7"+
    "\1\0\1\7\1\0\4\7\2\0\51\7\1\0\4\7\2\0\41\7"+
    "\1\0\4\7\2\0\7\7\1\0\1\7\1\0\4\7\2\0\17\7"+
    "\1\0\71\7\1\0\4\7\2\0\103\7\2\0\3\1\40\0\20\7"+
    "\20\0\125\7\14\0\u026c\7\2\0\21\7\1\0\32\7\5\0\113\7"+
    "\3\0\3\7\17\0\15\7\1\0\4\7\3\1\13\0\22\7\3\1"+
    "\13\0\22\7\2\1\14\0\15\7\1\0\3\7\1\0\2\1\14\0"+
    "\64\7\40\1\3\0\1\7\3\0\2\7\1\1\2\0\12\1\41\0"+
    "\3\1\2\0\12\1\6\0\130\7\10\0\51\7\1\1\1\7\5\0"+
    "\106\7\12\0\35\7\3\0\14\1\4\0\14\1\12\0\12\1\36\7"+
    "\2\0\5\7\13\0\54\7\4\0\21\1\7\7\2\1\6\0\12\1"+
    "\46\0\27\7\5\1\4\0\65\7\12\1\1\0\35\1\2\0\13\1"+
    "\6\0\12\1\15\0\1\7\130\0\5\1\57\7\21\1\7\7\4\0"+
    "\12\1\21\0\11\1\14\0\3\1\36\7\15\1\2\7\12\1\54\7"+
    "\16\1\14\0\44\7\24\1\10\0\12\1\3\0\3\7\12\1\44\7"+
    "\122\0\3\1\1\0\25\1\4\7\1\1\4\7\3\1\2\7\11\0"+
    "\300\7\47\1\25\0\4\1\u0116\7\2\0\6\7\2\0\46\7\2\0"+
    "\6\7\2\0\10\7\1\0\1\7\1\0\1\7\1\0\1\7\1\0"+
    "\37\7\2\0\65\7\1\0\7\7\1\0\1\7\3\0\3\7\1\0"+
    "\7\7\3\0\4\7\2\0\6\7\4\0\15\7\5\0\3\7\1\0"+
    "\7\7\16\0\5\1\32\0\5\1\20\0\2\7\23\0\1\7\13\0"+
    "\5\1\5\0\6\1\1\0\1\7\15\0\1\7\20\0\15\7\3\0"+
    "\33\7\25\0\15\1\4\0\1\1\3\0\14\1\21\0\1\7\4\0"+
    "\1\7\2\0\12\7\1\0\1\7\3\0\5\7\6\0\1\7\1\0"+
    "\1\7\1\0\1\7\1\0\4\7\1\0\13\7\2\0\4\7\5\0"+
    "\5\7\4\0\1\7\21\0\51\7\u0a77\0\57\7\1\0\57\7\1\0"+
    "\205\7\6\0\4\7\3\1\2\7\14\0\46\7\1\0\1\7\5\0"+
    "\1\7\2\0\70\7\7\0\1\7\17\0\1\1\27\7\11\0\7\7"+
    "\1\0\7\7\1\0\7\7\1\0\7\7\1\0\7\7\1\0\7\7"+
    "\1\0\7\7\1\0\7\7\1\0\40\1\57\0\1\7\u01d5\0\3\7"+
    "\31\0\11\7\6\1\1\0\5\7\2\0\5\7\4\0\126\7\2\0"+
    "\2\1\2\0\3\7\1\0\132\7\1\0\4\7\5\0\51\7\3\0"+
    "\136\7\21\0\33\7\65\0\20\7\u0200\0\u19b6\7\112\0\u51cd\7\63\0"+
    "\u048d\7\103\0\56\7\2\0\u010d\7\3\0\20\7\12\1\2\7\24\0"+
    "\57\7\1\1\4\0\12\1\1\0\31\7\7\0\1\1\120\7\2\1"+
    "\45\0\11\7\2\0\147\7\2\0\4\7\1\0\4\7\14\0\13\7"+
    "\115\0\12\7\1\1\3\7\1\1\4\7\1\1\27\7\5\1\20\0"+
    "\1\7\7\0\64\7\14\0\2\1\62\7\21\1\13\0\12\1\6\0"+
    "\22\1\6\7\3\0\1\7\4\0\12\1\34\7\10\1\2\0\27\7"+
    "\15\1\14\0\35\7\3\0\4\1\57\7\16\1\16\0\1\7\12\1"+
    "\46\0\51\7\16\1\11\0\3\7\1\1\10\7\2\1\2\0\12\1"+
    "\6\0\27\7\3\0\1\7\1\1\4\0\60\7\1\1\1\7\3\1"+
    "\2\7\2\1\5\7\2\1\1\7\1\1\1\7\30\0\3\7\2\0"+
    "\13\7\5\1\2\0\3\7\2\1\12\0\6\7\2\0\6\7\2\0"+
    "\6\7\11\0\7\7\1\0\7\7\221\0\43\7\10\1\1\0\2\1"+
    "\2\0\12\1\6\0\u2ba4\7\14\0\27\7\4\0\61\7\u2104\0\u016e\7"+
    "\2\0\152\7\46\0\7\7\14\0\5\7\5\0\1\7\1\1\12\7"+
    "\1\0\15\7\1\0\5\7\1\0\1\7\1\0\2\7\1\0\2\7"+
    "\1\0\154\7\41\0\u016b\7\22\0\100\7\2\0\66\7\50\0\15\7"+
    "\3\0\20\1\20\0\7\1\14\0\2\7\30\0\3\7\31\0\1\7"+
    "\6\0\5\7\1\0\207\7\2\0\1\1\4\0\1\7\13\0\12\1"+
    "\7\0\32\7\4\0\1\7\1\0\32\7\13\0\131\7\3\0\6\7"+
    "\2\0\6\7\2\0\6\7\2\0\3\7\3\0\2\7\3\0\2\7"+
    "\22\0\3\1\4\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\2\2\1\3\2\1\2\4\1\5\3\4"+
    "\1\6\4\4\1\7\1\10\1\11";

  private static int [] zzUnpackAction() {
    int [] result = new int[22];
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
    "\0\0\0\20\0\20\0\40\0\20\0\60\0\100\0\120"+
    "\0\140\0\160\0\20\0\200\0\220\0\240\0\260\0\300"+
    "\0\320\0\340\0\360\0\140\0\140\0\140";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[22];
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
    "\2\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12"+
    "\1\13\1\14\2\11\1\15\1\16\1\11\23\0\1\5"+
    "\20\0\1\6\3\0\1\6\14\0\1\17\21\0\2\11"+
    "\1\0\6\11\1\0\1\11\5\0\2\11\1\0\6\11"+
    "\1\0\1\11\2\0\1\6\2\0\1\11\1\12\1\0"+
    "\6\11\1\0\1\11\5\0\2\11\1\0\1\11\1\20"+
    "\4\11\1\0\1\11\5\0\2\11\1\0\2\11\1\21"+
    "\3\11\1\0\1\11\5\0\2\11\1\0\2\11\1\22"+
    "\3\11\2\17\2\0\14\17\1\0\1\11\5\0\2\11"+
    "\1\0\2\11\1\23\3\11\1\0\1\11\5\0\2\11"+
    "\1\0\5\11\1\24\1\0\1\11\5\0\1\11\1\25"+
    "\1\0\6\11\1\0\1\11\5\0\2\11\1\0\3\11"+
    "\1\26\2\11";

  private static int [] zzUnpackTrans() {
    int [] result = new int[256];
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
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;

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
    "\1\0\1\10\1\11\1\1\1\11\5\1\1\11\13\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[22];
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

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  private IElementType myTokenType;
  private int myState;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;



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
    while (i < 2246) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  @Override
  public IElementType getTokenType() {
    if (myTokenType == null) locateToken();
    return myTokenType;
  }

  @Override
  public final int getTokenStart(){
    if (myTokenType == null) locateToken();
    return zzStartRead;
  }

  @Override
  public final int getTokenEnd(){
    if (myTokenType == null) locateToken();
    return getTokenStart() + yylength();
  }

  @Override
  public void advance() {
    if (myTokenType == null) locateToken();
    myTokenType = null;
  }

  @Override
  public int getState() {
    if (myTokenType == null) locateToken();
    return myState;
  }

  @Override
  public void start(final CharSequence buffer, int startOffset, int endOffset, final int initialState) {
    reset(buffer, startOffset, endOffset, initialState);
    myTokenType = null;
  }

   @Override
   public CharSequence getBufferSequence() {
     return zzBuffer;
   }

   @Override
   public int getBufferEnd() {
     return zzEndRead;
   }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
    myTokenType = null;
  }

   protected void locateToken() {
     if (myTokenType != null) return;
     try {
       myState = yystate();
       myTokenType = advanceImpl();
     }
     catch (java.io.IOException e) { /*Can't happen*/ }
     catch (Error e) {
       // add lexer class name to the error
       final Error error = new Error(getClass().getName() + ": " + e.getMessage());
       error.setStackTrace(e.getStackTrace());
       throw error;
     }
   }

   /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
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
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
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
    return zzBuffer.charAt(zzStartRead+pos);
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
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advanceImpl() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL.charAt(zzCurrentPosL++);
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
              zzInput = zzBufferL.charAt(zzCurrentPosL++);
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
        case 1: 
          { return FSharpTokenTypes.BAD_CHARACTER;
          }
        case 10: break;
        case 3: 
          { return FSharpTokenTypes.WHITE_SPACE;
          }
        case 11: break;
        case 2: 
          { return FSharpTokenTypes.EOF;
          }
        case 12: break;
        case 6: 
          { return FSharpTokenTypes.LINE_COMMENT;
          }
        case 13: break;
        case 8: 
          { return FSharpTokenTypes.LET_KEYWORD;
          }
        case 14: break;
        case 7: 
          { return FSharpTokenTypes.NEW_KEYWORD;
          }
        case 15: break;
        case 9: 
          { return FSharpTokenTypes.OPEN_KEYWORD;
          }
        case 16: break;
        case 5: 
          { return FSharpTokenTypes.DOT;
          }
        case 17: break;
        case 4: 
          { return FSharpTokenTypes.IDENTIFIER;
          }
        case 18: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
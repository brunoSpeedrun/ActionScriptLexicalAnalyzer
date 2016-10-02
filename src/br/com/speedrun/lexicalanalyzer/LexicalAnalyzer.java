/* The following code was generated by JFlex 1.6.1 */

package br.com.speedrun.lexicalanalyzer;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>C:/Users/Bruno Moura/workspace/ActionScriptLexicalAnalyzer/src/br/com/speedrun/lexicalanalyzer/action_script.lex</tt>
 * @author Bruno Moura
 * @author Maycon Leandro
 */
public class LexicalAnalyzer {

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
    "\11\0\1\1\1\1\1\63\1\63\1\1\22\0\1\40\1\25\3\0"+
    "\1\22\1\0\1\0\1\7\1\10\1\21\1\17\1\6\1\20\1\5"+
    "\1\4\1\27\11\3\1\16\1\15\1\26\1\23\1\24\2\0\1\2"+
    "\1\61\13\2\1\62\4\2\1\60\7\2\1\11\1\0\1\12\1\0"+
    "\1\2\1\0\1\32\1\55\1\30\1\46\1\41\1\35\1\50\1\42"+
    "\1\34\1\2\1\53\1\31\1\51\1\43\1\36\1\52\1\2\1\37"+
    "\1\33\1\44\1\47\1\54\1\56\1\45\1\57\1\2\1\13\1\1"+
    "\1\14\7\0\1\63\u1fa2\0\1\63\1\63\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\1\1\26"+
    "\1\4\3\3\1\27\1\30\1\31\1\32\1\33\1\34"+
    "\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\3"+
    "\1\44\1\3\1\45\1\46\1\3\1\47\1\3\1\0"+
    "\1\50\u0119\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[332];
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
    "\0\0\0\64\0\64\0\150\0\234\0\320\0\64\0\64"+
    "\0\64\0\64\0\64\0\64\0\64\0\64\0\64\0\u0104"+
    "\0\u0138\0\u016c\0\u01a0\0\u01d4\0\u0208\0\u023c\0\u0270\0\u02a4"+
    "\0\64\0\u02d8\0\u030c\0\u0340\0\64\0\64\0\64\0\64"+
    "\0\64\0\64\0\64\0\64\0\64\0\u0374\0\64\0\u03a8"+
    "\0\64\0\u03dc\0\150\0\u0410\0\64\0\64\0\u0444\0\u0478"+
    "\0\u04ac\0\u04e0\0\150\0\u0514\0\u0548\0\u057c\0\u05b0\0\u05e4"+
    "\0\u0618\0\u064c\0\u0680\0\u06b4\0\u06e8\0\u071c\0\u0750\0\u0784"+
    "\0\u07b8\0\u07ec\0\u0820\0\u0854\0\u0888\0\u08bc\0\u08f0\0\u0924"+
    "\0\u0958\0\u098c\0\u09c0\0\u09f4\0\u0a28\0\u0a5c\0\u0a90\0\u0ac4"+
    "\0\u0af8\0\u0b2c\0\u0b60\0\u0b94\0\u0bc8\0\u0bfc\0\u0c30\0\u0c64"+
    "\0\u0c98\0\u0ccc\0\u0d00\0\u0d34\0\u0d68\0\u0d9c\0\u0dd0\0\u0e04"+
    "\0\u0e38\0\u0e6c\0\u0ea0\0\u0ed4\0\u0f08\0\u0f3c\0\u0f70\0\u0fa4"+
    "\0\u0fd8\0\u100c\0\u1040\0\u1074\0\u10a8\0\u10dc\0\u1110\0\u1144"+
    "\0\u1178\0\u11ac\0\u11e0\0\u1214\0\u1248\0\u127c\0\u12b0\0\u12e4"+
    "\0\u1318\0\u134c\0\u1380\0\u13b4\0\u13e8\0\u141c\0\u1450\0\u1484"+
    "\0\u14b8\0\u14ec\0\u1520\0\u1554\0\u1588\0\u15bc\0\u15f0\0\u1624"+
    "\0\u1658\0\u168c\0\u16c0\0\u16f4\0\u1728\0\u175c\0\u1790\0\u17c4"+
    "\0\u17f8\0\u182c\0\u1860\0\u1894\0\u18c8\0\u18fc\0\u1930\0\u1964"+
    "\0\u1998\0\u19cc\0\u1a00\0\u1a34\0\u1a68\0\u1a9c\0\u1ad0\0\u1b04"+
    "\0\u1b38\0\u1b6c\0\u1ba0\0\u1bd4\0\u1c08\0\u1c3c\0\u1c70\0\u1ca4"+
    "\0\u1cd8\0\u1d0c\0\u1d40\0\u1d74\0\u1da8\0\u1ddc\0\u1e10\0\u1e44"+
    "\0\u1e78\0\u1eac\0\u1ee0\0\u1f14\0\u1f48\0\u1f7c\0\u1fb0\0\u1fe4"+
    "\0\u2018\0\u204c\0\u2080\0\u20b4\0\u20e8\0\u211c\0\u2150\0\u2184"+
    "\0\u21b8\0\u21ec\0\u2220\0\u2254\0\u2288\0\u22bc\0\u22f0\0\u2324"+
    "\0\u2358\0\u238c\0\u23c0\0\u23f4\0\u2428\0\u245c\0\u2490\0\u24c4"+
    "\0\u24f8\0\u252c\0\u2560\0\u2594\0\u25c8\0\u25fc\0\u2630\0\u2664"+
    "\0\u2698\0\u26cc\0\u2700\0\u2734\0\u2768\0\u279c\0\u27d0\0\u2804"+
    "\0\u2838\0\u286c\0\u28a0\0\u28d4\0\u2908\0\u293c\0\u2970\0\u29a4"+
    "\0\u29d8\0\u2a0c\0\u2a40\0\u2a74\0\u2aa8\0\u2adc\0\u2b10\0\u2b44"+
    "\0\u2b78\0\u2bac\0\u2be0\0\u2c14\0\u2c48\0\u2c7c\0\u2cb0\0\u2ce4"+
    "\0\u2d18\0\u2d4c\0\u2d80\0\u2db4\0\u2de8\0\u2e1c\0\u2e50\0\u2e84"+
    "\0\u2eb8\0\u2eec\0\u2f20\0\u2f54\0\u2f88\0\u2fbc\0\u2ff0\0\u3024"+
    "\0\u3058\0\u308c\0\u30c0\0\u30f4\0\u3128\0\u315c\0\u3190\0\u31c4"+
    "\0\u31f8\0\u322c\0\u3260\0\u3294\0\u32c8\0\u32fc\0\u3330\0\u3364"+
    "\0\u3398\0\u33cc\0\u3400\0\u3434\0\u3468\0\u349c\0\u34d0\0\u3504"+
    "\0\u3538\0\u356c\0\u35a0\0\u35d4\0\u3608\0\u363c\0\u3670\0\u36a4"+
    "\0\u36d8\0\u370c\0\u3740\0\u3774\0\u37a8\0\u37dc\0\u3810\0\u3844"+
    "\0\u3878\0\u38ac\0\u38e0\0\u3914\0\u3948\0\u397c\0\u39b0\0\u39e4"+
    "\0\u3a18\0\u3a4c\0\u3a80\0\u3ab4\0\u3ae8\0\u3b1c\0\u3b50\0\u3b84"+
    "\0\u3bb8\0\u3bec\0\u3c20\0\u3c54\0\u3c88\0\u3cbc\0\u3cf0\0\u3d24"+
    "\0\u3d58\0\u3d8c\0\u3dc0\0\u3df4";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[332];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\3\4\1\33\1\34\2\4\1\3\22\4\67\0"+
    "\2\4\23\0\11\4\1\0\22\4\4\0\1\5\23\0"+
    "\1\5\40\0\1\35\16\0\1\36\56\0\1\37\64\0"+
    "\1\40\3\0\1\41\60\0\1\42\2\0\1\43\63\0"+
    "\1\44\63\0\1\45\63\0\1\46\63\0\1\47\63\0"+
    "\1\50\63\0\1\51\42\0\2\4\23\0\2\4\1\52"+
    "\6\4\1\0\22\4\3\0\2\4\23\0\6\4\1\53"+
    "\2\4\1\0\22\4\3\0\2\4\23\0\7\4\1\54"+
    "\1\4\1\0\22\4\24\0\1\55\63\0\1\56\42\0"+
    "\2\4\23\0\3\4\1\57\5\4\1\0\22\4\3\0"+
    "\2\4\23\0\10\4\1\60\1\0\22\4\3\0\2\4"+
    "\23\0\4\4\1\61\4\4\1\0\22\4\3\0\2\4"+
    "\23\0\11\4\1\62\22\4\3\0\2\4\23\0\4\4"+
    "\1\63\4\4\1\0\22\4\42\0\1\64\54\0\1\65"+
    "\61\0\1\66\75\0\1\67\51\0\1\70\71\0\1\71"+
    "\70\0\1\72\53\0\1\73\74\0\1\74\60\0\1\75"+
    "\67\0\1\76\62\0\1\77\60\0\1\100\65\0\1\101"+
    "\66\0\1\102\50\0\1\103\65\0\1\104\75\0\1\105"+
    "\57\0\1\106\50\0\1\107\77\0\1\110\53\0\1\111"+
    "\65\0\1\112\70\0\1\113\70\0\1\114\54\0\1\115"+
    "\66\0\1\116\53\0\1\117\100\0\1\120\64\0\1\121"+
    "\42\0\1\122\73\0\1\123\73\0\1\124\53\0\1\125"+
    "\65\0\1\126\64\0\1\127\52\0\1\130\64\0\1\131"+
    "\72\0\1\132\64\0\1\133\60\0\1\134\61\0\1\135"+
    "\61\0\1\136\60\0\1\137\61\0\1\140\74\0\1\141"+
    "\65\0\1\142\52\0\1\143\102\0\1\144\53\0\1\145"+
    "\55\0\1\146\102\0\1\147\43\0\1\150\61\0\1\151"+
    "\74\0\1\152\74\0\1\153\43\0\1\154\61\0\1\155"+
    "\106\0\1\156\42\0\1\157\101\0\1\160\54\0\1\161"+
    "\55\0\1\162\71\0\1\163\66\0\1\164\73\0\1\165"+
    "\41\0\1\166\70\0\1\167\60\0\1\170\100\0\1\171"+
    "\64\0\1\172\47\0\1\173\64\0\1\174\70\0\1\175"+
    "\53\0\1\176\72\0\1\177\50\0\1\200\64\0\1\201"+
    "\101\0\1\202\62\0\1\203\56\0\1\204\71\0\1\205"+
    "\47\0\1\206\71\0\1\207\62\0\1\210\66\0\1\211"+
    "\52\0\1\212\102\0\1\213\53\0\1\214\55\0\1\215"+
    "\102\0\1\216\43\0\1\217\61\0\1\220\74\0\1\221"+
    "\77\0\1\222\45\0\1\223\65\0\1\224\54\0\1\225"+
    "\104\0\1\226\40\0\1\227\65\0\1\230\64\0\1\231"+
    "\71\0\1\232\52\0\1\233\71\0\1\234\70\0\1\235"+
    "\64\0\1\236\53\0\1\237\72\0\1\240\67\0\1\241"+
    "\55\0\1\242\70\0\1\243\56\0\1\244\57\0\1\245"+
    "\60\0\1\246\100\0\1\247\45\0\1\250\76\0\1\251"+
    "\65\0\1\252\53\0\1\253\103\0\1\254\47\0\1\255"+
    "\55\0\1\256\60\0\1\257\73\0\1\260\63\0\1\261"+
    "\53\0\1\262\65\0\1\263\71\0\1\264\53\0\1\265"+
    "\64\0\1\266\106\0\1\267\47\0\1\270\53\0\1\271"+
    "\71\0\1\272\65\0\1\273\66\0\1\274\66\0\1\275"+
    "\53\0\1\276\67\0\1\277\53\0\1\300\77\0\1\301"+
    "\66\0\1\302\52\0\1\303\61\0\1\304\57\0\1\305"+
    "\106\0\1\306\41\0\1\307\73\0\1\310\47\0\1\311"+
    "\75\0\1\312\65\0\1\313\61\0\1\314\60\0\1\315"+
    "\62\0\1\316\103\0\1\317\51\0\1\320\56\0\1\321"+
    "\103\0\1\322\34\0\1\323\65\0\1\324\75\0\1\325"+
    "\47\0\1\326\75\0\1\327\56\0\1\330\62\0\1\331"+
    "\72\0\1\332\52\0\1\333\62\0\1\334\63\0\1\335"+
    "\111\0\1\336\62\0\1\337\41\0\1\340\73\0\1\341"+
    "\61\0\1\342\67\0\1\343\74\0\1\344\47\0\1\345"+
    "\52\0\1\346\102\0\1\347\46\0\1\350\57\0\1\351"+
    "\70\0\1\352\62\0\1\353\72\0\1\354\52\0\1\355"+
    "\62\0\1\356\66\0\1\357\72\0\1\360\64\0\1\361"+
    "\60\0\1\362\61\0\1\363\67\0\1\364\52\0\1\365"+
    "\62\0\1\366\75\0\1\367\52\0\1\370\75\0\1\371"+
    "\53\0\1\372\103\0\1\373\50\0\1\374\60\0\1\375"+
    "\101\0\1\376\50\0\1\377\61\0\1\u0100\63\0\1\u0101"+
    "\60\0\1\u0102\75\0\1\u0103\56\0\1\u0104\74\0\1\u0105"+
    "\50\0\1\u0106\60\0\1\u0107\103\0\1\u0108\41\0\1\u0109"+
    "\75\0\1\u010a\60\0\1\u010b\74\0\1\u010c\50\0\1\u010d"+
    "\62\0\1\u010e\71\0\1\u010f\60\0\1\u0110\52\0\1\u0111"+
    "\77\0\1\u0112\60\0\1\u0113\70\0\1\u0114\67\0\1\u0115"+
    "\60\0\1\u0116\71\0\1\u0117\37\0\1\u0118\66\0\1\u0119"+
    "\57\0\1\u011a\66\0\1\u011b\74\0\1\u011c\51\0\1\u011d"+
    "\75\0\1\u011e\53\0\1\u011f\57\0\1\u0120\70\0\1\u0121"+
    "\60\0\1\u0122\62\0\1\u0123\65\0\1\u0124\71\0\1\u0125"+
    "\65\0\1\u0126\67\0\1\u0127\45\0\1\u0128\63\0\1\u0129"+
    "\76\0\1\u012a\61\0\1\u012b\55\0\1\u012c\62\0\1\u012d"+
    "\74\0\1\u012e\56\0\1\u012f\73\0\1\u0130\55\0\1\u0131"+
    "\56\0\1\u0132\72\0\1\u0133\64\0\1\u0134\77\0\1\u0135"+
    "\47\0\1\u0136\56\0\1\u0137\60\0\1\u0138\72\0\1\u0139"+
    "\70\0\1\u013a\74\0\1\u013b\40\0\1\u013c\63\0\1\u013d"+
    "\56\0\1\u013e\73\0\1\u013f\54\0\1\u0140\74\0\1\u0141"+
    "\102\0\1\u0142\50\0\1\u0143\65\0\1\u0144\67\0\1\u0145"+
    "\47\0\1\u0146\61\0\1\u0147\73\0\1\u0148\50\0\1\u0149"+
    "\72\0\1\u014a\64\0\1\u014b\36\0\1\u014c\63\0\1\40"+
    "\44\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[15912];
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
    "\1\0\2\11\3\1\11\11\11\1\1\11\3\1\11\11"+
    "\1\1\1\11\1\1\1\11\3\1\2\11\3\1\1\0"+
    "\1\1\u0119\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[332];
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

private ActionScriptToken createToken(String nome, String value) {
    return new ActionScriptToken(nome, value, yyline, yycolumn);
}



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public LexicalAnalyzer(java.io.Reader in) {
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
    while (i < 186) {
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
  public ActionScriptToken yylex() throws java.io.IOException {
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
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { throw new RuntimeException("Caractere inv�lido " + yytext());
            }
          case 41: break;
          case 2: 
            { return createToken("branco", yytext());
            }
          case 42: break;
          case 3: 
            { return createToken("identificador", yytext());
            }
          case 43: break;
          case 4: 
            { return createToken("inteiro", yytext());
            }
          case 44: break;
          case 5: 
            { return createToken("divis�o", yytext());
            }
          case 45: break;
          case 6: 
            { return createToken("ponto", yytext());
            }
          case 46: break;
          case 7: 
            { return createToken("v�rgula", yytext());
            }
          case 47: break;
          case 8: 
            { return createToken("par�ntese esquerdo", yytext());
            }
          case 48: break;
          case 9: 
            { return createToken("par�ntese direito", yytext());
            }
          case 49: break;
          case 10: 
            { return createToken("colchete esquerdo", yytext());
            }
          case 50: break;
          case 11: 
            { return createToken("colchete direito", yytext());
            }
          case 51: break;
          case 12: 
            { return createToken("chave esquerda", yytext());
            }
          case 52: break;
          case 13: 
            { return createToken("chave direita", yytext());
            }
          case 53: break;
          case 14: 
            { return createToken("ponto e v�gula", yytext());
            }
          case 54: break;
          case 15: 
            { return createToken("qualificador de tipo", yytext());
            }
          case 55: break;
          case 16: 
            { return createToken("adi��o", yytext());
            }
          case 56: break;
          case 17: 
            { return createToken("subtra��o", yytext());
            }
          case 57: break;
          case 18: 
            { return createToken("multiplica��o", yytext());
            }
          case 58: break;
          case 19: 
            { return createToken("m�dulo", yytext());
            }
          case 59: break;
          case 20: 
            { return createToken("atribui��o", yytext());
            }
          case 60: break;
          case 21: 
            { return createToken("maior que", yytext());
            }
          case 61: break;
          case 22: 
            { return createToken("menor que", yytext());
            }
          case 62: break;
          case 23: 
            { return createToken("delimitador de coment�rio em linha", yytext());
            }
          case 63: break;
          case 24: 
            { return createToken("atribui��o de divis�o", yytext());
            }
          case 64: break;
          case 25: 
            { return createToken("qualificador de namespace", yytext());
            }
          case 65: break;
          case 26: 
            { return createToken("incremento", yytext());
            }
          case 66: break;
          case 27: 
            { return createToken("atribui��o de adi��o", yytext());
            }
          case 67: break;
          case 28: 
            { return createToken("decremento", yytext());
            }
          case 68: break;
          case 29: 
            { return createToken("atribui��o de subtra��o", yytext());
            }
          case 69: break;
          case 30: 
            { return createToken("atribui��o de multiplica��o", yytext());
            }
          case 70: break;
          case 31: 
            { return createToken("atribui��o de m�dulo", yytext());
            }
          case 71: break;
          case 32: 
            { return createToken("igualdade", yytext());
            }
          case 72: break;
          case 33: 
            { return createToken("maior ou igual", yytext());
            }
          case 73: break;
          case 34: 
            { return createToken("desigualdade", yytext());
            }
          case 74: break;
          case 35: 
            { return createToken("menor ou igual", yytext());
            }
          case 75: break;
          case 36: 
            { return createToken("if", yytext());
            }
          case 76: break;
          case 37: 
            { return createToken("igualdade restrita", yytext());
            }
          case 77: break;
          case 38: 
            { return createToken("desigualdade restrita", yytext());
            }
          case 78: break;
          case 39: 
            { return createToken("for", yytext());
            }
          case 79: break;
          case 40: 
            { return createToken("class", yytext());
            }
          case 80: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}

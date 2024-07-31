package p082eb;

/* renamed from: eb.c */
/* loaded from: classes2.dex */
public final class C7147c {
    /* renamed from: a */
    public static boolean m21249a(CharSequence charSequence, CharSequence charSequence2) {
        int m21250b;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = charSequence.charAt(i10);
            char charAt2 = charSequence2.charAt(i10);
            if (charAt != charAt2 && ((m21250b = m21250b(charAt)) >= 26 || m21250b != m21250b(charAt2))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static int m21250b(char c10) {
        return (char) ((c10 | ' ') - 97);
    }

    /* renamed from: c */
    public static boolean m21251c(char c10) {
        return c10 >= 'a' && c10 <= 'z';
    }

    /* renamed from: d */
    public static boolean m21252d(char c10) {
        return c10 >= 'A' && c10 <= 'Z';
    }

    /* renamed from: e */
    public static String m21253e(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            if (m21252d(str.charAt(i10))) {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (m21252d(c10)) {
                        charArray[i10] = (char) (c10 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    /* renamed from: f */
    public static char m21254f(char c10) {
        return m21251c(c10) ? (char) (c10 ^ ' ') : c10;
    }

    /* renamed from: g */
    public static String m21255g(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            if (m21251c(str.charAt(i10))) {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (m21251c(c10)) {
                        charArray[i10] = (char) (c10 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }
}

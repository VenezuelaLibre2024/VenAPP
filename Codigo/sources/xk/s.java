package xk;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class s extends r {
    public static final String L0(String str, int i10) {
        int d10;
        kotlin.jvm.internal.n.e(str, "<this>");
        if (i10 >= 0) {
            d10 = uk.l.d(i10, str.length());
            String substring = str.substring(d10);
            kotlin.jvm.internal.n.d(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static char M0(CharSequence charSequence) {
        kotlin.jvm.internal.n.e(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(q.O(charSequence));
    }

    public static String N0(String str, int i10) {
        int d10;
        kotlin.jvm.internal.n.e(str, "<this>");
        if (i10 >= 0) {
            d10 = uk.l.d(i10, str.length());
            String substring = str.substring(0, d10);
            kotlin.jvm.internal.n.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }
}

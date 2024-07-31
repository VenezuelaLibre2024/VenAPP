package p450xk;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.C9322n;
import uk.C11585l;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: xk.s */
/* loaded from: classes3.dex */
public class C12527s extends C12526r {
    /* renamed from: L0 */
    public static final String m41107L0(String str, int i10) {
        int m36295d;
        C9322n.m27781e(str, "<this>");
        if (i10 >= 0) {
            m36295d = C11585l.m36295d(i10, str.length());
            String substring = str.substring(m36295d);
            C9322n.m27780d(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    /* renamed from: M0 */
    public static char m41108M0(CharSequence charSequence) {
        C9322n.m27781e(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(C12525q.m41066O(charSequence));
    }

    /* renamed from: N0 */
    public static String m41109N0(String str, int i10) {
        int m36295d;
        C9322n.m27781e(str, "<this>");
        if (i10 >= 0) {
            m36295d = C11585l.m36295d(i10, str.length());
            String substring = str.substring(0, m36295d);
            C9322n.m27780d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }
}

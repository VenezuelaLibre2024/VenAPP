package p450xk;

import dk.AbstractC7001c;
import dk.AbstractC7006e0;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.jvm.internal.C9308a0;
import kotlin.jvm.internal.C9322n;
import uk.C11579f;
import uk.C11585l;

/* renamed from: xk.p */
/* loaded from: classes3.dex */
public class C12524p extends C12523o {
    /* renamed from: A */
    public static /* synthetic */ String m41027A(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return m41044y(str, str2, str3, z10);
    }

    /* renamed from: B */
    public static boolean m41028B(String str, String prefix, int i10, boolean z10) {
        C9322n.m27781e(str, "<this>");
        C9322n.m27781e(prefix, "prefix");
        return !z10 ? str.startsWith(prefix, i10) : m41040u(str, i10, prefix, 0, prefix.length(), z10);
    }

    /* renamed from: C */
    public static boolean m41029C(String str, String prefix, boolean z10) {
        C9322n.m27781e(str, "<this>");
        C9322n.m27781e(prefix, "prefix");
        return !z10 ? str.startsWith(prefix) : m41040u(str, 0, prefix, 0, prefix.length(), z10);
    }

    /* renamed from: D */
    public static /* synthetic */ boolean m41030D(String str, String str2, int i10, boolean z10, int i11, Object obj) {
        boolean m41028B;
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        m41028B = m41028B(str, str2, i10, z10);
        return m41028B;
    }

    /* renamed from: E */
    public static /* synthetic */ boolean m41031E(String str, String str2, boolean z10, int i10, Object obj) {
        boolean m41029C;
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        m41029C = m41029C(str, str2, z10);
        return m41029C;
    }

    /* renamed from: m */
    public static String m41032m(char[] cArr) {
        C9322n.m27781e(cArr, "<this>");
        return new String(cArr);
    }

    /* renamed from: n */
    public static String m41033n(char[] cArr, int i10, int i11) {
        C9322n.m27781e(cArr, "<this>");
        AbstractC7001c.f15569a.m20327a(i10, i11, cArr.length);
        return new String(cArr, i10, i11 - i10);
    }

    /* renamed from: o */
    public static byte[] m41034o(String str) {
        C9322n.m27781e(str, "<this>");
        byte[] bytes = str.getBytes(C12512d.f33913b);
        C9322n.m27780d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    /* renamed from: p */
    public static final boolean m41035p(String str, String suffix, boolean z10) {
        C9322n.m27781e(str, "<this>");
        C9322n.m27781e(suffix, "suffix");
        return !z10 ? str.endsWith(suffix) : m41040u(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    /* renamed from: q */
    public static /* synthetic */ boolean m41036q(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m41035p(str, str2, z10);
    }

    /* renamed from: r */
    public static boolean m41037r(String str, String str2, boolean z10) {
        return str == null ? str2 == null : !z10 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    /* renamed from: s */
    public static Comparator<String> m41038s(C9308a0 c9308a0) {
        C9322n.m27781e(c9308a0, "<this>");
        Comparator<String> CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        C9322n.m27780d(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        return CASE_INSENSITIVE_ORDER;
    }

    /* renamed from: t */
    public static boolean m41039t(CharSequence charSequence) {
        boolean z10;
        C9322n.m27781e(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return true;
        }
        Iterable m41065N = C12525q.m41065N(charSequence);
        if (!(m41065N instanceof Collection) || !((Collection) m41065N).isEmpty()) {
            Iterator it = m41065N.iterator();
            while (it.hasNext()) {
                if (!C12510b.m40958c(charSequence.charAt(((AbstractC7006e0) it).nextInt()))) {
                    z10 = false;
                    break;
                }
            }
        }
        z10 = true;
        return z10;
    }

    /* renamed from: u */
    public static final boolean m41040u(String str, int i10, String other, int i11, int i12, boolean z10) {
        C9322n.m27781e(str, "<this>");
        C9322n.m27781e(other, "other");
        return !z10 ? str.regionMatches(i10, other, i11, i12) : str.regionMatches(z10, i10, other, i11, i12);
    }

    /* renamed from: v */
    public static /* synthetic */ boolean m41041v(String str, int i10, String str2, int i11, int i12, boolean z10, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            z10 = false;
        }
        return m41040u(str, i10, str2, i11, i12, z10);
    }

    /* renamed from: w */
    public static String m41042w(CharSequence charSequence, int i10) {
        C9322n.m27781e(charSequence, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + '.').toString());
        }
        if (i10 == 0) {
            return "";
        }
        if (i10 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char charAt = charSequence.charAt(0);
            char[] cArr = new char[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                cArr[i11] = charAt;
            }
            return new String(cArr);
        }
        StringBuilder sb2 = new StringBuilder(charSequence.length() * i10);
        AbstractC7006e0 it = new C11579f(1, i10).iterator();
        while (it.hasNext()) {
            it.nextInt();
            sb2.append(charSequence);
        }
        String sb3 = sb2.toString();
        C9322n.m27780d(sb3, "{\n                    va…tring()\n                }");
        return sb3;
    }

    /* renamed from: x */
    public static final String m41043x(String str, char c10, char c11, boolean z10) {
        String sb2;
        String str2;
        C9322n.m27781e(str, "<this>");
        if (z10) {
            StringBuilder sb3 = new StringBuilder(str.length());
            for (int i10 = 0; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (C12511c.m40960e(charAt, c10, z10)) {
                    charAt = c11;
                }
                sb3.append(charAt);
            }
            sb2 = sb3.toString();
            str2 = "StringBuilder(capacity).…builderAction).toString()";
        } else {
            sb2 = str.replace(c10, c11);
            str2 = "this as java.lang.String…replace(oldChar, newChar)";
        }
        C9322n.m27780d(sb2, str2);
        return sb2;
    }

    /* renamed from: y */
    public static final String m41044y(String str, String oldValue, String newValue, boolean z10) {
        int m36293b;
        C9322n.m27781e(str, "<this>");
        C9322n.m27781e(oldValue, "oldValue");
        C9322n.m27781e(newValue, "newValue");
        int i10 = 0;
        int m41068Q = C12525q.m41068Q(str, oldValue, 0, z10);
        if (m41068Q < 0) {
            return str;
        }
        int length = oldValue.length();
        m36293b = C11585l.m36293b(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        do {
            sb2.append((CharSequence) str, i10, m41068Q);
            sb2.append(newValue);
            i10 = m41068Q + length;
            if (m41068Q >= str.length()) {
                break;
            }
            m41068Q = C12525q.m41068Q(str, oldValue, m41068Q + m36293b, z10);
        } while (m41068Q > 0);
        sb2.append((CharSequence) str, i10, str.length());
        String sb3 = sb2.toString();
        C9322n.m27780d(sb3, "stringBuilder.append(this, i, length).toString()");
        return sb3;
    }

    /* renamed from: z */
    public static /* synthetic */ String m41045z(String str, char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return m41043x(str, c10, c11, z10);
    }
}

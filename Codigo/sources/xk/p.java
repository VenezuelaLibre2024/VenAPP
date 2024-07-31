package xk;

import dk.e0;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.jvm.internal.a0;

/* loaded from: classes3.dex */
public class p extends o {
    public static /* synthetic */ String A(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return y(str, str2, str3, z10);
    }

    public static boolean B(String str, String prefix, int i10, boolean z10) {
        kotlin.jvm.internal.n.e(str, "<this>");
        kotlin.jvm.internal.n.e(prefix, "prefix");
        return !z10 ? str.startsWith(prefix, i10) : u(str, i10, prefix, 0, prefix.length(), z10);
    }

    public static boolean C(String str, String prefix, boolean z10) {
        kotlin.jvm.internal.n.e(str, "<this>");
        kotlin.jvm.internal.n.e(prefix, "prefix");
        return !z10 ? str.startsWith(prefix) : u(str, 0, prefix, 0, prefix.length(), z10);
    }

    public static /* synthetic */ boolean D(String str, String str2, int i10, boolean z10, int i11, Object obj) {
        boolean B;
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        B = B(str, str2, i10, z10);
        return B;
    }

    public static /* synthetic */ boolean E(String str, String str2, boolean z10, int i10, Object obj) {
        boolean C;
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        C = C(str, str2, z10);
        return C;
    }

    public static String m(char[] cArr) {
        kotlin.jvm.internal.n.e(cArr, "<this>");
        return new String(cArr);
    }

    public static String n(char[] cArr, int i10, int i11) {
        kotlin.jvm.internal.n.e(cArr, "<this>");
        dk.c.f14211a.a(i10, i11, cArr.length);
        return new String(cArr, i10, i11 - i10);
    }

    public static byte[] o(String str) {
        kotlin.jvm.internal.n.e(str, "<this>");
        byte[] bytes = str.getBytes(d.f31393b);
        kotlin.jvm.internal.n.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final boolean p(String str, String suffix, boolean z10) {
        kotlin.jvm.internal.n.e(str, "<this>");
        kotlin.jvm.internal.n.e(suffix, "suffix");
        return !z10 ? str.endsWith(suffix) : u(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    public static /* synthetic */ boolean q(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return p(str, str2, z10);
    }

    public static boolean r(String str, String str2, boolean z10) {
        return str == null ? str2 == null : !z10 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static Comparator<String> s(a0 a0Var) {
        kotlin.jvm.internal.n.e(a0Var, "<this>");
        Comparator<String> CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        kotlin.jvm.internal.n.d(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        return CASE_INSENSITIVE_ORDER;
    }

    public static boolean t(CharSequence charSequence) {
        boolean z10;
        kotlin.jvm.internal.n.e(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return true;
        }
        Iterable N = q.N(charSequence);
        if (!(N instanceof Collection) || !((Collection) N).isEmpty()) {
            Iterator it = N.iterator();
            while (it.hasNext()) {
                if (!b.c(charSequence.charAt(((e0) it).nextInt()))) {
                    z10 = false;
                    break;
                }
            }
        }
        z10 = true;
        return z10;
    }

    public static final boolean u(String str, int i10, String other, int i11, int i12, boolean z10) {
        kotlin.jvm.internal.n.e(str, "<this>");
        kotlin.jvm.internal.n.e(other, "other");
        return !z10 ? str.regionMatches(i10, other, i11, i12) : str.regionMatches(z10, i10, other, i11, i12);
    }

    public static /* synthetic */ boolean v(String str, int i10, String str2, int i11, int i12, boolean z10, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            z10 = false;
        }
        return u(str, i10, str2, i11, i12, z10);
    }

    public static String w(CharSequence charSequence, int i10) {
        kotlin.jvm.internal.n.e(charSequence, "<this>");
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
        e0 it = new uk.f(1, i10).iterator();
        while (it.hasNext()) {
            it.nextInt();
            sb2.append(charSequence);
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.n.d(sb3, "{\n                    va…tring()\n                }");
        return sb3;
    }

    public static final String x(String str, char c10, char c11, boolean z10) {
        String sb2;
        String str2;
        kotlin.jvm.internal.n.e(str, "<this>");
        if (z10) {
            StringBuilder sb3 = new StringBuilder(str.length());
            for (int i10 = 0; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (c.e(charAt, c10, z10)) {
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
        kotlin.jvm.internal.n.d(sb2, str2);
        return sb2;
    }

    public static final String y(String str, String oldValue, String newValue, boolean z10) {
        int b10;
        kotlin.jvm.internal.n.e(str, "<this>");
        kotlin.jvm.internal.n.e(oldValue, "oldValue");
        kotlin.jvm.internal.n.e(newValue, "newValue");
        int i10 = 0;
        int Q = q.Q(str, oldValue, 0, z10);
        if (Q < 0) {
            return str;
        }
        int length = oldValue.length();
        b10 = uk.l.b(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        do {
            sb2.append((CharSequence) str, i10, Q);
            sb2.append(newValue);
            i10 = Q + length;
            if (Q >= str.length()) {
                break;
            }
            Q = q.Q(str, oldValue, Q + b10, z10);
        } while (Q > 0);
        sb2.append((CharSequence) str, i10, str.length());
        String sb3 = sb2.toString();
        kotlin.jvm.internal.n.d(sb3, "stringBuilder.append(this, i, length).toString()");
        return sb3;
    }

    public static /* synthetic */ String z(String str, char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return x(str, c10, c11, z10);
    }
}

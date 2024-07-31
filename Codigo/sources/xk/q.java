package xk;

import dk.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class q extends p {

    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.o implements ok.p<CharSequence, Integer, ck.m<? extends Integer, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ char[] f31418a;

        /* renamed from: b */
        final /* synthetic */ boolean f31419b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(char[] cArr, boolean z10) {
            super(2);
            this.f31418a = cArr;
            this.f31419b = z10;
        }

        public final ck.m<Integer, Integer> a(CharSequence $receiver, int i10) {
            kotlin.jvm.internal.n.e($receiver, "$this$$receiver");
            int V = q.V($receiver, this.f31418a, i10, this.f31419b);
            if (V < 0) {
                return null;
            }
            return ck.r.a(Integer.valueOf(V), 1);
        }

        @Override // ok.p
        public /* bridge */ /* synthetic */ ck.m<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return a(charSequence, num.intValue());
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.o implements ok.p<CharSequence, Integer, ck.m<? extends Integer, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ List<String> f31420a;

        /* renamed from: b */
        final /* synthetic */ boolean f31421b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List<String> list, boolean z10) {
            super(2);
            this.f31420a = list;
            this.f31421b = z10;
        }

        public final ck.m<Integer, Integer> a(CharSequence $receiver, int i10) {
            kotlin.jvm.internal.n.e($receiver, "$this$$receiver");
            ck.m M = q.M($receiver, this.f31420a, i10, this.f31421b, false);
            if (M != null) {
                return ck.r.a(M.c(), Integer.valueOf(((String) M.d()).length()));
            }
            return null;
        }

        @Override // ok.p
        public /* bridge */ /* synthetic */ ck.m<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return a(charSequence, num.intValue());
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends kotlin.jvm.internal.o implements ok.l<uk.f, String> {

        /* renamed from: a */
        final /* synthetic */ CharSequence f31422a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(CharSequence charSequence) {
            super(1);
            this.f31422a = charSequence;
        }

        @Override // ok.l
        /* renamed from: a */
        public final String invoke(uk.f it) {
            kotlin.jvm.internal.n.e(it, "it");
            return q.z0(this.f31422a, it);
        }
    }

    public static final String A0(String str, char c10, String missingDelimiterValue) {
        int T;
        kotlin.jvm.internal.n.e(str, "<this>");
        kotlin.jvm.internal.n.e(missingDelimiterValue, "missingDelimiterValue");
        T = T(str, c10, 0, false, 6, null);
        if (T == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(T + 1, str.length());
        kotlin.jvm.internal.n.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String B0(String str, String delimiter, String missingDelimiterValue) {
        int U;
        kotlin.jvm.internal.n.e(str, "<this>");
        kotlin.jvm.internal.n.e(delimiter, "delimiter");
        kotlin.jvm.internal.n.e(missingDelimiterValue, "missingDelimiterValue");
        U = U(str, delimiter, 0, false, 6, null);
        if (U == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(U + delimiter.length(), str.length());
        kotlin.jvm.internal.n.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String C0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return A0(str, c10, str2);
    }

    public static /* synthetic */ String D0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return B0(str, str2, str3);
    }

    public static String E0(String str, char c10, String missingDelimiterValue) {
        int Y;
        kotlin.jvm.internal.n.e(str, "<this>");
        kotlin.jvm.internal.n.e(missingDelimiterValue, "missingDelimiterValue");
        Y = Y(str, c10, 0, false, 6, null);
        if (Y == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(Y + 1, str.length());
        kotlin.jvm.internal.n.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String F0(String str, char c10, String str2, int i10, Object obj) {
        String E0;
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        E0 = E0(str, c10, str2);
        return E0;
    }

    public static final boolean G(CharSequence charSequence, char c10, boolean z10) {
        int T;
        kotlin.jvm.internal.n.e(charSequence, "<this>");
        T = T(charSequence, c10, 0, z10, 2, null);
        return T >= 0;
    }

    public static final String G0(String str, char c10, String missingDelimiterValue) {
        int T;
        kotlin.jvm.internal.n.e(str, "<this>");
        kotlin.jvm.internal.n.e(missingDelimiterValue, "missingDelimiterValue");
        T = T(str, c10, 0, false, 6, null);
        if (T == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, T);
        kotlin.jvm.internal.n.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final boolean H(CharSequence charSequence, CharSequence other, boolean z10) {
        int U;
        kotlin.jvm.internal.n.e(charSequence, "<this>");
        kotlin.jvm.internal.n.e(other, "other");
        if (other instanceof String) {
            U = U(charSequence, (String) other, 0, z10, 2, null);
            if (U >= 0) {
                return true;
            }
        } else if (S(charSequence, other, 0, charSequence.length(), z10, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    public static final String H0(String str, String delimiter, String missingDelimiterValue) {
        int U;
        kotlin.jvm.internal.n.e(str, "<this>");
        kotlin.jvm.internal.n.e(delimiter, "delimiter");
        kotlin.jvm.internal.n.e(missingDelimiterValue, "missingDelimiterValue");
        U = U(str, delimiter, 0, false, 6, null);
        if (U == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, U);
        kotlin.jvm.internal.n.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ boolean I(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return G(charSequence, c10, z10);
    }

    public static /* synthetic */ String I0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return G0(str, c10, str2);
    }

    public static /* synthetic */ boolean J(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return H(charSequence, charSequence2, z10);
    }

    public static /* synthetic */ String J0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return H0(str, str2, str3);
    }

    public static final boolean K(CharSequence charSequence, CharSequence suffix, boolean z10) {
        boolean q10;
        kotlin.jvm.internal.n.e(charSequence, "<this>");
        kotlin.jvm.internal.n.e(suffix, "suffix");
        if (z10 || !(charSequence instanceof String) || !(suffix instanceof String)) {
            return m0(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z10);
        }
        q10 = p.q((String) charSequence, (String) suffix, false, 2, null);
        return q10;
    }

    public static CharSequence K0(CharSequence charSequence) {
        kotlin.jvm.internal.n.e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean c10 = xk.b.c(charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!c10) {
                    break;
                }
                length--;
            } else if (c10) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static /* synthetic */ boolean L(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return K(charSequence, charSequence2, z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0096, code lost:
    
        return ck.r.a(java.lang.Integer.valueOf(r12), r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final ck.m<java.lang.Integer, java.lang.String> M(java.lang.CharSequence r10, java.util.Collection<java.lang.String> r11, int r12, boolean r13, boolean r14) {
        /*
            r0 = 0
            if (r13 != 0) goto L2f
            int r1 = r11.size()
            r2 = 1
            if (r1 != r2) goto L2f
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.lang.Object r11 = dk.p.V(r11)
            java.lang.String r11 = (java.lang.String) r11
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r10
            r2 = r11
            r3 = r12
            if (r14 != 0) goto L1f
            int r10 = xk.g.U(r1, r2, r3, r4, r5, r6)
            goto L23
        L1f:
            int r10 = xk.g.Z(r1, r2, r3, r4, r5, r6)
        L23:
            if (r10 >= 0) goto L26
            goto L2e
        L26:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            ck.m r0 = ck.r.a(r10, r11)
        L2e:
            return r0
        L2f:
            r1 = 0
            if (r14 != 0) goto L40
            uk.f r14 = new uk.f
            int r12 = uk.j.b(r12, r1)
            int r1 = r10.length()
            r14.<init>(r12, r1)
            goto L4c
        L40:
            int r14 = O(r10)
            int r12 = uk.j.d(r12, r14)
            uk.d r14 = uk.j.h(r12, r1)
        L4c:
            boolean r12 = r10 instanceof java.lang.String
            if (r12 == 0) goto L9b
            int r12 = r14.c()
            int r1 = r14.d()
            int r14 = r14.f()
            if (r14 <= 0) goto L60
            if (r12 <= r1) goto L64
        L60:
            if (r14 >= 0) goto Ldc
            if (r1 > r12) goto Ldc
        L64:
            r2 = r11
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r8 = r2.iterator()
        L6b:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L89
            java.lang.Object r9 = r8.next()
            r2 = r9
            java.lang.String r2 = (java.lang.String) r2
            r3 = 0
            r4 = r10
            java.lang.String r4 = (java.lang.String) r4
            int r6 = r2.length()
            r5 = r12
            r7 = r13
            boolean r2 = xk.p.u(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L6b
            goto L8a
        L89:
            r9 = r0
        L8a:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L97
        L8e:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            ck.m r10 = ck.r.a(r10, r9)
            return r10
        L97:
            if (r12 == r1) goto Ldc
            int r12 = r12 + r14
            goto L64
        L9b:
            int r12 = r14.c()
            int r1 = r14.d()
            int r14 = r14.f()
            if (r14 <= 0) goto Lab
            if (r12 <= r1) goto Laf
        Lab:
            if (r14 >= 0) goto Ldc
            if (r1 > r12) goto Ldc
        Laf:
            r2 = r11
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r8 = r2.iterator()
        Lb6:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto Ld2
            java.lang.Object r9 = r8.next()
            r2 = r9
            java.lang.String r2 = (java.lang.String) r2
            r3 = 0
            int r6 = r2.length()
            r4 = r10
            r5 = r12
            r7 = r13
            boolean r2 = m0(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto Lb6
            goto Ld3
        Ld2:
            r9 = r0
        Ld3:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto Ld8
            goto L8e
        Ld8:
            if (r12 == r1) goto Ldc
            int r12 = r12 + r14
            goto Laf
        Ldc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xk.q.M(java.lang.CharSequence, java.util.Collection, int, boolean, boolean):ck.m");
    }

    public static final uk.f N(CharSequence charSequence) {
        kotlin.jvm.internal.n.e(charSequence, "<this>");
        return new uk.f(0, charSequence.length() - 1);
    }

    public static final int O(CharSequence charSequence) {
        kotlin.jvm.internal.n.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int P(CharSequence charSequence, char c10, int i10, boolean z10) {
        kotlin.jvm.internal.n.e(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? V(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).indexOf(c10, i10);
    }

    public static final int Q(CharSequence charSequence, String string, int i10, boolean z10) {
        kotlin.jvm.internal.n.e(charSequence, "<this>");
        kotlin.jvm.internal.n.e(string, "string");
        return (z10 || !(charSequence instanceof String)) ? S(charSequence, string, i10, charSequence.length(), z10, false, 16, null) : ((String) charSequence).indexOf(string, i10);
    }

    private static final int R(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        int d10;
        int b10;
        uk.d h10;
        int b11;
        int d11;
        if (z11) {
            d10 = uk.l.d(i10, O(charSequence));
            b10 = uk.l.b(i11, 0);
            h10 = uk.l.h(d10, b10);
        } else {
            b11 = uk.l.b(i10, 0);
            d11 = uk.l.d(i11, charSequence.length());
            h10 = new uk.f(b11, d11);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int c10 = h10.c();
            int d12 = h10.d();
            int f10 = h10.f();
            if ((f10 <= 0 || c10 > d12) && (f10 >= 0 || d12 > c10)) {
                return -1;
            }
            while (!p.u((String) charSequence2, 0, (String) charSequence, c10, charSequence2.length(), z10)) {
                if (c10 == d12) {
                    return -1;
                }
                c10 += f10;
            }
            return c10;
        }
        int c11 = h10.c();
        int d13 = h10.d();
        int f11 = h10.f();
        if ((f11 <= 0 || c11 > d13) && (f11 >= 0 || d13 > c11)) {
            return -1;
        }
        while (!m0(charSequence2, 0, charSequence, c11, charSequence2.length(), z10)) {
            if (c11 == d13) {
                return -1;
            }
            c11 += f11;
        }
        return c11;
    }

    static /* synthetic */ int S(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        return R(charSequence, charSequence2, i10, i11, z10, z11);
    }

    public static /* synthetic */ int T(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return P(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ int U(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return Q(charSequence, str, i10, z10);
    }

    public static final int V(CharSequence charSequence, char[] chars, int i10, boolean z10) {
        int b10;
        boolean z11;
        char U;
        kotlin.jvm.internal.n.e(charSequence, "<this>");
        kotlin.jvm.internal.n.e(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            U = dk.m.U(chars);
            return ((String) charSequence).indexOf(U, i10);
        }
        b10 = uk.l.b(i10, 0);
        e0 it = new uk.f(b10, O(charSequence)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            char charAt = charSequence.charAt(nextInt);
            int length = chars.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    z11 = false;
                    break;
                }
                if (xk.c.e(chars[i11], charAt, z10)) {
                    z11 = true;
                    break;
                }
                i11++;
            }
            if (z11) {
                return nextInt;
            }
        }
        return -1;
    }

    public static final int W(CharSequence charSequence, char c10, int i10, boolean z10) {
        kotlin.jvm.internal.n.e(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? a0(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).lastIndexOf(c10, i10);
    }

    public static final int X(CharSequence charSequence, String string, int i10, boolean z10) {
        kotlin.jvm.internal.n.e(charSequence, "<this>");
        kotlin.jvm.internal.n.e(string, "string");
        return (z10 || !(charSequence instanceof String)) ? R(charSequence, string, i10, 0, z10, true) : ((String) charSequence).lastIndexOf(string, i10);
    }

    public static /* synthetic */ int Y(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = O(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return W(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ int Z(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = O(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return X(charSequence, str, i10, z10);
    }

    public static final int a0(CharSequence charSequence, char[] chars, int i10, boolean z10) {
        int d10;
        char U;
        kotlin.jvm.internal.n.e(charSequence, "<this>");
        kotlin.jvm.internal.n.e(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            U = dk.m.U(chars);
            return ((String) charSequence).lastIndexOf(U, i10);
        }
        for (d10 = uk.l.d(i10, O(charSequence)); -1 < d10; d10--) {
            char charAt = charSequence.charAt(d10);
            int length = chars.length;
            boolean z11 = false;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                if (xk.c.e(chars[i11], charAt, z10)) {
                    z11 = true;
                    break;
                }
                i11++;
            }
            if (z11) {
                return d10;
            }
        }
        return -1;
    }

    public static final wk.d<String> b0(CharSequence charSequence) {
        kotlin.jvm.internal.n.e(charSequence, "<this>");
        return w0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    public static final List<String> c0(CharSequence charSequence) {
        List<String> k10;
        kotlin.jvm.internal.n.e(charSequence, "<this>");
        k10 = wk.l.k(b0(charSequence));
        return k10;
    }

    public static final CharSequence d0(CharSequence charSequence, int i10, char c10) {
        kotlin.jvm.internal.n.e(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
        }
        if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(charSequence);
        e0 it = new uk.f(1, i10 - charSequence.length()).iterator();
        while (it.hasNext()) {
            it.nextInt();
            sb2.append(c10);
        }
        return sb2;
    }

    public static final String e0(String str, int i10, char c10) {
        kotlin.jvm.internal.n.e(str, "<this>");
        return d0(str, i10, c10).toString();
    }

    public static /* synthetic */ String f0(String str, int i10, char c10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            c10 = ' ';
        }
        return e0(str, i10, c10);
    }

    public static final CharSequence g0(CharSequence charSequence, int i10, char c10) {
        kotlin.jvm.internal.n.e(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
        }
        if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(i10);
        e0 it = new uk.f(1, i10 - charSequence.length()).iterator();
        while (it.hasNext()) {
            it.nextInt();
            sb2.append(c10);
        }
        sb2.append(charSequence);
        return sb2;
    }

    public static String h0(String str, int i10, char c10) {
        kotlin.jvm.internal.n.e(str, "<this>");
        return g0(str, i10, c10).toString();
    }

    private static final wk.d<uk.f> i0(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11) {
        p0(i11);
        return new e(charSequence, i10, i11, new a(cArr, z10));
    }

    private static final wk.d<uk.f> j0(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11) {
        List c10;
        p0(i11);
        c10 = dk.l.c(strArr);
        return new e(charSequence, i10, i11, new b(c10, z10));
    }

    static /* synthetic */ wk.d k0(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return i0(charSequence, cArr, i10, z10, i11);
    }

    static /* synthetic */ wk.d l0(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return j0(charSequence, strArr, i10, z10, i11);
    }

    public static final boolean m0(CharSequence charSequence, int i10, CharSequence other, int i11, int i12, boolean z10) {
        kotlin.jvm.internal.n.e(charSequence, "<this>");
        kotlin.jvm.internal.n.e(other, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > other.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!xk.c.e(charSequence.charAt(i10 + i13), other.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static String n0(String str, CharSequence prefix) {
        kotlin.jvm.internal.n.e(str, "<this>");
        kotlin.jvm.internal.n.e(prefix, "prefix");
        if (!y0(str, prefix, false, 2, null)) {
            return str;
        }
        String substring = str.substring(prefix.length());
        kotlin.jvm.internal.n.d(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public static String o0(String str, CharSequence suffix) {
        kotlin.jvm.internal.n.e(str, "<this>");
        kotlin.jvm.internal.n.e(suffix, "suffix");
        if (!L(str, suffix, false, 2, null)) {
            return str;
        }
        String substring = str.substring(0, str.length() - suffix.length());
        kotlin.jvm.internal.n.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final void p0(int i10) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i10).toString());
    }

    public static final List<String> q0(CharSequence charSequence, char[] delimiters, boolean z10, int i10) {
        Iterable e10;
        int r10;
        kotlin.jvm.internal.n.e(charSequence, "<this>");
        kotlin.jvm.internal.n.e(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return s0(charSequence, String.valueOf(delimiters[0]), z10, i10);
        }
        e10 = wk.l.e(k0(charSequence, delimiters, 0, z10, i10, 2, null));
        r10 = dk.s.r(e10, 10);
        ArrayList arrayList = new ArrayList(r10);
        Iterator it = e10.iterator();
        while (it.hasNext()) {
            arrayList.add(z0(charSequence, (uk.f) it.next()));
        }
        return arrayList;
    }

    public static final List<String> r0(CharSequence charSequence, String[] delimiters, boolean z10, int i10) {
        Iterable e10;
        int r10;
        kotlin.jvm.internal.n.e(charSequence, "<this>");
        kotlin.jvm.internal.n.e(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (!(str.length() == 0)) {
                return s0(charSequence, str, z10, i10);
            }
        }
        e10 = wk.l.e(l0(charSequence, delimiters, 0, z10, i10, 2, null));
        r10 = dk.s.r(e10, 10);
        ArrayList arrayList = new ArrayList(r10);
        Iterator it = e10.iterator();
        while (it.hasNext()) {
            arrayList.add(z0(charSequence, (uk.f) it.next()));
        }
        return arrayList;
    }

    private static final List<String> s0(CharSequence charSequence, String str, boolean z10, int i10) {
        List<String> e10;
        p0(i10);
        int i11 = 0;
        int Q = Q(charSequence, str, 0, z10);
        if (Q == -1 || i10 == 1) {
            e10 = dk.q.e(charSequence.toString());
            return e10;
        }
        boolean z11 = i10 > 0;
        ArrayList arrayList = new ArrayList(z11 ? uk.l.d(i10, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(i11, Q).toString());
            i11 = str.length() + Q;
            if (z11 && arrayList.size() == i10 - 1) {
                break;
            }
            Q = Q(charSequence, str, i11, z10);
        } while (Q != -1);
        arrayList.add(charSequence.subSequence(i11, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List t0(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return q0(charSequence, cArr, z10, i10);
    }

    public static /* synthetic */ List u0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return r0(charSequence, strArr, z10, i10);
    }

    public static final wk.d<String> v0(CharSequence charSequence, String[] delimiters, boolean z10, int i10) {
        wk.d<String> j10;
        kotlin.jvm.internal.n.e(charSequence, "<this>");
        kotlin.jvm.internal.n.e(delimiters, "delimiters");
        j10 = wk.l.j(l0(charSequence, delimiters, 0, z10, i10, 2, null), new c(charSequence));
        return j10;
    }

    public static /* synthetic */ wk.d w0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return v0(charSequence, strArr, z10, i10);
    }

    public static final boolean x0(CharSequence charSequence, CharSequence prefix, boolean z10) {
        boolean E;
        kotlin.jvm.internal.n.e(charSequence, "<this>");
        kotlin.jvm.internal.n.e(prefix, "prefix");
        if (z10 || !(charSequence instanceof String) || !(prefix instanceof String)) {
            return m0(charSequence, 0, prefix, 0, prefix.length(), z10);
        }
        E = p.E((String) charSequence, (String) prefix, false, 2, null);
        return E;
    }

    public static /* synthetic */ boolean y0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return x0(charSequence, charSequence2, z10);
    }

    public static final String z0(CharSequence charSequence, uk.f range) {
        kotlin.jvm.internal.n.e(charSequence, "<this>");
        kotlin.jvm.internal.n.e(range, "range");
        return charSequence.subSequence(range.o().intValue(), range.n().intValue() + 1).toString();
    }
}

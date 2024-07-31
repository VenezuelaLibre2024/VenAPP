package p450xk;

import ck.C2028m;
import ck.C2033r;
import dk.AbstractC7006e0;
import dk.C7019l;
import dk.C7021m;
import dk.C7029q;
import dk.C7033s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9322n;
import p280ok.InterfaceC10002p;
import p280ok.InterfaceC9998l;
import p427wk.C12236l;
import p427wk.InterfaceC12228d;
import uk.C11577d;
import uk.C11579f;
import uk.C11585l;

/* renamed from: xk.q */
/* loaded from: classes3.dex */
public class C12525q extends C12524p {

    /* renamed from: xk.q$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC9323o implements InterfaceC10002p<CharSequence, Integer, C2028m<? extends Integer, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ char[] f33938a;

        /* renamed from: b */
        final /* synthetic */ boolean f33939b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(char[] cArr, boolean z10) {
            super(2);
            this.f33938a = cArr;
            this.f33939b = z10;
        }

        /* renamed from: a */
        public final C2028m<Integer, Integer> m41104a(CharSequence $receiver, int i10) {
            C9322n.m27781e($receiver, "$this$$receiver");
            int m41073V = C12525q.m41073V($receiver, this.f33938a, i10, this.f33939b);
            if (m41073V < 0) {
                return null;
            }
            return C2033r.m10353a(Integer.valueOf(m41073V), 1);
        }

        @Override // p280ok.InterfaceC10002p
        public /* bridge */ /* synthetic */ C2028m<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return m41104a(charSequence, num.intValue());
        }
    }

    /* renamed from: xk.q$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC9323o implements InterfaceC10002p<CharSequence, Integer, C2028m<? extends Integer, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ List<String> f33940a;

        /* renamed from: b */
        final /* synthetic */ boolean f33941b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List<String> list, boolean z10) {
            super(2);
            this.f33940a = list;
            this.f33941b = z10;
        }

        /* renamed from: a */
        public final C2028m<Integer, Integer> m41105a(CharSequence $receiver, int i10) {
            C9322n.m27781e($receiver, "$this$$receiver");
            C2028m m41064M = C12525q.m41064M($receiver, this.f33940a, i10, this.f33941b, false);
            if (m41064M != null) {
                return C2033r.m10353a(m41064M.m10337c(), Integer.valueOf(((String) m41064M.m10338d()).length()));
            }
            return null;
        }

        @Override // p280ok.InterfaceC10002p
        public /* bridge */ /* synthetic */ C2028m<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return m41105a(charSequence, num.intValue());
        }
    }

    /* renamed from: xk.q$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC9323o implements InterfaceC9998l<C11579f, String> {

        /* renamed from: a */
        final /* synthetic */ CharSequence f33942a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(CharSequence charSequence) {
            super(1);
            this.f33942a = charSequence;
        }

        @Override // p280ok.InterfaceC9998l
        /* renamed from: a */
        public final String invoke(C11579f it) {
            C9322n.m27781e(it, "it");
            return C12525q.m41103z0(this.f33942a, it);
        }
    }

    /* renamed from: A0 */
    public static final String m41046A0(String str, char c10, String missingDelimiterValue) {
        int m41071T;
        C9322n.m27781e(str, "<this>");
        C9322n.m27781e(missingDelimiterValue, "missingDelimiterValue");
        m41071T = m41071T(str, c10, 0, false, 6, null);
        if (m41071T == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(m41071T + 1, str.length());
        C9322n.m27780d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: B0 */
    public static final String m41047B0(String str, String delimiter, String missingDelimiterValue) {
        int m41072U;
        C9322n.m27781e(str, "<this>");
        C9322n.m27781e(delimiter, "delimiter");
        C9322n.m27781e(missingDelimiterValue, "missingDelimiterValue");
        m41072U = m41072U(str, delimiter, 0, false, 6, null);
        if (m41072U == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(m41072U + delimiter.length(), str.length());
        C9322n.m27780d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: C0 */
    public static /* synthetic */ String m41048C0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return m41046A0(str, c10, str2);
    }

    /* renamed from: D0 */
    public static /* synthetic */ String m41049D0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return m41047B0(str, str2, str3);
    }

    /* renamed from: E0 */
    public static String m41050E0(String str, char c10, String missingDelimiterValue) {
        int m41076Y;
        C9322n.m27781e(str, "<this>");
        C9322n.m27781e(missingDelimiterValue, "missingDelimiterValue");
        m41076Y = m41076Y(str, c10, 0, false, 6, null);
        if (m41076Y == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(m41076Y + 1, str.length());
        C9322n.m27780d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: F0 */
    public static /* synthetic */ String m41052F0(String str, char c10, String str2, int i10, Object obj) {
        String m41050E0;
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        m41050E0 = m41050E0(str, c10, str2);
        return m41050E0;
    }

    /* renamed from: G */
    public static final boolean m41053G(CharSequence charSequence, char c10, boolean z10) {
        int m41071T;
        C9322n.m27781e(charSequence, "<this>");
        m41071T = m41071T(charSequence, c10, 0, z10, 2, null);
        return m41071T >= 0;
    }

    /* renamed from: G0 */
    public static final String m41054G0(String str, char c10, String missingDelimiterValue) {
        int m41071T;
        C9322n.m27781e(str, "<this>");
        C9322n.m27781e(missingDelimiterValue, "missingDelimiterValue");
        m41071T = m41071T(str, c10, 0, false, 6, null);
        if (m41071T == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, m41071T);
        C9322n.m27780d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: H */
    public static final boolean m41055H(CharSequence charSequence, CharSequence other, boolean z10) {
        int m41072U;
        C9322n.m27781e(charSequence, "<this>");
        C9322n.m27781e(other, "other");
        if (other instanceof String) {
            m41072U = m41072U(charSequence, (String) other, 0, z10, 2, null);
            if (m41072U >= 0) {
                return true;
            }
        } else if (m41070S(charSequence, other, 0, charSequence.length(), z10, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: H0 */
    public static final String m41056H0(String str, String delimiter, String missingDelimiterValue) {
        int m41072U;
        C9322n.m27781e(str, "<this>");
        C9322n.m27781e(delimiter, "delimiter");
        C9322n.m27781e(missingDelimiterValue, "missingDelimiterValue");
        m41072U = m41072U(str, delimiter, 0, false, 6, null);
        if (m41072U == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, m41072U);
        C9322n.m27780d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: I */
    public static /* synthetic */ boolean m41057I(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m41053G(charSequence, c10, z10);
    }

    /* renamed from: I0 */
    public static /* synthetic */ String m41058I0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return m41054G0(str, c10, str2);
    }

    /* renamed from: J */
    public static /* synthetic */ boolean m41059J(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m41055H(charSequence, charSequence2, z10);
    }

    /* renamed from: J0 */
    public static /* synthetic */ String m41060J0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return m41056H0(str, str2, str3);
    }

    /* renamed from: K */
    public static final boolean m41061K(CharSequence charSequence, CharSequence suffix, boolean z10) {
        boolean m41036q;
        C9322n.m27781e(charSequence, "<this>");
        C9322n.m27781e(suffix, "suffix");
        if (z10 || !(charSequence instanceof String) || !(suffix instanceof String)) {
            return m41090m0(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z10);
        }
        m41036q = C12524p.m41036q((String) charSequence, (String) suffix, false, 2, null);
        return m41036q;
    }

    /* renamed from: K0 */
    public static CharSequence m41062K0(CharSequence charSequence) {
        C9322n.m27781e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean m40958c = C12510b.m40958c(charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!m40958c) {
                    break;
                }
                length--;
            } else if (m40958c) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    /* renamed from: L */
    public static /* synthetic */ boolean m41063L(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m41061K(charSequence, charSequence2, z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0096, code lost:
    
        return ck.C2033r.m10353a(java.lang.Integer.valueOf(r12), r9);
     */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final ck.C2028m<java.lang.Integer, java.lang.String> m41064M(java.lang.CharSequence r10, java.util.Collection<java.lang.String> r11, int r12, boolean r13, boolean r14) {
        /*
            r0 = 0
            if (r13 != 0) goto L2f
            int r1 = r11.size()
            r2 = 1
            if (r1 != r2) goto L2f
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.lang.Object r11 = dk.C7027p.m20529V(r11)
            java.lang.String r11 = (java.lang.String) r11
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r10
            r2 = r11
            r3 = r12
            if (r14 != 0) goto L1f
            int r10 = p450xk.C12515g.m40989U(r1, r2, r3, r4, r5, r6)
            goto L23
        L1f:
            int r10 = p450xk.C12515g.m40991Z(r1, r2, r3, r4, r5, r6)
        L23:
            if (r10 >= 0) goto L26
            goto L2e
        L26:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            ck.m r0 = ck.C2033r.m10353a(r10, r11)
        L2e:
            return r0
        L2f:
            r1 = 0
            if (r14 != 0) goto L40
            uk.f r14 = new uk.f
            int r12 = uk.C11583j.m36282b(r12, r1)
            int r1 = r10.length()
            r14.<init>(r12, r1)
            goto L4c
        L40:
            int r14 = m41066O(r10)
            int r12 = uk.C11583j.m36284d(r12, r14)
            uk.d r14 = uk.C11583j.m36288h(r12, r1)
        L4c:
            boolean r12 = r10 instanceof java.lang.String
            if (r12 == 0) goto L9b
            int r12 = r14.m36268c()
            int r1 = r14.m36269d()
            int r14 = r14.m36270f()
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
            boolean r2 = p450xk.C12524p.m41040u(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L6b
            goto L8a
        L89:
            r9 = r0
        L8a:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L97
        L8e:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            ck.m r10 = ck.C2033r.m10353a(r10, r9)
            return r10
        L97:
            if (r12 == r1) goto Ldc
            int r12 = r12 + r14
            goto L64
        L9b:
            int r12 = r14.m36268c()
            int r1 = r14.m36269d()
            int r14 = r14.m36270f()
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
            boolean r2 = m41090m0(r2, r3, r4, r5, r6, r7)
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
        throw new UnsupportedOperationException("Method not decompiled: p450xk.C12525q.m41064M(java.lang.CharSequence, java.util.Collection, int, boolean, boolean):ck.m");
    }

    /* renamed from: N */
    public static final C11579f m41065N(CharSequence charSequence) {
        C9322n.m27781e(charSequence, "<this>");
        return new C11579f(0, charSequence.length() - 1);
    }

    /* renamed from: O */
    public static final int m41066O(CharSequence charSequence) {
        C9322n.m27781e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* renamed from: P */
    public static final int m41067P(CharSequence charSequence, char c10, int i10, boolean z10) {
        C9322n.m27781e(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? m41073V(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).indexOf(c10, i10);
    }

    /* renamed from: Q */
    public static final int m41068Q(CharSequence charSequence, String string, int i10, boolean z10) {
        C9322n.m27781e(charSequence, "<this>");
        C9322n.m27781e(string, "string");
        return (z10 || !(charSequence instanceof String)) ? m41070S(charSequence, string, i10, charSequence.length(), z10, false, 16, null) : ((String) charSequence).indexOf(string, i10);
    }

    /* renamed from: R */
    private static final int m41069R(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        int m36295d;
        int m36293b;
        C11577d m36299h;
        int m36293b2;
        int m36295d2;
        if (z11) {
            m36295d = C11585l.m36295d(i10, m41066O(charSequence));
            m36293b = C11585l.m36293b(i11, 0);
            m36299h = C11585l.m36299h(m36295d, m36293b);
        } else {
            m36293b2 = C11585l.m36293b(i10, 0);
            m36295d2 = C11585l.m36295d(i11, charSequence.length());
            m36299h = new C11579f(m36293b2, m36295d2);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int m36268c = m36299h.m36268c();
            int m36269d = m36299h.m36269d();
            int m36270f = m36299h.m36270f();
            if ((m36270f <= 0 || m36268c > m36269d) && (m36270f >= 0 || m36269d > m36268c)) {
                return -1;
            }
            while (!C12524p.m41040u((String) charSequence2, 0, (String) charSequence, m36268c, charSequence2.length(), z10)) {
                if (m36268c == m36269d) {
                    return -1;
                }
                m36268c += m36270f;
            }
            return m36268c;
        }
        int m36268c2 = m36299h.m36268c();
        int m36269d2 = m36299h.m36269d();
        int m36270f2 = m36299h.m36270f();
        if ((m36270f2 <= 0 || m36268c2 > m36269d2) && (m36270f2 >= 0 || m36269d2 > m36268c2)) {
            return -1;
        }
        while (!m41090m0(charSequence2, 0, charSequence, m36268c2, charSequence2.length(), z10)) {
            if (m36268c2 == m36269d2) {
                return -1;
            }
            m36268c2 += m36270f2;
        }
        return m36268c2;
    }

    /* renamed from: S */
    static /* synthetic */ int m41070S(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        return m41069R(charSequence, charSequence2, i10, i11, z10, z11);
    }

    /* renamed from: T */
    public static /* synthetic */ int m41071T(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m41067P(charSequence, c10, i10, z10);
    }

    /* renamed from: U */
    public static /* synthetic */ int m41072U(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m41068Q(charSequence, str, i10, z10);
    }

    /* renamed from: V */
    public static final int m41073V(CharSequence charSequence, char[] chars, int i10, boolean z10) {
        int m36293b;
        boolean z11;
        char m20468U;
        C9322n.m27781e(charSequence, "<this>");
        C9322n.m27781e(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            m20468U = C7021m.m20468U(chars);
            return ((String) charSequence).indexOf(m20468U, i10);
        }
        m36293b = C11585l.m36293b(i10, 0);
        AbstractC7006e0 it = new C11579f(m36293b, m41066O(charSequence)).iterator();
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
                if (C12511c.m40960e(chars[i11], charAt, z10)) {
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

    /* renamed from: W */
    public static final int m41074W(CharSequence charSequence, char c10, int i10, boolean z10) {
        C9322n.m27781e(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? m41078a0(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).lastIndexOf(c10, i10);
    }

    /* renamed from: X */
    public static final int m41075X(CharSequence charSequence, String string, int i10, boolean z10) {
        C9322n.m27781e(charSequence, "<this>");
        C9322n.m27781e(string, "string");
        return (z10 || !(charSequence instanceof String)) ? m41069R(charSequence, string, i10, 0, z10, true) : ((String) charSequence).lastIndexOf(string, i10);
    }

    /* renamed from: Y */
    public static /* synthetic */ int m41076Y(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = m41066O(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m41074W(charSequence, c10, i10, z10);
    }

    /* renamed from: Z */
    public static /* synthetic */ int m41077Z(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = m41066O(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m41075X(charSequence, str, i10, z10);
    }

    /* renamed from: a0 */
    public static final int m41078a0(CharSequence charSequence, char[] chars, int i10, boolean z10) {
        int m36295d;
        char m20468U;
        C9322n.m27781e(charSequence, "<this>");
        C9322n.m27781e(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            m20468U = C7021m.m20468U(chars);
            return ((String) charSequence).lastIndexOf(m20468U, i10);
        }
        for (m36295d = C11585l.m36295d(i10, m41066O(charSequence)); -1 < m36295d; m36295d--) {
            char charAt = charSequence.charAt(m36295d);
            int length = chars.length;
            boolean z11 = false;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                if (C12511c.m40960e(chars[i11], charAt, z10)) {
                    z11 = true;
                    break;
                }
                i11++;
            }
            if (z11) {
                return m36295d;
            }
        }
        return -1;
    }

    /* renamed from: b0 */
    public static final InterfaceC12228d<String> m41079b0(CharSequence charSequence) {
        C9322n.m27781e(charSequence, "<this>");
        return m41100w0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    /* renamed from: c0 */
    public static final List<String> m41080c0(CharSequence charSequence) {
        List<String> m39387k;
        C9322n.m27781e(charSequence, "<this>");
        m39387k = C12236l.m39387k(m41079b0(charSequence));
        return m39387k;
    }

    /* renamed from: d0 */
    public static final CharSequence m41081d0(CharSequence charSequence, int i10, char c10) {
        C9322n.m27781e(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
        }
        if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(charSequence);
        AbstractC7006e0 it = new C11579f(1, i10 - charSequence.length()).iterator();
        while (it.hasNext()) {
            it.nextInt();
            sb2.append(c10);
        }
        return sb2;
    }

    /* renamed from: e0 */
    public static final String m41082e0(String str, int i10, char c10) {
        C9322n.m27781e(str, "<this>");
        return m41081d0(str, i10, c10).toString();
    }

    /* renamed from: f0 */
    public static /* synthetic */ String m41083f0(String str, int i10, char c10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            c10 = ' ';
        }
        return m41082e0(str, i10, c10);
    }

    /* renamed from: g0 */
    public static final CharSequence m41084g0(CharSequence charSequence, int i10, char c10) {
        C9322n.m27781e(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
        }
        if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(i10);
        AbstractC7006e0 it = new C11579f(1, i10 - charSequence.length()).iterator();
        while (it.hasNext()) {
            it.nextInt();
            sb2.append(c10);
        }
        sb2.append(charSequence);
        return sb2;
    }

    /* renamed from: h0 */
    public static String m41085h0(String str, int i10, char c10) {
        C9322n.m27781e(str, "<this>");
        return m41084g0(str, i10, c10).toString();
    }

    /* renamed from: i0 */
    private static final InterfaceC12228d<C11579f> m41086i0(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11) {
        m41093p0(i11);
        return new C12513e(charSequence, i10, i11, new a(cArr, z10));
    }

    /* renamed from: j0 */
    private static final InterfaceC12228d<C11579f> m41087j0(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11) {
        List m20435c;
        m41093p0(i11);
        m20435c = C7019l.m20435c(strArr);
        return new C12513e(charSequence, i10, i11, new b(m20435c, z10));
    }

    /* renamed from: k0 */
    static /* synthetic */ InterfaceC12228d m41088k0(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return m41086i0(charSequence, cArr, i10, z10, i11);
    }

    /* renamed from: l0 */
    static /* synthetic */ InterfaceC12228d m41089l0(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return m41087j0(charSequence, strArr, i10, z10, i11);
    }

    /* renamed from: m0 */
    public static final boolean m41090m0(CharSequence charSequence, int i10, CharSequence other, int i11, int i12, boolean z10) {
        C9322n.m27781e(charSequence, "<this>");
        C9322n.m27781e(other, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > other.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!C12511c.m40960e(charSequence.charAt(i10 + i13), other.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n0 */
    public static String m41091n0(String str, CharSequence prefix) {
        C9322n.m27781e(str, "<this>");
        C9322n.m27781e(prefix, "prefix");
        if (!m41102y0(str, prefix, false, 2, null)) {
            return str;
        }
        String substring = str.substring(prefix.length());
        C9322n.m27780d(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    /* renamed from: o0 */
    public static String m41092o0(String str, CharSequence suffix) {
        C9322n.m27781e(str, "<this>");
        C9322n.m27781e(suffix, "suffix");
        if (!m41063L(str, suffix, false, 2, null)) {
            return str;
        }
        String substring = str.substring(0, str.length() - suffix.length());
        C9322n.m27780d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: p0 */
    public static final void m41093p0(int i10) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i10).toString());
    }

    /* renamed from: q0 */
    public static final List<String> m41094q0(CharSequence charSequence, char[] delimiters, boolean z10, int i10) {
        Iterable m39381e;
        int m20590r;
        C9322n.m27781e(charSequence, "<this>");
        C9322n.m27781e(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return m41096s0(charSequence, String.valueOf(delimiters[0]), z10, i10);
        }
        m39381e = C12236l.m39381e(m41088k0(charSequence, delimiters, 0, z10, i10, 2, null));
        m20590r = C7033s.m20590r(m39381e, 10);
        ArrayList arrayList = new ArrayList(m20590r);
        Iterator it = m39381e.iterator();
        while (it.hasNext()) {
            arrayList.add(m41103z0(charSequence, (C11579f) it.next()));
        }
        return arrayList;
    }

    /* renamed from: r0 */
    public static final List<String> m41095r0(CharSequence charSequence, String[] delimiters, boolean z10, int i10) {
        Iterable m39381e;
        int m20590r;
        C9322n.m27781e(charSequence, "<this>");
        C9322n.m27781e(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (!(str.length() == 0)) {
                return m41096s0(charSequence, str, z10, i10);
            }
        }
        m39381e = C12236l.m39381e(m41089l0(charSequence, delimiters, 0, z10, i10, 2, null));
        m20590r = C7033s.m20590r(m39381e, 10);
        ArrayList arrayList = new ArrayList(m20590r);
        Iterator it = m39381e.iterator();
        while (it.hasNext()) {
            arrayList.add(m41103z0(charSequence, (C11579f) it.next()));
        }
        return arrayList;
    }

    /* renamed from: s0 */
    private static final List<String> m41096s0(CharSequence charSequence, String str, boolean z10, int i10) {
        List<String> m20572e;
        m41093p0(i10);
        int i11 = 0;
        int m41068Q = m41068Q(charSequence, str, 0, z10);
        if (m41068Q == -1 || i10 == 1) {
            m20572e = C7029q.m20572e(charSequence.toString());
            return m20572e;
        }
        boolean z11 = i10 > 0;
        ArrayList arrayList = new ArrayList(z11 ? C11585l.m36295d(i10, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(i11, m41068Q).toString());
            i11 = str.length() + m41068Q;
            if (z11 && arrayList.size() == i10 - 1) {
                break;
            }
            m41068Q = m41068Q(charSequence, str, i11, z10);
        } while (m41068Q != -1);
        arrayList.add(charSequence.subSequence(i11, charSequence.length()).toString());
        return arrayList;
    }

    /* renamed from: t0 */
    public static /* synthetic */ List m41097t0(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return m41094q0(charSequence, cArr, z10, i10);
    }

    /* renamed from: u0 */
    public static /* synthetic */ List m41098u0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return m41095r0(charSequence, strArr, z10, i10);
    }

    /* renamed from: v0 */
    public static final InterfaceC12228d<String> m41099v0(CharSequence charSequence, String[] delimiters, boolean z10, int i10) {
        InterfaceC12228d<String> m39386j;
        C9322n.m27781e(charSequence, "<this>");
        C9322n.m27781e(delimiters, "delimiters");
        m39386j = C12236l.m39386j(m41089l0(charSequence, delimiters, 0, z10, i10, 2, null), new c(charSequence));
        return m39386j;
    }

    /* renamed from: w0 */
    public static /* synthetic */ InterfaceC12228d m41100w0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return m41099v0(charSequence, strArr, z10, i10);
    }

    /* renamed from: x0 */
    public static final boolean m41101x0(CharSequence charSequence, CharSequence prefix, boolean z10) {
        boolean m41031E;
        C9322n.m27781e(charSequence, "<this>");
        C9322n.m27781e(prefix, "prefix");
        if (z10 || !(charSequence instanceof String) || !(prefix instanceof String)) {
            return m41090m0(charSequence, 0, prefix, 0, prefix.length(), z10);
        }
        m41031E = C12524p.m41031E((String) charSequence, (String) prefix, false, 2, null);
        return m41031E;
    }

    /* renamed from: y0 */
    public static /* synthetic */ boolean m41102y0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m41101x0(charSequence, charSequence2, z10);
    }

    /* renamed from: z0 */
    public static final String m41103z0(CharSequence charSequence, C11579f range) {
        C9322n.m27781e(charSequence, "<this>");
        C9322n.m27781e(range, "range");
        return charSequence.subSequence(range.m36276o().intValue(), range.m36275n().intValue() + 1).toString();
    }
}

package p268o8;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import java.nio.charset.Charset;
import java.util.List;
import p082eb.C7149e;
import p120g8.AbstractC7490h;
import p120g8.C7484b;
import p120g8.C7493k;
import p120g8.InterfaceC7491i;
import p363t8.C11146e0;
import p363t8.C11172r0;
import p363t8.C11173s;

/* renamed from: o8.a */
/* loaded from: classes.dex */
public final class C9819a extends AbstractC7490h {

    /* renamed from: o */
    private final C11146e0 f24252o;

    /* renamed from: p */
    private final boolean f24253p;

    /* renamed from: q */
    private final int f24254q;

    /* renamed from: r */
    private final int f24255r;

    /* renamed from: s */
    private final String f24256s;

    /* renamed from: t */
    private final float f24257t;

    /* renamed from: u */
    private final int f24258u;

    public C9819a(List<byte[]> list) {
        super("Tx3gDecoder");
        this.f24252o = new C11146e0();
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f24254q = 0;
            this.f24255r = -1;
            this.f24256s = "sans-serif";
            this.f24253p = false;
            this.f24257t = 0.85f;
            this.f24258u = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.f24254q = bArr[24];
        this.f24255r = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f24256s = "Serif".equals(C11172r0.m34864E(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i10 = bArr[25] * 20;
        this.f24258u = i10;
        boolean z10 = (bArr[0] & 32) != 0;
        this.f24253p = z10;
        if (z10) {
            this.f24257t = C11172r0.m34940p(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10, 0.0f, 0.95f);
        } else {
            this.f24257t = 0.85f;
        }
    }

    /* renamed from: B */
    private void m29491B(C11146e0 c11146e0, SpannableStringBuilder spannableStringBuilder) {
        m29492C(c11146e0.m34679a() >= 12);
        int m34670N = c11146e0.m34670N();
        int m34670N2 = c11146e0.m34670N();
        c11146e0.m34678V(2);
        int m34664H = c11146e0.m34664H();
        c11146e0.m34678V(1);
        int m34692q = c11146e0.m34692q();
        if (m34670N2 > spannableStringBuilder.length()) {
            C11173s.m34970i("Tx3gDecoder", "Truncating styl end (" + m34670N2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            m34670N2 = spannableStringBuilder.length();
        }
        if (m34670N < m34670N2) {
            int i10 = m34670N2;
            m29494E(spannableStringBuilder, m34664H, this.f24254q, m34670N, i10, 0);
            m29493D(spannableStringBuilder, m34692q, this.f24255r, m34670N, i10, 0);
            return;
        }
        C11173s.m34970i("Tx3gDecoder", "Ignoring styl with start (" + m34670N + ") >= end (" + m34670N2 + ").");
    }

    /* renamed from: C */
    private static void m29492C(boolean z10) {
        if (!z10) {
            throw new C7493k("Unexpected subtitle format.");
        }
    }

    /* renamed from: D */
    private static void m29493D(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m29494E(android.text.SpannableStringBuilder r5, int r6, int r7, int r8, int r9, int r10) {
        /*
            if (r6 == r7) goto L4c
            r7 = r10 | 33
            r10 = r6 & 1
            r0 = 0
            r1 = 1
            if (r10 == 0) goto Lc
            r10 = r1
            goto Ld
        Lc:
            r10 = r0
        Ld:
            r2 = r6 & 2
            if (r2 == 0) goto L13
            r2 = r1
            goto L14
        L13:
            r2 = r0
        L14:
            if (r10 == 0) goto L23
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            if (r2 == 0) goto L1f
            r4 = 3
            r3.<init>(r4)
            goto L2b
        L1f:
            r3.<init>(r1)
            goto L2b
        L23:
            if (r2 == 0) goto L2e
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r4 = 2
            r3.<init>(r4)
        L2b:
            r5.setSpan(r3, r8, r9, r7)
        L2e:
            r6 = r6 & 4
            if (r6 == 0) goto L33
            goto L34
        L33:
            r1 = r0
        L34:
            if (r1 == 0) goto L3e
            android.text.style.UnderlineSpan r6 = new android.text.style.UnderlineSpan
            r6.<init>()
            r5.setSpan(r6, r8, r9, r7)
        L3e:
            if (r1 != 0) goto L4c
            if (r10 != 0) goto L4c
            if (r2 != 0) goto L4c
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r6.<init>(r0)
            r5.setSpan(r6, r8, r9, r7)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p268o8.C9819a.m29494E(android.text.SpannableStringBuilder, int, int, int, int, int):void");
    }

    /* renamed from: F */
    private static void m29495F(SpannableStringBuilder spannableStringBuilder, String str, int i10, int i11) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i10, i11, 16711713);
        }
    }

    /* renamed from: G */
    private static String m29496G(C11146e0 c11146e0) {
        m29492C(c11146e0.m34679a() >= 2);
        int m34670N = c11146e0.m34670N();
        if (m34670N == 0) {
            return "";
        }
        int m34683f = c11146e0.m34683f();
        Charset m34672P = c11146e0.m34672P();
        int m34683f2 = m34670N - (c11146e0.m34683f() - m34683f);
        if (m34672P == null) {
            m34672P = C7149e.f16019c;
        }
        return c11146e0.m34662F(m34683f2, m34672P);
    }

    @Override // p120g8.AbstractC7490h
    /* renamed from: z */
    protected InterfaceC7491i mo22811z(byte[] bArr, int i10, boolean z10) {
        this.f24252o.m34675S(bArr, i10);
        String m29496G = m29496G(this.f24252o);
        if (m29496G.isEmpty()) {
            return C9820b.f24259b;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m29496G);
        m29494E(spannableStringBuilder, this.f24254q, 0, 0, spannableStringBuilder.length(), 16711680);
        m29493D(spannableStringBuilder, this.f24255r, -1, 0, spannableStringBuilder.length(), 16711680);
        m29495F(spannableStringBuilder, this.f24256s, 0, spannableStringBuilder.length());
        float f10 = this.f24257t;
        while (this.f24252o.m34679a() >= 8) {
            int m34683f = this.f24252o.m34683f();
            int m34692q = this.f24252o.m34692q();
            int m34692q2 = this.f24252o.m34692q();
            if (m34692q2 == 1937013100) {
                m29492C(this.f24252o.m34679a() >= 2);
                int m34670N = this.f24252o.m34670N();
                for (int i11 = 0; i11 < m34670N; i11++) {
                    m29491B(this.f24252o, spannableStringBuilder);
                }
            } else if (m34692q2 == 1952608120 && this.f24253p) {
                m29492C(this.f24252o.m34679a() >= 2);
                f10 = C11172r0.m34940p(this.f24252o.m34670N() / this.f24258u, 0.0f, 0.95f);
            }
            this.f24252o.m34677U(m34683f + m34692q);
        }
        return new C9820b(new C7484b.b().m22778o(spannableStringBuilder).m22771h(f10, 0).m22772i(0).m22764a());
    }
}

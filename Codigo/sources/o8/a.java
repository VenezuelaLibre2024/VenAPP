package o8;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import eb.e;
import g8.b;
import g8.h;
import g8.i;
import g8.k;
import java.nio.charset.Charset;
import java.util.List;
import t8.e0;
import t8.r0;
import t8.s;

/* loaded from: classes.dex */
public final class a extends h {

    /* renamed from: o, reason: collision with root package name */
    private final e0 f22319o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f22320p;

    /* renamed from: q, reason: collision with root package name */
    private final int f22321q;

    /* renamed from: r, reason: collision with root package name */
    private final int f22322r;

    /* renamed from: s, reason: collision with root package name */
    private final String f22323s;

    /* renamed from: t, reason: collision with root package name */
    private final float f22324t;

    /* renamed from: u, reason: collision with root package name */
    private final int f22325u;

    public a(List<byte[]> list) {
        super("Tx3gDecoder");
        this.f22319o = new e0();
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f22321q = 0;
            this.f22322r = -1;
            this.f22323s = "sans-serif";
            this.f22320p = false;
            this.f22324t = 0.85f;
            this.f22325u = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.f22321q = bArr[24];
        this.f22322r = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f22323s = "Serif".equals(r0.E(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i10 = bArr[25] * 20;
        this.f22325u = i10;
        boolean z10 = (bArr[0] & 32) != 0;
        this.f22320p = z10;
        if (z10) {
            this.f22324t = r0.p(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10, 0.0f, 0.95f);
        } else {
            this.f22324t = 0.85f;
        }
    }

    private void B(e0 e0Var, SpannableStringBuilder spannableStringBuilder) {
        C(e0Var.a() >= 12);
        int N = e0Var.N();
        int N2 = e0Var.N();
        e0Var.V(2);
        int H = e0Var.H();
        e0Var.V(1);
        int q10 = e0Var.q();
        if (N2 > spannableStringBuilder.length()) {
            s.i("Tx3gDecoder", "Truncating styl end (" + N2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            N2 = spannableStringBuilder.length();
        }
        if (N < N2) {
            int i10 = N2;
            E(spannableStringBuilder, H, this.f22321q, N, i10, 0);
            D(spannableStringBuilder, q10, this.f22322r, N, i10, 0);
            return;
        }
        s.i("Tx3gDecoder", "Ignoring styl with start (" + N + ") >= end (" + N2 + ").");
    }

    private static void C(boolean z10) {
        if (!z10) {
            throw new k("Unexpected subtitle format.");
        }
    }

    private static void D(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void E(android.text.SpannableStringBuilder r5, int r6, int r7, int r8, int r9, int r10) {
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
        throw new UnsupportedOperationException("Method not decompiled: o8.a.E(android.text.SpannableStringBuilder, int, int, int, int, int):void");
    }

    private static void F(SpannableStringBuilder spannableStringBuilder, String str, int i10, int i11) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i10, i11, 16711713);
        }
    }

    private static String G(e0 e0Var) {
        C(e0Var.a() >= 2);
        int N = e0Var.N();
        if (N == 0) {
            return "";
        }
        int f10 = e0Var.f();
        Charset P = e0Var.P();
        int f11 = N - (e0Var.f() - f10);
        if (P == null) {
            P = e.f14596c;
        }
        return e0Var.F(f11, P);
    }

    @Override // g8.h
    protected i z(byte[] bArr, int i10, boolean z10) {
        this.f22319o.S(bArr, i10);
        String G = G(this.f22319o);
        if (G.isEmpty()) {
            return b.f22326b;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(G);
        E(spannableStringBuilder, this.f22321q, 0, 0, spannableStringBuilder.length(), 16711680);
        D(spannableStringBuilder, this.f22322r, -1, 0, spannableStringBuilder.length(), 16711680);
        F(spannableStringBuilder, this.f22323s, 0, spannableStringBuilder.length());
        float f10 = this.f22324t;
        while (this.f22319o.a() >= 8) {
            int f11 = this.f22319o.f();
            int q10 = this.f22319o.q();
            int q11 = this.f22319o.q();
            if (q11 == 1937013100) {
                C(this.f22319o.a() >= 2);
                int N = this.f22319o.N();
                for (int i11 = 0; i11 < N; i11++) {
                    B(this.f22319o, spannableStringBuilder);
                }
            } else if (q11 == 1952608120 && this.f22320p) {
                C(this.f22319o.a() >= 2);
                f10 = r0.p(this.f22319o.N() / this.f22325u, 0.0f, 0.95f);
            }
            this.f22319o.U(f11 + q10);
        }
        return new b(new b.C0262b().o(spannableStringBuilder).h(f10, 0).i(0).a());
    }
}

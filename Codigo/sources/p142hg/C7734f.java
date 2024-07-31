package p142hg;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import kg.C9263a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: hg.f */
/* loaded from: classes2.dex */
public final class C7734f {

    /* renamed from: f */
    static final C7734f f18426f = new C7734f(AbstractC7735g.f18432b, 0, 0, 0);

    /* renamed from: a */
    private final int f18427a;

    /* renamed from: b */
    private final AbstractC7735g f18428b;

    /* renamed from: c */
    private final int f18429c;

    /* renamed from: d */
    private final int f18430d;

    /* renamed from: e */
    private final int f18431e;

    private C7734f(AbstractC7735g abstractC7735g, int i10, int i11, int i12) {
        this.f18428b = abstractC7735g;
        this.f18427a = i10;
        this.f18429c = i11;
        this.f18430d = i12;
        this.f18431e = m23595c(i11);
    }

    /* renamed from: c */
    private static int m23595c(int i10) {
        if (i10 > 62) {
            return 21;
        }
        if (i10 > 31) {
            return 20;
        }
        return i10 > 0 ? 10 : 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C7734f m23596a(int i10) {
        AbstractC7735g abstractC7735g = this.f18428b;
        int i11 = this.f18427a;
        int i12 = this.f18430d;
        if (i11 == 4 || i11 == 2) {
            int i13 = C7732d.f18418d[i11][0];
            int i14 = 65535 & i13;
            int i15 = i13 >> 16;
            abstractC7735g = abstractC7735g.m23606a(i14, i15);
            i12 += i15;
            i11 = 0;
        }
        int i16 = this.f18429c;
        C7734f c7734f = new C7734f(abstractC7735g, i11, i16 + 1, i12 + ((i16 == 0 || i16 == 31) ? 18 : i16 == 62 ? 9 : 8));
        return c7734f.f18429c == 2078 ? c7734f.m23598d(i10 + 1) : c7734f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C7734f m23597b(int i10) {
        AbstractC7735g abstractC7735g;
        AbstractC7735g abstractC7735g2 = m23604j(4, 0).f18428b;
        int i11 = 3;
        if (i10 < 0) {
            abstractC7735g = abstractC7735g2.m23606a(0, 3);
        } else {
            if (i10 > 999999) {
                throw new IllegalArgumentException("ECI code must be between 0 and 999999");
            }
            byte[] bytes = Integer.toString(i10).getBytes(StandardCharsets.ISO_8859_1);
            AbstractC7735g m23606a = abstractC7735g2.m23606a(bytes.length, 3);
            for (byte b10 : bytes) {
                m23606a = m23606a.m23606a((b10 - 48) + 2, 4);
            }
            i11 = 3 + (bytes.length * 4);
            abstractC7735g = m23606a;
        }
        return new C7734f(abstractC7735g, this.f18427a, 0, this.f18430d + i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public C7734f m23598d(int i10) {
        int i11 = this.f18429c;
        return i11 == 0 ? this : new C7734f(this.f18428b.m23607b(i10 - i11, i11), this.f18427a, 0, this.f18430d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m23599e() {
        return this.f18429c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m23600f() {
        return this.f18430d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m23601g() {
        return this.f18427a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean m23602h(C7734f c7734f) {
        int i10 = this.f18430d + (C7732d.f18418d[this.f18427a][c7734f.f18427a] >> 16);
        int i11 = this.f18429c;
        int i12 = c7734f.f18429c;
        if (i11 < i12) {
            i10 += c7734f.f18431e - this.f18431e;
        } else if (i11 > i12 && i12 > 0) {
            i10 += 10;
        }
        return i10 <= c7734f.f18430d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C7734f m23603i(int i10, int i11) {
        int i12 = this.f18430d;
        AbstractC7735g abstractC7735g = this.f18428b;
        int i13 = this.f18427a;
        if (i10 != i13) {
            int i14 = C7732d.f18418d[i13][i10];
            int i15 = 65535 & i14;
            int i16 = i14 >> 16;
            abstractC7735g = abstractC7735g.m23606a(i15, i16);
            i12 += i16;
        }
        int i17 = i10 == 2 ? 4 : 5;
        return new C7734f(abstractC7735g.m23606a(i11, i17), i10, 0, i12 + i17);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public C7734f m23604j(int i10, int i11) {
        AbstractC7735g abstractC7735g = this.f18428b;
        int i12 = this.f18427a;
        int i13 = i12 == 2 ? 4 : 5;
        return new C7734f(abstractC7735g.m23606a(C7732d.f18420f[i12][i10], i13).m23606a(i11, 5), this.f18427a, 0, this.f18430d + i13 + 5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public C9263a m23605k(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC7735g abstractC7735g = m23598d(bArr.length).f18428b; abstractC7735g != null; abstractC7735g = abstractC7735g.m23608d()) {
            arrayList.add(abstractC7735g);
        }
        C9263a c9263a = new C9263a();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((AbstractC7735g) arrayList.get(size)).mo23577c(c9263a, bArr);
        }
        return c9263a;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", C7732d.f18417c[this.f18427a], Integer.valueOf(this.f18430d), Integer.valueOf(this.f18429c));
    }
}

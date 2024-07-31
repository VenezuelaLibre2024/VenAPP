package p314qg;

import p066dg.C6945f;

/* renamed from: qg.l */
/* loaded from: classes2.dex */
public class C10487l {

    /* renamed from: i */
    static final C10487l[] f26054i;

    /* renamed from: j */
    private static C10487l[] f26055j;

    /* renamed from: a */
    private final boolean f26056a;

    /* renamed from: b */
    private final int f26057b;

    /* renamed from: c */
    private final int f26058c;

    /* renamed from: d */
    public final int f26059d;

    /* renamed from: e */
    public final int f26060e;

    /* renamed from: f */
    private final int f26061f;

    /* renamed from: g */
    private final int f26062g;

    /* renamed from: h */
    private final int f26063h;

    static {
        C10487l[] c10487lArr = {new C10487l(false, 3, 5, 8, 8, 1), new C10487l(false, 5, 7, 10, 10, 1), new C10487l(true, 5, 7, 16, 6, 1), new C10487l(false, 8, 10, 12, 12, 1), new C10487l(true, 10, 11, 14, 6, 2), new C10487l(false, 12, 12, 14, 14, 1), new C10487l(true, 16, 14, 24, 10, 1), new C10487l(false, 18, 14, 16, 16, 1), new C10487l(false, 22, 18, 18, 18, 1), new C10487l(true, 22, 18, 16, 10, 2), new C10487l(false, 30, 20, 20, 20, 1), new C10487l(true, 32, 24, 16, 14, 2), new C10487l(false, 36, 24, 22, 22, 1), new C10487l(false, 44, 28, 24, 24, 1), new C10487l(true, 49, 28, 22, 14, 2), new C10487l(false, 62, 36, 14, 14, 4), new C10487l(false, 86, 42, 16, 16, 4), new C10487l(false, 114, 48, 18, 18, 4), new C10487l(false, 144, 56, 20, 20, 4), new C10487l(false, 174, 68, 22, 22, 4), new C10487l(false, 204, 84, 24, 24, 4, 102, 42), new C10487l(false, 280, 112, 14, 14, 16, 140, 56), new C10487l(false, 368, 144, 16, 16, 16, 92, 36), new C10487l(false, 456, 192, 18, 18, 16, 114, 48), new C10487l(false, 576, 224, 20, 20, 16, 144, 56), new C10487l(false, 696, 272, 22, 22, 16, 174, 68), new C10487l(false, 816, 336, 24, 24, 16, 136, 56), new C10487l(false, 1050, 408, 18, 18, 36, 175, 68), new C10487l(false, 1304, 496, 20, 20, 36, 163, 62), new C10479d()};
        f26054i = c10487lArr;
        f26055j = c10487lArr;
    }

    public C10487l(boolean z10, int i10, int i11, int i12, int i13, int i14) {
        this(z10, i10, i11, i12, i13, i14, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10487l(boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f26056a = z10;
        this.f26057b = i10;
        this.f26058c = i11;
        this.f26059d = i12;
        this.f26060e = i13;
        this.f26061f = i14;
        this.f26062g = i15;
        this.f26063h = i16;
    }

    /* renamed from: e */
    private int m31534e() {
        int i10 = this.f26061f;
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2 && i10 != 4) {
                if (i10 == 16) {
                    return 4;
                }
                if (i10 == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i11;
    }

    /* renamed from: k */
    private int m31535k() {
        int i10 = this.f26061f;
        if (i10 == 1 || i10 == 2) {
            return 1;
        }
        if (i10 == 4) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    /* renamed from: l */
    public static C10487l m31536l(int i10, EnumC10488m enumC10488m, C6945f c6945f, C6945f c6945f2, boolean z10) {
        for (C10487l c10487l : f26055j) {
            if (!(enumC10488m == EnumC10488m.FORCE_SQUARE && c10487l.f26056a) && ((enumC10488m != EnumC10488m.FORCE_RECTANGLE || c10487l.f26056a) && ((c6945f == null || (c10487l.m31543j() >= c6945f.m20093b() && c10487l.m31542i() >= c6945f.m20092a())) && ((c6945f2 == null || (c10487l.m31543j() <= c6945f2.m20093b() && c10487l.m31542i() <= c6945f2.m20092a())) && i10 <= c10487l.f26057b)))) {
                return c10487l;
            }
        }
        if (!z10) {
            return null;
        }
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: " + i10);
    }

    /* renamed from: a */
    public final int m31537a() {
        return this.f26057b;
    }

    /* renamed from: b */
    public int mo31431b(int i10) {
        return this.f26062g;
    }

    /* renamed from: c */
    public final int m31538c() {
        return this.f26058c;
    }

    /* renamed from: d */
    public final int m31539d(int i10) {
        return this.f26063h;
    }

    /* renamed from: f */
    public int mo31432f() {
        return this.f26057b / this.f26062g;
    }

    /* renamed from: g */
    public final int m31540g() {
        return m31535k() * this.f26060e;
    }

    /* renamed from: h */
    public final int m31541h() {
        return m31534e() * this.f26059d;
    }

    /* renamed from: i */
    public final int m31542i() {
        return m31540g() + (m31535k() * 2);
    }

    /* renamed from: j */
    public final int m31543j() {
        return m31541h() + (m31534e() * 2);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f26056a ? "Rectangular Symbol:" : "Square Symbol:");
        sb2.append(" data region ");
        sb2.append(this.f26059d);
        sb2.append('x');
        sb2.append(this.f26060e);
        sb2.append(", symbol size ");
        sb2.append(m31543j());
        sb2.append('x');
        sb2.append(m31542i());
        sb2.append(", symbol data size ");
        sb2.append(m31541h());
        sb2.append('x');
        sb2.append(m31540g());
        sb2.append(", codewords ");
        sb2.append(this.f26057b);
        sb2.append('+');
        sb2.append(this.f26058c);
        return sb2.toString();
    }
}

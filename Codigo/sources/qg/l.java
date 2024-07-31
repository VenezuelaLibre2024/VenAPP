package qg;

/* loaded from: classes2.dex */
public class l {

    /* renamed from: i, reason: collision with root package name */
    static final l[] f24012i;

    /* renamed from: j, reason: collision with root package name */
    private static l[] f24013j;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f24014a;

    /* renamed from: b, reason: collision with root package name */
    private final int f24015b;

    /* renamed from: c, reason: collision with root package name */
    private final int f24016c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24017d;

    /* renamed from: e, reason: collision with root package name */
    public final int f24018e;

    /* renamed from: f, reason: collision with root package name */
    private final int f24019f;

    /* renamed from: g, reason: collision with root package name */
    private final int f24020g;

    /* renamed from: h, reason: collision with root package name */
    private final int f24021h;

    static {
        l[] lVarArr = {new l(false, 3, 5, 8, 8, 1), new l(false, 5, 7, 10, 10, 1), new l(true, 5, 7, 16, 6, 1), new l(false, 8, 10, 12, 12, 1), new l(true, 10, 11, 14, 6, 2), new l(false, 12, 12, 14, 14, 1), new l(true, 16, 14, 24, 10, 1), new l(false, 18, 14, 16, 16, 1), new l(false, 22, 18, 18, 18, 1), new l(true, 22, 18, 16, 10, 2), new l(false, 30, 20, 20, 20, 1), new l(true, 32, 24, 16, 14, 2), new l(false, 36, 24, 22, 22, 1), new l(false, 44, 28, 24, 24, 1), new l(true, 49, 28, 22, 14, 2), new l(false, 62, 36, 14, 14, 4), new l(false, 86, 42, 16, 16, 4), new l(false, 114, 48, 18, 18, 4), new l(false, 144, 56, 20, 20, 4), new l(false, 174, 68, 22, 22, 4), new l(false, 204, 84, 24, 24, 4, 102, 42), new l(false, 280, 112, 14, 14, 16, 140, 56), new l(false, 368, 144, 16, 16, 16, 92, 36), new l(false, 456, 192, 18, 18, 16, 114, 48), new l(false, 576, 224, 20, 20, 16, 144, 56), new l(false, 696, 272, 22, 22, 16, 174, 68), new l(false, 816, 336, 24, 24, 16, 136, 56), new l(false, 1050, 408, 18, 18, 36, 175, 68), new l(false, 1304, 496, 20, 20, 36, 163, 62), new d()};
        f24012i = lVarArr;
        f24013j = lVarArr;
    }

    public l(boolean z10, int i10, int i11, int i12, int i13, int i14) {
        this(z10, i10, i11, i12, i13, i14, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f24014a = z10;
        this.f24015b = i10;
        this.f24016c = i11;
        this.f24017d = i12;
        this.f24018e = i13;
        this.f24019f = i14;
        this.f24020g = i15;
        this.f24021h = i16;
    }

    private int e() {
        int i10 = this.f24019f;
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

    private int k() {
        int i10 = this.f24019f;
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

    public static l l(int i10, m mVar, dg.f fVar, dg.f fVar2, boolean z10) {
        for (l lVar : f24013j) {
            if (!(mVar == m.FORCE_SQUARE && lVar.f24014a) && ((mVar != m.FORCE_RECTANGLE || lVar.f24014a) && ((fVar == null || (lVar.j() >= fVar.b() && lVar.i() >= fVar.a())) && ((fVar2 == null || (lVar.j() <= fVar2.b() && lVar.i() <= fVar2.a())) && i10 <= lVar.f24015b)))) {
                return lVar;
            }
        }
        if (!z10) {
            return null;
        }
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: " + i10);
    }

    public final int a() {
        return this.f24015b;
    }

    public int b(int i10) {
        return this.f24020g;
    }

    public final int c() {
        return this.f24016c;
    }

    public final int d(int i10) {
        return this.f24021h;
    }

    public int f() {
        return this.f24015b / this.f24020g;
    }

    public final int g() {
        return k() * this.f24018e;
    }

    public final int h() {
        return e() * this.f24017d;
    }

    public final int i() {
        return g() + (k() * 2);
    }

    public final int j() {
        return h() + (e() * 2);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f24014a ? "Rectangular Symbol:" : "Square Symbol:");
        sb2.append(" data region ");
        sb2.append(this.f24017d);
        sb2.append('x');
        sb2.append(this.f24018e);
        sb2.append(", symbol size ");
        sb2.append(j());
        sb2.append('x');
        sb2.append(i());
        sb2.append(", symbol data size ");
        sb2.append(h());
        sb2.append('x');
        sb2.append(g());
        sb2.append(", codewords ");
        sb2.append(this.f24015b);
        sb2.append('+');
        sb2.append(this.f24016c);
        return sb2.toString();
    }
}

package p423wg;

import kg.C9263a;

/* renamed from: wg.j */
/* loaded from: classes2.dex */
public abstract class AbstractC12189j {

    /* renamed from: a */
    private final C9263a f32456a;

    /* renamed from: b */
    private final C12198s f32457b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC12189j(C9263a c9263a) {
        this.f32456a = c9263a;
        this.f32457b = new C12198s(c9263a);
    }

    /* renamed from: a */
    public static AbstractC12189j m39106a(C9263a c9263a) {
        if (c9263a.m27586h(1)) {
            return new C12186g(c9263a);
        }
        if (!c9263a.m27586h(2)) {
            return new C12190k(c9263a);
        }
        int m39137g = C12198s.m39137g(c9263a, 1, 4);
        if (m39137g == 4) {
            return new C12180a(c9263a);
        }
        if (m39137g == 5) {
            return new C12181b(c9263a);
        }
        int m39137g2 = C12198s.m39137g(c9263a, 1, 5);
        if (m39137g2 == 12) {
            return new C12182c(c9263a);
        }
        if (m39137g2 == 13) {
            return new C12183d(c9263a);
        }
        switch (C12198s.m39137g(c9263a, 1, 7)) {
            case 56:
                return new C12184e(c9263a, "310", "11");
            case 57:
                return new C12184e(c9263a, "320", "11");
            case 58:
                return new C12184e(c9263a, "310", "13");
            case 59:
                return new C12184e(c9263a, "320", "13");
            case 60:
                return new C12184e(c9263a, "310", "15");
            case 61:
                return new C12184e(c9263a, "320", "15");
            case 62:
                return new C12184e(c9263a, "310", "17");
            case 63:
                return new C12184e(c9263a, "320", "17");
            default:
                throw new IllegalStateException("unknown decoder: " + c9263a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final C12198s m39107b() {
        return this.f32457b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final C9263a m39108c() {
        return this.f32456a;
    }

    /* renamed from: d */
    public abstract String mo39100d();
}

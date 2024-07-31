package p468yg;

import java.util.Formatter;

/* renamed from: yg.g */
/* loaded from: classes2.dex */
class C12691g {

    /* renamed from: a */
    private final C12687c f34405a;

    /* renamed from: b */
    private final C12688d[] f34406b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12691g(C12687c c12687c) {
        this.f34405a = new C12687c(c12687c);
        this.f34406b = new C12688d[(c12687c.m41755e() - c12687c.m41757g()) + 1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final C12687c m41794a() {
        return this.f34405a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final C12688d m41795b(int i10) {
        return this.f34406b[m41798e(i10)];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final C12688d m41796c(int i10) {
        C12688d c12688d;
        C12688d c12688d2;
        C12688d m41795b = m41795b(i10);
        if (m41795b != null) {
            return m41795b;
        }
        for (int i11 = 1; i11 < 5; i11++) {
            int m41798e = m41798e(i10) - i11;
            if (m41798e >= 0 && (c12688d2 = this.f34406b[m41798e]) != null) {
                return c12688d2;
            }
            int m41798e2 = m41798e(i10) + i11;
            C12688d[] c12688dArr = this.f34406b;
            if (m41798e2 < c12688dArr.length && (c12688d = c12688dArr[m41798e2]) != null) {
                return c12688d;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final C12688d[] m41797d() {
        return this.f34406b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final int m41798e(int i10) {
        return i10 - this.f34405a.m41757g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final void m41799f(int i10, C12688d c12688d) {
        this.f34406b[m41798e(i10)] = c12688d;
    }

    public String toString() {
        Formatter formatter = new Formatter();
        try {
            int i10 = 0;
            for (C12688d c12688d : this.f34406b) {
                if (c12688d == null) {
                    formatter.format("%3d:    |   %n", Integer.valueOf(i10));
                    i10++;
                } else {
                    formatter.format("%3d: %3d|%3d%n", Integer.valueOf(i10), Integer.valueOf(c12688d.m41762c()), Integer.valueOf(c12688d.m41764e()));
                    i10++;
                }
            }
            String formatter2 = formatter.toString();
            formatter.close();
            return formatter2;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    formatter.close();
                } catch (Throwable th4) {
                    th2.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }
}

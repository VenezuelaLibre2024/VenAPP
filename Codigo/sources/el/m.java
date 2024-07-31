package el;

import ck.n;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f14789a;

    static {
        Object b10;
        try {
            n.a aVar = ck.n.f7126b;
            b10 = ck.n.b(Class.forName("android.os.Build"));
        } catch (Throwable th2) {
            n.a aVar2 = ck.n.f7126b;
            b10 = ck.n.b(ck.o.a(th2));
        }
        f14789a = ck.n.g(b10);
    }

    public static final boolean a() {
        return f14789a;
    }
}

package x6;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;
import x6.u;

/* loaded from: classes.dex */
public interface n {

    /* loaded from: classes.dex */
    public static class a extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public final int f30550a;

        public a(Throwable th2, int i10) {
            super(th2);
            this.f30550a = i10;
        }
    }

    static void b(n nVar, n nVar2) {
        if (nVar == nVar2) {
            return;
        }
        if (nVar2 != null) {
            nVar2.g(null);
        }
        if (nVar != null) {
            nVar.d(null);
        }
    }

    a a();

    UUID c();

    void d(u.a aVar);

    default boolean e() {
        return false;
    }

    w6.b f();

    void g(u.a aVar);

    int getState();

    Map<String, String> h();

    boolean i(String str);
}

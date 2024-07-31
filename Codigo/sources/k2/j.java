package k2;

import java.util.List;

/* loaded from: classes.dex */
public interface j {

    /* loaded from: classes.dex */
    public static final class a {
        public static i a(j jVar, m id2) {
            kotlin.jvm.internal.n.e(id2, "id");
            return jVar.b(id2.b(), id2.a());
        }

        public static void b(j jVar, m id2) {
            kotlin.jvm.internal.n.e(id2, "id");
            jVar.f(id2.b(), id2.a());
        }
    }

    void a(m mVar);

    i b(String str, int i10);

    void c(i iVar);

    List<String> d();

    i e(m mVar);

    void f(String str, int i10);

    void g(String str);
}

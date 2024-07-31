package z0;

import android.content.Context;
import dk.r;
import java.util.List;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import ok.l;
import zk.a1;
import zk.k0;
import zk.l0;
import zk.q2;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: z0.a$a */
    /* loaded from: classes.dex */
    public static final class C0541a extends o implements l<Context, List<? extends x0.d<a1.d>>> {

        /* renamed from: a */
        public static final C0541a f32239a = new C0541a();

        C0541a() {
            super(1);
        }

        @Override // ok.l
        /* renamed from: a */
        public final List<x0.d<a1.d>> invoke(Context it) {
            List<x0.d<a1.d>> j10;
            n.e(it, "it");
            j10 = r.j();
            return j10;
        }
    }

    public static final rk.a<Context, x0.f<a1.d>> a(String name, y0.b<a1.d> bVar, l<? super Context, ? extends List<? extends x0.d<a1.d>>> produceMigrations, k0 scope) {
        n.e(name, "name");
        n.e(produceMigrations, "produceMigrations");
        n.e(scope, "scope");
        return new c(name, bVar, produceMigrations, scope);
    }

    public static /* synthetic */ rk.a b(String str, y0.b bVar, l lVar, k0 k0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = null;
        }
        if ((i10 & 4) != 0) {
            lVar = C0541a.f32239a;
        }
        if ((i10 & 8) != 0) {
            k0Var = l0.a(a1.b().U(q2.b(null, 1, null)));
        }
        return a(str, bVar, lVar, k0Var);
    }
}

package x0;

import dk.q;
import java.io.File;
import java.util.List;
import zk.k0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    public static final g f30245a = new g();

    private g() {
    }

    public final <T> f<T> a(k<T> serializer, y0.b<T> bVar, List<? extends d<T>> migrations, k0 scope, ok.a<? extends File> produceFile) {
        List e10;
        kotlin.jvm.internal.n.e(serializer, "serializer");
        kotlin.jvm.internal.n.e(migrations, "migrations");
        kotlin.jvm.internal.n.e(scope, "scope");
        kotlin.jvm.internal.n.e(produceFile, "produceFile");
        y0.a aVar = new y0.a();
        e10 = q.e(e.f30227a.b(migrations));
        return new m(produceFile, serializer, e10, aVar, scope);
    }
}

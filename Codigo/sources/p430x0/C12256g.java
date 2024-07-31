package p430x0;

import dk.C7029q;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.C9322n;
import p280ok.InterfaceC9987a;
import p453y0.C12578a;
import p453y0.C12579b;
import p494zk.InterfaceC13076k0;

/* renamed from: x0.g */
/* loaded from: classes.dex */
public final class C12256g {

    /* renamed from: a */
    public static final C12256g f32757a = new C12256g();

    private C12256g() {
    }

    /* renamed from: a */
    public final <T> InterfaceC12255f<T> m39446a(InterfaceC12260k<T> serializer, C12579b<T> c12579b, List<? extends InterfaceC12253d<T>> migrations, InterfaceC13076k0 scope, InterfaceC9987a<? extends File> produceFile) {
        List m20572e;
        C9322n.m27781e(serializer, "serializer");
        C9322n.m27781e(migrations, "migrations");
        C9322n.m27781e(scope, "scope");
        C9322n.m27781e(produceFile, "produceFile");
        C12578a c12578a = new C12578a();
        m20572e = C7029q.m20572e(C12254e.f32739a.m39442b(migrations));
        return new C12262m(produceFile, serializer, m20572e, c12578a, scope);
    }
}

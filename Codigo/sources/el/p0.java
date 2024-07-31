package el;

import zk.r2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final gk.f f14800a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f14801b;

    /* renamed from: c, reason: collision with root package name */
    private final r2<Object>[] f14802c;

    /* renamed from: d, reason: collision with root package name */
    private int f14803d;

    public p0(gk.f fVar, int i10) {
        this.f14800a = fVar;
        this.f14801b = new Object[i10];
        this.f14802c = new r2[i10];
    }

    public final void a(r2<?> r2Var, Object obj) {
        Object[] objArr = this.f14801b;
        int i10 = this.f14803d;
        objArr[i10] = obj;
        r2<Object>[] r2VarArr = this.f14802c;
        this.f14803d = i10 + 1;
        kotlin.jvm.internal.n.c(r2Var, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        r2VarArr[i10] = r2Var;
    }

    public final void b(gk.f fVar) {
        int length = this.f14802c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i10 = length - 1;
            r2<Object> r2Var = this.f14802c[length];
            kotlin.jvm.internal.n.b(r2Var);
            r2Var.S(fVar, this.f14801b[length]);
            if (i10 < 0) {
                return;
            } else {
                length = i10;
            }
        }
    }
}

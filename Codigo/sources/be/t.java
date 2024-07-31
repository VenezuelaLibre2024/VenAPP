package be;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class t implements rd.b<Executor> {

    /* renamed from: a, reason: collision with root package name */
    private final q f6473a;

    public t(q qVar) {
        this.f6473a = qVar;
    }

    public static t a(q qVar) {
        return new t(qVar);
    }

    public static Executor c(q qVar) {
        return (Executor) rd.d.e(qVar.c());
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return c(this.f6473a);
    }
}

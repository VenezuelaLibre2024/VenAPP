package be;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class r implements rd.b<Executor> {

    /* renamed from: a, reason: collision with root package name */
    private final q f6470a;

    public r(q qVar) {
        this.f6470a = qVar;
    }

    public static r a(q qVar) {
        return new r(qVar);
    }

    public static Executor c(q qVar) {
        return (Executor) rd.d.e(qVar.a());
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return c(this.f6470a);
    }
}

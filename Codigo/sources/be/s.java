package be;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class s implements rd.b<Executor> {

    /* renamed from: a, reason: collision with root package name */
    private final q f6471a;

    public s(q qVar) {
        this.f6471a = qVar;
    }

    public static s a(q qVar) {
        return new s(qVar);
    }

    public static Executor c(q qVar) {
        return (Executor) rd.d.e(qVar.b());
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return c(this.f6471a);
    }
}

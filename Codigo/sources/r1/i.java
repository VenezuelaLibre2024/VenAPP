package r1;

/* loaded from: classes.dex */
public abstract class i<T> extends d0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(u database) {
        super(database);
        kotlin.jvm.internal.n.e(database, "database");
    }

    protected abstract void i(v1.m mVar, T t10);

    public final void j(T t10) {
        v1.m b10 = b();
        try {
            i(b10, t10);
            b10.t0();
        } finally {
            h(b10);
        }
    }
}

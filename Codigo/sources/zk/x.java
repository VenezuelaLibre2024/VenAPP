package zk;

/* loaded from: classes3.dex */
public final class x {
    public static final <T> v<T> a(w1 w1Var) {
        return new w(w1Var);
    }

    public static /* synthetic */ v b(w1 w1Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            w1Var = null;
        }
        return a(w1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean c(v<T> vVar, Object obj) {
        Throwable d10 = ck.n.d(obj);
        return d10 == null ? vVar.B(obj) : vVar.y(d10);
    }
}

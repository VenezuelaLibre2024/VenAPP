package zk;

/* loaded from: classes3.dex */
public final class j0 {
    public static final void a(gk.f fVar, Throwable th2) {
        try {
            i0 i0Var = (i0) fVar.b(i0.f32902p);
            if (i0Var != null) {
                i0Var.e(fVar, th2);
            } else {
                el.h.a(fVar, th2);
            }
        } catch (Throwable th3) {
            el.h.a(fVar, b(th2, th3));
        }
    }

    public static final Throwable b(Throwable th2, Throwable th3) {
        if (th2 == th3) {
            return th2;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
        ck.b.a(runtimeException, th2);
        return runtimeException;
    }
}

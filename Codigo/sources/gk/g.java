package gk;

import gk.f;
import java.io.Serializable;
import kotlin.jvm.internal.n;
import ok.p;

/* loaded from: classes3.dex */
public final class g implements f, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final g f16294a = new g();
    private static final long serialVersionUID = 0;

    private g() {
    }

    private final Object readResolve() {
        return f16294a;
    }

    @Override // gk.f
    public f Q(f.c<?> key) {
        n.e(key, "key");
        return this;
    }

    @Override // gk.f
    public f U(f context) {
        n.e(context, "context");
        return context;
    }

    @Override // gk.f
    public <E extends f.b> E b(f.c<E> key) {
        n.e(key, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // gk.f
    public <R> R z0(R r10, p<? super R, ? super f.b, ? extends R> operation) {
        n.e(operation, "operation");
        return r10;
    }
}

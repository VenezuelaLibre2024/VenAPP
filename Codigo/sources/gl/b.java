package gl;

import el.i0;
import el.k0;
import java.util.concurrent.Executor;
import zk.h0;
import zk.m1;

/* loaded from: classes3.dex */
public final class b extends m1 implements Executor {

    /* renamed from: d, reason: collision with root package name */
    public static final b f16317d = new b();

    /* renamed from: e, reason: collision with root package name */
    private static final h0 f16318e;

    static {
        int b10;
        int e10;
        m mVar = m.f16338c;
        b10 = uk.l.b(64, i0.a());
        e10 = k0.e("kotlinx.coroutines.io.parallelism", b10, 0, 0, 12, null);
        f16318e = mVar.H0(e10);
    }

    private b() {
    }

    @Override // zk.h0
    public void D0(gk.f fVar, Runnable runnable) {
        f16318e.D0(fVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        D0(gk.g.f16294a, runnable);
    }

    @Override // zk.h0
    public String toString() {
        return "Dispatchers.IO";
    }
}

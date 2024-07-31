package gl;

import java.util.concurrent.Executor;
import p089el.C7225i0;
import p089el.C7229k0;
import p124gk.C7588g;
import p124gk.InterfaceC7587f;
import p494zk.AbstractC13064h0;
import p494zk.AbstractC13085m1;
import uk.C11585l;

/* renamed from: gl.b */
/* loaded from: classes3.dex */
public final class ExecutorC7590b extends AbstractC13085m1 implements Executor {

    /* renamed from: d */
    public static final ExecutorC7590b f17954d = new ExecutorC7590b();

    /* renamed from: e */
    private static final AbstractC13064h0 f17955e;

    static {
        int m36293b;
        int m21602e;
        C7601m c7601m = C7601m.f17975c;
        m36293b = C11585l.m36293b(64, C7225i0.m21575a());
        m21602e = C7229k0.m21602e("kotlinx.coroutines.io.parallelism", m36293b, 0, 0, 12, null);
        f17955e = c7601m.mo23095H0(m21602e);
    }

    private ExecutorC7590b() {
    }

    @Override // p494zk.AbstractC13064h0
    /* renamed from: D0 */
    public void mo625D0(InterfaceC7587f interfaceC7587f, Runnable runnable) {
        f17955e.mo625D0(interfaceC7587f, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        mo625D0(C7588g.f17931a, runnable);
    }

    @Override // p494zk.AbstractC13064h0
    public String toString() {
        return "Dispatchers.IO";
    }
}

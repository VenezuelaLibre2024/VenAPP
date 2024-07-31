package p494zk;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.C9315g;

/* renamed from: zk.a0 */
/* loaded from: classes3.dex */
public class C13033a0 {

    /* renamed from: b */
    private static final AtomicIntegerFieldUpdater f35387b = AtomicIntegerFieldUpdater.newUpdater(C13033a0.class, "_handled");
    private volatile int _handled;

    /* renamed from: a */
    public final Throwable f35388a;

    public C13033a0(Throwable th2, boolean z10) {
        this.f35388a = th2;
        this._handled = z10 ? 1 : 0;
    }

    public /* synthetic */ C13033a0(Throwable th2, boolean z10, int i10, C9315g c9315g) {
        this(th2, (i10 & 2) != 0 ? false : z10);
    }

    /* renamed from: a */
    public final boolean m43037a() {
        return f35387b.get(this) != 0;
    }

    /* renamed from: b */
    public final boolean m43038b() {
        return f35387b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return C13092o0.m43273a(this) + '[' + this.f35388a + ']';
    }
}

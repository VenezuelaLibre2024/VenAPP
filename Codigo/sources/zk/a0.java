package zk;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes3.dex */
public class a0 {

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f32836b = AtomicIntegerFieldUpdater.newUpdater(a0.class, "_handled");
    private volatile int _handled;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f32837a;

    public a0(Throwable th2, boolean z10) {
        this.f32837a = th2;
        this._handled = z10 ? 1 : 0;
    }

    public /* synthetic */ a0(Throwable th2, boolean z10, int i10, kotlin.jvm.internal.g gVar) {
        this(th2, (i10 & 2) != 0 ? false : z10);
    }

    public final boolean a() {
        return f32836b.get(this) != 0;
    }

    public final boolean b() {
        return f32836b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return o0.a(this) + '[' + this.f32837a + ']';
    }
}

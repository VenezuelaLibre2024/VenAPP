package el;

import gk.Continuation;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import zk.g1;
import zk.s2;
import zk.x0;

/* loaded from: classes3.dex */
public final class j<T> extends x0<T> implements kotlin.coroutines.jvm.internal.e, Continuation<T> {

    /* renamed from: s */
    private static final AtomicReferenceFieldUpdater f14773s = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: d */
    public final zk.h0 f14774d;

    /* renamed from: e */
    public final Continuation<T> f14775e;

    /* renamed from: f */
    public Object f14776f;

    /* renamed from: r */
    public final Object f14777r;

    /* JADX WARN: Multi-variable type inference failed */
    public j(zk.h0 h0Var, Continuation<? super T> continuation) {
        super(-1);
        h0 h0Var2;
        this.f14774d = h0Var;
        this.f14775e = continuation;
        h0Var2 = k.f14779a;
        this.f14776f = h0Var2;
        this.f14777r = l0.b(getContext());
    }

    private final zk.n<?> n() {
        Object obj = f14773s.get(this);
        if (obj instanceof zk.n) {
            return (zk.n) obj;
        }
        return null;
    }

    @Override // zk.x0
    public void a(Object obj, Throwable th2) {
        if (obj instanceof zk.b0) {
            ((zk.b0) obj).f32844b.invoke(th2);
        }
    }

    @Override // zk.x0
    public Continuation<T> b() {
        return this;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        Continuation<T> continuation = this.f14775e;
        if (continuation instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) continuation;
        }
        return null;
    }

    @Override // gk.Continuation
    public gk.f getContext() {
        return this.f14775e.getContext();
    }

    @Override // zk.x0
    public Object i() {
        h0 h0Var;
        Object obj = this.f14776f;
        h0Var = k.f14779a;
        this.f14776f = h0Var;
        return obj;
    }

    public final void j() {
        do {
        } while (f14773s.get(this) == k.f14780b);
    }

    public final zk.n<T> m() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14773s;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f14773s.set(this, k.f14780b);
                return null;
            }
            if (obj instanceof zk.n) {
                if (androidx.concurrent.futures.b.a(f14773s, this, obj, k.f14780b)) {
                    return (zk.n) obj;
                }
            } else if (obj != k.f14780b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final boolean p() {
        return f14773s.get(this) != null;
    }

    public final boolean q(Throwable th2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14773s;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            h0 h0Var = k.f14780b;
            if (kotlin.jvm.internal.n.a(obj, h0Var)) {
                if (androidx.concurrent.futures.b.a(f14773s, this, h0Var, th2)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (androidx.concurrent.futures.b.a(f14773s, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void r() {
        j();
        zk.n<?> n10 = n();
        if (n10 != null) {
            n10.r();
        }
    }

    @Override // gk.Continuation
    public void resumeWith(Object obj) {
        gk.f context = this.f14775e.getContext();
        Object d10 = zk.e0.d(obj, null, 1, null);
        if (this.f14774d.F0(context)) {
            this.f14776f = d10;
            this.f32943c = 0;
            this.f14774d.D0(context, this);
            return;
        }
        g1 b10 = s2.f32928a.b();
        if (b10.a1()) {
            this.f14776f = d10;
            this.f32943c = 0;
            b10.R0(this);
            return;
        }
        b10.W0(true);
        try {
            gk.f context2 = getContext();
            Object c10 = l0.c(context2, this.f14777r);
            try {
                this.f14775e.resumeWith(obj);
                ck.v vVar = ck.v.f7137a;
                do {
                } while (b10.j1());
            } finally {
                l0.a(context2, c10);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final Throwable s(zk.m<?> mVar) {
        h0 h0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14773s;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            h0Var = k.f14780b;
            if (obj != h0Var) {
                if (obj instanceof Throwable) {
                    if (androidx.concurrent.futures.b.a(f14773s, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!androidx.concurrent.futures.b.a(f14773s, this, h0Var, mVar));
        return null;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f14774d + ", " + zk.o0.c(this.f14775e) + ']';
    }
}

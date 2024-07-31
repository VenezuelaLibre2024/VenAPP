package p089el;

import androidx.concurrent.futures.C0741b;
import ck.C2037v;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.InterfaceC9299e;
import kotlin.jvm.internal.C9322n;
import p124gk.Continuation;
import p124gk.InterfaceC7587f;
import p494zk.AbstractC13061g1;
import p494zk.AbstractC13064h0;
import p494zk.AbstractC13128x0;
import p494zk.C13038b0;
import p494zk.C13052e0;
import p494zk.C13087n;
import p494zk.C13092o0;
import p494zk.C13110s2;
import p494zk.InterfaceC13083m;

/* renamed from: el.j */
/* loaded from: classes3.dex */
public final class C7226j<T> extends AbstractC13128x0<T> implements InterfaceC9299e, Continuation<T> {

    /* renamed from: s */
    private static final AtomicReferenceFieldUpdater f16196s = AtomicReferenceFieldUpdater.newUpdater(C7226j.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: d */
    public final AbstractC13064h0 f16197d;

    /* renamed from: e */
    public final Continuation<T> f16198e;

    /* renamed from: f */
    public Object f16199f;

    /* renamed from: r */
    public final Object f16200r;

    /* JADX WARN: Multi-variable type inference failed */
    public C7226j(AbstractC13064h0 abstractC13064h0, Continuation<? super T> continuation) {
        super(-1);
        this.f16197d = abstractC13064h0;
        this.f16198e = continuation;
        this.f16199f = C7228k.m21595a();
        this.f16200r = C7231l0.m21611b(getContext());
    }

    /* renamed from: n */
    private final C13087n<?> m21583n() {
        Object obj = f16196s.get(this);
        if (obj instanceof C13087n) {
            return (C13087n) obj;
        }
        return null;
    }

    @Override // p494zk.AbstractC13128x0
    /* renamed from: a */
    public void mo21584a(Object obj, Throwable th2) {
        if (obj instanceof C13038b0) {
            ((C13038b0) obj).f35395b.invoke(th2);
        }
    }

    @Override // p494zk.AbstractC13128x0
    /* renamed from: b */
    public Continuation<T> mo21585b() {
        return this;
    }

    @Override // kotlin.coroutines.jvm.internal.InterfaceC9299e
    public InterfaceC9299e getCallerFrame() {
        Continuation<T> continuation = this.f16198e;
        if (continuation instanceof InterfaceC9299e) {
            return (InterfaceC9299e) continuation;
        }
        return null;
    }

    @Override // p124gk.Continuation
    public InterfaceC7587f getContext() {
        return this.f16198e.getContext();
    }

    @Override // p494zk.AbstractC13128x0
    /* renamed from: i */
    public Object mo21586i() {
        Object obj = this.f16199f;
        this.f16199f = C7228k.m21595a();
        return obj;
    }

    /* renamed from: j */
    public final void m21587j() {
        do {
        } while (f16196s.get(this) == C7228k.f16203b);
    }

    /* renamed from: m */
    public final C13087n<T> m21588m() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16196s;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f16196s.set(this, C7228k.f16203b);
                return null;
            }
            if (obj instanceof C13087n) {
                if (C0741b.m3751a(f16196s, this, obj, C7228k.f16203b)) {
                    return (C13087n) obj;
                }
            } else if (obj != C7228k.f16203b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    /* renamed from: p */
    public final boolean m21589p() {
        return f16196s.get(this) != null;
    }

    /* renamed from: q */
    public final boolean m21590q(Throwable th2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16196s;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            C7223h0 c7223h0 = C7228k.f16203b;
            if (C9322n.m27777a(obj, c7223h0)) {
                if (C0741b.m3751a(f16196s, this, c7223h0, th2)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (C0741b.m3751a(f16196s, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    /* renamed from: r */
    public final void m21591r() {
        m21587j();
        C13087n<?> m21583n = m21583n();
        if (m21583n != null) {
            m21583n.m43266r();
        }
    }

    @Override // p124gk.Continuation
    public void resumeWith(Object obj) {
        InterfaceC7587f context = this.f16198e.getContext();
        Object m43150d = C13052e0.m43150d(obj, null, 1, null);
        if (this.f16197d.mo626F0(context)) {
            this.f16199f = m43150d;
            this.f35494c = 0;
            this.f16197d.mo625D0(context, this);
            return;
        }
        AbstractC13061g1 m43297b = C13110s2.f35479a.m43297b();
        if (m43297b.m43180a1()) {
            this.f16199f = m43150d;
            this.f35494c = 0;
            m43297b.m43177R0(this);
            return;
        }
        m43297b.m43179W0(true);
        try {
            InterfaceC7587f context2 = getContext();
            Object m21612c = C7231l0.m21612c(context2, this.f16200r);
            try {
                this.f16198e.resumeWith(obj);
                C2037v c2037v = C2037v.f8089a;
                do {
                } while (m43297b.m43183j1());
            } finally {
                C7231l0.m21610a(context2, m21612c);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* renamed from: s */
    public final Throwable m21592s(InterfaceC13083m<?> interfaceC13083m) {
        C7223h0 c7223h0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16196s;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            c7223h0 = C7228k.f16203b;
            if (obj != c7223h0) {
                if (obj instanceof Throwable) {
                    if (C0741b.m3751a(f16196s, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!C0741b.m3751a(f16196s, this, c7223h0, interfaceC13083m));
        return null;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f16197d + ", " + C13092o0.m43275c(this.f16198e) + ']';
    }
}

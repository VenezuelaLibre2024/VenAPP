package hl;

import ck.v;
import dk.z;
import el.e0;
import el.h0;
import gk.f;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.n;
import ok.l;
import ok.q;
import zk.b3;
import zk.c1;
import zk.k;
import zk.m;

/* loaded from: classes3.dex */
public class a<R> extends k implements b, b3 {

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f16824f = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "state");

    /* renamed from: a, reason: collision with root package name */
    private final f f16825a;

    /* renamed from: b, reason: collision with root package name */
    private List<a<R>.C0279a> f16826b;

    /* renamed from: c, reason: collision with root package name */
    private Object f16827c;

    /* renamed from: d, reason: collision with root package name */
    private int f16828d;

    /* renamed from: e, reason: collision with root package name */
    private Object f16829e;
    private volatile Object state;

    /* renamed from: hl.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public final class C0279a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f16830a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f16831b;

        /* renamed from: c, reason: collision with root package name */
        public final q<b<?>, Object, Object, l<Throwable, v>> f16832c;

        /* renamed from: d, reason: collision with root package name */
        public Object f16833d;

        /* renamed from: e, reason: collision with root package name */
        public int f16834e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ a<R> f16835f;

        public final l<Throwable, v> a(b<?> bVar, Object obj) {
            q<b<?>, Object, Object, l<Throwable, v>> qVar = this.f16832c;
            if (qVar != null) {
                return qVar.m(bVar, this.f16831b, obj);
            }
            return null;
        }

        public final void b() {
            Object obj = this.f16833d;
            a<R> aVar = this.f16835f;
            if (obj instanceof e0) {
                ((e0) obj).o(this.f16834e, null, aVar.getContext());
                return;
            }
            c1 c1Var = obj instanceof c1 ? (c1) obj : null;
            if (c1Var != null) {
                c1Var.dispose();
            }
        }
    }

    private final a<R>.C0279a g(Object obj) {
        List<a<R>.C0279a> list = this.f16826b;
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((C0279a) next).f16830a == obj) {
                obj2 = next;
                break;
            }
        }
        a<R>.C0279a c0279a = (C0279a) obj2;
        if (c0279a != null) {
            return c0279a;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    private final int i(Object obj, Object obj2) {
        boolean h10;
        h0 h0Var;
        h0 h0Var2;
        h0 h0Var3;
        List e10;
        List S;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16824f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof m) {
                a<R>.C0279a g10 = g(obj);
                if (g10 == null) {
                    continue;
                } else {
                    l<Throwable, v> a10 = g10.a(this, obj2);
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj3, g10)) {
                        this.f16829e = obj2;
                        h10 = c.h((m) obj3, a10);
                        if (h10) {
                            return 0;
                        }
                        this.f16829e = null;
                        return 2;
                    }
                }
            } else {
                h0Var = c.f16838c;
                if (n.a(obj3, h0Var) ? true : obj3 instanceof C0279a) {
                    return 3;
                }
                h0Var2 = c.f16839d;
                if (n.a(obj3, h0Var2)) {
                    return 2;
                }
                h0Var3 = c.f16837b;
                if (n.a(obj3, h0Var3)) {
                    e10 = dk.q.e(obj);
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj3, e10)) {
                        return 1;
                    }
                } else {
                    if (!(obj3 instanceof List)) {
                        throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                    }
                    S = z.S((Collection) obj3, obj);
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj3, S)) {
                        return 1;
                    }
                }
            }
        }
    }

    @Override // hl.b
    public void a(Object obj) {
        this.f16829e = obj;
    }

    @Override // hl.b
    public boolean c(Object obj, Object obj2) {
        return i(obj, obj2) == 0;
    }

    @Override // zk.l
    public void d(Throwable th2) {
        Object obj;
        h0 h0Var;
        h0 h0Var2;
        h0 h0Var3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16824f;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            h0Var = c.f16838c;
            if (obj == h0Var) {
                return;
            } else {
                h0Var2 = c.f16839d;
            }
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, h0Var2));
        List<a<R>.C0279a> list = this.f16826b;
        if (list == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((C0279a) it.next()).b();
        }
        h0Var3 = c.f16840e;
        this.f16829e = h0Var3;
        this.f16826b = null;
    }

    @Override // zk.b3
    public void f(e0<?> e0Var, int i10) {
        this.f16827c = e0Var;
        this.f16828d = i10;
    }

    @Override // hl.b
    public f getContext() {
        return this.f16825a;
    }

    public final d h(Object obj, Object obj2) {
        d a10;
        a10 = c.a(i(obj, obj2));
        return a10;
    }

    @Override // ok.l
    public /* bridge */ /* synthetic */ v invoke(Throwable th2) {
        d(th2);
        return v.f7137a;
    }
}

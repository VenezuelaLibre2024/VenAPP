package il;

import ck.v;
import el.e0;
import el.h0;
import gk.Continuation;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.o;
import ok.l;
import ok.q;
import zk.b3;
import zk.m;
import zk.n;
import zk.o0;
import zk.p;

/* loaded from: classes3.dex */
public class b extends d implements il.a {

    /* renamed from: i, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f17817i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "owner");

    /* renamed from: h, reason: collision with root package name */
    private final q<hl.b<?>, Object, Object, l<Throwable, v>> f17818h;
    private volatile Object owner;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class a implements m<v>, b3 {

        /* renamed from: a, reason: collision with root package name */
        public final n<v> f17819a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f17820b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: il.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0290a extends o implements l<Throwable, v> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f17822a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f17823b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0290a(b bVar, a aVar) {
                super(1);
                this.f17822a = bVar;
                this.f17823b = aVar;
            }

            public final void a(Throwable th2) {
                this.f17822a.b(this.f17823b.f17820b);
            }

            @Override // ok.l
            public /* bridge */ /* synthetic */ v invoke(Throwable th2) {
                a(th2);
                return v.f7137a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: il.b$a$b, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0291b extends o implements l<Throwable, v> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f17824a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f17825b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0291b(b bVar, a aVar) {
                super(1);
                this.f17824a = bVar;
                this.f17825b = aVar;
            }

            public final void a(Throwable th2) {
                b.f17817i.set(this.f17824a, this.f17825b.f17820b);
                this.f17824a.b(this.f17825b.f17820b);
            }

            @Override // ok.l
            public /* bridge */ /* synthetic */ v invoke(Throwable th2) {
                a(th2);
                return v.f7137a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(n<? super v> nVar, Object obj) {
            this.f17819a = nVar;
            this.f17820b = obj;
        }

        @Override // zk.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void c(v vVar, l<? super Throwable, v> lVar) {
            b.f17817i.set(b.this, this.f17820b);
            this.f17819a.c(vVar, new C0290a(b.this, this));
        }

        @Override // zk.m
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Object l(v vVar, Object obj, l<? super Throwable, v> lVar) {
            Object l10 = this.f17819a.l(vVar, obj, new C0291b(b.this, this));
            if (l10 != null) {
                b.f17817i.set(b.this, this.f17820b);
            }
            return l10;
        }

        @Override // zk.m
        public boolean d(Throwable th2) {
            return this.f17819a.d(th2);
        }

        @Override // zk.b3
        public void f(e0<?> e0Var, int i10) {
            this.f17819a.f(e0Var, i10);
        }

        @Override // gk.Continuation
        public gk.f getContext() {
            return this.f17819a.getContext();
        }

        @Override // zk.m
        public void k(l<? super Throwable, v> lVar) {
            this.f17819a.k(lVar);
        }

        @Override // zk.m
        public void o(Object obj) {
            this.f17819a.o(obj);
        }

        @Override // gk.Continuation
        public void resumeWith(Object obj) {
            this.f17819a.resumeWith(obj);
        }
    }

    /* renamed from: il.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0292b extends o implements q<hl.b<?>, Object, Object, l<? super Throwable, ? extends v>> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: il.b$b$a */
        /* loaded from: classes3.dex */
        public static final class a extends o implements l<Throwable, v> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f17827a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f17828b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, Object obj) {
                super(1);
                this.f17827a = bVar;
                this.f17828b = obj;
            }

            public final void a(Throwable th2) {
                this.f17827a.b(this.f17828b);
            }

            @Override // ok.l
            public /* bridge */ /* synthetic */ v invoke(Throwable th2) {
                a(th2);
                return v.f7137a;
            }
        }

        C0292b() {
            super(3);
        }

        @Override // ok.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l<Throwable, v> m(hl.b<?> bVar, Object obj, Object obj2) {
            return new a(b.this, obj);
        }
    }

    public b(boolean z10) {
        super(1, z10 ? 1 : 0);
        this.owner = z10 ? null : c.f17829a;
        this.f17818h = new C0292b();
    }

    static /* synthetic */ Object o(b bVar, Object obj, Continuation<? super v> continuation) {
        Object c10;
        if (bVar.q(obj)) {
            return v.f7137a;
        }
        Object p10 = bVar.p(obj, continuation);
        c10 = hk.d.c();
        return p10 == c10 ? p10 : v.f7137a;
    }

    private final Object p(Object obj, Continuation<? super v> continuation) {
        Continuation b10;
        Object c10;
        Object c11;
        b10 = hk.c.b(continuation);
        n b11 = p.b(b10);
        try {
            d(new a(b11, obj));
            Object w10 = b11.w();
            c10 = hk.d.c();
            if (w10 == c10) {
                h.c(continuation);
            }
            c11 = hk.d.c();
            return w10 == c11 ? w10 : v.f7137a;
        } catch (Throwable th2) {
            b11.I();
            throw th2;
        }
    }

    private final int r(Object obj) {
        while (!j()) {
            if (obj == null) {
                return 1;
            }
            if (n(obj)) {
                return 2;
            }
            if (a()) {
                return 1;
            }
        }
        f17817i.set(this, obj);
        return 0;
    }

    @Override // il.a
    public boolean a() {
        return h() == 0;
    }

    @Override // il.a
    public void b(Object obj) {
        h0 h0Var;
        h0 h0Var2;
        while (a()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17817i;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            h0Var = c.f17829a;
            if (obj2 != h0Var) {
                if (!(obj2 == obj || obj == null)) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                h0Var2 = c.f17829a;
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj2, h0Var2)) {
                    i();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    @Override // il.a
    public Object c(Object obj, Continuation<? super v> continuation) {
        return o(this, obj, continuation);
    }

    public boolean n(Object obj) {
        h0 h0Var;
        while (a()) {
            Object obj2 = f17817i.get(this);
            h0Var = c.f17829a;
            if (obj2 != h0Var) {
                return obj2 == obj;
            }
        }
        return false;
    }

    public boolean q(Object obj) {
        int r10 = r(obj);
        if (r10 == 0) {
            return true;
        }
        if (r10 == 1) {
            return false;
        }
        if (r10 != 2) {
            throw new IllegalStateException("unexpected".toString());
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    public String toString() {
        return "Mutex@" + o0.b(this) + "[isLocked=" + a() + ",owner=" + f17817i.get(this) + ']';
    }
}

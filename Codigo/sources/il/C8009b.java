package il;

import androidx.concurrent.futures.C0741b;
import ck.C2037v;
import hk.C7751c;
import hk.C7752d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.C9302h;
import kotlin.jvm.internal.AbstractC9323o;
import p089el.AbstractC7217e0;
import p089el.C7223h0;
import p124gk.Continuation;
import p124gk.InterfaceC7587f;
import p146hl.InterfaceC7754b;
import p280ok.InterfaceC10003q;
import p280ok.InterfaceC9998l;
import p494zk.C13087n;
import p494zk.C13092o0;
import p494zk.C13095p;
import p494zk.InterfaceC13041b3;
import p494zk.InterfaceC13083m;

/* renamed from: il.b */
/* loaded from: classes3.dex */
public class C8009b extends C8011d implements InterfaceC8008a {

    /* renamed from: i */
    private static final AtomicReferenceFieldUpdater f19480i = AtomicReferenceFieldUpdater.newUpdater(C8009b.class, Object.class, "owner");

    /* renamed from: h */
    private final InterfaceC10003q<InterfaceC7754b<?>, Object, Object, InterfaceC9998l<Throwable, C2037v>> f19481h;
    private volatile Object owner;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: il.b$a */
    /* loaded from: classes3.dex */
    public final class a implements InterfaceC13083m<C2037v>, InterfaceC13041b3 {

        /* renamed from: a */
        public final C13087n<C2037v> f19482a;

        /* renamed from: b */
        public final Object f19483b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: il.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C13213a extends AbstractC9323o implements InterfaceC9998l<Throwable, C2037v> {

            /* renamed from: a */
            final /* synthetic */ C8009b f19485a;

            /* renamed from: b */
            final /* synthetic */ a f19486b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C13213a(C8009b c8009b, a aVar) {
                super(1);
                this.f19485a = c8009b;
                this.f19486b = aVar;
            }

            /* renamed from: a */
            public final void m24604a(Throwable th2) {
                this.f19485a.mo24588b(this.f19486b.f19483b);
            }

            @Override // p280ok.InterfaceC9998l
            public /* bridge */ /* synthetic */ C2037v invoke(Throwable th2) {
                m24604a(th2);
                return C2037v.f8089a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: il.b$a$b */
        /* loaded from: classes3.dex */
        public static final class b extends AbstractC9323o implements InterfaceC9998l<Throwable, C2037v> {

            /* renamed from: a */
            final /* synthetic */ C8009b f19487a;

            /* renamed from: b */
            final /* synthetic */ a f19488b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C8009b c8009b, a aVar) {
                super(1);
                this.f19487a = c8009b;
                this.f19488b = aVar;
            }

            /* renamed from: a */
            public final void m24605a(Throwable th2) {
                C8009b.f19480i.set(this.f19487a, this.f19488b.f19483b);
                this.f19487a.mo24588b(this.f19488b.f19483b);
            }

            @Override // p280ok.InterfaceC9998l
            public /* bridge */ /* synthetic */ C2037v invoke(Throwable th2) {
                m24605a(th2);
                return C2037v.f8089a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(C13087n<? super C2037v> c13087n, Object obj) {
            this.f19482a = c13087n;
            this.f19483b = obj;
        }

        @Override // p494zk.InterfaceC13083m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo24599c(C2037v c2037v, InterfaceC9998l<? super Throwable, C2037v> interfaceC9998l) {
            C8009b.f19480i.set(C8009b.this, this.f19483b);
            this.f19482a.mo24599c(c2037v, new C13213a(C8009b.this, this));
        }

        @Override // p494zk.InterfaceC13083m
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Object mo24602l(C2037v c2037v, Object obj, InterfaceC9998l<? super Throwable, C2037v> interfaceC9998l) {
            Object mo24602l = this.f19482a.mo24602l(c2037v, obj, new b(C8009b.this, this));
            if (mo24602l != null) {
                C8009b.f19480i.set(C8009b.this, this.f19483b);
            }
            return mo24602l;
        }

        @Override // p494zk.InterfaceC13083m
        /* renamed from: d */
        public boolean mo24600d(Throwable th2) {
            return this.f19482a.mo24600d(th2);
        }

        @Override // p494zk.InterfaceC13041b3
        /* renamed from: f */
        public void mo9751f(AbstractC7217e0<?> abstractC7217e0, int i10) {
            this.f19482a.mo9751f(abstractC7217e0, i10);
        }

        @Override // p124gk.Continuation
        public InterfaceC7587f getContext() {
            return this.f19482a.getContext();
        }

        @Override // p494zk.InterfaceC13083m
        /* renamed from: k */
        public void mo24601k(InterfaceC9998l<? super Throwable, C2037v> interfaceC9998l) {
            this.f19482a.mo24601k(interfaceC9998l);
        }

        @Override // p494zk.InterfaceC13083m
        /* renamed from: o */
        public void mo24603o(Object obj) {
            this.f19482a.mo24603o(obj);
        }

        @Override // p124gk.Continuation
        public void resumeWith(Object obj) {
            this.f19482a.resumeWith(obj);
        }
    }

    /* renamed from: il.b$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC9323o implements InterfaceC10003q<InterfaceC7754b<?>, Object, Object, InterfaceC9998l<? super Throwable, ? extends C2037v>> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: il.b$b$a */
        /* loaded from: classes3.dex */
        public static final class a extends AbstractC9323o implements InterfaceC9998l<Throwable, C2037v> {

            /* renamed from: a */
            final /* synthetic */ C8009b f19490a;

            /* renamed from: b */
            final /* synthetic */ Object f19491b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C8009b c8009b, Object obj) {
                super(1);
                this.f19490a = c8009b;
                this.f19491b = obj;
            }

            /* renamed from: a */
            public final void m24607a(Throwable th2) {
                this.f19490a.mo24588b(this.f19491b);
            }

            @Override // p280ok.InterfaceC9998l
            public /* bridge */ /* synthetic */ C2037v invoke(Throwable th2) {
                m24607a(th2);
                return C2037v.f8089a;
            }
        }

        b() {
            super(3);
        }

        @Override // p280ok.InterfaceC10003q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC9998l<Throwable, C2037v> mo9756m(InterfaceC7754b<?> interfaceC7754b, Object obj, Object obj2) {
            return new a(C8009b.this, obj);
        }
    }

    public C8009b(boolean z10) {
        super(1, z10 ? 1 : 0);
        this.owner = z10 ? null : C8010c.f19492a;
        this.f19481h = new b();
    }

    /* renamed from: o */
    static /* synthetic */ Object m24592o(C8009b c8009b, Object obj, Continuation<? super C2037v> continuation) {
        Object m23655c;
        if (c8009b.m24596q(obj)) {
            return C2037v.f8089a;
        }
        Object m24593p = c8009b.m24593p(obj, continuation);
        m23655c = C7752d.m23655c();
        return m24593p == m23655c ? m24593p : C2037v.f8089a;
    }

    /* renamed from: p */
    private final Object m24593p(Object obj, Continuation<? super C2037v> continuation) {
        Continuation m23654b;
        Object m23655c;
        Object m23655c2;
        m23654b = C7751c.m23654b(continuation);
        C13087n m43279b = C13095p.m43279b(m23654b);
        try {
            m24616d(new a(m43279b, obj));
            Object m43267w = m43279b.m43267w();
            m23655c = C7752d.m23655c();
            if (m43267w == m23655c) {
                C9302h.m27753c(continuation);
            }
            m23655c2 = C7752d.m23655c();
            return m43267w == m23655c2 ? m43267w : C2037v.f8089a;
        } catch (Throwable th2) {
            m43279b.m43260I();
            throw th2;
        }
    }

    /* renamed from: r */
    private final int m24594r(Object obj) {
        while (!m24619j()) {
            if (obj == null) {
                return 1;
            }
            if (m24595n(obj)) {
                return 2;
            }
            if (mo24587a()) {
                return 1;
            }
        }
        f19480i.set(this, obj);
        return 0;
    }

    @Override // il.InterfaceC8008a
    /* renamed from: a */
    public boolean mo24587a() {
        return m24617h() == 0;
    }

    @Override // il.InterfaceC8008a
    /* renamed from: b */
    public void mo24588b(Object obj) {
        C7223h0 c7223h0;
        C7223h0 c7223h02;
        while (mo24587a()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19480i;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            c7223h0 = C8010c.f19492a;
            if (obj2 != c7223h0) {
                if (!(obj2 == obj || obj == null)) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                c7223h02 = C8010c.f19492a;
                if (C0741b.m3751a(atomicReferenceFieldUpdater, this, obj2, c7223h02)) {
                    m24618i();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    @Override // il.InterfaceC8008a
    /* renamed from: c */
    public Object mo24589c(Object obj, Continuation<? super C2037v> continuation) {
        return m24592o(this, obj, continuation);
    }

    /* renamed from: n */
    public boolean m24595n(Object obj) {
        C7223h0 c7223h0;
        while (mo24587a()) {
            Object obj2 = f19480i.get(this);
            c7223h0 = C8010c.f19492a;
            if (obj2 != c7223h0) {
                return obj2 == obj;
            }
        }
        return false;
    }

    /* renamed from: q */
    public boolean m24596q(Object obj) {
        int m24594r = m24594r(obj);
        if (m24594r == 0) {
            return true;
        }
        if (m24594r == 1) {
            return false;
        }
        if (m24594r != 2) {
            throw new IllegalStateException("unexpected".toString());
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    public String toString() {
        return "Mutex@" + C13092o0.m43274b(this) + "[isLocked=" + mo24587a() + ",owner=" + f19480i.get(this) + ']';
    }
}

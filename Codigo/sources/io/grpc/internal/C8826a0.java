package io.grpc.internal;

import io.grpc.internal.InterfaceC8863j1;
import io.grpc.internal.InterfaceC8892r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import vi.AbstractC11925k;
import vi.AbstractC11939p0;
import vi.C11901c;
import vi.C11915g1;
import vi.C11920i0;
import vi.C11942r;
import vi.C11953w0;
import vi.C11955x0;
import vi.ExecutorC11927k1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.grpc.internal.a0 */
/* loaded from: classes3.dex */
public final class C8826a0 implements InterfaceC8863j1 {

    /* renamed from: c */
    private final Executor f20229c;

    /* renamed from: d */
    private final ExecutorC11927k1 f20230d;

    /* renamed from: e */
    private Runnable f20231e;

    /* renamed from: f */
    private Runnable f20232f;

    /* renamed from: g */
    private Runnable f20233g;

    /* renamed from: h */
    private InterfaceC8863j1.a f20234h;

    /* renamed from: j */
    private C11915g1 f20236j;

    /* renamed from: k */
    private AbstractC11939p0.i f20237k;

    /* renamed from: l */
    private long f20238l;

    /* renamed from: a */
    private final C11920i0 f20227a = C11920i0.m38161a(C8826a0.class, null);

    /* renamed from: b */
    private final Object f20228b = new Object();

    /* renamed from: i */
    private Collection<e> f20235i = new LinkedHashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.internal.a0$a */
    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InterfaceC8863j1.a f20239a;

        a(InterfaceC8863j1.a aVar) {
            this.f20239a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f20239a.mo25537b(true);
        }
    }

    /* renamed from: io.grpc.internal.a0$b */
    /* loaded from: classes3.dex */
    class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InterfaceC8863j1.a f20241a;

        b(InterfaceC8863j1.a aVar) {
            this.f20241a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f20241a.mo25537b(false);
        }
    }

    /* renamed from: io.grpc.internal.a0$c */
    /* loaded from: classes3.dex */
    class c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InterfaceC8863j1.a f20243a;

        c(InterfaceC8863j1.a aVar) {
            this.f20243a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f20243a.mo25538c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.internal.a0$d */
    /* loaded from: classes3.dex */
    public class d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11915g1 f20245a;

        d(C11915g1 c11915g1) {
            this.f20245a = c11915g1;
        }

        @Override // java.lang.Runnable
        public void run() {
            C8826a0.this.f20234h.mo25539d(this.f20245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.grpc.internal.a0$e */
    /* loaded from: classes3.dex */
    public class e extends C8830b0 {

        /* renamed from: j */
        private final AbstractC11939p0.f f20247j;

        /* renamed from: k */
        private final C11942r f20248k;

        /* renamed from: l */
        private final AbstractC11925k[] f20249l;

        private e(AbstractC11939p0.f fVar, AbstractC11925k[] abstractC11925kArr) {
            this.f20248k = C11942r.m38242e();
            this.f20247j = fVar;
            this.f20249l = abstractC11925kArr;
        }

        /* synthetic */ e(C8826a0 c8826a0, AbstractC11939p0.f fVar, AbstractC11925k[] abstractC11925kArr, a aVar) {
            this(fVar, abstractC11925kArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: A */
        public Runnable m25252A(InterfaceC8895s interfaceC8895s) {
            C11942r m38246b = this.f20248k.m38246b();
            try {
                InterfaceC8889q mo25245c = interfaceC8895s.mo25245c(this.f20247j.mo25819c(), this.f20247j.mo25818b(), this.f20247j.mo25817a(), this.f20249l);
                this.f20248k.m38248f(m38246b);
                return m25287w(mo25245c);
            } catch (Throwable th2) {
                this.f20248k.m38248f(m38246b);
                throw th2;
            }
        }

        @Override // io.grpc.internal.C8830b0, io.grpc.internal.InterfaceC8889q
        /* renamed from: c */
        public void mo25194c(C11915g1 c11915g1) {
            super.mo25194c(c11915g1);
            synchronized (C8826a0.this.f20228b) {
                if (C8826a0.this.f20233g != null) {
                    boolean remove = C8826a0.this.f20235i.remove(this);
                    if (!C8826a0.this.m25250q() && remove) {
                        C8826a0.this.f20230d.m38193b(C8826a0.this.f20232f);
                        if (C8826a0.this.f20236j != null) {
                            C8826a0.this.f20230d.m38193b(C8826a0.this.f20233g);
                            C8826a0.this.f20233g = null;
                        }
                    }
                }
            }
            C8826a0.this.f20230d.m38192a();
        }

        @Override // io.grpc.internal.C8830b0, io.grpc.internal.InterfaceC8889q
        /* renamed from: m */
        public void mo25201m(C8908w0 c8908w0) {
            if (this.f20247j.mo25817a().m38087j()) {
                c8908w0.m25875a("wait_for_ready");
            }
            super.mo25201m(c8908w0);
        }

        @Override // io.grpc.internal.C8830b0
        /* renamed from: u */
        protected void mo25256u(C11915g1 c11915g1) {
            for (AbstractC11925k abstractC11925k : this.f20249l) {
                abstractC11925k.mo9633i(c11915g1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8826a0(Executor executor, ExecutorC11927k1 executorC11927k1) {
        this.f20229c = executor;
        this.f20230d = executorC11927k1;
    }

    /* renamed from: o */
    private e m25243o(AbstractC11939p0.f fVar, AbstractC11925k[] abstractC11925kArr) {
        e eVar = new e(this, fVar, abstractC11925kArr, null);
        this.f20235i.add(eVar);
        if (m25249p() == 1) {
            this.f20230d.m38193b(this.f20231e);
        }
        return eVar;
    }

    @Override // io.grpc.internal.InterfaceC8863j1
    /* renamed from: b */
    public final void mo25244b(C11915g1 c11915g1) {
        Collection<e> collection;
        Runnable runnable;
        mo25246d(c11915g1);
        synchronized (this.f20228b) {
            collection = this.f20235i;
            runnable = this.f20233g;
            this.f20233g = null;
            if (!collection.isEmpty()) {
                this.f20235i = Collections.emptyList();
            }
        }
        if (runnable != null) {
            for (e eVar : collection) {
                Runnable m25287w = eVar.m25287w(new C8846f0(c11915g1, InterfaceC8892r.a.REFUSED, eVar.f20249l));
                if (m25287w != null) {
                    m25287w.run();
                }
            }
            this.f20230d.execute(runnable);
        }
    }

    @Override // io.grpc.internal.InterfaceC8895s
    /* renamed from: c */
    public final InterfaceC8889q mo25245c(C11955x0<?, ?> c11955x0, C11953w0 c11953w0, C11901c c11901c, AbstractC11925k[] abstractC11925kArr) {
        InterfaceC8889q c8846f0;
        try {
            C8897s1 c8897s1 = new C8897s1(c11955x0, c11953w0, c11901c);
            AbstractC11939p0.i iVar = null;
            long j10 = -1;
            while (true) {
                synchronized (this.f20228b) {
                    if (this.f20236j == null) {
                        AbstractC11939p0.i iVar2 = this.f20237k;
                        if (iVar2 != null) {
                            if (iVar != null && j10 == this.f20238l) {
                                c8846f0 = m25243o(c8897s1, abstractC11925kArr);
                                break;
                            }
                            j10 = this.f20238l;
                            InterfaceC8895s m25753j = C8890q0.m25753j(iVar2.mo9576a(c8897s1), c11901c.m38087j());
                            if (m25753j != null) {
                                c8846f0 = m25753j.mo25245c(c8897s1.mo25819c(), c8897s1.mo25818b(), c8897s1.mo25817a(), abstractC11925kArr);
                                break;
                            }
                            iVar = iVar2;
                        } else {
                            c8846f0 = m25243o(c8897s1, abstractC11925kArr);
                            break;
                        }
                    } else {
                        c8846f0 = new C8846f0(this.f20236j, abstractC11925kArr);
                        break;
                    }
                }
            }
            return c8846f0;
        } finally {
            this.f20230d.m38192a();
        }
    }

    @Override // io.grpc.internal.InterfaceC8863j1
    /* renamed from: d */
    public final void mo25246d(C11915g1 c11915g1) {
        Runnable runnable;
        synchronized (this.f20228b) {
            if (this.f20236j != null) {
                return;
            }
            this.f20236j = c11915g1;
            this.f20230d.m38193b(new d(c11915g1));
            if (!m25250q() && (runnable = this.f20233g) != null) {
                this.f20230d.m38193b(runnable);
                this.f20233g = null;
            }
            this.f20230d.m38192a();
        }
    }

    @Override // vi.InterfaceC11935n0
    /* renamed from: e */
    public C11920i0 mo25247e() {
        return this.f20227a;
    }

    @Override // io.grpc.internal.InterfaceC8863j1
    /* renamed from: g */
    public final Runnable mo25248g(InterfaceC8863j1.a aVar) {
        this.f20234h = aVar;
        this.f20231e = new a(aVar);
        this.f20232f = new b(aVar);
        this.f20233g = new c(aVar);
        return null;
    }

    /* renamed from: p */
    final int m25249p() {
        int size;
        synchronized (this.f20228b) {
            size = this.f20235i.size();
        }
        return size;
    }

    /* renamed from: q */
    public final boolean m25250q() {
        boolean z10;
        synchronized (this.f20228b) {
            z10 = !this.f20235i.isEmpty();
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public final void m25251r(AbstractC11939p0.i iVar) {
        Runnable runnable;
        synchronized (this.f20228b) {
            this.f20237k = iVar;
            this.f20238l++;
            if (iVar != null && m25250q()) {
                ArrayList arrayList = new ArrayList(this.f20235i);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    AbstractC11939p0.e mo9576a = iVar.mo9576a(eVar.f20247j);
                    C11901c mo25817a = eVar.f20247j.mo25817a();
                    InterfaceC8895s m25753j = C8890q0.m25753j(mo9576a, mo25817a.m38087j());
                    if (m25753j != null) {
                        Executor executor = this.f20229c;
                        if (mo25817a.m38082e() != null) {
                            executor = mo25817a.m38082e();
                        }
                        Runnable m25252A = eVar.m25252A(m25753j);
                        if (m25252A != null) {
                            executor.execute(m25252A);
                        }
                        arrayList2.add(eVar);
                    }
                }
                synchronized (this.f20228b) {
                    if (m25250q()) {
                        this.f20235i.removeAll(arrayList2);
                        if (this.f20235i.isEmpty()) {
                            this.f20235i = new LinkedHashSet();
                        }
                        if (!m25250q()) {
                            this.f20230d.m38193b(this.f20232f);
                            if (this.f20236j != null && (runnable = this.f20233g) != null) {
                                this.f20230d.m38193b(runnable);
                                this.f20233g = null;
                            }
                        }
                        this.f20230d.m38192a();
                    }
                }
            }
        }
    }
}

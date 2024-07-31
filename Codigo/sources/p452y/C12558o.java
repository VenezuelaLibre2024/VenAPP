package p452y;

import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.RunnableC0581y3;
import androidx.camera.core.AbstractC0592e;
import androidx.camera.core.C0711p;
import androidx.camera.core.C0712q;
import androidx.camera.core.C0715t;
import androidx.camera.core.InterfaceC0710o;
import androidx.camera.core.impl.AbstractC0637k;
import androidx.camera.core.impl.AbstractC0661r0;
import androidx.camera.core.impl.C0627h1;
import androidx.camera.core.impl.InterfaceC0623g1;
import androidx.camera.core.impl.utils.C0688q;
import androidx.core.util.C0984h;
import androidx.core.util.InterfaceC0977a;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import p002a0.C0009f;
import p002a0.InterfaceC0006c;
import p112g0.C7429v;
import p407w.C12008g0;
import p407w.C12029o0;
import p407w.InterfaceC12023l0;
import p474z.C12747a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y.o */
/* loaded from: classes.dex */
public class C12558o {

    /* renamed from: a */
    private final Set<Integer> f34057a = new HashSet();

    /* renamed from: b */
    C12541f0 f34058b = null;

    /* renamed from: c */
    C0715t f34059c;

    /* renamed from: d */
    private c f34060d;

    /* renamed from: e */
    private b f34061e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y.o$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC0006c<Void> {

        /* renamed from: a */
        final /* synthetic */ C12541f0 f34062a;

        a(C12541f0 c12541f0) {
            this.f34062a = c12541f0;
        }

        @Override // p002a0.InterfaceC0006c
        /* renamed from: a */
        public void mo8a(Throwable th2) {
            C0688q.m3339a();
            C12541f0 c12541f0 = this.f34062a;
            C12558o c12558o = C12558o.this;
            if (c12541f0 == c12558o.f34058b) {
                c12558o.f34058b = null;
            }
        }

        @Override // p002a0.InterfaceC0006c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y.o$b */
    /* loaded from: classes.dex */
    public static abstract class b {

        /* renamed from: a */
        private AbstractC0637k f34064a = new a();

        /* renamed from: b */
        private AbstractC0661r0 f34065b;

        /* renamed from: y.o$b$a */
        /* loaded from: classes.dex */
        class a extends AbstractC0637k {
            a() {
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: j */
        public static b m41239j(Size size, int i10, int i11, boolean z10, InterfaceC12023l0 interfaceC12023l0) {
            return new C12532b(size, i10, i11, z10, interfaceC12023l0, new C7429v(), new C7429v());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public AbstractC0637k m41240a() {
            return this.f34064a;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract C7429v<C12008g0> mo41137b();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract InterfaceC12023l0 mo41138c();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract int mo41139d();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract int mo41140e();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: f */
        public abstract C7429v<C12541f0> mo41141f();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: g */
        public abstract Size mo41142g();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: h */
        public AbstractC0661r0 m41241h() {
            AbstractC0661r0 abstractC0661r0 = this.f34065b;
            Objects.requireNonNull(abstractC0661r0);
            return abstractC0661r0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: i */
        public abstract boolean mo41143i();

        /* renamed from: k */
        void m41242k(AbstractC0637k abstractC0637k) {
            this.f34064a = abstractC0637k;
        }

        /* renamed from: l */
        void m41243l(Surface surface) {
            C0984h.m4836n(this.f34065b == null, "The surface is already set.");
            this.f34065b = new C0627h1(surface, mo41142g(), mo41139d());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y.o$c */
    /* loaded from: classes.dex */
    public static abstract class c {
        /* renamed from: e */
        static c m41244e(int i10, int i11) {
            return new C12534c(new C7429v(), new C7429v(), i10, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract C7429v<InterfaceC0710o> mo41144a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract int mo41145b();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract int mo41146c();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract C7429v<C12541f0> mo41147d();
    }

    /* renamed from: c */
    private static InterfaceC0623g1 m41226c(InterfaceC12023l0 interfaceC12023l0, int i10, int i11, int i12) {
        return interfaceC12023l0 != null ? interfaceC12023l0.m38631a(i10, i11, i12, 4, 0L) : C0711p.m3485a(i10, i11, i12, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m41227e(C12575x c12575x, C12541f0 c12541f0) {
        m41233i(c12541f0);
        c12575x.m41319h(c12541f0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m41228f(InterfaceC0623g1 interfaceC0623g1) {
        try {
            InterfaceC0710o mo2894b = interfaceC0623g1.mo2894b();
            if (mo2894b != null) {
                m41232h(mo2894b);
            } else {
                m41235l(new C12008g0(2, "Failed to acquire latest image", null));
            }
        } catch (IllegalStateException e10) {
            m41235l(new C12008g0(2, "Failed to acquire latest image", e10));
        }
    }

    /* renamed from: g */
    private void m41229g(InterfaceC0710o interfaceC0710o) {
        Object m3071d = interfaceC0710o.mo2883e1().mo8852b().m3071d(this.f34058b.m41183h());
        Objects.requireNonNull(m3071d);
        int intValue = ((Integer) m3071d).intValue();
        C0984h.m4836n(this.f34057a.contains(Integer.valueOf(intValue)), "Received an unexpected stage id" + intValue);
        this.f34057a.remove(Integer.valueOf(intValue));
        c cVar = this.f34060d;
        Objects.requireNonNull(cVar);
        cVar.mo41144a().accept(interfaceC0710o);
        if (this.f34057a.isEmpty()) {
            C12541f0 c12541f0 = this.f34058b;
            this.f34058b = null;
            c12541f0.m41189n();
        }
    }

    /* renamed from: k */
    private void m41230k(b bVar, C0715t c0715t) {
        bVar.m41241h().m3223d();
        InterfaceFutureC5920f<Void> m3230k = bVar.m41241h().m3230k();
        Objects.requireNonNull(c0715t);
        m3230k.addListener(new RunnableC0581y3(c0715t), C12747a.m42283d());
    }

    /* renamed from: d */
    public int m41231d() {
        C0688q.m3339a();
        C0984h.m4836n(this.f34059c != null, "The ImageReader is not initialized.");
        return this.f34059c.m3533i();
    }

    /* renamed from: h */
    void m41232h(InterfaceC0710o interfaceC0710o) {
        C0688q.m3339a();
        if (this.f34058b != null) {
            m41229g(interfaceC0710o);
            return;
        }
        C12029o0.m38638a("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + interfaceC0710o);
        interfaceC0710o.close();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m41233i(C12541f0 c12541f0) {
        C0688q.m3339a();
        boolean z10 = true;
        C0984h.m4836n(m41231d() > 0, "Too many acquire images. Close image to be able to process next.");
        if (this.f34058b != null && !this.f34057a.isEmpty()) {
            z10 = false;
        }
        C0984h.m4836n(z10, "The previous request is not complete");
        this.f34058b = c12541f0;
        this.f34057a.addAll(c12541f0.m41182g());
        c cVar = this.f34060d;
        Objects.requireNonNull(cVar);
        cVar.mo41147d().accept(c12541f0);
        C0009f.m16b(c12541f0.m41176a(), new a(c12541f0), C12747a.m42280a());
    }

    /* renamed from: j */
    public void m41234j() {
        C0688q.m3339a();
        b bVar = this.f34061e;
        Objects.requireNonNull(bVar);
        C0715t c0715t = this.f34059c;
        Objects.requireNonNull(c0715t);
        m41230k(bVar, c0715t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m41235l(C12008g0 c12008g0) {
        C0688q.m3339a();
        C12541f0 c12541f0 = this.f34058b;
        if (c12541f0 != null) {
            c12541f0.m41186k(c12008g0);
        }
    }

    /* renamed from: m */
    public void m41236m(AbstractC0592e.a aVar) {
        C0688q.m3339a();
        C0984h.m4836n(this.f34059c != null, "The ImageReader is not initialized.");
        this.f34059c.m3535m(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    public c m41237n(b bVar) {
        InterfaceC0977a<C12541f0> interfaceC0977a;
        C12575x c12575x;
        C0984h.m4836n(this.f34061e == null && this.f34059c == null, "CaptureNode does not support recreation yet.");
        this.f34061e = bVar;
        Size mo41142g = bVar.mo41142g();
        int mo41139d = bVar.mo41139d();
        if ((true ^ bVar.mo41143i()) && bVar.mo41138c() == null) {
            C0712q c0712q = new C0712q(mo41142g.getWidth(), mo41142g.getHeight(), mo41139d, 4);
            bVar.m41242k(c0712q.m3495m());
            interfaceC0977a = new InterfaceC0977a() { // from class: y.k
                @Override // androidx.core.util.InterfaceC0977a
                public final void accept(Object obj) {
                    C12558o.this.m41233i((C12541f0) obj);
                }
            };
            c12575x = c0712q;
        } else {
            final C12575x c12575x2 = new C12575x(m41226c(bVar.mo41138c(), mo41142g.getWidth(), mo41142g.getHeight(), mo41139d));
            interfaceC0977a = new InterfaceC0977a() { // from class: y.l
                @Override // androidx.core.util.InterfaceC0977a
                public final void accept(Object obj) {
                    C12558o.this.m41227e(c12575x2, (C12541f0) obj);
                }
            };
            c12575x = c12575x2;
        }
        Surface surface = c12575x.getSurface();
        Objects.requireNonNull(surface);
        bVar.m41243l(surface);
        this.f34059c = new C0715t(c12575x);
        c12575x.mo2898f(new InterfaceC0623g1.a() { // from class: y.m
            @Override // androidx.camera.core.impl.InterfaceC0623g1.a
            /* renamed from: a */
            public final void mo2863a(InterfaceC0623g1 interfaceC0623g1) {
                C12558o.this.m41228f(interfaceC0623g1);
            }
        }, C12747a.m42283d());
        bVar.mo41141f().m22409a(interfaceC0977a);
        bVar.mo41137b().m22409a(new InterfaceC0977a() { // from class: y.n
            @Override // androidx.core.util.InterfaceC0977a
            public final void accept(Object obj) {
                C12558o.this.m41235l((C12008g0) obj);
            }
        });
        c m41244e = c.m41244e(bVar.mo41139d(), bVar.mo41140e());
        this.f34060d = m41244e;
        return m41244e;
    }
}

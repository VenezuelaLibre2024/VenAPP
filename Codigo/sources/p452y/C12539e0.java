package p452y;

import android.graphics.Bitmap;
import androidx.camera.core.C0709n;
import androidx.camera.core.InterfaceC0710o;
import androidx.core.util.C0984h;
import androidx.core.util.InterfaceC0977a;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p051d0.C6807b;
import p051d0.C6811f;
import p112g0.AbstractC7392c0;
import p112g0.C7429v;
import p112g0.C7437z;
import p112g0.InterfaceC7390b0;
import p407w.C12008g0;
import p452y.C12539e0;
import p452y.C12544h;
import p452y.C12560p;
import p452y.C12568t;
import p474z.C12747a;

/* renamed from: y.e0 */
/* loaded from: classes.dex */
public class C12539e0 {

    /* renamed from: a */
    final Executor f33996a;

    /* renamed from: b */
    final C7437z f33997b;

    /* renamed from: c */
    private a f33998c;

    /* renamed from: d */
    private InterfaceC7390b0<b, AbstractC7392c0<InterfaceC0710o>> f33999d;

    /* renamed from: e */
    private InterfaceC7390b0<C12560p.a, AbstractC7392c0<byte[]>> f34000e;

    /* renamed from: f */
    private InterfaceC7390b0<C12544h.a, AbstractC7392c0<byte[]>> f34001f;

    /* renamed from: g */
    private InterfaceC7390b0<C12568t.a, C0709n.h> f34002g;

    /* renamed from: h */
    private InterfaceC7390b0<AbstractC7392c0<byte[]>, AbstractC7392c0<Bitmap>> f34003h;

    /* renamed from: i */
    private InterfaceC7390b0<AbstractC7392c0<InterfaceC0710o>, InterfaceC0710o> f34004i;

    /* renamed from: j */
    private InterfaceC7390b0<AbstractC7392c0<byte[]>, AbstractC7392c0<InterfaceC0710o>> f34005j;

    /* renamed from: k */
    private InterfaceC7390b0<AbstractC7392c0<Bitmap>, AbstractC7392c0<Bitmap>> f34006k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y.e0$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public static a m41169d(int i10, int i11) {
            return new C12540f(new C7429v(), i10, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract C7429v<b> mo41170a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract int mo41171b();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract int mo41172c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y.e0$b */
    /* loaded from: classes.dex */
    public static abstract class b {
        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public static b m41173c(C12541f0 c12541f0, InterfaceC0710o interfaceC0710o) {
            return new C12542g(c12541f0, interfaceC0710o);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract InterfaceC0710o mo41174a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract C12541f0 mo41175b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12539e0(Executor executor, C7437z c7437z) {
        this.f33996a = C6807b.m19692a(C6811f.class) != null ? C12747a.m42285f(executor) : executor;
        this.f33997b = c7437z;
    }

    /* renamed from: f */
    private AbstractC7392c0<byte[]> m41157f(AbstractC7392c0<byte[]> abstractC7392c0, int i10) {
        C0984h.m4835m(abstractC7392c0.mo22308e() == 256);
        AbstractC7392c0<Bitmap> apply = this.f34003h.apply(abstractC7392c0);
        InterfaceC7390b0<AbstractC7392c0<Bitmap>, AbstractC7392c0<Bitmap>> interfaceC7390b0 = this.f34006k;
        if (interfaceC7390b0 != null) {
            apply = interfaceC7390b0.apply(apply);
        }
        return this.f34001f.apply(C12544h.a.m41192c(apply, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m41162k(final b bVar) {
        if (bVar.mo41175b().m41184i()) {
            return;
        }
        this.f33996a.execute(new Runnable() { // from class: y.a0
            @Override // java.lang.Runnable
            public final void run() {
                C12539e0.this.m41161j(bVar);
            }
        });
    }

    /* renamed from: p */
    private static void m41163p(final C12541f0 c12541f0, final C12008g0 c12008g0) {
        C12747a.m42283d().execute(new Runnable() { // from class: y.d0
            @Override // java.lang.Runnable
            public final void run() {
                C12541f0.this.m41190o(c12008g0);
            }
        });
    }

    /* renamed from: l */
    InterfaceC0710o m41164l(b bVar) {
        C12541f0 mo41175b = bVar.mo41175b();
        AbstractC7392c0<InterfaceC0710o> apply = this.f33999d.apply(bVar);
        if ((apply.mo22308e() == 35 || this.f34006k != null) && this.f33998c.mo41172c() == 256) {
            AbstractC7392c0<byte[]> apply2 = this.f34000e.apply(C12560p.a.m41249c(apply, mo41175b.m41178c()));
            if (this.f34006k != null) {
                apply2 = m41157f(apply2, mo41175b.m41178c());
            }
            apply = this.f34005j.apply(apply2);
        }
        return this.f34004i.apply(apply);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void m41161j(b bVar) {
        C12008g0 c12008g0;
        ScheduledExecutorService m42283d;
        Runnable runnable;
        final C12541f0 mo41175b = bVar.mo41175b();
        try {
            if (bVar.mo41175b().m41185j()) {
                final InterfaceC0710o m41164l = m41164l(bVar);
                m42283d = C12747a.m42283d();
                runnable = new Runnable() { // from class: y.b0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C12541f0.this.m41188m(m41164l);
                    }
                };
            } else {
                final C0709n.h m41166n = m41166n(bVar);
                m42283d = C12747a.m42283d();
                runnable = new Runnable() { // from class: y.c0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C12541f0.this.m41187l(m41166n);
                    }
                };
            }
            m42283d.execute(runnable);
        } catch (OutOfMemoryError e10) {
            c12008g0 = new C12008g0(0, "Processing failed due to low memory.", e10);
            m41163p(mo41175b, c12008g0);
        } catch (RuntimeException e11) {
            c12008g0 = new C12008g0(0, "Processing failed.", e11);
            m41163p(mo41175b, c12008g0);
        } catch (C12008g0 e12) {
            m41163p(mo41175b, e12);
        }
    }

    /* renamed from: n */
    C0709n.h m41166n(b bVar) {
        C0984h.m4824b(this.f33998c.mo41172c() == 256, String.format("On-disk capture only support JPEG output format. Output format: %s", Integer.valueOf(this.f33998c.mo41172c())));
        C12541f0 mo41175b = bVar.mo41175b();
        AbstractC7392c0<byte[]> apply = this.f34000e.apply(C12560p.a.m41249c(this.f33999d.apply(bVar), mo41175b.m41178c()));
        if (apply.m22316i() || this.f34006k != null) {
            apply = m41157f(apply, mo41175b.m41178c());
        }
        InterfaceC7390b0<C12568t.a, C0709n.h> interfaceC7390b0 = this.f34002g;
        C0709n.g m41179d = mo41175b.m41179d();
        Objects.requireNonNull(m41179d);
        return interfaceC7390b0.apply(C12568t.a.m41293c(apply, m41179d));
    }

    /* renamed from: o */
    public void m41167o() {
    }

    /* renamed from: q */
    public Void m41168q(a aVar) {
        this.f33998c = aVar;
        aVar.mo41170a().m22409a(new InterfaceC0977a() { // from class: y.z
            @Override // androidx.core.util.InterfaceC0977a
            public final void accept(Object obj) {
                C12539e0.this.m41162k((C12539e0.b) obj);
            }
        });
        this.f33999d = new C12576y();
        this.f34000e = new C12560p();
        this.f34003h = new C12566s();
        this.f34001f = new C12544h();
        this.f34002g = new C12568t();
        this.f34004i = new C12572v();
        if (aVar.mo41171b() == 35 || this.f33997b != null) {
            this.f34005j = new C12570u();
        }
        C7437z c7437z = this.f33997b;
        if (c7437z == null) {
            return null;
        }
        this.f34006k = new C12546i(c7437z);
        return null;
    }
}

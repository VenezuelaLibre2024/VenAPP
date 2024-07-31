package p407w;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.AbstractC0604b2;
import androidx.camera.core.impl.AbstractC0661r0;
import androidx.camera.core.impl.InterfaceC0606c0;
import androidx.concurrent.futures.C0742c;
import androidx.core.util.C0984h;
import androidx.core.util.InterfaceC0977a;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p002a0.C0009f;
import p002a0.InterfaceC0006c;
import p407w.C12015i1;
import p474z.C12747a;

/* renamed from: w.i1 */
/* loaded from: classes.dex */
public final class C12015i1 {

    /* renamed from: o */
    public static final Range<Integer> f31939o = AbstractC0604b2.f2766a;

    /* renamed from: a */
    private final Object f31940a = new Object();

    /* renamed from: b */
    private final Size f31941b;

    /* renamed from: c */
    private final C12048y f31942c;

    /* renamed from: d */
    private final Range<Integer> f31943d;

    /* renamed from: e */
    private final InterfaceC0606c0 f31944e;

    /* renamed from: f */
    final InterfaceFutureC5920f<Surface> f31945f;

    /* renamed from: g */
    private final C0742c.a<Surface> f31946g;

    /* renamed from: h */
    private final InterfaceFutureC5920f<Void> f31947h;

    /* renamed from: i */
    private final C0742c.a<Void> f31948i;

    /* renamed from: j */
    private final C0742c.a<Void> f31949j;

    /* renamed from: k */
    private final AbstractC0661r0 f31950k;

    /* renamed from: l */
    private h f31951l;

    /* renamed from: m */
    private i f31952m;

    /* renamed from: n */
    private Executor f31953n;

    /* renamed from: w.i1$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC0006c<Void> {

        /* renamed from: a */
        final /* synthetic */ C0742c.a f31954a;

        /* renamed from: b */
        final /* synthetic */ InterfaceFutureC5920f f31955b;

        a(C0742c.a aVar, InterfaceFutureC5920f interfaceFutureC5920f) {
            this.f31954a = aVar;
            this.f31955b = interfaceFutureC5920f;
        }

        @Override // p002a0.InterfaceC0006c
        /* renamed from: a */
        public void mo8a(Throwable th2) {
            C0984h.m4835m(th2 instanceof f ? this.f31955b.cancel(false) : this.f31954a.m3756c(null));
        }

        @Override // p002a0.InterfaceC0006c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            C0984h.m4835m(this.f31954a.m3756c(null));
        }
    }

    /* renamed from: w.i1$b */
    /* loaded from: classes.dex */
    class b extends AbstractC0661r0 {
        b(Size size, int i10) {
            super(size, i10);
        }

        @Override // androidx.camera.core.impl.AbstractC0661r0
        /* renamed from: r */
        protected InterfaceFutureC5920f<Surface> mo2981r() {
            return C12015i1.this.f31945f;
        }
    }

    /* renamed from: w.i1$c */
    /* loaded from: classes.dex */
    class c implements InterfaceC0006c<Surface> {

        /* renamed from: a */
        final /* synthetic */ InterfaceFutureC5920f f31958a;

        /* renamed from: b */
        final /* synthetic */ C0742c.a f31959b;

        /* renamed from: c */
        final /* synthetic */ String f31960c;

        c(InterfaceFutureC5920f interfaceFutureC5920f, C0742c.a aVar, String str) {
            this.f31958a = interfaceFutureC5920f;
            this.f31959b = aVar;
            this.f31960c = str;
        }

        @Override // p002a0.InterfaceC0006c
        /* renamed from: a */
        public void mo8a(Throwable th2) {
            if (!(th2 instanceof CancellationException)) {
                this.f31959b.m3756c(null);
                return;
            }
            C0984h.m4835m(this.f31959b.m3758f(new f(this.f31960c + " cancelled.", th2)));
        }

        @Override // p002a0.InterfaceC0006c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Surface surface) {
            C0009f.m25k(this.f31958a, this.f31959b);
        }
    }

    /* renamed from: w.i1$d */
    /* loaded from: classes.dex */
    class d implements InterfaceC0006c<Void> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC0977a f31962a;

        /* renamed from: b */
        final /* synthetic */ Surface f31963b;

        d(InterfaceC0977a interfaceC0977a, Surface surface) {
            this.f31962a = interfaceC0977a;
            this.f31963b = surface;
        }

        @Override // p002a0.InterfaceC0006c
        /* renamed from: a */
        public void mo8a(Throwable th2) {
            C0984h.m4836n(th2 instanceof f, "Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th2);
            this.f31962a.accept(g.m38621c(1, this.f31963b));
        }

        @Override // p002a0.InterfaceC0006c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r32) {
            this.f31962a.accept(g.m38621c(0, this.f31963b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w.i1$e */
    /* loaded from: classes.dex */
    public class e implements InterfaceC0006c<Void> {

        /* renamed from: a */
        final /* synthetic */ Runnable f31965a;

        e(Runnable runnable) {
            this.f31965a = runnable;
        }

        @Override // p002a0.InterfaceC0006c
        /* renamed from: a */
        public void mo8a(Throwable th2) {
        }

        @Override // p002a0.InterfaceC0006c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
            this.f31965a.run();
        }
    }

    /* renamed from: w.i1$f */
    /* loaded from: classes.dex */
    private static final class f extends RuntimeException {
        f(String str, Throwable th2) {
            super(str, th2);
        }
    }

    /* renamed from: w.i1$g */
    /* loaded from: classes.dex */
    public static abstract class g {
        /* renamed from: c */
        static g m38621c(int i10, Surface surface) {
            return new C12007g(i10, surface);
        }

        /* renamed from: a */
        public abstract int mo38584a();

        /* renamed from: b */
        public abstract Surface mo38585b();
    }

    /* renamed from: w.i1$h */
    /* loaded from: classes.dex */
    public static abstract class h {
        /* renamed from: g */
        public static h m38622g(Rect rect, int i10, int i11, boolean z10, Matrix matrix, boolean z11) {
            return new C12010h(rect, i10, i11, z10, matrix, z11);
        }

        /* renamed from: a */
        public abstract Rect mo38586a();

        /* renamed from: b */
        public abstract boolean mo38587b();

        /* renamed from: c */
        public abstract int mo38588c();

        /* renamed from: d */
        public abstract Matrix mo38589d();

        /* renamed from: e */
        public abstract int mo38590e();

        /* renamed from: f */
        public abstract boolean mo38591f();
    }

    /* renamed from: w.i1$i */
    /* loaded from: classes.dex */
    public interface i {
        /* renamed from: a */
        void mo22373a(h hVar);
    }

    public C12015i1(Size size, InterfaceC0606c0 interfaceC0606c0, C12048y c12048y, Range<Integer> range, Runnable runnable) {
        this.f31941b = size;
        this.f31944e = interfaceC0606c0;
        this.f31942c = c12048y;
        this.f31943d = range;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        final AtomicReference atomicReference = new AtomicReference(null);
        InterfaceFutureC5920f m3752a = C0742c.m3752a(new C0742c.c() { // from class: w.z0
            @Override // androidx.concurrent.futures.C0742c.c
            /* renamed from: a */
            public final Object mo14a(C0742c.a aVar) {
                Object m38603n;
                m38603n = C12015i1.m38603n(atomicReference, str, aVar);
                return m38603n;
            }
        });
        C0742c.a<Void> aVar = (C0742c.a) C0984h.m4833k((C0742c.a) atomicReference.get());
        this.f31949j = aVar;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        InterfaceFutureC5920f<Void> m3752a2 = C0742c.m3752a(new C0742c.c() { // from class: w.a1
            @Override // androidx.concurrent.futures.C0742c.c
            /* renamed from: a */
            public final Object mo14a(C0742c.a aVar2) {
                Object m38604o;
                m38604o = C12015i1.m38604o(atomicReference2, str, aVar2);
                return m38604o;
            }
        });
        this.f31947h = m3752a2;
        C0009f.m16b(m3752a2, new a(aVar, m3752a), C12747a.m42280a());
        C0742c.a aVar2 = (C0742c.a) C0984h.m4833k((C0742c.a) atomicReference2.get());
        final AtomicReference atomicReference3 = new AtomicReference(null);
        InterfaceFutureC5920f<Surface> m3752a3 = C0742c.m3752a(new C0742c.c() { // from class: w.b1
            @Override // androidx.concurrent.futures.C0742c.c
            /* renamed from: a */
            public final Object mo14a(C0742c.a aVar3) {
                Object m38605p;
                m38605p = C12015i1.m38605p(atomicReference3, str, aVar3);
                return m38605p;
            }
        });
        this.f31945f = m3752a3;
        this.f31946g = (C0742c.a) C0984h.m4833k((C0742c.a) atomicReference3.get());
        b bVar = new b(size, 34);
        this.f31950k = bVar;
        InterfaceFutureC5920f<Void> m3230k = bVar.m3230k();
        C0009f.m16b(m3752a3, new c(m3230k, aVar2, str), C12747a.m42280a());
        m3230k.addListener(new Runnable() { // from class: w.c1
            @Override // java.lang.Runnable
            public final void run() {
                C12015i1.this.m38606q();
            }
        }, C12747a.m42280a());
        this.f31948i = m38601l(C12747a.m42280a(), runnable);
    }

    /* renamed from: l */
    private C0742c.a<Void> m38601l(Executor executor, Runnable runnable) {
        final AtomicReference atomicReference = new AtomicReference(null);
        C0009f.m16b(C0742c.m3752a(new C0742c.c() { // from class: w.f1
            @Override // androidx.concurrent.futures.C0742c.c
            /* renamed from: a */
            public final Object mo14a(C0742c.a aVar) {
                Object m38602m;
                m38602m = C12015i1.this.m38602m(atomicReference, aVar);
                return m38602m;
            }
        }), new e(runnable), executor);
        return (C0742c.a) C0984h.m4833k((C0742c.a) atomicReference.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ Object m38602m(AtomicReference atomicReference, C0742c.a aVar) {
        atomicReference.set(aVar);
        return "SurfaceRequest-surface-recreation(" + hashCode() + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static /* synthetic */ Object m38603n(AtomicReference atomicReference, String str, C0742c.a aVar) {
        atomicReference.set(aVar);
        return str + "-cancellation";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static /* synthetic */ Object m38604o(AtomicReference atomicReference, String str, C0742c.a aVar) {
        atomicReference.set(aVar);
        return str + "-status";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static /* synthetic */ Object m38605p(AtomicReference atomicReference, String str, C0742c.a aVar) {
        atomicReference.set(aVar);
        return str + "-Surface";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m38606q() {
        this.f31945f.cancel(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static /* synthetic */ void m38607r(InterfaceC0977a interfaceC0977a, Surface surface) {
        interfaceC0977a.accept(g.m38621c(3, surface));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static /* synthetic */ void m38608s(InterfaceC0977a interfaceC0977a, Surface surface) {
        interfaceC0977a.accept(g.m38621c(4, surface));
    }

    /* renamed from: j */
    public AbstractC0661r0 m38611j() {
        return this.f31950k;
    }

    /* renamed from: k */
    public Size m38612k() {
        return this.f31941b;
    }

    /* renamed from: v */
    public void m38613v(final Surface surface, Executor executor, final InterfaceC0977a<g> interfaceC0977a) {
        if (this.f31946g.m3756c(surface) || this.f31945f.isCancelled()) {
            C0009f.m16b(this.f31947h, new d(interfaceC0977a, surface), executor);
            return;
        }
        C0984h.m4835m(this.f31945f.isDone());
        try {
            this.f31945f.get();
            executor.execute(new Runnable() { // from class: w.g1
                @Override // java.lang.Runnable
                public final void run() {
                    C12015i1.m38607r(InterfaceC0977a.this, surface);
                }
            });
        } catch (InterruptedException | ExecutionException unused) {
            executor.execute(new Runnable() { // from class: w.h1
                @Override // java.lang.Runnable
                public final void run() {
                    C12015i1.m38608s(InterfaceC0977a.this, surface);
                }
            });
        }
    }

    /* renamed from: w */
    public void m38614w(Executor executor, final i iVar) {
        final h hVar;
        synchronized (this.f31940a) {
            this.f31952m = iVar;
            this.f31953n = executor;
            hVar = this.f31951l;
        }
        if (hVar != null) {
            executor.execute(new Runnable() { // from class: w.d1
                @Override // java.lang.Runnable
                public final void run() {
                    C12015i1.i.this.mo22373a(hVar);
                }
            });
        }
    }

    /* renamed from: x */
    public void m38615x(final h hVar) {
        final i iVar;
        Executor executor;
        synchronized (this.f31940a) {
            this.f31951l = hVar;
            iVar = this.f31952m;
            executor = this.f31953n;
        }
        if (iVar == null || executor == null) {
            return;
        }
        executor.execute(new Runnable() { // from class: w.e1
            @Override // java.lang.Runnable
            public final void run() {
                C12015i1.i.this.mo22373a(hVar);
            }
        });
    }

    /* renamed from: y */
    public boolean m38616y() {
        return this.f31946g.m3758f(new AbstractC0661r0.b("Surface request will not complete."));
    }
}

package w;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.b2;
import androidx.camera.core.impl.r0;
import androidx.concurrent.futures.c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import w.i1;

/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: o */
    public static final Range<Integer> f29484o = b2.f2445a;

    /* renamed from: a */
    private final Object f29485a = new Object();

    /* renamed from: b */
    private final Size f29486b;

    /* renamed from: c */
    private final y f29487c;

    /* renamed from: d */
    private final Range<Integer> f29488d;

    /* renamed from: e */
    private final androidx.camera.core.impl.c0 f29489e;

    /* renamed from: f */
    final com.google.common.util.concurrent.f<Surface> f29490f;

    /* renamed from: g */
    private final c.a<Surface> f29491g;

    /* renamed from: h */
    private final com.google.common.util.concurrent.f<Void> f29492h;

    /* renamed from: i */
    private final c.a<Void> f29493i;

    /* renamed from: j */
    private final c.a<Void> f29494j;

    /* renamed from: k */
    private final androidx.camera.core.impl.r0 f29495k;

    /* renamed from: l */
    private h f29496l;

    /* renamed from: m */
    private i f29497m;

    /* renamed from: n */
    private Executor f29498n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements a0.c<Void> {

        /* renamed from: a */
        final /* synthetic */ c.a f29499a;

        /* renamed from: b */
        final /* synthetic */ com.google.common.util.concurrent.f f29500b;

        a(c.a aVar, com.google.common.util.concurrent.f fVar) {
            this.f29499a = aVar;
            this.f29500b = fVar;
        }

        @Override // a0.c
        public void a(Throwable th2) {
            androidx.core.util.h.m(th2 instanceof f ? this.f29500b.cancel(false) : this.f29499a.c(null));
        }

        @Override // a0.c
        /* renamed from: b */
        public void onSuccess(Void r22) {
            androidx.core.util.h.m(this.f29499a.c(null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends androidx.camera.core.impl.r0 {
        b(Size size, int i10) {
            super(size, i10);
        }

        @Override // androidx.camera.core.impl.r0
        protected com.google.common.util.concurrent.f<Surface> r() {
            return i1.this.f29490f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements a0.c<Surface> {

        /* renamed from: a */
        final /* synthetic */ com.google.common.util.concurrent.f f29503a;

        /* renamed from: b */
        final /* synthetic */ c.a f29504b;

        /* renamed from: c */
        final /* synthetic */ String f29505c;

        c(com.google.common.util.concurrent.f fVar, c.a aVar, String str) {
            this.f29503a = fVar;
            this.f29504b = aVar;
            this.f29505c = str;
        }

        @Override // a0.c
        public void a(Throwable th2) {
            if (!(th2 instanceof CancellationException)) {
                this.f29504b.c(null);
                return;
            }
            androidx.core.util.h.m(this.f29504b.f(new f(this.f29505c + " cancelled.", th2)));
        }

        @Override // a0.c
        /* renamed from: b */
        public void onSuccess(Surface surface) {
            a0.f.k(this.f29503a, this.f29504b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements a0.c<Void> {

        /* renamed from: a */
        final /* synthetic */ androidx.core.util.a f29507a;

        /* renamed from: b */
        final /* synthetic */ Surface f29508b;

        d(androidx.core.util.a aVar, Surface surface) {
            this.f29507a = aVar;
            this.f29508b = surface;
        }

        @Override // a0.c
        public void a(Throwable th2) {
            androidx.core.util.h.n(th2 instanceof f, "Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th2);
            this.f29507a.accept(g.c(1, this.f29508b));
        }

        @Override // a0.c
        /* renamed from: b */
        public void onSuccess(Void r32) {
            this.f29507a.accept(g.c(0, this.f29508b));
        }
    }

    /* loaded from: classes.dex */
    public class e implements a0.c<Void> {

        /* renamed from: a */
        final /* synthetic */ Runnable f29510a;

        e(Runnable runnable) {
            this.f29510a = runnable;
        }

        @Override // a0.c
        public void a(Throwable th2) {
        }

        @Override // a0.c
        /* renamed from: b */
        public void onSuccess(Void r12) {
            this.f29510a.run();
        }
    }

    /* loaded from: classes.dex */
    private static final class f extends RuntimeException {
        f(String str, Throwable th2) {
            super(str, th2);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class g {
        static g c(int i10, Surface surface) {
            return new w.g(i10, surface);
        }

        public abstract int a();

        public abstract Surface b();
    }

    /* loaded from: classes.dex */
    public static abstract class h {
        public static h g(Rect rect, int i10, int i11, boolean z10, Matrix matrix, boolean z11) {
            return new w.h(rect, i10, i11, z10, matrix, z11);
        }

        public abstract Rect a();

        public abstract boolean b();

        public abstract int c();

        public abstract Matrix d();

        public abstract int e();

        public abstract boolean f();
    }

    /* loaded from: classes.dex */
    public interface i {
        void a(h hVar);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: w.z0.<init>(java.util.concurrent.atomic.AtomicReference, java.lang.String):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    public i1(android.util.Size r5, androidx.camera.core.impl.c0 r6, w.y r7, android.util.Range<java.lang.Integer> r8, java.lang.Runnable r9) {
        /*
            r4 = this;
            r4.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r4.f29485a = r0
            r4.f29486b = r5
            r4.f29489e = r6
            r4.f29487c = r7
            r4.f29488d = r8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "SurfaceRequest[size: "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r7 = ", id: "
            r6.append(r7)
            int r7 = r4.hashCode()
            r6.append(r7)
            java.lang.String r7 = "]"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.util.concurrent.atomic.AtomicReference r7 = new java.util.concurrent.atomic.AtomicReference
            r8 = 0
            r7.<init>(r8)
            w.z0 r0 = new w.z0
            r0.<init>()
            com.google.common.util.concurrent.f r0 = androidx.concurrent.futures.c.a(r0)
            java.lang.Object r7 = r7.get()
            androidx.concurrent.futures.c$a r7 = (androidx.concurrent.futures.c.a) r7
            java.lang.Object r7 = androidx.core.util.h.k(r7)
            androidx.concurrent.futures.c$a r7 = (androidx.concurrent.futures.c.a) r7
            r4.f29494j = r7
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r1.<init>(r8)
            w.a1 r2 = new w.a1
            r2.<init>()
            com.google.common.util.concurrent.f r2 = androidx.concurrent.futures.c.a(r2)
            r4.f29492h = r2
            w.i1$a r3 = new w.i1$a
            r3.<init>(r7, r0)
            java.util.concurrent.Executor r7 = z.a.a()
            a0.f.b(r2, r3, r7)
            java.lang.Object r7 = r1.get()
            androidx.concurrent.futures.c$a r7 = (androidx.concurrent.futures.c.a) r7
            java.lang.Object r7 = androidx.core.util.h.k(r7)
            androidx.concurrent.futures.c$a r7 = (androidx.concurrent.futures.c.a) r7
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>(r8)
            w.b1 r8 = new w.b1
            r8.<init>()
            com.google.common.util.concurrent.f r8 = androidx.concurrent.futures.c.a(r8)
            r4.f29490f = r8
            java.lang.Object r0 = r0.get()
            androidx.concurrent.futures.c$a r0 = (androidx.concurrent.futures.c.a) r0
            java.lang.Object r0 = androidx.core.util.h.k(r0)
            androidx.concurrent.futures.c$a r0 = (androidx.concurrent.futures.c.a) r0
            r4.f29491g = r0
            w.i1$b r0 = new w.i1$b
            r1 = 34
            r0.<init>(r5, r1)
            r4.f29495k = r0
            com.google.common.util.concurrent.f r5 = r0.k()
            w.i1$c r0 = new w.i1$c
            r0.<init>(r5, r7, r6)
            java.util.concurrent.Executor r6 = z.a.a()
            a0.f.b(r8, r0, r6)
            w.c1 r6 = new w.c1
            r6.<init>()
            java.util.concurrent.Executor r7 = z.a.a()
            r5.addListener(r6, r7)
            java.util.concurrent.Executor r5 = z.a.a()
            androidx.concurrent.futures.c$a r5 = r4.l(r5, r9)
            r4.f29493i = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.i1.<init>(android.util.Size, androidx.camera.core.impl.c0, w.y, android.util.Range, java.lang.Runnable):void");
    }

    private c.a<Void> l(Executor executor, Runnable runnable) {
        AtomicReference atomicReference = new AtomicReference(null);
        a0.f.b(androidx.concurrent.futures.c.a(new c.InterfaceC0032c() { // from class: w.f1

            /* renamed from: b */
            public final /* synthetic */ AtomicReference f29468b;

            public /* synthetic */ f1(AtomicReference atomicReference2) {
                r2 = atomicReference2;
            }

            @Override // androidx.concurrent.futures.c.InterfaceC0032c
            public final Object a(c.a aVar) {
                Object m10;
                m10 = i1.this.m(r2, aVar);
                return m10;
            }
        }), new e(runnable), executor);
        return (c.a) androidx.core.util.h.k((c.a) atomicReference2.get());
    }

    public /* synthetic */ Object m(AtomicReference atomicReference, c.a aVar) {
        atomicReference.set(aVar);
        return "SurfaceRequest-surface-recreation(" + hashCode() + ")";
    }

    public static /* synthetic */ Object n(AtomicReference atomicReference, String str, c.a aVar) {
        atomicReference.set(aVar);
        return str + "-cancellation";
    }

    public static /* synthetic */ Object o(AtomicReference atomicReference, String str, c.a aVar) {
        atomicReference.set(aVar);
        return str + "-status";
    }

    public static /* synthetic */ Object p(AtomicReference atomicReference, String str, c.a aVar) {
        atomicReference.set(aVar);
        return str + "-Surface";
    }

    public /* synthetic */ void q() {
        this.f29490f.cancel(true);
    }

    public static /* synthetic */ void r(androidx.core.util.a aVar, Surface surface) {
        aVar.accept(g.c(3, surface));
    }

    public static /* synthetic */ void s(androidx.core.util.a aVar, Surface surface) {
        aVar.accept(g.c(4, surface));
    }

    public androidx.camera.core.impl.r0 j() {
        return this.f29495k;
    }

    public Size k() {
        return this.f29486b;
    }

    public void v(Surface surface, Executor executor, androidx.core.util.a<g> aVar) {
        if (this.f29491g.c(surface) || this.f29490f.isCancelled()) {
            a0.f.b(this.f29492h, new d(aVar, surface), executor);
            return;
        }
        androidx.core.util.h.m(this.f29490f.isDone());
        try {
            this.f29490f.get();
            executor.execute(new Runnable() { // from class: w.g1

                /* renamed from: b */
                public final /* synthetic */ Surface f29473b;

                public /* synthetic */ g1(Surface surface2) {
                    r2 = surface2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    i1.r(androidx.core.util.a.this, r2);
                }
            });
        } catch (InterruptedException | ExecutionException unused) {
            executor.execute(new Runnable() { // from class: w.h1

                /* renamed from: b */
                public final /* synthetic */ Surface f29481b;

                public /* synthetic */ h1(Surface surface2) {
                    r2 = surface2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    i1.s(androidx.core.util.a.this, r2);
                }
            });
        }
    }

    public void w(Executor executor, i iVar) {
        h hVar;
        synchronized (this.f29485a) {
            this.f29497m = iVar;
            this.f29498n = executor;
            hVar = this.f29496l;
        }
        if (hVar != null) {
            executor.execute(new Runnable() { // from class: w.d1

                /* renamed from: b */
                public final /* synthetic */ i1.h f29452b;

                public /* synthetic */ d1(i1.h hVar2) {
                    r2 = hVar2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    i1.i.this.a(r2);
                }
            });
        }
    }

    public void x(h hVar) {
        i iVar;
        Executor executor;
        synchronized (this.f29485a) {
            this.f29496l = hVar;
            iVar = this.f29497m;
            executor = this.f29498n;
        }
        if (iVar == null || executor == null) {
            return;
        }
        executor.execute(new Runnable() { // from class: w.e1

            /* renamed from: b */
            public final /* synthetic */ i1.h f29464b;

            public /* synthetic */ e1(i1.h hVar2) {
                r2 = hVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                i1.i.this.a(r2);
            }
        });
    }

    public boolean y() {
        return this.f29491g.f(new r0.b("Surface request will not complete."));
    }
}

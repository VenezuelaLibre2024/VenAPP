package v7;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import t6.u1;
import v7.a0;
import v7.h0;

/* loaded from: classes.dex */
public interface h0 {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final int f28333a;

        /* renamed from: b */
        public final a0.b f28334b;

        /* renamed from: c */
        private final CopyOnWriteArrayList<C0460a> f28335c;

        /* renamed from: d */
        private final long f28336d;

        /* renamed from: v7.h0$a$a */
        /* loaded from: classes.dex */
        public static final class C0460a {

            /* renamed from: a */
            public Handler f28337a;

            /* renamed from: b */
            public h0 f28338b;

            public C0460a(Handler handler, h0 h0Var) {
                this.f28337a = handler;
                this.f28338b = h0Var;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        private a(CopyOnWriteArrayList<C0460a> copyOnWriteArrayList, int i10, a0.b bVar, long j10) {
            this.f28335c = copyOnWriteArrayList;
            this.f28333a = i10;
            this.f28334b = bVar;
            this.f28336d = j10;
        }

        private long h(long j10) {
            long a12 = t8.r0.a1(j10);
            if (a12 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f28336d + a12;
        }

        public /* synthetic */ void k(h0 h0Var, x xVar) {
            h0Var.v(this.f28333a, this.f28334b, xVar);
        }

        public /* synthetic */ void l(h0 h0Var, u uVar, x xVar) {
            h0Var.D(this.f28333a, this.f28334b, uVar, xVar);
        }

        public /* synthetic */ void m(h0 h0Var, u uVar, x xVar) {
            h0Var.x(this.f28333a, this.f28334b, uVar, xVar);
        }

        public /* synthetic */ void n(h0 h0Var, u uVar, x xVar, IOException iOException, boolean z10) {
            h0Var.F(this.f28333a, this.f28334b, uVar, xVar, iOException, z10);
        }

        public /* synthetic */ void o(h0 h0Var, u uVar, x xVar) {
            h0Var.G(this.f28333a, this.f28334b, uVar, xVar);
        }

        public /* synthetic */ void p(h0 h0Var, a0.b bVar, x xVar) {
            h0Var.w(this.f28333a, bVar, xVar);
        }

        public void A(u uVar, int i10, int i11, u1 u1Var, int i12, Object obj, long j10, long j11) {
            B(uVar, new x(i10, i11, u1Var, i12, obj, h(j10), h(j11)));
        }

        public void B(u uVar, x xVar) {
            Iterator<C0460a> it = this.f28335c.iterator();
            while (it.hasNext()) {
                C0460a next = it.next();
                t8.r0.L0(next.f28337a, new Runnable() { // from class: v7.b0

                    /* renamed from: b */
                    public final /* synthetic */ h0 f28257b;

                    /* renamed from: c */
                    public final /* synthetic */ u f28258c;

                    /* renamed from: d */
                    public final /* synthetic */ x f28259d;

                    public /* synthetic */ b0(h0 h0Var, u uVar2, x xVar2) {
                        r2 = h0Var;
                        r3 = uVar2;
                        r4 = xVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        h0.a.this.o(r2, r3, r4);
                    }
                });
            }
        }

        public void C(h0 h0Var) {
            Iterator<C0460a> it = this.f28335c.iterator();
            while (it.hasNext()) {
                C0460a next = it.next();
                if (next.f28338b == h0Var) {
                    this.f28335c.remove(next);
                }
            }
        }

        public void D(int i10, long j10, long j11) {
            E(new x(1, i10, null, 3, null, h(j10), h(j11)));
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
            jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: v7.g0.<init>(v7.h0$a, v7.h0, v7.a0$b, v7.x):void, class status: GENERATED_AND_UNLOADED
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
        public void E(v7.x r6) {
            /*
                r5 = this;
                v7.a0$b r0 = r5.f28334b
                java.lang.Object r0 = t8.a.e(r0)
                v7.a0$b r0 = (v7.a0.b) r0
                java.util.concurrent.CopyOnWriteArrayList<v7.h0$a$a> r1 = r5.f28335c
                java.util.Iterator r1 = r1.iterator()
            Le:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L27
                java.lang.Object r2 = r1.next()
                v7.h0$a$a r2 = (v7.h0.a.C0460a) r2
                v7.h0 r3 = r2.f28338b
                android.os.Handler r2 = r2.f28337a
                v7.g0 r4 = new v7.g0
                r4.<init>()
                t8.r0.L0(r2, r4)
                goto Le
            L27:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: v7.h0.a.E(v7.x):void");
        }

        public a F(int i10, a0.b bVar, long j10) {
            return new a(this.f28335c, i10, bVar, j10);
        }

        public void g(Handler handler, h0 h0Var) {
            t8.a.e(handler);
            t8.a.e(h0Var);
            this.f28335c.add(new C0460a(handler, h0Var));
        }

        public void i(int i10, u1 u1Var, int i11, Object obj, long j10) {
            j(new x(1, i10, u1Var, i11, obj, h(j10), -9223372036854775807L));
        }

        public void j(x xVar) {
            Iterator<C0460a> it = this.f28335c.iterator();
            while (it.hasNext()) {
                C0460a next = it.next();
                t8.r0.L0(next.f28337a, new Runnable() { // from class: v7.c0

                    /* renamed from: b */
                    public final /* synthetic */ h0 f28267b;

                    /* renamed from: c */
                    public final /* synthetic */ x f28268c;

                    public /* synthetic */ c0(h0 h0Var, x xVar2) {
                        r2 = h0Var;
                        r3 = xVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        h0.a.this.k(r2, r3);
                    }
                });
            }
        }

        public void q(u uVar, int i10) {
            r(uVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void r(u uVar, int i10, int i11, u1 u1Var, int i12, Object obj, long j10, long j11) {
            s(uVar, new x(i10, i11, u1Var, i12, obj, h(j10), h(j11)));
        }

        public void s(u uVar, x xVar) {
            Iterator<C0460a> it = this.f28335c.iterator();
            while (it.hasNext()) {
                C0460a next = it.next();
                t8.r0.L0(next.f28337a, new Runnable() { // from class: v7.f0

                    /* renamed from: b */
                    public final /* synthetic */ h0 f28308b;

                    /* renamed from: c */
                    public final /* synthetic */ u f28309c;

                    /* renamed from: d */
                    public final /* synthetic */ x f28310d;

                    public /* synthetic */ f0(h0 h0Var, u uVar2, x xVar2) {
                        r2 = h0Var;
                        r3 = uVar2;
                        r4 = xVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        h0.a.this.l(r2, r3, r4);
                    }
                });
            }
        }

        public void t(u uVar, int i10) {
            u(uVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void u(u uVar, int i10, int i11, u1 u1Var, int i12, Object obj, long j10, long j11) {
            v(uVar, new x(i10, i11, u1Var, i12, obj, h(j10), h(j11)));
        }

        public void v(u uVar, x xVar) {
            Iterator<C0460a> it = this.f28335c.iterator();
            while (it.hasNext()) {
                C0460a next = it.next();
                t8.r0.L0(next.f28337a, new Runnable() { // from class: v7.e0

                    /* renamed from: b */
                    public final /* synthetic */ h0 f28302b;

                    /* renamed from: c */
                    public final /* synthetic */ u f28303c;

                    /* renamed from: d */
                    public final /* synthetic */ x f28304d;

                    public /* synthetic */ e0(h0 h0Var, u uVar2, x xVar2) {
                        r2 = h0Var;
                        r3 = uVar2;
                        r4 = xVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        h0.a.this.m(r2, r3, r4);
                    }
                });
            }
        }

        public void w(u uVar, int i10, int i11, u1 u1Var, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
            y(uVar, new x(i10, i11, u1Var, i12, obj, h(j10), h(j11)), iOException, z10);
        }

        public void x(u uVar, int i10, IOException iOException, boolean z10) {
            w(uVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
        }

        public void y(u uVar, x xVar, IOException iOException, boolean z10) {
            Iterator<C0460a> it = this.f28335c.iterator();
            while (it.hasNext()) {
                C0460a next = it.next();
                t8.r0.L0(next.f28337a, new Runnable() { // from class: v7.d0

                    /* renamed from: b */
                    public final /* synthetic */ h0 f28280b;

                    /* renamed from: c */
                    public final /* synthetic */ u f28281c;

                    /* renamed from: d */
                    public final /* synthetic */ x f28282d;

                    /* renamed from: e */
                    public final /* synthetic */ IOException f28283e;

                    /* renamed from: f */
                    public final /* synthetic */ boolean f28284f;

                    public /* synthetic */ d0(h0 h0Var, u uVar2, x xVar2, IOException iOException2, boolean z102) {
                        r2 = h0Var;
                        r3 = uVar2;
                        r4 = xVar2;
                        r5 = iOException2;
                        r6 = z102;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        h0.a.this.n(r2, r3, r4, r5, r6);
                    }
                });
            }
        }

        public void z(u uVar, int i10) {
            A(uVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }
    }

    default void D(int i10, a0.b bVar, u uVar, x xVar) {
    }

    default void F(int i10, a0.b bVar, u uVar, x xVar, IOException iOException, boolean z10) {
    }

    default void G(int i10, a0.b bVar, u uVar, x xVar) {
    }

    default void v(int i10, a0.b bVar, x xVar) {
    }

    default void w(int i10, a0.b bVar, x xVar) {
    }

    default void x(int i10, a0.b bVar, u uVar, x xVar) {
    }
}

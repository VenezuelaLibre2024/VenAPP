package androidx.work.impl;

import android.content.Context;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public class r implements e, androidx.work.impl.foreground.a {

    /* renamed from: x */
    private static final String f5892x = f2.j.i("Processor");

    /* renamed from: b */
    private Context f5894b;

    /* renamed from: c */
    private androidx.work.a f5895c;

    /* renamed from: d */
    private m2.b f5896d;

    /* renamed from: e */
    private WorkDatabase f5897e;

    /* renamed from: t */
    private List<t> f5901t;

    /* renamed from: r */
    private Map<String, h0> f5899r = new HashMap();

    /* renamed from: f */
    private Map<String, h0> f5898f = new HashMap();

    /* renamed from: u */
    private Set<String> f5902u = new HashSet();

    /* renamed from: v */
    private final List<e> f5903v = new ArrayList();

    /* renamed from: a */
    private PowerManager.WakeLock f5893a = null;

    /* renamed from: w */
    private final Object f5904w = new Object();

    /* renamed from: s */
    private Map<String, Set<v>> f5900s = new HashMap();

    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: a */
        private e f5905a;

        /* renamed from: b */
        private final k2.m f5906b;

        /* renamed from: c */
        private com.google.common.util.concurrent.f<Boolean> f5907c;

        a(e eVar, k2.m mVar, com.google.common.util.concurrent.f<Boolean> fVar) {
            this.f5905a = eVar;
            this.f5906b = mVar;
            this.f5907c = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            try {
                z10 = this.f5907c.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z10 = true;
            }
            this.f5905a.l(this.f5906b, z10);
        }
    }

    public r(Context context, androidx.work.a aVar, m2.b bVar, WorkDatabase workDatabase, List<t> list) {
        this.f5894b = context;
        this.f5895c = aVar;
        this.f5896d = bVar;
        this.f5897e = workDatabase;
        this.f5901t = list;
    }

    private static boolean i(String str, h0 h0Var) {
        if (h0Var == null) {
            f2.j.e().a(f5892x, "WorkerWrapper could not be found for " + str);
            return false;
        }
        h0Var.g();
        f2.j.e().a(f5892x, "WorkerWrapper interrupted for " + str);
        return true;
    }

    public /* synthetic */ k2.u m(ArrayList arrayList, String str) {
        arrayList.addAll(this.f5897e.K().a(str));
        return this.f5897e.J().h(str);
    }

    private void o(k2.m mVar, boolean z10) {
        this.f5896d.a().execute(new Runnable() { // from class: androidx.work.impl.q

            /* renamed from: b */
            public final /* synthetic */ k2.m f5890b;

            /* renamed from: c */
            public final /* synthetic */ boolean f5891c;

            public /* synthetic */ q(k2.m mVar2, boolean z102) {
                r2 = mVar2;
                r3 = z102;
            }

            @Override // java.lang.Runnable
            public final void run() {
                r.this.l(r2, r3);
            }
        });
    }

    private void s() {
        synchronized (this.f5904w) {
            if (!(!this.f5898f.isEmpty())) {
                try {
                    this.f5894b.startService(androidx.work.impl.foreground.b.g(this.f5894b));
                } catch (Throwable th2) {
                    f2.j.e().d(f5892x, "Unable to stop foreground service", th2);
                }
                PowerManager.WakeLock wakeLock = this.f5893a;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f5893a = null;
                }
            }
        }
    }

    @Override // androidx.work.impl.foreground.a
    public void a(String str) {
        synchronized (this.f5904w) {
            this.f5898f.remove(str);
            s();
        }
    }

    @Override // androidx.work.impl.foreground.a
    public boolean b(String str) {
        boolean containsKey;
        synchronized (this.f5904w) {
            containsKey = this.f5898f.containsKey(str);
        }
        return containsKey;
    }

    @Override // androidx.work.impl.foreground.a
    public void c(String str, f2.e eVar) {
        synchronized (this.f5904w) {
            f2.j.e().f(f5892x, "Moving WorkSpec (" + str + ") to the foreground");
            h0 remove = this.f5899r.remove(str);
            if (remove != null) {
                if (this.f5893a == null) {
                    PowerManager.WakeLock b10 = l2.y.b(this.f5894b, "ProcessorForegroundLck");
                    this.f5893a = b10;
                    b10.acquire();
                }
                this.f5898f.put(str, remove);
                androidx.core.content.a.startForegroundService(this.f5894b, androidx.work.impl.foreground.b.e(this.f5894b, remove.d(), eVar));
            }
        }
    }

    @Override // androidx.work.impl.e
    /* renamed from: d */
    public void l(k2.m mVar, boolean z10) {
        synchronized (this.f5904w) {
            h0 h0Var = this.f5899r.get(mVar.b());
            if (h0Var != null && mVar.equals(h0Var.d())) {
                this.f5899r.remove(mVar.b());
            }
            f2.j.e().a(f5892x, getClass().getSimpleName() + " " + mVar.b() + " executed; reschedule = " + z10);
            Iterator<e> it = this.f5903v.iterator();
            while (it.hasNext()) {
                it.next().l(mVar, z10);
            }
        }
    }

    public void g(e eVar) {
        synchronized (this.f5904w) {
            this.f5903v.add(eVar);
        }
    }

    public k2.u h(String str) {
        synchronized (this.f5904w) {
            h0 h0Var = this.f5898f.get(str);
            if (h0Var == null) {
                h0Var = this.f5899r.get(str);
            }
            if (h0Var == null) {
                return null;
            }
            return h0Var.e();
        }
    }

    public boolean j(String str) {
        boolean contains;
        synchronized (this.f5904w) {
            contains = this.f5902u.contains(str);
        }
        return contains;
    }

    public boolean k(String str) {
        boolean z10;
        synchronized (this.f5904w) {
            z10 = this.f5899r.containsKey(str) || this.f5898f.containsKey(str);
        }
        return z10;
    }

    public void n(e eVar) {
        synchronized (this.f5904w) {
            this.f5903v.remove(eVar);
        }
    }

    public boolean p(v vVar) {
        return q(vVar, null);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: androidx.work.impl.p.<init>(androidx.work.impl.r, java.util.ArrayList, java.lang.String):void, class status: GENERATED_AND_UNLOADED
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
    public boolean q(androidx.work.impl.v r13, androidx.work.WorkerParameters.a r14) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.r.q(androidx.work.impl.v, androidx.work.WorkerParameters$a):boolean");
    }

    public boolean r(String str) {
        h0 remove;
        boolean z10;
        synchronized (this.f5904w) {
            f2.j.e().a(f5892x, "Processor cancelling " + str);
            this.f5902u.add(str);
            remove = this.f5898f.remove(str);
            z10 = remove != null;
            if (remove == null) {
                remove = this.f5899r.remove(str);
            }
            if (remove != null) {
                this.f5900s.remove(str);
            }
        }
        boolean i10 = i(str, remove);
        if (z10) {
            s();
        }
        return i10;
    }

    public boolean t(v vVar) {
        h0 remove;
        String b10 = vVar.a().b();
        synchronized (this.f5904w) {
            f2.j.e().a(f5892x, "Processor stopping foreground work " + b10);
            remove = this.f5898f.remove(b10);
            if (remove != null) {
                this.f5900s.remove(b10);
            }
        }
        return i(b10, remove);
    }

    public boolean u(v vVar) {
        String b10 = vVar.a().b();
        synchronized (this.f5904w) {
            h0 remove = this.f5899r.remove(b10);
            if (remove == null) {
                f2.j.e().a(f5892x, "WorkerWrapper could not be found for " + b10);
                return false;
            }
            Set<v> set = this.f5900s.get(b10);
            if (set != null && set.contains(vVar)) {
                f2.j.e().a(f5892x, "Processor stopping background work " + b10);
                this.f5900s.remove(b10);
                return i(b10, remove);
            }
            return false;
        }
    }
}

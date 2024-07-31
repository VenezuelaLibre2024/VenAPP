package r1;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import dk.k0;
import dk.q0;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import v1.j;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: o */
    public static final c f24636o = new c(null);

    /* renamed from: a */
    protected volatile v1.i f24637a;

    /* renamed from: b */
    private Executor f24638b;

    /* renamed from: c */
    private Executor f24639c;

    /* renamed from: d */
    private v1.j f24640d;

    /* renamed from: f */
    private boolean f24642f;

    /* renamed from: g */
    private boolean f24643g;

    /* renamed from: h */
    protected List<? extends b> f24644h;

    /* renamed from: k */
    private r1.c f24647k;

    /* renamed from: m */
    private final Map<String, Object> f24649m;

    /* renamed from: n */
    private final Map<Class<?>, Object> f24650n;

    /* renamed from: e */
    private final o f24641e = g();

    /* renamed from: i */
    private Map<Class<? extends s1.a>, s1.a> f24645i = new LinkedHashMap();

    /* renamed from: j */
    private final ReentrantReadWriteLock f24646j = new ReentrantReadWriteLock();

    /* renamed from: l */
    private final ThreadLocal<Integer> f24648l = new ThreadLocal<>();

    /* loaded from: classes.dex */
    public static class a<T extends u> {

        /* renamed from: a */
        private final Context f24651a;

        /* renamed from: b */
        private final Class<T> f24652b;

        /* renamed from: c */
        private final String f24653c;

        /* renamed from: d */
        private final List<b> f24654d;

        /* renamed from: e */
        private final List<Object> f24655e;

        /* renamed from: f */
        private List<s1.a> f24656f;

        /* renamed from: g */
        private Executor f24657g;

        /* renamed from: h */
        private Executor f24658h;

        /* renamed from: i */
        private j.c f24659i;

        /* renamed from: j */
        private boolean f24660j;

        /* renamed from: k */
        private d f24661k;

        /* renamed from: l */
        private Intent f24662l;

        /* renamed from: m */
        private boolean f24663m;

        /* renamed from: n */
        private boolean f24664n;

        /* renamed from: o */
        private long f24665o;

        /* renamed from: p */
        private TimeUnit f24666p;

        /* renamed from: q */
        private final e f24667q;

        /* renamed from: r */
        private Set<Integer> f24668r;

        /* renamed from: s */
        private Set<Integer> f24669s;

        /* renamed from: t */
        private String f24670t;

        /* renamed from: u */
        private File f24671u;

        /* renamed from: v */
        private Callable<InputStream> f24672v;

        public a(Context context, Class<T> klass, String str) {
            kotlin.jvm.internal.n.e(context, "context");
            kotlin.jvm.internal.n.e(klass, "klass");
            this.f24651a = context;
            this.f24652b = klass;
            this.f24653c = str;
            this.f24654d = new ArrayList();
            this.f24655e = new ArrayList();
            this.f24656f = new ArrayList();
            this.f24661k = d.AUTOMATIC;
            this.f24663m = true;
            this.f24665o = -1L;
            this.f24667q = new e();
            this.f24668r = new LinkedHashSet();
        }

        public a<T> a(b callback) {
            kotlin.jvm.internal.n.e(callback, "callback");
            this.f24654d.add(callback);
            return this;
        }

        public a<T> b(s1.b... migrations) {
            kotlin.jvm.internal.n.e(migrations, "migrations");
            if (this.f24669s == null) {
                this.f24669s = new HashSet();
            }
            for (s1.b bVar : migrations) {
                Set<Integer> set = this.f24669s;
                kotlin.jvm.internal.n.b(set);
                set.add(Integer.valueOf(bVar.f25075a));
                Set<Integer> set2 = this.f24669s;
                kotlin.jvm.internal.n.b(set2);
                set2.add(Integer.valueOf(bVar.f25076b));
            }
            this.f24667q.b((s1.b[]) Arrays.copyOf(migrations, migrations.length));
            return this;
        }

        public a<T> c() {
            this.f24660j = true;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0104  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0166  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0100  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public T d() {
            /*
                Method dump skipped, instructions count: 368
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: r1.u.a.d():r1.u");
        }

        public a<T> e() {
            this.f24663m = false;
            this.f24664n = true;
            return this;
        }

        public a<T> f(j.c cVar) {
            this.f24659i = cVar;
            return this;
        }

        public a<T> g(Executor executor) {
            kotlin.jvm.internal.n.e(executor, "executor");
            this.f24657g = executor;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public void a(v1.i db2) {
            kotlin.jvm.internal.n.e(db2, "db");
        }

        public void b(v1.i db2) {
            kotlin.jvm.internal.n.e(db2, "db");
        }

        public void c(v1.i db2) {
            kotlin.jvm.internal.n.e(db2, "db");
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private final boolean h(ActivityManager activityManager) {
            return v1.c.b(activityManager);
        }

        public final d i(Context context) {
            kotlin.jvm.internal.n.e(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            kotlin.jvm.internal.n.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            return !h((ActivityManager) systemService) ? WRITE_AHEAD_LOGGING : TRUNCATE;
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a */
        private final Map<Integer, TreeMap<Integer, s1.b>> f24673a = new LinkedHashMap();

        private final void a(s1.b bVar) {
            int i10 = bVar.f25075a;
            int i11 = bVar.f25076b;
            Map<Integer, TreeMap<Integer, s1.b>> map = this.f24673a;
            Integer valueOf = Integer.valueOf(i10);
            TreeMap<Integer, s1.b> treeMap = map.get(valueOf);
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                map.put(valueOf, treeMap);
            }
            TreeMap<Integer, s1.b> treeMap2 = treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i11))) {
                Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i11)) + " with " + bVar);
            }
            treeMap2.put(Integer.valueOf(i11), bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
        
            if (r6 <= r12) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
        
            r6 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0054, code lost:
        
            if (r6 < r11) goto L75;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final java.util.List<s1.b> e(java.util.List<s1.b> r9, boolean r10, int r11, int r12) {
            /*
                r8 = this;
            L0:
                r0 = 1
                r1 = 0
                if (r10 == 0) goto L7
                if (r11 >= r12) goto Lb
                goto L9
            L7:
                if (r11 <= r12) goto Lb
            L9:
                r2 = r0
                goto Lc
            Lb:
                r2 = r1
            Lc:
                if (r2 == 0) goto L6e
                java.util.Map<java.lang.Integer, java.util.TreeMap<java.lang.Integer, s1.b>> r2 = r8.f24673a
                java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
                java.lang.Object r2 = r2.get(r3)
                java.util.TreeMap r2 = (java.util.TreeMap) r2
                r3 = 0
                if (r2 != 0) goto L1e
                return r3
            L1e:
                if (r10 == 0) goto L25
                java.util.NavigableSet r4 = r2.descendingKeySet()
                goto L29
            L25:
                java.util.Set r4 = r2.keySet()
            L29:
                java.util.Iterator r4 = r4.iterator()
            L2d:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L6a
                java.lang.Object r5 = r4.next()
                java.lang.Integer r5 = (java.lang.Integer) r5
                java.lang.String r6 = "targetVersion"
                if (r10 == 0) goto L4b
                int r7 = r11 + 1
                kotlin.jvm.internal.n.d(r5, r6)
                int r6 = r5.intValue()
                if (r7 > r6) goto L58
                if (r6 > r12) goto L58
                goto L56
            L4b:
                kotlin.jvm.internal.n.d(r5, r6)
                int r6 = r5.intValue()
                if (r12 > r6) goto L58
                if (r6 >= r11) goto L58
            L56:
                r6 = r0
                goto L59
            L58:
                r6 = r1
            L59:
                if (r6 == 0) goto L2d
                java.lang.Object r11 = r2.get(r5)
                kotlin.jvm.internal.n.b(r11)
                r9.add(r11)
                int r11 = r5.intValue()
                goto L6b
            L6a:
                r0 = r1
            L6b:
                if (r0 != 0) goto L0
                return r3
            L6e:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: r1.u.e.e(java.util.List, boolean, int, int):java.util.List");
        }

        public void b(s1.b... migrations) {
            kotlin.jvm.internal.n.e(migrations, "migrations");
            for (s1.b bVar : migrations) {
                a(bVar);
            }
        }

        public final boolean c(int i10, int i11) {
            Map<Integer, Map<Integer, s1.b>> f10 = f();
            if (!f10.containsKey(Integer.valueOf(i10))) {
                return false;
            }
            Map<Integer, s1.b> map = f10.get(Integer.valueOf(i10));
            if (map == null) {
                map = k0.h();
            }
            return map.containsKey(Integer.valueOf(i11));
        }

        public List<s1.b> d(int i10, int i11) {
            List<s1.b> j10;
            if (i10 != i11) {
                return e(new ArrayList(), i11 > i10, i10, i11);
            }
            j10 = dk.r.j();
            return j10;
        }

        public Map<Integer, Map<Integer, s1.b>> f() {
            return this.f24673a;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f {
    }

    /* loaded from: classes.dex */
    public static final class g extends kotlin.jvm.internal.o implements ok.l<v1.i, Object> {
        g() {
            super(1);
        }

        @Override // ok.l
        /* renamed from: a */
        public final Object invoke(v1.i it) {
            kotlin.jvm.internal.n.e(it, "it");
            u.this.t();
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends kotlin.jvm.internal.o implements ok.l<v1.i, Object> {
        h() {
            super(1);
        }

        @Override // ok.l
        /* renamed from: a */
        public final Object invoke(v1.i it) {
            kotlin.jvm.internal.n.e(it, "it");
            u.this.u();
            return null;
        }
    }

    public u() {
        Map<String, Object> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        kotlin.jvm.internal.n.d(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.f24649m = synchronizedMap;
        this.f24650n = new LinkedHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> T C(Class<T> cls, v1.j jVar) {
        if (cls.isInstance(jVar)) {
            return jVar;
        }
        if (jVar instanceof r1.g) {
            return (T) C(cls, ((r1.g) jVar).a());
        }
        return null;
    }

    public final void t() {
        c();
        v1.i Q0 = m().Q0();
        l().v(Q0);
        if (Q0.m1()) {
            Q0.P();
        } else {
            Q0.t();
        }
    }

    public final void u() {
        m().Q0().X();
        if (r()) {
            return;
        }
        l().n();
    }

    public static /* synthetic */ Cursor z(u uVar, v1.l lVar, CancellationSignal cancellationSignal, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i10 & 2) != 0) {
            cancellationSignal = null;
        }
        return uVar.y(lVar, cancellationSignal);
    }

    public <V> V A(Callable<V> body) {
        kotlin.jvm.internal.n.e(body, "body");
        e();
        try {
            V call = body.call();
            B();
            return call;
        } finally {
            i();
        }
    }

    public void B() {
        m().Q0().M();
    }

    public void c() {
        if (!this.f24642f && !(!w())) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString());
        }
    }

    public void d() {
        if (!(r() || this.f24648l.get() == null)) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.".toString());
        }
    }

    public void e() {
        c();
        r1.c cVar = this.f24647k;
        if (cVar == null) {
            t();
        } else {
            cVar.g(new g());
        }
    }

    public v1.m f(String sql) {
        kotlin.jvm.internal.n.e(sql, "sql");
        c();
        d();
        return m().Q0().C0(sql);
    }

    protected abstract o g();

    protected abstract v1.j h(r1.f fVar);

    public void i() {
        r1.c cVar = this.f24647k;
        if (cVar == null) {
            u();
        } else {
            cVar.g(new h());
        }
    }

    public List<s1.b> j(Map<Class<? extends s1.a>, s1.a> autoMigrationSpecs) {
        List<s1.b> j10;
        kotlin.jvm.internal.n.e(autoMigrationSpecs, "autoMigrationSpecs");
        j10 = dk.r.j();
        return j10;
    }

    public final Lock k() {
        ReentrantReadWriteLock.ReadLock readLock = this.f24646j.readLock();
        kotlin.jvm.internal.n.d(readLock, "readWriteLock.readLock()");
        return readLock;
    }

    public o l() {
        return this.f24641e;
    }

    public v1.j m() {
        v1.j jVar = this.f24640d;
        if (jVar != null) {
            return jVar;
        }
        kotlin.jvm.internal.n.p("internalOpenHelper");
        return null;
    }

    public Executor n() {
        Executor executor = this.f24638b;
        if (executor != null) {
            return executor;
        }
        kotlin.jvm.internal.n.p("internalQueryExecutor");
        return null;
    }

    public Set<Class<? extends s1.a>> o() {
        Set<Class<? extends s1.a>> e10;
        e10 = q0.e();
        return e10;
    }

    protected Map<Class<?>, List<Class<?>>> p() {
        Map<Class<?>, List<Class<?>>> h10;
        h10 = k0.h();
        return h10;
    }

    public Executor q() {
        Executor executor = this.f24639c;
        if (executor != null) {
            return executor;
        }
        kotlin.jvm.internal.n.p("internalTransactionExecutor");
        return null;
    }

    public boolean r() {
        return m().Q0().i1();
    }

    public void s(r1.f configuration) {
        kotlin.jvm.internal.n.e(configuration, "configuration");
        this.f24640d = h(configuration);
        Set<Class<? extends s1.a>> o10 = o();
        BitSet bitSet = new BitSet();
        Iterator<Class<? extends s1.a>> it = o10.iterator();
        while (true) {
            int i10 = -1;
            if (it.hasNext()) {
                Class<? extends s1.a> next = it.next();
                int size = configuration.f24574r.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i11 = size - 1;
                        if (next.isAssignableFrom(configuration.f24574r.get(size).getClass())) {
                            bitSet.set(size);
                            i10 = size;
                            break;
                        } else if (i11 < 0) {
                            break;
                        } else {
                            size = i11;
                        }
                    }
                }
                if (!(i10 >= 0)) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
                this.f24645i.put(next, configuration.f24574r.get(i10));
            } else {
                int size2 = configuration.f24574r.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i12 = size2 - 1;
                        if (!bitSet.get(size2)) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.".toString());
                        }
                        if (i12 < 0) {
                            break;
                        } else {
                            size2 = i12;
                        }
                    }
                }
                for (s1.b bVar : j(this.f24645i)) {
                    if (!configuration.f24560d.c(bVar.f25075a, bVar.f25076b)) {
                        configuration.f24560d.b(bVar);
                    }
                }
                b0 b0Var = (b0) C(b0.class, m());
                if (b0Var != null) {
                    b0Var.f(configuration);
                }
                r1.d dVar = (r1.d) C(r1.d.class, m());
                if (dVar != null) {
                    this.f24647k = dVar.f24524b;
                    l().q(dVar.f24524b);
                }
                boolean z10 = configuration.f24563g == d.WRITE_AHEAD_LOGGING;
                m().setWriteAheadLoggingEnabled(z10);
                this.f24644h = configuration.f24561e;
                this.f24638b = configuration.f24564h;
                this.f24639c = new f0(configuration.f24565i);
                this.f24642f = configuration.f24562f;
                this.f24643g = z10;
                if (configuration.f24566j != null) {
                    if (configuration.f24558b == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    l().r(configuration.f24557a, configuration.f24558b, configuration.f24566j);
                }
                Map<Class<?>, List<Class<?>>> p10 = p();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry<Class<?>, List<Class<?>>> entry : p10.entrySet()) {
                    Class<?> key = entry.getKey();
                    for (Class<?> cls : entry.getValue()) {
                        int size3 = configuration.f24573q.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i13 = size3 - 1;
                                if (cls.isAssignableFrom(configuration.f24573q.get(size3).getClass())) {
                                    bitSet2.set(size3);
                                    break;
                                } else if (i13 < 0) {
                                    break;
                                } else {
                                    size3 = i13;
                                }
                            }
                        }
                        size3 = -1;
                        if (!(size3 >= 0)) {
                            throw new IllegalArgumentException(("A required type converter (" + cls + ") for " + key.getCanonicalName() + " is missing in the database configuration.").toString());
                        }
                        this.f24650n.put(cls, configuration.f24573q.get(size3));
                    }
                }
                int size4 = configuration.f24573q.size() - 1;
                if (size4 < 0) {
                    return;
                }
                while (true) {
                    int i14 = size4 - 1;
                    if (!bitSet2.get(size4)) {
                        throw new IllegalArgumentException("Unexpected type converter " + configuration.f24573q.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                    if (i14 < 0) {
                        return;
                    } else {
                        size4 = i14;
                    }
                }
            }
        }
    }

    public void v(v1.i db2) {
        kotlin.jvm.internal.n.e(db2, "db");
        l().k(db2);
    }

    public final boolean w() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean x() {
        Boolean bool;
        boolean isOpen;
        r1.c cVar = this.f24647k;
        if (cVar != null) {
            isOpen = cVar.l();
        } else {
            v1.i iVar = this.f24637a;
            if (iVar == null) {
                bool = null;
                return kotlin.jvm.internal.n.a(bool, Boolean.TRUE);
            }
            isOpen = iVar.isOpen();
        }
        bool = Boolean.valueOf(isOpen);
        return kotlin.jvm.internal.n.a(bool, Boolean.TRUE);
    }

    public Cursor y(v1.l query, CancellationSignal cancellationSignal) {
        kotlin.jvm.internal.n.e(query, "query");
        c();
        d();
        return cancellationSignal != null ? m().Q0().D(query, cancellationSignal) : m().Q0().e0(query);
    }
}

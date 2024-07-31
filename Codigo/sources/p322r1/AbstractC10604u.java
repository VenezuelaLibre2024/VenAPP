package p322r1;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import dk.C7018k0;
import dk.C7030q0;
import dk.C7031r;
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
import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p280ok.InterfaceC9998l;
import p344s1.AbstractC10767b;
import p344s1.InterfaceC10766a;
import p391v1.C11604c;
import p391v1.InterfaceC11610i;
import p391v1.InterfaceC11611j;
import p391v1.InterfaceC11613l;
import p391v1.InterfaceC11614m;

/* renamed from: r1.u */
/* loaded from: classes.dex */
public abstract class AbstractC10604u {

    /* renamed from: o */
    public static final c f26750o = new c(null);

    /* renamed from: a */
    protected volatile InterfaceC11610i f26751a;

    /* renamed from: b */
    private Executor f26752b;

    /* renamed from: c */
    private Executor f26753c;

    /* renamed from: d */
    private InterfaceC11611j f26754d;

    /* renamed from: f */
    private boolean f26756f;

    /* renamed from: g */
    private boolean f26757g;

    /* renamed from: h */
    protected List<? extends b> f26758h;

    /* renamed from: k */
    private C10582c f26761k;

    /* renamed from: m */
    private final Map<String, Object> f26763m;

    /* renamed from: n */
    private final Map<Class<?>, Object> f26764n;

    /* renamed from: e */
    private final C10598o f26755e = mo8576g();

    /* renamed from: i */
    private Map<Class<? extends InterfaceC10766a>, InterfaceC10766a> f26759i = new LinkedHashMap();

    /* renamed from: j */
    private final ReentrantReadWriteLock f26760j = new ReentrantReadWriteLock();

    /* renamed from: l */
    private final ThreadLocal<Integer> f26762l = new ThreadLocal<>();

    /* renamed from: r1.u$a */
    /* loaded from: classes.dex */
    public static class a<T extends AbstractC10604u> {

        /* renamed from: a */
        private final Context f26765a;

        /* renamed from: b */
        private final Class<T> f26766b;

        /* renamed from: c */
        private final String f26767c;

        /* renamed from: d */
        private final List<b> f26768d;

        /* renamed from: e */
        private final List<Object> f26769e;

        /* renamed from: f */
        private List<InterfaceC10766a> f26770f;

        /* renamed from: g */
        private Executor f26771g;

        /* renamed from: h */
        private Executor f26772h;

        /* renamed from: i */
        private InterfaceC11611j.c f26773i;

        /* renamed from: j */
        private boolean f26774j;

        /* renamed from: k */
        private d f26775k;

        /* renamed from: l */
        private Intent f26776l;

        /* renamed from: m */
        private boolean f26777m;

        /* renamed from: n */
        private boolean f26778n;

        /* renamed from: o */
        private long f26779o;

        /* renamed from: p */
        private TimeUnit f26780p;

        /* renamed from: q */
        private final e f26781q;

        /* renamed from: r */
        private Set<Integer> f26782r;

        /* renamed from: s */
        private Set<Integer> f26783s;

        /* renamed from: t */
        private String f26784t;

        /* renamed from: u */
        private File f26785u;

        /* renamed from: v */
        private Callable<InputStream> f26786v;

        public a(Context context, Class<T> klass, String str) {
            C9322n.m27781e(context, "context");
            C9322n.m27781e(klass, "klass");
            this.f26765a = context;
            this.f26766b = klass;
            this.f26767c = str;
            this.f26768d = new ArrayList();
            this.f26769e = new ArrayList();
            this.f26770f = new ArrayList();
            this.f26775k = d.AUTOMATIC;
            this.f26777m = true;
            this.f26779o = -1L;
            this.f26781q = new e();
            this.f26782r = new LinkedHashSet();
        }

        /* renamed from: a */
        public a<T> m32267a(b callback) {
            C9322n.m27781e(callback, "callback");
            this.f26768d.add(callback);
            return this;
        }

        /* renamed from: b */
        public a<T> m32268b(AbstractC10767b... migrations) {
            C9322n.m27781e(migrations, "migrations");
            if (this.f26783s == null) {
                this.f26783s = new HashSet();
            }
            for (AbstractC10767b abstractC10767b : migrations) {
                Set<Integer> set = this.f26783s;
                C9322n.m27778b(set);
                set.add(Integer.valueOf(abstractC10767b.f27194a));
                Set<Integer> set2 = this.f26783s;
                C9322n.m27778b(set2);
                set2.add(Integer.valueOf(abstractC10767b.f27195b));
            }
            this.f26781q.m32281b((AbstractC10767b[]) Arrays.copyOf(migrations, migrations.length));
            return this;
        }

        /* renamed from: c */
        public a<T> m32269c() {
            this.f26774j = true;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0104  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0166  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0100  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public T m32270d() {
            /*
                Method dump skipped, instructions count: 368
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p322r1.AbstractC10604u.a.m32270d():r1.u");
        }

        /* renamed from: e */
        public a<T> m32271e() {
            this.f26777m = false;
            this.f26778n = true;
            return this;
        }

        /* renamed from: f */
        public a<T> m32272f(InterfaceC11611j.c cVar) {
            this.f26773i = cVar;
            return this;
        }

        /* renamed from: g */
        public a<T> m32273g(Executor executor) {
            C9322n.m27781e(executor, "executor");
            this.f26771g = executor;
            return this;
        }
    }

    /* renamed from: r1.u$b */
    /* loaded from: classes.dex */
    public static abstract class b {
        /* renamed from: a */
        public void m32274a(InterfaceC11610i db2) {
            C9322n.m27781e(db2, "db");
        }

        /* renamed from: b */
        public void m32275b(InterfaceC11610i db2) {
            C9322n.m27781e(db2, "db");
        }

        /* renamed from: c */
        public void mo8670c(InterfaceC11610i db2) {
            C9322n.m27781e(db2, "db");
        }
    }

    /* renamed from: r1.u$c */
    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(C9315g c9315g) {
            this();
        }
    }

    /* renamed from: r1.u$d */
    /* loaded from: classes.dex */
    public enum d {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        /* renamed from: h */
        private final boolean m32277h(ActivityManager activityManager) {
            return C11604c.m36382b(activityManager);
        }

        /* renamed from: i */
        public final d m32278i(Context context) {
            C9322n.m27781e(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            C9322n.m27779c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            return !m32277h((ActivityManager) systemService) ? WRITE_AHEAD_LOGGING : TRUNCATE;
        }
    }

    /* renamed from: r1.u$e */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a */
        private final Map<Integer, TreeMap<Integer, AbstractC10767b>> f26787a = new LinkedHashMap();

        /* renamed from: a */
        private final void m32279a(AbstractC10767b abstractC10767b) {
            int i10 = abstractC10767b.f27194a;
            int i11 = abstractC10767b.f27195b;
            Map<Integer, TreeMap<Integer, AbstractC10767b>> map = this.f26787a;
            Integer valueOf = Integer.valueOf(i10);
            TreeMap<Integer, AbstractC10767b> treeMap = map.get(valueOf);
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                map.put(valueOf, treeMap);
            }
            TreeMap<Integer, AbstractC10767b> treeMap2 = treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i11))) {
                Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i11)) + " with " + abstractC10767b);
            }
            treeMap2.put(Integer.valueOf(i11), abstractC10767b);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
        
            if (r6 <= r12) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
        
            r6 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0054, code lost:
        
            if (r6 < r11) goto L28;
         */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final java.util.List<p344s1.AbstractC10767b> m32280e(java.util.List<p344s1.AbstractC10767b> r9, boolean r10, int r11, int r12) {
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
                java.util.Map<java.lang.Integer, java.util.TreeMap<java.lang.Integer, s1.b>> r2 = r8.f26787a
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
                kotlin.jvm.internal.C9322n.m27780d(r5, r6)
                int r6 = r5.intValue()
                if (r7 > r6) goto L58
                if (r6 > r12) goto L58
                goto L56
            L4b:
                kotlin.jvm.internal.C9322n.m27780d(r5, r6)
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
                kotlin.jvm.internal.C9322n.m27778b(r11)
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
            throw new UnsupportedOperationException("Method not decompiled: p322r1.AbstractC10604u.e.m32280e(java.util.List, boolean, int, int):java.util.List");
        }

        /* renamed from: b */
        public void m32281b(AbstractC10767b... migrations) {
            C9322n.m27781e(migrations, "migrations");
            for (AbstractC10767b abstractC10767b : migrations) {
                m32279a(abstractC10767b);
            }
        }

        /* renamed from: c */
        public final boolean m32282c(int i10, int i11) {
            Map<Integer, Map<Integer, AbstractC10767b>> m32284f = m32284f();
            if (!m32284f.containsKey(Integer.valueOf(i10))) {
                return false;
            }
            Map<Integer, AbstractC10767b> map = m32284f.get(Integer.valueOf(i10));
            if (map == null) {
                map = C7018k0.m20421h();
            }
            return map.containsKey(Integer.valueOf(i11));
        }

        /* renamed from: d */
        public List<AbstractC10767b> m32283d(int i10, int i11) {
            List<AbstractC10767b> m20582j;
            if (i10 != i11) {
                return m32280e(new ArrayList(), i11 > i10, i10, i11);
            }
            m20582j = C7031r.m20582j();
            return m20582j;
        }

        /* renamed from: f */
        public Map<Integer, Map<Integer, AbstractC10767b>> m32284f() {
            return this.f26787a;
        }
    }

    /* renamed from: r1.u$f */
    /* loaded from: classes.dex */
    public static abstract class f {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r1.u$g */
    /* loaded from: classes.dex */
    public static final class g extends AbstractC9323o implements InterfaceC9998l<InterfaceC11610i, Object> {
        g() {
            super(1);
        }

        @Override // p280ok.InterfaceC9998l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC11610i it) {
            C9322n.m27781e(it, "it");
            AbstractC10604u.this.m32246t();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r1.u$h */
    /* loaded from: classes.dex */
    public static final class h extends AbstractC9323o implements InterfaceC9998l<InterfaceC11610i, Object> {
        h() {
            super(1);
        }

        @Override // p280ok.InterfaceC9998l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC11610i it) {
            C9322n.m27781e(it, "it");
            AbstractC10604u.this.m32247u();
            return null;
        }
    }

    public AbstractC10604u() {
        Map<String, Object> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        C9322n.m27780d(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.f26763m = synchronizedMap;
        this.f26764n = new LinkedHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: C */
    private final <T> T m32243C(Class<T> cls, InterfaceC11611j interfaceC11611j) {
        if (cls.isInstance(interfaceC11611j)) {
            return interfaceC11611j;
        }
        if (interfaceC11611j instanceof InterfaceC10590g) {
            return (T) m32243C(cls, ((InterfaceC10590g) interfaceC11611j).mo32113a());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public final void m32246t() {
        m32251c();
        InterfaceC11610i mo32112Q0 = m32258m().mo32112Q0();
        m32257l().m32211v(mo32112Q0);
        if (mo32112Q0.mo32141m1()) {
            mo32112Q0.mo32134P();
        } else {
            mo32112Q0.mo32142t();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public final void m32247u() {
        m32258m().mo32112Q0().mo32136X();
        if (m32261r()) {
            return;
        }
        m32257l().m32206n();
    }

    /* renamed from: z */
    public static /* synthetic */ Cursor m32248z(AbstractC10604u abstractC10604u, InterfaceC11613l interfaceC11613l, CancellationSignal cancellationSignal, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i10 & 2) != 0) {
            cancellationSignal = null;
        }
        return abstractC10604u.m32266y(interfaceC11613l, cancellationSignal);
    }

    /* renamed from: A */
    public <V> V m32249A(Callable<V> body) {
        C9322n.m27781e(body, "body");
        m32253e();
        try {
            V call = body.call();
            m32250B();
            return call;
        } finally {
            m32255i();
        }
    }

    /* renamed from: B */
    public void m32250B() {
        m32258m().mo32112Q0().mo32131M();
    }

    /* renamed from: c */
    public void m32251c() {
        if (!this.f26756f && !(!m32264w())) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString());
        }
    }

    /* renamed from: d */
    public void m32252d() {
        if (!(m32261r() || this.f26762l.get() == null)) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.".toString());
        }
    }

    /* renamed from: e */
    public void m32253e() {
        m32251c();
        C10582c c10582c = this.f26761k;
        if (c10582c == null) {
            m32246t();
        } else {
            c10582c.m32121g(new g());
        }
    }

    /* renamed from: f */
    public InterfaceC11614m m32254f(String sql) {
        C9322n.m27781e(sql, "sql");
        m32251c();
        m32252d();
        return m32258m().mo32112Q0().mo32129C0(sql);
    }

    /* renamed from: g */
    protected abstract C10598o mo8576g();

    /* renamed from: h */
    protected abstract InterfaceC11611j mo8577h(C10588f c10588f);

    /* renamed from: i */
    public void m32255i() {
        C10582c c10582c = this.f26761k;
        if (c10582c == null) {
            m32247u();
        } else {
            c10582c.m32121g(new h());
        }
    }

    /* renamed from: j */
    public List<AbstractC10767b> mo8578j(Map<Class<? extends InterfaceC10766a>, InterfaceC10766a> autoMigrationSpecs) {
        List<AbstractC10767b> m20582j;
        C9322n.m27781e(autoMigrationSpecs, "autoMigrationSpecs");
        m20582j = C7031r.m20582j();
        return m20582j;
    }

    /* renamed from: k */
    public final Lock m32256k() {
        ReentrantReadWriteLock.ReadLock readLock = this.f26760j.readLock();
        C9322n.m27780d(readLock, "readWriteLock.readLock()");
        return readLock;
    }

    /* renamed from: l */
    public C10598o m32257l() {
        return this.f26755e;
    }

    /* renamed from: m */
    public InterfaceC11611j m32258m() {
        InterfaceC11611j interfaceC11611j = this.f26754d;
        if (interfaceC11611j != null) {
            return interfaceC11611j;
        }
        C9322n.m27792p("internalOpenHelper");
        return null;
    }

    /* renamed from: n */
    public Executor m32259n() {
        Executor executor = this.f26752b;
        if (executor != null) {
            return executor;
        }
        C9322n.m27792p("internalQueryExecutor");
        return null;
    }

    /* renamed from: o */
    public Set<Class<? extends InterfaceC10766a>> mo8579o() {
        Set<Class<? extends InterfaceC10766a>> m20573e;
        m20573e = C7030q0.m20573e();
        return m20573e;
    }

    /* renamed from: p */
    protected Map<Class<?>, List<Class<?>>> mo8580p() {
        Map<Class<?>, List<Class<?>>> m20421h;
        m20421h = C7018k0.m20421h();
        return m20421h;
    }

    /* renamed from: q */
    public Executor m32260q() {
        Executor executor = this.f26753c;
        if (executor != null) {
            return executor;
        }
        C9322n.m27792p("internalTransactionExecutor");
        return null;
    }

    /* renamed from: r */
    public boolean m32261r() {
        return m32258m().mo32112Q0().mo32140i1();
    }

    /* renamed from: s */
    public void m32262s(C10588f configuration) {
        C9322n.m27781e(configuration, "configuration");
        this.f26754d = mo8577h(configuration);
        Set<Class<? extends InterfaceC10766a>> mo8579o = mo8579o();
        BitSet bitSet = new BitSet();
        Iterator<Class<? extends InterfaceC10766a>> it = mo8579o.iterator();
        while (true) {
            int i10 = -1;
            if (it.hasNext()) {
                Class<? extends InterfaceC10766a> next = it.next();
                int size = configuration.f26688r.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i11 = size - 1;
                        if (next.isAssignableFrom(configuration.f26688r.get(size).getClass())) {
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
                this.f26759i.put(next, configuration.f26688r.get(i10));
            } else {
                int size2 = configuration.f26688r.size() - 1;
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
                for (AbstractC10767b abstractC10767b : mo8578j(this.f26759i)) {
                    if (!configuration.f26674d.m32282c(abstractC10767b.f27194a, abstractC10767b.f27195b)) {
                        configuration.f26674d.m32281b(abstractC10767b);
                    }
                }
                C10581b0 c10581b0 = (C10581b0) m32243C(C10581b0.class, m32258m());
                if (c10581b0 != null) {
                    c10581b0.m32114f(configuration);
                }
                C10584d c10584d = (C10584d) m32243C(C10584d.class, m32258m());
                if (c10584d != null) {
                    this.f26761k = c10584d.f26638b;
                    m32257l().m32208q(c10584d.f26638b);
                }
                boolean z10 = configuration.f26677g == d.WRITE_AHEAD_LOGGING;
                m32258m().setWriteAheadLoggingEnabled(z10);
                this.f26758h = configuration.f26675e;
                this.f26752b = configuration.f26678h;
                this.f26753c = new ExecutorC10589f0(configuration.f26679i);
                this.f26756f = configuration.f26676f;
                this.f26757g = z10;
                if (configuration.f26680j != null) {
                    if (configuration.f26672b == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    m32257l().m32209r(configuration.f26671a, configuration.f26672b, configuration.f26680j);
                }
                Map<Class<?>, List<Class<?>>> mo8580p = mo8580p();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry<Class<?>, List<Class<?>>> entry : mo8580p.entrySet()) {
                    Class<?> key = entry.getKey();
                    for (Class<?> cls : entry.getValue()) {
                        int size3 = configuration.f26687q.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i13 = size3 - 1;
                                if (cls.isAssignableFrom(configuration.f26687q.get(size3).getClass())) {
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
                        this.f26764n.put(cls, configuration.f26687q.get(size3));
                    }
                }
                int size4 = configuration.f26687q.size() - 1;
                if (size4 < 0) {
                    return;
                }
                while (true) {
                    int i14 = size4 - 1;
                    if (!bitSet2.get(size4)) {
                        throw new IllegalArgumentException("Unexpected type converter " + configuration.f26687q.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
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

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public void m32263v(InterfaceC11610i db2) {
        C9322n.m27781e(db2, "db");
        m32257l().m32203k(db2);
    }

    /* renamed from: w */
    public final boolean m32264w() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: x */
    public boolean m32265x() {
        Boolean bool;
        boolean isOpen;
        C10582c c10582c = this.f26761k;
        if (c10582c != null) {
            isOpen = c10582c.m32126l();
        } else {
            InterfaceC11610i interfaceC11610i = this.f26751a;
            if (interfaceC11610i == null) {
                bool = null;
                return C9322n.m27777a(bool, Boolean.TRUE);
            }
            isOpen = interfaceC11610i.isOpen();
        }
        bool = Boolean.valueOf(isOpen);
        return C9322n.m27777a(bool, Boolean.TRUE);
    }

    /* renamed from: y */
    public Cursor m32266y(InterfaceC11613l query, CancellationSignal cancellationSignal) {
        C9322n.m27781e(query, "query");
        m32251c();
        m32252d();
        return cancellationSignal != null ? m32258m().mo32112Q0().mo32130D(query, cancellationSignal) : m32258m().mo32112Q0().mo32138e0(query);
    }
}

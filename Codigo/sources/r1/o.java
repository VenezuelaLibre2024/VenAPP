package r1;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.lifecycle.LiveData;
import dk.k0;
import dk.p0;
import dk.q0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
public class o {

    /* renamed from: q, reason: collision with root package name */
    public static final a f24585q = new a(null);

    /* renamed from: r, reason: collision with root package name */
    private static final String[] f24586r = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a, reason: collision with root package name */
    private final u f24587a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, String> f24588b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, Set<String>> f24589c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, Integer> f24590d;

    /* renamed from: e, reason: collision with root package name */
    private final String[] f24591e;

    /* renamed from: f, reason: collision with root package name */
    private r1.c f24592f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f24593g;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f24594h;

    /* renamed from: i, reason: collision with root package name */
    private volatile v1.m f24595i;

    /* renamed from: j, reason: collision with root package name */
    private final b f24596j;

    /* renamed from: k, reason: collision with root package name */
    private final m f24597k;

    /* renamed from: l, reason: collision with root package name */
    private final l.b<c, d> f24598l;

    /* renamed from: m, reason: collision with root package name */
    private r f24599m;

    /* renamed from: n, reason: collision with root package name */
    private final Object f24600n;

    /* renamed from: o, reason: collision with root package name */
    private final Object f24601o;

    /* renamed from: p, reason: collision with root package name */
    public final Runnable f24602p;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final void a(v1.i database) {
            kotlin.jvm.internal.n.e(database, "database");
            if (database.m1()) {
                database.P();
            } else {
                database.t();
            }
        }

        public final String b(String tableName, String triggerType) {
            kotlin.jvm.internal.n.e(tableName, "tableName");
            kotlin.jvm.internal.n.e(triggerType, "triggerType");
            return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: e, reason: collision with root package name */
        public static final a f24603e = new a(null);

        /* renamed from: a, reason: collision with root package name */
        private final long[] f24604a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean[] f24605b;

        /* renamed from: c, reason: collision with root package name */
        private final int[] f24606c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f24607d;

        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
                this();
            }
        }

        public b(int i10) {
            this.f24604a = new long[i10];
            this.f24605b = new boolean[i10];
            this.f24606c = new int[i10];
        }

        public final int[] a() {
            synchronized (this) {
                if (!this.f24607d) {
                    return null;
                }
                long[] jArr = this.f24604a;
                int length = jArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = i11 + 1;
                    int i13 = 1;
                    boolean z10 = jArr[i10] > 0;
                    boolean[] zArr = this.f24605b;
                    if (z10 != zArr[i11]) {
                        int[] iArr = this.f24606c;
                        if (!z10) {
                            i13 = 2;
                        }
                        iArr[i11] = i13;
                    } else {
                        this.f24606c[i11] = 0;
                    }
                    zArr[i11] = z10;
                    i10++;
                    i11 = i12;
                }
                this.f24607d = false;
                return (int[]) this.f24606c.clone();
            }
        }

        public final boolean b(int... tableIds) {
            boolean z10;
            kotlin.jvm.internal.n.e(tableIds, "tableIds");
            synchronized (this) {
                z10 = false;
                for (int i10 : tableIds) {
                    long[] jArr = this.f24604a;
                    long j10 = jArr[i10];
                    jArr[i10] = 1 + j10;
                    if (j10 == 0) {
                        z10 = true;
                        this.f24607d = true;
                    }
                }
                ck.v vVar = ck.v.f7137a;
            }
            return z10;
        }

        public final boolean c(int... tableIds) {
            boolean z10;
            kotlin.jvm.internal.n.e(tableIds, "tableIds");
            synchronized (this) {
                z10 = false;
                for (int i10 : tableIds) {
                    long[] jArr = this.f24604a;
                    long j10 = jArr[i10];
                    jArr[i10] = j10 - 1;
                    if (j10 == 1) {
                        z10 = true;
                        this.f24607d = true;
                    }
                }
                ck.v vVar = ck.v.f7137a;
            }
            return z10;
        }

        public final void d() {
            synchronized (this) {
                Arrays.fill(this.f24605b, false);
                this.f24607d = true;
                ck.v vVar = ck.v.f7137a;
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        private final String[] f24608a;

        public c(String[] tables) {
            kotlin.jvm.internal.n.e(tables, "tables");
            this.f24608a = tables;
        }

        public final String[] a() {
            return this.f24608a;
        }

        public boolean b() {
            return false;
        }

        public abstract void c(Set<String> set);
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final c f24609a;

        /* renamed from: b, reason: collision with root package name */
        private final int[] f24610b;

        /* renamed from: c, reason: collision with root package name */
        private final String[] f24611c;

        /* renamed from: d, reason: collision with root package name */
        private final Set<String> f24612d;

        public d(c observer, int[] tableIds, String[] tableNames) {
            kotlin.jvm.internal.n.e(observer, "observer");
            kotlin.jvm.internal.n.e(tableIds, "tableIds");
            kotlin.jvm.internal.n.e(tableNames, "tableNames");
            this.f24609a = observer;
            this.f24610b = tableIds;
            this.f24611c = tableNames;
            this.f24612d = (tableNames.length == 0) ^ true ? p0.d(tableNames[0]) : q0.e();
            if (!(tableIds.length == tableNames.length)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }

        public final int[] a() {
            return this.f24610b;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b(java.util.Set<java.lang.Integer> r9) {
            /*
                r8 = this;
                java.lang.String r0 = "invalidatedTablesIds"
                kotlin.jvm.internal.n.e(r9, r0)
                int[] r0 = r8.f24610b
                int r1 = r0.length
                r2 = 1
                if (r1 == 0) goto L45
                r3 = 0
                if (r1 == r2) goto L36
                java.util.Set r0 = dk.o0.b()
                int[] r1 = r8.f24610b
                int r4 = r1.length
                r5 = r3
            L16:
                if (r3 >= r4) goto L31
                r6 = r1[r3]
                int r7 = r5 + 1
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                boolean r6 = r9.contains(r6)
                if (r6 == 0) goto L2d
                java.lang.String[] r6 = r8.f24611c
                r5 = r6[r5]
                r0.add(r5)
            L2d:
                int r3 = r3 + 1
                r5 = r7
                goto L16
            L31:
                java.util.Set r9 = dk.o0.a(r0)
                goto L49
            L36:
                r0 = r0[r3]
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                boolean r9 = r9.contains(r0)
                if (r9 == 0) goto L45
                java.util.Set<java.lang.String> r9 = r8.f24612d
                goto L49
            L45:
                java.util.Set r9 = dk.o0.e()
            L49:
                r0 = r9
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r0 = r0.isEmpty()
                r0 = r0 ^ r2
                if (r0 == 0) goto L58
                r1.o$c r0 = r8.f24609a
                r0.c(r9)
            L58:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r1.o.d.b(java.util.Set):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void c(java.lang.String[] r12) {
            /*
                r11 = this;
                java.lang.String r0 = "tables"
                kotlin.jvm.internal.n.e(r12, r0)
                java.lang.String[] r0 = r11.f24611c
                int r0 = r0.length
                r1 = 1
                if (r0 == 0) goto L4e
                r2 = 0
                if (r0 == r1) goto L34
                java.util.Set r0 = dk.o0.b()
                int r3 = r12.length
                r4 = r2
            L14:
                if (r4 >= r3) goto L2f
                r5 = r12[r4]
                java.lang.String[] r6 = r11.f24611c
                int r7 = r6.length
                r8 = r2
            L1c:
                if (r8 >= r7) goto L2c
                r9 = r6[r8]
                boolean r10 = xk.g.r(r9, r5, r1)
                if (r10 == 0) goto L29
                r0.add(r9)
            L29:
                int r8 = r8 + 1
                goto L1c
            L2c:
                int r4 = r4 + 1
                goto L14
            L2f:
                java.util.Set r12 = dk.o0.a(r0)
                goto L52
            L34:
                int r0 = r12.length
                r3 = r2
            L36:
                if (r3 >= r0) goto L49
                r4 = r12[r3]
                java.lang.String[] r5 = r11.f24611c
                r5 = r5[r2]
                boolean r4 = xk.g.r(r4, r5, r1)
                if (r4 == 0) goto L46
                r2 = r1
                goto L49
            L46:
                int r3 = r3 + 1
                goto L36
            L49:
                if (r2 == 0) goto L4e
                java.util.Set<java.lang.String> r12 = r11.f24612d
                goto L52
            L4e:
                java.util.Set r12 = dk.o0.e()
            L52:
                r0 = r12
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r0 = r0.isEmpty()
                r0 = r0 ^ r1
                if (r0 == 0) goto L61
                r1.o$c r0 = r11.f24609a
                r0.c(r12)
            L61:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r1.o.d.c(java.lang.String[]):void");
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends c {

        /* renamed from: b, reason: collision with root package name */
        private final o f24613b;

        /* renamed from: c, reason: collision with root package name */
        private final WeakReference<c> f24614c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(o tracker, c delegate) {
            super(delegate.a());
            kotlin.jvm.internal.n.e(tracker, "tracker");
            kotlin.jvm.internal.n.e(delegate, "delegate");
            this.f24613b = tracker;
            this.f24614c = new WeakReference<>(delegate);
        }

        @Override // r1.o.c
        public void c(Set<String> tables) {
            kotlin.jvm.internal.n.e(tables, "tables");
            c cVar = this.f24614c.get();
            if (cVar == null) {
                this.f24613b.o(this);
            } else {
                cVar.c(tables);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements Runnable {
        f() {
        }

        private final Set<Integer> a() {
            Set b10;
            Set<Integer> a10;
            o oVar = o.this;
            b10 = p0.b();
            Cursor z10 = u.z(oVar.g(), new v1.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null, 2, null);
            while (z10.moveToNext()) {
                try {
                    b10.add(Integer.valueOf(z10.getInt(0)));
                } finally {
                }
            }
            ck.v vVar = ck.v.f7137a;
            mk.b.a(z10, null);
            a10 = p0.a(b10);
            if (!a10.isEmpty()) {
                if (o.this.f() == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                v1.m f10 = o.this.f();
                if (f10 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                f10.z();
            }
            return a10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
        
            if (r0 != null) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
        
            r0.e();
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00c5, code lost:
        
            if ((!r3.isEmpty()) == false) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00c7, code lost:
        
            r0 = r5.f24615a.h();
            r1 = r5.f24615a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00cf, code lost:
        
            monitor-enter(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00d0, code lost:
        
            r1 = r1.h().iterator();
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00dc, code lost:
        
            if (r1.hasNext() == false) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00de, code lost:
        
            ((r1.o.d) ((java.util.Map.Entry) r1.next()).getValue()).b(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00ee, code lost:
        
            r1 = ck.v.f7137a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00f0, code lost:
        
            monitor-exit(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00f5, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00a2, code lost:
        
            if (r0 == null) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x00ba, code lost:
        
            if (r0 == null) goto L42;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 261
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: r1.o.f.run():void");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(u database, Map<String, String> shadowTablesMap, Map<String, Set<String>> viewTables, String... tableNames) {
        Object i10;
        String str;
        kotlin.jvm.internal.n.e(database, "database");
        kotlin.jvm.internal.n.e(shadowTablesMap, "shadowTablesMap");
        kotlin.jvm.internal.n.e(viewTables, "viewTables");
        kotlin.jvm.internal.n.e(tableNames, "tableNames");
        this.f24587a = database;
        this.f24588b = shadowTablesMap;
        this.f24589c = viewTables;
        this.f24593g = new AtomicBoolean(false);
        this.f24596j = new b(tableNames.length);
        this.f24597k = new m(database);
        this.f24598l = new l.b<>();
        this.f24600n = new Object();
        this.f24601o = new Object();
        this.f24590d = new LinkedHashMap();
        int length = tableNames.length;
        String[] strArr = new String[length];
        for (int i11 = 0; i11 < length; i11++) {
            String str2 = tableNames[i11];
            Locale US = Locale.US;
            kotlin.jvm.internal.n.d(US, "US");
            String lowerCase = str2.toLowerCase(US);
            kotlin.jvm.internal.n.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.f24590d.put(lowerCase, Integer.valueOf(i11));
            String str3 = this.f24588b.get(tableNames[i11]);
            if (str3 != null) {
                kotlin.jvm.internal.n.d(US, "US");
                str = str3.toLowerCase(US);
                kotlin.jvm.internal.n.d(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr[i11] = lowerCase;
        }
        this.f24591e = strArr;
        for (Map.Entry<String, String> entry : this.f24588b.entrySet()) {
            String value = entry.getValue();
            Locale US2 = Locale.US;
            kotlin.jvm.internal.n.d(US2, "US");
            String lowerCase2 = value.toLowerCase(US2);
            kotlin.jvm.internal.n.d(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f24590d.containsKey(lowerCase2)) {
                String key = entry.getKey();
                kotlin.jvm.internal.n.d(US2, "US");
                String lowerCase3 = key.toLowerCase(US2);
                kotlin.jvm.internal.n.d(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                Map<String, Integer> map = this.f24590d;
                i10 = k0.i(map, lowerCase2);
                map.put(lowerCase3, i10);
            }
        }
        this.f24602p = new f();
    }

    private final String[] p(String[] strArr) {
        Set b10;
        Set a10;
        b10 = p0.b();
        for (String str : strArr) {
            Map<String, Set<String>> map = this.f24589c;
            Locale US = Locale.US;
            kotlin.jvm.internal.n.d(US, "US");
            String lowerCase = str.toLowerCase(US);
            kotlin.jvm.internal.n.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                Map<String, Set<String>> map2 = this.f24589c;
                kotlin.jvm.internal.n.d(US, "US");
                String lowerCase2 = str.toLowerCase(US);
                kotlin.jvm.internal.n.d(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Set<String> set = map2.get(lowerCase2);
                kotlin.jvm.internal.n.b(set);
                b10.addAll(set);
            } else {
                b10.add(str);
            }
        }
        a10 = p0.a(b10);
        Object[] array = a10.toArray(new String[0]);
        kotlin.jvm.internal.n.c(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    private final void s(v1.i iVar, int i10) {
        iVar.x("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)");
        String str = this.f24591e[i10];
        for (String str2 : f24586r) {
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + f24585q.b(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i10 + " AND invalidated = 0; END";
            kotlin.jvm.internal.n.d(str3, "StringBuilder().apply(builderAction).toString()");
            iVar.x(str3);
        }
    }

    private final void t(v1.i iVar, int i10) {
        String str = this.f24591e[i10];
        for (String str2 : f24586r) {
            String str3 = "DROP TRIGGER IF EXISTS " + f24585q.b(str, str2);
            kotlin.jvm.internal.n.d(str3, "StringBuilder().apply(builderAction).toString()");
            iVar.x(str3);
        }
    }

    private final String[] w(String[] strArr) {
        String[] p10 = p(strArr);
        for (String str : p10) {
            Map<String, Integer> map = this.f24590d;
            Locale US = Locale.US;
            kotlin.jvm.internal.n.d(US, "US");
            String lowerCase = str.toLowerCase(US);
            kotlin.jvm.internal.n.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!map.containsKey(lowerCase)) {
                throw new IllegalArgumentException(("There is no table with name " + str).toString());
            }
        }
        return p10;
    }

    public void b(c observer) {
        int[] e02;
        d l10;
        kotlin.jvm.internal.n.e(observer, "observer");
        String[] p10 = p(observer.a());
        ArrayList arrayList = new ArrayList(p10.length);
        for (String str : p10) {
            Map<String, Integer> map = this.f24590d;
            Locale US = Locale.US;
            kotlin.jvm.internal.n.d(US, "US");
            String lowerCase = str.toLowerCase(US);
            kotlin.jvm.internal.n.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = map.get(lowerCase);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
            arrayList.add(Integer.valueOf(num.intValue()));
        }
        e02 = dk.z.e0(arrayList);
        d dVar = new d(observer, e02, p10);
        synchronized (this.f24598l) {
            l10 = this.f24598l.l(observer, dVar);
        }
        if (l10 == null && this.f24596j.b(Arrays.copyOf(e02, e02.length))) {
            u();
        }
    }

    public void c(c observer) {
        kotlin.jvm.internal.n.e(observer, "observer");
        b(new e(this, observer));
    }

    public <T> LiveData<T> d(String[] tableNames, boolean z10, Callable<T> computeFunction) {
        kotlin.jvm.internal.n.e(tableNames, "tableNames");
        kotlin.jvm.internal.n.e(computeFunction, "computeFunction");
        return this.f24597k.a(w(tableNames), z10, computeFunction);
    }

    public final boolean e() {
        if (!this.f24587a.x()) {
            return false;
        }
        if (!this.f24594h) {
            this.f24587a.m().Q0();
        }
        if (this.f24594h) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final v1.m f() {
        return this.f24595i;
    }

    public final u g() {
        return this.f24587a;
    }

    public final l.b<c, d> h() {
        return this.f24598l;
    }

    public final AtomicBoolean i() {
        return this.f24593g;
    }

    public final Map<String, Integer> j() {
        return this.f24590d;
    }

    public final void k(v1.i database) {
        kotlin.jvm.internal.n.e(database, "database");
        synchronized (this.f24601o) {
            if (this.f24594h) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            database.x("PRAGMA temp_store = MEMORY;");
            database.x("PRAGMA recursive_triggers='ON';");
            database.x("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            v(database);
            this.f24595i = database.C0("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            this.f24594h = true;
            ck.v vVar = ck.v.f7137a;
        }
    }

    public final void l(String... tables) {
        kotlin.jvm.internal.n.e(tables, "tables");
        synchronized (this.f24598l) {
            Iterator<Map.Entry<K, V>> it = this.f24598l.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                kotlin.jvm.internal.n.d(entry, "(observer, wrapper)");
                c cVar = (c) entry.getKey();
                d dVar = (d) entry.getValue();
                if (!cVar.b()) {
                    dVar.c(tables);
                }
            }
            ck.v vVar = ck.v.f7137a;
        }
    }

    public final void m() {
        synchronized (this.f24601o) {
            this.f24594h = false;
            this.f24596j.d();
            ck.v vVar = ck.v.f7137a;
        }
    }

    public void n() {
        if (this.f24593g.compareAndSet(false, true)) {
            r1.c cVar = this.f24592f;
            if (cVar != null) {
                cVar.j();
            }
            this.f24587a.n().execute(this.f24602p);
        }
    }

    public void o(c observer) {
        d m10;
        kotlin.jvm.internal.n.e(observer, "observer");
        synchronized (this.f24598l) {
            m10 = this.f24598l.m(observer);
        }
        if (m10 != null) {
            b bVar = this.f24596j;
            int[] a10 = m10.a();
            if (bVar.c(Arrays.copyOf(a10, a10.length))) {
                u();
            }
        }
    }

    public final void q(r1.c autoCloser) {
        kotlin.jvm.internal.n.e(autoCloser, "autoCloser");
        this.f24592f = autoCloser;
        autoCloser.m(new Runnable() { // from class: r1.n
            @Override // java.lang.Runnable
            public final void run() {
                o.this.m();
            }
        });
    }

    public final void r(Context context, String name, Intent serviceIntent) {
        kotlin.jvm.internal.n.e(context, "context");
        kotlin.jvm.internal.n.e(name, "name");
        kotlin.jvm.internal.n.e(serviceIntent, "serviceIntent");
        this.f24599m = new r(context, name, serviceIntent, this, this.f24587a.n());
    }

    public final void u() {
        if (this.f24587a.x()) {
            v(this.f24587a.m().Q0());
        }
    }

    public final void v(v1.i database) {
        kotlin.jvm.internal.n.e(database, "database");
        if (database.i1()) {
            return;
        }
        try {
            Lock k10 = this.f24587a.k();
            k10.lock();
            try {
                synchronized (this.f24600n) {
                    int[] a10 = this.f24596j.a();
                    if (a10 == null) {
                        return;
                    }
                    f24585q.a(database);
                    try {
                        int length = a10.length;
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < length) {
                            int i12 = a10[i10];
                            int i13 = i11 + 1;
                            if (i12 == 1) {
                                s(database, i11);
                            } else if (i12 == 2) {
                                t(database, i11);
                            }
                            i10++;
                            i11 = i13;
                        }
                        database.M();
                        database.X();
                        ck.v vVar = ck.v.f7137a;
                    } catch (Throwable th2) {
                        database.X();
                        throw th2;
                    }
                }
            } finally {
                k10.unlock();
            }
        } catch (SQLiteException | IllegalStateException e10) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
        }
    }
}

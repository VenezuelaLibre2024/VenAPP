package p322r1;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.lifecycle.LiveData;
import ck.C2037v;
import dk.C7018k0;
import dk.C7028p0;
import dk.C7030q0;
import dk.C7042z;
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
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import mk.C9602b;
import p208l.C9336b;
import p391v1.C11602a;
import p391v1.InterfaceC11610i;
import p391v1.InterfaceC11614m;

/* renamed from: r1.o */
/* loaded from: classes.dex */
public class C10598o {

    /* renamed from: q */
    public static final a f26699q = new a(null);

    /* renamed from: r */
    private static final String[] f26700r = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a */
    private final AbstractC10604u f26701a;

    /* renamed from: b */
    private final Map<String, String> f26702b;

    /* renamed from: c */
    private final Map<String, Set<String>> f26703c;

    /* renamed from: d */
    private final Map<String, Integer> f26704d;

    /* renamed from: e */
    private final String[] f26705e;

    /* renamed from: f */
    private C10582c f26706f;

    /* renamed from: g */
    private final AtomicBoolean f26707g;

    /* renamed from: h */
    private volatile boolean f26708h;

    /* renamed from: i */
    private volatile InterfaceC11614m f26709i;

    /* renamed from: j */
    private final b f26710j;

    /* renamed from: k */
    private final C10596m f26711k;

    /* renamed from: l */
    private final C9336b<c, d> f26712l;

    /* renamed from: m */
    private C10601r f26713m;

    /* renamed from: n */
    private final Object f26714n;

    /* renamed from: o */
    private final Object f26715o;

    /* renamed from: p */
    public final Runnable f26716p;

    /* renamed from: r1.o$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final void m32212a(InterfaceC11610i database) {
            C9322n.m27781e(database, "database");
            if (database.mo32141m1()) {
                database.mo32134P();
            } else {
                database.mo32142t();
            }
        }

        /* renamed from: b */
        public final String m32213b(String tableName, String triggerType) {
            C9322n.m27781e(tableName, "tableName");
            C9322n.m27781e(triggerType, "triggerType");
            return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
        }
    }

    /* renamed from: r1.o$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: e */
        public static final a f26717e = new a(null);

        /* renamed from: a */
        private final long[] f26718a;

        /* renamed from: b */
        private final boolean[] f26719b;

        /* renamed from: c */
        private final int[] f26720c;

        /* renamed from: d */
        private boolean f26721d;

        /* renamed from: r1.o$b$a */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(C9315g c9315g) {
                this();
            }
        }

        public b(int i10) {
            this.f26718a = new long[i10];
            this.f26719b = new boolean[i10];
            this.f26720c = new int[i10];
        }

        /* renamed from: a */
        public final int[] m32214a() {
            synchronized (this) {
                if (!this.f26721d) {
                    return null;
                }
                long[] jArr = this.f26718a;
                int length = jArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = i11 + 1;
                    int i13 = 1;
                    boolean z10 = jArr[i10] > 0;
                    boolean[] zArr = this.f26719b;
                    if (z10 != zArr[i11]) {
                        int[] iArr = this.f26720c;
                        if (!z10) {
                            i13 = 2;
                        }
                        iArr[i11] = i13;
                    } else {
                        this.f26720c[i11] = 0;
                    }
                    zArr[i11] = z10;
                    i10++;
                    i11 = i12;
                }
                this.f26721d = false;
                return (int[]) this.f26720c.clone();
            }
        }

        /* renamed from: b */
        public final boolean m32215b(int... tableIds) {
            boolean z10;
            C9322n.m27781e(tableIds, "tableIds");
            synchronized (this) {
                z10 = false;
                for (int i10 : tableIds) {
                    long[] jArr = this.f26718a;
                    long j10 = jArr[i10];
                    jArr[i10] = 1 + j10;
                    if (j10 == 0) {
                        z10 = true;
                        this.f26721d = true;
                    }
                }
                C2037v c2037v = C2037v.f8089a;
            }
            return z10;
        }

        /* renamed from: c */
        public final boolean m32216c(int... tableIds) {
            boolean z10;
            C9322n.m27781e(tableIds, "tableIds");
            synchronized (this) {
                z10 = false;
                for (int i10 : tableIds) {
                    long[] jArr = this.f26718a;
                    long j10 = jArr[i10];
                    jArr[i10] = j10 - 1;
                    if (j10 == 1) {
                        z10 = true;
                        this.f26721d = true;
                    }
                }
                C2037v c2037v = C2037v.f8089a;
            }
            return z10;
        }

        /* renamed from: d */
        public final void m32217d() {
            synchronized (this) {
                Arrays.fill(this.f26719b, false);
                this.f26721d = true;
                C2037v c2037v = C2037v.f8089a;
            }
        }
    }

    /* renamed from: r1.o$c */
    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a */
        private final String[] f26722a;

        public c(String[] tables) {
            C9322n.m27781e(tables, "tables");
            this.f26722a = tables;
        }

        /* renamed from: a */
        public final String[] m32218a() {
            return this.f26722a;
        }

        /* renamed from: b */
        public boolean mo32219b() {
            return false;
        }

        /* renamed from: c */
        public abstract void mo32108c(Set<String> set);
    }

    /* renamed from: r1.o$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        private final c f26723a;

        /* renamed from: b */
        private final int[] f26724b;

        /* renamed from: c */
        private final String[] f26725c;

        /* renamed from: d */
        private final Set<String> f26726d;

        public d(c observer, int[] tableIds, String[] tableNames) {
            C9322n.m27781e(observer, "observer");
            C9322n.m27781e(tableIds, "tableIds");
            C9322n.m27781e(tableNames, "tableNames");
            this.f26723a = observer;
            this.f26724b = tableIds;
            this.f26725c = tableNames;
            this.f26726d = (tableNames.length == 0) ^ true ? C7028p0.m20567d(tableNames[0]) : C7030q0.m20573e();
            if (!(tableIds.length == tableNames.length)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }

        /* renamed from: a */
        public final int[] m32220a() {
            return this.f26724b;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m32221b(java.util.Set<java.lang.Integer> r9) {
            /*
                r8 = this;
                java.lang.String r0 = "invalidatedTablesIds"
                kotlin.jvm.internal.C9322n.m27781e(r9, r0)
                int[] r0 = r8.f26724b
                int r1 = r0.length
                r2 = 1
                if (r1 == 0) goto L45
                r3 = 0
                if (r1 == r2) goto L36
                java.util.Set r0 = dk.C7026o0.m20509b()
                int[] r1 = r8.f26724b
                int r4 = r1.length
                r5 = r3
            L16:
                if (r3 >= r4) goto L31
                r6 = r1[r3]
                int r7 = r5 + 1
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                boolean r6 = r9.contains(r6)
                if (r6 == 0) goto L2d
                java.lang.String[] r6 = r8.f26725c
                r5 = r6[r5]
                r0.add(r5)
            L2d:
                int r3 = r3 + 1
                r5 = r7
                goto L16
            L31:
                java.util.Set r9 = dk.C7026o0.m20508a(r0)
                goto L49
            L36:
                r0 = r0[r3]
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                boolean r9 = r9.contains(r0)
                if (r9 == 0) goto L45
                java.util.Set<java.lang.String> r9 = r8.f26726d
                goto L49
            L45:
                java.util.Set r9 = dk.C7026o0.m20512e()
            L49:
                r0 = r9
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r0 = r0.isEmpty()
                r0 = r0 ^ r2
                if (r0 == 0) goto L58
                r1.o$c r0 = r8.f26723a
                r0.mo32108c(r9)
            L58:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p322r1.C10598o.d.m32221b(java.util.Set):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m32222c(java.lang.String[] r12) {
            /*
                r11 = this;
                java.lang.String r0 = "tables"
                kotlin.jvm.internal.C9322n.m27781e(r12, r0)
                java.lang.String[] r0 = r11.f26725c
                int r0 = r0.length
                r1 = 1
                if (r0 == 0) goto L4e
                r2 = 0
                if (r0 == r1) goto L34
                java.util.Set r0 = dk.C7026o0.m20509b()
                int r3 = r12.length
                r4 = r2
            L14:
                if (r4 >= r3) goto L2f
                r5 = r12[r4]
                java.lang.String[] r6 = r11.f26725c
                int r7 = r6.length
                r8 = r2
            L1c:
                if (r8 >= r7) goto L2c
                r9 = r6[r8]
                boolean r10 = p450xk.C12515g.m41005r(r9, r5, r1)
                if (r10 == 0) goto L29
                r0.add(r9)
            L29:
                int r8 = r8 + 1
                goto L1c
            L2c:
                int r4 = r4 + 1
                goto L14
            L2f:
                java.util.Set r12 = dk.C7026o0.m20508a(r0)
                goto L52
            L34:
                int r0 = r12.length
                r3 = r2
            L36:
                if (r3 >= r0) goto L49
                r4 = r12[r3]
                java.lang.String[] r5 = r11.f26725c
                r5 = r5[r2]
                boolean r4 = p450xk.C12515g.m41005r(r4, r5, r1)
                if (r4 == 0) goto L46
                r2 = r1
                goto L49
            L46:
                int r3 = r3 + 1
                goto L36
            L49:
                if (r2 == 0) goto L4e
                java.util.Set<java.lang.String> r12 = r11.f26726d
                goto L52
            L4e:
                java.util.Set r12 = dk.C7026o0.m20512e()
            L52:
                r0 = r12
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r0 = r0.isEmpty()
                r0 = r0 ^ r1
                if (r0 == 0) goto L61
                r1.o$c r0 = r11.f26723a
                r0.mo32108c(r12)
            L61:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p322r1.C10598o.d.m32222c(java.lang.String[]):void");
        }
    }

    /* renamed from: r1.o$e */
    /* loaded from: classes.dex */
    public static final class e extends c {

        /* renamed from: b */
        private final C10598o f26727b;

        /* renamed from: c */
        private final WeakReference<c> f26728c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C10598o tracker, c delegate) {
            super(delegate.m32218a());
            C9322n.m27781e(tracker, "tracker");
            C9322n.m27781e(delegate, "delegate");
            this.f26727b = tracker;
            this.f26728c = new WeakReference<>(delegate);
        }

        @Override // p322r1.C10598o.c
        /* renamed from: c */
        public void mo32108c(Set<String> tables) {
            C9322n.m27781e(tables, "tables");
            c cVar = this.f26728c.get();
            if (cVar == null) {
                this.f26727b.m32207o(this);
            } else {
                cVar.mo32108c(tables);
            }
        }
    }

    /* renamed from: r1.o$f */
    /* loaded from: classes.dex */
    public static final class f implements Runnable {
        f() {
        }

        /* renamed from: a */
        private final Set<Integer> m32223a() {
            Set m20565b;
            Set<Integer> m20564a;
            C10598o c10598o = C10598o.this;
            m20565b = C7028p0.m20565b();
            Cursor m32248z = AbstractC10604u.m32248z(c10598o.m32199g(), new C11602a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null, 2, null);
            while (m32248z.moveToNext()) {
                try {
                    m20565b.add(Integer.valueOf(m32248z.getInt(0)));
                } finally {
                }
            }
            C2037v c2037v = C2037v.f8089a;
            C9602b.m28593a(m32248z, null);
            m20564a = C7028p0.m20564a(m20565b);
            if (!m20564a.isEmpty()) {
                if (C10598o.this.m32198f() == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                InterfaceC11614m m32198f = C10598o.this.m32198f();
                if (m32198f == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                m32198f.mo32164z();
            }
            return m20564a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
        
            if (r0 != null) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
        
            r0.m32120e();
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00c5, code lost:
        
            if ((!r3.isEmpty()) == false) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00c7, code lost:
        
            r0 = r5.f26729a.m32200h();
            r1 = r5.f26729a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00cf, code lost:
        
            monitor-enter(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00d0, code lost:
        
            r1 = r1.m32200h().iterator();
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00dc, code lost:
        
            if (r1.hasNext() == false) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00de, code lost:
        
            ((p322r1.C10598o.d) ((java.util.Map.Entry) r1.next()).getValue()).m32221b(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00ee, code lost:
        
            r1 = ck.C2037v.f8089a;
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
            throw new UnsupportedOperationException("Method not decompiled: p322r1.C10598o.f.run():void");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10598o(AbstractC10604u database, Map<String, String> shadowTablesMap, Map<String, Set<String>> viewTables, String... tableNames) {
        Object m20422i;
        String str;
        C9322n.m27781e(database, "database");
        C9322n.m27781e(shadowTablesMap, "shadowTablesMap");
        C9322n.m27781e(viewTables, "viewTables");
        C9322n.m27781e(tableNames, "tableNames");
        this.f26701a = database;
        this.f26702b = shadowTablesMap;
        this.f26703c = viewTables;
        this.f26707g = new AtomicBoolean(false);
        this.f26710j = new b(tableNames.length);
        this.f26711k = new C10596m(database);
        this.f26712l = new C9336b<>();
        this.f26714n = new Object();
        this.f26715o = new Object();
        this.f26704d = new LinkedHashMap();
        int length = tableNames.length;
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str2 = tableNames[i10];
            Locale US = Locale.US;
            C9322n.m27780d(US, "US");
            String lowerCase = str2.toLowerCase(US);
            C9322n.m27780d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.f26704d.put(lowerCase, Integer.valueOf(i10));
            String str3 = this.f26702b.get(tableNames[i10]);
            if (str3 != null) {
                C9322n.m27780d(US, "US");
                str = str3.toLowerCase(US);
                C9322n.m27780d(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr[i10] = lowerCase;
        }
        this.f26705e = strArr;
        for (Map.Entry<String, String> entry : this.f26702b.entrySet()) {
            String value = entry.getValue();
            Locale US2 = Locale.US;
            C9322n.m27780d(US2, "US");
            String lowerCase2 = value.toLowerCase(US2);
            C9322n.m27780d(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f26704d.containsKey(lowerCase2)) {
                String key = entry.getKey();
                C9322n.m27780d(US2, "US");
                String lowerCase3 = key.toLowerCase(US2);
                C9322n.m27780d(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                Map<String, Integer> map = this.f26704d;
                m20422i = C7018k0.m20422i(map, lowerCase2);
                map.put(lowerCase3, m20422i);
            }
        }
        this.f26716p = new f();
    }

    /* renamed from: p */
    private final String[] m32190p(String[] strArr) {
        Set m20565b;
        Set m20564a;
        m20565b = C7028p0.m20565b();
        for (String str : strArr) {
            Map<String, Set<String>> map = this.f26703c;
            Locale US = Locale.US;
            C9322n.m27780d(US, "US");
            String lowerCase = str.toLowerCase(US);
            C9322n.m27780d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                Map<String, Set<String>> map2 = this.f26703c;
                C9322n.m27780d(US, "US");
                String lowerCase2 = str.toLowerCase(US);
                C9322n.m27780d(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Set<String> set = map2.get(lowerCase2);
                C9322n.m27778b(set);
                m20565b.addAll(set);
            } else {
                m20565b.add(str);
            }
        }
        m20564a = C7028p0.m20564a(m20565b);
        Object[] array = m20564a.toArray(new String[0]);
        C9322n.m27779c(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    /* renamed from: s */
    private final void m32191s(InterfaceC11610i interfaceC11610i, int i10) {
        interfaceC11610i.mo32144x("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)");
        String str = this.f26705e[i10];
        for (String str2 : f26700r) {
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + f26699q.m32213b(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i10 + " AND invalidated = 0; END";
            C9322n.m27780d(str3, "StringBuilder().apply(builderAction).toString()");
            interfaceC11610i.mo32144x(str3);
        }
    }

    /* renamed from: t */
    private final void m32192t(InterfaceC11610i interfaceC11610i, int i10) {
        String str = this.f26705e[i10];
        for (String str2 : f26700r) {
            String str3 = "DROP TRIGGER IF EXISTS " + f26699q.m32213b(str, str2);
            C9322n.m27780d(str3, "StringBuilder().apply(builderAction).toString()");
            interfaceC11610i.mo32144x(str3);
        }
    }

    /* renamed from: w */
    private final String[] m32193w(String[] strArr) {
        String[] m32190p = m32190p(strArr);
        for (String str : m32190p) {
            Map<String, Integer> map = this.f26704d;
            Locale US = Locale.US;
            C9322n.m27780d(US, "US");
            String lowerCase = str.toLowerCase(US);
            C9322n.m27780d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!map.containsKey(lowerCase)) {
                throw new IllegalArgumentException(("There is no table with name " + str).toString());
            }
        }
        return m32190p;
    }

    /* renamed from: b */
    public void m32194b(c observer) {
        int[] m20629e0;
        d mo27811l;
        C9322n.m27781e(observer, "observer");
        String[] m32190p = m32190p(observer.m32218a());
        ArrayList arrayList = new ArrayList(m32190p.length);
        for (String str : m32190p) {
            Map<String, Integer> map = this.f26704d;
            Locale US = Locale.US;
            C9322n.m27780d(US, "US");
            String lowerCase = str.toLowerCase(US);
            C9322n.m27780d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = map.get(lowerCase);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
            arrayList.add(Integer.valueOf(num.intValue()));
        }
        m20629e0 = C7042z.m20629e0(arrayList);
        d dVar = new d(observer, m20629e0, m32190p);
        synchronized (this.f26712l) {
            mo27811l = this.f26712l.mo27811l(observer, dVar);
        }
        if (mo27811l == null && this.f26710j.m32215b(Arrays.copyOf(m20629e0, m20629e0.length))) {
            m32210u();
        }
    }

    /* renamed from: c */
    public void m32195c(c observer) {
        C9322n.m27781e(observer, "observer");
        m32194b(new e(this, observer));
    }

    /* renamed from: d */
    public <T> LiveData<T> m32196d(String[] tableNames, boolean z10, Callable<T> computeFunction) {
        C9322n.m27781e(tableNames, "tableNames");
        C9322n.m27781e(computeFunction, "computeFunction");
        return this.f26711k.m32186a(m32193w(tableNames), z10, computeFunction);
    }

    /* renamed from: e */
    public final boolean m32197e() {
        if (!this.f26701a.m32265x()) {
            return false;
        }
        if (!this.f26708h) {
            this.f26701a.m32258m().mo32112Q0();
        }
        if (this.f26708h) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    /* renamed from: f */
    public final InterfaceC11614m m32198f() {
        return this.f26709i;
    }

    /* renamed from: g */
    public final AbstractC10604u m32199g() {
        return this.f26701a;
    }

    /* renamed from: h */
    public final C9336b<c, d> m32200h() {
        return this.f26712l;
    }

    /* renamed from: i */
    public final AtomicBoolean m32201i() {
        return this.f26707g;
    }

    /* renamed from: j */
    public final Map<String, Integer> m32202j() {
        return this.f26704d;
    }

    /* renamed from: k */
    public final void m32203k(InterfaceC11610i database) {
        C9322n.m27781e(database, "database");
        synchronized (this.f26715o) {
            if (this.f26708h) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            database.mo32144x("PRAGMA temp_store = MEMORY;");
            database.mo32144x("PRAGMA recursive_triggers='ON';");
            database.mo32144x("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            m32211v(database);
            this.f26709i = database.mo32129C0("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            this.f26708h = true;
            C2037v c2037v = C2037v.f8089a;
        }
    }

    /* renamed from: l */
    public final void m32204l(String... tables) {
        C9322n.m27781e(tables, "tables");
        synchronized (this.f26712l) {
            Iterator<Map.Entry<K, V>> it = this.f26712l.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                C9322n.m27780d(entry, "(observer, wrapper)");
                c cVar = (c) entry.getKey();
                d dVar = (d) entry.getValue();
                if (!cVar.mo32219b()) {
                    dVar.m32222c(tables);
                }
            }
            C2037v c2037v = C2037v.f8089a;
        }
    }

    /* renamed from: m */
    public final void m32205m() {
        synchronized (this.f26715o) {
            this.f26708h = false;
            this.f26710j.m32217d();
            C2037v c2037v = C2037v.f8089a;
        }
    }

    /* renamed from: n */
    public void m32206n() {
        if (this.f26707g.compareAndSet(false, true)) {
            C10582c c10582c = this.f26706f;
            if (c10582c != null) {
                c10582c.m32124j();
            }
            this.f26701a.m32259n().execute(this.f26716p);
        }
    }

    /* renamed from: o */
    public void m32207o(c observer) {
        d mo27812m;
        C9322n.m27781e(observer, "observer");
        synchronized (this.f26712l) {
            mo27812m = this.f26712l.mo27812m(observer);
        }
        if (mo27812m != null) {
            b bVar = this.f26710j;
            int[] m32220a = mo27812m.m32220a();
            if (bVar.m32216c(Arrays.copyOf(m32220a, m32220a.length))) {
                m32210u();
            }
        }
    }

    /* renamed from: q */
    public final void m32208q(C10582c autoCloser) {
        C9322n.m27781e(autoCloser, "autoCloser");
        this.f26706f = autoCloser;
        autoCloser.m32127m(new Runnable() { // from class: r1.n
            @Override // java.lang.Runnable
            public final void run() {
                C10598o.this.m32205m();
            }
        });
    }

    /* renamed from: r */
    public final void m32209r(Context context, String name, Intent serviceIntent) {
        C9322n.m27781e(context, "context");
        C9322n.m27781e(name, "name");
        C9322n.m27781e(serviceIntent, "serviceIntent");
        this.f26713m = new C10601r(context, name, serviceIntent, this, this.f26701a.m32259n());
    }

    /* renamed from: u */
    public final void m32210u() {
        if (this.f26701a.m32265x()) {
            m32211v(this.f26701a.m32258m().mo32112Q0());
        }
    }

    /* renamed from: v */
    public final void m32211v(InterfaceC11610i database) {
        C9322n.m27781e(database, "database");
        if (database.mo32140i1()) {
            return;
        }
        try {
            Lock m32256k = this.f26701a.m32256k();
            m32256k.lock();
            try {
                synchronized (this.f26714n) {
                    int[] m32214a = this.f26710j.m32214a();
                    if (m32214a == null) {
                        return;
                    }
                    f26699q.m32212a(database);
                    try {
                        int length = m32214a.length;
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < length) {
                            int i12 = m32214a[i10];
                            int i13 = i11 + 1;
                            if (i12 == 1) {
                                m32191s(database, i11);
                            } else if (i12 == 2) {
                                m32192t(database, i11);
                            }
                            i10++;
                            i11 = i13;
                        }
                        database.mo32131M();
                        database.mo32136X();
                        C2037v c2037v = C2037v.f8089a;
                    } catch (Throwable th2) {
                        database.mo32136X();
                        throw th2;
                    }
                }
            } finally {
                m32256k.unlock();
            }
        } catch (SQLiteException | IllegalStateException e10) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
        }
    }
}

package yh;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.Build;
import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class i {

    /* renamed from: n */
    private static Boolean f31911n;

    /* renamed from: a */
    final boolean f31912a;

    /* renamed from: b */
    final String f31913b;

    /* renamed from: c */
    final int f31914c;

    /* renamed from: d */
    final int f31915d;

    /* renamed from: e */
    final Context f31916e;

    /* renamed from: h */
    public n f31919h;

    /* renamed from: i */
    SQLiteDatabase f31920i;

    /* renamed from: l */
    private Integer f31923l;

    /* renamed from: f */
    final List<ai.g> f31917f = new ArrayList();

    /* renamed from: g */
    final Map<Integer, s> f31918g = new HashMap();

    /* renamed from: j */
    private int f31921j = 0;

    /* renamed from: k */
    private int f31922k = 0;

    /* renamed from: m */
    private int f31924m = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements DatabaseErrorHandler {
        a() {
        }

        @Override // android.database.DatabaseErrorHandler
        public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        }
    }

    public i(Context context, String str, int i10, boolean z10, int i11) {
        this.f31916e = context;
        this.f31913b = str;
        this.f31912a = z10;
        this.f31914c = i10;
        this.f31915d = i11;
    }

    public static /* synthetic */ Cursor G(c0 c0Var, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        c0Var.a(sQLiteQuery);
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    public /* synthetic */ void H(ai.e eVar) {
        Boolean d10 = eVar.d();
        boolean z10 = Boolean.TRUE.equals(d10) && eVar.b();
        if (z10) {
            int i10 = this.f31922k + 1;
            this.f31922k = i10;
            this.f31923l = Integer.valueOf(i10);
        }
        if (!w(eVar)) {
            if (z10) {
                this.f31923l = null;
            }
        } else if (z10) {
            HashMap hashMap = new HashMap();
            hashMap.put("transactionId", this.f31923l);
            eVar.success(hashMap);
        } else {
            if (Boolean.FALSE.equals(d10)) {
                this.f31923l = null;
            }
            eVar.success(null);
        }
    }

    public void Q() {
        while (!this.f31917f.isEmpty() && this.f31923l == null) {
            this.f31917f.get(0).a();
            this.f31917f.remove(0);
        }
    }

    private void S(ai.e eVar, Runnable runnable) {
        Integer g10 = eVar.g();
        Integer num = this.f31923l;
        if (num == null) {
            runnable.run();
            return;
        }
        if (g10 == null || !(g10.equals(num) || g10.intValue() == -1)) {
            this.f31917f.add(new ai.g(eVar, runnable));
            return;
        }
        runnable.run();
        if (this.f31923l != null || this.f31917f.isEmpty()) {
            return;
        }
        this.f31919h.c(this, new Runnable() { // from class: yh.h
            public /* synthetic */ h() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                i.this.Q();
            }
        });
    }

    protected static boolean i(Context context, String str, boolean z10) {
        try {
            String packageName = context.getPackageName();
            return (Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getApplicationInfo(packageName, PackageManager.ApplicationInfoFlags.of(128L)) : y(context, packageName, RecognitionOptions.ITF)).metaData.getBoolean(str, z10);
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    protected static boolean j(Context context) {
        return i(context, "com.tekartik.sqflite.wal_enabled", false);
    }

    private void l(int i10) {
        s sVar = this.f31918g.get(Integer.valueOf(i10));
        if (sVar != null) {
            m(sVar);
        }
    }

    private void m(s sVar) {
        try {
            int i10 = sVar.f31951a;
            if (q.c(this.f31915d)) {
                Log.d("Sqflite", A() + "closing cursor " + i10);
            }
            this.f31918g.remove(Integer.valueOf(i10));
            sVar.f31953c.close();
        } catch (Exception unused) {
        }
    }

    private Map<String, Object> n(Cursor cursor, Integer num) {
        HashMap hashMap = null;
        int i10 = 0;
        ArrayList arrayList = null;
        while (cursor.moveToNext()) {
            if (hashMap == null) {
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap2 = new HashMap();
                i10 = cursor.getColumnCount();
                hashMap2.put("columns", Arrays.asList(cursor.getColumnNames()));
                hashMap2.put("rows", arrayList2);
                arrayList = arrayList2;
                hashMap = hashMap2;
            }
            arrayList.add(d0.a(cursor, i10));
            if (num != null && arrayList.size() >= num.intValue()) {
                break;
            }
        }
        return hashMap == null ? new HashMap() : hashMap;
    }

    public static void o(String str) {
        SQLiteDatabase.deleteDatabase(new File(str));
    }

    private boolean p(ai.e eVar) {
        if (!w(eVar)) {
            return false;
        }
        eVar.success(null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cf  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean I(ai.e r10) {
        /*
            r9 = this;
            boolean r0 = r9.w(r10)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r0 = r10.f()
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L14
            r10.success(r2)
            return r3
        L14:
            java.lang.String r0 = "SELECT changes(), last_insert_rowid()"
            android.database.sqlite.SQLiteDatabase r4 = r9.C()     // Catch: java.lang.Throwable -> Lbc java.lang.Exception -> Lbe
            android.database.Cursor r0 = r4.rawQuery(r0, r2)     // Catch: java.lang.Throwable -> Lbc java.lang.Exception -> Lbe
            java.lang.String r4 = "Sqflite"
            if (r0 == 0) goto L9b
            int r5 = r0.getCount()     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            if (r5 <= 0) goto L9b
            boolean r5 = r0.moveToFirst()     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            if (r5 == 0) goto L9b
            int r5 = r0.getInt(r1)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            if (r5 != 0) goto L67
            int r5 = r9.f31915d     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            boolean r5 = yh.q.b(r5)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            if (r5 == 0) goto L60
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            r5.<init>()     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            java.lang.String r6 = r9.A()     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            r5.append(r6)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            java.lang.String r6 = "no changes (id was "
            r5.append(r6)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            long r6 = r0.getLong(r3)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            r5.append(r6)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            android.util.Log.d(r4, r5)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
        L60:
            r10.success(r2)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            r0.close()
            return r3
        L67:
            long r5 = r0.getLong(r3)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            int r2 = r9.f31915d     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            boolean r2 = yh.q.b(r2)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            if (r2 == 0) goto L8e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            r2.<init>()     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            java.lang.String r7 = r9.A()     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            r2.append(r7)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            java.lang.String r7 = "inserted "
            r2.append(r7)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            r2.append(r5)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            android.util.Log.d(r4, r2)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
        L8e:
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            r10.success(r2)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            r0.close()
            return r3
        L99:
            r2 = move-exception
            goto Lc2
        L9b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            r5.<init>()     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            java.lang.String r6 = r9.A()     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            r5.append(r6)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            java.lang.String r6 = "fail to read changes for Insert"
            r5.append(r6)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            android.util.Log.e(r4, r5)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            r10.success(r2)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            if (r0 == 0) goto Lbb
            r0.close()
        Lbb:
            return r3
        Lbc:
            r10 = move-exception
            goto Lcd
        Lbe:
            r0 = move-exception
            r8 = r2
            r2 = r0
            r0 = r8
        Lc2:
            r9.D(r2, r10)     // Catch: java.lang.Throwable -> Lcb
            if (r0 == 0) goto Lca
            r0.close()
        Lca:
            return r1
        Lcb:
            r10 = move-exception
            r2 = r0
        Lcd:
            if (r2 == 0) goto Ld2
            r2.close()
        Ld2:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: yh.i.I(ai.e):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [ai.e, ai.f] */
    /* JADX WARN: Type inference failed for: r1v0, types: [yh.c0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r9v0, types: [yh.i] */
    /* renamed from: r */
    public boolean J(ai.e eVar) {
        Integer num = (Integer) eVar.a("cursorPageSize");
        ?? e10 = eVar.e();
        if (q.b(this.f31915d)) {
            Log.d("Sqflite", A() + e10);
        }
        s sVar = null;
        try {
            try {
                e10 = z().rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: yh.f
                    public /* synthetic */ f() {
                    }

                    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                        Cursor G;
                        G = i.G(c0.this, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                        return G;
                    }
                }, e10.c(), yh.a.f31874a, null);
                try {
                    Map<String, Object> n10 = n(e10, num);
                    if ((num == null || e10.isLast() || e10.isAfterLast()) ? false : true) {
                        int i10 = this.f31924m + 1;
                        this.f31924m = i10;
                        n10.put("cursorId", Integer.valueOf(i10));
                        s sVar2 = new s(i10, num.intValue(), e10);
                        try {
                            this.f31918g.put(Integer.valueOf(i10), sVar2);
                            sVar = sVar2;
                        } catch (Exception e11) {
                            e = e11;
                            sVar = sVar2;
                            D(e, eVar);
                            if (sVar != null) {
                                m(sVar);
                            }
                            if (sVar == null && e10 != 0) {
                                e10.close();
                            }
                            return false;
                        } catch (Throwable th2) {
                            th = th2;
                            sVar = sVar2;
                            if (sVar == null && e10 != 0) {
                                e10.close();
                            }
                            throw th;
                        }
                    }
                    eVar.success(n10);
                    if (sVar == null && e10 != 0) {
                        e10.close();
                    }
                    return true;
                } catch (Exception e12) {
                    e = e12;
                }
            } catch (Exception e13) {
                e = e13;
                e10 = 0;
            } catch (Throwable th3) {
                th = th3;
                e10 = 0;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* renamed from: s */
    public boolean K(ai.e eVar) {
        boolean z10;
        int intValue = ((Integer) eVar.a("cursorId")).intValue();
        boolean equals = Boolean.TRUE.equals(eVar.a("cancel"));
        if (q.c(this.f31915d)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(A());
            sb2.append("cursor ");
            sb2.append(intValue);
            sb2.append(equals ? " cancel" : " next");
            Log.d("Sqflite", sb2.toString());
        }
        s sVar = null;
        if (equals) {
            l(intValue);
            eVar.success(null);
            return true;
        }
        s sVar2 = this.f31918g.get(Integer.valueOf(intValue));
        boolean z11 = false;
        try {
            if (sVar2 == null) {
                throw new IllegalStateException("Cursor " + intValue + " not found");
            }
            Cursor cursor = sVar2.f31953c;
            Map<String, Object> n10 = n(cursor, Integer.valueOf(sVar2.f31952b));
            z10 = (cursor.isLast() || cursor.isAfterLast()) ? false : true;
            if (z10) {
                try {
                    try {
                        n10.put("cursorId", Integer.valueOf(intValue));
                    } catch (Throwable th2) {
                        th = th2;
                        z11 = z10;
                        if (!z11 && sVar2 != null) {
                            m(sVar2);
                        }
                        throw th;
                    }
                } catch (Exception e10) {
                    e = e10;
                    D(e, eVar);
                    if (sVar2 != null) {
                        m(sVar2);
                    } else {
                        sVar = sVar2;
                    }
                    if (!z10 && sVar != null) {
                        m(sVar);
                    }
                    return false;
                }
            }
            eVar.success(n10);
            if (!z10) {
                m(sVar2);
            }
            return true;
        } catch (Exception e11) {
            e = e11;
            z10 = false;
        } catch (Throwable th3) {
            th = th3;
            if (!z11) {
                m(sVar2);
            }
            throw th;
        }
    }

    /* renamed from: t */
    public boolean L(ai.e eVar) {
        if (!w(eVar)) {
            return false;
        }
        Cursor cursor = null;
        if (eVar.f()) {
            eVar.success(null);
            return true;
        }
        try {
            try {
                Cursor rawQuery = C().rawQuery("SELECT changes()", null);
                if (rawQuery != null) {
                    try {
                        if (rawQuery.getCount() > 0 && rawQuery.moveToFirst()) {
                            int i10 = rawQuery.getInt(0);
                            if (q.b(this.f31915d)) {
                                Log.d("Sqflite", A() + "changed " + i10);
                            }
                            eVar.success(Integer.valueOf(i10));
                            rawQuery.close();
                            return true;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        cursor = rawQuery;
                        D(e, eVar);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = rawQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                Log.e("Sqflite", A() + "fail to read changes for Update/Delete");
                eVar.success(null);
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return true;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    private boolean w(ai.e eVar) {
        c0 e10 = eVar.e();
        if (q.b(this.f31915d)) {
            Log.d("Sqflite", A() + e10);
        }
        Boolean d10 = eVar.d();
        try {
            C().execSQL(e10.c(), e10.d());
            u(d10);
            return true;
        } catch (Exception e11) {
            D(e11, eVar);
            return false;
        }
    }

    public static boolean x(String str) {
        try {
            return new File(str).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    static ApplicationInfo y(Context context, String str, int i10) {
        return context.getPackageManager().getApplicationInfo(str, i10);
    }

    public String A() {
        return "[" + B() + "] ";
    }

    String B() {
        Thread currentThread = Thread.currentThread();
        return "" + this.f31914c + "," + currentThread.getName() + "(" + currentThread.getId() + ")";
    }

    public SQLiteDatabase C() {
        return this.f31920i;
    }

    public void D(Exception exc, ai.e eVar) {
        String message;
        Map<String, Object> a10;
        if (exc instanceof SQLiteCantOpenDatabaseException) {
            message = "open_failed " + this.f31913b;
            a10 = null;
        } else {
            boolean z10 = exc instanceof SQLException;
            message = exc.getMessage();
            a10 = ai.h.a(eVar);
        }
        eVar.error("sqlite_error", message, a10);
    }

    public void E(ai.e eVar) {
        S(eVar, new Runnable() { // from class: yh.d

            /* renamed from: b */
            public final /* synthetic */ ai.e f31904b;

            public /* synthetic */ d(ai.e eVar2) {
                r2 = eVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                i.this.I(r2);
            }
        });
    }

    public synchronized boolean F() {
        return this.f31921j > 0;
    }

    public void M() {
        if (f31911n == null) {
            Boolean valueOf = Boolean.valueOf(j(this.f31916e));
            f31911n = valueOf;
            if (valueOf.booleanValue() && q.c(this.f31915d)) {
                Log.d("Sqflite", A() + "[sqflite] WAL enabled");
            }
        }
        this.f31920i = SQLiteDatabase.openDatabase(this.f31913b, null, f31911n.booleanValue() ? 805306368 : 268435456);
    }

    public void N() {
        this.f31920i = SQLiteDatabase.openDatabase(this.f31913b, null, 1, new a());
    }

    public void O(ai.e eVar) {
        S(eVar, new Runnable() { // from class: yh.e

            /* renamed from: b */
            public final /* synthetic */ ai.e f31906b;

            public /* synthetic */ e(ai.e eVar2) {
                r2 = eVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                i.this.J(r2);
            }
        });
    }

    public void P(ai.e eVar) {
        S(eVar, new Runnable() { // from class: yh.b

            /* renamed from: b */
            public final /* synthetic */ ai.e f31879b;

            public /* synthetic */ b(ai.e eVar2) {
                r2 = eVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                i.this.K(r2);
            }
        });
    }

    public void R(ai.e eVar) {
        S(eVar, new Runnable() { // from class: yh.g

            /* renamed from: b */
            public final /* synthetic */ ai.e f31909b;

            public /* synthetic */ g(ai.e eVar2) {
                r2 = eVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                i.this.L(r2);
            }
        });
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x006b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x006e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(io.flutter.plugin.common.MethodCall r9, io.flutter.plugin.common.MethodChannel.Result r10) {
        /*
            r8 = this;
            ai.d r0 = new ai.d
            r0.<init>(r9, r10)
            boolean r9 = r0.f()
            boolean r1 = r0.i()
            java.lang.String r2 = "operations"
            java.lang.Object r0 = r0.a(r2)
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L1e:
            boolean r3 = r0.hasNext()
            r4 = 0
            if (r3 == 0) goto Lca
            java.lang.Object r3 = r0.next()
            java.util.Map r3 = (java.util.Map) r3
            ai.c r5 = new ai.c
            r5.<init>(r3, r9)
            java.lang.String r3 = r5.getMethod()
            r3.hashCode()
            int r6 = r3.hashCode()
            r7 = -1
            switch(r6) {
                case -1319569547: goto L61;
                case -1183792455: goto L56;
                case -838846263: goto L4b;
                case 107944136: goto L40;
                default: goto L3f;
            }
        L3f:
            goto L6b
        L40:
            java.lang.String r6 = "query"
            boolean r6 = r3.equals(r6)
            if (r6 != 0) goto L49
            goto L6b
        L49:
            r7 = 3
            goto L6b
        L4b:
            java.lang.String r6 = "update"
            boolean r6 = r3.equals(r6)
            if (r6 != 0) goto L54
            goto L6b
        L54:
            r7 = 2
            goto L6b
        L56:
            java.lang.String r6 = "insert"
            boolean r6 = r3.equals(r6)
            if (r6 != 0) goto L5f
            goto L6b
        L5f:
            r7 = 1
            goto L6b
        L61:
            java.lang.String r6 = "execute"
            boolean r6 = r3.equals(r6)
            if (r6 != 0) goto L6a
            goto L6b
        L6a:
            r7 = 0
        L6b:
            switch(r7) {
                case 0: goto Lb4;
                case 1: goto La6;
                case 2: goto L98;
                case 3: goto L8a;
                default: goto L6e;
            }
        L6e:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Batch method '"
            r9.append(r0)
            r9.append(r3)
            java.lang.String r0 = "' not supported"
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = "bad_param"
            r10.error(r0, r9, r4)
            return
        L8a:
            boolean r3 = r8.J(r5)
            if (r3 == 0) goto L91
            goto Lba
        L91:
            if (r1 == 0) goto L94
            goto Laf
        L94:
            r5.o(r10)
            return
        L98:
            boolean r3 = r8.L(r5)
            if (r3 == 0) goto L9f
            goto Lba
        L9f:
            if (r1 == 0) goto La2
            goto Laf
        La2:
            r5.o(r10)
            return
        La6:
            boolean r3 = r8.I(r5)
            if (r3 == 0) goto Lad
            goto Lba
        Lad:
            if (r1 == 0) goto Lb0
        Laf:
            goto Lc1
        Lb0:
            r5.o(r10)
            return
        Lb4:
            boolean r3 = r8.p(r5)
            if (r3 == 0) goto Lbf
        Lba:
            r5.q(r2)
            goto L1e
        Lbf:
            if (r1 == 0) goto Lc6
        Lc1:
            r5.p(r2)
            goto L1e
        Lc6:
            r5.o(r10)
            return
        Lca:
            if (r9 == 0) goto Ld0
            r10.success(r4)
            goto Ld3
        Ld0:
            r10.success(r2)
        Ld3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yh.i.h(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }

    public void k() {
        if (!this.f31918g.isEmpty() && q.b(this.f31915d)) {
            Log.d("Sqflite", A() + this.f31918g.size() + " cursor(s) are left opened");
        }
        this.f31920i.close();
    }

    synchronized void u(Boolean bool) {
        if (Boolean.TRUE.equals(bool)) {
            this.f31921j++;
        } else if (Boolean.FALSE.equals(bool)) {
            this.f31921j--;
        }
    }

    public void v(ai.e eVar) {
        S(eVar, new Runnable() { // from class: yh.c

            /* renamed from: b */
            public final /* synthetic */ ai.e f31900b;

            public /* synthetic */ c(ai.e eVar2) {
                r2 = eVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                i.this.H(r2);
            }
        });
    }

    public SQLiteDatabase z() {
        return this.f31920i;
    }
}

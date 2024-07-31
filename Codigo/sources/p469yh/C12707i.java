package p469yh;

import ai.C0123g;
import ai.C0124h;
import ai.InterfaceC0121e;
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

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: yh.i */
/* loaded from: classes3.dex */
public class C12707i {

    /* renamed from: n */
    private static Boolean f34447n;

    /* renamed from: a */
    final boolean f34448a;

    /* renamed from: b */
    final String f34449b;

    /* renamed from: c */
    final int f34450c;

    /* renamed from: d */
    final int f34451d;

    /* renamed from: e */
    final Context f34452e;

    /* renamed from: h */
    public InterfaceC12712n f34455h;

    /* renamed from: i */
    SQLiteDatabase f34456i;

    /* renamed from: l */
    private Integer f34459l;

    /* renamed from: f */
    final List<C0123g> f34453f = new ArrayList();

    /* renamed from: g */
    final Map<Integer, C12717s> f34454g = new HashMap();

    /* renamed from: j */
    private int f34457j = 0;

    /* renamed from: k */
    private int f34458k = 0;

    /* renamed from: m */
    private int f34460m = 0;

    /* renamed from: yh.i$a */
    /* loaded from: classes3.dex */
    class a implements DatabaseErrorHandler {
        a() {
        }

        @Override // android.database.DatabaseErrorHandler
        public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12707i(Context context, String str, int i10, boolean z10, int i11) {
        this.f34452e = context;
        this.f34449b = str;
        this.f34448a = z10;
        this.f34450c = i10;
        this.f34451d = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public static /* synthetic */ Cursor m41885G(C12700c0 c12700c0, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        c12700c0.m41877a(sQLiteQuery);
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ void m41886H(InterfaceC0121e interfaceC0121e) {
        Boolean mo560d = interfaceC0121e.mo560d();
        boolean z10 = Boolean.TRUE.equals(mo560d) && interfaceC0121e.mo559b();
        if (z10) {
            int i10 = this.f34458k + 1;
            this.f34458k = i10;
            this.f34459l = Integer.valueOf(i10);
        }
        if (!m41911w(interfaceC0121e)) {
            if (z10) {
                this.f34459l = null;
            }
        } else if (z10) {
            HashMap hashMap = new HashMap();
            hashMap.put("transactionId", this.f34459l);
            interfaceC0121e.success(hashMap);
        } else {
            if (Boolean.FALSE.equals(mo560d)) {
                this.f34459l = null;
            }
            interfaceC0121e.success(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public void m41891Q() {
        while (!this.f34453f.isEmpty() && this.f34459l == null) {
            this.f34453f.get(0).m572a();
            this.f34453f.remove(0);
        }
    }

    /* renamed from: S */
    private void m41892S(InterfaceC0121e interfaceC0121e, Runnable runnable) {
        Integer mo563g = interfaceC0121e.mo563g();
        Integer num = this.f34459l;
        if (num == null) {
            runnable.run();
            return;
        }
        if (mo563g == null || !(mo563g.equals(num) || mo563g.intValue() == -1)) {
            this.f34453f.add(new C0123g(interfaceC0121e, runnable));
            return;
        }
        runnable.run();
        if (this.f34459l != null || this.f34453f.isEmpty()) {
            return;
        }
        this.f34455h.m41944c(this, new Runnable() { // from class: yh.h
            @Override // java.lang.Runnable
            public final void run() {
                C12707i.this.m41891Q();
            }
        });
    }

    /* renamed from: i */
    protected static boolean m41900i(Context context, String str, boolean z10) {
        try {
            String packageName = context.getPackageName();
            return (Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getApplicationInfo(packageName, PackageManager.ApplicationInfoFlags.of(128L)) : m41913y(context, packageName, RecognitionOptions.ITF)).metaData.getBoolean(str, z10);
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    /* renamed from: j */
    protected static boolean m41901j(Context context) {
        return m41900i(context, "com.tekartik.sqflite.wal_enabled", false);
    }

    /* renamed from: l */
    private void m41902l(int i10) {
        C12717s c12717s = this.f34454g.get(Integer.valueOf(i10));
        if (c12717s != null) {
            m41903m(c12717s);
        }
    }

    /* renamed from: m */
    private void m41903m(C12717s c12717s) {
        try {
            int i10 = c12717s.f34487a;
            if (C12715q.m41954c(this.f34451d)) {
                Log.d("Sqflite", m41914A() + "closing cursor " + i10);
            }
            this.f34454g.remove(Integer.valueOf(i10));
            c12717s.f34489c.close();
        } catch (Exception unused) {
        }
    }

    /* renamed from: n */
    private Map<String, Object> m41904n(Cursor cursor, Integer num) {
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
            arrayList.add(C12702d0.m41881a(cursor, i10));
            if (num != null && arrayList.size() >= num.intValue()) {
                break;
            }
        }
        return hashMap == null ? new HashMap() : hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static void m41905o(String str) {
        SQLiteDatabase.deleteDatabase(new File(str));
    }

    /* renamed from: p */
    private boolean m41906p(InterfaceC0121e interfaceC0121e) {
        if (!m41911w(interfaceC0121e)) {
            return false;
        }
        interfaceC0121e.success(null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cf  */
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m41887I(ai.InterfaceC0121e r10) {
        /*
            r9 = this;
            boolean r0 = r9.m41911w(r10)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r0 = r10.mo562f()
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L14
            r10.success(r2)
            return r3
        L14:
            java.lang.String r0 = "SELECT changes(), last_insert_rowid()"
            android.database.sqlite.SQLiteDatabase r4 = r9.m41916C()     // Catch: java.lang.Throwable -> Lbc java.lang.Exception -> Lbe
            android.database.Cursor r0 = r4.rawQuery(r0, r2)     // Catch: java.lang.Throwable -> Lbc java.lang.Exception -> Lbe
            java.lang.String r4 = "Sqflite"
            if (r0 == 0) goto L9b
            int r5 = r0.getCount()     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            if (r5 <= 0) goto L9b
            boolean r5 = r0.moveToFirst()     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            if (r5 == 0) goto L9b
            int r5 = r0.getInt(r1)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            if (r5 != 0) goto L67
            int r5 = r9.f34451d     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            boolean r5 = p469yh.C12715q.m41953b(r5)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            if (r5 == 0) goto L60
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            r5.<init>()     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            java.lang.String r6 = r9.m41914A()     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
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
            int r2 = r9.f34451d     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            boolean r2 = p469yh.C12715q.m41953b(r2)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            if (r2 == 0) goto L8e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            r2.<init>()     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            java.lang.String r7 = r9.m41914A()     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
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
            java.lang.String r6 = r9.m41914A()     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
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
            r9.m41917D(r2, r10)     // Catch: java.lang.Throwable -> Lcb
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
        throw new UnsupportedOperationException("Method not decompiled: p469yh.C12707i.m41887I(ai.e):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
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
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public boolean m41888J(InterfaceC0121e interfaceC0121e) {
        Integer num = (Integer) interfaceC0121e.mo565a("cursorPageSize");
        final ?? mo561e = interfaceC0121e.mo561e();
        if (C12715q.m41953b(this.f34451d)) {
            Log.d("Sqflite", m41914A() + mo561e);
        }
        C12717s c12717s = null;
        try {
            try {
                mo561e = m41929z().rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: yh.f
                    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                        Cursor m41885G;
                        m41885G = C12707i.m41885G(C12700c0.this, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                        return m41885G;
                    }
                }, mo561e.m41879c(), C12695a.f34410a, null);
                try {
                    Map<String, Object> m41904n = m41904n(mo561e, num);
                    if ((num == null || mo561e.isLast() || mo561e.isAfterLast()) ? false : true) {
                        int i10 = this.f34460m + 1;
                        this.f34460m = i10;
                        m41904n.put("cursorId", Integer.valueOf(i10));
                        C12717s c12717s2 = new C12717s(i10, num.intValue(), mo561e);
                        try {
                            this.f34454g.put(Integer.valueOf(i10), c12717s2);
                            c12717s = c12717s2;
                        } catch (Exception e10) {
                            e = e10;
                            c12717s = c12717s2;
                            m41917D(e, interfaceC0121e);
                            if (c12717s != null) {
                                m41903m(c12717s);
                            }
                            if (c12717s == null && mo561e != 0) {
                                mo561e.close();
                            }
                            return false;
                        } catch (Throwable th2) {
                            th = th2;
                            c12717s = c12717s2;
                            if (c12717s == null && mo561e != 0) {
                                mo561e.close();
                            }
                            throw th;
                        }
                    }
                    interfaceC0121e.success(m41904n);
                    if (c12717s == null && mo561e != 0) {
                        mo561e.close();
                    }
                    return true;
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Exception e12) {
                e = e12;
                mo561e = 0;
            } catch (Throwable th3) {
                th = th3;
                mo561e = 0;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean m41889K(InterfaceC0121e interfaceC0121e) {
        boolean z10;
        int intValue = ((Integer) interfaceC0121e.mo565a("cursorId")).intValue();
        boolean equals = Boolean.TRUE.equals(interfaceC0121e.mo565a("cancel"));
        if (C12715q.m41954c(this.f34451d)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m41914A());
            sb2.append("cursor ");
            sb2.append(intValue);
            sb2.append(equals ? " cancel" : " next");
            Log.d("Sqflite", sb2.toString());
        }
        C12717s c12717s = null;
        if (equals) {
            m41902l(intValue);
            interfaceC0121e.success(null);
            return true;
        }
        C12717s c12717s2 = this.f34454g.get(Integer.valueOf(intValue));
        boolean z11 = false;
        try {
            if (c12717s2 == null) {
                throw new IllegalStateException("Cursor " + intValue + " not found");
            }
            Cursor cursor = c12717s2.f34489c;
            Map<String, Object> m41904n = m41904n(cursor, Integer.valueOf(c12717s2.f34488b));
            z10 = (cursor.isLast() || cursor.isAfterLast()) ? false : true;
            if (z10) {
                try {
                    try {
                        m41904n.put("cursorId", Integer.valueOf(intValue));
                    } catch (Throwable th2) {
                        th = th2;
                        z11 = z10;
                        if (!z11 && c12717s2 != null) {
                            m41903m(c12717s2);
                        }
                        throw th;
                    }
                } catch (Exception e10) {
                    e = e10;
                    m41917D(e, interfaceC0121e);
                    if (c12717s2 != null) {
                        m41903m(c12717s2);
                    } else {
                        c12717s = c12717s2;
                    }
                    if (!z10 && c12717s != null) {
                        m41903m(c12717s);
                    }
                    return false;
                }
            }
            interfaceC0121e.success(m41904n);
            if (!z10) {
                m41903m(c12717s2);
            }
            return true;
        } catch (Exception e11) {
            e = e11;
            z10 = false;
        } catch (Throwable th3) {
            th = th3;
            if (!z11) {
                m41903m(c12717s2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public boolean m41890L(InterfaceC0121e interfaceC0121e) {
        if (!m41911w(interfaceC0121e)) {
            return false;
        }
        Cursor cursor = null;
        if (interfaceC0121e.mo562f()) {
            interfaceC0121e.success(null);
            return true;
        }
        try {
            try {
                Cursor rawQuery = m41916C().rawQuery("SELECT changes()", null);
                if (rawQuery != null) {
                    try {
                        if (rawQuery.getCount() > 0 && rawQuery.moveToFirst()) {
                            int i10 = rawQuery.getInt(0);
                            if (C12715q.m41953b(this.f34451d)) {
                                Log.d("Sqflite", m41914A() + "changed " + i10);
                            }
                            interfaceC0121e.success(Integer.valueOf(i10));
                            rawQuery.close();
                            return true;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        cursor = rawQuery;
                        m41917D(e, interfaceC0121e);
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
                Log.e("Sqflite", m41914A() + "fail to read changes for Update/Delete");
                interfaceC0121e.success(null);
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

    /* renamed from: w */
    private boolean m41911w(InterfaceC0121e interfaceC0121e) {
        C12700c0 mo561e = interfaceC0121e.mo561e();
        if (C12715q.m41953b(this.f34451d)) {
            Log.d("Sqflite", m41914A() + mo561e);
        }
        Boolean mo560d = interfaceC0121e.mo560d();
        try {
            m41916C().execSQL(mo561e.m41879c(), mo561e.m41880d());
            m41927u(mo560d);
            return true;
        } catch (Exception e10) {
            m41917D(e10, interfaceC0121e);
            return false;
        }
    }

    /* renamed from: x */
    public static boolean m41912x(String str) {
        try {
            return new File(str).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: y */
    static ApplicationInfo m41913y(Context context, String str, int i10) {
        return context.getPackageManager().getApplicationInfo(str, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public String m41914A() {
        return "[" + m41915B() + "] ";
    }

    /* renamed from: B */
    String m41915B() {
        Thread currentThread = Thread.currentThread();
        return "" + this.f34450c + "," + currentThread.getName() + "(" + currentThread.getId() + ")";
    }

    /* renamed from: C */
    public SQLiteDatabase m41916C() {
        return this.f34456i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public void m41917D(Exception exc, InterfaceC0121e interfaceC0121e) {
        String message;
        Map<String, Object> m573a;
        if (exc instanceof SQLiteCantOpenDatabaseException) {
            message = "open_failed " + this.f34449b;
            m573a = null;
        } else {
            boolean z10 = exc instanceof SQLException;
            message = exc.getMessage();
            m573a = C0124h.m573a(interfaceC0121e);
        }
        interfaceC0121e.error("sqlite_error", message, m573a);
    }

    /* renamed from: E */
    public void m41918E(final InterfaceC0121e interfaceC0121e) {
        m41892S(interfaceC0121e, new Runnable() { // from class: yh.d
            @Override // java.lang.Runnable
            public final void run() {
                C12707i.this.m41887I(interfaceC0121e);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public synchronized boolean m41919F() {
        return this.f34457j > 0;
    }

    /* renamed from: M */
    public void m41920M() {
        if (f34447n == null) {
            Boolean valueOf = Boolean.valueOf(m41901j(this.f34452e));
            f34447n = valueOf;
            if (valueOf.booleanValue() && C12715q.m41954c(this.f34451d)) {
                Log.d("Sqflite", m41914A() + "[sqflite] WAL enabled");
            }
        }
        this.f34456i = SQLiteDatabase.openDatabase(this.f34449b, null, f34447n.booleanValue() ? 805306368 : 268435456);
    }

    /* renamed from: N */
    public void m41921N() {
        this.f34456i = SQLiteDatabase.openDatabase(this.f34449b, null, 1, new a());
    }

    /* renamed from: O */
    public void m41922O(final InterfaceC0121e interfaceC0121e) {
        m41892S(interfaceC0121e, new Runnable() { // from class: yh.e
            @Override // java.lang.Runnable
            public final void run() {
                C12707i.this.m41888J(interfaceC0121e);
            }
        });
    }

    /* renamed from: P */
    public void m41923P(final InterfaceC0121e interfaceC0121e) {
        m41892S(interfaceC0121e, new Runnable() { // from class: yh.b
            @Override // java.lang.Runnable
            public final void run() {
                C12707i.this.m41889K(interfaceC0121e);
            }
        });
    }

    /* renamed from: R */
    public void m41924R(final InterfaceC0121e interfaceC0121e) {
        m41892S(interfaceC0121e, new Runnable() { // from class: yh.g
            @Override // java.lang.Runnable
            public final void run() {
                C12707i.this.m41890L(interfaceC0121e);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x006b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x006e A[SYNTHETIC] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m41925h(io.flutter.plugin.common.MethodCall r9, io.flutter.plugin.common.MethodChannel.Result r10) {
        /*
            r8 = this;
            ai.d r0 = new ai.d
            r0.<init>(r9, r10)
            boolean r9 = r0.mo562f()
            boolean r1 = r0.m564i()
            java.lang.String r2 = "operations"
            java.lang.Object r0 = r0.mo565a(r2)
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
            boolean r3 = r8.m41888J(r5)
            if (r3 == 0) goto L91
            goto Lba
        L91:
            if (r1 == 0) goto L94
            goto Laf
        L94:
            r5.m569o(r10)
            return
        L98:
            boolean r3 = r8.m41890L(r5)
            if (r3 == 0) goto L9f
            goto Lba
        L9f:
            if (r1 == 0) goto La2
            goto Laf
        La2:
            r5.m569o(r10)
            return
        La6:
            boolean r3 = r8.m41887I(r5)
            if (r3 == 0) goto Lad
            goto Lba
        Lad:
            if (r1 == 0) goto Lb0
        Laf:
            goto Lc1
        Lb0:
            r5.m569o(r10)
            return
        Lb4:
            boolean r3 = r8.m41906p(r5)
            if (r3 == 0) goto Lbf
        Lba:
            r5.m571q(r2)
            goto L1e
        Lbf:
            if (r1 == 0) goto Lc6
        Lc1:
            r5.m570p(r2)
            goto L1e
        Lc6:
            r5.m569o(r10)
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
        throw new UnsupportedOperationException("Method not decompiled: p469yh.C12707i.m41925h(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }

    /* renamed from: k */
    public void m41926k() {
        if (!this.f34454g.isEmpty() && C12715q.m41953b(this.f34451d)) {
            Log.d("Sqflite", m41914A() + this.f34454g.size() + " cursor(s) are left opened");
        }
        this.f34456i.close();
    }

    /* renamed from: u */
    synchronized void m41927u(Boolean bool) {
        if (Boolean.TRUE.equals(bool)) {
            this.f34457j++;
        } else if (Boolean.FALSE.equals(bool)) {
            this.f34457j--;
        }
    }

    /* renamed from: v */
    public void m41928v(final InterfaceC0121e interfaceC0121e) {
        m41892S(interfaceC0121e, new Runnable() { // from class: yh.c
            @Override // java.lang.Runnable
            public final void run() {
                C12707i.this.m41886H(interfaceC0121e);
            }
        });
    }

    /* renamed from: z */
    public SQLiteDatabase m41929z() {
        return this.f34456i;
    }
}

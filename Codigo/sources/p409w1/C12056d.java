package p409w1;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import ck.C2025j;
import ck.InterfaceC2023h;
import java.io.File;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p280ok.InterfaceC9987a;
import p391v1.C11603b;
import p391v1.C11605d;
import p391v1.InterfaceC11610i;
import p391v1.InterfaceC11611j;
import p409w1.C12056d;
import p431x1.C12265a;

/* renamed from: w1.d */
/* loaded from: classes.dex */
public final class C12056d implements InterfaceC11611j {

    /* renamed from: s */
    public static final a f32059s = new a(null);

    /* renamed from: a */
    private final Context f32060a;

    /* renamed from: b */
    private final String f32061b;

    /* renamed from: c */
    private final InterfaceC11611j.a f32062c;

    /* renamed from: d */
    private final boolean f32063d;

    /* renamed from: e */
    private final boolean f32064e;

    /* renamed from: f */
    private final InterfaceC2023h<c> f32065f;

    /* renamed from: r */
    private boolean f32066r;

    /* renamed from: w1.d$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w1.d$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private C12055c f32067a;

        public b(C12055c c12055c) {
            this.f32067a = c12055c;
        }

        /* renamed from: a */
        public final C12055c m38718a() {
            return this.f32067a;
        }

        /* renamed from: b */
        public final void m38719b(C12055c c12055c) {
            this.f32067a = c12055c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w1.d$c */
    /* loaded from: classes.dex */
    public static final class c extends SQLiteOpenHelper {

        /* renamed from: s */
        public static final C13262c f32068s = new C13262c(null);

        /* renamed from: a */
        private final Context f32069a;

        /* renamed from: b */
        private final b f32070b;

        /* renamed from: c */
        private final InterfaceC11611j.a f32071c;

        /* renamed from: d */
        private final boolean f32072d;

        /* renamed from: e */
        private boolean f32073e;

        /* renamed from: f */
        private final C12265a f32074f;

        /* renamed from: r */
        private boolean f32075r;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w1.d$c$a */
        /* loaded from: classes.dex */
        public static final class a extends RuntimeException {

            /* renamed from: a */
            private final b f32076a;

            /* renamed from: b */
            private final Throwable f32077b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b callbackName, Throwable cause) {
                super(cause);
                C9322n.m27781e(callbackName, "callbackName");
                C9322n.m27781e(cause, "cause");
                this.f32076a = callbackName;
                this.f32077b = cause;
            }

            /* renamed from: a */
            public final b m38726a() {
                return this.f32076a;
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.f32077b;
            }
        }

        /* renamed from: w1.d$c$b */
        /* loaded from: classes.dex */
        public enum b {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        /* renamed from: w1.d$c$c, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C13262c {
            private C13262c() {
            }

            public /* synthetic */ C13262c(C9315g c9315g) {
                this();
            }

            /* renamed from: a */
            public final C12055c m38728a(b refHolder, SQLiteDatabase sqLiteDatabase) {
                C9322n.m27781e(refHolder, "refHolder");
                C9322n.m27781e(sqLiteDatabase, "sqLiteDatabase");
                C12055c m38718a = refHolder.m38718a();
                if (m38718a != null && m38718a.m38709e(sqLiteDatabase)) {
                    return m38718a;
                }
                C12055c c12055c = new C12055c(sqLiteDatabase);
                refHolder.m38719b(c12055c);
                return c12055c;
            }
        }

        /* renamed from: w1.d$c$d */
        /* loaded from: classes.dex */
        public /* synthetic */ class d {

            /* renamed from: a */
            public static final /* synthetic */ int[] f32078a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.ON_CONFIGURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.ON_CREATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.ON_UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[b.ON_DOWNGRADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[b.ON_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f32078a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, String str, final b dbRef, final InterfaceC11611j.a callback, boolean z10) {
            super(context, str, null, callback.f30188a, new DatabaseErrorHandler() { // from class: w1.e
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    C12056d.c.m38721b(InterfaceC11611j.a.this, dbRef, sQLiteDatabase);
                }
            });
            C9322n.m27781e(context, "context");
            C9322n.m27781e(dbRef, "dbRef");
            C9322n.m27781e(callback, "callback");
            this.f32069a = context;
            this.f32070b = dbRef;
            this.f32071c = callback;
            this.f32072d = z10;
            if (str == null) {
                str = UUID.randomUUID().toString();
                C9322n.m27780d(str, "randomUUID().toString()");
            }
            File cacheDir = context.getCacheDir();
            C9322n.m27780d(cacheDir, "context.cacheDir");
            this.f32074f = new C12265a(str, cacheDir, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static final void m38721b(InterfaceC11611j.a callback, b dbRef, SQLiteDatabase dbObj) {
            C9322n.m27781e(callback, "$callback");
            C9322n.m27781e(dbRef, "$dbRef");
            C13262c c13262c = f32068s;
            C9322n.m27780d(dbObj, "dbObj");
            callback.m36390c(c13262c.m38728a(dbRef, dbObj));
        }

        /* renamed from: g */
        private final SQLiteDatabase m38722g(boolean z10) {
            SQLiteDatabase writableDatabase = z10 ? super.getWritableDatabase() : super.getReadableDatabase();
            C9322n.m27780d(writableDatabase, "{\n                super.…eDatabase()\n            }");
            return writableDatabase;
        }

        /* renamed from: i */
        private final SQLiteDatabase m38723i(boolean z10) {
            File parentFile;
            String databaseName = getDatabaseName();
            if (databaseName != null && (parentFile = this.f32069a.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return m38722g(z10);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return m38722g(z10);
                } catch (Throwable th2) {
                    super.close();
                    if (th2 instanceof a) {
                        a aVar = th2;
                        Throwable cause = aVar.getCause();
                        int i10 = d.f32078a[aVar.m38726a().ordinal()];
                        if (i10 == 1) {
                            throw cause;
                        }
                        if (i10 == 2) {
                            throw cause;
                        }
                        if (i10 == 3) {
                            throw cause;
                        }
                        if (i10 == 4) {
                            throw cause;
                        }
                        if (!(cause instanceof SQLiteException)) {
                            throw cause;
                        }
                    } else {
                        if (!(th2 instanceof SQLiteException)) {
                            throw th2;
                        }
                        if (databaseName == null || !this.f32072d) {
                            throw th2;
                        }
                    }
                    this.f32069a.deleteDatabase(databaseName);
                    try {
                        return m38722g(z10);
                    } catch (a e10) {
                        throw e10.getCause();
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() {
            try {
                C12265a.m39494c(this.f32074f, false, 1, null);
                super.close();
                this.f32070b.m38719b(null);
                this.f32075r = false;
            } finally {
                this.f32074f.m39496d();
            }
        }

        /* renamed from: e */
        public final InterfaceC11610i m38724e(boolean z10) {
            try {
                this.f32074f.m39495b((this.f32075r || getDatabaseName() == null) ? false : true);
                this.f32073e = false;
                SQLiteDatabase m38723i = m38723i(z10);
                if (!this.f32073e) {
                    return m38725f(m38723i);
                }
                close();
                return m38724e(z10);
            } finally {
                this.f32074f.m39496d();
            }
        }

        /* renamed from: f */
        public final C12055c m38725f(SQLiteDatabase sqLiteDatabase) {
            C9322n.m27781e(sqLiteDatabase, "sqLiteDatabase");
            return f32068s.m38728a(this.f32070b, sqLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase db2) {
            C9322n.m27781e(db2, "db");
            try {
                this.f32071c.mo32291b(m38725f(db2));
            } catch (Throwable th2) {
                throw new a(b.ON_CONFIGURE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            C9322n.m27781e(sqLiteDatabase, "sqLiteDatabase");
            try {
                this.f32071c.mo32292d(m38725f(sqLiteDatabase));
            } catch (Throwable th2) {
                throw new a(b.ON_CREATE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase db2, int i10, int i11) {
            C9322n.m27781e(db2, "db");
            this.f32073e = true;
            try {
                this.f32071c.mo32293e(m38725f(db2), i10, i11);
            } catch (Throwable th2) {
                throw new a(b.ON_DOWNGRADE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase db2) {
            C9322n.m27781e(db2, "db");
            if (!this.f32073e) {
                try {
                    this.f32071c.mo32294f(m38725f(db2));
                } catch (Throwable th2) {
                    throw new a(b.ON_OPEN, th2);
                }
            }
            this.f32075r = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i10, int i11) {
            C9322n.m27781e(sqLiteDatabase, "sqLiteDatabase");
            this.f32073e = true;
            try {
                this.f32071c.mo32295g(m38725f(sqLiteDatabase), i10, i11);
            } catch (Throwable th2) {
                throw new a(b.ON_UPGRADE, th2);
            }
        }
    }

    /* renamed from: w1.d$d */
    /* loaded from: classes.dex */
    static final class d extends AbstractC9323o implements InterfaceC9987a<c> {
        d() {
            super(0);
        }

        @Override // p280ok.InterfaceC9987a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke() {
            c cVar;
            if (C12056d.this.f32061b == null || !C12056d.this.f32063d) {
                cVar = new c(C12056d.this.f32060a, C12056d.this.f32061b, new b(null), C12056d.this.f32062c, C12056d.this.f32064e);
            } else {
                cVar = new c(C12056d.this.f32060a, new File(C11605d.m36383a(C12056d.this.f32060a), C12056d.this.f32061b).getAbsolutePath(), new b(null), C12056d.this.f32062c, C12056d.this.f32064e);
            }
            C11603b.m36380d(cVar, C12056d.this.f32066r);
            return cVar;
        }
    }

    public C12056d(Context context, String str, InterfaceC11611j.a callback, boolean z10, boolean z11) {
        InterfaceC2023h<c> m10334a;
        C9322n.m27781e(context, "context");
        C9322n.m27781e(callback, "callback");
        this.f32060a = context;
        this.f32061b = str;
        this.f32062c = callback;
        this.f32063d = z10;
        this.f32064e = z11;
        m10334a = C2025j.m10334a(new d());
        this.f32065f = m10334a;
    }

    /* renamed from: j */
    private final c m38717j() {
        return this.f32065f.getValue();
    }

    @Override // p391v1.InterfaceC11611j
    /* renamed from: Q0 */
    public InterfaceC11610i mo32112Q0() {
        return m38717j().m38724e(true);
    }

    @Override // p391v1.InterfaceC11611j, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f32065f.isInitialized()) {
            m38717j().close();
        }
    }

    @Override // p391v1.InterfaceC11611j
    public String getDatabaseName() {
        return this.f32061b;
    }

    @Override // p391v1.InterfaceC11611j
    public void setWriteAheadLoggingEnabled(boolean z10) {
        if (this.f32065f.isInitialized()) {
            C11603b.m36380d(m38717j(), z10);
        }
        this.f32066r = z10;
    }
}

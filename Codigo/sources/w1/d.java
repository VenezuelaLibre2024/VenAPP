package w1;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.io.File;
import java.util.UUID;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import v1.i;
import v1.j;
import w1.d;

/* loaded from: classes.dex */
public final class d implements j {

    /* renamed from: s, reason: collision with root package name */
    public static final a f29596s = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f29597a;

    /* renamed from: b, reason: collision with root package name */
    private final String f29598b;

    /* renamed from: c, reason: collision with root package name */
    private final j.a f29599c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f29600d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f29601e;

    /* renamed from: f, reason: collision with root package name */
    private final ck.h<c> f29602f;

    /* renamed from: r, reason: collision with root package name */
    private boolean f29603r;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private w1.c f29604a;

        public b(w1.c cVar) {
            this.f29604a = cVar;
        }

        public final w1.c a() {
            return this.f29604a;
        }

        public final void b(w1.c cVar) {
            this.f29604a = cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c extends SQLiteOpenHelper {

        /* renamed from: s, reason: collision with root package name */
        public static final C0474c f29605s = new C0474c(null);

        /* renamed from: a, reason: collision with root package name */
        private final Context f29606a;

        /* renamed from: b, reason: collision with root package name */
        private final b f29607b;

        /* renamed from: c, reason: collision with root package name */
        private final j.a f29608c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f29609d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f29610e;

        /* renamed from: f, reason: collision with root package name */
        private final x1.a f29611f;

        /* renamed from: r, reason: collision with root package name */
        private boolean f29612r;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static final class a extends RuntimeException {

            /* renamed from: a, reason: collision with root package name */
            private final b f29613a;

            /* renamed from: b, reason: collision with root package name */
            private final Throwable f29614b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b callbackName, Throwable cause) {
                super(cause);
                n.e(callbackName, "callbackName");
                n.e(cause, "cause");
                this.f29613a = callbackName;
                this.f29614b = cause;
            }

            public final b a() {
                return this.f29613a;
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.f29614b;
            }
        }

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
        public static final class C0474c {
            private C0474c() {
            }

            public /* synthetic */ C0474c(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final w1.c a(b refHolder, SQLiteDatabase sqLiteDatabase) {
                n.e(refHolder, "refHolder");
                n.e(sqLiteDatabase, "sqLiteDatabase");
                w1.c a10 = refHolder.a();
                if (a10 != null && a10.e(sqLiteDatabase)) {
                    return a10;
                }
                w1.c cVar = new w1.c(sqLiteDatabase);
                refHolder.b(cVar);
                return cVar;
            }
        }

        /* renamed from: w1.d$c$d, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public /* synthetic */ class C0475d {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f29615a;

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
                f29615a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, String str, final b dbRef, final j.a callback, boolean z10) {
            super(context, str, null, callback.f27864a, new DatabaseErrorHandler() { // from class: w1.e
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    d.c.b(j.a.this, dbRef, sQLiteDatabase);
                }
            });
            n.e(context, "context");
            n.e(dbRef, "dbRef");
            n.e(callback, "callback");
            this.f29606a = context;
            this.f29607b = dbRef;
            this.f29608c = callback;
            this.f29609d = z10;
            if (str == null) {
                str = UUID.randomUUID().toString();
                n.d(str, "randomUUID().toString()");
            }
            File cacheDir = context.getCacheDir();
            n.d(cacheDir, "context.cacheDir");
            this.f29611f = new x1.a(str, cacheDir, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(j.a callback, b dbRef, SQLiteDatabase dbObj) {
            n.e(callback, "$callback");
            n.e(dbRef, "$dbRef");
            C0474c c0474c = f29605s;
            n.d(dbObj, "dbObj");
            callback.c(c0474c.a(dbRef, dbObj));
        }

        private final SQLiteDatabase g(boolean z10) {
            SQLiteDatabase writableDatabase = z10 ? super.getWritableDatabase() : super.getReadableDatabase();
            n.d(writableDatabase, "{\n                super.…eDatabase()\n            }");
            return writableDatabase;
        }

        private final SQLiteDatabase i(boolean z10) {
            File parentFile;
            String databaseName = getDatabaseName();
            if (databaseName != null && (parentFile = this.f29606a.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return g(z10);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return g(z10);
                } catch (Throwable th2) {
                    super.close();
                    if (th2 instanceof a) {
                        a aVar = th2;
                        Throwable cause = aVar.getCause();
                        int i10 = C0475d.f29615a[aVar.a().ordinal()];
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
                        if (databaseName == null || !this.f29609d) {
                            throw th2;
                        }
                    }
                    this.f29606a.deleteDatabase(databaseName);
                    try {
                        return g(z10);
                    } catch (a e10) {
                        throw e10.getCause();
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() {
            try {
                x1.a.c(this.f29611f, false, 1, null);
                super.close();
                this.f29607b.b(null);
                this.f29612r = false;
            } finally {
                this.f29611f.d();
            }
        }

        public final i e(boolean z10) {
            try {
                this.f29611f.b((this.f29612r || getDatabaseName() == null) ? false : true);
                this.f29610e = false;
                SQLiteDatabase i10 = i(z10);
                if (!this.f29610e) {
                    return f(i10);
                }
                close();
                return e(z10);
            } finally {
                this.f29611f.d();
            }
        }

        public final w1.c f(SQLiteDatabase sqLiteDatabase) {
            n.e(sqLiteDatabase, "sqLiteDatabase");
            return f29605s.a(this.f29607b, sqLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase db2) {
            n.e(db2, "db");
            try {
                this.f29608c.b(f(db2));
            } catch (Throwable th2) {
                throw new a(b.ON_CONFIGURE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            n.e(sqLiteDatabase, "sqLiteDatabase");
            try {
                this.f29608c.d(f(sqLiteDatabase));
            } catch (Throwable th2) {
                throw new a(b.ON_CREATE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase db2, int i10, int i11) {
            n.e(db2, "db");
            this.f29610e = true;
            try {
                this.f29608c.e(f(db2), i10, i11);
            } catch (Throwable th2) {
                throw new a(b.ON_DOWNGRADE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase db2) {
            n.e(db2, "db");
            if (!this.f29610e) {
                try {
                    this.f29608c.f(f(db2));
                } catch (Throwable th2) {
                    throw new a(b.ON_OPEN, th2);
                }
            }
            this.f29612r = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i10, int i11) {
            n.e(sqLiteDatabase, "sqLiteDatabase");
            this.f29610e = true;
            try {
                this.f29608c.g(f(sqLiteDatabase), i10, i11);
            } catch (Throwable th2) {
                throw new a(b.ON_UPGRADE, th2);
            }
        }
    }

    /* renamed from: w1.d$d, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0476d extends o implements ok.a<c> {
        C0476d() {
            super(0);
        }

        @Override // ok.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke() {
            c cVar;
            if (d.this.f29598b == null || !d.this.f29600d) {
                cVar = new c(d.this.f29597a, d.this.f29598b, new b(null), d.this.f29599c, d.this.f29601e);
            } else {
                cVar = new c(d.this.f29597a, new File(v1.d.a(d.this.f29597a), d.this.f29598b).getAbsolutePath(), new b(null), d.this.f29599c, d.this.f29601e);
            }
            v1.b.d(cVar, d.this.f29603r);
            return cVar;
        }
    }

    public d(Context context, String str, j.a callback, boolean z10, boolean z11) {
        ck.h<c> a10;
        n.e(context, "context");
        n.e(callback, "callback");
        this.f29597a = context;
        this.f29598b = str;
        this.f29599c = callback;
        this.f29600d = z10;
        this.f29601e = z11;
        a10 = ck.j.a(new C0476d());
        this.f29602f = a10;
    }

    private final c j() {
        return this.f29602f.getValue();
    }

    @Override // v1.j
    public i Q0() {
        return j().e(true);
    }

    @Override // v1.j, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f29602f.isInitialized()) {
            j().close();
        }
    }

    @Override // v1.j
    public String getDatabaseName() {
        return this.f29598b;
    }

    @Override // v1.j
    public void setWriteAheadLoggingEnabled(boolean z10) {
        if (this.f29602f.isInitialized()) {
            v1.b.d(j(), z10);
        }
        this.f29603r = z10;
    }
}

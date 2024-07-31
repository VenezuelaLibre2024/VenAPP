package w1;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import java.util.List;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import ok.r;
import v1.i;
import v1.l;
import v1.m;

/* loaded from: classes.dex */
public final class c implements i {

    /* renamed from: c */
    public static final a f29590c = new a(null);

    /* renamed from: d */
    private static final String[] f29591d = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: e */
    private static final String[] f29592e = new String[0];

    /* renamed from: a */
    private final SQLiteDatabase f29593a;

    /* renamed from: b */
    private final List<Pair<String, String>> f29594b;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends o implements r<SQLiteDatabase, SQLiteCursorDriver, String, SQLiteQuery, SQLiteCursor> {

        /* renamed from: a */
        final /* synthetic */ l f29595a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(l lVar) {
            super(4);
            this.f29595a = lVar;
        }

        @Override // ok.r
        /* renamed from: a */
        public final SQLiteCursor e(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            l lVar = this.f29595a;
            n.b(sQLiteQuery);
            lVar.a(new g(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public c(SQLiteDatabase delegate) {
        n.e(delegate, "delegate");
        this.f29593a = delegate;
        this.f29594b = delegate.getAttachedDbs();
    }

    public static final Cursor f(r tmp0, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        n.e(tmp0, "$tmp0");
        return (Cursor) tmp0.e(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    public static final Cursor g(l query, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        n.e(query, "$query");
        n.b(sQLiteQuery);
        query.a(new g(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // v1.i
    public m C0(String sql) {
        n.e(sql, "sql");
        SQLiteStatement compileStatement = this.f29593a.compileStatement(sql);
        n.d(compileStatement, "delegate.compileStatement(sql)");
        return new h(compileStatement);
    }

    @Override // v1.i
    public Cursor D(l query, CancellationSignal cancellationSignal) {
        n.e(query, "query");
        SQLiteDatabase sQLiteDatabase = this.f29593a;
        String b10 = query.b();
        String[] strArr = f29592e;
        n.b(cancellationSignal);
        return v1.b.c(sQLiteDatabase, b10, strArr, null, cancellationSignal, new SQLiteDatabase.CursorFactory() { // from class: w1.a
            public /* synthetic */ a() {
            }

            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase2, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                Cursor g10;
                g10 = c.g(l.this, sQLiteDatabase2, sQLiteCursorDriver, str, sQLiteQuery);
                return g10;
            }
        });
    }

    @Override // v1.i
    public void M() {
        this.f29593a.setTransactionSuccessful();
    }

    @Override // v1.i
    public void N(String sql, Object[] bindArgs) {
        n.e(sql, "sql");
        n.e(bindArgs, "bindArgs");
        this.f29593a.execSQL(sql, bindArgs);
    }

    @Override // v1.i
    public int N0(String table, int i10, ContentValues values, String str, Object[] objArr) {
        n.e(table, "table");
        n.e(values, "values");
        int i11 = 0;
        if (!(values.size() != 0)) {
            throw new IllegalArgumentException("Empty values".toString());
        }
        int size = values.size();
        int length = objArr == null ? size : objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UPDATE ");
        sb2.append(f29591d[i10]);
        sb2.append(table);
        sb2.append(" SET ");
        for (String str2 : values.keySet()) {
            sb2.append(i11 > 0 ? "," : "");
            sb2.append(str2);
            objArr2[i11] = values.get(str2);
            sb2.append("=?");
            i11++;
        }
        if (objArr != null) {
            for (int i12 = size; i12 < length; i12++) {
                objArr2[i12] = objArr[i12 - size];
            }
        }
        if (!TextUtils.isEmpty(str)) {
            sb2.append(" WHERE ");
            sb2.append(str);
        }
        String sb3 = sb2.toString();
        n.d(sb3, "StringBuilder().apply(builderAction).toString()");
        m C0 = C0(sb3);
        v1.a.f27855c.b(C0, objArr2);
        return C0.z();
    }

    @Override // v1.i
    public void P() {
        this.f29593a.beginTransactionNonExclusive();
    }

    @Override // v1.i
    public Cursor S0(String query) {
        n.e(query, "query");
        return e0(new v1.a(query));
    }

    @Override // v1.i
    public void X() {
        this.f29593a.endTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f29593a.close();
    }

    public final boolean e(SQLiteDatabase sqLiteDatabase) {
        n.e(sqLiteDatabase, "sqLiteDatabase");
        return n.a(this.f29593a, sqLiteDatabase);
    }

    @Override // v1.i
    public Cursor e0(l query) {
        n.e(query, "query");
        Cursor rawQueryWithFactory = this.f29593a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: w1.b
            public /* synthetic */ b() {
            }

            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                Cursor f10;
                f10 = c.f(r.this, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                return f10;
            }
        }, query.b(), f29592e, null);
        n.d(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    @Override // v1.i
    public String f0() {
        return this.f29593a.getPath();
    }

    @Override // v1.i
    public boolean i1() {
        return this.f29593a.inTransaction();
    }

    @Override // v1.i
    public boolean isOpen() {
        return this.f29593a.isOpen();
    }

    @Override // v1.i
    public boolean m1() {
        return v1.b.b(this.f29593a);
    }

    @Override // v1.i
    public void t() {
        this.f29593a.beginTransaction();
    }

    @Override // v1.i
    public List<Pair<String, String>> w() {
        return this.f29594b;
    }

    @Override // v1.i
    public void x(String sql) {
        n.e(sql, "sql");
        this.f29593a.execSQL(sql);
    }
}

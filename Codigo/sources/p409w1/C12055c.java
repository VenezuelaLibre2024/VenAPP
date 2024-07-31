package p409w1;

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
import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p280ok.InterfaceC10004r;
import p391v1.C11602a;
import p391v1.C11603b;
import p391v1.InterfaceC11610i;
import p391v1.InterfaceC11613l;
import p391v1.InterfaceC11614m;

/* renamed from: w1.c */
/* loaded from: classes.dex */
public final class C12055c implements InterfaceC11610i {

    /* renamed from: c */
    public static final a f32053c = new a(null);

    /* renamed from: d */
    private static final String[] f32054d = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: e */
    private static final String[] f32055e = new String[0];

    /* renamed from: a */
    private final SQLiteDatabase f32056a;

    /* renamed from: b */
    private final List<Pair<String, String>> f32057b;

    /* renamed from: w1.c$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w1.c$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC9323o implements InterfaceC10004r<SQLiteDatabase, SQLiteCursorDriver, String, SQLiteQuery, SQLiteCursor> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC11613l f32058a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC11613l interfaceC11613l) {
            super(4);
            this.f32058a = interfaceC11613l;
        }

        @Override // p280ok.InterfaceC10004r
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SQLiteCursor mo29818e(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            InterfaceC11613l interfaceC11613l = this.f32058a;
            C9322n.m27778b(sQLiteQuery);
            interfaceC11613l.mo32299a(new C12059g(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public C12055c(SQLiteDatabase delegate) {
        C9322n.m27781e(delegate, "delegate");
        this.f32056a = delegate;
        this.f32057b = delegate.getAttachedDbs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final Cursor m38707f(InterfaceC10004r tmp0, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        C9322n.m27781e(tmp0, "$tmp0");
        return (Cursor) tmp0.mo29818e(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final Cursor m38708g(InterfaceC11613l query, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        C9322n.m27781e(query, "$query");
        C9322n.m27778b(sQLiteQuery);
        query.mo32299a(new C12059g(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // p391v1.InterfaceC11610i
    /* renamed from: C0 */
    public InterfaceC11614m mo32129C0(String sql) {
        C9322n.m27781e(sql, "sql");
        SQLiteStatement compileStatement = this.f32056a.compileStatement(sql);
        C9322n.m27780d(compileStatement, "delegate.compileStatement(sql)");
        return new C12060h(compileStatement);
    }

    @Override // p391v1.InterfaceC11610i
    /* renamed from: D */
    public Cursor mo32130D(final InterfaceC11613l query, CancellationSignal cancellationSignal) {
        C9322n.m27781e(query, "query");
        SQLiteDatabase sQLiteDatabase = this.f32056a;
        String mo32300b = query.mo32300b();
        String[] strArr = f32055e;
        C9322n.m27778b(cancellationSignal);
        return C11603b.m36379c(sQLiteDatabase, mo32300b, strArr, null, cancellationSignal, new SQLiteDatabase.CursorFactory() { // from class: w1.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase2, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                Cursor m38708g;
                m38708g = C12055c.m38708g(InterfaceC11613l.this, sQLiteDatabase2, sQLiteCursorDriver, str, sQLiteQuery);
                return m38708g;
            }
        });
    }

    @Override // p391v1.InterfaceC11610i
    /* renamed from: M */
    public void mo32131M() {
        this.f32056a.setTransactionSuccessful();
    }

    @Override // p391v1.InterfaceC11610i
    /* renamed from: N */
    public void mo32132N(String sql, Object[] bindArgs) {
        C9322n.m27781e(sql, "sql");
        C9322n.m27781e(bindArgs, "bindArgs");
        this.f32056a.execSQL(sql, bindArgs);
    }

    @Override // p391v1.InterfaceC11610i
    /* renamed from: N0 */
    public int mo32133N0(String table, int i10, ContentValues values, String str, Object[] objArr) {
        C9322n.m27781e(table, "table");
        C9322n.m27781e(values, "values");
        int i11 = 0;
        if (!(values.size() != 0)) {
            throw new IllegalArgumentException("Empty values".toString());
        }
        int size = values.size();
        int length = objArr == null ? size : objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UPDATE ");
        sb2.append(f32054d[i10]);
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
        C9322n.m27780d(sb3, "StringBuilder().apply(builderAction).toString()");
        InterfaceC11614m mo32129C0 = mo32129C0(sb3);
        C11602a.f30179c.m36376b(mo32129C0, objArr2);
        return mo32129C0.mo32164z();
    }

    @Override // p391v1.InterfaceC11610i
    /* renamed from: P */
    public void mo32134P() {
        this.f32056a.beginTransactionNonExclusive();
    }

    @Override // p391v1.InterfaceC11610i
    /* renamed from: S0 */
    public Cursor mo32135S0(String query) {
        C9322n.m27781e(query, "query");
        return mo32138e0(new C11602a(query));
    }

    @Override // p391v1.InterfaceC11610i
    /* renamed from: X */
    public void mo32136X() {
        this.f32056a.endTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f32056a.close();
    }

    /* renamed from: e */
    public final boolean m38709e(SQLiteDatabase sqLiteDatabase) {
        C9322n.m27781e(sqLiteDatabase, "sqLiteDatabase");
        return C9322n.m27777a(this.f32056a, sqLiteDatabase);
    }

    @Override // p391v1.InterfaceC11610i
    /* renamed from: e0 */
    public Cursor mo32138e0(InterfaceC11613l query) {
        C9322n.m27781e(query, "query");
        final b bVar = new b(query);
        Cursor rawQueryWithFactory = this.f32056a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: w1.b
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                Cursor m38707f;
                m38707f = C12055c.m38707f(InterfaceC10004r.this, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                return m38707f;
            }
        }, query.mo32300b(), f32055e, null);
        C9322n.m27780d(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    @Override // p391v1.InterfaceC11610i
    /* renamed from: f0 */
    public String mo32139f0() {
        return this.f32056a.getPath();
    }

    @Override // p391v1.InterfaceC11610i
    /* renamed from: i1 */
    public boolean mo32140i1() {
        return this.f32056a.inTransaction();
    }

    @Override // p391v1.InterfaceC11610i
    public boolean isOpen() {
        return this.f32056a.isOpen();
    }

    @Override // p391v1.InterfaceC11610i
    /* renamed from: m1 */
    public boolean mo32141m1() {
        return C11603b.m36378b(this.f32056a);
    }

    @Override // p391v1.InterfaceC11610i
    /* renamed from: t */
    public void mo32142t() {
        this.f32056a.beginTransaction();
    }

    @Override // p391v1.InterfaceC11610i
    /* renamed from: w */
    public List<Pair<String, String>> mo32143w() {
        return this.f32057b;
    }

    @Override // p391v1.InterfaceC11610i
    /* renamed from: x */
    public void mo32144x(String sql) {
        C9322n.m27781e(sql, "sql");
        this.f32056a.execSQL(sql);
    }
}

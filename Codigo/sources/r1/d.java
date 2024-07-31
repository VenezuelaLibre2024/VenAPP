package r1;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class d implements v1.j, g {

    /* renamed from: a, reason: collision with root package name */
    private final v1.j f24523a;

    /* renamed from: b, reason: collision with root package name */
    public final r1.c f24524b;

    /* renamed from: c, reason: collision with root package name */
    private final a f24525c;

    /* loaded from: classes.dex */
    public static final class a implements v1.i {

        /* renamed from: a, reason: collision with root package name */
        private final r1.c f24526a;

        /* renamed from: r1.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0406a extends kotlin.jvm.internal.o implements ok.l<v1.i, List<? extends Pair<String, String>>> {

            /* renamed from: a, reason: collision with root package name */
            public static final C0406a f24527a = new C0406a();

            C0406a() {
                super(1);
            }

            @Override // ok.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<Pair<String, String>> invoke(v1.i obj) {
                kotlin.jvm.internal.n.e(obj, "obj");
                return obj.w();
            }
        }

        /* loaded from: classes.dex */
        static final class b extends kotlin.jvm.internal.o implements ok.l<v1.i, Object> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f24528a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str) {
                super(1);
                this.f24528a = str;
            }

            @Override // ok.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(v1.i db2) {
                kotlin.jvm.internal.n.e(db2, "db");
                db2.x(this.f24528a);
                return null;
            }
        }

        /* loaded from: classes.dex */
        static final class c extends kotlin.jvm.internal.o implements ok.l<v1.i, Object> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f24529a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object[] f24530b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(String str, Object[] objArr) {
                super(1);
                this.f24529a = str;
                this.f24530b = objArr;
            }

            @Override // ok.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(v1.i db2) {
                kotlin.jvm.internal.n.e(db2, "db");
                db2.N(this.f24529a, this.f24530b);
                return null;
            }
        }

        /* renamed from: r1.d$a$d, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        /* synthetic */ class C0407d extends kotlin.jvm.internal.k implements ok.l<v1.i, Boolean> {

            /* renamed from: a, reason: collision with root package name */
            public static final C0407d f24531a = new C0407d();

            C0407d() {
                super(1, v1.i.class, "inTransaction", "inTransaction()Z", 0);
            }

            @Override // ok.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(v1.i p02) {
                kotlin.jvm.internal.n.e(p02, "p0");
                return Boolean.valueOf(p02.i1());
            }
        }

        /* loaded from: classes.dex */
        static final class e extends kotlin.jvm.internal.o implements ok.l<v1.i, Boolean> {

            /* renamed from: a, reason: collision with root package name */
            public static final e f24532a = new e();

            e() {
                super(1);
            }

            @Override // ok.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(v1.i db2) {
                kotlin.jvm.internal.n.e(db2, "db");
                return Boolean.valueOf(db2.m1());
            }
        }

        /* loaded from: classes.dex */
        static final class f extends kotlin.jvm.internal.o implements ok.l<v1.i, String> {

            /* renamed from: a, reason: collision with root package name */
            public static final f f24533a = new f();

            f() {
                super(1);
            }

            @Override // ok.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(v1.i obj) {
                kotlin.jvm.internal.n.e(obj, "obj");
                return obj.f0();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class g extends kotlin.jvm.internal.o implements ok.l<v1.i, Object> {

            /* renamed from: a, reason: collision with root package name */
            public static final g f24534a = new g();

            g() {
                super(1);
            }

            @Override // ok.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(v1.i it) {
                kotlin.jvm.internal.n.e(it, "it");
                return null;
            }
        }

        /* loaded from: classes.dex */
        static final class h extends kotlin.jvm.internal.o implements ok.l<v1.i, Integer> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f24535a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f24536b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ContentValues f24537c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f24538d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Object[] f24539e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(String str, int i10, ContentValues contentValues, String str2, Object[] objArr) {
                super(1);
                this.f24535a = str;
                this.f24536b = i10;
                this.f24537c = contentValues;
                this.f24538d = str2;
                this.f24539e = objArr;
            }

            @Override // ok.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(v1.i db2) {
                kotlin.jvm.internal.n.e(db2, "db");
                return Integer.valueOf(db2.N0(this.f24535a, this.f24536b, this.f24537c, this.f24538d, this.f24539e));
            }
        }

        public a(r1.c autoCloser) {
            kotlin.jvm.internal.n.e(autoCloser, "autoCloser");
            this.f24526a = autoCloser;
        }

        @Override // v1.i
        public v1.m C0(String sql) {
            kotlin.jvm.internal.n.e(sql, "sql");
            return new b(sql, this.f24526a);
        }

        @Override // v1.i
        public Cursor D(v1.l query, CancellationSignal cancellationSignal) {
            kotlin.jvm.internal.n.e(query, "query");
            try {
                return new c(this.f24526a.j().D(query, cancellationSignal), this.f24526a);
            } catch (Throwable th2) {
                this.f24526a.e();
                throw th2;
            }
        }

        @Override // v1.i
        public void M() {
            ck.v vVar;
            v1.i h10 = this.f24526a.h();
            if (h10 != null) {
                h10.M();
                vVar = ck.v.f7137a;
            } else {
                vVar = null;
            }
            if (vVar == null) {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null".toString());
            }
        }

        @Override // v1.i
        public void N(String sql, Object[] bindArgs) {
            kotlin.jvm.internal.n.e(sql, "sql");
            kotlin.jvm.internal.n.e(bindArgs, "bindArgs");
            this.f24526a.g(new c(sql, bindArgs));
        }

        @Override // v1.i
        public int N0(String table, int i10, ContentValues values, String str, Object[] objArr) {
            kotlin.jvm.internal.n.e(table, "table");
            kotlin.jvm.internal.n.e(values, "values");
            return ((Number) this.f24526a.g(new h(table, i10, values, str, objArr))).intValue();
        }

        @Override // v1.i
        public void P() {
            try {
                this.f24526a.j().P();
            } catch (Throwable th2) {
                this.f24526a.e();
                throw th2;
            }
        }

        @Override // v1.i
        public Cursor S0(String query) {
            kotlin.jvm.internal.n.e(query, "query");
            try {
                return new c(this.f24526a.j().S0(query), this.f24526a);
            } catch (Throwable th2) {
                this.f24526a.e();
                throw th2;
            }
        }

        @Override // v1.i
        public void X() {
            if (this.f24526a.h() == null) {
                throw new IllegalStateException("End transaction called but delegateDb is null".toString());
            }
            try {
                v1.i h10 = this.f24526a.h();
                kotlin.jvm.internal.n.b(h10);
                h10.X();
            } finally {
                this.f24526a.e();
            }
        }

        public final void a() {
            this.f24526a.g(g.f24534a);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f24526a.d();
        }

        @Override // v1.i
        public Cursor e0(v1.l query) {
            kotlin.jvm.internal.n.e(query, "query");
            try {
                return new c(this.f24526a.j().e0(query), this.f24526a);
            } catch (Throwable th2) {
                this.f24526a.e();
                throw th2;
            }
        }

        @Override // v1.i
        public String f0() {
            return (String) this.f24526a.g(f.f24533a);
        }

        @Override // v1.i
        public boolean i1() {
            if (this.f24526a.h() == null) {
                return false;
            }
            return ((Boolean) this.f24526a.g(C0407d.f24531a)).booleanValue();
        }

        @Override // v1.i
        public boolean isOpen() {
            v1.i h10 = this.f24526a.h();
            if (h10 == null) {
                return false;
            }
            return h10.isOpen();
        }

        @Override // v1.i
        public boolean m1() {
            return ((Boolean) this.f24526a.g(e.f24532a)).booleanValue();
        }

        @Override // v1.i
        public void t() {
            try {
                this.f24526a.j().t();
            } catch (Throwable th2) {
                this.f24526a.e();
                throw th2;
            }
        }

        @Override // v1.i
        public List<Pair<String, String>> w() {
            return (List) this.f24526a.g(C0406a.f24527a);
        }

        @Override // v1.i
        public void x(String sql) {
            kotlin.jvm.internal.n.e(sql, "sql");
            this.f24526a.g(new b(sql));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b implements v1.m {

        /* renamed from: a, reason: collision with root package name */
        private final String f24540a;

        /* renamed from: b, reason: collision with root package name */
        private final r1.c f24541b;

        /* renamed from: c, reason: collision with root package name */
        private final ArrayList<Object> f24542c;

        /* loaded from: classes.dex */
        static final class a extends kotlin.jvm.internal.o implements ok.l<v1.m, Long> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f24543a = new a();

            a() {
                super(1);
            }

            @Override // ok.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Long invoke(v1.m obj) {
                kotlin.jvm.internal.n.e(obj, "obj");
                return Long.valueOf(obj.t0());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: Add missing generic type declarations: [T] */
        /* renamed from: r1.d$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0408b<T> extends kotlin.jvm.internal.o implements ok.l<v1.i, T> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ok.l<v1.m, T> f24545b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0408b(ok.l<? super v1.m, ? extends T> lVar) {
                super(1);
                this.f24545b = lVar;
            }

            @Override // ok.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final T invoke(v1.i db2) {
                kotlin.jvm.internal.n.e(db2, "db");
                v1.m C0 = db2.C0(b.this.f24540a);
                b.this.e(C0);
                return this.f24545b.invoke(C0);
            }
        }

        /* loaded from: classes.dex */
        static final class c extends kotlin.jvm.internal.o implements ok.l<v1.m, Integer> {

            /* renamed from: a, reason: collision with root package name */
            public static final c f24546a = new c();

            c() {
                super(1);
            }

            @Override // ok.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(v1.m obj) {
                kotlin.jvm.internal.n.e(obj, "obj");
                return Integer.valueOf(obj.z());
            }
        }

        public b(String sql, r1.c autoCloser) {
            kotlin.jvm.internal.n.e(sql, "sql");
            kotlin.jvm.internal.n.e(autoCloser, "autoCloser");
            this.f24540a = sql;
            this.f24541b = autoCloser;
            this.f24542c = new ArrayList<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e(v1.m mVar) {
            Iterator<T> it = this.f24542c.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                it.next();
                int i11 = i10 + 1;
                if (i10 < 0) {
                    dk.r.q();
                }
                Object obj = this.f24542c.get(i10);
                if (obj == null) {
                    mVar.g1(i11);
                } else if (obj instanceof Long) {
                    mVar.M0(i11, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    mVar.C(i11, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    mVar.x0(i11, (String) obj);
                } else if (obj instanceof byte[]) {
                    mVar.O0(i11, (byte[]) obj);
                }
                i10 = i11;
            }
        }

        private final <T> T f(ok.l<? super v1.m, ? extends T> lVar) {
            return (T) this.f24541b.g(new C0408b(lVar));
        }

        private final void g(int i10, Object obj) {
            int size;
            int i11 = i10 - 1;
            if (i11 >= this.f24542c.size() && (size = this.f24542c.size()) <= i11) {
                while (true) {
                    this.f24542c.add(null);
                    if (size == i11) {
                        break;
                    } else {
                        size++;
                    }
                }
            }
            this.f24542c.set(i11, obj);
        }

        @Override // v1.k
        public void C(int i10, double d10) {
            g(i10, Double.valueOf(d10));
        }

        @Override // v1.k
        public void M0(int i10, long j10) {
            g(i10, Long.valueOf(j10));
        }

        @Override // v1.k
        public void O0(int i10, byte[] value) {
            kotlin.jvm.internal.n.e(value, "value");
            g(i10, value);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // v1.k
        public void g1(int i10) {
            g(i10, null);
        }

        @Override // v1.m
        public long t0() {
            return ((Number) f(a.f24543a)).longValue();
        }

        @Override // v1.k
        public void x0(int i10, String value) {
            kotlin.jvm.internal.n.e(value, "value");
            g(i10, value);
        }

        @Override // v1.m
        public int z() {
            return ((Number) f(c.f24546a)).intValue();
        }
    }

    /* loaded from: classes.dex */
    private static final class c implements Cursor {

        /* renamed from: a, reason: collision with root package name */
        private final Cursor f24547a;

        /* renamed from: b, reason: collision with root package name */
        private final r1.c f24548b;

        public c(Cursor delegate, r1.c autoCloser) {
            kotlin.jvm.internal.n.e(delegate, "delegate");
            kotlin.jvm.internal.n.e(autoCloser, "autoCloser");
            this.f24547a = delegate;
            this.f24548b = autoCloser;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f24547a.close();
            this.f24548b.e();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i10, CharArrayBuffer charArrayBuffer) {
            this.f24547a.copyStringToBuffer(i10, charArrayBuffer);
        }

        @Override // android.database.Cursor
        public void deactivate() {
            this.f24547a.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int i10) {
            return this.f24547a.getBlob(i10);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.f24547a.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String str) {
            return this.f24547a.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String str) {
            return this.f24547a.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public String getColumnName(int i10) {
            return this.f24547a.getColumnName(i10);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.f24547a.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.f24547a.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int i10) {
            return this.f24547a.getDouble(i10);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.f24547a.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int i10) {
            return this.f24547a.getFloat(i10);
        }

        @Override // android.database.Cursor
        public int getInt(int i10) {
            return this.f24547a.getInt(i10);
        }

        @Override // android.database.Cursor
        public long getLong(int i10) {
            return this.f24547a.getLong(i10);
        }

        @Override // android.database.Cursor
        public Uri getNotificationUri() {
            return v1.c.a(this.f24547a);
        }

        @Override // android.database.Cursor
        public List<Uri> getNotificationUris() {
            return v1.h.a(this.f24547a);
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.f24547a.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int i10) {
            return this.f24547a.getShort(i10);
        }

        @Override // android.database.Cursor
        public String getString(int i10) {
            return this.f24547a.getString(i10);
        }

        @Override // android.database.Cursor
        public int getType(int i10) {
            return this.f24547a.getType(i10);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.f24547a.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.f24547a.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.f24547a.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.f24547a.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.f24547a.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.f24547a.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int i10) {
            return this.f24547a.isNull(i10);
        }

        @Override // android.database.Cursor
        public boolean move(int i10) {
            return this.f24547a.move(i10);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.f24547a.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.f24547a.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.f24547a.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int i10) {
            return this.f24547a.moveToPosition(i10);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.f24547a.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver) {
            this.f24547a.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f24547a.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        public boolean requery() {
            return this.f24547a.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle bundle) {
            return this.f24547a.respond(bundle);
        }

        @Override // android.database.Cursor
        public void setExtras(Bundle extras) {
            kotlin.jvm.internal.n.e(extras, "extras");
            v1.e.a(this.f24547a, extras);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.f24547a.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        public void setNotificationUris(ContentResolver cr, List<? extends Uri> uris) {
            kotlin.jvm.internal.n.e(cr, "cr");
            kotlin.jvm.internal.n.e(uris, "uris");
            v1.h.b(this.f24547a, cr, uris);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.f24547a.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f24547a.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public d(v1.j delegate, r1.c autoCloser) {
        kotlin.jvm.internal.n.e(delegate, "delegate");
        kotlin.jvm.internal.n.e(autoCloser, "autoCloser");
        this.f24523a = delegate;
        this.f24524b = autoCloser;
        autoCloser.k(a());
        this.f24525c = new a(autoCloser);
    }

    @Override // v1.j
    public v1.i Q0() {
        this.f24525c.a();
        return this.f24525c;
    }

    @Override // r1.g
    public v1.j a() {
        return this.f24523a;
    }

    @Override // v1.j, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f24525c.close();
    }

    @Override // v1.j
    public String getDatabaseName() {
        return this.f24523a.getDatabaseName();
    }

    @Override // v1.j
    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.f24523a.setWriteAheadLoggingEnabled(z10);
    }
}

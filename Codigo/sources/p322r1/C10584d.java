package p322r1;

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
import ck.C2037v;
import dk.C7031r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9319k;
import kotlin.jvm.internal.C9322n;
import p280ok.InterfaceC9998l;
import p391v1.C11604c;
import p391v1.C11606e;
import p391v1.C11609h;
import p391v1.InterfaceC11610i;
import p391v1.InterfaceC11611j;
import p391v1.InterfaceC11613l;
import p391v1.InterfaceC11614m;

/* renamed from: r1.d */
/* loaded from: classes.dex */
public final class C10584d implements InterfaceC11611j, InterfaceC10590g {

    /* renamed from: a */
    private final InterfaceC11611j f26637a;

    /* renamed from: b */
    public final C10582c f26638b;

    /* renamed from: c */
    private final a f26639c;

    /* renamed from: r1.d$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC11610i {

        /* renamed from: a */
        private final C10582c f26640a;

        /* renamed from: r1.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C13241a extends AbstractC9323o implements InterfaceC9998l<InterfaceC11610i, List<? extends Pair<String, String>>> {

            /* renamed from: a */
            public static final C13241a f26641a = new C13241a();

            C13241a() {
                super(1);
            }

            @Override // p280ok.InterfaceC9998l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<Pair<String, String>> invoke(InterfaceC11610i obj) {
                C9322n.m27781e(obj, "obj");
                return obj.mo32143w();
            }
        }

        /* renamed from: r1.d$a$b */
        /* loaded from: classes.dex */
        static final class b extends AbstractC9323o implements InterfaceC9998l<InterfaceC11610i, Object> {

            /* renamed from: a */
            final /* synthetic */ String f26642a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str) {
                super(1);
                this.f26642a = str;
            }

            @Override // p280ok.InterfaceC9998l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC11610i db2) {
                C9322n.m27781e(db2, "db");
                db2.mo32144x(this.f26642a);
                return null;
            }
        }

        /* renamed from: r1.d$a$c */
        /* loaded from: classes.dex */
        static final class c extends AbstractC9323o implements InterfaceC9998l<InterfaceC11610i, Object> {

            /* renamed from: a */
            final /* synthetic */ String f26643a;

            /* renamed from: b */
            final /* synthetic */ Object[] f26644b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(String str, Object[] objArr) {
                super(1);
                this.f26643a = str;
                this.f26644b = objArr;
            }

            @Override // p280ok.InterfaceC9998l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC11610i db2) {
                C9322n.m27781e(db2, "db");
                db2.mo32132N(this.f26643a, this.f26644b);
                return null;
            }
        }

        /* renamed from: r1.d$a$d */
        /* loaded from: classes.dex */
        /* synthetic */ class d extends C9319k implements InterfaceC9998l<InterfaceC11610i, Boolean> {

            /* renamed from: a */
            public static final d f26645a = new d();

            d() {
                super(1, InterfaceC11610i.class, "inTransaction", "inTransaction()Z", 0);
            }

            @Override // p280ok.InterfaceC9998l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(InterfaceC11610i p02) {
                C9322n.m27781e(p02, "p0");
                return Boolean.valueOf(p02.mo32140i1());
            }
        }

        /* renamed from: r1.d$a$e */
        /* loaded from: classes.dex */
        static final class e extends AbstractC9323o implements InterfaceC9998l<InterfaceC11610i, Boolean> {

            /* renamed from: a */
            public static final e f26646a = new e();

            e() {
                super(1);
            }

            @Override // p280ok.InterfaceC9998l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(InterfaceC11610i db2) {
                C9322n.m27781e(db2, "db");
                return Boolean.valueOf(db2.mo32141m1());
            }
        }

        /* renamed from: r1.d$a$f */
        /* loaded from: classes.dex */
        static final class f extends AbstractC9323o implements InterfaceC9998l<InterfaceC11610i, String> {

            /* renamed from: a */
            public static final f f26647a = new f();

            f() {
                super(1);
            }

            @Override // p280ok.InterfaceC9998l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(InterfaceC11610i obj) {
                C9322n.m27781e(obj, "obj");
                return obj.mo32139f0();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: r1.d$a$g */
        /* loaded from: classes.dex */
        public static final class g extends AbstractC9323o implements InterfaceC9998l<InterfaceC11610i, Object> {

            /* renamed from: a */
            public static final g f26648a = new g();

            g() {
                super(1);
            }

            @Override // p280ok.InterfaceC9998l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC11610i it) {
                C9322n.m27781e(it, "it");
                return null;
            }
        }

        /* renamed from: r1.d$a$h */
        /* loaded from: classes.dex */
        static final class h extends AbstractC9323o implements InterfaceC9998l<InterfaceC11610i, Integer> {

            /* renamed from: a */
            final /* synthetic */ String f26649a;

            /* renamed from: b */
            final /* synthetic */ int f26650b;

            /* renamed from: c */
            final /* synthetic */ ContentValues f26651c;

            /* renamed from: d */
            final /* synthetic */ String f26652d;

            /* renamed from: e */
            final /* synthetic */ Object[] f26653e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(String str, int i10, ContentValues contentValues, String str2, Object[] objArr) {
                super(1);
                this.f26649a = str;
                this.f26650b = i10;
                this.f26651c = contentValues;
                this.f26652d = str2;
                this.f26653e = objArr;
            }

            @Override // p280ok.InterfaceC9998l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(InterfaceC11610i db2) {
                C9322n.m27781e(db2, "db");
                return Integer.valueOf(db2.mo32133N0(this.f26649a, this.f26650b, this.f26651c, this.f26652d, this.f26653e));
            }
        }

        public a(C10582c autoCloser) {
            C9322n.m27781e(autoCloser, "autoCloser");
            this.f26640a = autoCloser;
        }

        @Override // p391v1.InterfaceC11610i
        /* renamed from: C0 */
        public InterfaceC11614m mo32129C0(String sql) {
            C9322n.m27781e(sql, "sql");
            return new b(sql, this.f26640a);
        }

        @Override // p391v1.InterfaceC11610i
        /* renamed from: D */
        public Cursor mo32130D(InterfaceC11613l query, CancellationSignal cancellationSignal) {
            C9322n.m27781e(query, "query");
            try {
                return new c(this.f26640a.m32124j().mo32130D(query, cancellationSignal), this.f26640a);
            } catch (Throwable th2) {
                this.f26640a.m32120e();
                throw th2;
            }
        }

        @Override // p391v1.InterfaceC11610i
        /* renamed from: M */
        public void mo32131M() {
            C2037v c2037v;
            InterfaceC11610i m32122h = this.f26640a.m32122h();
            if (m32122h != null) {
                m32122h.mo32131M();
                c2037v = C2037v.f8089a;
            } else {
                c2037v = null;
            }
            if (c2037v == null) {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null".toString());
            }
        }

        @Override // p391v1.InterfaceC11610i
        /* renamed from: N */
        public void mo32132N(String sql, Object[] bindArgs) {
            C9322n.m27781e(sql, "sql");
            C9322n.m27781e(bindArgs, "bindArgs");
            this.f26640a.m32121g(new c(sql, bindArgs));
        }

        @Override // p391v1.InterfaceC11610i
        /* renamed from: N0 */
        public int mo32133N0(String table, int i10, ContentValues values, String str, Object[] objArr) {
            C9322n.m27781e(table, "table");
            C9322n.m27781e(values, "values");
            return ((Number) this.f26640a.m32121g(new h(table, i10, values, str, objArr))).intValue();
        }

        @Override // p391v1.InterfaceC11610i
        /* renamed from: P */
        public void mo32134P() {
            try {
                this.f26640a.m32124j().mo32134P();
            } catch (Throwable th2) {
                this.f26640a.m32120e();
                throw th2;
            }
        }

        @Override // p391v1.InterfaceC11610i
        /* renamed from: S0 */
        public Cursor mo32135S0(String query) {
            C9322n.m27781e(query, "query");
            try {
                return new c(this.f26640a.m32124j().mo32135S0(query), this.f26640a);
            } catch (Throwable th2) {
                this.f26640a.m32120e();
                throw th2;
            }
        }

        @Override // p391v1.InterfaceC11610i
        /* renamed from: X */
        public void mo32136X() {
            if (this.f26640a.m32122h() == null) {
                throw new IllegalStateException("End transaction called but delegateDb is null".toString());
            }
            try {
                InterfaceC11610i m32122h = this.f26640a.m32122h();
                C9322n.m27778b(m32122h);
                m32122h.mo32136X();
            } finally {
                this.f26640a.m32120e();
            }
        }

        /* renamed from: a */
        public final void m32137a() {
            this.f26640a.m32121g(g.f26648a);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f26640a.m32119d();
        }

        @Override // p391v1.InterfaceC11610i
        /* renamed from: e0 */
        public Cursor mo32138e0(InterfaceC11613l query) {
            C9322n.m27781e(query, "query");
            try {
                return new c(this.f26640a.m32124j().mo32138e0(query), this.f26640a);
            } catch (Throwable th2) {
                this.f26640a.m32120e();
                throw th2;
            }
        }

        @Override // p391v1.InterfaceC11610i
        /* renamed from: f0 */
        public String mo32139f0() {
            return (String) this.f26640a.m32121g(f.f26647a);
        }

        @Override // p391v1.InterfaceC11610i
        /* renamed from: i1 */
        public boolean mo32140i1() {
            if (this.f26640a.m32122h() == null) {
                return false;
            }
            return ((Boolean) this.f26640a.m32121g(d.f26645a)).booleanValue();
        }

        @Override // p391v1.InterfaceC11610i
        public boolean isOpen() {
            InterfaceC11610i m32122h = this.f26640a.m32122h();
            if (m32122h == null) {
                return false;
            }
            return m32122h.isOpen();
        }

        @Override // p391v1.InterfaceC11610i
        /* renamed from: m1 */
        public boolean mo32141m1() {
            return ((Boolean) this.f26640a.m32121g(e.f26646a)).booleanValue();
        }

        @Override // p391v1.InterfaceC11610i
        /* renamed from: t */
        public void mo32142t() {
            try {
                this.f26640a.m32124j().mo32142t();
            } catch (Throwable th2) {
                this.f26640a.m32120e();
                throw th2;
            }
        }

        @Override // p391v1.InterfaceC11610i
        /* renamed from: w */
        public List<Pair<String, String>> mo32143w() {
            return (List) this.f26640a.m32121g(C13241a.f26641a);
        }

        @Override // p391v1.InterfaceC11610i
        /* renamed from: x */
        public void mo32144x(String sql) {
            C9322n.m27781e(sql, "sql");
            this.f26640a.m32121g(new b(sql));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r1.d$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC11614m {

        /* renamed from: a */
        private final String f26654a;

        /* renamed from: b */
        private final C10582c f26655b;

        /* renamed from: c */
        private final ArrayList<Object> f26656c;

        /* renamed from: r1.d$b$a */
        /* loaded from: classes.dex */
        static final class a extends AbstractC9323o implements InterfaceC9998l<InterfaceC11614m, Long> {

            /* renamed from: a */
            public static final a f26657a = new a();

            a() {
                super(1);
            }

            @Override // p280ok.InterfaceC9998l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Long invoke(InterfaceC11614m obj) {
                C9322n.m27781e(obj, "obj");
                return Long.valueOf(obj.mo32162t0());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: Add missing generic type declarations: [T] */
        /* renamed from: r1.d$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C13242b<T> extends AbstractC9323o implements InterfaceC9998l<InterfaceC11610i, T> {

            /* renamed from: b */
            final /* synthetic */ InterfaceC9998l<InterfaceC11614m, T> f26659b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C13242b(InterfaceC9998l<? super InterfaceC11614m, ? extends T> interfaceC9998l) {
                super(1);
                this.f26659b = interfaceC9998l;
            }

            @Override // p280ok.InterfaceC9998l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final T invoke(InterfaceC11610i db2) {
                C9322n.m27781e(db2, "db");
                InterfaceC11614m mo32129C0 = db2.mo32129C0(b.this.f26654a);
                b.this.m32155e(mo32129C0);
                return this.f26659b.invoke(mo32129C0);
            }
        }

        /* renamed from: r1.d$b$c */
        /* loaded from: classes.dex */
        static final class c extends AbstractC9323o implements InterfaceC9998l<InterfaceC11614m, Integer> {

            /* renamed from: a */
            public static final c f26660a = new c();

            c() {
                super(1);
            }

            @Override // p280ok.InterfaceC9998l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(InterfaceC11614m obj) {
                C9322n.m27781e(obj, "obj");
                return Integer.valueOf(obj.mo32164z());
            }
        }

        public b(String sql, C10582c autoCloser) {
            C9322n.m27781e(sql, "sql");
            C9322n.m27781e(autoCloser, "autoCloser");
            this.f26654a = sql;
            this.f26655b = autoCloser;
            this.f26656c = new ArrayList<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public final void m32155e(InterfaceC11614m interfaceC11614m) {
            Iterator<T> it = this.f26656c.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                it.next();
                int i11 = i10 + 1;
                if (i10 < 0) {
                    C7031r.m20589q();
                }
                Object obj = this.f26656c.get(i10);
                if (obj == null) {
                    interfaceC11614m.mo32161g1(i11);
                } else if (obj instanceof Long) {
                    interfaceC11614m.mo32159M0(i11, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    interfaceC11614m.mo32158C(i11, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    interfaceC11614m.mo32163x0(i11, (String) obj);
                } else if (obj instanceof byte[]) {
                    interfaceC11614m.mo32160O0(i11, (byte[]) obj);
                }
                i10 = i11;
            }
        }

        /* renamed from: f */
        private final <T> T m32156f(InterfaceC9998l<? super InterfaceC11614m, ? extends T> interfaceC9998l) {
            return (T) this.f26655b.m32121g(new C13242b(interfaceC9998l));
        }

        /* renamed from: g */
        private final void m32157g(int i10, Object obj) {
            int size;
            int i11 = i10 - 1;
            if (i11 >= this.f26656c.size() && (size = this.f26656c.size()) <= i11) {
                while (true) {
                    this.f26656c.add(null);
                    if (size == i11) {
                        break;
                    } else {
                        size++;
                    }
                }
            }
            this.f26656c.set(i11, obj);
        }

        @Override // p391v1.InterfaceC11612k
        /* renamed from: C */
        public void mo32158C(int i10, double d10) {
            m32157g(i10, Double.valueOf(d10));
        }

        @Override // p391v1.InterfaceC11612k
        /* renamed from: M0 */
        public void mo32159M0(int i10, long j10) {
            m32157g(i10, Long.valueOf(j10));
        }

        @Override // p391v1.InterfaceC11612k
        /* renamed from: O0 */
        public void mo32160O0(int i10, byte[] value) {
            C9322n.m27781e(value, "value");
            m32157g(i10, value);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // p391v1.InterfaceC11612k
        /* renamed from: g1 */
        public void mo32161g1(int i10) {
            m32157g(i10, null);
        }

        @Override // p391v1.InterfaceC11614m
        /* renamed from: t0 */
        public long mo32162t0() {
            return ((Number) m32156f(a.f26657a)).longValue();
        }

        @Override // p391v1.InterfaceC11612k
        /* renamed from: x0 */
        public void mo32163x0(int i10, String value) {
            C9322n.m27781e(value, "value");
            m32157g(i10, value);
        }

        @Override // p391v1.InterfaceC11614m
        /* renamed from: z */
        public int mo32164z() {
            return ((Number) m32156f(c.f26660a)).intValue();
        }
    }

    /* renamed from: r1.d$c */
    /* loaded from: classes.dex */
    private static final class c implements Cursor {

        /* renamed from: a */
        private final Cursor f26661a;

        /* renamed from: b */
        private final C10582c f26662b;

        public c(Cursor delegate, C10582c autoCloser) {
            C9322n.m27781e(delegate, "delegate");
            C9322n.m27781e(autoCloser, "autoCloser");
            this.f26661a = delegate;
            this.f26662b = autoCloser;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f26661a.close();
            this.f26662b.m32120e();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i10, CharArrayBuffer charArrayBuffer) {
            this.f26661a.copyStringToBuffer(i10, charArrayBuffer);
        }

        @Override // android.database.Cursor
        public void deactivate() {
            this.f26661a.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int i10) {
            return this.f26661a.getBlob(i10);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.f26661a.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String str) {
            return this.f26661a.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String str) {
            return this.f26661a.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public String getColumnName(int i10) {
            return this.f26661a.getColumnName(i10);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.f26661a.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.f26661a.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int i10) {
            return this.f26661a.getDouble(i10);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.f26661a.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int i10) {
            return this.f26661a.getFloat(i10);
        }

        @Override // android.database.Cursor
        public int getInt(int i10) {
            return this.f26661a.getInt(i10);
        }

        @Override // android.database.Cursor
        public long getLong(int i10) {
            return this.f26661a.getLong(i10);
        }

        @Override // android.database.Cursor
        public Uri getNotificationUri() {
            return C11604c.m36381a(this.f26661a);
        }

        @Override // android.database.Cursor
        public List<Uri> getNotificationUris() {
            return C11609h.m36387a(this.f26661a);
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.f26661a.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int i10) {
            return this.f26661a.getShort(i10);
        }

        @Override // android.database.Cursor
        public String getString(int i10) {
            return this.f26661a.getString(i10);
        }

        @Override // android.database.Cursor
        public int getType(int i10) {
            return this.f26661a.getType(i10);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.f26661a.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.f26661a.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.f26661a.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.f26661a.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.f26661a.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.f26661a.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int i10) {
            return this.f26661a.isNull(i10);
        }

        @Override // android.database.Cursor
        public boolean move(int i10) {
            return this.f26661a.move(i10);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.f26661a.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.f26661a.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.f26661a.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int i10) {
            return this.f26661a.moveToPosition(i10);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.f26661a.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver) {
            this.f26661a.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f26661a.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        public boolean requery() {
            return this.f26661a.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle bundle) {
            return this.f26661a.respond(bundle);
        }

        @Override // android.database.Cursor
        public void setExtras(Bundle extras) {
            C9322n.m27781e(extras, "extras");
            C11606e.m36384a(this.f26661a, extras);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.f26661a.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        public void setNotificationUris(ContentResolver cr, List<? extends Uri> uris) {
            C9322n.m27781e(cr, "cr");
            C9322n.m27781e(uris, "uris");
            C11609h.m36388b(this.f26661a, cr, uris);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.f26661a.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f26661a.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public C10584d(InterfaceC11611j delegate, C10582c autoCloser) {
        C9322n.m27781e(delegate, "delegate");
        C9322n.m27781e(autoCloser, "autoCloser");
        this.f26637a = delegate;
        this.f26638b = autoCloser;
        autoCloser.m32125k(mo32113a());
        this.f26639c = new a(autoCloser);
    }

    @Override // p391v1.InterfaceC11611j
    /* renamed from: Q0 */
    public InterfaceC11610i mo32112Q0() {
        this.f26639c.m32137a();
        return this.f26639c;
    }

    @Override // p322r1.InterfaceC10590g
    /* renamed from: a */
    public InterfaceC11611j mo32113a() {
        return this.f26637a;
    }

    @Override // p391v1.InterfaceC11611j, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f26639c.close();
    }

    @Override // p391v1.InterfaceC11611j
    public String getDatabaseName() {
        return this.f26637a.getDatabaseName();
    }

    @Override // p391v1.InterfaceC11611j
    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.f26637a.setWriteAheadLoggingEnabled(z10);
    }
}

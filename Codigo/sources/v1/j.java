package v1;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.n;
import xk.p;

/* loaded from: classes.dex */
public interface j extends Closeable {

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: b, reason: collision with root package name */
        public static final C0453a f27863b = new C0453a(null);

        /* renamed from: a, reason: collision with root package name */
        public final int f27864a;

        /* renamed from: v1.j$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0453a {
            private C0453a() {
            }

            public /* synthetic */ C0453a(kotlin.jvm.internal.g gVar) {
                this();
            }
        }

        public a(int i10) {
            this.f27864a = i10;
        }

        private final void a(String str) {
            boolean r10;
            r10 = p.r(str, ":memory:", true);
            if (r10) {
                return;
            }
            int length = str.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = n.f(str.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            if (str.subSequence(i10, length + 1).toString().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                v1.b.a(new File(str));
            } catch (Exception e10) {
                Log.w("SupportSQLite", "delete failed: ", e10);
            }
        }

        public void b(i db2) {
            n.e(db2, "db");
        }

        public void c(i db2) {
            n.e(db2, "db");
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + db2 + ".path");
            if (!db2.isOpen()) {
                String f02 = db2.f0();
                if (f02 != null) {
                    a(f02);
                    return;
                }
                return;
            }
            List<Pair<String, String>> list = null;
            try {
                try {
                    list = db2.w();
                } finally {
                    if (list != null) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            Object obj = ((Pair) it.next()).second;
                            n.d(obj, "p.second");
                            a((String) obj);
                        }
                    } else {
                        String f03 = db2.f0();
                        if (f03 != null) {
                            a(f03);
                        }
                    }
                }
            } catch (SQLiteException unused) {
            }
            try {
                db2.close();
            } catch (IOException unused2) {
                if (list != null) {
                    return;
                }
            }
        }

        public abstract void d(i iVar);

        public abstract void e(i iVar, int i10, int i11);

        public void f(i db2) {
            n.e(db2, "db");
        }

        public abstract void g(i iVar, int i10, int i11);
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: f, reason: collision with root package name */
        public static final C0454b f27865f = new C0454b(null);

        /* renamed from: a, reason: collision with root package name */
        public final Context f27866a;

        /* renamed from: b, reason: collision with root package name */
        public final String f27867b;

        /* renamed from: c, reason: collision with root package name */
        public final a f27868c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f27869d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f27870e;

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private final Context f27871a;

            /* renamed from: b, reason: collision with root package name */
            private String f27872b;

            /* renamed from: c, reason: collision with root package name */
            private a f27873c;

            /* renamed from: d, reason: collision with root package name */
            private boolean f27874d;

            /* renamed from: e, reason: collision with root package name */
            private boolean f27875e;

            public a(Context context) {
                n.e(context, "context");
                this.f27871a = context;
            }

            public a a(boolean z10) {
                this.f27875e = z10;
                return this;
            }

            public b b() {
                a aVar = this.f27873c;
                if (aVar == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.".toString());
                }
                boolean z10 = true;
                if (this.f27874d) {
                    String str = this.f27872b;
                    if (str == null || str.length() == 0) {
                        z10 = false;
                    }
                }
                if (z10) {
                    return new b(this.f27871a, this.f27872b, aVar, this.f27874d, this.f27875e);
                }
                throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.".toString());
            }

            public a c(a callback) {
                n.e(callback, "callback");
                this.f27873c = callback;
                return this;
            }

            public a d(String str) {
                this.f27872b = str;
                return this;
            }

            public a e(boolean z10) {
                this.f27874d = z10;
                return this;
            }
        }

        /* renamed from: v1.j$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0454b {
            private C0454b() {
            }

            public /* synthetic */ C0454b(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final a a(Context context) {
                n.e(context, "context");
                return new a(context);
            }
        }

        public b(Context context, String str, a callback, boolean z10, boolean z11) {
            n.e(context, "context");
            n.e(callback, "callback");
            this.f27866a = context;
            this.f27867b = str;
            this.f27868c = callback;
            this.f27869d = z10;
            this.f27870e = z11;
        }

        public static final a a(Context context) {
            return f27865f.a(context);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        j a(b bVar);
    }

    i Q0();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z10);
}

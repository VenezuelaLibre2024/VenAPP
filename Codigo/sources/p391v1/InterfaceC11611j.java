package p391v1;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p450xk.C12524p;

/* renamed from: v1.j */
/* loaded from: classes.dex */
public interface InterfaceC11611j extends Closeable {

    /* renamed from: v1.j$a */
    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: b */
        public static final C13256a f30187b = new C13256a(null);

        /* renamed from: a */
        public final int f30188a;

        /* renamed from: v1.j$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C13256a {
            private C13256a() {
            }

            public /* synthetic */ C13256a(C9315g c9315g) {
                this();
            }
        }

        public a(int i10) {
            this.f30188a = i10;
        }

        /* renamed from: a */
        private final void m36389a(String str) {
            boolean m41037r;
            m41037r = C12524p.m41037r(str, ":memory:", true);
            if (m41037r) {
                return;
            }
            int length = str.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = C9322n.m27782f(str.charAt(!z10 ? i10 : length), 32) <= 0;
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
                C11603b.m36377a(new File(str));
            } catch (Exception e10) {
                Log.w("SupportSQLite", "delete failed: ", e10);
            }
        }

        /* renamed from: b */
        public void mo32291b(InterfaceC11610i db2) {
            C9322n.m27781e(db2, "db");
        }

        /* renamed from: c */
        public void m36390c(InterfaceC11610i db2) {
            C9322n.m27781e(db2, "db");
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + db2 + ".path");
            if (!db2.isOpen()) {
                String mo32139f0 = db2.mo32139f0();
                if (mo32139f0 != null) {
                    m36389a(mo32139f0);
                    return;
                }
                return;
            }
            List<Pair<String, String>> list = null;
            try {
                try {
                    list = db2.mo32143w();
                } finally {
                    if (list != null) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            Object obj = ((Pair) it.next()).second;
                            C9322n.m27780d(obj, "p.second");
                            m36389a((String) obj);
                        }
                    } else {
                        String mo32139f02 = db2.mo32139f0();
                        if (mo32139f02 != null) {
                            m36389a(mo32139f02);
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

        /* renamed from: d */
        public abstract void mo32292d(InterfaceC11610i interfaceC11610i);

        /* renamed from: e */
        public abstract void mo32293e(InterfaceC11610i interfaceC11610i, int i10, int i11);

        /* renamed from: f */
        public void mo32294f(InterfaceC11610i db2) {
            C9322n.m27781e(db2, "db");
        }

        /* renamed from: g */
        public abstract void mo32295g(InterfaceC11610i interfaceC11610i, int i10, int i11);
    }

    /* renamed from: v1.j$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: f */
        public static final C13257b f30189f = new C13257b(null);

        /* renamed from: a */
        public final Context f30190a;

        /* renamed from: b */
        public final String f30191b;

        /* renamed from: c */
        public final a f30192c;

        /* renamed from: d */
        public final boolean f30193d;

        /* renamed from: e */
        public final boolean f30194e;

        /* renamed from: v1.j$b$a */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a */
            private final Context f30195a;

            /* renamed from: b */
            private String f30196b;

            /* renamed from: c */
            private a f30197c;

            /* renamed from: d */
            private boolean f30198d;

            /* renamed from: e */
            private boolean f30199e;

            public a(Context context) {
                C9322n.m27781e(context, "context");
                this.f30195a = context;
            }

            /* renamed from: a */
            public a m36392a(boolean z10) {
                this.f30199e = z10;
                return this;
            }

            /* renamed from: b */
            public b m36393b() {
                a aVar = this.f30197c;
                if (aVar == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.".toString());
                }
                boolean z10 = true;
                if (this.f30198d) {
                    String str = this.f30196b;
                    if (str == null || str.length() == 0) {
                        z10 = false;
                    }
                }
                if (z10) {
                    return new b(this.f30195a, this.f30196b, aVar, this.f30198d, this.f30199e);
                }
                throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.".toString());
            }

            /* renamed from: c */
            public a m36394c(a callback) {
                C9322n.m27781e(callback, "callback");
                this.f30197c = callback;
                return this;
            }

            /* renamed from: d */
            public a m36395d(String str) {
                this.f30196b = str;
                return this;
            }

            /* renamed from: e */
            public a m36396e(boolean z10) {
                this.f30198d = z10;
                return this;
            }
        }

        /* renamed from: v1.j$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C13257b {
            private C13257b() {
            }

            public /* synthetic */ C13257b(C9315g c9315g) {
                this();
            }

            /* renamed from: a */
            public final a m36397a(Context context) {
                C9322n.m27781e(context, "context");
                return new a(context);
            }
        }

        public b(Context context, String str, a callback, boolean z10, boolean z11) {
            C9322n.m27781e(context, "context");
            C9322n.m27781e(callback, "callback");
            this.f30190a = context;
            this.f30191b = str;
            this.f30192c = callback;
            this.f30193d = z10;
            this.f30194e = z11;
        }

        /* renamed from: a */
        public static final a m36391a(Context context) {
            return f30189f.m36397a(context);
        }
    }

    /* renamed from: v1.j$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        InterfaceC11611j mo8825a(b bVar);
    }

    /* renamed from: Q0 */
    InterfaceC11610i mo32112Q0();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z10);
}

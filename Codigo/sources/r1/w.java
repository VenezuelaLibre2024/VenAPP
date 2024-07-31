package r1;

import android.database.Cursor;
import java.util.Iterator;
import java.util.List;
import v1.j;

/* loaded from: classes.dex */
public class w extends j.a {

    /* renamed from: g, reason: collision with root package name */
    public static final a f24677g = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private f f24678c;

    /* renamed from: d, reason: collision with root package name */
    private final b f24679d;

    /* renamed from: e, reason: collision with root package name */
    private final String f24680e;

    /* renamed from: f, reason: collision with root package name */
    private final String f24681f;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final boolean a(v1.i db2) {
            kotlin.jvm.internal.n.e(db2, "db");
            Cursor S0 = db2.S0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                boolean z10 = false;
                if (S0.moveToFirst()) {
                    if (S0.getInt(0) == 0) {
                        z10 = true;
                    }
                }
                mk.b.a(S0, null);
                return z10;
            } finally {
            }
        }

        public final boolean b(v1.i db2) {
            kotlin.jvm.internal.n.e(db2, "db");
            Cursor S0 = db2.S0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                boolean z10 = false;
                if (S0.moveToFirst()) {
                    if (S0.getInt(0) != 0) {
                        z10 = true;
                    }
                }
                mk.b.a(S0, null);
                return z10;
            } finally {
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f24682a;

        public b(int i10) {
            this.f24682a = i10;
        }

        public abstract void a(v1.i iVar);

        public abstract void b(v1.i iVar);

        public abstract void c(v1.i iVar);

        public abstract void d(v1.i iVar);

        public abstract void e(v1.i iVar);

        public abstract void f(v1.i iVar);

        public abstract c g(v1.i iVar);
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f24683a;

        /* renamed from: b, reason: collision with root package name */
        public final String f24684b;

        public c(boolean z10, String str) {
            this.f24683a = z10;
            this.f24684b = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(f configuration, b delegate, String identityHash, String legacyHash) {
        super(delegate.f24682a);
        kotlin.jvm.internal.n.e(configuration, "configuration");
        kotlin.jvm.internal.n.e(delegate, "delegate");
        kotlin.jvm.internal.n.e(identityHash, "identityHash");
        kotlin.jvm.internal.n.e(legacyHash, "legacyHash");
        this.f24678c = configuration;
        this.f24679d = delegate;
        this.f24680e = identityHash;
        this.f24681f = legacyHash;
    }

    private final void h(v1.i iVar) {
        if (!f24677g.b(iVar)) {
            c g10 = this.f24679d.g(iVar);
            if (g10.f24683a) {
                this.f24679d.e(iVar);
                j(iVar);
                return;
            } else {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g10.f24684b);
            }
        }
        Cursor e02 = iVar.e0(new v1.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        try {
            String string = e02.moveToFirst() ? e02.getString(0) : null;
            mk.b.a(e02, null);
            if (kotlin.jvm.internal.n.a(this.f24680e, string) || kotlin.jvm.internal.n.a(this.f24681f, string)) {
                return;
            }
            throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + this.f24680e + ", found: " + string);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                mk.b.a(e02, th2);
                throw th3;
            }
        }
    }

    private final void i(v1.i iVar) {
        iVar.x("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private final void j(v1.i iVar) {
        i(iVar);
        iVar.x(v.a(this.f24680e));
    }

    @Override // v1.j.a
    public void b(v1.i db2) {
        kotlin.jvm.internal.n.e(db2, "db");
        super.b(db2);
    }

    @Override // v1.j.a
    public void d(v1.i db2) {
        kotlin.jvm.internal.n.e(db2, "db");
        boolean a10 = f24677g.a(db2);
        this.f24679d.a(db2);
        if (!a10) {
            c g10 = this.f24679d.g(db2);
            if (!g10.f24683a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g10.f24684b);
            }
        }
        j(db2);
        this.f24679d.c(db2);
    }

    @Override // v1.j.a
    public void e(v1.i db2, int i10, int i11) {
        kotlin.jvm.internal.n.e(db2, "db");
        g(db2, i10, i11);
    }

    @Override // v1.j.a
    public void f(v1.i db2) {
        kotlin.jvm.internal.n.e(db2, "db");
        super.f(db2);
        h(db2);
        this.f24679d.d(db2);
        this.f24678c = null;
    }

    @Override // v1.j.a
    public void g(v1.i db2, int i10, int i11) {
        List<s1.b> d10;
        kotlin.jvm.internal.n.e(db2, "db");
        f fVar = this.f24678c;
        boolean z10 = false;
        if (fVar != null && (d10 = fVar.f24560d.d(i10, i11)) != null) {
            this.f24679d.f(db2);
            Iterator<T> it = d10.iterator();
            while (it.hasNext()) {
                ((s1.b) it.next()).a(db2);
            }
            c g10 = this.f24679d.g(db2);
            if (!g10.f24683a) {
                throw new IllegalStateException("Migration didn't properly handle: " + g10.f24684b);
            }
            this.f24679d.e(db2);
            j(db2);
            z10 = true;
        }
        if (z10) {
            return;
        }
        f fVar2 = this.f24678c;
        if (fVar2 != null && !fVar2.a(i10, i11)) {
            this.f24679d.b(db2);
            this.f24679d.a(db2);
            return;
        }
        throw new IllegalStateException("A migration from " + i10 + " to " + i11 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }
}

package p322r1;

import android.database.Cursor;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import mk.C9602b;
import p344s1.AbstractC10767b;
import p391v1.C11602a;
import p391v1.InterfaceC11610i;
import p391v1.InterfaceC11611j;

/* renamed from: r1.w */
/* loaded from: classes.dex */
public class C10606w extends InterfaceC11611j.a {

    /* renamed from: g */
    public static final a f26791g = new a(null);

    /* renamed from: c */
    private C10588f f26792c;

    /* renamed from: d */
    private final b f26793d;

    /* renamed from: e */
    private final String f26794e;

    /* renamed from: f */
    private final String f26795f;

    /* renamed from: r1.w$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final boolean m32296a(InterfaceC11610i db2) {
            C9322n.m27781e(db2, "db");
            Cursor mo32135S0 = db2.mo32135S0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                boolean z10 = false;
                if (mo32135S0.moveToFirst()) {
                    if (mo32135S0.getInt(0) == 0) {
                        z10 = true;
                    }
                }
                C9602b.m28593a(mo32135S0, null);
                return z10;
            } finally {
            }
        }

        /* renamed from: b */
        public final boolean m32297b(InterfaceC11610i db2) {
            C9322n.m27781e(db2, "db");
            Cursor mo32135S0 = db2.mo32135S0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                boolean z10 = false;
                if (mo32135S0.moveToFirst()) {
                    if (mo32135S0.getInt(0) != 0) {
                        z10 = true;
                    }
                }
                C9602b.m28593a(mo32135S0, null);
                return z10;
            } finally {
            }
        }
    }

    /* renamed from: r1.w$b */
    /* loaded from: classes.dex */
    public static abstract class b {

        /* renamed from: a */
        public final int f26796a;

        public b(int i10) {
            this.f26796a = i10;
        }

        /* renamed from: a */
        public abstract void mo8581a(InterfaceC11610i interfaceC11610i);

        /* renamed from: b */
        public abstract void mo8582b(InterfaceC11610i interfaceC11610i);

        /* renamed from: c */
        public abstract void mo8583c(InterfaceC11610i interfaceC11610i);

        /* renamed from: d */
        public abstract void mo8584d(InterfaceC11610i interfaceC11610i);

        /* renamed from: e */
        public abstract void mo8585e(InterfaceC11610i interfaceC11610i);

        /* renamed from: f */
        public abstract void mo8586f(InterfaceC11610i interfaceC11610i);

        /* renamed from: g */
        public abstract c mo8587g(InterfaceC11610i interfaceC11610i);
    }

    /* renamed from: r1.w$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public final boolean f26797a;

        /* renamed from: b */
        public final String f26798b;

        public c(boolean z10, String str) {
            this.f26797a = z10;
            this.f26798b = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10606w(C10588f configuration, b delegate, String identityHash, String legacyHash) {
        super(delegate.f26796a);
        C9322n.m27781e(configuration, "configuration");
        C9322n.m27781e(delegate, "delegate");
        C9322n.m27781e(identityHash, "identityHash");
        C9322n.m27781e(legacyHash, "legacyHash");
        this.f26792c = configuration;
        this.f26793d = delegate;
        this.f26794e = identityHash;
        this.f26795f = legacyHash;
    }

    /* renamed from: h */
    private final void m32288h(InterfaceC11610i interfaceC11610i) {
        if (!f26791g.m32297b(interfaceC11610i)) {
            c mo8587g = this.f26793d.mo8587g(interfaceC11610i);
            if (mo8587g.f26797a) {
                this.f26793d.mo8585e(interfaceC11610i);
                m32290j(interfaceC11610i);
                return;
            } else {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + mo8587g.f26798b);
            }
        }
        Cursor mo32138e0 = interfaceC11610i.mo32138e0(new C11602a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        try {
            String string = mo32138e0.moveToFirst() ? mo32138e0.getString(0) : null;
            C9602b.m28593a(mo32138e0, null);
            if (C9322n.m27777a(this.f26794e, string) || C9322n.m27777a(this.f26795f, string)) {
                return;
            }
            throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + this.f26794e + ", found: " + string);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C9602b.m28593a(mo32138e0, th2);
                throw th3;
            }
        }
    }

    /* renamed from: i */
    private final void m32289i(InterfaceC11610i interfaceC11610i) {
        interfaceC11610i.mo32144x("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    /* renamed from: j */
    private final void m32290j(InterfaceC11610i interfaceC11610i) {
        m32289i(interfaceC11610i);
        interfaceC11610i.mo32144x(C10605v.m32287a(this.f26794e));
    }

    @Override // p391v1.InterfaceC11611j.a
    /* renamed from: b */
    public void mo32291b(InterfaceC11610i db2) {
        C9322n.m27781e(db2, "db");
        super.mo32291b(db2);
    }

    @Override // p391v1.InterfaceC11611j.a
    /* renamed from: d */
    public void mo32292d(InterfaceC11610i db2) {
        C9322n.m27781e(db2, "db");
        boolean m32296a = f26791g.m32296a(db2);
        this.f26793d.mo8581a(db2);
        if (!m32296a) {
            c mo8587g = this.f26793d.mo8587g(db2);
            if (!mo8587g.f26797a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + mo8587g.f26798b);
            }
        }
        m32290j(db2);
        this.f26793d.mo8583c(db2);
    }

    @Override // p391v1.InterfaceC11611j.a
    /* renamed from: e */
    public void mo32293e(InterfaceC11610i db2, int i10, int i11) {
        C9322n.m27781e(db2, "db");
        mo32295g(db2, i10, i11);
    }

    @Override // p391v1.InterfaceC11611j.a
    /* renamed from: f */
    public void mo32294f(InterfaceC11610i db2) {
        C9322n.m27781e(db2, "db");
        super.mo32294f(db2);
        m32288h(db2);
        this.f26793d.mo8584d(db2);
        this.f26792c = null;
    }

    @Override // p391v1.InterfaceC11611j.a
    /* renamed from: g */
    public void mo32295g(InterfaceC11610i db2, int i10, int i11) {
        List<AbstractC10767b> m32283d;
        C9322n.m27781e(db2, "db");
        C10588f c10588f = this.f26792c;
        boolean z10 = false;
        if (c10588f != null && (m32283d = c10588f.f26674d.m32283d(i10, i11)) != null) {
            this.f26793d.mo8586f(db2);
            Iterator<T> it = m32283d.iterator();
            while (it.hasNext()) {
                ((AbstractC10767b) it.next()).mo8672a(db2);
            }
            c mo8587g = this.f26793d.mo8587g(db2);
            if (!mo8587g.f26797a) {
                throw new IllegalStateException("Migration didn't properly handle: " + mo8587g.f26798b);
            }
            this.f26793d.mo8585e(db2);
            m32290j(db2);
            z10 = true;
        }
        if (z10) {
            return;
        }
        C10588f c10588f2 = this.f26792c;
        if (c10588f2 != null && !c10588f2.m32177a(i10, i11)) {
            this.f26793d.mo8582b(db2);
            this.f26793d.mo8581a(db2);
            return;
        }
        throw new IllegalStateException("A migration from " + i10 + " to " + i11 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }
}

package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public class e0 {

    /* renamed from: e, reason: collision with root package name */
    private static final p f4105e = p.b();

    /* renamed from: a, reason: collision with root package name */
    private h f4106a;

    /* renamed from: b, reason: collision with root package name */
    private p f4107b;

    /* renamed from: c, reason: collision with root package name */
    protected volatile r0 f4108c;

    /* renamed from: d, reason: collision with root package name */
    private volatile h f4109d;

    protected void a(r0 r0Var) {
        h hVar;
        if (this.f4108c != null) {
            return;
        }
        synchronized (this) {
            if (this.f4108c != null) {
                return;
            }
            try {
                if (this.f4106a != null) {
                    this.f4108c = r0Var.g().a(this.f4106a, this.f4107b);
                    hVar = this.f4106a;
                } else {
                    this.f4108c = r0Var;
                    hVar = h.f4120b;
                }
                this.f4109d = hVar;
            } catch (b0 unused) {
                this.f4108c = r0Var;
                this.f4109d = h.f4120b;
            }
        }
    }

    public int b() {
        if (this.f4109d != null) {
            return this.f4109d.size();
        }
        h hVar = this.f4106a;
        if (hVar != null) {
            return hVar.size();
        }
        if (this.f4108c != null) {
            return this.f4108c.c();
        }
        return 0;
    }

    public r0 c(r0 r0Var) {
        a(r0Var);
        return this.f4108c;
    }

    public r0 d(r0 r0Var) {
        r0 r0Var2 = this.f4108c;
        this.f4106a = null;
        this.f4109d = null;
        this.f4108c = r0Var;
        return r0Var2;
    }

    public h e() {
        if (this.f4109d != null) {
            return this.f4109d;
        }
        h hVar = this.f4106a;
        if (hVar != null) {
            return hVar;
        }
        synchronized (this) {
            if (this.f4109d != null) {
                return this.f4109d;
            }
            this.f4109d = this.f4108c == null ? h.f4120b : this.f4108c.b();
            return this.f4109d;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        r0 r0Var = this.f4108c;
        r0 r0Var2 = e0Var.f4108c;
        return (r0Var == null && r0Var2 == null) ? e().equals(e0Var.e()) : (r0Var == null || r0Var2 == null) ? r0Var != null ? r0Var.equals(e0Var.c(r0Var.e())) : c(r0Var2.e()).equals(r0Var2) : r0Var.equals(r0Var2);
    }

    public int hashCode() {
        return 1;
    }
}

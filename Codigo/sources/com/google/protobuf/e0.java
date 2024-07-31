package com.google.protobuf;

/* loaded from: classes2.dex */
public class e0 {

    /* renamed from: e, reason: collision with root package name */
    private static final o f13173e = o.b();

    /* renamed from: a, reason: collision with root package name */
    private g f13174a;

    /* renamed from: b, reason: collision with root package name */
    private o f13175b;

    /* renamed from: c, reason: collision with root package name */
    protected volatile r0 f13176c;

    /* renamed from: d, reason: collision with root package name */
    private volatile g f13177d;

    protected void a(r0 r0Var) {
        g gVar;
        if (this.f13176c != null) {
            return;
        }
        synchronized (this) {
            if (this.f13176c != null) {
                return;
            }
            try {
                if (this.f13174a != null) {
                    this.f13176c = r0Var.g().a(this.f13174a, this.f13175b);
                    gVar = this.f13174a;
                } else {
                    this.f13176c = r0Var;
                    gVar = g.f13185b;
                }
                this.f13177d = gVar;
            } catch (b0 unused) {
                this.f13176c = r0Var;
                this.f13177d = g.f13185b;
            }
        }
    }

    public int b() {
        if (this.f13177d != null) {
            return this.f13177d.size();
        }
        g gVar = this.f13174a;
        if (gVar != null) {
            return gVar.size();
        }
        if (this.f13176c != null) {
            return this.f13176c.c();
        }
        return 0;
    }

    public r0 c(r0 r0Var) {
        a(r0Var);
        return this.f13176c;
    }

    public r0 d(r0 r0Var) {
        r0 r0Var2 = this.f13176c;
        this.f13174a = null;
        this.f13177d = null;
        this.f13176c = r0Var;
        return r0Var2;
    }

    public g e() {
        if (this.f13177d != null) {
            return this.f13177d;
        }
        g gVar = this.f13174a;
        if (gVar != null) {
            return gVar;
        }
        synchronized (this) {
            if (this.f13177d != null) {
                return this.f13177d;
            }
            this.f13177d = this.f13176c == null ? g.f13185b : this.f13176c.b();
            return this.f13177d;
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
        r0 r0Var = this.f13176c;
        r0 r0Var2 = e0Var.f13176c;
        return (r0Var == null && r0Var2 == null) ? e().equals(e0Var.e()) : (r0Var == null || r0Var2 == null) ? r0Var != null ? r0Var.equals(e0Var.c(r0Var.e())) : c(r0Var2.e()).equals(r0Var2) : r0Var.equals(r0Var2);
    }

    public int hashCode() {
        return 1;
    }
}

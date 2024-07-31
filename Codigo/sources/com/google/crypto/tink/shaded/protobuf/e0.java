package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes2.dex */
public class e0 {

    /* renamed from: e */
    private static final p f11361e = p.b();

    /* renamed from: a */
    private h f11362a;

    /* renamed from: b */
    private p f11363b;

    /* renamed from: c */
    protected volatile r0 f11364c;

    /* renamed from: d */
    private volatile h f11365d;

    protected void a(r0 r0Var) {
        h hVar;
        if (this.f11364c != null) {
            return;
        }
        synchronized (this) {
            if (this.f11364c != null) {
                return;
            }
            try {
                if (this.f11362a != null) {
                    this.f11364c = r0Var.g().b(this.f11362a, this.f11363b);
                    hVar = this.f11362a;
                } else {
                    this.f11364c = r0Var;
                    hVar = h.f11376b;
                }
                this.f11365d = hVar;
            } catch (b0 unused) {
                this.f11364c = r0Var;
                this.f11365d = h.f11376b;
            }
        }
    }

    public int b() {
        if (this.f11365d != null) {
            return this.f11365d.size();
        }
        h hVar = this.f11362a;
        if (hVar != null) {
            return hVar.size();
        }
        if (this.f11364c != null) {
            return this.f11364c.c();
        }
        return 0;
    }

    public r0 c(r0 r0Var) {
        a(r0Var);
        return this.f11364c;
    }

    public r0 d(r0 r0Var) {
        r0 r0Var2 = this.f11364c;
        this.f11362a = null;
        this.f11365d = null;
        this.f11364c = r0Var;
        return r0Var2;
    }

    public h e() {
        if (this.f11365d != null) {
            return this.f11365d;
        }
        h hVar = this.f11362a;
        if (hVar != null) {
            return hVar;
        }
        synchronized (this) {
            if (this.f11365d != null) {
                return this.f11365d;
            }
            this.f11365d = this.f11364c == null ? h.f11376b : this.f11364c.b();
            return this.f11365d;
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
        r0 r0Var = this.f11364c;
        r0 r0Var2 = e0Var.f11364c;
        return (r0Var == null && r0Var2 == null) ? e().equals(e0Var.e()) : (r0Var == null || r0Var2 == null) ? r0Var != null ? r0Var.equals(e0Var.c(r0Var.e())) : c(r0Var2.e()).equals(r0Var2) : r0Var.equals(r0Var2);
    }

    public int hashCode() {
        return 1;
    }
}

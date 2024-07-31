package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.e0 */
/* loaded from: classes.dex */
public class C1159e0 {

    /* renamed from: e */
    private static final C1191p f4816e = C1191p.m6272b();

    /* renamed from: a */
    private AbstractC1167h f4817a;

    /* renamed from: b */
    private C1191p f4818b;

    /* renamed from: c */
    protected volatile InterfaceC1198r0 f4819c;

    /* renamed from: d */
    private volatile AbstractC1167h f4820d;

    /* renamed from: a */
    protected void m5759a(InterfaceC1198r0 interfaceC1198r0) {
        AbstractC1167h abstractC1167h;
        if (this.f4819c != null) {
            return;
        }
        synchronized (this) {
            if (this.f4819c != null) {
                return;
            }
            try {
                if (this.f4817a != null) {
                    this.f4819c = interfaceC1198r0.mo6311g().mo5661a(this.f4817a, this.f4818b);
                    abstractC1167h = this.f4817a;
                } else {
                    this.f4819c = interfaceC1198r0;
                    abstractC1167h = AbstractC1167h.f4831b;
                }
                this.f4820d = abstractC1167h;
            } catch (C1150b0 unused) {
                this.f4819c = interfaceC1198r0;
                this.f4820d = AbstractC1167h.f4831b;
            }
        }
    }

    /* renamed from: b */
    public int m5760b() {
        if (this.f4820d != null) {
            return this.f4820d.size();
        }
        AbstractC1167h abstractC1167h = this.f4817a;
        if (abstractC1167h != null) {
            return abstractC1167h.size();
        }
        if (this.f4819c != null) {
            return this.f4819c.mo6309c();
        }
        return 0;
    }

    /* renamed from: c */
    public InterfaceC1198r0 m5761c(InterfaceC1198r0 interfaceC1198r0) {
        m5759a(interfaceC1198r0);
        return this.f4819c;
    }

    /* renamed from: d */
    public InterfaceC1198r0 m5762d(InterfaceC1198r0 interfaceC1198r0) {
        InterfaceC1198r0 interfaceC1198r02 = this.f4819c;
        this.f4817a = null;
        this.f4820d = null;
        this.f4819c = interfaceC1198r0;
        return interfaceC1198r02;
    }

    /* renamed from: e */
    public AbstractC1167h m5763e() {
        if (this.f4820d != null) {
            return this.f4820d;
        }
        AbstractC1167h abstractC1167h = this.f4817a;
        if (abstractC1167h != null) {
            return abstractC1167h;
        }
        synchronized (this) {
            if (this.f4820d != null) {
                return this.f4820d;
            }
            this.f4820d = this.f4819c == null ? AbstractC1167h.f4831b : this.f4819c.mo5631b();
            return this.f4820d;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1159e0)) {
            return false;
        }
        C1159e0 c1159e0 = (C1159e0) obj;
        InterfaceC1198r0 interfaceC1198r0 = this.f4819c;
        InterfaceC1198r0 interfaceC1198r02 = c1159e0.f4819c;
        return (interfaceC1198r0 == null && interfaceC1198r02 == null) ? m5763e().equals(c1159e0.m5763e()) : (interfaceC1198r0 == null || interfaceC1198r02 == null) ? interfaceC1198r0 != null ? interfaceC1198r0.equals(c1159e0.m5761c(interfaceC1198r0.mo6378e())) : m5761c(interfaceC1198r02.mo6378e()).equals(interfaceC1198r02) : interfaceC1198r0.equals(interfaceC1198r02);
    }

    public int hashCode() {
        return 1;
    }
}

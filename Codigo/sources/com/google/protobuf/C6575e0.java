package com.google.protobuf;

/* renamed from: com.google.protobuf.e0 */
/* loaded from: classes2.dex */
public class C6575e0 {

    /* renamed from: e */
    private static final C6604o f14447e = C6604o.m18973b();

    /* renamed from: a */
    private AbstractC6580g f14448a;

    /* renamed from: b */
    private C6604o f14449b;

    /* renamed from: c */
    protected volatile InterfaceC6614r0 f14450c;

    /* renamed from: d */
    private volatile AbstractC6580g f14451d;

    /* renamed from: a */
    protected void m18444a(InterfaceC6614r0 interfaceC6614r0) {
        AbstractC6580g abstractC6580g;
        if (this.f14450c != null) {
            return;
        }
        synchronized (this) {
            if (this.f14450c != null) {
                return;
            }
            try {
                if (this.f14448a != null) {
                    this.f14450c = interfaceC6614r0.mo19035g().mo18388a(this.f14448a, this.f14449b);
                    abstractC6580g = this.f14448a;
                } else {
                    this.f14450c = interfaceC6614r0;
                    abstractC6580g = AbstractC6580g.f14459b;
                }
                this.f14451d = abstractC6580g;
            } catch (C6566b0 unused) {
                this.f14450c = interfaceC6614r0;
                this.f14451d = AbstractC6580g.f14459b;
            }
        }
    }

    /* renamed from: b */
    public int m18445b() {
        if (this.f14451d != null) {
            return this.f14451d.size();
        }
        AbstractC6580g abstractC6580g = this.f14448a;
        if (abstractC6580g != null) {
            return abstractC6580g.size();
        }
        if (this.f14450c != null) {
            return this.f14450c.mo19033c();
        }
        return 0;
    }

    /* renamed from: c */
    public InterfaceC6614r0 m18446c(InterfaceC6614r0 interfaceC6614r0) {
        m18444a(interfaceC6614r0);
        return this.f14450c;
    }

    /* renamed from: d */
    public InterfaceC6614r0 m18447d(InterfaceC6614r0 interfaceC6614r0) {
        InterfaceC6614r0 interfaceC6614r02 = this.f14450c;
        this.f14448a = null;
        this.f14451d = null;
        this.f14450c = interfaceC6614r0;
        return interfaceC6614r02;
    }

    /* renamed from: e */
    public AbstractC6580g m18448e() {
        if (this.f14451d != null) {
            return this.f14451d;
        }
        AbstractC6580g abstractC6580g = this.f14448a;
        if (abstractC6580g != null) {
            return abstractC6580g;
        }
        synchronized (this) {
            if (this.f14451d != null) {
                return this.f14451d;
            }
            this.f14451d = this.f14450c == null ? AbstractC6580g.f14459b : this.f14450c.mo18374b();
            return this.f14451d;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6575e0)) {
            return false;
        }
        C6575e0 c6575e0 = (C6575e0) obj;
        InterfaceC6614r0 interfaceC6614r0 = this.f14450c;
        InterfaceC6614r0 interfaceC6614r02 = c6575e0.f14450c;
        return (interfaceC6614r0 == null && interfaceC6614r02 == null) ? m18448e().equals(c6575e0.m18448e()) : (interfaceC6614r0 == null || interfaceC6614r02 == null) ? interfaceC6614r0 != null ? interfaceC6614r0.equals(c6575e0.m18446c(interfaceC6614r0.mo19105e())) : m18446c(interfaceC6614r02.mo19105e()).equals(interfaceC6614r02) : interfaceC6614r0.equals(interfaceC6614r02);
    }

    public int hashCode() {
        return 1;
    }
}

package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.e0 */
/* loaded from: classes2.dex */
public class C5962e0 {

    /* renamed from: e */
    private static final C5994p f12576e = C5994p.m15932b();

    /* renamed from: a */
    private AbstractC5970h f12577a;

    /* renamed from: b */
    private C5994p f12578b;

    /* renamed from: c */
    protected volatile InterfaceC6001r0 f12579c;

    /* renamed from: d */
    private volatile AbstractC5970h f12580d;

    /* renamed from: a */
    protected void m15395a(InterfaceC6001r0 interfaceC6001r0) {
        AbstractC5970h abstractC5970h;
        if (this.f12579c != null) {
            return;
        }
        synchronized (this) {
            if (this.f12579c != null) {
                return;
            }
            try {
                if (this.f12577a != null) {
                    this.f12579c = interfaceC6001r0.mo15970g().mo15320b(this.f12577a, this.f12578b);
                    abstractC5970h = this.f12577a;
                } else {
                    this.f12579c = interfaceC6001r0;
                    abstractC5970h = AbstractC5970h.f12591b;
                }
                this.f12580d = abstractC5970h;
            } catch (C5953b0 unused) {
                this.f12579c = interfaceC6001r0;
                this.f12580d = AbstractC5970h.f12591b;
            }
        }
    }

    /* renamed from: b */
    public int m15396b() {
        if (this.f12580d != null) {
            return this.f12580d.size();
        }
        AbstractC5970h abstractC5970h = this.f12577a;
        if (abstractC5970h != null) {
            return abstractC5970h.size();
        }
        if (this.f12579c != null) {
            return this.f12579c.mo15968c();
        }
        return 0;
    }

    /* renamed from: c */
    public InterfaceC6001r0 m15397c(InterfaceC6001r0 interfaceC6001r0) {
        m15395a(interfaceC6001r0);
        return this.f12579c;
    }

    /* renamed from: d */
    public InterfaceC6001r0 m15398d(InterfaceC6001r0 interfaceC6001r0) {
        InterfaceC6001r0 interfaceC6001r02 = this.f12579c;
        this.f12577a = null;
        this.f12580d = null;
        this.f12579c = interfaceC6001r0;
        return interfaceC6001r02;
    }

    /* renamed from: e */
    public AbstractC5970h m15399e() {
        if (this.f12580d != null) {
            return this.f12580d;
        }
        AbstractC5970h abstractC5970h = this.f12577a;
        if (abstractC5970h != null) {
            return abstractC5970h;
        }
        synchronized (this) {
            if (this.f12580d != null) {
                return this.f12580d;
            }
            this.f12580d = this.f12579c == null ? AbstractC5970h.f12591b : this.f12579c.mo15292b();
            return this.f12580d;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5962e0)) {
            return false;
        }
        C5962e0 c5962e0 = (C5962e0) obj;
        InterfaceC6001r0 interfaceC6001r0 = this.f12579c;
        InterfaceC6001r0 interfaceC6001r02 = c5962e0.f12579c;
        return (interfaceC6001r0 == null && interfaceC6001r02 == null) ? m15399e().equals(c5962e0.m15399e()) : (interfaceC6001r0 == null || interfaceC6001r02 == null) ? interfaceC6001r0 != null ? interfaceC6001r0.equals(c5962e0.m15397c(interfaceC6001r0.mo16043e())) : m15397c(interfaceC6001r02.mo16043e()).equals(interfaceC6001r02) : interfaceC6001r0.equals(interfaceC6001r02);
    }

    public int hashCode() {
        return 1;
    }
}

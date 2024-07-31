package p363t8;

/* renamed from: t8.g */
/* loaded from: classes.dex */
public class C11149g {

    /* renamed from: a */
    private final InterfaceC11143d f28961a;

    /* renamed from: b */
    private boolean f28962b;

    public C11149g() {
        this(InterfaceC11143d.f28940a);
    }

    public C11149g(InterfaceC11143d interfaceC11143d) {
        this.f28961a = interfaceC11143d;
    }

    /* renamed from: a */
    public synchronized void m34717a() {
        while (!this.f28962b) {
            wait();
        }
    }

    /* renamed from: b */
    public synchronized void m34718b() {
        boolean z10 = false;
        while (!this.f28962b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: c */
    public synchronized boolean m34719c() {
        boolean z10;
        z10 = this.f28962b;
        this.f28962b = false;
        return z10;
    }

    /* renamed from: d */
    public synchronized boolean m34720d() {
        return this.f28962b;
    }

    /* renamed from: e */
    public synchronized boolean m34721e() {
        if (this.f28962b) {
            return false;
        }
        this.f28962b = true;
        notifyAll();
        return true;
    }
}

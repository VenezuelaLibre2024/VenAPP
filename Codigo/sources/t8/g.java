package t8;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private final d f26665a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f26666b;

    public g() {
        this(d.f26644a);
    }

    public g(d dVar) {
        this.f26665a = dVar;
    }

    public synchronized void a() {
        while (!this.f26666b) {
            wait();
        }
    }

    public synchronized void b() {
        boolean z10 = false;
        while (!this.f26666b) {
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

    public synchronized boolean c() {
        boolean z10;
        z10 = this.f26666b;
        this.f26666b = false;
        return z10;
    }

    public synchronized boolean d() {
        return this.f26666b;
    }

    public synchronized boolean e() {
        if (this.f26666b) {
            return false;
        }
        this.f26666b = true;
        notifyAll();
        return true;
    }
}

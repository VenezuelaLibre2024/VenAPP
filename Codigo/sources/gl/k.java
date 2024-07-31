package gl;

import zk.o0;

/* loaded from: classes3.dex */
public final class k extends h {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f16329c;

    public k(Runnable runnable, long j10, i iVar) {
        super(j10, iVar);
        this.f16329c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f16329c.run();
        } finally {
            this.f16327b.a();
        }
    }

    public String toString() {
        return "Task[" + o0.a(this.f16329c) + '@' + o0.b(this.f16329c) + ", " + this.f16326a + ", " + this.f16327b + ']';
    }
}

package gl;

import p494zk.C13092o0;

/* renamed from: gl.k */
/* loaded from: classes3.dex */
public final class C7599k extends AbstractRunnableC7596h {

    /* renamed from: c */
    public final Runnable f17966c;

    public C7599k(Runnable runnable, long j10, InterfaceC7597i interfaceC7597i) {
        super(j10, interfaceC7597i);
        this.f17966c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f17966c.run();
        } finally {
            this.f17964b.mo23093a();
        }
    }

    public String toString() {
        return "Task[" + C13092o0.m43273a(this.f17966c) + '@' + C13092o0.m43274b(this.f17966c) + ", " + this.f17963a + ", " + this.f17964b + ']';
    }
}

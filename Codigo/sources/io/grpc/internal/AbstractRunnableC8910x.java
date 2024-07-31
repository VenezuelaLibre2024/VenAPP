package io.grpc.internal;

import vi.C11942r;

/* renamed from: io.grpc.internal.x */
/* loaded from: classes3.dex */
abstract class AbstractRunnableC8910x implements Runnable {

    /* renamed from: a */
    private final C11942r f20942a;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractRunnableC8910x(C11942r c11942r) {
        this.f20942a = c11942r;
    }

    /* renamed from: a */
    public abstract void mo25535a();

    @Override // java.lang.Runnable
    public final void run() {
        C11942r m38246b = this.f20942a.m38246b();
        try {
            mo25535a();
        } finally {
            this.f20942a.m38248f(m38246b);
        }
    }
}

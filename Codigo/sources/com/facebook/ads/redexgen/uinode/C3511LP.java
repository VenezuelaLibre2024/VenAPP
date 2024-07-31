package com.facebook.ads.redexgen.uinode;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.LP */
/* loaded from: assets/audience_network.dex */
public final class C3511LP implements Closeable {
    public C3510LO A00;
    public boolean A01;
    public final C3509LN A02;
    public final Runnable A03;

    public C3511LP(long j10, Runnable runnable) {
        C3509LN c3509ln = new C3509LN(j10);
        this.A02 = c3509ln;
        c3509ln.A02();
        this.A03 = runnable;
        this.A01 = false;
    }

    private final synchronized void A03() {
        if (this.A00 == null && !this.A01) {
            this.A00 = new C3510LO(this);
        }
    }

    public final C3509LN A04() {
        return this.A02;
    }

    public final synchronized void A05() {
        if (this.A01) {
            return;
        }
        if (this.A00 == null) {
            this.A00 = new C3510LO(this);
        }
        this.A00.A00();
    }

    public final synchronized void A06() {
        if (this.A02.A05() && !this.A01) {
            A03();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C3510LO executing;
        synchronized (this) {
            this.A01 = true;
            executing = this.A00;
        }
        if (executing != null) {
            executing.close();
        }
    }
}

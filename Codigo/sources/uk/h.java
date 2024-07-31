package uk;

import dk.f0;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class h extends f0 {

    /* renamed from: a, reason: collision with root package name */
    private final long f27801a;

    /* renamed from: b, reason: collision with root package name */
    private final long f27802b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f27803c;

    /* renamed from: d, reason: collision with root package name */
    private long f27804d;

    public h(long j10, long j11, long j12) {
        this.f27801a = j12;
        this.f27802b = j11;
        boolean z10 = true;
        if (j12 <= 0 ? j10 < j11 : j10 > j11) {
            z10 = false;
        }
        this.f27803c = z10;
        this.f27804d = z10 ? j10 : j11;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f27803c;
    }

    @Override // dk.f0
    public long nextLong() {
        long j10 = this.f27804d;
        if (j10 != this.f27802b) {
            this.f27804d = this.f27801a + j10;
        } else {
            if (!this.f27803c) {
                throw new NoSuchElementException();
            }
            this.f27803c = false;
        }
        return j10;
    }
}

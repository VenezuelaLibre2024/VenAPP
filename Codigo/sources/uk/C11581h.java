package uk;

import dk.AbstractC7008f0;
import java.util.NoSuchElementException;

/* renamed from: uk.h */
/* loaded from: classes3.dex */
public final class C11581h extends AbstractC7008f0 {

    /* renamed from: a */
    private final long f30124a;

    /* renamed from: b */
    private final long f30125b;

    /* renamed from: c */
    private boolean f30126c;

    /* renamed from: d */
    private long f30127d;

    public C11581h(long j10, long j11, long j12) {
        this.f30124a = j12;
        this.f30125b = j11;
        boolean z10 = true;
        if (j12 <= 0 ? j10 < j11 : j10 > j11) {
            z10 = false;
        }
        this.f30126c = z10;
        this.f30127d = z10 ? j10 : j11;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f30126c;
    }

    @Override // dk.AbstractC7008f0
    public long nextLong() {
        long j10 = this.f30127d;
        if (j10 != this.f30125b) {
            this.f30127d = this.f30124a + j10;
        } else {
            if (!this.f30126c) {
                throw new NoSuchElementException();
            }
            this.f30126c = false;
        }
        return j10;
    }
}

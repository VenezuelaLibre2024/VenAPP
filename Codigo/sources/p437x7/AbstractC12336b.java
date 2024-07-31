package p437x7;

import java.util.NoSuchElementException;

/* renamed from: x7.b */
/* loaded from: classes.dex */
public abstract class AbstractC12336b implements InterfaceC12349o {

    /* renamed from: b */
    private final long f33090b;

    /* renamed from: c */
    private final long f33091c;

    /* renamed from: d */
    private long f33092d;

    public AbstractC12336b(long j10, long j11) {
        this.f33090b = j10;
        this.f33091c = j11;
        m39889f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final void m39886c() {
        long j10 = this.f33092d;
        if (j10 < this.f33090b || j10 > this.f33091c) {
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final long m39887d() {
        return this.f33092d;
    }

    /* renamed from: e */
    public boolean m39888e() {
        return this.f33092d > this.f33091c;
    }

    /* renamed from: f */
    public void m39889f() {
        this.f33092d = this.f33090b - 1;
    }

    @Override // p437x7.InterfaceC12349o
    public boolean next() {
        this.f33092d++;
        return !m39888e();
    }
}

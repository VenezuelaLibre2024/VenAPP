package x7;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class b implements o {

    /* renamed from: b, reason: collision with root package name */
    private final long f30578b;

    /* renamed from: c, reason: collision with root package name */
    private final long f30579c;

    /* renamed from: d, reason: collision with root package name */
    private long f30580d;

    public b(long j10, long j11) {
        this.f30578b = j10;
        this.f30579c = j11;
        f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c() {
        long j10 = this.f30580d;
        if (j10 < this.f30578b || j10 > this.f30579c) {
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long d() {
        return this.f30580d;
    }

    public boolean e() {
        return this.f30580d > this.f30579c;
    }

    public void f() {
        this.f30580d = this.f30578b - 1;
    }

    @Override // x7.o
    public boolean next() {
        this.f30580d++;
        return !e();
    }
}

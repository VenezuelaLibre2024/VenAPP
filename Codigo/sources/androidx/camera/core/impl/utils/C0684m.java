package androidx.camera.core.impl.utils;

/* renamed from: androidx.camera.core.impl.utils.m */
/* loaded from: classes.dex */
final class C0684m {

    /* renamed from: a */
    private final long f2999a;

    /* renamed from: b */
    private final long f3000b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0684m(double d10) {
        this((long) (d10 * 10000.0d), 10000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0684m(long j10, long j11) {
        this.f2999a = j10;
        this.f3000b = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public long m3331a() {
        return this.f3000b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public long m3332b() {
        return this.f2999a;
    }

    public String toString() {
        return this.f2999a + "/" + this.f3000b;
    }
}

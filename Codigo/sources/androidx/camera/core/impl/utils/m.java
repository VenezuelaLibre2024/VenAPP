package androidx.camera.core.impl.utils;

/* loaded from: classes.dex */
final class m {

    /* renamed from: a, reason: collision with root package name */
    private final long f2655a;

    /* renamed from: b, reason: collision with root package name */
    private final long f2656b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(double d10) {
        this((long) (d10 * 10000.0d), 10000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(long j10, long j11) {
        this.f2655a = j10;
        this.f2656b = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long a() {
        return this.f2656b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long b() {
        return this.f2655a;
    }

    public String toString() {
        return this.f2655a + "/" + this.f2656b;
    }
}

package com.google.android.play.integrity.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class q extends r {

    /* renamed from: a, reason: collision with root package name */
    private final int f11028a;

    /* renamed from: b, reason: collision with root package name */
    private final long f11029b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(int i10, long j10) {
        this.f11028a = i10;
        this.f11029b = j10;
    }

    @Override // com.google.android.play.integrity.internal.r
    public final int a() {
        return this.f11028a;
    }

    @Override // com.google.android.play.integrity.internal.r
    public final long b() {
        return this.f11029b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.f11028a == rVar.a() && this.f11029b == rVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f11028a ^ 1000003;
        long j10 = this.f11029b;
        return (i10 * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.f11028a + ", eventTimestamp=" + this.f11029b + "}";
    }
}

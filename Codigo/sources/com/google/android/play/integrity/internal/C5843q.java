package com.google.android.play.integrity.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.integrity.internal.q */
/* loaded from: classes2.dex */
public final class C5843q extends AbstractC5844r {

    /* renamed from: a */
    private final int f12243a;

    /* renamed from: b */
    private final long f12244b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5843q(int i10, long j10) {
        this.f12243a = i10;
        this.f12244b = j10;
    }

    @Override // com.google.android.play.integrity.internal.AbstractC5844r
    /* renamed from: a */
    public final int mo14697a() {
        return this.f12243a;
    }

    @Override // com.google.android.play.integrity.internal.AbstractC5844r
    /* renamed from: b */
    public final long mo14698b() {
        return this.f12244b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5844r) {
            AbstractC5844r abstractC5844r = (AbstractC5844r) obj;
            if (this.f12243a == abstractC5844r.mo14697a() && this.f12244b == abstractC5844r.mo14698b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f12243a ^ 1000003;
        long j10 = this.f12244b;
        return (i10 * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.f12243a + ", eventTimestamp=" + this.f12244b + "}";
    }
}

package p065df;

import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: df.e */
/* loaded from: classes2.dex */
public final class C6911e {

    /* renamed from: a */
    private final EnumC6909d f15394a;

    /* renamed from: b */
    private final EnumC6909d f15395b;

    /* renamed from: c */
    private final double f15396c;

    public C6911e() {
        this(null, null, 0.0d, 7, null);
    }

    public C6911e(EnumC6909d performance, EnumC6909d crashlytics, double d10) {
        C9322n.m27781e(performance, "performance");
        C9322n.m27781e(crashlytics, "crashlytics");
        this.f15394a = performance;
        this.f15395b = crashlytics;
        this.f15396c = d10;
    }

    public /* synthetic */ C6911e(EnumC6909d enumC6909d, EnumC6909d enumC6909d2, double d10, int i10, C9315g c9315g) {
        this((i10 & 1) != 0 ? EnumC6909d.COLLECTION_SDK_NOT_INSTALLED : enumC6909d, (i10 & 2) != 0 ? EnumC6909d.COLLECTION_SDK_NOT_INSTALLED : enumC6909d2, (i10 & 4) != 0 ? 1.0d : d10);
    }

    /* renamed from: a */
    public final EnumC6909d m20003a() {
        return this.f15395b;
    }

    /* renamed from: b */
    public final EnumC6909d m20004b() {
        return this.f15394a;
    }

    /* renamed from: c */
    public final double m20005c() {
        return this.f15396c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6911e)) {
            return false;
        }
        C6911e c6911e = (C6911e) obj;
        return this.f15394a == c6911e.f15394a && this.f15395b == c6911e.f15395b && C9322n.m27777a(Double.valueOf(this.f15396c), Double.valueOf(c6911e.f15396c));
    }

    public int hashCode() {
        return (((this.f15394a.hashCode() * 31) + this.f15395b.hashCode()) * 31) + Double.hashCode(this.f15396c);
    }

    public String toString() {
        return "DataCollectionStatus(performance=" + this.f15394a + ", crashlytics=" + this.f15395b + ", sessionSamplingRate=" + this.f15396c + ')';
    }
}

package t6;

import v7.a0;

/* loaded from: classes.dex */
final class j2 {

    /* renamed from: a, reason: collision with root package name */
    public final a0.b f26237a;

    /* renamed from: b, reason: collision with root package name */
    public final long f26238b;

    /* renamed from: c, reason: collision with root package name */
    public final long f26239c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26240d;

    /* renamed from: e, reason: collision with root package name */
    public final long f26241e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f26242f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f26243g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f26244h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f26245i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j2(a0.b bVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = false;
        t8.a.a(!z13 || z11);
        t8.a.a(!z12 || z11);
        if (!z10 || (!z11 && !z12 && !z13)) {
            z14 = true;
        }
        t8.a.a(z14);
        this.f26237a = bVar;
        this.f26238b = j10;
        this.f26239c = j11;
        this.f26240d = j12;
        this.f26241e = j13;
        this.f26242f = z10;
        this.f26243g = z11;
        this.f26244h = z12;
        this.f26245i = z13;
    }

    public j2 a(long j10) {
        return j10 == this.f26239c ? this : new j2(this.f26237a, this.f26238b, j10, this.f26240d, this.f26241e, this.f26242f, this.f26243g, this.f26244h, this.f26245i);
    }

    public j2 b(long j10) {
        return j10 == this.f26238b ? this : new j2(this.f26237a, j10, this.f26239c, this.f26240d, this.f26241e, this.f26242f, this.f26243g, this.f26244h, this.f26245i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j2.class != obj.getClass()) {
            return false;
        }
        j2 j2Var = (j2) obj;
        return this.f26238b == j2Var.f26238b && this.f26239c == j2Var.f26239c && this.f26240d == j2Var.f26240d && this.f26241e == j2Var.f26241e && this.f26242f == j2Var.f26242f && this.f26243g == j2Var.f26243g && this.f26244h == j2Var.f26244h && this.f26245i == j2Var.f26245i && t8.r0.c(this.f26237a, j2Var.f26237a);
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f26237a.hashCode()) * 31) + ((int) this.f26238b)) * 31) + ((int) this.f26239c)) * 31) + ((int) this.f26240d)) * 31) + ((int) this.f26241e)) * 31) + (this.f26242f ? 1 : 0)) * 31) + (this.f26243g ? 1 : 0)) * 31) + (this.f26244h ? 1 : 0)) * 31) + (this.f26245i ? 1 : 0);
    }
}

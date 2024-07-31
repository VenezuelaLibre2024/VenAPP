package io.grpc.internal;

import com.google.common.collect.AbstractC5855a0;
import java.util.Set;
import p082eb.C7153i;
import p082eb.C7155k;
import vi.C11915g1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.grpc.internal.z1 */
/* loaded from: classes3.dex */
public final class C8918z1 {

    /* renamed from: a */
    final int f21163a;

    /* renamed from: b */
    final long f21164b;

    /* renamed from: c */
    final long f21165c;

    /* renamed from: d */
    final double f21166d;

    /* renamed from: e */
    final Long f21167e;

    /* renamed from: f */
    final Set<C11915g1.b> f21168f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8918z1(int i10, long j10, long j11, double d10, Long l10, Set<C11915g1.b> set) {
        this.f21163a = i10;
        this.f21164b = j10;
        this.f21165c = j11;
        this.f21166d = d10;
        this.f21167e = l10;
        this.f21168f = AbstractC5855a0.m14712r(set);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8918z1)) {
            return false;
        }
        C8918z1 c8918z1 = (C8918z1) obj;
        return this.f21163a == c8918z1.f21163a && this.f21164b == c8918z1.f21164b && this.f21165c == c8918z1.f21165c && Double.compare(this.f21166d, c8918z1.f21166d) == 0 && C7155k.m21289a(this.f21167e, c8918z1.f21167e) && C7155k.m21289a(this.f21168f, c8918z1.f21168f);
    }

    public int hashCode() {
        return C7155k.m21290b(Integer.valueOf(this.f21163a), Long.valueOf(this.f21164b), Long.valueOf(this.f21165c), Double.valueOf(this.f21166d), this.f21167e, this.f21168f);
    }

    public String toString() {
        return C7153i.m21274c(this).m21282b("maxAttempts", this.f21163a).m21283c("initialBackoffNanos", this.f21164b).m21283c("maxBackoffNanos", this.f21165c).m21281a("backoffMultiplier", this.f21166d).m21284d("perAttemptRecvTimeoutNanos", this.f21167e).m21284d("retryableStatusCodes", this.f21168f).toString();
    }
}

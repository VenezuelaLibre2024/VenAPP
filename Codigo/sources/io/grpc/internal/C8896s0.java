package io.grpc.internal;

import com.google.common.collect.AbstractC5855a0;
import java.util.Set;
import p082eb.C7153i;
import p082eb.C7155k;
import vi.C11915g1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.grpc.internal.s0 */
/* loaded from: classes3.dex */
public final class C8896s0 {

    /* renamed from: a */
    final int f20881a;

    /* renamed from: b */
    final long f20882b;

    /* renamed from: c */
    final Set<C11915g1.b> f20883c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8896s0(int i10, long j10, Set<C11915g1.b> set) {
        this.f20881a = i10;
        this.f20882b = j10;
        this.f20883c = AbstractC5855a0.m14712r(set);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8896s0.class != obj.getClass()) {
            return false;
        }
        C8896s0 c8896s0 = (C8896s0) obj;
        return this.f20881a == c8896s0.f20881a && this.f20882b == c8896s0.f20882b && C7155k.m21289a(this.f20883c, c8896s0.f20883c);
    }

    public int hashCode() {
        return C7155k.m21290b(Integer.valueOf(this.f20881a), Long.valueOf(this.f20882b), this.f20883c);
    }

    public String toString() {
        return C7153i.m21274c(this).m21282b("maxAttempts", this.f20881a).m21283c("hedgingDelayNanos", this.f20882b).m21284d("nonFatalStatusCodes", this.f20883c).toString();
    }
}

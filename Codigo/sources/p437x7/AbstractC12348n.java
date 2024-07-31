package p437x7;

import p351s8.C10835n;
import p351s8.InterfaceC10827j;
import p361t6.C11108u1;
import p363t8.C11137a;

/* renamed from: x7.n */
/* loaded from: classes.dex */
public abstract class AbstractC12348n extends AbstractC12340f {

    /* renamed from: j */
    public final long f33164j;

    public AbstractC12348n(InterfaceC10827j interfaceC10827j, C10835n c10835n, C11108u1 c11108u1, int i10, Object obj, long j10, long j11, long j12) {
        super(interfaceC10827j, c10835n, 1, c11108u1, i10, obj, j10, j11);
        C11137a.m34603e(c11108u1);
        this.f33164j = j12;
    }

    /* renamed from: g */
    public long mo39935g() {
        long j10 = this.f33164j;
        if (j10 != -1) {
            return 1 + j10;
        }
        return -1L;
    }

    /* renamed from: h */
    public abstract boolean mo225h();
}

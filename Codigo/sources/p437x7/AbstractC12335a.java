package p437x7;

import p351s8.C10835n;
import p351s8.InterfaceC10827j;
import p361t6.C11108u1;
import p363t8.C11137a;

/* renamed from: x7.a */
/* loaded from: classes.dex */
public abstract class AbstractC12335a extends AbstractC12348n {

    /* renamed from: k */
    public final long f33086k;

    /* renamed from: l */
    public final long f33087l;

    /* renamed from: m */
    private C12337c f33088m;

    /* renamed from: n */
    private int[] f33089n;

    public AbstractC12335a(InterfaceC10827j interfaceC10827j, C10835n c10835n, C11108u1 c11108u1, int i10, Object obj, long j10, long j11, long j12, long j13, long j14) {
        super(interfaceC10827j, c10835n, c11108u1, i10, obj, j10, j11, j14);
        this.f33086k = j12;
        this.f33087l = j13;
    }

    /* renamed from: i */
    public final int m39883i(int i10) {
        return ((int[]) C11137a.m34607i(this.f33089n))[i10];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public final C12337c m39884j() {
        return (C12337c) C11137a.m34607i(this.f33088m);
    }

    /* renamed from: k */
    public void m39885k(C12337c c12337c) {
        this.f33088m = c12337c;
        this.f33089n = c12337c.m39890a();
    }
}

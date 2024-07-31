package p120g8;

import java.util.List;
import p363t8.C11137a;
import p414w6.AbstractC12083h;

/* renamed from: g8.o */
/* loaded from: classes.dex */
public abstract class AbstractC7497o extends AbstractC12083h implements InterfaceC7491i {

    /* renamed from: d */
    private InterfaceC7491i f17717d;

    /* renamed from: e */
    private long f17718e;

    @Override // p120g8.InterfaceC7491i
    /* renamed from: b */
    public int mo22798b(long j10) {
        return ((InterfaceC7491i) C11137a.m34603e(this.f17717d)).mo22798b(j10 - this.f17718e);
    }

    @Override // p120g8.InterfaceC7491i
    /* renamed from: h */
    public List<C7484b> mo22799h(long j10) {
        return ((InterfaceC7491i) C11137a.m34603e(this.f17717d)).mo22799h(j10 - this.f17718e);
    }

    @Override // p120g8.InterfaceC7491i
    /* renamed from: i */
    public long mo22800i(int i10) {
        return ((InterfaceC7491i) C11137a.m34603e(this.f17717d)).mo22800i(i10) + this.f17718e;
    }

    @Override // p120g8.InterfaceC7491i
    /* renamed from: l */
    public int mo22801l() {
        return ((InterfaceC7491i) C11137a.m34603e(this.f17717d)).mo22801l();
    }

    @Override // p414w6.AbstractC12076a
    /* renamed from: n */
    public void mo22818n() {
        super.mo22818n();
        this.f17717d = null;
    }

    /* renamed from: y */
    public void m22819y(long j10, InterfaceC7491i interfaceC7491i, long j11) {
        this.f32150b = j10;
        this.f17717d = interfaceC7491i;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f17718e = j10;
    }
}

package p058d7;

import p459y6.C12607a0;
import p459y6.InterfaceC12609b0;
import p459y6.InterfaceC12623m;
import p459y6.InterfaceC12636z;

/* renamed from: d7.d */
/* loaded from: classes.dex */
public final class C6852d implements InterfaceC12623m {

    /* renamed from: a */
    private final long f15173a;

    /* renamed from: b */
    private final InterfaceC12623m f15174b;

    /* renamed from: d7.d$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC12636z {

        /* renamed from: a */
        final /* synthetic */ InterfaceC12636z f15175a;

        a(InterfaceC12636z interfaceC12636z) {
            this.f15175a = interfaceC12636z;
        }

        @Override // p459y6.InterfaceC12636z
        /* renamed from: d */
        public InterfaceC12636z.a mo125d(long j10) {
            InterfaceC12636z.a mo125d = this.f15175a.mo125d(j10);
            C12607a0 c12607a0 = mo125d.f34332a;
            C12607a0 c12607a02 = new C12607a0(c12607a0.f34223a, c12607a0.f34224b + C6852d.this.f15173a);
            C12607a0 c12607a03 = mo125d.f34333b;
            return new InterfaceC12636z.a(c12607a02, new C12607a0(c12607a03.f34223a, c12607a03.f34224b + C6852d.this.f15173a));
        }

        @Override // p459y6.InterfaceC12636z
        /* renamed from: h */
        public boolean mo126h() {
            return this.f15175a.mo126h();
        }

        @Override // p459y6.InterfaceC12636z
        /* renamed from: i */
        public long mo127i() {
            return this.f15175a.mo127i();
        }
    }

    public C6852d(long j10, InterfaceC12623m interfaceC12623m) {
        this.f15173a = j10;
        this.f15174b = interfaceC12623m;
    }

    @Override // p459y6.InterfaceC12623m
    /* renamed from: d */
    public InterfaceC12609b0 mo308d(int i10, int i11) {
        return this.f15174b.mo308d(i10, i11);
    }

    @Override // p459y6.InterfaceC12623m
    /* renamed from: p */
    public void mo323p(InterfaceC12636z interfaceC12636z) {
        this.f15174b.mo323p(new a(interfaceC12636z));
    }

    @Override // p459y6.InterfaceC12623m
    /* renamed from: q */
    public void mo324q() {
        this.f15174b.mo324q();
    }
}

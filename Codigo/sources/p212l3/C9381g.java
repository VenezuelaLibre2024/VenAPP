package p212l3;

import p036c4.C1867h;
import p129h3.InterfaceC7622f;
import p171j3.InterfaceC8975v;
import p212l3.InterfaceC9382h;

/* renamed from: l3.g */
/* loaded from: classes.dex */
public class C9381g extends C1867h<InterfaceC7622f, InterfaceC8975v<?>> implements InterfaceC9382h {

    /* renamed from: e */
    private InterfaceC9382h.a f22719e;

    public C9381g(long j10) {
        super(j10);
    }

    @Override // p212l3.InterfaceC9382h
    /* renamed from: a */
    public void mo27902a(int i10) {
        if (i10 >= 40) {
            m9936b();
        } else if (i10 >= 20 || i10 == 15) {
            m9943m(m9938h() / 2);
        }
    }

    @Override // p212l3.InterfaceC9382h
    /* renamed from: c */
    public /* bridge */ /* synthetic */ InterfaceC8975v mo27903c(InterfaceC7622f interfaceC7622f, InterfaceC8975v interfaceC8975v) {
        return (InterfaceC8975v) super.m9941k(interfaceC7622f, interfaceC8975v);
    }

    @Override // p212l3.InterfaceC9382h
    /* renamed from: d */
    public void mo27904d(InterfaceC9382h.a aVar) {
        this.f22719e = aVar;
    }

    @Override // p212l3.InterfaceC9382h
    /* renamed from: e */
    public /* bridge */ /* synthetic */ InterfaceC8975v mo27905e(InterfaceC7622f interfaceC7622f) {
        return (InterfaceC8975v) super.m9942l(interfaceC7622f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p036c4.C1867h
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int mo9939i(InterfaceC8975v<?> interfaceC8975v) {
        return interfaceC8975v == null ? super.mo9939i(null) : interfaceC8975v.mo26309p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p036c4.C1867h
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void mo9940j(InterfaceC7622f interfaceC7622f, InterfaceC8975v<?> interfaceC8975v) {
        InterfaceC9382h.a aVar = this.f22719e;
        if (aVar == null || interfaceC8975v == null) {
            return;
        }
        aVar.mo26271a(interfaceC8975v);
    }
}

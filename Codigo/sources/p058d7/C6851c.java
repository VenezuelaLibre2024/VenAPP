package p058d7;

import p363t8.C11137a;
import p459y6.C12631u;
import p459y6.InterfaceC12622l;

/* renamed from: d7.c */
/* loaded from: classes.dex */
final class C6851c extends C12631u {

    /* renamed from: b */
    private final long f15172b;

    public C6851c(InterfaceC12622l interfaceC12622l, long j10) {
        super(interfaceC12622l);
        C11137a.m34599a(interfaceC12622l.getPosition() >= j10);
        this.f15172b = j10;
    }

    @Override // p459y6.C12631u, p459y6.InterfaceC12622l
    public long getLength() {
        return super.getLength() - this.f15172b;
    }

    @Override // p459y6.C12631u, p459y6.InterfaceC12622l
    public long getPosition() {
        return super.getPosition() - this.f15172b;
    }

    @Override // p459y6.C12631u, p459y6.InterfaceC12622l
    /* renamed from: i */
    public long mo19807i() {
        return super.mo19807i() - this.f15172b;
    }
}

package tg;

import java.util.Map;

/* loaded from: classes2.dex */
public final class t extends y {

    /* renamed from: i, reason: collision with root package name */
    private final y f26939i = new i();

    private static dg.q s(dg.q qVar) {
        String f10 = qVar.f();
        if (f10.charAt(0) != '0') {
            throw dg.h.a();
        }
        dg.q qVar2 = new dg.q(f10.substring(1), null, qVar.e(), dg.a.UPC_A);
        if (qVar.d() != null) {
            qVar2.g(qVar.d());
        }
        return qVar2;
    }

    @Override // tg.r, dg.o
    public dg.q a(dg.c cVar) {
        return s(this.f26939i.a(cVar));
    }

    @Override // tg.r, dg.o
    public dg.q b(dg.c cVar, Map<dg.e, ?> map) {
        return s(this.f26939i.b(cVar, map));
    }

    @Override // tg.y, tg.r
    public dg.q c(int i10, kg.a aVar, Map<dg.e, ?> map) {
        return s(this.f26939i.c(i10, aVar, map));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tg.y
    public int l(kg.a aVar, int[] iArr, StringBuilder sb2) {
        return this.f26939i.l(aVar, iArr, sb2);
    }

    @Override // tg.y
    public dg.q m(int i10, kg.a aVar, int[] iArr, Map<dg.e, ?> map) {
        return s(this.f26939i.m(i10, aVar, iArr, map));
    }

    @Override // tg.y
    dg.a q() {
        return dg.a.UPC_A;
    }
}

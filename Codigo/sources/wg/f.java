package wg;

/* loaded from: classes2.dex */
abstract class f extends i {
    /* JADX INFO: Access modifiers changed from: package-private */
    public f(kg.a aVar) {
        super(aVar);
    }

    @Override // wg.j
    public String d() {
        if (c().l() != 60) {
            throw dg.m.a();
        }
        StringBuilder sb2 = new StringBuilder();
        f(sb2, 5);
        j(sb2, 45, 15);
        return sb2.toString();
    }
}

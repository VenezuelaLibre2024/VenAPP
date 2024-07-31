package wg;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class c extends h {
    /* JADX INFO: Access modifiers changed from: package-private */
    public c(kg.a aVar) {
        super(aVar);
    }

    @Override // wg.j
    public String d() {
        if (c().l() < 48) {
            throw dg.m.a();
        }
        StringBuilder sb2 = new StringBuilder();
        f(sb2, 8);
        int f10 = b().f(48, 2);
        sb2.append("(392");
        sb2.append(f10);
        sb2.append(')');
        sb2.append(b().c(50, null).b());
        return sb2.toString();
    }
}

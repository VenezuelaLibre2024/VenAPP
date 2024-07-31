package p423wg;

import kg.C9263a;
import p066dg.C6952m;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: wg.c */
/* loaded from: classes2.dex */
public final class C12182c extends AbstractC12187h {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C12182c(C9263a c9263a) {
        super(c9263a);
    }

    @Override // p423wg.AbstractC12189j
    /* renamed from: d */
    public String mo39100d() {
        if (m39108c().m27590l() < 48) {
            throw C6952m.m20106a();
        }
        StringBuilder sb2 = new StringBuilder();
        m39103f(sb2, 8);
        int m39150f = m39107b().m39150f(48, 2);
        sb2.append("(392");
        sb2.append(m39150f);
        sb2.append(')');
        sb2.append(m39107b().m39149c(50, null).m39121b());
        return sb2.toString();
    }
}

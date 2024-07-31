package p423wg;

import kg.C9263a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: wg.i */
/* loaded from: classes2.dex */
public abstract class AbstractC12188i extends AbstractC12187h {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC12188i(C9263a c9263a) {
        super(c9263a);
    }

    /* renamed from: h */
    protected abstract void mo39098h(StringBuilder sb2, int i10);

    /* renamed from: i */
    protected abstract int mo39099i(int i10);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public final void m39105j(StringBuilder sb2, int i10, int i11) {
        int m39150f = m39107b().m39150f(i10, i11);
        mo39098h(sb2, m39150f);
        int mo39099i = mo39099i(m39150f);
        int i12 = 100000;
        for (int i13 = 0; i13 < 5; i13++) {
            if (mo39099i / i12 == 0) {
                sb2.append('0');
            }
            i12 /= 10;
        }
        sb2.append(mo39099i);
    }
}

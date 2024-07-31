package p423wg;

import kg.C9263a;
import p066dg.C6952m;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: wg.e */
/* loaded from: classes2.dex */
public final class C12184e extends AbstractC12188i {

    /* renamed from: c */
    private final String f32454c;

    /* renamed from: d */
    private final String f32455d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12184e(C9263a c9263a, String str, String str2) {
        super(c9263a);
        this.f32454c = str2;
        this.f32455d = str;
    }

    /* renamed from: k */
    private void m39101k(StringBuilder sb2, int i10) {
        int m39150f = m39107b().m39150f(i10, 16);
        if (m39150f == 38400) {
            return;
        }
        sb2.append('(');
        sb2.append(this.f32454c);
        sb2.append(')');
        int i11 = m39150f % 32;
        int i12 = m39150f / 32;
        int i13 = (i12 % 12) + 1;
        int i14 = i12 / 12;
        if (i14 / 10 == 0) {
            sb2.append('0');
        }
        sb2.append(i14);
        if (i13 / 10 == 0) {
            sb2.append('0');
        }
        sb2.append(i13);
        if (i11 / 10 == 0) {
            sb2.append('0');
        }
        sb2.append(i11);
    }

    @Override // p423wg.AbstractC12189j
    /* renamed from: d */
    public String mo39100d() {
        if (m39108c().m27590l() != 84) {
            throw C6952m.m20106a();
        }
        StringBuilder sb2 = new StringBuilder();
        m39103f(sb2, 8);
        m39105j(sb2, 48, 20);
        m39101k(sb2, 68);
        return sb2.toString();
    }

    @Override // p423wg.AbstractC12188i
    /* renamed from: h */
    protected void mo39098h(StringBuilder sb2, int i10) {
        sb2.append('(');
        sb2.append(this.f32455d);
        sb2.append(i10 / 100000);
        sb2.append(')');
    }

    @Override // p423wg.AbstractC12188i
    /* renamed from: i */
    protected int mo39099i(int i10) {
        return i10 % 100000;
    }
}

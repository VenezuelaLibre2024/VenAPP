package p243n0;

import java.util.ArrayList;
import java.util.Arrays;
import p260o0.C9761i;
import p260o0.C9767o;

/* renamed from: n0.i */
/* loaded from: classes.dex */
public class C9626i extends C9622e implements InterfaceC9625h {

    /* renamed from: L0 */
    public C9622e[] f23582L0 = new C9622e[4];

    /* renamed from: M0 */
    public int f23583M0 = 0;

    @Override // p243n0.InterfaceC9625h
    /* renamed from: a */
    public void mo28815a(C9623f c9623f) {
    }

    @Override // p243n0.InterfaceC9625h
    /* renamed from: b */
    public void mo28816b(C9622e c9622e) {
        if (c9622e == this || c9622e == null) {
            return;
        }
        int i10 = this.f23583M0 + 1;
        C9622e[] c9622eArr = this.f23582L0;
        if (i10 > c9622eArr.length) {
            this.f23582L0 = (C9622e[]) Arrays.copyOf(c9622eArr, c9622eArr.length * 2);
        }
        C9622e[] c9622eArr2 = this.f23582L0;
        int i11 = this.f23583M0;
        c9622eArr2[i11] = c9622e;
        this.f23583M0 = i11 + 1;
    }

    @Override // p243n0.InterfaceC9625h
    /* renamed from: c */
    public void mo28817c() {
        this.f23583M0 = 0;
        Arrays.fill(this.f23582L0, (Object) null);
    }

    /* renamed from: o1 */
    public void m28818o1(ArrayList<C9767o> arrayList, int i10, C9767o c9767o) {
        for (int i11 = 0; i11 < this.f23583M0; i11++) {
            c9767o.m29288a(this.f23582L0[i11]);
        }
        for (int i12 = 0; i12 < this.f23583M0; i12++) {
            C9761i.m29273a(this.f23582L0[i12], i10, arrayList, c9767o);
        }
    }

    /* renamed from: p1 */
    public int m28819p1(int i10) {
        int i11;
        int i12;
        for (int i13 = 0; i13 < this.f23583M0; i13++) {
            C9622e c9622e = this.f23582L0[i13];
            if (i10 == 0 && (i12 = c9622e.f23470I0) != -1) {
                return i12;
            }
            if (i10 == 1 && (i11 = c9622e.f23472J0) != -1) {
                return i11;
            }
        }
        return -1;
    }
}

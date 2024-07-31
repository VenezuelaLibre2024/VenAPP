package p243n0;

import java.util.HashSet;
import p260o0.C9754b;

/* renamed from: n0.k */
/* loaded from: classes.dex */
public class C9628k extends C9626i {

    /* renamed from: N0 */
    private int f23585N0 = 0;

    /* renamed from: O0 */
    private int f23586O0 = 0;

    /* renamed from: P0 */
    private int f23587P0 = 0;

    /* renamed from: Q0 */
    private int f23588Q0 = 0;

    /* renamed from: R0 */
    private int f23589R0 = 0;

    /* renamed from: S0 */
    private int f23590S0 = 0;

    /* renamed from: T0 */
    private int f23591T0 = 0;

    /* renamed from: U0 */
    private int f23592U0 = 0;

    /* renamed from: V0 */
    private boolean f23593V0 = false;

    /* renamed from: W0 */
    private int f23594W0 = 0;

    /* renamed from: X0 */
    private int f23595X0 = 0;

    /* renamed from: Y0 */
    protected C9754b.a f23596Y0 = new C9754b.a();

    /* renamed from: Z0 */
    C9754b.b f23597Z0 = null;

    @Override // p243n0.C9626i, p243n0.InterfaceC9625h
    /* renamed from: a */
    public void mo28815a(C9623f c9623f) {
        m28822q1();
    }

    /* renamed from: q1 */
    public void m28822q1() {
        for (int i10 = 0; i10 < this.f23583M0; i10++) {
            C9622e c9622e = this.f23582L0[i10];
            if (c9622e != null) {
                c9622e.m28703R0(true);
            }
        }
    }

    /* renamed from: r1 */
    public boolean m28823r1(HashSet<C9622e> hashSet) {
        for (int i10 = 0; i10 < this.f23583M0; i10++) {
            if (hashSet.contains(this.f23582L0[i10])) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: s1 */
    public boolean m28824s1() {
        return this.f23593V0;
    }
}

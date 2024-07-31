package p243n0;

import java.util.ArrayList;
import p190k0.C9101c;

/* renamed from: n0.l */
/* loaded from: classes.dex */
public class C9629l extends C9622e {

    /* renamed from: L0 */
    public ArrayList<C9622e> f23598L0 = new ArrayList<>();

    /* renamed from: b */
    public void m28825b(C9622e c9622e) {
        this.f23598L0.add(c9622e);
        if (c9622e.m28686I() != null) {
            ((C9629l) c9622e.m28686I()).m28827q1(c9622e);
        }
        c9622e.m28719Z0(this);
    }

    /* renamed from: o1 */
    public ArrayList<C9622e> m28826o1() {
        return this.f23598L0;
    }

    /* renamed from: p1 */
    public void mo28800p1() {
        ArrayList<C9622e> arrayList = this.f23598L0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C9622e c9622e = this.f23598L0.get(i10);
            if (c9622e instanceof C9629l) {
                ((C9629l) c9622e).mo28800p1();
            }
        }
    }

    /* renamed from: q1 */
    public void m28827q1(C9622e c9622e) {
        this.f23598L0.remove(c9622e);
        c9622e.mo28759r0();
    }

    @Override // p243n0.C9622e
    /* renamed from: r0 */
    public void mo28759r0() {
        this.f23598L0.clear();
        super.mo28759r0();
    }

    /* renamed from: r1 */
    public void m28828r1() {
        this.f23598L0.clear();
    }

    @Override // p243n0.C9622e
    /* renamed from: t0 */
    public void mo28763t0(C9101c c9101c) {
        super.mo28763t0(c9101c);
        int size = this.f23598L0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f23598L0.get(i10).mo28763t0(c9101c);
        }
    }
}

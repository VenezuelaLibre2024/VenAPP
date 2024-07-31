package p494zk;

/* renamed from: zk.h2 */
/* loaded from: classes3.dex */
public abstract class AbstractC13066h2 extends AbstractC13064h0 {
    /* renamed from: I0 */
    public abstract AbstractC13066h2 mo627I0();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: J0 */
    public final String m43210J0() {
        AbstractC13066h2 abstractC13066h2;
        AbstractC13066h2 m43041c = C13034a1.m43041c();
        if (this == m43041c) {
            return "Dispatchers.Main";
        }
        try {
            abstractC13066h2 = m43041c.mo627I0();
        } catch (UnsupportedOperationException unused) {
            abstractC13066h2 = null;
        }
        if (this == abstractC13066h2) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // p494zk.AbstractC13064h0
    public String toString() {
        String m43210J0 = m43210J0();
        if (m43210J0 != null) {
            return m43210J0;
        }
        return C13092o0.m43273a(this) + '@' + C13092o0.m43274b(this);
    }
}

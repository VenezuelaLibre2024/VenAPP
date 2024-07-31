package zk;

/* loaded from: classes3.dex */
public abstract class h2 extends h0 {
    public abstract h2 I0();

    /* JADX INFO: Access modifiers changed from: protected */
    public final String J0() {
        h2 h2Var;
        h2 c10 = a1.c();
        if (this == c10) {
            return "Dispatchers.Main";
        }
        try {
            h2Var = c10.I0();
        } catch (UnsupportedOperationException unused) {
            h2Var = null;
        }
        if (this == h2Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // zk.h0
    public String toString() {
        String J0 = J0();
        if (J0 != null) {
            return J0;
        }
        return o0.a(this) + '@' + o0.b(this);
    }
}

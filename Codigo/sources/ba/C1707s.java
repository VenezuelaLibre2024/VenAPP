package ba;

import android.os.Bundle;

/* renamed from: ba.s */
/* loaded from: classes.dex */
final class C1707s extends AbstractC1708t<Void> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1707s(int i10, int i11, Bundle bundle) {
        super(i10, 2, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // ba.AbstractC1708t
    /* renamed from: a */
    public final void mo9307a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            m9310d(null);
        } else {
            m9309c(new C1709u(4, "Invalid response to one way request", null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // ba.AbstractC1708t
    /* renamed from: b */
    public final boolean mo9308b() {
        return true;
    }
}

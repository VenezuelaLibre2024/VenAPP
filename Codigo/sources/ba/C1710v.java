package ba;

import android.os.Bundle;

/* renamed from: ba.v */
/* loaded from: classes.dex */
final class C1710v extends AbstractC1708t<Bundle> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1710v(int i10, int i11, Bundle bundle) {
        super(i10, 1, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // ba.AbstractC1708t
    /* renamed from: a */
    public final void mo9307a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        m9310d(bundle2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // ba.AbstractC1708t
    /* renamed from: b */
    public final boolean mo9308b() {
        return false;
    }
}

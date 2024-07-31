package ba;

import android.os.Bundle;

/* loaded from: classes.dex */
final class v extends t<Bundle> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public v(int i10, int i11, Bundle bundle) {
        super(i10, 1, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // ba.t
    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        d(bundle2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // ba.t
    public final boolean b() {
        return false;
    }
}

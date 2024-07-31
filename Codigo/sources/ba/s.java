package ba;

import android.os.Bundle;

/* loaded from: classes.dex */
final class s extends t<Void> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public s(int i10, int i11, Bundle bundle) {
        super(i10, 2, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // ba.t
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new u(4, "Invalid response to one way request", null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // ba.t
    public final boolean b() {
        return true;
    }
}

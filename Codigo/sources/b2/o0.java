package b2;

import android.view.View;
import android.view.WindowId;

/* loaded from: classes.dex */
class o0 implements p0 {

    /* renamed from: a, reason: collision with root package name */
    private final WindowId f6124a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o0(View view) {
        this.f6124a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof o0) && ((o0) obj).f6124a.equals(this.f6124a);
    }

    public int hashCode() {
        return this.f6124a.hashCode();
    }
}

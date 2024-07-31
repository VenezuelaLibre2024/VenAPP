package p020b2;

import android.view.View;
import android.view.WindowId;

/* renamed from: b2.o0 */
/* loaded from: classes.dex */
class C1639o0 implements InterfaceC1641p0 {

    /* renamed from: a */
    private final WindowId f7014a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1639o0(View view) {
        this.f7014a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1639o0) && ((C1639o0) obj).f7014a.equals(this.f7014a);
    }

    public int hashCode() {
        return this.f7014a.hashCode();
    }
}

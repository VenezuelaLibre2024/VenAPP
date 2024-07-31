package p487zd;

import android.os.Bundle;
import cc.InterfaceC1940a;
import dj.InterfaceC6982g;

/* renamed from: zd.i0 */
/* loaded from: classes.dex */
final class C12923i0 implements InterfaceC1940a.b {

    /* renamed from: a */
    private InterfaceC6982g<String> f35164a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12923i0(InterfaceC6982g<String> interfaceC6982g) {
        this.f35164a = interfaceC6982g;
    }

    @Override // cc.InterfaceC1940a.b
    /* renamed from: a */
    public void mo10154a(int i10, Bundle bundle) {
        if (i10 == 2) {
            this.f35164a.mo20212c(bundle.getString("events"));
        }
    }
}

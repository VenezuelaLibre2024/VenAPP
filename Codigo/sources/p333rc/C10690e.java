package p333rc;

import android.os.Bundle;
import cc.InterfaceC1940a;
import java.util.Locale;
import sc.C10889g;
import tc.InterfaceC11238b;

/* renamed from: rc.e */
/* loaded from: classes.dex */
class C10690e implements InterfaceC1940a.b {

    /* renamed from: a */
    private InterfaceC11238b f27048a;

    /* renamed from: b */
    private InterfaceC11238b f27049b;

    /* renamed from: b */
    private static void m32553b(InterfaceC11238b interfaceC11238b, String str, Bundle bundle) {
        if (interfaceC11238b == null) {
            return;
        }
        interfaceC11238b.mo35120c(str, bundle);
    }

    /* renamed from: c */
    private void m32554c(String str, Bundle bundle) {
        m32553b("clx".equals(bundle.getString("_o")) ? this.f27048a : this.f27049b, str, bundle);
    }

    @Override // cc.InterfaceC1940a.b
    /* renamed from: a */
    public void mo10154a(int i10, Bundle bundle) {
        String string;
        C10889g.m33216f().m33223i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i10), bundle));
        if (bundle == null || (string = bundle.getString("name")) == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("params");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        m32554c(string, bundle2);
    }

    /* renamed from: d */
    public void m32555d(InterfaceC11238b interfaceC11238b) {
        this.f27049b = interfaceC11238b;
    }

    /* renamed from: e */
    public void m32556e(InterfaceC11238b interfaceC11238b) {
        this.f27048a = interfaceC11238b;
    }
}

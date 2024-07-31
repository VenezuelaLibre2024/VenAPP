package rc;

import android.os.Bundle;
import cc.a;
import java.util.Locale;
import sc.g;

/* loaded from: classes.dex */
class e implements a.b {

    /* renamed from: a, reason: collision with root package name */
    private tc.b f24932a;

    /* renamed from: b, reason: collision with root package name */
    private tc.b f24933b;

    private static void b(tc.b bVar, String str, Bundle bundle) {
        if (bVar == null) {
            return;
        }
        bVar.c(str, bundle);
    }

    private void c(String str, Bundle bundle) {
        b("clx".equals(bundle.getString("_o")) ? this.f24932a : this.f24933b, str, bundle);
    }

    @Override // cc.a.b
    public void a(int i10, Bundle bundle) {
        String string;
        g.f().i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i10), bundle));
        if (bundle == null || (string = bundle.getString("name")) == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("params");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        c(string, bundle2);
    }

    public void d(tc.b bVar) {
        this.f24933b = bVar;
    }

    public void e(tc.b bVar) {
        this.f24932a = bVar;
    }
}

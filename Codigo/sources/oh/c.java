package oh;

import android.content.ComponentName;
import androidx.browser.customtabs.e;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class c extends e {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<d> f22569a;

    public c(d dVar) {
        this.f22569a = new WeakReference<>(dVar);
    }

    @Override // androidx.browser.customtabs.e
    public void onCustomTabsServiceConnected(ComponentName componentName, androidx.browser.customtabs.c cVar) {
        d dVar = this.f22569a.get();
        if (dVar != null) {
            dVar.onServiceConnected(cVar);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        d dVar = this.f22569a.get();
        if (dVar != null) {
            dVar.onServiceDisconnected();
        }
    }
}

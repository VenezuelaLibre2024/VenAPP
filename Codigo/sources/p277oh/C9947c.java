package p277oh;

import android.content.ComponentName;
import androidx.browser.customtabs.AbstractServiceConnectionC0395e;
import androidx.browser.customtabs.C0393c;
import java.lang.ref.WeakReference;

/* renamed from: oh.c */
/* loaded from: classes3.dex */
public class C9947c extends AbstractServiceConnectionC0395e {

    /* renamed from: a */
    private final WeakReference<InterfaceC9948d> f24502a;

    public C9947c(InterfaceC9948d interfaceC9948d) {
        this.f24502a = new WeakReference<>(interfaceC9948d);
    }

    @Override // androidx.browser.customtabs.AbstractServiceConnectionC0395e
    public void onCustomTabsServiceConnected(ComponentName componentName, C0393c c0393c) {
        InterfaceC9948d interfaceC9948d = this.f24502a.get();
        if (interfaceC9948d != null) {
            interfaceC9948d.onServiceConnected(c0393c);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        InterfaceC9948d interfaceC9948d = this.f24502a.get();
        if (interfaceC9948d != null) {
            interfaceC9948d.onServiceDisconnected();
        }
    }
}

package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import p017b.InterfaceC1591b;

/* renamed from: androidx.browser.customtabs.e */
/* loaded from: classes.dex */
public abstract class AbstractServiceConnectionC0395e implements ServiceConnection {
    private Context mApplicationContext;

    /* renamed from: androidx.browser.customtabs.e$a */
    /* loaded from: classes.dex */
    class a extends C0393c {
        a(InterfaceC1591b interfaceC1591b, ComponentName componentName, Context context) {
            super(interfaceC1591b, componentName, context);
        }
    }

    Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, C0393c c0393c);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.mApplicationContext == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        onCustomTabsServiceConnected(componentName, new a(InterfaceC1591b.a.m8844f2(iBinder), componentName, this.mApplicationContext));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }
}

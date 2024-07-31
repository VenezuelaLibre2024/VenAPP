package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.List;
import w8.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a extends InstallReferrerClient {

    /* renamed from: a, reason: collision with root package name */
    private int f7202a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final Context f7203b;

    /* renamed from: c, reason: collision with root package name */
    private w8.a f7204c;

    /* renamed from: d, reason: collision with root package name */
    private ServiceConnection f7205d;

    /* loaded from: classes.dex */
    private final class b implements ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        private final InstallReferrerStateListener f7206a;

        private b(InstallReferrerStateListener installReferrerStateListener) {
            if (installReferrerStateListener == null) {
                throw new RuntimeException("Please specify a listener to know when setup is done.");
            }
            this.f7206a = installReferrerStateListener;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            r2.a.a("InstallReferrerClient", "Install Referrer service connected.");
            a.this.f7204c = a.AbstractBinderC0478a.f2(iBinder);
            a.this.f7202a = 2;
            this.f7206a.a(0);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            r2.a.b("InstallReferrerClient", "Install Referrer service disconnected.");
            a.this.f7204c = null;
            a.this.f7202a = 0;
            this.f7206a.b();
        }
    }

    public a(Context context) {
        this.f7203b = context.getApplicationContext();
    }

    private boolean g() {
        try {
            return this.f7203b.getPackageManager().getPackageInfo("com.android.vending", RecognitionOptions.ITF).versionCode >= 80837300;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public void a() {
        this.f7202a = 3;
        if (this.f7205d != null) {
            r2.a.a("InstallReferrerClient", "Unbinding from service.");
            this.f7203b.unbindService(this.f7205d);
            this.f7205d = null;
        }
        this.f7204c = null;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public ReferrerDetails b() {
        if (!h()) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.f7203b.getPackageName());
        try {
            return new ReferrerDetails(this.f7204c.H(bundle));
        } catch (RemoteException e10) {
            r2.a.b("InstallReferrerClient", "RemoteException getting install referrer information");
            this.f7202a = 0;
            throw e10;
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public void d(InstallReferrerStateListener installReferrerStateListener) {
        ServiceInfo serviceInfo;
        if (h()) {
            r2.a.a("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            installReferrerStateListener.a(0);
            return;
        }
        int i10 = this.f7202a;
        if (i10 == 1) {
            r2.a.b("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            installReferrerStateListener.a(3);
            return;
        }
        if (i10 == 3) {
            r2.a.b("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            installReferrerStateListener.a(3);
            return;
        }
        r2.a.a("InstallReferrerClient", "Starting install referrer service setup.");
        this.f7205d = new b(installReferrerStateListener);
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        List<ResolveInfo> queryIntentServices = this.f7203b.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null) {
            this.f7202a = 0;
            r2.a.a("InstallReferrerClient", "Install Referrer service unavailable on device.");
            installReferrerStateListener.a(2);
            return;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if (!"com.android.vending".equals(str) || str2 == null || !g()) {
            r2.a.b("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
            this.f7202a = 0;
            installReferrerStateListener.a(2);
        } else {
            if (this.f7203b.bindService(new Intent(intent), this.f7205d, 1)) {
                r2.a.a("InstallReferrerClient", "Service was bonded successfully.");
                return;
            }
            r2.a.b("InstallReferrerClient", "Connection to service is blocked.");
            this.f7202a = 0;
            installReferrerStateListener.a(1);
        }
    }

    public boolean h() {
        return (this.f7202a != 2 || this.f7204c == null || this.f7205d == null) ? false : true;
    }
}

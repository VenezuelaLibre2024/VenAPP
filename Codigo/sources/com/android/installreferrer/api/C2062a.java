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
import p323r2.C10610a;
import p416w8.InterfaceC12089a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.android.installreferrer.api.a */
/* loaded from: classes.dex */
public class C2062a extends InstallReferrerClient {

    /* renamed from: a */
    private int f8154a = 0;

    /* renamed from: b */
    private final Context f8155b;

    /* renamed from: c */
    private InterfaceC12089a f8156c;

    /* renamed from: d */
    private ServiceConnection f8157d;

    /* renamed from: com.android.installreferrer.api.a$b */
    /* loaded from: classes.dex */
    private final class b implements ServiceConnection {

        /* renamed from: a */
        private final InstallReferrerStateListener f8158a;

        private b(InstallReferrerStateListener installReferrerStateListener) {
            if (installReferrerStateListener == null) {
                throw new RuntimeException("Please specify a listener to know when setup is done.");
            }
            this.f8158a = installReferrerStateListener;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C10610a.m32306a("InstallReferrerClient", "Install Referrer service connected.");
            C2062a.this.f8156c = InterfaceC12089a.a.m38842f2(iBinder);
            C2062a.this.f8154a = 2;
            this.f8158a.mo10406a(0);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C10610a.m32307b("InstallReferrerClient", "Install Referrer service disconnected.");
            C2062a.this.f8156c = null;
            C2062a.this.f8154a = 0;
            this.f8158a.mo10407b();
        }
    }

    public C2062a(Context context) {
        this.f8155b = context.getApplicationContext();
    }

    /* renamed from: g */
    private boolean m10411g() {
        try {
            return this.f8155b.getPackageManager().getPackageInfo("com.android.vending", RecognitionOptions.ITF).versionCode >= 80837300;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    /* renamed from: a */
    public void mo10402a() {
        this.f8154a = 3;
        if (this.f8157d != null) {
            C10610a.m32306a("InstallReferrerClient", "Unbinding from service.");
            this.f8155b.unbindService(this.f8157d);
            this.f8157d = null;
        }
        this.f8156c = null;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    /* renamed from: b */
    public ReferrerDetails mo10403b() {
        if (!m10412h()) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.f8155b.getPackageName());
        try {
            return new ReferrerDetails(this.f8156c.mo38841H(bundle));
        } catch (RemoteException e10) {
            C10610a.m32307b("InstallReferrerClient", "RemoteException getting install referrer information");
            this.f8154a = 0;
            throw e10;
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    /* renamed from: d */
    public void mo10404d(InstallReferrerStateListener installReferrerStateListener) {
        ServiceInfo serviceInfo;
        if (m10412h()) {
            C10610a.m32306a("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            installReferrerStateListener.mo10406a(0);
            return;
        }
        int i10 = this.f8154a;
        if (i10 == 1) {
            C10610a.m32307b("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            installReferrerStateListener.mo10406a(3);
            return;
        }
        if (i10 == 3) {
            C10610a.m32307b("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            installReferrerStateListener.mo10406a(3);
            return;
        }
        C10610a.m32306a("InstallReferrerClient", "Starting install referrer service setup.");
        this.f8157d = new b(installReferrerStateListener);
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        List<ResolveInfo> queryIntentServices = this.f8155b.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null) {
            this.f8154a = 0;
            C10610a.m32306a("InstallReferrerClient", "Install Referrer service unavailable on device.");
            installReferrerStateListener.mo10406a(2);
            return;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if (!"com.android.vending".equals(str) || str2 == null || !m10411g()) {
            C10610a.m32307b("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
            this.f8154a = 0;
            installReferrerStateListener.mo10406a(2);
        } else {
            if (this.f8155b.bindService(new Intent(intent), this.f8157d, 1)) {
                C10610a.m32306a("InstallReferrerClient", "Service was bonded successfully.");
                return;
            }
            C10610a.m32307b("InstallReferrerClient", "Connection to service is blocked.");
            this.f8154a = 0;
            installReferrerStateListener.mo10406a(1);
        }
    }

    /* renamed from: h */
    public boolean m10412h() {
        return (this.f8154a != 2 || this.f8156c == null || this.f8157d == null) ? false : true;
    }
}

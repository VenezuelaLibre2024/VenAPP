package com.google.android.gms.common.api.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import ca.C1894b;
import ca.C1898d;
import com.google.android.gms.common.api.C5101a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC5228c;
import com.google.android.gms.common.internal.AbstractC5246i;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.common.internal.InterfaceC5252k;
import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.internal.m */
/* loaded from: classes.dex */
public final class ServiceConnectionC5158m implements C5101a.f, ServiceConnection {

    /* renamed from: a */
    private final String f10527a;

    /* renamed from: b */
    private final String f10528b;

    /* renamed from: c */
    private final ComponentName f10529c;

    /* renamed from: d */
    private final Context f10530d;

    /* renamed from: e */
    private final InterfaceC5131f f10531e;

    /* renamed from: f */
    private final Handler f10532f;

    /* renamed from: r */
    private final InterfaceC5161n f10533r;

    /* renamed from: s */
    private IBinder f10534s;

    /* renamed from: t */
    private boolean f10535t;

    /* renamed from: u */
    private String f10536u;

    /* renamed from: v */
    private String f10537v;

    /* renamed from: e */
    private final void m13134e() {
        if (Thread.currentThread() != this.f10532f.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void m13135a() {
        this.f10535t = false;
        this.f10534s = null;
        this.f10531e.onConnectionSuspended(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void m13136c(IBinder iBinder) {
        this.f10535t = false;
        this.f10534s = iBinder;
        String.valueOf(iBinder);
        this.f10531e.onConnected(new Bundle());
    }

    @Override // com.google.android.gms.common.api.C5101a.f
    public final void connect(AbstractC5228c.c cVar) {
        m13134e();
        String.valueOf(this.f10534s);
        if (isConnected()) {
            try {
                disconnect("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f10529c;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.f10527a).setAction(this.f10528b);
            }
            boolean bindService = this.f10530d.bindService(intent, this, AbstractC5246i.m13270b());
            this.f10535t = bindService;
            if (!bindService) {
                this.f10534s = null;
                this.f10533r.onConnectionFailed(new C1894b(16));
            }
            String.valueOf(this.f10534s);
        } catch (SecurityException e10) {
            this.f10535t = false;
            this.f10534s = null;
            throw e10;
        }
    }

    /* renamed from: d */
    public final void m13137d(String str) {
        this.f10537v = str;
    }

    @Override // com.google.android.gms.common.api.C5101a.f
    public final void disconnect() {
        m13134e();
        String.valueOf(this.f10534s);
        try {
            this.f10530d.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f10535t = false;
        this.f10534s = null;
    }

    @Override // com.google.android.gms.common.api.C5101a.f
    public final void disconnect(String str) {
        m13134e();
        this.f10536u = str;
        disconnect();
    }

    @Override // com.google.android.gms.common.api.C5101a.f
    public final C1898d[] getAvailableFeatures() {
        return new C1898d[0];
    }

    @Override // com.google.android.gms.common.api.C5101a.f
    public final String getEndpointPackageName() {
        String str = this.f10527a;
        if (str != null) {
            return str;
        }
        C5276s.m13324j(this.f10529c);
        return this.f10529c.getPackageName();
    }

    @Override // com.google.android.gms.common.api.C5101a.f
    public final String getLastDisconnectMessage() {
        return this.f10536u;
    }

    @Override // com.google.android.gms.common.api.C5101a.f
    public final int getMinApkVersion() {
        return 0;
    }

    @Override // com.google.android.gms.common.api.C5101a.f
    public final void getRemoteService(InterfaceC5252k interfaceC5252k, Set<Scope> set) {
    }

    @Override // com.google.android.gms.common.api.C5101a.f
    public final Set<Scope> getScopesForConnectionlessNonSignIn() {
        return Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.C5101a.f
    public final boolean isConnected() {
        m13134e();
        return this.f10534s != null;
    }

    @Override // com.google.android.gms.common.api.C5101a.f
    public final boolean isConnecting() {
        m13134e();
        return this.f10535t;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.f10532f.post(new Runnable() { // from class: com.google.android.gms.common.api.internal.z0
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC5158m.this.m13136c(iBinder);
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f10532f.post(new Runnable() { // from class: com.google.android.gms.common.api.internal.y0
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC5158m.this.m13135a();
            }
        });
    }

    @Override // com.google.android.gms.common.api.C5101a.f
    public final void onUserSignOut(AbstractC5228c.e eVar) {
    }

    @Override // com.google.android.gms.common.api.C5101a.f
    public final boolean requiresGooglePlayServices() {
        return false;
    }

    @Override // com.google.android.gms.common.api.C5101a.f
    public final boolean requiresSignIn() {
        return false;
    }
}

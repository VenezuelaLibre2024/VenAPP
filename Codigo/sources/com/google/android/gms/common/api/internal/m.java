package com.google.android.gms.common.api.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.c;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class m implements a.f, ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final String f9413a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9414b;

    /* renamed from: c, reason: collision with root package name */
    private final ComponentName f9415c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f9416d;

    /* renamed from: e, reason: collision with root package name */
    private final f f9417e;

    /* renamed from: f, reason: collision with root package name */
    private final Handler f9418f;

    /* renamed from: r, reason: collision with root package name */
    private final n f9419r;

    /* renamed from: s, reason: collision with root package name */
    private IBinder f9420s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f9421t;

    /* renamed from: u, reason: collision with root package name */
    private String f9422u;

    /* renamed from: v, reason: collision with root package name */
    private String f9423v;

    private final void e() {
        if (Thread.currentThread() != this.f9418f.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void a() {
        this.f9421t = false;
        this.f9420s = null;
        this.f9417e.onConnectionSuspended(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void c(IBinder iBinder) {
        this.f9421t = false;
        this.f9420s = iBinder;
        String.valueOf(iBinder);
        this.f9417e.onConnected(new Bundle());
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void connect(c.InterfaceC0149c interfaceC0149c) {
        e();
        String.valueOf(this.f9420s);
        if (isConnected()) {
            try {
                disconnect("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f9415c;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.f9413a).setAction(this.f9414b);
            }
            boolean bindService = this.f9416d.bindService(intent, this, com.google.android.gms.common.internal.i.b());
            this.f9421t = bindService;
            if (!bindService) {
                this.f9420s = null;
                this.f9419r.onConnectionFailed(new ca.b(16));
            }
            String.valueOf(this.f9420s);
        } catch (SecurityException e10) {
            this.f9421t = false;
            this.f9420s = null;
            throw e10;
        }
    }

    public final void d(String str) {
        this.f9423v = str;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void disconnect() {
        e();
        String.valueOf(this.f9420s);
        try {
            this.f9416d.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f9421t = false;
        this.f9420s = null;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void disconnect(String str) {
        e();
        this.f9422u = str;
        disconnect();
    }

    @Override // com.google.android.gms.common.api.a.f
    public final ca.d[] getAvailableFeatures() {
        return new ca.d[0];
    }

    @Override // com.google.android.gms.common.api.a.f
    public final String getEndpointPackageName() {
        String str = this.f9413a;
        if (str != null) {
            return str;
        }
        com.google.android.gms.common.internal.s.j(this.f9415c);
        return this.f9415c.getPackageName();
    }

    @Override // com.google.android.gms.common.api.a.f
    public final String getLastDisconnectMessage() {
        return this.f9422u;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 0;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void getRemoteService(com.google.android.gms.common.internal.k kVar, Set<Scope> set) {
    }

    @Override // com.google.android.gms.common.api.a.f
    public final Set<Scope> getScopesForConnectionlessNonSignIn() {
        return Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean isConnected() {
        e();
        return this.f9420s != null;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean isConnecting() {
        e();
        return this.f9421t;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.f9418f.post(new Runnable() { // from class: com.google.android.gms.common.api.internal.z0
            @Override // java.lang.Runnable
            public final void run() {
                m.this.c(iBinder);
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f9418f.post(new Runnable() { // from class: com.google.android.gms.common.api.internal.y0
            @Override // java.lang.Runnable
            public final void run() {
                m.this.a();
            }
        });
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void onUserSignOut(c.e eVar) {
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean requiresGooglePlayServices() {
        return false;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean requiresSignIn() {
        return false;
    }
}

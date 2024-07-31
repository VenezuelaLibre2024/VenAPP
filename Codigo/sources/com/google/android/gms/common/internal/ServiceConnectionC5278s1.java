package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import la.C9471p;
import p200ka.C9214b;

/* renamed from: com.google.android.gms.common.internal.s1 */
/* loaded from: classes.dex */
final class ServiceConnectionC5278s1 implements ServiceConnection, InterfaceC5290w1 {

    /* renamed from: a */
    private final Map f10751a = new HashMap();

    /* renamed from: b */
    private int f10752b = 2;

    /* renamed from: c */
    private boolean f10753c;

    /* renamed from: d */
    private IBinder f10754d;

    /* renamed from: e */
    private final C5272q1 f10755e;

    /* renamed from: f */
    private ComponentName f10756f;

    /* renamed from: r */
    final /* synthetic */ C5287v1 f10757r;

    public ServiceConnectionC5278s1(C5287v1 c5287v1, C5272q1 c5272q1) {
        this.f10757r = c5287v1;
        this.f10755e = c5272q1;
    }

    /* renamed from: a */
    public final int m13331a() {
        return this.f10752b;
    }

    /* renamed from: b */
    public final ComponentName m13332b() {
        return this.f10756f;
    }

    /* renamed from: c */
    public final IBinder m13333c() {
        return this.f10754d;
    }

    /* renamed from: d */
    public final void m13334d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f10751a.put(serviceConnection, serviceConnection2);
    }

    /* renamed from: e */
    public final void m13335e(String str, Executor executor) {
        C9214b c9214b;
        Context context;
        Context context2;
        C9214b c9214b2;
        Context context3;
        Handler handler;
        Handler handler2;
        long j10;
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        this.f10752b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (C9471p.m28176m()) {
            permitUnsafeIntentLaunch = new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch();
            StrictMode.setVmPolicy(permitUnsafeIntentLaunch.build());
        }
        try {
            C5287v1 c5287v1 = this.f10757r;
            c9214b = c5287v1.f10778j;
            context = c5287v1.f10775g;
            C5272q1 c5272q1 = this.f10755e;
            context2 = c5287v1.f10775g;
            boolean m27402d = c9214b.m27402d(context, str, c5272q1.m13309b(context2), this, 4225, executor);
            this.f10753c = m27402d;
            if (m27402d) {
                handler = this.f10757r.f10776h;
                Message obtainMessage = handler.obtainMessage(1, this.f10755e);
                handler2 = this.f10757r.f10776h;
                j10 = this.f10757r.f10780l;
                handler2.sendMessageDelayed(obtainMessage, j10);
            } else {
                this.f10752b = 2;
                try {
                    C5287v1 c5287v12 = this.f10757r;
                    c9214b2 = c5287v12.f10778j;
                    context3 = c5287v12.f10775g;
                    c9214b2.m27401c(context3, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    /* renamed from: f */
    public final void m13336f(ServiceConnection serviceConnection, String str) {
        this.f10751a.remove(serviceConnection);
    }

    /* renamed from: g */
    public final void m13337g(String str) {
        Handler handler;
        C9214b c9214b;
        Context context;
        handler = this.f10757r.f10776h;
        handler.removeMessages(1, this.f10755e);
        C5287v1 c5287v1 = this.f10757r;
        c9214b = c5287v1.f10778j;
        context = c5287v1.f10775g;
        c9214b.m27401c(context, this);
        this.f10753c = false;
        this.f10752b = 2;
    }

    /* renamed from: h */
    public final boolean m13338h(ServiceConnection serviceConnection) {
        return this.f10751a.containsKey(serviceConnection);
    }

    /* renamed from: i */
    public final boolean m13339i() {
        return this.f10751a.isEmpty();
    }

    /* renamed from: j */
    public final boolean m13340j() {
        return this.f10753c;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f10757r.f10774f;
        synchronized (hashMap) {
            handler = this.f10757r.f10776h;
            handler.removeMessages(1, this.f10755e);
            this.f10754d = iBinder;
            this.f10756f = componentName;
            Iterator it = this.f10751a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.f10752b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f10757r.f10774f;
        synchronized (hashMap) {
            handler = this.f10757r.f10776h;
            handler.removeMessages(1, this.f10755e);
            this.f10754d = null;
            this.f10756f = componentName;
            Iterator it = this.f10751a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
            }
            this.f10752b = 2;
        }
    }
}

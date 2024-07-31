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

/* loaded from: classes.dex */
final class s1 implements ServiceConnection, w1 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f9636a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private int f9637b = 2;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9638c;

    /* renamed from: d, reason: collision with root package name */
    private IBinder f9639d;

    /* renamed from: e, reason: collision with root package name */
    private final q1 f9640e;

    /* renamed from: f, reason: collision with root package name */
    private ComponentName f9641f;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ v1 f9642r;

    public s1(v1 v1Var, q1 q1Var) {
        this.f9642r = v1Var;
        this.f9640e = q1Var;
    }

    public final int a() {
        return this.f9637b;
    }

    public final ComponentName b() {
        return this.f9641f;
    }

    public final IBinder c() {
        return this.f9639d;
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f9636a.put(serviceConnection, serviceConnection2);
    }

    public final void e(String str, Executor executor) {
        ka.b bVar;
        Context context;
        Context context2;
        ka.b bVar2;
        Context context3;
        Handler handler;
        Handler handler2;
        long j10;
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        this.f9637b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (la.p.m()) {
            permitUnsafeIntentLaunch = new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch();
            StrictMode.setVmPolicy(permitUnsafeIntentLaunch.build());
        }
        try {
            v1 v1Var = this.f9642r;
            bVar = v1Var.f9663j;
            context = v1Var.f9660g;
            q1 q1Var = this.f9640e;
            context2 = v1Var.f9660g;
            boolean d10 = bVar.d(context, str, q1Var.b(context2), this, 4225, executor);
            this.f9638c = d10;
            if (d10) {
                handler = this.f9642r.f9661h;
                Message obtainMessage = handler.obtainMessage(1, this.f9640e);
                handler2 = this.f9642r.f9661h;
                j10 = this.f9642r.f9665l;
                handler2.sendMessageDelayed(obtainMessage, j10);
            } else {
                this.f9637b = 2;
                try {
                    v1 v1Var2 = this.f9642r;
                    bVar2 = v1Var2.f9663j;
                    context3 = v1Var2.f9660g;
                    bVar2.c(context3, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.f9636a.remove(serviceConnection);
    }

    public final void g(String str) {
        Handler handler;
        ka.b bVar;
        Context context;
        handler = this.f9642r.f9661h;
        handler.removeMessages(1, this.f9640e);
        v1 v1Var = this.f9642r;
        bVar = v1Var.f9663j;
        context = v1Var.f9660g;
        bVar.c(context, this);
        this.f9638c = false;
        this.f9637b = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.f9636a.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.f9636a.isEmpty();
    }

    public final boolean j() {
        return this.f9638c;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f9642r.f9659f;
        synchronized (hashMap) {
            handler = this.f9642r.f9661h;
            handler.removeMessages(1, this.f9640e);
            this.f9639d = iBinder;
            this.f9641f = componentName;
            Iterator it = this.f9636a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.f9637b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f9642r.f9659f;
        synchronized (hashMap) {
            handler = this.f9642r.f9661h;
            handler.removeMessages(1, this.f9640e);
            this.f9639d = null;
            this.f9641f = componentName;
            Iterator it = this.f9636a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
            }
            this.f9637b = 2;
        }
    }
}

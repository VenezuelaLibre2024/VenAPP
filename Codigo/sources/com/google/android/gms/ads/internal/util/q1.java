package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.internal.ads.zzbgc;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class q1 {

    /* renamed from: d, reason: collision with root package name */
    private boolean f9036d;

    /* renamed from: e, reason: collision with root package name */
    private Context f9037e;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9035c = false;

    /* renamed from: b, reason: collision with root package name */
    private final Map f9034b = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final BroadcastReceiver f9033a = new o1(this);

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void e(Context context, Intent intent) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f9034b.entrySet()) {
            if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                arrayList.add((BroadcastReceiver) entry.getKey());
            }
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((BroadcastReceiver) arrayList.get(i10)).onReceive(context, intent);
        }
    }

    public final synchronized void b(Context context) {
        if (this.f9035c) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        this.f9037e = applicationContext;
        if (applicationContext == null) {
            this.f9037e = context;
        }
        zzbgc.zza(this.f9037e);
        this.f9036d = ((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzdI)).booleanValue();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        if (!((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzkw)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            this.f9037e.registerReceiver(this.f9033a, intentFilter);
        } else {
            this.f9037e.registerReceiver(this.f9033a, intentFilter, 4);
        }
        this.f9035c = true;
    }

    public final synchronized void c(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.f9036d) {
            this.f9034b.put(broadcastReceiver, intentFilter);
            return;
        }
        zzbgc.zza(context);
        if (!((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzkw)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, 4);
        }
    }

    public final synchronized void d(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f9036d) {
            this.f9034b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }
}

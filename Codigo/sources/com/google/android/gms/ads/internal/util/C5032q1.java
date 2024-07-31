package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.ads.internal.client.C4784a0;
import com.google.android.gms.internal.ads.zzbgc;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.ads.internal.util.q1 */
/* loaded from: classes.dex */
public final class C5032q1 {

    /* renamed from: d */
    private boolean f10135d;

    /* renamed from: e */
    private Context f10136e;

    /* renamed from: c */
    private boolean f10134c = false;

    /* renamed from: b */
    private final Map f10133b = new WeakHashMap();

    /* renamed from: a */
    private final BroadcastReceiver f10132a = new C5024o1(this);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public final synchronized void m12706e(Context context, Intent intent) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f10133b.entrySet()) {
            if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                arrayList.add((BroadcastReceiver) entry.getKey());
            }
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((BroadcastReceiver) arrayList.get(i10)).onReceive(context, intent);
        }
    }

    /* renamed from: b */
    public final synchronized void m12707b(Context context) {
        if (this.f10134c) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        this.f10136e = applicationContext;
        if (applicationContext == null) {
            this.f10136e = context;
        }
        zzbgc.zza(this.f10136e);
        this.f10135d = ((Boolean) C4784a0.m12365c().zza(zzbgc.zzdI)).booleanValue();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        if (!((Boolean) C4784a0.m12365c().zza(zzbgc.zzkw)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            this.f10136e.registerReceiver(this.f10132a, intentFilter);
        } else {
            this.f10136e.registerReceiver(this.f10132a, intentFilter, 4);
        }
        this.f10134c = true;
    }

    /* renamed from: c */
    public final synchronized void m12708c(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.f10135d) {
            this.f10133b.put(broadcastReceiver, intentFilter);
            return;
        }
        zzbgc.zza(context);
        if (!((Boolean) C4784a0.m12365c().zza(zzbgc.zzkw)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, 4);
        }
    }

    /* renamed from: d */
    public final synchronized void m12709d(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f10135d) {
            this.f10133b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }
}

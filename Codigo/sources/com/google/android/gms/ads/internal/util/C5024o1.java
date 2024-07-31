package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.ads.internal.util.o1 */
/* loaded from: classes.dex */
public final class C5024o1 extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C5032q1 f10121a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5024o1(C5032q1 c5032q1) {
        this.f10121a = c5032q1;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f10121a.m12706e(context, intent);
    }
}

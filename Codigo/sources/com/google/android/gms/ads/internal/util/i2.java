package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
final class i2 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ j2 f8985a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ i2(j2 j2Var, h2 h2Var) {
        this.f8985a = j2Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        j2 j2Var;
        boolean z10;
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            j2Var = this.f8985a;
            z10 = true;
        } else {
            if (!"android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                return;
            }
            j2Var = this.f8985a;
            z10 = false;
        }
        j2.G(j2Var, z10);
    }
}

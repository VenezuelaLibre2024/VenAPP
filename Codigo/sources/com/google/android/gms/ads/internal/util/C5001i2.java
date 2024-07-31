package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.gms.ads.internal.util.i2 */
/* loaded from: classes.dex */
final class C5001i2 extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C5005j2 f10084a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C5001i2(C5005j2 c5005j2, C4997h2 c4997h2) {
        this.f10084a = c5005j2;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C5005j2 c5005j2;
        boolean z10;
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            c5005j2 = this.f10084a;
            z10 = true;
        } else {
            if (!"android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                return;
            }
            c5005j2 = this.f10084a;
            z10 = false;
        }
        C5005j2.m12648G(c5005j2, z10);
    }
}

package com.google.android.gms.internal.p498firebaseauthapi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import ga.C7533a;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzady extends BroadcastReceiver {
    private final String zza;
    private final /* synthetic */ zzadu zzb;

    public zzady(zzadu zzaduVar, String str) {
        this.zzb = zzaduVar;
        this.zza = str;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        HashMap hashMap;
        C7533a c7533a;
        C7533a c7533a2;
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            if (((Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS")).m12969v1() == 0) {
                String str = (String) extras.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                hashMap = this.zzb.zzd;
                zzaeb zzaebVar = (zzaeb) hashMap.get(this.zza);
                if (zzaebVar == null) {
                    c7533a2 = zzadu.zza;
                    c7533a2.m22871c("Verification code received with no active retrieval session.", new Object[0]);
                } else {
                    String zza = zzadu.zza(str);
                    zzaebVar.zze = zza;
                    if (zza == null) {
                        c7533a = zzadu.zza;
                        c7533a.m22871c("Unable to extract verification code.", new Object[0]);
                    } else if (!zzag.zzc(zzaebVar.zzd)) {
                        zzadu.zza(this.zzb, this.zza);
                    }
                }
            }
            context.getApplicationContext().unregisterReceiver(this);
        }
    }
}

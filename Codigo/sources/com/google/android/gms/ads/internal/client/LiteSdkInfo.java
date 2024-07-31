package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbsr;
import com.google.android.gms.internal.ads.zzbsv;

/* loaded from: classes.dex */
public class LiteSdkInfo extends l1 {
    public LiteSdkInfo(Context context) {
    }

    @Override // com.google.android.gms.ads.internal.client.m1
    public zzbsv getAdapterCreator() {
        return new zzbsr();
    }

    @Override // com.google.android.gms.ads.internal.client.m1
    public q3 getLiteSdkVersion() {
        return new q3(ModuleDescriptor.MODULE_VERSION, 240304000, "23.0.0");
    }
}

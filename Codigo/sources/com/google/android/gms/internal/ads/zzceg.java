package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* loaded from: classes2.dex */
public final class zzceg {
    public static Context zza(Context context) {
        return zzc(context).b();
    }

    public static Object zzb(Context context, String str, zzcee zzceeVar) {
        try {
            return zzceeVar.zza(zzc(context).d(str));
        } catch (Exception e10) {
            throw new zzcef(e10);
        }
    }

    private static DynamiteModule zzc(Context context) {
        try {
            return DynamiteModule.e(context, DynamiteModule.f9718b, ModuleDescriptor.MODULE_ID);
        } catch (Exception e10) {
            throw new zzcef(e10);
        }
    }
}

package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbhv;
import com.google.android.gms.internal.ads.zzbij;
import com.google.android.gms.internal.ads.zzcdv;
import com.google.android.gms.internal.ads.zzcec;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a */
    private static final f1 f8784a;

    static {
        f1 f1Var = null;
        try {
            Object newInstance = v.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (newInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) newInstance;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    f1Var = queryLocalInterface instanceof f1 ? (f1) queryLocalInterface : new d1(iBinder);
                }
            } else {
                zzcec.zzj("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            zzcec.zzj("Failed to instantiate ClientApi class.");
        }
        f8784a = f1Var;
    }

    private final Object e() {
        f1 f1Var = f8784a;
        if (f1Var == null) {
            zzcec.zzj("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return b(f1Var);
        } catch (RemoteException e10) {
            zzcec.zzk("Cannot invoke local loader using ClientApi class.", e10);
            return null;
        }
    }

    private final Object f() {
        try {
            return c();
        } catch (RemoteException e10) {
            zzcec.zzk("Cannot invoke remote loader.", e10);
            return null;
        }
    }

    protected abstract Object a();

    protected abstract Object b(f1 f1Var);

    protected abstract Object c();

    public final Object d(Context context, boolean z10) {
        boolean z11;
        Object e10;
        if (!z10) {
            x.b();
            if (!zzcdv.zzs(context, ca.k.f6983a)) {
                zzcec.zze("Google Play Services is not available.");
                z10 = true;
            }
        }
        boolean z12 = false;
        boolean z13 = !(DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) <= DynamiteModule.c(context, ModuleDescriptor.MODULE_ID));
        zzbgc.zza(context);
        if (((Boolean) zzbhv.zza.zze()).booleanValue()) {
            z11 = false;
        } else if (((Boolean) zzbhv.zzb.zze()).booleanValue()) {
            z11 = true;
            z12 = true;
        } else {
            z12 = z10 | z13;
            z11 = false;
        }
        if (z12) {
            e10 = e();
            if (e10 == null && !z11) {
                e10 = f();
            }
        } else {
            Object f10 = f();
            if (f10 == null) {
                if (x.e().nextInt(((Long) zzbij.zza.zze()).intValue()) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    x.b().zzn(context, x.c().zza, "gmob-apps", bundle, true);
                }
            }
            e10 = f10 == null ? e() : f10;
        }
        return e10 == null ? a() : e10;
    }
}

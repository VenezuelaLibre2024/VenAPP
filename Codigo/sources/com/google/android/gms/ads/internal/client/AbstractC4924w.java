package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import ca.C1912k;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbhv;
import com.google.android.gms.internal.ads.zzbij;
import com.google.android.gms.internal.ads.zzcdv;
import com.google.android.gms.internal.ads.zzcec;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.ads.internal.client.w */
/* loaded from: classes.dex */
public abstract class AbstractC4924w {

    /* renamed from: a */
    private static final InterfaceC4820f1 f9871a;

    static {
        InterfaceC4820f1 interfaceC4820f1 = null;
        try {
            Object newInstance = C4918v.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (newInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) newInstance;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    interfaceC4820f1 = queryLocalInterface instanceof InterfaceC4820f1 ? (InterfaceC4820f1) queryLocalInterface : new C4806d1(iBinder);
                }
            } else {
                zzcec.zzj("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            zzcec.zzj("Failed to instantiate ClientApi class.");
        }
        f9871a = interfaceC4820f1;
    }

    /* renamed from: e */
    private final Object m12469e() {
        InterfaceC4820f1 interfaceC4820f1 = f9871a;
        if (interfaceC4820f1 == null) {
            zzcec.zzj("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return mo12367b(interfaceC4820f1);
        } catch (RemoteException e10) {
            zzcec.zzk("Cannot invoke local loader using ClientApi class.", e10);
            return null;
        }
    }

    /* renamed from: f */
    private final Object m12470f() {
        try {
            return mo12368c();
        } catch (RemoteException e10) {
            zzcec.zzk("Cannot invoke remote loader.", e10);
            return null;
        }
    }

    /* renamed from: a */
    protected abstract Object mo12366a();

    /* renamed from: b */
    protected abstract Object mo12367b(InterfaceC4820f1 interfaceC4820f1);

    /* renamed from: c */
    protected abstract Object mo12368c();

    /* renamed from: d */
    public final Object m12471d(Context context, boolean z10) {
        boolean z11;
        Object m12469e;
        if (!z10) {
            C4930x.m12474b();
            if (!zzcdv.zzs(context, C1912k.f7932a)) {
                zzcec.zze("Google Play Services is not available.");
                z10 = true;
            }
        }
        boolean z12 = false;
        boolean z13 = !(DynamiteModule.m13416a(context, ModuleDescriptor.MODULE_ID) <= DynamiteModule.m13417c(context, ModuleDescriptor.MODULE_ID));
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
            m12469e = m12469e();
            if (m12469e == null && !z11) {
                m12469e = m12470f();
            }
        } else {
            Object m12470f = m12470f();
            if (m12470f == null) {
                if (C4930x.m12477e().nextInt(((Long) zzbij.zza.zze()).intValue()) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    C4930x.m12474b().zzn(context, C4930x.m12475c().zza, "gmob-apps", bundle, true);
                }
            }
            m12469e = m12470f == null ? m12469e() : m12470f;
        }
        return m12469e == null ? mo12366a() : m12469e;
    }
}

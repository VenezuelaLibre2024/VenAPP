package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbpd;
import com.google.android.gms.internal.ads.zzbpl;
import com.google.android.gms.internal.ads.zzbpm;
import com.google.android.gms.internal.ads.zzbsn;
import com.google.android.gms.internal.ads.zzbsr;
import com.google.android.gms.internal.ads.zzcdr;
import com.google.android.gms.internal.ads.zzcec;
import e9.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import x8.y;

/* loaded from: classes.dex */
public final class m3 {

    /* renamed from: i */
    private static m3 f8697i;

    /* renamed from: f */
    private p1 f8703f;

    /* renamed from: a */
    private final Object f8698a = new Object();

    /* renamed from: c */
    private boolean f8700c = false;

    /* renamed from: d */
    private boolean f8701d = false;

    /* renamed from: e */
    private final Object f8702e = new Object();

    /* renamed from: g */
    private x8.s f8704g = null;

    /* renamed from: h */
    private x8.y f8705h = new y.a().a();

    /* renamed from: b */
    private final ArrayList f8699b = new ArrayList();

    private m3() {
    }

    private final void a(Context context) {
        if (this.f8703f == null) {
            this.f8703f = (p1) new r(x.a(), context).d(context, false);
        }
    }

    private final void b(x8.y yVar) {
        try {
            this.f8703f.zzu(new i4(yVar));
        } catch (RemoteException e10) {
            zzcec.zzh("Unable to set request configuration parcel.", e10);
        }
    }

    public static m3 h() {
        m3 m3Var;
        synchronized (m3.class) {
            if (f8697i == null) {
                f8697i = new m3();
            }
            m3Var = f8697i;
        }
        return m3Var;
    }

    public static e9.b x(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbpd zzbpdVar = (zzbpd) it.next();
            hashMap.put(zzbpdVar.zza, new zzbpl(zzbpdVar.zzb ? a.EnumC0222a.READY : a.EnumC0222a.NOT_READY, zzbpdVar.zzd, zzbpdVar.zzc));
        }
        return new zzbpm(hashMap);
    }

    private final void y(Context context, String str) {
        try {
            zzbsn.zza().zzb(context, null);
            this.f8703f.zzk();
            this.f8703f.zzl(null, com.google.android.gms.dynamic.d.h2(null));
        } catch (RemoteException e10) {
            zzcec.zzk("MobileAdsSettingManager initialization failed", e10);
        }
    }

    public final float c() {
        synchronized (this.f8702e) {
            p1 p1Var = this.f8703f;
            float f10 = 1.0f;
            if (p1Var == null) {
                return 1.0f;
            }
            try {
                f10 = p1Var.zze();
            } catch (RemoteException e10) {
                zzcec.zzh("Unable to get app volume.", e10);
            }
            return f10;
        }
    }

    public final x8.y e() {
        return this.f8705h;
    }

    public final e9.b g() {
        e9.b x10;
        synchronized (this.f8702e) {
            com.google.android.gms.common.internal.s.o(this.f8703f != null, "MobileAds.initialize() must be called prior to getting initialization status.");
            try {
                x10 = x(this.f8703f.zzg());
            } catch (RemoteException unused) {
                zzcec.zzg("Unable to get Initialization status.");
                return new e9.b() { // from class: com.google.android.gms.ads.internal.client.e3
                    public /* synthetic */ e3() {
                    }

                    @Override // e9.b
                    public final Map getAdapterStatusMap() {
                        HashMap hashMap = new HashMap();
                        hashMap.put("com.google.android.gms.ads.MobileAds", new h3(m3.this));
                        return hashMap;
                    }
                };
            }
        }
        return x10;
    }

    public final void m(Context context) {
        synchronized (this.f8702e) {
            a(context);
            try {
                this.f8703f.zzi();
            } catch (RemoteException unused) {
                zzcec.zzg("Unable to disable mediation adapter initialization.");
            }
        }
    }

    public final void n(Context context, String str, e9.c cVar) {
        synchronized (this.f8698a) {
            if (this.f8700c) {
                if (cVar != null) {
                    this.f8699b.add(cVar);
                }
                return;
            }
            if (this.f8701d) {
                if (cVar != null) {
                    cVar.onInitializationComplete(g());
                }
                return;
            }
            this.f8700c = true;
            if (cVar != null) {
                this.f8699b.add(cVar);
            }
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null.");
            }
            synchronized (this.f8702e) {
                try {
                    a(context);
                    this.f8703f.zzs(new l3(this, null));
                    this.f8703f.zzo(new zzbsr());
                    if (this.f8705h.c() != -1 || this.f8705h.d() != -1) {
                        b(this.f8705h);
                    }
                } catch (RemoteException e10) {
                    zzcec.zzk("MobileAdsSettingManager initialization failed", e10);
                }
                zzbgc.zza(context);
                if (((Boolean) zzbhy.zza.zze()).booleanValue()) {
                    if (((Boolean) a0.c().zza(zzbgc.zzkF)).booleanValue()) {
                        zzcec.zze("Initializing on bg thread");
                        zzcdr.zza.execute(new Runnable(context, null) { // from class: com.google.android.gms.ads.internal.client.f3

                            /* renamed from: b */
                            public final /* synthetic */ Context f8663b;

                            public /* synthetic */ f3(Context context2, String str2) {
                                this.f8663b = context2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                m3.this.o(this.f8663b, null);
                            }
                        });
                    }
                }
                if (((Boolean) zzbhy.zzb.zze()).booleanValue()) {
                    if (((Boolean) a0.c().zza(zzbgc.zzkF)).booleanValue()) {
                        zzcdr.zzb.execute(new Runnable(context2, null) { // from class: com.google.android.gms.ads.internal.client.g3

                            /* renamed from: b */
                            public final /* synthetic */ Context f8667b;

                            public /* synthetic */ g3(Context context2, String str2) {
                                this.f8667b = context2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                m3.this.p(this.f8667b, null);
                            }
                        });
                    }
                }
                zzcec.zze("Initializing on calling thread");
                y(context2, null);
            }
        }
    }

    public final /* synthetic */ void o(Context context, String str) {
        synchronized (this.f8702e) {
            y(context, null);
        }
    }

    public final /* synthetic */ void p(Context context, String str) {
        synchronized (this.f8702e) {
            y(context, null);
        }
    }

    public final void q(Context context, x8.s sVar) {
        synchronized (this.f8702e) {
            a(context);
            this.f8704g = sVar;
            try {
                this.f8703f.zzm(new j3(null));
            } catch (RemoteException unused) {
                zzcec.zzg("Unable to open the ad inspector.");
                if (sVar != null) {
                    sVar.onAdInspectorClosed(new x8.d(0, "Ad inspector had an internal error.", "com.google.android.gms.ads"));
                }
            }
        }
    }

    public final void r(Context context, String str) {
        synchronized (this.f8702e) {
            com.google.android.gms.common.internal.s.o(this.f8703f != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.f8703f.zzn(com.google.android.gms.dynamic.d.h2(context), str);
            } catch (RemoteException e10) {
                zzcec.zzh("Unable to open debug menu.", e10);
            }
        }
    }

    public final void s(boolean z10) {
        synchronized (this.f8702e) {
            com.google.android.gms.common.internal.s.o(this.f8703f != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.f8703f.zzp(z10);
            } catch (RemoteException e10) {
                zzcec.zzh("Unable to set app mute state.", e10);
            }
        }
    }

    public final void t(float f10) {
        boolean z10 = true;
        com.google.android.gms.common.internal.s.b(f10 >= 0.0f && f10 <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.f8702e) {
            if (this.f8703f == null) {
                z10 = false;
            }
            com.google.android.gms.common.internal.s.o(z10, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.f8703f.zzq(f10);
            } catch (RemoteException e10) {
                zzcec.zzh("Unable to set app volume.", e10);
            }
        }
    }

    public final void u(String str) {
        synchronized (this.f8702e) {
            com.google.android.gms.common.internal.s.o(this.f8703f != null, "MobileAds.initialize() must be called prior to setting the plugin.");
            try {
                this.f8703f.zzt(str);
            } catch (RemoteException e10) {
                zzcec.zzh("Unable to set plugin.", e10);
            }
        }
    }

    public final void v(x8.y yVar) {
        com.google.android.gms.common.internal.s.b(yVar != null, "Null passed to setRequestConfiguration.");
        synchronized (this.f8702e) {
            x8.y yVar2 = this.f8705h;
            this.f8705h = yVar;
            if (this.f8703f == null) {
                return;
            }
            if (yVar2.c() != yVar.c() || yVar2.d() != yVar.d()) {
                b(yVar);
            }
        }
    }

    public final boolean w() {
        synchronized (this.f8702e) {
            p1 p1Var = this.f8703f;
            boolean z10 = false;
            if (p1Var == null) {
                return false;
            }
            try {
                z10 = p1Var.zzv();
            } catch (RemoteException e10) {
                zzcec.zzh("Unable to get app mute state.", e10);
            }
            return z10;
        }
    }
}

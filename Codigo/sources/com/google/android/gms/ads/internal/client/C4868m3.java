package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.dynamic.BinderC5314d;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbpd;
import com.google.android.gms.internal.ads.zzbpl;
import com.google.android.gms.internal.ads.zzbpm;
import com.google.android.gms.internal.ads.zzbsn;
import com.google.android.gms.internal.ads.zzbsr;
import com.google.android.gms.internal.ads.zzcdr;
import com.google.android.gms.internal.ads.zzcec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import p080e9.InterfaceC7135a;
import p080e9.InterfaceC7136b;
import p080e9.InterfaceC7137c;
import p438x8.C12357d;
import p438x8.C12387y;
import p438x8.InterfaceC12381s;

/* renamed from: com.google.android.gms.ads.internal.client.m3 */
/* loaded from: classes.dex */
public final class C4868m3 {

    /* renamed from: i */
    private static C4868m3 f9774i;

    /* renamed from: f */
    private InterfaceC4884p1 f9780f;

    /* renamed from: a */
    private final Object f9775a = new Object();

    /* renamed from: c */
    private boolean f9777c = false;

    /* renamed from: d */
    private boolean f9778d = false;

    /* renamed from: e */
    private final Object f9779e = new Object();

    /* renamed from: g */
    private InterfaceC12381s f9781g = null;

    /* renamed from: h */
    private C12387y f9782h = new C12387y.a().m40040a();

    /* renamed from: b */
    private final ArrayList f9776b = new ArrayList();

    private C4868m3() {
    }

    /* renamed from: a */
    private final void m12408a(Context context) {
        if (this.f9780f == null) {
            this.f9780f = (InterfaceC4884p1) new C4894r(C4930x.m12473a(), context).m12471d(context, false);
        }
    }

    /* renamed from: b */
    private final void m12409b(C12387y c12387y) {
        try {
            this.f9780f.zzu(new C4844i4(c12387y));
        } catch (RemoteException e10) {
            zzcec.zzh("Unable to set request configuration parcel.", e10);
        }
    }

    /* renamed from: h */
    public static C4868m3 m12412h() {
        C4868m3 c4868m3;
        synchronized (C4868m3.class) {
            if (f9774i == null) {
                f9774i = new C4868m3();
            }
            c4868m3 = f9774i;
        }
        return c4868m3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static InterfaceC7136b m12417x(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbpd zzbpdVar = (zzbpd) it.next();
            hashMap.put(zzbpdVar.zza, new zzbpl(zzbpdVar.zzb ? InterfaceC7135a.a.READY : InterfaceC7135a.a.NOT_READY, zzbpdVar.zzd, zzbpdVar.zzc));
        }
        return new zzbpm(hashMap);
    }

    /* renamed from: y */
    private final void m12418y(Context context, String str) {
        try {
            zzbsn.zza().zzb(context, null);
            this.f9780f.zzk();
            this.f9780f.zzl(null, BinderC5314d.m13412h2(null));
        } catch (RemoteException e10) {
            zzcec.zzk("MobileAdsSettingManager initialization failed", e10);
        }
    }

    /* renamed from: c */
    public final float m12419c() {
        synchronized (this.f9779e) {
            InterfaceC4884p1 interfaceC4884p1 = this.f9780f;
            float f10 = 1.0f;
            if (interfaceC4884p1 == null) {
                return 1.0f;
            }
            try {
                f10 = interfaceC4884p1.zze();
            } catch (RemoteException e10) {
                zzcec.zzh("Unable to get app volume.", e10);
            }
            return f10;
        }
    }

    /* renamed from: e */
    public final C12387y m12420e() {
        return this.f9782h;
    }

    /* renamed from: g */
    public final InterfaceC7136b m12421g() {
        InterfaceC7136b m12417x;
        synchronized (this.f9779e) {
            C5276s.m13329o(this.f9780f != null, "MobileAds.initialize() must be called prior to getting initialization status.");
            try {
                m12417x = m12417x(this.f9780f.zzg());
            } catch (RemoteException unused) {
                zzcec.zzg("Unable to get Initialization status.");
                return new InterfaceC7136b() { // from class: com.google.android.gms.ads.internal.client.e3
                    @Override // p080e9.InterfaceC7136b
                    public final Map getAdapterStatusMap() {
                        HashMap hashMap = new HashMap();
                        hashMap.put("com.google.android.gms.ads.MobileAds", new C4836h3(C4868m3.this));
                        return hashMap;
                    }
                };
            }
        }
        return m12417x;
    }

    /* renamed from: m */
    public final void m12422m(Context context) {
        synchronized (this.f9779e) {
            m12408a(context);
            try {
                this.f9780f.zzi();
            } catch (RemoteException unused) {
                zzcec.zzg("Unable to disable mediation adapter initialization.");
            }
        }
    }

    /* renamed from: n */
    public final void m12423n(final Context context, String str, InterfaceC7137c interfaceC7137c) {
        synchronized (this.f9775a) {
            if (this.f9777c) {
                if (interfaceC7137c != null) {
                    this.f9776b.add(interfaceC7137c);
                }
                return;
            }
            if (this.f9778d) {
                if (interfaceC7137c != null) {
                    interfaceC7137c.onInitializationComplete(m12421g());
                }
                return;
            }
            this.f9777c = true;
            if (interfaceC7137c != null) {
                this.f9776b.add(interfaceC7137c);
            }
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null.");
            }
            synchronized (this.f9779e) {
                C4856k3 c4856k3 = null;
                byte b10 = 0;
                byte b11 = 0;
                try {
                    m12408a(context);
                    this.f9780f.zzs(new BinderC4862l3(this, c4856k3));
                    this.f9780f.zzo(new zzbsr());
                    if (this.f9782h.m40036c() != -1 || this.f9782h.m40037d() != -1) {
                        m12409b(this.f9782h);
                    }
                } catch (RemoteException e10) {
                    zzcec.zzk("MobileAdsSettingManager initialization failed", e10);
                }
                zzbgc.zza(context);
                if (((Boolean) zzbhy.zza.zze()).booleanValue()) {
                    if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzkF)).booleanValue()) {
                        zzcec.zze("Initializing on bg thread");
                        ThreadPoolExecutor threadPoolExecutor = zzcdr.zza;
                        final byte b12 = b11 == true ? 1 : 0;
                        threadPoolExecutor.execute(new Runnable(context, b12) { // from class: com.google.android.gms.ads.internal.client.f3

                            /* renamed from: b */
                            public final /* synthetic */ Context f9740b;

                            @Override // java.lang.Runnable
                            public final void run() {
                                C4868m3.this.m12424o(this.f9740b, null);
                            }
                        });
                    }
                }
                if (((Boolean) zzbhy.zzb.zze()).booleanValue()) {
                    if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzkF)).booleanValue()) {
                        ExecutorService executorService = zzcdr.zzb;
                        final byte b13 = b10 == true ? 1 : 0;
                        executorService.execute(new Runnable(context, b13) { // from class: com.google.android.gms.ads.internal.client.g3

                            /* renamed from: b */
                            public final /* synthetic */ Context f9744b;

                            @Override // java.lang.Runnable
                            public final void run() {
                                C4868m3.this.m12425p(this.f9744b, null);
                            }
                        });
                    }
                }
                zzcec.zze("Initializing on calling thread");
                m12418y(context, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void m12424o(Context context, String str) {
        synchronized (this.f9779e) {
            m12418y(context, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public final /* synthetic */ void m12425p(Context context, String str) {
        synchronized (this.f9779e) {
            m12418y(context, null);
        }
    }

    /* renamed from: q */
    public final void m12426q(Context context, InterfaceC12381s interfaceC12381s) {
        synchronized (this.f9779e) {
            m12408a(context);
            this.f9781g = interfaceC12381s;
            try {
                this.f9780f.zzm(new BinderC4850j3(null));
            } catch (RemoteException unused) {
                zzcec.zzg("Unable to open the ad inspector.");
                if (interfaceC12381s != null) {
                    interfaceC12381s.onAdInspectorClosed(new C12357d(0, "Ad inspector had an internal error.", "com.google.android.gms.ads"));
                }
            }
        }
    }

    /* renamed from: r */
    public final void m12427r(Context context, String str) {
        synchronized (this.f9779e) {
            C5276s.m13329o(this.f9780f != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.f9780f.zzn(BinderC5314d.m13412h2(context), str);
            } catch (RemoteException e10) {
                zzcec.zzh("Unable to open debug menu.", e10);
            }
        }
    }

    /* renamed from: s */
    public final void m12428s(boolean z10) {
        synchronized (this.f9779e) {
            C5276s.m13329o(this.f9780f != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.f9780f.zzp(z10);
            } catch (RemoteException e10) {
                zzcec.zzh("Unable to set app mute state.", e10);
            }
        }
    }

    /* renamed from: t */
    public final void m12429t(float f10) {
        boolean z10 = true;
        C5276s.m13316b(f10 >= 0.0f && f10 <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.f9779e) {
            if (this.f9780f == null) {
                z10 = false;
            }
            C5276s.m13329o(z10, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.f9780f.zzq(f10);
            } catch (RemoteException e10) {
                zzcec.zzh("Unable to set app volume.", e10);
            }
        }
    }

    /* renamed from: u */
    public final void m12430u(String str) {
        synchronized (this.f9779e) {
            C5276s.m13329o(this.f9780f != null, "MobileAds.initialize() must be called prior to setting the plugin.");
            try {
                this.f9780f.zzt(str);
            } catch (RemoteException e10) {
                zzcec.zzh("Unable to set plugin.", e10);
            }
        }
    }

    /* renamed from: v */
    public final void m12431v(C12387y c12387y) {
        C5276s.m13316b(c12387y != null, "Null passed to setRequestConfiguration.");
        synchronized (this.f9779e) {
            C12387y c12387y2 = this.f9782h;
            this.f9782h = c12387y;
            if (this.f9780f == null) {
                return;
            }
            if (c12387y2.m40036c() != c12387y.m40036c() || c12387y2.m40037d() != c12387y.m40037d()) {
                m12409b(c12387y);
            }
        }
    }

    /* renamed from: w */
    public final boolean m12432w() {
        synchronized (this.f9779e) {
            InterfaceC4884p1 interfaceC4884p1 = this.f9780f;
            boolean z10 = false;
            if (interfaceC4884p1 == null) {
                return false;
            }
            try {
                z10 = interfaceC4884p1.zzv();
            } catch (RemoteException e10) {
                zzcec.zzh("Unable to get app mute state.", e10);
            }
            return z10;
        }
    }
}

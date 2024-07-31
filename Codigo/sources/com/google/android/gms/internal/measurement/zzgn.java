package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.android.gms.internal.measurement.zzgj;
import eb.g;
import eb.l;
import eb.o;
import eb.v;
import eb.w;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class zzgn<T> {
    private static volatile zzgu zzb = null;
    private static volatile boolean zzc = false;
    private final zzgv zzg;
    private final String zzh;
    private final T zzi;
    private volatile int zzj;
    private volatile T zzk;
    private final boolean zzl;
    private static final Object zza = new Object();
    private static final AtomicReference<Collection<zzgn<?>>> zzd = new AtomicReference<>();
    private static zzgy zze = new zzgy(zzgo.zza);
    private static final AtomicInteger zzf = new AtomicInteger();

    /* JADX INFO: Access modifiers changed from: private */
    public zzgn(zzgv zzgvVar, String str, T t10, boolean z10) {
        this.zzj = -1;
        String str2 = zzgvVar.zza;
        if (str2 == null && zzgvVar.zzb == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (str2 != null && zzgvVar.zzb != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.zzg = zzgvVar;
        this.zzh = str;
        this.zzi = t10;
        this.zzl = z10;
    }

    public /* synthetic */ zzgn(zzgv zzgvVar, String str, Object obj, boolean z10, zzgx zzgxVar) {
        this(zzgvVar, str, obj, true);
    }

    public static /* synthetic */ zzgn zza(zzgv zzgvVar, String str, Boolean bool, boolean z10) {
        return new zzgq(zzgvVar, str, bool, true);
    }

    public static /* synthetic */ zzgn zza(zzgv zzgvVar, String str, Double d10, boolean z10) {
        return new zzgt(zzgvVar, str, d10, true);
    }

    public static /* synthetic */ zzgn zza(zzgv zzgvVar, String str, Long l10, boolean z10) {
        return new zzgr(zzgvVar, str, l10, true);
    }

    public static /* synthetic */ zzgn zza(zzgv zzgvVar, String str, String str2, boolean z10) {
        return new zzgs(zzgvVar, str, str2, true);
    }

    private final T zza(zzgu zzguVar) {
        g<Context, Boolean> gVar;
        zzgv zzgvVar = this.zzg;
        if (!zzgvVar.zze && ((gVar = zzgvVar.zzh) == null || gVar.apply(zzguVar.zza()).booleanValue())) {
            zzgg zza2 = zzgg.zza(zzguVar.zza());
            zzgv zzgvVar2 = this.zzg;
            Object zza3 = zza2.zza(zzgvVar2.zze ? null : zza(zzgvVar2.zzc));
            if (zza3 != null) {
                return zza(zza3);
            }
        }
        return null;
    }

    private final String zza(String str) {
        if (str != null && str.isEmpty()) {
            return this.zzh;
        }
        return str + this.zzh;
    }

    private final T zzb(zzgu zzguVar) {
        Object zza2;
        zzgb zza3 = this.zzg.zzb != null ? zzgl.zza(zzguVar.zza(), this.zzg.zzb) ? this.zzg.zzg ? zzfy.zza(zzguVar.zza().getContentResolver(), zzgk.zza(zzgk.zza(zzguVar.zza(), this.zzg.zzb.getLastPathSegment())), zzgm.zza) : zzfy.zza(zzguVar.zza().getContentResolver(), this.zzg.zzb, zzgm.zza) : null : zzgw.zza(zzguVar.zza(), this.zzg.zza, zzgm.zza);
        if (zza3 == null || (zza2 = zza3.zza(zzb())) == null) {
            return null;
        }
        return zza(zza2);
    }

    public static void zzb(Context context) {
        if (zzb != null || context == null) {
            return;
        }
        Object obj = zza;
        synchronized (obj) {
            if (zzb == null) {
                synchronized (obj) {
                    zzgu zzguVar = zzb;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    if (zzguVar == null || zzguVar.zza() != context) {
                        zzfy.zzc();
                        zzgw.zza();
                        zzgg.zza();
                        zzb = new zzfv(context, w.a(new v() { // from class: com.google.android.gms.internal.measurement.zzgp
                            private /* synthetic */ Context zza;

                            public /* synthetic */ zzgp(Context context2) {
                                r1 = context2;
                            }

                            @Override // eb.v
                            public final Object get() {
                                l zza2;
                                zza2 = zzgj.zza.zza(r1);
                                return zza2;
                            }
                        }));
                        zzf.incrementAndGet();
                    }
                }
            }
        }
    }

    public static void zzc() {
        zzf.incrementAndGet();
    }

    public static /* synthetic */ boolean zzd() {
        return true;
    }

    public final T zza() {
        T zzb2;
        if (!this.zzl) {
            o.v(zze.zza(this.zzh), "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error.");
        }
        int i10 = zzf.get();
        if (this.zzj < i10) {
            synchronized (this) {
                if (this.zzj < i10) {
                    zzgu zzguVar = zzb;
                    l<zzgh> a10 = l.a();
                    String str = null;
                    if (zzguVar != null) {
                        a10 = zzguVar.zzb().get();
                        if (a10.c()) {
                            zzgh b10 = a10.b();
                            zzgv zzgvVar = this.zzg;
                            str = b10.zza(zzgvVar.zzb, zzgvVar.zza, zzgvVar.zzd, this.zzh);
                        }
                    }
                    o.v(zzguVar != null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                    if (!this.zzg.zzf ? (zzb2 = zzb(zzguVar)) == null && (zzb2 = zza(zzguVar)) == null : (zzb2 = zza(zzguVar)) == null && (zzb2 = zzb(zzguVar)) == null) {
                        zzb2 = this.zzi;
                    }
                    if (a10.c()) {
                        zzb2 = str == null ? this.zzi : zza((Object) str);
                    }
                    this.zzk = zzb2;
                    this.zzj = i10;
                }
            }
        }
        return this.zzk;
    }

    abstract T zza(Object obj);

    public final String zzb() {
        return zza(this.zzg.zzd);
    }
}

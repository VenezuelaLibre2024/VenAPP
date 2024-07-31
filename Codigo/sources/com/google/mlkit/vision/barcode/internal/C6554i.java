package com.google.mlkit.vision.barcode.internal;

import ag.C0113a;
import android.os.SystemClock;
import bg.C1777a;
import bg.C1780d;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzft;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfv;
import com.google.android.gms.internal.mlkit_vision_barcode.zzol;
import com.google.android.gms.internal.mlkit_vision_barcode.zzop;
import com.google.android.gms.internal.mlkit_vision_barcode.zzoq;
import com.google.android.gms.internal.mlkit_vision_barcode.zzow;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpi;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpx;
import com.google.android.gms.internal.mlkit_vision_barcode.zztm;
import com.google.android.gms.internal.mlkit_vision_barcode.zztw;
import com.google.android.gms.internal.mlkit_vision_barcode.zztx;
import com.google.android.gms.internal.mlkit_vision_barcode.zztz;
import com.google.android.gms.internal.mlkit_vision_barcode.zzua;
import com.google.mlkit.common.sdkinternal.AbstractC6518f;
import com.google.mlkit.common.sdkinternal.C6520g;
import com.google.mlkit.common.sdkinternal.C6524i;
import java.util.Iterator;
import java.util.List;
import p313qf.C10475a;
import p402vf.C11886b;
import p445xf.C12482a;

/* renamed from: com.google.mlkit.vision.barcode.internal.i */
/* loaded from: classes2.dex */
public final class C6554i extends AbstractC6518f {

    /* renamed from: j */
    private static final C1780d f14392j = C1780d.m9501b();

    /* renamed from: k */
    static boolean f14393k = true;

    /* renamed from: d */
    private final C11886b f14394d;

    /* renamed from: e */
    private final InterfaceC6555j f14395e;

    /* renamed from: f */
    private final zztx f14396f;

    /* renamed from: g */
    private final zztz f14397g;

    /* renamed from: h */
    private final C1777a f14398h = new C1777a();

    /* renamed from: i */
    private boolean f14399i;

    public C6554i(C6524i c6524i, C11886b c11886b, InterfaceC6555j interfaceC6555j, zztx zztxVar) {
        C5276s.m13325k(c6524i, "MlKitContext can not be null");
        C5276s.m13325k(c11886b, "BarcodeScannerOptions can not be null");
        this.f14394d = c11886b;
        this.f14395e = interfaceC6555j;
        this.f14396f = zztxVar;
        this.f14397g = zztz.zza(c6524i.m18316b());
    }

    /* renamed from: m */
    private final void m18359m(final zzpj zzpjVar, long j10, final C0113a c0113a, List list) {
        final zzcs zzcsVar = new zzcs();
        final zzcs zzcsVar2 = new zzcs();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C12482a c12482a = (C12482a) it.next();
                zzcsVar.zzd(C6547b.m18350a(c12482a.m40756h()));
                zzcsVar2.zzd(C6547b.m18351b(c12482a.m40763o()));
            }
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        this.f14396f.zzf(new zztw() { // from class: com.google.mlkit.vision.barcode.internal.g
            @Override // com.google.android.gms.internal.mlkit_vision_barcode.zztw
            public final zztm zza() {
                return C6554i.this.m18360j(elapsedRealtime, zzpjVar, zzcsVar, zzcsVar2, c0113a);
            }
        }, zzpk.ON_DEVICE_BARCODE_DETECT);
        zzft zzftVar = new zzft();
        zzftVar.zze(zzpjVar);
        zzftVar.zzf(Boolean.valueOf(f14393k));
        zzftVar.zzg(C6547b.m18352c(this.f14394d));
        zzftVar.zzc(zzcsVar.zzf());
        zzftVar.zzd(zzcsVar2.zzf());
        final zzfv zzh = zzftVar.zzh();
        final C6553h c6553h = new C6553h(this);
        final zztx zztxVar = this.f14396f;
        final zzpk zzpkVar = zzpk.AGGREGATED_ON_DEVICE_BARCODE_DETECTION;
        C6520g.m18308d().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zztu
            @Override // java.lang.Runnable
            public final void run() {
                zztx.this.zzh(zzpkVar, zzh, elapsedRealtime, c6553h);
            }
        });
        long currentTimeMillis = System.currentTimeMillis();
        this.f14397g.zzc(true != this.f14399i ? 24301 : 24302, zzpjVar.zza(), currentTimeMillis - elapsedRealtime, currentTimeMillis);
    }

    @Override // com.google.mlkit.common.sdkinternal.AbstractC6528k
    /* renamed from: b */
    public final synchronized void mo18321b() {
        this.f14399i = this.f14395e.zzc();
    }

    @Override // com.google.mlkit.common.sdkinternal.AbstractC6528k
    /* renamed from: d */
    public final synchronized void mo18323d() {
        this.f14395e.zzb();
        f14393k = true;
        zztx zztxVar = this.f14396f;
        zzpl zzplVar = new zzpl();
        zzplVar.zze(this.f14399i ? zzpi.TYPE_THICK : zzpi.TYPE_THIN);
        zzpx zzpxVar = new zzpx();
        zzpxVar.zzi(C6547b.m18352c(this.f14394d));
        zzplVar.zzg(zzpxVar.zzj());
        zztxVar.zzd(zzua.zzf(zzplVar), zzpk.ON_DEVICE_BARCODE_CLOSE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ zztm m18360j(long j10, zzpj zzpjVar, zzcs zzcsVar, zzcs zzcsVar2, C0113a c0113a) {
        zzpx zzpxVar = new zzpx();
        zzow zzowVar = new zzow();
        zzowVar.zzc(Long.valueOf(j10));
        zzowVar.zzd(zzpjVar);
        zzowVar.zze(Boolean.valueOf(f14393k));
        Boolean bool = Boolean.TRUE;
        zzowVar.zza(bool);
        zzowVar.zzb(bool);
        zzpxVar.zzh(zzowVar.zzf());
        zzpxVar.zzi(C6547b.m18352c(this.f14394d));
        zzpxVar.zze(zzcsVar.zzf());
        zzpxVar.zzf(zzcsVar2.zzf());
        int m538f = c0113a.m538f();
        int m9503c = f14392j.m9503c(c0113a);
        zzop zzopVar = new zzop();
        zzopVar.zza(m538f != -1 ? m538f != 35 ? m538f != 842094169 ? m538f != 16 ? m538f != 17 ? zzoq.UNKNOWN_FORMAT : zzoq.NV21 : zzoq.NV16 : zzoq.YV12 : zzoq.YUV_420_888 : zzoq.BITMAP);
        zzopVar.zzb(Integer.valueOf(m9503c));
        zzpxVar.zzg(zzopVar.zzd());
        zzpl zzplVar = new zzpl();
        zzplVar.zze(this.f14399i ? zzpi.TYPE_THICK : zzpi.TYPE_THIN);
        zzplVar.zzg(zzpxVar.zzj());
        return zzua.zzf(zzplVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ zztm m18361k(zzfv zzfvVar, int i10, zzol zzolVar) {
        zzpl zzplVar = new zzpl();
        zzplVar.zze(this.f14399i ? zzpi.TYPE_THICK : zzpi.TYPE_THIN);
        zzfs zzfsVar = new zzfs();
        zzfsVar.zza(Integer.valueOf(i10));
        zzfsVar.zzc(zzfvVar);
        zzfsVar.zzb(zzolVar);
        zzplVar.zzd(zzfsVar.zze());
        return zzua.zzf(zzplVar);
    }

    @Override // com.google.mlkit.common.sdkinternal.AbstractC6518f
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final synchronized List mo18306i(C0113a c0113a) {
        List mo18363a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f14398h.m9489a(c0113a);
        try {
            mo18363a = this.f14395e.mo18363a(c0113a);
            m18359m(zzpj.NO_ERROR, elapsedRealtime, c0113a, mo18363a);
            f14393k = false;
        } catch (C10475a e10) {
            m18359m(e10.m31418a() == 14 ? zzpj.MODEL_NOT_DOWNLOADED : zzpj.UNKNOWN_ERROR, elapsedRealtime, c0113a, null);
            throw e10;
        }
        return mo18363a;
    }
}

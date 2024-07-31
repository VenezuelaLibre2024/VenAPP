package com.google.mlkit.vision.barcode.internal;

import android.os.SystemClock;
import com.google.android.gms.common.internal.s;
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
import com.google.mlkit.vision.barcode.internal.h;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class i extends com.google.mlkit.common.sdkinternal.f {

    /* renamed from: j */
    private static final bg.d f13118j = bg.d.b();

    /* renamed from: k */
    static boolean f13119k = true;

    /* renamed from: d */
    private final vf.b f13120d;

    /* renamed from: e */
    private final j f13121e;

    /* renamed from: f */
    private final zztx f13122f;

    /* renamed from: g */
    private final zztz f13123g;

    /* renamed from: h */
    private final bg.a f13124h = new bg.a();

    /* renamed from: i */
    private boolean f13125i;

    public i(com.google.mlkit.common.sdkinternal.i iVar, vf.b bVar, j jVar, zztx zztxVar) {
        s.k(iVar, "MlKitContext can not be null");
        s.k(bVar, "BarcodeScannerOptions can not be null");
        this.f13120d = bVar;
        this.f13121e = jVar;
        this.f13122f = zztxVar;
        this.f13123g = zztz.zza(iVar.b());
    }

    private final void m(zzpj zzpjVar, long j10, ag.a aVar, List list) {
        zzcs zzcsVar = new zzcs();
        zzcs zzcsVar2 = new zzcs();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                xf.a aVar2 = (xf.a) it.next();
                zzcsVar.zzd(b.a(aVar2.h()));
                zzcsVar2.zzd(b.b(aVar2.o()));
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        this.f13122f.zzf(new zztw() { // from class: com.google.mlkit.vision.barcode.internal.g

            /* renamed from: b */
            public final /* synthetic */ long f13112b;

            /* renamed from: c */
            public final /* synthetic */ zzpj f13113c;

            /* renamed from: d */
            public final /* synthetic */ zzcs f13114d;

            /* renamed from: e */
            public final /* synthetic */ zzcs f13115e;

            /* renamed from: f */
            public final /* synthetic */ ag.a f13116f;

            public /* synthetic */ g(long elapsedRealtime2, zzpj zzpjVar2, zzcs zzcsVar3, zzcs zzcsVar22, ag.a aVar3) {
                r2 = elapsedRealtime2;
                r4 = zzpjVar2;
                r5 = zzcsVar3;
                r6 = zzcsVar22;
                r7 = aVar3;
            }

            @Override // com.google.android.gms.internal.mlkit_vision_barcode.zztw
            public final zztm zza() {
                return i.this.j(r2, r4, r5, r6, r7);
            }
        }, zzpk.ON_DEVICE_BARCODE_DETECT);
        zzft zzftVar = new zzft();
        zzftVar.zze(zzpjVar2);
        zzftVar.zzf(Boolean.valueOf(f13119k));
        zzftVar.zzg(b.c(this.f13120d));
        zzftVar.zzc(zzcsVar3.zzf());
        zzftVar.zzd(zzcsVar22.zzf());
        com.google.mlkit.common.sdkinternal.g.d().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zztu
            public final /* synthetic */ zzpk zzb;
            public final /* synthetic */ Object zzc;
            public final /* synthetic */ long zzd;
            public final /* synthetic */ h zze;

            public /* synthetic */ zztu(zzpk zzpkVar, Object obj, long elapsedRealtime2, h hVar) {
                r2 = zzpkVar;
                r3 = obj;
                r4 = elapsedRealtime2;
                r6 = hVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zztx.this.zzh(r2, r3, r4, r6);
            }
        });
        long currentTimeMillis = System.currentTimeMillis();
        this.f13123g.zzc(true != this.f13125i ? 24301 : 24302, zzpjVar2.zza(), currentTimeMillis - elapsedRealtime2, currentTimeMillis);
    }

    @Override // com.google.mlkit.common.sdkinternal.k
    public final synchronized void b() {
        this.f13125i = this.f13121e.zzc();
    }

    @Override // com.google.mlkit.common.sdkinternal.k
    public final synchronized void d() {
        this.f13121e.zzb();
        f13119k = true;
        zztx zztxVar = this.f13122f;
        zzpl zzplVar = new zzpl();
        zzplVar.zze(this.f13125i ? zzpi.TYPE_THICK : zzpi.TYPE_THIN);
        zzpx zzpxVar = new zzpx();
        zzpxVar.zzi(b.c(this.f13120d));
        zzplVar.zzg(zzpxVar.zzj());
        zztxVar.zzd(zzua.zzf(zzplVar), zzpk.ON_DEVICE_BARCODE_CLOSE);
    }

    public final /* synthetic */ zztm j(long j10, zzpj zzpjVar, zzcs zzcsVar, zzcs zzcsVar2, ag.a aVar) {
        zzpx zzpxVar = new zzpx();
        zzow zzowVar = new zzow();
        zzowVar.zzc(Long.valueOf(j10));
        zzowVar.zzd(zzpjVar);
        zzowVar.zze(Boolean.valueOf(f13119k));
        Boolean bool = Boolean.TRUE;
        zzowVar.zza(bool);
        zzowVar.zzb(bool);
        zzpxVar.zzh(zzowVar.zzf());
        zzpxVar.zzi(b.c(this.f13120d));
        zzpxVar.zze(zzcsVar.zzf());
        zzpxVar.zzf(zzcsVar2.zzf());
        int f10 = aVar.f();
        int c10 = f13118j.c(aVar);
        zzop zzopVar = new zzop();
        zzopVar.zza(f10 != -1 ? f10 != 35 ? f10 != 842094169 ? f10 != 16 ? f10 != 17 ? zzoq.UNKNOWN_FORMAT : zzoq.NV21 : zzoq.NV16 : zzoq.YV12 : zzoq.YUV_420_888 : zzoq.BITMAP);
        zzopVar.zzb(Integer.valueOf(c10));
        zzpxVar.zzg(zzopVar.zzd());
        zzpl zzplVar = new zzpl();
        zzplVar.zze(this.f13125i ? zzpi.TYPE_THICK : zzpi.TYPE_THIN);
        zzplVar.zzg(zzpxVar.zzj());
        return zzua.zzf(zzplVar);
    }

    public final /* synthetic */ zztm k(zzfv zzfvVar, int i10, zzol zzolVar) {
        zzpl zzplVar = new zzpl();
        zzplVar.zze(this.f13125i ? zzpi.TYPE_THICK : zzpi.TYPE_THIN);
        zzfs zzfsVar = new zzfs();
        zzfsVar.zza(Integer.valueOf(i10));
        zzfsVar.zzc(zzfvVar);
        zzfsVar.zzb(zzolVar);
        zzplVar.zzd(zzfsVar.zze());
        return zzua.zzf(zzplVar);
    }

    @Override // com.google.mlkit.common.sdkinternal.f
    /* renamed from: l */
    public final synchronized List i(ag.a aVar) {
        List a10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f13124h.a(aVar);
        try {
            a10 = this.f13121e.a(aVar);
            m(zzpj.NO_ERROR, elapsedRealtime, aVar, a10);
            f13119k = false;
        } catch (qf.a e10) {
            m(e10.a() == 14 ? zzpj.MODEL_NOT_DOWNLOADED : zzpj.UNKNOWN_ERROR, elapsedRealtime, aVar, null);
            throw e10;
        }
        return a10;
    }
}

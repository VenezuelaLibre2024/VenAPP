package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.j2;
import com.google.android.gms.ads.internal.util.u1;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzchd extends zzcfr implements TextureView.SurfaceTextureListener, zzcgb {
    private final zzcgl zzc;
    private final zzcgm zzd;
    private final zzcgk zze;
    private zzcfq zzf;
    private Surface zzg;
    private zzcgc zzh;
    private String zzi;
    private String[] zzj;
    private boolean zzk;
    private int zzl;
    private zzcgj zzm;
    private final boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;
    private float zzs;

    public zzchd(Context context, zzcgm zzcgmVar, zzcgl zzcglVar, boolean z10, boolean z11, zzcgk zzcgkVar) {
        super(context);
        this.zzl = 1;
        this.zzc = zzcglVar;
        this.zzd = zzcgmVar;
        this.zzn = z10;
        this.zze = zzcgkVar;
        setSurfaceTextureListener(this);
        zzcgmVar.zza(this);
    }

    private static String zzT(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    private final void zzU() {
        zzcgc zzcgcVar = this.zzh;
        if (zzcgcVar != null) {
            zzcgcVar.zzQ(true);
        }
    }

    private final void zzV() {
        if (this.zzo) {
            return;
        }
        this.zzo = true;
        j2.f8993l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchc
            public /* synthetic */ zzchc() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzchd.this.zzI();
            }
        });
        zzn();
        this.zzd.zzb();
        if (this.zzp) {
            zzp();
        }
    }

    private final void zzW(boolean z10, Integer num) {
        String concat;
        zzcgc zzcgcVar = this.zzh;
        if (zzcgcVar != null && !z10) {
            zzcgcVar.zzP(num);
            return;
        }
        if (this.zzi == null || this.zzg == null) {
            return;
        }
        if (z10) {
            if (!zzad()) {
                concat = "No valid ExoPlayerAdapter exists when switch source.";
                zzcec.zzj(concat);
                return;
            } else {
                zzcgcVar.zzU();
                zzY();
            }
        }
        if (this.zzi.startsWith("cache:")) {
            zzchw zzp = this.zzc.zzp(this.zzi);
            if (!(zzp instanceof zzcif)) {
                if (zzp instanceof zzcic) {
                    zzcic zzcicVar = (zzcic) zzp;
                    String zzF = zzF();
                    ByteBuffer zzk = zzcicVar.zzk();
                    boolean zzl = zzcicVar.zzl();
                    String zzi = zzcicVar.zzi();
                    if (zzi == null) {
                        concat = "Stream cache URL is null.";
                    } else {
                        zzcgc zzE = zzE(num);
                        this.zzh = zzE;
                        zzE.zzG(new Uri[]{Uri.parse(zzi)}, zzF, zzk, zzl);
                    }
                } else {
                    concat = "Stream cache miss: ".concat(String.valueOf(this.zzi));
                }
                zzcec.zzj(concat);
                return;
            }
            zzcgc zza = ((zzcif) zzp).zza();
            this.zzh = zza;
            zza.zzP(num);
            if (!this.zzh.zzV()) {
                concat = "Precached video player has been released.";
                zzcec.zzj(concat);
                return;
            }
        } else {
            this.zzh = zzE(num);
            String zzF2 = zzF();
            Uri[] uriArr = new Uri[this.zzj.length];
            int i10 = 0;
            while (true) {
                String[] strArr = this.zzj;
                if (i10 >= strArr.length) {
                    break;
                }
                uriArr[i10] = Uri.parse(strArr[i10]);
                i10++;
            }
            this.zzh.zzF(uriArr, zzF2);
        }
        this.zzh.zzL(this);
        zzZ(this.zzg, false);
        if (this.zzh.zzV()) {
            int zzt = this.zzh.zzt();
            this.zzl = zzt;
            if (zzt == 3) {
                zzV();
            }
        }
    }

    private final void zzX() {
        zzcgc zzcgcVar = this.zzh;
        if (zzcgcVar != null) {
            zzcgcVar.zzQ(false);
        }
    }

    private final void zzY() {
        if (this.zzh != null) {
            zzZ(null, true);
            zzcgc zzcgcVar = this.zzh;
            if (zzcgcVar != null) {
                zzcgcVar.zzL(null);
                this.zzh.zzH();
                this.zzh = null;
            }
            this.zzl = 1;
            this.zzk = false;
            this.zzo = false;
            this.zzp = false;
        }
    }

    private final void zzZ(Surface surface, boolean z10) {
        zzcgc zzcgcVar = this.zzh;
        if (zzcgcVar == null) {
            zzcec.zzj("Trying to set surface before player is initialized.");
            return;
        }
        try {
            zzcgcVar.zzS(surface, z10);
        } catch (IOException e10) {
            zzcec.zzk("", e10);
        }
    }

    private final void zzaa() {
        zzab(this.zzq, this.zzr);
    }

    private final void zzab(int i10, int i11) {
        float f10 = i11 > 0 ? i10 / i11 : 1.0f;
        if (this.zzs != f10) {
            this.zzs = f10;
            requestLayout();
        }
    }

    private final boolean zzac() {
        return zzad() && this.zzl != 1;
    }

    private final boolean zzad() {
        zzcgc zzcgcVar = this.zzh;
        return (zzcgcVar == null || !zzcgcVar.zzV() || this.zzk) ? false : true;
    }

    @Override // android.view.View
    protected final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f10 = this.zzs;
        if (f10 != 0.0f && this.zzm == null) {
            float f11 = measuredWidth;
            float f12 = f11 / measuredHeight;
            if (f10 > f12) {
                measuredHeight = (int) (f11 / f10);
            }
            if (f10 < f12) {
                measuredWidth = (int) (measuredHeight * f10);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzcgj zzcgjVar = this.zzm;
        if (zzcgjVar != null) {
            zzcgjVar.zzc(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (this.zzn) {
            zzcgj zzcgjVar = new zzcgj(getContext());
            this.zzm = zzcgjVar;
            zzcgjVar.zzd(surfaceTexture, i10, i11);
            this.zzm.start();
            SurfaceTexture zzb = this.zzm.zzb();
            if (zzb != null) {
                surfaceTexture = zzb;
            } else {
                this.zzm.zze();
                this.zzm = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.zzg = surface;
        if (this.zzh == null) {
            zzW(false, null);
        } else {
            zzZ(surface, true);
            if (!this.zze.zza) {
                zzU();
            }
        }
        if (this.zzq == 0 || this.zzr == 0) {
            zzab(i10, i11);
        } else {
            zzaa();
        }
        j2.f8993l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgz
            public /* synthetic */ zzcgz() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzchd.this.zzM();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzo();
        zzcgj zzcgjVar = this.zzm;
        if (zzcgjVar != null) {
            zzcgjVar.zze();
            this.zzm = null;
        }
        if (this.zzh != null) {
            zzX();
            Surface surface = this.zzg;
            if (surface != null) {
                surface.release();
            }
            this.zzg = null;
            zzZ(null, true);
        }
        j2.f8993l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgv
            public /* synthetic */ zzcgv() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzchd.this.zzN();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        zzcgj zzcgjVar = this.zzm;
        if (zzcgjVar != null) {
            zzcgjVar.zzc(i10, i11);
        }
        j2.f8993l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgu
            public final /* synthetic */ int zzb;
            public final /* synthetic */ int zzc;

            public /* synthetic */ zzcgu(int i102, int i112) {
                r2 = i102;
                r3 = i112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzchd.this.zzO(r2, r3);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzd.zzf(this);
        this.zza.zza(surfaceTexture, this.zzf);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i10) {
        u1.a("AdExoPlayerView3 window visibility changed to " + i10);
        j2.f8993l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgt
            public final /* synthetic */ int zzb;

            public /* synthetic */ zzcgt(int i102) {
                r2 = i102;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzchd.this.zzQ(r2);
            }
        });
        super.onWindowVisibilityChanged(i102);
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    public final void zzA(int i10) {
        zzcgc zzcgcVar = this.zzh;
        if (zzcgcVar != null) {
            zzcgcVar.zzN(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    public final void zzB(int i10) {
        zzcgc zzcgcVar = this.zzh;
        if (zzcgcVar != null) {
            zzcgcVar.zzR(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    public final void zzC(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.zzj = new String[]{str};
        } else {
            this.zzj = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.zzi;
        boolean z10 = this.zze.zzl && str2 != null && !str.equals(str2) && this.zzl == 4;
        this.zzi = str;
        zzW(z10, num);
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzD(int i10, int i11) {
        this.zzq = i10;
        this.zzr = i11;
        zzaa();
    }

    final zzcgc zzE(Integer num) {
        zzcgk zzcgkVar = this.zze;
        zzcgl zzcglVar = this.zzc;
        zzcix zzcixVar = new zzcix(zzcglVar.getContext(), zzcgkVar, zzcglVar, num);
        zzcec.zzi("ExoPlayerAdapter initialized.");
        return zzcixVar;
    }

    final String zzF() {
        zzcgl zzcglVar = this.zzc;
        return t.r().E(zzcglVar.getContext(), zzcglVar.zzn().zza);
    }

    public final /* synthetic */ void zzG(String str) {
        zzcfq zzcfqVar = this.zzf;
        if (zzcfqVar != null) {
            zzcfqVar.zzb("ExoPlayerAdapter error", str);
        }
    }

    public final /* synthetic */ void zzH() {
        zzcfq zzcfqVar = this.zzf;
        if (zzcfqVar != null) {
            zzcfqVar.zza();
        }
    }

    public final /* synthetic */ void zzI() {
        zzcfq zzcfqVar = this.zzf;
        if (zzcfqVar != null) {
            zzcfqVar.zzf();
        }
    }

    public final /* synthetic */ void zzJ(boolean z10, long j10) {
        this.zzc.zzv(z10, j10);
    }

    public final /* synthetic */ void zzK(String str) {
        zzcfq zzcfqVar = this.zzf;
        if (zzcfqVar != null) {
            zzcfqVar.zzc("ExoPlayerAdapter exception", str);
        }
    }

    public final /* synthetic */ void zzL() {
        zzcfq zzcfqVar = this.zzf;
        if (zzcfqVar != null) {
            zzcfqVar.zzg();
        }
    }

    public final /* synthetic */ void zzM() {
        zzcfq zzcfqVar = this.zzf;
        if (zzcfqVar != null) {
            zzcfqVar.zzh();
        }
    }

    public final /* synthetic */ void zzN() {
        zzcfq zzcfqVar = this.zzf;
        if (zzcfqVar != null) {
            zzcfqVar.zzi();
        }
    }

    public final /* synthetic */ void zzO(int i10, int i11) {
        zzcfq zzcfqVar = this.zzf;
        if (zzcfqVar != null) {
            zzcfqVar.zzj(i10, i11);
        }
    }

    public final /* synthetic */ void zzP() {
        float zza = this.zzb.zza();
        zzcgc zzcgcVar = this.zzh;
        if (zzcgcVar == null) {
            zzcec.zzj("Trying to set volume before player is initialized.");
            return;
        }
        try {
            zzcgcVar.zzT(zza, false);
        } catch (IOException e10) {
            zzcec.zzk("", e10);
        }
    }

    public final /* synthetic */ void zzQ(int i10) {
        zzcfq zzcfqVar = this.zzf;
        if (zzcfqVar != null) {
            zzcfqVar.onWindowVisibilityChanged(i10);
        }
    }

    public final /* synthetic */ void zzR() {
        zzcfq zzcfqVar = this.zzf;
        if (zzcfqVar != null) {
            zzcfqVar.zzd();
        }
    }

    public final /* synthetic */ void zzS() {
        zzcfq zzcfqVar = this.zzf;
        if (zzcfqVar != null) {
            zzcfqVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    public final int zza() {
        if (zzac()) {
            return (int) this.zzh.zzy();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    public final int zzb() {
        zzcgc zzcgcVar = this.zzh;
        if (zzcgcVar != null) {
            return zzcgcVar.zzr();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    public final int zzc() {
        if (zzac()) {
            return (int) this.zzh.zzz();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    public final int zzd() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    public final int zze() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    public final long zzf() {
        zzcgc zzcgcVar = this.zzh;
        if (zzcgcVar != null) {
            return zzcgcVar.zzx();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    public final long zzg() {
        zzcgc zzcgcVar = this.zzh;
        if (zzcgcVar != null) {
            return zzcgcVar.zzA();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    public final long zzh() {
        zzcgc zzcgcVar = this.zzh;
        if (zzcgcVar != null) {
            return zzcgcVar.zzB();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzi(boolean z10, long j10) {
        if (this.zzc != null) {
            zzcep.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgw
                public final /* synthetic */ boolean zzb;
                public final /* synthetic */ long zzc;

                public /* synthetic */ zzcgw(boolean z102, long j102) {
                    r2 = z102;
                    r3 = j102;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzchd.this.zzJ(r2, r3);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    public final String zzj() {
        return "ExoPlayer/2".concat(true != this.zzn ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzk(String str, Exception exc) {
        String zzT = zzT(str, exc);
        zzcec.zzj("ExoPlayerAdapter error: ".concat(zzT));
        this.zzk = true;
        if (this.zze.zza) {
            zzX();
        }
        j2.f8993l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcha
            public final /* synthetic */ String zzb;

            public /* synthetic */ zzcha(String zzT2) {
                r2 = zzT2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzchd.this.zzG(r2);
            }
        });
        t.q().zzv(exc, "AdExoPlayerView.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzl(String str, Exception exc) {
        String zzT = zzT("onLoadException", exc);
        zzcec.zzj("ExoPlayerAdapter exception: ".concat(zzT));
        t.q().zzv(exc, "AdExoPlayerView.onException");
        j2.f8993l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgx
            public final /* synthetic */ String zzb;

            public /* synthetic */ zzcgx(String zzT2) {
                r2 = zzT2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzchd.this.zzK(r2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzm(int i10) {
        if (this.zzl != i10) {
            this.zzl = i10;
            if (i10 == 3) {
                zzV();
                return;
            }
            if (i10 != 4) {
                return;
            }
            if (this.zze.zza) {
                zzX();
            }
            this.zzd.zze();
            this.zzb.zzc();
            j2.f8993l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchb
                public /* synthetic */ zzchb() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzchd.this.zzH();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfr, com.google.android.gms.internal.ads.zzcgo
    public final void zzn() {
        j2.f8993l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgs
            public /* synthetic */ zzcgs() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzchd.this.zzP();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    public final void zzo() {
        if (zzac()) {
            if (this.zze.zza) {
                zzX();
            }
            this.zzh.zzO(false);
            this.zzd.zze();
            this.zzb.zzc();
            j2.f8993l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgy
                public /* synthetic */ zzcgy() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzchd.this.zzR();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    public final void zzp() {
        if (!zzac()) {
            this.zzp = true;
            return;
        }
        if (this.zze.zza) {
            zzU();
        }
        this.zzh.zzO(true);
        this.zzd.zzc();
        this.zzb.zzb();
        this.zza.zzb();
        j2.f8993l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgr
            public /* synthetic */ zzcgr() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzchd.this.zzS();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    public final void zzq(int i10) {
        if (zzac()) {
            this.zzh.zzI(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    public final void zzr(zzcfq zzcfqVar) {
        this.zzf = zzcfqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    public final void zzs(String str) {
        if (str != null) {
            zzC(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    public final void zzt() {
        if (zzad()) {
            this.zzh.zzU();
            zzY();
        }
        this.zzd.zze();
        this.zzb.zzc();
        this.zzd.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    public final void zzu(float f10, float f11) {
        zzcgj zzcgjVar = this.zzm;
        if (zzcgjVar != null) {
            zzcgjVar.zzf(f10, f11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzv() {
        j2.f8993l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgq
            public /* synthetic */ zzcgq() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzchd.this.zzL();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    public final Integer zzw() {
        zzcgc zzcgcVar = this.zzh;
        if (zzcgcVar != null) {
            return zzcgcVar.zzC();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    public final void zzx(int i10) {
        zzcgc zzcgcVar = this.zzh;
        if (zzcgcVar != null) {
            zzcgcVar.zzJ(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    public final void zzy(int i10) {
        zzcgc zzcgcVar = this.zzh;
        if (zzcgcVar != null) {
            zzcgcVar.zzK(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    public final void zzz(int i10) {
        zzcgc zzcgcVar = this.zzh;
        if (zzcgcVar != null) {
            zzcgcVar.zzM(i10);
        }
    }
}

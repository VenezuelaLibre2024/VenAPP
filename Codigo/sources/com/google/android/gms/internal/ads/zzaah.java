package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import com.facebook.ads.AdError;
import com.google.android.libraries.barhopper.RecognitionOptions;
import io.flutter.plugin.platform.PlatformPlugin;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzaah extends zzsz implements zzaan {
    private static final int[] zzb = {1920, 1600, 1440, PlatformPlugin.DEFAULT_SYSTEM_UI, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private boolean zzA;
    private boolean zzB;
    private int zzC;
    private zzaal zzD;
    private zzabo zzE;
    private final Context zze;
    private final zzabp zzf;
    private final zzabj zzg;
    private final boolean zzh;
    private final zzaao zzi;
    private final zzaam zzj;
    private zzaag zzk;
    private boolean zzl;
    private boolean zzm;
    private Surface zzn;
    private zzaak zzo;
    private boolean zzp;
    private int zzq;
    private long zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private long zzv;
    private int zzw;
    private long zzx;
    private zzdp zzy;
    private zzdp zzz;

    public zzaah(Context context, zzsq zzsqVar, zztb zztbVar, long j10, boolean z10, Handler handler, zzabk zzabkVar, int i10, float f10) {
        super(2, zzsqVar, zztbVar, false, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.zze = applicationContext;
        this.zzg = new zzabj(handler, zzabkVar);
        zzzs zzzsVar = new zzzs(applicationContext);
        zzzsVar.zzc(new zzaao(applicationContext, this, 0L));
        zzaab zzd2 = zzzsVar.zzd();
        this.zzf = zzd2;
        this.zzi = zzd2.zza();
        this.zzj = new zzaam();
        this.zzh = "NVIDIA".equals(zzfy.zzc);
        this.zzq = 1;
        this.zzy = zzdp.zza;
        this.zzC = 0;
        this.zzz = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x04bf, code lost:
    
        if (r0.equals("deb") != false) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x079d, code lost:
    
        if (r10 != 0) goto L515;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected static final boolean zzaM(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 2922
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaah.zzaM(java.lang.String):boolean");
    }

    private static List zzaN(Context context, zztb zztbVar, zzam zzamVar, boolean z10, boolean z11) {
        String str = zzamVar.zzm;
        if (str == null) {
            return zzgaa.zzl();
        }
        if (zzfy.zza >= 26 && "video/dolby-vision".equals(str) && !zzaaf.zza(context)) {
            List zzd2 = zztn.zzd(zztbVar, zzamVar, z10, z11);
            if (!zzd2.isEmpty()) {
                return zzd2;
            }
        }
        return zztn.zzf(zztbVar, zzamVar, z10, z11);
    }

    private final void zzaO() {
        zzdp zzdpVar = this.zzz;
        if (zzdpVar != null) {
            this.zzg.zzt(zzdpVar);
        }
    }

    private final void zzaP() {
        Surface surface = this.zzn;
        zzaak zzaakVar = this.zzo;
        if (surface == zzaakVar) {
            this.zzn = null;
        }
        if (zzaakVar != null) {
            zzaakVar.release();
            this.zzo = null;
        }
    }

    private final boolean zzaQ(zzsv zzsvVar) {
        if (zzfy.zza < 23 || zzaM(zzsvVar.zza)) {
            return false;
        }
        return !zzsvVar.zzf || zzaak.zzb(this.zze);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0075, code lost:
    
        if (r3.equals("video/av01") != false) goto L41;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0083. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zzac(com.google.android.gms.internal.ads.zzsv r10, com.google.android.gms.internal.ads.zzam r11) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaah.zzac(com.google.android.gms.internal.ads.zzsv, com.google.android.gms.internal.ads.zzam):int");
    }

    protected static int zzad(zzsv zzsvVar, zzam zzamVar) {
        if (zzamVar.zzn == -1) {
            return zzac(zzsvVar, zzamVar);
        }
        int size = zzamVar.zzo.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += ((byte[]) zzamVar.zzo.get(i11)).length;
        }
        return zzamVar.zzn + i10;
    }

    @Override // com.google.android.gms.internal.ads.zziq
    protected final void zzA() {
        if (this.zzf.zzk()) {
            this.zzf.zze();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zziq
    public final void zzB() {
        try {
            super.zzB();
            this.zzB = false;
            if (this.zzo != null) {
                zzaP();
            }
        } catch (Throwable th2) {
            this.zzB = false;
            if (this.zzo != null) {
                zzaP();
            }
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziq
    protected final void zzC() {
        this.zzs = 0;
        zzh();
        this.zzr = SystemClock.elapsedRealtime();
        this.zzv = 0L;
        this.zzw = 0;
        this.zzi.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zziq
    protected final void zzD() {
        if (this.zzs > 0) {
            zzh();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zzg.zzd(this.zzs, elapsedRealtime - this.zzr);
            this.zzs = 0;
            this.zzr = elapsedRealtime;
        }
        int i10 = this.zzw;
        if (i10 != 0) {
            this.zzg.zzr(this.zzv, i10);
            this.zzv = 0L;
            this.zzw = 0;
        }
        this.zzi.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zziq, com.google.android.gms.internal.ads.zzmf
    public final void zzL(float f10, float f11) {
        super.zzL(f10, f11);
        this.zzi.zzn(f10);
        if (this.zzE != null) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmf, com.google.android.gms.internal.ads.zzmh
    public final String zzT() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzmf
    public final void zzU(long j10, long j11) {
        super.zzU(j10, j11);
        if (this.zzE == null) {
            return;
        }
        try {
            throw null;
        } catch (zzabn e10) {
            throw zzi(e10, e10.zza, false, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR_CODE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzmf
    public final boolean zzV() {
        if (!super.zzV()) {
            return false;
        }
        if (this.zzE == null) {
            return true;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzmf
    public final boolean zzW() {
        boolean z10;
        zzaak zzaakVar;
        if (!super.zzW()) {
            z10 = false;
        } else {
            if (this.zzE != null) {
                throw null;
            }
            z10 = true;
        }
        if (!z10 || (((zzaakVar = this.zzo) == null || this.zzn != zzaakVar) && zzau() != null)) {
            return this.zzi.zzo(z10);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final float zzY(float f10, zzam zzamVar, zzam[] zzamVarArr) {
        float f11 = -1.0f;
        for (zzam zzamVar2 : zzamVarArr) {
            float f12 = zzamVar2.zzt;
            if (f12 != -1.0f) {
                f11 = Math.max(f11, f12);
            }
        }
        if (f11 == -1.0f) {
            return -1.0f;
        }
        return f11 * f10;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final int zzZ(zztb zztbVar, zzam zzamVar) {
        boolean z10;
        boolean zzh = zzcb.zzh(zzamVar.zzm);
        int i10 = RecognitionOptions.ITF;
        if (!zzh) {
            return RecognitionOptions.ITF;
        }
        int i11 = 1;
        int i12 = 0;
        boolean z11 = zzamVar.zzp != null;
        List zzaN = zzaN(this.zze, zztbVar, zzamVar, z11, false);
        if (z11 && zzaN.isEmpty()) {
            zzaN = zzaN(this.zze, zztbVar, zzamVar, false, false);
        }
        if (!zzaN.isEmpty()) {
            if (zzsz.zzaJ(zzamVar)) {
                zzsv zzsvVar = (zzsv) zzaN.get(0);
                boolean zze = zzsvVar.zze(zzamVar);
                if (!zze) {
                    for (int i13 = 1; i13 < zzaN.size(); i13++) {
                        zzsv zzsvVar2 = (zzsv) zzaN.get(i13);
                        if (zzsvVar2.zze(zzamVar)) {
                            zze = true;
                            z10 = false;
                            zzsvVar = zzsvVar2;
                            break;
                        }
                    }
                }
                z10 = true;
                int i14 = true != zze ? 3 : 4;
                int i15 = true != zzsvVar.zzf(zzamVar) ? 8 : 16;
                int i16 = true != zzsvVar.zzg ? 0 : 64;
                if (true != z10) {
                    i10 = 0;
                }
                if (zzfy.zza >= 26 && "video/dolby-vision".equals(zzamVar.zzm) && !zzaaf.zza(this.zze)) {
                    i10 = RecognitionOptions.QR_CODE;
                }
                if (zze) {
                    List zzaN2 = zzaN(this.zze, zztbVar, zzamVar, z11, true);
                    if (!zzaN2.isEmpty()) {
                        zzsv zzsvVar3 = (zzsv) zztn.zzg(zzaN2, zzamVar).get(0);
                        if (zzsvVar3.zze(zzamVar) && zzsvVar3.zzf(zzamVar)) {
                            i12 = 32;
                        }
                    }
                }
                return i14 | i15 | i12 | i16 | i10;
            }
            i11 = 2;
        }
        return i11 | RecognitionOptions.ITF;
    }

    @Override // com.google.android.gms.internal.ads.zzaan
    public final boolean zza(long j10, long j11, boolean z10) {
        return j10 < -30000 && !z10;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzaA(zzam zzamVar) {
        if (this.zzA && !this.zzB && !this.zzf.zzk()) {
            try {
                this.zzf.zzd(zzamVar);
                this.zzf.zzh(zzas());
                zzaal zzaalVar = this.zzD;
                if (zzaalVar != null) {
                    this.zzf.zzj(zzaalVar);
                }
            } catch (zzabn e10) {
                throw zzi(e10, zzamVar, false, 7000);
            }
        }
        if (this.zzE != null || !this.zzf.zzk()) {
            this.zzB = true;
        } else {
            this.zzE = this.zzf.zzb();
            zzgfe.zzb();
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzsz
    public final void zzaC() {
        super.zzaC();
        this.zzu = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final boolean zzaI(zzsv zzsvVar) {
        return this.zzn != null || zzaQ(zzsvVar);
    }

    protected final void zzaK(int i10, int i11) {
        zzir zzirVar = ((zzsz) this).zza;
        zzirVar.zzh += i10;
        int i12 = i10 + i11;
        zzirVar.zzg += i12;
        this.zzs += i12;
        int i13 = this.zzt + i12;
        this.zzt = i13;
        zzirVar.zzi = Math.max(i13, zzirVar.zzi);
    }

    protected final void zzaL(long j10) {
        zzir zzirVar = ((zzsz) this).zza;
        zzirVar.zzk += j10;
        zzirVar.zzl++;
        this.zzv += j10;
        this.zzw++;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final zzis zzaa(zzsv zzsvVar, zzam zzamVar, zzam zzamVar2) {
        int i10;
        int i11;
        zzis zzb2 = zzsvVar.zzb(zzamVar, zzamVar2);
        int i12 = zzb2.zze;
        zzaag zzaagVar = this.zzk;
        zzaagVar.getClass();
        if (zzamVar2.zzr > zzaagVar.zza || zzamVar2.zzs > zzaagVar.zzb) {
            i12 |= RecognitionOptions.QR_CODE;
        }
        if (zzad(zzsvVar, zzamVar2) > zzaagVar.zzc) {
            i12 |= 64;
        }
        String str = zzsvVar.zza;
        if (i12 != 0) {
            i11 = i12;
            i10 = 0;
        } else {
            i10 = zzb2.zzd;
            i11 = 0;
        }
        return new zzis(str, zzamVar, zzamVar2, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzsz
    public final zzis zzab(zzlb zzlbVar) {
        zzis zzab = super.zzab(zzlbVar);
        zzam zzamVar = zzlbVar.zza;
        zzamVar.getClass();
        this.zzg.zzf(zzamVar, zzab);
        return zzab;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0226  */
    @Override // com.google.android.gms.internal.ads.zzsz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final com.google.android.gms.internal.ads.zzsp zzae(com.google.android.gms.internal.ads.zzsv r20, com.google.android.gms.internal.ads.zzam r21, android.media.MediaCrypto r22, float r23) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaah.zzae(com.google.android.gms.internal.ads.zzsv, com.google.android.gms.internal.ads.zzam, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.zzsp");
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final List zzaf(zztb zztbVar, zzam zzamVar, boolean z10) {
        return zztn.zzg(zzaN(this.zze, zztbVar, zzamVar, false, false), zzamVar);
    }

    protected final void zzag(zzsr zzsrVar, int i10, long j10, long j11) {
        Surface surface;
        int i11 = zzfy.zza;
        Trace.beginSection("releaseOutputBuffer");
        zzsrVar.zzm(i10, j11);
        Trace.endSection();
        ((zzsz) this).zza.zze++;
        this.zzt = 0;
        if (this.zzE == null) {
            zzdp zzdpVar = this.zzy;
            if (!zzdpVar.equals(zzdp.zza) && !zzdpVar.equals(this.zzz)) {
                this.zzz = zzdpVar;
                this.zzg.zzt(zzdpVar);
            }
            if (!this.zzi.zzp() || (surface = this.zzn) == null) {
                return;
            }
            this.zzg.zzq(surface);
            this.zzp = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzah(zzih zzihVar) {
        if (this.zzm) {
            ByteBuffer byteBuffer = zzihVar.zzf;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        zzsr zzau = zzau();
                        zzau.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zzau.zzp(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzai(Exception exc) {
        zzff.zzd("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzs(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzaj(String str, zzsp zzspVar, long j10, long j11) {
        this.zzg.zza(str, j10, j11);
        this.zzl = zzaM(str);
        zzsv zzaw = zzaw();
        zzaw.getClass();
        boolean z10 = false;
        if (zzfy.zza >= 29 && "video/x-vnd.on2.vp9".equals(zzaw.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] zzh = zzaw.zzh();
            int length = zzh.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (zzh[i10].profile == 16384) {
                    z10 = true;
                    break;
                }
                i10++;
            }
        }
        this.zzm = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzak(String str) {
        this.zzg.zzb(str);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzal(zzam zzamVar, MediaFormat mediaFormat) {
        zzsr zzau = zzau();
        if (zzau != null) {
            zzau.zzq(this.zzq);
        }
        mediaFormat.getClass();
        boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f10 = zzamVar.zzv;
        int i10 = zzfy.zza;
        int i11 = zzamVar.zzu;
        if (i11 == 90 || i11 == 270) {
            f10 = 1.0f / f10;
            int i12 = integer2;
            integer2 = integer;
            integer = i12;
        }
        this.zzy = new zzdp(integer, integer2, 0, f10);
        this.zzi.zzl(zzamVar.zzt);
        if (this.zzE == null) {
            return;
        }
        zzak zzb2 = zzamVar.zzb();
        zzb2.zzab(integer);
        zzb2.zzI(integer2);
        zzb2.zzV(0);
        zzb2.zzS(f10);
        zzb2.zzac();
        throw null;
    }

    protected final void zzam(zzsr zzsrVar, int i10, long j10) {
        int i11 = zzfy.zza;
        Trace.beginSection("skipVideoBuffer");
        zzsrVar.zzn(i10, false);
        Trace.endSection();
        ((zzsz) this).zza.zzf++;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzan() {
        this.zzi.zzf();
        int i10 = zzfy.zza;
        if (this.zzf.zzk()) {
            this.zzf.zzh(zzas());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final boolean zzap(long j10, long j11, zzsr zzsrVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, zzam zzamVar) {
        zzsrVar.getClass();
        long zzas = j12 - zzas();
        int zza = this.zzi.zza(j12, j10, j11, zzat(), z11, this.zzj);
        if (z10 && !z11) {
            zzam(zzsrVar, i10, zzas);
            return true;
        }
        if (this.zzn == this.zzo) {
            if (this.zzj.zzc() < 30000) {
                zzam(zzsrVar, i10, zzas);
                zzaL(this.zzj.zzc());
                return true;
            }
        } else {
            if (this.zzE != null) {
                try {
                    throw null;
                } catch (zzabn e10) {
                    throw zzi(e10, e10.zza, false, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR_CODE);
                }
            }
            if (zza == 0) {
                zzh();
                long nanoTime = System.nanoTime();
                int i13 = zzfy.zza;
                zzag(zzsrVar, i10, zzas, nanoTime);
                zzaL(this.zzj.zzc());
                return true;
            }
            if (zza == 1) {
                zzaam zzaamVar = this.zzj;
                long zzd2 = zzaamVar.zzd();
                long zzc2 = zzaamVar.zzc();
                int i14 = zzfy.zza;
                if (zzd2 == this.zzx) {
                    zzam(zzsrVar, i10, zzas);
                } else {
                    zzag(zzsrVar, i10, zzas, zzd2);
                }
                zzaL(zzc2);
                this.zzx = zzd2;
                return true;
            }
            if (zza == 2) {
                int i15 = zzfy.zza;
                Trace.beginSection("dropVideoBuffer");
                zzsrVar.zzn(i10, false);
                Trace.endSection();
                zzaK(0, 1);
                zzaL(this.zzj.zzc());
                return true;
            }
            if (zza == 3) {
                zzam(zzsrVar, i10, zzas);
                zzaL(this.zzj.zzc());
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final int zzar(zzih zzihVar) {
        int i10 = zzfy.zza;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final zzst zzav(Throwable th2, zzsv zzsvVar) {
        return new zzaae(th2, zzsvVar, this.zzn);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzsz
    public final void zzay(long j10) {
        super.zzay(j10);
        this.zzu--;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzaz(zzih zzihVar) {
        this.zzu++;
        int i10 = zzfy.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaan
    public final boolean zzb(long j10, long j11) {
        return j10 < -30000 && j11 > 100000;
    }

    @Override // com.google.android.gms.internal.ads.zzaan
    public final boolean zzc(long j10, long j11, long j12, boolean z10, boolean z11) {
        int zzd2;
        if (j10 >= -500000 || z10 || (zzd2 = zzd(j11)) == 0) {
            return false;
        }
        zzir zzirVar = ((zzsz) this).zza;
        if (z11) {
            zzirVar.zzd += zzd2;
            zzirVar.zzf += this.zzu;
        } else {
            zzirVar.zzj++;
            zzaK(zzd2, this.zzu);
        }
        zzaE();
        if (this.zzE == null) {
            return true;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zziq, com.google.android.gms.internal.ads.zzmf
    public final void zzs() {
        this.zzi.zzb();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12, types: [android.view.Surface] */
    @Override // com.google.android.gms.internal.ads.zziq, com.google.android.gms.internal.ads.zzma
    public final void zzt(int i10, Object obj) {
        Surface surface;
        if (i10 != 1) {
            if (i10 == 7) {
                obj.getClass();
                zzaal zzaalVar = (zzaal) obj;
                this.zzD = zzaalVar;
                this.zzf.zzj(zzaalVar);
                return;
            }
            if (i10 == 10) {
                obj.getClass();
                int intValue = ((Integer) obj).intValue();
                if (this.zzC != intValue) {
                    this.zzC = intValue;
                    return;
                }
                return;
            }
            if (i10 == 4) {
                obj.getClass();
                int intValue2 = ((Integer) obj).intValue();
                this.zzq = intValue2;
                zzsr zzau = zzau();
                if (zzau != null) {
                    zzau.zzq(intValue2);
                    return;
                }
                return;
            }
            if (i10 == 5) {
                zzaao zzaaoVar = this.zzi;
                obj.getClass();
                zzaaoVar.zzj(((Integer) obj).intValue());
                return;
            } else if (i10 == 13) {
                obj.getClass();
                this.zzf.zzi((List) obj);
                this.zzA = true;
                return;
            } else {
                if (i10 != 14) {
                    return;
                }
                obj.getClass();
                zzfq zzfqVar = (zzfq) obj;
                if (zzfqVar.zzb() == 0 || zzfqVar.zza() == 0 || (surface = this.zzn) == null) {
                    return;
                }
                this.zzf.zzg(surface, zzfqVar);
                return;
            }
        }
        zzaak zzaakVar = obj instanceof Surface ? (Surface) obj : null;
        if (zzaakVar == null) {
            zzaak zzaakVar2 = this.zzo;
            if (zzaakVar2 != null) {
                zzaakVar = zzaakVar2;
            } else {
                zzsv zzaw = zzaw();
                if (zzaw != null && zzaQ(zzaw)) {
                    zzaakVar = zzaak.zza(this.zze, zzaw.zzf);
                    this.zzo = zzaakVar;
                }
            }
        }
        if (this.zzn == zzaakVar) {
            if (zzaakVar == null || zzaakVar == this.zzo) {
                return;
            }
            zzaO();
            Surface surface2 = this.zzn;
            if (surface2 == null || !this.zzp) {
                return;
            }
            this.zzg.zzq(surface2);
            return;
        }
        this.zzn = zzaakVar;
        this.zzi.zzm(zzaakVar);
        this.zzp = false;
        int zzbf = zzbf();
        zzsr zzau2 = zzau();
        zzaak zzaakVar3 = zzaakVar;
        if (zzau2 != null) {
            zzaakVar3 = zzaakVar;
            if (!this.zzf.zzk()) {
                zzaak zzaakVar4 = zzaakVar;
                if (zzfy.zza >= 23) {
                    if (zzaakVar != null) {
                        zzaakVar4 = zzaakVar;
                        if (!this.zzl) {
                            zzau2.zzo(zzaakVar);
                            zzaakVar3 = zzaakVar;
                        }
                    } else {
                        zzaakVar4 = null;
                    }
                }
                zzaB();
                zzax();
                zzaakVar3 = zzaakVar4;
            }
        }
        if (zzaakVar3 == null || zzaakVar3 == this.zzo) {
            this.zzz = null;
            if (this.zzf.zzk()) {
                this.zzf.zzc();
            }
        } else {
            zzaO();
            if (zzbf == 2) {
                this.zzi.zzc();
            }
            if (this.zzf.zzk()) {
                this.zzf.zzg(zzaakVar3, zzfq.zza);
            }
        }
        int i11 = zzfy.zza;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zziq
    public final void zzw() {
        this.zzz = null;
        this.zzi.zzd();
        int i10 = zzfy.zza;
        this.zzp = false;
        try {
            super.zzw();
        } finally {
            this.zzg.zzc(((zzsz) this).zza);
            this.zzg.zzt(zzdp.zza);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zziq
    public final void zzx(boolean z10, boolean z11) {
        super.zzx(z10, z11);
        zzm();
        this.zzg.zze(((zzsz) this).zza);
        this.zzi.zze(z11);
    }

    @Override // com.google.android.gms.internal.ads.zziq
    protected final void zzy() {
        zzaao zzaaoVar = this.zzi;
        zzel zzh = zzh();
        zzaaoVar.zzk(zzh);
        this.zzf.zzf(zzh);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zziq
    public final void zzz(long j10, boolean z10) {
        if (this.zzE != null) {
            throw null;
        }
        super.zzz(j10, z10);
        if (this.zzf.zzk()) {
            this.zzf.zzh(zzas());
        }
        this.zzi.zzi();
        if (z10) {
            this.zzi.zzc();
        }
        int i10 = zzfy.zza;
        this.zzt = 0;
    }
}

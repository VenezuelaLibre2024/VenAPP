package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzrj extends zzsz implements zzlh {
    private final Context zzb;
    private final zzpt zzc;
    private final zzqb zzd;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private zzam zzh;
    private zzam zzi;
    private long zzj;
    private boolean zzk;
    private boolean zzl;
    private zzme zzm;
    private boolean zzn;

    public zzrj(Context context, zzsq zzsqVar, zztb zztbVar, boolean z10, Handler handler, zzpu zzpuVar, zzqb zzqbVar) {
        super(1, zzsqVar, zztbVar, false, 44100.0f);
        this.zzb = context.getApplicationContext();
        this.zzd = zzqbVar;
        this.zzc = new zzpt(handler, zzpuVar);
        zzqbVar.zzp(new zzri(this, null));
    }

    private final int zzaK(zzsv zzsvVar, zzam zzamVar) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(zzsvVar.zza) || (i10 = zzfy.zza) >= 24 || (i10 == 23 && zzfy.zzJ(this.zzb))) {
            return zzamVar.zzn;
        }
        return -1;
    }

    private static List zzaL(zztb zztbVar, zzam zzamVar, boolean z10, zzqb zzqbVar) {
        zzsv zzb;
        return zzamVar.zzm == null ? zzgaa.zzl() : (!zzqbVar.zzz(zzamVar) || (zzb = zztn.zzb()) == null) ? zztn.zzf(zztbVar, zzamVar, false, false) : zzgaa.zzm(zzb);
    }

    private final void zzaM() {
        long zzb = this.zzd.zzb(zzV());
        if (zzb != Long.MIN_VALUE) {
            if (!this.zzk) {
                zzb = Math.max(this.zzj, zzb);
            }
            this.zzj = zzb;
            this.zzk = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziq
    protected final void zzA() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zziq
    public final void zzB() {
        this.zzn = false;
        try {
            super.zzB();
            if (this.zzl) {
                this.zzl = false;
                this.zzd.zzk();
            }
        } catch (Throwable th2) {
            if (this.zzl) {
                this.zzl = false;
                this.zzd.zzk();
            }
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziq
    protected final void zzC() {
        this.zzd.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zziq
    protected final void zzD() {
        zzaM();
        this.zzd.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzmf, com.google.android.gms.internal.ads.zzmh
    public final String zzT() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzmf
    public final boolean zzV() {
        return super.zzV() && this.zzd.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzmf
    public final boolean zzW() {
        return this.zzd.zzx() || super.zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final float zzY(float f10, zzam zzamVar, zzam[] zzamVarArr) {
        int i10 = -1;
        for (zzam zzamVar2 : zzamVarArr) {
            int i11 = zzamVar2.zzA;
            if (i11 != -1) {
                i10 = Math.max(i10, i11);
            }
        }
        if (i10 == -1) {
            return -1.0f;
        }
        return i10 * f10;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final int zzZ(zztb zztbVar, zzam zzamVar) {
        int i10;
        boolean z10;
        boolean zzg = zzcb.zzg(zzamVar.zzm);
        int i11 = RecognitionOptions.ITF;
        if (!zzg) {
            return RecognitionOptions.ITF;
        }
        int i12 = zzfy.zza;
        int i13 = zzamVar.zzG;
        boolean zzaJ = zzsz.zzaJ(zzamVar);
        int i14 = 1;
        if (!zzaJ || (i13 != 0 && zztn.zzb() == null)) {
            i10 = 0;
        } else {
            zzpg zzd = this.zzd.zzd(zzamVar);
            if (zzd.zzb) {
                i10 = true != zzd.zzc ? RecognitionOptions.UPC_A : 1536;
                if (zzd.zzd) {
                    i10 |= RecognitionOptions.PDF417;
                }
            } else {
                i10 = 0;
            }
            if (this.zzd.zzz(zzamVar)) {
                return i10 | 172;
            }
        }
        if ((!"audio/raw".equals(zzamVar.zzm) || this.zzd.zzz(zzamVar)) && this.zzd.zzz(zzfy.zzy(2, zzamVar.zzz, zzamVar.zzA))) {
            List zzaL = zzaL(zztbVar, zzamVar, false, this.zzd);
            if (!zzaL.isEmpty()) {
                if (zzaJ) {
                    zzsv zzsvVar = (zzsv) zzaL.get(0);
                    boolean zze = zzsvVar.zze(zzamVar);
                    if (!zze) {
                        for (int i15 = 1; i15 < zzaL.size(); i15++) {
                            zzsv zzsvVar2 = (zzsv) zzaL.get(i15);
                            if (zzsvVar2.zze(zzamVar)) {
                                z10 = false;
                                zze = true;
                                zzsvVar = zzsvVar2;
                                break;
                            }
                        }
                    }
                    z10 = true;
                    int i16 = true != zze ? 3 : 4;
                    int i17 = 8;
                    if (zze && zzsvVar.zzf(zzamVar)) {
                        i17 = 16;
                    }
                    int i18 = true != zzsvVar.zzg ? 0 : 64;
                    if (true != z10) {
                        i11 = 0;
                    }
                    return i16 | i17 | 32 | i18 | i11 | i10;
                }
                i14 = 2;
            }
        }
        return i14 | RecognitionOptions.ITF;
    }

    @Override // com.google.android.gms.internal.ads.zzlh
    public final long zza() {
        if (zzbf() == 2) {
            zzaM();
        }
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final zzis zzaa(zzsv zzsvVar, zzam zzamVar, zzam zzamVar2) {
        int i10;
        int i11;
        zzis zzb = zzsvVar.zzb(zzamVar, zzamVar2);
        int i12 = zzb.zze;
        if (zzaH(zzamVar2)) {
            i12 |= RecognitionOptions.TEZ_CODE;
        }
        if (zzaK(zzsvVar, zzamVar2) > this.zze) {
            i12 |= 64;
        }
        String str = zzsvVar.zza;
        if (i12 != 0) {
            i11 = i12;
            i10 = 0;
        } else {
            i10 = zzb.zzd;
            i11 = 0;
        }
        return new zzis(str, zzamVar, zzamVar2, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzsz
    public final zzis zzab(zzlb zzlbVar) {
        zzam zzamVar = zzlbVar.zza;
        zzamVar.getClass();
        this.zzh = zzamVar;
        zzis zzab = super.zzab(zzlbVar);
        this.zzc.zzi(zzamVar, zzab);
        return zzab;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d0, code lost:
    
        if ("AXON 7 mini".equals(r10) == false) goto L114;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0107  */
    @Override // com.google.android.gms.internal.ads.zzsz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final com.google.android.gms.internal.ads.zzsp zzae(com.google.android.gms.internal.ads.zzsv r8, com.google.android.gms.internal.ads.zzam r9, android.media.MediaCrypto r10, float r11) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrj.zzae(com.google.android.gms.internal.ads.zzsv, com.google.android.gms.internal.ads.zzam, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.zzsp");
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final List zzaf(zztb zztbVar, zzam zzamVar, boolean z10) {
        return zztn.zzg(zzaL(zztbVar, zzamVar, false, this.zzd), zzamVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzah(zzih zzihVar) {
        zzam zzamVar;
        if (zzfy.zza < 29 || (zzamVar = zzihVar.zza) == null || !Objects.equals(zzamVar.zzm, "audio/opus") || !zzaG()) {
            return;
        }
        ByteBuffer byteBuffer = zzihVar.zzf;
        byteBuffer.getClass();
        zzam zzamVar2 = zzihVar.zza;
        zzamVar2.getClass();
        if (byteBuffer.remaining() == 8) {
            this.zzd.zzq(zzamVar2.zzC, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzai(Exception exc) {
        zzff.zzd("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zza(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzaj(String str, zzsp zzspVar, long j10, long j11) {
        this.zzc.zze(str, j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzak(String str) {
        this.zzc.zzf(str);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzal(zzam zzamVar, MediaFormat mediaFormat) {
        int[] iArr;
        int i10;
        zzam zzamVar2 = this.zzi;
        int[] iArr2 = null;
        if (zzamVar2 != null) {
            zzamVar = zzamVar2;
        } else if (zzau() != null) {
            mediaFormat.getClass();
            int zzk = "audio/raw".equals(zzamVar.zzm) ? zzamVar.zzB : (zzfy.zza < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? zzfy.zzk(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            zzak zzakVar = new zzak();
            zzakVar.zzW("audio/raw");
            zzakVar.zzQ(zzk);
            zzakVar.zzF(zzamVar.zzC);
            zzakVar.zzG(zzamVar.zzD);
            zzakVar.zzP(zzamVar.zzk);
            zzakVar.zzK(zzamVar.zzb);
            zzakVar.zzM(zzamVar.zzc);
            zzakVar.zzN(zzamVar.zzd);
            zzakVar.zzY(zzamVar.zze);
            zzakVar.zzU(zzamVar.zzf);
            zzakVar.zzy(mediaFormat.getInteger("channel-count"));
            zzakVar.zzX(mediaFormat.getInteger("sample-rate"));
            zzam zzac = zzakVar.zzac();
            if (this.zzf && zzac.zzz == 6 && (i10 = zzamVar.zzz) < 6) {
                iArr2 = new int[i10];
                for (int i11 = 0; i11 < zzamVar.zzz; i11++) {
                    iArr2[i11] = i11;
                }
            } else if (this.zzg) {
                int i12 = zzac.zzz;
                if (i12 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i12 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i12 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i12 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i12 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
                iArr2 = iArr;
            }
            zzamVar = zzac;
        }
        try {
            int i13 = zzfy.zza;
            if (i13 >= 29) {
                if (zzaG()) {
                    zzm();
                }
                zzek.zzf(i13 >= 29);
            }
            this.zzd.zze(zzamVar, 0, iArr2);
        } catch (zzpw e10) {
            throw zzi(e10, e10.zza, false, 5001);
        }
    }

    public final void zzam() {
        this.zzk = true;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzan() {
        this.zzd.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzao() {
        try {
            this.zzd.zzj();
        } catch (zzqa e10) {
            throw zzi(e10, e10.zzc, e10.zzb, true != zzaG() ? 5002 : 5003);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final boolean zzap(long j10, long j11, zzsr zzsrVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, zzam zzamVar) {
        byteBuffer.getClass();
        if (this.zzi != null && (i11 & 2) != 0) {
            zzsrVar.getClass();
            zzsrVar.zzn(i10, false);
            return true;
        }
        if (z10) {
            if (zzsrVar != null) {
                zzsrVar.zzn(i10, false);
            }
            ((zzsz) this).zza.zzf += i12;
            this.zzd.zzg();
            return true;
        }
        try {
            if (!this.zzd.zzw(byteBuffer, j12, i12)) {
                return false;
            }
            if (zzsrVar != null) {
                zzsrVar.zzn(i10, false);
            }
            ((zzsz) this).zza.zze += i12;
            return true;
        } catch (zzpx e10) {
            throw zzi(e10, this.zzh, e10.zzb, 5001);
        } catch (zzqa e11) {
            if (zzaG()) {
                zzm();
            }
            throw zzi(e11, zzamVar, e11.zzb, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final boolean zzaq(zzam zzamVar) {
        zzm();
        return this.zzd.zzz(zzamVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlh
    public final zzcg zzc() {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzlh
    public final void zzg(zzcg zzcgVar) {
        this.zzd.zzr(zzcgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlh
    public final boolean zzj() {
        boolean z10 = this.zzn;
        this.zzn = false;
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zziq, com.google.android.gms.internal.ads.zzmf
    public final zzlh zzk() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zziq, com.google.android.gms.internal.ads.zzma
    public final void zzt(int i10, Object obj) {
        if (i10 == 2) {
            zzqb zzqbVar = this.zzd;
            obj.getClass();
            zzqbVar.zzv(((Float) obj).floatValue());
            return;
        }
        if (i10 == 3) {
            zzk zzkVar = (zzk) obj;
            zzqb zzqbVar2 = this.zzd;
            zzkVar.getClass();
            zzqbVar2.zzl(zzkVar);
            return;
        }
        if (i10 == 6) {
            zzl zzlVar = (zzl) obj;
            zzqb zzqbVar3 = this.zzd;
            zzlVar.getClass();
            zzqbVar3.zzn(zzlVar);
            return;
        }
        switch (i10) {
            case 9:
                zzqb zzqbVar4 = this.zzd;
                obj.getClass();
                zzqbVar4.zzu(((Boolean) obj).booleanValue());
                return;
            case 10:
                zzqb zzqbVar5 = this.zzd;
                obj.getClass();
                zzqbVar5.zzm(((Integer) obj).intValue());
                return;
            case 11:
                this.zzm = (zzme) obj;
                return;
            case 12:
                if (zzfy.zza >= 23) {
                    zzrg.zza(this.zzd, obj);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zziq
    public final void zzw() {
        this.zzl = true;
        this.zzh = null;
        try {
            this.zzd.zzf();
            super.zzw();
        } catch (Throwable th2) {
            super.zzw();
            throw th2;
        } finally {
            this.zzc.zzg(((zzsz) this).zza);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zziq
    public final void zzx(boolean z10, boolean z11) {
        super.zzx(z10, z11);
        this.zzc.zzh(((zzsz) this).zza);
        zzm();
        this.zzd.zzs(zzn());
        this.zzd.zzo(zzh());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zziq
    public final void zzz(long j10, boolean z10) {
        super.zzz(j10, z10);
        this.zzd.zzf();
        this.zzj = j10;
        this.zzn = false;
        this.zzk = true;
    }
}

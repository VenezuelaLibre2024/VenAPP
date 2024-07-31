package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.EOFException;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzaig implements zzacu {
    public static final zzadb zza = new zzadb() { // from class: com.google.android.gms.internal.ads.zzaie
        @Override // com.google.android.gms.internal.ads.zzadb
        public final /* synthetic */ zzacu[] zza(Uri uri, Map map) {
            int i10 = zzada.zza;
            return new zzacu[]{new zzaig(0)};
        }
    };
    private static final zzago zzb = new zzago() { // from class: com.google.android.gms.internal.ads.zzaif
    };
    private final zzfp zzc;
    private final zzado zzd;
    private final zzadk zze;
    private final zzadm zzf;
    private final zzaea zzg;
    private zzacx zzh;
    private zzaea zzi;
    private zzaea zzj;
    private int zzk;
    private zzby zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private zzaii zzq;
    private boolean zzr;

    public zzaig() {
        this(0);
    }

    public zzaig(int i10) {
        this.zzc = new zzfp(10);
        this.zzd = new zzado();
        this.zze = new zzadk();
        this.zzm = -9223372036854775807L;
        this.zzf = new zzadm();
        zzact zzactVar = new zzact();
        this.zzg = zzactVar;
        this.zzj = zzactVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00d2 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzf(com.google.android.gms.internal.ads.zzacv r17) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaig.zzf(com.google.android.gms.internal.ads.zzacv):int");
    }

    private final long zzg(long j10) {
        return this.zzm + ((j10 * 1000000) / this.zzd.zzd);
    }

    private final zzaii zzh(zzacv zzacvVar, boolean z10) {
        ((zzack) zzacvVar).zzm(this.zzc.zzM(), 0, 4, false);
        this.zzc.zzK(0);
        this.zzd.zza(this.zzc.zzg());
        return new zzaib(zzacvVar.zzd(), zzacvVar.zzf(), this.zzd, false);
    }

    private static boolean zzi(int i10, long j10) {
        return ((long) (i10 & (-128000))) == (j10 & (-128000));
    }

    private final boolean zzj(zzacv zzacvVar) {
        zzaii zzaiiVar = this.zzq;
        if (zzaiiVar != null) {
            long zzc = zzaiiVar.zzc();
            if (zzc != -1 && zzacvVar.zze() > zzc - 4) {
                return true;
            }
        }
        try {
            return !zzacvVar.zzm(this.zzc.zzM(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean zzk(zzacv zzacvVar, boolean z10) {
        int i10;
        int i11;
        int zzb2;
        zzacvVar.zzj();
        if (zzacvVar.zzf() == 0) {
            zzby zza2 = this.zzf.zza(zzacvVar, null);
            this.zzl = zza2;
            if (zza2 != null) {
                this.zze.zzb(zza2);
            }
            i10 = (int) zzacvVar.zze();
            if (!z10) {
                ((zzack) zzacvVar).zzo(i10, false);
            }
            i11 = 0;
        } else {
            i10 = 0;
            i11 = 0;
        }
        int i12 = i11;
        int i13 = i12;
        while (true) {
            if (!zzj(zzacvVar)) {
                this.zzc.zzK(0);
                int zzg = this.zzc.zzg();
                if ((i11 == 0 || zzi(zzg, i11)) && (zzb2 = zzadp.zzb(zzg)) != -1) {
                    i12++;
                    if (i12 != 1) {
                        if (i12 == 4) {
                            break;
                        }
                    } else {
                        this.zzd.zza(zzg);
                        i11 = zzg;
                    }
                    ((zzack) zzacvVar).zzl(zzb2 - 4, false);
                } else {
                    int i14 = i13 + 1;
                    if (i13 == (true != z10 ? 131072 : RecognitionOptions.TEZ_CODE)) {
                        if (z10) {
                            return false;
                        }
                        throw zzcc.zza("Searched too many bytes.", null);
                    }
                    if (z10) {
                        zzacvVar.zzj();
                        ((zzack) zzacvVar).zzl(i10 + i14, false);
                    } else {
                        ((zzack) zzacvVar).zzo(1, false);
                    }
                    i11 = 0;
                    i13 = i14;
                    i12 = 0;
                }
            } else if (i12 <= 0) {
                throw new EOFException();
            }
        }
        if (z10) {
            ((zzack) zzacvVar).zzo(i10 + i13, false);
        } else {
            zzacvVar.zzj();
        }
        this.zzk = i11;
        return true;
    }

    public final void zza() {
        this.zzr = true;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzb(zzacv zzacvVar, zzadr zzadrVar) {
        zzek.zzb(this.zzi);
        int i10 = zzfy.zza;
        int zzf = zzf(zzacvVar);
        if (zzf == -1 && (this.zzq instanceof zzaic)) {
            if (this.zzq.zza() != zzg(this.zzn)) {
                throw null;
            }
        }
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzc(zzacx zzacxVar) {
        this.zzh = zzacxVar;
        zzaea zzw = zzacxVar.zzw(0, 1);
        this.zzi = zzw;
        this.zzj = zzw;
        this.zzh.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzd(long j10, long j11) {
        this.zzk = 0;
        this.zzm = -9223372036854775807L;
        this.zzn = 0L;
        this.zzp = 0;
        zzaii zzaiiVar = this.zzq;
        if (zzaiiVar instanceof zzaic) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zze(zzacv zzacvVar) {
        return zzk(zzacvVar, true);
    }
}

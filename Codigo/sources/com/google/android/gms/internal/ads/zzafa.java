package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzafa implements zzacu {
    public static final zzadb zza = new zzadb() { // from class: com.google.android.gms.internal.ads.zzaez
        @Override // com.google.android.gms.internal.ads.zzadb
        public final /* synthetic */ zzacu[] zza(Uri uri, Map map) {
            int i10 = zzada.zza;
            return new zzacu[]{new zzafa(0)};
        }
    };
    private final byte[] zzb;
    private final zzfp zzc;
    private final zzadc zzd;
    private zzacx zze;
    private zzaea zzf;
    private int zzg;
    private zzby zzh;
    private zzadh zzi;
    private int zzj;
    private int zzk;
    private zzaey zzl;
    private int zzm;
    private long zzn;

    public zzafa() {
        this(0);
    }

    public zzafa(int i10) {
        this.zzb = new byte[42];
        this.zzc = new zzfp(new byte[RecognitionOptions.TEZ_CODE], 0);
        this.zzd = new zzadc();
        this.zzg = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        r5.zzK(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        return r4.zzd.zza;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long zza(com.google.android.gms.internal.ads.zzfp r5, boolean r6) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzadh r0 = r4.zzi
            r0.getClass()
            int r0 = r5.zzd()
        L9:
            int r1 = r5.zze()
            int r1 = r1 + (-16)
            if (r0 > r1) goto L2b
            r5.zzK(r0)
            com.google.android.gms.internal.ads.zzadh r1 = r4.zzi
            int r2 = r4.zzk
            com.google.android.gms.internal.ads.zzadc r3 = r4.zzd
            boolean r1 = com.google.android.gms.internal.ads.zzadd.zzc(r5, r1, r2, r3)
            if (r1 == 0) goto L28
        L20:
            r5.zzK(r0)
            com.google.android.gms.internal.ads.zzadc r5 = r4.zzd
            long r5 = r5.zza
            return r5
        L28:
            int r0 = r0 + 1
            goto L9
        L2b:
            if (r6 == 0) goto L5e
        L2d:
            int r6 = r5.zze()
            int r1 = r4.zzj
            int r6 = r6 - r1
            if (r0 > r6) goto L56
            r5.zzK(r0)
            com.google.android.gms.internal.ads.zzadh r6 = r4.zzi     // Catch: java.lang.IndexOutOfBoundsException -> L44
            int r1 = r4.zzk     // Catch: java.lang.IndexOutOfBoundsException -> L44
            com.google.android.gms.internal.ads.zzadc r2 = r4.zzd     // Catch: java.lang.IndexOutOfBoundsException -> L44
            boolean r6 = com.google.android.gms.internal.ads.zzadd.zzc(r5, r6, r1, r2)     // Catch: java.lang.IndexOutOfBoundsException -> L44
            goto L45
        L44:
            r6 = 0
        L45:
            int r1 = r5.zzd()
            int r2 = r5.zze()
            if (r1 <= r2) goto L50
            goto L53
        L50:
            if (r6 == 0) goto L53
            goto L20
        L53:
            int r0 = r0 + 1
            goto L2d
        L56:
            int r6 = r5.zze()
            r5.zzK(r6)
            goto L61
        L5e:
            r5.zzK(r0)
        L61:
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafa.zza(com.google.android.gms.internal.ads.zzfp, boolean):long");
    }

    private final void zzf() {
        long j10 = this.zzn * 1000000;
        zzadh zzadhVar = this.zzi;
        int i10 = zzfy.zza;
        this.zzf.zzt(j10 / zzadhVar.zze, 1, this.zzm, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzb(zzacv zzacvVar, zzadr zzadrVar) {
        boolean zzo;
        zzadu zzadtVar;
        boolean z10;
        int i10 = this.zzg;
        if (i10 == 0) {
            zzacvVar.zzj();
            long zze = zzacvVar.zze();
            zzby zza2 = zzade.zza(zzacvVar, true);
            ((zzack) zzacvVar).zzo((int) (zzacvVar.zze() - zze), false);
            this.zzh = zza2;
            this.zzg = 1;
            return 0;
        }
        if (i10 == 1) {
            ((zzack) zzacvVar).zzm(this.zzb, 0, 42, false);
            zzacvVar.zzj();
            this.zzg = 2;
            return 0;
        }
        if (i10 == 2) {
            zzfp zzfpVar = new zzfp(4);
            ((zzack) zzacvVar).zzn(zzfpVar.zzM(), 0, 4, false);
            if (zzfpVar.zzu() != 1716281667) {
                throw zzcc.zza("Failed to read FLAC stream marker.", null);
            }
            this.zzg = 3;
            return 0;
        }
        if (i10 == 3) {
            zzadh zzadhVar = this.zzi;
            do {
                zzacvVar.zzj();
                zzfo zzfoVar = new zzfo(new byte[4], 4);
                zzack zzackVar = (zzack) zzacvVar;
                zzackVar.zzm(zzfoVar.zza, 0, 4, false);
                zzo = zzfoVar.zzo();
                int zzd = zzfoVar.zzd(7);
                int zzd2 = zzfoVar.zzd(24) + 4;
                if (zzd == 0) {
                    byte[] bArr = new byte[38];
                    zzackVar.zzn(bArr, 0, 38, false);
                    zzadhVar = new zzadh(bArr, 4);
                } else {
                    if (zzadhVar == null) {
                        throw new IllegalArgumentException();
                    }
                    if (zzd == 3) {
                        zzfp zzfpVar2 = new zzfp(zzd2);
                        zzackVar.zzn(zzfpVar2.zzM(), 0, zzd2, false);
                        zzadhVar = zzadhVar.zzf(zzade.zzb(zzfpVar2));
                    } else if (zzd == 4) {
                        zzfp zzfpVar3 = new zzfp(zzd2);
                        zzackVar.zzn(zzfpVar3.zzM(), 0, zzd2, false);
                        zzfpVar3.zzL(4);
                        zzadhVar = zzadhVar.zzg(Arrays.asList(zzaeg.zzc(zzfpVar3, false, false).zzb));
                    } else if (zzd == 6) {
                        zzfp zzfpVar4 = new zzfp(zzd2);
                        zzackVar.zzn(zzfpVar4.zzM(), 0, zzd2, false);
                        zzfpVar4.zzL(4);
                        zzadhVar = zzadhVar.zze(zzgaa.zzm(zzafw.zzb(zzfpVar4)));
                    } else {
                        zzackVar.zzo(zzd2, false);
                    }
                }
                int i11 = zzfy.zza;
                this.zzi = zzadhVar;
            } while (!zzo);
            zzadhVar.getClass();
            this.zzj = Math.max(zzadhVar.zzc, 6);
            this.zzf.zzl(this.zzi.zzc(this.zzb, this.zzh));
            this.zzg = 4;
            return 0;
        }
        if (i10 == 4) {
            zzacvVar.zzj();
            zzfp zzfpVar5 = new zzfp(2);
            ((zzack) zzacvVar).zzm(zzfpVar5.zzM(), 0, 2, false);
            int zzq = zzfpVar5.zzq();
            int i12 = zzq >> 2;
            zzacvVar.zzj();
            if (i12 != 16382) {
                throw zzcc.zza("First frame does not start with sync code.", null);
            }
            this.zzk = zzq;
            zzacx zzacxVar = this.zze;
            int i13 = zzfy.zza;
            long zzf = zzacvVar.zzf();
            long zzd3 = zzacvVar.zzd();
            zzadh zzadhVar2 = this.zzi;
            zzadhVar2.getClass();
            if (zzadhVar2.zzk != null) {
                zzadtVar = new zzadf(zzadhVar2, zzf);
            } else if (zzd3 == -1 || zzadhVar2.zzj <= 0) {
                zzadtVar = new zzadt(zzadhVar2.zza(), 0L);
            } else {
                zzaey zzaeyVar = new zzaey(zzadhVar2, this.zzk, zzf, zzd3);
                this.zzl = zzaeyVar;
                zzadtVar = zzaeyVar.zzb();
            }
            zzacxVar.zzO(zzadtVar);
            this.zzg = 5;
            return 0;
        }
        this.zzf.getClass();
        zzadh zzadhVar3 = this.zzi;
        zzadhVar3.getClass();
        zzaey zzaeyVar2 = this.zzl;
        if (zzaeyVar2 != null && zzaeyVar2.zze()) {
            return zzaeyVar2.zza(zzacvVar, zzadrVar);
        }
        if (this.zzn == -1) {
            this.zzn = zzadd.zzb(zzacvVar, zzadhVar3);
            return 0;
        }
        zzfp zzfpVar6 = this.zzc;
        int zze2 = zzfpVar6.zze();
        if (zze2 < 32768) {
            int zza3 = zzacvVar.zza(zzfpVar6.zzM(), zze2, RecognitionOptions.TEZ_CODE - zze2);
            z10 = zza3 == -1;
            if (!z10) {
                this.zzc.zzJ(zze2 + zza3);
            } else if (this.zzc.zzb() == 0) {
                zzf();
                return -1;
            }
        } else {
            z10 = false;
        }
        zzfp zzfpVar7 = this.zzc;
        int zzd4 = zzfpVar7.zzd();
        int i14 = this.zzm;
        int i15 = this.zzj;
        if (i14 < i15) {
            zzfpVar7.zzL(Math.min(i15 - i14, zzfpVar7.zzb()));
        }
        long zza4 = zza(this.zzc, z10);
        zzfp zzfpVar8 = this.zzc;
        int zzd5 = zzfpVar8.zzd() - zzd4;
        zzfpVar8.zzK(zzd4);
        zzady.zzb(this.zzf, this.zzc, zzd5);
        this.zzm += zzd5;
        if (zza4 != -1) {
            zzf();
            this.zzm = 0;
            this.zzn = zza4;
        }
        zzfp zzfpVar9 = this.zzc;
        if (zzfpVar9.zzb() >= 16) {
            return 0;
        }
        int zzb = zzfpVar9.zzb();
        System.arraycopy(zzfpVar9.zzM(), zzfpVar9.zzd(), zzfpVar9.zzM(), 0, zzb);
        this.zzc.zzK(0);
        this.zzc.zzJ(zzb);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzc(zzacx zzacxVar) {
        this.zze = zzacxVar;
        this.zzf = zzacxVar.zzw(0, 1);
        zzacxVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzd(long j10, long j11) {
        if (j10 == 0) {
            this.zzg = 0;
        } else {
            zzaey zzaeyVar = this.zzl;
            if (zzaeyVar != null) {
                zzaeyVar.zzd(j11);
            }
        }
        this.zzn = j11 != 0 ? -1L : 0L;
        this.zzm = 0;
        this.zzc.zzH(0);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zze(zzacv zzacvVar) {
        zzade.zza(zzacvVar, false);
        zzfp zzfpVar = new zzfp(4);
        ((zzack) zzacvVar).zzm(zzfpVar.zzM(), 0, 4, false);
        return zzfpVar.zzu() == 1716281667;
    }
}

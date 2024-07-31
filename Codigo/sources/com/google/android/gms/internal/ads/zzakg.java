package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class zzakg extends zzake {
    private zzakf zza;
    private int zzb;
    private boolean zzc;
    private zzaef zzd;
    private zzaed zze;

    @Override // com.google.android.gms.internal.ads.zzake
    protected final long zza(zzfp zzfpVar) {
        if ((zzfpVar.zzM()[0] & 1) == 1) {
            return -1L;
        }
        byte b10 = zzfpVar.zzM()[0];
        zzakf zzakfVar = this.zza;
        zzek.zzb(zzakfVar);
        int i10 = !zzakfVar.zzd[(b10 >> 1) & (255 >>> (8 - zzakfVar.zze))].zza ? zzakfVar.zza.zze : zzakfVar.zza.zzf;
        int i11 = this.zzc ? (this.zzb + i10) / 4 : 0;
        if (zzfpVar.zzc() < zzfpVar.zze() + 4) {
            byte[] copyOf = Arrays.copyOf(zzfpVar.zzM(), zzfpVar.zze() + 4);
            zzfpVar.zzI(copyOf, copyOf.length);
        } else {
            zzfpVar.zzJ(zzfpVar.zze() + 4);
        }
        long j10 = i11;
        byte[] zzM = zzfpVar.zzM();
        zzM[zzfpVar.zze() - 4] = (byte) (j10 & 255);
        zzM[zzfpVar.zze() - 3] = (byte) ((j10 >>> 8) & 255);
        zzM[zzfpVar.zze() - 2] = (byte) ((j10 >>> 16) & 255);
        zzM[zzfpVar.zze() - 1] = (byte) ((j10 >>> 24) & 255);
        this.zzc = true;
        this.zzb = i10;
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzake
    public final void zzb(boolean z10) {
        super.zzb(z10);
        if (z10) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzake
    protected final boolean zzc(zzfp zzfpVar, long j10, zzakb zzakbVar) {
        zzakf zzakfVar;
        int i10;
        int i11;
        int i12;
        zzaef zzaefVar;
        if (this.zza != null) {
            zzakbVar.zza.getClass();
            return false;
        }
        zzaef zzaefVar2 = this.zzd;
        int i13 = 4;
        if (zzaefVar2 == null) {
            zzaeg.zzd(1, zzfpVar, false);
            int zzj = zzfpVar.zzj();
            int zzm = zzfpVar.zzm();
            int zzj2 = zzfpVar.zzj();
            int zzi = zzfpVar.zzi();
            int i14 = zzi <= 0 ? -1 : zzi;
            int zzi2 = zzfpVar.zzi();
            int i15 = zzi2 <= 0 ? -1 : zzi2;
            int zzi3 = zzfpVar.zzi();
            int i16 = zzi3 <= 0 ? -1 : zzi3;
            int zzm2 = zzfpVar.zzm();
            this.zzd = new zzaef(zzj, zzm, zzj2, i14, i15, i16, (int) Math.pow(2.0d, zzm2 & 15), (int) Math.pow(2.0d, (zzm2 & 240) >> 4), 1 == (zzfpVar.zzm() & 1), Arrays.copyOf(zzfpVar.zzM(), zzfpVar.zze()));
        } else {
            zzaed zzaedVar = this.zze;
            if (zzaedVar == null) {
                this.zze = zzaeg.zzc(zzfpVar, true, true);
            } else {
                byte[] bArr = new byte[zzfpVar.zze()];
                System.arraycopy(zzfpVar.zzM(), 0, bArr, 0, zzfpVar.zze());
                int i17 = zzaefVar2.zza;
                int i18 = 5;
                zzaeg.zzd(5, zzfpVar, false);
                int zzm3 = zzfpVar.zzm() + 1;
                zzaec zzaecVar = new zzaec(zzfpVar.zzM());
                zzaecVar.zzc(zzfpVar.zzd() * 8);
                int i19 = 0;
                while (true) {
                    int i20 = 2;
                    int i21 = 16;
                    if (i19 >= zzm3) {
                        zzaef zzaefVar3 = zzaefVar2;
                        int i22 = 6;
                        int zzb = zzaecVar.zzb(6) + 1;
                        for (int i23 = 0; i23 < zzb; i23++) {
                            if (zzaecVar.zzb(16) != 0) {
                                throw zzcc.zza("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i24 = 1;
                        int zzb2 = zzaecVar.zzb(6) + 1;
                        int i25 = 0;
                        while (true) {
                            int i26 = 3;
                            if (i25 < zzb2) {
                                int zzb3 = zzaecVar.zzb(i21);
                                if (zzb3 == 0) {
                                    i12 = zzb2;
                                    int i27 = 8;
                                    zzaecVar.zzc(8);
                                    zzaecVar.zzc(16);
                                    zzaecVar.zzc(16);
                                    zzaecVar.zzc(6);
                                    zzaecVar.zzc(8);
                                    int zzb4 = zzaecVar.zzb(4) + 1;
                                    int i28 = 0;
                                    while (i28 < zzb4) {
                                        zzaecVar.zzc(i27);
                                        i28++;
                                        i27 = 8;
                                    }
                                } else {
                                    if (zzb3 != i24) {
                                        throw zzcc.zza("floor type greater than 1 not decodable: " + zzb3, null);
                                    }
                                    int zzb5 = zzaecVar.zzb(i18);
                                    int[] iArr = new int[zzb5];
                                    int i29 = -1;
                                    for (int i30 = 0; i30 < zzb5; i30++) {
                                        int zzb6 = zzaecVar.zzb(4);
                                        iArr[i30] = zzb6;
                                        if (zzb6 > i29) {
                                            i29 = zzb6;
                                        }
                                    }
                                    int i31 = i29 + 1;
                                    int[] iArr2 = new int[i31];
                                    int i32 = 0;
                                    while (i32 < i31) {
                                        iArr2[i32] = zzaecVar.zzb(i26) + 1;
                                        int zzb7 = zzaecVar.zzb(i20);
                                        int i33 = 8;
                                        if (zzb7 > 0) {
                                            zzaecVar.zzc(8);
                                        }
                                        int i34 = zzb2;
                                        int i35 = 0;
                                        for (int i36 = 1; i35 < (i36 << zzb7); i36 = 1) {
                                            zzaecVar.zzc(i33);
                                            i35++;
                                            i33 = 8;
                                        }
                                        i32++;
                                        zzb2 = i34;
                                        i20 = 2;
                                        i26 = 3;
                                    }
                                    i12 = zzb2;
                                    zzaecVar.zzc(i20);
                                    int zzb8 = zzaecVar.zzb(4);
                                    int i37 = 0;
                                    int i38 = 0;
                                    for (int i39 = 0; i39 < zzb5; i39++) {
                                        i37 += iArr2[iArr[i39]];
                                        while (i38 < i37) {
                                            zzaecVar.zzc(zzb8);
                                            i38++;
                                        }
                                    }
                                }
                                i25++;
                                zzb2 = i12;
                                i22 = 6;
                                i21 = 16;
                                i20 = 2;
                                i24 = 1;
                                i18 = 5;
                            } else {
                                int i40 = 1;
                                int zzb9 = zzaecVar.zzb(i22) + 1;
                                int i41 = 0;
                                while (i41 < zzb9) {
                                    if (zzaecVar.zzb(16) > 2) {
                                        throw zzcc.zza("residueType greater than 2 is not decodable", null);
                                    }
                                    zzaecVar.zzc(24);
                                    zzaecVar.zzc(24);
                                    zzaecVar.zzc(24);
                                    int zzb10 = zzaecVar.zzb(i22) + i40;
                                    int i42 = 8;
                                    zzaecVar.zzc(8);
                                    int[] iArr3 = new int[zzb10];
                                    for (int i43 = 0; i43 < zzb10; i43++) {
                                        iArr3[i43] = ((zzaecVar.zzd() ? zzaecVar.zzb(5) : 0) * 8) + zzaecVar.zzb(3);
                                    }
                                    int i44 = 0;
                                    while (i44 < zzb10) {
                                        int i45 = 0;
                                        while (i45 < i42) {
                                            if ((iArr3[i44] & (1 << i45)) != 0) {
                                                zzaecVar.zzc(i42);
                                            }
                                            i45++;
                                            i42 = 8;
                                        }
                                        i44++;
                                        i42 = 8;
                                    }
                                    i41++;
                                    i22 = 6;
                                    i40 = 1;
                                }
                                int zzb11 = zzaecVar.zzb(i22) + 1;
                                for (int i46 = 0; i46 < zzb11; i46++) {
                                    int zzb12 = zzaecVar.zzb(16);
                                    if (zzb12 != 0) {
                                        zzff.zzc("VorbisUtil", "mapping type other than 0 not supported: " + zzb12);
                                    } else {
                                        if (zzaecVar.zzd()) {
                                            i10 = 1;
                                            i11 = zzaecVar.zzb(4) + 1;
                                        } else {
                                            i10 = 1;
                                            i11 = 1;
                                        }
                                        if (zzaecVar.zzd()) {
                                            int zzb13 = zzaecVar.zzb(8) + i10;
                                            for (int i47 = 0; i47 < zzb13; i47++) {
                                                int i48 = i17 - 1;
                                                zzaecVar.zzc(zzaeg.zza(i48));
                                                zzaecVar.zzc(zzaeg.zza(i48));
                                            }
                                        }
                                        if (zzaecVar.zzb(2) != 0) {
                                            throw zzcc.zza("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (i11 > 1) {
                                            for (int i49 = 0; i49 < i17; i49++) {
                                                zzaecVar.zzc(4);
                                            }
                                        }
                                        for (int i50 = 0; i50 < i11; i50++) {
                                            zzaecVar.zzc(8);
                                            zzaecVar.zzc(8);
                                            zzaecVar.zzc(8);
                                        }
                                    }
                                }
                                int zzb14 = zzaecVar.zzb(6) + 1;
                                zzaee[] zzaeeVarArr = new zzaee[zzb14];
                                for (int i51 = 0; i51 < zzb14; i51++) {
                                    zzaeeVarArr[i51] = new zzaee(zzaecVar.zzd(), zzaecVar.zzb(16), zzaecVar.zzb(16), zzaecVar.zzb(8));
                                }
                                if (!zzaecVar.zzd()) {
                                    throw zzcc.zza("framing bit after modes not set as expected", null);
                                }
                                zzakfVar = new zzakf(zzaefVar3, zzaedVar, bArr, zzaeeVarArr, zzaeg.zza(zzb14 - 1));
                            }
                        }
                    } else {
                        if (zzaecVar.zzb(24) != 5653314) {
                            throw zzcc.zza("expected code book to start with [0x56, 0x43, 0x42] at " + zzaecVar.zza(), null);
                        }
                        int zzb15 = zzaecVar.zzb(16);
                        int zzb16 = zzaecVar.zzb(24);
                        if (zzaecVar.zzd()) {
                            zzaecVar.zzc(5);
                            for (int i52 = 0; i52 < zzb16; i52 += zzaecVar.zzb(zzaeg.zza(zzb16 - i52))) {
                            }
                        } else {
                            boolean zzd = zzaecVar.zzd();
                            for (int i53 = 0; i53 < zzb16; i53++) {
                                if (!zzd || zzaecVar.zzd()) {
                                    zzaecVar.zzc(5);
                                }
                            }
                        }
                        int zzb17 = zzaecVar.zzb(i13);
                        if (zzb17 > 2) {
                            throw zzcc.zza("lookup type greater than 2 not decodable: " + zzb17, null);
                        }
                        if (zzb17 == 1) {
                            i20 = zzb17;
                        } else if (zzb17 != 2) {
                            zzaefVar = zzaefVar2;
                            i19++;
                            zzaefVar2 = zzaefVar;
                            i13 = 4;
                        }
                        zzaecVar.zzc(32);
                        zzaecVar.zzc(32);
                        int zzb18 = zzaecVar.zzb(i13) + 1;
                        zzaecVar.zzc(1);
                        zzaefVar = zzaefVar2;
                        zzaecVar.zzc((int) ((i20 == 1 ? zzb15 != 0 ? (long) Math.floor(Math.pow(zzb16, 1.0d / zzb15)) : 0L : zzb15 * zzb16) * zzb18));
                        i19++;
                        zzaefVar2 = zzaefVar;
                        i13 = 4;
                    }
                }
            }
        }
        zzakfVar = null;
        this.zza = zzakfVar;
        if (zzakfVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        zzaef zzaefVar4 = zzakfVar.zza;
        arrayList.add(zzaefVar4.zzg);
        arrayList.add(zzakfVar.zzc);
        zzby zzb19 = zzaeg.zzb(zzgaa.zzk(zzakfVar.zzb.zzb));
        zzak zzakVar = new zzak();
        zzakVar.zzW("audio/vorbis");
        zzakVar.zzx(zzaefVar4.zzd);
        zzakVar.zzR(zzaefVar4.zzc);
        zzakVar.zzy(zzaefVar4.zza);
        zzakVar.zzX(zzaefVar4.zzb);
        zzakVar.zzL(arrayList);
        zzakVar.zzP(zzb19);
        zzakbVar.zza = zzakVar.zzac();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzake
    public final void zzi(long j10) {
        super.zzi(j10);
        this.zzc = j10 != 0;
        zzaef zzaefVar = this.zzd;
        this.zzb = zzaefVar != null ? zzaefVar.zze : 0;
    }
}

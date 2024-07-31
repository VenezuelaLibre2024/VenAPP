package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
final class zzajk {
    private static final zzfxr zza = zzfxr.zzc(zzfwp.zzc(':'));
    private static final zzfxr zzb = zzfxr.zzc(zzfwp.zzc('*'));
    private final List zzc = new ArrayList();
    private int zzd = 0;
    private int zze;

    public final int zza(zzacv zzacvVar, zzadr zzadrVar, List list) {
        long j10;
        int i10;
        char c10;
        char c11;
        int i11 = this.zzd;
        if (i11 == 0) {
            long zzd = zzacvVar.zzd();
            zzadrVar.zza = (zzd == -1 || zzd < 8) ? 0L : zzd - 8;
            this.zzd = 1;
            return 1;
        }
        int i12 = 2;
        if (i11 != 1) {
            short s10 = 2817;
            short s11 = 2816;
            short s12 = 2192;
            if (i11 != 2) {
                long zzf = zzacvVar.zzf();
                int zzd2 = (int) ((zzacvVar.zzd() - zzacvVar.zzf()) - this.zze);
                zzfp zzfpVar = new zzfp(zzd2);
                zzacvVar.zzi(zzfpVar.zzM(), 0, zzd2);
                for (int i13 = 0; i13 < this.zzc.size(); i13++) {
                    zzajj zzajjVar = (zzajj) this.zzc.get(i13);
                    zzfpVar.zzK((int) (zzajjVar.zza - zzf));
                    zzfpVar.zzL(4);
                    int zzi = zzfpVar.zzi();
                    Charset charset = zzfwq.zzc;
                    String zzA = zzfpVar.zzA(zzi, charset);
                    switch (zzA.hashCode()) {
                        case -1711564334:
                            if (zzA.equals("SlowMotion_Data")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case -1332107749:
                            if (zzA.equals("Super_SlowMotion_Edit_Data")) {
                                c10 = 3;
                                break;
                            }
                            break;
                        case -1251387154:
                            if (zzA.equals("Super_SlowMotion_Data")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case -830665521:
                            if (zzA.equals("Super_SlowMotion_Deflickering_On")) {
                                c10 = 4;
                                break;
                            }
                            break;
                        case 1760745220:
                            if (zzA.equals("Super_SlowMotion_BGM")) {
                                c10 = 2;
                                break;
                            }
                            break;
                    }
                    c10 = 65535;
                    if (c10 == 0) {
                        c11 = 2192;
                    } else if (c10 == 1) {
                        c11 = 2816;
                    } else if (c10 == 2) {
                        c11 = 2817;
                    } else if (c10 == 3) {
                        c11 = 2819;
                    } else {
                        if (c10 != 4) {
                            throw zzcc.zza("Invalid SEF name", null);
                        }
                        c11 = 2820;
                    }
                    int i14 = zzajjVar.zzb - (zzi + 8);
                    if (c11 == 2192) {
                        ArrayList arrayList = new ArrayList();
                        List zzf2 = zzb.zzf(zzfpVar.zzA(i14, charset));
                        for (int i15 = 0; i15 < zzf2.size(); i15++) {
                            List zzf3 = zza.zzf((CharSequence) zzf2.get(i15));
                            if (zzf3.size() != 3) {
                                throw zzcc.zza(null, null);
                            }
                            try {
                                arrayList.add(new zzahi(Long.parseLong((String) zzf3.get(0)), Long.parseLong((String) zzf3.get(1)), 1 << (Integer.parseInt((String) zzf3.get(2)) - 1)));
                            } catch (NumberFormatException e10) {
                                throw zzcc.zza(null, e10);
                            }
                        }
                        list.add(new zzahj(arrayList));
                    } else if (c11 != 2816 && c11 != 2817 && c11 != 2819 && c11 != 2820) {
                        throw new IllegalStateException();
                    }
                }
                zzadrVar.zza = 0L;
                return 1;
            }
            long zzd3 = zzacvVar.zzd();
            int i16 = this.zze - 20;
            zzfp zzfpVar2 = new zzfp(i16);
            zzacvVar.zzi(zzfpVar2.zzM(), 0, i16);
            int i17 = 0;
            while (i17 < i16 / 12) {
                zzfpVar2.zzL(i12);
                short zzC = zzfpVar2.zzC();
                if (zzC == s12 || zzC == s11 || zzC == s10 || zzC == 2819 || zzC == 2820) {
                    i10 = i16;
                    this.zzc.add(new zzajj(zzC, (zzd3 - this.zze) - zzfpVar2.zzi(), zzfpVar2.zzi()));
                } else {
                    zzfpVar2.zzL(8);
                    i10 = i16;
                }
                i17++;
                i16 = i10;
                i12 = 2;
                s10 = 2817;
                s11 = 2816;
                s12 = 2192;
            }
            if (!this.zzc.isEmpty()) {
                this.zzd = 3;
                j10 = ((zzajj) this.zzc.get(0)).zza;
                zzadrVar.zza = j10;
                return 1;
            }
        } else {
            zzfp zzfpVar3 = new zzfp(8);
            zzacvVar.zzi(zzfpVar3.zzM(), 0, 8);
            this.zze = zzfpVar3.zzi() + 8;
            if (zzfpVar3.zzg() == 1397048916) {
                zzadrVar.zza = zzacvVar.zzf() - (this.zze - 12);
                this.zzd = 2;
                return 1;
            }
        }
        j10 = 0;
        zzadrVar.zza = j10;
        return 1;
    }

    public final void zzb() {
        this.zzc.clear();
        this.zzd = 0;
    }
}

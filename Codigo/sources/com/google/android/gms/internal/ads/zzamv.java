package com.google.android.gms.internal.ads;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzamv implements zzaoj {
    private final List zza;

    public zzamv() {
        this(0);
    }

    public zzamv(int i10) {
        this.zza = zzgaa.zzl();
    }

    public zzamv(int i10, List list) {
        this.zza = list;
    }

    private final zzanz zzb(zzaoi zzaoiVar) {
        return new zzanz(zzd(zzaoiVar));
    }

    private final zzaon zzc(zzaoi zzaoiVar) {
        return new zzaon(zzd(zzaoiVar));
    }

    private final List zzd(zzaoi zzaoiVar) {
        String str;
        int i10;
        List list;
        zzfp zzfpVar = new zzfp(zzaoiVar.zzd);
        List list2 = this.zza;
        while (zzfpVar.zzb() > 0) {
            int zzm = zzfpVar.zzm();
            int zzd = zzfpVar.zzd() + zzfpVar.zzm();
            if (zzm == 134) {
                list2 = new ArrayList();
                int zzm2 = zzfpVar.zzm() & 31;
                for (int i11 = 0; i11 < zzm2; i11++) {
                    String zzA = zzfpVar.zzA(3, zzfwq.zzc);
                    int zzm3 = zzfpVar.zzm();
                    boolean z10 = (zzm3 & RecognitionOptions.ITF) != 0;
                    if (z10) {
                        i10 = zzm3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte zzm4 = (byte) zzfpVar.zzm();
                    zzfpVar.zzL(1);
                    if (z10) {
                        int i12 = zzm4 & 64;
                        int i13 = zzem.zza;
                        list = Collections.singletonList(i12 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    zzak zzakVar = new zzak();
                    zzakVar.zzW(str);
                    zzakVar.zzN(zzA);
                    zzakVar.zzw(i10);
                    zzakVar.zzL(list);
                    list2.add(zzakVar.zzac());
                }
            }
            zzfpVar.zzK(zzd);
        }
        return list2;
    }

    @Override // com.google.android.gms.internal.ads.zzaoj
    public final zzaol zza(int i10, zzaoi zzaoiVar) {
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new zzanp(new zzanm(zzaoiVar.zzb));
            }
            if (i10 == 21) {
                return new zzanp(new zzank());
            }
            if (i10 == 27) {
                return new zzanp(new zzanh(zzb(zzaoiVar), false, false));
            }
            if (i10 == 36) {
                return new zzanp(new zzanj(zzb(zzaoiVar)));
            }
            if (i10 == 89) {
                return new zzanp(new zzamx(zzaoiVar.zzc));
            }
            if (i10 == 138) {
                return new zzanp(new zzamw(zzaoiVar.zzb));
            }
            if (i10 == 172) {
                return new zzanp(new zzamr(zzaoiVar.zzb));
            }
            if (i10 == 257) {
                return new zzany(new zzano("application/vnd.dvb.ait"));
            }
            if (i10 != 128) {
                if (i10 != 129) {
                    if (i10 == 134) {
                        return new zzany(new zzano("application/x-scte35"));
                    }
                    if (i10 != 135) {
                        switch (i10) {
                            case 15:
                                return new zzanp(new zzamu(false, zzaoiVar.zzb));
                            case 16:
                                return new zzanp(new zzand(zzc(zzaoiVar)));
                            case 17:
                                return new zzanp(new zzanl(zzaoiVar.zzb));
                            default:
                                return null;
                        }
                    }
                }
                return new zzanp(new zzamo(zzaoiVar.zzb));
            }
        }
        return new zzanp(new zzana(zzc(zzaoiVar)));
    }
}

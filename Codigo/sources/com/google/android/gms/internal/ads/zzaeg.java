package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzaeg {
    public static int zza(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i10 >>>= 1;
            i11++;
        }
        return i11;
    }

    public static zzby zzb(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            int i11 = zzfy.zza;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                zzff.zzf("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzafw.zzb(new zzfp(Base64.decode(split[1], 0))));
                } catch (RuntimeException e10) {
                    zzff.zzg("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new zzaho(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzby(arrayList);
    }

    public static zzaed zzc(zzfp zzfpVar, boolean z10, boolean z11) {
        if (z10) {
            zzd(3, zzfpVar, false);
        }
        String zzA = zzfpVar.zzA((int) zzfpVar.zzs(), zzfwq.zzc);
        int length = zzA.length();
        long zzs = zzfpVar.zzs();
        String[] strArr = new String[(int) zzs];
        int i10 = length + 15;
        for (int i11 = 0; i11 < zzs; i11++) {
            String zzA2 = zzfpVar.zzA((int) zzfpVar.zzs(), zzfwq.zzc);
            strArr[i11] = zzA2;
            i10 = i10 + 4 + zzA2.length();
        }
        if (z11 && (zzfpVar.zzm() & 1) == 0) {
            throw zzcc.zza("framing bit expected to be set", null);
        }
        return new zzaed(zzA, strArr, i10 + 1);
    }

    public static boolean zzd(int i10, zzfp zzfpVar, boolean z10) {
        if (zzfpVar.zzb() < 7) {
            if (z10) {
                return false;
            }
            throw zzcc.zza("too short header: " + zzfpVar.zzb(), null);
        }
        if (zzfpVar.zzm() != i10) {
            if (z10) {
                return false;
            }
            throw zzcc.zza("expected header type ".concat(String.valueOf(Integer.toHexString(i10))), null);
        }
        if (zzfpVar.zzm() == 118 && zzfpVar.zzm() == 111 && zzfpVar.zzm() == 114 && zzfpVar.zzm() == 98 && zzfpVar.zzm() == 105 && zzfpVar.zzm() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw zzcc.zza("expected characters 'vorbis'", null);
    }
}

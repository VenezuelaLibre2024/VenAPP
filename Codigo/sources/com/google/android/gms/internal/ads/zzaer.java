package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzaer implements zzaej {
    public final zzgaa zza;
    private final int zzb;

    private zzaer(int i10, zzgaa zzgaaVar) {
        this.zzb = i10;
        this.zza = zzgaaVar;
    }

    public static zzaer zzc(int i10, zzfp zzfpVar) {
        String concat;
        int zzk;
        zzaej zzaesVar;
        StringBuilder sb2;
        String str;
        String str2;
        zzfzx zzfzxVar = new zzfzx();
        int zze = zzfpVar.zze();
        int i11 = -2;
        while (zzfpVar.zzb() > 8) {
            int zzi = zzfpVar.zzi();
            int zzd = zzfpVar.zzd() + zzfpVar.zzi();
            zzfpVar.zzJ(zzd);
            if (zzi == 1414744396) {
                zzaesVar = zzc(zzfpVar.zzi(), zzfpVar);
            } else {
                zzaes zzaesVar2 = null;
                switch (zzi) {
                    case 1718776947:
                        if (i11 != 2) {
                            if (i11 != 1) {
                                concat = "Ignoring strf box for unsupported track type: ".concat(zzfy.zzB(i11));
                                zzff.zzf("StreamFormatChunk", concat);
                                break;
                            } else {
                                zzk = zzfpVar.zzk();
                                String str3 = zzk != 1 ? zzk != 85 ? zzk != 255 ? zzk != 8192 ? zzk != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str3 != null) {
                                    int zzk2 = zzfpVar.zzk();
                                    int zzi2 = zzfpVar.zzi();
                                    zzfpVar.zzL(6);
                                    int zzk3 = zzfy.zzk(zzfpVar.zzq());
                                    int zzk4 = zzfpVar.zzk();
                                    byte[] bArr = new byte[zzk4];
                                    zzfpVar.zzG(bArr, 0, zzk4);
                                    zzak zzakVar = new zzak();
                                    zzakVar.zzW(str3);
                                    zzakVar.zzy(zzk2);
                                    zzakVar.zzX(zzi2);
                                    if ("audio/raw".equals(str3) && zzk3 != 0) {
                                        zzakVar.zzQ(zzk3);
                                    }
                                    if ("audio/mp4a-latm".equals(str3) && zzk4 > 0) {
                                        zzakVar.zzL(zzgaa.zzm(bArr));
                                    }
                                    zzaesVar = new zzaes(zzakVar.zzac());
                                    break;
                                } else {
                                    sb2 = new StringBuilder();
                                    str = "Ignoring track with unsupported format tag ";
                                }
                            }
                        } else {
                            zzfpVar.zzL(4);
                            int zzi3 = zzfpVar.zzi();
                            int zzi4 = zzfpVar.zzi();
                            zzfpVar.zzL(4);
                            zzk = zzfpVar.zzi();
                            switch (zzk) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 != null) {
                                zzak zzakVar2 = new zzak();
                                zzakVar2.zzab(zzi3);
                                zzakVar2.zzI(zzi4);
                                zzakVar2.zzW(str2);
                                zzaesVar2 = new zzaes(zzakVar2.zzac());
                                break;
                            } else {
                                sb2 = new StringBuilder();
                                str = "Ignoring track with unsupported compression ";
                            }
                        }
                        sb2.append(str);
                        sb2.append(zzk);
                        concat = sb2.toString();
                        zzff.zzf("StreamFormatChunk", concat);
                    case 1751742049:
                        zzaesVar = zzaeo.zzb(zzfpVar);
                        break;
                    case 1752331379:
                        zzaesVar = zzaep.zzb(zzfpVar);
                        break;
                    case 1852994675:
                        zzaesVar = zzaet.zzb(zzfpVar);
                        break;
                }
                zzaesVar = zzaesVar2;
            }
            if (zzaesVar != null) {
                if (zzaesVar.zza() == 1752331379) {
                    int i12 = ((zzaep) zzaesVar).zza;
                    if (i12 == 1935960438) {
                        i11 = 2;
                    } else if (i12 == 1935963489) {
                        i11 = 1;
                    } else if (i12 != 1937012852) {
                        zzff.zzf("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i12))));
                        i11 = -1;
                    } else {
                        i11 = 3;
                    }
                }
                zzfzxVar.zzf(zzaesVar);
            }
            zzfpVar.zzK(zzd);
            zzfpVar.zzJ(zze);
        }
        return new zzaer(i10, zzfzxVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzaej
    public final int zza() {
        return this.zzb;
    }

    public final zzaej zzb(Class cls) {
        zzgaa zzgaaVar = this.zza;
        int size = zzgaaVar.size();
        int i10 = 0;
        while (i10 < size) {
            zzaej zzaejVar = (zzaej) zzgaaVar.get(i10);
            i10++;
            if (zzaejVar.getClass() == cls) {
                return zzaejVar;
            }
        }
        return null;
    }
}

package com.google.android.gms.internal.ads;

import io.flutter.plugins.googlemobileads.Constants;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzajd {
    static final String[] zza = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", Constants.REQUEST_AGENT_GAME_TEMPLATE_PREFIX, "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};
    public static final /* synthetic */ int zzb = 0;

    public static zzbx zza(zzfp zzfpVar) {
        String str;
        String concat;
        String str2;
        String str3;
        String str4;
        int zzd = zzfpVar.zzd() + zzfpVar.zzg();
        int zzg = zzfpVar.zzg();
        int i10 = (zzg >> 24) & 255;
        zzbx zzbxVar = null;
        try {
            if (i10 == 169 || i10 == 253) {
                int i11 = zzg & 16777215;
                if (i11 == 6516084) {
                    int zzg2 = zzfpVar.zzg();
                    if (zzfpVar.zzg() == 1684108385) {
                        zzfpVar.zzL(8);
                        String zzz = zzfpVar.zzz(zzg2 - 16);
                        zzbxVar = new zzagk("und", zzz, zzz);
                    } else {
                        concat = "Failed to parse comment attribute: ".concat(zzaio.zzf(zzg));
                        zzff.zzf("MetadataUtil", concat);
                    }
                } else {
                    if (i11 != 7233901 && i11 != 7631467) {
                        if (i11 != 6516589 && i11 != 7828084) {
                            if (i11 == 6578553) {
                                str = "TDRC";
                            } else if (i11 == 4280916) {
                                str = "TPE1";
                            } else if (i11 == 7630703) {
                                str = "TSSE";
                            } else if (i11 == 6384738) {
                                str = "TALB";
                            } else if (i11 == 7108978) {
                                str = "USLT";
                            } else if (i11 == 6776174) {
                                zzbxVar = zze(zzg, "TCON", zzfpVar);
                            } else {
                                if (i11 == 6779504) {
                                    str = "TIT1";
                                }
                                zzff.zzb("MetadataUtil", "Skipped unknown metadata entry: " + zzaio.zzf(zzg));
                            }
                            zzbxVar = zze(zzg, str, zzfpVar);
                        }
                        str = "TCOM";
                        zzbxVar = zze(zzg, str, zzfpVar);
                    }
                    str = "TIT2";
                    zzbxVar = zze(zzg, str, zzfpVar);
                }
            } else if (zzg == 1735291493) {
                int zzb2 = zzb(zzfpVar);
                String str5 = (zzb2 <= 0 || zzb2 > 192) ? null : zza[zzb2 - 1];
                if (str5 != null) {
                    zzbxVar = new zzagz("TCON", null, zzgaa.zzm(str5));
                } else {
                    concat = "Failed to parse standard genre code";
                    zzff.zzf("MetadataUtil", concat);
                }
            } else {
                int i12 = 1684632427;
                if (zzg == 1684632427) {
                    str4 = "TPOS";
                } else {
                    i12 = 1953655662;
                    if (zzg == 1953655662) {
                        str4 = "TRCK";
                    } else if (zzg == 1953329263) {
                        zzbxVar = zzc(1953329263, "TBPM", zzfpVar, true, false);
                    } else if (zzg == 1668311404) {
                        zzbxVar = zzc(1668311404, "TCMP", zzfpVar, true, true);
                    } else if (zzg == 1668249202) {
                        int zzg3 = zzfpVar.zzg();
                        if (zzfpVar.zzg() == 1684108385) {
                            int zzg4 = zzfpVar.zzg() & 16777215;
                            if (zzg4 == 13) {
                                str3 = "image/jpeg";
                            } else if (zzg4 == 14) {
                                str3 = "image/png";
                                zzg4 = 14;
                            } else {
                                str3 = null;
                            }
                            if (str3 == null) {
                                concat = "Unrecognized cover art flags: " + zzg4;
                            } else {
                                zzfpVar.zzL(4);
                                int i13 = zzg3 - 16;
                                byte[] bArr = new byte[i13];
                                zzfpVar.zzG(bArr, 0, i13);
                                zzbxVar = new zzagc(str3, null, 3, bArr);
                            }
                        } else {
                            concat = "Failed to parse cover art attribute";
                        }
                        zzff.zzf("MetadataUtil", concat);
                    } else {
                        int i14 = 1631670868;
                        if (zzg == 1631670868) {
                            str2 = "TPE2";
                        } else {
                            i14 = 1936682605;
                            if (zzg == 1936682605) {
                                str2 = "TSOT";
                            } else {
                                i14 = 1936679276;
                                if (zzg == 1936679276) {
                                    str2 = "TSO2";
                                } else {
                                    i14 = 1936679282;
                                    if (zzg == 1936679282) {
                                        str2 = "TSOA";
                                    } else {
                                        i14 = 1936679265;
                                        if (zzg == 1936679265) {
                                            str2 = "TSOP";
                                        } else {
                                            i14 = 1936679791;
                                            if (zzg == 1936679791) {
                                                str2 = "TSOC";
                                            } else if (zzg == 1920233063) {
                                                zzbxVar = zzc(1920233063, "ITUNESADVISORY", zzfpVar, false, false);
                                            } else if (zzg == 1885823344) {
                                                zzbxVar = zzc(1885823344, "ITUNESGAPLESS", zzfpVar, false, true);
                                            } else if (zzg == 1936683886) {
                                                zzbxVar = zze(1936683886, "TVSHOWSORT", zzfpVar);
                                            } else if (zzg == 1953919848) {
                                                zzbxVar = zze(1953919848, "TVSHOW", zzfpVar);
                                            } else {
                                                if (zzg == 757935405) {
                                                    int i15 = -1;
                                                    int i16 = -1;
                                                    String str6 = null;
                                                    String str7 = null;
                                                    while (zzfpVar.zzd() < zzd) {
                                                        int zzd2 = zzfpVar.zzd();
                                                        int zzg5 = zzfpVar.zzg();
                                                        int zzg6 = zzfpVar.zzg();
                                                        zzfpVar.zzL(4);
                                                        if (zzg6 == 1835360622) {
                                                            str6 = zzfpVar.zzz(zzg5 - 12);
                                                        } else {
                                                            int i17 = zzg5 - 12;
                                                            if (zzg6 == 1851878757) {
                                                                str7 = zzfpVar.zzz(i17);
                                                            } else {
                                                                if (zzg6 == 1684108385) {
                                                                    i16 = zzg5;
                                                                }
                                                                if (zzg6 == 1684108385) {
                                                                    i15 = zzd2;
                                                                }
                                                                zzfpVar.zzL(i17);
                                                            }
                                                        }
                                                    }
                                                    if (str6 != null && str7 != null && i15 != -1) {
                                                        zzfpVar.zzK(i15);
                                                        zzfpVar.zzL(16);
                                                        zzbxVar = new zzagt(str6, str7, zzfpVar.zzz(i16 - 16));
                                                    }
                                                }
                                                zzff.zzb("MetadataUtil", "Skipped unknown metadata entry: " + zzaio.zzf(zzg));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        zzbxVar = zze(i14, str2, zzfpVar);
                    }
                }
                zzbxVar = zzd(i12, str4, zzfpVar);
            }
            return zzbxVar;
        } finally {
            zzfpVar.zzK(zzd);
        }
    }

    private static int zzb(zzfp zzfpVar) {
        zzfpVar.zzL(4);
        if (zzfpVar.zzg() == 1684108385) {
            zzfpVar.zzL(8);
            return zzfpVar.zzm();
        }
        zzff.zzf("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    private static zzagr zzc(int i10, String str, zzfp zzfpVar, boolean z10, boolean z11) {
        int zzb2 = zzb(zzfpVar);
        if (z11) {
            zzb2 = Math.min(1, zzb2);
        }
        if (zzb2 >= 0) {
            return z10 ? new zzagz(str, null, zzgaa.zzm(Integer.toString(zzb2))) : new zzagk("und", str, Integer.toString(zzb2));
        }
        zzff.zzf("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzaio.zzf(i10)));
        return null;
    }

    private static zzagz zzd(int i10, String str, zzfp zzfpVar) {
        int zzg = zzfpVar.zzg();
        if (zzfpVar.zzg() == 1684108385 && zzg >= 22) {
            zzfpVar.zzL(10);
            int zzq = zzfpVar.zzq();
            if (zzq > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(zzq);
                String sb3 = sb2.toString();
                int zzq2 = zzfpVar.zzq();
                if (zzq2 > 0) {
                    sb3 = sb3 + "/" + zzq2;
                }
                return new zzagz(str, null, zzgaa.zzm(sb3));
            }
        }
        zzff.zzf("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzaio.zzf(i10)));
        return null;
    }

    private static zzagz zze(int i10, String str, zzfp zzfpVar) {
        int zzg = zzfpVar.zzg();
        if (zzfpVar.zzg() == 1684108385) {
            zzfpVar.zzL(8);
            return new zzagz(str, null, zzgaa.zzm(zzfpVar.zzz(zzg - 16)));
        }
        zzff.zzf("MetadataUtil", "Failed to parse text attribute: ".concat(zzaio.zzf(i10)));
        return null;
    }
}

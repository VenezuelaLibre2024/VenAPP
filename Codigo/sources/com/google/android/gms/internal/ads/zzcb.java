package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class zzcb {
    public static final /* synthetic */ int zza = 0;
    private static final ArrayList zzb = new ArrayList();
    private static final Pattern zzc = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int zza(String str, String str2) {
        char c10;
        zzca zzc2;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case -1365340241:
                if (str.equals("audio/vnd.dts.hd;profile=lbr")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 550520934:
                if (str.equals("audio/vnd.dts.uhd;profile=p2")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                return 9;
            case 1:
                if (str2 == null || (zzc2 = zzc(str2)) == null) {
                    return 0;
                }
                return zzc2.zza();
            case 2:
                return 5;
            case 3:
                return 6;
            case 4:
                return 18;
            case 5:
                return 17;
            case 6:
                return 7;
            case 7:
            case '\b':
                return 8;
            case '\t':
                return 30;
            case '\n':
                return 14;
            case 11:
                return 20;
            default:
                return 0;
        }
    }

    public static int zzb(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (zzg(str)) {
            return 1;
        }
        if (zzh(str)) {
            return 2;
        }
        if ("text".equals(zzi(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        if ("image".equals(zzi(str)) || "application/x-image-uri".equals(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        int size = zzb.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str2 = ((zzbz) zzb.get(i10)).zza;
            if (str.equals(null)) {
                return 0;
            }
        }
        return -1;
    }

    static zzca zzc(String str) {
        Matcher matcher = zzc.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            return new zzca(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String zzd(int i10) {
        if (i10 == 32) {
            return "video/mp4v-es";
        }
        if (i10 == 33) {
            return "video/avc";
        }
        if (i10 == 35) {
            return "video/hevc";
        }
        if (i10 == 64) {
            return "audio/mp4a-latm";
        }
        if (i10 == 163) {
            return "video/wvc1";
        }
        if (i10 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i10 == 221) {
            return "audio/vorbis";
        }
        if (i10 == 165) {
            return "audio/ac3";
        }
        if (i10 == 166) {
            return "audio/eac3";
        }
        switch (i10) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i10) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String zze(String str) {
        char c10;
        if (str == null) {
            return null;
        }
        String zza2 = zzfwk.zza(str);
        switch (zza2.hashCode()) {
            case -1007807498:
                if (zza2.equals("audio/x-flac")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -979095690:
                if (zza2.equals("application/x-mpegurl")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -586683234:
                if (zza2.equals("audio/x-wav")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -432836268:
                if (zza2.equals("audio/mpeg-l1")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case -432836267:
                if (zza2.equals("audio/mpeg-l2")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 187090231:
                if (zza2.equals("audio/mp3")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        return c10 != 0 ? c10 != 1 ? c10 != 2 ? c10 != 3 ? c10 != 4 ? c10 != 5 ? zza2 : "audio/mpeg-L2" : "audio/mpeg-L1" : "application/x-mpegURL" : "audio/wav" : "audio/mpeg" : "audio/flac";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean zzf(String str, String str2) {
        char c10;
        zzca zzc2;
        int zza2;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
                return true;
            case '\n':
                return (str2 == null || (zzc2 = zzc(str2)) == null || (zza2 = zzc2.zza()) == 0 || zza2 == 16) ? false : true;
            default:
                return false;
        }
    }

    public static boolean zzg(String str) {
        return "audio".equals(zzi(str));
    }

    public static boolean zzh(String str) {
        return "video".equals(zzi(str));
    }

    private static String zzi(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }
}

package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.facebook.ads.AdError;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.api.a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class zzfy {
    public static final int zza;
    public static final String zzb;
    public static final String zzc;
    public static final String zzd;
    public static final String zze;
    public static final byte[] zzf;
    private static final Pattern zzg;
    private static final Pattern zzh;
    private static final Pattern zzi;
    private static final Pattern zzj;
    private static HashMap zzk;
    private static final String[] zzl;
    private static final String[] zzm;
    private static final int[] zzn;
    private static final int[] zzo;

    static {
        int i10 = Build.VERSION.SDK_INT;
        zza = i10;
        String str = Build.DEVICE;
        zzb = str;
        String str2 = Build.MANUFACTURER;
        zzc = str2;
        String str3 = Build.MODEL;
        zzd = str3;
        zze = str + ", " + str3 + ", " + str2 + ", " + i10;
        zzf = new byte[0];
        zzg = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        zzh = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        zzi = Pattern.compile("%([A-Fa-f0-9]{2})");
        zzj = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        zzl = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", FacebookMediationAdapter.KEY_ID, "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        zzm = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        zzn = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        zzo = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, RecognitionOptions.ITF, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static String zzA(byte[] bArr, int i10, int i11) {
        return new String(bArr, i10, i11, zzfwq.zzc);
    }

    public static String zzB(int i10) {
        switch (i10) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            default:
                return "camera motion";
        }
    }

    public static String zzC(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String zza2 = zzfwk.zza(str);
        int i10 = 0;
        String str2 = zza2.split("-", 2)[0];
        if (zzk == null) {
            zzk = zzO();
        }
        String str3 = (String) zzk.get(str2);
        if (str3 != null) {
            zza2 = str3.concat(String.valueOf(zza2.substring(str2.length())));
            str2 = str3;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return zza2;
        }
        while (true) {
            String[] strArr = zzm;
            int length = strArr.length;
            if (i10 >= 18) {
                return zza2;
            }
            if (zza2.startsWith(strArr[i10])) {
                return String.valueOf(strArr[i10 + 1]).concat(String.valueOf(zza2.substring(strArr[i10].length())));
            }
            i10 += 2;
        }
    }

    public static ExecutorService zzD(String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.google.android.gms.internal.ads.zzfx
            public final /* synthetic */ String zza;

            public /* synthetic */ zzfx(String str2) {
                r1 = str2;
            }

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, r1);
            }
        });
    }

    public static void zzE(long[] jArr, long j10, long j11) {
        RoundingMode roundingMode = RoundingMode.FLOOR;
        int i10 = 0;
        if (j11 >= 1000000 && j11 % 1000000 == 0) {
            long zza2 = zzgcq.zza(j11, 1000000L, RoundingMode.UNNECESSARY);
            while (i10 < jArr.length) {
                jArr[i10] = zzgcq.zza(jArr[i10], zza2, roundingMode);
                i10++;
            }
            return;
        }
        if (j11 < 1000000 && 1000000 % j11 == 0) {
            long zza3 = zzgcq.zza(1000000L, j11, RoundingMode.UNNECESSARY);
            while (i10 < jArr.length) {
                jArr[i10] = zzgcq.zzc(jArr[i10], zza3);
                i10++;
            }
            return;
        }
        for (int i11 = 0; i11 < jArr.length; i11++) {
            long j12 = jArr[i11];
            if (j12 != 0) {
                if (j11 >= j12 && j11 % j12 == 0) {
                    jArr[i11] = zzgcq.zza(1000000L, zzgcq.zza(j11, j12, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j11 >= j12 || j12 % j11 != 0) {
                    jArr[i11] = zzM(j12, 1000000L, j11, roundingMode);
                } else {
                    jArr[i11] = zzgcq.zzc(1000000L, zzgcq.zza(j12, j11, RoundingMode.UNNECESSARY));
                }
            }
        }
    }

    public static boolean zzF(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        r4.zzJ(r3);
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean zzG(com.google.android.gms.internal.ads.zzfp r3, com.google.android.gms.internal.ads.zzfp r4, java.util.zip.Inflater r5) {
        /*
            int r0 = r3.zzb()
            r1 = 0
            if (r0 > 0) goto L8
            return r1
        L8:
            int r0 = r4.zzc()
            int r2 = r3.zzb()
            if (r0 >= r2) goto L1a
            int r0 = r3.zzb()
            int r0 = r0 + r0
            r4.zzE(r0)
        L1a:
            if (r5 != 0) goto L21
            java.util.zip.Inflater r5 = new java.util.zip.Inflater
            r5.<init>()
        L21:
            byte[] r0 = r3.zzM()
            int r2 = r3.zzd()
            int r3 = r3.zzb()
            r5.setInput(r0, r2, r3)
            r3 = r1
        L31:
            byte[] r0 = r4.zzM()     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            int r2 = r4.zzc()     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            int r2 = r2 - r3
            int r0 = r5.inflate(r0, r3, r2)     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            int r3 = r3 + r0
            boolean r0 = r5.finished()     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            if (r0 == 0) goto L4a
            r4.zzJ(r3)     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            r1 = 1
            goto L6b
        L4a:
            boolean r0 = r5.needsDictionary()     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            if (r0 != 0) goto L6b
            boolean r0 = r5.needsInput()     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            if (r0 == 0) goto L57
            goto L6b
        L57:
            int r0 = r4.zzc()     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            if (r3 != r0) goto L31
            int r0 = r4.zzc()     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            int r0 = r0 + r0
            r4.zzE(r0)     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            goto L31
        L66:
            r3 = move-exception
            r5.reset()
            throw r3
        L6b:
            r5.reset()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfy.zzG(com.google.android.gms.internal.ads.zzfp, com.google.android.gms.internal.ads.zzfp, java.util.zip.Inflater):boolean");
    }

    public static boolean zzH(int i10) {
        return i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4;
    }

    public static boolean zzI(int i10) {
        return i10 == 10 || i10 == 13;
    }

    public static boolean zzJ(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean zzK(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static Object[] zzL(Object[] objArr, int i10) {
        zzek.zzd(i10 <= objArr.length);
        return Arrays.copyOf(objArr, i10);
    }

    private static long zzM(long j10, long j11, long j12, RoundingMode roundingMode) {
        long zzc2 = zzgcq.zzc(j10, j11);
        if (zzc2 != Long.MAX_VALUE && zzc2 != Long.MIN_VALUE) {
            return zzgcq.zza(zzc2, j12, roundingMode);
        }
        long zzb2 = zzgcq.zzb(Math.abs(j11), Math.abs(j12));
        long zza2 = zzgcq.zza(j11, zzb2, RoundingMode.UNNECESSARY);
        long zza3 = zzgcq.zza(j12, zzb2, RoundingMode.UNNECESSARY);
        long zzb3 = zzgcq.zzb(Math.abs(j10), Math.abs(zza3));
        long zza4 = zzgcq.zza(j10, zzb3, RoundingMode.UNNECESSARY);
        long zza5 = zzgcq.zza(zza3, zzb3, RoundingMode.UNNECESSARY);
        long zzc3 = zzgcq.zzc(zza4, zza2);
        if (zzc3 != Long.MAX_VALUE && zzc3 != Long.MIN_VALUE) {
            return zzgcq.zza(zzc3, zza5, roundingMode);
        }
        double d10 = zza4 * (zza2 / zza5);
        if (d10 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d10 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return zzgcl.zza(d10, roundingMode);
    }

    private static String zzN(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e10) {
            zzff.zzd("Util", "Failed to read system property ".concat(str), e10);
            return null;
        }
    }

    private static HashMap zzO() {
        String[] iSOLanguages = Locale.getISOLanguages();
        int length = iSOLanguages.length;
        int length2 = zzl.length;
        HashMap hashMap = new HashMap(length + 88);
        int i10 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = zzl;
            int length3 = strArr.length;
            if (i10 >= 88) {
                return hashMap;
            }
            hashMap.put(strArr[i10], strArr[i10 + 1]);
            i10 += 2;
        }
    }

    public static int zza(long[] jArr, long j10, boolean z10, boolean z11) {
        int binarySearch = Arrays.binarySearch(jArr, j10);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        do {
            binarySearch++;
            if (binarySearch >= jArr.length) {
                break;
            }
        } while (jArr[binarySearch] == j10);
        return !z10 ? binarySearch : binarySearch - 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zzb(int[] r2, int r3, boolean r4, boolean r5) {
        /*
            int r0 = java.util.Arrays.binarySearch(r2, r3)
            if (r0 >= 0) goto La
            int r0 = r0 + 2
            int r2 = -r0
            goto L18
        La:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L12
            r1 = r2[r0]
            if (r1 == r3) goto La
        L12:
            if (r4 == 0) goto L17
            int r2 = r0 + 1
            goto L18
        L17:
            r2 = r0
        L18:
            if (r5 == 0) goto L1f
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
        L1f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfy.zzb(int[], int, boolean, boolean):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zzc(long[] r2, long r3, boolean r5, boolean r6) {
        /*
            int r5 = java.util.Arrays.binarySearch(r2, r3)
            if (r5 >= 0) goto La
            int r5 = r5 + 2
            int r2 = -r5
            goto L16
        La:
            int r5 = r5 + (-1)
            if (r5 < 0) goto L14
            r0 = r2[r5]
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto La
        L14:
            int r2 = r5 + 1
        L16:
            if (r6 == 0) goto L1d
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
        L1d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfy.zzc(long[], long, boolean, boolean):int");
    }

    public static int zzd(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = zzn[(i12 >>> 24) ^ (bArr[i10] & 255)] ^ (i12 << 8);
            i10++;
        }
        return i12;
    }

    public static int zze(byte[] bArr, int i10, int i11, int i12) {
        int i13 = 0;
        while (i10 < i11) {
            i13 = zzo[i13 ^ (bArr[i10] & 255)];
            i10++;
        }
        return i13;
    }

    public static int zzf(int i10) {
        if (i10 == 20) {
            return 30;
        }
        if (i10 == 22) {
            return 31;
        }
        if (i10 == 30) {
            return 34;
        }
        switch (i10) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i10) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        return a.e.API_PRIORITY_OTHER;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zzg(int r2) {
        /*
            r0 = 6396(0x18fc, float:8.963E-42)
            switch(r2) {
                case 1: goto L28;
                case 2: goto L25;
                case 3: goto L22;
                case 4: goto L1f;
                case 5: goto L1c;
                case 6: goto L19;
                case 7: goto L16;
                case 8: goto L15;
                case 9: goto L5;
                case 10: goto Lb;
                case 11: goto L5;
                case 12: goto L7;
                default: goto L5;
            }
        L5:
            r2 = 0
            return r2
        L7:
            r2 = 743676(0xb58fc, float:1.042112E-39)
            return r2
        Lb:
            int r2 = com.google.android.gms.internal.ads.zzfy.zza
            r1 = 32
            if (r2 < r1) goto L15
            r2 = 737532(0xb40fc, float:1.033502E-39)
            return r2
        L15:
            return r0
        L16:
            r2 = 1276(0x4fc, float:1.788E-42)
            return r2
        L19:
            r2 = 252(0xfc, float:3.53E-43)
            return r2
        L1c:
            r2 = 220(0xdc, float:3.08E-43)
            return r2
        L1f:
            r2 = 204(0xcc, float:2.86E-43)
            return r2
        L22:
            r2 = 28
            return r2
        L25:
            r2 = 12
            return r2
        L28:
            r2 = 4
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfy.zzg(int):int");
    }

    public static int zzh(ByteBuffer byteBuffer, int i10) {
        int i11 = byteBuffer.getInt(i10);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i11 : Integer.reverseBytes(i11);
    }

    public static int zzi(int i10) {
        if (i10 == 2 || i10 == 4) {
            return 6005;
        }
        if (i10 == 10) {
            return 6004;
        }
        if (i10 == 7) {
            return 6005;
        }
        if (i10 == 8) {
            return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
        }
        switch (i10) {
            case 15:
                return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i10) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return AdError.ICONVIEW_MISSING_ERROR_CODE;
                    default:
                        return 6006;
                }
        }
    }

    public static int zzj(String str) {
        String[] split;
        int length;
        int i10 = 0;
        if (str == null || (length = (split = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = split[length - 1];
        boolean z10 = length >= 3 && "neg".equals(split[length + (-2)]);
        str2.getClass();
        try {
            i10 = Integer.parseInt(str2);
            if (z10) {
                return -i10;
            }
        } catch (NumberFormatException unused) {
        }
        return i10;
    }

    public static int zzk(int i10) {
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return 2;
        }
        if (i10 != 24) {
            return i10 != 32 ? 0 : 22;
        }
        return 21;
    }

    public static int zzl(int i10, int i11) {
        if (i10 != 2) {
            if (i10 == 3) {
                return i11;
            }
            if (i10 != 4) {
                if (i10 != 21) {
                    if (i10 != 22) {
                        if (i10 != 268435456) {
                            if (i10 != 1342177280) {
                                if (i10 != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return i11 * 3;
            }
            return i11 * 4;
        }
        return i11 + i11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int zzm(Uri uri) {
        char c10;
        String scheme = uri.getScheme();
        if (scheme != null && zzfwk.zzc("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int lastIndexOf = lastPathSegment.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String zza2 = zzfwk.zza(lastPathSegment.substring(lastIndexOf + 1));
            switch (zza2.hashCode()) {
                case 104579:
                    if (zza2.equals("ism")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 108321:
                    if (zza2.equals("mpd")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3242057:
                    if (zza2.equals("isml")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3299913:
                    if (zza2.equals("m3u8")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            int i10 = c10 != 0 ? c10 != 1 ? (c10 == 2 || c10 == 3) ? 1 : 4 : 2 : 0;
            if (i10 != 4) {
                return i10;
            }
        }
        Pattern pattern = zzj;
        String path = uri.getPath();
        path.getClass();
        Matcher matcher = pattern.matcher(path);
        if (!matcher.matches()) {
            return 4;
        }
        String group = matcher.group(2);
        if (group != null) {
            if (group.contains("format=mpd-time-csf")) {
                return 0;
            }
            if (group.contains("format=m3u8-aapl")) {
                return 2;
            }
        }
        return 1;
    }

    public static long zzn(long j10, int i10) {
        return zzs(j10, i10, 1000000L, RoundingMode.CEILING);
    }

    public static long zzo(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 * f10);
    }

    public static long zzp(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 / f10);
    }

    public static long zzq(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 * 1000;
    }

    public static long zzr(long j10, int i10) {
        return zzs(j10, 1000000L, i10, RoundingMode.FLOOR);
    }

    public static long zzs(long j10, long j11, long j12, RoundingMode roundingMode) {
        if (j10 == 0 || j11 == 0) {
            return 0L;
        }
        return (j12 < j11 || j12 % j11 != 0) ? (j12 >= j11 || j11 % j12 != 0) ? (j12 < j10 || j12 % j10 != 0) ? (j12 >= j10 || j10 % j12 != 0) ? zzM(j10, j11, j12, roundingMode) : zzgcq.zzc(j11, zzgcq.zza(j10, j12, RoundingMode.UNNECESSARY)) : zzgcq.zza(j11, zzgcq.zza(j12, j10, RoundingMode.UNNECESSARY), roundingMode) : zzgcq.zzc(j10, zzgcq.zza(j11, j12, RoundingMode.UNNECESSARY)) : zzgcq.zza(j10, zzgcq.zza(j12, j11, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static long zzt(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 / 1000;
    }

    public static Point zzu(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && zzJ(context)) {
            String zzN = zzN(zza < 28 ? "sys.display-size" : "vendor.display-size");
            if (!TextUtils.isEmpty(zzN)) {
                try {
                    String[] split = zzN.trim().split("x", -1);
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                zzff.zzc("Util", "Invalid display size: ".concat(String.valueOf(zzN)));
            }
            if ("Sony".equals(zzc) && zzd.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        if (zza < 23) {
            display.getRealSize(point);
            return point;
        }
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        return point;
    }

    public static AudioFormat zzv(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    public static Handler zzw(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        zzek.zzb(myLooper);
        return new Handler(myLooper, null);
    }

    public static Looper zzx() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    public static zzam zzy(int i10, int i11, int i12) {
        zzak zzakVar = new zzak();
        zzakVar.zzW("audio/raw");
        zzakVar.zzy(i11);
        zzakVar.zzX(i12);
        zzakVar.zzQ(i10);
        return zzakVar.zzac();
    }

    public static String zzz(byte[] bArr) {
        return new String(bArr, zzfwq.zzc);
    }
}

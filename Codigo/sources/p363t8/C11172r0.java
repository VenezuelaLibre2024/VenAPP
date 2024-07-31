package p363t8;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.facebook.ads.AdError;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.libraries.barhopper.RecognitionOptions;
import io.flutter.embedding.android.KeyboardMap;
import io.flutter.plugins.firebase.auth.Constants;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p082eb.C7147c;
import p082eb.C7149e;
import p361t6.C11005b3;
import p361t6.C11108u1;
import p361t6.InterfaceC11053j3;

/* renamed from: t8.r0 */
/* loaded from: classes.dex */
public final class C11172r0 {

    /* renamed from: a */
    public static final int f29040a;

    /* renamed from: b */
    public static final String f29041b;

    /* renamed from: c */
    public static final String f29042c;

    /* renamed from: d */
    public static final String f29043d;

    /* renamed from: e */
    public static final String f29044e;

    /* renamed from: f */
    public static final byte[] f29045f;

    /* renamed from: g */
    private static final Pattern f29046g;

    /* renamed from: h */
    private static final Pattern f29047h;

    /* renamed from: i */
    private static final Pattern f29048i;

    /* renamed from: j */
    private static final Pattern f29049j;

    /* renamed from: k */
    private static HashMap<String, String> f29050k;

    /* renamed from: l */
    private static final String[] f29051l;

    /* renamed from: m */
    private static final String[] f29052m;

    /* renamed from: n */
    private static final int[] f29053n;

    /* renamed from: o */
    private static final int[] f29054o;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f29040a = i10;
        String str = Build.DEVICE;
        f29041b = str;
        String str2 = Build.MANUFACTURER;
        f29042c = str2;
        String str3 = Build.MODEL;
        f29043d = str3;
        f29044e = str + ", " + str3 + ", " + str2 + ", " + i10;
        f29045f = new byte[0];
        f29046g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f29047h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f29048i = Pattern.compile("%([A-Fa-f0-9]{2})");
        f29049j = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f29051l = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", FacebookMediationAdapter.KEY_ID, "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f29052m = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f29053n = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f29054o = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, RecognitionOptions.ITF, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    /* renamed from: A */
    private static HashMap<String, String> m34856A() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> hashMap = new HashMap<>(iSOLanguages.length + f29051l.length);
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
            String[] strArr = f29051l;
            if (i10 >= strArr.length) {
                return hashMap;
            }
            hashMap.put(strArr[i10], strArr[i10 + 1]);
            i10 += 2;
        }
    }

    /* renamed from: A0 */
    private static String m34857A0(String str) {
        int i10 = 0;
        while (true) {
            String[] strArr = f29052m;
            if (i10 >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i10])) {
                return strArr[i10 + 1] + str.substring(strArr[i10].length());
            }
            i10 += 2;
        }
    }

    /* renamed from: B */
    public static Uri m34858B(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return uri;
        }
        Matcher matcher = f29049j.matcher(path);
        return (matcher.matches() && matcher.group(1) == null) ? Uri.withAppendedPath(uri, "Manifest") : uri;
    }

    /* renamed from: B0 */
    public static <T> void m34859B0(List<T> list, int i10, int i11, int i12) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i13 = (i11 - i10) - 1; i13 >= 0; i13--) {
            arrayDeque.addFirst(list.remove(i10 + i13));
        }
        list.addAll(Math.min(i12, list.size()), arrayDeque);
    }

    /* renamed from: C */
    public static String m34860C(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: C0 */
    public static long m34861C0(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 * 1000;
    }

    /* renamed from: D */
    public static String m34862D(byte[] bArr) {
        return new String(bArr, C7149e.f16019c);
    }

    /* renamed from: D0 */
    public static ExecutorService m34863D0(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: t8.q0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread m34959y0;
                m34959y0 = C11172r0.m34959y0(str, runnable);
                return m34959y0;
            }
        });
    }

    /* renamed from: E */
    public static String m34864E(byte[] bArr, int i10, int i11) {
        return new String(bArr, i10, i11, C7149e.f16019c);
    }

    /* renamed from: E0 */
    public static String m34865E0(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String m21253e = C7147c.m21253e(str);
        String str2 = m34893S0(m21253e, "-")[0];
        if (f29050k == null) {
            f29050k = m34856A();
        }
        String str3 = f29050k.get(str2);
        if (str3 != null) {
            m21253e = str3 + m21253e.substring(str2.length());
            str2 = str3;
        }
        return ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) ? m34857A0(m21253e) : m21253e;
    }

    /* renamed from: F */
    public static int m34866F(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    /* renamed from: F0 */
    public static <T> T[] m34867F0(T[] tArr, T t10) {
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length + 1);
        copyOf[tArr.length] = t10;
        return (T[]) m34930k(copyOf);
    }

    /* renamed from: G */
    public static int m34868G(int i10) {
        if (i10 == 12) {
            return 743676;
        }
        switch (i10) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            default:
                return 0;
        }
    }

    /* renamed from: G0 */
    public static <T> T[] m34869G0(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    /* renamed from: H */
    public static InterfaceC11053j3.b m34870H(InterfaceC11053j3 interfaceC11053j3, InterfaceC11053j3.b bVar) {
        boolean mo33931g = interfaceC11053j3.mo33931g();
        boolean mo34195E = interfaceC11053j3.mo34195E();
        boolean mo34202x = interfaceC11053j3.mo34202x();
        boolean mo34199n = interfaceC11053j3.mo34199n();
        boolean mo34196M = interfaceC11053j3.mo34196M();
        boolean mo34200p = interfaceC11053j3.mo34200p();
        boolean m34005v = interfaceC11053j3.mo33941r().m34005v();
        boolean z10 = false;
        InterfaceC11053j3.b.a m34210d = new InterfaceC11053j3.b.a().m34208b(bVar).m34210d(4, !mo33931g).m34210d(5, mo34195E && !mo33931g).m34210d(6, mo34202x && !mo33931g).m34210d(7, !m34005v && (mo34202x || !mo34196M || mo34195E) && !mo33931g).m34210d(8, mo34199n && !mo33931g).m34210d(9, !m34005v && (mo34199n || (mo34196M && mo34200p)) && !mo33931g).m34210d(10, !mo33931g).m34210d(11, mo34195E && !mo33931g);
        if (mo34195E && !mo33931g) {
            z10 = true;
        }
        return m34210d.m34210d(12, z10).m34211e();
    }

    /* renamed from: H0 */
    public static <T> T[] m34871H0(T[] tArr, int i10) {
        C11137a.m34599a(i10 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i10);
    }

    /* renamed from: I */
    public static int m34872I(ByteBuffer byteBuffer, int i10) {
        int i11 = byteBuffer.getInt(i10);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i11 : Integer.reverseBytes(i11);
    }

    /* renamed from: I0 */
    public static <T> T[] m34873I0(T[] tArr, int i10, int i11) {
        C11137a.m34599a(i10 >= 0);
        C11137a.m34599a(i11 <= tArr.length);
        return (T[]) Arrays.copyOfRange(tArr, i10, i11);
    }

    /* renamed from: J */
    public static byte[] m34874J(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) ((Character.digit(str.charAt(i11), 16) << 4) + Character.digit(str.charAt(i11 + 1), 16));
        }
        return bArr;
    }

    /* renamed from: J0 */
    public static long m34875J0(String str) {
        Matcher matcher = f29046g.matcher(str);
        if (!matcher.matches()) {
            throw C11005b3.m33715a("Invalid date/time format: " + str, null);
        }
        int i10 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i10 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
            if ("-".equals(matcher.group(11))) {
                i10 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i10 != 0 ? timeInMillis - (i10 * 60000) : timeInMillis;
    }

    /* renamed from: K */
    public static int m34876K(String str, int i10) {
        int i11 = 0;
        for (String str2 : m34895T0(str)) {
            if (i10 == C11178w.m35005m(str2)) {
                i11++;
            }
        }
        return i11;
    }

    /* renamed from: K0 */
    public static long m34877K0(String str) {
        Matcher matcher = f29047h.matcher(str);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        boolean isEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
        String group = matcher.group(3);
        double parseDouble = group != null ? Double.parseDouble(group) * 3.1556908E7d : 0.0d;
        String group2 = matcher.group(5);
        double parseDouble2 = parseDouble + (group2 != null ? Double.parseDouble(group2) * 2629739.0d : 0.0d);
        String group3 = matcher.group(7);
        double parseDouble3 = parseDouble2 + (group3 != null ? Double.parseDouble(group3) * 86400.0d : 0.0d);
        String group4 = matcher.group(10);
        double parseDouble4 = parseDouble3 + (group4 != null ? Double.parseDouble(group4) * 3600.0d : 0.0d);
        String group5 = matcher.group(12);
        double parseDouble5 = parseDouble4 + (group5 != null ? Double.parseDouble(group5) * 60.0d : 0.0d);
        String group6 = matcher.group(14);
        long parseDouble6 = (long) ((parseDouble5 + (group6 != null ? Double.parseDouble(group6) : 0.0d)) * 1000.0d);
        return isEmpty ? -parseDouble6 : parseDouble6;
    }

    /* renamed from: L */
    public static String m34878L(String str, int i10) {
        String[] m34895T0 = m34895T0(str);
        if (m34895T0.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : m34895T0) {
            if (i10 == C11178w.m35005m(str2)) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    /* renamed from: L0 */
    public static boolean m34879L0(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    /* renamed from: M */
    public static String m34880M(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < objArr.length; i10++) {
            sb2.append(objArr[i10].getClass().getSimpleName());
            if (i10 < objArr.length - 1) {
                sb2.append(", ");
            }
        }
        return sb2.toString();
    }

    /* renamed from: M0 */
    public static boolean m34881M0(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    /* renamed from: N */
    public static String m34882N(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService(Constants.SIGN_IN_METHOD_PHONE)) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return C7147c.m21255g(networkCountryIso);
            }
        }
        return C7147c.m21255g(Locale.getDefault().getCountry());
    }

    /* renamed from: N0 */
    public static <T> void m34883N0(List<T> list, int i10, int i11) {
        if (i10 < 0 || i11 > list.size() || i10 > i11) {
            throw new IllegalArgumentException();
        }
        if (i10 != i11) {
            list.subList(i10, i11).clear();
        }
    }

    /* renamed from: O */
    public static Point m34884O(Context context) {
        DisplayManager displayManager;
        Display display = (f29040a < 17 || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : displayManager.getDisplay(0);
        if (display == null) {
            display = ((WindowManager) C11137a.m34603e((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return m34886P(context, display);
    }

    /* renamed from: O0 */
    public static long m34885O0(long j10, long j11, long j12) {
        if (j12 >= j11 && j12 % j11 == 0) {
            return j10 / (j12 / j11);
        }
        if (j12 < j11 && j11 % j12 == 0) {
            return j10 * (j11 / j12);
        }
        return (long) (j10 * (j11 / j12));
    }

    /* renamed from: P */
    public static Point m34886P(Context context, Display display) {
        if (display.getDisplayId() == 0 && m34957x0(context)) {
            String m34931k0 = m34931k0(f29040a < 28 ? "sys.display-size" : "vendor.display-size");
            if (!TextUtils.isEmpty(m34931k0)) {
                try {
                    String[] m34891R0 = m34891R0(m34931k0.trim(), "x");
                    if (m34891R0.length == 2) {
                        int parseInt = Integer.parseInt(m34891R0[0]);
                        int parseInt2 = Integer.parseInt(m34891R0[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                C11173s.m34964c("Util", "Invalid display size: " + m34931k0);
            }
            if ("Sony".equals(f29042c) && f29043d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        int i10 = f29040a;
        if (i10 >= 23) {
            m34896U(display, point);
        } else if (i10 >= 17) {
            m34894T(display, point);
        } else {
            m34892S(display, point);
        }
        return point;
    }

    /* renamed from: P0 */
    public static long[] m34887P0(List<Long> list, long j10, long j11) {
        int size = list.size();
        long[] jArr = new long[size];
        int i10 = 0;
        if (j11 >= j10 && j11 % j10 == 0) {
            long j12 = j11 / j10;
            while (i10 < size) {
                jArr[i10] = list.get(i10).longValue() / j12;
                i10++;
            }
        } else if (j11 >= j10 || j10 % j11 != 0) {
            double d10 = j10 / j11;
            while (i10 < size) {
                jArr[i10] = (long) (list.get(i10).longValue() * d10);
                i10++;
            }
        } else {
            long j13 = j10 / j11;
            while (i10 < size) {
                jArr[i10] = list.get(i10).longValue() * j13;
                i10++;
            }
        }
        return jArr;
    }

    /* renamed from: Q */
    public static Looper m34888Q() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    /* renamed from: Q0 */
    public static void m34889Q0(long[] jArr, long j10, long j11) {
        int i10 = 0;
        if (j11 >= j10 && j11 % j10 == 0) {
            long j12 = j11 / j10;
            while (i10 < jArr.length) {
                jArr[i10] = jArr[i10] / j12;
                i10++;
            }
            return;
        }
        if (j11 >= j10 || j10 % j11 != 0) {
            double d10 = j10 / j11;
            while (i10 < jArr.length) {
                jArr[i10] = (long) (jArr[i10] * d10);
                i10++;
            }
            return;
        }
        long j13 = j10 / j11;
        while (i10 < jArr.length) {
            jArr[i10] = jArr[i10] * j13;
            i10++;
        }
    }

    /* renamed from: R */
    public static Locale m34890R() {
        return f29040a >= 24 ? Locale.getDefault(Locale.Category.DISPLAY) : Locale.getDefault();
    }

    /* renamed from: R0 */
    public static String[] m34891R0(String str, String str2) {
        return str.split(str2, -1);
    }

    /* renamed from: S */
    private static void m34892S(Display display, Point point) {
        display.getSize(point);
    }

    /* renamed from: S0 */
    public static String[] m34893S0(String str, String str2) {
        return str.split(str2, 2);
    }

    /* renamed from: T */
    private static void m34894T(Display display, Point point) {
        display.getRealSize(point);
    }

    /* renamed from: T0 */
    public static String[] m34895T0(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : m34891R0(str.trim(), "(\\s*,\\s*)");
    }

    /* renamed from: U */
    private static void m34896U(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    /* renamed from: U0 */
    public static long m34897U0(long j10, long j11, long j12) {
        long j13 = j10 - j11;
        return ((j10 ^ j13) & (j11 ^ j10)) < 0 ? j12 : j13;
    }

    /* renamed from: V */
    public static int m34898V(int i10) {
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

    /* renamed from: V0 */
    public static byte[] m34899V0(InputStream inputStream) {
        byte[] bArr = new byte[RecognitionOptions.AZTEC];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: W */
    public static int m34900W(String str) {
        String[] m34891R0;
        int length;
        if (str == null || (length = (m34891R0 = m34891R0(str, "_")).length) < 2) {
            return 0;
        }
        String str2 = m34891R0[length - 1];
        boolean z10 = length >= 3 && "neg".equals(m34891R0[length - 2]);
        try {
            int parseInt = Integer.parseInt((String) C11137a.m34603e(str2));
            return z10 ? -parseInt : parseInt;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: W0 */
    public static String m34901W0(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            sb2.append(Character.forDigit((bArr[i10] >> 4) & 15, 16));
            sb2.append(Character.forDigit(bArr[i10] & 15, 16));
        }
        return sb2.toString();
    }

    /* renamed from: X */
    public static String m34902X(int i10) {
        if (i10 == 0) {
            return "NO";
        }
        if (i10 == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i10 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i10 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i10 == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    /* renamed from: X0 */
    public static long m34903X0(int i10, int i11) {
        return m34905Y0(i11) | (m34905Y0(i10) << 32);
    }

    /* renamed from: Y */
    public static String m34904Y(Locale locale) {
        return f29040a >= 21 ? m34906Z(locale) : locale.toString();
    }

    /* renamed from: Y0 */
    public static long m34905Y0(int i10) {
        return i10 & KeyboardMap.kValueMask;
    }

    /* renamed from: Z */
    private static String m34906Z(Locale locale) {
        return locale.toLanguageTag();
    }

    /* renamed from: Z0 */
    public static CharSequence m34907Z0(CharSequence charSequence, int i10) {
        return charSequence.length() <= i10 ? charSequence : charSequence.subSequence(0, i10);
    }

    /* renamed from: a0 */
    public static long m34909a0(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 * f10);
    }

    /* renamed from: a1 */
    public static long m34910a1(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 / 1000;
    }

    /* renamed from: b */
    public static long m34911b(long j10, long j11, long j12) {
        long j13 = j10 + j11;
        return ((j10 ^ j13) & (j11 ^ j13)) < 0 ? j12 : j13;
    }

    /* renamed from: b0 */
    public static long m34912b0(long j10) {
        return j10 == -9223372036854775807L ? System.currentTimeMillis() : j10 + SystemClock.elapsedRealtime();
    }

    /* renamed from: b1 */
    public static void m34913b1(Parcel parcel, boolean z10) {
        parcel.writeInt(z10 ? 1 : 0);
    }

    /* renamed from: c */
    public static boolean m34914c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: c0 */
    public static int m34915c0(int i10) {
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return 2;
        }
        if (i10 != 24) {
            return i10 != 32 ? 0 : 805306368;
        }
        return 536870912;
    }

    /* renamed from: d */
    public static <T extends Comparable<? super T>> int m34916d(List<? extends Comparable<? super T>> list, T t10, boolean z10, boolean z11) {
        int i10;
        int binarySearch = Collections.binarySearch(list, t10);
        if (binarySearch < 0) {
            i10 = ~binarySearch;
        } else {
            int size = list.size();
            do {
                binarySearch++;
                if (binarySearch >= size) {
                    break;
                }
            } while (list.get(binarySearch).compareTo(t10) == 0);
            i10 = z10 ? binarySearch - 1 : binarySearch;
        }
        return z11 ? Math.min(list.size() - 1, i10) : i10;
    }

    /* renamed from: d0 */
    public static C11108u1 m34917d0(int i10, int i11, int i12) {
        return new C11108u1.b().m34552g0("audio/raw").m34529J(i11).m34553h0(i12).m34546a0(i10).m34526G();
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m34918e(long[] r3, long r4, boolean r6, boolean r7) {
        /*
            int r0 = java.util.Arrays.binarySearch(r3, r4)
            if (r0 >= 0) goto L8
            int r4 = ~r0
            goto L1a
        L8:
            int r0 = r0 + 1
            int r1 = r3.length
            if (r0 >= r1) goto L14
            r1 = r3[r0]
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L14
            goto L8
        L14:
            if (r6 == 0) goto L19
            int r4 = r0 + (-1)
            goto L1a
        L19:
            r4 = r0
        L1a:
            if (r7 == 0) goto L23
            int r3 = r3.length
            int r3 = r3 + (-1)
            int r4 = java.lang.Math.min(r3, r4)
        L23:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p363t8.C11172r0.m34918e(long[], long, boolean, boolean):int");
    }

    /* renamed from: e0 */
    public static int m34919e0(int i10, int i11) {
        if (i10 != 2) {
            if (i10 == 3) {
                return i11;
            }
            if (i10 != 4) {
                if (i10 != 268435456) {
                    if (i10 == 536870912) {
                        return i11 * 3;
                    }
                    if (i10 != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i11 * 4;
        }
        return i11 * 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T extends java.lang.Comparable<? super T>> int m34920f(java.util.List<? extends java.lang.Comparable<? super T>> r2, T r3, boolean r4, boolean r5) {
        /*
            int r0 = java.util.Collections.binarySearch(r2, r3)
            if (r0 >= 0) goto La
            int r0 = r0 + 2
            int r2 = -r0
            goto L21
        La:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L1b
            java.lang.Object r1 = r2.get(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r1 = r1.compareTo(r3)
            if (r1 != 0) goto L1b
            goto La
        L1b:
            if (r4 == 0) goto L20
            int r2 = r0 + 1
            goto L21
        L20:
            r2 = r0
        L21:
            if (r5 == 0) goto L28
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
        L28:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p363t8.C11172r0.m34920f(java.util.List, java.lang.Comparable, boolean, boolean):int");
    }

    /* renamed from: f0 */
    public static long m34921f0(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 / f10);
    }

    /* renamed from: g */
    public static int m34922g(C11175t c11175t, long j10, boolean z10, boolean z11) {
        int i10;
        int m34986c = c11175t.m34986c() - 1;
        int i11 = 0;
        while (i11 <= m34986c) {
            int i12 = (i11 + m34986c) >>> 1;
            if (c11175t.m34985b(i12) < j10) {
                i11 = i12 + 1;
            } else {
                m34986c = i12 - 1;
            }
        }
        if (z10 && (i10 = m34986c + 1) < c11175t.m34986c() && c11175t.m34985b(i10) == j10) {
            return i10;
        }
        if (z11 && m34986c == -1) {
            return 0;
        }
        return m34986c;
    }

    /* renamed from: g0 */
    public static int m34923g0(int i10) {
        if (i10 == 13) {
            return 1;
        }
        switch (i10) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m34924h(int[] r2, int r3, boolean r4, boolean r5) {
        /*
            int r0 = java.util.Arrays.binarySearch(r2, r3)
            if (r0 >= 0) goto La
            int r0 = r0 + 2
            int r2 = -r0
            goto L19
        La:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L13
            r1 = r2[r0]
            if (r1 != r3) goto L13
            goto La
        L13:
            if (r4 == 0) goto L18
            int r2 = r0 + 1
            goto L19
        L18:
            r2 = r0
        L19:
            if (r5 == 0) goto L20
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
        L20:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p363t8.C11172r0.m34924h(int[], int, boolean, boolean):int");
    }

    /* renamed from: h0 */
    public static String[] m34925h0() {
        String[] m34927i0 = m34927i0();
        for (int i10 = 0; i10 < m34927i0.length; i10++) {
            m34927i0[i10] = m34865E0(m34927i0[i10]);
        }
        return m34927i0;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m34926i(long[] r3, long r4, boolean r6, boolean r7) {
        /*
            int r0 = java.util.Arrays.binarySearch(r3, r4)
            if (r0 >= 0) goto La
            int r0 = r0 + 2
            int r3 = -r0
            goto L1b
        La:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L15
            r1 = r3[r0]
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L15
            goto La
        L15:
            if (r6 == 0) goto L1a
            int r3 = r0 + 1
            goto L1b
        L1a:
            r3 = r0
        L1b:
            if (r7 == 0) goto L22
            r4 = 0
            int r3 = java.lang.Math.max(r4, r3)
        L22:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p363t8.C11172r0.m34926i(long[], long, boolean, boolean):int");
    }

    /* renamed from: i0 */
    private static String[] m34927i0() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        return f29040a >= 24 ? m34929j0(configuration) : new String[]{m34904Y(configuration.locale)};
    }

    /* renamed from: j */
    public static <T> T m34928j(T t10) {
        return t10;
    }

    /* renamed from: j0 */
    private static String[] m34929j0(Configuration configuration) {
        return m34891R0(configuration.getLocales().toLanguageTags(), ",");
    }

    /* renamed from: k */
    public static <T> T[] m34930k(T[] tArr) {
        return tArr;
    }

    /* renamed from: k0 */
    private static String m34931k0(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e10) {
            C11173s.m34965d("Util", "Failed to read system property " + str, e10);
            return null;
        }
    }

    /* renamed from: l */
    public static int m34932l(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    /* renamed from: l0 */
    public static String m34933l0(int i10) {
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
            case 6:
                return "camera motion";
            default:
                if (i10 < 10000) {
                    return "?";
                }
                return "custom (" + i10 + ")";
        }
    }

    /* renamed from: m */
    public static long m34934m(long j10, long j11) {
        return ((j10 + j11) - 1) / j11;
    }

    /* renamed from: m0 */
    public static byte[] m34935m0(String str) {
        return str.getBytes(C7149e.f16019c);
    }

    /* renamed from: n */
    public static void m34936n(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: n0 */
    public static int m34937n0(Uri uri) {
        int m34939o0;
        String scheme = uri.getScheme();
        if (scheme != null && C7147c.m21249a("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int lastIndexOf = lastPathSegment.lastIndexOf(46);
        if (lastIndexOf >= 0 && (m34939o0 = m34939o0(lastPathSegment.substring(lastIndexOf + 1))) != 4) {
            return m34939o0;
        }
        Matcher matcher = f29049j.matcher((CharSequence) C11137a.m34603e(uri.getPath()));
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

    /* renamed from: o */
    public static int m34938o(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    /* renamed from: o0 */
    public static int m34939o0(String str) {
        String m21253e = C7147c.m21253e(str);
        m21253e.hashCode();
        char c10 = 65535;
        switch (m21253e.hashCode()) {
            case 104579:
                if (m21253e.equals("ism")) {
                    c10 = 0;
                    break;
                }
                break;
            case 108321:
                if (m21253e.equals("mpd")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3242057:
                if (m21253e.equals("isml")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3299913:
                if (m21253e.equals("m3u8")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 2:
                return 1;
            case 1:
                return 0;
            case 3:
                return 2;
            default:
                return 4;
        }
    }

    /* renamed from: p */
    public static float m34940p(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f10, f12));
    }

    /* renamed from: p0 */
    public static int m34941p0(Uri uri, String str) {
        if (str == null) {
            return m34937n0(uri);
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -979127466:
                if (str.equals("application/x-mpegURL")) {
                    c10 = 0;
                    break;
                }
                break;
            case -156749520:
                if (str.equals("application/vnd.ms-sstr+xml")) {
                    c10 = 1;
                    break;
                }
                break;
            case 64194685:
                if (str.equals("application/dash+xml")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1154777587:
                if (str.equals("application/x-rtsp")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 2;
            case 1:
                return 1;
            case 2:
                return 0;
            case 3:
                return 3;
            default:
                return 4;
        }
    }

    /* renamed from: q */
    public static int m34942q(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i10, i12));
    }

    /* renamed from: q0 */
    public static boolean m34943q0(C11146e0 c11146e0, C11146e0 c11146e02, Inflater inflater) {
        if (c11146e0.m34679a() <= 0) {
            return false;
        }
        if (c11146e02.m34680b() < c11146e0.m34679a()) {
            c11146e02.m34681c(c11146e0.m34679a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(c11146e0.m34682e(), c11146e0.m34683f(), c11146e0.m34679a());
        int i10 = 0;
        while (true) {
            try {
                i10 += inflater.inflate(c11146e02.m34682e(), i10, c11146e02.m34680b() - i10);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                    }
                    if (i10 == c11146e02.m34680b()) {
                        c11146e02.m34681c(c11146e02.m34680b() * 2);
                    }
                } else {
                    c11146e02.m34676T(i10);
                    inflater.reset();
                    return true;
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    /* renamed from: r */
    public static long m34944r(long j10, long j11, long j12) {
        return Math.max(j11, Math.min(j10, j12));
    }

    /* renamed from: r0 */
    public static String m34945r0(int i10) {
        return Integer.toString(i10, 36);
    }

    /* renamed from: s */
    public static boolean m34946s(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (m34914c(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: s0 */
    public static boolean m34947s0(Context context) {
        return f29040a >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    /* renamed from: t */
    public static int m34948t(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = f29053n[((i12 >>> 24) ^ (bArr[i10] & 255)) & 255] ^ (i12 << 8);
            i10++;
        }
        return i12;
    }

    /* renamed from: t0 */
    public static boolean m34949t0(int i10) {
        return i10 == 536870912 || i10 == 805306368 || i10 == 4;
    }

    /* renamed from: u */
    public static int m34950u(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = f29054o[i12 ^ (bArr[i10] & 255)];
            i10++;
        }
        return i12;
    }

    /* renamed from: u0 */
    public static boolean m34951u0(int i10) {
        return i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 536870912 || i10 == 805306368 || i10 == 4;
    }

    /* renamed from: v */
    public static Handler m34952v(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    /* renamed from: v0 */
    public static boolean m34953v0(int i10) {
        return i10 == 10 || i10 == 13;
    }

    /* renamed from: w */
    public static Handler m34954w() {
        return m34956x(null);
    }

    /* renamed from: w0 */
    public static boolean m34955w0(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || io.flutter.plugins.firebase.crashlytics.Constants.FILE.equals(scheme);
    }

    /* renamed from: x */
    public static Handler m34956x(Handler.Callback callback) {
        return m34952v((Looper) C11137a.m34607i(Looper.myLooper()), callback);
    }

    /* renamed from: x0 */
    public static boolean m34957x0(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    /* renamed from: y */
    public static Handler m34958y() {
        return m34960z(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y0 */
    public static /* synthetic */ Thread m34959y0(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    /* renamed from: z */
    public static Handler m34960z(Handler.Callback callback) {
        return m34952v(m34888Q(), callback);
    }

    /* renamed from: z0 */
    public static int m34961z0(int[] iArr, int i10) {
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (iArr[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }
}

package p363t8;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p082eb.C7147c;

/* renamed from: t8.w */
/* loaded from: classes.dex */
public final class C11178w {

    /* renamed from: a */
    private static final ArrayList<a> f29062a = new ArrayList<>();

    /* renamed from: b */
    private static final Pattern f29063b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t8.w$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final String f29064a;

        /* renamed from: b */
        public final String f29065b;

        /* renamed from: c */
        public final int f29066c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t8.w$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final int f29067a;

        /* renamed from: b */
        public final int f29068b;

        public b(int i10, int i11) {
            this.f29067a = i10;
            this.f29068b = i11;
        }

        /* renamed from: a */
        public int m35013a() {
            int i10 = this.f29068b;
            if (i10 == 2) {
                return 10;
            }
            if (i10 == 5) {
                return 11;
            }
            if (i10 == 29) {
                return 12;
            }
            if (i10 == 42) {
                return 16;
            }
            if (i10 != 22) {
                return i10 != 23 ? 0 : 15;
            }
            return 1073741824;
        }
    }

    /* renamed from: a */
    public static boolean m34993a(String str, String str2) {
        b m35001i;
        int m35013a;
        if (str == null) {
            return false;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c10 = 0;
                    break;
                }
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c10 = 1;
                    break;
                }
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c10 = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c10 = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c10 = 4;
                    break;
                }
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c10 = '\n';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
                return true;
            case 3:
                return (str2 == null || (m35001i = m35001i(str2)) == null || (m35013a = m35001i.m35013a()) == 0 || m35013a == 16) ? false : true;
            default:
                return false;
        }
    }

    /* renamed from: b */
    public static boolean m34994b(String str, String str2) {
        return m34996d(str, str2) != null;
    }

    /* renamed from: c */
    public static String m34995c(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : C11172r0.m34895T0(str)) {
            String m34999g = m34999g(str2);
            if (m34999g != null && m35007o(m34999g)) {
                return m34999g;
            }
        }
        return null;
    }

    /* renamed from: d */
    public static String m34996d(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] m34895T0 = C11172r0.m34895T0(str);
        StringBuilder sb2 = new StringBuilder();
        for (String str3 : m34895T0) {
            if (str2.equals(m34999g(str3))) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str3);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    /* renamed from: e */
    private static String m34997e(String str) {
        int size = f29062a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = f29062a.get(i10);
            if (str.startsWith(aVar.f29065b)) {
                return aVar.f29064a;
            }
        }
        return null;
    }

    /* renamed from: f */
    public static int m34998f(String str, String str2) {
        b m35001i;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c10 = 1;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c10 = 2;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c10 = 3;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c10 = '\t';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 18;
            case 1:
                return 7;
            case 2:
                if (str2 == null || (m35001i = m35001i(str2)) == null) {
                    return 0;
                }
                return m35001i.m35013a();
            case 3:
                return 5;
            case 4:
                return 17;
            case 5:
                return 6;
            case 6:
                return 9;
            case 7:
                return 20;
            case '\b':
                return 8;
            case '\t':
                return 14;
            default:
                return 0;
        }
    }

    /* renamed from: g */
    public static String m34999g(String str) {
        b m35001i;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String m21253e = C7147c.m21253e(str.trim());
        if (m21253e.startsWith("avc1") || m21253e.startsWith("avc3")) {
            return "video/avc";
        }
        if (m21253e.startsWith("hev1") || m21253e.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (m21253e.startsWith("dvav") || m21253e.startsWith("dva1") || m21253e.startsWith("dvhe") || m21253e.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (m21253e.startsWith("av01")) {
            return "video/av01";
        }
        if (m21253e.startsWith("vp9") || m21253e.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (m21253e.startsWith("vp8") || m21253e.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (!m21253e.startsWith("mp4a")) {
            return m21253e.startsWith("mha1") ? "audio/mha1" : m21253e.startsWith("mhm1") ? "audio/mhm1" : (m21253e.startsWith("ac-3") || m21253e.startsWith("dac3")) ? "audio/ac3" : (m21253e.startsWith("ec-3") || m21253e.startsWith("dec3")) ? "audio/eac3" : m21253e.startsWith("ec+3") ? "audio/eac3-joc" : (m21253e.startsWith("ac-4") || m21253e.startsWith("dac4")) ? "audio/ac4" : m21253e.startsWith("dtsc") ? "audio/vnd.dts" : m21253e.startsWith("dtse") ? "audio/vnd.dts.hd;profile=lbr" : (m21253e.startsWith("dtsh") || m21253e.startsWith("dtsl")) ? "audio/vnd.dts.hd" : m21253e.startsWith("dtsx") ? "audio/vnd.dts.uhd;profile=p2" : m21253e.startsWith("opus") ? "audio/opus" : m21253e.startsWith("vorbis") ? "audio/vorbis" : m21253e.startsWith("flac") ? "audio/flac" : m21253e.startsWith("stpp") ? "application/ttml+xml" : m21253e.startsWith("wvtt") ? "text/vtt" : m21253e.contains("cea708") ? "application/cea-708" : (m21253e.contains("eia608") || m21253e.contains("cea608")) ? "application/cea-608" : m34997e(m21253e);
        }
        if (m21253e.startsWith("mp4a.") && (m35001i = m35001i(m21253e)) != null) {
            str2 = m35000h(m35001i.f29067a);
        }
        return str2 == null ? "audio/mp4a-latm" : str2;
    }

    /* renamed from: h */
    public static String m35000h(int i10) {
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

    /* renamed from: i */
    static b m35001i(String str) {
        Matcher matcher = f29063b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) C11137a.m34603e(matcher.group(1));
        String group = matcher.group(2);
        try {
            return new b(Integer.parseInt(str2, 16), group != null ? Integer.parseInt(group) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: j */
    private static String m35002j(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    /* renamed from: k */
    public static int m35003k(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m35007o(str)) {
            return 1;
        }
        if (m35011s(str)) {
            return 2;
        }
        if (m35010r(str)) {
            return 3;
        }
        if (m35008p(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        return m35004l(str);
    }

    /* renamed from: l */
    private static int m35004l(String str) {
        int size = f29062a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = f29062a.get(i10);
            if (str.equals(aVar.f29064a)) {
                return aVar.f29066c;
            }
        }
        return -1;
    }

    /* renamed from: m */
    public static int m35005m(String str) {
        return m35003k(m34999g(str));
    }

    /* renamed from: n */
    public static String m35006n(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : C11172r0.m34895T0(str)) {
            String m34999g = m34999g(str2);
            if (m34999g != null && m35011s(m34999g)) {
                return m34999g;
            }
        }
        return null;
    }

    /* renamed from: o */
    public static boolean m35007o(String str) {
        return "audio".equals(m35002j(str));
    }

    /* renamed from: p */
    public static boolean m35008p(String str) {
        return "image".equals(m35002j(str));
    }

    /* renamed from: q */
    public static boolean m35009q(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska");
    }

    /* renamed from: r */
    public static boolean m35010r(String str) {
        return "text".equals(m35002j(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    /* renamed from: s */
    public static boolean m35011s(String str) {
        return "video".equals(m35002j(str));
    }

    /* renamed from: t */
    public static String m35012t(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1007807498:
                if (str.equals("audio/x-flac")) {
                    c10 = 0;
                    break;
                }
                break;
            case -586683234:
                if (str.equals("audio/x-wav")) {
                    c10 = 1;
                    break;
                }
                break;
            case 187090231:
                if (str.equals("audio/mp3")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return "audio/flac";
            case 1:
                return "audio/wav";
            case 2:
                return "audio/mpeg";
            default:
                return str;
        }
    }
}

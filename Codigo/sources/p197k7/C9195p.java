package p197k7;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.List;
import p361t6.C11108u1;
import p363t8.C11137a;
import p363t8.C11172r0;
import p363t8.C11173s;
import p363t8.C11178w;
import p414w6.C12084i;

/* renamed from: k7.p */
/* loaded from: classes.dex */
public final class C9195p {

    /* renamed from: a */
    public final String f22241a;

    /* renamed from: b */
    public final String f22242b;

    /* renamed from: c */
    public final String f22243c;

    /* renamed from: d */
    public final MediaCodecInfo.CodecCapabilities f22244d;

    /* renamed from: e */
    public final boolean f22245e;

    /* renamed from: f */
    public final boolean f22246f;

    /* renamed from: g */
    public final boolean f22247g;

    /* renamed from: h */
    public final boolean f22248h;

    /* renamed from: i */
    public final boolean f22249i;

    /* renamed from: j */
    public final boolean f22250j;

    /* renamed from: k */
    private final boolean f22251k;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k7.p$a */
    /* loaded from: classes.dex */
    public static final class a {
        /* renamed from: a */
        public static int m27296a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
            List supportedPerformancePoints;
            boolean covers;
            supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty() || C9195p.m27270a()) {
                return 0;
            }
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i10, i11, (int) d10);
            for (int i12 = 0; i12 < supportedPerformancePoints.size(); i12++) {
                covers = ((MediaCodecInfo.VideoCapabilities.PerformancePoint) supportedPerformancePoints.get(i12)).covers(performancePoint);
                if (covers) {
                    return 2;
                }
            }
            return 1;
        }
    }

    C9195p(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f22241a = (String) C11137a.m34603e(str);
        this.f22242b = str2;
        this.f22243c = str3;
        this.f22244d = codecCapabilities;
        this.f22248h = z10;
        this.f22249i = z11;
        this.f22250j = z12;
        this.f22245e = z13;
        this.f22246f = z14;
        this.f22247g = z15;
        this.f22251k = C11178w.m35011s(str2);
    }

    /* renamed from: A */
    private static boolean m27264A(String str) {
        return C11172r0.f29043d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    /* renamed from: B */
    private static boolean m27265B(String str) {
        if (C11172r0.f29040a <= 22) {
            String str2 = C11172r0.f29043d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: C */
    private static boolean m27266C() {
        String str = C11172r0.f29041b;
        if (!str.equals("sabrina") && !str.equals("boreal")) {
            String str2 = C11172r0.f29043d;
            if (!str2.startsWith("Lenovo TB-X605") && !str2.startsWith("Lenovo TB-X606") && !str2.startsWith("Lenovo TB-X616")) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: D */
    private static boolean m27267D(String str, int i10) {
        if ("video/hevc".equals(str) && 2 == i10) {
            String str2 = C11172r0.f29041b;
            if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: E */
    private static boolean m27268E(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(C11172r0.f29041b)) ? false : true;
    }

    /* renamed from: F */
    public static C9195p m27269F(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return new C9195p(str, str2, str3, codecCapabilities, z10, z11, z12, (z13 || codecCapabilities == null || !m27275i(codecCapabilities) || m27265B(str)) ? false : true, codecCapabilities != null && m27281u(codecCapabilities), z14 || (codecCapabilities != null && m27279s(codecCapabilities)));
    }

    /* renamed from: a */
    static /* synthetic */ boolean m27270a() {
        return m27266C();
    }

    /* renamed from: b */
    private static int m27271b(String str, String str2, int i10) {
        if (i10 > 1 || ((C11172r0.f29040a >= 26 && i10 > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i10;
        }
        int i11 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
        C11173s.m34970i("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i10 + " to " + i11 + "]");
        return i11;
    }

    /* renamed from: d */
    private static Point m27272d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(C11172r0.m34932l(i10, widthAlignment) * widthAlignment, C11172r0.m34932l(i11, heightAlignment) * heightAlignment);
    }

    /* renamed from: e */
    private static boolean m27273e(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point m27272d = m27272d(videoCapabilities, i10, i11);
        int i12 = m27272d.x;
        int i13 = m27272d.y;
        return (d10 == -1.0d || d10 < 1.0d) ? videoCapabilities.isSizeSupported(i12, i13) : videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
    }

    /* renamed from: g */
    private static MediaCodecInfo.CodecProfileLevel[] m27274g(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int intValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
        int i10 = intValue >= 180000000 ? RecognitionOptions.UPC_E : intValue >= 120000000 ? RecognitionOptions.UPC_A : intValue >= 60000000 ? RecognitionOptions.QR_CODE : intValue >= 30000000 ? RecognitionOptions.ITF : intValue >= 18000000 ? 64 : intValue >= 12000000 ? 32 : intValue >= 7200000 ? 16 : intValue >= 3600000 ? 8 : intValue >= 1800000 ? 4 : intValue >= 800000 ? 2 : 1;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i10;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    /* renamed from: i */
    private static boolean m27275i(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C11172r0.f29040a >= 19 && m27276j(codecCapabilities);
    }

    /* renamed from: j */
    private static boolean m27276j(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    /* renamed from: m */
    private boolean m27277m(C11108u1 c11108u1, boolean z10) {
        Pair<Integer, Integer> m27189q = C9180c0.m27189q(c11108u1);
        if (m27189q == null) {
            return true;
        }
        int intValue = ((Integer) m27189q.first).intValue();
        int intValue2 = ((Integer) m27189q.second).intValue();
        if ("video/dolby-vision".equals(c11108u1.f28797w)) {
            if (!"video/avc".equals(this.f22242b)) {
                intValue = "video/hevc".equals(this.f22242b) ? 2 : 8;
            }
            intValue2 = 0;
        }
        if (!this.f22251k && intValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] m27288h = m27288h();
        if (C11172r0.f29040a <= 23 && "video/x-vnd.on2.vp9".equals(this.f22242b) && m27288h.length == 0) {
            m27288h = m27274g(this.f22244d);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : m27288h) {
            if (codecProfileLevel.profile == intValue && ((codecProfileLevel.level >= intValue2 || !z10) && !m27267D(this.f22242b, intValue))) {
                return true;
            }
        }
        m27284y("codec.profileLevel, " + c11108u1.f28794t + ", " + this.f22243c);
        return false;
    }

    /* renamed from: q */
    private boolean m27278q(C11108u1 c11108u1) {
        return this.f22242b.equals(c11108u1.f28797w) || this.f22242b.equals(C9180c0.m27185m(c11108u1));
    }

    /* renamed from: s */
    private static boolean m27279s(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C11172r0.f29040a >= 21 && m27280t(codecCapabilities);
    }

    /* renamed from: t */
    private static boolean m27280t(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    /* renamed from: u */
    private static boolean m27281u(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C11172r0.f29040a >= 21 && m27282v(codecCapabilities);
    }

    /* renamed from: v */
    private static boolean m27282v(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    /* renamed from: x */
    private void m27283x(String str) {
        C11173s.m34963b("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f22241a + ", " + this.f22242b + "] [" + C11172r0.f29044e + "]");
    }

    /* renamed from: y */
    private void m27284y(String str) {
        C11173s.m34963b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f22241a + ", " + this.f22242b + "] [" + C11172r0.f29044e + "]");
    }

    /* renamed from: z */
    private static boolean m27285z(String str) {
        return "audio/opus".equals(str);
    }

    /* renamed from: c */
    public Point m27286c(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f22244d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return m27272d(videoCapabilities, i10, i11);
    }

    /* renamed from: f */
    public C12084i m27287f(C11108u1 c11108u1, C11108u1 c11108u12) {
        int i10 = !C11172r0.m34914c(c11108u1.f28797w, c11108u12.f28797w) ? 8 : 0;
        if (this.f22251k) {
            if (c11108u1.f28771E != c11108u12.f28771E) {
                i10 |= RecognitionOptions.UPC_E;
            }
            if (!this.f22245e && (c11108u1.f28768B != c11108u12.f28768B || c11108u1.f28769C != c11108u12.f28769C)) {
                i10 |= RecognitionOptions.UPC_A;
            }
            if (!C11172r0.m34914c(c11108u1.f28775I, c11108u12.f28775I)) {
                i10 |= RecognitionOptions.PDF417;
            }
            if (m27264A(this.f22241a) && !c11108u1.m34491h(c11108u12)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new C12084i(this.f22241a, c11108u1, c11108u12, c11108u1.m34491h(c11108u12) ? 3 : 2, 0);
            }
        } else {
            if (c11108u1.f28776J != c11108u12.f28776J) {
                i10 |= RecognitionOptions.AZTEC;
            }
            if (c11108u1.f28777K != c11108u12.f28777K) {
                i10 |= 8192;
            }
            if (c11108u1.f28778L != c11108u12.f28778L) {
                i10 |= 16384;
            }
            if (i10 == 0 && "audio/mp4a-latm".equals(this.f22242b)) {
                Pair<Integer, Integer> m27189q = C9180c0.m27189q(c11108u1);
                Pair<Integer, Integer> m27189q2 = C9180c0.m27189q(c11108u12);
                if (m27189q != null && m27189q2 != null) {
                    int intValue = ((Integer) m27189q.first).intValue();
                    int intValue2 = ((Integer) m27189q2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new C12084i(this.f22241a, c11108u1, c11108u12, 3, 0);
                    }
                }
            }
            if (!c11108u1.m34491h(c11108u12)) {
                i10 |= 32;
            }
            if (m27285z(this.f22242b)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new C12084i(this.f22241a, c11108u1, c11108u12, 1, 0);
            }
        }
        return new C12084i(this.f22241a, c11108u1, c11108u12, 0, i10);
    }

    /* renamed from: h */
    public MediaCodecInfo.CodecProfileLevel[] m27288h() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f22244d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    /* renamed from: k */
    public boolean m27289k(int i10) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f22244d;
        if (codecCapabilities == null) {
            str = "channelCount.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                str = "channelCount.aCaps";
            } else {
                if (m27271b(this.f22241a, this.f22242b, audioCapabilities.getMaxInputChannelCount()) >= i10) {
                    return true;
                }
                str = "channelCount.support, " + i10;
            }
        }
        m27284y(str);
        return false;
    }

    /* renamed from: l */
    public boolean m27290l(int i10) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f22244d;
        if (codecCapabilities == null) {
            str = "sampleRate.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                str = "sampleRate.aCaps";
            } else {
                if (audioCapabilities.isSampleRateSupported(i10)) {
                    return true;
                }
                str = "sampleRate.support, " + i10;
            }
        }
        m27284y(str);
        return false;
    }

    /* renamed from: n */
    public boolean m27291n(C11108u1 c11108u1) {
        return m27278q(c11108u1) && m27277m(c11108u1, false);
    }

    /* renamed from: o */
    public boolean m27292o(C11108u1 c11108u1) {
        int i10;
        if (!m27278q(c11108u1) || !m27277m(c11108u1, true)) {
            return false;
        }
        if (!this.f22251k) {
            if (C11172r0.f29040a >= 21) {
                int i11 = c11108u1.f28777K;
                if (i11 != -1 && !m27290l(i11)) {
                    return false;
                }
                int i12 = c11108u1.f28776J;
                if (i12 != -1 && !m27289k(i12)) {
                    return false;
                }
            }
            return true;
        }
        int i13 = c11108u1.f28768B;
        if (i13 <= 0 || (i10 = c11108u1.f28769C) <= 0) {
            return true;
        }
        if (C11172r0.f29040a >= 21) {
            return m27295w(i13, i10, c11108u1.f28770D);
        }
        boolean z10 = i13 * i10 <= C9180c0.m27168N();
        if (!z10) {
            m27284y("legacyFrameSize, " + c11108u1.f28768B + "x" + c11108u1.f28769C);
        }
        return z10;
    }

    /* renamed from: p */
    public boolean m27293p() {
        if (C11172r0.f29040a >= 29 && "video/x-vnd.on2.vp9".equals(this.f22242b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : m27288h()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: r */
    public boolean m27294r(C11108u1 c11108u1) {
        if (this.f22251k) {
            return this.f22245e;
        }
        Pair<Integer, Integer> m27189q = C9180c0.m27189q(c11108u1);
        return m27189q != null && ((Integer) m27189q.first).intValue() == 42;
    }

    public String toString() {
        return this.f22241a;
    }

    /* renamed from: w */
    public boolean m27295w(int i10, int i11, double d10) {
        StringBuilder sb2;
        String str;
        String sb3;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f22244d;
        if (codecCapabilities == null) {
            sb3 = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities != null) {
                if (C11172r0.f29040a >= 29) {
                    int m27296a = a.m27296a(videoCapabilities, i10, i11, d10);
                    if (m27296a == 2) {
                        return true;
                    }
                    if (m27296a == 1) {
                        sb2 = new StringBuilder();
                        str = "sizeAndRate.cover, ";
                        sb2.append(str);
                        sb2.append(i10);
                        sb2.append("x");
                        sb2.append(i11);
                        sb2.append("@");
                        sb2.append(d10);
                        sb3 = sb2.toString();
                    }
                }
                if (!m27273e(videoCapabilities, i10, i11, d10)) {
                    if (i10 < i11 && m27268E(this.f22241a) && m27273e(videoCapabilities, i11, i10, d10)) {
                        m27283x("sizeAndRate.rotated, " + i10 + "x" + i11 + "@" + d10);
                    } else {
                        sb2 = new StringBuilder();
                        str = "sizeAndRate.support, ";
                        sb2.append(str);
                        sb2.append(i10);
                        sb2.append("x");
                        sb2.append(i11);
                        sb2.append("@");
                        sb2.append(d10);
                        sb3 = sb2.toString();
                    }
                }
                return true;
            }
            sb3 = "sizeAndRate.vCaps";
        }
        m27284y(sb3);
        return false;
    }
}

package k7;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.List;
import t6.u1;
import t8.r0;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f20459a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20460b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20461c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f20462d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f20463e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f20464f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f20465g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f20466h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f20467i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f20468j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f20469k;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {
        public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
            List supportedPerformancePoints;
            boolean covers;
            supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty() || p.a()) {
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

    p(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f20459a = (String) t8.a.e(str);
        this.f20460b = str2;
        this.f20461c = str3;
        this.f20462d = codecCapabilities;
        this.f20466h = z10;
        this.f20467i = z11;
        this.f20468j = z12;
        this.f20463e = z13;
        this.f20464f = z14;
        this.f20465g = z15;
        this.f20469k = t8.w.s(str2);
    }

    private static boolean A(String str) {
        return r0.f26747d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static boolean B(String str) {
        if (r0.f26744a <= 22) {
            String str2 = r0.f26747d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    private static boolean C() {
        String str = r0.f26745b;
        if (!str.equals("sabrina") && !str.equals("boreal")) {
            String str2 = r0.f26747d;
            if (!str2.startsWith("Lenovo TB-X605") && !str2.startsWith("Lenovo TB-X606") && !str2.startsWith("Lenovo TB-X616")) {
                return false;
            }
        }
        return true;
    }

    private static boolean D(String str, int i10) {
        if ("video/hevc".equals(str) && 2 == i10) {
            String str2 = r0.f26745b;
            if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean E(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(r0.f26745b)) ? false : true;
    }

    public static p F(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return new p(str, str2, str3, codecCapabilities, z10, z11, z12, (z13 || codecCapabilities == null || !i(codecCapabilities) || B(str)) ? false : true, codecCapabilities != null && u(codecCapabilities), z14 || (codecCapabilities != null && s(codecCapabilities)));
    }

    static /* synthetic */ boolean a() {
        return C();
    }

    private static int b(String str, String str2, int i10) {
        if (i10 > 1 || ((r0.f26744a >= 26 && i10 > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i10;
        }
        int i11 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
        t8.s.i("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i10 + " to " + i11 + "]");
        return i11;
    }

    private static Point d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(r0.l(i10, widthAlignment) * widthAlignment, r0.l(i11, heightAlignment) * heightAlignment);
    }

    private static boolean e(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point d11 = d(videoCapabilities, i10, i11);
        int i12 = d11.x;
        int i13 = d11.y;
        return (d10 == -1.0d || d10 < 1.0d) ? videoCapabilities.isSizeSupported(i12, i13) : videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
    }

    private static MediaCodecInfo.CodecProfileLevel[] g(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int intValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
        int i10 = intValue >= 180000000 ? RecognitionOptions.UPC_E : intValue >= 120000000 ? RecognitionOptions.UPC_A : intValue >= 60000000 ? RecognitionOptions.QR_CODE : intValue >= 30000000 ? RecognitionOptions.ITF : intValue >= 18000000 ? 64 : intValue >= 12000000 ? 32 : intValue >= 7200000 ? 16 : intValue >= 3600000 ? 8 : intValue >= 1800000 ? 4 : intValue >= 800000 ? 2 : 1;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i10;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    private static boolean i(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return r0.f26744a >= 19 && j(codecCapabilities);
    }

    private static boolean j(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private boolean m(u1 u1Var, boolean z10) {
        Pair<Integer, Integer> q10 = c0.q(u1Var);
        if (q10 == null) {
            return true;
        }
        int intValue = ((Integer) q10.first).intValue();
        int intValue2 = ((Integer) q10.second).intValue();
        if ("video/dolby-vision".equals(u1Var.f26517w)) {
            if (!"video/avc".equals(this.f20460b)) {
                intValue = "video/hevc".equals(this.f20460b) ? 2 : 8;
            }
            intValue2 = 0;
        }
        if (!this.f20469k && intValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] h10 = h();
        if (r0.f26744a <= 23 && "video/x-vnd.on2.vp9".equals(this.f20460b) && h10.length == 0) {
            h10 = g(this.f20462d);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : h10) {
            if (codecProfileLevel.profile == intValue && ((codecProfileLevel.level >= intValue2 || !z10) && !D(this.f20460b, intValue))) {
                return true;
            }
        }
        y("codec.profileLevel, " + u1Var.f26514t + ", " + this.f20461c);
        return false;
    }

    private boolean q(u1 u1Var) {
        return this.f20460b.equals(u1Var.f26517w) || this.f20460b.equals(c0.m(u1Var));
    }

    private static boolean s(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return r0.f26744a >= 21 && t(codecCapabilities);
    }

    private static boolean t(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean u(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return r0.f26744a >= 21 && v(codecCapabilities);
    }

    private static boolean v(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private void x(String str) {
        t8.s.b("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f20459a + ", " + this.f20460b + "] [" + r0.f26748e + "]");
    }

    private void y(String str) {
        t8.s.b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f20459a + ", " + this.f20460b + "] [" + r0.f26748e + "]");
    }

    private static boolean z(String str) {
        return "audio/opus".equals(str);
    }

    public Point c(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f20462d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return d(videoCapabilities, i10, i11);
    }

    public w6.i f(u1 u1Var, u1 u1Var2) {
        int i10 = !r0.c(u1Var.f26517w, u1Var2.f26517w) ? 8 : 0;
        if (this.f20469k) {
            if (u1Var.E != u1Var2.E) {
                i10 |= RecognitionOptions.UPC_E;
            }
            if (!this.f20463e && (u1Var.B != u1Var2.B || u1Var.C != u1Var2.C)) {
                i10 |= RecognitionOptions.UPC_A;
            }
            if (!r0.c(u1Var.I, u1Var2.I)) {
                i10 |= RecognitionOptions.PDF417;
            }
            if (A(this.f20459a) && !u1Var.h(u1Var2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new w6.i(this.f20459a, u1Var, u1Var2, u1Var.h(u1Var2) ? 3 : 2, 0);
            }
        } else {
            if (u1Var.J != u1Var2.J) {
                i10 |= RecognitionOptions.AZTEC;
            }
            if (u1Var.K != u1Var2.K) {
                i10 |= 8192;
            }
            if (u1Var.L != u1Var2.L) {
                i10 |= 16384;
            }
            if (i10 == 0 && "audio/mp4a-latm".equals(this.f20460b)) {
                Pair<Integer, Integer> q10 = c0.q(u1Var);
                Pair<Integer, Integer> q11 = c0.q(u1Var2);
                if (q10 != null && q11 != null) {
                    int intValue = ((Integer) q10.first).intValue();
                    int intValue2 = ((Integer) q11.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new w6.i(this.f20459a, u1Var, u1Var2, 3, 0);
                    }
                }
            }
            if (!u1Var.h(u1Var2)) {
                i10 |= 32;
            }
            if (z(this.f20460b)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new w6.i(this.f20459a, u1Var, u1Var2, 1, 0);
            }
        }
        return new w6.i(this.f20459a, u1Var, u1Var2, 0, i10);
    }

    public MediaCodecInfo.CodecProfileLevel[] h() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f20462d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean k(int i10) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f20462d;
        if (codecCapabilities == null) {
            str = "channelCount.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                str = "channelCount.aCaps";
            } else {
                if (b(this.f20459a, this.f20460b, audioCapabilities.getMaxInputChannelCount()) >= i10) {
                    return true;
                }
                str = "channelCount.support, " + i10;
            }
        }
        y(str);
        return false;
    }

    public boolean l(int i10) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f20462d;
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
        y(str);
        return false;
    }

    public boolean n(u1 u1Var) {
        return q(u1Var) && m(u1Var, false);
    }

    public boolean o(u1 u1Var) {
        int i10;
        if (!q(u1Var) || !m(u1Var, true)) {
            return false;
        }
        if (!this.f20469k) {
            if (r0.f26744a >= 21) {
                int i11 = u1Var.K;
                if (i11 != -1 && !l(i11)) {
                    return false;
                }
                int i12 = u1Var.J;
                if (i12 != -1 && !k(i12)) {
                    return false;
                }
            }
            return true;
        }
        int i13 = u1Var.B;
        if (i13 <= 0 || (i10 = u1Var.C) <= 0) {
            return true;
        }
        if (r0.f26744a >= 21) {
            return w(i13, i10, u1Var.D);
        }
        boolean z10 = i13 * i10 <= c0.N();
        if (!z10) {
            y("legacyFrameSize, " + u1Var.B + "x" + u1Var.C);
        }
        return z10;
    }

    public boolean p() {
        if (r0.f26744a >= 29 && "video/x-vnd.on2.vp9".equals(this.f20460b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : h()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean r(u1 u1Var) {
        if (this.f20469k) {
            return this.f20463e;
        }
        Pair<Integer, Integer> q10 = c0.q(u1Var);
        return q10 != null && ((Integer) q10.first).intValue() == 42;
    }

    public String toString() {
        return this.f20459a;
    }

    public boolean w(int i10, int i11, double d10) {
        StringBuilder sb2;
        String str;
        String sb3;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f20462d;
        if (codecCapabilities == null) {
            sb3 = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities != null) {
                if (r0.f26744a >= 29) {
                    int a10 = a.a(videoCapabilities, i10, i11, d10);
                    if (a10 == 2) {
                        return true;
                    }
                    if (a10 == 1) {
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
                if (!e(videoCapabilities, i10, i11, d10)) {
                    if (i10 < i11 && E(this.f20459a) && e(videoCapabilities, i11, i10, d10)) {
                        x("sizeAndRate.rotated, " + i10 + "x" + i11 + "@" + d10);
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
        y(sb3);
        return false;
    }
}

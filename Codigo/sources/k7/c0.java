package k7;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k7.c0;
import t6.u1;
import t8.r0;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a */
    private static final Pattern f20395a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b */
    private static final HashMap<b, List<p>> f20396b = new HashMap<>();

    /* renamed from: c */
    private static int f20397c = -1;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final String f20398a;

        /* renamed from: b */
        public final boolean f20399b;

        /* renamed from: c */
        public final boolean f20400c;

        public b(String str, boolean z10, boolean z11) {
            this.f20398a = str;
            this.f20399b = z10;
            this.f20400c = z11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != b.class) {
                return false;
            }
            b bVar = (b) obj;
            return TextUtils.equals(this.f20398a, bVar.f20398a) && this.f20399b == bVar.f20399b && this.f20400c == bVar.f20400c;
        }

        public int hashCode() {
            return ((((this.f20398a.hashCode() + 31) * 31) + (this.f20399b ? 1231 : 1237)) * 31) + (this.f20400c ? 1231 : 1237);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends Exception {
        private c(Throwable th2) {
            super("Failed to query underlying media codecs", th2);
        }

        /* synthetic */ c(Throwable th2, a aVar) {
            this(th2);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        MediaCodecInfo a(int i10);

        boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int d();

        boolean e();
    }

    /* loaded from: classes.dex */
    public static final class e implements d {
        private e() {
        }

        /* synthetic */ e(a aVar) {
            this();
        }

        @Override // k7.c0.d
        public MediaCodecInfo a(int i10) {
            return MediaCodecList.getCodecInfoAt(i10);
        }

        @Override // k7.c0.d
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // k7.c0.d
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // k7.c0.d
        public int d() {
            return MediaCodecList.getCodecCount();
        }

        @Override // k7.c0.d
        public boolean e() {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements d {

        /* renamed from: a */
        private final int f20401a;

        /* renamed from: b */
        private MediaCodecInfo[] f20402b;

        public f(boolean z10, boolean z11) {
            this.f20401a = (z10 || z11) ? 1 : 0;
        }

        private void f() {
            if (this.f20402b == null) {
                this.f20402b = new MediaCodecList(this.f20401a).getCodecInfos();
            }
        }

        @Override // k7.c0.d
        public MediaCodecInfo a(int i10) {
            f();
            return this.f20402b[i10];
        }

        @Override // k7.c0.d
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // k7.c0.d
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // k7.c0.d
        public int d() {
            f();
            return this.f20402b.length;
        }

        @Override // k7.c0.d
        public boolean e() {
            return true;
        }
    }

    /* loaded from: classes.dex */
    public interface g<T> {
        int a(T t10);
    }

    private static boolean A(MediaCodecInfo mediaCodecInfo) {
        return r0.f26744a >= 29 && B(mediaCodecInfo);
    }

    private static boolean B(MediaCodecInfo mediaCodecInfo) {
        boolean isAlias;
        isAlias = mediaCodecInfo.isAlias();
        return isAlias;
    }

    private static boolean C(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z10 && str.endsWith(".secure"))) {
            return false;
        }
        int i10 = r0.f26744a;
        if (i10 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i10 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = r0.f26745b;
            if ("a70".equals(str3) || ("Xiaomi".equals(r0.f26746c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = r0.f26745b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = r0.f26745b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(r0.f26746c))) {
            String str6 = r0.f26745b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i10 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(r0.f26746c)) {
            String str7 = r0.f26745b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i10 <= 19 && r0.f26745b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (i10 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    private static boolean D(MediaCodecInfo mediaCodecInfo, String str) {
        return r0.f26744a >= 29 ? E(mediaCodecInfo) : !F(mediaCodecInfo, str);
    }

    private static boolean E(MediaCodecInfo mediaCodecInfo) {
        boolean isHardwareAccelerated;
        isHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
        return isHardwareAccelerated;
    }

    private static boolean F(MediaCodecInfo mediaCodecInfo, String str) {
        if (r0.f26744a >= 29) {
            return G(mediaCodecInfo);
        }
        if (t8.w.o(str)) {
            return true;
        }
        String e10 = eb.c.e(mediaCodecInfo.getName());
        if (e10.startsWith("arc.")) {
            return false;
        }
        if (e10.startsWith("omx.google.") || e10.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((e10.startsWith("omx.sec.") && e10.contains(".sw.")) || e10.equals("omx.qcom.video.decoder.hevcswvdec") || e10.startsWith("c2.android.") || e10.startsWith("c2.google.")) {
            return true;
        }
        return (e10.startsWith("omx.") || e10.startsWith("c2.")) ? false : true;
    }

    private static boolean G(MediaCodecInfo mediaCodecInfo) {
        boolean isSoftwareOnly;
        isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
        return isSoftwareOnly;
    }

    private static boolean H(MediaCodecInfo mediaCodecInfo) {
        if (r0.f26744a >= 29) {
            return I(mediaCodecInfo);
        }
        String e10 = eb.c.e(mediaCodecInfo.getName());
        return (e10.startsWith("omx.google.") || e10.startsWith("c2.android.") || e10.startsWith("c2.google.")) ? false : true;
    }

    private static boolean I(MediaCodecInfo mediaCodecInfo) {
        boolean isVendor;
        isVendor = mediaCodecInfo.isVendor();
        return isVendor;
    }

    public static /* synthetic */ int J(p pVar) {
        String str = pVar.f20459a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (r0.f26744a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    public static /* synthetic */ int K(p pVar) {
        return pVar.f20459a.startsWith("OMX.google") ? 1 : 0;
    }

    public static /* synthetic */ int L(u1 u1Var, p pVar) {
        return pVar.n(u1Var) ? 1 : 0;
    }

    public static /* synthetic */ int M(g gVar, Object obj, Object obj2) {
        return gVar.a(obj2) - gVar.a(obj);
    }

    public static int N() {
        if (f20397c == -1) {
            int i10 = 0;
            p r10 = r("video/avc", false, false);
            if (r10 != null) {
                MediaCodecInfo.CodecProfileLevel[] h10 = r10.h();
                int length = h10.length;
                int i11 = 0;
                while (i10 < length) {
                    i11 = Math.max(h(h10[i10].level), i11);
                    i10++;
                }
                i10 = Math.max(i11, r0.f26744a >= 21 ? 345600 : 172800);
            }
            f20397c = i10;
        }
        return f20397c;
    }

    private static int O(int i10) {
        int i11 = 17;
        if (i10 != 17) {
            i11 = 20;
            if (i10 != 20) {
                i11 = 23;
                if (i10 != 23) {
                    i11 = 29;
                    if (i10 != 29) {
                        i11 = 39;
                        if (i10 != 39) {
                            i11 = 42;
                            if (i10 != 42) {
                                switch (i10) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i11;
    }

    private static <T> void P(List<T> list, g<T> gVar) {
        Collections.sort(list, new Comparator() { // from class: k7.b0
            public /* synthetic */ b0() {
            }

            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int M;
                M = c0.M(c0.g.this, obj, obj2);
                return M;
            }
        });
    }

    private static int Q(int i10) {
        if (i10 == 10) {
            return 1;
        }
        if (i10 == 11) {
            return 2;
        }
        if (i10 == 20) {
            return 4;
        }
        if (i10 == 21) {
            return 8;
        }
        if (i10 == 30) {
            return 16;
        }
        if (i10 == 31) {
            return 32;
        }
        if (i10 == 40) {
            return 64;
        }
        if (i10 == 41) {
            return RecognitionOptions.ITF;
        }
        if (i10 == 50) {
            return RecognitionOptions.QR_CODE;
        }
        if (i10 == 51) {
            return RecognitionOptions.UPC_A;
        }
        switch (i10) {
            case 60:
                return RecognitionOptions.PDF417;
            case 61:
                return RecognitionOptions.AZTEC;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    private static int R(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? -1 : 8;
        }
        return 4;
    }

    private static void e(String str, List<p> list) {
        if ("audio/raw".equals(str)) {
            if (r0.f26744a < 26 && r0.f26745b.equals("R9") && list.size() == 1 && list.get(0).f20459a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(p.F("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            P(list, new g() { // from class: k7.y
                @Override // k7.c0.g
                public final int a(Object obj) {
                    int J;
                    J = c0.J((p) obj);
                    return J;
                }
            });
        }
        int i10 = r0.f26744a;
        if (i10 < 21 && list.size() > 1) {
            String str2 = list.get(0).f20459a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                P(list, new g() { // from class: k7.z
                    @Override // k7.c0.g
                    public final int a(Object obj) {
                        int K;
                        K = c0.K((p) obj);
                        return K;
                    }
                });
            }
        }
        if (i10 >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(list.get(0).f20459a)) {
            return;
        }
        list.add(list.remove(0));
    }

    private static int f(int i10) {
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return RecognitionOptions.ITF;
            case 8:
                return RecognitionOptions.QR_CODE;
            case 9:
                return RecognitionOptions.UPC_A;
            case 10:
                return RecognitionOptions.UPC_E;
            case 11:
                return RecognitionOptions.PDF417;
            case 12:
                return RecognitionOptions.AZTEC;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return RecognitionOptions.TEZ_CODE;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return 1048576;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    private static int g(int i10) {
        switch (i10) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i10) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return RecognitionOptions.ITF;
                    default:
                        switch (i10) {
                            case 30:
                                return RecognitionOptions.QR_CODE;
                            case 31:
                                return RecognitionOptions.UPC_A;
                            case 32:
                                return RecognitionOptions.UPC_E;
                            default:
                                switch (i10) {
                                    case 40:
                                        return RecognitionOptions.PDF417;
                                    case 41:
                                        return RecognitionOptions.AZTEC;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i10) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return RecognitionOptions.TEZ_CODE;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    private static int h(int i10) {
        if (i10 == 1 || i10 == 2) {
            return 25344;
        }
        switch (i10) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case RecognitionOptions.ITF /* 128 */:
            case RecognitionOptions.QR_CODE /* 256 */:
                return 414720;
            case RecognitionOptions.UPC_A /* 512 */:
                return 921600;
            case RecognitionOptions.UPC_E /* 1024 */:
                return 1310720;
            case RecognitionOptions.PDF417 /* 2048 */:
            case RecognitionOptions.AZTEC /* 4096 */:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case RecognitionOptions.TEZ_CODE /* 32768 */:
            case 65536:
                return 9437184;
            case 131072:
            case 262144:
            case 524288:
                return 35651584;
            default:
                return -1;
        }
    }

    private static int i(int i10) {
        if (i10 == 66) {
            return 1;
        }
        if (i10 == 77) {
            return 2;
        }
        if (i10 == 88) {
            return 4;
        }
        if (i10 == 100) {
            return 8;
        }
        if (i10 == 110) {
            return 16;
        }
        if (i10 != 122) {
            return i10 != 244 ? -1 : 64;
        }
        return 32;
    }

    private static Integer j(String str) {
        int i10;
        if (str == null) {
            return null;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 1537:
                if (str.equals("01")) {
                    c10 = 0;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1567:
                if (str.equals("10")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1568:
                if (str.equals("11")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1569:
                if (str.equals("12")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1570:
                if (str.equals("13")) {
                    c10 = '\f';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                i10 = 16;
                break;
            case 5:
                i10 = 32;
                break;
            case 6:
                i10 = 64;
                break;
            case 7:
                i10 = RecognitionOptions.ITF;
                break;
            case '\b':
                i10 = RecognitionOptions.QR_CODE;
                break;
            case '\t':
                i10 = RecognitionOptions.UPC_A;
                break;
            case '\n':
                i10 = RecognitionOptions.UPC_E;
                break;
            case 11:
                i10 = RecognitionOptions.PDF417;
                break;
            case '\f':
                i10 = RecognitionOptions.AZTEC;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i10);
    }

    private static Integer k(String str) {
        int i10;
        if (str == null) {
            return null;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 1536:
                if (str.equals("00")) {
                    c10 = 0;
                    break;
                }
                break;
            case 1537:
                if (str.equals("01")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    c10 = '\t';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                i10 = 16;
                break;
            case 5:
                i10 = 32;
                break;
            case 6:
                i10 = 64;
                break;
            case 7:
                i10 = RecognitionOptions.ITF;
                break;
            case '\b':
                i10 = RecognitionOptions.QR_CODE;
                break;
            case '\t':
                i10 = RecognitionOptions.UPC_A;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i10);
    }

    private static Pair<Integer, Integer> l(String str, String[] strArr) {
        int O;
        if (strArr.length != 3) {
            t8.s.i("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(t8.w.h(Integer.parseInt(strArr[1], 16))) && (O = O(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair<>(Integer.valueOf(O), 0);
            }
        } catch (NumberFormatException unused) {
            t8.s.i("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    public static String m(u1 u1Var) {
        Pair<Integer, Integer> q10;
        if ("audio/eac3-joc".equals(u1Var.f26517w)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(u1Var.f26517w) || (q10 = q(u1Var)) == null) {
            return null;
        }
        int intValue = ((Integer) q10.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return "video/avc";
        }
        return null;
    }

    private static Pair<Integer, Integer> n(String str, String[] strArr, u8.c cVar) {
        StringBuilder sb2;
        int parseInt;
        int parseInt2;
        int parseInt3;
        StringBuilder sb3;
        int i10;
        String sb4;
        if (strArr.length >= 4) {
            try {
                parseInt = Integer.parseInt(strArr[1]);
                parseInt2 = Integer.parseInt(strArr[2].substring(0, 2));
                parseInt3 = Integer.parseInt(strArr[3]);
            } catch (NumberFormatException unused) {
                sb2 = new StringBuilder();
            }
            if (parseInt != 0) {
                sb3 = new StringBuilder();
                sb3.append("Unknown AV1 profile: ");
                sb3.append(parseInt);
            } else {
                if (parseInt3 != 8 && parseInt3 != 10) {
                    sb2 = new StringBuilder();
                    sb2.append("Unknown AV1 bit depth: ");
                    sb2.append(parseInt3);
                    sb4 = sb2.toString();
                    t8.s.i("MediaCodecUtil", sb4);
                    return null;
                }
                int i11 = parseInt3 != 8 ? (cVar == null || !(cVar.f27359d != null || (i10 = cVar.f27358c) == 7 || i10 == 6)) ? 2 : RecognitionOptions.AZTEC : 1;
                int f10 = f(parseInt2);
                if (f10 != -1) {
                    return new Pair<>(Integer.valueOf(i11), Integer.valueOf(f10));
                }
                sb3 = new StringBuilder();
                sb3.append("Unknown AV1 level: ");
                sb3.append(parseInt2);
            }
            sb4 = sb3.toString();
            t8.s.i("MediaCodecUtil", sb4);
            return null;
        }
        sb2 = new StringBuilder();
        sb2.append("Ignoring malformed AV1 codec string: ");
        sb2.append(str);
        sb4 = sb2.toString();
        t8.s.i("MediaCodecUtil", sb4);
        return null;
    }

    private static Pair<Integer, Integer> o(String str, String[] strArr) {
        StringBuilder sb2;
        int parseInt;
        int i10;
        int i11;
        String str2;
        if (strArr.length >= 2) {
            try {
                if (strArr[1].length() == 6) {
                    i10 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                    parseInt = Integer.parseInt(strArr[1].substring(4), 16);
                } else {
                    if (strArr.length < 3) {
                        t8.s.i("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                        return null;
                    }
                    int parseInt2 = Integer.parseInt(strArr[1]);
                    parseInt = Integer.parseInt(strArr[2]);
                    i10 = parseInt2;
                }
                i11 = i(i10);
            } catch (NumberFormatException unused) {
                sb2 = new StringBuilder();
            }
            if (i11 == -1) {
                str2 = "Unknown AVC profile: " + i10;
                t8.s.i("MediaCodecUtil", str2);
                return null;
            }
            int g10 = g(parseInt);
            if (g10 != -1) {
                return new Pair<>(Integer.valueOf(i11), Integer.valueOf(g10));
            }
            sb2 = new StringBuilder();
            sb2.append("Unknown AVC level: ");
            sb2.append(parseInt);
            str2 = sb2.toString();
            t8.s.i("MediaCodecUtil", str2);
            return null;
        }
        sb2 = new StringBuilder();
        sb2.append("Ignoring malformed AVC codec string: ");
        sb2.append(str);
        str2 = sb2.toString();
        t8.s.i("MediaCodecUtil", str2);
        return null;
    }

    private static String p(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0075, code lost:
    
        if (r3.equals("av01") == false) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> q(t6.u1 r6) {
        /*
            java.lang.String r0 = r6.f26514t
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r2 = "\\."
            java.lang.String[] r0 = r0.split(r2)
            java.lang.String r2 = "video/dolby-vision"
            java.lang.String r3 = r6.f26517w
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L1d
            java.lang.String r6 = r6.f26514t
            android.util.Pair r6 = w(r6, r0)
            return r6
        L1d:
            r2 = 0
            r3 = r0[r2]
            r3.hashCode()
            int r4 = r3.hashCode()
            r5 = -1
            switch(r4) {
                case 3004662: goto L6f;
                case 3006243: goto L64;
                case 3006244: goto L59;
                case 3199032: goto L4e;
                case 3214780: goto L43;
                case 3356560: goto L38;
                case 3624515: goto L2d;
                default: goto L2b;
            }
        L2b:
            r2 = r5
            goto L78
        L2d:
            java.lang.String r2 = "vp09"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L36
            goto L2b
        L36:
            r2 = 6
            goto L78
        L38:
            java.lang.String r2 = "mp4a"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L41
            goto L2b
        L41:
            r2 = 5
            goto L78
        L43:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L4c
            goto L2b
        L4c:
            r2 = 4
            goto L78
        L4e:
            java.lang.String r2 = "hev1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L57
            goto L2b
        L57:
            r2 = 3
            goto L78
        L59:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L62
            goto L2b
        L62:
            r2 = 2
            goto L78
        L64:
            java.lang.String r2 = "avc1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L6d
            goto L2b
        L6d:
            r2 = 1
            goto L78
        L6f:
            java.lang.String r4 = "av01"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L78
            goto L2b
        L78:
            switch(r2) {
                case 0: goto L9a;
                case 1: goto L93;
                case 2: goto L93;
                case 3: goto L8a;
                case 4: goto L8a;
                case 5: goto L83;
                case 6: goto L7c;
                default: goto L7b;
            }
        L7b:
            return r1
        L7c:
            java.lang.String r6 = r6.f26514t
            android.util.Pair r6 = y(r6, r0)
            return r6
        L83:
            java.lang.String r6 = r6.f26514t
            android.util.Pair r6 = l(r6, r0)
            return r6
        L8a:
            java.lang.String r1 = r6.f26514t
            u8.c r6 = r6.I
            android.util.Pair r6 = x(r1, r0, r6)
            return r6
        L93:
            java.lang.String r6 = r6.f26514t
            android.util.Pair r6 = o(r6, r0)
            return r6
        L9a:
            java.lang.String r1 = r6.f26514t
            u8.c r6 = r6.I
            android.util.Pair r6 = n(r1, r0, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.c0.q(t6.u1):android.util.Pair");
    }

    public static p r(String str, boolean z10, boolean z11) {
        List<p> s10 = s(str, z10, z11);
        if (s10.isEmpty()) {
            return null;
        }
        return s10.get(0);
    }

    public static synchronized List<p> s(String str, boolean z10, boolean z11) {
        synchronized (c0.class) {
            b bVar = new b(str, z10, z11);
            HashMap<b, List<p>> hashMap = f20396b;
            List<p> list = hashMap.get(bVar);
            if (list != null) {
                return list;
            }
            int i10 = r0.f26744a;
            ArrayList<p> t10 = t(bVar, i10 >= 21 ? new f(z10, z11) : new e());
            if (z10 && t10.isEmpty() && 21 <= i10 && i10 <= 23) {
                t10 = t(bVar, new e());
                if (!t10.isEmpty()) {
                    t8.s.i("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + t10.get(0).f20459a);
                }
            }
            e(str, t10);
            com.google.common.collect.w r10 = com.google.common.collect.w.r(t10);
            hashMap.put(bVar, r10);
            return r10;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:28|(4:(2:72|73)|53|(9:56|57|58|59|60|61|62|64|65)|9)|32|33|34|36|9) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a4, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a5, code lost:
    
        r1 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x007f, code lost:
    
        if (r1.f20399b == false) goto L121;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0101 A[Catch: Exception -> 0x014f, TRY_ENTER, TryCatch #1 {Exception -> 0x014f, blocks: (B:3:0x0008, B:5:0x001b, B:9:0x0120, B:10:0x002d, B:13:0x0038, B:39:0x00f9, B:42:0x0101, B:44:0x0107, B:47:0x012a, B:48:0x014d), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012a A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList<k7.p> t(k7.c0.b r24, k7.c0.d r25) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.c0.t(k7.c0$b, k7.c0$d):java.util.ArrayList");
    }

    public static List<p> u(List<p> list, u1 u1Var) {
        ArrayList arrayList = new ArrayList(list);
        P(arrayList, new g() { // from class: k7.a0
            public /* synthetic */ a0() {
            }

            @Override // k7.c0.g
            public final int a(Object obj) {
                int L;
                L = c0.L(u1.this, (p) obj);
                return L;
            }
        });
        return arrayList;
    }

    public static p v() {
        return r("audio/raw", false, false);
    }

    private static Pair<Integer, Integer> w(String str, String[] strArr) {
        StringBuilder sb2;
        String str2;
        if (strArr.length < 3) {
            sb2 = new StringBuilder();
        } else {
            Matcher matcher = f20395a.matcher(strArr[1]);
            if (matcher.matches()) {
                str = matcher.group(1);
                Integer k10 = k(str);
                if (k10 == null) {
                    sb2 = new StringBuilder();
                    str2 = "Unknown Dolby Vision profile string: ";
                } else {
                    str = strArr[2];
                    Integer j10 = j(str);
                    if (j10 != null) {
                        return new Pair<>(k10, j10);
                    }
                    sb2 = new StringBuilder();
                    str2 = "Unknown Dolby Vision level string: ";
                }
                sb2.append(str2);
                sb2.append(str);
                t8.s.i("MediaCodecUtil", sb2.toString());
                return null;
            }
            sb2 = new StringBuilder();
        }
        sb2.append("Ignoring malformed Dolby Vision codec string: ");
        sb2.append(str);
        t8.s.i("MediaCodecUtil", sb2.toString());
        return null;
    }

    private static Pair<Integer, Integer> x(String str, String[] strArr, u8.c cVar) {
        StringBuilder sb2;
        String str2;
        if (strArr.length < 4) {
            sb2 = new StringBuilder();
        } else {
            int i10 = 1;
            Matcher matcher = f20395a.matcher(strArr[1]);
            if (matcher.matches()) {
                str = matcher.group(1);
                if (!"1".equals(str)) {
                    if (!"2".equals(str)) {
                        sb2 = new StringBuilder();
                        str2 = "Unknown HEVC profile string: ";
                        sb2.append(str2);
                        sb2.append(str);
                        t8.s.i("MediaCodecUtil", sb2.toString());
                        return null;
                    }
                    i10 = (cVar == null || cVar.f27358c != 6) ? 2 : RecognitionOptions.AZTEC;
                }
                str = strArr[3];
                Integer z10 = z(str);
                if (z10 != null) {
                    return new Pair<>(Integer.valueOf(i10), z10);
                }
                sb2 = new StringBuilder();
                str2 = "Unknown HEVC level string: ";
                sb2.append(str2);
                sb2.append(str);
                t8.s.i("MediaCodecUtil", sb2.toString());
                return null;
            }
            sb2 = new StringBuilder();
        }
        sb2.append("Ignoring malformed HEVC codec string: ");
        sb2.append(str);
        t8.s.i("MediaCodecUtil", sb2.toString());
        return null;
    }

    private static Pair<Integer, Integer> y(String str, String[] strArr) {
        StringBuilder sb2;
        int parseInt;
        int parseInt2;
        int R;
        String str2;
        if (strArr.length >= 3) {
            try {
                parseInt = Integer.parseInt(strArr[1]);
                parseInt2 = Integer.parseInt(strArr[2]);
                R = R(parseInt);
            } catch (NumberFormatException unused) {
                sb2 = new StringBuilder();
            }
            if (R == -1) {
                str2 = "Unknown VP9 profile: " + parseInt;
                t8.s.i("MediaCodecUtil", str2);
                return null;
            }
            int Q = Q(parseInt2);
            if (Q != -1) {
                return new Pair<>(Integer.valueOf(R), Integer.valueOf(Q));
            }
            sb2 = new StringBuilder();
            sb2.append("Unknown VP9 level: ");
            sb2.append(parseInt2);
            str2 = sb2.toString();
            t8.s.i("MediaCodecUtil", str2);
            return null;
        }
        sb2 = new StringBuilder();
        sb2.append("Ignoring malformed VP9 codec string: ");
        sb2.append(str);
        str2 = sb2.toString();
        t8.s.i("MediaCodecUtil", str2);
        return null;
    }

    private static Integer z(String str) {
        int i10;
        if (str == null) {
            return null;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 70821:
                if (str.equals("H30")) {
                    c10 = 0;
                    break;
                }
                break;
            case 70914:
                if (str.equals("H60")) {
                    c10 = 1;
                    break;
                }
                break;
            case 70917:
                if (str.equals("H63")) {
                    c10 = 2;
                    break;
                }
                break;
            case 71007:
                if (str.equals("H90")) {
                    c10 = 3;
                    break;
                }
                break;
            case 71010:
                if (str.equals("H93")) {
                    c10 = 4;
                    break;
                }
                break;
            case 74665:
                if (str.equals("L30")) {
                    c10 = 5;
                    break;
                }
                break;
            case 74758:
                if (str.equals("L60")) {
                    c10 = 6;
                    break;
                }
                break;
            case 74761:
                if (str.equals("L63")) {
                    c10 = 7;
                    break;
                }
                break;
            case 74851:
                if (str.equals("L90")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 74854:
                if (str.equals("L93")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 2193639:
                if (str.equals("H120")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 2193642:
                if (str.equals("H123")) {
                    c10 = 11;
                    break;
                }
                break;
            case 2193732:
                if (str.equals("H150")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 2193735:
                if (str.equals("H153")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 2193738:
                if (str.equals("H156")) {
                    c10 = 14;
                    break;
                }
                break;
            case 2193825:
                if (str.equals("H180")) {
                    c10 = 15;
                    break;
                }
                break;
            case 2193828:
                if (str.equals("H183")) {
                    c10 = 16;
                    break;
                }
                break;
            case 2193831:
                if (str.equals("H186")) {
                    c10 = 17;
                    break;
                }
                break;
            case 2312803:
                if (str.equals("L120")) {
                    c10 = 18;
                    break;
                }
                break;
            case 2312806:
                if (str.equals("L123")) {
                    c10 = 19;
                    break;
                }
                break;
            case 2312896:
                if (str.equals("L150")) {
                    c10 = 20;
                    break;
                }
                break;
            case 2312899:
                if (str.equals("L153")) {
                    c10 = 21;
                    break;
                }
                break;
            case 2312902:
                if (str.equals("L156")) {
                    c10 = 22;
                    break;
                }
                break;
            case 2312989:
                if (str.equals("L180")) {
                    c10 = 23;
                    break;
                }
                break;
            case 2312992:
                if (str.equals("L183")) {
                    c10 = 24;
                    break;
                }
                break;
            case 2312995:
                if (str.equals("L186")) {
                    c10 = 25;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 2;
            case 1:
                return 8;
            case 2:
                i10 = 32;
                break;
            case 3:
                i10 = RecognitionOptions.ITF;
                break;
            case 4:
                i10 = RecognitionOptions.UPC_A;
                break;
            case 5:
                return 1;
            case 6:
                return 4;
            case 7:
                return 16;
            case '\b':
                i10 = 64;
                break;
            case '\t':
                i10 = RecognitionOptions.QR_CODE;
                break;
            case '\n':
                i10 = RecognitionOptions.PDF417;
                break;
            case 11:
                i10 = 8192;
                break;
            case '\f':
                i10 = RecognitionOptions.TEZ_CODE;
                break;
            case '\r':
                i10 = 131072;
                break;
            case 14:
                i10 = 524288;
                break;
            case 15:
                i10 = 2097152;
                break;
            case 16:
                i10 = 8388608;
                break;
            case 17:
                i10 = 33554432;
                break;
            case 18:
                i10 = RecognitionOptions.UPC_E;
                break;
            case 19:
                i10 = RecognitionOptions.AZTEC;
                break;
            case 20:
                i10 = 16384;
                break;
            case 21:
                i10 = 65536;
                break;
            case 22:
                i10 = 262144;
                break;
            case 23:
                i10 = 1048576;
                break;
            case 24:
                i10 = 4194304;
                break;
            case 25:
                i10 = 16777216;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i10);
    }
}

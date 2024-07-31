package androidx.camera.core.impl.utils;

import android.os.Build;
import android.util.Pair;
import androidx.camera.core.InterfaceC0710o;
import androidx.camera.core.impl.EnumC0660r;
import androidx.core.util.C0984h;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p407w.C12029o0;

/* renamed from: androidx.camera.core.impl.utils.j */
/* loaded from: classes.dex */
public class C0681j {

    /* renamed from: c */
    static final String[] f2965c = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: d */
    private static final C0683l[] f2966d;

    /* renamed from: e */
    private static final C0683l[] f2967e;

    /* renamed from: f */
    private static final C0683l[] f2968f;

    /* renamed from: g */
    static final C0683l[] f2969g;

    /* renamed from: h */
    private static final C0683l[] f2970h;

    /* renamed from: i */
    static final C0683l[][] f2971i;

    /* renamed from: j */
    static final HashSet<String> f2972j;

    /* renamed from: a */
    private final List<Map<String, C0680i>> f2973a;

    /* renamed from: b */
    private final ByteOrder f2974b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.impl.utils.j$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2975a;

        /* renamed from: b */
        static final /* synthetic */ int[] f2976b;

        static {
            int[] iArr = new int[c.values().length];
            f2976b = iArr;
            try {
                iArr[c.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2976b[c.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC0660r.values().length];
            f2975a = iArr2;
            try {
                iArr2[EnumC0660r.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2975a[EnumC0660r.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2975a[EnumC0660r.FIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.j$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: c */
        private static final Pattern f2977c = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: d */
        private static final Pattern f2978d = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: e */
        private static final Pattern f2979e = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: f */
        static final List<HashMap<String, C0683l>> f2980f = Collections.list(new a());

        /* renamed from: a */
        final List<Map<String, C0680i>> f2981a = Collections.list(new C13154b());

        /* renamed from: b */
        private final ByteOrder f2982b;

        /* renamed from: androidx.camera.core.impl.utils.j$b$a */
        /* loaded from: classes.dex */
        class a implements Enumeration<HashMap<String, C0683l>> {

            /* renamed from: a */
            int f2983a = 0;

            a() {
            }

            @Override // java.util.Enumeration
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public HashMap<String, C0683l> nextElement() {
                HashMap<String, C0683l> hashMap = new HashMap<>();
                for (C0683l c0683l : C0681j.f2971i[this.f2983a]) {
                    hashMap.put(c0683l.f2996b, c0683l);
                }
                this.f2983a++;
                return hashMap;
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f2983a < C0681j.f2971i.length;
            }
        }

        /* renamed from: androidx.camera.core.impl.utils.j$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C13154b implements Enumeration<Map<String, C0680i>> {

            /* renamed from: a */
            int f2984a = 0;

            C13154b() {
            }

            @Override // java.util.Enumeration
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map<String, C0680i> nextElement() {
                this.f2984a++;
                return new HashMap();
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f2984a < C0681j.f2971i.length;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.camera.core.impl.utils.j$b$c */
        /* loaded from: classes.dex */
        public class c implements Enumeration<Map<String, C0680i>> {

            /* renamed from: a */
            final Enumeration<Map<String, C0680i>> f2986a;

            c() {
                this.f2986a = Collections.enumeration(b.this.f2981a);
            }

            @Override // java.util.Enumeration
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map<String, C0680i> nextElement() {
                return new HashMap(this.f2986a.nextElement());
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f2986a.hasMoreElements();
            }
        }

        b(ByteOrder byteOrder) {
            this.f2982b = byteOrder;
        }

        /* renamed from: b */
        private static Pair<Integer, Integer> m3310b(String str) {
            if (str.contains(",")) {
                String[] split = str.split(",", -1);
                Pair<Integer, Integer> m3310b = m3310b(split[0]);
                if (((Integer) m3310b.first).intValue() == 2) {
                    return m3310b;
                }
                for (int i10 = 1; i10 < split.length; i10++) {
                    Pair<Integer, Integer> m3310b2 = m3310b(split[i10]);
                    int intValue = (((Integer) m3310b2.first).equals(m3310b.first) || ((Integer) m3310b2.second).equals(m3310b.first)) ? ((Integer) m3310b.first).intValue() : -1;
                    int intValue2 = (((Integer) m3310b.second).intValue() == -1 || !(((Integer) m3310b2.first).equals(m3310b.second) || ((Integer) m3310b2.second).equals(m3310b.second))) ? -1 : ((Integer) m3310b.second).intValue();
                    if (intValue == -1 && intValue2 == -1) {
                        return new Pair<>(2, -1);
                    }
                    if (intValue == -1) {
                        m3310b = new Pair<>(Integer.valueOf(intValue2), -1);
                    } else if (intValue2 == -1) {
                        m3310b = new Pair<>(Integer.valueOf(intValue), -1);
                    }
                }
                return m3310b;
            }
            if (!str.contains("/")) {
                try {
                    try {
                        long parseLong = Long.parseLong(str);
                        return (parseLong < 0 || parseLong > 65535) ? parseLong < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1) : new Pair<>(3, 4);
                    } catch (NumberFormatException unused) {
                        Double.parseDouble(str);
                        return new Pair<>(12, -1);
                    }
                } catch (NumberFormatException unused2) {
                    return new Pair<>(2, -1);
                }
            }
            String[] split2 = str.split("/", -1);
            if (split2.length == 2) {
                try {
                    long parseDouble = (long) Double.parseDouble(split2[0]);
                    long parseDouble2 = (long) Double.parseDouble(split2[1]);
                    if (parseDouble >= 0 && parseDouble2 >= 0) {
                        if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                            return new Pair<>(10, 5);
                        }
                        return new Pair<>(5, -1);
                    }
                    return new Pair<>(10, -1);
                } catch (NumberFormatException unused3) {
                }
            }
            return new Pair<>(2, -1);
        }

        /* renamed from: d */
        private void m3311d(String str, String str2, List<Map<String, C0680i>> list) {
            Iterator<Map<String, C0680i>> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().containsKey(str)) {
                    return;
                }
            }
            m3312e(str, str2, list);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x018a, code lost:
        
            if (r7 != r0) goto L100;
         */
        /* JADX WARN: Failed to find 'out' block for switch in B:47:0x0193. Please report as an issue. */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void m3312e(java.lang.String r18, java.lang.String r19, java.util.List<java.util.Map<java.lang.String, androidx.camera.core.impl.utils.C0680i>> r20) {
            /*
                Method dump skipped, instructions count: 758
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.C0681j.b.m3312e(java.lang.String, java.lang.String, java.util.List):void");
        }

        /* renamed from: a */
        public C0681j m3313a() {
            ArrayList list = Collections.list(new c());
            if (!list.get(1).isEmpty()) {
                m3311d("ExposureProgram", String.valueOf(0), list);
                m3311d("ExifVersion", "0230", list);
                m3311d("ComponentsConfiguration", "1,2,3,0", list);
                m3311d("MeteringMode", String.valueOf(0), list);
                m3311d("LightSource", String.valueOf(0), list);
                m3311d("FlashpixVersion", "0100", list);
                m3311d("FocalPlaneResolutionUnit", String.valueOf(2), list);
                m3311d("FileSource", String.valueOf(3), list);
                m3311d("SceneType", String.valueOf(1), list);
                m3311d("CustomRendered", String.valueOf(0), list);
                m3311d("SceneCaptureType", String.valueOf(0), list);
                m3311d("Contrast", String.valueOf(0), list);
                m3311d("Saturation", String.valueOf(0), list);
                m3311d("Sharpness", String.valueOf(0), list);
            }
            if (!list.get(2).isEmpty()) {
                m3311d("GPSVersionID", "2300", list);
                m3311d("GPSSpeedRef", "K", list);
                m3311d("GPSTrackRef", "T", list);
                m3311d("GPSImgDirectionRef", "T", list);
                m3311d("GPSDestBearingRef", "T", list);
                m3311d("GPSDestDistanceRef", "K", list);
            }
            return new C0681j(this.f2982b, list);
        }

        /* renamed from: c */
        public b m3314c(String str, String str2) {
            m3312e(str, str2, this.f2981a);
            return this;
        }

        /* renamed from: f */
        public b m3315f(long j10) {
            return m3314c("ExposureTime", String.valueOf(j10 / TimeUnit.SECONDS.toNanos(1L)));
        }

        /* renamed from: g */
        public b m3316g(EnumC0660r enumC0660r) {
            int i10;
            if (enumC0660r == EnumC0660r.UNKNOWN) {
                return this;
            }
            int i11 = a.f2975a[enumC0660r.ordinal()];
            if (i11 == 1) {
                i10 = 0;
            } else if (i11 == 2) {
                i10 = 32;
            } else {
                if (i11 != 3) {
                    C12029o0.m38648k("ExifData", "Unknown flash state: " + enumC0660r);
                    return this;
                }
                i10 = 1;
            }
            if ((i10 & 1) == 1) {
                m3314c("LightSource", String.valueOf(4));
            }
            return m3314c("Flash", String.valueOf(i10));
        }

        /* renamed from: h */
        public b m3317h(float f10) {
            return m3314c("FocalLength", new C0684m(f10 * 1000.0f, 1000L).toString());
        }

        /* renamed from: i */
        public b m3318i(int i10) {
            return m3314c("ImageLength", String.valueOf(i10));
        }

        /* renamed from: j */
        public b m3319j(int i10) {
            return m3314c("ImageWidth", String.valueOf(i10));
        }

        /* renamed from: k */
        public b m3320k(int i10) {
            return m3314c("SensitivityType", String.valueOf(3)).m3314c("PhotographicSensitivity", String.valueOf(Math.min(65535, i10)));
        }

        /* renamed from: l */
        public b m3321l(float f10) {
            return m3314c("FNumber", String.valueOf(f10));
        }

        /* renamed from: m */
        public b m3322m(int i10) {
            int i11;
            if (i10 == 0) {
                i11 = 1;
            } else if (i10 == 90) {
                i11 = 6;
            } else if (i10 == 180) {
                i11 = 3;
            } else if (i10 != 270) {
                C12029o0.m38648k("ExifData", "Unexpected orientation value: " + i10 + ". Must be one of 0, 90, 180, 270.");
                i11 = 0;
            } else {
                i11 = 8;
            }
            return m3314c("Orientation", String.valueOf(i11));
        }

        /* renamed from: n */
        public b m3323n(c cVar) {
            int i10 = a.f2976b[cVar.ordinal()];
            return m3314c("WhiteBalance", i10 != 1 ? i10 != 2 ? null : String.valueOf(1) : String.valueOf(0));
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.j$c */
    /* loaded from: classes.dex */
    public enum c {
        AUTO,
        MANUAL
    }

    static {
        C0683l[] c0683lArr = {new C0683l("ImageWidth", RecognitionOptions.QR_CODE, 3, 4), new C0683l("ImageLength", 257, 3, 4), new C0683l("Make", 271, 2), new C0683l("Model", 272, 2), new C0683l("Orientation", 274, 3), new C0683l("XResolution", 282, 5), new C0683l("YResolution", 283, 5), new C0683l("ResolutionUnit", 296, 3), new C0683l("Software", 305, 2), new C0683l("DateTime", 306, 2), new C0683l("YCbCrPositioning", 531, 3), new C0683l("SubIFDPointer", 330, 4), new C0683l("ExifIFDPointer", 34665, 4), new C0683l("GPSInfoIFDPointer", 34853, 4)};
        f2966d = c0683lArr;
        C0683l[] c0683lArr2 = {new C0683l("ExposureTime", 33434, 5), new C0683l("FNumber", 33437, 5), new C0683l("ExposureProgram", 34850, 3), new C0683l("PhotographicSensitivity", 34855, 3), new C0683l("SensitivityType", 34864, 3), new C0683l("ExifVersion", 36864, 2), new C0683l("DateTimeOriginal", 36867, 2), new C0683l("DateTimeDigitized", 36868, 2), new C0683l("ComponentsConfiguration", 37121, 7), new C0683l("ShutterSpeedValue", 37377, 10), new C0683l("ApertureValue", 37378, 5), new C0683l("BrightnessValue", 37379, 10), new C0683l("ExposureBiasValue", 37380, 10), new C0683l("MaxApertureValue", 37381, 5), new C0683l("MeteringMode", 37383, 3), new C0683l("LightSource", 37384, 3), new C0683l("Flash", 37385, 3), new C0683l("FocalLength", 37386, 5), new C0683l("SubSecTime", 37520, 2), new C0683l("SubSecTimeOriginal", 37521, 2), new C0683l("SubSecTimeDigitized", 37522, 2), new C0683l("FlashpixVersion", 40960, 7), new C0683l("ColorSpace", 40961, 3), new C0683l("PixelXDimension", 40962, 3, 4), new C0683l("PixelYDimension", 40963, 3, 4), new C0683l("InteroperabilityIFDPointer", 40965, 4), new C0683l("FocalPlaneResolutionUnit", 41488, 3), new C0683l("SensingMethod", 41495, 3), new C0683l("FileSource", 41728, 7), new C0683l("SceneType", 41729, 7), new C0683l("CustomRendered", 41985, 3), new C0683l("ExposureMode", 41986, 3), new C0683l("WhiteBalance", 41987, 3), new C0683l("SceneCaptureType", 41990, 3), new C0683l("Contrast", 41992, 3), new C0683l("Saturation", 41993, 3), new C0683l("Sharpness", 41994, 3)};
        f2967e = c0683lArr2;
        C0683l[] c0683lArr3 = {new C0683l("GPSVersionID", 0, 1), new C0683l("GPSLatitudeRef", 1, 2), new C0683l("GPSLatitude", 2, 5, 10), new C0683l("GPSLongitudeRef", 3, 2), new C0683l("GPSLongitude", 4, 5, 10), new C0683l("GPSAltitudeRef", 5, 1), new C0683l("GPSAltitude", 6, 5), new C0683l("GPSTimeStamp", 7, 5), new C0683l("GPSSpeedRef", 12, 2), new C0683l("GPSTrackRef", 14, 2), new C0683l("GPSImgDirectionRef", 16, 2), new C0683l("GPSDestBearingRef", 23, 2), new C0683l("GPSDestDistanceRef", 25, 2)};
        f2968f = c0683lArr3;
        f2969g = new C0683l[]{new C0683l("SubIFDPointer", 330, 4), new C0683l("ExifIFDPointer", 34665, 4), new C0683l("GPSInfoIFDPointer", 34853, 4), new C0683l("InteroperabilityIFDPointer", 40965, 4)};
        C0683l[] c0683lArr4 = {new C0683l("InteroperabilityIndex", 1, 2)};
        f2970h = c0683lArr4;
        f2971i = new C0683l[][]{c0683lArr, c0683lArr2, c0683lArr3, c0683lArr4};
        f2972j = new HashSet<>(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
    }

    C0681j(ByteOrder byteOrder, List<Map<String, C0680i>> list) {
        C0984h.m4836n(list.size() == f2971i.length, "Malformed attributes list. Number of IFDs mismatch.");
        this.f2974b = byteOrder;
        this.f2973a = list;
    }

    /* renamed from: a */
    public static b m3306a() {
        return new b(ByteOrder.BIG_ENDIAN).m3314c("Orientation", String.valueOf(1)).m3314c("XResolution", "72/1").m3314c("YResolution", "72/1").m3314c("ResolutionUnit", String.valueOf(2)).m3314c("YCbCrPositioning", String.valueOf(1)).m3314c("Make", Build.MANUFACTURER).m3314c("Model", Build.MODEL);
    }

    /* renamed from: b */
    public static C0681j m3307b(InterfaceC0710o interfaceC0710o, int i10) {
        b m3306a = m3306a();
        if (interfaceC0710o.mo2883e1() != null) {
            interfaceC0710o.mo2883e1().mo8851a(m3306a);
        }
        m3306a.m3322m(i10);
        return m3306a.m3319j(interfaceC0710o.getWidth()).m3318i(interfaceC0710o.getHeight()).m3313a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Map<String, C0680i> m3308c(int i10) {
        C0984h.m4828f(i10, 0, f2971i.length, "Invalid IFD index: " + i10 + ". Index should be between [0, EXIF_TAGS.length] ");
        return this.f2973a.get(i10);
    }

    /* renamed from: d */
    public ByteOrder m3309d() {
        return this.f2974b;
    }
}

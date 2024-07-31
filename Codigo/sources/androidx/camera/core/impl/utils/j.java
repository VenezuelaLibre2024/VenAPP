package androidx.camera.core.impl.utils;

import android.os.Build;
import android.util.Pair;
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
import w.o0;

/* loaded from: classes.dex */
public class j {

    /* renamed from: c */
    static final String[] f2621c = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: d */
    private static final l[] f2622d;

    /* renamed from: e */
    private static final l[] f2623e;

    /* renamed from: f */
    private static final l[] f2624f;

    /* renamed from: g */
    static final l[] f2625g;

    /* renamed from: h */
    private static final l[] f2626h;

    /* renamed from: i */
    static final l[][] f2627i;

    /* renamed from: j */
    static final HashSet<String> f2628j;

    /* renamed from: a */
    private final List<Map<String, i>> f2629a;

    /* renamed from: b */
    private final ByteOrder f2630b;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2631a;

        /* renamed from: b */
        static final /* synthetic */ int[] f2632b;

        static {
            int[] iArr = new int[c.values().length];
            f2632b = iArr;
            try {
                iArr[c.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2632b[c.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[androidx.camera.core.impl.r.values().length];
            f2631a = iArr2;
            try {
                iArr2[androidx.camera.core.impl.r.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2631a[androidx.camera.core.impl.r.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2631a[androidx.camera.core.impl.r.FIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: c */
        private static final Pattern f2633c = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: d */
        private static final Pattern f2634d = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: e */
        private static final Pattern f2635e = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: f */
        static final List<HashMap<String, l>> f2636f = Collections.list(new a());

        /* renamed from: a */
        final List<Map<String, i>> f2637a = Collections.list(new C0028b());

        /* renamed from: b */
        private final ByteOrder f2638b;

        /* loaded from: classes.dex */
        class a implements Enumeration<HashMap<String, l>> {

            /* renamed from: a */
            int f2639a = 0;

            a() {
            }

            @Override // java.util.Enumeration
            /* renamed from: a */
            public HashMap<String, l> nextElement() {
                HashMap<String, l> hashMap = new HashMap<>();
                for (l lVar : j.f2627i[this.f2639a]) {
                    hashMap.put(lVar.f2652b, lVar);
                }
                this.f2639a++;
                return hashMap;
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f2639a < j.f2627i.length;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.camera.core.impl.utils.j$b$b */
        /* loaded from: classes.dex */
        public class C0028b implements Enumeration<Map<String, i>> {

            /* renamed from: a */
            int f2640a = 0;

            C0028b() {
            }

            @Override // java.util.Enumeration
            /* renamed from: a */
            public Map<String, i> nextElement() {
                this.f2640a++;
                return new HashMap();
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f2640a < j.f2627i.length;
            }
        }

        /* loaded from: classes.dex */
        public class c implements Enumeration<Map<String, i>> {

            /* renamed from: a */
            final Enumeration<Map<String, i>> f2642a;

            c() {
                this.f2642a = Collections.enumeration(b.this.f2637a);
            }

            @Override // java.util.Enumeration
            /* renamed from: a */
            public Map<String, i> nextElement() {
                return new HashMap(this.f2642a.nextElement());
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f2642a.hasMoreElements();
            }
        }

        b(ByteOrder byteOrder) {
            this.f2638b = byteOrder;
        }

        private static Pair<Integer, Integer> b(String str) {
            if (str.contains(",")) {
                String[] split = str.split(",", -1);
                Pair<Integer, Integer> b10 = b(split[0]);
                if (((Integer) b10.first).intValue() == 2) {
                    return b10;
                }
                for (int i10 = 1; i10 < split.length; i10++) {
                    Pair<Integer, Integer> b11 = b(split[i10]);
                    int intValue = (((Integer) b11.first).equals(b10.first) || ((Integer) b11.second).equals(b10.first)) ? ((Integer) b10.first).intValue() : -1;
                    int intValue2 = (((Integer) b10.second).intValue() == -1 || !(((Integer) b11.first).equals(b10.second) || ((Integer) b11.second).equals(b10.second))) ? -1 : ((Integer) b10.second).intValue();
                    if (intValue == -1 && intValue2 == -1) {
                        return new Pair<>(2, -1);
                    }
                    if (intValue == -1) {
                        b10 = new Pair<>(Integer.valueOf(intValue2), -1);
                    } else if (intValue2 == -1) {
                        b10 = new Pair<>(Integer.valueOf(intValue), -1);
                    }
                }
                return b10;
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

        private void d(String str, String str2, List<Map<String, i>> list) {
            Iterator<Map<String, i>> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().containsKey(str)) {
                    return;
                }
            }
            e(str, str2, list);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x018a, code lost:
        
            if (r7 != r0) goto L215;
         */
        /* JADX WARN: Failed to find 'out' block for switch in B:47:0x0193. Please report as an issue. */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void e(java.lang.String r18, java.lang.String r19, java.util.List<java.util.Map<java.lang.String, androidx.camera.core.impl.utils.i>> r20) {
            /*
                Method dump skipped, instructions count: 758
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.j.b.e(java.lang.String, java.lang.String, java.util.List):void");
        }

        public j a() {
            ArrayList list = Collections.list(new c());
            if (!list.get(1).isEmpty()) {
                d("ExposureProgram", String.valueOf(0), list);
                d("ExifVersion", "0230", list);
                d("ComponentsConfiguration", "1,2,3,0", list);
                d("MeteringMode", String.valueOf(0), list);
                d("LightSource", String.valueOf(0), list);
                d("FlashpixVersion", "0100", list);
                d("FocalPlaneResolutionUnit", String.valueOf(2), list);
                d("FileSource", String.valueOf(3), list);
                d("SceneType", String.valueOf(1), list);
                d("CustomRendered", String.valueOf(0), list);
                d("SceneCaptureType", String.valueOf(0), list);
                d("Contrast", String.valueOf(0), list);
                d("Saturation", String.valueOf(0), list);
                d("Sharpness", String.valueOf(0), list);
            }
            if (!list.get(2).isEmpty()) {
                d("GPSVersionID", "2300", list);
                d("GPSSpeedRef", "K", list);
                d("GPSTrackRef", "T", list);
                d("GPSImgDirectionRef", "T", list);
                d("GPSDestBearingRef", "T", list);
                d("GPSDestDistanceRef", "K", list);
            }
            return new j(this.f2638b, list);
        }

        public b c(String str, String str2) {
            e(str, str2, this.f2637a);
            return this;
        }

        public b f(long j10) {
            return c("ExposureTime", String.valueOf(j10 / TimeUnit.SECONDS.toNanos(1L)));
        }

        public b g(androidx.camera.core.impl.r rVar) {
            int i10;
            if (rVar == androidx.camera.core.impl.r.UNKNOWN) {
                return this;
            }
            int i11 = a.f2631a[rVar.ordinal()];
            if (i11 == 1) {
                i10 = 0;
            } else if (i11 == 2) {
                i10 = 32;
            } else {
                if (i11 != 3) {
                    o0.k("ExifData", "Unknown flash state: " + rVar);
                    return this;
                }
                i10 = 1;
            }
            if ((i10 & 1) == 1) {
                c("LightSource", String.valueOf(4));
            }
            return c("Flash", String.valueOf(i10));
        }

        public b h(float f10) {
            return c("FocalLength", new m(f10 * 1000.0f, 1000L).toString());
        }

        public b i(int i10) {
            return c("ImageLength", String.valueOf(i10));
        }

        public b j(int i10) {
            return c("ImageWidth", String.valueOf(i10));
        }

        public b k(int i10) {
            return c("SensitivityType", String.valueOf(3)).c("PhotographicSensitivity", String.valueOf(Math.min(65535, i10)));
        }

        public b l(float f10) {
            return c("FNumber", String.valueOf(f10));
        }

        public b m(int i10) {
            int i11;
            if (i10 == 0) {
                i11 = 1;
            } else if (i10 == 90) {
                i11 = 6;
            } else if (i10 == 180) {
                i11 = 3;
            } else if (i10 != 270) {
                o0.k("ExifData", "Unexpected orientation value: " + i10 + ". Must be one of 0, 90, 180, 270.");
                i11 = 0;
            } else {
                i11 = 8;
            }
            return c("Orientation", String.valueOf(i11));
        }

        public b n(c cVar) {
            int i10 = a.f2632b[cVar.ordinal()];
            return c("WhiteBalance", i10 != 1 ? i10 != 2 ? null : String.valueOf(1) : String.valueOf(0));
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        AUTO,
        MANUAL
    }

    static {
        l[] lVarArr = {new l("ImageWidth", RecognitionOptions.QR_CODE, 3, 4), new l("ImageLength", 257, 3, 4), new l("Make", 271, 2), new l("Model", 272, 2), new l("Orientation", 274, 3), new l("XResolution", 282, 5), new l("YResolution", 283, 5), new l("ResolutionUnit", 296, 3), new l("Software", 305, 2), new l("DateTime", 306, 2), new l("YCbCrPositioning", 531, 3), new l("SubIFDPointer", 330, 4), new l("ExifIFDPointer", 34665, 4), new l("GPSInfoIFDPointer", 34853, 4)};
        f2622d = lVarArr;
        l[] lVarArr2 = {new l("ExposureTime", 33434, 5), new l("FNumber", 33437, 5), new l("ExposureProgram", 34850, 3), new l("PhotographicSensitivity", 34855, 3), new l("SensitivityType", 34864, 3), new l("ExifVersion", 36864, 2), new l("DateTimeOriginal", 36867, 2), new l("DateTimeDigitized", 36868, 2), new l("ComponentsConfiguration", 37121, 7), new l("ShutterSpeedValue", 37377, 10), new l("ApertureValue", 37378, 5), new l("BrightnessValue", 37379, 10), new l("ExposureBiasValue", 37380, 10), new l("MaxApertureValue", 37381, 5), new l("MeteringMode", 37383, 3), new l("LightSource", 37384, 3), new l("Flash", 37385, 3), new l("FocalLength", 37386, 5), new l("SubSecTime", 37520, 2), new l("SubSecTimeOriginal", 37521, 2), new l("SubSecTimeDigitized", 37522, 2), new l("FlashpixVersion", 40960, 7), new l("ColorSpace", 40961, 3), new l("PixelXDimension", 40962, 3, 4), new l("PixelYDimension", 40963, 3, 4), new l("InteroperabilityIFDPointer", 40965, 4), new l("FocalPlaneResolutionUnit", 41488, 3), new l("SensingMethod", 41495, 3), new l("FileSource", 41728, 7), new l("SceneType", 41729, 7), new l("CustomRendered", 41985, 3), new l("ExposureMode", 41986, 3), new l("WhiteBalance", 41987, 3), new l("SceneCaptureType", 41990, 3), new l("Contrast", 41992, 3), new l("Saturation", 41993, 3), new l("Sharpness", 41994, 3)};
        f2623e = lVarArr2;
        l[] lVarArr3 = {new l("GPSVersionID", 0, 1), new l("GPSLatitudeRef", 1, 2), new l("GPSLatitude", 2, 5, 10), new l("GPSLongitudeRef", 3, 2), new l("GPSLongitude", 4, 5, 10), new l("GPSAltitudeRef", 5, 1), new l("GPSAltitude", 6, 5), new l("GPSTimeStamp", 7, 5), new l("GPSSpeedRef", 12, 2), new l("GPSTrackRef", 14, 2), new l("GPSImgDirectionRef", 16, 2), new l("GPSDestBearingRef", 23, 2), new l("GPSDestDistanceRef", 25, 2)};
        f2624f = lVarArr3;
        f2625g = new l[]{new l("SubIFDPointer", 330, 4), new l("ExifIFDPointer", 34665, 4), new l("GPSInfoIFDPointer", 34853, 4), new l("InteroperabilityIFDPointer", 40965, 4)};
        l[] lVarArr4 = {new l("InteroperabilityIndex", 1, 2)};
        f2626h = lVarArr4;
        f2627i = new l[][]{lVarArr, lVarArr2, lVarArr3, lVarArr4};
        f2628j = new HashSet<>(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
    }

    j(ByteOrder byteOrder, List<Map<String, i>> list) {
        androidx.core.util.h.n(list.size() == f2627i.length, "Malformed attributes list. Number of IFDs mismatch.");
        this.f2630b = byteOrder;
        this.f2629a = list;
    }

    public static b a() {
        return new b(ByteOrder.BIG_ENDIAN).c("Orientation", String.valueOf(1)).c("XResolution", "72/1").c("YResolution", "72/1").c("ResolutionUnit", String.valueOf(2)).c("YCbCrPositioning", String.valueOf(1)).c("Make", Build.MANUFACTURER).c("Model", Build.MODEL);
    }

    public static j b(androidx.camera.core.o oVar, int i10) {
        b a10 = a();
        if (oVar.e1() != null) {
            oVar.e1().a(a10);
        }
        a10.m(i10);
        return a10.j(oVar.getWidth()).i(oVar.getHeight()).a();
    }

    public Map<String, i> c(int i10) {
        androidx.core.util.h.f(i10, 0, f2627i.length, "Invalid IFD index: " + i10 + ". Index should be between [0, EXIF_TAGS.length] ");
        return this.f2629a.get(i10);
    }

    public ByteOrder d() {
        return this.f2630b;
    }
}

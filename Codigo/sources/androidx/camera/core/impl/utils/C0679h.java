package androidx.camera.core.impl.utils;

import androidx.camera.core.InterfaceC0710o;
import androidx.exifinterface.media.C1239a;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p407w.C12029o0;

/* renamed from: androidx.camera.core.impl.utils.h */
/* loaded from: classes.dex */
public final class C0679h {

    /* renamed from: c */
    private static final String f2948c = "h";

    /* renamed from: d */
    private static final ThreadLocal<SimpleDateFormat> f2949d = new a();

    /* renamed from: e */
    private static final ThreadLocal<SimpleDateFormat> f2950e = new b();

    /* renamed from: f */
    private static final ThreadLocal<SimpleDateFormat> f2951f = new c();

    /* renamed from: g */
    private static final List<String> f2952g = m3275i();

    /* renamed from: h */
    private static final List<String> f2953h = Arrays.asList("ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation");

    /* renamed from: a */
    private final C1239a f2954a;

    /* renamed from: b */
    private boolean f2955b = false;

    /* renamed from: androidx.camera.core.impl.utils.h$a */
    /* loaded from: classes.dex */
    class a extends ThreadLocal<SimpleDateFormat> {
        a() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.h$b */
    /* loaded from: classes.dex */
    class b extends ThreadLocal<SimpleDateFormat> {
        b() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("HH:mm:ss", Locale.US);
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.h$c */
    /* loaded from: classes.dex */
    class c extends ThreadLocal<SimpleDateFormat> {
        c() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.camera.core.impl.utils.h$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.camera.core.impl.utils.h$d$a */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a */
            final double f2956a;

            a(double d10) {
                this.f2956a = d10;
            }

            /* renamed from: a */
            double m3295a() {
                return this.f2956a / 2.23694d;
            }
        }

        /* renamed from: a */
        static a m3292a(double d10) {
            return new a(d10 * 0.621371d);
        }

        /* renamed from: b */
        static a m3293b(double d10) {
            return new a(d10 * 1.15078d);
        }

        /* renamed from: c */
        static a m3294c(double d10) {
            return new a(d10);
        }
    }

    private C0679h(C1239a c1239a) {
        this.f2954a = c1239a;
    }

    /* renamed from: a */
    private static Date m3268a(String str) {
        return f2949d.get().parse(str);
    }

    /* renamed from: b */
    private static Date m3269b(String str) {
        return f2951f.get().parse(str);
    }

    /* renamed from: c */
    private static Date m3270c(String str) {
        return f2950e.get().parse(str);
    }

    /* renamed from: e */
    public static C0679h m3271e(File file) {
        return m3272f(file.toString());
    }

    /* renamed from: f */
    public static C0679h m3272f(String str) {
        return new C0679h(new C1239a(str));
    }

    /* renamed from: g */
    public static C0679h m3273g(InterfaceC0710o interfaceC0710o) {
        ByteBuffer mo2886c = interfaceC0710o.mo2885u0()[0].mo2886c();
        mo2886c.rewind();
        byte[] bArr = new byte[mo2886c.capacity()];
        mo2886c.get(bArr);
        return m3274h(new ByteArrayInputStream(bArr));
    }

    /* renamed from: h */
    public static C0679h m3274h(InputStream inputStream) {
        return new C0679h(new C1239a(inputStream));
    }

    /* renamed from: i */
    public static List<String> m3275i() {
        return Arrays.asList("ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType");
    }

    /* renamed from: s */
    private long m3276s(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return m3269b(str).getTime();
        } catch (ParseException unused) {
            return -1L;
        }
    }

    /* renamed from: t */
    private long m3277t(String str, String str2) {
        if (str == null && str2 == null) {
            return -1L;
        }
        if (str2 == null) {
            try {
                return m3268a(str).getTime();
            } catch (ParseException unused) {
                return -1L;
            }
        }
        if (str == null) {
            try {
                return m3270c(str2).getTime();
            } catch (ParseException unused2) {
                return -1L;
            }
        }
        return m3276s(str + " " + str2);
    }

    /* renamed from: d */
    public void m3278d(C0679h c0679h) {
        ArrayList<String> arrayList = new ArrayList(f2952g);
        arrayList.removeAll(f2953h);
        for (String str : arrayList) {
            String m6781f = this.f2954a.m6781f(str);
            String m6781f2 = c0679h.f2954a.m6781f(str);
            if (m6781f != null && !m6781f.equals(m6781f2)) {
                c0679h.f2954a.m6779a0(str, m6781f);
            }
        }
    }

    /* renamed from: j */
    public String m3279j() {
        return this.f2954a.m6781f("ImageDescription");
    }

    /* renamed from: k */
    public int m3280k() {
        return this.f2954a.m6783h("ImageLength", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.location.Location m3281l() {
        /*
            r16 = this;
            r0 = r16
            androidx.exifinterface.media.a r1 = r0.f2954a
            java.lang.String r2 = "GPSProcessingMethod"
            java.lang.String r1 = r1.m6781f(r2)
            androidx.exifinterface.media.a r2 = r0.f2954a
            double[] r2 = r2.m6784l()
            androidx.exifinterface.media.a r3 = r0.f2954a
            r4 = 0
            double r6 = r3.m6780e(r4)
            androidx.exifinterface.media.a r3 = r0.f2954a
            java.lang.String r8 = "GPSSpeed"
            double r8 = r3.m6782g(r8, r4)
            androidx.exifinterface.media.a r3 = r0.f2954a
            java.lang.String r10 = "GPSSpeedRef"
            java.lang.String r3 = r3.m6781f(r10)
            java.lang.String r10 = "K"
            if (r3 != 0) goto L2d
            r3 = r10
        L2d:
            androidx.exifinterface.media.a r11 = r0.f2954a
            java.lang.String r12 = "GPSDateStamp"
            java.lang.String r11 = r11.m6781f(r12)
            androidx.exifinterface.media.a r12 = r0.f2954a
            java.lang.String r13 = "GPSTimeStamp"
            java.lang.String r12 = r12.m6781f(r13)
            long r11 = r0.m3277t(r11, r12)
            if (r2 != 0) goto L45
            r1 = 0
            return r1
        L45:
            if (r1 != 0) goto L49
            java.lang.String r1 = androidx.camera.core.impl.utils.C0679h.f2948c
        L49:
            android.location.Location r13 = new android.location.Location
            r13.<init>(r1)
            r1 = 0
            r14 = r2[r1]
            r13.setLatitude(r14)
            r14 = 1
            r1 = r2[r14]
            r13.setLongitude(r1)
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 == 0) goto L61
            r13.setAltitude(r6)
        L61:
            int r1 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r1 == 0) goto Lad
            int r1 = r3.hashCode()
            r2 = 75
            if (r1 == r2) goto L8a
            r2 = 77
            if (r1 == r2) goto L80
            r2 = 78
            if (r1 == r2) goto L76
            goto L92
        L76:
            java.lang.String r1 = "N"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L92
            r1 = r14
            goto L93
        L80:
            java.lang.String r1 = "M"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L92
            r1 = 0
            goto L93
        L8a:
            boolean r1 = r3.equals(r10)
            if (r1 == 0) goto L92
            r1 = 2
            goto L93
        L92:
            r1 = -1
        L93:
            if (r1 == 0) goto La1
            if (r1 == r14) goto L9c
            androidx.camera.core.impl.utils.h$d$a r1 = androidx.camera.core.impl.utils.C0679h.d.m3292a(r8)
            goto La5
        L9c:
            androidx.camera.core.impl.utils.h$d$a r1 = androidx.camera.core.impl.utils.C0679h.d.m3293b(r8)
            goto La5
        La1:
            androidx.camera.core.impl.utils.h$d$a r1 = androidx.camera.core.impl.utils.C0679h.d.m3294c(r8)
        La5:
            double r1 = r1.m3295a()
            float r1 = (float) r1
            r13.setSpeed(r1)
        Lad:
            r1 = -1
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 == 0) goto Lb6
            r13.setTime(r11)
        Lb6:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.C0679h.m3281l():android.location.Location");
    }

    /* renamed from: m */
    public int m3282m() {
        return this.f2954a.m6783h("Orientation", 0);
    }

    /* renamed from: n */
    public int m3283n() {
        switch (m3282m()) {
            case 3:
            case 4:
                return 180;
            case 5:
                return 270;
            case 6:
            case 7:
                return 90;
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* renamed from: o */
    public long m3284o() {
        long m3276s = m3276s(this.f2954a.m6781f("DateTimeOriginal"));
        if (m3276s == -1) {
            return -1L;
        }
        String m6781f = this.f2954a.m6781f("SubSecTimeOriginal");
        if (m6781f == null) {
            return m3276s;
        }
        try {
            long parseLong = Long.parseLong(m6781f);
            while (parseLong > 1000) {
                parseLong /= 10;
            }
            return m3276s + parseLong;
        } catch (NumberFormatException unused) {
            return m3276s;
        }
    }

    /* renamed from: p */
    public int m3285p() {
        return this.f2954a.m6783h("ImageWidth", 0);
    }

    /* renamed from: q */
    public boolean m3286q() {
        return m3282m() == 2;
    }

    /* renamed from: r */
    public boolean m3287r() {
        int m3282m = m3282m();
        return m3282m == 4 || m3282m == 5 || m3282m == 7;
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", Integer.valueOf(m3285p()), Integer.valueOf(m3280k()), Integer.valueOf(m3283n()), Boolean.valueOf(m3287r()), Boolean.valueOf(m3286q()), m3281l(), Long.valueOf(m3284o()), m3279j());
    }

    /* renamed from: u */
    public void m3288u(int i10) {
        C1239a c1239a;
        String valueOf;
        if (i10 % 90 != 0) {
            C12029o0.m38648k(f2948c, String.format(Locale.US, "Can only rotate in right angles (eg. 0, 90, 180, 270). %d is unsupported.", Integer.valueOf(i10)));
            c1239a = this.f2954a;
            valueOf = String.valueOf(0);
        } else {
            int i11 = i10 % 360;
            int m3282m = m3282m();
            while (i11 < 0) {
                i11 += 90;
                switch (m3282m) {
                    case 2:
                        m3282m = 5;
                        break;
                    case 3:
                    case 8:
                        m3282m = 6;
                        break;
                    case 4:
                        m3282m = 7;
                        break;
                    case 5:
                        m3282m = 4;
                        break;
                    case 6:
                        m3282m = 1;
                        break;
                    case 7:
                        m3282m = 2;
                        break;
                    default:
                        m3282m = 8;
                        break;
                }
            }
            while (i11 > 0) {
                i11 -= 90;
                switch (m3282m) {
                    case 2:
                        m3282m = 7;
                        break;
                    case 3:
                        m3282m = 8;
                        break;
                    case 4:
                        m3282m = 5;
                        break;
                    case 5:
                        m3282m = 2;
                        break;
                    case 6:
                        m3282m = 3;
                        break;
                    case 7:
                        m3282m = 4;
                        break;
                    case 8:
                        m3282m = 1;
                        break;
                    default:
                        m3282m = 6;
                        break;
                }
            }
            c1239a = this.f2954a;
            valueOf = String.valueOf(m3282m);
        }
        c1239a.m6779a0("Orientation", valueOf);
    }
}

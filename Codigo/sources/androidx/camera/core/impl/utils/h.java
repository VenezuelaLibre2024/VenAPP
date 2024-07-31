package androidx.camera.core.impl.utils;

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
import w.o0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    private static final String f2604c = "h";

    /* renamed from: d, reason: collision with root package name */
    private static final ThreadLocal<SimpleDateFormat> f2605d = new a();

    /* renamed from: e, reason: collision with root package name */
    private static final ThreadLocal<SimpleDateFormat> f2606e = new b();

    /* renamed from: f, reason: collision with root package name */
    private static final ThreadLocal<SimpleDateFormat> f2607f = new c();

    /* renamed from: g, reason: collision with root package name */
    private static final List<String> f2608g = i();

    /* renamed from: h, reason: collision with root package name */
    private static final List<String> f2609h = Arrays.asList("ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation");

    /* renamed from: a, reason: collision with root package name */
    private final androidx.exifinterface.media.a f2610a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f2611b = false;

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
    /* loaded from: classes.dex */
    public static final class d {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            final double f2612a;

            a(double d10) {
                this.f2612a = d10;
            }

            double a() {
                return this.f2612a / 2.23694d;
            }
        }

        static a a(double d10) {
            return new a(d10 * 0.621371d);
        }

        static a b(double d10) {
            return new a(d10 * 1.15078d);
        }

        static a c(double d10) {
            return new a(d10);
        }
    }

    private h(androidx.exifinterface.media.a aVar) {
        this.f2610a = aVar;
    }

    private static Date a(String str) {
        return f2605d.get().parse(str);
    }

    private static Date b(String str) {
        return f2607f.get().parse(str);
    }

    private static Date c(String str) {
        return f2606e.get().parse(str);
    }

    public static h e(File file) {
        return f(file.toString());
    }

    public static h f(String str) {
        return new h(new androidx.exifinterface.media.a(str));
    }

    public static h g(androidx.camera.core.o oVar) {
        ByteBuffer c10 = oVar.u0()[0].c();
        c10.rewind();
        byte[] bArr = new byte[c10.capacity()];
        c10.get(bArr);
        return h(new ByteArrayInputStream(bArr));
    }

    public static h h(InputStream inputStream) {
        return new h(new androidx.exifinterface.media.a(inputStream));
    }

    public static List<String> i() {
        return Arrays.asList("ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType");
    }

    private long s(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return b(str).getTime();
        } catch (ParseException unused) {
            return -1L;
        }
    }

    private long t(String str, String str2) {
        if (str == null && str2 == null) {
            return -1L;
        }
        if (str2 == null) {
            try {
                return a(str).getTime();
            } catch (ParseException unused) {
                return -1L;
            }
        }
        if (str == null) {
            try {
                return c(str2).getTime();
            } catch (ParseException unused2) {
                return -1L;
            }
        }
        return s(str + " " + str2);
    }

    public void d(h hVar) {
        ArrayList<String> arrayList = new ArrayList(f2608g);
        arrayList.removeAll(f2609h);
        for (String str : arrayList) {
            String f10 = this.f2610a.f(str);
            String f11 = hVar.f2610a.f(str);
            if (f10 != null && !f10.equals(f11)) {
                hVar.f2610a.a0(str, f10);
            }
        }
    }

    public String j() {
        return this.f2610a.f("ImageDescription");
    }

    public int k() {
        return this.f2610a.h("ImageLength", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.location.Location l() {
        /*
            r16 = this;
            r0 = r16
            androidx.exifinterface.media.a r1 = r0.f2610a
            java.lang.String r2 = "GPSProcessingMethod"
            java.lang.String r1 = r1.f(r2)
            androidx.exifinterface.media.a r2 = r0.f2610a
            double[] r2 = r2.l()
            androidx.exifinterface.media.a r3 = r0.f2610a
            r4 = 0
            double r6 = r3.e(r4)
            androidx.exifinterface.media.a r3 = r0.f2610a
            java.lang.String r8 = "GPSSpeed"
            double r8 = r3.g(r8, r4)
            androidx.exifinterface.media.a r3 = r0.f2610a
            java.lang.String r10 = "GPSSpeedRef"
            java.lang.String r3 = r3.f(r10)
            java.lang.String r10 = "K"
            if (r3 != 0) goto L2d
            r3 = r10
        L2d:
            androidx.exifinterface.media.a r11 = r0.f2610a
            java.lang.String r12 = "GPSDateStamp"
            java.lang.String r11 = r11.f(r12)
            androidx.exifinterface.media.a r12 = r0.f2610a
            java.lang.String r13 = "GPSTimeStamp"
            java.lang.String r12 = r12.f(r13)
            long r11 = r0.t(r11, r12)
            if (r2 != 0) goto L45
            r1 = 0
            return r1
        L45:
            if (r1 != 0) goto L49
            java.lang.String r1 = androidx.camera.core.impl.utils.h.f2604c
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
            androidx.camera.core.impl.utils.h$d$a r1 = androidx.camera.core.impl.utils.h.d.a(r8)
            goto La5
        L9c:
            androidx.camera.core.impl.utils.h$d$a r1 = androidx.camera.core.impl.utils.h.d.b(r8)
            goto La5
        La1:
            androidx.camera.core.impl.utils.h$d$a r1 = androidx.camera.core.impl.utils.h.d.c(r8)
        La5:
            double r1 = r1.a()
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.h.l():android.location.Location");
    }

    public int m() {
        return this.f2610a.h("Orientation", 0);
    }

    public int n() {
        switch (m()) {
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

    public long o() {
        long s10 = s(this.f2610a.f("DateTimeOriginal"));
        if (s10 == -1) {
            return -1L;
        }
        String f10 = this.f2610a.f("SubSecTimeOriginal");
        if (f10 == null) {
            return s10;
        }
        try {
            long parseLong = Long.parseLong(f10);
            while (parseLong > 1000) {
                parseLong /= 10;
            }
            return s10 + parseLong;
        } catch (NumberFormatException unused) {
            return s10;
        }
    }

    public int p() {
        return this.f2610a.h("ImageWidth", 0);
    }

    public boolean q() {
        return m() == 2;
    }

    public boolean r() {
        int m10 = m();
        return m10 == 4 || m10 == 5 || m10 == 7;
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", Integer.valueOf(p()), Integer.valueOf(k()), Integer.valueOf(n()), Boolean.valueOf(r()), Boolean.valueOf(q()), l(), Long.valueOf(o()), j());
    }

    public void u(int i10) {
        androidx.exifinterface.media.a aVar;
        String valueOf;
        if (i10 % 90 != 0) {
            o0.k(f2604c, String.format(Locale.US, "Can only rotate in right angles (eg. 0, 90, 180, 270). %d is unsupported.", Integer.valueOf(i10)));
            aVar = this.f2610a;
            valueOf = String.valueOf(0);
        } else {
            int i11 = i10 % 360;
            int m10 = m();
            while (i11 < 0) {
                i11 += 90;
                switch (m10) {
                    case 2:
                        m10 = 5;
                        break;
                    case 3:
                    case 8:
                        m10 = 6;
                        break;
                    case 4:
                        m10 = 7;
                        break;
                    case 5:
                        m10 = 4;
                        break;
                    case 6:
                        m10 = 1;
                        break;
                    case 7:
                        m10 = 2;
                        break;
                    default:
                        m10 = 8;
                        break;
                }
            }
            while (i11 > 0) {
                i11 -= 90;
                switch (m10) {
                    case 2:
                        m10 = 7;
                        break;
                    case 3:
                        m10 = 8;
                        break;
                    case 4:
                        m10 = 5;
                        break;
                    case 5:
                        m10 = 2;
                        break;
                    case 6:
                        m10 = 3;
                        break;
                    case 7:
                        m10 = 4;
                        break;
                    case 8:
                        m10 = 1;
                        break;
                    default:
                        m10 = 6;
                        break;
                }
            }
            aVar = this.f2610a;
            valueOf = String.valueOf(m10);
        }
        aVar.a0("Orientation", valueOf);
    }
}

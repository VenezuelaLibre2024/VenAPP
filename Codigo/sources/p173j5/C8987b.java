package p173j5;

import android.content.Context;
import android.util.Log;
import androidx.exifinterface.media.C1239a;
import fm.C7375a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: j5.b */
/* loaded from: classes.dex */
public class C8987b {

    /* renamed from: b */
    private static final List<String> f21536b = Arrays.asList("FNumber", "ExposureTime", "ISOSpeedRatings", "GPSAltitude", "GPSAltitudeRef", "FocalLength", "GPSDateStamp", "WhiteBalance", "GPSProcessingMethod", "GPSTimeStamp", "DateTime", "Flash", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "Make", "Model");

    /* renamed from: a */
    private final C1239a f21537a;

    public C8987b(String str) {
        this.f21537a = new C1239a(str);
    }

    public C8987b(byte[] bArr) {
        this.f21537a = new C1239a(new ByteArrayInputStream(bArr));
    }

    /* renamed from: a */
    private static void m26378a(C1239a c1239a, C1239a c1239a2) {
        Iterator<String> it = f21536b.iterator();
        while (it.hasNext()) {
            m26379b(c1239a, c1239a2, it.next());
        }
        try {
            c1239a2.m6778W();
        } catch (IOException unused) {
        }
    }

    /* renamed from: b */
    private static void m26379b(C1239a c1239a, C1239a c1239a2, String str) {
        if (c1239a.m6781f(str) != null) {
            c1239a2.m6779a0(str, c1239a.m6781f(str));
        }
    }

    /* renamed from: c */
    public ByteArrayOutputStream m26380c(Context context, ByteArrayOutputStream byteArrayOutputStream) {
        FileInputStream fileInputStream;
        Exception e10;
        FileOutputStream fileOutputStream;
        try {
            String uuid = UUID.randomUUID().toString();
            File file = new File(context.getCacheDir(), uuid + ".jpg");
            fileOutputStream = new FileOutputStream(file);
            try {
                C7375a.m22251e(byteArrayOutputStream.toByteArray(), fileOutputStream);
                fileOutputStream.close();
                C1239a c1239a = new C1239a(file.getAbsolutePath());
                m26378a(this.f21537a, c1239a);
                c1239a.m6778W();
                fileOutputStream.close();
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                fileInputStream = new FileInputStream(file);
                try {
                    C7375a.m22247a(fileInputStream, byteArrayOutputStream2);
                    fileInputStream.close();
                    return byteArrayOutputStream2;
                } catch (Exception e11) {
                    e10 = e11;
                    Log.e("ExifDataCopier", "Error preserving Exif data on selected image: " + e10);
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e12) {
                            e12.printStackTrace();
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e13) {
                            e13.printStackTrace();
                        }
                    }
                    return byteArrayOutputStream;
                }
            } catch (Exception e14) {
                fileInputStream = null;
                e10 = e14;
            }
        } catch (Exception e15) {
            fileInputStream = null;
            e10 = e15;
            fileOutputStream = null;
        }
    }
}

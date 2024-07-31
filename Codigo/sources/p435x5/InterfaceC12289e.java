package p435x5;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import androidx.exifinterface.media.C1239a;
import ck.C2028m;
import ck.C2037v;
import com.facebook.ads.AdError;
import dk.C7021m;
import dk.C7031r;
import dk.C7042z;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9319k;
import kotlin.jvm.internal.C9322n;
import kotlin.jvm.internal.C9332x;
import mk.C9601a;
import mk.C9602b;
import p024b6.C1662a;
import p280ok.InterfaceC9998l;
import p395v5.C11627a;
import p395v5.C11628b;
import p413w5.AbstractC12074e;
import p435x5.C12293i;
import p450xk.C12524p;
import p450xk.C12525q;

/* renamed from: x5.e */
/* loaded from: classes.dex */
public interface InterfaceC12289e {

    /* renamed from: a */
    public static final a f32929a = a.f32930a;

    /* renamed from: x5.e$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f32930a = new a();

        /* renamed from: b */
        private static final boolean f32931b;

        /* renamed from: c */
        private static final List<String> f32932c;

        /* renamed from: d */
        private static final List<String> f32933d;

        /* renamed from: e */
        private static final String[] f32934e;

        /* renamed from: f */
        private static final String[] f32935f;

        static {
            List<String> m20586n;
            List<String> m20586n2;
            int i10 = Build.VERSION.SDK_INT;
            f32931b = i10 >= 29;
            m20586n = C7031r.m20586n("_display_name", "_data", "_id", "title", "bucket_id", "bucket_display_name", "width", "height", "orientation", "date_added", "date_modified", "mime_type", "datetaken");
            if (i10 >= 29) {
                m20586n.add("datetaken");
            }
            f32932c = m20586n;
            m20586n2 = C7031r.m20586n("_display_name", "_data", "_id", "title", "bucket_id", "bucket_display_name", "date_added", "width", "height", "orientation", "date_modified", "mime_type", "duration");
            if (i10 >= 29) {
                m20586n2.add("datetaken");
            }
            f32933d = m20586n2;
            f32934e = new String[]{"media_type", "_display_name"};
            f32935f = new String[]{"bucket_id", "bucket_display_name"};
        }

        private a() {
        }

        /* renamed from: a */
        public final Uri m39634a() {
            Uri contentUri = MediaStore.Files.getContentUri("external");
            C9322n.m27780d(contentUri, "getContentUri(...)");
            return contentUri;
        }

        /* renamed from: b */
        public final String[] m39635b() {
            return f32935f;
        }

        /* renamed from: c */
        public final List<String> m39636c() {
            return f32932c;
        }

        /* renamed from: d */
        public final List<String> m39637d() {
            return f32933d;
        }

        /* renamed from: e */
        public final String[] m39638e() {
            return f32934e;
        }

        /* renamed from: f */
        public final boolean m39639f() {
            return f32931b;
        }
    }

    /* renamed from: x5.e$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: x5.e$b$a */
        /* loaded from: classes.dex */
        static final class a extends AbstractC9323o implements InterfaceC9998l<String, CharSequence> {

            /* renamed from: a */
            public static final a f32936a = new a();

            a() {
                super(1);
            }

            @Override // p280ok.InterfaceC9998l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(String it) {
                C9322n.m27781e(it, "it");
                return "?";
            }
        }

        /* renamed from: x5.e$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        /* synthetic */ class C13269b extends C9319k implements InterfaceC9998l<Object, C2037v> {
            C13269b(Object obj) {
                super(1, obj, C1662a.class, "info", "info(Ljava/lang/Object;)V", 0);
            }

            /* renamed from: a */
            public final void m39677a(Object obj) {
                C1662a.m9135d(obj);
            }

            @Override // p280ok.InterfaceC9998l
            public /* bridge */ /* synthetic */ C2037v invoke(Object obj) {
                m39677a(obj);
                return C2037v.f8089a;
            }
        }

        /* renamed from: x5.e$b$c */
        /* loaded from: classes.dex */
        /* synthetic */ class c extends C9319k implements InterfaceC9998l<Object, C2037v> {
            c(Object obj) {
                super(1, obj, C1662a.class, "error", "error(Ljava/lang/Object;)V", 0);
            }

            /* renamed from: a */
            public final void m39678a(Object obj) {
                C1662a.m9133b(obj);
            }

            @Override // p280ok.InterfaceC9998l
            public /* bridge */ /* synthetic */ C2037v invoke(Object obj) {
                m39678a(obj);
                return C2037v.f8089a;
            }
        }

        /* renamed from: A */
        public static void m39640A(InterfaceC12289e interfaceC12289e, Context context, String id2) {
            String m41085h0;
            C9322n.m27781e(context, "context");
            C9322n.m27781e(id2, "id");
            if (C1662a.f7047a.m9137e()) {
                m41085h0 = C12525q.m41085h0("", 40, '-');
                C1662a.m9135d("log error row " + id2 + " start " + m41085h0);
                ContentResolver contentResolver = context.getContentResolver();
                C9322n.m27780d(contentResolver, "getContentResolver(...)");
                Cursor mo39602q = interfaceC12289e.mo39602q(contentResolver, interfaceC12289e.mo39601p(), null, "_id = ?", new String[]{id2}, null);
                if (mo39602q != null) {
                    try {
                        String[] columnNames = mo39602q.getColumnNames();
                        if (mo39602q.moveToNext()) {
                            C9322n.m27778b(columnNames);
                            int length = columnNames.length;
                            for (int i10 = 0; i10 < length; i10++) {
                                C1662a.m9135d(columnNames[i10] + " : " + mo39602q.getString(i10));
                            }
                        }
                        C2037v c2037v = C2037v.f8089a;
                        C9602b.m28593a(mo39602q, null);
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            C9602b.m28593a(mo39602q, th2);
                            throw th3;
                        }
                    }
                }
                C1662a.m9135d("log error row " + id2 + " end " + m41085h0);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v0, types: [T, java.io.FileInputStream] */
        /* renamed from: B */
        public static C11627a m39641B(InterfaceC12289e interfaceC12289e, Context context, String fromPath, String title, String desc, String str) {
            C2028m c2028m;
            C2028m c2028m2;
            int i10;
            double[] dArr;
            C9332x c9332x;
            boolean z10;
            double m20492t;
            double m20467T;
            C9322n.m27781e(context, "context");
            C9322n.m27781e(fromPath, "fromPath");
            C9322n.m27781e(title, "title");
            C9322n.m27781e(desc, "desc");
            C12286b.m39615a(fromPath);
            File file = new File(fromPath);
            C9332x c9332x2 = new C9332x();
            c9332x2.f22581a = new FileInputStream(file);
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = AdError.NETWORK_ERROR_CODE;
            long j11 = currentTimeMillis / j10;
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream((InputStream) c9332x2.f22581a);
                c2028m = new C2028m(Integer.valueOf(decodeStream.getWidth()), Integer.valueOf(decodeStream.getHeight()));
            } catch (Exception unused) {
                c2028m = new C2028m(0, 0);
            }
            int intValue = ((Number) c2028m.m10335a()).intValue();
            int intValue2 = ((Number) c2028m.m10336b()).intValue();
            String guessContentTypeFromName = URLConnection.guessContentTypeFromName(title);
            if (guessContentTypeFromName == null && (guessContentTypeFromName = URLConnection.guessContentTypeFromName(fromPath)) == null) {
                guessContentTypeFromName = URLConnection.guessContentTypeFromStream((InputStream) c9332x2.f22581a);
            }
            if (guessContentTypeFromName == null) {
                guessContentTypeFromName = "image/*";
            }
            try {
                C1239a c1239a = new C1239a((InputStream) c9332x2.f22581a);
                a aVar = InterfaceC12289e.f32929a;
                c2028m2 = new C2028m(Integer.valueOf(aVar.m39639f() ? c1239a.m6785r() : 0), aVar.m39639f() ? null : c1239a.m6784l());
            } catch (Exception unused2) {
                c2028m2 = new C2028m(0, null);
            }
            int intValue3 = ((Number) c2028m2.m10335a()).intValue();
            double[] dArr2 = (double[]) c2028m2.m10336b();
            m39644E(c9332x2, file);
            a aVar2 = InterfaceC12289e.f32929a;
            if (aVar2.m39639f()) {
                i10 = intValue3;
                dArr = dArr2;
                c9332x = c9332x2;
                z10 = false;
            } else {
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                String absolutePath = file.getAbsolutePath();
                c9332x = c9332x2;
                C9322n.m27780d(absolutePath, "getAbsolutePath(...)");
                String path = externalStorageDirectory.getPath();
                dArr = dArr2;
                C9322n.m27780d(path, "getPath(...)");
                i10 = intValue3;
                z10 = C12524p.m41031E(absolutePath, path, false, 2, null);
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("media_type", (Integer) 1);
            contentValues.put("description", desc);
            contentValues.put("_display_name", title);
            contentValues.put("mime_type", guessContentTypeFromName);
            contentValues.put("title", title);
            contentValues.put("date_added", Long.valueOf(j11));
            contentValues.put("date_modified", Long.valueOf(j11));
            contentValues.put("width", Integer.valueOf(intValue));
            contentValues.put("height", Integer.valueOf(intValue2));
            if (aVar2.m39639f()) {
                contentValues.put("datetaken", Long.valueOf(j11 * j10));
                contentValues.put("orientation", Integer.valueOf(i10));
                if (str != null) {
                    contentValues.put("relative_path", str);
                }
            }
            if (dArr != null) {
                m20492t = C7021m.m20492t(dArr);
                contentValues.put("latitude", Double.valueOf(m20492t));
                m20467T = C7021m.m20467T(dArr);
                contentValues.put("longitude", Double.valueOf(m20467T));
            }
            if (z10) {
                contentValues.put("_data", fromPath);
            }
            InputStream inputStream = (InputStream) c9332x.f22581a;
            Uri EXTERNAL_CONTENT_URI = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            C9322n.m27780d(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
            return m39672w(interfaceC12289e, context, inputStream, EXTERNAL_CONTENT_URI, contentValues, z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v0, types: [java.io.ByteArrayInputStream, T] */
        /* renamed from: C */
        public static C11627a m39642C(InterfaceC12289e interfaceC12289e, Context context, byte[] bytes, String title, String desc, String str) {
            C2028m c2028m;
            C2028m c2028m2;
            double m20492t;
            double m20467T;
            C9322n.m27781e(context, "context");
            C9322n.m27781e(bytes, "bytes");
            C9322n.m27781e(title, "title");
            C9322n.m27781e(desc, "desc");
            C9332x c9332x = new C9332x();
            c9332x.f22581a = new ByteArrayInputStream(bytes);
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = AdError.NETWORK_ERROR_CODE;
            long j11 = currentTimeMillis / j10;
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream((InputStream) c9332x.f22581a);
                c2028m = new C2028m(Integer.valueOf(decodeStream.getWidth()), Integer.valueOf(decodeStream.getHeight()));
            } catch (Exception unused) {
                c2028m = new C2028m(0, 0);
            }
            int intValue = ((Number) c2028m.m10335a()).intValue();
            int intValue2 = ((Number) c2028m.m10336b()).intValue();
            String guessContentTypeFromName = URLConnection.guessContentTypeFromName(title);
            if (guessContentTypeFromName == null) {
                guessContentTypeFromName = URLConnection.guessContentTypeFromStream((InputStream) c9332x.f22581a);
            }
            if (guessContentTypeFromName == null) {
                guessContentTypeFromName = "image/*";
            }
            try {
                C1239a c1239a = new C1239a((InputStream) c9332x.f22581a);
                a aVar = InterfaceC12289e.f32929a;
                c2028m2 = new C2028m(Integer.valueOf(aVar.m39639f() ? c1239a.m6785r() : 0), aVar.m39639f() ? null : c1239a.m6784l());
            } catch (Exception unused2) {
                c2028m2 = new C2028m(0, null);
            }
            int intValue3 = ((Number) c2028m2.m10335a()).intValue();
            double[] dArr = (double[]) c2028m2.m10336b();
            m39643D(c9332x, bytes);
            ContentValues contentValues = new ContentValues();
            contentValues.put("media_type", (Integer) 1);
            contentValues.put("description", desc);
            contentValues.put("_display_name", title);
            contentValues.put("mime_type", guessContentTypeFromName);
            contentValues.put("title", title);
            contentValues.put("date_added", Long.valueOf(j11));
            contentValues.put("date_modified", Long.valueOf(j11));
            contentValues.put("width", Integer.valueOf(intValue));
            contentValues.put("height", Integer.valueOf(intValue2));
            if (InterfaceC12289e.f32929a.m39639f()) {
                contentValues.put("datetaken", Long.valueOf(j11 * j10));
                contentValues.put("orientation", Integer.valueOf(intValue3));
                if (str != null) {
                    contentValues.put("relative_path", str);
                }
            }
            if (dArr != null) {
                m20492t = C7021m.m20492t(dArr);
                contentValues.put("latitude", Double.valueOf(m20492t));
                m20467T = C7021m.m20467T(dArr);
                contentValues.put("longitude", Double.valueOf(m20467T));
            }
            InputStream inputStream = (InputStream) c9332x.f22581a;
            Uri EXTERNAL_CONTENT_URI = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            C9322n.m27780d(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
            return m39673x(interfaceC12289e, context, inputStream, EXTERNAL_CONTENT_URI, contentValues, false, 16, null);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.io.ByteArrayInputStream, T] */
        /* renamed from: D */
        private static void m39643D(C9332x<ByteArrayInputStream> c9332x, byte[] bArr) {
            c9332x.f22581a = new ByteArrayInputStream(bArr);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.io.FileInputStream] */
        /* renamed from: E */
        private static void m39644E(C9332x<FileInputStream> c9332x, File file) {
            c9332x.f22581a = new FileInputStream(file);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v0, types: [T, java.io.FileInputStream] */
        /* renamed from: F */
        public static C11627a m39645F(InterfaceC12289e interfaceC12289e, Context context, String fromPath, String title, String desc, String str) {
            C2028m c2028m;
            C9332x c9332x;
            double[] dArr;
            boolean z10;
            double m20492t;
            double m20467T;
            C9322n.m27781e(context, "context");
            C9322n.m27781e(fromPath, "fromPath");
            C9322n.m27781e(title, "title");
            C9322n.m27781e(desc, "desc");
            C12286b.m39615a(fromPath);
            File file = new File(fromPath);
            C9332x c9332x2 = new C9332x();
            c9332x2.f22581a = new FileInputStream(file);
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = AdError.NETWORK_ERROR_CODE;
            long j11 = currentTimeMillis / j10;
            C12293i.a m39690b = C12293i.f32940a.m39690b(fromPath);
            String guessContentTypeFromName = URLConnection.guessContentTypeFromName(title);
            if (guessContentTypeFromName == null) {
                guessContentTypeFromName = URLConnection.guessContentTypeFromName(fromPath);
            }
            if (guessContentTypeFromName == null) {
                guessContentTypeFromName = "video/*";
            }
            try {
                C1239a c1239a = new C1239a((InputStream) c9332x2.f22581a);
                a aVar = InterfaceC12289e.f32929a;
                c2028m = new C2028m(Integer.valueOf(aVar.m39639f() ? c1239a.m6785r() : 0), aVar.m39639f() ? null : c1239a.m6784l());
            } catch (Exception unused) {
                c2028m = new C2028m(0, null);
            }
            int intValue = ((Number) c2028m.m10335a()).intValue();
            double[] dArr2 = (double[]) c2028m.m10336b();
            m39646G(c9332x2, file);
            a aVar2 = InterfaceC12289e.f32929a;
            if (aVar2.m39639f()) {
                c9332x = c9332x2;
                dArr = dArr2;
                z10 = false;
            } else {
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                String absolutePath = file.getAbsolutePath();
                c9332x = c9332x2;
                C9322n.m27780d(absolutePath, "getAbsolutePath(...)");
                String path = externalStorageDirectory.getPath();
                C9322n.m27780d(path, "getPath(...)");
                dArr = dArr2;
                z10 = C12524p.m41031E(absolutePath, path, false, 2, null);
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("media_type", (Integer) 3);
            contentValues.put("description", desc);
            contentValues.put("title", title);
            contentValues.put("_display_name", title);
            contentValues.put("mime_type", guessContentTypeFromName);
            contentValues.put("date_added", Long.valueOf(j11));
            contentValues.put("date_modified", Long.valueOf(j11));
            contentValues.put("duration", m39690b.m39691a());
            contentValues.put("width", m39690b.m39693c());
            contentValues.put("height", m39690b.m39692b());
            if (aVar2.m39639f()) {
                contentValues.put("datetaken", Long.valueOf(j11 * j10));
                contentValues.put("orientation", Integer.valueOf(intValue));
                if (str != null) {
                    contentValues.put("relative_path", str);
                }
            }
            if (dArr != null) {
                m20492t = C7021m.m20492t(dArr);
                contentValues.put("latitude", Double.valueOf(m20492t));
                m20467T = C7021m.m20467T(dArr);
                contentValues.put("longitude", Double.valueOf(m20467T));
            }
            if (z10) {
                contentValues.put("_data", fromPath);
            }
            InputStream inputStream = (InputStream) c9332x.f22581a;
            Uri EXTERNAL_CONTENT_URI = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            C9322n.m27780d(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
            return m39672w(interfaceC12289e, context, inputStream, EXTERNAL_CONTENT_URI, contentValues, z10);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.io.FileInputStream] */
        /* renamed from: G */
        private static void m39646G(C9332x<FileInputStream> c9332x, File file) {
            c9332x.f22581a = new FileInputStream(file);
        }

        /* renamed from: H */
        public static Void m39647H(InterfaceC12289e interfaceC12289e, String msg) {
            C9322n.m27781e(msg, "msg");
            throw new RuntimeException(msg);
        }

        /* renamed from: I */
        public static C11627a m39648I(InterfaceC12289e interfaceC12289e, Cursor receiver, Context context, boolean z10) {
            long mo39607v;
            boolean m41059J;
            boolean m41039t;
            C9322n.m27781e(receiver, "$receiver");
            C9322n.m27781e(context, "context");
            String mo39611z = interfaceC12289e.mo39611z(receiver, "_data");
            if (z10) {
                m41039t = C12524p.m41039t(mo39611z);
                if ((!m41039t) && !new File(mo39611z).exists()) {
                    return null;
                }
            }
            long mo39607v2 = interfaceC12289e.mo39607v(receiver, "_id");
            a aVar = InterfaceC12289e.f32929a;
            if (aVar.m39639f()) {
                mo39607v = interfaceC12289e.mo39607v(receiver, "datetaken") / AdError.NETWORK_ERROR_CODE;
                if (mo39607v == 0) {
                    mo39607v = interfaceC12289e.mo39607v(receiver, "date_added");
                }
            } else {
                mo39607v = interfaceC12289e.mo39607v(receiver, "date_added");
            }
            int mo39596k = interfaceC12289e.mo39596k(receiver, "media_type");
            String mo39611z2 = interfaceC12289e.mo39611z(receiver, "mime_type");
            long mo39607v3 = mo39596k == 1 ? 0L : interfaceC12289e.mo39607v(receiver, "duration");
            int mo39596k2 = interfaceC12289e.mo39596k(receiver, "width");
            int mo39596k3 = interfaceC12289e.mo39596k(receiver, "height");
            String mo39611z3 = interfaceC12289e.mo39611z(receiver, "_display_name");
            long mo39607v4 = interfaceC12289e.mo39607v(receiver, "date_modified");
            int mo39596k4 = interfaceC12289e.mo39596k(receiver, "orientation");
            String mo39611z4 = aVar.m39639f() ? interfaceC12289e.mo39611z(receiver, "relative_path") : null;
            if (mo39596k2 == 0 || mo39596k3 == 0) {
                if (mo39596k == 1) {
                    try {
                        m41059J = C12525q.m41059J(mo39611z2, "svg", false, 2, null);
                        if (!m41059J) {
                            InputStream openInputStream = context.getContentResolver().openInputStream(m39670u(interfaceC12289e, mo39607v2, interfaceC12289e.mo39571A(mo39596k), false, 4, null));
                            if (openInputStream != null) {
                                try {
                                    C1239a c1239a = new C1239a(openInputStream);
                                    String m6781f = c1239a.m6781f("ImageWidth");
                                    if (m6781f != null) {
                                        C9322n.m27778b(m6781f);
                                        mo39596k2 = Integer.parseInt(m6781f);
                                    }
                                    String m6781f2 = c1239a.m6781f("ImageLength");
                                    if (m6781f2 != null) {
                                        C9322n.m27778b(m6781f2);
                                        mo39596k3 = Integer.parseInt(m6781f2);
                                    }
                                    C9602b.m28593a(openInputStream, null);
                                } finally {
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        C1662a.m9133b(th2);
                    }
                }
                if (mo39596k == 3) {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(mo39611z);
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    mo39596k2 = extractMetadata != null ? Integer.parseInt(extractMetadata) : 0;
                    String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    mo39596k3 = extractMetadata2 != null ? Integer.parseInt(extractMetadata2) : 0;
                    String extractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                    if (extractMetadata3 != null) {
                        mo39596k4 = Integer.parseInt(extractMetadata3);
                    }
                    if (aVar.m39639f()) {
                        mediaMetadataRetriever.close();
                    } else {
                        mediaMetadataRetriever.release();
                    }
                }
            }
            return new C11627a(mo39607v2, mo39611z, mo39607v3, mo39607v, mo39596k2, mo39596k3, interfaceC12289e.mo39571A(mo39596k), mo39611z3, mo39607v4, mo39596k4, null, null, mo39611z4, mo39611z2, 3072, null);
        }

        /* renamed from: J */
        public static /* synthetic */ C11627a m39649J(InterfaceC12289e interfaceC12289e, Cursor cursor, Context context, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toAssetEntity");
            }
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            return interfaceC12289e.mo39593h(cursor, context, z10);
        }

        /* renamed from: a */
        public static boolean m39650a(InterfaceC12289e interfaceC12289e, Context context, String id2) {
            C9322n.m27781e(context, "context");
            C9322n.m27781e(id2, "id");
            ContentResolver contentResolver = context.getContentResolver();
            C9322n.m27780d(contentResolver, "getContentResolver(...)");
            Cursor mo39602q = interfaceC12289e.mo39602q(contentResolver, interfaceC12289e.mo39601p(), new String[]{"_id"}, "_id = ?", new String[]{id2}, null);
            if (mo39602q == null) {
                C9602b.m28593a(mo39602q, null);
                return false;
            }
            try {
                boolean z10 = mo39602q.getCount() >= 1;
                C9602b.m28593a(mo39602q, null);
                return z10;
            } finally {
            }
        }

        /* renamed from: b */
        public static void m39651b(InterfaceC12289e interfaceC12289e, Context context) {
            C9322n.m27781e(context, "context");
        }

        /* renamed from: c */
        public static int m39652c(InterfaceC12289e interfaceC12289e, int i10) {
            return C12290f.f32937a.m39679a(i10);
        }

        /* renamed from: d */
        public static Uri m39653d(InterfaceC12289e interfaceC12289e) {
            return InterfaceC12289e.f32929a.m39634a();
        }

        /* renamed from: e */
        public static int m39654e(InterfaceC12289e interfaceC12289e, Context context, AbstractC12074e option, int i10) {
            C9322n.m27781e(context, "context");
            C9322n.m27781e(option, "option");
            ContentResolver contentResolver = context.getContentResolver();
            ArrayList<String> arrayList = new ArrayList<>();
            int i11 = 0;
            String mo38755b = option.mo38755b(i10, arrayList, false);
            String mo38756d = option.mo38756d();
            C9322n.m27778b(contentResolver);
            Cursor mo39602q = interfaceC12289e.mo39602q(contentResolver, interfaceC12289e.mo39601p(), new String[]{"_id"}, mo38755b, (String[]) arrayList.toArray(new String[0]), mo38756d);
            if (mo39602q != null) {
                try {
                    i11 = mo39602q.getCount();
                } finally {
                }
            }
            C9602b.m28593a(mo39602q, null);
            return i11;
        }

        /* renamed from: f */
        public static /* synthetic */ C11627a m39655f(InterfaceC12289e interfaceC12289e, Context context, String str, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAssetEntity");
            }
            if ((i10 & 4) != 0) {
                z10 = true;
            }
            return interfaceC12289e.mo39589d(context, str, z10);
        }

        /* renamed from: g */
        public static List<C11627a> m39656g(InterfaceC12289e interfaceC12289e, Context context, AbstractC12074e option, int i10, int i11, int i12) {
            List<C11627a> m20582j;
            C9322n.m27781e(context, "context");
            C9322n.m27781e(option, "option");
            ContentResolver contentResolver = context.getContentResolver();
            ArrayList<String> arrayList = new ArrayList<>();
            String mo38755b = option.mo38755b(i12, arrayList, false);
            String mo38756d = option.mo38756d();
            C9322n.m27778b(contentResolver);
            Cursor mo39602q = interfaceC12289e.mo39602q(contentResolver, interfaceC12289e.mo39601p(), interfaceC12289e.mo39592g(), mo38755b, (String[]) arrayList.toArray(new String[0]), mo38756d);
            if (mo39602q == null) {
                m20582j = C7031r.m20582j();
                return m20582j;
            }
            try {
                ArrayList arrayList2 = new ArrayList();
                mo39602q.moveToPosition(i10 - 1);
                while (mo39602q.moveToNext()) {
                    C11627a mo39593h = interfaceC12289e.mo39593h(mo39602q, context, false);
                    if (mo39593h != null) {
                        arrayList2.add(mo39593h);
                        if (arrayList2.size() == i11 - i10) {
                            break;
                        }
                    }
                }
                C9602b.m28593a(mo39602q, null);
                return arrayList2;
            } finally {
            }
        }

        /* renamed from: h */
        public static List<String> m39657h(InterfaceC12289e interfaceC12289e, Context context, List<String> ids) {
            String m20611M;
            List<String> m20582j;
            C9322n.m27781e(context, "context");
            C9322n.m27781e(ids, "ids");
            List<String> list = ids;
            int i10 = 0;
            if (list.size() > 500) {
                ArrayList arrayList = new ArrayList();
                int size = list.size();
                int i11 = size / 500;
                if (size % 500 != 0) {
                    i11++;
                }
                while (i10 < i11) {
                    arrayList.addAll(interfaceC12289e.mo39598m(context, ids.subList(i10 * 500, i10 == i11 + (-1) ? list.size() : ((i10 + 1) * 500) - 1)));
                    i10++;
                }
                return arrayList;
            }
            m20611M = C7042z.m20611M(ids, ",", null, null, 0, null, a.f32936a, 30, null);
            String str = "_id in (" + m20611M + ')';
            ContentResolver contentResolver = context.getContentResolver();
            C9322n.m27780d(contentResolver, "getContentResolver(...)");
            Cursor mo39602q = interfaceC12289e.mo39602q(contentResolver, interfaceC12289e.mo39601p(), new String[]{"_id", "media_type", "_data"}, str, (String[]) list.toArray(new String[0]), null);
            if (mo39602q == null) {
                m20582j = C7031r.m20582j();
                return m20582j;
            }
            ArrayList arrayList2 = new ArrayList();
            HashMap hashMap = new HashMap();
            while (mo39602q.moveToNext()) {
                try {
                    hashMap.put(interfaceC12289e.mo39611z(mo39602q, "_id"), interfaceC12289e.mo39611z(mo39602q, "_data"));
                } finally {
                }
            }
            C2037v c2037v = C2037v.f8089a;
            C9602b.m28593a(mo39602q, null);
            Iterator<String> it = ids.iterator();
            while (it.hasNext()) {
                String str2 = (String) hashMap.get(it.next());
                if (str2 != null) {
                    arrayList2.add(str2);
                }
            }
            return arrayList2;
        }

        /* renamed from: i */
        public static List<String> m39658i(InterfaceC12289e interfaceC12289e, Context context) {
            List<String> m20478e0;
            List<String> m20582j;
            C9322n.m27781e(context, "context");
            ContentResolver contentResolver = context.getContentResolver();
            C9322n.m27778b(contentResolver);
            Cursor mo39602q = interfaceC12289e.mo39602q(contentResolver, interfaceC12289e.mo39601p(), null, null, null, null);
            if (mo39602q == null) {
                m20582j = C7031r.m20582j();
                return m20582j;
            }
            try {
                String[] columnNames = mo39602q.getColumnNames();
                C9322n.m27780d(columnNames, "getColumnNames(...)");
                m20478e0 = C7021m.m20478e0(columnNames);
                C9602b.m28593a(mo39602q, null);
                return m20478e0;
            } finally {
            }
        }

        /* renamed from: j */
        public static String m39659j(InterfaceC12289e interfaceC12289e) {
            return "_id = ?";
        }

        /* renamed from: k */
        public static int m39660k(InterfaceC12289e interfaceC12289e, Cursor receiver, String columnName) {
            C9322n.m27781e(receiver, "$receiver");
            C9322n.m27781e(columnName, "columnName");
            return receiver.getInt(receiver.getColumnIndex(columnName));
        }

        /* renamed from: l */
        public static long m39661l(InterfaceC12289e interfaceC12289e, Cursor receiver, String columnName) {
            C9322n.m27781e(receiver, "$receiver");
            C9322n.m27781e(columnName, "columnName");
            return receiver.getLong(receiver.getColumnIndex(columnName));
        }

        /* renamed from: m */
        public static int m39662m(InterfaceC12289e interfaceC12289e, int i10) {
            if (i10 == 1) {
                return 1;
            }
            if (i10 != 2) {
                return i10 != 3 ? 0 : 2;
            }
            return 3;
        }

        /* renamed from: n */
        public static String m39663n(InterfaceC12289e interfaceC12289e, Context context, long j10, int i10) {
            C9322n.m27781e(context, "context");
            String uri = interfaceC12289e.mo39603r(j10, i10, false).toString();
            C9322n.m27780d(uri, "toString(...)");
            return uri;
        }

        /* renamed from: o */
        public static Long m39664o(InterfaceC12289e interfaceC12289e, Context context, String pathId) {
            C9322n.m27781e(context, "context");
            C9322n.m27781e(pathId, "pathId");
            String[] strArr = {"date_modified"};
            boolean m27777a = C9322n.m27777a(pathId, "isAll");
            ContentResolver contentResolver = context.getContentResolver();
            C9322n.m27780d(contentResolver, "getContentResolver(...)");
            Uri mo39601p = interfaceC12289e.mo39601p();
            Cursor mo39602q = m27777a ? interfaceC12289e.mo39602q(contentResolver, mo39601p, strArr, null, null, "date_modified desc") : interfaceC12289e.mo39602q(contentResolver, mo39601p, strArr, "bucket_id = ?", new String[]{pathId}, "date_modified desc");
            if (mo39602q == null) {
                return null;
            }
            try {
                if (mo39602q.moveToNext()) {
                    Long valueOf = Long.valueOf(interfaceC12289e.mo39607v(mo39602q, "date_modified"));
                    C9602b.m28593a(mo39602q, null);
                    return valueOf;
                }
                C2037v c2037v = C2037v.f8089a;
                C9602b.m28593a(mo39602q, null);
                return null;
            } finally {
            }
        }

        /* renamed from: p */
        public static String m39665p(InterfaceC12289e interfaceC12289e, int i10, int i11, AbstractC12074e filterOption) {
            C9322n.m27781e(filterOption, "filterOption");
            return filterOption.mo38756d() + " LIMIT " + i11 + " OFFSET " + i10;
        }

        /* renamed from: q */
        public static String m39666q(InterfaceC12289e interfaceC12289e, Cursor receiver, String columnName) {
            C9322n.m27781e(receiver, "$receiver");
            C9322n.m27781e(columnName, "columnName");
            String string = receiver.getString(receiver.getColumnIndex(columnName));
            return string == null ? "" : string;
        }

        /* renamed from: r */
        public static String m39667r(InterfaceC12289e interfaceC12289e, Cursor receiver, String columnName) {
            C9322n.m27781e(receiver, "$receiver");
            C9322n.m27781e(columnName, "columnName");
            return receiver.getString(receiver.getColumnIndex(columnName));
        }

        /* renamed from: s */
        public static int m39668s(InterfaceC12289e interfaceC12289e, int i10) {
            if (i10 == 1) {
                return 1;
            }
            if (i10 != 2) {
                return i10 != 3 ? 0 : 2;
            }
            return 3;
        }

        /* renamed from: t */
        public static Uri m39669t(InterfaceC12289e interfaceC12289e, long j10, int i10, boolean z10) {
            Uri uri;
            Uri requireOriginal;
            if (i10 == 1) {
                uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            } else if (i10 == 2) {
                uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            } else {
                if (i10 != 3) {
                    Uri EMPTY = Uri.EMPTY;
                    C9322n.m27780d(EMPTY, "EMPTY");
                    return EMPTY;
                }
                uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            }
            Uri withAppendedId = ContentUris.withAppendedId(uri, j10);
            C9322n.m27778b(withAppendedId);
            if (!z10) {
                return withAppendedId;
            }
            requireOriginal = MediaStore.setRequireOriginal(withAppendedId);
            C9322n.m27780d(requireOriginal, "setRequireOriginal(...)");
            return requireOriginal;
        }

        /* renamed from: u */
        public static /* synthetic */ Uri m39670u(InterfaceC12289e interfaceC12289e, long j10, int i10, boolean z10, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUri");
            }
            if ((i11 & 4) != 0) {
                z10 = false;
            }
            return interfaceC12289e.mo39603r(j10, i10, z10);
        }

        /* renamed from: v */
        public static void m39671v(InterfaceC12289e interfaceC12289e, Context context, C11628b entity) {
            C9322n.m27781e(context, "context");
            C9322n.m27781e(entity, "entity");
            Long mo39588c = interfaceC12289e.mo39588c(context, entity.m36444b());
            if (mo39588c != null) {
                entity.m36448f(Long.valueOf(mo39588c.longValue()));
            }
        }

        /* renamed from: w */
        private static C11627a m39672w(InterfaceC12289e interfaceC12289e, Context context, InputStream inputStream, Uri uri, ContentValues contentValues, boolean z10) {
            ContentResolver contentResolver = context.getContentResolver();
            Uri insert = contentResolver.insert(uri, contentValues);
            if (insert == null) {
                throw new RuntimeException("Cannot insert the new asset.");
            }
            long parseId = ContentUris.parseId(insert);
            if (!z10) {
                OutputStream openOutputStream = contentResolver.openOutputStream(insert);
                if (openOutputStream == null) {
                    throw new RuntimeException("Cannot open the output stream for " + insert + '.');
                }
                try {
                    try {
                        C9601a.m28591b(inputStream, openOutputStream, 0, 2, null);
                        C9602b.m28593a(inputStream, null);
                        C9602b.m28593a(openOutputStream, null);
                    } finally {
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        C9602b.m28593a(openOutputStream, th2);
                        throw th3;
                    }
                }
            }
            contentResolver.notifyChange(insert, null);
            return m39655f(interfaceC12289e, context, String.valueOf(parseId), false, 4, null);
        }

        /* renamed from: x */
        public static /* synthetic */ C11627a m39673x(InterfaceC12289e interfaceC12289e, Context context, InputStream inputStream, Uri uri, ContentValues contentValues, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: insertUri");
            }
            if ((i10 & 16) != 0) {
                z10 = false;
            }
            return m39672w(interfaceC12289e, context, inputStream, uri, contentValues, z10);
        }

        /* renamed from: y */
        public static Cursor m39674y(InterfaceC12289e interfaceC12289e, ContentResolver receiver, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
            C9322n.m27781e(receiver, "$receiver");
            C9322n.m27781e(uri, "uri");
            try {
                Cursor query = receiver.query(uri, strArr, str, strArr2, str2);
                m39675z(uri, strArr, str, strArr2, str2, new C13269b(C1662a.f7047a));
                return query;
            } catch (Exception e10) {
                m39675z(uri, strArr, str, strArr2, str2, new c(C1662a.f7047a));
                C1662a.m9134c("happen query error", e10);
                throw e10;
            }
        }

        /* renamed from: z */
        private static void m39675z(Uri uri, String[] strArr, String str, String[] strArr2, String str2, InterfaceC9998l<? super String, C2037v> interfaceC9998l) {
            if (C1662a.f7047a.m9137e()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("uri: " + uri);
                C9322n.m27780d(sb2, "append(value)");
                sb2.append('\n');
                C9322n.m27780d(sb2, "append('\\n')");
                StringBuilder sb3 = new StringBuilder();
                sb3.append("projection: ");
                sb3.append(strArr != null ? C7021m.m20465R(strArr, ", ", null, null, 0, null, null, 62, null) : null);
                sb2.append(sb3.toString());
                C9322n.m27780d(sb2, "append(value)");
                sb2.append('\n');
                C9322n.m27780d(sb2, "append('\\n')");
                sb2.append("selection: " + str);
                C9322n.m27780d(sb2, "append(value)");
                sb2.append('\n');
                C9322n.m27780d(sb2, "append('\\n')");
                StringBuilder sb4 = new StringBuilder();
                sb4.append("selectionArgs: ");
                sb4.append(strArr2 != null ? C7021m.m20465R(strArr2, ", ", null, null, 0, null, null, 62, null) : null);
                sb2.append(sb4.toString());
                C9322n.m27780d(sb2, "append(value)");
                sb2.append('\n');
                C9322n.m27780d(sb2, "append('\\n')");
                sb2.append("sortOrder: " + str2);
                C9322n.m27780d(sb2, "append(value)");
                sb2.append('\n');
                C9322n.m27780d(sb2, "append('\\n')");
                String sb5 = sb2.toString();
                C9322n.m27780d(sb5, "toString(...)");
                interfaceC9998l.invoke(sb5);
            }
        }
    }

    /* renamed from: A */
    int mo39571A(int i10);

    /* renamed from: B */
    String mo39572B(Context context, String str, boolean z10);

    /* renamed from: C */
    C11627a mo39573C(Context context, String str, String str2, String str3, String str4);

    /* renamed from: D */
    C11628b mo39574D(Context context, String str, int i10, AbstractC12074e abstractC12074e);

    /* renamed from: E */
    C1239a mo39575E(Context context, String str);

    /* renamed from: F */
    int mo39576F(Context context, AbstractC12074e abstractC12074e, int i10);

    /* renamed from: G */
    C11627a mo39577G(Context context, String str, String str2);

    /* renamed from: H */
    String mo39578H(Context context, long j10, int i10);

    /* renamed from: a */
    List<C11627a> mo39586a(Context context, String str, int i10, int i11, int i12, AbstractC12074e abstractC12074e);

    /* renamed from: b */
    boolean mo39587b(Context context, String str);

    /* renamed from: c */
    Long mo39588c(Context context, String str);

    /* renamed from: d */
    C11627a mo39589d(Context context, String str, boolean z10);

    /* renamed from: e */
    boolean mo39590e(Context context);

    /* renamed from: f */
    C11627a mo39591f(Context context, byte[] bArr, String str, String str2, String str3);

    /* renamed from: g */
    String[] mo39592g();

    /* renamed from: h */
    C11627a mo39593h(Cursor cursor, Context context, boolean z10);

    /* renamed from: i */
    void mo39594i(Context context, C11628b c11628b);

    /* renamed from: j */
    List<C11628b> mo39595j(Context context, int i10, AbstractC12074e abstractC12074e);

    /* renamed from: k */
    int mo39596k(Cursor cursor, String str);

    /* renamed from: l */
    C11627a mo39597l(Context context, String str, String str2, String str3, String str4);

    /* renamed from: m */
    List<String> mo39598m(Context context, List<String> list);

    /* renamed from: n */
    byte[] mo39599n(Context context, C11627a c11627a, boolean z10);

    /* renamed from: o */
    C11627a mo39600o(Context context, String str, String str2);

    /* renamed from: p */
    Uri mo39601p();

    /* renamed from: q */
    Cursor mo39602q(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2);

    /* renamed from: r */
    Uri mo39603r(long j10, int i10, boolean z10);

    /* renamed from: s */
    List<C11627a> mo39604s(Context context, AbstractC12074e abstractC12074e, int i10, int i11, int i12);

    /* renamed from: t */
    List<String> mo39605t(Context context);

    /* renamed from: u */
    void mo39606u(Context context);

    /* renamed from: v */
    long mo39607v(Cursor cursor, String str);

    /* renamed from: w */
    List<C11628b> mo39608w(Context context, int i10, AbstractC12074e abstractC12074e);

    /* renamed from: x */
    void mo39609x(Context context, String str);

    /* renamed from: y */
    List<C11627a> mo39610y(Context context, String str, int i10, int i11, int i12, AbstractC12074e abstractC12074e);

    /* renamed from: z */
    String mo39611z(Cursor cursor, String str);
}

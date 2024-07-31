package x5;

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
import ck.m;
import ck.v;
import com.facebook.ads.AdError;
import dk.r;
import dk.z;
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
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.x;
import ok.l;
import x5.i;
import xk.p;
import xk.q;

/* loaded from: classes.dex */
public interface e {

    /* renamed from: a */
    public static final a f30417a = a.f30418a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f30418a = new a();

        /* renamed from: b */
        private static final boolean f30419b;

        /* renamed from: c */
        private static final List<String> f30420c;

        /* renamed from: d */
        private static final List<String> f30421d;

        /* renamed from: e */
        private static final String[] f30422e;

        /* renamed from: f */
        private static final String[] f30423f;

        static {
            List<String> n10;
            List<String> n11;
            int i10 = Build.VERSION.SDK_INT;
            f30419b = i10 >= 29;
            n10 = r.n("_display_name", "_data", "_id", "title", "bucket_id", "bucket_display_name", "width", "height", "orientation", "date_added", "date_modified", "mime_type", "datetaken");
            if (i10 >= 29) {
                n10.add("datetaken");
            }
            f30420c = n10;
            n11 = r.n("_display_name", "_data", "_id", "title", "bucket_id", "bucket_display_name", "date_added", "width", "height", "orientation", "date_modified", "mime_type", "duration");
            if (i10 >= 29) {
                n11.add("datetaken");
            }
            f30421d = n11;
            f30422e = new String[]{"media_type", "_display_name"};
            f30423f = new String[]{"bucket_id", "bucket_display_name"};
        }

        private a() {
        }

        public final Uri a() {
            Uri contentUri = MediaStore.Files.getContentUri("external");
            n.d(contentUri, "getContentUri(...)");
            return contentUri;
        }

        public final String[] b() {
            return f30423f;
        }

        public final List<String> c() {
            return f30420c;
        }

        public final List<String> d() {
            return f30421d;
        }

        public final String[] e() {
            return f30422e;
        }

        public final boolean f() {
            return f30419b;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class a extends o implements l<String, CharSequence> {

            /* renamed from: a */
            public static final a f30424a = new a();

            a() {
                super(1);
            }

            @Override // ok.l
            /* renamed from: a */
            public final CharSequence invoke(String it) {
                n.e(it, "it");
                return "?";
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: x5.e$b$b */
        /* loaded from: classes.dex */
        public /* synthetic */ class C0498b extends k implements l<Object, v> {
            C0498b(Object obj) {
                super(1, obj, b6.a.class, "info", "info(Ljava/lang/Object;)V", 0);
            }

            public final void a(Object obj) {
                b6.a.d(obj);
            }

            @Override // ok.l
            public /* bridge */ /* synthetic */ v invoke(Object obj) {
                a(obj);
                return v.f7137a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public /* synthetic */ class c extends k implements l<Object, v> {
            c(Object obj) {
                super(1, obj, b6.a.class, "error", "error(Ljava/lang/Object;)V", 0);
            }

            public final void a(Object obj) {
                b6.a.b(obj);
            }

            @Override // ok.l
            public /* bridge */ /* synthetic */ v invoke(Object obj) {
                a(obj);
                return v.f7137a;
            }
        }

        public static void A(e eVar, Context context, String id2) {
            String h02;
            n.e(context, "context");
            n.e(id2, "id");
            if (b6.a.f6152a.e()) {
                h02 = q.h0("", 40, '-');
                b6.a.d("log error row " + id2 + " start " + h02);
                ContentResolver contentResolver = context.getContentResolver();
                n.d(contentResolver, "getContentResolver(...)");
                Cursor q10 = eVar.q(contentResolver, eVar.p(), null, "_id = ?", new String[]{id2}, null);
                if (q10 != null) {
                    try {
                        String[] columnNames = q10.getColumnNames();
                        if (q10.moveToNext()) {
                            n.b(columnNames);
                            int length = columnNames.length;
                            for (int i10 = 0; i10 < length; i10++) {
                                b6.a.d(columnNames[i10] + " : " + q10.getString(i10));
                            }
                        }
                        v vVar = v.f7137a;
                        mk.b.a(q10, null);
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            mk.b.a(q10, th2);
                            throw th3;
                        }
                    }
                }
                b6.a.d("log error row " + id2 + " end " + h02);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v0, types: [T, java.io.FileInputStream] */
        public static v5.a B(e eVar, Context context, String fromPath, String title, String desc, String str) {
            m mVar;
            m mVar2;
            int i10;
            double[] dArr;
            x xVar;
            boolean z10;
            double t10;
            double T;
            n.e(context, "context");
            n.e(fromPath, "fromPath");
            n.e(title, "title");
            n.e(desc, "desc");
            x5.b.a(fromPath);
            File file = new File(fromPath);
            x xVar2 = new x();
            xVar2.f20759a = new FileInputStream(file);
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = AdError.NETWORK_ERROR_CODE;
            long j11 = currentTimeMillis / j10;
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream((InputStream) xVar2.f20759a);
                mVar = new m(Integer.valueOf(decodeStream.getWidth()), Integer.valueOf(decodeStream.getHeight()));
            } catch (Exception unused) {
                mVar = new m(0, 0);
            }
            int intValue = ((Number) mVar.a()).intValue();
            int intValue2 = ((Number) mVar.b()).intValue();
            String guessContentTypeFromName = URLConnection.guessContentTypeFromName(title);
            if (guessContentTypeFromName == null && (guessContentTypeFromName = URLConnection.guessContentTypeFromName(fromPath)) == null) {
                guessContentTypeFromName = URLConnection.guessContentTypeFromStream((InputStream) xVar2.f20759a);
            }
            if (guessContentTypeFromName == null) {
                guessContentTypeFromName = "image/*";
            }
            try {
                androidx.exifinterface.media.a aVar = new androidx.exifinterface.media.a((InputStream) xVar2.f20759a);
                a aVar2 = e.f30417a;
                mVar2 = new m(Integer.valueOf(aVar2.f() ? aVar.r() : 0), aVar2.f() ? null : aVar.l());
            } catch (Exception unused2) {
                mVar2 = new m(0, null);
            }
            int intValue3 = ((Number) mVar2.a()).intValue();
            double[] dArr2 = (double[]) mVar2.b();
            E(xVar2, file);
            a aVar3 = e.f30417a;
            if (aVar3.f()) {
                i10 = intValue3;
                dArr = dArr2;
                xVar = xVar2;
                z10 = false;
            } else {
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                String absolutePath = file.getAbsolutePath();
                xVar = xVar2;
                n.d(absolutePath, "getAbsolutePath(...)");
                String path = externalStorageDirectory.getPath();
                dArr = dArr2;
                n.d(path, "getPath(...)");
                i10 = intValue3;
                z10 = p.E(absolutePath, path, false, 2, null);
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
            if (aVar3.f()) {
                contentValues.put("datetaken", Long.valueOf(j11 * j10));
                contentValues.put("orientation", Integer.valueOf(i10));
                if (str != null) {
                    contentValues.put("relative_path", str);
                }
            }
            if (dArr != null) {
                t10 = dk.m.t(dArr);
                contentValues.put("latitude", Double.valueOf(t10));
                T = dk.m.T(dArr);
                contentValues.put("longitude", Double.valueOf(T));
            }
            if (z10) {
                contentValues.put("_data", fromPath);
            }
            InputStream inputStream = (InputStream) xVar.f20759a;
            Uri EXTERNAL_CONTENT_URI = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            n.d(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
            return w(eVar, context, inputStream, EXTERNAL_CONTENT_URI, contentValues, z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v0, types: [java.io.ByteArrayInputStream, T] */
        public static v5.a C(e eVar, Context context, byte[] bytes, String title, String desc, String str) {
            m mVar;
            m mVar2;
            double t10;
            double T;
            n.e(context, "context");
            n.e(bytes, "bytes");
            n.e(title, "title");
            n.e(desc, "desc");
            x xVar = new x();
            xVar.f20759a = new ByteArrayInputStream(bytes);
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = AdError.NETWORK_ERROR_CODE;
            long j11 = currentTimeMillis / j10;
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream((InputStream) xVar.f20759a);
                mVar = new m(Integer.valueOf(decodeStream.getWidth()), Integer.valueOf(decodeStream.getHeight()));
            } catch (Exception unused) {
                mVar = new m(0, 0);
            }
            int intValue = ((Number) mVar.a()).intValue();
            int intValue2 = ((Number) mVar.b()).intValue();
            String guessContentTypeFromName = URLConnection.guessContentTypeFromName(title);
            if (guessContentTypeFromName == null) {
                guessContentTypeFromName = URLConnection.guessContentTypeFromStream((InputStream) xVar.f20759a);
            }
            if (guessContentTypeFromName == null) {
                guessContentTypeFromName = "image/*";
            }
            try {
                androidx.exifinterface.media.a aVar = new androidx.exifinterface.media.a((InputStream) xVar.f20759a);
                a aVar2 = e.f30417a;
                mVar2 = new m(Integer.valueOf(aVar2.f() ? aVar.r() : 0), aVar2.f() ? null : aVar.l());
            } catch (Exception unused2) {
                mVar2 = new m(0, null);
            }
            int intValue3 = ((Number) mVar2.a()).intValue();
            double[] dArr = (double[]) mVar2.b();
            D(xVar, bytes);
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
            if (e.f30417a.f()) {
                contentValues.put("datetaken", Long.valueOf(j11 * j10));
                contentValues.put("orientation", Integer.valueOf(intValue3));
                if (str != null) {
                    contentValues.put("relative_path", str);
                }
            }
            if (dArr != null) {
                t10 = dk.m.t(dArr);
                contentValues.put("latitude", Double.valueOf(t10));
                T = dk.m.T(dArr);
                contentValues.put("longitude", Double.valueOf(T));
            }
            InputStream inputStream = (InputStream) xVar.f20759a;
            Uri EXTERNAL_CONTENT_URI = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            n.d(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
            return x(eVar, context, inputStream, EXTERNAL_CONTENT_URI, contentValues, false, 16, null);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.io.ByteArrayInputStream, T] */
        private static void D(x<ByteArrayInputStream> xVar, byte[] bArr) {
            xVar.f20759a = new ByteArrayInputStream(bArr);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.io.FileInputStream] */
        private static void E(x<FileInputStream> xVar, File file) {
            xVar.f20759a = new FileInputStream(file);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v0, types: [T, java.io.FileInputStream] */
        public static v5.a F(e eVar, Context context, String fromPath, String title, String desc, String str) {
            m mVar;
            x xVar;
            double[] dArr;
            boolean z10;
            double t10;
            double T;
            n.e(context, "context");
            n.e(fromPath, "fromPath");
            n.e(title, "title");
            n.e(desc, "desc");
            x5.b.a(fromPath);
            File file = new File(fromPath);
            x xVar2 = new x();
            xVar2.f20759a = new FileInputStream(file);
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = AdError.NETWORK_ERROR_CODE;
            long j11 = currentTimeMillis / j10;
            i.a b10 = i.f30428a.b(fromPath);
            String guessContentTypeFromName = URLConnection.guessContentTypeFromName(title);
            if (guessContentTypeFromName == null) {
                guessContentTypeFromName = URLConnection.guessContentTypeFromName(fromPath);
            }
            if (guessContentTypeFromName == null) {
                guessContentTypeFromName = "video/*";
            }
            try {
                androidx.exifinterface.media.a aVar = new androidx.exifinterface.media.a((InputStream) xVar2.f20759a);
                a aVar2 = e.f30417a;
                mVar = new m(Integer.valueOf(aVar2.f() ? aVar.r() : 0), aVar2.f() ? null : aVar.l());
            } catch (Exception unused) {
                mVar = new m(0, null);
            }
            int intValue = ((Number) mVar.a()).intValue();
            double[] dArr2 = (double[]) mVar.b();
            G(xVar2, file);
            a aVar3 = e.f30417a;
            if (aVar3.f()) {
                xVar = xVar2;
                dArr = dArr2;
                z10 = false;
            } else {
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                String absolutePath = file.getAbsolutePath();
                xVar = xVar2;
                n.d(absolutePath, "getAbsolutePath(...)");
                String path = externalStorageDirectory.getPath();
                n.d(path, "getPath(...)");
                dArr = dArr2;
                z10 = p.E(absolutePath, path, false, 2, null);
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("media_type", (Integer) 3);
            contentValues.put("description", desc);
            contentValues.put("title", title);
            contentValues.put("_display_name", title);
            contentValues.put("mime_type", guessContentTypeFromName);
            contentValues.put("date_added", Long.valueOf(j11));
            contentValues.put("date_modified", Long.valueOf(j11));
            contentValues.put("duration", b10.a());
            contentValues.put("width", b10.c());
            contentValues.put("height", b10.b());
            if (aVar3.f()) {
                contentValues.put("datetaken", Long.valueOf(j11 * j10));
                contentValues.put("orientation", Integer.valueOf(intValue));
                if (str != null) {
                    contentValues.put("relative_path", str);
                }
            }
            if (dArr != null) {
                t10 = dk.m.t(dArr);
                contentValues.put("latitude", Double.valueOf(t10));
                T = dk.m.T(dArr);
                contentValues.put("longitude", Double.valueOf(T));
            }
            if (z10) {
                contentValues.put("_data", fromPath);
            }
            InputStream inputStream = (InputStream) xVar.f20759a;
            Uri EXTERNAL_CONTENT_URI = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            n.d(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
            return w(eVar, context, inputStream, EXTERNAL_CONTENT_URI, contentValues, z10);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.io.FileInputStream] */
        private static void G(x<FileInputStream> xVar, File file) {
            xVar.f20759a = new FileInputStream(file);
        }

        public static Void H(e eVar, String msg) {
            n.e(msg, "msg");
            throw new RuntimeException(msg);
        }

        public static v5.a I(e eVar, Cursor receiver, Context context, boolean z10) {
            long v10;
            boolean J;
            boolean t10;
            n.e(receiver, "$receiver");
            n.e(context, "context");
            String z11 = eVar.z(receiver, "_data");
            if (z10) {
                t10 = p.t(z11);
                if ((!t10) && !new File(z11).exists()) {
                    return null;
                }
            }
            long v11 = eVar.v(receiver, "_id");
            a aVar = e.f30417a;
            if (aVar.f()) {
                v10 = eVar.v(receiver, "datetaken") / AdError.NETWORK_ERROR_CODE;
                if (v10 == 0) {
                    v10 = eVar.v(receiver, "date_added");
                }
            } else {
                v10 = eVar.v(receiver, "date_added");
            }
            int k10 = eVar.k(receiver, "media_type");
            String z12 = eVar.z(receiver, "mime_type");
            long v12 = k10 == 1 ? 0L : eVar.v(receiver, "duration");
            int k11 = eVar.k(receiver, "width");
            int k12 = eVar.k(receiver, "height");
            String z13 = eVar.z(receiver, "_display_name");
            long v13 = eVar.v(receiver, "date_modified");
            int k13 = eVar.k(receiver, "orientation");
            String z14 = aVar.f() ? eVar.z(receiver, "relative_path") : null;
            if (k11 == 0 || k12 == 0) {
                if (k10 == 1) {
                    try {
                        J = q.J(z12, "svg", false, 2, null);
                        if (!J) {
                            InputStream openInputStream = context.getContentResolver().openInputStream(u(eVar, v11, eVar.A(k10), false, 4, null));
                            if (openInputStream != null) {
                                try {
                                    androidx.exifinterface.media.a aVar2 = new androidx.exifinterface.media.a(openInputStream);
                                    String f10 = aVar2.f("ImageWidth");
                                    if (f10 != null) {
                                        n.b(f10);
                                        k11 = Integer.parseInt(f10);
                                    }
                                    String f11 = aVar2.f("ImageLength");
                                    if (f11 != null) {
                                        n.b(f11);
                                        k12 = Integer.parseInt(f11);
                                    }
                                    mk.b.a(openInputStream, null);
                                } finally {
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        b6.a.b(th2);
                    }
                }
                if (k10 == 3) {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(z11);
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    k11 = extractMetadata != null ? Integer.parseInt(extractMetadata) : 0;
                    String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    k12 = extractMetadata2 != null ? Integer.parseInt(extractMetadata2) : 0;
                    String extractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                    if (extractMetadata3 != null) {
                        k13 = Integer.parseInt(extractMetadata3);
                    }
                    if (aVar.f()) {
                        mediaMetadataRetriever.close();
                    } else {
                        mediaMetadataRetriever.release();
                    }
                }
            }
            return new v5.a(v11, z11, v12, v10, k11, k12, eVar.A(k10), z13, v13, k13, null, null, z14, z12, 3072, null);
        }

        public static /* synthetic */ v5.a J(e eVar, Cursor cursor, Context context, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toAssetEntity");
            }
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            return eVar.h(cursor, context, z10);
        }

        public static boolean a(e eVar, Context context, String id2) {
            n.e(context, "context");
            n.e(id2, "id");
            ContentResolver contentResolver = context.getContentResolver();
            n.d(contentResolver, "getContentResolver(...)");
            Cursor q10 = eVar.q(contentResolver, eVar.p(), new String[]{"_id"}, "_id = ?", new String[]{id2}, null);
            if (q10 == null) {
                mk.b.a(q10, null);
                return false;
            }
            try {
                boolean z10 = q10.getCount() >= 1;
                mk.b.a(q10, null);
                return z10;
            } finally {
            }
        }

        public static void b(e eVar, Context context) {
            n.e(context, "context");
        }

        public static int c(e eVar, int i10) {
            return f.f30425a.a(i10);
        }

        public static Uri d(e eVar) {
            return e.f30417a.a();
        }

        public static int e(e eVar, Context context, w5.e option, int i10) {
            n.e(context, "context");
            n.e(option, "option");
            ContentResolver contentResolver = context.getContentResolver();
            ArrayList<String> arrayList = new ArrayList<>();
            int i11 = 0;
            String b10 = option.b(i10, arrayList, false);
            String d10 = option.d();
            n.b(contentResolver);
            Cursor q10 = eVar.q(contentResolver, eVar.p(), new String[]{"_id"}, b10, (String[]) arrayList.toArray(new String[0]), d10);
            if (q10 != null) {
                try {
                    i11 = q10.getCount();
                } finally {
                }
            }
            mk.b.a(q10, null);
            return i11;
        }

        public static /* synthetic */ v5.a f(e eVar, Context context, String str, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAssetEntity");
            }
            if ((i10 & 4) != 0) {
                z10 = true;
            }
            return eVar.d(context, str, z10);
        }

        public static List<v5.a> g(e eVar, Context context, w5.e option, int i10, int i11, int i12) {
            List<v5.a> j10;
            n.e(context, "context");
            n.e(option, "option");
            ContentResolver contentResolver = context.getContentResolver();
            ArrayList<String> arrayList = new ArrayList<>();
            String b10 = option.b(i12, arrayList, false);
            String d10 = option.d();
            n.b(contentResolver);
            Cursor q10 = eVar.q(contentResolver, eVar.p(), eVar.g(), b10, (String[]) arrayList.toArray(new String[0]), d10);
            if (q10 == null) {
                j10 = r.j();
                return j10;
            }
            try {
                ArrayList arrayList2 = new ArrayList();
                q10.moveToPosition(i10 - 1);
                while (q10.moveToNext()) {
                    v5.a h10 = eVar.h(q10, context, false);
                    if (h10 != null) {
                        arrayList2.add(h10);
                        if (arrayList2.size() == i11 - i10) {
                            break;
                        }
                    }
                }
                mk.b.a(q10, null);
                return arrayList2;
            } finally {
            }
        }

        public static List<String> h(e eVar, Context context, List<String> ids) {
            String M;
            List<String> j10;
            n.e(context, "context");
            n.e(ids, "ids");
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
                    arrayList.addAll(eVar.m(context, ids.subList(i10 * 500, i10 == i11 + (-1) ? list.size() : ((i10 + 1) * 500) - 1)));
                    i10++;
                }
                return arrayList;
            }
            M = z.M(ids, ",", null, null, 0, null, a.f30424a, 30, null);
            String str = "_id in (" + M + ')';
            ContentResolver contentResolver = context.getContentResolver();
            n.d(contentResolver, "getContentResolver(...)");
            Cursor q10 = eVar.q(contentResolver, eVar.p(), new String[]{"_id", "media_type", "_data"}, str, (String[]) list.toArray(new String[0]), null);
            if (q10 == null) {
                j10 = r.j();
                return j10;
            }
            ArrayList arrayList2 = new ArrayList();
            HashMap hashMap = new HashMap();
            while (q10.moveToNext()) {
                try {
                    hashMap.put(eVar.z(q10, "_id"), eVar.z(q10, "_data"));
                } finally {
                }
            }
            v vVar = v.f7137a;
            mk.b.a(q10, null);
            Iterator<String> it = ids.iterator();
            while (it.hasNext()) {
                String str2 = (String) hashMap.get(it.next());
                if (str2 != null) {
                    arrayList2.add(str2);
                }
            }
            return arrayList2;
        }

        public static List<String> i(e eVar, Context context) {
            List<String> e02;
            List<String> j10;
            n.e(context, "context");
            ContentResolver contentResolver = context.getContentResolver();
            n.b(contentResolver);
            Cursor q10 = eVar.q(contentResolver, eVar.p(), null, null, null, null);
            if (q10 == null) {
                j10 = r.j();
                return j10;
            }
            try {
                String[] columnNames = q10.getColumnNames();
                n.d(columnNames, "getColumnNames(...)");
                e02 = dk.m.e0(columnNames);
                mk.b.a(q10, null);
                return e02;
            } finally {
            }
        }

        public static String j(e eVar) {
            return "_id = ?";
        }

        public static int k(e eVar, Cursor receiver, String columnName) {
            n.e(receiver, "$receiver");
            n.e(columnName, "columnName");
            return receiver.getInt(receiver.getColumnIndex(columnName));
        }

        public static long l(e eVar, Cursor receiver, String columnName) {
            n.e(receiver, "$receiver");
            n.e(columnName, "columnName");
            return receiver.getLong(receiver.getColumnIndex(columnName));
        }

        public static int m(e eVar, int i10) {
            if (i10 == 1) {
                return 1;
            }
            if (i10 != 2) {
                return i10 != 3 ? 0 : 2;
            }
            return 3;
        }

        public static String n(e eVar, Context context, long j10, int i10) {
            n.e(context, "context");
            String uri = eVar.r(j10, i10, false).toString();
            n.d(uri, "toString(...)");
            return uri;
        }

        public static Long o(e eVar, Context context, String pathId) {
            n.e(context, "context");
            n.e(pathId, "pathId");
            String[] strArr = {"date_modified"};
            boolean a10 = n.a(pathId, "isAll");
            ContentResolver contentResolver = context.getContentResolver();
            n.d(contentResolver, "getContentResolver(...)");
            Uri p10 = eVar.p();
            Cursor q10 = a10 ? eVar.q(contentResolver, p10, strArr, null, null, "date_modified desc") : eVar.q(contentResolver, p10, strArr, "bucket_id = ?", new String[]{pathId}, "date_modified desc");
            if (q10 == null) {
                return null;
            }
            try {
                if (q10.moveToNext()) {
                    Long valueOf = Long.valueOf(eVar.v(q10, "date_modified"));
                    mk.b.a(q10, null);
                    return valueOf;
                }
                v vVar = v.f7137a;
                mk.b.a(q10, null);
                return null;
            } finally {
            }
        }

        public static String p(e eVar, int i10, int i11, w5.e filterOption) {
            n.e(filterOption, "filterOption");
            return filterOption.d() + " LIMIT " + i11 + " OFFSET " + i10;
        }

        public static String q(e eVar, Cursor receiver, String columnName) {
            n.e(receiver, "$receiver");
            n.e(columnName, "columnName");
            String string = receiver.getString(receiver.getColumnIndex(columnName));
            return string == null ? "" : string;
        }

        public static String r(e eVar, Cursor receiver, String columnName) {
            n.e(receiver, "$receiver");
            n.e(columnName, "columnName");
            return receiver.getString(receiver.getColumnIndex(columnName));
        }

        public static int s(e eVar, int i10) {
            if (i10 == 1) {
                return 1;
            }
            if (i10 != 2) {
                return i10 != 3 ? 0 : 2;
            }
            return 3;
        }

        public static Uri t(e eVar, long j10, int i10, boolean z10) {
            Uri uri;
            Uri requireOriginal;
            if (i10 == 1) {
                uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            } else if (i10 == 2) {
                uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            } else {
                if (i10 != 3) {
                    Uri EMPTY = Uri.EMPTY;
                    n.d(EMPTY, "EMPTY");
                    return EMPTY;
                }
                uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            }
            Uri withAppendedId = ContentUris.withAppendedId(uri, j10);
            n.b(withAppendedId);
            if (!z10) {
                return withAppendedId;
            }
            requireOriginal = MediaStore.setRequireOriginal(withAppendedId);
            n.d(requireOriginal, "setRequireOriginal(...)");
            return requireOriginal;
        }

        public static /* synthetic */ Uri u(e eVar, long j10, int i10, boolean z10, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUri");
            }
            if ((i11 & 4) != 0) {
                z10 = false;
            }
            return eVar.r(j10, i10, z10);
        }

        public static void v(e eVar, Context context, v5.b entity) {
            n.e(context, "context");
            n.e(entity, "entity");
            Long c10 = eVar.c(context, entity.b());
            if (c10 != null) {
                entity.f(Long.valueOf(c10.longValue()));
            }
        }

        private static v5.a w(e eVar, Context context, InputStream inputStream, Uri uri, ContentValues contentValues, boolean z10) {
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
                        mk.a.b(inputStream, openOutputStream, 0, 2, null);
                        mk.b.a(inputStream, null);
                        mk.b.a(openOutputStream, null);
                    } finally {
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        mk.b.a(openOutputStream, th2);
                        throw th3;
                    }
                }
            }
            contentResolver.notifyChange(insert, null);
            return f(eVar, context, String.valueOf(parseId), false, 4, null);
        }

        public static /* synthetic */ v5.a x(e eVar, Context context, InputStream inputStream, Uri uri, ContentValues contentValues, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: insertUri");
            }
            if ((i10 & 16) != 0) {
                z10 = false;
            }
            return w(eVar, context, inputStream, uri, contentValues, z10);
        }

        public static Cursor y(e eVar, ContentResolver receiver, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
            n.e(receiver, "$receiver");
            n.e(uri, "uri");
            try {
                Cursor query = receiver.query(uri, strArr, str, strArr2, str2);
                z(uri, strArr, str, strArr2, str2, new C0498b(b6.a.f6152a));
                return query;
            } catch (Exception e10) {
                z(uri, strArr, str, strArr2, str2, new c(b6.a.f6152a));
                b6.a.c("happen query error", e10);
                throw e10;
            }
        }

        private static void z(Uri uri, String[] strArr, String str, String[] strArr2, String str2, l<? super String, v> lVar) {
            if (b6.a.f6152a.e()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("uri: " + uri);
                n.d(sb2, "append(value)");
                sb2.append('\n');
                n.d(sb2, "append('\\n')");
                StringBuilder sb3 = new StringBuilder();
                sb3.append("projection: ");
                sb3.append(strArr != null ? dk.m.R(strArr, ", ", null, null, 0, null, null, 62, null) : null);
                sb2.append(sb3.toString());
                n.d(sb2, "append(value)");
                sb2.append('\n');
                n.d(sb2, "append('\\n')");
                sb2.append("selection: " + str);
                n.d(sb2, "append(value)");
                sb2.append('\n');
                n.d(sb2, "append('\\n')");
                StringBuilder sb4 = new StringBuilder();
                sb4.append("selectionArgs: ");
                sb4.append(strArr2 != null ? dk.m.R(strArr2, ", ", null, null, 0, null, null, 62, null) : null);
                sb2.append(sb4.toString());
                n.d(sb2, "append(value)");
                sb2.append('\n');
                n.d(sb2, "append('\\n')");
                sb2.append("sortOrder: " + str2);
                n.d(sb2, "append(value)");
                sb2.append('\n');
                n.d(sb2, "append('\\n')");
                String sb5 = sb2.toString();
                n.d(sb5, "toString(...)");
                lVar.invoke(sb5);
            }
        }
    }

    int A(int i10);

    String B(Context context, String str, boolean z10);

    v5.a C(Context context, String str, String str2, String str3, String str4);

    v5.b D(Context context, String str, int i10, w5.e eVar);

    androidx.exifinterface.media.a E(Context context, String str);

    int F(Context context, w5.e eVar, int i10);

    v5.a G(Context context, String str, String str2);

    String H(Context context, long j10, int i10);

    List<v5.a> a(Context context, String str, int i10, int i11, int i12, w5.e eVar);

    boolean b(Context context, String str);

    Long c(Context context, String str);

    v5.a d(Context context, String str, boolean z10);

    boolean e(Context context);

    v5.a f(Context context, byte[] bArr, String str, String str2, String str3);

    String[] g();

    v5.a h(Cursor cursor, Context context, boolean z10);

    void i(Context context, v5.b bVar);

    List<v5.b> j(Context context, int i10, w5.e eVar);

    int k(Cursor cursor, String str);

    v5.a l(Context context, String str, String str2, String str3, String str4);

    List<String> m(Context context, List<String> list);

    byte[] n(Context context, v5.a aVar, boolean z10);

    v5.a o(Context context, String str, String str2);

    Uri p();

    Cursor q(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2);

    Uri r(long j10, int i10, boolean z10);

    List<v5.a> s(Context context, w5.e eVar, int i10, int i11, int i12);

    List<String> t(Context context);

    void u(Context context);

    long v(Cursor cursor, String str);

    List<v5.b> w(Context context, int i10, w5.e eVar);

    void x(Context context, String str);

    List<v5.a> y(Context context, String str, int i10, int i11, int i12, w5.e eVar);

    String z(Cursor cursor, String str);
}

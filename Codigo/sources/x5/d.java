package x5;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import ck.m;
import ck.v;
import dk.r;
import dk.z;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import ok.l;
import x5.e;

/* loaded from: classes.dex */
public final class d implements e {

    /* renamed from: b, reason: collision with root package name */
    public static final d f30410b = new d();

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f30411c = {"longitude", "latitude"};

    /* renamed from: d, reason: collision with root package name */
    private static final ReentrantLock f30412d = new ReentrantLock();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f30413a;

        /* renamed from: b, reason: collision with root package name */
        private final String f30414b;

        /* renamed from: c, reason: collision with root package name */
        private final String f30415c;

        public a(String path, String galleryId, String galleryName) {
            n.e(path, "path");
            n.e(galleryId, "galleryId");
            n.e(galleryName, "galleryName");
            this.f30413a = path;
            this.f30414b = galleryId;
            this.f30415c = galleryName;
        }

        public final String a() {
            return this.f30415c;
        }

        public final String b() {
            return this.f30413a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return n.a(this.f30413a, aVar.f30413a) && n.a(this.f30414b, aVar.f30414b) && n.a(this.f30415c, aVar.f30415c);
        }

        public int hashCode() {
            return (((this.f30413a.hashCode() * 31) + this.f30414b.hashCode()) * 31) + this.f30415c.hashCode();
        }

        public String toString() {
            return "GalleryInfo(path=" + this.f30413a + ", galleryId=" + this.f30414b + ", galleryName=" + this.f30415c + ')';
        }
    }

    /* loaded from: classes.dex */
    static final class b extends o implements l<String, CharSequence> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f30416a = new b();

        b() {
            super(1);
        }

        @Override // ok.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(String it) {
            n.e(it, "it");
            return "?";
        }
    }

    private d() {
    }

    private final a J(Context context, String str) {
        ContentResolver contentResolver = context.getContentResolver();
        n.d(contentResolver, "getContentResolver(...)");
        Cursor q10 = q(contentResolver, p(), new String[]{"bucket_id", "bucket_display_name", "_data"}, "bucket_id = ?", new String[]{str}, null);
        if (q10 == null) {
            return null;
        }
        try {
            if (!q10.moveToNext()) {
                mk.b.a(q10, null);
                return null;
            }
            d dVar = f30410b;
            String N = dVar.N(q10, "_data");
            if (N == null) {
                mk.b.a(q10, null);
                return null;
            }
            String N2 = dVar.N(q10, "bucket_display_name");
            if (N2 == null) {
                mk.b.a(q10, null);
                return null;
            }
            File parentFile = new File(N).getParentFile();
            String absolutePath = parentFile != null ? parentFile.getAbsolutePath() : null;
            if (absolutePath == null) {
                mk.b.a(q10, null);
                return null;
            }
            n.b(absolutePath);
            a aVar = new a(absolutePath, str, N2);
            mk.b.a(q10, null);
            return aVar;
        } finally {
        }
    }

    @Override // x5.e
    public int A(int i10) {
        return e.b.m(this, i10);
    }

    @Override // x5.e
    public String B(Context context, String id2, boolean z10) {
        n.e(context, "context");
        n.e(id2, "id");
        v5.a f10 = e.b.f(this, context, id2, false, 4, null);
        if (f10 == null) {
            return null;
        }
        return f10.k();
    }

    @Override // x5.e
    public v5.a C(Context context, String str, String str2, String str3, String str4) {
        return e.b.F(this, context, str, str2, str3, str4);
    }

    @Override // x5.e
    public v5.b D(Context context, String pathId, int i10, w5.e option) {
        String str;
        Object[] m10;
        v5.b bVar;
        String str2;
        n.e(context, "context");
        n.e(pathId, "pathId");
        n.e(option, "option");
        ArrayList arrayList = new ArrayList();
        if (n.a(pathId, "")) {
            str = "";
        } else {
            arrayList.add(pathId);
            str = "AND bucket_id = ?";
        }
        String str3 = "bucket_id IS NOT NULL " + w5.e.c(option, i10, arrayList, false, 4, null) + ' ' + str + ") GROUP BY (bucket_id";
        ContentResolver contentResolver = context.getContentResolver();
        n.d(contentResolver, "getContentResolver(...)");
        Uri p10 = p();
        m10 = dk.l.m(e.f30417a.b(), new String[]{"count(1)"});
        Cursor q10 = q(contentResolver, p10, (String[]) m10, str3, (String[]) arrayList.toArray(new String[0]), null);
        if (q10 == null) {
            return null;
        }
        try {
            if (q10.moveToNext()) {
                String string = q10.getString(0);
                String string2 = q10.getString(1);
                if (string2 == null) {
                    str2 = "";
                } else {
                    n.b(string2);
                    str2 = string2;
                }
                int i11 = q10.getInt(2);
                n.b(string);
                bVar = new v5.b(string, str2, i11, 0, false, null, 48, null);
            } else {
                bVar = null;
            }
            mk.b.a(q10, null);
            return bVar;
        } finally {
        }
    }

    @Override // x5.e
    public androidx.exifinterface.media.a E(Context context, String id2) {
        n.e(context, "context");
        n.e(id2, "id");
        v5.a f10 = e.b.f(this, context, id2, false, 4, null);
        if (f10 != null && new File(f10.k()).exists()) {
            return new androidx.exifinterface.media.a(f10.k());
        }
        return null;
    }

    @Override // x5.e
    public int F(Context context, w5.e eVar, int i10) {
        return e.b.e(this, context, eVar, i10);
    }

    @Override // x5.e
    public v5.a G(Context context, String assetId, String galleryId) {
        n.e(context, "context");
        n.e(assetId, "assetId");
        n.e(galleryId, "galleryId");
        m<String, String> L = L(context, assetId);
        if (L == null) {
            O("Cannot get gallery id of " + assetId);
            throw new ck.e();
        }
        String a10 = L.a();
        a J = J(context, galleryId);
        if (J == null) {
            O("Cannot get target gallery info");
            throw new ck.e();
        }
        if (n.a(galleryId, a10)) {
            O("No move required, because the target gallery is the same as the current one.");
            throw new ck.e();
        }
        ContentResolver contentResolver = context.getContentResolver();
        n.b(contentResolver);
        Cursor q10 = q(contentResolver, p(), new String[]{"_data"}, K(), new String[]{assetId}, null);
        if (q10 == null) {
            O("Cannot find " + assetId + " path");
            throw new ck.e();
        }
        if (!q10.moveToNext()) {
            O("Cannot find " + assetId + " path");
            throw new ck.e();
        }
        String string = q10.getString(0);
        q10.close();
        String str = J.b() + '/' + new File(string).getName();
        new File(string).renameTo(new File(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("_data", str);
        contentValues.put("bucket_id", galleryId);
        contentValues.put("bucket_display_name", J.a());
        if (contentResolver.update(p(), contentValues, K(), new String[]{assetId}) > 0) {
            return e.b.f(this, context, assetId, false, 4, null);
        }
        O("Cannot update " + assetId + " relativePath");
        throw new ck.e();
    }

    @Override // x5.e
    public String H(Context context, long j10, int i10) {
        return e.b.n(this, context, j10, i10);
    }

    public int I(int i10) {
        return e.b.c(this, i10);
    }

    public String K() {
        return e.b.j(this);
    }

    public m<String, String> L(Context context, String assetId) {
        n.e(context, "context");
        n.e(assetId, "assetId");
        ContentResolver contentResolver = context.getContentResolver();
        n.d(contentResolver, "getContentResolver(...)");
        Cursor q10 = q(contentResolver, p(), new String[]{"bucket_id", "_data"}, "_id = ?", new String[]{assetId}, null);
        if (q10 == null) {
            return null;
        }
        try {
            if (!q10.moveToNext()) {
                mk.b.a(q10, null);
                return null;
            }
            m<String, String> mVar = new m<>(q10.getString(0), new File(q10.getString(1)).getParent());
            mk.b.a(q10, null);
            return mVar;
        } finally {
        }
    }

    public String M(int i10, int i11, w5.e eVar) {
        return e.b.p(this, i10, i11, eVar);
    }

    public String N(Cursor cursor, String str) {
        return e.b.r(this, cursor, str);
    }

    public Void O(String str) {
        return e.b.H(this, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object[], java.lang.String] */
    @Override // x5.e
    public List<v5.a> a(Context context, String galleryId, int i10, int i11, int i12, w5.e option) {
        StringBuilder sb2;
        String str;
        n.e(context, "context");
        n.e(galleryId, "galleryId");
        n.e(option, "option");
        boolean z10 = galleryId.length() == 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!z10) {
            arrayList2.add(galleryId);
        }
        String c10 = w5.e.c(option, i12, arrayList2, false, 4, null);
        String[] g10 = g();
        if (z10) {
            sb2 = new StringBuilder();
            str = "bucket_id IS NOT NULL ";
        } else {
            sb2 = new StringBuilder();
            str = "bucket_id = ? ";
        }
        sb2.append(str);
        sb2.append(c10);
        sb2.toString();
        String M = M(i10, i11 - i10, option);
        ContentResolver contentResolver = context.getContentResolver();
        n.d(contentResolver, "getContentResolver(...)");
        Uri p10 = p();
        ?? array = arrayList2.toArray(new String[0]);
        Cursor q10 = q(contentResolver, p10, g10, array, (String[]) array, M);
        if (q10 == null) {
            return arrayList;
        }
        while (q10.moveToNext()) {
            try {
                v5.a J = e.b.J(f30410b, q10, context, false, 2, null);
                if (J != null) {
                    arrayList.add(J);
                }
            } finally {
            }
        }
        v vVar = v.f7137a;
        mk.b.a(q10, null);
        return arrayList;
    }

    @Override // x5.e
    public boolean b(Context context, String str) {
        return e.b.a(this, context, str);
    }

    @Override // x5.e
    public Long c(Context context, String str) {
        return e.b.o(this, context, str);
    }

    @Override // x5.e
    public v5.a d(Context context, String id2, boolean z10) {
        List R;
        List T;
        List T2;
        List y10;
        n.e(context, "context");
        n.e(id2, "id");
        e.a aVar = e.f30417a;
        R = z.R(aVar.c(), aVar.d());
        T = z.T(R, f30411c);
        T2 = z.T(T, aVar.e());
        y10 = z.y(T2);
        ContentResolver contentResolver = context.getContentResolver();
        n.d(contentResolver, "getContentResolver(...)");
        Cursor q10 = q(contentResolver, p(), (String[]) y10.toArray(new String[0]), "_id = ?", new String[]{id2}, null);
        if (q10 == null) {
            return null;
        }
        try {
            v5.a h10 = q10.moveToNext() ? f30410b.h(q10, context, z10) : null;
            mk.b.a(q10, null);
            return h10;
        } finally {
        }
    }

    @Override // x5.e
    public boolean e(Context context) {
        String M;
        n.e(context, "context");
        ReentrantLock reentrantLock = f30412d;
        if (reentrantLock.isLocked()) {
            return false;
        }
        reentrantLock.lock();
        try {
            ArrayList arrayList = new ArrayList();
            ContentResolver contentResolver = context.getContentResolver();
            d dVar = f30410b;
            n.b(contentResolver);
            Cursor q10 = dVar.q(contentResolver, dVar.p(), new String[]{"_id", "_data"}, null, null, null);
            if (q10 == null) {
                return false;
            }
            while (q10.moveToNext()) {
                try {
                    d dVar2 = f30410b;
                    String z10 = dVar2.z(q10, "_id");
                    String z11 = dVar2.z(q10, "_data");
                    if (!new File(z11).exists()) {
                        arrayList.add(z10);
                        Log.i("PhotoManagerPlugin", "The " + z11 + " was not exists. ");
                    }
                } finally {
                }
            }
            Log.i("PhotoManagerPlugin", "will be delete ids = " + arrayList);
            mk.b.a(q10, null);
            M = z.M(arrayList, ",", null, null, 0, null, b.f30416a, 30, null);
            int delete = contentResolver.delete(f30410b.p(), "_id in ( " + M + " )", (String[]) arrayList.toArray(new String[0]));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Delete rows: ");
            sb2.append(delete);
            Log.i("PhotoManagerPlugin", sb2.toString());
            reentrantLock.unlock();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // x5.e
    public v5.a f(Context context, byte[] bArr, String str, String str2, String str3) {
        return e.b.C(this, context, bArr, str, str2, str3);
    }

    @Override // x5.e
    public String[] g() {
        List R;
        List T;
        List T2;
        List y10;
        e.a aVar = e.f30417a;
        R = z.R(aVar.c(), aVar.d());
        T = z.T(R, aVar.e());
        T2 = z.T(T, f30411c);
        y10 = z.y(T2);
        return (String[]) y10.toArray(new String[0]);
    }

    @Override // x5.e
    public v5.a h(Cursor cursor, Context context, boolean z10) {
        return e.b.I(this, cursor, context, z10);
    }

    @Override // x5.e
    public void i(Context context, v5.b bVar) {
        e.b.v(this, context, bVar);
    }

    @Override // x5.e
    public List<v5.b> j(Context context, int i10, w5.e option) {
        Object[] m10;
        int A;
        n.e(context, "context");
        n.e(option, "option");
        ArrayList arrayList = new ArrayList();
        m10 = dk.l.m(e.f30417a.b(), new String[]{"count(1)"});
        String[] strArr = (String[]) m10;
        ArrayList arrayList2 = new ArrayList();
        String str = "bucket_id IS NOT NULL " + w5.e.c(option, i10, arrayList2, false, 4, null);
        ContentResolver contentResolver = context.getContentResolver();
        n.d(contentResolver, "getContentResolver(...)");
        Cursor q10 = q(contentResolver, p(), strArr, str, (String[]) arrayList2.toArray(new String[0]), null);
        if (q10 == null) {
            return arrayList;
        }
        try {
            if (q10.moveToNext()) {
                A = dk.m.A(strArr, "count(1)");
                arrayList.add(new v5.b("isAll", "Recent", q10.getInt(A), i10, true, null, 32, null));
            }
            v vVar = v.f7137a;
            mk.b.a(q10, null);
            return arrayList;
        } finally {
        }
    }

    @Override // x5.e
    public int k(Cursor cursor, String str) {
        return e.b.k(this, cursor, str);
    }

    @Override // x5.e
    public v5.a l(Context context, String str, String str2, String str3, String str4) {
        return e.b.B(this, context, str, str2, str3, str4);
    }

    @Override // x5.e
    public List<String> m(Context context, List<String> list) {
        return e.b.h(this, context, list);
    }

    @Override // x5.e
    public byte[] n(Context context, v5.a asset, boolean z10) {
        byte[] a10;
        n.e(context, "context");
        n.e(asset, "asset");
        a10 = mk.i.a(new File(asset.k()));
        return a10;
    }

    @Override // x5.e
    public v5.a o(Context context, String assetId, String galleryId) {
        ArrayList f10;
        Object[] m10;
        n.e(context, "context");
        n.e(assetId, "assetId");
        n.e(galleryId, "galleryId");
        m<String, String> L = L(context, assetId);
        if (L == null) {
            throw new RuntimeException("Cannot get gallery id of " + assetId);
        }
        if (n.a(galleryId, L.a())) {
            throw new RuntimeException("No copy required, because the target gallery is the same as the current one.");
        }
        ContentResolver contentResolver = context.getContentResolver();
        v5.a f11 = e.b.f(this, context, assetId, false, 4, null);
        if (f11 == null) {
            throw new RuntimeException("No copy required, because the target gallery is the same as the current one.");
        }
        f10 = r.f("_display_name", "title", "date_added", "date_modified", "duration", "longitude", "latitude", "width", "height");
        int I = I(f11.m());
        if (I != 2) {
            f10.add("description");
        }
        n.b(contentResolver);
        Uri p10 = p();
        m10 = dk.l.m(f10.toArray(new String[0]), new String[]{"_data"});
        Cursor q10 = q(contentResolver, p10, (String[]) m10, K(), new String[]{assetId}, null);
        if (q10 == null) {
            throw new RuntimeException("Cannot find asset .");
        }
        if (!q10.moveToNext()) {
            throw new RuntimeException("Cannot find asset .");
        }
        Uri b10 = f.f30425a.b(I);
        a J = J(context, galleryId);
        if (J == null) {
            O("Cannot find gallery info");
            throw new ck.e();
        }
        String str = J.b() + '/' + f11.b();
        ContentValues contentValues = new ContentValues();
        Iterator it = f10.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            d dVar = f30410b;
            n.b(str2);
            contentValues.put(str2, dVar.z(q10, str2));
        }
        contentValues.put("media_type", Integer.valueOf(I));
        contentValues.put("_data", str);
        Uri insert = contentResolver.insert(b10, contentValues);
        if (insert == null) {
            throw new RuntimeException("Cannot insert new asset.");
        }
        OutputStream openOutputStream = contentResolver.openOutputStream(insert);
        if (openOutputStream == null) {
            throw new RuntimeException("Cannot open output stream for " + insert + '.');
        }
        FileInputStream fileInputStream = new FileInputStream(new File(f11.k()));
        try {
            try {
                mk.a.b(fileInputStream, openOutputStream, 0, 2, null);
                mk.b.a(openOutputStream, null);
                mk.b.a(fileInputStream, null);
                q10.close();
                String lastPathSegment = insert.getLastPathSegment();
                if (lastPathSegment != null) {
                    return e.b.f(this, context, lastPathSegment, false, 4, null);
                }
                throw new RuntimeException("Cannot open output stream for " + insert + '.');
            } finally {
            }
        } finally {
        }
    }

    @Override // x5.e
    public Uri p() {
        return e.b.d(this);
    }

    @Override // x5.e
    public Cursor q(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return e.b.y(this, contentResolver, uri, strArr, str, strArr2, str2);
    }

    @Override // x5.e
    public Uri r(long j10, int i10, boolean z10) {
        return e.b.t(this, j10, i10, z10);
    }

    @Override // x5.e
    public List<v5.a> s(Context context, w5.e eVar, int i10, int i11, int i12) {
        return e.b.g(this, context, eVar, i10, i11, i12);
    }

    @Override // x5.e
    public List<String> t(Context context) {
        return e.b.i(this, context);
    }

    @Override // x5.e
    public void u(Context context) {
        e.b.b(this, context);
    }

    @Override // x5.e
    public long v(Cursor cursor, String str) {
        return e.b.l(this, cursor, str);
    }

    @Override // x5.e
    public List<v5.b> w(Context context, int i10, w5.e option) {
        Object[] m10;
        n.e(context, "context");
        n.e(option, "option");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String str = "bucket_id IS NOT NULL " + w5.e.c(option, i10, arrayList2, false, 4, null) + ") GROUP BY (bucket_id";
        ContentResolver contentResolver = context.getContentResolver();
        n.d(contentResolver, "getContentResolver(...)");
        Uri p10 = p();
        m10 = dk.l.m(e.f30417a.b(), new String[]{"count(1)"});
        Cursor q10 = q(contentResolver, p10, (String[]) m10, str, (String[]) arrayList2.toArray(new String[0]), null);
        if (q10 == null) {
            return arrayList;
        }
        while (q10.moveToNext()) {
            try {
                String string = q10.getString(0);
                String string2 = q10.getString(1);
                if (string2 == null) {
                    string2 = "";
                } else {
                    n.b(string2);
                }
                int i11 = q10.getInt(2);
                n.b(string);
                v5.b bVar = new v5.b(string, string2, i11, 0, false, null, 48, null);
                if (option.a()) {
                    f30410b.i(context, bVar);
                }
                arrayList.add(bVar);
            } finally {
            }
        }
        v vVar = v.f7137a;
        mk.b.a(q10, null);
        return arrayList;
    }

    @Override // x5.e
    public void x(Context context, String str) {
        e.b.A(this, context, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object[], java.lang.String] */
    @Override // x5.e
    public List<v5.a> y(Context context, String pathId, int i10, int i11, int i12, w5.e option) {
        StringBuilder sb2;
        String str;
        n.e(context, "context");
        n.e(pathId, "pathId");
        n.e(option, "option");
        boolean z10 = pathId.length() == 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!z10) {
            arrayList2.add(pathId);
        }
        String c10 = w5.e.c(option, i12, arrayList2, false, 4, null);
        String[] g10 = g();
        if (z10) {
            sb2 = new StringBuilder();
            str = "bucket_id IS NOT NULL ";
        } else {
            sb2 = new StringBuilder();
            str = "bucket_id = ? ";
        }
        sb2.append(str);
        sb2.append(c10);
        sb2.toString();
        String M = M(i10 * i11, i11, option);
        ContentResolver contentResolver = context.getContentResolver();
        n.d(contentResolver, "getContentResolver(...)");
        Uri p10 = p();
        ?? array = arrayList2.toArray(new String[0]);
        Cursor q10 = q(contentResolver, p10, g10, array, (String[]) array, M);
        if (q10 == null) {
            return arrayList;
        }
        while (q10.moveToNext()) {
            try {
                v5.a J = e.b.J(f30410b, q10, context, false, 2, null);
                if (J != null) {
                    arrayList.add(J);
                }
            } finally {
            }
        }
        v vVar = v.f7137a;
        mk.b.a(q10, null);
        return arrayList;
    }

    @Override // x5.e
    public String z(Cursor cursor, String str) {
        return e.b.q(this, cursor, str);
    }
}

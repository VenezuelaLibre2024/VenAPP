package p435x5;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import androidx.exifinterface.media.C1239a;
import ck.C2020e;
import ck.C2028m;
import ck.C2037v;
import dk.C7019l;
import dk.C7021m;
import dk.C7031r;
import dk.C7042z;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9322n;
import mk.C9601a;
import mk.C9602b;
import mk.C9609i;
import p280ok.InterfaceC9998l;
import p395v5.C11627a;
import p395v5.C11628b;
import p413w5.AbstractC12074e;
import p435x5.InterfaceC12289e;

/* renamed from: x5.d */
/* loaded from: classes.dex */
public final class C12288d implements InterfaceC12289e {

    /* renamed from: b */
    public static final C12288d f32922b = new C12288d();

    /* renamed from: c */
    private static final String[] f32923c = {"longitude", "latitude"};

    /* renamed from: d */
    private static final ReentrantLock f32924d = new ReentrantLock();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x5.d$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final String f32925a;

        /* renamed from: b */
        private final String f32926b;

        /* renamed from: c */
        private final String f32927c;

        public a(String path, String galleryId, String galleryName) {
            C9322n.m27781e(path, "path");
            C9322n.m27781e(galleryId, "galleryId");
            C9322n.m27781e(galleryName, "galleryName");
            this.f32925a = path;
            this.f32926b = galleryId;
            this.f32927c = galleryName;
        }

        /* renamed from: a */
        public final String m39631a() {
            return this.f32927c;
        }

        /* renamed from: b */
        public final String m39632b() {
            return this.f32925a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C9322n.m27777a(this.f32925a, aVar.f32925a) && C9322n.m27777a(this.f32926b, aVar.f32926b) && C9322n.m27777a(this.f32927c, aVar.f32927c);
        }

        public int hashCode() {
            return (((this.f32925a.hashCode() * 31) + this.f32926b.hashCode()) * 31) + this.f32927c.hashCode();
        }

        public String toString() {
            return "GalleryInfo(path=" + this.f32925a + ", galleryId=" + this.f32926b + ", galleryName=" + this.f32927c + ')';
        }
    }

    /* renamed from: x5.d$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC9323o implements InterfaceC9998l<String, CharSequence> {

        /* renamed from: a */
        public static final b f32928a = new b();

        b() {
            super(1);
        }

        @Override // p280ok.InterfaceC9998l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(String it) {
            C9322n.m27781e(it, "it");
            return "?";
        }
    }

    private C12288d() {
    }

    /* renamed from: J */
    private final a m39624J(Context context, String str) {
        ContentResolver contentResolver = context.getContentResolver();
        C9322n.m27780d(contentResolver, "getContentResolver(...)");
        Cursor mo39602q = mo39602q(contentResolver, mo39601p(), new String[]{"bucket_id", "bucket_display_name", "_data"}, "bucket_id = ?", new String[]{str}, null);
        if (mo39602q == null) {
            return null;
        }
        try {
            if (!mo39602q.moveToNext()) {
                C9602b.m28593a(mo39602q, null);
                return null;
            }
            C12288d c12288d = f32922b;
            String m39629N = c12288d.m39629N(mo39602q, "_data");
            if (m39629N == null) {
                C9602b.m28593a(mo39602q, null);
                return null;
            }
            String m39629N2 = c12288d.m39629N(mo39602q, "bucket_display_name");
            if (m39629N2 == null) {
                C9602b.m28593a(mo39602q, null);
                return null;
            }
            File parentFile = new File(m39629N).getParentFile();
            String absolutePath = parentFile != null ? parentFile.getAbsolutePath() : null;
            if (absolutePath == null) {
                C9602b.m28593a(mo39602q, null);
                return null;
            }
            C9322n.m27778b(absolutePath);
            a aVar = new a(absolutePath, str, m39629N2);
            C9602b.m28593a(mo39602q, null);
            return aVar;
        } finally {
        }
    }

    @Override // p435x5.InterfaceC12289e
    /* renamed from: A */
    public int mo39571A(int i10) {
        return InterfaceC12289e.b.m39662m(this, i10);
    }

    @Override // p435x5.InterfaceC12289e
    /* renamed from: B */
    public String mo39572B(Context context, String id2, boolean z10) {
        C9322n.m27781e(context, "context");
        C9322n.m27781e(id2, "id");
        C11627a m39655f = InterfaceC12289e.b.m39655f(this, context, id2, false, 4, null);
        if (m39655f == null) {
            return null;
        }
        return m39655f.m36438k();
    }

    @Override // p435x5.InterfaceC12289e
    /* renamed from: C */
    public C11627a mo39573C(Context context, String str, String str2, String str3, String str4) {
        return InterfaceC12289e.b.m39645F(this, context, str, str2, str3, str4);
    }

    @Override // p435x5.InterfaceC12289e
    /* renamed from: D */
    public C11628b mo39574D(Context context, String pathId, int i10, AbstractC12074e option) {
        String str;
        Object[] m20445m;
        C11628b c11628b;
        String str2;
        C9322n.m27781e(context, "context");
        C9322n.m27781e(pathId, "pathId");
        C9322n.m27781e(option, "option");
        ArrayList arrayList = new ArrayList();
        if (C9322n.m27777a(pathId, "")) {
            str = "";
        } else {
            arrayList.add(pathId);
            str = "AND bucket_id = ?";
        }
        String str3 = "bucket_id IS NOT NULL " + AbstractC12074e.m38787c(option, i10, arrayList, false, 4, null) + ' ' + str + ") GROUP BY (bucket_id";
        ContentResolver contentResolver = context.getContentResolver();
        C9322n.m27780d(contentResolver, "getContentResolver(...)");
        Uri mo39601p = mo39601p();
        m20445m = C7019l.m20445m(InterfaceC12289e.f32929a.m39635b(), new String[]{"count(1)"});
        Cursor mo39602q = mo39602q(contentResolver, mo39601p, (String[]) m20445m, str3, (String[]) arrayList.toArray(new String[0]), null);
        if (mo39602q == null) {
            return null;
        }
        try {
            if (mo39602q.moveToNext()) {
                String string = mo39602q.getString(0);
                String string2 = mo39602q.getString(1);
                if (string2 == null) {
                    str2 = "";
                } else {
                    C9322n.m27778b(string2);
                    str2 = string2;
                }
                int i11 = mo39602q.getInt(2);
                C9322n.m27778b(string);
                c11628b = new C11628b(string, str2, i11, 0, false, null, 48, null);
            } else {
                c11628b = null;
            }
            C9602b.m28593a(mo39602q, null);
            return c11628b;
        } finally {
        }
    }

    @Override // p435x5.InterfaceC12289e
    /* renamed from: E */
    public C1239a mo39575E(Context context, String id2) {
        C9322n.m27781e(context, "context");
        C9322n.m27781e(id2, "id");
        C11627a m39655f = InterfaceC12289e.b.m39655f(this, context, id2, false, 4, null);
        if (m39655f != null && new File(m39655f.m36438k()).exists()) {
            return new C1239a(m39655f.m36438k());
        }
        return null;
    }

    @Override // p435x5.InterfaceC12289e
    /* renamed from: F */
    public int mo39576F(Context context, AbstractC12074e abstractC12074e, int i10) {
        return InterfaceC12289e.b.m39654e(this, context, abstractC12074e, i10);
    }

    @Override // p435x5.InterfaceC12289e
    /* renamed from: G */
    public C11627a mo39577G(Context context, String assetId, String galleryId) {
        C9322n.m27781e(context, "context");
        C9322n.m27781e(assetId, "assetId");
        C9322n.m27781e(galleryId, "galleryId");
        C2028m<String, String> m39627L = m39627L(context, assetId);
        if (m39627L == null) {
            m39630O("Cannot get gallery id of " + assetId);
            throw new C2020e();
        }
        String m10335a = m39627L.m10335a();
        a m39624J = m39624J(context, galleryId);
        if (m39624J == null) {
            m39630O("Cannot get target gallery info");
            throw new C2020e();
        }
        if (C9322n.m27777a(galleryId, m10335a)) {
            m39630O("No move required, because the target gallery is the same as the current one.");
            throw new C2020e();
        }
        ContentResolver contentResolver = context.getContentResolver();
        C9322n.m27778b(contentResolver);
        Cursor mo39602q = mo39602q(contentResolver, mo39601p(), new String[]{"_data"}, m39626K(), new String[]{assetId}, null);
        if (mo39602q == null) {
            m39630O("Cannot find " + assetId + " path");
            throw new C2020e();
        }
        if (!mo39602q.moveToNext()) {
            m39630O("Cannot find " + assetId + " path");
            throw new C2020e();
        }
        String string = mo39602q.getString(0);
        mo39602q.close();
        String str = m39624J.m39632b() + '/' + new File(string).getName();
        new File(string).renameTo(new File(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("_data", str);
        contentValues.put("bucket_id", galleryId);
        contentValues.put("bucket_display_name", m39624J.m39631a());
        if (contentResolver.update(mo39601p(), contentValues, m39626K(), new String[]{assetId}) > 0) {
            return InterfaceC12289e.b.m39655f(this, context, assetId, false, 4, null);
        }
        m39630O("Cannot update " + assetId + " relativePath");
        throw new C2020e();
    }

    @Override // p435x5.InterfaceC12289e
    /* renamed from: H */
    public String mo39578H(Context context, long j10, int i10) {
        return InterfaceC12289e.b.m39663n(this, context, j10, i10);
    }

    /* renamed from: I */
    public int m39625I(int i10) {
        return InterfaceC12289e.b.m39652c(this, i10);
    }

    /* renamed from: K */
    public String m39626K() {
        return InterfaceC12289e.b.m39659j(this);
    }

    /* renamed from: L */
    public C2028m<String, String> m39627L(Context context, String assetId) {
        C9322n.m27781e(context, "context");
        C9322n.m27781e(assetId, "assetId");
        ContentResolver contentResolver = context.getContentResolver();
        C9322n.m27780d(contentResolver, "getContentResolver(...)");
        Cursor mo39602q = mo39602q(contentResolver, mo39601p(), new String[]{"bucket_id", "_data"}, "_id = ?", new String[]{assetId}, null);
        if (mo39602q == null) {
            return null;
        }
        try {
            if (!mo39602q.moveToNext()) {
                C9602b.m28593a(mo39602q, null);
                return null;
            }
            C2028m<String, String> c2028m = new C2028m<>(mo39602q.getString(0), new File(mo39602q.getString(1)).getParent());
            C9602b.m28593a(mo39602q, null);
            return c2028m;
        } finally {
        }
    }

    /* renamed from: M */
    public String m39628M(int i10, int i11, AbstractC12074e abstractC12074e) {
        return InterfaceC12289e.b.m39665p(this, i10, i11, abstractC12074e);
    }

    /* renamed from: N */
    public String m39629N(Cursor cursor, String str) {
        return InterfaceC12289e.b.m39667r(this, cursor, str);
    }

    /* renamed from: O */
    public Void m39630O(String str) {
        return InterfaceC12289e.b.m39647H(this, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object[], java.lang.String] */
    @Override // p435x5.InterfaceC12289e
    /* renamed from: a */
    public List<C11627a> mo39586a(Context context, String galleryId, int i10, int i11, int i12, AbstractC12074e option) {
        StringBuilder sb2;
        String str;
        C9322n.m27781e(context, "context");
        C9322n.m27781e(galleryId, "galleryId");
        C9322n.m27781e(option, "option");
        boolean z10 = galleryId.length() == 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!z10) {
            arrayList2.add(galleryId);
        }
        String m38787c = AbstractC12074e.m38787c(option, i12, arrayList2, false, 4, null);
        String[] mo39592g = mo39592g();
        if (z10) {
            sb2 = new StringBuilder();
            str = "bucket_id IS NOT NULL ";
        } else {
            sb2 = new StringBuilder();
            str = "bucket_id = ? ";
        }
        sb2.append(str);
        sb2.append(m38787c);
        sb2.toString();
        String m39628M = m39628M(i10, i11 - i10, option);
        ContentResolver contentResolver = context.getContentResolver();
        C9322n.m27780d(contentResolver, "getContentResolver(...)");
        Uri mo39601p = mo39601p();
        ?? array = arrayList2.toArray(new String[0]);
        Cursor mo39602q = mo39602q(contentResolver, mo39601p, mo39592g, array, (String[]) array, m39628M);
        if (mo39602q == null) {
            return arrayList;
        }
        while (mo39602q.moveToNext()) {
            try {
                C11627a m39649J = InterfaceC12289e.b.m39649J(f32922b, mo39602q, context, false, 2, null);
                if (m39649J != null) {
                    arrayList.add(m39649J);
                }
            } finally {
            }
        }
        C2037v c2037v = C2037v.f8089a;
        C9602b.m28593a(mo39602q, null);
        return arrayList;
    }

    @Override // p435x5.InterfaceC12289e
    /* renamed from: b */
    public boolean mo39587b(Context context, String str) {
        return InterfaceC12289e.b.m39650a(this, context, str);
    }

    @Override // p435x5.InterfaceC12289e
    /* renamed from: c */
    public Long mo39588c(Context context, String str) {
        return InterfaceC12289e.b.m39664o(this, context, str);
    }

    @Override // p435x5.InterfaceC12289e
    /* renamed from: d */
    public C11627a mo39589d(Context context, String id2, boolean z10) {
        List m20616R;
        List m20618T;
        List m20618T2;
        List m20639y;
        C9322n.m27781e(context, "context");
        C9322n.m27781e(id2, "id");
        InterfaceC12289e.a aVar = InterfaceC12289e.f32929a;
        m20616R = C7042z.m20616R(aVar.m39636c(), aVar.m39637d());
        m20618T = C7042z.m20618T(m20616R, f32923c);
        m20618T2 = C7042z.m20618T(m20618T, aVar.m39638e());
        m20639y = C7042z.m20639y(m20618T2);
        ContentResolver contentResolver = context.getContentResolver();
        C9322n.m27780d(contentResolver, "getContentResolver(...)");
        Cursor mo39602q = mo39602q(contentResolver, mo39601p(), (String[]) m20639y.toArray(new String[0]), "_id = ?", new String[]{id2}, null);
        if (mo39602q == null) {
            return null;
        }
        try {
            C11627a mo39593h = mo39602q.moveToNext() ? f32922b.mo39593h(mo39602q, context, z10) : null;
            C9602b.m28593a(mo39602q, null);
            return mo39593h;
        } finally {
        }
    }

    @Override // p435x5.InterfaceC12289e
    /* renamed from: e */
    public boolean mo39590e(Context context) {
        String m20611M;
        C9322n.m27781e(context, "context");
        ReentrantLock reentrantLock = f32924d;
        if (reentrantLock.isLocked()) {
            return false;
        }
        reentrantLock.lock();
        try {
            ArrayList arrayList = new ArrayList();
            ContentResolver contentResolver = context.getContentResolver();
            C12288d c12288d = f32922b;
            C9322n.m27778b(contentResolver);
            Cursor mo39602q = c12288d.mo39602q(contentResolver, c12288d.mo39601p(), new String[]{"_id", "_data"}, null, null, null);
            if (mo39602q == null) {
                return false;
            }
            while (mo39602q.moveToNext()) {
                try {
                    C12288d c12288d2 = f32922b;
                    String mo39611z = c12288d2.mo39611z(mo39602q, "_id");
                    String mo39611z2 = c12288d2.mo39611z(mo39602q, "_data");
                    if (!new File(mo39611z2).exists()) {
                        arrayList.add(mo39611z);
                        Log.i("PhotoManagerPlugin", "The " + mo39611z2 + " was not exists. ");
                    }
                } finally {
                }
            }
            Log.i("PhotoManagerPlugin", "will be delete ids = " + arrayList);
            C9602b.m28593a(mo39602q, null);
            m20611M = C7042z.m20611M(arrayList, ",", null, null, 0, null, b.f32928a, 30, null);
            int delete = contentResolver.delete(f32922b.mo39601p(), "_id in ( " + m20611M + " )", (String[]) arrayList.toArray(new String[0]));
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

    @Override // p435x5.InterfaceC12289e
    /* renamed from: f */
    public C11627a mo39591f(Context context, byte[] bArr, String str, String str2, String str3) {
        return InterfaceC12289e.b.m39642C(this, context, bArr, str, str2, str3);
    }

    @Override // p435x5.InterfaceC12289e
    /* renamed from: g */
    public String[] mo39592g() {
        List m20616R;
        List m20618T;
        List m20618T2;
        List m20639y;
        InterfaceC12289e.a aVar = InterfaceC12289e.f32929a;
        m20616R = C7042z.m20616R(aVar.m39636c(), aVar.m39637d());
        m20618T = C7042z.m20618T(m20616R, aVar.m39638e());
        m20618T2 = C7042z.m20618T(m20618T, f32923c);
        m20639y = C7042z.m20639y(m20618T2);
        return (String[]) m20639y.toArray(new String[0]);
    }

    @Override // p435x5.InterfaceC12289e
    /* renamed from: h */
    public C11627a mo39593h(Cursor cursor, Context context, boolean z10) {
        return InterfaceC12289e.b.m39648I(this, cursor, context, z10);
    }

    @Override // p435x5.InterfaceC12289e
    /* renamed from: i */
    public void mo39594i(Context context, C11628b c11628b) {
        InterfaceC12289e.b.m39671v(this, context, c11628b);
    }

    @Override // p435x5.InterfaceC12289e
    /* renamed from: j */
    public List<C11628b> mo39595j(Context context, int i10, AbstractC12074e option) {
        Object[] m20445m;
        int m20448A;
        C9322n.m27781e(context, "context");
        C9322n.m27781e(option, "option");
        ArrayList arrayList = new ArrayList();
        m20445m = C7019l.m20445m(InterfaceC12289e.f32929a.m39635b(), new String[]{"count(1)"});
        String[] strArr = (String[]) m20445m;
        ArrayList arrayList2 = new ArrayList();
        String str = "bucket_id IS NOT NULL " + AbstractC12074e.m38787c(option, i10, arrayList2, false, 4, null);
        ContentResolver contentResolver = context.getContentResolver();
        C9322n.m27780d(contentResolver, "getContentResolver(...)");
        Cursor mo39602q = mo39602q(contentResolver, mo39601p(), strArr, str, (String[]) arrayList2.toArray(new String[0]), null);
        if (mo39602q == null) {
            return arrayList;
        }
        try {
            if (mo39602q.moveToNext()) {
                m20448A = C7021m.m20448A(strArr, "count(1)");
                arrayList.add(new C11628b("isAll", "Recent", mo39602q.getInt(m20448A), i10, true, null, 32, null));
            }
            C2037v c2037v = C2037v.f8089a;
            C9602b.m28593a(mo39602q, null);
            return arrayList;
        } finally {
        }
    }

    @Override // p435x5.InterfaceC12289e
    /* renamed from: k */
    public int mo39596k(Cursor cursor, String str) {
        return InterfaceC12289e.b.m39660k(this, cursor, str);
    }

    @Override // p435x5.InterfaceC12289e
    /* renamed from: l */
    public C11627a mo39597l(Context context, String str, String str2, String str3, String str4) {
        return InterfaceC12289e.b.m39641B(this, context, str, str2, str3, str4);
    }

    @Override // p435x5.InterfaceC12289e
    /* renamed from: m */
    public List<String> mo39598m(Context context, List<String> list) {
        return InterfaceC12289e.b.m39657h(this, context, list);
    }

    @Override // p435x5.InterfaceC12289e
    /* renamed from: n */
    public byte[] mo39599n(Context context, C11627a asset, boolean z10) {
        byte[] m28601a;
        C9322n.m27781e(context, "context");
        C9322n.m27781e(asset, "asset");
        m28601a = C9609i.m28601a(new File(asset.m36438k()));
        return m28601a;
    }

    @Override // p435x5.InterfaceC12289e
    /* renamed from: o */
    public C11627a mo39600o(Context context, String assetId, String galleryId) {
        ArrayList m20578f;
        Object[] m20445m;
        C9322n.m27781e(context, "context");
        C9322n.m27781e(assetId, "assetId");
        C9322n.m27781e(galleryId, "galleryId");
        C2028m<String, String> m39627L = m39627L(context, assetId);
        if (m39627L == null) {
            throw new RuntimeException("Cannot get gallery id of " + assetId);
        }
        if (C9322n.m27777a(galleryId, m39627L.m10335a())) {
            throw new RuntimeException("No copy required, because the target gallery is the same as the current one.");
        }
        ContentResolver contentResolver = context.getContentResolver();
        C11627a m39655f = InterfaceC12289e.b.m39655f(this, context, assetId, false, 4, null);
        if (m39655f == null) {
            throw new RuntimeException("No copy required, because the target gallery is the same as the current one.");
        }
        m20578f = C7031r.m20578f("_display_name", "title", "date_added", "date_modified", "duration", "longitude", "latitude", "width", "height");
        int m39625I = m39625I(m39655f.m36440m());
        if (m39625I != 2) {
            m20578f.add("description");
        }
        C9322n.m27778b(contentResolver);
        Uri mo39601p = mo39601p();
        m20445m = C7019l.m20445m(m20578f.toArray(new String[0]), new String[]{"_data"});
        Cursor mo39602q = mo39602q(contentResolver, mo39601p, (String[]) m20445m, m39626K(), new String[]{assetId}, null);
        if (mo39602q == null) {
            throw new RuntimeException("Cannot find asset .");
        }
        if (!mo39602q.moveToNext()) {
            throw new RuntimeException("Cannot find asset .");
        }
        Uri m39680b = C12290f.f32937a.m39680b(m39625I);
        a m39624J = m39624J(context, galleryId);
        if (m39624J == null) {
            m39630O("Cannot find gallery info");
            throw new C2020e();
        }
        String str = m39624J.m39632b() + '/' + m39655f.m36429b();
        ContentValues contentValues = new ContentValues();
        Iterator it = m20578f.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            C12288d c12288d = f32922b;
            C9322n.m27778b(str2);
            contentValues.put(str2, c12288d.mo39611z(mo39602q, str2));
        }
        contentValues.put("media_type", Integer.valueOf(m39625I));
        contentValues.put("_data", str);
        Uri insert = contentResolver.insert(m39680b, contentValues);
        if (insert == null) {
            throw new RuntimeException("Cannot insert new asset.");
        }
        OutputStream openOutputStream = contentResolver.openOutputStream(insert);
        if (openOutputStream == null) {
            throw new RuntimeException("Cannot open output stream for " + insert + '.');
        }
        FileInputStream fileInputStream = new FileInputStream(new File(m39655f.m36438k()));
        try {
            try {
                C9601a.m28591b(fileInputStream, openOutputStream, 0, 2, null);
                C9602b.m28593a(openOutputStream, null);
                C9602b.m28593a(fileInputStream, null);
                mo39602q.close();
                String lastPathSegment = insert.getLastPathSegment();
                if (lastPathSegment != null) {
                    return InterfaceC12289e.b.m39655f(this, context, lastPathSegment, false, 4, null);
                }
                throw new RuntimeException("Cannot open output stream for " + insert + '.');
            } finally {
            }
        } finally {
        }
    }

    @Override // p435x5.InterfaceC12289e
    /* renamed from: p */
    public Uri mo39601p() {
        return InterfaceC12289e.b.m39653d(this);
    }

    @Override // p435x5.InterfaceC12289e
    /* renamed from: q */
    public Cursor mo39602q(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return InterfaceC12289e.b.m39674y(this, contentResolver, uri, strArr, str, strArr2, str2);
    }

    @Override // p435x5.InterfaceC12289e
    /* renamed from: r */
    public Uri mo39603r(long j10, int i10, boolean z10) {
        return InterfaceC12289e.b.m39669t(this, j10, i10, z10);
    }

    @Override // p435x5.InterfaceC12289e
    /* renamed from: s */
    public List<C11627a> mo39604s(Context context, AbstractC12074e abstractC12074e, int i10, int i11, int i12) {
        return InterfaceC12289e.b.m39656g(this, context, abstractC12074e, i10, i11, i12);
    }

    @Override // p435x5.InterfaceC12289e
    /* renamed from: t */
    public List<String> mo39605t(Context context) {
        return InterfaceC12289e.b.m39658i(this, context);
    }

    @Override // p435x5.InterfaceC12289e
    /* renamed from: u */
    public void mo39606u(Context context) {
        InterfaceC12289e.b.m39651b(this, context);
    }

    @Override // p435x5.InterfaceC12289e
    /* renamed from: v */
    public long mo39607v(Cursor cursor, String str) {
        return InterfaceC12289e.b.m39661l(this, cursor, str);
    }

    @Override // p435x5.InterfaceC12289e
    /* renamed from: w */
    public List<C11628b> mo39608w(Context context, int i10, AbstractC12074e option) {
        Object[] m20445m;
        C9322n.m27781e(context, "context");
        C9322n.m27781e(option, "option");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String str = "bucket_id IS NOT NULL " + AbstractC12074e.m38787c(option, i10, arrayList2, false, 4, null) + ") GROUP BY (bucket_id";
        ContentResolver contentResolver = context.getContentResolver();
        C9322n.m27780d(contentResolver, "getContentResolver(...)");
        Uri mo39601p = mo39601p();
        m20445m = C7019l.m20445m(InterfaceC12289e.f32929a.m39635b(), new String[]{"count(1)"});
        Cursor mo39602q = mo39602q(contentResolver, mo39601p, (String[]) m20445m, str, (String[]) arrayList2.toArray(new String[0]), null);
        if (mo39602q == null) {
            return arrayList;
        }
        while (mo39602q.moveToNext()) {
            try {
                String string = mo39602q.getString(0);
                String string2 = mo39602q.getString(1);
                if (string2 == null) {
                    string2 = "";
                } else {
                    C9322n.m27778b(string2);
                }
                int i11 = mo39602q.getInt(2);
                C9322n.m27778b(string);
                C11628b c11628b = new C11628b(string, string2, i11, 0, false, null, 48, null);
                if (option.mo38754a()) {
                    f32922b.mo39594i(context, c11628b);
                }
                arrayList.add(c11628b);
            } finally {
            }
        }
        C2037v c2037v = C2037v.f8089a;
        C9602b.m28593a(mo39602q, null);
        return arrayList;
    }

    @Override // p435x5.InterfaceC12289e
    /* renamed from: x */
    public void mo39609x(Context context, String str) {
        InterfaceC12289e.b.m39640A(this, context, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object[], java.lang.String] */
    @Override // p435x5.InterfaceC12289e
    /* renamed from: y */
    public List<C11627a> mo39610y(Context context, String pathId, int i10, int i11, int i12, AbstractC12074e option) {
        StringBuilder sb2;
        String str;
        C9322n.m27781e(context, "context");
        C9322n.m27781e(pathId, "pathId");
        C9322n.m27781e(option, "option");
        boolean z10 = pathId.length() == 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!z10) {
            arrayList2.add(pathId);
        }
        String m38787c = AbstractC12074e.m38787c(option, i12, arrayList2, false, 4, null);
        String[] mo39592g = mo39592g();
        if (z10) {
            sb2 = new StringBuilder();
            str = "bucket_id IS NOT NULL ";
        } else {
            sb2 = new StringBuilder();
            str = "bucket_id = ? ";
        }
        sb2.append(str);
        sb2.append(m38787c);
        sb2.toString();
        String m39628M = m39628M(i10 * i11, i11, option);
        ContentResolver contentResolver = context.getContentResolver();
        C9322n.m27780d(contentResolver, "getContentResolver(...)");
        Uri mo39601p = mo39601p();
        ?? array = arrayList2.toArray(new String[0]);
        Cursor mo39602q = mo39602q(contentResolver, mo39601p, mo39592g, array, (String[]) array, m39628M);
        if (mo39602q == null) {
            return arrayList;
        }
        while (mo39602q.moveToNext()) {
            try {
                C11627a m39649J = InterfaceC12289e.b.m39649J(f32922b, mo39602q, context, false, 2, null);
                if (m39649J != null) {
                    arrayList.add(m39649J);
                }
            } finally {
            }
        }
        C2037v c2037v = C2037v.f8089a;
        C9602b.m28593a(mo39602q, null);
        return arrayList;
    }

    @Override // p435x5.InterfaceC12289e
    /* renamed from: z */
    public String mo39611z(Cursor cursor, String str) {
        return InterfaceC12289e.b.m39666q(this, cursor, str);
    }
}

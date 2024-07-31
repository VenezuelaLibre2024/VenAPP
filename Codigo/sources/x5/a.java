package x5;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import ck.m;
import ck.v;
import dk.r;
import dk.z;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import ok.l;
import x5.e;

/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: b, reason: collision with root package name */
    public static final a f30399b = new a();

    /* renamed from: c, reason: collision with root package name */
    private static final u5.a f30400c = new u5.a();

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f30401d;

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f30402e;

    /* renamed from: f, reason: collision with root package name */
    private static final ReentrantLock f30403f;

    /* renamed from: x5.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0497a extends o implements l<Cursor, v> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f30404a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList<v5.a> f30405b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0497a(Context context, ArrayList<v5.a> arrayList) {
            super(1);
            this.f30404a = context;
            this.f30405b = arrayList;
        }

        public final void a(Cursor cursor) {
            n.e(cursor, "cursor");
            v5.a J = e.b.J(a.f30399b, cursor, this.f30404a, false, 2, null);
            if (J != null) {
                this.f30405b.add(J);
            }
        }

        @Override // ok.l
        public /* bridge */ /* synthetic */ v invoke(Cursor cursor) {
            a(cursor);
            return v.f7137a;
        }
    }

    /* loaded from: classes.dex */
    static final class b extends o implements l<Cursor, v> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f30406a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList<v5.a> f30407b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, ArrayList<v5.a> arrayList) {
            super(1);
            this.f30406a = context;
            this.f30407b = arrayList;
        }

        public final void a(Cursor cursor) {
            n.e(cursor, "cursor");
            v5.a J = e.b.J(a.f30399b, cursor, this.f30406a, false, 2, null);
            if (J != null) {
                this.f30407b.add(J);
            }
        }

        @Override // ok.l
        public /* bridge */ /* synthetic */ v invoke(Cursor cursor) {
            a(cursor);
            return v.f7137a;
        }
    }

    /* loaded from: classes.dex */
    static final class c extends o implements l<String, CharSequence> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f30408a = new c();

        c() {
            super(1);
        }

        @Override // ok.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(String it) {
            n.e(it, "it");
            return "?";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r0 != false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    static {
        /*
            x5.a r0 = new x5.a
            r0.<init>()
            x5.a.f30399b = r0
            u5.a r0 = new u5.a
            r0.<init>()
            x5.a.f30400c = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 0
            r3 = 29
            if (r0 != r3) goto L1e
            boolean r4 = c3.r.a()
            if (r4 != 0) goto L1e
            r4 = r1
            goto L1f
        L1e:
            r4 = r2
        L1f:
            x5.a.f30401d = r4
            if (r0 != r3) goto L2a
            boolean r0 = c3.r.a()
            if (r0 == 0) goto L2a
            goto L2b
        L2a:
            r1 = r2
        L2b:
            x5.a.f30402e = r1
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            x5.a.f30403f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.a.<clinit>():void");
    }

    private a() {
    }

    private final void J(Cursor cursor, int i10, int i11, l<? super Cursor, v> lVar) {
        if (!f30402e) {
            cursor.moveToPosition(i10 - 1);
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (cursor.moveToNext()) {
                lVar.invoke(cursor);
            }
        }
    }

    private final String L(Context context, String str) {
        ContentResolver contentResolver = context.getContentResolver();
        n.b(contentResolver);
        Cursor q10 = q(contentResolver, p(), new String[]{"bucket_id", "relative_path"}, "bucket_id = ?", new String[]{str}, null);
        if (q10 == null) {
            return null;
        }
        try {
            if (!q10.moveToNext()) {
                mk.b.a(q10, null);
                return null;
            }
            String string = q10.getString(1);
            mk.b.a(q10, null);
            return string;
        } finally {
        }
    }

    private final Uri Q(v5.a aVar, boolean z10) {
        return r(aVar.e(), aVar.m(), z10);
    }

    static /* synthetic */ Uri R(a aVar, v5.a aVar2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return aVar.Q(aVar2, z10);
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
        if (!f30401d) {
            return f10.k();
        }
        File c10 = f30400c.c(context, f10, z10);
        if (c10 != null) {
            return c10.getAbsolutePath();
        }
        return null;
    }

    @Override // x5.e
    public v5.a C(Context context, String str, String str2, String str3, String str4) {
        return e.b.F(this, context, str, str2, str3, str4);
    }

    @Override // x5.e
    public v5.b D(Context context, String pathId, int i10, w5.e option) {
        String str;
        n.e(context, "context");
        n.e(pathId, "pathId");
        n.e(option, "option");
        boolean a10 = n.a(pathId, "");
        ArrayList arrayList = new ArrayList();
        String c10 = w5.e.c(option, i10, arrayList, false, 4, null);
        if (a10) {
            str = "";
        } else {
            arrayList.add(pathId);
            str = "AND bucket_id = ?";
        }
        ContentResolver contentResolver = context.getContentResolver();
        n.d(contentResolver, "getContentResolver(...)");
        Cursor q10 = q(contentResolver, p(), e.f30417a.b(), "bucket_id IS NOT NULL " + c10 + ' ' + str, (String[]) arrayList.toArray(new String[0]), null);
        if (q10 == null) {
            return null;
        }
        try {
            if (!q10.moveToNext()) {
                mk.b.a(q10, null);
                return null;
            }
            String string = q10.getString(1);
            if (string == null) {
                string = "";
            } else {
                n.b(string);
            }
            int count = q10.getCount();
            v vVar = v.f7137a;
            mk.b.a(q10, null);
            return new v5.b(pathId, string, count, i10, a10, null, 32, null);
        } finally {
        }
    }

    @Override // x5.e
    public androidx.exifinterface.media.a E(Context context, String id2) {
        Uri requireOriginal;
        n.e(context, "context");
        n.e(id2, "id");
        try {
            v5.a f10 = e.b.f(this, context, id2, false, 4, null);
            if (f10 == null) {
                return null;
            }
            requireOriginal = MediaStore.setRequireOriginal(R(this, f10, false, 2, null));
            n.d(requireOriginal, "setRequireOriginal(...)");
            InputStream openInputStream = context.getContentResolver().openInputStream(requireOriginal);
            if (openInputStream == null) {
                return null;
            }
            return new androidx.exifinterface.media.a(openInputStream);
        } catch (Exception unused) {
            return null;
        }
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
        m<String, String> M = M(context, assetId);
        if (M == null) {
            S("Cannot get gallery id of " + assetId);
            throw new ck.e();
        }
        if (n.a(galleryId, M.a())) {
            S("No move required, because the target gallery is the same as the current one.");
            throw new ck.e();
        }
        ContentResolver contentResolver = context.getContentResolver();
        String L = L(context, galleryId);
        ContentValues contentValues = new ContentValues();
        contentValues.put("relative_path", L);
        if (contentResolver.update(p(), contentValues, K(), new String[]{assetId}) > 0) {
            return e.b.f(this, context, assetId, false, 4, null);
        }
        S("Cannot update " + assetId + " relativePath");
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

    public m<String, String> M(Context context, String assetId) {
        n.e(context, "context");
        n.e(assetId, "assetId");
        ContentResolver contentResolver = context.getContentResolver();
        n.b(contentResolver);
        Cursor q10 = q(contentResolver, p(), new String[]{"bucket_id", "relative_path"}, "_id = ?", new String[]{assetId}, null);
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

    public String N(int i10, int i11, w5.e filterOption) {
        n.e(filterOption, "filterOption");
        return f30402e ? e.b.p(this, i10, i11, filterOption) : filterOption.d();
    }

    public String O(Cursor cursor, String str) {
        return e.b.r(this, cursor, str);
    }

    public int P(int i10) {
        return e.b.s(this, i10);
    }

    public Void S(String str) {
        return e.b.H(this, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.String, int] */
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
        ?? r12 = i11 - i10;
        String N = N(i10, r12, option);
        ContentResolver contentResolver = context.getContentResolver();
        n.d(contentResolver, "getContentResolver(...)");
        Cursor q10 = q(contentResolver, p(), g(), r12, (String[]) arrayList2.toArray(new String[0]), N);
        if (q10 == null) {
            return arrayList;
        }
        try {
            f30399b.J(q10, i10, r12, new b(context, arrayList));
            v vVar = v.f7137a;
            mk.b.a(q10, null);
            return arrayList;
        } finally {
        }
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
        n.e(context, "context");
        n.e(id2, "id");
        ContentResolver contentResolver = context.getContentResolver();
        n.d(contentResolver, "getContentResolver(...)");
        Cursor q10 = q(contentResolver, p(), g(), "_id = ?", new String[]{id2}, null);
        if (q10 == null) {
            return null;
        }
        try {
            v5.a h10 = q10.moveToNext() ? f30399b.h(q10, context, z10) : null;
            mk.b.a(q10, null);
            return h10;
        } finally {
        }
    }

    @Override // x5.e
    public boolean e(Context context) {
        String M;
        boolean z10;
        n.e(context, "context");
        ReentrantLock reentrantLock = f30403f;
        if (reentrantLock.isLocked()) {
            Log.i("PhotoManagerPlugin", "The removeAllExistsAssets is running.");
            return false;
        }
        reentrantLock.lock();
        try {
            Log.i("PhotoManagerPlugin", "The removeAllExistsAssets is starting.");
            ArrayList arrayList = new ArrayList();
            ContentResolver contentResolver = context.getContentResolver();
            a aVar = f30399b;
            n.b(contentResolver);
            Uri p10 = aVar.p();
            String[] strArr = {"_id", "media_type", "_data"};
            Integer[] numArr = {2, 3, 1};
            ArrayList arrayList2 = new ArrayList(3);
            int i10 = 0;
            for (int i11 = 3; i10 < i11; i11 = 3) {
                arrayList2.add(String.valueOf(numArr[i10].intValue()));
                i10++;
            }
            Cursor q10 = aVar.q(contentResolver, p10, strArr, "media_type in ( ?,?,? )", (String[]) arrayList2.toArray(new String[0]), null);
            if (q10 == null) {
                return false;
            }
            int i12 = 0;
            while (q10.moveToNext()) {
                try {
                    a aVar2 = f30399b;
                    String z11 = aVar2.z(q10, "_id");
                    int k10 = aVar2.k(q10, "media_type");
                    String O = aVar2.O(q10, "_data");
                    try {
                        InputStream openInputStream = contentResolver.openInputStream(e.b.u(aVar2, Long.parseLong(z11), aVar2.P(k10), false, 4, null));
                        if (openInputStream != null) {
                            openInputStream.close();
                        }
                        z10 = true;
                    } catch (Exception unused) {
                        z10 = false;
                    }
                    if (!z10) {
                        arrayList.add(z11);
                        Log.i("PhotoManagerPlugin", "The " + z11 + ", " + O + " media was not exists. ");
                    }
                    i12++;
                    if (i12 % 300 == 0) {
                        Log.i("PhotoManagerPlugin", "Current checked count == " + i12);
                    }
                } finally {
                }
            }
            Log.i("PhotoManagerPlugin", "The removeAllExistsAssets was stopped, will be delete ids = " + arrayList);
            mk.b.a(q10, null);
            M = z.M(arrayList, ",", null, null, 0, null, c.f30408a, 30, null);
            int delete = contentResolver.delete(f30399b.p(), "_id in ( " + M + " )", (String[]) arrayList.toArray(new String[0]));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Delete rows: ");
            sb2.append(delete);
            Log.i("PhotoManagerPlugin", sb2.toString());
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
        T2 = z.T(T, new String[]{"relative_path"});
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
        n.e(context, "context");
        n.e(option, "option");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String str = "bucket_id IS NOT NULL " + w5.e.c(option, i10, arrayList2, false, 4, null);
        ContentResolver contentResolver = context.getContentResolver();
        n.d(contentResolver, "getContentResolver(...)");
        Cursor q10 = q(contentResolver, p(), e.f30417a.b(), str, (String[]) arrayList2.toArray(new String[0]), option.d());
        if (q10 == null) {
            return arrayList;
        }
        try {
            arrayList.add(new v5.b("isAll", "Recent", q10.getCount(), i10, true, null, 32, null));
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
        n.e(context, "context");
        n.e(asset, "asset");
        InputStream openInputStream = context.getContentResolver().openInputStream(Q(asset, z10));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            if (openInputStream != null) {
                try {
                    byteArrayOutputStream.write(mk.a.c(openInputStream));
                    v vVar = v.f7137a;
                    mk.b.a(openInputStream, null);
                } finally {
                }
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (b6.a.f6152a.e()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("The asset ");
                sb2.append(asset.e());
                sb2.append(" origin byte length : ");
                n.b(byteArray);
                sb2.append(byteArray.length);
                b6.a.d(sb2.toString());
            }
            n.b(byteArray);
            mk.b.a(byteArrayOutputStream, null);
            return byteArray;
        } finally {
        }
    }

    @Override // x5.e
    public v5.a o(Context context, String assetId, String galleryId) {
        ArrayList f10;
        Object[] m10;
        n.e(context, "context");
        n.e(assetId, "assetId");
        n.e(galleryId, "galleryId");
        m<String, String> M = M(context, assetId);
        if (M == null) {
            S("Cannot get gallery id of " + assetId);
            throw new ck.e();
        }
        if (n.a(galleryId, M.a())) {
            S("No copy required, because the target gallery is the same as the current one.");
            throw new ck.e();
        }
        v5.a f11 = e.b.f(this, context, assetId, false, 4, null);
        if (f11 == null) {
            S("No copy required, because the target gallery is the same as the current one.");
            throw new ck.e();
        }
        f10 = r.f("_display_name", "title", "date_added", "date_modified", "datetaken", "duration", "width", "height", "orientation");
        int I = I(f11.m());
        if (I == 3) {
            f10.add("description");
        }
        ContentResolver contentResolver = context.getContentResolver();
        n.b(contentResolver);
        Uri p10 = p();
        m10 = dk.l.m(f10.toArray(new String[0]), new String[]{"relative_path"});
        Cursor q10 = q(contentResolver, p10, (String[]) m10, K(), new String[]{assetId}, null);
        if (q10 == null) {
            S("Cannot find asset.");
            throw new ck.e();
        }
        if (!q10.moveToNext()) {
            S("Cannot find asset.");
            throw new ck.e();
        }
        Uri b10 = f.f30425a.b(I);
        String L = L(context, galleryId);
        ContentValues contentValues = new ContentValues();
        Iterator it = f10.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            a aVar = f30399b;
            n.b(str);
            contentValues.put(str, aVar.z(q10, str));
        }
        contentValues.put("media_type", Integer.valueOf(I));
        contentValues.put("relative_path", L);
        Uri insert = contentResolver.insert(b10, contentValues);
        if (insert == null) {
            S("Cannot insert new asset.");
            throw new ck.e();
        }
        OutputStream openOutputStream = contentResolver.openOutputStream(insert);
        if (openOutputStream == null) {
            S("Cannot open output stream for " + insert + '.');
            throw new ck.e();
        }
        Uri Q = Q(f11, true);
        InputStream openInputStream = contentResolver.openInputStream(Q);
        if (openInputStream == null) {
            S("Cannot open input stream for " + Q);
            throw new ck.e();
        }
        try {
            try {
                mk.a.b(openInputStream, openOutputStream, 0, 2, null);
                mk.b.a(openOutputStream, null);
                mk.b.a(openInputStream, null);
                q10.close();
                String lastPathSegment = insert.getLastPathSegment();
                if (lastPathSegment != null) {
                    return e.b.f(this, context, lastPathSegment, false, 4, null);
                }
                S("Cannot open output stream for " + insert + '.');
                throw new ck.e();
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
        n.e(context, "context");
        e.b.b(this, context);
        f30400c.a(context);
    }

    @Override // x5.e
    public long v(Cursor cursor, String str) {
        return e.b.l(this, cursor, str);
    }

    @Override // x5.e
    public List<v5.b> w(Context context, int i10, w5.e option) {
        int i11;
        n.e(context, "context");
        n.e(option, "option");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String str = "bucket_id IS NOT NULL " + w5.e.c(option, i10, arrayList2, false, 4, null);
        ContentResolver contentResolver = context.getContentResolver();
        n.d(contentResolver, "getContentResolver(...)");
        Cursor q10 = q(contentResolver, p(), e.f30417a.b(), str, (String[]) arrayList2.toArray(new String[0]), option.d());
        if (q10 == null) {
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        try {
            b6.a.f(q10, "bucket_id");
            while (q10.moveToNext()) {
                a aVar = f30399b;
                String z10 = aVar.z(q10, "bucket_id");
                if (hashMap.containsKey(z10)) {
                    Object obj = hashMap2.get(z10);
                    n.b(obj);
                    i11 = Integer.valueOf(((Number) obj).intValue() + 1);
                } else {
                    hashMap.put(z10, aVar.z(q10, "bucket_display_name"));
                    i11 = 1;
                }
                hashMap2.put(z10, i11);
            }
            v vVar = v.f7137a;
            mk.b.a(q10, null);
            for (Map.Entry entry : hashMap.entrySet()) {
                String str2 = (String) entry.getKey();
                String str3 = (String) entry.getValue();
                Object obj2 = hashMap2.get(str2);
                n.b(obj2);
                v5.b bVar = new v5.b(str2, str3, ((Number) obj2).intValue(), i10, false, null, 32, null);
                if (option.a()) {
                    f30399b.i(context, bVar);
                }
                arrayList.add(bVar);
            }
            return arrayList;
        } finally {
        }
    }

    @Override // x5.e
    public void x(Context context, String str) {
        e.b.A(this, context, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.String, int] */
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
        ?? r12 = i10 * i11;
        String N = N(r12, i11, option);
        ContentResolver contentResolver = context.getContentResolver();
        n.d(contentResolver, "getContentResolver(...)");
        Cursor q10 = q(contentResolver, p(), g(), r12, (String[]) arrayList2.toArray(new String[0]), N);
        if (q10 == null) {
            return arrayList;
        }
        try {
            f30399b.J(q10, r12, i11, new C0497a(context, arrayList));
            v vVar = v.f7137a;
            mk.b.a(q10, null);
            return arrayList;
        } finally {
        }
    }

    @Override // x5.e
    public String z(Cursor cursor, String str) {
        return e.b.q(this, cursor, str);
    }
}

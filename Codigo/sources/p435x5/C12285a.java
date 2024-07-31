package p435x5;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import androidx.exifinterface.media.C1239a;
import ck.C2020e;
import ck.C2028m;
import ck.C2037v;
import dk.C7019l;
import dk.C7031r;
import dk.C7042z;
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
import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9322n;
import mk.C9601a;
import mk.C9602b;
import p024b6.C1662a;
import p280ok.InterfaceC9998l;
import p375u5.C11326a;
import p395v5.C11627a;
import p395v5.C11628b;
import p413w5.AbstractC12074e;
import p435x5.InterfaceC12289e;

/* renamed from: x5.a */
/* loaded from: classes.dex */
public final class C12285a implements InterfaceC12289e {

    /* renamed from: b */
    public static final C12285a f32911b = new C12285a();

    /* renamed from: c */
    private static final C11326a f32912c = new C11326a();

    /* renamed from: d */
    private static final boolean f32913d;

    /* renamed from: e */
    private static final boolean f32914e;

    /* renamed from: f */
    private static final ReentrantLock f32915f;

    /* renamed from: x5.a$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC9323o implements InterfaceC9998l<Cursor, C2037v> {

        /* renamed from: a */
        final /* synthetic */ Context f32916a;

        /* renamed from: b */
        final /* synthetic */ ArrayList<C11627a> f32917b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, ArrayList<C11627a> arrayList) {
            super(1);
            this.f32916a = context;
            this.f32917b = arrayList;
        }

        /* renamed from: a */
        public final void m39612a(Cursor cursor) {
            C9322n.m27781e(cursor, "cursor");
            C11627a m39649J = InterfaceC12289e.b.m39649J(C12285a.f32911b, cursor, this.f32916a, false, 2, null);
            if (m39649J != null) {
                this.f32917b.add(m39649J);
            }
        }

        @Override // p280ok.InterfaceC9998l
        public /* bridge */ /* synthetic */ C2037v invoke(Cursor cursor) {
            m39612a(cursor);
            return C2037v.f8089a;
        }
    }

    /* renamed from: x5.a$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC9323o implements InterfaceC9998l<Cursor, C2037v> {

        /* renamed from: a */
        final /* synthetic */ Context f32918a;

        /* renamed from: b */
        final /* synthetic */ ArrayList<C11627a> f32919b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, ArrayList<C11627a> arrayList) {
            super(1);
            this.f32918a = context;
            this.f32919b = arrayList;
        }

        /* renamed from: a */
        public final void m39613a(Cursor cursor) {
            C9322n.m27781e(cursor, "cursor");
            C11627a m39649J = InterfaceC12289e.b.m39649J(C12285a.f32911b, cursor, this.f32918a, false, 2, null);
            if (m39649J != null) {
                this.f32919b.add(m39649J);
            }
        }

        @Override // p280ok.InterfaceC9998l
        public /* bridge */ /* synthetic */ C2037v invoke(Cursor cursor) {
            m39613a(cursor);
            return C2037v.f8089a;
        }
    }

    /* renamed from: x5.a$c */
    /* loaded from: classes.dex */
    static final class c extends AbstractC9323o implements InterfaceC9998l<String, CharSequence> {

        /* renamed from: a */
        public static final c f32920a = new c();

        c() {
            super(1);
        }

        @Override // p280ok.InterfaceC9998l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(String it) {
            C9322n.m27781e(it, "it");
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
            p435x5.C12285a.f32911b = r0
            u5.a r0 = new u5.a
            r0.<init>()
            p435x5.C12285a.f32912c = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 0
            r3 = 29
            if (r0 != r3) goto L1e
            boolean r4 = p035c3.C1856r.m9900a()
            if (r4 != 0) goto L1e
            r4 = r1
            goto L1f
        L1e:
            r4 = r2
        L1f:
            p435x5.C12285a.f32913d = r4
            if (r0 != r3) goto L2a
            boolean r0 = p035c3.C1856r.m9900a()
            if (r0 == 0) goto L2a
            goto L2b
        L2a:
            r1 = r2
        L2b:
            p435x5.C12285a.f32914e = r1
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            p435x5.C12285a.f32915f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p435x5.C12285a.<clinit>():void");
    }

    private C12285a() {
    }

    /* renamed from: J */
    private final void m39567J(Cursor cursor, int i10, int i11, InterfaceC9998l<? super Cursor, C2037v> interfaceC9998l) {
        if (!f32914e) {
            cursor.moveToPosition(i10 - 1);
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (cursor.moveToNext()) {
                interfaceC9998l.invoke(cursor);
            }
        }
    }

    /* renamed from: L */
    private final String m39568L(Context context, String str) {
        ContentResolver contentResolver = context.getContentResolver();
        C9322n.m27778b(contentResolver);
        Cursor mo39602q = mo39602q(contentResolver, mo39601p(), new String[]{"bucket_id", "relative_path"}, "bucket_id = ?", new String[]{str}, null);
        if (mo39602q == null) {
            return null;
        }
        try {
            if (!mo39602q.moveToNext()) {
                C9602b.m28593a(mo39602q, null);
                return null;
            }
            String string = mo39602q.getString(1);
            C9602b.m28593a(mo39602q, null);
            return string;
        } finally {
        }
    }

    /* renamed from: Q */
    private final Uri m39569Q(C11627a c11627a, boolean z10) {
        return mo39603r(c11627a.m36432e(), c11627a.m36440m(), z10);
    }

    /* renamed from: R */
    static /* synthetic */ Uri m39570R(C12285a c12285a, C11627a c11627a, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return c12285a.m39569Q(c11627a, z10);
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
        if (!f32913d) {
            return m39655f.m36438k();
        }
        File m35415c = f32912c.m35415c(context, m39655f, z10);
        if (m35415c != null) {
            return m35415c.getAbsolutePath();
        }
        return null;
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
        C9322n.m27781e(context, "context");
        C9322n.m27781e(pathId, "pathId");
        C9322n.m27781e(option, "option");
        boolean m27777a = C9322n.m27777a(pathId, "");
        ArrayList arrayList = new ArrayList();
        String m38787c = AbstractC12074e.m38787c(option, i10, arrayList, false, 4, null);
        if (m27777a) {
            str = "";
        } else {
            arrayList.add(pathId);
            str = "AND bucket_id = ?";
        }
        ContentResolver contentResolver = context.getContentResolver();
        C9322n.m27780d(contentResolver, "getContentResolver(...)");
        Cursor mo39602q = mo39602q(contentResolver, mo39601p(), InterfaceC12289e.f32929a.m39635b(), "bucket_id IS NOT NULL " + m38787c + ' ' + str, (String[]) arrayList.toArray(new String[0]), null);
        if (mo39602q == null) {
            return null;
        }
        try {
            if (!mo39602q.moveToNext()) {
                C9602b.m28593a(mo39602q, null);
                return null;
            }
            String string = mo39602q.getString(1);
            if (string == null) {
                string = "";
            } else {
                C9322n.m27778b(string);
            }
            int count = mo39602q.getCount();
            C2037v c2037v = C2037v.f8089a;
            C9602b.m28593a(mo39602q, null);
            return new C11628b(pathId, string, count, i10, m27777a, null, 32, null);
        } finally {
        }
    }

    @Override // p435x5.InterfaceC12289e
    /* renamed from: E */
    public C1239a mo39575E(Context context, String id2) {
        Uri requireOriginal;
        C9322n.m27781e(context, "context");
        C9322n.m27781e(id2, "id");
        try {
            C11627a m39655f = InterfaceC12289e.b.m39655f(this, context, id2, false, 4, null);
            if (m39655f == null) {
                return null;
            }
            requireOriginal = MediaStore.setRequireOriginal(m39570R(this, m39655f, false, 2, null));
            C9322n.m27780d(requireOriginal, "setRequireOriginal(...)");
            InputStream openInputStream = context.getContentResolver().openInputStream(requireOriginal);
            if (openInputStream == null) {
                return null;
            }
            return new C1239a(openInputStream);
        } catch (Exception unused) {
            return null;
        }
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
        C2028m<String, String> m39581M = m39581M(context, assetId);
        if (m39581M == null) {
            m39585S("Cannot get gallery id of " + assetId);
            throw new C2020e();
        }
        if (C9322n.m27777a(galleryId, m39581M.m10335a())) {
            m39585S("No move required, because the target gallery is the same as the current one.");
            throw new C2020e();
        }
        ContentResolver contentResolver = context.getContentResolver();
        String m39568L = m39568L(context, galleryId);
        ContentValues contentValues = new ContentValues();
        contentValues.put("relative_path", m39568L);
        if (contentResolver.update(mo39601p(), contentValues, m39580K(), new String[]{assetId}) > 0) {
            return InterfaceC12289e.b.m39655f(this, context, assetId, false, 4, null);
        }
        m39585S("Cannot update " + assetId + " relativePath");
        throw new C2020e();
    }

    @Override // p435x5.InterfaceC12289e
    /* renamed from: H */
    public String mo39578H(Context context, long j10, int i10) {
        return InterfaceC12289e.b.m39663n(this, context, j10, i10);
    }

    /* renamed from: I */
    public int m39579I(int i10) {
        return InterfaceC12289e.b.m39652c(this, i10);
    }

    /* renamed from: K */
    public String m39580K() {
        return InterfaceC12289e.b.m39659j(this);
    }

    /* renamed from: M */
    public C2028m<String, String> m39581M(Context context, String assetId) {
        C9322n.m27781e(context, "context");
        C9322n.m27781e(assetId, "assetId");
        ContentResolver contentResolver = context.getContentResolver();
        C9322n.m27778b(contentResolver);
        Cursor mo39602q = mo39602q(contentResolver, mo39601p(), new String[]{"bucket_id", "relative_path"}, "_id = ?", new String[]{assetId}, null);
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

    /* renamed from: N */
    public String m39582N(int i10, int i11, AbstractC12074e filterOption) {
        C9322n.m27781e(filterOption, "filterOption");
        return f32914e ? InterfaceC12289e.b.m39665p(this, i10, i11, filterOption) : filterOption.mo38756d();
    }

    /* renamed from: O */
    public String m39583O(Cursor cursor, String str) {
        return InterfaceC12289e.b.m39667r(this, cursor, str);
    }

    /* renamed from: P */
    public int m39584P(int i10) {
        return InterfaceC12289e.b.m39668s(this, i10);
    }

    /* renamed from: S */
    public Void m39585S(String str) {
        return InterfaceC12289e.b.m39647H(this, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.String, int] */
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
        ?? r12 = i11 - i10;
        String m39582N = m39582N(i10, r12, option);
        ContentResolver contentResolver = context.getContentResolver();
        C9322n.m27780d(contentResolver, "getContentResolver(...)");
        Cursor mo39602q = mo39602q(contentResolver, mo39601p(), mo39592g(), r12, (String[]) arrayList2.toArray(new String[0]), m39582N);
        if (mo39602q == null) {
            return arrayList;
        }
        try {
            f32911b.m39567J(mo39602q, i10, r12, new b(context, arrayList));
            C2037v c2037v = C2037v.f8089a;
            C9602b.m28593a(mo39602q, null);
            return arrayList;
        } finally {
        }
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
        C9322n.m27781e(context, "context");
        C9322n.m27781e(id2, "id");
        ContentResolver contentResolver = context.getContentResolver();
        C9322n.m27780d(contentResolver, "getContentResolver(...)");
        Cursor mo39602q = mo39602q(contentResolver, mo39601p(), mo39592g(), "_id = ?", new String[]{id2}, null);
        if (mo39602q == null) {
            return null;
        }
        try {
            C11627a mo39593h = mo39602q.moveToNext() ? f32911b.mo39593h(mo39602q, context, z10) : null;
            C9602b.m28593a(mo39602q, null);
            return mo39593h;
        } finally {
        }
    }

    @Override // p435x5.InterfaceC12289e
    /* renamed from: e */
    public boolean mo39590e(Context context) {
        String m20611M;
        boolean z10;
        C9322n.m27781e(context, "context");
        ReentrantLock reentrantLock = f32915f;
        if (reentrantLock.isLocked()) {
            Log.i("PhotoManagerPlugin", "The removeAllExistsAssets is running.");
            return false;
        }
        reentrantLock.lock();
        try {
            Log.i("PhotoManagerPlugin", "The removeAllExistsAssets is starting.");
            ArrayList arrayList = new ArrayList();
            ContentResolver contentResolver = context.getContentResolver();
            C12285a c12285a = f32911b;
            C9322n.m27778b(contentResolver);
            Uri mo39601p = c12285a.mo39601p();
            String[] strArr = {"_id", "media_type", "_data"};
            Integer[] numArr = {2, 3, 1};
            ArrayList arrayList2 = new ArrayList(3);
            int i10 = 0;
            for (int i11 = 3; i10 < i11; i11 = 3) {
                arrayList2.add(String.valueOf(numArr[i10].intValue()));
                i10++;
            }
            Cursor mo39602q = c12285a.mo39602q(contentResolver, mo39601p, strArr, "media_type in ( ?,?,? )", (String[]) arrayList2.toArray(new String[0]), null);
            if (mo39602q == null) {
                return false;
            }
            int i12 = 0;
            while (mo39602q.moveToNext()) {
                try {
                    C12285a c12285a2 = f32911b;
                    String mo39611z = c12285a2.mo39611z(mo39602q, "_id");
                    int mo39596k = c12285a2.mo39596k(mo39602q, "media_type");
                    String m39583O = c12285a2.m39583O(mo39602q, "_data");
                    try {
                        InputStream openInputStream = contentResolver.openInputStream(InterfaceC12289e.b.m39670u(c12285a2, Long.parseLong(mo39611z), c12285a2.m39584P(mo39596k), false, 4, null));
                        if (openInputStream != null) {
                            openInputStream.close();
                        }
                        z10 = true;
                    } catch (Exception unused) {
                        z10 = false;
                    }
                    if (!z10) {
                        arrayList.add(mo39611z);
                        Log.i("PhotoManagerPlugin", "The " + mo39611z + ", " + m39583O + " media was not exists. ");
                    }
                    i12++;
                    if (i12 % 300 == 0) {
                        Log.i("PhotoManagerPlugin", "Current checked count == " + i12);
                    }
                } finally {
                }
            }
            Log.i("PhotoManagerPlugin", "The removeAllExistsAssets was stopped, will be delete ids = " + arrayList);
            C9602b.m28593a(mo39602q, null);
            m20611M = C7042z.m20611M(arrayList, ",", null, null, 0, null, c.f32920a, 30, null);
            int delete = contentResolver.delete(f32911b.mo39601p(), "_id in ( " + m20611M + " )", (String[]) arrayList.toArray(new String[0]));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Delete rows: ");
            sb2.append(delete);
            Log.i("PhotoManagerPlugin", sb2.toString());
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
        m20618T2 = C7042z.m20618T(m20618T, new String[]{"relative_path"});
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
        C9322n.m27781e(context, "context");
        C9322n.m27781e(option, "option");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String str = "bucket_id IS NOT NULL " + AbstractC12074e.m38787c(option, i10, arrayList2, false, 4, null);
        ContentResolver contentResolver = context.getContentResolver();
        C9322n.m27780d(contentResolver, "getContentResolver(...)");
        Cursor mo39602q = mo39602q(contentResolver, mo39601p(), InterfaceC12289e.f32929a.m39635b(), str, (String[]) arrayList2.toArray(new String[0]), option.mo38756d());
        if (mo39602q == null) {
            return arrayList;
        }
        try {
            arrayList.add(new C11628b("isAll", "Recent", mo39602q.getCount(), i10, true, null, 32, null));
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
        C9322n.m27781e(context, "context");
        C9322n.m27781e(asset, "asset");
        InputStream openInputStream = context.getContentResolver().openInputStream(m39569Q(asset, z10));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            if (openInputStream != null) {
                try {
                    byteArrayOutputStream.write(C9601a.m28592c(openInputStream));
                    C2037v c2037v = C2037v.f8089a;
                    C9602b.m28593a(openInputStream, null);
                } finally {
                }
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (C1662a.f7047a.m9137e()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("The asset ");
                sb2.append(asset.m36432e());
                sb2.append(" origin byte length : ");
                C9322n.m27778b(byteArray);
                sb2.append(byteArray.length);
                C1662a.m9135d(sb2.toString());
            }
            C9322n.m27778b(byteArray);
            C9602b.m28593a(byteArrayOutputStream, null);
            return byteArray;
        } finally {
        }
    }

    @Override // p435x5.InterfaceC12289e
    /* renamed from: o */
    public C11627a mo39600o(Context context, String assetId, String galleryId) {
        ArrayList m20578f;
        Object[] m20445m;
        C9322n.m27781e(context, "context");
        C9322n.m27781e(assetId, "assetId");
        C9322n.m27781e(galleryId, "galleryId");
        C2028m<String, String> m39581M = m39581M(context, assetId);
        if (m39581M == null) {
            m39585S("Cannot get gallery id of " + assetId);
            throw new C2020e();
        }
        if (C9322n.m27777a(galleryId, m39581M.m10335a())) {
            m39585S("No copy required, because the target gallery is the same as the current one.");
            throw new C2020e();
        }
        C11627a m39655f = InterfaceC12289e.b.m39655f(this, context, assetId, false, 4, null);
        if (m39655f == null) {
            m39585S("No copy required, because the target gallery is the same as the current one.");
            throw new C2020e();
        }
        m20578f = C7031r.m20578f("_display_name", "title", "date_added", "date_modified", "datetaken", "duration", "width", "height", "orientation");
        int m39579I = m39579I(m39655f.m36440m());
        if (m39579I == 3) {
            m20578f.add("description");
        }
        ContentResolver contentResolver = context.getContentResolver();
        C9322n.m27778b(contentResolver);
        Uri mo39601p = mo39601p();
        m20445m = C7019l.m20445m(m20578f.toArray(new String[0]), new String[]{"relative_path"});
        Cursor mo39602q = mo39602q(contentResolver, mo39601p, (String[]) m20445m, m39580K(), new String[]{assetId}, null);
        if (mo39602q == null) {
            m39585S("Cannot find asset.");
            throw new C2020e();
        }
        if (!mo39602q.moveToNext()) {
            m39585S("Cannot find asset.");
            throw new C2020e();
        }
        Uri m39680b = C12290f.f32937a.m39680b(m39579I);
        String m39568L = m39568L(context, galleryId);
        ContentValues contentValues = new ContentValues();
        Iterator it = m20578f.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C12285a c12285a = f32911b;
            C9322n.m27778b(str);
            contentValues.put(str, c12285a.mo39611z(mo39602q, str));
        }
        contentValues.put("media_type", Integer.valueOf(m39579I));
        contentValues.put("relative_path", m39568L);
        Uri insert = contentResolver.insert(m39680b, contentValues);
        if (insert == null) {
            m39585S("Cannot insert new asset.");
            throw new C2020e();
        }
        OutputStream openOutputStream = contentResolver.openOutputStream(insert);
        if (openOutputStream == null) {
            m39585S("Cannot open output stream for " + insert + '.');
            throw new C2020e();
        }
        Uri m39569Q = m39569Q(m39655f, true);
        InputStream openInputStream = contentResolver.openInputStream(m39569Q);
        if (openInputStream == null) {
            m39585S("Cannot open input stream for " + m39569Q);
            throw new C2020e();
        }
        try {
            try {
                C9601a.m28591b(openInputStream, openOutputStream, 0, 2, null);
                C9602b.m28593a(openOutputStream, null);
                C9602b.m28593a(openInputStream, null);
                mo39602q.close();
                String lastPathSegment = insert.getLastPathSegment();
                if (lastPathSegment != null) {
                    return InterfaceC12289e.b.m39655f(this, context, lastPathSegment, false, 4, null);
                }
                m39585S("Cannot open output stream for " + insert + '.');
                throw new C2020e();
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
        C9322n.m27781e(context, "context");
        InterfaceC12289e.b.m39651b(this, context);
        f32912c.m35414a(context);
    }

    @Override // p435x5.InterfaceC12289e
    /* renamed from: v */
    public long mo39607v(Cursor cursor, String str) {
        return InterfaceC12289e.b.m39661l(this, cursor, str);
    }

    @Override // p435x5.InterfaceC12289e
    /* renamed from: w */
    public List<C11628b> mo39608w(Context context, int i10, AbstractC12074e option) {
        int i11;
        C9322n.m27781e(context, "context");
        C9322n.m27781e(option, "option");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String str = "bucket_id IS NOT NULL " + AbstractC12074e.m38787c(option, i10, arrayList2, false, 4, null);
        ContentResolver contentResolver = context.getContentResolver();
        C9322n.m27780d(contentResolver, "getContentResolver(...)");
        Cursor mo39602q = mo39602q(contentResolver, mo39601p(), InterfaceC12289e.f32929a.m39635b(), str, (String[]) arrayList2.toArray(new String[0]), option.mo38756d());
        if (mo39602q == null) {
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        try {
            C1662a.m9136f(mo39602q, "bucket_id");
            while (mo39602q.moveToNext()) {
                C12285a c12285a = f32911b;
                String mo39611z = c12285a.mo39611z(mo39602q, "bucket_id");
                if (hashMap.containsKey(mo39611z)) {
                    Object obj = hashMap2.get(mo39611z);
                    C9322n.m27778b(obj);
                    i11 = Integer.valueOf(((Number) obj).intValue() + 1);
                } else {
                    hashMap.put(mo39611z, c12285a.mo39611z(mo39602q, "bucket_display_name"));
                    i11 = 1;
                }
                hashMap2.put(mo39611z, i11);
            }
            C2037v c2037v = C2037v.f8089a;
            C9602b.m28593a(mo39602q, null);
            for (Map.Entry entry : hashMap.entrySet()) {
                String str2 = (String) entry.getKey();
                String str3 = (String) entry.getValue();
                Object obj2 = hashMap2.get(str2);
                C9322n.m27778b(obj2);
                C11628b c11628b = new C11628b(str2, str3, ((Number) obj2).intValue(), i10, false, null, 32, null);
                if (option.mo38754a()) {
                    f32911b.mo39594i(context, c11628b);
                }
                arrayList.add(c11628b);
            }
            return arrayList;
        } finally {
        }
    }

    @Override // p435x5.InterfaceC12289e
    /* renamed from: x */
    public void mo39609x(Context context, String str) {
        InterfaceC12289e.b.m39640A(this, context, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.String, int] */
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
        ?? r12 = i10 * i11;
        String m39582N = m39582N(r12, i11, option);
        ContentResolver contentResolver = context.getContentResolver();
        C9322n.m27780d(contentResolver, "getContentResolver(...)");
        Cursor mo39602q = mo39602q(contentResolver, mo39601p(), mo39592g(), r12, (String[]) arrayList2.toArray(new String[0]), m39582N);
        if (mo39602q == null) {
            return arrayList;
        }
        try {
            f32911b.m39567J(mo39602q, r12, i11, new a(context, arrayList));
            C2037v c2037v = C2037v.f8089a;
            C9602b.m28593a(mo39602q, null);
            return arrayList;
        } finally {
        }
    }

    @Override // p435x5.InterfaceC12289e
    /* renamed from: z */
    public String mo39611z(Cursor cursor, String str) {
        return InterfaceC12289e.b.m39666q(this, cursor, str);
    }
}

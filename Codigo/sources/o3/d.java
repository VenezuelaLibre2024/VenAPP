package o3;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.g;
import com.bumptech.glide.load.data.d;
import h3.h;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import n3.o;
import n3.p;
import n3.s;

/* loaded from: classes.dex */
public final class d<DataT> implements o<Uri, DataT> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f22161a;

    /* renamed from: b, reason: collision with root package name */
    private final o<File, DataT> f22162b;

    /* renamed from: c, reason: collision with root package name */
    private final o<Uri, DataT> f22163c;

    /* renamed from: d, reason: collision with root package name */
    private final Class<DataT> f22164d;

    /* loaded from: classes.dex */
    private static abstract class a<DataT> implements p<Uri, DataT> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f22165a;

        /* renamed from: b, reason: collision with root package name */
        private final Class<DataT> f22166b;

        a(Context context, Class<DataT> cls) {
            this.f22165a = context;
            this.f22166b = cls;
        }

        @Override // n3.p
        public final o<Uri, DataT> d(s sVar) {
            return new d(this.f22165a, sVar.d(File.class, this.f22166b), sVar.d(Uri.class, this.f22166b), this.f22166b);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o3.d$d, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0367d<DataT> implements com.bumptech.glide.load.data.d<DataT> {

        /* renamed from: v, reason: collision with root package name */
        private static final String[] f22167v = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        private final Context f22168a;

        /* renamed from: b, reason: collision with root package name */
        private final o<File, DataT> f22169b;

        /* renamed from: c, reason: collision with root package name */
        private final o<Uri, DataT> f22170c;

        /* renamed from: d, reason: collision with root package name */
        private final Uri f22171d;

        /* renamed from: e, reason: collision with root package name */
        private final int f22172e;

        /* renamed from: f, reason: collision with root package name */
        private final int f22173f;

        /* renamed from: r, reason: collision with root package name */
        private final h f22174r;

        /* renamed from: s, reason: collision with root package name */
        private final Class<DataT> f22175s;

        /* renamed from: t, reason: collision with root package name */
        private volatile boolean f22176t;

        /* renamed from: u, reason: collision with root package name */
        private volatile com.bumptech.glide.load.data.d<DataT> f22177u;

        C0367d(Context context, o<File, DataT> oVar, o<Uri, DataT> oVar2, Uri uri, int i10, int i11, h hVar, Class<DataT> cls) {
            this.f22168a = context.getApplicationContext();
            this.f22169b = oVar;
            this.f22170c = oVar2;
            this.f22171d = uri;
            this.f22172e = i10;
            this.f22173f = i11;
            this.f22174r = hVar;
            this.f22175s = cls;
        }

        private o.a<DataT> c() {
            boolean isExternalStorageLegacy;
            isExternalStorageLegacy = Environment.isExternalStorageLegacy();
            if (isExternalStorageLegacy) {
                return this.f22169b.b(h(this.f22171d), this.f22172e, this.f22173f, this.f22174r);
            }
            return this.f22170c.b(g() ? MediaStore.setRequireOriginal(this.f22171d) : this.f22171d, this.f22172e, this.f22173f, this.f22174r);
        }

        private com.bumptech.glide.load.data.d<DataT> f() {
            o.a<DataT> c10 = c();
            if (c10 != null) {
                return c10.f21750c;
            }
            return null;
        }

        private boolean g() {
            return this.f22168a.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        private File h(Uri uri) {
            Cursor cursor = null;
            try {
                Cursor query = this.f22168a.getContentResolver().query(uri, f22167v, null, null, null);
                if (query == null || !query.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = query.getString(query.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    query.close();
                    return file;
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } catch (Throwable th2) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th2;
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<DataT> a() {
            return this.f22175s;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            com.bumptech.glide.load.data.d<DataT> dVar = this.f22177u;
            if (dVar != null) {
                dVar.b();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f22176t = true;
            com.bumptech.glide.load.data.d<DataT> dVar = this.f22177u;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public h3.a d() {
            return h3.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(g gVar, d.a<? super DataT> aVar) {
            try {
                com.bumptech.glide.load.data.d<DataT> f10 = f();
                if (f10 == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f22171d));
                    return;
                }
                this.f22177u = f10;
                if (this.f22176t) {
                    cancel();
                } else {
                    f10.e(gVar, aVar);
                }
            } catch (FileNotFoundException e10) {
                aVar.c(e10);
            }
        }
    }

    d(Context context, o<File, DataT> oVar, o<Uri, DataT> oVar2, Class<DataT> cls) {
        this.f22161a = context.getApplicationContext();
        this.f22162b = oVar;
        this.f22163c = oVar2;
        this.f22164d = cls;
    }

    @Override // n3.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<DataT> b(Uri uri, int i10, int i11, h hVar) {
        return new o.a<>(new b4.d(uri), new C0367d(this.f22161a, this.f22162b, this.f22163c, uri, i10, i11, hVar, this.f22164d));
    }

    @Override // n3.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && i3.b.b(uri);
    }
}

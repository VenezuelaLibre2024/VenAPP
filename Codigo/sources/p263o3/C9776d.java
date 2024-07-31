package p263o3;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.EnumC2121g;
import com.bumptech.glide.load.data.InterfaceC2133d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import p022b4.C1656d;
import p129h3.C7624h;
import p129h3.EnumC7617a;
import p151i3.C7783b;
import p246n3.C9653s;
import p246n3.InterfaceC9649o;
import p246n3.InterfaceC9650p;

/* renamed from: o3.d */
/* loaded from: classes.dex */
public final class C9776d<DataT> implements InterfaceC9649o<Uri, DataT> {

    /* renamed from: a */
    private final Context f24094a;

    /* renamed from: b */
    private final InterfaceC9649o<File, DataT> f24095b;

    /* renamed from: c */
    private final InterfaceC9649o<Uri, DataT> f24096c;

    /* renamed from: d */
    private final Class<DataT> f24097d;

    /* renamed from: o3.d$a */
    /* loaded from: classes.dex */
    private static abstract class a<DataT> implements InterfaceC9650p<Uri, DataT> {

        /* renamed from: a */
        private final Context f24098a;

        /* renamed from: b */
        private final Class<DataT> f24099b;

        a(Context context, Class<DataT> cls) {
            this.f24098a = context;
            this.f24099b = cls;
        }

        @Override // p246n3.InterfaceC9650p
        /* renamed from: d */
        public final InterfaceC9649o<Uri, DataT> mo28852d(C9653s c9653s) {
            return new C9776d(this.f24098a, c9653s.m28930d(File.class, this.f24099b), c9653s.m28930d(Uri.class, this.f24099b), this.f24099b);
        }
    }

    /* renamed from: o3.d$b */
    /* loaded from: classes.dex */
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* renamed from: o3.d$c */
    /* loaded from: classes.dex */
    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o3.d$d */
    /* loaded from: classes.dex */
    public static final class d<DataT> implements InterfaceC2133d<DataT> {

        /* renamed from: v */
        private static final String[] f24100v = {"_data"};

        /* renamed from: a */
        private final Context f24101a;

        /* renamed from: b */
        private final InterfaceC9649o<File, DataT> f24102b;

        /* renamed from: c */
        private final InterfaceC9649o<Uri, DataT> f24103c;

        /* renamed from: d */
        private final Uri f24104d;

        /* renamed from: e */
        private final int f24105e;

        /* renamed from: f */
        private final int f24106f;

        /* renamed from: r */
        private final C7624h f24107r;

        /* renamed from: s */
        private final Class<DataT> f24108s;

        /* renamed from: t */
        private volatile boolean f24109t;

        /* renamed from: u */
        private volatile InterfaceC2133d<DataT> f24110u;

        d(Context context, InterfaceC9649o<File, DataT> interfaceC9649o, InterfaceC9649o<Uri, DataT> interfaceC9649o2, Uri uri, int i10, int i11, C7624h c7624h, Class<DataT> cls) {
            this.f24101a = context.getApplicationContext();
            this.f24102b = interfaceC9649o;
            this.f24103c = interfaceC9649o2;
            this.f24104d = uri;
            this.f24105e = i10;
            this.f24106f = i11;
            this.f24107r = c7624h;
            this.f24108s = cls;
        }

        /* renamed from: c */
        private InterfaceC9649o.a<DataT> m29332c() {
            boolean isExternalStorageLegacy;
            isExternalStorageLegacy = Environment.isExternalStorageLegacy();
            if (isExternalStorageLegacy) {
                return this.f24102b.mo28848b(m29335h(this.f24104d), this.f24105e, this.f24106f, this.f24107r);
            }
            return this.f24103c.mo28848b(m29334g() ? MediaStore.setRequireOriginal(this.f24104d) : this.f24104d, this.f24105e, this.f24106f, this.f24107r);
        }

        /* renamed from: f */
        private InterfaceC2133d<DataT> m29333f() {
            InterfaceC9649o.a<DataT> m29332c = m29332c();
            if (m29332c != null) {
                return m29332c.f23683c;
            }
            return null;
        }

        /* renamed from: g */
        private boolean m29334g() {
            return this.f24101a.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        /* renamed from: h */
        private File m29335h(Uri uri) {
            Cursor cursor = null;
            try {
                Cursor query = this.f24101a.getContentResolver().query(uri, f24100v, null, null, null);
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

        @Override // com.bumptech.glide.load.data.InterfaceC2133d
        /* renamed from: a */
        public Class<DataT> mo10760a() {
            return this.f24108s;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2133d
        /* renamed from: b */
        public void mo10765b() {
            InterfaceC2133d<DataT> interfaceC2133d = this.f24110u;
            if (interfaceC2133d != null) {
                interfaceC2133d.mo10765b();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2133d
        public void cancel() {
            this.f24109t = true;
            InterfaceC2133d<DataT> interfaceC2133d = this.f24110u;
            if (interfaceC2133d != null) {
                interfaceC2133d.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2133d
        /* renamed from: d */
        public EnumC7617a mo10767d() {
            return EnumC7617a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2133d
        /* renamed from: e */
        public void mo10768e(EnumC2121g enumC2121g, InterfaceC2133d.a<? super DataT> aVar) {
            try {
                InterfaceC2133d<DataT> m29333f = m29333f();
                if (m29333f == null) {
                    aVar.mo10773c(new IllegalArgumentException("Failed to build fetcher for: " + this.f24104d));
                    return;
                }
                this.f24110u = m29333f;
                if (this.f24109t) {
                    cancel();
                } else {
                    m29333f.mo10768e(enumC2121g, aVar);
                }
            } catch (FileNotFoundException e10) {
                aVar.mo10773c(e10);
            }
        }
    }

    C9776d(Context context, InterfaceC9649o<File, DataT> interfaceC9649o, InterfaceC9649o<Uri, DataT> interfaceC9649o2, Class<DataT> cls) {
        this.f24094a = context.getApplicationContext();
        this.f24095b = interfaceC9649o;
        this.f24096c = interfaceC9649o2;
        this.f24097d = cls;
    }

    @Override // p246n3.InterfaceC9649o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9649o.a<DataT> mo28848b(Uri uri, int i10, int i11, C7624h c7624h) {
        return new InterfaceC9649o.a<>(new C1656d(uri), new d(this.f24094a, this.f24095b, this.f24096c, uri, i10, i11, c7624h, this.f24097d));
    }

    @Override // p246n3.InterfaceC9649o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo28847a(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && C7783b.m23744b(uri);
    }
}

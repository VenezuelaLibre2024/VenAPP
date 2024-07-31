package n3;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import n3.o;

/* loaded from: classes.dex */
public final class l implements o<Uri, File> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f21737a;

    /* loaded from: classes.dex */
    public static final class a implements p<Uri, File> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f21738a;

        public a(Context context) {
            this.f21738a = context;
        }

        @Override // n3.p
        public o<Uri, File> d(s sVar) {
            return new l(this.f21738a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements com.bumptech.glide.load.data.d<File> {

        /* renamed from: c, reason: collision with root package name */
        private static final String[] f21739c = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        private final Context f21740a;

        /* renamed from: b, reason: collision with root package name */
        private final Uri f21741b;

        b(Context context, Uri uri) {
            this.f21740a = context;
            this.f21741b = uri;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<File> a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public h3.a d() {
            return h3.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a<? super File> aVar) {
            Cursor query = this.f21740a.getContentResolver().query(this.f21741b, f21739c, null, null, null);
            if (query != null) {
                try {
                    r0 = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
                } finally {
                    query.close();
                }
            }
            if (!TextUtils.isEmpty(r0)) {
                aVar.f(new File(r0));
                return;
            }
            aVar.c(new FileNotFoundException("Failed to find file path for: " + this.f21741b));
        }
    }

    public l(Context context) {
        this.f21737a = context;
    }

    @Override // n3.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<File> b(Uri uri, int i10, int i11, h3.h hVar) {
        return new o.a<>(new b4.d(uri), new b(this.f21737a, uri));
    }

    @Override // n3.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return i3.b.b(uri);
    }
}

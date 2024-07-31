package i3;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class c implements com.bumptech.glide.load.data.d<InputStream> {

    /* renamed from: a, reason: collision with root package name */
    private final Uri f16886a;

    /* renamed from: b, reason: collision with root package name */
    private final e f16887b;

    /* renamed from: c, reason: collision with root package name */
    private InputStream f16888c;

    /* loaded from: classes.dex */
    static class a implements d {

        /* renamed from: b, reason: collision with root package name */
        private static final String[] f16889b = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f16890a;

        a(ContentResolver contentResolver) {
            this.f16890a = contentResolver;
        }

        @Override // i3.d
        public Cursor a(Uri uri) {
            return this.f16890a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f16889b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* loaded from: classes.dex */
    static class b implements d {

        /* renamed from: b, reason: collision with root package name */
        private static final String[] f16891b = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f16892a;

        b(ContentResolver contentResolver) {
            this.f16892a = contentResolver;
        }

        @Override // i3.d
        public Cursor a(Uri uri) {
            return this.f16892a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f16891b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    c(Uri uri, e eVar) {
        this.f16886a = uri;
        this.f16887b = eVar;
    }

    private static c c(Context context, Uri uri, d dVar) {
        return new c(uri, new e(com.bumptech.glide.b.d(context).k().g(), dVar, com.bumptech.glide.b.d(context).f(), context.getContentResolver()));
    }

    public static c f(Context context, Uri uri) {
        return c(context, uri, new a(context.getContentResolver()));
    }

    public static c g(Context context, Uri uri) {
        return c(context, uri, new b(context.getContentResolver()));
    }

    private InputStream h() {
        InputStream d10 = this.f16887b.d(this.f16886a);
        int a10 = d10 != null ? this.f16887b.a(this.f16886a) : -1;
        return a10 != -1 ? new g(d10, a10) : d10;
    }

    @Override // com.bumptech.glide.load.data.d
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        InputStream inputStream = this.f16888c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.d
    public h3.a d() {
        return h3.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(com.bumptech.glide.g gVar, d.a<? super InputStream> aVar) {
        try {
            InputStream h10 = h();
            this.f16888c = h10;
            aVar.f(h10);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e10);
            }
            aVar.c(e10);
        }
    }
}

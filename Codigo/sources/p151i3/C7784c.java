package p151i3;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C2116b;
import com.bumptech.glide.EnumC2121g;
import com.bumptech.glide.load.data.C2136g;
import com.bumptech.glide.load.data.InterfaceC2133d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p129h3.EnumC7617a;

/* renamed from: i3.c */
/* loaded from: classes.dex */
public class C7784c implements InterfaceC2133d<InputStream> {

    /* renamed from: a */
    private final Uri f18538a;

    /* renamed from: b */
    private final C7786e f18539b;

    /* renamed from: c */
    private InputStream f18540c;

    /* renamed from: i3.c$a */
    /* loaded from: classes.dex */
    static class a implements InterfaceC7785d {

        /* renamed from: b */
        private static final String[] f18541b = {"_data"};

        /* renamed from: a */
        private final ContentResolver f18542a;

        a(ContentResolver contentResolver) {
            this.f18542a = contentResolver;
        }

        @Override // p151i3.InterfaceC7785d
        /* renamed from: a */
        public Cursor mo23752a(Uri uri) {
            return this.f18542a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f18541b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* renamed from: i3.c$b */
    /* loaded from: classes.dex */
    static class b implements InterfaceC7785d {

        /* renamed from: b */
        private static final String[] f18543b = {"_data"};

        /* renamed from: a */
        private final ContentResolver f18544a;

        b(ContentResolver contentResolver) {
            this.f18544a = contentResolver;
        }

        @Override // p151i3.InterfaceC7785d
        /* renamed from: a */
        public Cursor mo23752a(Uri uri) {
            return this.f18544a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f18543b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    C7784c(Uri uri, C7786e c7786e) {
        this.f18538a = uri;
        this.f18539b = c7786e;
    }

    /* renamed from: c */
    private static C7784c m23748c(Context context, Uri uri, InterfaceC7785d interfaceC7785d) {
        return new C7784c(uri, new C7786e(ComponentCallbacks2C2116b.m10641d(context).m10655k().m10680g(), interfaceC7785d, ComponentCallbacks2C2116b.m10641d(context).m10650f(), context.getContentResolver()));
    }

    /* renamed from: f */
    public static C7784c m23749f(Context context, Uri uri) {
        return m23748c(context, uri, new a(context.getContentResolver()));
    }

    /* renamed from: g */
    public static C7784c m23750g(Context context, Uri uri) {
        return m23748c(context, uri, new b(context.getContentResolver()));
    }

    /* renamed from: h */
    private InputStream m23751h() {
        InputStream m23756d = this.f18539b.m23756d(this.f18538a);
        int m23755a = m23756d != null ? this.f18539b.m23755a(this.f18538a) : -1;
        return m23755a != -1 ? new C2136g(m23756d, m23755a) : m23756d;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2133d
    /* renamed from: a */
    public Class<InputStream> mo10760a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2133d
    /* renamed from: b */
    public void mo10765b() {
        InputStream inputStream = this.f18540c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2133d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2133d
    /* renamed from: d */
    public EnumC7617a mo10767d() {
        return EnumC7617a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2133d
    /* renamed from: e */
    public void mo10768e(EnumC2121g enumC2121g, InterfaceC2133d.a<? super InputStream> aVar) {
        try {
            InputStream m23751h = m23751h();
            this.f18540c = m23751h;
            aVar.mo10774f(m23751h);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e10);
            }
            aVar.mo10773c(e10);
        }
    }
}

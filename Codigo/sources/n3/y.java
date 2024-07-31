package n3;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import n3.o;

/* loaded from: classes.dex */
public class y<Data> implements o<Uri, Data> {

    /* renamed from: b, reason: collision with root package name */
    private static final Set<String> f21787b = Collections.unmodifiableSet(new HashSet(Arrays.asList(Constants.FILE, "content", "android.resource")));

    /* renamed from: a, reason: collision with root package name */
    private final c<Data> f21788a;

    /* loaded from: classes.dex */
    public static final class a implements p<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f21789a;

        public a(ContentResolver contentResolver) {
            this.f21789a = contentResolver;
        }

        @Override // n3.y.c
        public com.bumptech.glide.load.data.d<AssetFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f21789a, uri);
        }

        @Override // n3.p
        public o<Uri, AssetFileDescriptor> d(s sVar) {
            return new y(this);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements p<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f21790a;

        public b(ContentResolver contentResolver) {
            this.f21790a = contentResolver;
        }

        @Override // n3.y.c
        public com.bumptech.glide.load.data.d<ParcelFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.i(this.f21790a, uri);
        }

        @Override // n3.p
        public o<Uri, ParcelFileDescriptor> d(s sVar) {
            return new y(this);
        }
    }

    /* loaded from: classes.dex */
    public interface c<Data> {
        com.bumptech.glide.load.data.d<Data> a(Uri uri);
    }

    /* loaded from: classes.dex */
    public static class d implements p<Uri, InputStream>, c<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f21791a;

        public d(ContentResolver contentResolver) {
            this.f21791a = contentResolver;
        }

        @Override // n3.y.c
        public com.bumptech.glide.load.data.d<InputStream> a(Uri uri) {
            return new com.bumptech.glide.load.data.n(this.f21791a, uri);
        }

        @Override // n3.p
        public o<Uri, InputStream> d(s sVar) {
            return new y(this);
        }
    }

    public y(c<Data> cVar) {
        this.f21788a = cVar;
    }

    @Override // n3.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> b(Uri uri, int i10, int i11, h3.h hVar) {
        return new o.a<>(new b4.d(uri), this.f21788a.a(uri));
    }

    @Override // n3.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return f21787b.contains(uri.getScheme());
    }
}

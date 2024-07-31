package n3;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.InputStream;
import n3.o;

/* loaded from: classes.dex */
public class a<Data> implements o<Uri, Data> {

    /* renamed from: c, reason: collision with root package name */
    private static final int f21688c = 22;

    /* renamed from: a, reason: collision with root package name */
    private final AssetManager f21689a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0351a<Data> f21690b;

    /* renamed from: n3.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0351a<Data> {
        com.bumptech.glide.load.data.d<Data> a(AssetManager assetManager, String str);
    }

    /* loaded from: classes.dex */
    public static class b implements p<Uri, AssetFileDescriptor>, InterfaceC0351a<AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        private final AssetManager f21691a;

        public b(AssetManager assetManager) {
            this.f21691a = assetManager;
        }

        @Override // n3.a.InterfaceC0351a
        public com.bumptech.glide.load.data.d<AssetFileDescriptor> a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.h(assetManager, str);
        }

        @Override // n3.p
        public o<Uri, AssetFileDescriptor> d(s sVar) {
            return new a(this.f21691a, this);
        }
    }

    /* loaded from: classes.dex */
    public static class c implements p<Uri, InputStream>, InterfaceC0351a<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final AssetManager f21692a;

        public c(AssetManager assetManager) {
            this.f21692a = assetManager;
        }

        @Override // n3.a.InterfaceC0351a
        public com.bumptech.glide.load.data.d<InputStream> a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.m(assetManager, str);
        }

        @Override // n3.p
        public o<Uri, InputStream> d(s sVar) {
            return new a(this.f21692a, this);
        }
    }

    public a(AssetManager assetManager, InterfaceC0351a<Data> interfaceC0351a) {
        this.f21689a = assetManager;
        this.f21690b = interfaceC0351a;
    }

    @Override // n3.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> b(Uri uri, int i10, int i11, h3.h hVar) {
        return new o.a<>(new b4.d(uri), this.f21690b.a(this.f21689a, uri.toString().substring(f21688c)));
    }

    @Override // n3.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return Constants.FILE.equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}

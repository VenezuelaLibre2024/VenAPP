package p246n3;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import com.bumptech.glide.load.data.C2137h;
import com.bumptech.glide.load.data.C2142m;
import com.bumptech.glide.load.data.InterfaceC2133d;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.InputStream;
import p022b4.C1656d;
import p129h3.C7624h;
import p246n3.InterfaceC9649o;

/* renamed from: n3.a */
/* loaded from: classes.dex */
public class C9635a<Data> implements InterfaceC9649o<Uri, Data> {

    /* renamed from: c */
    private static final int f23621c = 22;

    /* renamed from: a */
    private final AssetManager f23622a;

    /* renamed from: b */
    private final a<Data> f23623b;

    /* renamed from: n3.a$a */
    /* loaded from: classes.dex */
    public interface a<Data> {
        /* renamed from: a */
        InterfaceC2133d<Data> mo28851a(AssetManager assetManager, String str);
    }

    /* renamed from: n3.a$b */
    /* loaded from: classes.dex */
    public static class b implements InterfaceC9650p<Uri, AssetFileDescriptor>, a<AssetFileDescriptor> {

        /* renamed from: a */
        private final AssetManager f23624a;

        public b(AssetManager assetManager) {
            this.f23624a = assetManager;
        }

        @Override // p246n3.C9635a.a
        /* renamed from: a */
        public InterfaceC2133d<AssetFileDescriptor> mo28851a(AssetManager assetManager, String str) {
            return new C2137h(assetManager, str);
        }

        @Override // p246n3.InterfaceC9650p
        /* renamed from: d */
        public InterfaceC9649o<Uri, AssetFileDescriptor> mo28852d(C9653s c9653s) {
            return new C9635a(this.f23624a, this);
        }
    }

    /* renamed from: n3.a$c */
    /* loaded from: classes.dex */
    public static class c implements InterfaceC9650p<Uri, InputStream>, a<InputStream> {

        /* renamed from: a */
        private final AssetManager f23625a;

        public c(AssetManager assetManager) {
            this.f23625a = assetManager;
        }

        @Override // p246n3.C9635a.a
        /* renamed from: a */
        public InterfaceC2133d<InputStream> mo28851a(AssetManager assetManager, String str) {
            return new C2142m(assetManager, str);
        }

        @Override // p246n3.InterfaceC9650p
        /* renamed from: d */
        public InterfaceC9649o<Uri, InputStream> mo28852d(C9653s c9653s) {
            return new C9635a(this.f23625a, this);
        }
    }

    public C9635a(AssetManager assetManager, a<Data> aVar) {
        this.f23622a = assetManager;
        this.f23623b = aVar;
    }

    @Override // p246n3.InterfaceC9649o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9649o.a<Data> mo28848b(Uri uri, int i10, int i11, C7624h c7624h) {
        return new InterfaceC9649o.a<>(new C1656d(uri), this.f23623b.mo28851a(this.f23622a, uri.toString().substring(f23621c)));
    }

    @Override // p246n3.InterfaceC9649o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo28847a(Uri uri) {
        return Constants.FILE.equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}

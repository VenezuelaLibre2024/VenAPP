package n3;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import java.util.List;
import n3.o;

/* loaded from: classes.dex */
public final class u<DataT> implements o<Uri, DataT> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f21778a;

    /* renamed from: b, reason: collision with root package name */
    private final o<Integer, DataT> f21779b;

    /* loaded from: classes.dex */
    private static final class a implements p<Uri, AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f21780a;

        a(Context context) {
            this.f21780a = context;
        }

        @Override // n3.p
        public o<Uri, AssetFileDescriptor> d(s sVar) {
            return new u(this.f21780a, sVar.d(Integer.class, AssetFileDescriptor.class));
        }
    }

    /* loaded from: classes.dex */
    private static final class b implements p<Uri, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f21781a;

        b(Context context) {
            this.f21781a = context;
        }

        @Override // n3.p
        public o<Uri, InputStream> d(s sVar) {
            return new u(this.f21781a, sVar.d(Integer.class, InputStream.class));
        }
    }

    u(Context context, o<Integer, DataT> oVar) {
        this.f21778a = context.getApplicationContext();
        this.f21779b = oVar;
    }

    public static p<Uri, AssetFileDescriptor> e(Context context) {
        return new a(context);
    }

    public static p<Uri, InputStream> f(Context context) {
        return new b(context);
    }

    private o.a<DataT> g(Uri uri, int i10, int i11, h3.h hVar) {
        try {
            int parseInt = Integer.parseInt(uri.getPathSegments().get(0));
            if (parseInt != 0) {
                return this.f21779b.b(Integer.valueOf(parseInt), i10, i11, hVar);
            }
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri);
            }
            return null;
        } catch (NumberFormatException e10) {
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri, e10);
            }
            return null;
        }
    }

    private o.a<DataT> h(Uri uri, int i10, int i11, h3.h hVar) {
        List<String> pathSegments = uri.getPathSegments();
        int identifier = this.f21778a.getResources().getIdentifier(pathSegments.get(1), pathSegments.get(0), this.f21778a.getPackageName());
        if (identifier != 0) {
            return this.f21779b.b(Integer.valueOf(identifier), i10, i11, hVar);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri);
        return null;
    }

    @Override // n3.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<DataT> b(Uri uri, int i10, int i11, h3.h hVar) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            return g(uri, i10, i11, hVar);
        }
        if (pathSegments.size() == 2) {
            return h(uri, i10, i11, hVar);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri);
        return null;
    }

    @Override // n3.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return "android.resource".equals(uri.getScheme()) && this.f21778a.getPackageName().equals(uri.getAuthority());
    }
}

package p246n3;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import java.util.List;
import p129h3.C7624h;
import p246n3.InterfaceC9649o;

/* renamed from: n3.u */
/* loaded from: classes.dex */
public final class C9655u<DataT> implements InterfaceC9649o<Uri, DataT> {

    /* renamed from: a */
    private final Context f23711a;

    /* renamed from: b */
    private final InterfaceC9649o<Integer, DataT> f23712b;

    /* renamed from: n3.u$a */
    /* loaded from: classes.dex */
    private static final class a implements InterfaceC9650p<Uri, AssetFileDescriptor> {

        /* renamed from: a */
        private final Context f23713a;

        a(Context context) {
            this.f23713a = context;
        }

        @Override // p246n3.InterfaceC9650p
        /* renamed from: d */
        public InterfaceC9649o<Uri, AssetFileDescriptor> mo28852d(C9653s c9653s) {
            return new C9655u(this.f23713a, c9653s.m28930d(Integer.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: n3.u$b */
    /* loaded from: classes.dex */
    private static final class b implements InterfaceC9650p<Uri, InputStream> {

        /* renamed from: a */
        private final Context f23714a;

        b(Context context) {
            this.f23714a = context;
        }

        @Override // p246n3.InterfaceC9650p
        /* renamed from: d */
        public InterfaceC9649o<Uri, InputStream> mo28852d(C9653s c9653s) {
            return new C9655u(this.f23714a, c9653s.m28930d(Integer.class, InputStream.class));
        }
    }

    C9655u(Context context, InterfaceC9649o<Integer, DataT> interfaceC9649o) {
        this.f23711a = context.getApplicationContext();
        this.f23712b = interfaceC9649o;
    }

    /* renamed from: e */
    public static InterfaceC9650p<Uri, AssetFileDescriptor> m28938e(Context context) {
        return new a(context);
    }

    /* renamed from: f */
    public static InterfaceC9650p<Uri, InputStream> m28939f(Context context) {
        return new b(context);
    }

    /* renamed from: g */
    private InterfaceC9649o.a<DataT> m28940g(Uri uri, int i10, int i11, C7624h c7624h) {
        try {
            int parseInt = Integer.parseInt(uri.getPathSegments().get(0));
            if (parseInt != 0) {
                return this.f23712b.mo28848b(Integer.valueOf(parseInt), i10, i11, c7624h);
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

    /* renamed from: h */
    private InterfaceC9649o.a<DataT> m28941h(Uri uri, int i10, int i11, C7624h c7624h) {
        List<String> pathSegments = uri.getPathSegments();
        int identifier = this.f23711a.getResources().getIdentifier(pathSegments.get(1), pathSegments.get(0), this.f23711a.getPackageName());
        if (identifier != 0) {
            return this.f23712b.mo28848b(Integer.valueOf(identifier), i10, i11, c7624h);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri);
        return null;
    }

    @Override // p246n3.InterfaceC9649o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9649o.a<DataT> mo28848b(Uri uri, int i10, int i11, C7624h c7624h) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            return m28940g(uri, i10, i11, c7624h);
        }
        if (pathSegments.size() == 2) {
            return m28941h(uri, i10, i11, c7624h);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri);
        return null;
    }

    @Override // p246n3.InterfaceC9649o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo28847a(Uri uri) {
        return "android.resource".equals(uri.getScheme()) && this.f23711a.getPackageName().equals(uri.getAuthority());
    }
}

package s3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import j3.v;
import java.util.List;

/* loaded from: classes.dex */
public class j implements h3.j<Uri, Drawable> {

    /* renamed from: b, reason: collision with root package name */
    public static final h3.g<Resources.Theme> f25126b = h3.g.e("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");

    /* renamed from: a, reason: collision with root package name */
    private final Context f25127a;

    public j(Context context) {
        this.f25127a = context.getApplicationContext();
    }

    private Context d(Uri uri, String str) {
        if (str.equals(this.f25127a.getPackageName())) {
            return this.f25127a;
        }
        try {
            return this.f25127a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            if (str.contains(this.f25127a.getPackageName())) {
                return this.f25127a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e10);
        }
    }

    private int e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e10);
        }
    }

    private int f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    private int g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @Override // h3.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public v<Drawable> b(Uri uri, int i10, int i11, h3.h hVar) {
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            Context d10 = d(uri, authority);
            int g10 = g(d10, uri);
            Resources.Theme theme = ((String) c4.k.d(authority)).equals(this.f25127a.getPackageName()) ? (Resources.Theme) hVar.c(f25126b) : null;
            return i.b(theme == null ? g.b(this.f25127a, d10, g10) : g.a(this.f25127a, g10, theme));
        }
        throw new IllegalStateException("Package name for " + uri + " is null or empty");
    }

    @Override // h3.j
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri, h3.h hVar) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("android.resource");
    }
}

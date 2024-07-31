package p346s3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;
import p036c4.C1870k;
import p129h3.C7623g;
import p129h3.C7624h;
import p129h3.InterfaceC7626j;
import p171j3.InterfaceC8975v;

/* renamed from: s3.j */
/* loaded from: classes.dex */
public class C10792j implements InterfaceC7626j<Uri, Drawable> {

    /* renamed from: b */
    public static final C7623g<Resources.Theme> f27245b = C7623g.m23141e("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");

    /* renamed from: a */
    private final Context f27246a;

    public C10792j(Context context) {
        this.f27246a = context.getApplicationContext();
    }

    /* renamed from: d */
    private Context m32882d(Uri uri, String str) {
        if (str.equals(this.f27246a.getPackageName())) {
            return this.f27246a;
        }
        try {
            return this.f27246a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            if (str.contains(this.f27246a.getPackageName())) {
                return this.f27246a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e10);
        }
    }

    /* renamed from: e */
    private int m32883e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e10);
        }
    }

    /* renamed from: f */
    private int m32884f(Context context, Uri uri) {
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

    /* renamed from: g */
    private int m32885g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return m32884f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return m32883e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @Override // p129h3.InterfaceC7626j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC8975v<Drawable> mo23152b(Uri uri, int i10, int i11, C7624h c7624h) {
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            Context m32882d = m32882d(uri, authority);
            int m32885g = m32885g(m32882d, uri);
            Resources.Theme theme = ((String) C1870k.m9950d(authority)).equals(this.f27246a.getPackageName()) ? (Resources.Theme) c7624h.m23147c(f27245b) : null;
            return C10791i.m32881b(theme == null ? C10789g.m32876b(this.f27246a, m32882d, m32885g) : C10789g.m32875a(this.f27246a, m32885g, theme));
        }
        throw new IllegalStateException("Package name for " + uri + " is null or empty");
    }

    @Override // p129h3.InterfaceC7626j
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean mo23151a(Uri uri, C7624h c7624h) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("android.resource");
    }
}

package e2;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebResourceResponse;
import androidx.webkit.internal.m0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final List<e> f14453a;

    /* loaded from: classes.dex */
    public static final class a implements d {

        /* renamed from: a, reason: collision with root package name */
        private m0 f14454a;

        public a(Context context) {
            this.f14454a = new m0(context);
        }

        @Override // e2.r.d
        public WebResourceResponse handle(String str) {
            try {
                return new WebResourceResponse(m0.f(str), null, this.f14454a.h(str));
            } catch (IOException e10) {
                Log.e("WebViewAssetLoader", "Error opening asset path: " + str, e10);
                return new WebResourceResponse(null, null, null);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private boolean f14455a;

        /* renamed from: b, reason: collision with root package name */
        private String f14456b = "appassets.androidplatform.net";

        /* renamed from: c, reason: collision with root package name */
        private final List<androidx.core.util.d<String, d>> f14457c = new ArrayList();

        public b a(String str, d dVar) {
            this.f14457c.add(androidx.core.util.d.a(str, dVar));
            return this;
        }

        public r b() {
            ArrayList arrayList = new ArrayList();
            for (androidx.core.util.d<String, d> dVar : this.f14457c) {
                arrayList.add(new e(this.f14456b, dVar.f3867a, this.f14455a, dVar.f3868b));
            }
            return new r(arrayList);
        }

        public b c(String str) {
            this.f14456b = str;
            return this;
        }

        public b d(boolean z10) {
            this.f14455a = z10;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements d {

        /* renamed from: b, reason: collision with root package name */
        private static final String[] f14458b = {"app_webview/", "databases/", "lib/", "shared_prefs/", "code_cache/"};

        /* renamed from: a, reason: collision with root package name */
        private final File f14459a;

        public c(Context context, File file) {
            try {
                this.f14459a = new File(m0.a(file));
                if (a(context)) {
                    return;
                }
                throw new IllegalArgumentException("The given directory \"" + file + "\" doesn't exist under an allowed app internal storage directory");
            } catch (IOException e10) {
                throw new IllegalArgumentException("Failed to resolve the canonical path for the given directory: " + file.getPath(), e10);
            }
        }

        private boolean a(Context context) {
            String a10 = m0.a(this.f14459a);
            String a11 = m0.a(context.getCacheDir());
            String a12 = m0.a(m0.c(context));
            if ((!a10.startsWith(a11) && !a10.startsWith(a12)) || a10.equals(a11) || a10.equals(a12)) {
                return false;
            }
            for (String str : f14458b) {
                if (a10.startsWith(a12 + str)) {
                    return false;
                }
            }
            return true;
        }

        @Override // e2.r.d
        public WebResourceResponse handle(String str) {
            File b10;
            try {
                b10 = m0.b(this.f14459a, str);
            } catch (IOException e10) {
                Log.e("WebViewAssetLoader", "Error opening the requested path: " + str, e10);
            }
            if (b10 != null) {
                return new WebResourceResponse(m0.f(str), null, m0.i(b10));
            }
            Log.e("WebViewAssetLoader", String.format("The requested file: %s is outside the mounted directory: %s", str, this.f14459a));
            return new WebResourceResponse(null, null, null);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        WebResourceResponse handle(String str);
    }

    /* loaded from: classes.dex */
    static class e {

        /* renamed from: a, reason: collision with root package name */
        final boolean f14460a;

        /* renamed from: b, reason: collision with root package name */
        final String f14461b;

        /* renamed from: c, reason: collision with root package name */
        final String f14462c;

        /* renamed from: d, reason: collision with root package name */
        final d f14463d;

        e(String str, String str2, boolean z10, d dVar) {
            if (str2.isEmpty() || str2.charAt(0) != '/') {
                throw new IllegalArgumentException("Path should start with a slash '/'.");
            }
            if (!str2.endsWith("/")) {
                throw new IllegalArgumentException("Path should end with a slash '/'");
            }
            this.f14461b = str;
            this.f14462c = str2;
            this.f14460a = z10;
            this.f14463d = dVar;
        }

        public String a(String str) {
            return str.replaceFirst(this.f14462c, "");
        }

        public d b(Uri uri) {
            if (uri.getScheme().equals("http") && !this.f14460a) {
                return null;
            }
            if ((uri.getScheme().equals("http") || uri.getScheme().equals("https")) && uri.getAuthority().equals(this.f14461b) && uri.getPath().startsWith(this.f14462c)) {
                return this.f14463d;
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements d {

        /* renamed from: a, reason: collision with root package name */
        private m0 f14464a;

        public f(Context context) {
            this.f14464a = new m0(context);
        }

        @Override // e2.r.d
        public WebResourceResponse handle(String str) {
            StringBuilder sb2;
            String str2;
            try {
                return new WebResourceResponse(m0.f(str), null, this.f14464a.j(str));
            } catch (Resources.NotFoundException e10) {
                e = e10;
                sb2 = new StringBuilder();
                str2 = "Resource not found from the path: ";
                sb2.append(str2);
                sb2.append(str);
                Log.e("WebViewAssetLoader", sb2.toString(), e);
                return new WebResourceResponse(null, null, null);
            } catch (IOException e11) {
                e = e11;
                sb2 = new StringBuilder();
                str2 = "Error opening resource from the path: ";
                sb2.append(str2);
                sb2.append(str);
                Log.e("WebViewAssetLoader", sb2.toString(), e);
                return new WebResourceResponse(null, null, null);
            }
        }
    }

    r(List<e> list) {
        this.f14453a = list;
    }

    public WebResourceResponse a(Uri uri) {
        WebResourceResponse handle;
        for (e eVar : this.f14453a) {
            d b10 = eVar.b(uri);
            if (b10 != null && (handle = b10.handle(eVar.a(uri.getPath()))) != null) {
                return handle;
            }
        }
        return null;
    }
}

package p073e2;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebResourceResponse;
import androidx.core.util.C0980d;
import androidx.webkit.internal.C1468m0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: e2.r */
/* loaded from: classes.dex */
public final class C7114r {

    /* renamed from: a */
    private final List<e> f15825a;

    /* renamed from: e2.r$a */
    /* loaded from: classes.dex */
    public static final class a implements d {

        /* renamed from: a */
        private C1468m0 f15826a;

        public a(Context context) {
            this.f15826a = new C1468m0(context);
        }

        @Override // p073e2.C7114r.d
        public WebResourceResponse handle(String str) {
            try {
                return new WebResourceResponse(C1468m0.m8394f(str), null, this.f15826a.m8398h(str));
            } catch (IOException e10) {
                Log.e("WebViewAssetLoader", "Error opening asset path: " + str, e10);
                return new WebResourceResponse(null, null, null);
            }
        }
    }

    /* renamed from: e2.r$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private boolean f15827a;

        /* renamed from: b */
        private String f15828b = "appassets.androidplatform.net";

        /* renamed from: c */
        private final List<C0980d<String, d>> f15829c = new ArrayList();

        /* renamed from: a */
        public b m20981a(String str, d dVar) {
            this.f15829c.add(C0980d.m4819a(str, dVar));
            return this;
        }

        /* renamed from: b */
        public C7114r m20982b() {
            ArrayList arrayList = new ArrayList();
            for (C0980d<String, d> c0980d : this.f15829c) {
                arrayList.add(new e(this.f15828b, c0980d.f4539a, this.f15827a, c0980d.f4540b));
            }
            return new C7114r(arrayList);
        }

        /* renamed from: c */
        public b m20983c(String str) {
            this.f15828b = str;
            return this;
        }

        /* renamed from: d */
        public b m20984d(boolean z10) {
            this.f15827a = z10;
            return this;
        }
    }

    /* renamed from: e2.r$c */
    /* loaded from: classes.dex */
    public static final class c implements d {

        /* renamed from: b */
        private static final String[] f15830b = {"app_webview/", "databases/", "lib/", "shared_prefs/", "code_cache/"};

        /* renamed from: a */
        private final File f15831a;

        public c(Context context, File file) {
            try {
                this.f15831a = new File(C1468m0.m8389a(file));
                if (m20985a(context)) {
                    return;
                }
                throw new IllegalArgumentException("The given directory \"" + file + "\" doesn't exist under an allowed app internal storage directory");
            } catch (IOException e10) {
                throw new IllegalArgumentException("Failed to resolve the canonical path for the given directory: " + file.getPath(), e10);
            }
        }

        /* renamed from: a */
        private boolean m20985a(Context context) {
            String m8389a = C1468m0.m8389a(this.f15831a);
            String m8389a2 = C1468m0.m8389a(context.getCacheDir());
            String m8389a3 = C1468m0.m8389a(C1468m0.m8391c(context));
            if ((!m8389a.startsWith(m8389a2) && !m8389a.startsWith(m8389a3)) || m8389a.equals(m8389a2) || m8389a.equals(m8389a3)) {
                return false;
            }
            for (String str : f15830b) {
                if (m8389a.startsWith(m8389a3 + str)) {
                    return false;
                }
            }
            return true;
        }

        @Override // p073e2.C7114r.d
        public WebResourceResponse handle(String str) {
            File m8390b;
            try {
                m8390b = C1468m0.m8390b(this.f15831a, str);
            } catch (IOException e10) {
                Log.e("WebViewAssetLoader", "Error opening the requested path: " + str, e10);
            }
            if (m8390b != null) {
                return new WebResourceResponse(C1468m0.m8394f(str), null, C1468m0.m8396i(m8390b));
            }
            Log.e("WebViewAssetLoader", String.format("The requested file: %s is outside the mounted directory: %s", str, this.f15831a));
            return new WebResourceResponse(null, null, null);
        }
    }

    /* renamed from: e2.r$d */
    /* loaded from: classes.dex */
    public interface d {
        WebResourceResponse handle(String str);
    }

    /* renamed from: e2.r$e */
    /* loaded from: classes.dex */
    static class e {

        /* renamed from: a */
        final boolean f15832a;

        /* renamed from: b */
        final String f15833b;

        /* renamed from: c */
        final String f15834c;

        /* renamed from: d */
        final d f15835d;

        e(String str, String str2, boolean z10, d dVar) {
            if (str2.isEmpty() || str2.charAt(0) != '/') {
                throw new IllegalArgumentException("Path should start with a slash '/'.");
            }
            if (!str2.endsWith("/")) {
                throw new IllegalArgumentException("Path should end with a slash '/'");
            }
            this.f15833b = str;
            this.f15834c = str2;
            this.f15832a = z10;
            this.f15835d = dVar;
        }

        /* renamed from: a */
        public String m20986a(String str) {
            return str.replaceFirst(this.f15834c, "");
        }

        /* renamed from: b */
        public d m20987b(Uri uri) {
            if (uri.getScheme().equals("http") && !this.f15832a) {
                return null;
            }
            if ((uri.getScheme().equals("http") || uri.getScheme().equals("https")) && uri.getAuthority().equals(this.f15833b) && uri.getPath().startsWith(this.f15834c)) {
                return this.f15835d;
            }
            return null;
        }
    }

    /* renamed from: e2.r$f */
    /* loaded from: classes.dex */
    public static final class f implements d {

        /* renamed from: a */
        private C1468m0 f15836a;

        public f(Context context) {
            this.f15836a = new C1468m0(context);
        }

        @Override // p073e2.C7114r.d
        public WebResourceResponse handle(String str) {
            StringBuilder sb2;
            String str2;
            try {
                return new WebResourceResponse(C1468m0.m8394f(str), null, this.f15836a.m8399j(str));
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

    C7114r(List<e> list) {
        this.f15825a = list;
    }

    /* renamed from: a */
    public WebResourceResponse m20980a(Uri uri) {
        WebResourceResponse handle;
        for (e eVar : this.f15825a) {
            d m20987b = eVar.m20987b(uri);
            if (m20987b != null && (handle = m20987b.handle(eVar.m20986a(uri.getPath()))) != null) {
                return handle;
            }
        }
        return null;
    }
}

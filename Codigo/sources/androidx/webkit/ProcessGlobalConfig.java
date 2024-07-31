package androidx.webkit;

import android.content.Context;
import androidx.webkit.internal.c0;
import androidx.webkit.internal.j1;
import e2.c;
import java.io.File;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.support_lib_boundary.ProcessGlobalConfigConstants;

/* loaded from: classes.dex */
public class ProcessGlobalConfig {

    /* renamed from: a, reason: collision with root package name */
    String f5549a;

    /* renamed from: b, reason: collision with root package name */
    String f5550b;

    /* renamed from: c, reason: collision with root package name */
    String f5551c;
    private static final AtomicReference<HashMap<String, Object>> sProcessGlobalConfig = new AtomicReference<>();

    /* renamed from: d, reason: collision with root package name */
    private static final Object f5547d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private static boolean f5548e = false;

    public static void a(ProcessGlobalConfig processGlobalConfig) {
        synchronized (f5547d) {
            if (f5548e) {
                throw new IllegalStateException("ProcessGlobalConfig#apply was called more than once, which is an illegal operation. The configuration settings provided by ProcessGlobalConfig take effect only once, when WebView is first loaded into the current process. Every process should only ever create a single instance of ProcessGlobalConfig and apply it once, before any calls to android.webkit APIs, such as during early app startup.");
            }
            f5548e = true;
        }
        HashMap hashMap = new HashMap();
        if (d()) {
            throw new IllegalStateException("WebView has already been loaded in the current process, so any attempt to apply the settings in ProcessGlobalConfig will have no effect. ProcessGlobalConfig#apply needs to be called before any calls to android.webkit APIs, such as during early app startup.");
        }
        if (processGlobalConfig.f5549a != null) {
            if (j1.M.e()) {
                c0.e(processGlobalConfig.f5549a);
            } else {
                hashMap.put(ProcessGlobalConfigConstants.DATA_DIRECTORY_SUFFIX, processGlobalConfig.f5549a);
            }
        }
        String str = processGlobalConfig.f5550b;
        if (str != null) {
            hashMap.put(ProcessGlobalConfigConstants.DATA_DIRECTORY_BASE_PATH, str);
        }
        String str2 = processGlobalConfig.f5551c;
        if (str2 != null) {
            hashMap.put(ProcessGlobalConfigConstants.CACHE_DIRECTORY_BASE_PATH, str2);
        }
        if (!c.a(sProcessGlobalConfig, null, hashMap)) {
            throw new RuntimeException("Attempting to set ProcessGlobalConfig#sProcessGlobalConfig when it was already set");
        }
    }

    private static boolean d() {
        try {
            Field declaredField = Class.forName("android.webkit.WebViewFactory").getDeclaredField("sProviderInstance");
            declaredField.setAccessible(true);
            return declaredField.get(null) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    public ProcessGlobalConfig b(Context context, String str) {
        if (!j1.M.d(context)) {
            throw j1.a();
        }
        if (str.equals("")) {
            throw new IllegalArgumentException("Suffix cannot be an empty string");
        }
        if (str.indexOf(File.separatorChar) < 0) {
            this.f5549a = str;
            return this;
        }
        throw new IllegalArgumentException("Suffix " + str + " contains a path separator");
    }

    public ProcessGlobalConfig c(Context context, File file, File file2) {
        if (!j1.N.d(context)) {
            throw j1.a();
        }
        if (!file.isAbsolute()) {
            throw new IllegalArgumentException("dataDirectoryBasePath must be a non-empty absolute path");
        }
        if (!file2.isAbsolute()) {
            throw new IllegalArgumentException("cacheDirectoryBasePath must be a non-empty absolute path");
        }
        this.f5550b = file.getAbsolutePath();
        this.f5551c = file2.getAbsolutePath();
        return this;
    }
}

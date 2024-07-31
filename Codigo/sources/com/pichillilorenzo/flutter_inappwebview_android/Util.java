package com.pichillilorenzo.flutter_inappwebview_android;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.http.SslCertificate;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.pichillilorenzo.flutter_inappwebview_android.types.Size2D;
import com.pichillilorenzo.flutter_inappwebview_android.types.SyncBaseCallbackResultImpl;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.Key;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class Util {
    public static final String ANDROID_ASSET_URL = "file:///android_asset/";
    static final String LOG_TAG = "Util";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pichillilorenzo.flutter_inappwebview_android.Util$1 */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 implements Runnable {
        final /* synthetic */ Object val$arguments;
        final /* synthetic */ SyncBaseCallbackResultImpl val$callback;
        final /* synthetic */ String val$method;

        AnonymousClass1(String str, Object obj, SyncBaseCallbackResultImpl syncBaseCallbackResultImpl) {
            r2 = str;
            r3 = obj;
            r4 = syncBaseCallbackResultImpl;
        }

        @Override // java.lang.Runnable
        public void run() {
            MethodChannel.this.invokeMethod(r2, r3, r4);
        }
    }

    /* loaded from: classes3.dex */
    public static class PrivateKeyAndCertificates {
        public X509Certificate[] certificates;
        public PrivateKey privateKey;

        public PrivateKeyAndCertificates(PrivateKey privateKey, X509Certificate[] x509CertificateArr) {
            this.privateKey = privateKey;
            this.certificates = x509CertificateArr;
        }
    }

    private Util() {
    }

    public static String JSONStringify(Object obj) {
        return obj == null ? "null" : obj instanceof Map ? new JSONObject((Map) obj).toString() : obj instanceof List ? new JSONArray((Collection) obj).toString() : obj instanceof String ? JSONObject.quote((String) obj) : JSONObject.wrap(obj).toString();
    }

    public static Drawable drawableFromBytes(Context context, byte[] bArr) {
        return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
    }

    public static InputStream getFileAsset(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, String str) {
        PluginRegistry.Registrar registrar = inAppWebViewFlutterPlugin.registrar;
        return inAppWebViewFlutterPlugin.applicationContext.getResources().getAssets().open(registrar != null ? registrar.lookupKeyForAsset(str) : inAppWebViewFlutterPlugin.flutterAssets.getAssetFilePathByName(str));
    }

    public static Size2D getFullscreenSize(Context context) {
        int i10;
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        int navigationBars;
        int displayCutout;
        Insets insetsIgnoringVisibility;
        int i11;
        int i12;
        int i13;
        int i14;
        Rect bounds;
        Size2D size2D = new Size2D(-1.0d, -1.0d);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                windowInsets = currentWindowMetrics.getWindowInsets();
                navigationBars = WindowInsets.Type.navigationBars();
                displayCutout = WindowInsets.Type.displayCutout();
                insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(navigationBars | displayCutout);
                i11 = insetsIgnoringVisibility.right;
                i12 = insetsIgnoringVisibility.left;
                int i15 = i11 + i12;
                i13 = insetsIgnoringVisibility.top;
                i14 = insetsIgnoringVisibility.bottom;
                bounds = currentWindowMetrics.getBounds();
                size2D.setWidth(bounds.width() - i15);
                i10 = bounds.height() - (i13 + i14);
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                size2D.setWidth(displayMetrics.widthPixels);
                i10 = displayMetrics.heightPixels;
            }
            size2D.setHeight(i10);
        }
        return size2D;
    }

    public static <T> T getOrDefault(Map<String, Object> map, String str, T t10) {
        return map.containsKey(str) ? (T) map.get(str) : t10;
    }

    public static float getPixelDensity(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static String getUrlAsset(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, String str) {
        PluginRegistry.Registrar registrar = inAppWebViewFlutterPlugin.registrar;
        String lookupKeyForAsset = registrar != null ? registrar.lookupKeyForAsset(str) : inAppWebViewFlutterPlugin.flutterAssets.getAssetFilePathByName(str);
        try {
            InputStream fileAsset = getFileAsset(inAppWebViewFlutterPlugin, str);
            if (fileAsset != null) {
                fileAsset.close();
            }
            e = null;
        } catch (IOException e10) {
            e = e10;
        }
        if (e != null) {
            throw e;
        }
        return ANDROID_ASSET_URL + lookupKeyForAsset;
    }

    public static X509Certificate getX509CertFromSslCertHack(SslCertificate sslCertificate) {
        byte[] byteArray = SslCertificate.saveState(sslCertificate).getByteArray("x509-certificate");
        if (byteArray != null) {
            try {
            } catch (CertificateException unused) {
                return null;
            }
        }
        return (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(byteArray));
    }

    public static <T> T invokeMethodAndWaitResult(MethodChannel methodChannel, String str, Object obj, SyncBaseCallbackResultImpl<T> syncBaseCallbackResultImpl) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.Util.1
            final /* synthetic */ Object val$arguments;
            final /* synthetic */ SyncBaseCallbackResultImpl val$callback;
            final /* synthetic */ String val$method;

            AnonymousClass1(String str2, Object obj2, SyncBaseCallbackResultImpl syncBaseCallbackResultImpl2) {
                r2 = str2;
                r3 = obj2;
                r4 = syncBaseCallbackResultImpl2;
            }

            @Override // java.lang.Runnable
            public void run() {
                MethodChannel.this.invokeMethod(r2, r3, r4);
            }
        });
        syncBaseCallbackResultImpl2.latch.await();
        return syncBaseCallbackResultImpl2.result;
    }

    public static <O> Object invokeMethodIfExists(O o10, String str, Object... objArr) {
        for (Method method : o10.getClass().getMethods()) {
            if (method.getName().equals(str)) {
                try {
                    return method.invoke(o10, objArr);
                } catch (IllegalAccessException | InvocationTargetException unused) {
                    return null;
                }
            }
        }
        return null;
    }

    public static boolean isClass(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static boolean isIPv6(String str) {
        try {
            InetAddress.getByName(str);
            return true;
        } catch (UnknownHostException unused) {
            return false;
        }
    }

    public static PrivateKeyAndCertificates loadPrivateKeyAndCertificate(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, String str, String str2, String str3) {
        InputStream inputStream;
        try {
            inputStream = getFileAsset(inAppWebViewFlutterPlugin, str);
        } catch (IOException unused) {
            inputStream = null;
        }
        if (inputStream == null) {
            try {
                try {
                    try {
                        inputStream = new FileInputStream(str);
                    } catch (Throwable th2) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e10) {
                                Log.e(LOG_TAG, "", e10);
                            }
                        }
                        throw th2;
                    }
                } catch (Exception e11) {
                    Log.e(LOG_TAG, "", e11);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                }
            } catch (IOException e12) {
                Log.e(LOG_TAG, "", e12);
            }
        }
        KeyStore keyStore = KeyStore.getInstance(str3);
        keyStore.load(inputStream, (str2 != null ? str2 : "").toCharArray());
        String nextElement = keyStore.aliases().nextElement();
        if (str2 == null) {
            str2 = "";
        }
        Key key = keyStore.getKey(nextElement, str2.toCharArray());
        r0 = key instanceof PrivateKey ? new PrivateKeyAndCertificates((PrivateKey) key, new X509Certificate[]{(X509Certificate) keyStore.getCertificate(nextElement)}) : null;
        inputStream.close();
        inputStream.close();
        return r0;
    }

    public static void log(String str, String str2) {
        int min;
        int length = str2.length();
        int i10 = 0;
        while (i10 < length) {
            int indexOf = str2.indexOf(10, i10);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i10 + 4000);
                Log.d(str, str2.substring(i10, min));
                if (min >= indexOf) {
                    break;
                } else {
                    i10 = min;
                }
            }
            i10 = min + 1;
        }
    }

    public static HttpURLConnection makeHttpRequest(String str, String str2, Map<String, String> map) {
        HttpURLConnection httpURLConnection;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setRequestMethod(str2);
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setInstanceFollowRedirects(true);
                if ("GET".equalsIgnoreCase(str2)) {
                    httpURLConnection.setDoOutput(false);
                }
                httpURLConnection.connect();
                return httpURLConnection;
            } catch (Exception e10) {
                e = e10;
                if (!(e instanceof SSLHandshakeException)) {
                    Log.e(LOG_TAG, "", e);
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return null;
            }
        } catch (Exception e11) {
            e = e11;
            httpURLConnection = null;
        }
    }

    public static String normalizeIPv6(String str) {
        if (isIPv6(str)) {
            return InetAddress.getByName(str).getCanonicalHostName();
        }
        throw new Exception("Invalid address: " + str);
    }

    public static boolean objEquals(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static byte[] readAllBytes(InputStream inputStream) {
        byte[] bArr = null;
        if (inputStream == null) {
            return null;
        }
        byte[] bArr2 = new byte[RecognitionOptions.AZTEC];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            try {
                int read = inputStream.read(bArr2, 0, RecognitionOptions.AZTEC);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            } catch (IOException e10) {
                try {
                    inputStream.close();
                } catch (IOException e11) {
                    e10.addSuppressed(e11);
                }
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e12) {
                    e10.addSuppressed(e12);
                }
            } catch (Throwable th2) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
                try {
                    byteArrayOutputStream.close();
                    throw th2;
                } catch (IOException unused2) {
                    throw th2;
                }
            }
        }
        bArr = byteArrayOutputStream.toByteArray();
        try {
            inputStream.close();
        } catch (IOException unused3) {
        }
        try {
            byteArrayOutputStream.close();
        } catch (IOException unused4) {
            return bArr;
        }
    }

    public static String replaceAll(String str, String str2, String str3) {
        return TextUtils.join(str3, str.split(Pattern.quote(str2)));
    }
}

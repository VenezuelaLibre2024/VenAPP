package mm;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public class a implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    private static String f21540d = "ThumbnailPlugin";

    /* renamed from: a, reason: collision with root package name */
    private Context f21541a;

    /* renamed from: b, reason: collision with root package name */
    private ExecutorService f21542b;

    /* renamed from: c, reason: collision with root package name */
    private MethodChannel f21543c;

    /* renamed from: mm.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class RunnableC0348a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f21544a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f21545b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f21546c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ HashMap f21547d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f21548e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f21549f;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f21550r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f21551s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f21552t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ MethodChannel.Result f21553u;

        RunnableC0348a(String str, Map map, String str2, HashMap hashMap, int i10, int i11, int i12, int i13, int i14, MethodChannel.Result result) {
            this.f21544a = str;
            this.f21545b = map;
            this.f21546c = str2;
            this.f21547d = hashMap;
            this.f21548e = i10;
            this.f21549f = i11;
            this.f21550r = i12;
            this.f21551s = i13;
            this.f21552t = i14;
            this.f21553u = result;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            Object obj2 = null;
            boolean z10 = false;
            try {
                boolean z11 = true;
                if (this.f21544a.equals(Constants.FILE)) {
                    obj = a.this.e(this.f21546c, this.f21547d, (String) this.f21545b.get("path"), this.f21548e, this.f21549f, this.f21550r, this.f21551s, this.f21552t);
                } else if (this.f21544a.equals("data")) {
                    obj = a.this.d(this.f21546c, this.f21547d, this.f21548e, this.f21549f, this.f21550r, this.f21551s, this.f21552t);
                } else {
                    z11 = false;
                    obj = null;
                }
                e = null;
                obj2 = obj;
                z10 = z11;
            } catch (Exception e10) {
                e = e10;
            }
            a.this.i(this.f21553u, obj2, z10, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f21555a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MethodChannel.Result f21556b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Exception f21557c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f21558d;

        b(boolean z10, MethodChannel.Result result, Exception exc, Object obj) {
            this.f21555a = z10;
            this.f21556b = result;
            this.f21557c = exc;
            this.f21558d = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f21555a) {
                this.f21556b.notImplemented();
                return;
            }
            Exception exc = this.f21557c;
            if (exc == null) {
                this.f21556b.success(this.f21558d);
            } else {
                exc.printStackTrace();
                this.f21556b.error(Constants.EXCEPTION, this.f21557c.getMessage(), null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] d(String str, HashMap<String, String> hashMap, int i10, int i11, int i12, int i13, int i14) {
        Bitmap f10 = f(str, hashMap, i11, i12, i13);
        f10.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        f10.compress(h(i10), i14, byteArrayOutputStream);
        f10.recycle();
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(String str, HashMap<String, String> hashMap, String str2, int i10, int i11, int i12, int i13, int i14) {
        StringBuilder sb2;
        byte[] d10 = d(str, hashMap, i10, i11, i12, i13, i14);
        String g10 = g(i10);
        String str3 = str.substring(0, str.lastIndexOf(".") + 1) + g10;
        String absolutePath = (str2 != null || (str.startsWith("/") || str.startsWith("file://"))) ? str2 : this.f21541a.getCacheDir().getAbsolutePath();
        if (absolutePath != null) {
            if (absolutePath.endsWith(g10)) {
                str3 = absolutePath;
            } else {
                int lastIndexOf = str3.lastIndexOf("/");
                if (absolutePath.endsWith("/")) {
                    sb2 = new StringBuilder();
                    sb2.append(absolutePath);
                    lastIndexOf++;
                } else {
                    sb2 = new StringBuilder();
                    sb2.append(absolutePath);
                }
                sb2.append(str3.substring(lastIndexOf));
                str3 = sb2.toString();
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str3);
            fileOutputStream.write(d10);
            fileOutputStream.close();
            Log.d(f21540d, String.format("buildThumbnailFile( written:%d )", Integer.valueOf(d10.length)));
            return str3;
        } catch (IOException e10) {
            e10.printStackTrace();
            throw new RuntimeException(e10);
        }
    }

    private static String g(int i10) {
        return i10 != 1 ? i10 != 2 ? "jpg" : "webp" : "png";
    }

    private static Bitmap.CompressFormat h(int i10) {
        return i10 != 1 ? i10 != 2 ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.PNG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(MethodChannel.Result result, Object obj, boolean z10, Exception exc) {
        j(new b(z10, result, exc, obj));
    }

    private static void j(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    private static void k(String str, MediaMetadataRetriever mediaMetadataRetriever) {
        mediaMetadataRetriever.setDataSource(new FileInputStream(new File(str).getAbsolutePath()).getFD());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0059 A[Catch: all -> 0x00b1, IOException -> 0x00b3, RuntimeException -> 0x00bf, IllegalArgumentException -> 0x00cb, TryCatch #12 {RuntimeException -> 0x00bf, blocks: (B:3:0x0006, B:5:0x000e, B:10:0x0031, B:19:0x003a, B:23:0x0044, B:24:0x0050, B:26:0x0059, B:28:0x0063, B:30:0x006e, B:31:0x0077, B:33:0x0012, B:35:0x001a, B:38:0x0028, B:39:0x0023), top: B:2:0x0006, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Bitmap f(java.lang.String r9, java.util.HashMap<java.lang.String, java.lang.String> r10, int r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mm.a.f(java.lang.String, java.util.HashMap, int, int, int):android.graphics.Bitmap");
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f21541a = flutterPluginBinding.getApplicationContext();
        this.f21542b = Executors.newCachedThreadPool();
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "plugins.justsoft.xyz/video_thumbnail");
        this.f21543c = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f21543c.setMethodCallHandler(null);
        this.f21543c = null;
        this.f21542b.shutdown();
        this.f21542b = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        Map map = (Map) methodCall.arguments();
        String str = (String) map.get("video");
        HashMap hashMap = (HashMap) map.get("headers");
        int intValue = ((Integer) map.get("format")).intValue();
        int intValue2 = ((Integer) map.get("maxh")).intValue();
        int intValue3 = ((Integer) map.get("maxw")).intValue();
        int intValue4 = ((Integer) map.get("timeMs")).intValue();
        int intValue5 = ((Integer) map.get("quality")).intValue();
        this.f21542b.execute(new RunnableC0348a(methodCall.method, map, str, hashMap, intValue, intValue2, intValue3, intValue4, intValue5, result));
    }
}

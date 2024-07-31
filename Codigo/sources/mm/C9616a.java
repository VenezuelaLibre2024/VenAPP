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

/* renamed from: mm.a */
/* loaded from: classes3.dex */
public class C9616a implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* renamed from: d */
    private static String f23394d = "ThumbnailPlugin";

    /* renamed from: a */
    private Context f23395a;

    /* renamed from: b */
    private ExecutorService f23396b;

    /* renamed from: c */
    private MethodChannel f23397c;

    /* renamed from: mm.a$a */
    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f23398a;

        /* renamed from: b */
        final /* synthetic */ Map f23399b;

        /* renamed from: c */
        final /* synthetic */ String f23400c;

        /* renamed from: d */
        final /* synthetic */ HashMap f23401d;

        /* renamed from: e */
        final /* synthetic */ int f23402e;

        /* renamed from: f */
        final /* synthetic */ int f23403f;

        /* renamed from: r */
        final /* synthetic */ int f23404r;

        /* renamed from: s */
        final /* synthetic */ int f23405s;

        /* renamed from: t */
        final /* synthetic */ int f23406t;

        /* renamed from: u */
        final /* synthetic */ MethodChannel.Result f23407u;

        a(String str, Map map, String str2, HashMap hashMap, int i10, int i11, int i12, int i13, int i14, MethodChannel.Result result) {
            this.f23398a = str;
            this.f23399b = map;
            this.f23400c = str2;
            this.f23401d = hashMap;
            this.f23402e = i10;
            this.f23403f = i11;
            this.f23404r = i12;
            this.f23405s = i13;
            this.f23406t = i14;
            this.f23407u = result;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            Object obj2 = null;
            boolean z10 = false;
            try {
                boolean z11 = true;
                if (this.f23398a.equals(Constants.FILE)) {
                    obj = C9616a.this.m28618e(this.f23400c, this.f23401d, (String) this.f23399b.get("path"), this.f23402e, this.f23403f, this.f23404r, this.f23405s, this.f23406t);
                } else if (this.f23398a.equals("data")) {
                    obj = C9616a.this.m28617d(this.f23400c, this.f23401d, this.f23402e, this.f23403f, this.f23404r, this.f23405s, this.f23406t);
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
            C9616a.this.m28621i(this.f23407u, obj2, z10, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: mm.a$b */
    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f23409a;

        /* renamed from: b */
        final /* synthetic */ MethodChannel.Result f23410b;

        /* renamed from: c */
        final /* synthetic */ Exception f23411c;

        /* renamed from: d */
        final /* synthetic */ Object f23412d;

        b(boolean z10, MethodChannel.Result result, Exception exc, Object obj) {
            this.f23409a = z10;
            this.f23410b = result;
            this.f23411c = exc;
            this.f23412d = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f23409a) {
                this.f23410b.notImplemented();
                return;
            }
            Exception exc = this.f23411c;
            if (exc == null) {
                this.f23410b.success(this.f23412d);
            } else {
                exc.printStackTrace();
                this.f23410b.error(Constants.EXCEPTION, this.f23411c.getMessage(), null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public byte[] m28617d(String str, HashMap<String, String> hashMap, int i10, int i11, int i12, int i13, int i14) {
        Bitmap m28624f = m28624f(str, hashMap, i11, i12, i13);
        m28624f.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m28624f.compress(m28620h(i10), i14, byteArrayOutputStream);
        m28624f.recycle();
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public String m28618e(String str, HashMap<String, String> hashMap, String str2, int i10, int i11, int i12, int i13, int i14) {
        StringBuilder sb2;
        byte[] m28617d = m28617d(str, hashMap, i10, i11, i12, i13, i14);
        String m28619g = m28619g(i10);
        String str3 = str.substring(0, str.lastIndexOf(".") + 1) + m28619g;
        String absolutePath = (str2 != null || (str.startsWith("/") || str.startsWith("file://"))) ? str2 : this.f23395a.getCacheDir().getAbsolutePath();
        if (absolutePath != null) {
            if (absolutePath.endsWith(m28619g)) {
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
            fileOutputStream.write(m28617d);
            fileOutputStream.close();
            Log.d(f23394d, String.format("buildThumbnailFile( written:%d )", Integer.valueOf(m28617d.length)));
            return str3;
        } catch (IOException e10) {
            e10.printStackTrace();
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: g */
    private static String m28619g(int i10) {
        return i10 != 1 ? i10 != 2 ? "jpg" : "webp" : "png";
    }

    /* renamed from: h */
    private static Bitmap.CompressFormat m28620h(int i10) {
        return i10 != 1 ? i10 != 2 ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.PNG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m28621i(MethodChannel.Result result, Object obj, boolean z10, Exception exc) {
        m28622j(new b(z10, result, exc, obj));
    }

    /* renamed from: j */
    private static void m28622j(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    /* renamed from: k */
    private static void m28623k(String str, MediaMetadataRetriever mediaMetadataRetriever) {
        mediaMetadataRetriever.setDataSource(new FileInputStream(new File(str).getAbsolutePath()).getFD());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0059 A[Catch: all -> 0x00b1, IOException -> 0x00b3, RuntimeException -> 0x00bf, IllegalArgumentException -> 0x00cb, TryCatch #12 {RuntimeException -> 0x00bf, blocks: (B:3:0x0006, B:5:0x000e, B:10:0x0031, B:19:0x003a, B:23:0x0044, B:24:0x0050, B:26:0x0059, B:28:0x0063, B:30:0x006e, B:31:0x0077, B:33:0x0012, B:35:0x001a, B:38:0x0028, B:39:0x0023), top: B:2:0x0006, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Bitmap m28624f(java.lang.String r9, java.util.HashMap<java.lang.String, java.lang.String> r10, int r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mm.C9616a.m28624f(java.lang.String, java.util.HashMap, int, int, int):android.graphics.Bitmap");
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f23395a = flutterPluginBinding.getApplicationContext();
        this.f23396b = Executors.newCachedThreadPool();
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "plugins.justsoft.xyz/video_thumbnail");
        this.f23397c = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f23397c.setMethodCallHandler(null);
        this.f23397c = null;
        this.f23396b.shutdown();
        this.f23396b = null;
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
        this.f23396b.execute(new a(methodCall.method, map, str, hashMap, intValue, intValue2, intValue3, intValue4, intValue5, result));
    }
}

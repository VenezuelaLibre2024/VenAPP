package p223lh;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import androidx.exifinterface.media.C1239a;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: lh.a */
/* loaded from: classes3.dex */
public final class C9508a implements FlutterPlugin, ActivityAware, MethodChannel.MethodCallHandler, PluginRegistry.RequestPermissionsResultListener {

    /* renamed from: a */
    private MethodChannel f23075a;

    /* renamed from: b */
    private ActivityPluginBinding f23076b;

    /* renamed from: c */
    private Activity f23077c;

    /* renamed from: d */
    private MethodChannel.Result f23078d;

    /* renamed from: e */
    private ExecutorService f23079e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lh.a$a */
    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f23080a;

        /* renamed from: b */
        final /* synthetic */ MethodChannel.Result f23081b;

        /* renamed from: c */
        final /* synthetic */ RectF f23082c;

        /* renamed from: d */
        final /* synthetic */ float f23083d;

        /* renamed from: lh.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class RunnableC13222a implements Runnable {
            RunnableC13222a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f23081b.error("INVALID", "Image source cannot be opened", null);
            }
        }

        /* renamed from: lh.a$a$b */
        /* loaded from: classes3.dex */
        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f23081b.error("INVALID", "Image source cannot be decoded", null);
            }
        }

        /* renamed from: lh.a$a$c */
        /* loaded from: classes3.dex */
        class c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ File f23087a;

            c(File file) {
                this.f23087a = file;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f23081b.success(this.f23087a.getAbsolutePath());
            }
        }

        /* renamed from: lh.a$a$d */
        /* loaded from: classes3.dex */
        class d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ IOException f23089a;

            d(IOException iOException) {
                this.f23089a = iOException;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f23081b.error("INVALID", "Image could not be saved", this.f23089a);
            }
        }

        a(String str, MethodChannel.Result result, RectF rectF, float f10) {
            this.f23080a = str;
            this.f23081b = result;
            this.f23082c = rectF;
            this.f23083d = f10;
        }

        @Override // java.lang.Runnable
        public void run() {
            C9508a c9508a;
            Runnable bVar;
            if (new File(this.f23080a).exists()) {
                Bitmap decodeFile = BitmapFactory.decodeFile(this.f23080a, null);
                if (decodeFile != null) {
                    if (C9508a.this.m28290l(this.f23080a).m28301d()) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(r9.m28298a());
                        Bitmap createBitmap = Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true);
                        decodeFile.recycle();
                        decodeFile = createBitmap;
                    }
                    int m28300c = (int) (r9.m28300c() * this.f23082c.width() * this.f23083d);
                    int m28299b = (int) (r9.m28299b() * this.f23082c.height() * this.f23083d);
                    Bitmap createBitmap2 = Bitmap.createBitmap(m28300c, m28299b, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap2);
                    Paint paint = new Paint();
                    paint.setAntiAlias(true);
                    paint.setFilterBitmap(true);
                    paint.setDither(true);
                    canvas.drawBitmap(decodeFile, new Rect((int) (decodeFile.getWidth() * this.f23082c.left), (int) (decodeFile.getHeight() * this.f23082c.top), (int) (decodeFile.getWidth() * this.f23082c.right), (int) (decodeFile.getHeight() * this.f23082c.bottom)), new Rect(0, 0, m28300c, m28299b), paint);
                    try {
                        try {
                            File m28288j = C9508a.this.m28288j();
                            C9508a.this.m28286h(createBitmap2, m28288j);
                            C9508a.this.m28297s(new c(m28288j));
                        } catch (IOException e10) {
                            C9508a.this.m28297s(new d(e10));
                        }
                        return;
                    } finally {
                        canvas.setBitmap(null);
                        createBitmap2.recycle();
                        decodeFile.recycle();
                    }
                }
                c9508a = C9508a.this;
                bVar = new b();
            } else {
                c9508a = C9508a.this;
                bVar = new RunnableC13222a();
            }
            c9508a.m28297s(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lh.a$b */
    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f23091a;

        /* renamed from: b */
        final /* synthetic */ MethodChannel.Result f23092b;

        /* renamed from: c */
        final /* synthetic */ int f23093c;

        /* renamed from: d */
        final /* synthetic */ int f23094d;

        /* renamed from: lh.a$b$a */
        /* loaded from: classes3.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f23092b.error("INVALID", "Image source cannot be opened", null);
            }
        }

        /* renamed from: lh.a$b$b, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class RunnableC13223b implements Runnable {
            RunnableC13223b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f23092b.error("INVALID", "Image source cannot be decoded", null);
            }
        }

        /* renamed from: lh.a$b$c */
        /* loaded from: classes3.dex */
        class c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ File f23098a;

            c(File file) {
                this.f23098a = file;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f23092b.success(this.f23098a.getAbsolutePath());
            }
        }

        /* renamed from: lh.a$b$d */
        /* loaded from: classes3.dex */
        class d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ IOException f23100a;

            d(IOException iOException) {
                this.f23100a = iOException;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f23092b.error("INVALID", "Image could not be saved", this.f23100a);
            }
        }

        b(String str, MethodChannel.Result result, int i10, int i11) {
            this.f23091a = str;
            this.f23092b = result;
            this.f23093c = i10;
            this.f23094d = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            C9508a c9508a;
            Runnable runnableC13223b;
            File file = new File(this.f23091a);
            if (file.exists()) {
                d m28290l = C9508a.this.m28290l(this.f23091a);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = C9508a.this.m28285g(m28290l.m28300c(), m28290l.m28299b(), this.f23093c, this.f23094d);
                Bitmap decodeFile = BitmapFactory.decodeFile(this.f23091a, options);
                if (decodeFile != null) {
                    if (m28290l.m28300c() > this.f23093c && m28290l.m28299b() > this.f23094d) {
                        float max = Math.max(this.f23093c / m28290l.m28300c(), this.f23094d / m28290l.m28299b());
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeFile, Math.round(decodeFile.getWidth() * max), Math.round(decodeFile.getHeight() * max), true);
                        decodeFile.recycle();
                        decodeFile = createScaledBitmap;
                    }
                    try {
                        try {
                            File m28288j = C9508a.this.m28288j();
                            C9508a.this.m28286h(decodeFile, m28288j);
                            C9508a.this.m28287i(file, m28288j);
                            C9508a.this.m28297s(new c(m28288j));
                        } catch (IOException e10) {
                            C9508a.this.m28297s(new d(e10));
                        }
                        return;
                    } finally {
                        decodeFile.recycle();
                    }
                }
                c9508a = C9508a.this;
                runnableC13223b = new RunnableC13223b();
            } else {
                c9508a = C9508a.this;
                runnableC13223b = new a();
            }
            c9508a.m28297s(runnableC13223b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lh.a$c */
    /* loaded from: classes3.dex */
    public class c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f23102a;

        /* renamed from: b */
        final /* synthetic */ MethodChannel.Result f23103b;

        /* renamed from: lh.a$c$a */
        /* loaded from: classes3.dex */
        class a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Map f23105a;

            a(Map map) {
                this.f23105a = map;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f23103b.success(this.f23105a);
            }
        }

        c(String str, MethodChannel.Result result) {
            this.f23102a = str;
            this.f23103b = result;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!new File(this.f23102a).exists()) {
                this.f23103b.error("INVALID", "Image source cannot be opened", null);
                return;
            }
            d m28290l = C9508a.this.m28290l(this.f23102a);
            HashMap hashMap = new HashMap();
            hashMap.put("width", Integer.valueOf(m28290l.m28300c()));
            hashMap.put("height", Integer.valueOf(m28290l.m28299b()));
            C9508a.this.m28297s(new a(hashMap));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lh.a$d */
    /* loaded from: classes3.dex */
    public static final class d {

        /* renamed from: a */
        private final int f23107a;

        /* renamed from: b */
        private final int f23108b;

        /* renamed from: c */
        private final int f23109c;

        d(int i10, int i11, int i12) {
            this.f23107a = i10;
            this.f23108b = i11;
            this.f23109c = i12;
        }

        /* renamed from: a */
        int m28298a() {
            return this.f23109c;
        }

        /* renamed from: b */
        int m28299b() {
            return (!m28301d() || this.f23109c == 180) ? this.f23108b : this.f23107a;
        }

        /* renamed from: c */
        int m28300c() {
            return (!m28301d() || this.f23109c == 180) ? this.f23107a : this.f23108b;
        }

        /* renamed from: d */
        boolean m28301d() {
            int i10 = this.f23109c;
            return i10 == 90 || i10 == 270 || i10 == 180;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public int m28285g(int i10, int i11, int i12, int i13) {
        int i14 = 1;
        if (i11 > i13 || i10 > i12) {
            int i15 = i11 / 2;
            int i16 = i10 / 2;
            while (i15 / i14 >= i13 && i16 / i14 >= i12) {
                i14 *= 2;
            }
        }
        return i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m28286h(Bitmap bitmap, File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            if (!bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream)) {
                throw new IOException("Failed to compress bitmap into JPEG");
            }
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m28287i(File file, File file2) {
        try {
            C1239a c1239a = new C1239a(file.getAbsolutePath());
            C1239a c1239a2 = new C1239a(file2.getAbsolutePath());
            for (String str : Arrays.asList("FNumber", "ExposureTime", "PhotographicSensitivity", "GPSAltitude", "GPSAltitudeRef", "FocalLength", "GPSDateStamp", "WhiteBalance", "GPSProcessingMethod", "GPSTimeStamp", "DateTime", "Flash", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "Make", "Model", "Orientation")) {
                String m6781f = c1239a.m6781f(str);
                if (m6781f != null) {
                    c1239a2.m6779a0(str, m6781f);
                }
            }
            c1239a2.m6778W();
        } catch (IOException e10) {
            Log.e("ImageCrop", "Failed to preserve Exif information", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public File m28288j() {
        return File.createTempFile("image_crop_" + UUID.randomUUID().toString(), ".jpg", this.f23077c.getCacheDir());
    }

    /* renamed from: k */
    private void m28289k(String str, RectF rectF, float f10, MethodChannel.Result result) {
        m28293o(new a(str, result, rectF, f10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public d m28290l(String str) {
        int i10;
        try {
            i10 = new C1239a(str).m6785r();
        } catch (IOException e10) {
            Log.e("ImageCrop", "Failed to read a file " + str, e10);
            i10 = 0;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        return new d(options.outWidth, options.outHeight, i10);
    }

    /* renamed from: m */
    private void m28291m(String str, MethodChannel.Result result) {
        m28293o(new c(str, result));
    }

    /* renamed from: n */
    private int m28292n(String str, String[] strArr, int[] iArr) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (str.equals(strArr[i10])) {
                return iArr[i10];
            }
        }
        return -1;
    }

    /* renamed from: o */
    private synchronized void m28293o(Runnable runnable) {
        if (this.f23079e == null) {
            this.f23079e = Executors.newCachedThreadPool();
        }
        this.f23079e.execute(runnable);
    }

    /* renamed from: p */
    private void m28294p(MethodChannel.Result result) {
        if (this.f23077c.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0 && this.f23077c.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            result.success(Boolean.TRUE);
        } else {
            this.f23078d = result;
            this.f23077c.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, 13094);
        }
    }

    /* renamed from: q */
    private void m28295q(String str, int i10, int i11, MethodChannel.Result result) {
        m28293o(new b(str, result, i10, i11));
    }

    /* renamed from: r */
    private void m28296r(BinaryMessenger binaryMessenger) {
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "plugins.lykhonis.com/image_crop");
        this.f23075a = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public void m28297s(Runnable runnable) {
        this.f23077c.runOnUiThread(runnable);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        this.f23076b = activityPluginBinding;
        this.f23077c = activityPluginBinding.getActivity();
        activityPluginBinding.addRequestPermissionsResultListener(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        m28296r(flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.f23077c = null;
        ActivityPluginBinding activityPluginBinding = this.f23076b;
        if (activityPluginBinding != null) {
            activityPluginBinding.removeRequestPermissionsResultListener(this);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f23075a.setMethodCallHandler(null);
        this.f23075a = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        if ("cropImage".equals(methodCall.method)) {
            String str = (String) methodCall.argument("path");
            double doubleValue = ((Double) methodCall.argument("scale")).doubleValue();
            m28289k(str, new RectF((float) ((Double) methodCall.argument("left")).doubleValue(), (float) ((Double) methodCall.argument("top")).doubleValue(), (float) ((Double) methodCall.argument("right")).doubleValue(), (float) ((Double) methodCall.argument("bottom")).doubleValue()), (float) doubleValue, result);
            return;
        }
        if ("sampleImage".equals(methodCall.method)) {
            m28295q((String) methodCall.argument("path"), ((Integer) methodCall.argument("maximumWidth")).intValue(), ((Integer) methodCall.argument("maximumHeight")).intValue(), result);
            return;
        }
        if ("getImageOptions".equals(methodCall.method)) {
            m28291m((String) methodCall.argument("path"), result);
        } else if ("requestPermissions".equals(methodCall.method)) {
            m28294p(result);
        } else {
            result.notImplemented();
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (i10 == 13094 && this.f23078d != null) {
            this.f23078d.success(Boolean.valueOf(m28292n("android.permission.READ_EXTERNAL_STORAGE", strArr, iArr) == 0 && m28292n("android.permission.WRITE_EXTERNAL_STORAGE", strArr, iArr) == 0));
            this.f23078d = null;
        }
        return false;
    }
}

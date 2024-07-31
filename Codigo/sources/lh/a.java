package lh;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
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

/* loaded from: classes3.dex */
public final class a implements FlutterPlugin, ActivityAware, MethodChannel.MethodCallHandler, PluginRegistry.RequestPermissionsResultListener {

    /* renamed from: a, reason: collision with root package name */
    private MethodChannel f21222a;

    /* renamed from: b, reason: collision with root package name */
    private ActivityPluginBinding f21223b;

    /* renamed from: c, reason: collision with root package name */
    private Activity f21224c;

    /* renamed from: d, reason: collision with root package name */
    private MethodChannel.Result f21225d;

    /* renamed from: e, reason: collision with root package name */
    private ExecutorService f21226e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lh.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class RunnableC0330a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f21227a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MethodChannel.Result f21228b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ RectF f21229c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f21230d;

        /* renamed from: lh.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class RunnableC0331a implements Runnable {
            RunnableC0331a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                RunnableC0330a.this.f21228b.error("INVALID", "Image source cannot be opened", null);
            }
        }

        /* renamed from: lh.a$a$b */
        /* loaded from: classes3.dex */
        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                RunnableC0330a.this.f21228b.error("INVALID", "Image source cannot be decoded", null);
            }
        }

        /* renamed from: lh.a$a$c */
        /* loaded from: classes3.dex */
        class c implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ File f21234a;

            c(File file) {
                this.f21234a = file;
            }

            @Override // java.lang.Runnable
            public void run() {
                RunnableC0330a.this.f21228b.success(this.f21234a.getAbsolutePath());
            }
        }

        /* renamed from: lh.a$a$d */
        /* loaded from: classes3.dex */
        class d implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ IOException f21236a;

            d(IOException iOException) {
                this.f21236a = iOException;
            }

            @Override // java.lang.Runnable
            public void run() {
                RunnableC0330a.this.f21228b.error("INVALID", "Image could not be saved", this.f21236a);
            }
        }

        RunnableC0330a(String str, MethodChannel.Result result, RectF rectF, float f10) {
            this.f21227a = str;
            this.f21228b = result;
            this.f21229c = rectF;
            this.f21230d = f10;
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar;
            Runnable bVar;
            if (new File(this.f21227a).exists()) {
                Bitmap decodeFile = BitmapFactory.decodeFile(this.f21227a, null);
                if (decodeFile != null) {
                    if (a.this.l(this.f21227a).d()) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(r9.a());
                        Bitmap createBitmap = Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true);
                        decodeFile.recycle();
                        decodeFile = createBitmap;
                    }
                    int c10 = (int) (r9.c() * this.f21229c.width() * this.f21230d);
                    int b10 = (int) (r9.b() * this.f21229c.height() * this.f21230d);
                    Bitmap createBitmap2 = Bitmap.createBitmap(c10, b10, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap2);
                    Paint paint = new Paint();
                    paint.setAntiAlias(true);
                    paint.setFilterBitmap(true);
                    paint.setDither(true);
                    canvas.drawBitmap(decodeFile, new Rect((int) (decodeFile.getWidth() * this.f21229c.left), (int) (decodeFile.getHeight() * this.f21229c.top), (int) (decodeFile.getWidth() * this.f21229c.right), (int) (decodeFile.getHeight() * this.f21229c.bottom)), new Rect(0, 0, c10, b10), paint);
                    try {
                        try {
                            File j10 = a.this.j();
                            a.this.h(createBitmap2, j10);
                            a.this.s(new c(j10));
                        } catch (IOException e10) {
                            a.this.s(new d(e10));
                        }
                        return;
                    } finally {
                        canvas.setBitmap(null);
                        createBitmap2.recycle();
                        decodeFile.recycle();
                    }
                }
                aVar = a.this;
                bVar = new b();
            } else {
                aVar = a.this;
                bVar = new RunnableC0331a();
            }
            aVar.s(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f21238a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MethodChannel.Result f21239b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f21240c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f21241d;

        /* renamed from: lh.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class RunnableC0332a implements Runnable {
            RunnableC0332a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f21239b.error("INVALID", "Image source cannot be opened", null);
            }
        }

        /* renamed from: lh.a$b$b, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class RunnableC0333b implements Runnable {
            RunnableC0333b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f21239b.error("INVALID", "Image source cannot be decoded", null);
            }
        }

        /* loaded from: classes3.dex */
        class c implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ File f21245a;

            c(File file) {
                this.f21245a = file;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f21239b.success(this.f21245a.getAbsolutePath());
            }
        }

        /* loaded from: classes3.dex */
        class d implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ IOException f21247a;

            d(IOException iOException) {
                this.f21247a = iOException;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f21239b.error("INVALID", "Image could not be saved", this.f21247a);
            }
        }

        b(String str, MethodChannel.Result result, int i10, int i11) {
            this.f21238a = str;
            this.f21239b = result;
            this.f21240c = i10;
            this.f21241d = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar;
            Runnable runnableC0333b;
            File file = new File(this.f21238a);
            if (file.exists()) {
                d l10 = a.this.l(this.f21238a);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = a.this.g(l10.c(), l10.b(), this.f21240c, this.f21241d);
                Bitmap decodeFile = BitmapFactory.decodeFile(this.f21238a, options);
                if (decodeFile != null) {
                    if (l10.c() > this.f21240c && l10.b() > this.f21241d) {
                        float max = Math.max(this.f21240c / l10.c(), this.f21241d / l10.b());
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeFile, Math.round(decodeFile.getWidth() * max), Math.round(decodeFile.getHeight() * max), true);
                        decodeFile.recycle();
                        decodeFile = createScaledBitmap;
                    }
                    try {
                        try {
                            File j10 = a.this.j();
                            a.this.h(decodeFile, j10);
                            a.this.i(file, j10);
                            a.this.s(new c(j10));
                        } catch (IOException e10) {
                            a.this.s(new d(e10));
                        }
                        return;
                    } finally {
                        decodeFile.recycle();
                    }
                }
                aVar = a.this;
                runnableC0333b = new RunnableC0333b();
            } else {
                aVar = a.this;
                runnableC0333b = new RunnableC0332a();
            }
            aVar.s(runnableC0333b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f21249a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MethodChannel.Result f21250b;

        /* renamed from: lh.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class RunnableC0334a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Map f21252a;

            RunnableC0334a(Map map) {
                this.f21252a = map;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f21250b.success(this.f21252a);
            }
        }

        c(String str, MethodChannel.Result result) {
            this.f21249a = str;
            this.f21250b = result;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!new File(this.f21249a).exists()) {
                this.f21250b.error("INVALID", "Image source cannot be opened", null);
                return;
            }
            d l10 = a.this.l(this.f21249a);
            HashMap hashMap = new HashMap();
            hashMap.put("width", Integer.valueOf(l10.c()));
            hashMap.put("height", Integer.valueOf(l10.b()));
            a.this.s(new RunnableC0334a(hashMap));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final int f21254a;

        /* renamed from: b, reason: collision with root package name */
        private final int f21255b;

        /* renamed from: c, reason: collision with root package name */
        private final int f21256c;

        d(int i10, int i11, int i12) {
            this.f21254a = i10;
            this.f21255b = i11;
            this.f21256c = i12;
        }

        int a() {
            return this.f21256c;
        }

        int b() {
            return (!d() || this.f21256c == 180) ? this.f21255b : this.f21254a;
        }

        int c() {
            return (!d() || this.f21256c == 180) ? this.f21254a : this.f21255b;
        }

        boolean d() {
            int i10 = this.f21256c;
            return i10 == 90 || i10 == 270 || i10 == 180;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int g(int i10, int i11, int i12, int i13) {
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
    public void h(Bitmap bitmap, File file) {
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
    public void i(File file, File file2) {
        try {
            androidx.exifinterface.media.a aVar = new androidx.exifinterface.media.a(file.getAbsolutePath());
            androidx.exifinterface.media.a aVar2 = new androidx.exifinterface.media.a(file2.getAbsolutePath());
            for (String str : Arrays.asList("FNumber", "ExposureTime", "PhotographicSensitivity", "GPSAltitude", "GPSAltitudeRef", "FocalLength", "GPSDateStamp", "WhiteBalance", "GPSProcessingMethod", "GPSTimeStamp", "DateTime", "Flash", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "Make", "Model", "Orientation")) {
                String f10 = aVar.f(str);
                if (f10 != null) {
                    aVar2.a0(str, f10);
                }
            }
            aVar2.W();
        } catch (IOException e10) {
            Log.e("ImageCrop", "Failed to preserve Exif information", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File j() {
        return File.createTempFile("image_crop_" + UUID.randomUUID().toString(), ".jpg", this.f21224c.getCacheDir());
    }

    private void k(String str, RectF rectF, float f10, MethodChannel.Result result) {
        o(new RunnableC0330a(str, result, rectF, f10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public d l(String str) {
        int i10;
        try {
            i10 = new androidx.exifinterface.media.a(str).r();
        } catch (IOException e10) {
            Log.e("ImageCrop", "Failed to read a file " + str, e10);
            i10 = 0;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        return new d(options.outWidth, options.outHeight, i10);
    }

    private void m(String str, MethodChannel.Result result) {
        o(new c(str, result));
    }

    private int n(String str, String[] strArr, int[] iArr) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (str.equals(strArr[i10])) {
                return iArr[i10];
            }
        }
        return -1;
    }

    private synchronized void o(Runnable runnable) {
        if (this.f21226e == null) {
            this.f21226e = Executors.newCachedThreadPool();
        }
        this.f21226e.execute(runnable);
    }

    private void p(MethodChannel.Result result) {
        if (this.f21224c.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0 && this.f21224c.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            result.success(Boolean.TRUE);
        } else {
            this.f21225d = result;
            this.f21224c.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, 13094);
        }
    }

    private void q(String str, int i10, int i11, MethodChannel.Result result) {
        o(new b(str, result, i10, i11));
    }

    private void r(BinaryMessenger binaryMessenger) {
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "plugins.lykhonis.com/image_crop");
        this.f21222a = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(Runnable runnable) {
        this.f21224c.runOnUiThread(runnable);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        this.f21223b = activityPluginBinding;
        this.f21224c = activityPluginBinding.getActivity();
        activityPluginBinding.addRequestPermissionsResultListener(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        r(flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.f21224c = null;
        ActivityPluginBinding activityPluginBinding = this.f21223b;
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
        this.f21222a.setMethodCallHandler(null);
        this.f21222a = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        if ("cropImage".equals(methodCall.method)) {
            String str = (String) methodCall.argument("path");
            double doubleValue = ((Double) methodCall.argument("scale")).doubleValue();
            k(str, new RectF((float) ((Double) methodCall.argument("left")).doubleValue(), (float) ((Double) methodCall.argument("top")).doubleValue(), (float) ((Double) methodCall.argument("right")).doubleValue(), (float) ((Double) methodCall.argument("bottom")).doubleValue()), (float) doubleValue, result);
            return;
        }
        if ("sampleImage".equals(methodCall.method)) {
            q((String) methodCall.argument("path"), ((Integer) methodCall.argument("maximumWidth")).intValue(), ((Integer) methodCall.argument("maximumHeight")).intValue(), result);
            return;
        }
        if ("getImageOptions".equals(methodCall.method)) {
            m((String) methodCall.argument("path"), result);
        } else if ("requestPermissions".equals(methodCall.method)) {
            p(result);
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
        if (i10 == 13094 && this.f21225d != null) {
            this.f21225d.success(Boolean.valueOf(n("android.permission.READ_EXTERNAL_STORAGE", strArr, iArr) == 0 && n("android.permission.WRITE_EXTERNAL_STORAGE", strArr, iArr) == 0));
            this.f21225d = null;
        }
        return false;
    }
}

package hh;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import hh.e;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class e implements MethodChannel.MethodCallHandler, FlutterPlugin {

    /* renamed from: a, reason: collision with root package name */
    private MethodChannel f16801a;

    /* renamed from: b, reason: collision with root package name */
    private hh.a f16802b;

    /* renamed from: c, reason: collision with root package name */
    private HandlerThread f16803c;

    /* renamed from: d, reason: collision with root package name */
    private Handler f16804d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements MethodChannel.Result {

        /* renamed from: a, reason: collision with root package name */
        private final MethodChannel.Result f16805a;

        /* renamed from: b, reason: collision with root package name */
        private final Handler f16806b = new Handler(Looper.getMainLooper());

        a(MethodChannel.Result result) {
            this.f16805a = result;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(String str, String str2, Object obj) {
            this.f16805a.error(str, str2, obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(Object obj) {
            this.f16805a.success(obj);
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void error(final String str, final String str2, final Object obj) {
            this.f16806b.post(new Runnable() { // from class: hh.c
                @Override // java.lang.Runnable
                public final void run() {
                    e.a.this.c(str, str2, obj);
                }
            });
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void notImplemented() {
            Handler handler = this.f16806b;
            final MethodChannel.Result result = this.f16805a;
            Objects.requireNonNull(result);
            handler.post(new Runnable() { // from class: hh.b
                @Override // java.lang.Runnable
                public final void run() {
                    MethodChannel.Result.this.notImplemented();
                }
            });
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void success(final Object obj) {
            this.f16806b.post(new Runnable() { // from class: hh.d
                @Override // java.lang.Runnable
                public final void run() {
                    e.a.this.d(obj);
                }
            });
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final MethodCall f16807a;

        /* renamed from: b, reason: collision with root package name */
        private final MethodChannel.Result f16808b;

        b(MethodCall methodCall, MethodChannel.Result result) {
            this.f16807a = methodCall;
            this.f16808b = result;
        }

        private void a(Exception exc) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            this.f16808b.error("Exception encountered", this.f16807a.method, stringWriter.toString());
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            Exception e10;
            MethodChannel.Result result;
            Object n10;
            MethodChannel.Result result2;
            char c10 = 0;
            try {
                try {
                    e.this.f16802b.f16788e = (Map) ((Map) this.f16807a.arguments).get("options");
                    e.this.f16802b.h();
                    z10 = e.this.f16802b.i();
                    try {
                        String str = this.f16807a.method;
                        switch (str.hashCode()) {
                            case -1335458389:
                                if (str.equals("delete")) {
                                    c10 = 4;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -358737930:
                                if (str.equals("deleteAll")) {
                                    c10 = 5;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3496342:
                                if (str.equals("read")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 113399775:
                                if (str.equals("write")) {
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 208013248:
                                if (str.equals("containsKey")) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1080375339:
                                if (str.equals("readAll")) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            default:
                                c10 = 65535;
                                break;
                        }
                        Map<String, String> map = null;
                        if (c10 == 0) {
                            String d10 = e.this.d(this.f16807a);
                            String e11 = e.this.e(this.f16807a);
                            if (e11 == null) {
                                this.f16808b.error("null", null, null);
                                return;
                            } else {
                                e.this.f16802b.p(d10, e11);
                                result = this.f16808b;
                            }
                        } else if (c10 == 1) {
                            String d11 = e.this.d(this.f16807a);
                            if (e.this.f16802b.c(d11)) {
                                n10 = e.this.f16802b.n(d11);
                                result2 = this.f16808b;
                                result2.success(n10);
                                return;
                            }
                            result = this.f16808b;
                        } else if (c10 == 2) {
                            result = this.f16808b;
                            map = e.this.f16802b.o();
                        } else {
                            if (c10 == 3) {
                                boolean c11 = e.this.f16802b.c(e.this.d(this.f16807a));
                                result2 = this.f16808b;
                                n10 = Boolean.valueOf(c11);
                                result2.success(n10);
                                return;
                            }
                            if (c10 == 4) {
                                e.this.f16802b.e(e.this.d(this.f16807a));
                                result = this.f16808b;
                            } else if (c10 != 5) {
                                this.f16808b.notImplemented();
                                return;
                            } else {
                                e.this.f16802b.f();
                                result = this.f16808b;
                            }
                        }
                        result.success(map);
                    } catch (Exception e12) {
                        e10 = e12;
                        if (z10) {
                            try {
                                e.this.f16802b.f();
                                this.f16808b.success("Data has been reset");
                                return;
                            } catch (Exception e13) {
                                e10 = e13;
                                a(e10);
                            }
                        }
                        a(e10);
                    }
                } catch (Exception e14) {
                    z10 = false;
                    e10 = e14;
                }
            } catch (FileNotFoundException e15) {
                Log.i("Creating sharedPrefs", e15.getLocalizedMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(MethodCall methodCall) {
        return this.f16802b.a((String) ((Map) methodCall.arguments).get(Constants.KEY));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(MethodCall methodCall) {
        return (String) ((Map) methodCall.arguments).get("value");
    }

    public void f(BinaryMessenger binaryMessenger, Context context) {
        try {
            this.f16802b = new hh.a(context, new HashMap());
            HandlerThread handlerThread = new HandlerThread("com.it_nomads.fluttersecurestorage.worker");
            this.f16803c = handlerThread;
            handlerThread.start();
            this.f16804d = new Handler(this.f16803c.getLooper());
            MethodChannel methodChannel = new MethodChannel(binaryMessenger, "plugins.it_nomads.com/flutter_secure_storage");
            this.f16801a = methodChannel;
            methodChannel.setMethodCallHandler(this);
        } catch (Exception e10) {
            Log.e("FlutterSecureStoragePl", "Registration failed", e10);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        f(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        if (this.f16801a != null) {
            this.f16803c.quitSafely();
            this.f16803c = null;
            this.f16801a.setMethodCallHandler(null);
            this.f16801a = null;
        }
        this.f16802b = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        this.f16804d.post(new b(methodCall, new a(result)));
    }
}

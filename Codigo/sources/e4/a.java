package e4;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Environment;
import androidx.core.app.b;
import androidx.core.content.e;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public class a implements MethodChannel.MethodCallHandler, FlutterPlugin, ActivityAware, PluginRegistry.RequestPermissionsResultListener, PluginRegistry.ActivityResultListener {

    /* renamed from: a, reason: collision with root package name */
    private FlutterPlugin.FlutterPluginBinding f14473a;

    /* renamed from: b, reason: collision with root package name */
    private Context f14474b;

    /* renamed from: c, reason: collision with root package name */
    private Activity f14475c;

    /* renamed from: d, reason: collision with root package name */
    private MethodChannel f14476d;

    /* renamed from: e, reason: collision with root package name */
    private MethodChannel.Result f14477e;

    /* renamed from: f, reason: collision with root package name */
    private String f14478f;

    /* renamed from: r, reason: collision with root package name */
    private String f14479r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f14480s = false;

    private boolean a() {
        int i10 = Build.VERSION.SDK_INT;
        return (i10 < 33 && c("android.permission.READ_EXTERNAL_STORAGE")) || (i10 >= 33 && this.f14479r.startsWith("image") && c("android.permission.READ_MEDIA_IMAGES")) || ((i10 >= 33 && this.f14479r.startsWith("video") && c("android.permission.READ_MEDIA_VIDEO")) || ((i10 >= 33 && this.f14479r.startsWith("audio") && c("android.permission.READ_MEDIA_AUDIO")) || !(i10 < 33 || this.f14479r.startsWith("image") || this.f14479r.startsWith("video") || this.f14479r.startsWith("audio"))));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x03b7, code lost:
    
        if (r9.equals("c") == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String b(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 1544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.a.b(java.lang.String):java.lang.String");
    }

    private boolean c(String str) {
        return androidx.core.content.a.checkSelfPermission(this.f14475c, str) == 0;
    }

    private boolean d() {
        if (this.f14478f == null) {
            h(-4, "the file path cannot be null");
            return false;
        }
        if (new File(this.f14478f).exists()) {
            return true;
        }
        h(-2, "the " + this.f14478f + " file does not exists");
        return false;
    }

    private boolean e() {
        String[] strArr = {"/DCIM/", "/Pictures/", "/Movies/", "/Alarms/", "/Audiobooks/", "/Music/", "/Notifications/", "/Podcasts/", "/Ringtones/", "/Download/"};
        for (int i10 = 0; i10 < 10; i10++) {
            if (this.f14478f.contains(strArr[i10])) {
                return true;
            }
        }
        return false;
    }

    private boolean f() {
        try {
            String canonicalPath = new File(this.f14474b.getApplicationInfo().dataDir).getCanonicalPath();
            String canonicalPath2 = new File(this.f14478f).getCanonicalPath();
            String canonicalPath3 = this.f14474b.getExternalFilesDir(null).getCanonicalPath();
            if (!canonicalPath2.startsWith(canonicalPath)) {
                if (!canonicalPath2.startsWith(canonicalPath3)) {
                    return true;
                }
            }
            return false;
        } catch (IOException e10) {
            e10.printStackTrace();
            return true;
        }
    }

    private void g(String str) {
        b.g(this.f14475c, new String[]{str}, 33432);
    }

    private void h(int i10, String str) {
        if (this.f14477e == null || this.f14480s) {
            return;
        }
        this.f14477e.success(f4.a.a(f4.b.a(i10, str)));
        this.f14480s = true;
    }

    private void i() {
        int i10;
        String str;
        if (d()) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setFlags("application/vnd.android.package-archive".equals(this.f14479r) ? 268435456 : 536870912);
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addFlags(1);
            String packageName = this.f14474b.getPackageName();
            intent.setDataAndType(e.getUriForFile(this.f14474b, packageName + ".fileProvider.com.crazecoder.openfile", new File(this.f14478f)), this.f14479r);
            try {
                this.f14475c.startActivity(intent);
                i10 = 0;
                str = "done";
            } catch (ActivityNotFoundException unused) {
                i10 = -1;
                str = "No APP found to open this file。";
            } catch (Exception unused2) {
                i10 = -4;
                str = "File opened incorrectly。";
            }
            h(i10, str);
        }
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i10, int i11, Intent intent) {
        if (i10 != 18) {
            return false;
        }
        i();
        return false;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        this.f14475c = activityPluginBinding.getActivity();
        activityPluginBinding.addRequestPermissionsResultListener(this);
        activityPluginBinding.addActivityResultListener(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f14473a = flutterPluginBinding;
        this.f14476d = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "open_file");
        this.f14474b = this.f14473a.getApplicationContext();
        this.f14476d.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        MethodChannel methodChannel = this.f14476d;
        if (methodChannel == null) {
            return;
        }
        methodChannel.setMethodCallHandler(null);
        this.f14476d = null;
        this.f14475c = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        MethodChannel methodChannel = this.f14476d;
        if (methodChannel == null) {
            return;
        }
        methodChannel.setMethodCallHandler(null);
        this.f14476d = null;
        this.f14473a = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str;
        boolean isExternalStorageManager;
        this.f14480s = false;
        if (!methodCall.method.equals("open_file")) {
            result.notImplemented();
            this.f14480s = true;
            return;
        }
        this.f14477e = result;
        this.f14478f = (String) methodCall.argument("file_path");
        this.f14479r = (!methodCall.hasArgument("type") || methodCall.argument("type") == null) ? b(this.f14478f) : (String) methodCall.argument("type");
        if (f()) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                if (!d()) {
                    return;
                }
                if (!e()) {
                    isExternalStorageManager = Environment.isExternalStorageManager();
                    if (!isExternalStorageManager) {
                        h(-3, "Permission denied: android.Manifest.permission.MANAGE_EXTERNAL_STORAGE");
                        return;
                    }
                }
            }
            if (!a()) {
                if (i10 < 33) {
                    str = "android.permission.READ_EXTERNAL_STORAGE";
                } else if (this.f14479r.startsWith("image")) {
                    str = "android.permission.READ_MEDIA_IMAGES";
                } else if (this.f14479r.startsWith("video")) {
                    str = "android.permission.READ_MEDIA_VIDEO";
                } else if (!this.f14479r.startsWith("audio")) {
                    return;
                } else {
                    str = "android.permission.READ_MEDIA_AUDIO";
                }
                g(str);
                return;
            }
        }
        i();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (i10 != 33432) {
            return false;
        }
        for (String str : strArr) {
            if (!c(str)) {
                h(-3, "Permission denied: " + str);
                return false;
            }
        }
        i();
        return true;
    }
}

package p075e4;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Environment;
import androidx.core.app.C0777b;
import androidx.core.content.C0854a;
import androidx.core.content.C0858e;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.io.File;
import java.io.IOException;
import p096f4.C7294a;
import p096f4.C7295b;

/* renamed from: e4.a */
/* loaded from: classes.dex */
public class C7122a implements MethodChannel.MethodCallHandler, FlutterPlugin, ActivityAware, PluginRegistry.RequestPermissionsResultListener, PluginRegistry.ActivityResultListener {

    /* renamed from: a */
    private FlutterPlugin.FlutterPluginBinding f15845a;

    /* renamed from: b */
    private Context f15846b;

    /* renamed from: c */
    private Activity f15847c;

    /* renamed from: d */
    private MethodChannel f15848d;

    /* renamed from: e */
    private MethodChannel.Result f15849e;

    /* renamed from: f */
    private String f15850f;

    /* renamed from: r */
    private String f15851r;

    /* renamed from: s */
    private boolean f15852s = false;

    /* renamed from: a */
    private boolean m21012a() {
        int i10 = Build.VERSION.SDK_INT;
        return (i10 < 33 && m21014c("android.permission.READ_EXTERNAL_STORAGE")) || (i10 >= 33 && this.f15851r.startsWith("image") && m21014c("android.permission.READ_MEDIA_IMAGES")) || ((i10 >= 33 && this.f15851r.startsWith("video") && m21014c("android.permission.READ_MEDIA_VIDEO")) || ((i10 >= 33 && this.f15851r.startsWith("audio") && m21014c("android.permission.READ_MEDIA_AUDIO")) || !(i10 < 33 || this.f15851r.startsWith("image") || this.f15851r.startsWith("video") || this.f15851r.startsWith("audio"))));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x03b7, code lost:
    
        if (r9.equals("c") == false) goto L4;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String m21013b(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 1544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p075e4.C7122a.m21013b(java.lang.String):java.lang.String");
    }

    /* renamed from: c */
    private boolean m21014c(String str) {
        return C0854a.checkSelfPermission(this.f15847c, str) == 0;
    }

    /* renamed from: d */
    private boolean m21015d() {
        if (this.f15850f == null) {
            m21019h(-4, "the file path cannot be null");
            return false;
        }
        if (new File(this.f15850f).exists()) {
            return true;
        }
        m21019h(-2, "the " + this.f15850f + " file does not exists");
        return false;
    }

    /* renamed from: e */
    private boolean m21016e() {
        String[] strArr = {"/DCIM/", "/Pictures/", "/Movies/", "/Alarms/", "/Audiobooks/", "/Music/", "/Notifications/", "/Podcasts/", "/Ringtones/", "/Download/"};
        for (int i10 = 0; i10 < 10; i10++) {
            if (this.f15850f.contains(strArr[i10])) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private boolean m21017f() {
        try {
            String canonicalPath = new File(this.f15846b.getApplicationInfo().dataDir).getCanonicalPath();
            String canonicalPath2 = new File(this.f15850f).getCanonicalPath();
            String canonicalPath3 = this.f15846b.getExternalFilesDir(null).getCanonicalPath();
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

    /* renamed from: g */
    private void m21018g(String str) {
        C0777b.m3916g(this.f15847c, new String[]{str}, 33432);
    }

    /* renamed from: h */
    private void m21019h(int i10, String str) {
        if (this.f15849e == null || this.f15852s) {
            return;
        }
        this.f15849e.success(C7294a.m21870a(C7295b.m21871a(i10, str)));
        this.f15852s = true;
    }

    /* renamed from: i */
    private void m21020i() {
        int i10;
        String str;
        if (m21015d()) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setFlags("application/vnd.android.package-archive".equals(this.f15851r) ? 268435456 : 536870912);
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addFlags(1);
            String packageName = this.f15846b.getPackageName();
            intent.setDataAndType(C0858e.getUriForFile(this.f15846b, packageName + ".fileProvider.com.crazecoder.openfile", new File(this.f15850f)), this.f15851r);
            try {
                this.f15847c.startActivity(intent);
                i10 = 0;
                str = "done";
            } catch (ActivityNotFoundException unused) {
                i10 = -1;
                str = "No APP found to open this file。";
            } catch (Exception unused2) {
                i10 = -4;
                str = "File opened incorrectly。";
            }
            m21019h(i10, str);
        }
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i10, int i11, Intent intent) {
        if (i10 != 18) {
            return false;
        }
        m21020i();
        return false;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        this.f15847c = activityPluginBinding.getActivity();
        activityPluginBinding.addRequestPermissionsResultListener(this);
        activityPluginBinding.addActivityResultListener(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f15845a = flutterPluginBinding;
        this.f15848d = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "open_file");
        this.f15846b = this.f15845a.getApplicationContext();
        this.f15848d.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        MethodChannel methodChannel = this.f15848d;
        if (methodChannel == null) {
            return;
        }
        methodChannel.setMethodCallHandler(null);
        this.f15848d = null;
        this.f15847c = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        MethodChannel methodChannel = this.f15848d;
        if (methodChannel == null) {
            return;
        }
        methodChannel.setMethodCallHandler(null);
        this.f15848d = null;
        this.f15845a = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str;
        boolean isExternalStorageManager;
        this.f15852s = false;
        if (!methodCall.method.equals("open_file")) {
            result.notImplemented();
            this.f15852s = true;
            return;
        }
        this.f15849e = result;
        this.f15850f = (String) methodCall.argument("file_path");
        this.f15851r = (!methodCall.hasArgument("type") || methodCall.argument("type") == null) ? m21013b(this.f15850f) : (String) methodCall.argument("type");
        if (m21017f()) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                if (!m21015d()) {
                    return;
                }
                if (!m21016e()) {
                    isExternalStorageManager = Environment.isExternalStorageManager();
                    if (!isExternalStorageManager) {
                        m21019h(-3, "Permission denied: android.Manifest.permission.MANAGE_EXTERNAL_STORAGE");
                        return;
                    }
                }
            }
            if (!m21012a()) {
                if (i10 < 33) {
                    str = "android.permission.READ_EXTERNAL_STORAGE";
                } else if (this.f15851r.startsWith("image")) {
                    str = "android.permission.READ_MEDIA_IMAGES";
                } else if (this.f15851r.startsWith("video")) {
                    str = "android.permission.READ_MEDIA_VIDEO";
                } else if (!this.f15851r.startsWith("audio")) {
                    return;
                } else {
                    str = "android.permission.READ_MEDIA_AUDIO";
                }
                m21018g(str);
                return;
            }
        }
        m21020i();
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
            if (!m21014c(str)) {
                m21019h(-3, "Permission denied: " + str);
                return false;
            }
        }
        m21020i();
        return true;
    }
}

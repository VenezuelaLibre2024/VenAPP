package gh;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.LabeledIntent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.google.gson.Gson;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ActionBroadcastReceiver;
import dk.C7031r;
import dk.C7042z;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: gh.c */
/* loaded from: classes2.dex */
public final class C7571c implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* renamed from: c */
    public static final a f17904c = new a(null);

    /* renamed from: a */
    private MethodChannel f17905a;

    /* renamed from: b */
    private Context f17906b;

    /* renamed from: gh.c$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    /* renamed from: a */
    private final boolean m23000a(String str, String str2) {
        Object m20605G;
        Object m20605G2;
        Context context = this.f17906b;
        if (context == null) {
            C9322n.m27792p("applicationContext");
            context = null;
        }
        PackageManager packageManager = context.getPackageManager();
        C7570b c7570b = (C7570b) new Gson().m18023h(str2, C7570b.class);
        String str3 = "mailto:";
        String str4 = "android.intent.action.SENDTO";
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(new Intent("android.intent.action.SENDTO", Uri.parse("mailto:")), 0);
        C9322n.m27780d(queryIntentActivities, "queryIntentActivities(...)");
        if (!(!queryIntentActivities.isEmpty())) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:"));
        String str5 = "text/plain";
        intent.setType("text/plain");
        m20605G = C7042z.m20605G(queryIntentActivities);
        String str6 = ((ResolveInfo) m20605G).activityInfo.packageName;
        m20605G2 = C7042z.m20605G(queryIntentActivities);
        intent.setClassName(str6, ((ResolveInfo) m20605G2).activityInfo.name);
        Object[] array = c7570b.m22999e().toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        intent.putExtra("android.intent.extra.EMAIL", (String[]) array);
        Object[] array2 = c7570b.m22997c().toArray(new String[0]);
        if (array2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        intent.putExtra("android.intent.extra.CC", (String[]) array2);
        Object[] array3 = c7570b.m22995a().toArray(new String[0]);
        if (array3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        intent.putExtra("android.intent.extra.BCC", (String[]) array3);
        intent.putExtra(ActionBroadcastReceiver.KEY_URL_TITLE, c7570b.m22998d());
        intent.putExtra("android.intent.extra.TEXT", c7570b.m22996b());
        Intent createChooser = Intent.createChooser(intent, str);
        ArrayList arrayList = new ArrayList();
        int size = queryIntentActivities.size();
        int i10 = 1;
        while (i10 < size) {
            int i11 = size;
            ResolveInfo resolveInfo = queryIntentActivities.get(i10);
            List<ResolveInfo> list = queryIntentActivities;
            String str7 = resolveInfo.activityInfo.packageName;
            Intent intent2 = createChooser;
            Intent intent3 = new Intent(str4);
            String str8 = str4;
            intent3.setData(Uri.parse(str3));
            intent3.setType(str5);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            String str9 = str3;
            intent3.setClassName(activityInfo.packageName, activityInfo.name);
            String str10 = str5;
            Object[] array4 = c7570b.m22999e().toArray(new String[0]);
            if (array4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            intent3.putExtra("android.intent.extra.EMAIL", (String[]) array4);
            Object[] array5 = c7570b.m22997c().toArray(new String[0]);
            if (array5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            intent3.putExtra("android.intent.extra.CC", (String[]) array5);
            Object[] array6 = c7570b.m22995a().toArray(new String[0]);
            if (array6 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            intent3.putExtra("android.intent.extra.BCC", (String[]) array6);
            intent3.putExtra(ActionBroadcastReceiver.KEY_URL_TITLE, c7570b.m22998d());
            intent3.putExtra("android.intent.extra.TEXT", c7570b.m22996b());
            arrayList.add(new LabeledIntent(intent3, str7, resolveInfo.loadLabel(packageManager), resolveInfo.icon));
            i10++;
            size = i11;
            queryIntentActivities = list;
            createChooser = intent2;
            str4 = str8;
            str3 = str9;
            str5 = str10;
        }
        Intent intent4 = createChooser;
        Object[] array7 = arrayList.toArray(new LabeledIntent[0]);
        if (array7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        Intent putExtra = intent4.putExtra("android.intent.extra.INITIAL_INTENTS", (LabeledIntent[]) array7);
        C9322n.m27780d(putExtra, "putExtra(...)");
        putExtra.setFlags(268435456);
        Context context2 = this.f17906b;
        if (context2 == null) {
            C9322n.m27792p("applicationContext");
            context2 = null;
        }
        context2.startActivity(putExtra);
        return true;
    }

    /* renamed from: b */
    private final boolean m23001b(String str, String str2) {
        Object obj;
        Context context = this.f17906b;
        Context context2 = null;
        if (context == null) {
            C9322n.m27792p("applicationContext");
            context = null;
        }
        PackageManager packageManager = context.getPackageManager();
        C7570b c7570b = (C7570b) new Gson().m18023h(str2, C7570b.class);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(new Intent("android.intent.action.SENDTO", Uri.parse("mailto:")), 0);
        C9322n.m27780d(queryIntentActivities, "queryIntentActivities(...)");
        Iterator<T> it = queryIntentActivities.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C9322n.m27777a(((ResolveInfo) obj).loadLabel(packageManager), str)) {
                break;
            }
        }
        ResolveInfo resolveInfo = (ResolveInfo) obj;
        if (resolveInfo == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:"));
        intent.setType("text/plain");
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        Object[] array = c7570b.m22999e().toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        intent.putExtra("android.intent.extra.EMAIL", (String[]) array);
        Object[] array2 = c7570b.m22997c().toArray(new String[0]);
        if (array2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        intent.putExtra("android.intent.extra.CC", (String[]) array2);
        Object[] array3 = c7570b.m22995a().toArray(new String[0]);
        if (array3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        intent.putExtra("android.intent.extra.BCC", (String[]) array3);
        intent.putExtra(ActionBroadcastReceiver.KEY_URL_TITLE, c7570b.m22998d());
        intent.putExtra("android.intent.extra.TEXT", c7570b.m22996b());
        intent.setFlags(268435456);
        Context context3 = this.f17906b;
        if (context3 == null) {
            C9322n.m27792p("applicationContext");
        } else {
            context2 = context3;
        }
        context2.startActivity(intent);
        return true;
    }

    /* renamed from: c */
    private final boolean m23002c(String str) {
        Object m20605G;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("mailto:"));
        Context context = this.f17906b;
        Context context2 = null;
        if (context == null) {
            C9322n.m27792p("applicationContext");
            context = null;
        }
        PackageManager packageManager = context.getPackageManager();
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        C9322n.m27780d(queryIntentActivities, "queryIntentActivities(...)");
        if (!(!queryIntentActivities.isEmpty())) {
            return false;
        }
        m20605G = C7042z.m20605G(queryIntentActivities);
        Intent createChooser = Intent.createChooser(packageManager.getLaunchIntentForPackage(((ResolveInfo) m20605G).activityInfo.packageName), str);
        ArrayList arrayList = new ArrayList();
        int size = queryIntentActivities.size();
        for (int i10 = 1; i10 < size; i10++) {
            ResolveInfo resolveInfo = queryIntentActivities.get(i10);
            String str2 = resolveInfo.activityInfo.packageName;
            Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str2);
            if (launchIntentForPackage != null) {
                arrayList.add(new LabeledIntent(launchIntentForPackage, str2, resolveInfo.loadLabel(packageManager), resolveInfo.icon));
            }
        }
        Object[] array = arrayList.toArray(new LabeledIntent[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        Intent putExtra = createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (LabeledIntent[]) array);
        C9322n.m27780d(putExtra, "putExtra(...)");
        putExtra.setFlags(268435456);
        Context context3 = this.f17906b;
        if (context3 == null) {
            C9322n.m27792p("applicationContext");
        } else {
            context2 = context3;
        }
        context2.startActivity(putExtra);
        return true;
    }

    /* renamed from: d */
    private final List<C7569a> m23003d() {
        List<C7569a> m20582j;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("mailto:"));
        Context context = this.f17906b;
        if (context == null) {
            C9322n.m27792p("applicationContext");
            context = null;
        }
        PackageManager packageManager = context.getPackageManager();
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        C9322n.m27780d(queryIntentActivities, "queryIntentActivities(...)");
        if (!(!queryIntentActivities.isEmpty())) {
            m20582j = C7031r.m20582j();
            return m20582j;
        }
        ArrayList arrayList = new ArrayList();
        int size = queryIntentActivities.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new C7569a(queryIntentActivities.get(i10).loadLabel(packageManager).toString()));
        }
        return arrayList;
    }

    /* renamed from: f */
    private final boolean m23004f(String str) {
        Object obj;
        Intent launchIntentForPackage;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("mailto:"));
        Context context = this.f17906b;
        Context context2 = null;
        if (context == null) {
            C9322n.m27792p("applicationContext");
            context = null;
        }
        PackageManager packageManager = context.getPackageManager();
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        C9322n.m27780d(queryIntentActivities, "queryIntentActivities(...)");
        Iterator<T> it = queryIntentActivities.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C9322n.m27777a(((ResolveInfo) obj).loadLabel(packageManager), str)) {
                break;
            }
        }
        ResolveInfo resolveInfo = (ResolveInfo) obj;
        if (resolveInfo == null || (launchIntentForPackage = packageManager.getLaunchIntentForPackage(resolveInfo.activityInfo.packageName)) == null) {
            return false;
        }
        launchIntentForPackage.setFlags(268435456);
        Context context3 = this.f17906b;
        if (context3 == null) {
            C9322n.m27792p("applicationContext");
        } else {
            context2 = context3;
        }
        context2.startActivity(launchIntentForPackage);
        return true;
    }

    /* renamed from: e */
    public final void m23005e(Context context) {
        C9322n.m27781e(context, "context");
        this.f17906b = context;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C9322n.m27781e(flutterPluginBinding, "flutterPluginBinding");
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getFlutterEngine().getDartExecutor(), "open_mail_app");
        this.f17905a = methodChannel;
        methodChannel.setMethodCallHandler(this);
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        C9322n.m27780d(applicationContext, "getApplicationContext(...)");
        m23005e(applicationContext);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        C9322n.m27781e(binding, "binding");
        MethodChannel methodChannel = this.f17905a;
        if (methodChannel == null) {
            C9322n.m27792p("channel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        Object m18032r;
        boolean m23001b;
        C9322n.m27781e(call, "call");
        C9322n.m27781e(result, "result");
        if (C9322n.m27777a(call.method, "openMailApp")) {
            String str = (String) call.argument("nativePickerTitle");
            m23001b = m23002c(str != null ? str : "");
        } else if (C9322n.m27777a(call.method, "openSpecificMailApp") && call.hasArgument("name")) {
            Object argument = call.argument("name");
            C9322n.m27778b(argument);
            m23001b = m23004f((String) argument);
        } else if (C9322n.m27777a(call.method, "composeNewEmailInMailApp")) {
            String str2 = (String) call.argument("nativePickerTitle");
            if (str2 == null) {
                str2 = "";
            }
            String str3 = (String) call.argument("emailContent");
            m23001b = m23000a(str2, str3 != null ? str3 : "");
        } else {
            if (!C9322n.m27777a(call.method, "composeNewEmailInSpecificMailApp")) {
                if (!C9322n.m27777a(call.method, "getMainApps")) {
                    result.notImplemented();
                    return;
                } else {
                    m18032r = new Gson().m18032r(m23003d());
                    result.success(m18032r);
                }
            }
            String str4 = (String) call.argument("name");
            if (str4 == null) {
                str4 = "";
            }
            String str5 = (String) call.argument("emailContent");
            m23001b = m23001b(str4, str5 != null ? str5 : "");
        }
        m18032r = Boolean.valueOf(m23001b);
        result.success(m18032r);
    }
}

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
import dk.r;
import dk.z;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* loaded from: classes2.dex */
public final class c implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* renamed from: c */
    public static final a f16267c = new a(null);

    /* renamed from: a */
    private MethodChannel f16268a;

    /* renamed from: b */
    private Context f16269b;

    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    private final boolean a(String str, String str2) {
        Object G;
        Object G2;
        Context context = this.f16269b;
        if (context == null) {
            n.p("applicationContext");
            context = null;
        }
        PackageManager packageManager = context.getPackageManager();
        b bVar = (b) new Gson().h(str2, b.class);
        String str3 = "mailto:";
        String str4 = "android.intent.action.SENDTO";
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(new Intent("android.intent.action.SENDTO", Uri.parse("mailto:")), 0);
        n.d(queryIntentActivities, "queryIntentActivities(...)");
        if (!(!queryIntentActivities.isEmpty())) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:"));
        String str5 = "text/plain";
        intent.setType("text/plain");
        G = z.G(queryIntentActivities);
        String str6 = ((ResolveInfo) G).activityInfo.packageName;
        G2 = z.G(queryIntentActivities);
        intent.setClassName(str6, ((ResolveInfo) G2).activityInfo.name);
        Object[] array = bVar.e().toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        intent.putExtra("android.intent.extra.EMAIL", (String[]) array);
        Object[] array2 = bVar.c().toArray(new String[0]);
        if (array2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        intent.putExtra("android.intent.extra.CC", (String[]) array2);
        Object[] array3 = bVar.a().toArray(new String[0]);
        if (array3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        intent.putExtra("android.intent.extra.BCC", (String[]) array3);
        intent.putExtra(ActionBroadcastReceiver.KEY_URL_TITLE, bVar.d());
        intent.putExtra("android.intent.extra.TEXT", bVar.b());
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
            Object[] array4 = bVar.e().toArray(new String[0]);
            if (array4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            intent3.putExtra("android.intent.extra.EMAIL", (String[]) array4);
            Object[] array5 = bVar.c().toArray(new String[0]);
            if (array5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            intent3.putExtra("android.intent.extra.CC", (String[]) array5);
            Object[] array6 = bVar.a().toArray(new String[0]);
            if (array6 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            intent3.putExtra("android.intent.extra.BCC", (String[]) array6);
            intent3.putExtra(ActionBroadcastReceiver.KEY_URL_TITLE, bVar.d());
            intent3.putExtra("android.intent.extra.TEXT", bVar.b());
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
        n.d(putExtra, "putExtra(...)");
        putExtra.setFlags(268435456);
        Context context2 = this.f16269b;
        if (context2 == null) {
            n.p("applicationContext");
            context2 = null;
        }
        context2.startActivity(putExtra);
        return true;
    }

    private final boolean b(String str, String str2) {
        Object obj;
        Context context = this.f16269b;
        Context context2 = null;
        if (context == null) {
            n.p("applicationContext");
            context = null;
        }
        PackageManager packageManager = context.getPackageManager();
        b bVar = (b) new Gson().h(str2, b.class);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(new Intent("android.intent.action.SENDTO", Uri.parse("mailto:")), 0);
        n.d(queryIntentActivities, "queryIntentActivities(...)");
        Iterator<T> it = queryIntentActivities.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (n.a(((ResolveInfo) obj).loadLabel(packageManager), str)) {
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
        Object[] array = bVar.e().toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        intent.putExtra("android.intent.extra.EMAIL", (String[]) array);
        Object[] array2 = bVar.c().toArray(new String[0]);
        if (array2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        intent.putExtra("android.intent.extra.CC", (String[]) array2);
        Object[] array3 = bVar.a().toArray(new String[0]);
        if (array3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        intent.putExtra("android.intent.extra.BCC", (String[]) array3);
        intent.putExtra(ActionBroadcastReceiver.KEY_URL_TITLE, bVar.d());
        intent.putExtra("android.intent.extra.TEXT", bVar.b());
        intent.setFlags(268435456);
        Context context3 = this.f16269b;
        if (context3 == null) {
            n.p("applicationContext");
        } else {
            context2 = context3;
        }
        context2.startActivity(intent);
        return true;
    }

    private final boolean c(String str) {
        Object G;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("mailto:"));
        Context context = this.f16269b;
        Context context2 = null;
        if (context == null) {
            n.p("applicationContext");
            context = null;
        }
        PackageManager packageManager = context.getPackageManager();
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        n.d(queryIntentActivities, "queryIntentActivities(...)");
        if (!(!queryIntentActivities.isEmpty())) {
            return false;
        }
        G = z.G(queryIntentActivities);
        Intent createChooser = Intent.createChooser(packageManager.getLaunchIntentForPackage(((ResolveInfo) G).activityInfo.packageName), str);
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
        n.d(putExtra, "putExtra(...)");
        putExtra.setFlags(268435456);
        Context context3 = this.f16269b;
        if (context3 == null) {
            n.p("applicationContext");
        } else {
            context2 = context3;
        }
        context2.startActivity(putExtra);
        return true;
    }

    private final List<gh.a> d() {
        List<gh.a> j10;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("mailto:"));
        Context context = this.f16269b;
        if (context == null) {
            n.p("applicationContext");
            context = null;
        }
        PackageManager packageManager = context.getPackageManager();
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        n.d(queryIntentActivities, "queryIntentActivities(...)");
        if (!(!queryIntentActivities.isEmpty())) {
            j10 = r.j();
            return j10;
        }
        ArrayList arrayList = new ArrayList();
        int size = queryIntentActivities.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new gh.a(queryIntentActivities.get(i10).loadLabel(packageManager).toString()));
        }
        return arrayList;
    }

    private final boolean f(String str) {
        Object obj;
        Intent launchIntentForPackage;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("mailto:"));
        Context context = this.f16269b;
        Context context2 = null;
        if (context == null) {
            n.p("applicationContext");
            context = null;
        }
        PackageManager packageManager = context.getPackageManager();
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        n.d(queryIntentActivities, "queryIntentActivities(...)");
        Iterator<T> it = queryIntentActivities.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (n.a(((ResolveInfo) obj).loadLabel(packageManager), str)) {
                break;
            }
        }
        ResolveInfo resolveInfo = (ResolveInfo) obj;
        if (resolveInfo == null || (launchIntentForPackage = packageManager.getLaunchIntentForPackage(resolveInfo.activityInfo.packageName)) == null) {
            return false;
        }
        launchIntentForPackage.setFlags(268435456);
        Context context3 = this.f16269b;
        if (context3 == null) {
            n.p("applicationContext");
        } else {
            context2 = context3;
        }
        context2.startActivity(launchIntentForPackage);
        return true;
    }

    public final void e(Context context) {
        n.e(context, "context");
        this.f16269b = context;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        n.e(flutterPluginBinding, "flutterPluginBinding");
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getFlutterEngine().getDartExecutor(), "open_mail_app");
        this.f16268a = methodChannel;
        methodChannel.setMethodCallHandler(this);
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        n.d(applicationContext, "getApplicationContext(...)");
        e(applicationContext);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        n.e(binding, "binding");
        MethodChannel methodChannel = this.f16268a;
        if (methodChannel == null) {
            n.p("channel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        Object r10;
        boolean b10;
        n.e(call, "call");
        n.e(result, "result");
        if (n.a(call.method, "openMailApp")) {
            String str = (String) call.argument("nativePickerTitle");
            b10 = c(str != null ? str : "");
        } else if (n.a(call.method, "openSpecificMailApp") && call.hasArgument("name")) {
            Object argument = call.argument("name");
            n.b(argument);
            b10 = f((String) argument);
        } else if (n.a(call.method, "composeNewEmailInMailApp")) {
            String str2 = (String) call.argument("nativePickerTitle");
            if (str2 == null) {
                str2 = "";
            }
            String str3 = (String) call.argument("emailContent");
            b10 = a(str2, str3 != null ? str3 : "");
        } else {
            if (!n.a(call.method, "composeNewEmailInSpecificMailApp")) {
                if (!n.a(call.method, "getMainApps")) {
                    result.notImplemented();
                    return;
                } else {
                    r10 = new Gson().r(d());
                    result.success(r10);
                }
            }
            String str4 = (String) call.argument("name");
            if (str4 == null) {
                str4 = "";
            }
            String str5 = (String) call.argument("emailContent");
            b10 = b(str4, str5 != null ? str5 : "");
        }
        r10 = Boolean.valueOf(b10);
        result.success(r10);
    }
}

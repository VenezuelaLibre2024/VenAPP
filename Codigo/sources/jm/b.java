package jm;

import android.content.Context;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class b implements MethodChannel.MethodCallHandler, FlutterPlugin {

    /* renamed from: c, reason: collision with root package name */
    public static final a f19992c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private Context f19993a;

    /* renamed from: b, reason: collision with root package name */
    private final List<g> f19994b = new ArrayList();

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    private final void b(Context context, BinaryMessenger binaryMessenger) {
        String[] list;
        Context applicationContext = context.getApplicationContext();
        n.d(applicationContext, "getApplicationContext(...)");
        this.f19993a = applicationContext;
        new MethodChannel(binaryMessenger, "pl.ukaszapps/soundpool").setMethodCallHandler(this);
        Context context2 = this.f19993a;
        if (context2 == null) {
            n.p("application");
            context2 = null;
        }
        File cacheDir = context2.getCacheDir();
        if (cacheDir == null || (list = cacheDir.list(new FilenameFilter() { // from class: jm.a
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean c10;
                c10 = b.c(file, str);
                return c10;
            }
        })) == null) {
            return;
        }
        n.b(list);
        for (String str : list) {
            new File(cacheDir, str).delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(File file, String str) {
        n.b(str);
        return new xk.f("sound(.*)pool").a(str);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        n.e(binding, "binding");
        Context applicationContext = binding.getApplicationContext();
        n.d(applicationContext, "getApplicationContext(...)");
        BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        n.d(binaryMessenger, "getBinaryMessenger(...)");
        b(applicationContext, binaryMessenger);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        n.e(binding, "binding");
        Iterator<T> it = this.f19994b.iterator();
        while (it.hasNext()) {
            ((g) it.next()).h();
        }
        this.f19994b.clear();
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        int i10;
        n.e(call, "call");
        n.e(result, "result");
        String str = call.method;
        Context context = null;
        if (!n.a(str, "initSoundpool")) {
            if (!n.a(str, "dispose")) {
                Object obj = call.arguments;
                n.c(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                Object obj2 = ((Map) obj).get("poolId");
                n.c(obj2, "null cannot be cast to non-null type kotlin.Int");
                this.f19994b.get(((Integer) obj2).intValue()).k(call, result);
                return;
            }
            Object obj3 = call.arguments;
            n.c(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Int>");
            Object obj4 = ((Map) obj3).get("poolId");
            n.b(obj4);
            int intValue = ((Number) obj4).intValue();
            this.f19994b.get(intValue).h();
            this.f19994b.remove(intValue);
            result.success(null);
            return;
        }
        Object obj5 = call.arguments;
        n.c(obj5, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Int>");
        Map map = (Map) obj5;
        Integer num = (Integer) map.get("streamType");
        Integer num2 = (Integer) map.get("maxStreams");
        int intValue2 = num2 != null ? num2.intValue() : 1;
        int i11 = (num == null || num.intValue() != 0) ? (num != null && num.intValue() == 1) ? 4 : (num != null && num.intValue() == 2) ? 3 : (num != null && num.intValue() == 3) ? 5 : -1 : 2;
        if (i11 > -1) {
            Context context2 = this.f19993a;
            if (context2 == null) {
                n.p("application");
            } else {
                context = context2;
            }
            g gVar = new g(context, intValue2, i11);
            int size = this.f19994b.size();
            this.f19994b.add(gVar);
            i10 = Integer.valueOf(size);
        } else {
            i10 = -1;
        }
        result.success(i10);
    }
}

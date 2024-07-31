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
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p450xk.C12514f;

/* renamed from: jm.b */
/* loaded from: classes3.dex */
public final class C9086b implements MethodChannel.MethodCallHandler, FlutterPlugin {

    /* renamed from: c */
    public static final a f21771c = new a(null);

    /* renamed from: a */
    private Context f21772a;

    /* renamed from: b */
    private final List<C9091g> f21773b = new ArrayList();

    /* renamed from: jm.b$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    /* renamed from: b */
    private final void m26695b(Context context, BinaryMessenger binaryMessenger) {
        String[] list;
        Context applicationContext = context.getApplicationContext();
        C9322n.m27780d(applicationContext, "getApplicationContext(...)");
        this.f21772a = applicationContext;
        new MethodChannel(binaryMessenger, "pl.ukaszapps/soundpool").setMethodCallHandler(this);
        Context context2 = this.f21772a;
        if (context2 == null) {
            C9322n.m27792p("application");
            context2 = null;
        }
        File cacheDir = context2.getCacheDir();
        if (cacheDir == null || (list = cacheDir.list(new FilenameFilter() { // from class: jm.a
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean m26696c;
                m26696c = C9086b.m26696c(file, str);
                return m26696c;
            }
        })) == null) {
            return;
        }
        C9322n.m27778b(list);
        for (String str : list) {
            new File(cacheDir, str).delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final boolean m26696c(File file, String str) {
        C9322n.m27778b(str);
        return new C12514f("sound(.*)pool").m40969a(str);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        C9322n.m27781e(binding, "binding");
        Context applicationContext = binding.getApplicationContext();
        C9322n.m27780d(applicationContext, "getApplicationContext(...)");
        BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        C9322n.m27780d(binaryMessenger, "getBinaryMessenger(...)");
        m26695b(applicationContext, binaryMessenger);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        C9322n.m27781e(binding, "binding");
        Iterator<T> it = this.f21773b.iterator();
        while (it.hasNext()) {
            ((C9091g) it.next()).m26709h();
        }
        this.f21773b.clear();
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        int i10;
        C9322n.m27781e(call, "call");
        C9322n.m27781e(result, "result");
        String str = call.method;
        Context context = null;
        if (!C9322n.m27777a(str, "initSoundpool")) {
            if (!C9322n.m27777a(str, "dispose")) {
                Object obj = call.arguments;
                C9322n.m27779c(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                Object obj2 = ((Map) obj).get("poolId");
                C9322n.m27779c(obj2, "null cannot be cast to non-null type kotlin.Int");
                this.f21773b.get(((Integer) obj2).intValue()).m26710k(call, result);
                return;
            }
            Object obj3 = call.arguments;
            C9322n.m27779c(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Int>");
            Object obj4 = ((Map) obj3).get("poolId");
            C9322n.m27778b(obj4);
            int intValue = ((Number) obj4).intValue();
            this.f21773b.get(intValue).m26709h();
            this.f21773b.remove(intValue);
            result.success(null);
            return;
        }
        Object obj5 = call.arguments;
        C9322n.m27779c(obj5, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Int>");
        Map map = (Map) obj5;
        Integer num = (Integer) map.get("streamType");
        Integer num2 = (Integer) map.get("maxStreams");
        int intValue2 = num2 != null ? num2.intValue() : 1;
        int i11 = (num == null || num.intValue() != 0) ? (num != null && num.intValue() == 1) ? 4 : (num != null && num.intValue() == 2) ? 3 : (num != null && num.intValue() == 3) ? 5 : -1 : 2;
        if (i11 > -1) {
            Context context2 = this.f21772a;
            if (context2 == null) {
                C9322n.m27792p("application");
            } else {
                context = context2;
            }
            C9091g c9091g = new C9091g(context, intValue2, i11);
            int size = this.f21773b.size();
            this.f21773b.add(c9091g);
            i10 = Integer.valueOf(size);
        } else {
            i10 = -1;
        }
        result.success(i10);
    }
}

package p054d3;

import android.content.Context;
import androidx.core.content.C0854a;
import androidx.work.C1522b;
import com.bluechilli.flutteruploader.UploadWorker;
import com.google.gson.Gson;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import p074e3.InterfaceC7120b;
import p094f2.AbstractC7287t;
import p094f2.AbstractC7288u;
import p094f2.C7269b;
import p094f2.C7279l;
import p094f2.EnumC7268a;
import p094f2.EnumC7278k;

/* renamed from: d3.p */
/* loaded from: classes.dex */
public class C6835p implements MethodChannel.MethodCallHandler {

    /* renamed from: f */
    private static final List<String> f15098f = Arrays.asList("POST", "PUT", "PATCH");

    /* renamed from: a */
    private final Context f15099a;

    /* renamed from: b */
    private final int f15100b;

    /* renamed from: c */
    private final InterfaceC7120b f15101c;

    /* renamed from: d */
    private final Executor f15102d = Executors.newSingleThreadExecutor();

    /* renamed from: e */
    private final Executor f15103e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6835p(Context context, int i10, InterfaceC7120b interfaceC7120b) {
        this.f15103e = C0854a.getMainExecutor(context);
        this.f15099a = context;
        this.f15100b = i10;
        this.f15101c = interfaceC7120b;
    }

    /* renamed from: k */
    private AbstractC7288u m19733k(C6839t c6839t) {
        Gson gson = new Gson();
        C1522b.a m8545h = new C1522b.a().m8545h("url", c6839t.m19760g()).m8545h(Constants.METHOD, c6839t.m19756c()).m8543f("requestTimeout", c6839t.m19759f()).m8542e("binaryUpload", c6839t.m19762i()).m8545h("tag", c6839t.m19758e());
        m8545h.m8545h("files", gson.m18032r(c6839t.m19754a()));
        if (c6839t.m19755b() != null) {
            m8545h.m8545h("headers", gson.m18032r(c6839t.m19755b()));
        }
        if (c6839t.m19757d() != null) {
            m8545h.m8545h("data", gson.m18032r(c6839t.m19757d()));
        }
        return new C7279l.a(UploadWorker.class).m21809j(new C7269b.a().m21751b(c6839t.m19761h() ? EnumC7278k.CONNECTED : EnumC7278k.UNMETERED).m21750a()).m21802a("flutter_upload_task").m21808i(EnumC7268a.EXPONENTIAL, 5L, TimeUnit.SECONDS).m21811l(m8545h.m8538a()).m21803b();
    }

    /* renamed from: l */
    private void m19734l(MethodCall methodCall, final MethodChannel.Result result) {
        AbstractC7287t.m21795e(this.f15099a).mo8681b(UUID.fromString((String) methodCall.argument("taskId"))).getResult().addListener(new Runnable() { // from class: d3.i
            @Override // java.lang.Runnable
            public final void run() {
                C6835p.this.m19740r(result);
            }
        }, this.f15102d);
    }

    /* renamed from: m */
    private void m19735m(MethodCall methodCall, final MethodChannel.Result result) {
        AbstractC7287t.m21795e(this.f15099a).mo8680a("flutter_upload_task").getResult().addListener(new Runnable() { // from class: d3.f
            @Override // java.lang.Runnable
            public final void run() {
                C6835p.this.m19742t(result);
            }
        }, this.f15102d);
    }

    /* renamed from: n */
    private void m19736n(MethodCall methodCall, final MethodChannel.Result result) {
        AbstractC7287t.m21795e(this.f15099a).mo8684h().getResult().addListener(new Runnable() { // from class: d3.j
            @Override // java.lang.Runnable
            public final void run() {
                C6835p.this.m19744v(result);
            }
        }, this.f15102d);
    }

    /* renamed from: o */
    private void m19737o(MethodCall methodCall, final MethodChannel.Result result) {
        String str = (String) methodCall.argument("url");
        String str2 = (String) methodCall.argument(Constants.METHOD);
        List list = (List) methodCall.argument("files");
        Map map = (Map) methodCall.argument("data");
        Map map2 = (Map) methodCall.argument("headers");
        String str3 = (String) methodCall.argument("tag");
        Boolean bool = (Boolean) methodCall.argument("allowCellular");
        if (bool == null) {
            result.error("invalid_flag", "allowCellular must be set", null);
            return;
        }
        if (str2 == null) {
            str2 = "POST";
        }
        if (list == null || list.isEmpty()) {
            result.error("invalid_call", "Invalid call parameters passed", null);
            return;
        }
        if (!f15098f.contains(str2.toUpperCase())) {
            result.error("invalid_method", "Method must be either POST | PUT | PATCH", null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C6822c.m19711a((Map) it.next()));
        }
        final AbstractC7288u m19733k = m19733k(new C6839t(str, str2, arrayList, map2, map, this.f15100b, false, str3, bool.booleanValue()));
        AbstractC7287t.m21795e(this.f15099a).m21797c(m19733k).getResult().addListener(new Runnable() { // from class: d3.g
            @Override // java.lang.Runnable
            public final void run() {
                C6835p.this.m19746x(m19733k, result);
            }
        }, this.f15102d);
    }

    /* renamed from: p */
    private void m19738p(MethodCall methodCall, final MethodChannel.Result result) {
        String str = (String) methodCall.argument("url");
        String str2 = (String) methodCall.argument(Constants.METHOD);
        String str3 = (String) methodCall.argument("path");
        Map map = (Map) methodCall.argument("headers");
        String str4 = (String) methodCall.argument("tag");
        Boolean bool = (Boolean) methodCall.argument("allowCellular");
        if (bool == null) {
            result.error("invalid_flag", "allowCellular must be set", null);
            return;
        }
        if (str2 == null) {
            str2 = "POST";
        }
        if (str3 == null) {
            result.error("invalid_call", "Invalid call parameters passed", null);
        } else {
            if (!f15098f.contains(str2.toUpperCase())) {
                result.error("invalid_method", "Method must be either POST | PUT | PATCH", null);
                return;
            }
            final AbstractC7288u m19733k = m19733k(new C6839t(str, str2, Collections.singletonList(new C6822c(str3)), map, Collections.emptyMap(), this.f15100b, true, str4, bool.booleanValue()));
            AbstractC7287t.m21795e(this.f15099a).m21797c(m19733k).getResult().addListener(new Runnable() { // from class: d3.h
                @Override // java.lang.Runnable
                public final void run() {
                    C6835p.this.m19748z(m19733k, result);
                }
            }, this.f15102d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m19740r(final MethodChannel.Result result) {
        this.f15103e.execute(new Runnable() { // from class: d3.m
            @Override // java.lang.Runnable
            public final void run() {
                MethodChannel.Result.this.success(null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m19742t(final MethodChannel.Result result) {
        this.f15103e.execute(new Runnable() { // from class: d3.n
            @Override // java.lang.Runnable
            public final void run() {
                MethodChannel.Result.this.success(null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void m19744v(final MethodChannel.Result result) {
        this.f15101c.mo19718a();
        this.f15103e.execute(new Runnable() { // from class: d3.k
            @Override // java.lang.Runnable
            public final void run() {
                MethodChannel.Result.this.success(null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m19745w(MethodChannel.Result result, String str) {
        result.success(str);
        this.f15101c.mo19722e(str, C6838s.f15105a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void m19746x(AbstractC7288u abstractC7288u, final MethodChannel.Result result) {
        final String uuid = abstractC7288u.m21798a().toString();
        this.f15103e.execute(new Runnable() { // from class: d3.l
            @Override // java.lang.Runnable
            public final void run() {
                C6835p.this.m19745w(result, uuid);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void m19747y(MethodChannel.Result result, String str) {
        result.success(str);
        this.f15101c.mo19722e(str, C6838s.f15105a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m19748z(AbstractC7288u abstractC7288u, final MethodChannel.Result result) {
        final String uuid = abstractC7288u.m21798a().toString();
        this.f15103e.execute(new Runnable() { // from class: d3.o
            @Override // java.lang.Runnable
            public final void run() {
                C6835p.this.m19747y(result, uuid);
            }
        });
    }

    /* renamed from: A */
    void m19749A(MethodCall methodCall, MethodChannel.Result result) {
        Number number = (Number) methodCall.argument("callbackHandle");
        if (number != null) {
            C6836q.m19752c(this.f15099a, Long.valueOf(number.longValue()));
        }
        result.success(null);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1594257912:
                if (str.equals("enqueue")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1367724422:
                if (str.equals("cancel")) {
                    c10 = 1;
                    break;
                }
                break;
            case -250457211:
                if (str.equals("clearUploads")) {
                    c10 = 2;
                    break;
                }
                break;
            case 350478377:
                if (str.equals("enqueueBinary")) {
                    c10 = 3;
                    break;
                }
                break;
            case 476547271:
                if (str.equals("cancelAll")) {
                    c10 = 4;
                    break;
                }
                break;
            case 504536570:
                if (str.equals("setBackgroundHandler")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                m19737o(methodCall, result);
                return;
            case 1:
                m19734l(methodCall, result);
                return;
            case 2:
                m19736n(methodCall, result);
                return;
            case 3:
                m19738p(methodCall, result);
                return;
            case 4:
                m19735m(methodCall, result);
                return;
            case 5:
                m19749A(methodCall, result);
                return;
            default:
                result.notImplemented();
                return;
        }
    }
}

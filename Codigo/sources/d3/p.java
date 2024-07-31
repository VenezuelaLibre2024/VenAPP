package d3;

import android.content.Context;
import androidx.work.b;
import com.bluechilli.flutteruploader.UploadWorker;
import com.google.gson.Gson;
import f2.b;
import f2.l;
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

/* loaded from: classes.dex */
public class p implements MethodChannel.MethodCallHandler {

    /* renamed from: f, reason: collision with root package name */
    private static final List<String> f13744f = Arrays.asList("POST", "PUT", "PATCH");

    /* renamed from: a, reason: collision with root package name */
    private final Context f13745a;

    /* renamed from: b, reason: collision with root package name */
    private final int f13746b;

    /* renamed from: c, reason: collision with root package name */
    private final e3.b f13747c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f13748d = Executors.newSingleThreadExecutor();

    /* renamed from: e, reason: collision with root package name */
    private final Executor f13749e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(Context context, int i10, e3.b bVar) {
        this.f13749e = androidx.core.content.a.getMainExecutor(context);
        this.f13745a = context;
        this.f13746b = i10;
        this.f13747c = bVar;
    }

    private f2.u k(t tVar) {
        Gson gson = new Gson();
        b.a h10 = new b.a().h("url", tVar.g()).h(Constants.METHOD, tVar.c()).f("requestTimeout", tVar.f()).e("binaryUpload", tVar.i()).h("tag", tVar.e());
        h10.h("files", gson.r(tVar.a()));
        if (tVar.b() != null) {
            h10.h("headers", gson.r(tVar.b()));
        }
        if (tVar.d() != null) {
            h10.h("data", gson.r(tVar.d()));
        }
        return new l.a(UploadWorker.class).j(new b.a().b(tVar.h() ? f2.k.CONNECTED : f2.k.UNMETERED).a()).a("flutter_upload_task").i(f2.a.EXPONENTIAL, 5L, TimeUnit.SECONDS).l(h10.a()).b();
    }

    private void l(MethodCall methodCall, final MethodChannel.Result result) {
        f2.t.e(this.f13745a).b(UUID.fromString((String) methodCall.argument("taskId"))).getResult().addListener(new Runnable() { // from class: d3.i
            @Override // java.lang.Runnable
            public final void run() {
                p.this.r(result);
            }
        }, this.f13748d);
    }

    private void m(MethodCall methodCall, final MethodChannel.Result result) {
        f2.t.e(this.f13745a).a("flutter_upload_task").getResult().addListener(new Runnable() { // from class: d3.f
            @Override // java.lang.Runnable
            public final void run() {
                p.this.t(result);
            }
        }, this.f13748d);
    }

    private void n(MethodCall methodCall, final MethodChannel.Result result) {
        f2.t.e(this.f13745a).h().getResult().addListener(new Runnable() { // from class: d3.j
            @Override // java.lang.Runnable
            public final void run() {
                p.this.v(result);
            }
        }, this.f13748d);
    }

    private void o(MethodCall methodCall, final MethodChannel.Result result) {
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
        if (!f13744f.contains(str2.toUpperCase())) {
            result.error("invalid_method", "Method must be either POST | PUT | PATCH", null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(c.a((Map) it.next()));
        }
        final f2.u k10 = k(new t(str, str2, arrayList, map2, map, this.f13746b, false, str3, bool.booleanValue()));
        f2.t.e(this.f13745a).c(k10).getResult().addListener(new Runnable() { // from class: d3.g
            @Override // java.lang.Runnable
            public final void run() {
                p.this.x(k10, result);
            }
        }, this.f13748d);
    }

    private void p(MethodCall methodCall, final MethodChannel.Result result) {
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
            if (!f13744f.contains(str2.toUpperCase())) {
                result.error("invalid_method", "Method must be either POST | PUT | PATCH", null);
                return;
            }
            final f2.u k10 = k(new t(str, str2, Collections.singletonList(new c(str3)), map, Collections.emptyMap(), this.f13746b, true, str4, bool.booleanValue()));
            f2.t.e(this.f13745a).c(k10).getResult().addListener(new Runnable() { // from class: d3.h
                @Override // java.lang.Runnable
                public final void run() {
                    p.this.z(k10, result);
                }
            }, this.f13748d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(final MethodChannel.Result result) {
        this.f13749e.execute(new Runnable() { // from class: d3.m
            @Override // java.lang.Runnable
            public final void run() {
                MethodChannel.Result.this.success(null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(final MethodChannel.Result result) {
        this.f13749e.execute(new Runnable() { // from class: d3.n
            @Override // java.lang.Runnable
            public final void run() {
                MethodChannel.Result.this.success(null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(final MethodChannel.Result result) {
        this.f13747c.a();
        this.f13749e.execute(new Runnable() { // from class: d3.k
            @Override // java.lang.Runnable
            public final void run() {
                MethodChannel.Result.this.success(null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(MethodChannel.Result result, String str) {
        result.success(str);
        this.f13747c.e(str, s.f13751a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(f2.u uVar, final MethodChannel.Result result) {
        final String uuid = uVar.a().toString();
        this.f13749e.execute(new Runnable() { // from class: d3.l
            @Override // java.lang.Runnable
            public final void run() {
                p.this.w(result, uuid);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(MethodChannel.Result result, String str) {
        result.success(str);
        this.f13747c.e(str, s.f13751a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(f2.u uVar, final MethodChannel.Result result) {
        final String uuid = uVar.a().toString();
        this.f13749e.execute(new Runnable() { // from class: d3.o
            @Override // java.lang.Runnable
            public final void run() {
                p.this.y(result, uuid);
            }
        });
    }

    void A(MethodCall methodCall, MethodChannel.Result result) {
        Number number = (Number) methodCall.argument("callbackHandle");
        if (number != null) {
            q.c(this.f13745a, Long.valueOf(number.longValue()));
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
                o(methodCall, result);
                return;
            case 1:
                l(methodCall, result);
                return;
            case 2:
                n(methodCall, result);
                return;
            case 3:
                p(methodCall, result);
                return;
            case 4:
                m(methodCall, result);
                return;
            case 5:
                A(methodCall, result);
                return;
            default:
                result.notImplemented();
                return;
        }
    }
}

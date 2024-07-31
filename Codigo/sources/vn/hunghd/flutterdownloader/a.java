package vn.hunghd.flutterdownloader;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import androidx.core.app.t0;
import androidx.work.b;
import ck.v;
import f2.b;
import f2.k;
import f2.l;
import f2.t;
import f2.u;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import lm.i;
import xk.q;

/* loaded from: classes3.dex */
public final class a implements MethodChannel.MethodCallHandler, FlutterPlugin {

    /* renamed from: t */
    public static final C0472a f29420t = new C0472a(null);

    /* renamed from: a */
    private MethodChannel f29421a;

    /* renamed from: b */
    private i f29422b;

    /* renamed from: c */
    private Context f29423c;

    /* renamed from: d */
    private long f29424d;

    /* renamed from: e */
    private int f29425e;

    /* renamed from: f */
    private int f29426f;

    /* renamed from: r */
    private int f29427r;

    /* renamed from: s */
    private final Object f29428s = new Object();

    /* renamed from: vn.hunghd.flutterdownloader.a$a */
    /* loaded from: classes3.dex */
    public static final class C0472a {
        private C0472a() {
        }

        public /* synthetic */ C0472a(g gVar) {
            this();
        }
    }

    private final u a(String str, String str2, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i10, boolean z15) {
        l b10 = new l.a(DownloadWorker.class).j(new b.a().c(z13).b(z15 ? k.CONNECTED : k.UNMETERED).a()).a("flutter_download_task").i(f2.a.EXPONENTIAL, 10L, TimeUnit.SECONDS).l(new b.a().h("url", str).h("saved_file", str2).h("file_name", str3).h("headers", str4).e("show_notification", z10).e("open_file_from_notification", z11).e("is_resume", z12).g("callback_handle", this.f29424d).f("step", this.f29425e).e("debug", this.f29426f == 1).e("ignoreSsl", this.f29427r == 1).e("save_in_public_storage", z14).f("timeout", i10).a()).b();
        n.d(b10, "build(...)");
        return b10;
    }

    private final void b(MethodCall methodCall, MethodChannel.Result result) {
        t.e(o()).b(UUID.fromString((String) n(methodCall, "task_id")));
        result.success(null);
    }

    private final void c(MethodChannel.Result result) {
        t.e(o()).a("flutter_download_task");
        result.success(null);
    }

    private final void d(File file) {
        String[] strArr = {"_id"};
        String absolutePath = file.getAbsolutePath();
        n.d(absolutePath, "getAbsolutePath(...)");
        String[] strArr2 = {absolutePath};
        Uri EXTERNAL_CONTENT_URI = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        n.d(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
        ContentResolver contentResolver = o().getContentResolver();
        n.d(contentResolver, "getContentResolver(...)");
        Cursor query = contentResolver.query(EXTERNAL_CONTENT_URI, strArr, "_data = ?", strArr2, null);
        if (query == null || !query.moveToFirst()) {
            Cursor query2 = contentResolver.query(EXTERNAL_CONTENT_URI, strArr, "_data = ?", strArr2, null);
            if (query2 != null && query2.moveToFirst()) {
                Uri withAppendedId = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, query2.getLong(query2.getColumnIndexOrThrow("_id")));
                n.d(withAppendedId, "withAppendedId(...)");
                contentResolver.delete(withAppendedId, null, null);
            }
            if (query2 != null) {
                query2.close();
            }
        } else {
            Uri withAppendedId2 = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, query.getLong(query.getColumnIndexOrThrow("_id")));
            n.d(withAppendedId2, "withAppendedId(...)");
            contentResolver.delete(withAppendedId2, null, null);
        }
        if (query != null) {
            query.close();
        }
    }

    private final void e(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) n(methodCall, "url");
        String str2 = (String) n(methodCall, "saved_dir");
        String str3 = (String) methodCall.argument("file_name");
        String str4 = (String) n(methodCall, "headers");
        int intValue = ((Number) n(methodCall, "timeout")).intValue();
        boolean booleanValue = ((Boolean) n(methodCall, "show_notification")).booleanValue();
        boolean booleanValue2 = ((Boolean) n(methodCall, "open_file_from_notification")).booleanValue();
        boolean booleanValue3 = ((Boolean) n(methodCall, "requires_storage_not_low")).booleanValue();
        boolean booleanValue4 = ((Boolean) n(methodCall, "save_in_public_storage")).booleanValue();
        boolean booleanValue5 = ((Boolean) n(methodCall, "allow_cellular")).booleanValue();
        u a10 = a(str, str2, str3, str4, booleanValue, booleanValue2, false, booleanValue3, booleanValue4, intValue, booleanValue5);
        t.e(o()).c(a10);
        String uuid = a10.a().toString();
        n.d(uuid, "toString(...)");
        result.success(uuid);
        lm.a aVar = lm.a.ENQUEUED;
        r(uuid, aVar, 0);
        i iVar = this.f29422b;
        n.b(iVar);
        iVar.b(uuid, str, aVar, 0, str3, str2, str4, booleanValue, booleanValue2, booleanValue4, booleanValue5);
    }

    private final void f(MethodCall methodCall, MethodChannel.Result result) {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putLong;
        Object obj = methodCall.arguments;
        n.c(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
        List list = (List) obj;
        long parseLong = Long.parseLong(String.valueOf(list.get(0)));
        this.f29426f = Integer.parseInt(String.valueOf(list.get(1)));
        this.f29427r = Integer.parseInt(String.valueOf(list.get(2)));
        Context context = this.f29423c;
        SharedPreferences sharedPreferences = context != null ? context.getSharedPreferences("vn.hunghd.downloader.pref", 0) : null;
        if (sharedPreferences != null && (edit = sharedPreferences.edit()) != null && (putLong = edit.putLong("callback_dispatcher_handle_key", parseLong)) != null) {
            putLong.apply();
        }
        result.success(null);
    }

    private final void g(MethodChannel.Result result) {
        i iVar = this.f29422b;
        n.b(iVar);
        List<lm.b> c10 = iVar.c();
        ArrayList arrayList = new ArrayList();
        for (lm.b bVar : c10) {
            HashMap hashMap = new HashMap();
            hashMap.put("task_id", bVar.m());
            hashMap.put("status", Integer.valueOf(bVar.l().ordinal()));
            hashMap.put("progress", Integer.valueOf(bVar.g()));
            hashMap.put("url", bVar.o());
            hashMap.put("file_name", bVar.b());
            hashMap.put("saved_dir", bVar.j());
            hashMap.put("time_created", Long.valueOf(bVar.n()));
            hashMap.put("allow_cellular", Boolean.valueOf(bVar.a()));
            arrayList.add(hashMap);
        }
        result.success(arrayList);
    }

    private final void h(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) n(methodCall, "query");
        i iVar = this.f29422b;
        n.b(iVar);
        List<lm.b> e10 = iVar.e(str);
        ArrayList arrayList = new ArrayList();
        for (lm.b bVar : e10) {
            HashMap hashMap = new HashMap();
            hashMap.put("task_id", bVar.m());
            hashMap.put("status", Integer.valueOf(bVar.l().ordinal()));
            hashMap.put("progress", Integer.valueOf(bVar.g()));
            hashMap.put("url", bVar.o());
            hashMap.put("file_name", bVar.b());
            hashMap.put("saved_dir", bVar.j());
            hashMap.put("time_created", Long.valueOf(bVar.n()));
            hashMap.put("allow_cellular", Boolean.valueOf(bVar.a()));
            arrayList.add(hashMap);
        }
        result.success(arrayList);
    }

    private final void i(Context context, BinaryMessenger binaryMessenger) {
        synchronized (this.f29428s) {
            if (this.f29421a != null) {
                return;
            }
            this.f29423c = context;
            MethodChannel methodChannel = new MethodChannel(binaryMessenger, "vn.hunghd/downloader");
            this.f29421a = methodChannel;
            methodChannel.setMethodCallHandler(this);
            this.f29422b = new i(b.f29429a.a(this.f29423c));
            v vVar = v.f7137a;
        }
    }

    private final void j(MethodCall methodCall, MethodChannel.Result result) {
        Boolean bool;
        int Z;
        String str = (String) n(methodCall, "task_id");
        i iVar = this.f29422b;
        n.b(iVar);
        lm.b d10 = iVar.d(str);
        if (d10 == null) {
            result.error("invalid_task_id", "not found task with id " + str, null);
            return;
        }
        if (d10.l() != lm.a.COMPLETE) {
            result.error("invalid_status", "only completed tasks can be opened", null);
            return;
        }
        String o10 = d10.o();
        String j10 = d10.j();
        String b10 = d10.b();
        if (b10 == null) {
            Z = q.Z(o10, "/", 0, false, 6, null);
            b10 = o10.substring(Z + 1, o10.length());
            n.d(b10, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        Intent c10 = lm.g.f21300a.c(o(), j10 + File.separator + b10, d10.d());
        if (c10 != null) {
            o().startActivity(c10);
            bool = Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        result.success(bool);
    }

    private final void k(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) n(methodCall, "task_id");
        i iVar = this.f29422b;
        n.b(iVar);
        iVar.j(str, true);
        t.e(o()).b(UUID.fromString(str));
        result.success(null);
    }

    private final void l(MethodCall methodCall, MethodChannel.Result result) {
        Object obj = methodCall.arguments;
        n.c(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
        List list = (List) obj;
        this.f29424d = Long.parseLong(String.valueOf(list.get(0)));
        this.f29425e = Integer.parseInt(String.valueOf(list.get(1)));
        result.success(null);
    }

    private final void m(MethodCall methodCall, MethodChannel.Result result) {
        int Z;
        String str = (String) n(methodCall, "task_id");
        boolean booleanValue = ((Boolean) n(methodCall, "should_delete_content")).booleanValue();
        i iVar = this.f29422b;
        n.b(iVar);
        lm.b d10 = iVar.d(str);
        if (d10 == null) {
            result.error("invalid_task_id", "not found task corresponding to given task id", null);
            return;
        }
        if (d10.l() == lm.a.ENQUEUED || d10.l() == lm.a.RUNNING) {
            t.e(o()).b(UUID.fromString(str));
        }
        if (booleanValue) {
            String b10 = d10.b();
            if (b10 == null) {
                String o10 = d10.o();
                Z = q.Z(d10.o(), "/", 0, false, 6, null);
                b10 = o10.substring(Z + 1, d10.o().length());
                n.d(b10, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            File file = new File(d10.j() + File.separator + b10);
            if (file.exists()) {
                try {
                    d(file);
                } catch (SecurityException unused) {
                    Log.d("FlutterDownloader", "Failed to delete file in media store, will fall back to normal delete()");
                }
                file.delete();
            }
        }
        i iVar2 = this.f29422b;
        n.b(iVar2);
        iVar2.a(str);
        t0.f(o()).b(d10.f());
        result.success(null);
    }

    private final <T> T n(MethodCall methodCall, String str) {
        T t10 = (T) methodCall.argument(str);
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException(("Required key '" + str + "' was null").toString());
    }

    private final Context o() {
        Context context = this.f29423c;
        if (context != null) {
            return context;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    private final void p(MethodCall methodCall, MethodChannel.Result result) {
        String str;
        String str2;
        int Z;
        String str3 = (String) n(methodCall, "task_id");
        i iVar = this.f29422b;
        n.b(iVar);
        lm.b d10 = iVar.d(str3);
        boolean booleanValue = ((Boolean) n(methodCall, "requires_storage_not_low")).booleanValue();
        int intValue = ((Number) n(methodCall, "timeout")).intValue();
        if (d10 == null) {
            str = "invalid_task_id";
            str2 = "not found task corresponding to given task id";
        } else if (d10.l() == lm.a.PAUSED) {
            String b10 = d10.b();
            if (b10 == null) {
                String o10 = d10.o();
                Z = q.Z(d10.o(), "/", 0, false, 6, null);
                b10 = o10.substring(Z + 1, d10.o().length());
                n.d(b10, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            if (new File(d10.j() + File.separator + b10).exists()) {
                u a10 = a(d10.o(), d10.j(), d10.b(), d10.c(), d10.k(), d10.e(), true, booleanValue, d10.i(), intValue, d10.a());
                String uuid = a10.a().toString();
                n.d(uuid, "toString(...)");
                result.success(uuid);
                lm.a aVar = lm.a.RUNNING;
                r(uuid, aVar, d10.g());
                i iVar2 = this.f29422b;
                n.b(iVar2);
                iVar2.h(str3, uuid, aVar, d10.g(), false);
                t.e(o()).c(a10);
                return;
            }
            i iVar3 = this.f29422b;
            n.b(iVar3);
            iVar3.j(str3, false);
            str = "invalid_data";
            str2 = "not found partial downloaded data, this task cannot be resumed";
        } else {
            str = "invalid_status";
            str2 = "only paused task can be resumed";
        }
        result.error(str, str2, null);
    }

    private final void q(MethodCall methodCall, MethodChannel.Result result) {
        String str;
        String str2;
        String str3 = (String) n(methodCall, "task_id");
        i iVar = this.f29422b;
        n.b(iVar);
        lm.b d10 = iVar.d(str3);
        boolean booleanValue = ((Boolean) n(methodCall, "requires_storage_not_low")).booleanValue();
        int intValue = ((Number) n(methodCall, "timeout")).intValue();
        if (d10 == null) {
            str = "invalid_task_id";
            str2 = "not found task corresponding to given task id";
        } else {
            if (d10.l() == lm.a.FAILED || d10.l() == lm.a.CANCELED) {
                u a10 = a(d10.o(), d10.j(), d10.b(), d10.c(), d10.k(), d10.e(), false, booleanValue, d10.i(), intValue, d10.a());
                String uuid = a10.a().toString();
                n.d(uuid, "toString(...)");
                result.success(uuid);
                lm.a aVar = lm.a.ENQUEUED;
                r(uuid, aVar, d10.g());
                i iVar2 = this.f29422b;
                n.b(iVar2);
                iVar2.h(str3, uuid, aVar, d10.g(), false);
                t.e(o()).c(a10);
                return;
            }
            str = "invalid_status";
            str2 = "only failed and canceled task can be retried";
        }
        result.error(str, str2, null);
    }

    private final void r(String str, lm.a aVar, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("task_id", str);
        hashMap.put("status", Integer.valueOf(aVar.ordinal()));
        hashMap.put("progress", Integer.valueOf(i10));
        MethodChannel methodChannel = this.f29421a;
        if (methodChannel != null) {
            methodChannel.invokeMethod("updateProgress", hashMap);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        n.e(binding, "binding");
        Context applicationContext = binding.getApplicationContext();
        BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        n.d(binaryMessenger, "getBinaryMessenger(...)");
        i(applicationContext, binaryMessenger);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        n.e(binding, "binding");
        this.f29423c = null;
        MethodChannel methodChannel = this.f29421a;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this.f29421a = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0012. Please report as an issue. */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        n.e(call, "call");
        n.e(result, "result");
        String str = call.method;
        if (str != null) {
            switch (str.hashCode()) {
                case -1594257912:
                    if (str.equals("enqueue")) {
                        e(call, result);
                        return;
                    }
                    break;
                case -1367724422:
                    if (str.equals("cancel")) {
                        b(call, result);
                        return;
                    }
                    break;
                case -934610812:
                    if (str.equals("remove")) {
                        m(call, result);
                        return;
                    }
                    break;
                case -934426579:
                    if (str.equals("resume")) {
                        p(call, result);
                        return;
                    }
                    break;
                case -403218424:
                    if (str.equals("registerCallback")) {
                        l(call, result);
                        return;
                    }
                    break;
                case 3417674:
                    if (str.equals("open")) {
                        j(call, result);
                        return;
                    }
                    break;
                case 106440182:
                    if (str.equals("pause")) {
                        k(call, result);
                        return;
                    }
                    break;
                case 108405416:
                    if (str.equals("retry")) {
                        q(call, result);
                        return;
                    }
                    break;
                case 230377166:
                    if (str.equals("loadTasksWithRawQuery")) {
                        h(call, result);
                        return;
                    }
                    break;
                case 476547271:
                    if (str.equals("cancelAll")) {
                        c(result);
                        return;
                    }
                    break;
                case 871091088:
                    if (str.equals("initialize")) {
                        f(call, result);
                        return;
                    }
                    break;
                case 1378870856:
                    if (str.equals("loadTasks")) {
                        g(result);
                        return;
                    }
                    break;
            }
        }
        result.notImplemented();
    }
}

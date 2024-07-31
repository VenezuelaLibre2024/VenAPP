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
import androidx.core.app.C0834t0;
import androidx.work.C1522b;
import ck.C2037v;
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
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p094f2.AbstractC7287t;
import p094f2.AbstractC7288u;
import p094f2.C7269b;
import p094f2.C7279l;
import p094f2.EnumC7268a;
import p094f2.EnumC7278k;
import p226lm.C9523b;
import p226lm.C9528g;
import p226lm.C9530i;
import p226lm.EnumC9522a;
import p450xk.C12525q;

/* renamed from: vn.hunghd.flutterdownloader.a */
/* loaded from: classes3.dex */
public final class C11987a implements MethodChannel.MethodCallHandler, FlutterPlugin {

    /* renamed from: t */
    public static final a f31875t = new a(null);

    /* renamed from: a */
    private MethodChannel f31876a;

    /* renamed from: b */
    private C9530i f31877b;

    /* renamed from: c */
    private Context f31878c;

    /* renamed from: d */
    private long f31879d;

    /* renamed from: e */
    private int f31880e;

    /* renamed from: f */
    private int f31881f;

    /* renamed from: r */
    private int f31882r;

    /* renamed from: s */
    private final Object f31883s = new Object();

    /* renamed from: vn.hunghd.flutterdownloader.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    /* renamed from: a */
    private final AbstractC7288u m38549a(String str, String str2, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i10, boolean z15) {
        C7279l m21803b = new C7279l.a(DownloadWorker.class).m21809j(new C7269b.a().m21752c(z13).m21751b(z15 ? EnumC7278k.CONNECTED : EnumC7278k.UNMETERED).m21750a()).m21802a("flutter_download_task").m21808i(EnumC7268a.EXPONENTIAL, 10L, TimeUnit.SECONDS).m21811l(new C1522b.a().m8545h("url", str).m8545h("saved_file", str2).m8545h("file_name", str3).m8545h("headers", str4).m8542e("show_notification", z10).m8542e("open_file_from_notification", z11).m8542e("is_resume", z12).m8544g("callback_handle", this.f31879d).m8543f("step", this.f31880e).m8542e("debug", this.f31881f == 1).m8542e("ignoreSsl", this.f31882r == 1).m8542e("save_in_public_storage", z14).m8543f("timeout", i10).m8538a()).m21803b();
        C9322n.m27780d(m21803b, "build(...)");
        return m21803b;
    }

    /* renamed from: b */
    private final void m38550b(MethodCall methodCall, MethodChannel.Result result) {
        AbstractC7287t.m21795e(m38563o()).mo8681b(UUID.fromString((String) m38562n(methodCall, "task_id")));
        result.success(null);
    }

    /* renamed from: c */
    private final void m38551c(MethodChannel.Result result) {
        AbstractC7287t.m21795e(m38563o()).mo8680a("flutter_download_task");
        result.success(null);
    }

    /* renamed from: d */
    private final void m38552d(File file) {
        String[] strArr = {"_id"};
        String absolutePath = file.getAbsolutePath();
        C9322n.m27780d(absolutePath, "getAbsolutePath(...)");
        String[] strArr2 = {absolutePath};
        Uri EXTERNAL_CONTENT_URI = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        C9322n.m27780d(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
        ContentResolver contentResolver = m38563o().getContentResolver();
        C9322n.m27780d(contentResolver, "getContentResolver(...)");
        Cursor query = contentResolver.query(EXTERNAL_CONTENT_URI, strArr, "_data = ?", strArr2, null);
        if (query == null || !query.moveToFirst()) {
            Cursor query2 = contentResolver.query(EXTERNAL_CONTENT_URI, strArr, "_data = ?", strArr2, null);
            if (query2 != null && query2.moveToFirst()) {
                Uri withAppendedId = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, query2.getLong(query2.getColumnIndexOrThrow("_id")));
                C9322n.m27780d(withAppendedId, "withAppendedId(...)");
                contentResolver.delete(withAppendedId, null, null);
            }
            if (query2 != null) {
                query2.close();
            }
        } else {
            Uri withAppendedId2 = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, query.getLong(query.getColumnIndexOrThrow("_id")));
            C9322n.m27780d(withAppendedId2, "withAppendedId(...)");
            contentResolver.delete(withAppendedId2, null, null);
        }
        if (query != null) {
            query.close();
        }
    }

    /* renamed from: e */
    private final void m38553e(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) m38562n(methodCall, "url");
        String str2 = (String) m38562n(methodCall, "saved_dir");
        String str3 = (String) methodCall.argument("file_name");
        String str4 = (String) m38562n(methodCall, "headers");
        int intValue = ((Number) m38562n(methodCall, "timeout")).intValue();
        boolean booleanValue = ((Boolean) m38562n(methodCall, "show_notification")).booleanValue();
        boolean booleanValue2 = ((Boolean) m38562n(methodCall, "open_file_from_notification")).booleanValue();
        boolean booleanValue3 = ((Boolean) m38562n(methodCall, "requires_storage_not_low")).booleanValue();
        boolean booleanValue4 = ((Boolean) m38562n(methodCall, "save_in_public_storage")).booleanValue();
        boolean booleanValue5 = ((Boolean) m38562n(methodCall, "allow_cellular")).booleanValue();
        AbstractC7288u m38549a = m38549a(str, str2, str3, str4, booleanValue, booleanValue2, false, booleanValue3, booleanValue4, intValue, booleanValue5);
        AbstractC7287t.m21795e(m38563o()).m21797c(m38549a);
        String uuid = m38549a.m21798a().toString();
        C9322n.m27780d(uuid, "toString(...)");
        result.success(uuid);
        EnumC9522a enumC9522a = EnumC9522a.ENQUEUED;
        m38566r(uuid, enumC9522a, 0);
        C9530i c9530i = this.f31877b;
        C9322n.m27778b(c9530i);
        c9530i.m28350b(uuid, str, enumC9522a, 0, str3, str2, str4, booleanValue, booleanValue2, booleanValue4, booleanValue5);
    }

    /* renamed from: f */
    private final void m38554f(MethodCall methodCall, MethodChannel.Result result) {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putLong;
        Object obj = methodCall.arguments;
        C9322n.m27779c(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
        List list = (List) obj;
        long parseLong = Long.parseLong(String.valueOf(list.get(0)));
        this.f31881f = Integer.parseInt(String.valueOf(list.get(1)));
        this.f31882r = Integer.parseInt(String.valueOf(list.get(2)));
        Context context = this.f31878c;
        SharedPreferences sharedPreferences = context != null ? context.getSharedPreferences("vn.hunghd.downloader.pref", 0) : null;
        if (sharedPreferences != null && (edit = sharedPreferences.edit()) != null && (putLong = edit.putLong("callback_dispatcher_handle_key", parseLong)) != null) {
            putLong.apply();
        }
        result.success(null);
    }

    /* renamed from: g */
    private final void m38555g(MethodChannel.Result result) {
        C9530i c9530i = this.f31877b;
        C9322n.m27778b(c9530i);
        List<C9523b> m28351c = c9530i.m28351c();
        ArrayList arrayList = new ArrayList();
        for (C9523b c9523b : m28351c) {
            HashMap hashMap = new HashMap();
            hashMap.put("task_id", c9523b.m28341m());
            hashMap.put("status", Integer.valueOf(c9523b.m28340l().ordinal()));
            hashMap.put("progress", Integer.valueOf(c9523b.m28335g()));
            hashMap.put("url", c9523b.m28343o());
            hashMap.put("file_name", c9523b.m28330b());
            hashMap.put("saved_dir", c9523b.m28338j());
            hashMap.put("time_created", Long.valueOf(c9523b.m28342n()));
            hashMap.put("allow_cellular", Boolean.valueOf(c9523b.m28329a()));
            arrayList.add(hashMap);
        }
        result.success(arrayList);
    }

    /* renamed from: h */
    private final void m38556h(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) m38562n(methodCall, "query");
        C9530i c9530i = this.f31877b;
        C9322n.m27778b(c9530i);
        List<C9523b> m28353e = c9530i.m28353e(str);
        ArrayList arrayList = new ArrayList();
        for (C9523b c9523b : m28353e) {
            HashMap hashMap = new HashMap();
            hashMap.put("task_id", c9523b.m28341m());
            hashMap.put("status", Integer.valueOf(c9523b.m28340l().ordinal()));
            hashMap.put("progress", Integer.valueOf(c9523b.m28335g()));
            hashMap.put("url", c9523b.m28343o());
            hashMap.put("file_name", c9523b.m28330b());
            hashMap.put("saved_dir", c9523b.m28338j());
            hashMap.put("time_created", Long.valueOf(c9523b.m28342n()));
            hashMap.put("allow_cellular", Boolean.valueOf(c9523b.m28329a()));
            arrayList.add(hashMap);
        }
        result.success(arrayList);
    }

    /* renamed from: i */
    private final void m38557i(Context context, BinaryMessenger binaryMessenger) {
        synchronized (this.f31883s) {
            if (this.f31876a != null) {
                return;
            }
            this.f31878c = context;
            MethodChannel methodChannel = new MethodChannel(binaryMessenger, "vn.hunghd/downloader");
            this.f31876a = methodChannel;
            methodChannel.setMethodCallHandler(this);
            this.f31877b = new C9530i(C11988b.f31884a.m38569a(this.f31878c));
            C2037v c2037v = C2037v.f8089a;
        }
    }

    /* renamed from: j */
    private final void m38558j(MethodCall methodCall, MethodChannel.Result result) {
        Boolean bool;
        int m41077Z;
        String str = (String) m38562n(methodCall, "task_id");
        C9530i c9530i = this.f31877b;
        C9322n.m27778b(c9530i);
        C9523b m28352d = c9530i.m28352d(str);
        if (m28352d == null) {
            result.error("invalid_task_id", "not found task with id " + str, null);
            return;
        }
        if (m28352d.m28340l() != EnumC9522a.COMPLETE) {
            result.error("invalid_status", "only completed tasks can be opened", null);
            return;
        }
        String m28343o = m28352d.m28343o();
        String m28338j = m28352d.m28338j();
        String m28330b = m28352d.m28330b();
        if (m28330b == null) {
            m41077Z = C12525q.m41077Z(m28343o, "/", 0, false, 6, null);
            m28330b = m28343o.substring(m41077Z + 1, m28343o.length());
            C9322n.m27780d(m28330b, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        Intent m28347c = C9528g.f23153a.m28347c(m38563o(), m28338j + File.separator + m28330b, m28352d.m28332d());
        if (m28347c != null) {
            m38563o().startActivity(m28347c);
            bool = Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        result.success(bool);
    }

    /* renamed from: k */
    private final void m38559k(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) m38562n(methodCall, "task_id");
        C9530i c9530i = this.f31877b;
        C9322n.m27778b(c9530i);
        c9530i.m28357j(str, true);
        AbstractC7287t.m21795e(m38563o()).mo8681b(UUID.fromString(str));
        result.success(null);
    }

    /* renamed from: l */
    private final void m38560l(MethodCall methodCall, MethodChannel.Result result) {
        Object obj = methodCall.arguments;
        C9322n.m27779c(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
        List list = (List) obj;
        this.f31879d = Long.parseLong(String.valueOf(list.get(0)));
        this.f31880e = Integer.parseInt(String.valueOf(list.get(1)));
        result.success(null);
    }

    /* renamed from: m */
    private final void m38561m(MethodCall methodCall, MethodChannel.Result result) {
        int m41077Z;
        String str = (String) m38562n(methodCall, "task_id");
        boolean booleanValue = ((Boolean) m38562n(methodCall, "should_delete_content")).booleanValue();
        C9530i c9530i = this.f31877b;
        C9322n.m27778b(c9530i);
        C9523b m28352d = c9530i.m28352d(str);
        if (m28352d == null) {
            result.error("invalid_task_id", "not found task corresponding to given task id", null);
            return;
        }
        if (m28352d.m28340l() == EnumC9522a.ENQUEUED || m28352d.m28340l() == EnumC9522a.RUNNING) {
            AbstractC7287t.m21795e(m38563o()).mo8681b(UUID.fromString(str));
        }
        if (booleanValue) {
            String m28330b = m28352d.m28330b();
            if (m28330b == null) {
                String m28343o = m28352d.m28343o();
                m41077Z = C12525q.m41077Z(m28352d.m28343o(), "/", 0, false, 6, null);
                m28330b = m28343o.substring(m41077Z + 1, m28352d.m28343o().length());
                C9322n.m27780d(m28330b, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            File file = new File(m28352d.m28338j() + File.separator + m28330b);
            if (file.exists()) {
                try {
                    m38552d(file);
                } catch (SecurityException unused) {
                    Log.d("FlutterDownloader", "Failed to delete file in media store, will fall back to normal delete()");
                }
                file.delete();
            }
        }
        C9530i c9530i2 = this.f31877b;
        C9322n.m27778b(c9530i2);
        c9530i2.m28349a(str);
        C0834t0.m4279f(m38563o()).m4284b(m28352d.m28334f());
        result.success(null);
    }

    /* renamed from: n */
    private final <T> T m38562n(MethodCall methodCall, String str) {
        T t10 = (T) methodCall.argument(str);
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException(("Required key '" + str + "' was null").toString());
    }

    /* renamed from: o */
    private final Context m38563o() {
        Context context = this.f31878c;
        if (context != null) {
            return context;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: p */
    private final void m38564p(MethodCall methodCall, MethodChannel.Result result) {
        String str;
        String str2;
        int m41077Z;
        String str3 = (String) m38562n(methodCall, "task_id");
        C9530i c9530i = this.f31877b;
        C9322n.m27778b(c9530i);
        C9523b m28352d = c9530i.m28352d(str3);
        boolean booleanValue = ((Boolean) m38562n(methodCall, "requires_storage_not_low")).booleanValue();
        int intValue = ((Number) m38562n(methodCall, "timeout")).intValue();
        if (m28352d == null) {
            str = "invalid_task_id";
            str2 = "not found task corresponding to given task id";
        } else if (m28352d.m28340l() == EnumC9522a.PAUSED) {
            String m28330b = m28352d.m28330b();
            if (m28330b == null) {
                String m28343o = m28352d.m28343o();
                m41077Z = C12525q.m41077Z(m28352d.m28343o(), "/", 0, false, 6, null);
                m28330b = m28343o.substring(m41077Z + 1, m28352d.m28343o().length());
                C9322n.m27780d(m28330b, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            if (new File(m28352d.m28338j() + File.separator + m28330b).exists()) {
                AbstractC7288u m38549a = m38549a(m28352d.m28343o(), m28352d.m28338j(), m28352d.m28330b(), m28352d.m28331c(), m28352d.m28339k(), m28352d.m28333e(), true, booleanValue, m28352d.m28337i(), intValue, m28352d.m28329a());
                String uuid = m38549a.m21798a().toString();
                C9322n.m27780d(uuid, "toString(...)");
                result.success(uuid);
                EnumC9522a enumC9522a = EnumC9522a.RUNNING;
                m38566r(uuid, enumC9522a, m28352d.m28335g());
                C9530i c9530i2 = this.f31877b;
                C9322n.m27778b(c9530i2);
                c9530i2.m28355h(str3, uuid, enumC9522a, m28352d.m28335g(), false);
                AbstractC7287t.m21795e(m38563o()).m21797c(m38549a);
                return;
            }
            C9530i c9530i3 = this.f31877b;
            C9322n.m27778b(c9530i3);
            c9530i3.m28357j(str3, false);
            str = "invalid_data";
            str2 = "not found partial downloaded data, this task cannot be resumed";
        } else {
            str = "invalid_status";
            str2 = "only paused task can be resumed";
        }
        result.error(str, str2, null);
    }

    /* renamed from: q */
    private final void m38565q(MethodCall methodCall, MethodChannel.Result result) {
        String str;
        String str2;
        String str3 = (String) m38562n(methodCall, "task_id");
        C9530i c9530i = this.f31877b;
        C9322n.m27778b(c9530i);
        C9523b m28352d = c9530i.m28352d(str3);
        boolean booleanValue = ((Boolean) m38562n(methodCall, "requires_storage_not_low")).booleanValue();
        int intValue = ((Number) m38562n(methodCall, "timeout")).intValue();
        if (m28352d == null) {
            str = "invalid_task_id";
            str2 = "not found task corresponding to given task id";
        } else {
            if (m28352d.m28340l() == EnumC9522a.FAILED || m28352d.m28340l() == EnumC9522a.CANCELED) {
                AbstractC7288u m38549a = m38549a(m28352d.m28343o(), m28352d.m28338j(), m28352d.m28330b(), m28352d.m28331c(), m28352d.m28339k(), m28352d.m28333e(), false, booleanValue, m28352d.m28337i(), intValue, m28352d.m28329a());
                String uuid = m38549a.m21798a().toString();
                C9322n.m27780d(uuid, "toString(...)");
                result.success(uuid);
                EnumC9522a enumC9522a = EnumC9522a.ENQUEUED;
                m38566r(uuid, enumC9522a, m28352d.m28335g());
                C9530i c9530i2 = this.f31877b;
                C9322n.m27778b(c9530i2);
                c9530i2.m28355h(str3, uuid, enumC9522a, m28352d.m28335g(), false);
                AbstractC7287t.m21795e(m38563o()).m21797c(m38549a);
                return;
            }
            str = "invalid_status";
            str2 = "only failed and canceled task can be retried";
        }
        result.error(str, str2, null);
    }

    /* renamed from: r */
    private final void m38566r(String str, EnumC9522a enumC9522a, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("task_id", str);
        hashMap.put("status", Integer.valueOf(enumC9522a.ordinal()));
        hashMap.put("progress", Integer.valueOf(i10));
        MethodChannel methodChannel = this.f31876a;
        if (methodChannel != null) {
            methodChannel.invokeMethod("updateProgress", hashMap);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        C9322n.m27781e(binding, "binding");
        Context applicationContext = binding.getApplicationContext();
        BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        C9322n.m27780d(binaryMessenger, "getBinaryMessenger(...)");
        m38557i(applicationContext, binaryMessenger);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        C9322n.m27781e(binding, "binding");
        this.f31878c = null;
        MethodChannel methodChannel = this.f31876a;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this.f31876a = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0012. Please report as an issue. */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        C9322n.m27781e(call, "call");
        C9322n.m27781e(result, "result");
        String str = call.method;
        if (str != null) {
            switch (str.hashCode()) {
                case -1594257912:
                    if (str.equals("enqueue")) {
                        m38553e(call, result);
                        return;
                    }
                    break;
                case -1367724422:
                    if (str.equals("cancel")) {
                        m38550b(call, result);
                        return;
                    }
                    break;
                case -934610812:
                    if (str.equals("remove")) {
                        m38561m(call, result);
                        return;
                    }
                    break;
                case -934426579:
                    if (str.equals("resume")) {
                        m38564p(call, result);
                        return;
                    }
                    break;
                case -403218424:
                    if (str.equals("registerCallback")) {
                        m38560l(call, result);
                        return;
                    }
                    break;
                case 3417674:
                    if (str.equals("open")) {
                        m38558j(call, result);
                        return;
                    }
                    break;
                case 106440182:
                    if (str.equals("pause")) {
                        m38559k(call, result);
                        return;
                    }
                    break;
                case 108405416:
                    if (str.equals("retry")) {
                        m38565q(call, result);
                        return;
                    }
                    break;
                case 230377166:
                    if (str.equals("loadTasksWithRawQuery")) {
                        m38556h(call, result);
                        return;
                    }
                    break;
                case 476547271:
                    if (str.equals("cancelAll")) {
                        m38551c(result);
                        return;
                    }
                    break;
                case 871091088:
                    if (str.equals("initialize")) {
                        m38554f(call, result);
                        return;
                    }
                    break;
                case 1378870856:
                    if (str.equals("loadTasks")) {
                        m38555g(result);
                        return;
                    }
                    break;
            }
        }
        result.notImplemented();
    }
}

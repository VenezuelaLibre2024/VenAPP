package com.bluechilli.flutteruploader;

import android.content.Context;
import android.util.Log;
import android.webkit.MimeTypeMap;
import androidx.concurrent.futures.c;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.c;
import com.bluechilli.flutteruploader.UploadWorker;
import com.google.common.util.concurrent.f;
import d3.q;
import d3.r;
import d3.s;
import io.flutter.FlutterInjector;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.loader.FlutterLoader;
import io.flutter.view.FlutterCallbackInformation;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import ql.e;
import ql.x;

/* loaded from: classes.dex */
public class UploadWorker extends c implements d3.a {

    /* renamed from: u */
    private static final String f7348u = "UploadWorker";

    /* renamed from: v */
    private static FlutterEngine f7349v;

    /* renamed from: e */
    private String f7350e;

    /* renamed from: f */
    private e f7351f;

    /* renamed from: r */
    private boolean f7352r;

    /* renamed from: s */
    private Context f7353s;

    /* renamed from: t */
    private Executor f7354t;

    /* loaded from: classes.dex */
    public class a extends com.google.gson.reflect.a<Map<String, String>> {
        a() {
        }
    }

    /* loaded from: classes.dex */
    public class b extends com.google.gson.reflect.a<List<d3.c>> {
        b() {
        }
    }

    public UploadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f7352r = false;
        this.f7354t = r.a(context);
        this.f7353s = context;
    }

    private String g(String str) {
        String mimeTypeFromExtension;
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl == null) {
            return "application/octet-stream";
        }
        try {
            return (fileExtensionFromUrl.isEmpty() || (mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl.toLowerCase())) == null) ? "application/octet-stream" : !mimeTypeFromExtension.isEmpty() ? mimeTypeFromExtension : "application/octet-stream";
        } catch (Exception e10) {
            Log.d(f7348u, "UploadWorker - GetMimeType", e10);
            return "application/octet-stream";
        }
    }

    private androidx.work.b h(int i10, int i11, String str, String str2, String[] strArr) {
        return new b.a().f("statusCode", i11).f("status", i10).h("errorCode", str).h("errorMessage", str2).i("errorDetails", strArr).a();
    }

    private String[] j(StackTraceElement[] stackTraceElementArr) {
        ArrayList arrayList = new ArrayList();
        if (stackTraceElementArr == null || stackTraceElementArr.length == 0) {
            return null;
        }
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(stackTraceElement.toString());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    private c.a k(Context context, Exception exc, String str) {
        Log.e(f7348u, "exception encountered", exc);
        boolean z10 = this.f7352r;
        int i10 = z10 ? s.f13755e : s.f13754d;
        if (z10) {
            str = "upload_cancelled";
        }
        return c.a.b(h(i10, 500, str, exc.toString(), j(exc.getStackTrace())));
    }

    public /* synthetic */ void l(c.a aVar) {
        try {
            aVar.c(i());
        } finally {
        }
    }

    public /* synthetic */ Object m(c.a aVar) {
        this.f7354t.execute(new Runnable() { // from class: d3.v

            /* renamed from: b */
            public final /* synthetic */ c.a f13767b;

            public /* synthetic */ v(c.a aVar2) {
                r2 = aVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                UploadWorker.this.l(r2);
            }
        });
        return getId().toString();
    }

    private x.a n(Map<String, String> map, String str) {
        x.a aVar = (str == null || str.isEmpty()) ? new x.a() : new x.a(str);
        aVar.e(x.f24394l);
        if (map == null) {
            return aVar;
        }
        for (String str2 : map.keySet()) {
            String str3 = map.get(str2);
            if (str3 != null) {
                aVar.a(str2, str3);
            }
        }
        return aVar;
    }

    private void o(Context context, int i10, int i11) {
        setProgressAsync(new b.a().f("status", i10).f("progress", i11).a());
    }

    private void p() {
        long longValue = q.b(this.f7353s).longValue();
        Log.d(f7348u, "callbackHandle: " + longValue);
        if (longValue == -1 || f7349v != null) {
            return;
        }
        f7349v = new FlutterEngine(this.f7353s);
        FlutterLoader flutterLoader = FlutterInjector.instance().flutterLoader();
        flutterLoader.ensureInitializationComplete(this.f7353s, null);
        f7349v.getDartExecutor().executeDartCallback(new DartExecutor.DartCallback(this.f7353s.getAssets(), flutterLoader.findAppBundlePath(), FlutterCallbackInformation.lookupCallbackInformation(longValue)));
    }

    private File q(Context context, String str) {
        FileOutputStream fileOutputStream;
        try {
            File createTempFile = File.createTempFile("flutter_uploader", null, context.getCacheDir());
            fileOutputStream = new FileOutputStream(createTempFile);
            try {
                fileOutputStream.write(str.getBytes());
                fileOutputStream.close();
                return createTempFile;
            } catch (Throwable unused) {
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable unused2) {
                    }
                }
                return null;
            }
        } catch (Throwable unused3) {
            fileOutputStream = null;
        }
    }

    @Override // d3.a
    public void a(String str, String str2, String str3) {
        if (this.f7352r) {
            return;
        }
        Log.d(f7348u, "Failed to upload - taskId: " + getId().toString() + ", code: " + str2 + ", error: " + str3);
        o(this.f7353s, s.f13754d, -1);
    }

    @Override // d3.a
    public void c(String str, long j10, long j11) {
        if (this.f7352r) {
            return;
        }
        int round = (int) Math.round((j10 / j11) * 100.0d);
        Log.d(f7348u, "taskId: " + getId().toString() + ", bytesWritten: " + j10 + ", contentLength: " + j11 + ", progress: " + round);
        o(this.f7353s, s.f13752b, round);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0218 A[Catch: Exception -> 0x0337, IOException -> 0x0345, UnknownHostException -> 0x0353, k -> 0x0361, all -> 0x036f, ProtocolException -> 0x0373, TryCatch #10 {UnknownHostException -> 0x0353, IOException -> 0x0345, blocks: (B:7:0x0064, B:9:0x0082, B:11:0x008c, B:13:0x0096, B:15:0x009f, B:17:0x00b4, B:21:0x00ca, B:22:0x0176, B:24:0x0191, B:25:0x0199, B:27:0x019f, B:30:0x01ad, B:33:0x01b3, B:39:0x01b8, B:41:0x01be, B:44:0x01d5, B:52:0x0202, B:53:0x020a, B:54:0x0221, B:56:0x0274, B:60:0x0283, B:61:0x028b, B:64:0x0293, B:71:0x029f, B:67:0x02a3, B:74:0x02a7, B:76:0x02ad, B:77:0x02b4, B:79:0x02ba, B:82:0x02cd, B:85:0x02f6, B:87:0x02f9, B:94:0x0300, B:96:0x0306, B:99:0x030e, B:100:0x0311, B:102:0x0319, B:103:0x0322, B:109:0x0332, B:88:0x0326, B:112:0x020f, B:113:0x0218, B:114:0x01e9, B:117:0x01f3, B:120:0x00dc, B:121:0x00e5, B:123:0x00eb, B:124:0x0101, B:126:0x011a, B:128:0x0120, B:131:0x013e, B:135:0x015b, B:138:0x0172), top: B:6:0x0064, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0274 A[Catch: Exception -> 0x0337, IOException -> 0x0345, UnknownHostException -> 0x0353, k -> 0x0361, all -> 0x036f, ProtocolException -> 0x0373, TryCatch #10 {UnknownHostException -> 0x0353, IOException -> 0x0345, blocks: (B:7:0x0064, B:9:0x0082, B:11:0x008c, B:13:0x0096, B:15:0x009f, B:17:0x00b4, B:21:0x00ca, B:22:0x0176, B:24:0x0191, B:25:0x0199, B:27:0x019f, B:30:0x01ad, B:33:0x01b3, B:39:0x01b8, B:41:0x01be, B:44:0x01d5, B:52:0x0202, B:53:0x020a, B:54:0x0221, B:56:0x0274, B:60:0x0283, B:61:0x028b, B:64:0x0293, B:71:0x029f, B:67:0x02a3, B:74:0x02a7, B:76:0x02ad, B:77:0x02b4, B:79:0x02ba, B:82:0x02cd, B:85:0x02f6, B:87:0x02f9, B:94:0x0300, B:96:0x0306, B:99:0x030e, B:100:0x0311, B:102:0x0319, B:103:0x0322, B:109:0x0332, B:88:0x0326, B:112:0x020f, B:113:0x0218, B:114:0x01e9, B:117:0x01f3, B:120:0x00dc, B:121:0x00e5, B:123:0x00eb, B:124:0x0101, B:126:0x011a, B:128:0x0120, B:131:0x013e, B:135:0x015b, B:138:0x0172), top: B:6:0x0064, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0293 A[Catch: Exception -> 0x0337, IOException -> 0x0345, UnknownHostException -> 0x0353, k -> 0x0361, all -> 0x036f, ProtocolException -> 0x0373, TRY_ENTER, TryCatch #10 {UnknownHostException -> 0x0353, IOException -> 0x0345, blocks: (B:7:0x0064, B:9:0x0082, B:11:0x008c, B:13:0x0096, B:15:0x009f, B:17:0x00b4, B:21:0x00ca, B:22:0x0176, B:24:0x0191, B:25:0x0199, B:27:0x019f, B:30:0x01ad, B:33:0x01b3, B:39:0x01b8, B:41:0x01be, B:44:0x01d5, B:52:0x0202, B:53:0x020a, B:54:0x0221, B:56:0x0274, B:60:0x0283, B:61:0x028b, B:64:0x0293, B:71:0x029f, B:67:0x02a3, B:74:0x02a7, B:76:0x02ad, B:77:0x02b4, B:79:0x02ba, B:82:0x02cd, B:85:0x02f6, B:87:0x02f9, B:94:0x0300, B:96:0x0306, B:99:0x030e, B:100:0x0311, B:102:0x0319, B:103:0x0322, B:109:0x0332, B:88:0x0326, B:112:0x020f, B:113:0x0218, B:114:0x01e9, B:117:0x01f3, B:120:0x00dc, B:121:0x00e5, B:123:0x00eb, B:124:0x0101, B:126:0x011a, B:128:0x0120, B:131:0x013e, B:135:0x015b, B:138:0x0172), top: B:6:0x0064, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02ad A[Catch: Exception -> 0x0337, IOException -> 0x0345, UnknownHostException -> 0x0353, k -> 0x0361, all -> 0x036f, ProtocolException -> 0x0373, TryCatch #10 {UnknownHostException -> 0x0353, IOException -> 0x0345, blocks: (B:7:0x0064, B:9:0x0082, B:11:0x008c, B:13:0x0096, B:15:0x009f, B:17:0x00b4, B:21:0x00ca, B:22:0x0176, B:24:0x0191, B:25:0x0199, B:27:0x019f, B:30:0x01ad, B:33:0x01b3, B:39:0x01b8, B:41:0x01be, B:44:0x01d5, B:52:0x0202, B:53:0x020a, B:54:0x0221, B:56:0x0274, B:60:0x0283, B:61:0x028b, B:64:0x0293, B:71:0x029f, B:67:0x02a3, B:74:0x02a7, B:76:0x02ad, B:77:0x02b4, B:79:0x02ba, B:82:0x02cd, B:85:0x02f6, B:87:0x02f9, B:94:0x0300, B:96:0x0306, B:99:0x030e, B:100:0x0311, B:102:0x0319, B:103:0x0322, B:109:0x0332, B:88:0x0326, B:112:0x020f, B:113:0x0218, B:114:0x01e9, B:117:0x01f3, B:120:0x00dc, B:121:0x00e5, B:123:0x00eb, B:124:0x0101, B:126:0x011a, B:128:0x0120, B:131:0x013e, B:135:0x015b, B:138:0x0172), top: B:6:0x0064, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02ba A[Catch: Exception -> 0x0337, IOException -> 0x0345, UnknownHostException -> 0x0353, k -> 0x0361, all -> 0x036f, ProtocolException -> 0x0373, TRY_LEAVE, TryCatch #10 {UnknownHostException -> 0x0353, IOException -> 0x0345, blocks: (B:7:0x0064, B:9:0x0082, B:11:0x008c, B:13:0x0096, B:15:0x009f, B:17:0x00b4, B:21:0x00ca, B:22:0x0176, B:24:0x0191, B:25:0x0199, B:27:0x019f, B:30:0x01ad, B:33:0x01b3, B:39:0x01b8, B:41:0x01be, B:44:0x01d5, B:52:0x0202, B:53:0x020a, B:54:0x0221, B:56:0x0274, B:60:0x0283, B:61:0x028b, B:64:0x0293, B:71:0x029f, B:67:0x02a3, B:74:0x02a7, B:76:0x02ad, B:77:0x02b4, B:79:0x02ba, B:82:0x02cd, B:85:0x02f6, B:87:0x02f9, B:94:0x0300, B:96:0x0306, B:99:0x030e, B:100:0x0311, B:102:0x0319, B:103:0x0322, B:109:0x0332, B:88:0x0326, B:112:0x020f, B:113:0x0218, B:114:0x01e9, B:117:0x01f3, B:120:0x00dc, B:121:0x00e5, B:123:0x00eb, B:124:0x0101, B:126:0x011a, B:128:0x0120, B:131:0x013e, B:135:0x015b, B:138:0x0172), top: B:6:0x0064, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02cd A[Catch: Exception -> 0x0337, IOException -> 0x0345, UnknownHostException -> 0x0353, k -> 0x0361, all -> 0x036f, ProtocolException -> 0x0373, TRY_ENTER, TRY_LEAVE, TryCatch #10 {UnknownHostException -> 0x0353, IOException -> 0x0345, blocks: (B:7:0x0064, B:9:0x0082, B:11:0x008c, B:13:0x0096, B:15:0x009f, B:17:0x00b4, B:21:0x00ca, B:22:0x0176, B:24:0x0191, B:25:0x0199, B:27:0x019f, B:30:0x01ad, B:33:0x01b3, B:39:0x01b8, B:41:0x01be, B:44:0x01d5, B:52:0x0202, B:53:0x020a, B:54:0x0221, B:56:0x0274, B:60:0x0283, B:61:0x028b, B:64:0x0293, B:71:0x029f, B:67:0x02a3, B:74:0x02a7, B:76:0x02ad, B:77:0x02b4, B:79:0x02ba, B:82:0x02cd, B:85:0x02f6, B:87:0x02f9, B:94:0x0300, B:96:0x0306, B:99:0x030e, B:100:0x0311, B:102:0x0319, B:103:0x0322, B:109:0x0332, B:88:0x0326, B:112:0x020f, B:113:0x0218, B:114:0x01e9, B:117:0x01f3, B:120:0x00dc, B:121:0x00e5, B:123:0x00eb, B:124:0x0101, B:126:0x011a, B:128:0x0120, B:131:0x013e, B:135:0x015b, B:138:0x0172), top: B:6:0x0064, outer: #10 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.work.c.a i() {
        /*
            Method dump skipped, instructions count: 917
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bluechilli.flutteruploader.UploadWorker.i():androidx.work.c$a");
    }

    @Override // androidx.work.c
    public void onStopped() {
        super.onStopped();
        Log.d(f7348u, "UploadWorker - Stopped");
        try {
            this.f7352r = true;
            e eVar = this.f7351f;
            if (eVar == null || eVar.R0()) {
                return;
            }
            this.f7351f.cancel();
        } catch (Exception e10) {
            Log.d(f7348u, "Upload Request cancelled", e10);
        }
    }

    @Override // androidx.work.c
    public f<c.a> startWork() {
        p();
        return androidx.concurrent.futures.c.a(new c.InterfaceC0032c() { // from class: d3.u
            public /* synthetic */ u() {
            }

            @Override // androidx.concurrent.futures.c.InterfaceC0032c
            public final Object a(c.a aVar) {
                Object m10;
                m10 = UploadWorker.this.m(aVar);
                return m10;
            }
        });
    }
}

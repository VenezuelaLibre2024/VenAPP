package vn.hunghd.flutterdownloader;

import android.R;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.provider.MediaStore;
import android.util.Log;
import androidx.core.app.o;
import androidx.core.app.t0;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import ck.v;
import com.google.android.libraries.barhopper.RecognitionOptions;
import io.flutter.FlutterInjector;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.view.FlutterCallbackInformation;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLDecoder;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import lm.h;
import lm.i;
import org.json.JSONException;
import org.json.JSONObject;
import vn.hunghd.flutterdownloader.DownloadWorker;
import xk.p;
import xk.q;

/* loaded from: classes3.dex */
public final class DownloadWorker extends Worker implements MethodChannel.MethodCallHandler {
    private static FlutterEngine P;
    private int A;
    private int B;
    private String C;
    private String D;
    private String E;
    private String F;
    private String G;
    private String H;
    private long I;
    private int J;
    private boolean K;

    /* renamed from: f, reason: collision with root package name */
    private final Pattern f29407f;

    /* renamed from: r, reason: collision with root package name */
    private final Pattern f29408r;

    /* renamed from: s, reason: collision with root package name */
    private final Pattern f29409s;

    /* renamed from: t, reason: collision with root package name */
    private MethodChannel f29410t;

    /* renamed from: u, reason: collision with root package name */
    private vn.hunghd.flutterdownloader.b f29411u;

    /* renamed from: v, reason: collision with root package name */
    private i f29412v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f29413w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f29414x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f29415y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f29416z;
    public static final a L = new a(null);
    private static final String M = DownloadWorker.class.getSimpleName();
    private static final AtomicBoolean N = new AtomicBoolean(false);
    private static final ArrayDeque<List<Object>> O = new ArrayDeque<>();
    private static final HostnameVerifier Q = new HostnameVerifier() { // from class: lm.f
        @Override // javax.net.ssl.HostnameVerifier
        public final boolean verify(String str, SSLSession sSLSession) {
            boolean h10;
            h10 = DownloadWorker.h(str, sSLSession);
            return h10;
        }
    };

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: vn.hunghd.flutterdownloader.DownloadWorker$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0471a implements X509TrustManager {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f29417a;

            C0471a(String str) {
                this.f29417a = str;
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkClientTrusted(X509Certificate[] chain, String authType) {
                n.e(chain, "chain");
                n.e(authType, "authType");
                Log.i(this.f29417a, "checkClientTrusted");
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkServerTrusted(X509Certificate[] chain, String authType) {
                n.e(chain, "chain");
                n.e(authType, "authType");
                Log.i(this.f29417a, "checkServerTrusted");
            }

            @Override // javax.net.ssl.X509TrustManager
            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }
        }

        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b() {
            TrustManager[] trustManagerArr = {new C0471a("trustAllHosts")};
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                n.d(sSLContext, "getInstance(...)");
                sSLContext.init(null, trustManagerArr, new SecureRandom());
                HttpsURLConnection.setDefaultSSLSocketFactory(sSLContext.getSocketFactory());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29418a;

        static {
            int[] iArr = new int[lm.a.values().length];
            try {
                iArr[lm.a.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[lm.a.CANCELED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[lm.a.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[lm.a.PAUSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[lm.a.COMPLETE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f29418a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadWorker(final Context context, WorkerParameters params) {
        super(context, params);
        n.e(context, "context");
        n.e(params, "params");
        this.f29407f = Pattern.compile("(?i)\\bcharset=\\s*\"?([^\\s;\"]*)");
        this.f29408r = Pattern.compile("(?i)\\bfilename\\*=([^']+)'([^']*)'\"?([^\"]+)\"?");
        this.f29409s = Pattern.compile("(?i)\\bfilename=\"?([^\"]+)\"?");
        new Handler(context.getMainLooper()).post(new Runnable() { // from class: lm.d
            @Override // java.lang.Runnable
            public final void run() {
                DownloadWorker.i(DownloadWorker.this, context);
            }
        });
    }

    private final void A(Context context) {
        if (this.f29413w && Build.VERSION.SDK_INT >= 26) {
            Resources resources = getApplicationContext().getResources();
            String string = resources.getString(h.f21303c);
            n.d(string, "getString(...)");
            String string2 = resources.getString(h.f21302b);
            n.d(string2, "getString(...)");
            NotificationChannel notificationChannel = new NotificationChannel("FLUTTER_DOWNLOADER_NOTIFICATION", string, 2);
            notificationChannel.setDescription(string2);
            notificationChannel.setSound(null, null);
            t0 f10 = t0.f(context);
            n.d(f10, "from(...)");
            f10.e(notificationChannel);
        }
    }

    private final long B(HttpURLConnection httpURLConnection, String str, String str2) {
        long length = new File(str2 + File.separator + str).length();
        v("Resume download: Range: bytes=" + length + '-');
        httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        httpURLConnection.setRequestProperty("Range", "bytes=" + length + '-');
        httpURLConnection.setDoInput(true);
        return length;
    }

    private final void C(Context context) {
        DartExecutor dartExecutor;
        synchronized (N) {
            if (P == null) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("vn.hunghd.downloader.pref", 0);
                n.d(sharedPreferences, "getSharedPreferences(...)");
                long j10 = sharedPreferences.getLong("callback_dispatcher_handle_key", 0L);
                P = new FlutterEngine(getApplicationContext(), (String[]) null, false);
                FlutterCallbackInformation lookupCallbackInformation = FlutterCallbackInformation.lookupCallbackInformation(j10);
                if (lookupCallbackInformation == null) {
                    v("Fatal: failed to find callback");
                    return;
                }
                String findAppBundlePath = FlutterInjector.instance().flutterLoader().findAppBundlePath();
                n.d(findAppBundlePath, "findAppBundlePath(...)");
                AssetManager assets = getApplicationContext().getAssets();
                FlutterEngine flutterEngine = P;
                if (flutterEngine != null && (dartExecutor = flutterEngine.getDartExecutor()) != null) {
                    dartExecutor.executeDartCallback(new DartExecutor.DartCallback(assets, findAppBundlePath, lookupCallbackInformation));
                }
            }
            v vVar = v.f7137a;
            FlutterEngine flutterEngine2 = P;
            n.b(flutterEngine2);
            MethodChannel methodChannel = new MethodChannel(flutterEngine2.getDartExecutor(), "vn.hunghd/downloader_background");
            this.f29410t = methodChannel;
            methodChannel.setMethodCallHandler(this);
        }
    }

    private final void D(Context context, String str, lm.a aVar, int i10, PendingIntent pendingIntent, boolean z10) {
        o.e z11;
        int i11;
        String str2;
        x(aVar, i10);
        if (this.f29413w) {
            o.e B = new o.e(context, "FLUTTER_DOWNLOADER_NOTIFICATION").n(str).l(pendingIntent).A(true).g(true).B(-1);
            n.d(B, "setPriority(...)");
            int i12 = b.f29418a[aVar.ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    str2 = this.E;
                } else if (i12 == 3) {
                    str2 = this.F;
                } else if (i12 != 4) {
                    if (i12 != 5) {
                        B.C(0, 0, false);
                        z11 = B.z(false);
                        i11 = s();
                        z11.F(i11);
                    }
                    str2 = this.H;
                } else {
                    str2 = this.G;
                }
                B.m(str2).C(0, 0, false);
                B.z(false).F(R.drawable.stat_sys_download_done);
            } else if (i10 <= 0) {
                B.m(this.C).C(0, 0, false);
                z11 = B.z(false);
                i11 = s();
                z11.F(i11);
            } else {
                if (i10 < 100) {
                    B.m(this.D).C(100, i10, false);
                    z11 = B.z(true);
                    i11 = R.drawable.stat_sys_download;
                    z11.F(i11);
                }
                str2 = this.H;
                B.m(str2).C(0, 0, false);
                B.z(false).F(R.drawable.stat_sys_download_done);
            }
            if (System.currentTimeMillis() - this.I < 1000) {
                if (!z10) {
                    v("Update too frequently!!!!, this should be dropped");
                    return;
                }
                v("Update too frequently!!!!, but it is the final update, we should sleep a second to ensure the update call can be processed");
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                }
            }
            v("Update notification: {notificationId: " + this.B + ", title: " + str + ", status: " + aVar + ", progress: " + i10 + '}');
            t0.f(context).i(this.B, B.c());
            this.I = System.currentTimeMillis();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(String str, SSLSession sSLSession) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(DownloadWorker this$0, Context context) {
        n.e(this$0, "this$0");
        n.e(context, "$context");
        this$0.C(context);
    }

    private final void j(String str, String str2, String str3) {
        boolean E;
        boolean E2;
        if (str3 != null && str2 != null && str != null) {
            E = p.E(str3, "image/", false, 2, null);
            if (!E) {
                E2 = p.E(str3, "video", false, 2, null);
                if (E2) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("title", str);
                    contentValues.put("_display_name", str);
                    contentValues.put("description", "");
                    contentValues.put("mime_type", str3);
                    contentValues.put("date_added", Long.valueOf(System.currentTimeMillis()));
                    contentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
                    contentValues.put("_data", str2);
                    v("insert " + contentValues + " to MediaStore");
                    getApplicationContext().getContentResolver().insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
                    return;
                }
                return;
            }
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("title", str);
            contentValues2.put("_display_name", str);
            contentValues2.put("description", "");
            contentValues2.put("mime_type", str3);
            contentValues2.put("date_added", Long.valueOf(System.currentTimeMillis()));
            contentValues2.put("datetaken", Long.valueOf(System.currentTimeMillis()));
            contentValues2.put("_data", str2);
            v("insert " + contentValues2 + " to MediaStore");
            getApplicationContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues2);
        }
    }

    private final void k() {
        int Z;
        i iVar = this.f29412v;
        n.b(iVar);
        String uuid = getId().toString();
        n.d(uuid, "toString(...)");
        lm.b d10 = iVar.d(uuid);
        if (d10 == null || d10.l() == lm.a.COMPLETE || d10.h()) {
            return;
        }
        String b10 = d10.b();
        if (b10 == null) {
            String o10 = d10.o();
            Z = q.Z(d10.o(), "/", 0, false, 6, null);
            b10 = o10.substring(Z + 1, d10.o().length());
            n.d(b10, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        File file = new File(d10.j() + File.separator + b10);
        if (file.exists()) {
            file.delete();
        }
    }

    private final File l(String str, String str2) {
        File file = new File(str2, str);
        try {
            if (file.createNewFile()) {
                return file;
            }
            w("It looks like you are trying to save file in public storage but not setting 'saveInPublicStorage' to 'true'");
            return null;
        } catch (IOException e10) {
            e10.printStackTrace();
            w("Create a file using java.io API failed ");
            return null;
        }
    }

    private final Uri m(String str, String str2) {
        Uri EXTERNAL_CONTENT_URI;
        EXTERNAL_CONTENT_URI = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
        n.d(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", str2);
        contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
        try {
            return getApplicationContext().getContentResolver().insert(EXTERNAL_CONTENT_URI, contentValues);
        } catch (Exception e10) {
            e10.printStackTrace();
            w("Create a file using MediaStore API failed.");
            return null;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x0118. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:100:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x05da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ae A[Catch: all -> 0x0100, IOException -> 0x0106, TryCatch #12 {IOException -> 0x0106, blocks: (B:318:0x00f9, B:129:0x0186, B:131:0x01a2, B:136:0x01ae, B:138:0x01b5, B:143:0x01c1, B:149:0x0206), top: B:317:0x00f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c1 A[Catch: all -> 0x0100, IOException -> 0x0106, TRY_LEAVE, TryCatch #12 {IOException -> 0x0106, blocks: (B:318:0x00f9, B:129:0x0186, B:131:0x01a2, B:136:0x01ae, B:138:0x01b5, B:143:0x01c1, B:149:0x0206), top: B:317:0x00f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0206 A[Catch: all -> 0x0100, IOException -> 0x0106, TRY_ENTER, TRY_LEAVE, TryCatch #12 {IOException -> 0x0106, blocks: (B:318:0x00f9, B:129:0x0186, B:131:0x01a2, B:136:0x01ae, B:138:0x01b5, B:143:0x01c1, B:149:0x0206), top: B:317:0x00f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x021c A[Catch: all -> 0x0238, IOException -> 0x0240, TRY_ENTER, TRY_LEAVE, TryCatch #29 {IOException -> 0x0240, all -> 0x0238, blocks: (B:160:0x021c, B:269:0x024d, B:271:0x0251), top: B:158:0x021a }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0299 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x031a A[Catch: all -> 0x0420, IOException -> 0x0422, TryCatch #37 {IOException -> 0x0422, all -> 0x0420, blocks: (B:173:0x02a9, B:175:0x02af, B:176:0x02b2, B:178:0x02b6, B:185:0x02bf, B:192:0x0310, B:194:0x031a, B:195:0x032b, B:197:0x0331, B:199:0x033a, B:200:0x033c, B:202:0x0343, B:204:0x034c, B:205:0x0354, B:207:0x0363, B:209:0x0369, B:211:0x036f, B:213:0x0375, B:214:0x037c, B:233:0x03a1, B:235:0x03b5, B:238:0x03d2, B:239:0x03f1, B:242:0x0416, B:247:0x03dc, B:249:0x034f, B:250:0x0352), top: B:172:0x02a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0331 A[Catch: all -> 0x0420, IOException -> 0x0422, TryCatch #37 {IOException -> 0x0422, all -> 0x0420, blocks: (B:173:0x02a9, B:175:0x02af, B:176:0x02b2, B:178:0x02b6, B:185:0x02bf, B:192:0x0310, B:194:0x031a, B:195:0x032b, B:197:0x0331, B:199:0x033a, B:200:0x033c, B:202:0x0343, B:204:0x034c, B:205:0x0354, B:207:0x0363, B:209:0x0369, B:211:0x036f, B:213:0x0375, B:214:0x037c, B:233:0x03a1, B:235:0x03b5, B:238:0x03d2, B:239:0x03f1, B:242:0x0416, B:247:0x03dc, B:249:0x034f, B:250:0x0352), top: B:172:0x02a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0343 A[Catch: all -> 0x0420, IOException -> 0x0422, TryCatch #37 {IOException -> 0x0422, all -> 0x0420, blocks: (B:173:0x02a9, B:175:0x02af, B:176:0x02b2, B:178:0x02b6, B:185:0x02bf, B:192:0x0310, B:194:0x031a, B:195:0x032b, B:197:0x0331, B:199:0x033a, B:200:0x033c, B:202:0x0343, B:204:0x034c, B:205:0x0354, B:207:0x0363, B:209:0x0369, B:211:0x036f, B:213:0x0375, B:214:0x037c, B:233:0x03a1, B:235:0x03b5, B:238:0x03d2, B:239:0x03f1, B:242:0x0416, B:247:0x03dc, B:249:0x034f, B:250:0x0352), top: B:172:0x02a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0363 A[Catch: all -> 0x0420, IOException -> 0x0422, TryCatch #37 {IOException -> 0x0422, all -> 0x0420, blocks: (B:173:0x02a9, B:175:0x02af, B:176:0x02b2, B:178:0x02b6, B:185:0x02bf, B:192:0x0310, B:194:0x031a, B:195:0x032b, B:197:0x0331, B:199:0x033a, B:200:0x033c, B:202:0x0343, B:204:0x034c, B:205:0x0354, B:207:0x0363, B:209:0x0369, B:211:0x036f, B:213:0x0375, B:214:0x037c, B:233:0x03a1, B:235:0x03b5, B:238:0x03d2, B:239:0x03f1, B:242:0x0416, B:247:0x03dc, B:249:0x034f, B:250:0x0352), top: B:172:0x02a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0352 A[Catch: all -> 0x0420, IOException -> 0x0422, TryCatch #37 {IOException -> 0x0422, all -> 0x0420, blocks: (B:173:0x02a9, B:175:0x02af, B:176:0x02b2, B:178:0x02b6, B:185:0x02bf, B:192:0x0310, B:194:0x031a, B:195:0x032b, B:197:0x0331, B:199:0x033a, B:200:0x033c, B:202:0x0343, B:204:0x034c, B:205:0x0354, B:207:0x0363, B:209:0x0369, B:211:0x036f, B:213:0x0375, B:214:0x037c, B:233:0x03a1, B:235:0x03b5, B:238:0x03d2, B:239:0x03f1, B:242:0x0416, B:247:0x03dc, B:249:0x034f, B:250:0x0352), top: B:172:0x02a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0310 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0249 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x05ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void n(android.content.Context r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, boolean r33, int r34) {
        /*
            Method dump skipped, instructions count: 1524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: vn.hunghd.flutterdownloader.DownloadWorker.n(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int):void");
    }

    private final String o(String str) {
        String group;
        if (str == null) {
            return null;
        }
        Matcher matcher = this.f29407f.matcher(str);
        if (!matcher.find() || (group = matcher.group(1)) == null) {
            return null;
        }
        int length = group.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = n.f(group.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                }
                length--;
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        String obj = group.subSequence(i10, length + 1).toString();
        if (obj == null) {
            return null;
        }
        Locale US = Locale.US;
        n.d(US, "US");
        String upperCase = obj.toUpperCase(US);
        n.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    /* JADX WARN: Code restructure failed: missing block: B:2:0x0002, code lost:
    
        r8 = xk.q.u0(r8, new java.lang.String[]{";"}, false, 0, 6, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String p(java.lang.String r8) {
        /*
            r7 = this;
            if (r8 == 0) goto L5b
            java.lang.String r0 = ";"
            java.lang.String[] r2 = new java.lang.String[]{r0}
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r8
            java.util.List r8 = xk.g.u0(r1, r2, r3, r4, r5, r6)
            if (r8 == 0) goto L5b
            java.util.Collection r8 = (java.util.Collection) r8
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.Object[] r8 = r8.toArray(r1)
            java.lang.String[] r8 = (java.lang.String[]) r8
            if (r8 == 0) goto L5b
            r8 = r8[r0]
            if (r8 == 0) goto L5b
            int r1 = r8.length()
            r2 = 1
            int r1 = r1 - r2
            r3 = r0
            r4 = r3
        L2c:
            if (r3 > r1) goto L51
            if (r4 != 0) goto L32
            r5 = r3
            goto L33
        L32:
            r5 = r1
        L33:
            char r5 = r8.charAt(r5)
            r6 = 32
            int r5 = kotlin.jvm.internal.n.f(r5, r6)
            if (r5 > 0) goto L41
            r5 = r2
            goto L42
        L41:
            r5 = r0
        L42:
            if (r4 != 0) goto L4b
            if (r5 != 0) goto L48
            r4 = r2
            goto L2c
        L48:
            int r3 = r3 + 1
            goto L2c
        L4b:
            if (r5 != 0) goto L4e
            goto L51
        L4e:
            int r1 = r1 + (-1)
            goto L2c
        L51:
            int r1 = r1 + r2
            java.lang.CharSequence r8 = r8.subSequence(r3, r1)
            java.lang.String r8 = r8.toString()
            goto L5c
        L5b:
            r8 = 0
        L5c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: vn.hunghd.flutterdownloader.DownloadWorker.p(java.lang.String):java.lang.String");
    }

    private final String q(String str, String str2) {
        if (str == null) {
            return null;
        }
        Matcher matcher = this.f29409s.matcher(str);
        String group = matcher.find() ? matcher.group(1) : null;
        Matcher matcher2 = this.f29408r.matcher(str);
        if (matcher2.find()) {
            group = matcher2.group(3);
            String group2 = matcher2.group(1);
            if (group2 != null) {
                Locale US = Locale.US;
                n.d(US, "US");
                String upperCase = group2.toUpperCase(US);
                n.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
                str2 = upperCase;
            } else {
                str2 = null;
            }
        }
        if (group == null) {
            return null;
        }
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        return URLDecoder.decode(group, str2);
    }

    private final String r(Uri uri) {
        try {
            Cursor query = getApplicationContext().getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
            if (query == null) {
                mk.b.a(query, null);
                return null;
            }
            try {
                String string = !query.moveToFirst() ? null : query.getString(query.getColumnIndexOrThrow("_data"));
                mk.b.a(query, null);
                return string;
            } finally {
            }
        } catch (IllegalArgumentException e10) {
            e10.printStackTrace();
            w("Get a path for a MediaStore failed");
            return null;
        }
    }

    private final int s() {
        try {
            ApplicationInfo applicationInfo = getApplicationContext().getPackageManager().getApplicationInfo(getApplicationContext().getPackageName(), RecognitionOptions.ITF);
            n.d(applicationInfo, "getApplicationInfo(...)");
            return applicationInfo.metaData.getInt("vn.hunghd.flutterdownloader.NOTIFICATION_ICON", applicationInfo.icon);
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    private final boolean t(String str) {
        boolean E;
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        n.d(externalStorageDirectory, "getExternalStorageDirectory(...)");
        if (str == null) {
            return false;
        }
        String path = externalStorageDirectory.getPath();
        n.d(path, "getPath(...)");
        E = p.E(str, path, false, 2, null);
        return E;
    }

    private final boolean u(String str) {
        boolean E;
        boolean E2;
        String p10 = p(str);
        if (p10 == null) {
            return false;
        }
        E = p.E(p10, "image/", false, 2, null);
        if (!E) {
            E2 = p.E(p10, "video", false, 2, null);
            if (!E2) {
                return false;
            }
        }
        return true;
    }

    private final void v(String str) {
        if (this.f29415y) {
            Log.d(M, str);
        }
    }

    private final void w(String str) {
        if (this.f29415y) {
            Log.e(M, str);
        }
    }

    private final void x(lm.a aVar, int i10) {
        final ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(getInputData().k("callback_handle", 0L)));
        String uuid = getId().toString();
        n.d(uuid, "toString(...)");
        arrayList.add(uuid);
        arrayList.add(Integer.valueOf(aVar.ordinal()));
        arrayList.add(Integer.valueOf(i10));
        AtomicBoolean atomicBoolean = N;
        synchronized (atomicBoolean) {
            if (atomicBoolean.get()) {
                new Handler(getApplicationContext().getMainLooper()).post(new Runnable() { // from class: lm.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        DownloadWorker.y(DownloadWorker.this, arrayList);
                    }
                });
            } else {
                O.add(arrayList);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(DownloadWorker this$0, List args) {
        n.e(this$0, "this$0");
        n.e(args, "$args");
        MethodChannel methodChannel = this$0.f29410t;
        if (methodChannel != null) {
            methodChannel.invokeMethod("", args);
        }
    }

    private final void z(HttpURLConnection httpURLConnection, String str) {
        if (str.length() > 0) {
            v("Headers = " + str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                n.d(keys, "keys(...)");
                while (keys.hasNext()) {
                    String next = keys.next();
                    httpURLConnection.setRequestProperty(next, jSONObject.getString(next));
                }
                httpURLConnection.setDoInput(true);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // androidx.work.Worker
    public c.a doWork() {
        lm.b bVar;
        Object obj;
        boolean z10;
        vn.hunghd.flutterdownloader.b a10 = vn.hunghd.flutterdownloader.b.f29429a.a(getApplicationContext());
        this.f29411u = a10;
        n.b(a10);
        this.f29412v = new i(a10);
        String l10 = getInputData().l("url");
        if (l10 == null) {
            throw new IllegalArgumentException("Argument 'url' should not be null");
        }
        String l11 = getInputData().l("file_name");
        String l12 = getInputData().l("saved_file");
        if (l12 == null) {
            throw new IllegalArgumentException("Argument 'saved_file' should not be null");
        }
        String l13 = getInputData().l("headers");
        if (l13 == null) {
            throw new IllegalArgumentException("Argument 'headers' should not be null");
        }
        boolean h10 = getInputData().h("is_resume", false);
        int i10 = getInputData().i("timeout", 15000);
        this.f29415y = getInputData().h("debug", false);
        this.J = getInputData().i("step", 10);
        this.f29416z = getInputData().h("ignoreSsl", false);
        Resources resources = getApplicationContext().getResources();
        this.C = resources.getString(h.f21308h);
        this.D = resources.getString(h.f21306f);
        this.E = resources.getString(h.f21301a);
        this.F = resources.getString(h.f21305e);
        this.G = resources.getString(h.f21307g);
        this.H = resources.getString(h.f21304d);
        i iVar = this.f29412v;
        if (iVar != null) {
            String uuid = getId().toString();
            n.d(uuid, "toString(...)");
            bVar = iVar.d(uuid);
        } else {
            bVar = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DownloadWorker{url=");
        sb2.append(l10);
        sb2.append(",filename=");
        sb2.append(l11);
        sb2.append(",savedDir=");
        sb2.append(l12);
        sb2.append(",header=");
        sb2.append(l13);
        sb2.append(",isResume=");
        sb2.append(h10);
        sb2.append(",status=");
        if (bVar == null || (obj = bVar.l()) == null) {
            obj = "GONE";
        }
        sb2.append(obj);
        v(sb2.toString());
        if (bVar == null || bVar.l() == lm.a.CANCELED) {
            c.a d10 = c.a.d();
            n.d(d10, "success(...)");
            return d10;
        }
        this.f29413w = getInputData().h("show_notification", false);
        this.f29414x = getInputData().h("open_file_from_notification", false);
        this.K = getInputData().h("save_in_public_storage", false);
        this.B = bVar.f();
        Context applicationContext = getApplicationContext();
        n.d(applicationContext, "getApplicationContext(...)");
        A(applicationContext);
        Context applicationContext2 = getApplicationContext();
        n.d(applicationContext2, "getApplicationContext(...)");
        String str = l11 == null ? l10 : l11;
        lm.a aVar = lm.a.RUNNING;
        D(applicationContext2, str, aVar, bVar.g(), null, false);
        i iVar2 = this.f29412v;
        if (iVar2 != null) {
            String uuid2 = getId().toString();
            n.d(uuid2, "toString(...)");
            iVar2.i(uuid2, aVar, bVar.g());
        }
        if (new File(l12 + File.separator + l11).exists()) {
            v("exists file for " + l11 + "automatic resuming...");
            z10 = true;
        } else {
            z10 = h10;
        }
        try {
            Context applicationContext3 = getApplicationContext();
            n.d(applicationContext3, "getApplicationContext(...)");
            n(applicationContext3, l10, l12, l11, l13, z10, i10);
            k();
            this.f29411u = null;
            this.f29412v = null;
            c.a d11 = c.a.d();
            n.b(d11);
            return d11;
        } catch (Exception e10) {
            Context applicationContext4 = getApplicationContext();
            n.d(applicationContext4, "getApplicationContext(...)");
            String str2 = l11 == null ? l10 : l11;
            lm.a aVar2 = lm.a.FAILED;
            D(applicationContext4, str2, aVar2, -1, null, true);
            i iVar3 = this.f29412v;
            if (iVar3 != null) {
                String uuid3 = getId().toString();
                n.d(uuid3, "toString(...)");
                iVar3.i(uuid3, aVar2, this.A);
            }
            e10.printStackTrace();
            this.f29411u = null;
            this.f29412v = null;
            c.a a11 = c.a.a();
            n.b(a11);
            return a11;
        }
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        n.e(call, "call");
        n.e(result, "result");
        if (!call.method.equals("didInitializeDispatcher")) {
            result.notImplemented();
            return;
        }
        synchronized (N) {
            while (true) {
                ArrayDeque<List<Object>> arrayDeque = O;
                if (arrayDeque.isEmpty()) {
                    N.set(true);
                    result.success(null);
                    v vVar = v.f7137a;
                } else {
                    MethodChannel methodChannel = this.f29410t;
                    if (methodChannel != null) {
                        methodChannel.invokeMethod("", arrayDeque.remove());
                    }
                }
            }
        }
    }

    @Override // androidx.work.c
    public void onStopped() {
        lm.b bVar;
        Context applicationContext = getApplicationContext();
        n.d(applicationContext, "getApplicationContext(...)");
        vn.hunghd.flutterdownloader.b a10 = vn.hunghd.flutterdownloader.b.f29429a.a(applicationContext);
        this.f29411u = a10;
        n.b(a10);
        this.f29412v = new i(a10);
        String l10 = getInputData().l("url");
        String l11 = getInputData().l("file_name");
        i iVar = this.f29412v;
        if (iVar != null) {
            String uuid = getId().toString();
            n.d(uuid, "toString(...)");
            bVar = iVar.d(uuid);
        } else {
            bVar = null;
        }
        if (bVar == null || bVar.l() != lm.a.ENQUEUED) {
            return;
        }
        if (l11 == null) {
            l11 = l10;
        }
        lm.a aVar = lm.a.CANCELED;
        D(applicationContext, l11, aVar, -1, null, true);
        i iVar2 = this.f29412v;
        if (iVar2 != null) {
            String uuid2 = getId().toString();
            n.d(uuid2, "toString(...)");
            iVar2.i(uuid2, aVar, this.A);
        }
    }
}

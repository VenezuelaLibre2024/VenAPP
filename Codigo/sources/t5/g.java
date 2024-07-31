package t5;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import ck.v;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.api.a;
import dk.q;
import dk.s;
import dk.z;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import s5.b;
import t5.g;

/* loaded from: classes.dex */
public final class g implements MethodChannel.MethodCallHandler {

    /* renamed from: s, reason: collision with root package name */
    public static final b f25809s = new b(null);

    /* renamed from: t, reason: collision with root package name */
    private static final ThreadPoolExecutor f25810t = new ThreadPoolExecutor(8, a.e.API_PRIORITY_OTHER, 1, TimeUnit.MINUTES, new LinkedBlockingQueue());

    /* renamed from: a, reason: collision with root package name */
    private final Context f25811a;

    /* renamed from: b, reason: collision with root package name */
    private Activity f25812b;

    /* renamed from: c, reason: collision with root package name */
    private final y5.c f25813c;

    /* renamed from: d, reason: collision with root package name */
    private final t5.e f25814d;

    /* renamed from: e, reason: collision with root package name */
    private final f f25815e;

    /* renamed from: f, reason: collision with root package name */
    private final t5.b f25816f;

    /* renamed from: r, reason: collision with root package name */
    private boolean f25817r;

    /* loaded from: classes.dex */
    public static final class a implements y5.b {
        a() {
        }

        @Override // y5.b
        public void a(List<String> needPermissions) {
            n.e(needPermissions, "needPermissions");
        }

        @Override // y5.b
        public void b(List<String> deniedPermissions, List<String> grantedPermissions, List<String> needPermissions) {
            n.e(deniedPermissions, "deniedPermissions");
            n.e(grantedPermissions, "grantedPermissions");
            n.e(needPermissions, "needPermissions");
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(ok.a tmp0) {
            n.e(tmp0, "$tmp0");
            tmp0.invoke();
        }

        public final void b(final ok.a<v> runnable) {
            n.e(runnable, "runnable");
            g.f25810t.execute(new Runnable() { // from class: t5.h
                @Override // java.lang.Runnable
                public final void run() {
                    g.b.c(ok.a.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends o implements ok.a<v> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b6.e f25819b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(b6.e eVar) {
            super(0);
            this.f25819b = eVar;
        }

        public final void a() {
            g.this.f25816f.d();
            this.f25819b.g(1);
        }

        @Override // ok.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f7137a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d extends o implements ok.a<v> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b6.e f25821b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(b6.e eVar) {
            super(0);
            this.f25821b = eVar;
        }

        public final void a() {
            String b10;
            try {
                g.this.k(this.f25821b, g.this.f25813c.f(g.this.f25811a));
            } catch (Exception e10) {
                MethodCall d10 = this.f25821b.d();
                String str = d10.method;
                Object obj = d10.arguments;
                b6.e eVar = this.f25821b;
                String str2 = "The " + str + " method has an error: " + e10.getMessage();
                b10 = ck.b.b(e10);
                eVar.i(str2, b10, obj);
            }
        }

        @Override // ok.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f7137a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements y5.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b6.e f25822a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f25823b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f25824c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f25825d;

        e(b6.e eVar, g gVar, int i10, boolean z10) {
            this.f25822a = eVar;
            this.f25823b = gVar;
            this.f25824c = i10;
            this.f25825d = z10;
        }

        @Override // y5.b
        public void a(List<String> needPermissions) {
            n.e(needPermissions, "needPermissions");
            this.f25822a.g(Integer.valueOf(v5.c.Authorized.h()));
        }

        @Override // y5.b
        public void b(List<String> deniedPermissions, List<String> grantedPermissions, List<String> needPermissions) {
            n.e(deniedPermissions, "deniedPermissions");
            n.e(grantedPermissions, "grantedPermissions");
            n.e(needPermissions, "needPermissions");
            this.f25822a.g(Integer.valueOf(this.f25823b.f25813c.d(this.f25824c, this.f25825d).h()));
        }
    }

    public g(Context applicationContext, BinaryMessenger messenger, Activity activity, y5.c permissionsUtils) {
        n.e(applicationContext, "applicationContext");
        n.e(messenger, "messenger");
        n.e(permissionsUtils, "permissionsUtils");
        this.f25811a = applicationContext;
        this.f25812b = activity;
        this.f25813c = permissionsUtils;
        permissionsUtils.l(new a());
        this.f25814d = new t5.e(applicationContext, this.f25812b);
        this.f25815e = new f(applicationContext, messenger, new Handler(Looper.getMainLooper()));
        this.f25816f = new t5.b(applicationContext);
    }

    private final int h(MethodCall methodCall, String str) {
        Object argument = methodCall.argument(str);
        n.b(argument);
        return ((Number) argument).intValue();
    }

    private final w5.e i(MethodCall methodCall) {
        Object argument = methodCall.argument("option");
        n.b(argument);
        return x5.c.f30409a.e((Map) argument);
    }

    private final String j(MethodCall methodCall, String str) {
        Object argument = methodCall.argument(str);
        n.b(argument);
        return (String) argument;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0036. Please report as an issue. */
    public final void k(b6.e eVar, boolean z10) {
        Object obj;
        Object p10;
        List<v5.a> i10;
        int r10;
        List<? extends Uri> f02;
        boolean booleanValue;
        x5.c cVar;
        List<v5.b> e10;
        int r11;
        List<? extends Uri> f03;
        MethodCall d10 = eVar.d();
        String str = d10.method;
        if (str != null) {
            try {
                switch (str.hashCode()) {
                    case -2060338679:
                        obj = "save image error";
                        if (str.equals("saveImageWithPath")) {
                            try {
                                Object argument = d10.argument("path");
                                n.b(argument);
                                String str2 = (String) argument;
                                String str3 = (String) d10.argument("title");
                                if (str3 == null) {
                                    str3 = "";
                                }
                                String str4 = (String) d10.argument("desc");
                                if (str4 == null) {
                                    str4 = "";
                                }
                                String str5 = (String) d10.argument("relativePath");
                                v5.a y10 = this.f25816f.y(str2, str3, str4, str5 == null ? "" : str5);
                                if (y10 == null) {
                                    eVar.g(null);
                                    return;
                                } else {
                                    eVar.g(x5.c.f30409a.a(y10));
                                    return;
                                }
                            } catch (Exception e11) {
                                e = e11;
                                b6.a.c(obj, e);
                                eVar.g(null);
                                return;
                            }
                        }
                        break;
                    case -1793329916:
                        if (str.equals("removeNoExistsAssets")) {
                            this.f25816f.v(eVar);
                            return;
                        }
                        break;
                    case -1491271588:
                        if (str.equals("getColumnNames")) {
                            this.f25816f.m(eVar);
                            return;
                        }
                        break;
                    case -1283288098:
                        if (str.equals("getLatLngAndroidQ")) {
                            Object argument2 = d10.argument(FacebookMediationAdapter.KEY_ID);
                            n.b(argument2);
                            p10 = this.f25816f.p((String) argument2);
                            eVar.g(p10);
                            return;
                        }
                        break;
                    case -1167306339:
                        if (str.equals("getAssetListPaged")) {
                            Object argument3 = d10.argument(FacebookMediationAdapter.KEY_ID);
                            n.b(argument3);
                            String str6 = (String) argument3;
                            Object argument4 = d10.argument("type");
                            n.b(argument4);
                            int intValue = ((Number) argument4).intValue();
                            Object argument5 = d10.argument("page");
                            n.b(argument5);
                            int intValue2 = ((Number) argument5).intValue();
                            Object argument6 = d10.argument("size");
                            n.b(argument6);
                            i10 = this.f25816f.i(str6, intValue, intValue2, ((Number) argument6).intValue(), i(d10));
                            p10 = x5.c.f30409a.b(i10);
                            eVar.g(p10);
                            return;
                        }
                        break;
                    case -1165452507:
                        if (str.equals("getAssetListRange")) {
                            i10 = this.f25816f.j(j(d10, FacebookMediationAdapter.KEY_ID), h(d10, "type"), h(d10, "start"), h(d10, "end"), i(d10));
                            p10 = x5.c.f30409a.b(i10);
                            eVar.g(p10);
                            return;
                        }
                        break;
                    case -1039689911:
                        if (str.equals("notify")) {
                            if (n.a((Boolean) d10.argument("notify"), Boolean.TRUE)) {
                                this.f25815e.f();
                            } else {
                                this.f25815e.g();
                            }
                            eVar.g(null);
                            return;
                        }
                        break;
                    case -1033607060:
                        if (str.equals("moveToTrash")) {
                            Object argument7 = d10.argument("ids");
                            n.b(argument7);
                            List list = (List) argument7;
                            if (Build.VERSION.SDK_INT < 30) {
                                b6.a.b("The API 29 or lower have not the IS_TRASHED row in MediaStore.");
                                eVar.i("The api not support 29 or lower.", "", new UnsupportedOperationException("The api cannot be used in 29 or lower."));
                                return;
                            }
                            List list2 = list;
                            r10 = s.r(list2, 10);
                            ArrayList arrayList = new ArrayList(r10);
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(this.f25816f.t((String) it.next()));
                            }
                            f02 = z.f0(arrayList);
                            this.f25814d.f(f02, eVar);
                            return;
                        }
                        break;
                    case -948382752:
                        if (str.equals("requestCacheAssetsThumb")) {
                            Object argument8 = d10.argument("ids");
                            n.b(argument8);
                            Object argument9 = d10.argument("option");
                            n.b(argument9);
                            this.f25816f.w((List) argument8, v5.d.f27932f.a((Map) argument9), eVar);
                            return;
                        }
                        break;
                    case -886445535:
                        if (str.equals("getFullFile")) {
                            Object argument10 = d10.argument(FacebookMediationAdapter.KEY_ID);
                            n.b(argument10);
                            String str7 = (String) argument10;
                            if (z10) {
                                Object argument11 = d10.argument("isOrigin");
                                n.b(argument11);
                                booleanValue = ((Boolean) argument11).booleanValue();
                            } else {
                                booleanValue = false;
                            }
                            this.f25816f.o(str7, booleanValue, eVar);
                            return;
                        }
                        break;
                    case -626940993:
                        if (str.equals("moveAssetToPath")) {
                            Object argument12 = d10.argument("assetId");
                            n.b(argument12);
                            Object argument13 = d10.argument("albumId");
                            n.b(argument13);
                            this.f25816f.u((String) argument12, (String) argument13, eVar);
                            return;
                        }
                        break;
                    case -151967598:
                        if (str.equals("fetchPathProperties")) {
                            Object argument14 = d10.argument(FacebookMediationAdapter.KEY_ID);
                            n.b(argument14);
                            Object argument15 = d10.argument("type");
                            n.b(argument15);
                            v5.b g10 = this.f25816f.g((String) argument14, ((Number) argument15).intValue(), i(d10));
                            if (g10 != null) {
                                cVar = x5.c.f30409a;
                                e10 = q.e(g10);
                                p10 = cVar.c(e10);
                                eVar.g(p10);
                                return;
                            }
                            eVar.g(null);
                            return;
                        }
                        break;
                    case 163601886:
                        if (str.equals("saveImage")) {
                            try {
                                Object argument16 = d10.argument("image");
                                n.b(argument16);
                                byte[] bArr = (byte[]) argument16;
                                String str8 = (String) d10.argument("title");
                                if (str8 == null) {
                                    str8 = "";
                                }
                                String str9 = (String) d10.argument("desc");
                                if (str9 == null) {
                                    str9 = "";
                                }
                                String str10 = (String) d10.argument("relativePath");
                                v5.a z11 = this.f25816f.z(bArr, str8, str9, str10 == null ? "" : str10);
                                if (z11 == null) {
                                    eVar.g(null);
                                    return;
                                } else {
                                    eVar.g(x5.c.f30409a.a(z11));
                                    return;
                                }
                            } catch (Exception e12) {
                                e = e12;
                                obj = "save image error";
                                b6.a.c(obj, e);
                                eVar.g(null);
                                return;
                            }
                        }
                        break;
                    case 175491326:
                        if (str.equals("saveVideo")) {
                            try {
                                Object argument17 = d10.argument("path");
                                n.b(argument17);
                                String str11 = (String) argument17;
                                Object argument18 = d10.argument("title");
                                n.b(argument18);
                                String str12 = (String) argument18;
                                String str13 = (String) d10.argument("desc");
                                if (str13 == null) {
                                    str13 = "";
                                }
                                String str14 = (String) d10.argument("relativePath");
                                v5.a A = this.f25816f.A(str11, str12, str13, str14 == null ? "" : str14);
                                if (A == null) {
                                    eVar.g(null);
                                    return;
                                } else {
                                    eVar.g(x5.c.f30409a.a(A));
                                    return;
                                }
                            } catch (Exception e13) {
                                b6.a.c("save video error", e13);
                                break;
                            }
                        }
                        break;
                    case 326673488:
                        if (str.equals("fetchEntityProperties")) {
                            Object argument19 = d10.argument(FacebookMediationAdapter.KEY_ID);
                            n.b(argument19);
                            v5.a f10 = this.f25816f.f((String) argument19);
                            eVar.g(f10 != null ? x5.c.f30409a.a(f10) : null);
                            return;
                        }
                        break;
                    case 624480877:
                        if (str.equals("getAssetsByRange")) {
                            this.f25816f.l(eVar, i(d10), h(d10, "start"), h(d10, "end"), h(d10, "type"));
                            return;
                        }
                        break;
                    case 857200492:
                        if (str.equals("assetExists")) {
                            Object argument20 = d10.argument(FacebookMediationAdapter.KEY_ID);
                            n.b(argument20);
                            this.f25816f.b((String) argument20, eVar);
                            return;
                        }
                        break;
                    case 972925196:
                        if (str.equals("cancelCacheRequests")) {
                            this.f25816f.c();
                            eVar.g(null);
                            return;
                        }
                        break;
                    case 1063055279:
                        if (str.equals("getOriginBytes")) {
                            Object argument21 = d10.argument(FacebookMediationAdapter.KEY_ID);
                            n.b(argument21);
                            this.f25816f.r((String) argument21, eVar, z10);
                            return;
                        }
                        break;
                    case 1150344167:
                        if (str.equals("deleteWithIds")) {
                            Object argument22 = d10.argument("ids");
                            n.b(argument22);
                            List<String> list3 = (List) argument22;
                            if (Build.VERSION.SDK_INT < 30) {
                                this.f25814d.b(list3);
                                eVar.g(list3);
                                return;
                            }
                            List<String> list4 = list3;
                            r11 = s.r(list4, 10);
                            ArrayList arrayList2 = new ArrayList(r11);
                            Iterator<T> it2 = list4.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(this.f25816f.t((String) it2.next()));
                            }
                            f03 = z.f0(arrayList2);
                            this.f25814d.c(f03, eVar);
                            return;
                        }
                        break;
                    case 1177116769:
                        if (str.equals("getMediaUrl")) {
                            Object argument23 = d10.argument(FacebookMediationAdapter.KEY_ID);
                            n.b(argument23);
                            Object argument24 = d10.argument("type");
                            n.b(argument24);
                            p10 = this.f25816f.q(Long.parseLong((String) argument23), ((Number) argument24).intValue());
                            eVar.g(p10);
                            return;
                        }
                        break;
                    case 1375013309:
                        if (str.equals("getAssetPathList")) {
                            Object argument25 = d10.argument("type");
                            n.b(argument25);
                            int intValue3 = ((Number) argument25).intValue();
                            Object argument26 = d10.argument("hasAll");
                            n.b(argument26);
                            boolean booleanValue2 = ((Boolean) argument26).booleanValue();
                            w5.e i11 = i(d10);
                            Object argument27 = d10.argument("onlyAll");
                            n.b(argument27);
                            e10 = this.f25816f.k(intValue3, booleanValue2, ((Boolean) argument27).booleanValue(), i11);
                            cVar = x5.c.f30409a;
                            p10 = cVar.c(e10);
                            eVar.g(p10);
                            return;
                        }
                        break;
                    case 1477946491:
                        if (str.equals("copyAsset")) {
                            Object argument28 = d10.argument("assetId");
                            n.b(argument28);
                            Object argument29 = d10.argument("galleryId");
                            n.b(argument29);
                            this.f25816f.e((String) argument28, (String) argument29, eVar);
                            return;
                        }
                        break;
                    case 1806009333:
                        if (str.equals("getAssetCount")) {
                            this.f25816f.h(eVar, i(d10), h(d10, "type"));
                            return;
                        }
                        break;
                    case 1966168096:
                        if (str.equals("getThumb")) {
                            Object argument30 = d10.argument(FacebookMediationAdapter.KEY_ID);
                            n.b(argument30);
                            Object argument31 = d10.argument("option");
                            n.b(argument31);
                            this.f25816f.s((String) argument30, v5.d.f27932f.a((Map) argument31), eVar);
                            return;
                        }
                        break;
                }
            } catch (Exception e14) {
                b6.a.c("deleteWithIds failed", e14);
                b6.e.j(eVar, "deleteWithIds failed", null, null, 6, null);
                return;
            }
        }
        eVar.e();
    }

    private final void l(b6.e eVar) {
        Object valueOf;
        MethodCall d10 = eVar.d();
        String str = d10.method;
        if (str != null) {
            switch (str.hashCode()) {
                case -1914421335:
                    if (str.equals("systemVersion")) {
                        valueOf = String.valueOf(Build.VERSION.SDK_INT);
                        eVar.g(valueOf);
                    }
                    return;
                case -582375106:
                    if (str.equals("forceOldApi")) {
                        this.f25816f.B(true);
                        break;
                    } else {
                        return;
                    }
                case 107332:
                    if (str.equals("log")) {
                        b6.a aVar = b6.a.f6152a;
                        Boolean bool = (Boolean) d10.arguments();
                        aVar.g(bool == null ? false : bool.booleanValue());
                        break;
                    } else {
                        return;
                    }
                case 1138660423:
                    if (str.equals("ignorePermissionCheck")) {
                        Object argument = d10.argument("ignore");
                        n.b(argument);
                        boolean booleanValue = ((Boolean) argument).booleanValue();
                        this.f25817r = booleanValue;
                        valueOf = Boolean.valueOf(booleanValue);
                        eVar.g(valueOf);
                    }
                    return;
                case 1541932953:
                    if (str.equals("clearFileCache")) {
                        com.bumptech.glide.b.d(this.f25811a).c();
                        f25809s.b(new c(eVar));
                        return;
                    }
                    return;
                case 1789114534:
                    if (str.equals("openSetting")) {
                        this.f25813c.c(this.f25812b);
                        break;
                    } else {
                        return;
                    }
                case 1920532602:
                    if (!str.equals("releaseMemoryCache")) {
                        return;
                    }
                    break;
                default:
                    return;
            }
            valueOf = 1;
            eVar.g(valueOf);
        }
    }

    private final void m(b6.e eVar) {
        f25809s.b(new d(eVar));
    }

    private final void n(b6.e eVar) {
        MethodCall d10 = eVar.d();
        String str = d10.method;
        if (!n.a(str, "requestPermissionExtend")) {
            if (n.a(str, "presentLimited")) {
                Object argument = d10.argument("type");
                n.b(argument);
                this.f25813c.g(((Number) argument).intValue(), eVar);
                return;
            }
            return;
        }
        Object argument2 = d10.argument("androidPermission");
        n.b(argument2);
        Map map = (Map) argument2;
        Object obj = map.get("type");
        n.c(obj, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj).intValue();
        Object obj2 = map.get("mediaLocation");
        n.c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        this.f25813c.m(this.f25812b).j(new e(eVar, this, intValue, booleanValue)).h(this.f25811a, intValue, booleanValue);
    }

    public final void f(Activity activity) {
        this.f25812b = activity;
        this.f25814d.a(activity);
    }

    public final t5.e g() {
        return this.f25814d;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        n.e(call, "call");
        n.e(result, "result");
        b6.e eVar = new b6.e(result, call);
        String str = call.method;
        b.a aVar = s5.b.f25142a;
        n.b(str);
        if (aVar.a(str)) {
            l(eVar);
        } else if (aVar.b(str)) {
            n(eVar);
        } else {
            boolean z10 = this.f25817r;
            m(eVar);
        }
    }
}

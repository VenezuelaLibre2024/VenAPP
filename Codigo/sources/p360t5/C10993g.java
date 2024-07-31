package p360t5;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import ck.C2017b;
import ck.C2037v;
import com.bumptech.glide.ComponentCallbacks2C2116b;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.api.C5101a;
import dk.C7029q;
import dk.C7033s;
import dk.C7042z;
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
import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p024b6.C1662a;
import p024b6.C1666e;
import p280ok.InterfaceC9987a;
import p348s5.C10800b;
import p360t5.C10993g;
import p395v5.C11627a;
import p395v5.C11628b;
import p395v5.C11630d;
import p395v5.EnumC11629c;
import p413w5.AbstractC12074e;
import p435x5.C12287c;
import p458y5.C12605c;
import p458y5.InterfaceC12604b;

/* renamed from: t5.g */
/* loaded from: classes.dex */
public final class C10993g implements MethodChannel.MethodCallHandler {

    /* renamed from: s */
    public static final b f27953s = new b(null);

    /* renamed from: t */
    private static final ThreadPoolExecutor f27954t = new ThreadPoolExecutor(8, C5101a.e.API_PRIORITY_OTHER, 1, TimeUnit.MINUTES, new LinkedBlockingQueue());

    /* renamed from: a */
    private final Context f27955a;

    /* renamed from: b */
    private Activity f27956b;

    /* renamed from: c */
    private final C12605c f27957c;

    /* renamed from: d */
    private final C10991e f27958d;

    /* renamed from: e */
    private final C10992f f27959e;

    /* renamed from: f */
    private final C10988b f27960f;

    /* renamed from: r */
    private boolean f27961r;

    /* renamed from: t5.g$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC12604b {
        a() {
        }

        @Override // p458y5.InterfaceC12604b
        /* renamed from: a */
        public void mo33609a(List<String> needPermissions) {
            C9322n.m27781e(needPermissions, "needPermissions");
        }

        @Override // p458y5.InterfaceC12604b
        /* renamed from: b */
        public void mo33610b(List<String> deniedPermissions, List<String> grantedPermissions, List<String> needPermissions) {
            C9322n.m27781e(deniedPermissions, "deniedPermissions");
            C9322n.m27781e(grantedPermissions, "grantedPermissions");
            C9322n.m27781e(needPermissions, "needPermissions");
        }
    }

    /* renamed from: t5.g$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m33612c(InterfaceC9987a tmp0) {
            C9322n.m27781e(tmp0, "$tmp0");
            tmp0.invoke();
        }

        /* renamed from: b */
        public final void m33613b(final InterfaceC9987a<C2037v> runnable) {
            C9322n.m27781e(runnable, "runnable");
            C10993g.f27954t.execute(new Runnable() { // from class: t5.h
                @Override // java.lang.Runnable
                public final void run() {
                    C10993g.b.m33612c(InterfaceC9987a.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t5.g$c */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC9323o implements InterfaceC9987a<C2037v> {

        /* renamed from: b */
        final /* synthetic */ C1666e f27963b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C1666e c1666e) {
            super(0);
            this.f27963b = c1666e;
        }

        /* renamed from: a */
        public final void m33614a() {
            C10993g.this.f27960f.m33554d();
            this.f27963b.m9148g(1);
        }

        @Override // p280ok.InterfaceC9987a
        public /* bridge */ /* synthetic */ C2037v invoke() {
            m33614a();
            return C2037v.f8089a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t5.g$d */
    /* loaded from: classes.dex */
    public static final class d extends AbstractC9323o implements InterfaceC9987a<C2037v> {

        /* renamed from: b */
        final /* synthetic */ C1666e f27965b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C1666e c1666e) {
            super(0);
            this.f27965b = c1666e;
        }

        /* renamed from: a */
        public final void m33615a() {
            String m10329b;
            try {
                C10993g.this.m33603k(this.f27965b, C10993g.this.f27957c.m41464f(C10993g.this.f27955a));
            } catch (Exception e10) {
                MethodCall m9146d = this.f27965b.m9146d();
                String str = m9146d.method;
                Object obj = m9146d.arguments;
                C1666e c1666e = this.f27965b;
                String str2 = "The " + str + " method has an error: " + e10.getMessage();
                m10329b = C2017b.m10329b(e10);
                c1666e.m9149i(str2, m10329b, obj);
            }
        }

        @Override // p280ok.InterfaceC9987a
        public /* bridge */ /* synthetic */ C2037v invoke() {
            m33615a();
            return C2037v.f8089a;
        }
    }

    /* renamed from: t5.g$e */
    /* loaded from: classes.dex */
    public static final class e implements InterfaceC12604b {

        /* renamed from: a */
        final /* synthetic */ C1666e f27966a;

        /* renamed from: b */
        final /* synthetic */ C10993g f27967b;

        /* renamed from: c */
        final /* synthetic */ int f27968c;

        /* renamed from: d */
        final /* synthetic */ boolean f27969d;

        e(C1666e c1666e, C10993g c10993g, int i10, boolean z10) {
            this.f27966a = c1666e;
            this.f27967b = c10993g;
            this.f27968c = i10;
            this.f27969d = z10;
        }

        @Override // p458y5.InterfaceC12604b
        /* renamed from: a */
        public void mo33609a(List<String> needPermissions) {
            C9322n.m27781e(needPermissions, "needPermissions");
            this.f27966a.m9148g(Integer.valueOf(EnumC11629c.Authorized.m36450h()));
        }

        @Override // p458y5.InterfaceC12604b
        /* renamed from: b */
        public void mo33610b(List<String> deniedPermissions, List<String> grantedPermissions, List<String> needPermissions) {
            C9322n.m27781e(deniedPermissions, "deniedPermissions");
            C9322n.m27781e(grantedPermissions, "grantedPermissions");
            C9322n.m27781e(needPermissions, "needPermissions");
            this.f27966a.m9148g(Integer.valueOf(this.f27967b.f27957c.m41462d(this.f27968c, this.f27969d).m36450h()));
        }
    }

    public C10993g(Context applicationContext, BinaryMessenger messenger, Activity activity, C12605c permissionsUtils) {
        C9322n.m27781e(applicationContext, "applicationContext");
        C9322n.m27781e(messenger, "messenger");
        C9322n.m27781e(permissionsUtils, "permissionsUtils");
        this.f27955a = applicationContext;
        this.f27956b = activity;
        this.f27957c = permissionsUtils;
        permissionsUtils.m41469l(new a());
        this.f27958d = new C10991e(applicationContext, this.f27956b);
        this.f27959e = new C10992f(applicationContext, messenger, new Handler(Looper.getMainLooper()));
        this.f27960f = new C10988b(applicationContext);
    }

    /* renamed from: h */
    private final int m33600h(MethodCall methodCall, String str) {
        Object argument = methodCall.argument(str);
        C9322n.m27778b(argument);
        return ((Number) argument).intValue();
    }

    /* renamed from: i */
    private final AbstractC12074e m33601i(MethodCall methodCall) {
        Object argument = methodCall.argument("option");
        C9322n.m27778b(argument);
        return C12287c.f32921a.m39621e((Map) argument);
    }

    /* renamed from: j */
    private final String m33602j(MethodCall methodCall, String str) {
        Object argument = methodCall.argument(str);
        C9322n.m27778b(argument);
        return (String) argument;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0036. Please report as an issue. */
    /* renamed from: k */
    public final void m33603k(C1666e c1666e, boolean z10) {
        Object obj;
        Object m33565p;
        List<C11627a> m33559i;
        int m20590r;
        List<? extends Uri> m20630f0;
        boolean booleanValue;
        C12287c c12287c;
        List<C11628b> m20572e;
        int m20590r2;
        List<? extends Uri> m20630f02;
        MethodCall m9146d = c1666e.m9146d();
        String str = m9146d.method;
        if (str != null) {
            try {
                switch (str.hashCode()) {
                    case -2060338679:
                        obj = "save image error";
                        if (str.equals("saveImageWithPath")) {
                            try {
                                Object argument = m9146d.argument("path");
                                C9322n.m27778b(argument);
                                String str2 = (String) argument;
                                String str3 = (String) m9146d.argument("title");
                                if (str3 == null) {
                                    str3 = "";
                                }
                                String str4 = (String) m9146d.argument("desc");
                                if (str4 == null) {
                                    str4 = "";
                                }
                                String str5 = (String) m9146d.argument("relativePath");
                                C11627a m33573y = this.f27960f.m33573y(str2, str3, str4, str5 == null ? "" : str5);
                                if (m33573y == null) {
                                    c1666e.m9148g(null);
                                    return;
                                } else {
                                    c1666e.m9148g(C12287c.f32921a.m39617a(m33573y));
                                    return;
                                }
                            } catch (Exception e10) {
                                e = e10;
                                C1662a.m9134c(obj, e);
                                c1666e.m9148g(null);
                                return;
                            }
                        }
                        break;
                    case -1793329916:
                        if (str.equals("removeNoExistsAssets")) {
                            this.f27960f.m33571v(c1666e);
                            return;
                        }
                        break;
                    case -1491271588:
                        if (str.equals("getColumnNames")) {
                            this.f27960f.m33563m(c1666e);
                            return;
                        }
                        break;
                    case -1283288098:
                        if (str.equals("getLatLngAndroidQ")) {
                            Object argument2 = m9146d.argument(FacebookMediationAdapter.KEY_ID);
                            C9322n.m27778b(argument2);
                            m33565p = this.f27960f.m33565p((String) argument2);
                            c1666e.m9148g(m33565p);
                            return;
                        }
                        break;
                    case -1167306339:
                        if (str.equals("getAssetListPaged")) {
                            Object argument3 = m9146d.argument(FacebookMediationAdapter.KEY_ID);
                            C9322n.m27778b(argument3);
                            String str6 = (String) argument3;
                            Object argument4 = m9146d.argument("type");
                            C9322n.m27778b(argument4);
                            int intValue = ((Number) argument4).intValue();
                            Object argument5 = m9146d.argument("page");
                            C9322n.m27778b(argument5);
                            int intValue2 = ((Number) argument5).intValue();
                            Object argument6 = m9146d.argument("size");
                            C9322n.m27778b(argument6);
                            m33559i = this.f27960f.m33559i(str6, intValue, intValue2, ((Number) argument6).intValue(), m33601i(m9146d));
                            m33565p = C12287c.f32921a.m39618b(m33559i);
                            c1666e.m9148g(m33565p);
                            return;
                        }
                        break;
                    case -1165452507:
                        if (str.equals("getAssetListRange")) {
                            m33559i = this.f27960f.m33560j(m33602j(m9146d, FacebookMediationAdapter.KEY_ID), m33600h(m9146d, "type"), m33600h(m9146d, "start"), m33600h(m9146d, "end"), m33601i(m9146d));
                            m33565p = C12287c.f32921a.m39618b(m33559i);
                            c1666e.m9148g(m33565p);
                            return;
                        }
                        break;
                    case -1039689911:
                        if (str.equals("notify")) {
                            if (C9322n.m27777a((Boolean) m9146d.argument("notify"), Boolean.TRUE)) {
                                this.f27959e.m33589f();
                            } else {
                                this.f27959e.m33590g();
                            }
                            c1666e.m9148g(null);
                            return;
                        }
                        break;
                    case -1033607060:
                        if (str.equals("moveToTrash")) {
                            Object argument7 = m9146d.argument("ids");
                            C9322n.m27778b(argument7);
                            List list = (List) argument7;
                            if (Build.VERSION.SDK_INT < 30) {
                                C1662a.m9133b("The API 29 or lower have not the IS_TRASHED row in MediaStore.");
                                c1666e.m9149i("The api not support 29 or lower.", "", new UnsupportedOperationException("The api cannot be used in 29 or lower."));
                                return;
                            }
                            List list2 = list;
                            m20590r = C7033s.m20590r(list2, 10);
                            ArrayList arrayList = new ArrayList(m20590r);
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(this.f27960f.m33569t((String) it.next()));
                            }
                            m20630f0 = C7042z.m20630f0(arrayList);
                            this.f27958d.m33582f(m20630f0, c1666e);
                            return;
                        }
                        break;
                    case -948382752:
                        if (str.equals("requestCacheAssetsThumb")) {
                            Object argument8 = m9146d.argument("ids");
                            C9322n.m27778b(argument8);
                            Object argument9 = m9146d.argument("option");
                            C9322n.m27778b(argument9);
                            this.f27960f.m33572w((List) argument8, C11630d.f30256f.m36456a((Map) argument9), c1666e);
                            return;
                        }
                        break;
                    case -886445535:
                        if (str.equals("getFullFile")) {
                            Object argument10 = m9146d.argument(FacebookMediationAdapter.KEY_ID);
                            C9322n.m27778b(argument10);
                            String str7 = (String) argument10;
                            if (z10) {
                                Object argument11 = m9146d.argument("isOrigin");
                                C9322n.m27778b(argument11);
                                booleanValue = ((Boolean) argument11).booleanValue();
                            } else {
                                booleanValue = false;
                            }
                            this.f27960f.m33564o(str7, booleanValue, c1666e);
                            return;
                        }
                        break;
                    case -626940993:
                        if (str.equals("moveAssetToPath")) {
                            Object argument12 = m9146d.argument("assetId");
                            C9322n.m27778b(argument12);
                            Object argument13 = m9146d.argument("albumId");
                            C9322n.m27778b(argument13);
                            this.f27960f.m33570u((String) argument12, (String) argument13, c1666e);
                            return;
                        }
                        break;
                    case -151967598:
                        if (str.equals("fetchPathProperties")) {
                            Object argument14 = m9146d.argument(FacebookMediationAdapter.KEY_ID);
                            C9322n.m27778b(argument14);
                            Object argument15 = m9146d.argument("type");
                            C9322n.m27778b(argument15);
                            C11628b m33557g = this.f27960f.m33557g((String) argument14, ((Number) argument15).intValue(), m33601i(m9146d));
                            if (m33557g != null) {
                                c12287c = C12287c.f32921a;
                                m20572e = C7029q.m20572e(m33557g);
                                m33565p = c12287c.m39619c(m20572e);
                                c1666e.m9148g(m33565p);
                                return;
                            }
                            c1666e.m9148g(null);
                            return;
                        }
                        break;
                    case 163601886:
                        if (str.equals("saveImage")) {
                            try {
                                Object argument16 = m9146d.argument("image");
                                C9322n.m27778b(argument16);
                                byte[] bArr = (byte[]) argument16;
                                String str8 = (String) m9146d.argument("title");
                                if (str8 == null) {
                                    str8 = "";
                                }
                                String str9 = (String) m9146d.argument("desc");
                                if (str9 == null) {
                                    str9 = "";
                                }
                                String str10 = (String) m9146d.argument("relativePath");
                                C11627a m33574z = this.f27960f.m33574z(bArr, str8, str9, str10 == null ? "" : str10);
                                if (m33574z == null) {
                                    c1666e.m9148g(null);
                                    return;
                                } else {
                                    c1666e.m9148g(C12287c.f32921a.m39617a(m33574z));
                                    return;
                                }
                            } catch (Exception e11) {
                                e = e11;
                                obj = "save image error";
                                C1662a.m9134c(obj, e);
                                c1666e.m9148g(null);
                                return;
                            }
                        }
                        break;
                    case 175491326:
                        if (str.equals("saveVideo")) {
                            try {
                                Object argument17 = m9146d.argument("path");
                                C9322n.m27778b(argument17);
                                String str11 = (String) argument17;
                                Object argument18 = m9146d.argument("title");
                                C9322n.m27778b(argument18);
                                String str12 = (String) argument18;
                                String str13 = (String) m9146d.argument("desc");
                                if (str13 == null) {
                                    str13 = "";
                                }
                                String str14 = (String) m9146d.argument("relativePath");
                                C11627a m33550A = this.f27960f.m33550A(str11, str12, str13, str14 == null ? "" : str14);
                                if (m33550A == null) {
                                    c1666e.m9148g(null);
                                    return;
                                } else {
                                    c1666e.m9148g(C12287c.f32921a.m39617a(m33550A));
                                    return;
                                }
                            } catch (Exception e12) {
                                C1662a.m9134c("save video error", e12);
                                break;
                            }
                        }
                        break;
                    case 326673488:
                        if (str.equals("fetchEntityProperties")) {
                            Object argument19 = m9146d.argument(FacebookMediationAdapter.KEY_ID);
                            C9322n.m27778b(argument19);
                            C11627a m33556f = this.f27960f.m33556f((String) argument19);
                            c1666e.m9148g(m33556f != null ? C12287c.f32921a.m39617a(m33556f) : null);
                            return;
                        }
                        break;
                    case 624480877:
                        if (str.equals("getAssetsByRange")) {
                            this.f27960f.m33562l(c1666e, m33601i(m9146d), m33600h(m9146d, "start"), m33600h(m9146d, "end"), m33600h(m9146d, "type"));
                            return;
                        }
                        break;
                    case 857200492:
                        if (str.equals("assetExists")) {
                            Object argument20 = m9146d.argument(FacebookMediationAdapter.KEY_ID);
                            C9322n.m27778b(argument20);
                            this.f27960f.m33552b((String) argument20, c1666e);
                            return;
                        }
                        break;
                    case 972925196:
                        if (str.equals("cancelCacheRequests")) {
                            this.f27960f.m33553c();
                            c1666e.m9148g(null);
                            return;
                        }
                        break;
                    case 1063055279:
                        if (str.equals("getOriginBytes")) {
                            Object argument21 = m9146d.argument(FacebookMediationAdapter.KEY_ID);
                            C9322n.m27778b(argument21);
                            this.f27960f.m33567r((String) argument21, c1666e, z10);
                            return;
                        }
                        break;
                    case 1150344167:
                        if (str.equals("deleteWithIds")) {
                            Object argument22 = m9146d.argument("ids");
                            C9322n.m27778b(argument22);
                            List<String> list3 = (List) argument22;
                            if (Build.VERSION.SDK_INT < 30) {
                                this.f27958d.m33580b(list3);
                                c1666e.m9148g(list3);
                                return;
                            }
                            List<String> list4 = list3;
                            m20590r2 = C7033s.m20590r(list4, 10);
                            ArrayList arrayList2 = new ArrayList(m20590r2);
                            Iterator<T> it2 = list4.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(this.f27960f.m33569t((String) it2.next()));
                            }
                            m20630f02 = C7042z.m20630f0(arrayList2);
                            this.f27958d.m33581c(m20630f02, c1666e);
                            return;
                        }
                        break;
                    case 1177116769:
                        if (str.equals("getMediaUrl")) {
                            Object argument23 = m9146d.argument(FacebookMediationAdapter.KEY_ID);
                            C9322n.m27778b(argument23);
                            Object argument24 = m9146d.argument("type");
                            C9322n.m27778b(argument24);
                            m33565p = this.f27960f.m33566q(Long.parseLong((String) argument23), ((Number) argument24).intValue());
                            c1666e.m9148g(m33565p);
                            return;
                        }
                        break;
                    case 1375013309:
                        if (str.equals("getAssetPathList")) {
                            Object argument25 = m9146d.argument("type");
                            C9322n.m27778b(argument25);
                            int intValue3 = ((Number) argument25).intValue();
                            Object argument26 = m9146d.argument("hasAll");
                            C9322n.m27778b(argument26);
                            boolean booleanValue2 = ((Boolean) argument26).booleanValue();
                            AbstractC12074e m33601i = m33601i(m9146d);
                            Object argument27 = m9146d.argument("onlyAll");
                            C9322n.m27778b(argument27);
                            m20572e = this.f27960f.m33561k(intValue3, booleanValue2, ((Boolean) argument27).booleanValue(), m33601i);
                            c12287c = C12287c.f32921a;
                            m33565p = c12287c.m39619c(m20572e);
                            c1666e.m9148g(m33565p);
                            return;
                        }
                        break;
                    case 1477946491:
                        if (str.equals("copyAsset")) {
                            Object argument28 = m9146d.argument("assetId");
                            C9322n.m27778b(argument28);
                            Object argument29 = m9146d.argument("galleryId");
                            C9322n.m27778b(argument29);
                            this.f27960f.m33555e((String) argument28, (String) argument29, c1666e);
                            return;
                        }
                        break;
                    case 1806009333:
                        if (str.equals("getAssetCount")) {
                            this.f27960f.m33558h(c1666e, m33601i(m9146d), m33600h(m9146d, "type"));
                            return;
                        }
                        break;
                    case 1966168096:
                        if (str.equals("getThumb")) {
                            Object argument30 = m9146d.argument(FacebookMediationAdapter.KEY_ID);
                            C9322n.m27778b(argument30);
                            Object argument31 = m9146d.argument("option");
                            C9322n.m27778b(argument31);
                            this.f27960f.m33568s((String) argument30, C11630d.f30256f.m36456a((Map) argument31), c1666e);
                            return;
                        }
                        break;
                }
            } catch (Exception e13) {
                C1662a.m9134c("deleteWithIds failed", e13);
                C1666e.m9144j(c1666e, "deleteWithIds failed", null, null, 6, null);
                return;
            }
        }
        c1666e.m9147e();
    }

    /* renamed from: l */
    private final void m33604l(C1666e c1666e) {
        Object valueOf;
        MethodCall m9146d = c1666e.m9146d();
        String str = m9146d.method;
        if (str != null) {
            switch (str.hashCode()) {
                case -1914421335:
                    if (str.equals("systemVersion")) {
                        valueOf = String.valueOf(Build.VERSION.SDK_INT);
                        c1666e.m9148g(valueOf);
                    }
                    return;
                case -582375106:
                    if (str.equals("forceOldApi")) {
                        this.f27960f.m33551B(true);
                        break;
                    } else {
                        return;
                    }
                case 107332:
                    if (str.equals("log")) {
                        C1662a c1662a = C1662a.f7047a;
                        Boolean bool = (Boolean) m9146d.arguments();
                        c1662a.m9138g(bool == null ? false : bool.booleanValue());
                        break;
                    } else {
                        return;
                    }
                case 1138660423:
                    if (str.equals("ignorePermissionCheck")) {
                        Object argument = m9146d.argument("ignore");
                        C9322n.m27778b(argument);
                        boolean booleanValue = ((Boolean) argument).booleanValue();
                        this.f27961r = booleanValue;
                        valueOf = Boolean.valueOf(booleanValue);
                        c1666e.m9148g(valueOf);
                    }
                    return;
                case 1541932953:
                    if (str.equals("clearFileCache")) {
                        ComponentCallbacks2C2116b.m10641d(this.f27955a).m10649c();
                        f27953s.m33613b(new c(c1666e));
                        return;
                    }
                    return;
                case 1789114534:
                    if (str.equals("openSetting")) {
                        this.f27957c.m41461c(this.f27956b);
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
            c1666e.m9148g(valueOf);
        }
    }

    /* renamed from: m */
    private final void m33605m(C1666e c1666e) {
        f27953s.m33613b(new d(c1666e));
    }

    /* renamed from: n */
    private final void m33606n(C1666e c1666e) {
        MethodCall m9146d = c1666e.m9146d();
        String str = m9146d.method;
        if (!C9322n.m27777a(str, "requestPermissionExtend")) {
            if (C9322n.m27777a(str, "presentLimited")) {
                Object argument = m9146d.argument("type");
                C9322n.m27778b(argument);
                this.f27957c.m41465g(((Number) argument).intValue(), c1666e);
                return;
            }
            return;
        }
        Object argument2 = m9146d.argument("androidPermission");
        C9322n.m27778b(argument2);
        Map map = (Map) argument2;
        Object obj = map.get("type");
        C9322n.m27779c(obj, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj).intValue();
        Object obj2 = map.get("mediaLocation");
        C9322n.m27779c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        this.f27957c.m41470m(this.f27956b).m41467j(new e(c1666e, this, intValue, booleanValue)).m41466h(this.f27955a, intValue, booleanValue);
    }

    /* renamed from: f */
    public final void m33607f(Activity activity) {
        this.f27956b = activity;
        this.f27958d.m33579a(activity);
    }

    /* renamed from: g */
    public final C10991e m33608g() {
        return this.f27958d;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        C9322n.m27781e(call, "call");
        C9322n.m27781e(result, "result");
        C1666e c1666e = new C1666e(result, call);
        String str = call.method;
        C10800b.a aVar = C10800b.f27261a;
        C9322n.m27778b(str);
        if (aVar.m32910a(str)) {
            m33604l(c1666e);
        } else if (aVar.m32911b(str)) {
            m33606n(c1666e);
        } else {
            boolean z10 = this.f27961r;
            m33605m(c1666e);
        }
    }
}

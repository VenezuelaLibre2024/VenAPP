package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.internal.util.common.FbValidationUtils;
import com.facebook.login.EnumC4661e;
import com.facebook.login.EnumC4670i0;
import dk.C7021m;
import dk.C7031r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p007a5.C0033a;
import p152i4.C7799e0;
import p152i4.C7824r;
import p152i4.C7828t;
import p450xk.C12524p;

/* renamed from: com.facebook.internal.e0 */
/* loaded from: classes.dex */
public final class C4616e0 {

    /* renamed from: a */
    public static final C4616e0 f8705a;

    /* renamed from: b */
    private static final String f8706b;

    /* renamed from: c */
    private static final List<e> f8707c;

    /* renamed from: d */
    private static final List<e> f8708d;

    /* renamed from: e */
    private static final Map<String, List<e>> f8709e;

    /* renamed from: f */
    private static final AtomicBoolean f8710f;

    /* renamed from: g */
    private static final Integer[] f8711g;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.internal.e0$a */
    /* loaded from: classes.dex */
    public static final class a extends e {
        @Override // com.facebook.internal.C4616e0.e
        /* renamed from: c */
        public /* bridge */ /* synthetic */ String mo11181c() {
            return (String) m11183g();
        }

        @Override // com.facebook.internal.C4616e0.e
        /* renamed from: d */
        public String mo11182d() {
            return "com.facebook.arstudio.player";
        }

        /* renamed from: g */
        public Void m11183g() {
            return null;
        }
    }

    /* renamed from: com.facebook.internal.e0$b */
    /* loaded from: classes.dex */
    private static final class b extends e {
        @Override // com.facebook.internal.C4616e0.e
        /* renamed from: c */
        public String mo11181c() {
            return "com.instagram.platform.AppAuthorizeActivity";
        }

        @Override // com.facebook.internal.C4616e0.e
        /* renamed from: d */
        public String mo11182d() {
            return "com.instagram.android";
        }

        @Override // com.facebook.internal.C4616e0.e
        /* renamed from: e */
        public String mo11184e() {
            return "token,signed_request,graph_domain,granted_scopes";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.internal.e0$c */
    /* loaded from: classes.dex */
    public static final class c extends e {
        /* renamed from: g */
        private final boolean m11185g() {
            return C7799e0.m23860l().getApplicationInfo().targetSdkVersion >= 30;
        }

        @Override // com.facebook.internal.C4616e0.e
        /* renamed from: c */
        public String mo11181c() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // com.facebook.internal.C4616e0.e
        /* renamed from: d */
        public String mo11182d() {
            return FbValidationUtils.FB_PACKAGE;
        }

        @Override // com.facebook.internal.C4616e0.e
        /* renamed from: f */
        public void mo11186f() {
            if (m11185g()) {
                Log.w(C4616e0.m11157c(), "Apps that target Android API 30+ (Android 11+) cannot call Facebook native apps unless the package visibility needs are declared. Please follow https://developers.facebook.com/docs/android/troubleshooting/#faq_267321845055988 to make the declaration.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.internal.e0$d */
    /* loaded from: classes.dex */
    public static final class d extends e {
        @Override // com.facebook.internal.C4616e0.e
        /* renamed from: c */
        public /* bridge */ /* synthetic */ String mo11181c() {
            return (String) m11187g();
        }

        @Override // com.facebook.internal.C4616e0.e
        /* renamed from: d */
        public String mo11182d() {
            return "com.facebook.orca";
        }

        /* renamed from: g */
        public Void m11187g() {
            return null;
        }
    }

    /* renamed from: com.facebook.internal.e0$e */
    /* loaded from: classes.dex */
    public static abstract class e {

        /* renamed from: a */
        private TreeSet<Integer> f8712a;

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0019, code lost:
        
            if (kotlin.jvm.internal.C9322n.m27777a(r2 == null ? null : java.lang.Boolean.valueOf(r2.isEmpty()), java.lang.Boolean.FALSE) == false) goto L11;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0033 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {, blocks: (B:20:0x0003, B:24:0x0013, B:4:0x0023, B:6:0x0027, B:11:0x0033, B:26:0x000b, B:3:0x001b), top: B:19:0x0003 }] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final synchronized void m11188a(boolean r2) {
            /*
                r1 = this;
                monitor-enter(r1)
                if (r2 != 0) goto L1b
                java.util.TreeSet<java.lang.Integer> r2 = r1.f8712a     // Catch: java.lang.Throwable -> L38
                if (r2 == 0) goto L1b
                if (r2 != 0) goto Lb
                r2 = 0
                goto L13
            Lb:
                boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L38
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L38
            L13:
                java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L38
                boolean r2 = kotlin.jvm.internal.C9322n.m27777a(r2, r0)     // Catch: java.lang.Throwable -> L38
                if (r2 != 0) goto L23
            L1b:
                com.facebook.internal.e0 r2 = com.facebook.internal.C4616e0.f8705a     // Catch: java.lang.Throwable -> L38
                java.util.TreeSet r2 = com.facebook.internal.C4616e0.m11156b(r2, r1)     // Catch: java.lang.Throwable -> L38
                r1.f8712a = r2     // Catch: java.lang.Throwable -> L38
            L23:
                java.util.TreeSet<java.lang.Integer> r2 = r1.f8712a     // Catch: java.lang.Throwable -> L38
                if (r2 == 0) goto L30
                boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L38
                if (r2 == 0) goto L2e
                goto L30
            L2e:
                r2 = 0
                goto L31
            L30:
                r2 = 1
            L31:
                if (r2 == 0) goto L36
                r1.mo11186f()     // Catch: java.lang.Throwable -> L38
            L36:
                monitor-exit(r1)
                return
            L38:
                r2 = move-exception
                monitor-exit(r1)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C4616e0.e.m11188a(boolean):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
        
            if (kotlin.jvm.internal.C9322n.m27777a(r0 == null ? null : java.lang.Boolean.valueOf(r0.isEmpty()), java.lang.Boolean.FALSE) == false) goto L9;
         */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.TreeSet<java.lang.Integer> m11189b() {
            /*
                r2 = this;
                java.util.TreeSet<java.lang.Integer> r0 = r2.f8712a
                if (r0 == 0) goto L18
                if (r0 != 0) goto L8
                r0 = 0
                goto L10
            L8:
                boolean r0 = r0.isEmpty()
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            L10:
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                boolean r0 = kotlin.jvm.internal.C9322n.m27777a(r0, r1)
                if (r0 != 0) goto L1c
            L18:
                r0 = 0
                r2.m11188a(r0)
            L1c:
                java.util.TreeSet<java.lang.Integer> r0 = r2.f8712a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C4616e0.e.m11189b():java.util.TreeSet");
        }

        /* renamed from: c */
        public abstract String mo11181c();

        /* renamed from: d */
        public abstract String mo11182d();

        /* renamed from: e */
        public String mo11184e() {
            return "id_token,token,signed_request,graph_domain";
        }

        /* renamed from: f */
        public void mo11186f() {
        }
    }

    /* renamed from: com.facebook.internal.e0$f */
    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: c */
        public static final a f8713c = new a(null);

        /* renamed from: a */
        private e f8714a;

        /* renamed from: b */
        private int f8715b;

        /* renamed from: com.facebook.internal.e0$f$a */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(C9315g c9315g) {
                this();
            }

            /* renamed from: a */
            public final f m11193a(e eVar, int i10) {
                f fVar = new f(null);
                fVar.f8714a = eVar;
                fVar.f8715b = i10;
                return fVar;
            }

            /* renamed from: b */
            public final f m11194b() {
                f fVar = new f(null);
                fVar.f8715b = -1;
                return fVar;
            }
        }

        private f() {
        }

        public /* synthetic */ f(C9315g c9315g) {
            this();
        }

        /* renamed from: c */
        public final int m11192c() {
            return this.f8715b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.internal.e0$g */
    /* loaded from: classes.dex */
    public static final class g extends e {
        @Override // com.facebook.internal.C4616e0.e
        /* renamed from: c */
        public String mo11181c() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // com.facebook.internal.C4616e0.e
        /* renamed from: d */
        public String mo11182d() {
            return "com.facebook.wakizashi";
        }
    }

    static {
        C4616e0 c4616e0 = new C4616e0();
        f8705a = c4616e0;
        f8706b = C4616e0.class.getName();
        f8707c = c4616e0.m11160f();
        f8708d = c4616e0.m11159e();
        f8709e = c4616e0.m11158d();
        f8710f = new AtomicBoolean(false);
        f8711g = new Integer[]{20210906, 20171115, 20170417, 20170411, 20170213, 20161017, 20160327, 20150702, 20150401, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140313, 20140204, 20131107, 20131024, 20130618, 20130502, 20121101};
    }

    private C4616e0() {
    }

    /* renamed from: A */
    public static final Intent m11154A(Context context, Intent intent, e eVar) {
        ResolveInfo resolveService;
        if (C0033a.m107d(C4616e0.class)) {
            return null;
        }
        try {
            C9322n.m27781e(context, "context");
            if (intent == null || (resolveService = context.getPackageManager().resolveService(intent, 0)) == null) {
                return null;
            }
            C4627k c4627k = C4627k.f8746a;
            String str = resolveService.serviceInfo.packageName;
            C9322n.m27780d(str, "resolveInfo.serviceInfo.packageName");
            if (C4627k.m11242a(context, str)) {
                return intent;
            }
            return null;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4616e0.class);
            return null;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ TreeSet m11156b(C4616e0 c4616e0, e eVar) {
        if (C0033a.m107d(C4616e0.class)) {
            return null;
        }
        try {
            return c4616e0.m11169o(eVar);
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4616e0.class);
            return null;
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ String m11157c() {
        if (C0033a.m107d(C4616e0.class)) {
            return null;
        }
        try {
            return f8706b;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4616e0.class);
            return null;
        }
    }

    /* renamed from: d */
    private final Map<String, List<e>> m11158d() {
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new d());
            List<e> list = f8707c;
            hashMap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.FEED_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.LIKE_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList);
            hashMap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList);
            hashMap.put("com.facebook.platform.action.request.CAMERA_EFFECT", f8708d);
            hashMap.put("com.facebook.platform.action.request.SHARE_STORY", list);
            return hashMap;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }

    /* renamed from: e */
    private final List<e> m11159e() {
        ArrayList m20578f;
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            m20578f = C7031r.m20578f(new a());
            m20578f.addAll(m11160f());
            return m20578f;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }

    /* renamed from: f */
    private final List<e> m11160f() {
        ArrayList m20578f;
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            m20578f = C7031r.m20578f(new c(), new g());
            return m20578f;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }

    /* renamed from: g */
    private final Uri m11161g(e eVar) {
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            Uri parse = Uri.parse("content://" + eVar.mo11182d() + ".provider.PlatformProvider/versions");
            C9322n.m27780d(parse, "parse(CONTENT_SCHEME + appInfo.getPackage() + PLATFORM_PROVIDER_VERSIONS)");
            return parse;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }

    /* renamed from: h */
    public static final int m11162h(TreeSet<Integer> treeSet, int i10, int[] versionSpec) {
        if (C0033a.m107d(C4616e0.class)) {
            return 0;
        }
        try {
            C9322n.m27781e(versionSpec, "versionSpec");
            if (treeSet == null) {
                return -1;
            }
            int length = versionSpec.length - 1;
            Iterator<Integer> descendingIterator = treeSet.descendingIterator();
            int i11 = -1;
            while (descendingIterator.hasNext()) {
                Integer fbAppVersion = descendingIterator.next();
                C9322n.m27780d(fbAppVersion, "fbAppVersion");
                i11 = Math.max(i11, fbAppVersion.intValue());
                while (length >= 0 && versionSpec[length] > fbAppVersion.intValue()) {
                    length--;
                }
                if (length < 0) {
                    return -1;
                }
                if (versionSpec[length] == fbAppVersion.intValue()) {
                    if (length % 2 == 0) {
                        return Math.min(i11, i10);
                    }
                    return -1;
                }
            }
            return -1;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4616e0.class);
            return 0;
        }
    }

    /* renamed from: i */
    public static final Bundle m11163i(C7824r c7824r) {
        if (C0033a.m107d(C4616e0.class) || c7824r == null) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("error_description", c7824r.toString());
            if (c7824r instanceof C7828t) {
                bundle.putString("error_type", "UserCanceled");
            }
            return bundle;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4616e0.class);
            return null;
        }
    }

    /* renamed from: j */
    public static final Intent m11164j(Context context, String applicationId, Collection<String> permissions, String e2e, boolean z10, boolean z11, EnumC4661e defaultAudience, String clientState, String authType, String str, boolean z12, boolean z13, boolean z14) {
        if (C0033a.m107d(C4616e0.class)) {
            return null;
        }
        try {
            C9322n.m27781e(context, "context");
            C9322n.m27781e(applicationId, "applicationId");
            C9322n.m27781e(permissions, "permissions");
            C9322n.m27781e(e2e, "e2e");
            C9322n.m27781e(defaultAudience, "defaultAudience");
            C9322n.m27781e(clientState, "clientState");
            C9322n.m27781e(authType, "authType");
            b bVar = new b();
            return m11180z(context, f8705a.m11165k(bVar, applicationId, permissions, e2e, z11, defaultAudience, clientState, authType, false, str, z12, EnumC4670i0.INSTAGRAM, z13, z14, "", null, null), bVar);
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4616e0.class);
            return null;
        }
    }

    /* renamed from: k */
    private final Intent m11165k(e eVar, String str, Collection<String> collection, String str2, boolean z10, EnumC4661e enumC4661e, String str3, String str4, boolean z11, String str5, boolean z12, EnumC4670i0 enumC4670i0, boolean z13, boolean z14, String str6, String str7, String str8) {
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            String mo11181c = eVar.mo11181c();
            if (mo11181c == null) {
                return null;
            }
            Intent putExtra = new Intent().setClassName(eVar.mo11182d(), mo11181c).putExtra("client_id", str);
            C9322n.m27780d(putExtra, "Intent()\n            .setClassName(appInfo.getPackage(), activityName)\n            .putExtra(FACEBOOK_PROXY_AUTH_APP_ID_KEY, applicationId)");
            putExtra.putExtra("facebook_sdk_version", C7799e0.m23829B());
            if (!C4634n0.m11302e0(collection)) {
                putExtra.putExtra("scope", TextUtils.join(",", collection));
            }
            if (!C4634n0.m11300d0(str2)) {
                putExtra.putExtra("e2e", str2);
            }
            putExtra.putExtra("state", str3);
            putExtra.putExtra("response_type", eVar.mo11184e());
            putExtra.putExtra("nonce", str6);
            putExtra.putExtra("return_scopes", "true");
            if (z10) {
                putExtra.putExtra("default_audience", enumC4661e.m11512h());
            }
            putExtra.putExtra("legacy_override", C7799e0.m23871w());
            putExtra.putExtra("auth_type", str4);
            if (z11) {
                putExtra.putExtra("fail_on_logged_out", true);
            }
            putExtra.putExtra("messenger_page_id", str5);
            putExtra.putExtra("reset_messenger_state", z12);
            if (z13) {
                putExtra.putExtra("fx_app", enumC4670i0.toString());
            }
            if (z14) {
                putExtra.putExtra("skip_dedupe", true);
            }
            return putExtra;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }

    /* renamed from: l */
    public static final Intent m11166l(Context context) {
        if (C0033a.m107d(C4616e0.class)) {
            return null;
        }
        try {
            C9322n.m27781e(context, "context");
            for (e eVar : f8707c) {
                Intent m11154A = m11154A(context, new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(eVar.mo11182d()).addCategory("android.intent.category.DEFAULT"), eVar);
                if (m11154A != null) {
                    return m11154A;
                }
            }
            return null;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4616e0.class);
            return null;
        }
    }

    /* renamed from: m */
    public static final Intent m11167m(Intent requestIntent, Bundle bundle, C7824r c7824r) {
        if (C0033a.m107d(C4616e0.class)) {
            return null;
        }
        try {
            C9322n.m27781e(requestIntent, "requestIntent");
            UUID m11170p = m11170p(requestIntent);
            if (m11170p == null) {
                return null;
            }
            Intent intent = new Intent();
            intent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", m11176v(requestIntent));
            Bundle bundle2 = new Bundle();
            bundle2.putString("action_id", m11170p.toString());
            if (c7824r != null) {
                bundle2.putBundle("error", m11163i(c7824r));
            }
            intent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
            if (bundle != null) {
                intent.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
            }
            return intent;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4616e0.class);
            return null;
        }
    }

    /* renamed from: n */
    public static final List<Intent> m11168n(Context context, String applicationId, Collection<String> permissions, String e2e, boolean z10, boolean z11, EnumC4661e defaultAudience, String clientState, String authType, boolean z12, String str, boolean z13, boolean z14, boolean z15, String str2, String str3, String str4) {
        if (C0033a.m107d(C4616e0.class)) {
            return null;
        }
        try {
            C9322n.m27781e(applicationId, "applicationId");
            C9322n.m27781e(permissions, "permissions");
            C9322n.m27781e(e2e, "e2e");
            C9322n.m27781e(defaultAudience, "defaultAudience");
            C9322n.m27781e(clientState, "clientState");
            C9322n.m27781e(authType, "authType");
            List<e> list = f8707c;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ArrayList arrayList2 = arrayList;
                Intent m11165k = f8705a.m11165k((e) it.next(), applicationId, permissions, e2e, z11, defaultAudience, clientState, authType, z12, str, z13, EnumC4670i0.FACEBOOK, z14, z15, str2, str3, str4);
                if (m11165k != null) {
                    arrayList2.add(m11165k);
                }
                arrayList = arrayList2;
            }
            return arrayList;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4616e0.class);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0078 A[Catch: all -> 0x0085, TRY_ENTER, TryCatch #0 {all -> 0x0085, blocks: (B:6:0x000c, B:30:0x0084, B:31:0x0081, B:18:0x0078), top: B:5:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059 A[EXC_TOP_SPLITTER, LOOP:0: B:20:0x0059->B:23:0x005f, LOOP_START, SYNTHETIC] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.TreeSet<java.lang.Integer> m11169o(com.facebook.internal.C4616e0.e r13) {
        /*
            r12 = this;
            java.lang.String r0 = "version"
            java.lang.String r1 = "Failed to query content resolver."
            boolean r2 = p007a5.C0033a.m107d(r12)
            r3 = 0
            if (r2 == 0) goto Lc
            return r3
        Lc:
            java.util.TreeSet r2 = new java.util.TreeSet     // Catch: java.lang.Throwable -> L85
            r2.<init>()     // Catch: java.lang.Throwable -> L85
            android.content.Context r4 = p152i4.C7799e0.m23860l()     // Catch: java.lang.Throwable -> L85
            android.content.ContentResolver r5 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L85
            java.lang.String[] r7 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L85
            android.net.Uri r6 = r12.m11161g(r13)     // Catch: java.lang.Throwable -> L85
            android.content.Context r4 = p152i4.C7799e0.m23860l()     // Catch: java.lang.Throwable -> L7c
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r13 = r13.mo11182d()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r8 = ".provider.PlatformProvider"
            java.lang.String r13 = kotlin.jvm.internal.C9322n.m27787k(r13, r8)     // Catch: java.lang.Throwable -> L7c
            r8 = 0
            android.content.pm.ProviderInfo r13 = r4.resolveContentProvider(r13, r8)     // Catch: java.lang.RuntimeException -> L39 java.lang.Throwable -> L7c
            goto L40
        L39:
            r13 = move-exception
            java.lang.String r4 = com.facebook.internal.C4616e0.f8706b     // Catch: java.lang.Throwable -> L7c
            android.util.Log.e(r4, r1, r13)     // Catch: java.lang.Throwable -> L7c
            r13 = r3
        L40:
            if (r13 == 0) goto L74
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r13 = r5.query(r6, r7, r8, r9, r10)     // Catch: java.lang.IllegalArgumentException -> L4a java.lang.SecurityException -> L4d java.lang.NullPointerException -> L53 java.lang.Throwable -> L7c
            goto L57
        L4a:
            java.lang.String r13 = com.facebook.internal.C4616e0.f8706b     // Catch: java.lang.Throwable -> L7c
            goto L4f
        L4d:
            java.lang.String r13 = com.facebook.internal.C4616e0.f8706b     // Catch: java.lang.Throwable -> L7c
        L4f:
            android.util.Log.e(r13, r1)     // Catch: java.lang.Throwable -> L7c
            goto L56
        L53:
            java.lang.String r13 = com.facebook.internal.C4616e0.f8706b     // Catch: java.lang.Throwable -> L7c
            goto L4f
        L56:
            r13 = r3
        L57:
            if (r13 == 0) goto L75
        L59:
            boolean r1 = r13.moveToNext()     // Catch: java.lang.Throwable -> L6f
            if (r1 == 0) goto L75
            int r1 = r13.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L6f
            int r1 = r13.getInt(r1)     // Catch: java.lang.Throwable -> L6f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L6f
            r2.add(r1)     // Catch: java.lang.Throwable -> L6f
            goto L59
        L6f:
            r0 = move-exception
            r11 = r0
            r0 = r13
            r13 = r11
            goto L7e
        L74:
            r13 = r3
        L75:
            if (r13 != 0) goto L78
            goto L7b
        L78:
            r13.close()     // Catch: java.lang.Throwable -> L85
        L7b:
            return r2
        L7c:
            r13 = move-exception
            r0 = r3
        L7e:
            if (r0 != 0) goto L81
            goto L84
        L81:
            r0.close()     // Catch: java.lang.Throwable -> L85
        L84:
            throw r13     // Catch: java.lang.Throwable -> L85
        L85:
            r13 = move-exception
            p007a5.C0033a.m105b(r13, r12)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C4616e0.m11169o(com.facebook.internal.e0$e):java.util.TreeSet");
    }

    /* renamed from: p */
    public static final UUID m11170p(Intent intent) {
        String stringExtra;
        if (C0033a.m107d(C4616e0.class) || intent == null) {
            return null;
        }
        try {
            if (m11177w(m11176v(intent))) {
                Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
                stringExtra = bundleExtra != null ? bundleExtra.getString("action_id") : null;
            } else {
                stringExtra = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
            }
            if (stringExtra == null) {
                return null;
            }
            try {
                return UUID.fromString(stringExtra);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4616e0.class);
            return null;
        }
    }

    /* renamed from: q */
    public static final C7824r m11171q(Bundle bundle) {
        boolean m41037r;
        if (C0033a.m107d(C4616e0.class) || bundle == null) {
            return null;
        }
        try {
            String string = bundle.getString("error_type");
            if (string == null) {
                string = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
            }
            String string2 = bundle.getString("error_description");
            if (string2 == null) {
                string2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
            }
            if (string != null) {
                m41037r = C12524p.m41037r(string, "UserCanceled", true);
                if (m41037r) {
                    return new C7828t(string2);
                }
            }
            return new C7824r(string2);
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4616e0.class);
            return null;
        }
    }

    /* renamed from: r */
    private final f m11172r(List<? extends e> list, int[] iArr) {
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            m11178x();
            if (list == null) {
                return f.f8713c.m11194b();
            }
            for (e eVar : list) {
                int m11162h = m11162h(eVar.m11189b(), m11174t(), iArr);
                if (m11162h != -1) {
                    return f.f8713c.m11193a(eVar, m11162h);
                }
            }
            return f.f8713c.m11194b();
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }

    /* renamed from: s */
    public static final int m11173s(int i10) {
        if (C0033a.m107d(C4616e0.class)) {
            return 0;
        }
        try {
            return f8705a.m11172r(f8707c, new int[]{i10}).m11192c();
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4616e0.class);
            return 0;
        }
    }

    /* renamed from: t */
    public static final int m11174t() {
        if (C0033a.m107d(C4616e0.class)) {
            return 0;
        }
        try {
            return f8711g[0].intValue();
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4616e0.class);
            return 0;
        }
    }

    /* renamed from: u */
    public static final Bundle m11175u(Intent intent) {
        if (C0033a.m107d(C4616e0.class)) {
            return null;
        }
        try {
            C9322n.m27781e(intent, "intent");
            return !m11177w(m11176v(intent)) ? intent.getExtras() : intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4616e0.class);
            return null;
        }
    }

    /* renamed from: v */
    public static final int m11176v(Intent intent) {
        if (C0033a.m107d(C4616e0.class)) {
            return 0;
        }
        try {
            C9322n.m27781e(intent, "intent");
            return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4616e0.class);
            return 0;
        }
    }

    /* renamed from: w */
    public static final boolean m11177w(int i10) {
        boolean m20488p;
        if (C0033a.m107d(C4616e0.class)) {
            return false;
        }
        try {
            m20488p = C7021m.m20488p(f8711g, Integer.valueOf(i10));
            return m20488p && i10 >= 20140701;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4616e0.class);
            return false;
        }
    }

    /* renamed from: x */
    public static final void m11178x() {
        if (C0033a.m107d(C4616e0.class)) {
            return;
        }
        try {
            if (f8710f.compareAndSet(false, true)) {
                C7799e0.m23868t().execute(new Runnable() { // from class: com.facebook.internal.d0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4616e0.m11179y();
                    }
                });
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4616e0.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public static final void m11179y() {
        if (C0033a.m107d(C4616e0.class)) {
            return;
        }
        try {
            try {
                Iterator<e> it = f8707c.iterator();
                while (it.hasNext()) {
                    it.next().m11188a(true);
                }
            } finally {
                f8710f.set(false);
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4616e0.class);
        }
    }

    /* renamed from: z */
    public static final Intent m11180z(Context context, Intent intent, e eVar) {
        ResolveInfo resolveActivity;
        if (C0033a.m107d(C4616e0.class)) {
            return null;
        }
        try {
            C9322n.m27781e(context, "context");
            if (intent == null || (resolveActivity = context.getPackageManager().resolveActivity(intent, 0)) == null) {
                return null;
            }
            C4627k c4627k = C4627k.f8746a;
            String str = resolveActivity.activityInfo.packageName;
            C9322n.m27780d(str, "resolveInfo.activityInfo.packageName");
            if (C4627k.m11242a(context, str)) {
                return intent;
            }
            return null;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4616e0.class);
            return null;
        }
    }
}

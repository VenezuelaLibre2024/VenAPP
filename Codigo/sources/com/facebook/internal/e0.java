package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.internal.util.common.FbValidationUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a */
    public static final e0 f7730a;

    /* renamed from: b */
    private static final String f7731b;

    /* renamed from: c */
    private static final List<e> f7732c;

    /* renamed from: d */
    private static final List<e> f7733d;

    /* renamed from: e */
    private static final Map<String, List<e>> f7734e;

    /* renamed from: f */
    private static final AtomicBoolean f7735f;

    /* renamed from: g */
    private static final Integer[] f7736g;

    /* loaded from: classes.dex */
    public static final class a extends e {
        @Override // com.facebook.internal.e0.e
        public /* bridge */ /* synthetic */ String c() {
            return (String) g();
        }

        @Override // com.facebook.internal.e0.e
        public String d() {
            return "com.facebook.arstudio.player";
        }

        public Void g() {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b extends e {
        @Override // com.facebook.internal.e0.e
        public String c() {
            return "com.instagram.platform.AppAuthorizeActivity";
        }

        @Override // com.facebook.internal.e0.e
        public String d() {
            return "com.instagram.android";
        }

        @Override // com.facebook.internal.e0.e
        public String e() {
            return "token,signed_request,graph_domain,granted_scopes";
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends e {
        private final boolean g() {
            return i4.e0.l().getApplicationInfo().targetSdkVersion >= 30;
        }

        @Override // com.facebook.internal.e0.e
        public String c() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // com.facebook.internal.e0.e
        public String d() {
            return FbValidationUtils.FB_PACKAGE;
        }

        @Override // com.facebook.internal.e0.e
        public void f() {
            if (g()) {
                Log.w(e0.c(), "Apps that target Android API 30+ (Android 11+) cannot call Facebook native apps unless the package visibility needs are declared. Please follow https://developers.facebook.com/docs/android/troubleshooting/#faq_267321845055988 to make the declaration.");
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends e {
        @Override // com.facebook.internal.e0.e
        public /* bridge */ /* synthetic */ String c() {
            return (String) g();
        }

        @Override // com.facebook.internal.e0.e
        public String d() {
            return "com.facebook.orca";
        }

        public Void g() {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {

        /* renamed from: a */
        private TreeSet<Integer> f7737a;

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0019, code lost:
        
            if (kotlin.jvm.internal.n.a(r2 == null ? null : java.lang.Boolean.valueOf(r2.isEmpty()), java.lang.Boolean.FALSE) == false) goto L39;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0033 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {, blocks: (B:20:0x0003, B:24:0x0013, B:4:0x0023, B:6:0x0027, B:11:0x0033, B:26:0x000b, B:3:0x001b), top: B:19:0x0003 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final synchronized void a(boolean r2) {
            /*
                r1 = this;
                monitor-enter(r1)
                if (r2 != 0) goto L1b
                java.util.TreeSet<java.lang.Integer> r2 = r1.f7737a     // Catch: java.lang.Throwable -> L38
                if (r2 == 0) goto L1b
                if (r2 != 0) goto Lb
                r2 = 0
                goto L13
            Lb:
                boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L38
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L38
            L13:
                java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L38
                boolean r2 = kotlin.jvm.internal.n.a(r2, r0)     // Catch: java.lang.Throwable -> L38
                if (r2 != 0) goto L23
            L1b:
                com.facebook.internal.e0 r2 = com.facebook.internal.e0.f7730a     // Catch: java.lang.Throwable -> L38
                java.util.TreeSet r2 = com.facebook.internal.e0.b(r2, r1)     // Catch: java.lang.Throwable -> L38
                r1.f7737a = r2     // Catch: java.lang.Throwable -> L38
            L23:
                java.util.TreeSet<java.lang.Integer> r2 = r1.f7737a     // Catch: java.lang.Throwable -> L38
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
                r1.f()     // Catch: java.lang.Throwable -> L38
            L36:
                monitor-exit(r1)
                return
            L38:
                r2 = move-exception
                monitor-exit(r1)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.e0.e.a(boolean):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
        
            if (kotlin.jvm.internal.n.a(r0 == null ? null : java.lang.Boolean.valueOf(r0.isEmpty()), java.lang.Boolean.FALSE) == false) goto L21;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.TreeSet<java.lang.Integer> b() {
            /*
                r2 = this;
                java.util.TreeSet<java.lang.Integer> r0 = r2.f7737a
                if (r0 == 0) goto L18
                if (r0 != 0) goto L8
                r0 = 0
                goto L10
            L8:
                boolean r0 = r0.isEmpty()
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            L10:
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                boolean r0 = kotlin.jvm.internal.n.a(r0, r1)
                if (r0 != 0) goto L1c
            L18:
                r0 = 0
                r2.a(r0)
            L1c:
                java.util.TreeSet<java.lang.Integer> r0 = r2.f7737a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.e0.e.b():java.util.TreeSet");
        }

        public abstract String c();

        public abstract String d();

        public String e() {
            return "id_token,token,signed_request,graph_domain";
        }

        public void f() {
        }
    }

    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: c */
        public static final a f7738c = new a(null);

        /* renamed from: a */
        private e f7739a;

        /* renamed from: b */
        private int f7740b;

        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final f a(e eVar, int i10) {
                f fVar = new f(null);
                fVar.f7739a = eVar;
                fVar.f7740b = i10;
                return fVar;
            }

            public final f b() {
                f fVar = new f(null);
                fVar.f7740b = -1;
                return fVar;
            }
        }

        private f() {
        }

        public /* synthetic */ f(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final int c() {
            return this.f7740b;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends e {
        @Override // com.facebook.internal.e0.e
        public String c() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // com.facebook.internal.e0.e
        public String d() {
            return "com.facebook.wakizashi";
        }
    }

    static {
        e0 e0Var = new e0();
        f7730a = e0Var;
        f7731b = e0.class.getName();
        f7732c = e0Var.f();
        f7733d = e0Var.e();
        f7734e = e0Var.d();
        f7735f = new AtomicBoolean(false);
        f7736g = new Integer[]{20210906, 20171115, 20170417, 20170411, 20170213, 20161017, 20160327, 20150702, 20150401, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140313, 20140204, 20131107, 20131024, 20130618, 20130502, 20121101};
    }

    private e0() {
    }

    public static final Intent A(Context context, Intent intent, e eVar) {
        ResolveInfo resolveService;
        if (a5.a.d(e0.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.n.e(context, "context");
            if (intent == null || (resolveService = context.getPackageManager().resolveService(intent, 0)) == null) {
                return null;
            }
            k kVar = k.f7769a;
            String str = resolveService.serviceInfo.packageName;
            kotlin.jvm.internal.n.d(str, "resolveInfo.serviceInfo.packageName");
            if (k.a(context, str)) {
                return intent;
            }
            return null;
        } catch (Throwable th2) {
            a5.a.b(th2, e0.class);
            return null;
        }
    }

    public static final /* synthetic */ TreeSet b(e0 e0Var, e eVar) {
        if (a5.a.d(e0.class)) {
            return null;
        }
        try {
            return e0Var.o(eVar);
        } catch (Throwable th2) {
            a5.a.b(th2, e0.class);
            return null;
        }
    }

    public static final /* synthetic */ String c() {
        if (a5.a.d(e0.class)) {
            return null;
        }
        try {
            return f7731b;
        } catch (Throwable th2) {
            a5.a.b(th2, e0.class);
            return null;
        }
    }

    private final Map<String, List<e>> d() {
        if (a5.a.d(this)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new d());
            List<e> list = f7732c;
            hashMap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.FEED_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.LIKE_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList);
            hashMap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList);
            hashMap.put("com.facebook.platform.action.request.CAMERA_EFFECT", f7733d);
            hashMap.put("com.facebook.platform.action.request.SHARE_STORY", list);
            return hashMap;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return null;
        }
    }

    private final List<e> e() {
        ArrayList f10;
        if (a5.a.d(this)) {
            return null;
        }
        try {
            f10 = dk.r.f(new a());
            f10.addAll(f());
            return f10;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return null;
        }
    }

    private final List<e> f() {
        ArrayList f10;
        if (a5.a.d(this)) {
            return null;
        }
        try {
            f10 = dk.r.f(new c(), new g());
            return f10;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return null;
        }
    }

    private final Uri g(e eVar) {
        if (a5.a.d(this)) {
            return null;
        }
        try {
            Uri parse = Uri.parse("content://" + eVar.d() + ".provider.PlatformProvider/versions");
            kotlin.jvm.internal.n.d(parse, "parse(CONTENT_SCHEME + appInfo.getPackage() + PLATFORM_PROVIDER_VERSIONS)");
            return parse;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return null;
        }
    }

    public static final int h(TreeSet<Integer> treeSet, int i10, int[] versionSpec) {
        if (a5.a.d(e0.class)) {
            return 0;
        }
        try {
            kotlin.jvm.internal.n.e(versionSpec, "versionSpec");
            if (treeSet == null) {
                return -1;
            }
            int length = versionSpec.length - 1;
            Iterator<Integer> descendingIterator = treeSet.descendingIterator();
            int i11 = -1;
            while (descendingIterator.hasNext()) {
                Integer fbAppVersion = descendingIterator.next();
                kotlin.jvm.internal.n.d(fbAppVersion, "fbAppVersion");
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
            a5.a.b(th2, e0.class);
            return 0;
        }
    }

    public static final Bundle i(i4.r rVar) {
        if (a5.a.d(e0.class) || rVar == null) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("error_description", rVar.toString());
            if (rVar instanceof i4.t) {
                bundle.putString("error_type", "UserCanceled");
            }
            return bundle;
        } catch (Throwable th2) {
            a5.a.b(th2, e0.class);
            return null;
        }
    }

    public static final Intent j(Context context, String applicationId, Collection<String> permissions, String e2e, boolean z10, boolean z11, com.facebook.login.e defaultAudience, String clientState, String authType, String str, boolean z12, boolean z13, boolean z14) {
        if (a5.a.d(e0.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.n.e(context, "context");
            kotlin.jvm.internal.n.e(applicationId, "applicationId");
            kotlin.jvm.internal.n.e(permissions, "permissions");
            kotlin.jvm.internal.n.e(e2e, "e2e");
            kotlin.jvm.internal.n.e(defaultAudience, "defaultAudience");
            kotlin.jvm.internal.n.e(clientState, "clientState");
            kotlin.jvm.internal.n.e(authType, "authType");
            b bVar = new b();
            return z(context, f7730a.k(bVar, applicationId, permissions, e2e, z11, defaultAudience, clientState, authType, false, str, z12, com.facebook.login.i0.INSTAGRAM, z13, z14, "", null, null), bVar);
        } catch (Throwable th2) {
            a5.a.b(th2, e0.class);
            return null;
        }
    }

    private final Intent k(e eVar, String str, Collection<String> collection, String str2, boolean z10, com.facebook.login.e eVar2, String str3, String str4, boolean z11, String str5, boolean z12, com.facebook.login.i0 i0Var, boolean z13, boolean z14, String str6, String str7, String str8) {
        if (a5.a.d(this)) {
            return null;
        }
        try {
            String c10 = eVar.c();
            if (c10 == null) {
                return null;
            }
            Intent putExtra = new Intent().setClassName(eVar.d(), c10).putExtra("client_id", str);
            kotlin.jvm.internal.n.d(putExtra, "Intent()\n            .setClassName(appInfo.getPackage(), activityName)\n            .putExtra(FACEBOOK_PROXY_AUTH_APP_ID_KEY, applicationId)");
            putExtra.putExtra("facebook_sdk_version", i4.e0.B());
            if (!n0.e0(collection)) {
                putExtra.putExtra("scope", TextUtils.join(",", collection));
            }
            if (!n0.d0(str2)) {
                putExtra.putExtra("e2e", str2);
            }
            putExtra.putExtra("state", str3);
            putExtra.putExtra("response_type", eVar.e());
            putExtra.putExtra("nonce", str6);
            putExtra.putExtra("return_scopes", "true");
            if (z10) {
                putExtra.putExtra("default_audience", eVar2.h());
            }
            putExtra.putExtra("legacy_override", i4.e0.w());
            putExtra.putExtra("auth_type", str4);
            if (z11) {
                putExtra.putExtra("fail_on_logged_out", true);
            }
            putExtra.putExtra("messenger_page_id", str5);
            putExtra.putExtra("reset_messenger_state", z12);
            if (z13) {
                putExtra.putExtra("fx_app", i0Var.toString());
            }
            if (z14) {
                putExtra.putExtra("skip_dedupe", true);
            }
            return putExtra;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return null;
        }
    }

    public static final Intent l(Context context) {
        if (a5.a.d(e0.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.n.e(context, "context");
            for (e eVar : f7732c) {
                Intent A = A(context, new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(eVar.d()).addCategory("android.intent.category.DEFAULT"), eVar);
                if (A != null) {
                    return A;
                }
            }
            return null;
        } catch (Throwable th2) {
            a5.a.b(th2, e0.class);
            return null;
        }
    }

    public static final Intent m(Intent requestIntent, Bundle bundle, i4.r rVar) {
        if (a5.a.d(e0.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.n.e(requestIntent, "requestIntent");
            UUID p10 = p(requestIntent);
            if (p10 == null) {
                return null;
            }
            Intent intent = new Intent();
            intent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", v(requestIntent));
            Bundle bundle2 = new Bundle();
            bundle2.putString("action_id", p10.toString());
            if (rVar != null) {
                bundle2.putBundle("error", i(rVar));
            }
            intent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
            if (bundle != null) {
                intent.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
            }
            return intent;
        } catch (Throwable th2) {
            a5.a.b(th2, e0.class);
            return null;
        }
    }

    public static final List<Intent> n(Context context, String applicationId, Collection<String> permissions, String e2e, boolean z10, boolean z11, com.facebook.login.e defaultAudience, String clientState, String authType, boolean z12, String str, boolean z13, boolean z14, boolean z15, String str2, String str3, String str4) {
        if (a5.a.d(e0.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.n.e(applicationId, "applicationId");
            kotlin.jvm.internal.n.e(permissions, "permissions");
            kotlin.jvm.internal.n.e(e2e, "e2e");
            kotlin.jvm.internal.n.e(defaultAudience, "defaultAudience");
            kotlin.jvm.internal.n.e(clientState, "clientState");
            kotlin.jvm.internal.n.e(authType, "authType");
            List<e> list = f7732c;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ArrayList arrayList2 = arrayList;
                Intent k10 = f7730a.k((e) it.next(), applicationId, permissions, e2e, z11, defaultAudience, clientState, authType, z12, str, z13, com.facebook.login.i0.FACEBOOK, z14, z15, str2, str3, str4);
                if (k10 != null) {
                    arrayList2.add(k10);
                }
                arrayList = arrayList2;
            }
            return arrayList;
        } catch (Throwable th2) {
            a5.a.b(th2, e0.class);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0078 A[Catch: all -> 0x0085, TRY_ENTER, TryCatch #0 {all -> 0x0085, blocks: (B:6:0x000c, B:30:0x0084, B:31:0x0081, B:18:0x0078), top: B:5:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059 A[EXC_TOP_SPLITTER, LOOP:0: B:20:0x0059->B:23:0x005f, LOOP_START, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.TreeSet<java.lang.Integer> o(com.facebook.internal.e0.e r13) {
        /*
            r12 = this;
            java.lang.String r0 = "version"
            java.lang.String r1 = "Failed to query content resolver."
            boolean r2 = a5.a.d(r12)
            r3 = 0
            if (r2 == 0) goto Lc
            return r3
        Lc:
            java.util.TreeSet r2 = new java.util.TreeSet     // Catch: java.lang.Throwable -> L85
            r2.<init>()     // Catch: java.lang.Throwable -> L85
            android.content.Context r4 = i4.e0.l()     // Catch: java.lang.Throwable -> L85
            android.content.ContentResolver r5 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L85
            java.lang.String[] r7 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L85
            android.net.Uri r6 = r12.g(r13)     // Catch: java.lang.Throwable -> L85
            android.content.Context r4 = i4.e0.l()     // Catch: java.lang.Throwable -> L7c
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r13 = r13.d()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r8 = ".provider.PlatformProvider"
            java.lang.String r13 = kotlin.jvm.internal.n.k(r13, r8)     // Catch: java.lang.Throwable -> L7c
            r8 = 0
            android.content.pm.ProviderInfo r13 = r4.resolveContentProvider(r13, r8)     // Catch: java.lang.RuntimeException -> L39 java.lang.Throwable -> L7c
            goto L40
        L39:
            r13 = move-exception
            java.lang.String r4 = com.facebook.internal.e0.f7731b     // Catch: java.lang.Throwable -> L7c
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
            java.lang.String r13 = com.facebook.internal.e0.f7731b     // Catch: java.lang.Throwable -> L7c
            goto L4f
        L4d:
            java.lang.String r13 = com.facebook.internal.e0.f7731b     // Catch: java.lang.Throwable -> L7c
        L4f:
            android.util.Log.e(r13, r1)     // Catch: java.lang.Throwable -> L7c
            goto L56
        L53:
            java.lang.String r13 = com.facebook.internal.e0.f7731b     // Catch: java.lang.Throwable -> L7c
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
            a5.a.b(r13, r12)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.e0.o(com.facebook.internal.e0$e):java.util.TreeSet");
    }

    public static final UUID p(Intent intent) {
        String stringExtra;
        if (a5.a.d(e0.class) || intent == null) {
            return null;
        }
        try {
            if (w(v(intent))) {
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
            a5.a.b(th2, e0.class);
            return null;
        }
    }

    public static final i4.r q(Bundle bundle) {
        boolean r10;
        if (a5.a.d(e0.class) || bundle == null) {
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
                r10 = xk.p.r(string, "UserCanceled", true);
                if (r10) {
                    return new i4.t(string2);
                }
            }
            return new i4.r(string2);
        } catch (Throwable th2) {
            a5.a.b(th2, e0.class);
            return null;
        }
    }

    private final f r(List<? extends e> list, int[] iArr) {
        if (a5.a.d(this)) {
            return null;
        }
        try {
            x();
            if (list == null) {
                return f.f7738c.b();
            }
            for (e eVar : list) {
                int h10 = h(eVar.b(), t(), iArr);
                if (h10 != -1) {
                    return f.f7738c.a(eVar, h10);
                }
            }
            return f.f7738c.b();
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return null;
        }
    }

    public static final int s(int i10) {
        if (a5.a.d(e0.class)) {
            return 0;
        }
        try {
            return f7730a.r(f7732c, new int[]{i10}).c();
        } catch (Throwable th2) {
            a5.a.b(th2, e0.class);
            return 0;
        }
    }

    public static final int t() {
        if (a5.a.d(e0.class)) {
            return 0;
        }
        try {
            return f7736g[0].intValue();
        } catch (Throwable th2) {
            a5.a.b(th2, e0.class);
            return 0;
        }
    }

    public static final Bundle u(Intent intent) {
        if (a5.a.d(e0.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.n.e(intent, "intent");
            return !w(v(intent)) ? intent.getExtras() : intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
        } catch (Throwable th2) {
            a5.a.b(th2, e0.class);
            return null;
        }
    }

    public static final int v(Intent intent) {
        if (a5.a.d(e0.class)) {
            return 0;
        }
        try {
            kotlin.jvm.internal.n.e(intent, "intent");
            return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        } catch (Throwable th2) {
            a5.a.b(th2, e0.class);
            return 0;
        }
    }

    public static final boolean w(int i10) {
        boolean p10;
        if (a5.a.d(e0.class)) {
            return false;
        }
        try {
            p10 = dk.m.p(f7736g, Integer.valueOf(i10));
            return p10 && i10 >= 20140701;
        } catch (Throwable th2) {
            a5.a.b(th2, e0.class);
            return false;
        }
    }

    public static final void x() {
        if (a5.a.d(e0.class)) {
            return;
        }
        try {
            if (f7735f.compareAndSet(false, true)) {
                i4.e0.t().execute(new Runnable() { // from class: com.facebook.internal.d0
                    @Override // java.lang.Runnable
                    public final void run() {
                        e0.y();
                    }
                });
            }
        } catch (Throwable th2) {
            a5.a.b(th2, e0.class);
        }
    }

    public static final void y() {
        if (a5.a.d(e0.class)) {
            return;
        }
        try {
            try {
                Iterator<e> it = f7732c.iterator();
                while (it.hasNext()) {
                    it.next().a(true);
                }
            } finally {
                f7735f.set(false);
            }
        } catch (Throwable th2) {
            a5.a.b(th2, e0.class);
        }
    }

    public static final Intent z(Context context, Intent intent, e eVar) {
        ResolveInfo resolveActivity;
        if (a5.a.d(e0.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.n.e(context, "context");
            if (intent == null || (resolveActivity = context.getPackageManager().resolveActivity(intent, 0)) == null) {
                return null;
            }
            k kVar = k.f7769a;
            String str = resolveActivity.activityInfo.packageName;
            kotlin.jvm.internal.n.d(str, "resolveInfo.activityInfo.packageName");
            if (k.a(context, str)) {
                return intent;
            }
            return null;
        } catch (Throwable th2) {
            a5.a.b(th2, e0.class);
            return null;
        }
    }
}

package ff;

import android.util.Log;
import ck.o;
import ck.v;
import com.google.android.libraries.barhopper.RecognitionOptions;
import gk.Continuation;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import ok.p;
import org.json.JSONObject;
import yk.a;

/* loaded from: classes2.dex */
public final class c implements h {

    /* renamed from: g, reason: collision with root package name */
    private static final a f15117g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final gk.f f15118a;

    /* renamed from: b, reason: collision with root package name */
    private final fe.f f15119b;

    /* renamed from: c, reason: collision with root package name */
    private final df.b f15120c;

    /* renamed from: d, reason: collision with root package name */
    private final ff.a f15121d;

    /* renamed from: e, reason: collision with root package name */
    private final g f15122e;

    /* renamed from: f, reason: collision with root package name */
    private final il.a f15123f;

    /* loaded from: classes2.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.RemoteSettings", f = "RemoteSettings.kt", l = {170, 76, 94}, m = "updateSettings")
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f15124a;

        /* renamed from: b, reason: collision with root package name */
        Object f15125b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f15126c;

        /* renamed from: e, reason: collision with root package name */
        int f15128e;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f15126c = obj;
            this.f15128e |= Integer.MIN_VALUE;
            return c.this.d(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", f = "RemoteSettings.kt", l = {125, RecognitionOptions.ITF, 131, 133, 134, 136}, m = "invokeSuspend")
    /* renamed from: ff.c$c, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0250c extends l implements p<JSONObject, Continuation<? super v>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f15129a;

        /* renamed from: b, reason: collision with root package name */
        Object f15130b;

        /* renamed from: c, reason: collision with root package name */
        int f15131c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f15132d;

        C0250c(Continuation<? super C0250c> continuation) {
            super(2, continuation);
        }

        @Override // ok.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(JSONObject jSONObject, Continuation<? super v> continuation) {
            return ((C0250c) create(jSONObject, continuation)).invokeSuspend(v.f7137a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<v> create(Object obj, Continuation<?> continuation) {
            C0250c c0250c = new C0250c(continuation);
            c0250c.f15132d = obj;
            return c0250c;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000f. Please report as an issue. */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x019f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0165  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0142  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0162  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x011f  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00fc  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00d5  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00f4  */
        /* JADX WARN: Type inference failed for: r13v12, types: [T, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.Double] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 438
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ff.c.C0250c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2", f = "RemoteSettings.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends l implements p<String, Continuation<? super v>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f15134a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f15135b;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // ok.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(String str, Continuation<? super v> continuation) {
            return ((d) create(str, continuation)).invokeSuspend(v.f7137a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<v> create(Object obj, Continuation<?> continuation) {
            d dVar = new d(continuation);
            dVar.f15135b = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            hk.d.c();
            if (this.f15134a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.f15135b));
            return v.f7137a;
        }
    }

    public c(gk.f backgroundDispatcher, fe.f firebaseInstallationsApi, df.b appInfo, ff.a configsFetcher, x0.f<a1.d> dataStore) {
        n.e(backgroundDispatcher, "backgroundDispatcher");
        n.e(firebaseInstallationsApi, "firebaseInstallationsApi");
        n.e(appInfo, "appInfo");
        n.e(configsFetcher, "configsFetcher");
        n.e(dataStore, "dataStore");
        this.f15118a = backgroundDispatcher;
        this.f15119b = firebaseInstallationsApi;
        this.f15120c = appInfo;
        this.f15121d = configsFetcher;
        this.f15122e = new g(dataStore);
        this.f15123f = il.c.b(false, 1, null);
    }

    private final String f(String str) {
        return new xk.f("/").b(str, "");
    }

    @Override // ff.h
    public Boolean a() {
        return this.f15122e.g();
    }

    @Override // ff.h
    public yk.a b() {
        Integer e10 = this.f15122e.e();
        if (e10 == null) {
            return null;
        }
        a.C0535a c0535a = yk.a.f32011b;
        return yk.a.h(yk.c.h(e10.intValue(), yk.d.SECONDS));
    }

    @Override // ff.h
    public Double c() {
        return this.f15122e.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:26:0x004e, B:27:0x00b4, B:29:0x00b8, B:33:0x00c4, B:38:0x0089, B:40:0x0091, B:43:0x009c), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0091 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:26:0x004e, B:27:0x00b4, B:29:0x00b8, B:33:0x00c4, B:38:0x0089, B:40:0x0091, B:43:0x009c), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009c A[Catch: all -> 0x0052, TRY_ENTER, TryCatch #0 {all -> 0x0052, blocks: (B:26:0x004e, B:27:0x00b4, B:29:0x00b8, B:33:0x00c4, B:38:0x0089, B:40:0x0091, B:43:0x009c), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    @Override // ff.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(gk.Continuation<? super ck.v> r17) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ff.c.d(gk.Continuation):java.lang.Object");
    }
}

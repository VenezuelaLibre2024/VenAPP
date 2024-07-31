package p107ff;

import android.util.Log;
import ck.C2030o;
import ck.C2037v;
import com.google.android.libraries.barhopper.RecognitionOptions;
import hk.C7752d;
import il.C8010c;
import il.InterfaceC8008a;
import kotlin.coroutines.jvm.internal.AbstractC9298d;
import kotlin.coroutines.jvm.internal.AbstractC9306l;
import kotlin.coroutines.jvm.internal.InterfaceC9300f;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import org.json.JSONObject;
import p003a1.AbstractC0015d;
import p065df.C6905b;
import p106fe.InterfaceC7337f;
import p124gk.Continuation;
import p124gk.InterfaceC7587f;
import p280ok.InterfaceC10002p;
import p430x0.InterfaceC12255f;
import p450xk.C12514f;
import p472yk.C12728a;
import p472yk.C12730c;
import p472yk.EnumC12731d;

/* renamed from: ff.c */
/* loaded from: classes2.dex */
public final class C7342c implements InterfaceC7347h {

    /* renamed from: g */
    private static final a f16540g = new a(null);

    /* renamed from: a */
    private final InterfaceC7587f f16541a;

    /* renamed from: b */
    private final InterfaceC7337f f16542b;

    /* renamed from: c */
    private final C6905b f16543c;

    /* renamed from: d */
    private final InterfaceC7340a f16544d;

    /* renamed from: e */
    private final C7346g f16545e;

    /* renamed from: f */
    private final InterfaceC8008a f16546f;

    /* renamed from: ff.c$a */
    /* loaded from: classes2.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC9300f(m27742c = "com.google.firebase.sessions.settings.RemoteSettings", m27743f = "RemoteSettings.kt", m27744l = {170, 76, 94}, m27745m = "updateSettings")
    /* renamed from: ff.c$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC9298d {

        /* renamed from: a */
        Object f16547a;

        /* renamed from: b */
        Object f16548b;

        /* renamed from: c */
        /* synthetic */ Object f16549c;

        /* renamed from: e */
        int f16551e;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Object invokeSuspend(Object obj) {
            this.f16549c = obj;
            this.f16551e |= Integer.MIN_VALUE;
            return C7342c.this.mo22040d(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC9300f(m27742c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", m27743f = "RemoteSettings.kt", m27744l = {125, RecognitionOptions.ITF, 131, 133, 134, 136}, m27745m = "invokeSuspend")
    /* renamed from: ff.c$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC9306l implements InterfaceC10002p<JSONObject, Continuation<? super C2037v>, Object> {

        /* renamed from: a */
        Object f16552a;

        /* renamed from: b */
        Object f16553b;

        /* renamed from: c */
        int f16554c;

        /* renamed from: d */
        /* synthetic */ Object f16555d;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // p280ok.InterfaceC10002p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(JSONObject jSONObject, Continuation<? super C2037v> continuation) {
            return ((c) create(jSONObject, continuation)).invokeSuspend(C2037v.f8089a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Continuation<C2037v> create(Object obj, Continuation<?> continuation) {
            c cVar = new c(continuation);
            cVar.f16555d = obj;
            return cVar;
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
        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 438
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p107ff.C7342c.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC9300f(m27742c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2", m27743f = "RemoteSettings.kt", m27744l = {}, m27745m = "invokeSuspend")
    /* renamed from: ff.c$d */
    /* loaded from: classes2.dex */
    public static final class d extends AbstractC9306l implements InterfaceC10002p<String, Continuation<? super C2037v>, Object> {

        /* renamed from: a */
        int f16557a;

        /* renamed from: b */
        /* synthetic */ Object f16558b;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // p280ok.InterfaceC10002p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(String str, Continuation<? super C2037v> continuation) {
            return ((d) create(str, continuation)).invokeSuspend(C2037v.f8089a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Continuation<C2037v> create(Object obj, Continuation<?> continuation) {
            d dVar = new d(continuation);
            dVar.f16558b = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Object invokeSuspend(Object obj) {
            C7752d.m23655c();
            if (this.f16557a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C2030o.m10349b(obj);
            Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.f16558b));
            return C2037v.f8089a;
        }
    }

    public C7342c(InterfaceC7587f backgroundDispatcher, InterfaceC7337f firebaseInstallationsApi, C6905b appInfo, InterfaceC7340a configsFetcher, InterfaceC12255f<AbstractC0015d> dataStore) {
        C9322n.m27781e(backgroundDispatcher, "backgroundDispatcher");
        C9322n.m27781e(firebaseInstallationsApi, "firebaseInstallationsApi");
        C9322n.m27781e(appInfo, "appInfo");
        C9322n.m27781e(configsFetcher, "configsFetcher");
        C9322n.m27781e(dataStore, "dataStore");
        this.f16541a = backgroundDispatcher;
        this.f16542b = firebaseInstallationsApi;
        this.f16543c = appInfo;
        this.f16544d = configsFetcher;
        this.f16545e = new C7346g(dataStore);
        this.f16546f = C8010c.m24609b(false, 1, null);
    }

    /* renamed from: f */
    private final String m22042f(String str) {
        return new C12514f("/").m40970b(str, "");
    }

    @Override // p107ff.InterfaceC7347h
    /* renamed from: a */
    public Boolean mo22037a() {
        return this.f16545e.m22070g();
    }

    @Override // p107ff.InterfaceC7347h
    /* renamed from: b */
    public C12728a mo22038b() {
        Integer m22068e = this.f16545e.m22068e();
        if (m22068e == null) {
            return null;
        }
        C12728a.a aVar = C12728a.f34547b;
        return C12728a.m42015h(C12730c.m42041h(m22068e.intValue(), EnumC12731d.SECONDS));
    }

    @Override // p107ff.InterfaceC7347h
    /* renamed from: c */
    public Double mo22039c() {
        return this.f16545e.m22069f();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:26:0x004e, B:27:0x00b4, B:29:0x00b8, B:33:0x00c4, B:38:0x0089, B:40:0x0091, B:43:0x009c), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0091 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:26:0x004e, B:27:0x00b4, B:29:0x00b8, B:33:0x00c4, B:38:0x0089, B:40:0x0091, B:43:0x009c), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009c A[Catch: all -> 0x0052, TRY_ENTER, TryCatch #0 {all -> 0x0052, blocks: (B:26:0x004e, B:27:0x00b4, B:29:0x00b8, B:33:0x00c4, B:38:0x0089, B:40:0x0091, B:43:0x009c), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    @Override // p107ff.InterfaceC7347h
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo22040d(p124gk.Continuation<? super ck.C2037v> r17) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p107ff.C7342c.mo22040d(gk.Continuation):java.lang.Object");
    }
}

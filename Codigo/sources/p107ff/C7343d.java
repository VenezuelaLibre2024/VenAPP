package p107ff;

import android.net.Uri;
import ck.C2030o;
import ck.C2037v;
import hk.C7752d;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.coroutines.jvm.internal.AbstractC9306l;
import kotlin.coroutines.jvm.internal.InterfaceC9300f;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import kotlin.jvm.internal.C9332x;
import org.json.JSONObject;
import p065df.C6905b;
import p124gk.Continuation;
import p124gk.InterfaceC7587f;
import p280ok.InterfaceC10002p;
import p494zk.C13063h;
import p494zk.InterfaceC13076k0;

/* renamed from: ff.d */
/* loaded from: classes2.dex */
public final class C7343d implements InterfaceC7340a {

    /* renamed from: d */
    public static final a f16559d = new a(null);

    /* renamed from: a */
    private final C6905b f16560a;

    /* renamed from: b */
    private final InterfaceC7587f f16561b;

    /* renamed from: c */
    private final String f16562c;

    /* renamed from: ff.d$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    @InterfaceC9300f(m27742c = "com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2", m27743f = "RemoteSettingsFetcher.kt", m27744l = {68, 70, 73}, m27745m = "invokeSuspend")
    /* renamed from: ff.d$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC9306l implements InterfaceC10002p<InterfaceC13076k0, Continuation<? super C2037v>, Object> {

        /* renamed from: a */
        int f16563a;

        /* renamed from: c */
        final /* synthetic */ Map<String, String> f16565c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC10002p<JSONObject, Continuation<? super C2037v>, Object> f16566d;

        /* renamed from: e */
        final /* synthetic */ InterfaceC10002p<String, Continuation<? super C2037v>, Object> f16567e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Map<String, String> map, InterfaceC10002p<? super JSONObject, ? super Continuation<? super C2037v>, ? extends Object> interfaceC10002p, InterfaceC10002p<? super String, ? super Continuation<? super C2037v>, ? extends Object> interfaceC10002p2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f16565c = map;
            this.f16566d = interfaceC10002p;
            this.f16567e = interfaceC10002p2;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Continuation<C2037v> create(Object obj, Continuation<?> continuation) {
            return new b(this.f16565c, this.f16566d, this.f16567e, continuation);
        }

        @Override // p280ok.InterfaceC10002p
        public final Object invoke(InterfaceC13076k0 interfaceC13076k0, Continuation<? super C2037v> continuation) {
            return ((b) create(interfaceC13076k0, continuation)).invokeSuspend(C2037v.f8089a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Object invokeSuspend(Object obj) {
            Object m23655c;
            m23655c = C7752d.m23655c();
            int i10 = this.f16563a;
            try {
                if (i10 == 0) {
                    C2030o.m10349b(obj);
                    URLConnection openConnection = C7343d.this.m22046c().openConnection();
                    C9322n.m27779c(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                    httpsURLConnection.setRequestMethod("GET");
                    httpsURLConnection.setRequestProperty("Accept", "application/json");
                    for (Map.Entry<String, String> entry : this.f16565c.entrySet()) {
                        httpsURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                    int responseCode = httpsURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        InputStream inputStream = httpsURLConnection.getInputStream();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                        StringBuilder sb2 = new StringBuilder();
                        C9332x c9332x = new C9332x();
                        while (true) {
                            ?? readLine = bufferedReader.readLine();
                            c9332x.f22581a = readLine;
                            if (readLine == 0) {
                                break;
                            }
                            sb2.append((String) readLine);
                        }
                        bufferedReader.close();
                        inputStream.close();
                        JSONObject jSONObject = new JSONObject(sb2.toString());
                        InterfaceC10002p<JSONObject, Continuation<? super C2037v>, Object> interfaceC10002p = this.f16566d;
                        this.f16563a = 1;
                        if (interfaceC10002p.invoke(jSONObject, this) == m23655c) {
                            return m23655c;
                        }
                    } else {
                        InterfaceC10002p<String, Continuation<? super C2037v>, Object> interfaceC10002p2 = this.f16567e;
                        String str = "Bad response code: " + responseCode;
                        this.f16563a = 2;
                        if (interfaceC10002p2.invoke(str, this) == m23655c) {
                            return m23655c;
                        }
                    }
                } else if (i10 == 1 || i10 == 2) {
                    C2030o.m10349b(obj);
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C2030o.m10349b(obj);
                }
            } catch (Exception e10) {
                InterfaceC10002p<String, Continuation<? super C2037v>, Object> interfaceC10002p3 = this.f16567e;
                String message = e10.getMessage();
                if (message == null) {
                    message = e10.toString();
                }
                this.f16563a = 3;
                if (interfaceC10002p3.invoke(message, this) == m23655c) {
                    return m23655c;
                }
            }
            return C2037v.f8089a;
        }
    }

    public C7343d(C6905b appInfo, InterfaceC7587f blockingDispatcher, String baseUrl) {
        C9322n.m27781e(appInfo, "appInfo");
        C9322n.m27781e(blockingDispatcher, "blockingDispatcher");
        C9322n.m27781e(baseUrl, "baseUrl");
        this.f16560a = appInfo;
        this.f16561b = blockingDispatcher;
        this.f16562c = baseUrl;
    }

    public /* synthetic */ C7343d(C6905b c6905b, InterfaceC7587f interfaceC7587f, String str, int i10, C9315g c9315g) {
        this(c6905b, interfaceC7587f, (i10 & 4) != 0 ? "firebase-settings.crashlytics.com" : str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final URL m22046c() {
        return new URL(new Uri.Builder().scheme("https").authority(this.f16562c).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp").appendPath(this.f16560a.m19974b()).appendPath("settings").appendQueryParameter("build_version", this.f16560a.m19973a().m19963a()).appendQueryParameter("display_version", this.f16560a.m19973a().m19968f()).build().toString());
    }

    @Override // p107ff.InterfaceC7340a
    /* renamed from: a */
    public Object mo22036a(Map<String, String> map, InterfaceC10002p<? super JSONObject, ? super Continuation<? super C2037v>, ? extends Object> interfaceC10002p, InterfaceC10002p<? super String, ? super Continuation<? super C2037v>, ? extends Object> interfaceC10002p2, Continuation<? super C2037v> continuation) {
        Object m23655c;
        Object m43191g = C13063h.m43191g(this.f16561b, new b(map, interfaceC10002p, interfaceC10002p2, null), continuation);
        m23655c = C7752d.m23655c();
        return m43191g == m23655c ? m43191g : C2037v.f8089a;
    }
}

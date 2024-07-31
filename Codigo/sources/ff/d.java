package ff;

import android.net.Uri;
import ck.o;
import ck.v;
import gk.Continuation;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.x;
import ok.p;
import org.json.JSONObject;
import zk.k0;

/* loaded from: classes2.dex */
public final class d implements ff.a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f15136d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final df.b f15137a;

    /* renamed from: b, reason: collision with root package name */
    private final gk.f f15138b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15139c;

    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2", f = "RemoteSettingsFetcher.kt", l = {68, 70, 73}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class b extends l implements p<k0, Continuation<? super v>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f15140a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map<String, String> f15142c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ p<JSONObject, Continuation<? super v>, Object> f15143d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ p<String, Continuation<? super v>, Object> f15144e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Map<String, String> map, p<? super JSONObject, ? super Continuation<? super v>, ? extends Object> pVar, p<? super String, ? super Continuation<? super v>, ? extends Object> pVar2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f15142c = map;
            this.f15143d = pVar;
            this.f15144e = pVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<v> create(Object obj, Continuation<?> continuation) {
            return new b(this.f15142c, this.f15143d, this.f15144e, continuation);
        }

        @Override // ok.p
        public final Object invoke(k0 k0Var, Continuation<? super v> continuation) {
            return ((b) create(k0Var, continuation)).invokeSuspend(v.f7137a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c10;
            c10 = hk.d.c();
            int i10 = this.f15140a;
            try {
                if (i10 == 0) {
                    o.b(obj);
                    URLConnection openConnection = d.this.c().openConnection();
                    n.c(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                    httpsURLConnection.setRequestMethod("GET");
                    httpsURLConnection.setRequestProperty("Accept", "application/json");
                    for (Map.Entry<String, String> entry : this.f15142c.entrySet()) {
                        httpsURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                    int responseCode = httpsURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        InputStream inputStream = httpsURLConnection.getInputStream();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                        StringBuilder sb2 = new StringBuilder();
                        x xVar = new x();
                        while (true) {
                            ?? readLine = bufferedReader.readLine();
                            xVar.f20759a = readLine;
                            if (readLine == 0) {
                                break;
                            }
                            sb2.append((String) readLine);
                        }
                        bufferedReader.close();
                        inputStream.close();
                        JSONObject jSONObject = new JSONObject(sb2.toString());
                        p<JSONObject, Continuation<? super v>, Object> pVar = this.f15143d;
                        this.f15140a = 1;
                        if (pVar.invoke(jSONObject, this) == c10) {
                            return c10;
                        }
                    } else {
                        p<String, Continuation<? super v>, Object> pVar2 = this.f15144e;
                        String str = "Bad response code: " + responseCode;
                        this.f15140a = 2;
                        if (pVar2.invoke(str, this) == c10) {
                            return c10;
                        }
                    }
                } else if (i10 == 1 || i10 == 2) {
                    o.b(obj);
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
            } catch (Exception e10) {
                p<String, Continuation<? super v>, Object> pVar3 = this.f15144e;
                String message = e10.getMessage();
                if (message == null) {
                    message = e10.toString();
                }
                this.f15140a = 3;
                if (pVar3.invoke(message, this) == c10) {
                    return c10;
                }
            }
            return v.f7137a;
        }
    }

    public d(df.b appInfo, gk.f blockingDispatcher, String baseUrl) {
        n.e(appInfo, "appInfo");
        n.e(blockingDispatcher, "blockingDispatcher");
        n.e(baseUrl, "baseUrl");
        this.f15137a = appInfo;
        this.f15138b = blockingDispatcher;
        this.f15139c = baseUrl;
    }

    public /* synthetic */ d(df.b bVar, gk.f fVar, String str, int i10, kotlin.jvm.internal.g gVar) {
        this(bVar, fVar, (i10 & 4) != 0 ? "firebase-settings.crashlytics.com" : str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final URL c() {
        return new URL(new Uri.Builder().scheme("https").authority(this.f15139c).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp").appendPath(this.f15137a.b()).appendPath("settings").appendQueryParameter("build_version", this.f15137a.a().a()).appendQueryParameter("display_version", this.f15137a.a().f()).build().toString());
    }

    @Override // ff.a
    public Object a(Map<String, String> map, p<? super JSONObject, ? super Continuation<? super v>, ? extends Object> pVar, p<? super String, ? super Continuation<? super v>, ? extends Object> pVar2, Continuation<? super v> continuation) {
        Object c10;
        Object g10 = zk.h.g(this.f15138b, new b(map, pVar, pVar2, null), continuation);
        c10 = hk.d.c();
        return g10 == c10 ? g10 : v.f7137a;
    }
}

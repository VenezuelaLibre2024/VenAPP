package ai;

import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class c extends ai.a {

    /* renamed from: a, reason: collision with root package name */
    final Map<String, Object> f441a;

    /* renamed from: b, reason: collision with root package name */
    final a f442b = new a();

    /* renamed from: c, reason: collision with root package name */
    final boolean f443c;

    /* loaded from: classes3.dex */
    public class a implements f {

        /* renamed from: a, reason: collision with root package name */
        Object f444a;

        /* renamed from: b, reason: collision with root package name */
        String f445b;

        /* renamed from: c, reason: collision with root package name */
        String f446c;

        /* renamed from: d, reason: collision with root package name */
        Object f447d;

        public a() {
        }

        @Override // ai.f
        public void error(String str, String str2, Object obj) {
            this.f445b = str;
            this.f446c = str2;
            this.f447d = obj;
        }

        @Override // ai.f
        public void success(Object obj) {
            this.f444a = obj;
        }
    }

    public c(Map<String, Object> map, boolean z10) {
        this.f441a = map;
        this.f443c = z10;
    }

    @Override // ai.e
    public <T> T a(String str) {
        return (T) this.f441a.get(str);
    }

    @Override // ai.e
    public boolean c(String str) {
        return this.f441a.containsKey(str);
    }

    @Override // ai.b, ai.e
    public boolean f() {
        return this.f443c;
    }

    @Override // ai.e
    public String getMethod() {
        return (String) this.f441a.get(Constants.METHOD);
    }

    @Override // ai.a
    public f l() {
        return this.f442b;
    }

    public Map<String, Object> m() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("code", this.f442b.f445b);
        hashMap2.put(Constants.MESSAGE, this.f442b.f446c);
        hashMap2.put("data", this.f442b.f447d);
        hashMap.put("error", hashMap2);
        return hashMap;
    }

    public Map<String, Object> n() {
        HashMap hashMap = new HashMap();
        hashMap.put("result", this.f442b.f444a);
        return hashMap;
    }

    public void o(MethodChannel.Result result) {
        a aVar = this.f442b;
        result.error(aVar.f445b, aVar.f446c, aVar.f447d);
    }

    public void p(List<Map<String, Object>> list) {
        if (f()) {
            return;
        }
        list.add(m());
    }

    public void q(List<Map<String, Object>> list) {
        if (f()) {
            return;
        }
        list.add(n());
    }
}

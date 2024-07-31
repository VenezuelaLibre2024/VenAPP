package ai;

import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: ai.c */
/* loaded from: classes3.dex */
public class C0119c extends AbstractC0117a {

    /* renamed from: a */
    final Map<String, Object> f506a;

    /* renamed from: b */
    final a f507b = new a();

    /* renamed from: c */
    final boolean f508c;

    /* renamed from: ai.c$a */
    /* loaded from: classes3.dex */
    public class a implements InterfaceC0122f {

        /* renamed from: a */
        Object f509a;

        /* renamed from: b */
        String f510b;

        /* renamed from: c */
        String f511c;

        /* renamed from: d */
        Object f512d;

        public a() {
        }

        @Override // ai.InterfaceC0122f
        public void error(String str, String str2, Object obj) {
            this.f510b = str;
            this.f511c = str2;
            this.f512d = obj;
        }

        @Override // ai.InterfaceC0122f
        public void success(Object obj) {
            this.f509a = obj;
        }
    }

    public C0119c(Map<String, Object> map, boolean z10) {
        this.f506a = map;
        this.f508c = z10;
    }

    @Override // ai.InterfaceC0121e
    /* renamed from: a */
    public <T> T mo565a(String str) {
        return (T) this.f506a.get(str);
    }

    @Override // ai.InterfaceC0121e
    /* renamed from: c */
    public boolean mo566c(String str) {
        return this.f506a.containsKey(str);
    }

    @Override // ai.AbstractC0118b, ai.InterfaceC0121e
    /* renamed from: f */
    public boolean mo562f() {
        return this.f508c;
    }

    @Override // ai.InterfaceC0121e
    public String getMethod() {
        return (String) this.f506a.get(Constants.METHOD);
    }

    @Override // ai.AbstractC0117a
    /* renamed from: l */
    public InterfaceC0122f mo555l() {
        return this.f507b;
    }

    /* renamed from: m */
    public Map<String, Object> m567m() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("code", this.f507b.f510b);
        hashMap2.put(Constants.MESSAGE, this.f507b.f511c);
        hashMap2.put("data", this.f507b.f512d);
        hashMap.put("error", hashMap2);
        return hashMap;
    }

    /* renamed from: n */
    public Map<String, Object> m568n() {
        HashMap hashMap = new HashMap();
        hashMap.put("result", this.f507b.f509a);
        return hashMap;
    }

    /* renamed from: o */
    public void m569o(MethodChannel.Result result) {
        a aVar = this.f507b;
        result.error(aVar.f510b, aVar.f511c, aVar.f512d);
    }

    /* renamed from: p */
    public void m570p(List<Map<String, Object>> list) {
        if (mo562f()) {
            return;
        }
        list.add(m567m());
    }

    /* renamed from: q */
    public void m571q(List<Map<String, Object>> list) {
        if (mo562f()) {
            return;
        }
        list.add(m568n());
    }
}

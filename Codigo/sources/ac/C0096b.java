package ac;

import android.text.TextUtils;
import cc.InterfaceC1940a;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: ac.b */
/* loaded from: classes.dex */
public class C0096b {

    /* renamed from: g */
    private static final String[] f353g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h */
    static final DateFormat f354h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a */
    private final String f355a;

    /* renamed from: b */
    private final String f356b;

    /* renamed from: c */
    private final String f357c;

    /* renamed from: d */
    private final Date f358d;

    /* renamed from: e */
    private final long f359e;

    /* renamed from: f */
    private final long f360f;

    public C0096b(String str, String str2, String str3, Date date, long j10, long j11) {
        this.f355a = str;
        this.f356b = str2;
        this.f357c = str3;
        this.f358d = date;
        this.f359e = j10;
        this.f360f = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C0096b m383a(InterfaceC1940a.c cVar) {
        String str = cVar.f7975d;
        if (str == null) {
            str = "";
        }
        return new C0096b(cVar.f7973b, String.valueOf(cVar.f7974c), str, new Date(cVar.f7984m), cVar.f7976e, cVar.f7981j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C0096b m384b(Map<String, String> map) {
        m386i(map);
        try {
            return new C0096b(map.get("experimentId"), map.get("variantId"), map.containsKey("triggerEvent") ? map.get("triggerEvent") : "", f354h.parse(map.get("experimentStartTime")), Long.parseLong(map.get("triggerTimeoutMillis")), Long.parseLong(map.get("timeToLiveMillis")));
        } catch (NumberFormatException e10) {
            throw new C0095a("Could not process experiment: one of the durations could not be converted into a long.", e10);
        } catch (ParseException e11) {
            throw new C0095a("Could not process experiment: parsing experiment start time failed.", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static void m385h(C0096b c0096b) {
        m386i(c0096b.m391g());
    }

    /* renamed from: i */
    private static void m386i(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        for (String str : f353g) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new C0095a(String.format("The following keys are missing from the experiment info map: %s", arrayList));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public String m387c() {
        return this.f355a;
    }

    /* renamed from: d */
    long m388d() {
        return this.f358d.getTime();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public String m389e() {
        return this.f356b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public InterfaceC1940a.c m390f(String str) {
        InterfaceC1940a.c cVar = new InterfaceC1940a.c();
        cVar.f7972a = str;
        cVar.f7984m = m388d();
        cVar.f7973b = this.f355a;
        cVar.f7974c = this.f356b;
        cVar.f7975d = TextUtils.isEmpty(this.f357c) ? null : this.f357c;
        cVar.f7976e = this.f359e;
        cVar.f7981j = this.f360f;
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public Map<String, String> m391g() {
        HashMap hashMap = new HashMap();
        hashMap.put("experimentId", this.f355a);
        hashMap.put("variantId", this.f356b);
        hashMap.put("triggerEvent", this.f357c);
        hashMap.put("experimentStartTime", f354h.format(this.f358d));
        hashMap.put("triggerTimeoutMillis", Long.toString(this.f359e));
        hashMap.put("timeToLiveMillis", Long.toString(this.f360f));
        return hashMap;
    }
}

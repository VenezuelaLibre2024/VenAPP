package com.google.firebase.storage;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.firebase.storage.j */
/* loaded from: classes2.dex */
public final class C6390j {

    /* renamed from: a */
    private final List<C6401p> f13884a;

    /* renamed from: b */
    private final List<C6401p> f13885b;

    /* renamed from: c */
    private final String f13886c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6390j(List<C6401p> list, List<C6401p> list2, String str) {
        this.f13884a = list;
        this.f13885b = list2;
        this.f13886c = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C6390j m17901a(C6382f c6382f, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (jSONObject.has("prefixes")) {
            JSONArray jSONArray = jSONObject.getJSONArray("prefixes");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String string = jSONArray.getString(i10);
                if (string.endsWith("/")) {
                    string = string.substring(0, string.length() - 1);
                }
                arrayList.add(c6382f.m17868n(string));
            }
        }
        if (jSONObject.has("items")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("items");
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                arrayList2.add(c6382f.m17868n(jSONArray2.getJSONObject(i11).getString("name")));
            }
        }
        return new C6390j(arrayList, arrayList2, jSONObject.optString("nextPageToken", null));
    }

    /* renamed from: b */
    public List<C6401p> m17902b() {
        return this.f13885b;
    }

    /* renamed from: c */
    public String m17903c() {
        return this.f13886c;
    }

    /* renamed from: d */
    public List<C6401p> m17904d() {
        return this.f13884a;
    }
}

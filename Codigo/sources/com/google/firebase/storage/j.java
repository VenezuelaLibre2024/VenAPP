package com.google.firebase.storage;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final List<p> f12652a;

    /* renamed from: b, reason: collision with root package name */
    private final List<p> f12653b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12654c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(List<p> list, List<p> list2, String str) {
        this.f12652a = list;
        this.f12653b = list2;
        this.f12654c = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j a(f fVar, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (jSONObject.has("prefixes")) {
            JSONArray jSONArray = jSONObject.getJSONArray("prefixes");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String string = jSONArray.getString(i10);
                if (string.endsWith("/")) {
                    string = string.substring(0, string.length() - 1);
                }
                arrayList.add(fVar.n(string));
            }
        }
        if (jSONObject.has("items")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("items");
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                arrayList2.add(fVar.n(jSONArray2.getJSONObject(i11).getString("name")));
            }
        }
        return new j(arrayList, arrayList2, jSONObject.optString("nextPageToken", null));
    }

    public List<p> b() {
        return this.f12653b;
    }

    public String c() {
        return this.f12654c;
    }

    public List<p> d() {
        return this.f12652a;
    }
}

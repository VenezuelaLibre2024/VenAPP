package l9;

import android.os.Bundle;
import android.util.JsonReader;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f21105a;

    /* renamed from: b, reason: collision with root package name */
    public String f21106b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f21107c = new Bundle();

    public o(JsonReader jsonReader) {
        char c10;
        HashMap hashMap = new HashMap();
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName = nextName == null ? "" : nextName;
            int hashCode = nextName.hashCode();
            if (hashCode != -995427962) {
                if (hashCode == -271442291 && nextName.equals("signal_dictionary")) {
                    c10 = 1;
                }
                c10 = 65535;
            } else {
                if (nextName.equals("params")) {
                    c10 = 0;
                }
                c10 = 65535;
            }
            if (c10 == 0) {
                str = jsonReader.nextString();
            } else if (c10 != 1) {
                jsonReader.skipValue();
            } else {
                hashMap = new HashMap();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    hashMap.put(jsonReader.nextName(), jsonReader.nextString());
                }
                jsonReader.endObject();
            }
        }
        this.f21105a = str;
        jsonReader.endObject();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.f21107c.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }
}

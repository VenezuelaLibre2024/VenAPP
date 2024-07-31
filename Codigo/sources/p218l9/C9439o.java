package p218l9;

import android.os.Bundle;
import android.util.JsonReader;
import java.util.HashMap;
import java.util.Map;

/* renamed from: l9.o */
/* loaded from: classes.dex */
public final class C9439o {

    /* renamed from: a */
    public final String f22958a;

    /* renamed from: b */
    public String f22959b;

    /* renamed from: c */
    public Bundle f22960c = new Bundle();

    public C9439o(JsonReader jsonReader) {
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
        this.f22958a = str;
        jsonReader.endObject();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.f22960c.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }
}

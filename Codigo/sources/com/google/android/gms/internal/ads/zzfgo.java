package com.google.android.gms.internal.ads;

import android.util.JsonReader;

/* loaded from: classes2.dex */
public final class zzfgo {
    private String zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfgo(JsonReader jsonReader) {
        char c10;
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode != -1724546052) {
                if (hashCode == 3059181 && nextName.equals("code")) {
                    c10 = 0;
                }
                c10 = 65535;
            } else {
                if (nextName.equals("description")) {
                    c10 = 1;
                }
                c10 = 65535;
            }
            if (c10 == 0) {
                jsonReader.nextInt();
            } else if (c10 != 1) {
                jsonReader.skipValue();
            } else {
                str = jsonReader.nextString();
            }
        }
        jsonReader.endObject();
        this.zza = str;
    }

    public final String zza() {
        return this.zza;
    }
}

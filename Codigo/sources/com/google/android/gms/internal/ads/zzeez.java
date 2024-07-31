package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.util.y0;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import la.l;

/* loaded from: classes2.dex */
public final class zzeez {
    public int zza = 0;
    public Map zzb = new HashMap();
    public String zzc = "";
    public long zzd = -1;

    public static zzeez zza(Reader reader) {
        try {
            try {
                JsonReader jsonReader = new JsonReader(reader);
                HashMap hashMap = new HashMap();
                String str = "";
                jsonReader.beginObject();
                long j10 = -1;
                int i10 = 0;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    if ("response".equals(nextName)) {
                        i10 = jsonReader.nextInt();
                    } else if ("body".equals(nextName)) {
                        str = jsonReader.nextString();
                    } else if ("latency".equals(nextName)) {
                        j10 = jsonReader.nextLong();
                    } else if ("headers".equals(nextName)) {
                        hashMap = new HashMap();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            hashMap.put(jsonReader.nextName(), y0.d(jsonReader));
                        }
                        jsonReader.endObject();
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                zzeez zzeezVar = new zzeez();
                zzeezVar.zza = i10;
                if (str != null) {
                    zzeezVar.zzc = str;
                }
                zzeezVar.zzd = j10;
                zzeezVar.zzb = hashMap;
                return zzeezVar;
            } catch (IOException | AssertionError | IllegalStateException | NumberFormatException e10) {
                throw new zzfgq("Unable to parse Response", e10);
            }
        } finally {
            l.a(reader);
        }
    }
}

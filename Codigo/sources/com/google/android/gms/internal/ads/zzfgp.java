package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.util.y0;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzfgp {
    public final List zza;
    public final String zzb;
    public final int zzc;
    public final String zzd;
    public final int zze;
    public final long zzf;
    public final boolean zzg;
    public final String zzh;
    public final zzfgo zzi;
    public final Bundle zzj;
    public final String zzk;
    public final String zzl;
    public final String zzm;
    public final JSONObject zzn;
    public final String zzo;
    public final int zzp;

    public zzfgp(JsonReader jsonReader) {
        List emptyList = Collections.emptyList();
        Bundle bundle = new Bundle();
        JSONObject jSONObject = new JSONObject();
        jsonReader.beginObject();
        String str = "";
        String str2 = "";
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        boolean z10 = false;
        int i10 = 0;
        int i11 = 0;
        zzfgo zzfgoVar = null;
        long j10 = 0;
        int i12 = 1;
        String str6 = str5;
        String str7 = str6;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            String str8 = str5;
            if ("nofill_urls".equals(nextName)) {
                emptyList = y0.d(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i10 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str6 = jsonReader.nextString();
            } else if ("is_idless".equals(nextName)) {
                z10 = jsonReader.nextBoolean();
            } else if ("response_code".equals(nextName)) {
                i11 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j10 = jsonReader.nextLong();
            } else {
                JSONObject jSONObject2 = jSONObject;
                if (((Boolean) a0.c().zza(zzbgc.zzig)).booleanValue() && "public_error".equals(nextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    zzfgoVar = new zzfgo(jsonReader);
                } else if ("bidding_data".equals(nextName)) {
                    str7 = jsonReader.nextString();
                } else {
                    if (((Boolean) a0.c().zza(zzbgc.zzjU)).booleanValue() && Objects.equals(nextName, "topics_should_record_observation")) {
                        jsonReader.nextBoolean();
                    } else if ("adapter_response_replacement_key".equals(nextName)) {
                        str5 = jsonReader.nextString();
                        jSONObject = jSONObject2;
                    } else if ("response_info_extras".equals(nextName)) {
                        if (((Boolean) a0.c().zza(zzbgc.zzgQ)).booleanValue()) {
                            try {
                                Bundle a10 = y0.a(y0.h(jsonReader));
                                if (a10 != null) {
                                    bundle = a10;
                                }
                            } catch (IOException | JSONException unused) {
                            } catch (IllegalStateException unused2) {
                            }
                        }
                        jsonReader.skipValue();
                    } else if ("adRequestPostBody".equals(nextName)) {
                        if (((Boolean) a0.c().zza(zzbgc.zzjg)).booleanValue()) {
                            str3 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestUrl".equals(nextName)) {
                        if (((Boolean) a0.c().zza(zzbgc.zzjg)).booleanValue()) {
                            str2 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else {
                        zzbfu zzbfuVar = zzbgc.zzjh;
                        if (((Boolean) a0.c().zza(zzbfuVar)).booleanValue() && Objects.equals(nextName, "adResponseBody")) {
                            str4 = jsonReader.nextString();
                        } else if (((Boolean) a0.c().zza(zzbfuVar)).booleanValue() && Objects.equals(nextName, "adResponseHeaders")) {
                            jSONObject = y0.h(jsonReader);
                        } else {
                            if (Objects.equals(nextName, "max_parallel_renderers")) {
                                i12 = Math.max(1, jsonReader.nextInt());
                            } else {
                                jsonReader.skipValue();
                            }
                            str5 = str8;
                            jSONObject = jSONObject2;
                        }
                    }
                    str5 = str8;
                    jSONObject = jSONObject2;
                }
                str5 = str8;
                jSONObject = jSONObject2;
            }
            str5 = str8;
        }
        jsonReader.endObject();
        this.zza = emptyList;
        this.zzc = i10;
        this.zzb = str;
        this.zzd = str6;
        this.zze = i11;
        this.zzf = j10;
        this.zzi = zzfgoVar;
        this.zzg = z10;
        this.zzh = str7;
        this.zzj = bundle;
        this.zzk = str2;
        this.zzl = str3;
        this.zzm = str4;
        this.zzn = jSONObject;
        this.zzo = str5;
        zzbhm zzbhmVar = zzbif.zza;
        this.zzp = ((Long) zzbhmVar.zze()).longValue() > 0 ? ((Long) zzbhmVar.zze()).intValue() : i12;
    }
}

package p118g6;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.io.Reader;

/* renamed from: g6.n */
/* loaded from: classes.dex */
public abstract class AbstractC7462n {
    /* renamed from: a */
    static AbstractC7462n m22583a(long j10) {
        return new C7456h(j10);
    }

    /* renamed from: b */
    public static AbstractC7462n m22584b(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    return jsonReader.peek() == JsonToken.STRING ? m22583a(Long.parseLong(jsonReader.nextString())) : m22583a(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    /* renamed from: c */
    public abstract long mo22568c();
}

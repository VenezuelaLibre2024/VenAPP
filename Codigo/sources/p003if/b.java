package p003if;

import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes2.dex */
public class b implements a {
    @Override // p003if.a
    public HttpURLConnection a(URL url) {
        return (HttpURLConnection) url.openConnection();
    }
}

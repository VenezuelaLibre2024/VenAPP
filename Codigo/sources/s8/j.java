package s8;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface j extends h {

    /* loaded from: classes.dex */
    public interface a {
        j a();
    }

    void close();

    default Map<String, List<String>> e() {
        return Collections.emptyMap();
    }

    Uri getUri();

    void l(m0 m0Var);

    long o(n nVar);
}

package p484z9;

import com.google.android.gms.common.api.AbstractC5109i;
import com.google.android.gms.common.api.C5200j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C5185v;
import com.google.android.gms.common.internal.C5276s;
import ga.C7533a;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: z9.f */
/* loaded from: classes.dex */
public final class RunnableC12833f implements Runnable {

    /* renamed from: c */
    private static final C7533a f35025c = new C7533a("RevokeAccessOperation", new String[0]);

    /* renamed from: a */
    private final String f35026a;

    /* renamed from: b */
    private final C5185v f35027b = new C5185v(null);

    public RunnableC12833f(String str) {
        this.f35026a = C5276s.m13320f(str);
    }

    /* renamed from: a */
    public static AbstractC5109i m42578a(String str) {
        if (str == null) {
            return C5200j.m13209a(new Status(4), null);
        }
        RunnableC12833f runnableC12833f = new RunnableC12833f(str);
        new Thread(runnableC12833f).start();
        return runnableC12833f.f35027b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Status status = Status.f10402t;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.f35026a).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f10400r;
            } else {
                f35025c.m22871c("Unable to revoke access!", new Object[0]);
            }
            f35025c.m22869a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e10) {
            f35025c.m22871c("IOException when revoking access: ".concat(String.valueOf(e10.toString())), new Object[0]);
        } catch (Exception e11) {
            f35025c.m22871c("Exception when revoking access: ".concat(String.valueOf(e11.toString())), new Object[0]);
        }
        this.f35027b.setResult(status);
    }
}

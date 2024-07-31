package z9;

import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    private static final ga.a f32474c = new ga.a("RevokeAccessOperation", new String[0]);

    /* renamed from: a, reason: collision with root package name */
    private final String f32475a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.common.api.internal.v f32476b = new com.google.android.gms.common.api.internal.v(null);

    public f(String str) {
        this.f32475a = com.google.android.gms.common.internal.s.f(str);
    }

    public static com.google.android.gms.common.api.i a(String str) {
        if (str == null) {
            return com.google.android.gms.common.api.j.a(new Status(4), null);
        }
        f fVar = new f(str);
        new Thread(fVar).start();
        return fVar.f32476b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Status status = Status.f9294t;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.f32475a).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f9292r;
            } else {
                f32474c.c("Unable to revoke access!", new Object[0]);
            }
            f32474c.a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e10) {
            f32474c.c("IOException when revoking access: ".concat(String.valueOf(e10.toString())), new Object[0]);
        } catch (Exception e11) {
            f32474c.c("Exception when revoking access: ".concat(String.valueOf(e11.toString())), new Object[0]);
        }
        this.f32476b.setResult(status);
    }
}

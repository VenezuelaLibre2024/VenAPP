package x8;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.m4;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.internal.ads.zzcec;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a */
    private final Object f30658a = new Object();

    /* renamed from: b */
    private s2 f30659b;

    /* renamed from: c */
    private a f30660c;

    /* loaded from: classes.dex */
    public static abstract class a {
        public void onVideoEnd() {
        }

        public void onVideoMute(boolean z10) {
        }

        public void onVideoPause() {
        }

        public void onVideoPlay() {
        }

        public void onVideoStart() {
        }
    }

    public void a(a aVar) {
        m4 m4Var;
        synchronized (this.f30658a) {
            this.f30660c = aVar;
            s2 s2Var = this.f30659b;
            if (s2Var == null) {
                return;
            }
            if (aVar == null) {
                m4Var = null;
            } else {
                try {
                    m4Var = new m4(aVar);
                } catch (RemoteException e10) {
                    zzcec.zzh("Unable to call setVideoLifecycleCallbacks on video controller.", e10);
                }
            }
            s2Var.zzm(m4Var);
        }
    }

    public final s2 b() {
        s2 s2Var;
        synchronized (this.f30658a) {
            s2Var = this.f30659b;
        }
        return s2Var;
    }

    public final void c(s2 s2Var) {
        synchronized (this.f30658a) {
            this.f30659b = s2Var;
            a aVar = this.f30660c;
            if (aVar != null) {
                a(aVar);
            }
        }
    }
}

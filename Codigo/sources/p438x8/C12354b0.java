package p438x8;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.BinderC4869m4;
import com.google.android.gms.ads.internal.client.InterfaceC4903s2;
import com.google.android.gms.internal.ads.zzcec;

/* renamed from: x8.b0 */
/* loaded from: classes.dex */
public final class C12354b0 {

    /* renamed from: a */
    private final Object f33178a = new Object();

    /* renamed from: b */
    private InterfaceC4903s2 f33179b;

    /* renamed from: c */
    private a f33180c;

    /* renamed from: x8.b0$a */
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

    /* renamed from: a */
    public void m39958a(a aVar) {
        BinderC4869m4 binderC4869m4;
        synchronized (this.f33178a) {
            this.f33180c = aVar;
            InterfaceC4903s2 interfaceC4903s2 = this.f33179b;
            if (interfaceC4903s2 == null) {
                return;
            }
            if (aVar == null) {
                binderC4869m4 = null;
            } else {
                try {
                    binderC4869m4 = new BinderC4869m4(aVar);
                } catch (RemoteException e10) {
                    zzcec.zzh("Unable to call setVideoLifecycleCallbacks on video controller.", e10);
                }
            }
            interfaceC4903s2.zzm(binderC4869m4);
        }
    }

    /* renamed from: b */
    public final InterfaceC4903s2 m39959b() {
        InterfaceC4903s2 interfaceC4903s2;
        synchronized (this.f33178a) {
            interfaceC4903s2 = this.f33179b;
        }
        return interfaceC4903s2;
    }

    /* renamed from: c */
    public final void m39960c(InterfaceC4903s2 interfaceC4903s2) {
        synchronized (this.f33178a) {
            this.f33179b = interfaceC4903s2;
            a aVar = this.f33180c;
            if (aVar != null) {
                m39958a(aVar);
            }
        }
    }
}

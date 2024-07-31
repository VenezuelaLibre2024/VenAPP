package ba;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ba.t */
/* loaded from: classes.dex */
public abstract class AbstractC1708t<T> {

    /* renamed from: a */
    final int f7280a;

    /* renamed from: b */
    final TaskCompletionSource<T> f7281b = new TaskCompletionSource<>();

    /* renamed from: c */
    final int f7282c;

    /* renamed from: d */
    final Bundle f7283d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1708t(int i10, int i11, Bundle bundle) {
        this.f7280a = i10;
        this.f7282c = i11;
        this.f7283d = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo9307a(Bundle bundle);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract boolean mo9308b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m9309c(C1709u c1709u) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(c1709u);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 14 + valueOf2.length());
            sb2.append("Failing ");
            sb2.append(valueOf);
            sb2.append(" with ");
            sb2.append(valueOf2);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        this.f7281b.setException(c1709u);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m9310d(T t10) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t10);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 16 + valueOf2.length());
            sb2.append("Finishing ");
            sb2.append(valueOf);
            sb2.append(" with ");
            sb2.append(valueOf2);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        this.f7281b.setResult(t10);
    }

    public final String toString() {
        int i10 = this.f7282c;
        int i11 = this.f7280a;
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("Request { what=");
        sb2.append(i10);
        sb2.append(" id=");
        sb2.append(i11);
        sb2.append(" oneWay=");
        sb2.append(mo9308b());
        sb2.append("}");
        return sb2.toString();
    }
}

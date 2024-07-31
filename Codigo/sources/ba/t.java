package ba;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class t<T> {

    /* renamed from: a, reason: collision with root package name */
    final int f6358a;

    /* renamed from: b, reason: collision with root package name */
    final TaskCompletionSource<T> f6359b = new TaskCompletionSource<>();

    /* renamed from: c, reason: collision with root package name */
    final int f6360c;

    /* renamed from: d, reason: collision with root package name */
    final Bundle f6361d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(int i10, int i11, Bundle bundle) {
        this.f6358a = i10;
        this.f6360c = i11;
        this.f6361d = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(Bundle bundle);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(u uVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(uVar);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 14 + valueOf2.length());
            sb2.append("Failing ");
            sb2.append(valueOf);
            sb2.append(" with ");
            sb2.append(valueOf2);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        this.f6359b.setException(uVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(T t10) {
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
        this.f6359b.setResult(t10);
    }

    public final String toString() {
        int i10 = this.f6360c;
        int i11 = this.f6358a;
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("Request { what=");
        sb2.append(i10);
        sb2.append(" id=");
        sb2.append(i11);
        sb2.append(" oneWay=");
        sb2.append(b());
        sb2.append("}");
        return sb2.toString();
    }
}

package af;

import android.util.Log;
import cf.AbstractC1962e;
import cf.InterfaceC1963f;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.C6350f;
import com.google.firebase.remoteconfig.internal.C6351g;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p488ze.C13012i;

/* renamed from: af.e */
/* loaded from: classes2.dex */
public class C0112e {

    /* renamed from: a */
    private C6350f f487a;

    /* renamed from: b */
    private C0108a f488b;

    /* renamed from: c */
    private Executor f489c;

    /* renamed from: d */
    private Set<InterfaceC1963f> f490d = Collections.newSetFromMap(new ConcurrentHashMap());

    public C0112e(C6350f c6350f, C0108a c0108a, Executor executor) {
        this.f487a = c6350f;
        this.f488b = c0108a;
        this.f489c = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m527f(Task task, final InterfaceC1963f interfaceC1963f, C6351g c6351g) {
        try {
            C6351g c6351g2 = (C6351g) task.getResult();
            if (c6351g2 != null) {
                final AbstractC1962e m521b = this.f488b.m521b(c6351g2);
                this.f489c.execute(new Runnable() { // from class: af.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1963f.this.mo10214a(m521b);
                    }
                });
            }
        } catch (C13012i e10) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e10);
        }
    }

    /* renamed from: g */
    public void m528g(C6351g c6351g) {
        try {
            final AbstractC1962e m521b = this.f488b.m521b(c6351g);
            for (final InterfaceC1963f interfaceC1963f : this.f490d) {
                this.f489c.execute(new Runnable() { // from class: af.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1963f.this.mo10214a(m521b);
                    }
                });
            }
        } catch (C13012i e10) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e10);
        }
    }

    /* renamed from: h */
    public void m529h(final InterfaceC1963f interfaceC1963f) {
        this.f490d.add(interfaceC1963f);
        final Task<C6351g> m17619e = this.f487a.m17619e();
        m17619e.addOnSuccessListener(this.f489c, new OnSuccessListener() { // from class: af.b
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                C0112e.this.m527f(m17619e, interfaceC1963f, (C6351g) obj);
            }
        });
    }
}

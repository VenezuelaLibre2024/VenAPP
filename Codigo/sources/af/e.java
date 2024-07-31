package af;

import android.util.Log;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.f;
import com.google.firebase.remoteconfig.internal.g;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import ze.i;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private f f422a;

    /* renamed from: b, reason: collision with root package name */
    private a f423b;

    /* renamed from: c, reason: collision with root package name */
    private Executor f424c;

    /* renamed from: d, reason: collision with root package name */
    private Set<cf.f> f425d = Collections.newSetFromMap(new ConcurrentHashMap());

    public e(f fVar, a aVar, Executor executor) {
        this.f422a = fVar;
        this.f423b = aVar;
        this.f424c = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(Task task, final cf.f fVar, g gVar) {
        try {
            g gVar2 = (g) task.getResult();
            if (gVar2 != null) {
                final cf.e b10 = this.f423b.b(gVar2);
                this.f424c.execute(new Runnable() { // from class: af.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        cf.f.this.a(b10);
                    }
                });
            }
        } catch (i e10) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e10);
        }
    }

    public void g(g gVar) {
        try {
            final cf.e b10 = this.f423b.b(gVar);
            for (final cf.f fVar : this.f425d) {
                this.f424c.execute(new Runnable() { // from class: af.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        cf.f.this.a(b10);
                    }
                });
            }
        } catch (i e10) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e10);
        }
    }

    public void h(final cf.f fVar) {
        this.f425d.add(fVar);
        final Task<g> e10 = this.f422a.e();
        e10.addOnSuccessListener(this.f424c, new OnSuccessListener() { // from class: af.b
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                e.this.f(e10, fVar, (g) obj);
            }
        });
    }
}

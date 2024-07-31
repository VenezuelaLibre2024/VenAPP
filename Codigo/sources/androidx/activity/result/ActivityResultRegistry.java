package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.f;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* renamed from: a, reason: collision with root package name */
    private Random f655a = new Random();

    /* renamed from: b, reason: collision with root package name */
    private final Map<Integer, String> f656b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    final Map<String, Integer> f657c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, d> f658d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    ArrayList<String> f659e = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    final transient Map<String, c<?>> f660f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    final Map<String, Object> f661g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    final Bundle f662h = new Bundle();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [I] */
    /* loaded from: classes.dex */
    public class a<I> extends androidx.activity.result.c<I> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f667a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f.a f668b;

        a(String str, f.a aVar) {
            this.f667a = str;
            this.f668b = aVar;
        }

        @Override // androidx.activity.result.c
        public void b(I i10, androidx.core.app.d dVar) {
            Integer num = ActivityResultRegistry.this.f657c.get(this.f667a);
            if (num != null) {
                ActivityResultRegistry.this.f659e.add(this.f667a);
                try {
                    ActivityResultRegistry.this.f(num.intValue(), this.f668b, i10, dVar);
                    return;
                } catch (Exception e10) {
                    ActivityResultRegistry.this.f659e.remove(this.f667a);
                    throw e10;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f668b + " and input " + i10 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.activity.result.c
        public void c() {
            ActivityResultRegistry.this.l(this.f667a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [I] */
    /* loaded from: classes.dex */
    public class b<I> extends androidx.activity.result.c<I> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f670a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f.a f671b;

        b(String str, f.a aVar) {
            this.f670a = str;
            this.f671b = aVar;
        }

        @Override // androidx.activity.result.c
        public void b(I i10, androidx.core.app.d dVar) {
            Integer num = ActivityResultRegistry.this.f657c.get(this.f670a);
            if (num != null) {
                ActivityResultRegistry.this.f659e.add(this.f670a);
                try {
                    ActivityResultRegistry.this.f(num.intValue(), this.f671b, i10, dVar);
                    return;
                } catch (Exception e10) {
                    ActivityResultRegistry.this.f659e.remove(this.f670a);
                    throw e10;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f671b + " and input " + i10 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.activity.result.c
        public void c() {
            ActivityResultRegistry.this.l(this.f670a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c<O> {

        /* renamed from: a, reason: collision with root package name */
        final androidx.activity.result.b<O> f673a;

        /* renamed from: b, reason: collision with root package name */
        final f.a<?, O> f674b;

        c(androidx.activity.result.b<O> bVar, f.a<?, O> aVar) {
            this.f673a = bVar;
            this.f674b = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        final androidx.lifecycle.f f675a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<i> f676b = new ArrayList<>();

        d(androidx.lifecycle.f fVar) {
            this.f675a = fVar;
        }

        void a(i iVar) {
            this.f675a.a(iVar);
            this.f676b.add(iVar);
        }

        void b() {
            Iterator<i> it = this.f676b.iterator();
            while (it.hasNext()) {
                this.f675a.c(it.next());
            }
            this.f676b.clear();
        }
    }

    private void a(int i10, String str) {
        this.f656b.put(Integer.valueOf(i10), str);
        this.f657c.put(str, Integer.valueOf(i10));
    }

    private <O> void d(String str, int i10, Intent intent, c<O> cVar) {
        if (cVar == null || cVar.f673a == null || !this.f659e.contains(str)) {
            this.f661g.remove(str);
            this.f662h.putParcelable(str, new androidx.activity.result.a(i10, intent));
        } else {
            cVar.f673a.a(cVar.f674b.c(i10, intent));
            this.f659e.remove(str);
        }
    }

    private int e() {
        int nextInt = this.f655a.nextInt(2147418112);
        while (true) {
            int i10 = nextInt + 65536;
            if (!this.f656b.containsKey(Integer.valueOf(i10))) {
                return i10;
            }
            nextInt = this.f655a.nextInt(2147418112);
        }
    }

    private void k(String str) {
        if (this.f657c.get(str) != null) {
            return;
        }
        a(e(), str);
    }

    public final boolean b(int i10, int i11, Intent intent) {
        String str = this.f656b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        d(str, i11, intent, this.f660f.get(str));
        return true;
    }

    public final <O> boolean c(int i10, O o10) {
        androidx.activity.result.b<?> bVar;
        String str = this.f656b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        c<?> cVar = this.f660f.get(str);
        if (cVar == null || (bVar = cVar.f673a) == null) {
            this.f662h.remove(str);
            this.f661g.put(str, o10);
            return true;
        }
        if (!this.f659e.remove(str)) {
            return true;
        }
        bVar.a(o10);
        return true;
    }

    public abstract <I, O> void f(int i10, f.a<I, O> aVar, I i11, androidx.core.app.d dVar);

    public final void g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.f659e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        this.f655a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
        this.f662h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
        for (int i10 = 0; i10 < stringArrayList.size(); i10++) {
            String str = stringArrayList.get(i10);
            if (this.f657c.containsKey(str)) {
                Integer remove = this.f657c.remove(str);
                if (!this.f662h.containsKey(str)) {
                    this.f656b.remove(remove);
                }
            }
            a(integerArrayList.get(i10).intValue(), stringArrayList.get(i10));
        }
    }

    public final void h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f657c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f657c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f659e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f662h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f655a);
    }

    public final <I, O> androidx.activity.result.c<I> i(final String str, k kVar, final f.a<I, O> aVar, final androidx.activity.result.b<O> bVar) {
        androidx.lifecycle.f lifecycle = kVar.getLifecycle();
        if (lifecycle.b().h(f.b.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + kVar + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.");
        }
        k(str);
        d dVar = this.f658d.get(str);
        if (dVar == null) {
            dVar = new d(lifecycle);
        }
        dVar.a(new i() { // from class: androidx.activity.result.ActivityResultRegistry.1
            @Override // androidx.lifecycle.i
            public void onStateChanged(k kVar2, f.a aVar2) {
                if (!f.a.ON_START.equals(aVar2)) {
                    if (f.a.ON_STOP.equals(aVar2)) {
                        ActivityResultRegistry.this.f660f.remove(str);
                        return;
                    } else {
                        if (f.a.ON_DESTROY.equals(aVar2)) {
                            ActivityResultRegistry.this.l(str);
                            return;
                        }
                        return;
                    }
                }
                ActivityResultRegistry.this.f660f.put(str, new c<>(bVar, aVar));
                if (ActivityResultRegistry.this.f661g.containsKey(str)) {
                    Object obj = ActivityResultRegistry.this.f661g.get(str);
                    ActivityResultRegistry.this.f661g.remove(str);
                    bVar.a(obj);
                }
                androidx.activity.result.a aVar3 = (androidx.activity.result.a) ActivityResultRegistry.this.f662h.getParcelable(str);
                if (aVar3 != null) {
                    ActivityResultRegistry.this.f662h.remove(str);
                    bVar.a(aVar.c(aVar3.b(), aVar3.a()));
                }
            }
        });
        this.f658d.put(str, dVar);
        return new a(str, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <I, O> androidx.activity.result.c<I> j(String str, f.a<I, O> aVar, androidx.activity.result.b<O> bVar) {
        k(str);
        this.f660f.put(str, new c<>(bVar, aVar));
        if (this.f661g.containsKey(str)) {
            Object obj = this.f661g.get(str);
            this.f661g.remove(str);
            bVar.a(obj);
        }
        androidx.activity.result.a aVar2 = (androidx.activity.result.a) this.f662h.getParcelable(str);
        if (aVar2 != null) {
            this.f662h.remove(str);
            bVar.a(aVar.c(aVar2.b(), aVar2.a()));
        }
        return new b(str, aVar);
    }

    final void l(String str) {
        Integer remove;
        if (!this.f659e.contains(str) && (remove = this.f657c.remove(str)) != null) {
            this.f656b.remove(remove);
        }
        this.f660f.remove(str);
        if (this.f661g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f661g.get(str));
            this.f661g.remove(str);
        }
        if (this.f662h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f662h.getParcelable(str));
            this.f662h.remove(str);
        }
        d dVar = this.f658d.get(str);
        if (dVar != null) {
            dVar.b();
            this.f658d.remove(str);
        }
    }
}

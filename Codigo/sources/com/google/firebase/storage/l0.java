package com.google.firebase.storage;

import android.app.Activity;
import com.google.firebase.storage.e0;
import com.google.firebase.storage.e0.a;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class l0<ListenerTypeT, ResultT extends e0.a> {

    /* renamed from: a */
    private final Queue<ListenerTypeT> f12665a = new ConcurrentLinkedQueue();

    /* renamed from: b */
    private final HashMap<ListenerTypeT, gf.g> f12666b = new HashMap<>();

    /* renamed from: c */
    private e0<ResultT> f12667c;

    /* renamed from: d */
    private int f12668d;

    /* renamed from: e */
    private a<ListenerTypeT, ResultT> f12669e;

    /* loaded from: classes2.dex */
    public interface a<ListenerTypeT, ResultT> {
        void a(ListenerTypeT listenertypet, ResultT resultt);
    }

    public l0(e0<ResultT> e0Var, int i10, a<ListenerTypeT, ResultT> aVar) {
        this.f12667c = e0Var;
        this.f12668d = i10;
        this.f12669e = aVar;
    }

    public /* synthetic */ void f(Object obj, e0.a aVar) {
        this.f12669e.a(obj, aVar);
    }

    public /* synthetic */ void g(Object obj, e0.a aVar) {
        this.f12669e.a(obj, aVar);
    }

    public void d(Activity activity, Executor executor, ListenerTypeT listenertypet) {
        boolean z10;
        gf.g gVar;
        com.google.android.gms.common.internal.s.j(listenertypet);
        synchronized (this.f12667c.J()) {
            boolean z11 = true;
            z10 = (this.f12667c.B() & this.f12668d) != 0;
            this.f12665a.add(listenertypet);
            gVar = new gf.g(executor);
            this.f12666b.put(listenertypet, gVar);
            if (activity != null) {
                if (activity.isDestroyed()) {
                    z11 = false;
                }
                com.google.android.gms.common.internal.s.b(z11, "Activity is already destroyed!");
                gf.a.a().c(activity, listenertypet, new Runnable() { // from class: com.google.firebase.storage.j0

                    /* renamed from: b */
                    public final /* synthetic */ Object f12656b;

                    public /* synthetic */ j0(Object listenertypet2) {
                        r2 = listenertypet2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        l0.this.e(r2);
                    }
                });
            }
        }
        if (z10) {
            gVar.a(new Runnable() { // from class: com.google.firebase.storage.k0

                /* renamed from: b */
                public final /* synthetic */ Object f12663b;

                /* renamed from: c */
                public final /* synthetic */ e0.a f12664c;

                public /* synthetic */ k0(Object listenertypet2, e0.a aVar) {
                    r2 = listenertypet2;
                    r3 = aVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    l0.this.f(r2, r3);
                }
            });
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.firebase.storage.i0.<init>(com.google.firebase.storage.l0, java.lang.Object, com.google.firebase.storage.e0$a):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    public void h() {
        /*
            r5 = this;
            com.google.firebase.storage.e0<ResultT extends com.google.firebase.storage.e0$a> r0 = r5.f12667c
            int r0 = r0.B()
            int r1 = r5.f12668d
            r0 = r0 & r1
            if (r0 == 0) goto L34
            com.google.firebase.storage.e0<ResultT extends com.google.firebase.storage.e0$a> r0 = r5.f12667c
            com.google.firebase.storage.e0$a r0 = r0.g0()
            java.util.Queue<ListenerTypeT> r1 = r5.f12665a
            java.util.Iterator r1 = r1.iterator()
        L17:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r1.next()
            java.util.HashMap<ListenerTypeT, gf.g> r3 = r5.f12666b
            java.lang.Object r3 = r3.get(r2)
            gf.g r3 = (gf.g) r3
            if (r3 == 0) goto L17
            com.google.firebase.storage.i0 r4 = new com.google.firebase.storage.i0
            r4.<init>()
            r3.a(r4)
            goto L17
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.storage.l0.h():void");
    }

    /* renamed from: i */
    public void e(ListenerTypeT listenertypet) {
        com.google.android.gms.common.internal.s.j(listenertypet);
        synchronized (this.f12667c.J()) {
            this.f12666b.remove(listenertypet);
            this.f12665a.remove(listenertypet);
            gf.a.a().b(listenertypet);
        }
    }
}

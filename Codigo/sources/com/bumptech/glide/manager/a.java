package com.bumptech.glide.manager;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
class a implements l {

    /* renamed from: a, reason: collision with root package name */
    private final Set<m> f7477a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    private boolean f7478b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7479c;

    @Override // com.bumptech.glide.manager.l
    public void a(m mVar) {
        this.f7477a.remove(mVar);
    }

    @Override // com.bumptech.glide.manager.l
    public void b(m mVar) {
        this.f7477a.add(mVar);
        if (this.f7479c) {
            mVar.onDestroy();
        } else if (this.f7478b) {
            mVar.onStart();
        } else {
            mVar.onStop();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        this.f7479c = true;
        Iterator it = c4.l.j(this.f7477a).iterator();
        while (it.hasNext()) {
            ((m) it.next()).onDestroy();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        this.f7478b = true;
        Iterator it = c4.l.j(this.f7477a).iterator();
        while (it.hasNext()) {
            ((m) it.next()).onStart();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        this.f7478b = false;
        Iterator it = c4.l.j(this.f7477a).iterator();
        while (it.hasNext()) {
            ((m) it.next()).onStop();
        }
    }
}

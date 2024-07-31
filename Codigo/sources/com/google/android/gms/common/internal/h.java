package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class h<T extends IInterface> extends c<T> implements a.f {
    private static volatile Executor zaa;
    private final e zab;
    private final Set zac;
    private final Account zad;

    protected h(Context context, Handler handler, int i10, e eVar) {
        super(context, handler, i.c(context), ca.f.n(), i10, null, null);
        this.zab = (e) s.j(eVar);
        this.zad = eVar.a();
        this.zac = zaa(eVar.d());
    }

    protected h(Context context, Looper looper, int i10, e eVar) {
        this(context, looper, i.c(context), ca.f.n(), i10, eVar, null, null);
    }

    @Deprecated
    public h(Context context, Looper looper, int i10, e eVar, f.a aVar, f.b bVar) {
        this(context, looper, i10, eVar, (com.google.android.gms.common.api.internal.f) aVar, (com.google.android.gms.common.api.internal.n) bVar);
    }

    public h(Context context, Looper looper, int i10, e eVar, com.google.android.gms.common.api.internal.f fVar, com.google.android.gms.common.api.internal.n nVar) {
        this(context, looper, i.c(context), ca.f.n(), i10, eVar, (com.google.android.gms.common.api.internal.f) s.j(fVar), (com.google.android.gms.common.api.internal.n) s.j(nVar));
    }

    protected h(Context context, Looper looper, i iVar, ca.f fVar, int i10, e eVar, com.google.android.gms.common.api.internal.f fVar2, com.google.android.gms.common.api.internal.n nVar) {
        super(context, looper, iVar, fVar, i10, fVar2 == null ? null : new j0(fVar2), nVar == null ? null : new k0(nVar), eVar.j());
        this.zab = eVar;
        this.zad = eVar.a();
        this.zac = zaa(eVar.d());
    }

    private final Set zaa(Set set) {
        Set<Scope> validateScopes = validateScopes(set);
        Iterator<Scope> it = validateScopes.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return validateScopes;
    }

    @Override // com.google.android.gms.common.internal.c
    public final Account getAccount() {
        return this.zad;
    }

    @Override // com.google.android.gms.common.internal.c
    protected final Executor getBindServiceExecutor() {
        return null;
    }

    public final e getClientSettings() {
        return this.zab;
    }

    public ca.d[] getRequiredFeatures() {
        return new ca.d[0];
    }

    @Override // com.google.android.gms.common.internal.c
    protected final Set<Scope> getScopes() {
        return this.zac;
    }

    @Override // com.google.android.gms.common.api.a.f
    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        return requiresSignIn() ? this.zac : Collections.emptySet();
    }

    protected Set<Scope> validateScopes(Set<Scope> set) {
        return set;
    }
}

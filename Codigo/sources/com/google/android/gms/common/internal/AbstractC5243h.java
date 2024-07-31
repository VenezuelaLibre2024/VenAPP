package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import ca.C1898d;
import ca.C1902f;
import com.google.android.gms.common.api.AbstractC5106f;
import com.google.android.gms.common.api.C5101a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.InterfaceC5131f;
import com.google.android.gms.common.api.internal.InterfaceC5161n;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.internal.h */
/* loaded from: classes.dex */
public abstract class AbstractC5243h<T extends IInterface> extends AbstractC5228c<T> implements C5101a.f {
    private static volatile Executor zaa;
    private final C5234e zab;
    private final Set zac;
    private final Account zad;

    protected AbstractC5243h(Context context, Handler handler, int i10, C5234e c5234e) {
        super(context, handler, AbstractC5246i.m13271c(context), C1902f.m10067n(), i10, null, null);
        this.zab = (C5234e) C5276s.m13324j(c5234e);
        this.zad = c5234e.m13231a();
        this.zac = zaa(c5234e.m13234d());
    }

    protected AbstractC5243h(Context context, Looper looper, int i10, C5234e c5234e) {
        this(context, looper, AbstractC5246i.m13271c(context), C1902f.m10067n(), i10, c5234e, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public AbstractC5243h(Context context, Looper looper, int i10, C5234e c5234e, AbstractC5106f.a aVar, AbstractC5106f.b bVar) {
        this(context, looper, i10, c5234e, (InterfaceC5131f) aVar, (InterfaceC5161n) bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC5243h(Context context, Looper looper, int i10, C5234e c5234e, InterfaceC5131f interfaceC5131f, InterfaceC5161n interfaceC5161n) {
        this(context, looper, AbstractC5246i.m13271c(context), C1902f.m10067n(), i10, c5234e, (InterfaceC5131f) C5276s.m13324j(interfaceC5131f), (InterfaceC5161n) C5276s.m13324j(interfaceC5161n));
    }

    protected AbstractC5243h(Context context, Looper looper, AbstractC5246i abstractC5246i, C1902f c1902f, int i10, C5234e c5234e, InterfaceC5131f interfaceC5131f, InterfaceC5161n interfaceC5161n) {
        super(context, looper, abstractC5246i, c1902f, i10, interfaceC5131f == null ? null : new C5250j0(interfaceC5131f), interfaceC5161n == null ? null : new C5253k0(interfaceC5161n), c5234e.m13240j());
        this.zab = c5234e;
        this.zad = c5234e.m13231a();
        this.zac = zaa(c5234e.m13234d());
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

    @Override // com.google.android.gms.common.internal.AbstractC5228c
    public final Account getAccount() {
        return this.zad;
    }

    @Override // com.google.android.gms.common.internal.AbstractC5228c
    protected final Executor getBindServiceExecutor() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final C5234e getClientSettings() {
        return this.zab;
    }

    public C1898d[] getRequiredFeatures() {
        return new C1898d[0];
    }

    @Override // com.google.android.gms.common.internal.AbstractC5228c
    protected final Set<Scope> getScopes() {
        return this.zac;
    }

    @Override // com.google.android.gms.common.api.C5101a.f
    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        return requiresSignIn() ? this.zac : Collections.emptySet();
    }

    protected Set<Scope> validateScopes(Set<Scope> set) {
        return set;
    }
}

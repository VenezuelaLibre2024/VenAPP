package p121g9;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: g9.m */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC7519m implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ BinderC7527u f17763a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC7519m(BinderC7527u binderC7527u) {
        this.f17763a = binderC7527u;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BinderC7527u binderC7527u = this.f17763a;
        binderC7527u.f17780G = 2;
        binderC7527u.f17781a.finish();
    }
}

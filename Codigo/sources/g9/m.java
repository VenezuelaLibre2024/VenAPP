package g9;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ u f16134a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(u uVar) {
        this.f16134a = uVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        u uVar = this.f16134a;
        uVar.G = 2;
        uVar.f16144a.finish();
    }
}

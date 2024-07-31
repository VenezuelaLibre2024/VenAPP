package p121g9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageButton;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: g9.x */
/* loaded from: classes.dex */
public final class C7530x extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ ViewOnClickListenerC7532z f17796a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7530x(ViewOnClickListenerC7532z viewOnClickListenerC7532z) {
        this.f17796a = viewOnClickListenerC7532z;
    }

    /* renamed from: a */
    private final void m22865a(boolean z10) {
        ImageButton imageButton;
        this.f17796a.setEnabled(z10);
        imageButton = this.f17796a.f17801a;
        imageButton.setEnabled(z10);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        m22865a(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m22865a(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        m22865a(false);
    }
}

package p020b2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: b2.a */
/* loaded from: classes.dex */
class C1610a {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8951a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m8952b(Animator animator) {
        animator.pause();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m8953c(Animator animator) {
        animator.resume();
    }
}

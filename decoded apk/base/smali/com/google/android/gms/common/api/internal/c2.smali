.class final Lcom/google/android/gms/common/api/internal/c2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final a:Lcom/google/android/gms/common/api/internal/a2;

.field final synthetic b:Lcom/google/android/gms/common/api/internal/d2;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/internal/d2;Lcom/google/android/gms/common/api/internal/a2;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/c2;->b:Lcom/google/android/gms/common/api/internal/d2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/c2;->a:Lcom/google/android/gms/common/api/internal/a2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/c2;->b:Lcom/google/android/gms/common/api/internal/d2;

    iget-boolean v0, v0, Lcom/google/android/gms/common/api/internal/d2;->a:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/c2;->a:Lcom/google/android/gms/common/api/internal/a2;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/a2;->b()Lca/b;

    move-result-object v0

    invoke-virtual {v0}, Lca/b;->x1()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/c2;->b:Lcom/google/android/gms/common/api/internal/d2;

    iget-object v2, v1, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->mLifecycleFragment:Lcom/google/android/gms/common/api/internal/j;

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0}, Lca/b;->w1()Landroid/app/PendingIntent;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/PendingIntent;

    iget-object v3, p0, Lcom/google/android/gms/common/api/internal/c2;->a:Lcom/google/android/gms/common/api/internal/a2;

    invoke-virtual {v3}, Lcom/google/android/gms/common/api/internal/a2;->a()I

    move-result v3

    const/4 v4, 0x0

    invoke-static {v1, v0, v3, v4}, Lcom/google/android/gms/common/api/GoogleApiActivity;->a(Landroid/content/Context;Landroid/app/PendingIntent;IZ)Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v2, v0, v1}, Lcom/google/android/gms/common/api/internal/j;->startActivityForResult(Landroid/content/Intent;I)V

    return-void

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/c2;->b:Lcom/google/android/gms/common/api/internal/d2;

    iget-object v2, v1, Lcom/google/android/gms/common/api/internal/d2;->d:Lca/f;

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0}, Lca/b;->u1()I

    move-result v3

    const/4 v4, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lca/f;->b(Landroid/content/Context;ILjava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/c2;->b:Lcom/google/android/gms/common/api/internal/d2;

    iget-object v2, v1, Lcom/google/android/gms/common/api/internal/d2;->d:Lca/f;

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->getActivity()Landroid/app/Activity;

    move-result-object v3

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/c2;->b:Lcom/google/android/gms/common/api/internal/d2;

    iget-object v4, v1, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->mLifecycleFragment:Lcom/google/android/gms/common/api/internal/j;

    invoke-virtual {v0}, Lca/b;->u1()I

    move-result v5

    const/4 v6, 0x2

    iget-object v7, p0, Lcom/google/android/gms/common/api/internal/c2;->b:Lcom/google/android/gms/common/api/internal/d2;

    invoke-virtual/range {v2 .. v7}, Lca/f;->w(Landroid/app/Activity;Lcom/google/android/gms/common/api/internal/j;IILandroid/content/DialogInterface$OnCancelListener;)Z

    return-void

    :cond_2
    invoke-virtual {v0}, Lca/b;->u1()I

    move-result v1

    const/16 v2, 0x12

    if-ne v1, v2, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/c2;->b:Lcom/google/android/gms/common/api/internal/d2;

    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/d2;->d:Lca/f;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->getActivity()Landroid/app/Activity;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/c2;->b:Lcom/google/android/gms/common/api/internal/d2;

    invoke-virtual {v1, v0, v2}, Lca/f;->r(Landroid/app/Activity;Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/Dialog;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/c2;->b:Lcom/google/android/gms/common/api/internal/d2;

    iget-object v2, v1, Lcom/google/android/gms/common/api/internal/d2;->d:Lca/f;

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    new-instance v3, Lcom/google/android/gms/common/api/internal/b2;

    invoke-direct {v3, p0, v0}, Lcom/google/android/gms/common/api/internal/b2;-><init>(Lcom/google/android/gms/common/api/internal/c2;Landroid/app/Dialog;)V

    invoke-virtual {v2, v1, v3}, Lca/f;->s(Landroid/content/Context;Lcom/google/android/gms/common/api/internal/r0;)Lcom/google/android/gms/common/api/internal/s0;

    return-void

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/c2;->b:Lcom/google/android/gms/common/api/internal/d2;

    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/c2;->a:Lcom/google/android/gms/common/api/internal/a2;

    invoke-virtual {v2}, Lcom/google/android/gms/common/api/internal/a2;->a()I

    move-result v2

    invoke-static {v1, v0, v2}, Lcom/google/android/gms/common/api/internal/d2;->f(Lcom/google/android/gms/common/api/internal/d2;Lca/b;I)V

    return-void
.end method

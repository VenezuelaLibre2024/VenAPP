.class final Lcom/google/android/gms/common/api/internal/b2;
.super Lcom/google/android/gms/common/api/internal/r0;
.source "SourceFile"


# instance fields
.field final synthetic a:Landroid/app/Dialog;

.field final synthetic b:Lcom/google/android/gms/common/api/internal/c2;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/internal/c2;Landroid/app/Dialog;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/b2;->b:Lcom/google/android/gms/common/api/internal/c2;

    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/b2;->a:Landroid/app/Dialog;

    invoke-direct {p0}, Lcom/google/android/gms/common/api/internal/r0;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/b2;->b:Lcom/google/android/gms/common/api/internal/c2;

    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/c2;->b:Lcom/google/android/gms/common/api/internal/d2;

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/d2;->g(Lcom/google/android/gms/common/api/internal/d2;)V

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/b2;->a:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/b2;->a:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    :cond_0
    return-void
.end method

.class final Lcom/google/android/gms/common/api/internal/j1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/google/android/gms/common/api/internal/m1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/internal/m1;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/j1;->a:Lcom/google/android/gms/common/api/internal/m1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/j1;->a:Lcom/google/android/gms/common/api/internal/m1;

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/m1;->f2(Lcom/google/android/gms/common/api/internal/m1;)Lcom/google/android/gms/common/api/internal/l1;

    move-result-object v0

    new-instance v1, Lca/b;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Lca/b;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/internal/l1;->a(Lca/b;)V

    return-void
.end method

.class public final Lx8/k;
.super Lx8/m;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lx8/m;-><init>(Landroid/content/Context;I)V

    const-string v0, "Context cannot be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final e()Lx8/b0;
    .locals 1

    iget-object v0, p0, Lx8/m;->a:Lcom/google/android/gms/ads/internal/client/d3;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/d3;->i()Lx8/b0;

    move-result-object v0

    return-object v0
.end method

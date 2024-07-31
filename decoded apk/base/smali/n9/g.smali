.class public final synthetic Ln9/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ly8/a;

.field public final synthetic d:Ln9/d;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;Ly8/a;Ln9/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln9/g;->a:Landroid/content/Context;

    iput-object p2, p0, Ln9/g;->b:Ljava/lang/String;

    iput-object p3, p0, Ln9/g;->c:Ly8/a;

    iput-object p4, p0, Ln9/g;->d:Ln9/d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Ln9/g;->a:Landroid/content/Context;

    iget-object v1, p0, Ln9/g;->b:Ljava/lang/String;

    iget-object v2, p0, Ln9/g;->c:Ly8/a;

    iget-object v3, p0, Ln9/g;->d:Ln9/d;

    :try_start_0
    new-instance v4, Lcom/google/android/gms/internal/ads/zzcaw;

    invoke-direct {v4, v0, v1}, Lcom/google/android/gms/internal/ads/zzcaw;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v2}, Lx8/h;->a()Lcom/google/android/gms/ads/internal/client/z2;

    move-result-object v1

    invoke-virtual {v4, v1, v3}, Lcom/google/android/gms/internal/ads/zzcaw;->zza(Lcom/google/android/gms/ads/internal/client/z2;Ln9/d;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbxw;->zza(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzbxy;

    move-result-object v0

    const-string v2, "RewardedAd.loadAdManager"

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzbxy;->zzg(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

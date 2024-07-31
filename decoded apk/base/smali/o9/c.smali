.class public final synthetic Lo9/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ly8/a;

.field public final synthetic d:Lo9/b;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;Ly8/a;Lo9/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo9/c;->a:Landroid/content/Context;

    iput-object p2, p0, Lo9/c;->b:Ljava/lang/String;

    iput-object p3, p0, Lo9/c;->c:Ly8/a;

    iput-object p4, p0, Lo9/c;->d:Lo9/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lo9/c;->a:Landroid/content/Context;

    iget-object v1, p0, Lo9/c;->b:Ljava/lang/String;

    iget-object v2, p0, Lo9/c;->c:Ly8/a;

    iget-object v3, p0, Lo9/c;->d:Lo9/b;

    :try_start_0
    new-instance v4, Lcom/google/android/gms/internal/ads/zzcbh;

    invoke-direct {v4, v0, v1}, Lcom/google/android/gms/internal/ads/zzcbh;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v2}, Lx8/h;->a()Lcom/google/android/gms/ads/internal/client/z2;

    move-result-object v1

    invoke-virtual {v4, v1, v3}, Lcom/google/android/gms/internal/ads/zzcbh;->zza(Lcom/google/android/gms/ads/internal/client/z2;Lo9/b;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbxw;->zza(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzbxy;

    move-result-object v0

    const-string v2, "RewardedInterstitialAdManager.load"

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzbxy;->zzg(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

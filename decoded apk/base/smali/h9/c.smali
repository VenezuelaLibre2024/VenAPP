.class public final synthetic Lh9/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lx8/h;

.field public final synthetic d:Lh9/b;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;Lx8/h;Lh9/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh9/c;->a:Landroid/content/Context;

    iput-object p2, p0, Lh9/c;->b:Ljava/lang/String;

    iput-object p3, p0, Lh9/c;->c:Lx8/h;

    iput-object p4, p0, Lh9/c;->d:Lh9/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lh9/c;->a:Landroid/content/Context;

    iget-object v1, p0, Lh9/c;->b:Ljava/lang/String;

    iget-object v2, p0, Lh9/c;->c:Lx8/h;

    iget-object v3, p0, Lh9/c;->d:Lh9/b;

    :try_start_0
    new-instance v4, Lcom/google/android/gms/internal/ads/zzbpz;

    invoke-direct {v4, v0, v1}, Lcom/google/android/gms/internal/ads/zzbpz;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v2}, Lx8/h;->a()Lcom/google/android/gms/ads/internal/client/z2;

    move-result-object v1

    invoke-virtual {v4, v1, v3}, Lcom/google/android/gms/internal/ads/zzbpz;->zza(Lcom/google/android/gms/ads/internal/client/z2;Lx8/f;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbxw;->zza(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzbxy;

    move-result-object v0

    const-string v2, "InterstitialAd.load"

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzbxy;->zzg(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

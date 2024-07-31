.class public final Lcom/google/android/gms/ads/internal/client/q4;
.super Lcom/google/android/gms/ads/internal/client/j0;
.source "SourceFile"


# instance fields
.field private final a:Lx8/f;

.field private final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lx8/f;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/client/j0;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/q4;->a:Lx8/f;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/client/q4;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final zzb(Lcom/google/android/gms/ads/internal/client/c3;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/q4;->a:Lx8/f;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/ads/internal/client/c3;->v1()Lx8/o;

    move-result-object p1

    invoke-virtual {v0, p1}, Lx8/f;->onAdFailedToLoad(Lx8/o;)V

    :cond_0
    return-void
.end method

.method public final zzc()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/q4;->a:Lx8/f;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/q4;->b:Ljava/lang/Object;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Lx8/f;->onAdLoaded(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

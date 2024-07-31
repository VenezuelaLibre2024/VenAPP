.class public final Lcom/google/android/gms/internal/ads/zzeij;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private zza:Ln1/a;

.field private final zzb:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeij;->zzb:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/google/common/util/concurrent/f;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeij;->zzb:Landroid/content/Context;

    invoke-static {v0}, Ln1/a;->a(Landroid/content/Context;)Ln1/a;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzeij;->zza:Ln1/a;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "MeasurementManagerFutures is null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgen;->zzg(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/f;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Ln1/a;->b()Lcom/google/common/util/concurrent/f;

    move-result-object v0

    return-object v0
.end method

.method public final zzb(Landroid/net/Uri;Landroid/view/InputEvent;)Lcom/google/common/util/concurrent/f;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeij;->zza:Ln1/a;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, p1, p2}, Ln1/a;->c(Landroid/net/Uri;Landroid/view/InputEvent;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1
.end method

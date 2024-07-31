.class public final Lcom/google/android/gms/internal/ads/zzbtw;
.super Lcom/google/android/gms/internal/ads/zzbtd;
.source "SourceFile"


# instance fields
.field private final zza:Li9/o;


# direct methods
.method public constructor <init>(Li9/o;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbtd;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbtw;->zza:Li9/o;

    return-void
.end method


# virtual methods
.method public final zze()Lcom/google/android/gms/dynamic/b;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbtw;->zza:Li9/o;

    invoke-interface {v0}, Li9/j;->getView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/dynamic/d;->h2(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/b;

    move-result-object v0

    return-object v0
.end method

.method public final zzf()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbtw;->zza:Li9/o;

    invoke-interface {v0}, Li9/o;->a()Z

    move-result v0

    return v0
.end method

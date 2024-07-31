.class public final Lcom/google/android/gms/internal/ads/zzaze;
.super Lcom/google/android/gms/ads/internal/client/b1;
.source "SourceFile"


# instance fields
.field private final zza:Ly8/e;


# direct methods
.method public constructor <init>(Ly8/e;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/client/b1;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaze;->zza:Ly8/e;

    return-void
.end method


# virtual methods
.method public final zzb()Ly8/e;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaze;->zza:Ly8/e;

    return-object v0
.end method

.method public final zzc(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaze;->zza:Ly8/e;

    invoke-interface {v0, p1, p2}, Ly8/e;->onAppEvent(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

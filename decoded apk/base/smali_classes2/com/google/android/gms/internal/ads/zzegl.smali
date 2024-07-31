.class public Lcom/google/android/gms/internal/ads/zzegl;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected final zza:Lcom/google/android/gms/internal/ads/zzefy;

.field private final zzb:Lcom/google/android/gms/ads/internal/util/w1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzefy;Lcom/google/android/gms/ads/internal/util/w1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzegl;->zza:Lcom/google/android/gms/internal/ads/zzefy;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzegl;->zzb:Lcom/google/android/gms/ads/internal/util/w1;

    return-void
.end method


# virtual methods
.method protected final zzf()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzegl;->zzb:Lcom/google/android/gms/ads/internal/util/w1;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/util/w1;->zzQ()Z

    move-result v0

    return v0
.end method

.class final Lcom/google/android/gms/ads/internal/util/m0;
.super Lcom/google/android/gms/internal/ads/zzare;
.source "SourceFile"


# instance fields
.field final synthetic a:[B

.field final synthetic b:Ljava/util/Map;

.field final synthetic c:Lcom/google/android/gms/internal/ads/zzceb;


# direct methods
.method constructor <init>(Lcom/google/android/gms/ads/internal/util/s0;ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzaqf;Lcom/google/android/gms/internal/ads/zzaqe;[BLjava/util/Map;Lcom/google/android/gms/internal/ads/zzceb;)V
    .locals 0

    iput-object p6, p0, Lcom/google/android/gms/ads/internal/util/m0;->a:[B

    iput-object p7, p0, Lcom/google/android/gms/ads/internal/util/m0;->b:Ljava/util/Map;

    iput-object p8, p0, Lcom/google/android/gms/ads/internal/util/m0;->c:Lcom/google/android/gms/internal/ads/zzceb;

    invoke-direct {p0, p2, p3, p4, p5}, Lcom/google/android/gms/internal/ads/zzare;-><init>(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzaqf;Lcom/google/android/gms/internal/ads/zzaqe;)V

    return-void
.end method


# virtual methods
.method public final zzl()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/util/m0;->b:Ljava/util/Map;

    if-nez v0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method protected final bridge synthetic zzo(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzare;->zzz(Ljava/lang/String;)V

    return-void
.end method

.method public final zzx()[B
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/util/m0;->a:[B

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method

.method protected final zzz(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/util/m0;->c:Lcom/google/android/gms/internal/ads/zzceb;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzceb;->zzg(Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/google/android/gms/internal/ads/zzare;->zzz(Ljava/lang/String;)V

    return-void
.end method

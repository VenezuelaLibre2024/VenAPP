.class final Lcom/google/android/gms/internal/ads/zzbmn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzbng;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic zza(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/ads/zzcjk;

    invoke-static {}, Lcom/google/android/gms/ads/internal/t;->l()Lg9/e0;

    move-result-object p2

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzcjk;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Lg9/e0;->a(Lcom/google/android/gms/internal/ads/zzcjk;Landroid/content/Context;)V

    return-void
.end method

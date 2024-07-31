.class public final Lcom/google/android/gms/ads/internal/client/z;
.super Lcom/google/android/gms/ads/internal/client/d0;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/ads/internal/client/a;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/internal/client/a;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/client/d0;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/z;->a:Lcom/google/android/gms/ads/internal/client/a;

    return-void
.end method


# virtual methods
.method public final zzb()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/z;->a:Lcom/google/android/gms/ads/internal/client/a;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/client/a;->onAdClicked()V

    return-void
.end method

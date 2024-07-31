.class public final Lcom/google/android/gms/ads/internal/client/g4;
.super Lcom/google/android/gms/ads/internal/client/e2;
.source "SourceFile"


# instance fields
.field private final a:Ln9/a;


# direct methods
.method public constructor <init>(Ln9/a;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/client/e2;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/g4;->a:Ln9/a;

    return-void
.end method


# virtual methods
.method public final zze()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/g4;->a:Ln9/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ln9/a;->onAdMetadataChanged()V

    :cond_0
    return-void
.end method

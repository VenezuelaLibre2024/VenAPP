.class public final Lcom/google/android/gms/ads/internal/client/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:Lcom/google/android/gms/ads/internal/client/a0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/zzbfv;

.field private final b:Lcom/google/android/gms/internal/ads/zzbfw;

.field private final c:Lcom/google/android/gms/internal/ads/zzbga;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/ads/internal/client/a0;

    invoke-direct {v0}, Lcom/google/android/gms/ads/internal/client/a0;-><init>()V

    sput-object v0, Lcom/google/android/gms/ads/internal/client/a0;->d:Lcom/google/android/gms/ads/internal/client/a0;

    return-void
.end method

.method protected constructor <init>()V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbfv;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzbfv;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/ads/zzbfw;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzbfw;-><init>()V

    new-instance v2, Lcom/google/android/gms/internal/ads/zzbga;

    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/zzbga;-><init>()V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/client/a0;->a:Lcom/google/android/gms/internal/ads/zzbfv;

    iput-object v1, p0, Lcom/google/android/gms/ads/internal/client/a0;->b:Lcom/google/android/gms/internal/ads/zzbfw;

    iput-object v2, p0, Lcom/google/android/gms/ads/internal/client/a0;->c:Lcom/google/android/gms/internal/ads/zzbga;

    return-void
.end method

.method public static a()Lcom/google/android/gms/internal/ads/zzbfv;
    .locals 1

    sget-object v0, Lcom/google/android/gms/ads/internal/client/a0;->d:Lcom/google/android/gms/ads/internal/client/a0;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/client/a0;->a:Lcom/google/android/gms/internal/ads/zzbfv;

    return-object v0
.end method

.method public static b()Lcom/google/android/gms/internal/ads/zzbfw;
    .locals 1

    sget-object v0, Lcom/google/android/gms/ads/internal/client/a0;->d:Lcom/google/android/gms/ads/internal/client/a0;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/client/a0;->b:Lcom/google/android/gms/internal/ads/zzbfw;

    return-object v0
.end method

.method public static c()Lcom/google/android/gms/internal/ads/zzbga;
    .locals 1

    sget-object v0, Lcom/google/android/gms/ads/internal/client/a0;->d:Lcom/google/android/gms/ads/internal/client/a0;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/client/a0;->c:Lcom/google/android/gms/internal/ads/zzbga;

    return-object v0
.end method

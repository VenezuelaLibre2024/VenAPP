.class public final Lcom/google/android/gms/internal/location/zzcc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/location/t;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final checkLocationSettings(Lcom/google/android/gms/common/api/f;Lcom/google/android/gms/location/p;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/f;",
            "Lcom/google/android/gms/location/p;",
            ")",
            "Lcom/google/android/gms/common/api/i<",
            "Lcom/google/android/gms/location/r;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/location/zzca;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lcom/google/android/gms/internal/location/zzca;-><init>(Lcom/google/android/gms/internal/location/zzcc;Lcom/google/android/gms/common/api/f;Lcom/google/android/gms/location/p;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/f;->a(Lcom/google/android/gms/common/api/internal/d;)Lcom/google/android/gms/common/api/internal/d;

    move-result-object p1

    return-object p1
.end method

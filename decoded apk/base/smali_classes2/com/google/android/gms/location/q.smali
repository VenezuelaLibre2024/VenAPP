.class public Lcom/google/android/gms/location/q;
.super Lcom/google/android/gms/common/api/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/api/m<",
        "Lcom/google/android/gms/location/r;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/google/android/gms/location/r;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/common/api/m;-><init>(Lcom/google/android/gms/common/api/n;)V

    return-void
.end method


# virtual methods
.method public c()Lcom/google/android/gms/location/s;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/m;->a()Lcom/google/android/gms/common/api/n;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/location/r;

    invoke-virtual {v0}, Lcom/google/android/gms/location/r;->u1()Lcom/google/android/gms/location/s;

    move-result-object v0

    return-object v0
.end method

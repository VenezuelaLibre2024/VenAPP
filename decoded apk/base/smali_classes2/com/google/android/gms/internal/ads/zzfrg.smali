.class public final synthetic Lcom/google/android/gms/internal/ads/zzfrg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnFailureListener;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzfrk;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzfrk;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfrg;->zza:Lcom/google/android/gms/internal/ads/zzfrk;

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfrg;->zza:Lcom/google/android/gms/internal/ads/zzfrk;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzfrk;->zzf(Ljava/lang/Exception;)V

    return-void
.end method

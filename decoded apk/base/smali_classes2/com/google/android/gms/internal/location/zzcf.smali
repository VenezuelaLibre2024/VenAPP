.class public final synthetic Lcom/google/android/gms/internal/location/zzcf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnTokenCanceledListener;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/common/internal/l;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/common/internal/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/location/zzcf;->zza:Lcom/google/android/gms/common/internal/l;

    return-void
.end method


# virtual methods
.method public final onCanceled()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/location/zzcf;->zza:Lcom/google/android/gms/common/internal/l;

    sget v1, Lcom/google/android/gms/internal/location/zzda;->zze:I

    :try_start_0
    invoke-interface {v0}, Lcom/google/android/gms/common/internal/l;->cancel()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.class final Lcom/google/android/gms/internal/location/zzci;
.super Lcom/google/android/gms/internal/location/zzl;
.source "SourceFile"


# instance fields
.field final synthetic zza:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method constructor <init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/location/zzci;->zza:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {p0}, Lcom/google/android/gms/internal/location/zzl;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzb(I[Ljava/lang/String;)V
    .locals 0

    new-instance p2, Lcom/google/android/gms/common/api/Status;

    invoke-static {p1}, Lcom/google/android/gms/location/i;->b(I)I

    move-result p1

    invoke-direct {p2, p1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/location/zzci;->zza:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {p2, p1}, Lcom/google/android/gms/common/api/internal/x;->a(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method

.method public final zzc(ILandroid/app/PendingIntent;)V
    .locals 0

    new-instance p2, Lcom/google/android/gms/common/api/Status;

    invoke-static {p1}, Lcom/google/android/gms/location/i;->b(I)I

    move-result p1

    invoke-direct {p2, p1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/location/zzci;->zza:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {p2, p1}, Lcom/google/android/gms/common/api/internal/x;->a(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method

.method public final zzd(I[Ljava/lang/String;)V
    .locals 0

    new-instance p2, Lcom/google/android/gms/common/api/Status;

    invoke-static {p1}, Lcom/google/android/gms/location/i;->b(I)I

    move-result p1

    invoke-direct {p2, p1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/location/zzci;->zza:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {p2, p1}, Lcom/google/android/gms/common/api/internal/x;->a(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method

.class final Lcom/google/android/gms/internal/firebase-auth-api/zzaeb;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final zza:J

.field final zzb:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzacd;",
            ">;"
        }
    .end annotation
.end field

.field final zzc:Z

.field zzd:Ljava/lang/String;

.field zze:Ljava/lang/String;

.field zzf:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field

.field zzg:Z

.field zzh:Z

.field zzi:Z


# direct methods
.method public constructor <init>(JZ)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaeb;->zzg:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaeb;->zzh:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaeb;->zzi:Z

    iput-wide p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaeb;->zza:J

    iput-boolean p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaeb;->zzc:Z

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaeb;->zzb:Ljava/util/List;

    return-void
.end method

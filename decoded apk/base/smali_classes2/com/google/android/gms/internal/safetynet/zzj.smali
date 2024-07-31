.class final Lcom/google/android/gms/internal/safetynet/zzj;
.super Lcom/google/android/gms/internal/safetynet/zzz;
.source "SourceFile"


# instance fields
.field final synthetic zza:Ljava/util/List;

.field final synthetic zzb:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/safetynet/zzae;Lcom/google/android/gms/common/api/f;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p3, p0, Lcom/google/android/gms/internal/safetynet/zzj;->zza:Ljava/util/List;

    iput-object p4, p0, Lcom/google/android/gms/internal/safetynet/zzj;->zzb:Ljava/lang/String;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/safetynet/zzz;-><init>(Lcom/google/android/gms/common/api/f;)V

    return-void
.end method


# virtual methods
.method protected final bridge synthetic doExecute(Lcom/google/android/gms/common/api/a$b;)V
    .locals 6

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/safetynet/zzaf;

    iget-object v1, p0, Lcom/google/android/gms/internal/safetynet/zzz;->zze:Lcom/google/android/gms/internal/safetynet/zzg;

    iget-object v2, p0, Lcom/google/android/gms/internal/safetynet/zzj;->zza:Ljava/util/List;

    const/4 v3, 0x1

    iget-object v4, p0, Lcom/google/android/gms/internal/safetynet/zzj;->zzb:Ljava/lang/String;

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/safetynet/zzaf;->zzq(Lcom/google/android/gms/internal/safetynet/zzg;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

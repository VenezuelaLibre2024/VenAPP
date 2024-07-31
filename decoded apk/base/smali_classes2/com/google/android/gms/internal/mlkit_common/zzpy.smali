.class public final synthetic Lcom/google/android/gms/internal/mlkit_common/zzpy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/mlkit_common/zzpz;

.field public final synthetic zzb:Lcom/google/android/gms/internal/mlkit_common/zzpq;

.field public final synthetic zzc:Lcom/google/android/gms/internal/mlkit_common/zzqb;

.field public final synthetic zzd:Ltf/b;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/mlkit_common/zzpz;Lcom/google/android/gms/internal/mlkit_common/zzpq;Lcom/google/android/gms/internal/mlkit_common/zzqb;Ltf/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_common/zzpy;->zza:Lcom/google/android/gms/internal/mlkit_common/zzpz;

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_common/zzpy;->zzb:Lcom/google/android/gms/internal/mlkit_common/zzpq;

    iput-object p3, p0, Lcom/google/android/gms/internal/mlkit_common/zzpy;->zzc:Lcom/google/android/gms/internal/mlkit_common/zzqb;

    iput-object p4, p0, Lcom/google/android/gms/internal/mlkit_common/zzpy;->zzd:Ltf/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzpy;->zza:Lcom/google/android/gms/internal/mlkit_common/zzpz;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_common/zzpy;->zzb:Lcom/google/android/gms/internal/mlkit_common/zzpq;

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_common/zzpy;->zzc:Lcom/google/android/gms/internal/mlkit_common/zzqb;

    iget-object v3, p0, Lcom/google/android/gms/internal/mlkit_common/zzpy;->zzd:Ltf/b;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/mlkit_common/zzpz;->zzc(Lcom/google/android/gms/internal/mlkit_common/zzpq;Lcom/google/android/gms/internal/mlkit_common/zzqb;Ltf/b;)V

    return-void
.end method

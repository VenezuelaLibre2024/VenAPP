.class public abstract Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;
.super Lcom/google/android/gms/internal/mlkit_vision_barcode/zzez;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_barcode/zzev;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/internal/mlkit_vision_barcode/zzez;",
        "Lcom/google/android/gms/internal/mlkit_vision_barcode/zzev<",
        "TV;>;"
    }
.end annotation


# static fields
.field static final zza:Z

.field private static final zzb:Ljava/util/logging/Logger;

.field private static final zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zza;

.field private static final zzd:Ljava/lang/Object;


# instance fields
.field private volatile listeners:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;

.field private volatile value:Ljava/lang/Object;

.field private volatile waiters:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;

    :try_start_0
    const-string v1, "guava.concurrent.generate_cancellation_cause"

    const-string v2, "false"

    invoke-static {v1, v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v1, 0x0

    :goto_0
    sput-boolean v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zza:Z

    const-class v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v2

    sput-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzb:Ljava/util/logging/Logger;

    const/4 v2, 0x0

    :try_start_1
    new-instance v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzi;

    invoke-direct {v3, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzi;-><init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzeg;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_1

    move-object v5, v2

    move-object v9, v5

    goto :goto_3

    :catch_1
    move-exception v3

    goto :goto_1

    :catch_2
    move-exception v3

    :goto_1
    :try_start_2
    new-instance v10, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zze;

    const-class v4, Ljava/lang/Thread;

    const-string v5, "thread"

    invoke-static {v0, v4, v5}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v5

    const-string v4, "next"

    invoke-static {v0, v0, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v6

    const-string v4, "waiters"

    invoke-static {v1, v0, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v7

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;

    const-string v4, "listeners"

    invoke-static {v1, v0, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v8

    const-class v0, Ljava/lang/Object;

    const-string v4, "value"

    invoke-static {v1, v0, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v9

    move-object v4, v10

    invoke-direct/range {v4 .. v9}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zze;-><init>(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_3

    move-object v9, v2

    move-object v5, v3

    move-object v3, v10

    goto :goto_3

    :catch_3
    move-exception v0

    goto :goto_2

    :catch_4
    move-exception v0

    :goto_2
    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzg;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzg;-><init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzee;)V

    move-object v9, v0

    move-object v5, v3

    move-object v3, v1

    :goto_3
    sput-object v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zza;

    if-eqz v9, :cond_0

    sget-object v6, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzb:Ljava/util/logging/Logger;

    sget-object v7, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    const-string v2, "com.google.common.util.concurrent.AbstractFuture"

    const-string v3, "<clinit>"

    const-string v4, "UnsafeAtomicHelper is broken!"

    move-object v0, v6

    move-object v1, v7

    invoke-virtual/range {v0 .. v5}, Ljava/util/logging/Logger;->logp(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const-string v0, "com.google.common.util.concurrent.AbstractFuture"

    const-string v1, "<clinit>"

    const-string v8, "SafeAtomicHelper is broken!"

    move-object v4, v6

    move-object v5, v7

    move-object v6, v0

    move-object v7, v1

    invoke-virtual/range {v4 .. v9}, Ljava/util/logging/Logger;->logp(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzd:Ljava/lang/Object;

    return-void
.end method

.method protected constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzez;-><init>()V

    return-void
.end method

.method static bridge synthetic zza()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zza;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zza;

    return-object v0
.end method

.method static bridge synthetic zzb(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->listeners:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;

    return-object p0
.end method

.method static bridge synthetic zzc(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->waiters:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;

    return-object p0
.end method

.method static bridge synthetic zzd(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->value:Ljava/lang/Object;

    return-object p0
.end method

.method static bridge synthetic zzg(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->listeners:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;

    return-void
.end method

.method static bridge synthetic zzh(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->value:Ljava/lang/Object;

    return-void
.end method

.method static bridge synthetic zzi(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->waiters:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;

    return-void
.end method

.method private static zzo(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzev;)Ljava/lang/Object;
    .locals 7

    const-string v0, "get() did not throw CancellationException, despite reporting isCancelled() == true: "

    instance-of v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzh;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;

    iget-object p0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->value:Ljava/lang/Object;

    instance-of v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzb;

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzb;

    iget-boolean v1, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzb;->zzc:Z

    if-eqz v1, :cond_1

    iget-object p0, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzb;->zzd:Ljava/lang/Throwable;

    if-eqz p0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzb;

    invoke-direct {v0, v2, p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzb;-><init>(ZLjava/lang/Throwable;)V

    move-object p0, v0

    goto :goto_0

    :cond_0
    sget-object p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzb;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzb;

    :cond_1
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0

    :cond_2
    instance-of v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzez;

    if-eqz v1, :cond_4

    move-object v1, p0

    check-cast v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzez;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzez;->zzf()Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    new-instance p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzc;

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzc;-><init>(Ljava/lang/Throwable;)V

    return-object p0

    :cond_4
    :goto_1
    invoke-interface {p0}, Ljava/util/concurrent/Future;->isCancelled()Z

    move-result v1

    sget-boolean v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zza:Z

    xor-int/lit8 v3, v3, 0x1

    and-int/2addr v3, v1

    if-eqz v3, :cond_5

    sget-object p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzb;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzb;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0

    :cond_5
    :try_start_0
    invoke-static {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzp(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v1, :cond_6

    new-instance v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzb;

    new-instance v4, Ljava/lang/IllegalArgumentException;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-direct {v3, v2, v4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzb;-><init>(ZLjava/lang/Throwable;)V

    return-object v3

    :cond_6
    if-nez v3, :cond_7

    sget-object v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzd:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    :cond_7
    return-object v3

    :catch_0
    move-exception p0

    goto :goto_2

    :catch_1
    move-exception p0

    :goto_2
    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzc;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzc;-><init>(Ljava/lang/Throwable;)V

    return-object v0

    :catch_2
    move-exception v0

    if-nez v1, :cond_8

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzc;

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v3, "get() threw CancellationException, despite reporting isCancelled() == false: "

    invoke-virtual {v3, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v2, p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzc;-><init>(Ljava/lang/Throwable;)V

    return-object v1

    :cond_8
    new-instance p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzb;

    invoke-direct {p0, v2, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzb;-><init>(ZLjava/lang/Throwable;)V

    return-object p0

    :catch_3
    move-exception v3

    if-eqz v1, :cond_9

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzb;

    new-instance v4, Ljava/lang/IllegalArgumentException;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v4, p0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {v1, v2, v4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzb;-><init>(ZLjava/lang/Throwable;)V

    return-object v1

    :cond_9
    new-instance p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzc;

    invoke-virtual {v3}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzc;-><init>(Ljava/lang/Throwable;)V

    return-object p0
.end method

.method private static zzp(Ljava/util/concurrent/Future;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    :goto_0
    :try_start_0
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_0
    return-object p0

    :catchall_0
    move-exception p0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :goto_1
    throw p0

    :catch_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private final zzq(Ljava/lang/StringBuilder;)V
    .locals 3

    const-string v0, "]"

    :try_start_0
    invoke-static {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzp(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "SUCCESS, result=["

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v1, :cond_0

    const-string v1, "null"

    :goto_0
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    if-ne v1, p0, :cond_1

    const-string v1, "this future"

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "@"

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :goto_1
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "UNKNOWN, cause=["

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " thrown from get()]"

    :goto_2
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :catch_1
    const-string v0, "CANCELLED"

    goto :goto_2

    :catch_2
    move-exception v1

    const-string v2, "FAILURE, cause=["

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_2
.end method

.method private final zzr(Ljava/lang/StringBuilder;)V
    .locals 4

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    const-string v1, "PENDING"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->value:Ljava/lang/Object;

    instance-of v2, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzf;

    const-string v3, "]"

    if-eqz v2, :cond_0

    const-string v2, ", setFuture=["

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    check-cast v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzf;

    iget-object v1, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzf;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzev;

    invoke-direct {p0, p1, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzs(Ljava/lang/StringBuilder;Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zze()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbd;->zza(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v1

    goto :goto_1

    :catch_1
    move-exception v1

    :goto_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Exception thrown from implementation: "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :goto_2
    if-eqz v1, :cond_1

    const-string v2, ", info=["

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    :goto_3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->isDone()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzq(Ljava/lang/StringBuilder;)V

    :cond_2
    return-void
.end method

.method private final zzs(Ljava/lang/StringBuilder;Ljava/lang/Object;)V
    .locals 1

    if-ne p2, p0, :cond_0

    :try_start_0
    const-string p2, "this future"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :cond_0
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p2

    goto :goto_0

    :catch_1
    move-exception p2

    :goto_0
    const-string v0, "Exception thrown from implementation: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    return-void
.end method

.method private static zzt(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;Z)V
    .locals 5

    const/4 p1, 0x0

    move-object v0, p1

    :goto_0
    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zza;

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;

    invoke-virtual {v1, p0, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zza;->zzb(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;

    move-result-object v1

    :goto_1
    if-eqz v1, :cond_1

    iget-object v2, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;->thread:Ljava/lang/Thread;

    if-eqz v2, :cond_0

    iput-object p1, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;->thread:Ljava/lang/Thread;

    invoke-static {v2}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    :cond_0
    iget-object v1, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;->next:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzk()V

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zza;

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;

    invoke-virtual {v1, p0, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zza;->zza(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;

    move-result-object p0

    move-object v4, v0

    move-object v0, p0

    move-object p0, v4

    :goto_2
    if-eqz v0, :cond_2

    iget-object v1, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;->next:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;

    iput-object p0, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;->next:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;

    move-object p0, v0

    move-object v0, v1

    goto :goto_2

    :cond_2
    :goto_3
    if-eqz p0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;->next:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;->zzb:Ljava/lang/Runnable;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v2, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzf;

    if-eqz v2, :cond_3

    check-cast v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzf;

    iget-object p0, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzf;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->value:Ljava/lang/Object;

    if-ne v2, v1, :cond_4

    iget-object v2, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzf;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzev;

    invoke-static {v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzo(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzev;)Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zza;

    invoke-virtual {v3, p0, v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zza;->zzf(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_0

    :cond_3
    iget-object p0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;->zzc:Ljava/util/concurrent/Executor;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzu(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    :cond_4
    move-object p0, v0

    goto :goto_3

    :cond_5
    return-void
.end method

.method private static zzu(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 6

    :try_start_0
    invoke-interface {p1, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v5

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzb:Ljava/util/logging/Logger;

    sget-object v1, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RuntimeException while executing runnable "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " with executor "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v2, "com.google.common.util.concurrent.AbstractFuture"

    const-string v3, "executeListener"

    invoke-virtual/range {v0 .. v5}, Ljava/util/logging/Logger;->logp(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method private final zzv(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;)V
    .locals 4

    const/4 v0, 0x0

    iput-object v0, p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;->thread:Ljava/lang/Thread;

    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->waiters:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;

    if-eq p1, v1, :cond_3

    move-object v1, v0

    :goto_1
    if-eqz p1, :cond_3

    iget-object v2, p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;->next:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;

    iget-object v3, p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;->thread:Ljava/lang/Thread;

    if-eqz v3, :cond_0

    move-object v1, p1

    goto :goto_2

    :cond_0
    if-eqz v1, :cond_1

    iput-object v2, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;->next:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;

    iget-object p1, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;->thread:Ljava/lang/Thread;

    if-nez p1, :cond_2

    goto :goto_0

    :cond_1
    sget-object v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zza;

    invoke-virtual {v3, p0, p1, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zza;->zzg(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    :goto_2
    move-object p1, v2

    goto :goto_1

    :cond_3
    return-void
.end method

.method private static final zzw(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    instance-of v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzb;

    if-nez v0, :cond_2

    instance-of v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzc;

    if-nez v0, :cond_1

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzd:Ljava/lang/Object;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x0

    :cond_0
    return-object p0

    :cond_1
    new-instance v0, Ljava/util/concurrent/ExecutionException;

    check-cast p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzc;

    iget-object p0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzc;->zzb:Ljava/lang/Throwable;

    invoke-direct {v0, p0}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_2
    check-cast p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzb;

    iget-object p0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzb;->zzd:Ljava/lang/Throwable;

    new-instance v0, Ljava/util/concurrent/CancellationException;

    const-string v1, "Task was cancelled."

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw v0
.end method


# virtual methods
.method public final cancel(Z)Z
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->value:Ljava/lang/Object;

    instance-of v1, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzf;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v0, :cond_0

    move v4, v3

    goto :goto_0

    :cond_0
    move v4, v2

    :goto_0
    or-int/2addr v1, v4

    if-eqz v1, :cond_8

    sget-boolean v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zza:Z

    if-eqz v1, :cond_1

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzb;

    new-instance v4, Ljava/util/concurrent/CancellationException;

    const-string v5, "Future.cancel() was called."

    invoke-direct {v4, v5}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, p1, v4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzb;-><init>(ZLjava/lang/Throwable;)V

    goto :goto_2

    :cond_1
    if-eqz p1, :cond_2

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzb;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzb;

    goto :goto_1

    :cond_2
    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzb;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzb;

    :goto_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_2
    move-object v4, p0

    move v5, v2

    :cond_3
    :goto_3
    sget-object v6, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zza;

    invoke-virtual {v6, v4, v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zza;->zzf(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-static {v4, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzt(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;Z)V

    instance-of v4, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzf;

    if-eqz v4, :cond_6

    check-cast v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzf;

    iget-object v0, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzf;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzev;

    instance-of v4, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzh;

    if-eqz v4, :cond_5

    move-object v4, v0

    check-cast v4, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;

    iget-object v0, v4, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->value:Ljava/lang/Object;

    if-nez v0, :cond_4

    move v5, v3

    goto :goto_4

    :cond_4
    move v5, v2

    :goto_4
    instance-of v6, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzf;

    or-int/2addr v5, v6

    if-eqz v5, :cond_6

    move v5, v3

    goto :goto_3

    :cond_5
    invoke-interface {v0, p1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_6
    move v2, v3

    goto :goto_5

    :cond_7
    iget-object v0, v4, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->value:Ljava/lang/Object;

    instance-of v6, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzf;

    if-nez v6, :cond_3

    move v2, v5

    :cond_8
    :goto_5
    return v2
.end method

.method public final get()Ljava/lang/Object;
    .locals 6

    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->value:Ljava/lang/Object;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    instance-of v4, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzf;

    xor-int/2addr v4, v2

    and-int/2addr v3, v4

    if-eqz v3, :cond_1

    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzw(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->waiters:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;

    sget-object v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;

    if-eq v0, v3, :cond_7

    new-instance v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;

    invoke-direct {v3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;-><init>()V

    :cond_2
    sget-object v4, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zza;

    invoke-virtual {v4, v3, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zza;->zzc(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;)V

    invoke-virtual {v4, p0, v0, v3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zza;->zzg(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;)Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_3
    invoke-static {p0}, Ljava/util/concurrent/locks/LockSupport;->park(Ljava/lang/Object;)V

    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->value:Ljava/lang/Object;

    if-eqz v0, :cond_4

    move v4, v2

    goto :goto_1

    :cond_4
    move v4, v1

    :goto_1
    instance-of v5, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzf;

    xor-int/2addr v5, v2

    and-int/2addr v4, v5

    if-eqz v4, :cond_3

    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzw(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_5
    invoke-direct {p0, v3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzv(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;)V

    new-instance v0, Ljava/lang/InterruptedException;

    invoke-direct {v0}, Ljava/lang/InterruptedException;-><init>()V

    throw v0

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->waiters:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;

    sget-object v4, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;

    if-ne v0, v4, :cond_2

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->value:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzw(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_8
    new-instance v0, Ljava/lang/InterruptedException;

    invoke-direct {v0}, Ljava/lang/InterruptedException;-><init>()V

    throw v0
.end method

.method public final get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-object/from16 v3, p3

    invoke-virtual {v3, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v4

    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v6

    if-nez v6, :cond_16

    iget-object v6, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->value:Ljava/lang/Object;

    const/4 v8, 0x1

    if-eqz v6, :cond_0

    move v9, v8

    goto :goto_0

    :cond_0
    const/4 v9, 0x0

    :goto_0
    instance-of v10, v6, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzf;

    xor-int/2addr v10, v8

    and-int/2addr v9, v10

    if-eqz v9, :cond_1

    invoke-static {v6}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzw(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :cond_1
    const-wide/16 v9, 0x0

    cmp-long v6, v4, v9

    if-lez v6, :cond_2

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v11

    add-long/2addr v11, v4

    goto :goto_1

    :cond_2
    move-wide v11, v9

    :goto_1
    const-wide/16 v13, 0x3e8

    cmp-long v6, v4, v13

    if-ltz v6, :cond_a

    iget-object v6, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->waiters:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;

    sget-object v15, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;

    if-eq v6, v15, :cond_9

    new-instance v15, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;

    invoke-direct {v15}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;-><init>()V

    :cond_3
    sget-object v7, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zza;

    invoke-virtual {v7, v15, v6}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zza;->zzc(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;)V

    invoke-virtual {v7, v0, v6, v15}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zza;->zzg(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;)Z

    move-result v6

    if-eqz v6, :cond_8

    :cond_4
    const-wide v6, 0x1dcd64ffffffffffL    # 3.98785104510193E-165

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    invoke-static {v0, v4, v5}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(Ljava/lang/Object;J)V

    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v4

    if-nez v4, :cond_7

    iget-object v4, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->value:Ljava/lang/Object;

    if-eqz v4, :cond_5

    move v5, v8

    goto :goto_2

    :cond_5
    const/4 v5, 0x0

    :goto_2
    instance-of v6, v4, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzf;

    xor-int/2addr v6, v8

    and-int/2addr v5, v6

    if-eqz v5, :cond_6

    invoke-static {v4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzw(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :cond_6
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    sub-long v4, v11, v4

    cmp-long v6, v4, v13

    if-gez v6, :cond_4

    invoke-direct {v0, v15}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzv(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;)V

    goto :goto_3

    :cond_7
    invoke-direct {v0, v15}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzv(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;)V

    new-instance v1, Ljava/lang/InterruptedException;

    invoke-direct {v1}, Ljava/lang/InterruptedException;-><init>()V

    throw v1

    :cond_8
    iget-object v6, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->waiters:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;

    sget-object v7, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;

    if-ne v6, v7, :cond_3

    :cond_9
    iget-object v1, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->value:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzw(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :cond_a
    :goto_3
    cmp-long v6, v4, v9

    if-lez v6, :cond_e

    iget-object v4, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->value:Ljava/lang/Object;

    if-eqz v4, :cond_b

    move v5, v8

    goto :goto_4

    :cond_b
    const/4 v5, 0x0

    :goto_4
    instance-of v6, v4, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzf;

    xor-int/2addr v6, v8

    and-int/2addr v5, v6

    if-eqz v5, :cond_c

    invoke-static {v4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzw(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :cond_c
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v4

    if-nez v4, :cond_d

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    sub-long v4, v11, v4

    goto :goto_3

    :cond_d
    new-instance v1, Ljava/lang/InterruptedException;

    invoke-direct {v1}, Ljava/lang/InterruptedException;-><init>()V

    throw v1

    :cond_e
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    sget-object v11, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v7, v11}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12, v11}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v11

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "Waited "

    invoke-virtual {v12, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    add-long v11, v4, v13

    cmp-long v11, v11, v9

    if-gez v11, :cond_14

    const-string v11, " (plus "

    invoke-virtual {v2, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    neg-long v4, v4

    sget-object v11, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v3, v4, v5, v11}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v11

    invoke-virtual {v3, v11, v12}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v16

    sub-long v4, v4, v16

    cmp-long v3, v11, v9

    if-eqz v3, :cond_10

    cmp-long v9, v4, v13

    if-lez v9, :cond_f

    goto :goto_5

    :cond_f
    const/4 v8, 0x0

    :cond_10
    :goto_5
    if-lez v3, :cond_12

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    if-eqz v8, :cond_11

    const-string v3, ","

    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :cond_11
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :cond_12
    if-eqz v8, :cond_13

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " nanoseconds "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_13
    const-string v1, "delay)"

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :cond_14
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->isDone()Z

    move-result v1

    if-eqz v1, :cond_15

    const-string v1, " but future completed as timeout expired"

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/util/concurrent/TimeoutException;

    invoke-direct {v2, v1}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_15
    new-instance v1, Ljava/util/concurrent/TimeoutException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " for "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_16
    new-instance v1, Ljava/lang/InterruptedException;

    invoke-direct {v1}, Ljava/lang/InterruptedException;-><init>()V

    throw v1
.end method

.method public final isCancelled()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->value:Ljava/lang/Object;

    instance-of v0, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzb;

    return v0
.end method

.method public final isDone()Z
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->value:Ljava/lang/Object;

    instance-of v1, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzf;

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    xor-int/2addr v1, v2

    and-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "com.google.common.util.concurrent."

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "[status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->value:Ljava/lang/Object;

    instance-of v1, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzb;

    if-eqz v1, :cond_1

    const-string v1, "CANCELLED"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->isDone()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzq(Ljava/lang/StringBuilder;)V

    goto :goto_1

    :cond_2
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzr(Ljava/lang/StringBuilder;)V

    :goto_1
    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected zze()Ljava/lang/String;
    .locals 4

    instance-of v0, p0, Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ljava/util/concurrent/ScheduledFuture;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1}, Ljava/util/concurrent/Delayed;->getDelay(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "remaining delay=["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " ms]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method protected final zzf()Ljava/lang/Throwable;
    .locals 2

    instance-of v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzh;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->value:Ljava/lang/Object;

    instance-of v1, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzc;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzc;

    iget-object v0, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzc;->zzb:Ljava/lang/Throwable;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final zzj(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 3

    if-eqz p2, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->isDone()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->listeners:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;

    if-eq v0, v1, :cond_2

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;-><init>(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    :cond_0
    iput-object v0, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;->next:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zza;

    invoke-virtual {v2, p0, v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zza;->zze(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->listeners:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;

    if-ne v0, v2, :cond_0

    :cond_2
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzu(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void

    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Executor was null."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected zzk()V
    .locals 0

    return-void
.end method

.method protected final zzl(Ljava/lang/Throwable;)Z
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzc;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzc;-><init>(Ljava/lang/Throwable;)V

    sget-object p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zza;

    const/4 v1, 0x0

    invoke-virtual {p1, p0, v1, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zza;->zzf(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzt(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;Z)V

    const/4 p1, 0x1

    return p1

    :cond_0
    return v0
.end method

.method protected final zzm(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzev;)Z
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->value:Ljava/lang/Object;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzo(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzev;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zza;

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v2, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zza;->zzf(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {p0, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzt(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;Z)V

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1

    :cond_1
    instance-of p1, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzb;

    if-eqz p1, :cond_2

    check-cast v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzb;

    :cond_2
    return v1
.end method

.method protected final zzn()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->value:Ljava/lang/Object;

    instance-of v1, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzb;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzb;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzb;->zzc:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

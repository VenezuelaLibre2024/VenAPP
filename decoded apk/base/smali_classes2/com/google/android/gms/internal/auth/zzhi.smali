.class final Lcom/google/android/gms/internal/auth/zzhi;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final zza:Z

.field private static final zzb:Lsun/misc/Unsafe;

.field private static final zzc:Ljava/lang/Class;

.field private static final zzd:Z

.field private static final zze:Lcom/google/android/gms/internal/auth/zzhh;

.field private static final zzf:Z

.field private static final zzg:Z


# direct methods
.method static constructor <clinit>()V
    .locals 11

    const-class v0, Ljava/lang/Class;

    invoke-static {}, Lcom/google/android/gms/internal/auth/zzhi;->zzg()Lsun/misc/Unsafe;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/auth/zzhi;->zzb:Lsun/misc/Unsafe;

    invoke-static {}, Lcom/google/android/gms/internal/auth/zzdr;->zza()Ljava/lang/Class;

    move-result-object v2

    sput-object v2, Lcom/google/android/gms/internal/auth/zzhi;->zzc:Ljava/lang/Class;

    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-static {v2}, Lcom/google/android/gms/internal/auth/zzhi;->zzs(Ljava/lang/Class;)Z

    move-result v3

    sput-boolean v3, Lcom/google/android/gms/internal/auth/zzhi;->zzd:Z

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v4}, Lcom/google/android/gms/internal/auth/zzhi;->zzs(Ljava/lang/Class;)Z

    move-result v4

    const/4 v5, 0x0

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz v3, :cond_1

    new-instance v5, Lcom/google/android/gms/internal/auth/zzhg;

    invoke-direct {v5, v1}, Lcom/google/android/gms/internal/auth/zzhg;-><init>(Lsun/misc/Unsafe;)V

    goto :goto_0

    :cond_1
    if-eqz v4, :cond_2

    new-instance v5, Lcom/google/android/gms/internal/auth/zzhf;

    invoke-direct {v5, v1}, Lcom/google/android/gms/internal/auth/zzhf;-><init>(Lsun/misc/Unsafe;)V

    :cond_2
    :goto_0
    sput-object v5, Lcom/google/android/gms/internal/auth/zzhi;->zze:Lcom/google/android/gms/internal/auth/zzhh;

    const-string v1, "getLong"

    const-string v3, "objectFieldOffset"

    const-class v4, Ljava/lang/reflect/Field;

    const/4 v6, 0x2

    const-class v7, Ljava/lang/Object;

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-nez v5, :cond_3

    :goto_1
    move v2, v9

    goto :goto_2

    :cond_3
    iget-object v5, v5, Lcom/google/android/gms/internal/auth/zzhh;->zza:Lsun/misc/Unsafe;

    :try_start_0
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    new-array v10, v8, [Ljava/lang/Class;

    aput-object v4, v10, v9

    invoke-virtual {v5, v3, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    new-array v10, v6, [Ljava/lang/Class;

    aput-object v7, v10, v9

    aput-object v2, v10, v8

    invoke-virtual {v5, v1, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    invoke-static {}, Lcom/google/android/gms/internal/auth/zzhi;->zzy()Ljava/lang/reflect/Field;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_4

    goto :goto_1

    :cond_4
    move v2, v8

    goto :goto_2

    :catchall_0
    move-exception v2

    invoke-static {v2}, Lcom/google/android/gms/internal/auth/zzhi;->zzh(Ljava/lang/Throwable;)V

    goto :goto_1

    :goto_2
    sput-boolean v2, Lcom/google/android/gms/internal/auth/zzhi;->zzf:Z

    sget-object v2, Lcom/google/android/gms/internal/auth/zzhi;->zze:Lcom/google/android/gms/internal/auth/zzhh;

    if-nez v2, :cond_5

    :goto_3
    move v0, v9

    goto :goto_4

    :cond_5
    iget-object v2, v2, Lcom/google/android/gms/internal/auth/zzhh;->zza:Lsun/misc/Unsafe;

    :try_start_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    new-array v5, v8, [Ljava/lang/Class;

    aput-object v4, v5, v9

    invoke-virtual {v2, v3, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    new-array v3, v8, [Ljava/lang/Class;

    aput-object v0, v3, v9

    const-string v4, "arrayBaseOffset"

    invoke-virtual {v2, v4, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    new-array v3, v8, [Ljava/lang/Class;

    aput-object v0, v3, v9

    const-string v0, "arrayIndexScale"

    invoke-virtual {v2, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    new-array v0, v6, [Ljava/lang/Class;

    aput-object v7, v0, v9

    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    aput-object v3, v0, v8

    const-string v4, "getInt"

    invoke-virtual {v2, v4, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const/4 v0, 0x3

    new-array v4, v0, [Ljava/lang/Class;

    aput-object v7, v4, v9

    aput-object v3, v4, v8

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v5, v4, v6

    const-string v5, "putInt"

    invoke-virtual {v2, v5, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    new-array v4, v6, [Ljava/lang/Class;

    aput-object v7, v4, v9

    aput-object v3, v4, v8

    invoke-virtual {v2, v1, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    new-array v1, v0, [Ljava/lang/Class;

    aput-object v7, v1, v9

    aput-object v3, v1, v8

    aput-object v3, v1, v6

    const-string v4, "putLong"

    invoke-virtual {v2, v4, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    new-array v1, v6, [Ljava/lang/Class;

    aput-object v7, v1, v9

    aput-object v3, v1, v8

    const-string v4, "getObject"

    invoke-virtual {v2, v4, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    new-array v0, v0, [Ljava/lang/Class;

    aput-object v7, v0, v9

    aput-object v3, v0, v8

    aput-object v7, v0, v6

    const-string v1, "putObject"

    invoke-virtual {v2, v1, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move v0, v8

    goto :goto_4

    :catchall_1
    move-exception v0

    invoke-static {v0}, Lcom/google/android/gms/internal/auth/zzhi;->zzh(Ljava/lang/Throwable;)V

    goto :goto_3

    :goto_4
    sput-boolean v0, Lcom/google/android/gms/internal/auth/zzhi;->zzg:Z

    const-class v0, [B

    invoke-static {v0}, Lcom/google/android/gms/internal/auth/zzhi;->zzw(Ljava/lang/Class;)I

    const-class v0, [Z

    invoke-static {v0}, Lcom/google/android/gms/internal/auth/zzhi;->zzw(Ljava/lang/Class;)I

    invoke-static {v0}, Lcom/google/android/gms/internal/auth/zzhi;->zzx(Ljava/lang/Class;)I

    const-class v0, [I

    invoke-static {v0}, Lcom/google/android/gms/internal/auth/zzhi;->zzw(Ljava/lang/Class;)I

    invoke-static {v0}, Lcom/google/android/gms/internal/auth/zzhi;->zzx(Ljava/lang/Class;)I

    const-class v0, [J

    invoke-static {v0}, Lcom/google/android/gms/internal/auth/zzhi;->zzw(Ljava/lang/Class;)I

    invoke-static {v0}, Lcom/google/android/gms/internal/auth/zzhi;->zzx(Ljava/lang/Class;)I

    const-class v0, [F

    invoke-static {v0}, Lcom/google/android/gms/internal/auth/zzhi;->zzw(Ljava/lang/Class;)I

    invoke-static {v0}, Lcom/google/android/gms/internal/auth/zzhi;->zzx(Ljava/lang/Class;)I

    const-class v0, [D

    invoke-static {v0}, Lcom/google/android/gms/internal/auth/zzhi;->zzw(Ljava/lang/Class;)I

    invoke-static {v0}, Lcom/google/android/gms/internal/auth/zzhi;->zzx(Ljava/lang/Class;)I

    const-class v0, [Ljava/lang/Object;

    invoke-static {v0}, Lcom/google/android/gms/internal/auth/zzhi;->zzw(Ljava/lang/Class;)I

    invoke-static {v0}, Lcom/google/android/gms/internal/auth/zzhi;->zzx(Ljava/lang/Class;)I

    invoke-static {}, Lcom/google/android/gms/internal/auth/zzhi;->zzy()Ljava/lang/reflect/Field;

    move-result-object v0

    if-eqz v0, :cond_6

    sget-object v1, Lcom/google/android/gms/internal/auth/zzhi;->zze:Lcom/google/android/gms/internal/auth/zzhh;

    if-eqz v1, :cond_6

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/auth/zzhh;->zzk(Ljava/lang/reflect/Field;)J

    :cond_6
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v0

    sget-object v1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    if-ne v0, v1, :cond_7

    goto :goto_5

    :cond_7
    move v8, v9

    :goto_5
    sput-boolean v8, Lcom/google/android/gms/internal/auth/zzhi;->zza:Z

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static zza(Ljava/lang/Object;J)D
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/auth/zzhi;->zze:Lcom/google/android/gms/internal/auth/zzhh;

    invoke-virtual {v0, p0, p1, p2}, Lcom/google/android/gms/internal/auth/zzhh;->zza(Ljava/lang/Object;J)D

    move-result-wide p0

    return-wide p0
.end method

.method static zzb(Ljava/lang/Object;J)F
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/auth/zzhi;->zze:Lcom/google/android/gms/internal/auth/zzhh;

    invoke-virtual {v0, p0, p1, p2}, Lcom/google/android/gms/internal/auth/zzhh;->zzb(Ljava/lang/Object;J)F

    move-result p0

    return p0
.end method

.method static zzc(Ljava/lang/Object;J)I
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/auth/zzhi;->zze:Lcom/google/android/gms/internal/auth/zzhh;

    invoke-virtual {v0, p0, p1, p2}, Lcom/google/android/gms/internal/auth/zzhh;->zzi(Ljava/lang/Object;J)I

    move-result p0

    return p0
.end method

.method static zzd(Ljava/lang/Object;J)J
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/auth/zzhi;->zze:Lcom/google/android/gms/internal/auth/zzhh;

    invoke-virtual {v0, p0, p1, p2}, Lcom/google/android/gms/internal/auth/zzhh;->zzj(Ljava/lang/Object;J)J

    move-result-wide p0

    return-wide p0
.end method

.method static zze(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/auth/zzhi;->zzb:Lsun/misc/Unsafe;

    invoke-virtual {v0, p0}, Lsun/misc/Unsafe;->allocateInstance(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method static zzf(Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/auth/zzhi;->zze:Lcom/google/android/gms/internal/auth/zzhh;

    invoke-virtual {v0, p0, p1, p2}, Lcom/google/android/gms/internal/auth/zzhh;->zzl(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method static zzg()Lsun/misc/Unsafe;
    .locals 1

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/auth/zzhe;

    invoke-direct {v0}, Lcom/google/android/gms/internal/auth/zzhe;-><init>()V

    invoke-static {v0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsun/misc/Unsafe;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method static bridge synthetic zzh(Ljava/lang/Throwable;)V
    .locals 4

    const-class v0, Lcom/google/android/gms/internal/auth/zzhi;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sget-object v1, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v2, "platform method missing - proto runtime falling back to safer methods: "

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v2, "com.google.protobuf.UnsafeUtil"

    const-string v3, "logMissingMethod"

    invoke-virtual {v0, v1, v2, v3, p0}, Ljava/util/logging/Logger;->logp(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic zzi(Ljava/lang/Object;JZ)V
    .locals 4

    const-wide/16 v0, -0x4

    and-long/2addr v0, p1

    sget-object v2, Lcom/google/android/gms/internal/auth/zzhi;->zze:Lcom/google/android/gms/internal/auth/zzhh;

    invoke-virtual {v2, p0, v0, v1}, Lcom/google/android/gms/internal/auth/zzhh;->zzi(Ljava/lang/Object;J)I

    move-result v3

    long-to-int p1, p1

    not-int p1, p1

    and-int/lit8 p1, p1, 0x3

    shl-int/lit8 p1, p1, 0x3

    const/16 p2, 0xff

    shl-int/2addr p2, p1

    not-int p2, p2

    and-int/2addr p2, v3

    shl-int p1, p3, p1

    or-int/2addr p1, p2

    invoke-virtual {v2, p0, v0, v1, p1}, Lcom/google/android/gms/internal/auth/zzhh;->zzm(Ljava/lang/Object;JI)V

    return-void
.end method

.method static synthetic zzj(Ljava/lang/Object;JZ)V
    .locals 4

    const-wide/16 v0, -0x4

    and-long/2addr v0, p1

    sget-object v2, Lcom/google/android/gms/internal/auth/zzhi;->zze:Lcom/google/android/gms/internal/auth/zzhh;

    invoke-virtual {v2, p0, v0, v1}, Lcom/google/android/gms/internal/auth/zzhh;->zzi(Ljava/lang/Object;J)I

    move-result v3

    long-to-int p1, p1

    and-int/lit8 p1, p1, 0x3

    shl-int/lit8 p1, p1, 0x3

    const/16 p2, 0xff

    shl-int/2addr p2, p1

    not-int p2, p2

    and-int/2addr p2, v3

    shl-int p1, p3, p1

    or-int/2addr p1, p2

    invoke-virtual {v2, p0, v0, v1, p1}, Lcom/google/android/gms/internal/auth/zzhh;->zzm(Ljava/lang/Object;JI)V

    return-void
.end method

.method static zzk(Ljava/lang/Object;JZ)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/auth/zzhi;->zze:Lcom/google/android/gms/internal/auth/zzhh;

    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/google/android/gms/internal/auth/zzhh;->zzc(Ljava/lang/Object;JZ)V

    return-void
.end method

.method static zzl(Ljava/lang/Object;JD)V
    .locals 6

    sget-object v0, Lcom/google/android/gms/internal/auth/zzhi;->zze:Lcom/google/android/gms/internal/auth/zzhh;

    move-object v1, p0

    move-wide v2, p1

    move-wide v4, p3

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/auth/zzhh;->zzd(Ljava/lang/Object;JD)V

    return-void
.end method

.method static zzm(Ljava/lang/Object;JF)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/auth/zzhi;->zze:Lcom/google/android/gms/internal/auth/zzhh;

    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/google/android/gms/internal/auth/zzhh;->zze(Ljava/lang/Object;JF)V

    return-void
.end method

.method static zzn(Ljava/lang/Object;JI)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/auth/zzhi;->zze:Lcom/google/android/gms/internal/auth/zzhh;

    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/google/android/gms/internal/auth/zzhh;->zzm(Ljava/lang/Object;JI)V

    return-void
.end method

.method static zzo(Ljava/lang/Object;JJ)V
    .locals 6

    sget-object v0, Lcom/google/android/gms/internal/auth/zzhi;->zze:Lcom/google/android/gms/internal/auth/zzhh;

    move-object v1, p0

    move-wide v2, p1

    move-wide v4, p3

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/auth/zzhh;->zzn(Ljava/lang/Object;JJ)V

    return-void
.end method

.method static zzp(Ljava/lang/Object;JLjava/lang/Object;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/auth/zzhi;->zze:Lcom/google/android/gms/internal/auth/zzhh;

    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/google/android/gms/internal/auth/zzhh;->zzo(Ljava/lang/Object;JLjava/lang/Object;)V

    return-void
.end method

.method static bridge synthetic zzq(Ljava/lang/Object;J)Z
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/auth/zzhi;->zze:Lcom/google/android/gms/internal/auth/zzhh;

    const-wide/16 v1, -0x4

    and-long/2addr v1, p1

    invoke-virtual {v0, p0, v1, v2}, Lcom/google/android/gms/internal/auth/zzhh;->zzi(Ljava/lang/Object;J)I

    move-result p0

    not-long p1, p1

    const-wide/16 v0, 0x3

    and-long/2addr p1, v0

    const/4 v0, 0x3

    shl-long/2addr p1, v0

    long-to-int p1, p1

    ushr-int/2addr p0, p1

    and-int/lit16 p0, p0, 0xff

    int-to-byte p0, p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method static bridge synthetic zzr(Ljava/lang/Object;J)Z
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/auth/zzhi;->zze:Lcom/google/android/gms/internal/auth/zzhh;

    const-wide/16 v1, -0x4

    and-long/2addr v1, p1

    invoke-virtual {v0, p0, v1, v2}, Lcom/google/android/gms/internal/auth/zzhh;->zzi(Ljava/lang/Object;J)I

    move-result p0

    const-wide/16 v0, 0x3

    and-long/2addr p1, v0

    const/4 v0, 0x3

    shl-long/2addr p1, v0

    long-to-int p1, p1

    ushr-int/2addr p0, p1

    and-int/lit16 p0, p0, 0xff

    int-to-byte p0, p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method static zzs(Ljava/lang/Class;)Z
    .locals 10

    const-class v0, [B

    sget v1, Lcom/google/android/gms/internal/auth/zzdr;->zza:I

    const/4 v1, 0x0

    :try_start_0
    sget-object v2, Lcom/google/android/gms/internal/auth/zzhi;->zzc:Ljava/lang/Class;

    const/4 v3, 0x2

    new-array v4, v3, [Ljava/lang/Class;

    aput-object p0, v4, v1

    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v6, 0x1

    aput-object v5, v4, v6

    const-string v7, "peekLong"

    invoke-virtual {v2, v7, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const/4 v4, 0x3

    new-array v7, v4, [Ljava/lang/Class;

    aput-object p0, v7, v1

    sget-object v8, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    aput-object v8, v7, v6

    aput-object v5, v7, v3

    const-string v8, "pokeLong"

    invoke-virtual {v2, v8, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    new-array v7, v4, [Ljava/lang/Class;

    aput-object p0, v7, v1

    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v8, v7, v6

    aput-object v5, v7, v3

    const-string v9, "pokeInt"

    invoke-virtual {v2, v9, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    new-array v7, v3, [Ljava/lang/Class;

    aput-object p0, v7, v1

    aput-object v5, v7, v6

    const-string v5, "peekInt"

    invoke-virtual {v2, v5, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    new-array v5, v3, [Ljava/lang/Class;

    aput-object p0, v5, v1

    sget-object v7, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    aput-object v7, v5, v6

    const-string v7, "pokeByte"

    invoke-virtual {v2, v7, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    new-array v5, v6, [Ljava/lang/Class;

    aput-object p0, v5, v1

    const-string v7, "peekByte"

    invoke-virtual {v2, v7, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const/4 v5, 0x4

    new-array v7, v5, [Ljava/lang/Class;

    aput-object p0, v7, v1

    aput-object v0, v7, v6

    aput-object v8, v7, v3

    aput-object v8, v7, v4

    const-string v9, "pokeByteArray"

    invoke-virtual {v2, v9, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    new-array v5, v5, [Ljava/lang/Class;

    aput-object p0, v5, v1

    aput-object v0, v5, v6

    aput-object v8, v5, v3

    aput-object v8, v5, v4

    const-string p0, "peekByteArray"

    invoke-virtual {v2, p0, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v6

    :catchall_0
    return v1
.end method

.method static zzt(Ljava/lang/Object;J)Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/auth/zzhi;->zze:Lcom/google/android/gms/internal/auth/zzhh;

    invoke-virtual {v0, p0, p1, p2}, Lcom/google/android/gms/internal/auth/zzhh;->zzf(Ljava/lang/Object;J)Z

    move-result p0

    return p0
.end method

.method static zzu()Z
    .locals 1

    sget-boolean v0, Lcom/google/android/gms/internal/auth/zzhi;->zzg:Z

    return v0
.end method

.method static zzv()Z
    .locals 1

    sget-boolean v0, Lcom/google/android/gms/internal/auth/zzhi;->zzf:Z

    return v0
.end method

.method private static zzw(Ljava/lang/Class;)I
    .locals 1

    sget-boolean v0, Lcom/google/android/gms/internal/auth/zzhi;->zzg:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/auth/zzhi;->zze:Lcom/google/android/gms/internal/auth/zzhh;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/auth/zzhh;->zzg(Ljava/lang/Class;)I

    move-result p0

    return p0

    :cond_0
    const/4 p0, -0x1

    return p0
.end method

.method private static zzx(Ljava/lang/Class;)I
    .locals 1

    sget-boolean v0, Lcom/google/android/gms/internal/auth/zzhi;->zzg:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/auth/zzhi;->zze:Lcom/google/android/gms/internal/auth/zzhh;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/auth/zzhh;->zzh(Ljava/lang/Class;)I

    move-result p0

    return p0

    :cond_0
    const/4 p0, -0x1

    return p0
.end method

.method private static zzy()Ljava/lang/reflect/Field;
    .locals 3

    sget v0, Lcom/google/android/gms/internal/auth/zzdr;->zza:I

    const-string v0, "effectiveDirectAddress"

    const-class v1, Ljava/nio/Buffer;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/auth/zzhi;->zzz(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, "address"

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/auth/zzhi;->zzz(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v1

    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v1, v2, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    return-object v0
.end method

.method private static zzz(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 0

    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method
.class public final Lcg/s;
.super Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzed;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfp;


# static fields
.field private static final zza:Lcg/s;


# instance fields
.field private zzd:I

.field private zze:I

.field private zzf:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzdb;

.field private zzg:Ljava/lang/String;

.field private zzh:I

.field private zzi:Lcg/h0;

.field private zzj:Lcg/o0;

.field private zzk:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzci;

.field private zzl:Lcg/i;

.field private zzm:Lcg/q;

.field private zzn:Lcg/l;

.field private zzo:Lcg/e;

.field private zzp:Lcg/f0;

.field private zzq:Lcg/j0;

.field private zzr:Lcg/b0;

.field private zzs:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzel;

.field private zzt:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzej;

.field private zzu:Ljava/lang/String;

.field private zzv:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzel;

.field private zzw:Z

.field private zzx:D

.field private zzy:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzdb;

.field private zzz:B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcg/s;

    invoke-direct {v0}, Lcg/s;-><init>()V

    sput-object v0, Lcg/s;->zza:Lcg/s;

    const-class v1, Lcg/s;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzed;->zzU(Ljava/lang/Class;Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzed;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzed;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, Lcg/s;->zzz:B

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzdb;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzdb;

    iput-object v0, p0, Lcg/s;->zzf:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzdb;

    const-string v1, ""

    iput-object v1, p0, Lcg/s;->zzg:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzed;->zzO()Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzel;

    move-result-object v2

    iput-object v2, p0, Lcg/s;->zzs:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzel;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzed;->zzN()Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzej;

    move-result-object v2

    iput-object v2, p0, Lcg/s;->zzt:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzej;

    iput-object v1, p0, Lcg/s;->zzu:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzed;->zzO()Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzel;

    move-result-object v1

    iput-object v1, p0, Lcg/s;->zzv:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzel;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcg/s;->zzw:Z

    iput-object v0, p0, Lcg/s;->zzy:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzdb;

    return-void
.end method

.method static synthetic c()Lcg/s;
    .locals 1

    sget-object v0, Lcg/s;->zza:Lcg/s;

    return-object v0
.end method

.method static synthetic o(Lcg/s;ILcg/g;)V
    .locals 2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcg/s;->zzs:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzel;

    invoke-interface {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzel;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzed;->zzP(Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzel;)Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzel;

    move-result-object v0

    iput-object v0, p0, Lcg/s;->zzs:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzel;

    :cond_0
    iget-object p0, p0, Lcg/s;->zzs:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzel;

    invoke-interface {p0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcg/s;->zzh:I

    invoke-static {v0}, Lcg/y;->a(I)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public final b()I
    .locals 1

    iget-object v0, p0, Lcg/s;->zzs:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzel;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final d()Lcg/f0;
    .locals 1

    iget-object v0, p0, Lcg/s;->zzp:Lcg/f0;

    if-nez v0, :cond_0

    invoke-static {}, Lcg/f0;->d()Lcg/f0;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final e()Lcg/h0;
    .locals 1

    iget-object v0, p0, Lcg/s;->zzi:Lcg/h0;

    if-nez v0, :cond_0

    invoke-static {}, Lcg/h0;->b()Lcg/h0;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final f()Lcg/j0;
    .locals 1

    iget-object v0, p0, Lcg/s;->zzq:Lcg/j0;

    if-nez v0, :cond_0

    invoke-static {}, Lcg/j0;->b()Lcg/j0;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final g()Lcg/o0;
    .locals 1

    iget-object v0, p0, Lcg/s;->zzj:Lcg/o0;

    if-nez v0, :cond_0

    invoke-static {}, Lcg/o0;->b()Lcg/o0;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final h()Lcg/e;
    .locals 1

    iget-object v0, p0, Lcg/s;->zzo:Lcg/e;

    if-nez v0, :cond_0

    invoke-static {}, Lcg/e;->d()Lcg/e;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final i()Lcg/i;
    .locals 1

    iget-object v0, p0, Lcg/s;->zzl:Lcg/i;

    if-nez v0, :cond_0

    invoke-static {}, Lcg/i;->b()Lcg/i;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final j()Lcg/l;
    .locals 1

    iget-object v0, p0, Lcg/s;->zzn:Lcg/l;

    if-nez v0, :cond_0

    invoke-static {}, Lcg/l;->b()Lcg/l;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final k()Lcg/q;
    .locals 1

    iget-object v0, p0, Lcg/s;->zzm:Lcg/q;

    if-nez v0, :cond_0

    invoke-static {}, Lcg/q;->b()Lcg/q;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final l()Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzdb;
    .locals 1

    iget-object v0, p0, Lcg/s;->zzf:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzdb;

    return-object v0
.end method

.method public final m()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcg/s;->zzg:Ljava/lang/String;

    return-object v0
.end method

.method public final n()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcg/s;->zzs:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzel;

    return-object v0
.end method

.method public final p()Z
    .locals 1

    iget v0, p0, Lcg/s;->zzd:I

    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final q()Z
    .locals 1

    iget v0, p0, Lcg/s;->zzd:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final r()Z
    .locals 1

    iget v0, p0, Lcg/s;->zzd:I

    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final s()Z
    .locals 1

    iget v0, p0, Lcg/s;->zzd:I

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final t()Z
    .locals 1

    iget v0, p0, Lcg/s;->zzd:I

    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final u()Z
    .locals 1

    iget v0, p0, Lcg/s;->zzd:I

    and-int/lit8 v0, v0, 0x40

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final v()Z
    .locals 1

    iget v0, p0, Lcg/s;->zzd:I

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final w()Z
    .locals 1

    iget v0, p0, Lcg/s;->zzd:I

    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final x()Z
    .locals 1

    iget v0, p0, Lcg/s;->zzd:I

    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final y()I
    .locals 1

    iget v0, p0, Lcg/s;->zze:I

    invoke-static {v0}, Lcg/v;->a(I)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public final zzb()Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzci;
    .locals 1

    iget-object v0, p0, Lcg/s;->zzk:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzci;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzci;->zzb()Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzci;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method protected final zzg(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    add-int/lit8 p1, p1, -0x1

    if-eqz p1, :cond_5

    const/4 p3, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x5

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    if-eq p1, v4, :cond_4

    if-eq p1, v3, :cond_3

    const/4 v3, 0x0

    if-eq p1, v2, :cond_2

    if-eq p1, v1, :cond_1

    if-nez p2, :cond_0

    move p3, v0

    :cond_0
    iput-byte p3, p0, Lcg/s;->zzz:B

    return-object v3

    :cond_1
    sget-object p1, Lcg/s;->zza:Lcg/s;

    return-object p1

    :cond_2
    new-instance p1, Lcg/r;

    invoke-direct {p1, v3}, Lcg/r;-><init>(Lcg/b;)V

    return-object p1

    :cond_3
    new-instance p1, Lcg/s;

    invoke-direct {p1}, Lcg/s;-><init>()V

    return-object p1

    :cond_4
    const/16 p1, 0x1a

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "zzd"

    aput-object p2, p1, v0

    const-string p2, "zze"

    aput-object p2, p1, p3

    sget-object p2, Lcg/u;->a:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzeh;

    aput-object p2, p1, v4

    const-string p2, "zzf"

    aput-object p2, p1, v3

    const-string p2, "zzg"

    aput-object p2, p1, v2

    const-string p2, "zzh"

    aput-object p2, p1, v1

    const/4 p2, 0x6

    sget-object p3, Lcg/x;->a:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzeh;

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zzi"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zzj"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zzk"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "zzl"

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "zzm"

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-string p3, "zzn"

    aput-object p3, p1, p2

    const/16 p2, 0xd

    const-string p3, "zzs"

    aput-object p3, p1, p2

    const/16 p2, 0xe

    const-class p3, Lcg/g;

    aput-object p3, p1, p2

    const/16 p2, 0xf

    const-string v0, "zzu"

    aput-object v0, p1, p2

    const/16 p2, 0x10

    const-string v0, "zzv"

    aput-object v0, p1, p2

    const/16 p2, 0x11

    aput-object p3, p1, p2

    const/16 p2, 0x12

    const-string p3, "zzy"

    aput-object p3, p1, p2

    const/16 p2, 0x13

    const-string p3, "zzo"

    aput-object p3, p1, p2

    const/16 p2, 0x14

    const-string p3, "zzp"

    aput-object p3, p1, p2

    const/16 p2, 0x15

    const-string p3, "zzq"

    aput-object p3, p1, p2

    const/16 p2, 0x16

    const-string p3, "zzt"

    aput-object p3, p1, p2

    const/16 p2, 0x17

    const-string p3, "zzr"

    aput-object p3, p1, p2

    const/16 p2, 0x18

    const-string p3, "zzw"

    aput-object p3, p1, p2

    const/16 p2, 0x19

    const-string p3, "zzx"

    aput-object p3, p1, p2

    sget-object p2, Lcg/s;->zza:Lcg/s;

    const-string p3, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0003\u000b\u0001\u1d0c\u0000\u0002\u150a\u0001\u0003\u1508\u0002\u0004\u1d0c\u0003\u0005\u1409\u0004\u0006\u1009\u0005\u0007\u1009\u0006\u0008\u1409\u0007\t\u1409\u0008\n\u1409\t\u000b\u041b\u000c\u1008\u000e\r\u041b\u000e\u100a\u0011\u000f\u1409\n\u0010\u1009\u000b\u0011\u1009\u000c\u0012\u0016\u0013\u1009\r\u0014\u1007\u000f\u0015\u1000\u0010"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzed;->zzR(Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfo;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, Lcg/s;->zzz:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.class public abstract Lcom/google/android/gms/internal/ads/zzsz;
.super Lcom/google/android/gms/internal/ads/zziq;
.source "SourceFile"


# static fields
.field private static final zzb:[B


# instance fields
.field private zzA:I

.field private zzB:Z

.field private zzC:Z

.field private zzD:Z

.field private zzE:Z

.field private zzF:Z

.field private zzG:Z

.field private zzH:J

.field private zzI:I

.field private zzJ:I

.field private zzK:Ljava/nio/ByteBuffer;

.field private zzL:Z

.field private zzM:Z

.field private zzN:Z

.field private zzO:Z

.field private zzP:Z

.field private zzQ:Z

.field private zzR:I

.field private zzS:I

.field private zzT:I

.field private zzU:Z

.field private zzV:Z

.field private zzW:Z

.field private zzX:J

.field private zzY:J

.field private zzZ:Z

.field protected zza:Lcom/google/android/gms/internal/ads/zzir;

.field private zzaa:Z

.field private zzab:Z

.field private zzac:Lcom/google/android/gms/internal/ads/zzsy;

.field private zzad:J

.field private zzae:Z

.field private zzaf:Lcom/google/android/gms/internal/ads/zzrz;

.field private zzag:Lcom/google/android/gms/internal/ads/zzrz;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzsq;

.field private final zzd:Lcom/google/android/gms/internal/ads/zztb;

.field private final zze:F

.field private final zzf:Lcom/google/android/gms/internal/ads/zzih;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzih;

.field private final zzh:Lcom/google/android/gms/internal/ads/zzih;

.field private final zzi:Lcom/google/android/gms/internal/ads/zzsn;

.field private final zzj:Landroid/media/MediaCodec$BufferInfo;

.field private final zzk:Ljava/util/ArrayDeque;

.field private final zzl:Lcom/google/android/gms/internal/ads/zzrk;

.field private zzm:Lcom/google/android/gms/internal/ads/zzam;

.field private zzn:Lcom/google/android/gms/internal/ads/zzam;

.field private zzo:Landroid/media/MediaCrypto;

.field private zzp:Z

.field private zzq:J

.field private zzr:F

.field private zzs:Lcom/google/android/gms/internal/ads/zzsr;

.field private zzt:Lcom/google/android/gms/internal/ads/zzam;

.field private zzu:Landroid/media/MediaFormat;

.field private zzv:Z

.field private zzw:F

.field private zzx:Ljava/util/ArrayDeque;

.field private zzy:Lcom/google/android/gms/internal/ads/zzsx;

.field private zzz:Lcom/google/android/gms/internal/ads/zzsv;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x26

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzsz;->zzb:[B

    return-void

    :array_0
    .array-data 1
        0x0t
        0x0t
        0x1t
        0x67t
        0x42t
        -0x40t
        0xbt
        -0x26t
        0x25t
        -0x70t
        0x0t
        0x0t
        0x1t
        0x68t
        -0x32t
        0xft
        0x13t
        0x20t
        0x0t
        0x0t
        0x1t
        0x65t
        -0x78t
        -0x7ct
        0xdt
        -0x32t
        0x71t
        0x18t
        -0x60t
        0x0t
        0x2ft
        -0x41t
        0x1ct
        0x31t
        -0x3dt
        0x27t
        0x5dt
        0x78t
    .end array-data
.end method

.method public constructor <init>(ILcom/google/android/gms/internal/ads/zzsq;Lcom/google/android/gms/internal/ads/zztb;ZF)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zziq;-><init>(I)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzc:Lcom/google/android/gms/internal/ads/zzsq;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzd:Lcom/google/android/gms/internal/ads/zztb;

    iput p5, p0, Lcom/google/android/gms/internal/ads/zzsz;->zze:F

    new-instance p1, Lcom/google/android/gms/internal/ads/zzih;

    const/4 p2, 0x0

    invoke-direct {p1, p2, p2}, Lcom/google/android/gms/internal/ads/zzih;-><init>(II)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzf:Lcom/google/android/gms/internal/ads/zzih;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzih;

    invoke-direct {p1, p2, p2}, Lcom/google/android/gms/internal/ads/zzih;-><init>(II)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzg:Lcom/google/android/gms/internal/ads/zzih;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzih;

    const/4 p3, 0x2

    invoke-direct {p1, p3, p2}, Lcom/google/android/gms/internal/ads/zzih;-><init>(II)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzh:Lcom/google/android/gms/internal/ads/zzih;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzsn;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzsn;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzi:Lcom/google/android/gms/internal/ads/zzsn;

    new-instance p3, Landroid/media/MediaCodec$BufferInfo;

    invoke-direct {p3}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzj:Landroid/media/MediaCodec$BufferInfo;

    const/high16 p3, 0x3f800000    # 1.0f

    iput p3, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzr:F

    const-wide p3, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzq:J

    new-instance p5, Ljava/util/ArrayDeque;

    invoke-direct {p5}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzk:Ljava/util/ArrayDeque;

    sget-object p5, Lcom/google/android/gms/internal/ads/zzsy;->zza:Lcom/google/android/gms/internal/ads/zzsy;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzac:Lcom/google/android/gms/internal/ads/zzsy;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzih;->zzi(I)V

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzih;->zzc:Ljava/nio/ByteBuffer;

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object p5

    invoke-virtual {p1, p5}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzrk;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzrk;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzl:Lcom/google/android/gms/internal/ads/zzrk;

    const/high16 p1, -0x40800000    # -1.0f

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzw:F

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzA:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzR:I

    const/4 p1, -0x1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzI:I

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzJ:I

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzH:J

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzX:J

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzY:J

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzad:J

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzS:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzT:I

    new-instance p1, Lcom/google/android/gms/internal/ads/zzir;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzir;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zza:Lcom/google/android/gms/internal/ads/zzir;

    return-void
.end method

.method protected static zzaJ(Lcom/google/android/gms/internal/ads/zzam;)Z
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/zzam;->zzG:I

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const/4 p0, 0x1

    return p0
.end method

.method private final zzaK()V
    .locals 3

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzT:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    const/4 v2, 0x3

    if-eq v0, v2, :cond_0

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzaa:Z

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzao()V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzaB()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzax()V

    return-void

    :cond_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzag()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzaO()V

    return-void

    :cond_2
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzag()V

    return-void
.end method

.method private final zzaL()V
    .locals 2

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzI:I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzg:Lcom/google/android/gms/internal/ads/zzih;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzih;->zzc:Ljava/nio/ByteBuffer;

    return-void
.end method

.method private final zzaM()V
    .locals 1

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzJ:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzK:Ljava/nio/ByteBuffer;

    return-void
.end method

.method private final zzaN(Lcom/google/android/gms/internal/ads/zzsy;)V
    .locals 4

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzac:Lcom/google/android/gms/internal/ads/zzsy;

    iget-wide v0, p1, Lcom/google/android/gms/internal/ads/zzsy;->zzd:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, v0, v2

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzae:Z

    :cond_0
    return-void
.end method

.method private final zzaO()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzag:Lcom/google/android/gms/internal/ads/zzrz;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzaf:Lcom/google/android/gms/internal/ads/zzrz;

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzS:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzT:I

    return-void
.end method

.method private final zzaP()Z
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzU:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iput v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzS:I

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzC:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzT:I

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x2

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzT:I

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzaO()V

    :goto_0
    return v1
.end method

.method private final zzaQ()Z
    .locals 10

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzs:Lcom/google/android/gms/internal/ads/zzsr;

    const/4 v7, 0x0

    if-eqz v0, :cond_19

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzS:I

    const/4 v8, 0x2

    if-eq v1, v8, :cond_19

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzZ:Z

    if-eqz v1, :cond_0

    goto/16 :goto_3

    :cond_0
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzI:I

    if-gez v1, :cond_2

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzsr;->zza()I

    move-result v1

    iput v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzI:I

    if-gez v1, :cond_1

    return v7

    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzg:Lcom/google/android/gms/internal/ads/zzih;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzsr;->zzf(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    iput-object v1, v2, Lcom/google/android/gms/internal/ads/zzih;->zzc:Ljava/nio/ByteBuffer;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzg:Lcom/google/android/gms/internal/ads/zzih;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzib;->zzb()V

    :cond_2
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzS:I

    const/4 v9, 0x1

    if-ne v1, v9, :cond_4

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzG:Z

    if-nez v1, :cond_3

    iput-boolean v9, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzV:Z

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzI:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x4

    invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzsr;->zzj(IIIJI)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzaL()V

    :cond_3
    iput v8, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzS:I

    return v7

    :cond_4
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzE:Z

    if-eqz v1, :cond_5

    iput-boolean v7, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzE:Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzg:Lcom/google/android/gms/internal/ads/zzih;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzih;->zzc:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lcom/google/android/gms/internal/ads/zzsz;->zzb:[B

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzI:I

    const/4 v2, 0x0

    const/16 v3, 0x26

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzsr;->zzj(IIIJI)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzaL()V

    iput-boolean v9, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzU:Z

    return v9

    :cond_5
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzR:I

    if-ne v1, v9, :cond_7

    move v1, v7

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzt:Lcom/google/android/gms/internal/ads/zzam;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzam;->zzo:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_6

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzt:Lcom/google/android/gms/internal/ads/zzam;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzam;->zzo:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzg:Lcom/google/android/gms/internal/ads/zzih;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzih;->zzc:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_6
    iput v8, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzR:I

    :cond_7
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzg:Lcom/google/android/gms/internal/ads/zzih;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzih;->zzc:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    move-result v1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zziq;->zzbi()Lcom/google/android/gms/internal/ads/zzlb;

    move-result-object v2

    :try_start_0
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzg:Lcom/google/android/gms/internal/ads/zzih;

    invoke-virtual {p0, v2, v3, v7}, Lcom/google/android/gms/internal/ads/zziq;->zzbg(Lcom/google/android/gms/internal/ads/zzlb;Lcom/google/android/gms/internal/ads/zzih;I)I

    move-result v3
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzig; {:try_start_0 .. :try_end_0} :catch_2

    const/4 v4, -0x3

    if-ne v3, v4, :cond_9

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zziq;->zzP()Z

    move-result v0

    if-eqz v0, :cond_8

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzX:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzY:J

    :cond_8
    return v7

    :cond_9
    const/4 v4, -0x5

    if-ne v3, v4, :cond_b

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzR:I

    if-ne v0, v8, :cond_a

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzg:Lcom/google/android/gms/internal/ads/zzih;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzib;->zzb()V

    iput v9, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzR:I

    :cond_a
    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/ads/zzsz;->zzab(Lcom/google/android/gms/internal/ads/zzlb;)Lcom/google/android/gms/internal/ads/zzis;

    return v9

    :cond_b
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzg:Lcom/google/android/gms/internal/ads/zzih;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzib;->zzf()Z

    move-result v3

    if-eqz v3, :cond_f

    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzX:J

    iput-wide v3, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzY:J

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzR:I

    if-ne v1, v8, :cond_c

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzib;->zzb()V

    iput v9, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzR:I

    :cond_c
    iput-boolean v9, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzZ:Z

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzU:Z

    if-nez v1, :cond_d

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzaK()V

    return v7

    :cond_d
    :try_start_1
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzG:Z

    if-nez v1, :cond_e

    iput-boolean v9, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzV:Z

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzI:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x4

    invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzsr;->zzj(IIIJI)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzaL()V
    :try_end_1
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_1 .. :try_end_1} :catch_0

    :cond_e
    return v7

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzm:Lcom/google/android/gms/internal/ads/zzam;

    invoke-virtual {v0}, Landroid/media/MediaCodec$CryptoException;->getErrorCode()I

    move-result v2

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzfy;->zzi(I)I

    move-result v2

    invoke-virtual {p0, v0, v1, v7, v2}, Lcom/google/android/gms/internal/ads/zziq;->zzi(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzam;ZI)Lcom/google/android/gms/internal/ads/zziz;

    move-result-object v0

    throw v0

    :cond_f
    iget-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzU:Z

    if-nez v3, :cond_11

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzib;->zzg()Z

    move-result v3

    if-nez v3, :cond_11

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzib;->zzb()V

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzR:I

    if-ne v0, v8, :cond_10

    iput v9, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzR:I

    :cond_10
    return v9

    :cond_11
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzih;->zzk()Z

    move-result v3

    if-eqz v3, :cond_12

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzih;->zzb:Lcom/google/android/gms/internal/ads/zzie;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzie;->zzb(I)V

    :cond_12
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzg:Lcom/google/android/gms/internal/ads/zzih;

    iget-wide v4, v1, Lcom/google/android/gms/internal/ads/zzih;->zze:J

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzab:Z

    if-eqz v1, :cond_14

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzk:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_13

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzk:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peekLast()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzsy;

    goto :goto_1

    :cond_13
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzac:Lcom/google/android/gms/internal/ads/zzsy;

    :goto_1
    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzsy;->zze:Lcom/google/android/gms/internal/ads/zzfv;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzm:Lcom/google/android/gms/internal/ads/zzam;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v4, v5, v2}, Lcom/google/android/gms/internal/ads/zzfv;->zzd(JLjava/lang/Object;)V

    iput-boolean v7, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzab:Z

    :cond_14
    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzX:J

    invoke-static {v1, v2, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzX:J

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zziq;->zzP()Z

    move-result v6

    if-nez v6, :cond_15

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzg:Lcom/google/android/gms/internal/ads/zzih;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzib;->zzh()Z

    move-result v6

    if-eqz v6, :cond_16

    :cond_15
    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzY:J

    :cond_16
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzg:Lcom/google/android/gms/internal/ads/zzih;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzih;->zzj()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzg:Lcom/google/android/gms/internal/ads/zzih;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzib;->zze()Z

    move-result v2

    if-eqz v2, :cond_17

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ads/zzsz;->zzah(Lcom/google/android/gms/internal/ads/zzih;)V

    :cond_17
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzg:Lcom/google/android/gms/internal/ads/zzih;

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ads/zzsz;->zzaz(Lcom/google/android/gms/internal/ads/zzih;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzg:Lcom/google/android/gms/internal/ads/zzih;

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ads/zzsz;->zzar(Lcom/google/android/gms/internal/ads/zzih;)I

    if-eqz v3, :cond_18

    :try_start_2
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzI:I

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzg:Lcom/google/android/gms/internal/ads/zzih;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzih;->zzb:Lcom/google/android/gms/internal/ads/zzie;

    const/4 v6, 0x0

    invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzsr;->zzk(IILcom/google/android/gms/internal/ads/zzie;JI)V

    goto :goto_2

    :cond_18
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzI:I

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzg:Lcom/google/android/gms/internal/ads/zzih;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzih;->zzc:Ljava/nio/ByteBuffer;
    :try_end_2
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_2 .. :try_end_2} :catch_1

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v3, 0x0

    :try_start_3
    invoke-virtual {v2}, Ljava/nio/Buffer;->limit()I

    move-result v6

    const/4 v8, 0x0

    move v2, v3

    move v3, v6

    move v6, v8

    invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzsr;->zzj(IIIJI)V
    :try_end_3
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_3 .. :try_end_3} :catch_1

    :goto_2
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzaL()V

    iput-boolean v9, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzU:Z

    iput v7, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzR:I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zza:Lcom/google/android/gms/internal/ads/zzir;

    iget v1, v0, Lcom/google/android/gms/internal/ads/zzir;->zzc:I

    add-int/2addr v1, v9

    iput v1, v0, Lcom/google/android/gms/internal/ads/zzir;->zzc:I

    return v9

    :catch_1
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzm:Lcom/google/android/gms/internal/ads/zzam;

    invoke-virtual {v0}, Landroid/media/MediaCodec$CryptoException;->getErrorCode()I

    move-result v2

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzfy;->zzi(I)I

    move-result v2

    invoke-virtual {p0, v0, v1, v7, v2}, Lcom/google/android/gms/internal/ads/zziq;->zzi(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzam;ZI)Lcom/google/android/gms/internal/ads/zziz;

    move-result-object v0

    throw v0

    :catch_2
    move-exception v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzsz;->zzai(Ljava/lang/Exception;)V

    invoke-direct {p0, v7}, Lcom/google/android/gms/internal/ads/zzsz;->zzaT(I)Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzag()V

    return v9

    :cond_19
    :goto_3
    return v7
.end method

.method private final zzaR()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzJ:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private final zzaS(JJ)Z
    .locals 4

    cmp-long v0, p3, p1

    const/4 v1, 0x0

    if-gez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzn:Lcom/google/android/gms/internal/ads/zzam;

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzam;->zzm:Ljava/lang/String;

    const-string v3, "audio/opus"

    invoke-static {v0, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/zzadq;->zzf(JJ)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    return v2

    :cond_1
    move v1, v2

    :cond_2
    :goto_0
    return v1
.end method

.method private final zzaT(I)Z
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzf:Lcom/google/android/gms/internal/ads/zzih;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zziq;->zzbi()Lcom/google/android/gms/internal/ads/zzlb;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzib;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzf:Lcom/google/android/gms/internal/ads/zzih;

    or-int/lit8 p1, p1, 0x4

    invoke-virtual {p0, v1, v0, p1}, Lcom/google/android/gms/internal/ads/zziq;->zzbg(Lcom/google/android/gms/internal/ads/zzlb;Lcom/google/android/gms/internal/ads/zzih;I)I

    move-result p1

    const/4 v0, -0x5

    const/4 v2, 0x1

    if-ne p1, v0, :cond_0

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ads/zzsz;->zzab(Lcom/google/android/gms/internal/ads/zzlb;)Lcom/google/android/gms/internal/ads/zzis;

    return v2

    :cond_0
    const/4 v0, -0x4

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzf:Lcom/google/android/gms/internal/ads/zzih;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzib;->zzf()Z

    move-result p1

    if-eqz p1, :cond_1

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzZ:Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzaK()V

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private final zzaU(J)Z
    .locals 4

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzq:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zziq;->zzh()Lcom/google/android/gms/internal/ads/zzel;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    sub-long/2addr v0, p1

    iget-wide p1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzq:J

    cmp-long p1, v0, p1

    if-gez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method private final zzaV(Lcom/google/android/gms/internal/ads/zzam;)Z
    .locals 4

    sget v0, Lcom/google/android/gms/internal/ads/zzfy;->zza:I

    const/16 v1, 0x17

    const/4 v2, 0x1

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzs:Lcom/google/android/gms/internal/ads/zzsr;

    if-eqz v0, :cond_3

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzT:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zziq;->zzbf()I

    move-result v0

    if-eqz v0, :cond_3

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzr:F

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zziq;->zzS()[Lcom/google/android/gms/internal/ads/zzam;

    move-result-object v1

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/android/gms/internal/ads/zzsz;->zzY(FLcom/google/android/gms/internal/ads/zzam;[Lcom/google/android/gms/internal/ads/zzam;)F

    move-result p1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzw:F

    cmpl-float v1, v0, p1

    if-eqz v1, :cond_3

    const/high16 v1, -0x40800000    # -1.0f

    cmpl-float v3, p1, v1

    if-nez v3, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzad()V

    const/4 p1, 0x0

    return p1

    :cond_1
    cmpl-float v0, v0, v1

    if-nez v0, :cond_2

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zze:F

    cmpl-float v0, p1, v0

    if-lez v0, :cond_3

    :cond_2
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "operating-rate"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzs:Lcom/google/android/gms/internal/ads/zzsr;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/zzsr;->zzp(Landroid/os/Bundle;)V

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzw:F

    :cond_3
    :goto_0
    return v2
.end method

.method private final zzac()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzP:Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzi:Lcom/google/android/gms/internal/ads/zzsn;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzib;->zzb()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzh:Lcom/google/android/gms/internal/ads/zzih;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzib;->zzb()V

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzO:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzN:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzl:Lcom/google/android/gms/internal/ads/zzrk;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzrk;->zzb()V

    return-void
.end method

.method private final zzad()V
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzU:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzS:I

    const/4 v0, 0x3

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzT:I

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzaB()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzax()V

    return-void
.end method

.method private final zzag()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzs:Lcom/google/android/gms/internal/ads/zzsr;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzek;->zzb(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzsr;->zzi()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzaC()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzaC()V

    throw v0
.end method

.method private final zzam(Lcom/google/android/gms/internal/ads/zzsv;Landroid/media/MediaCrypto;)V
    .locals 18

    move-object/from16 v8, p0

    move-object/from16 v0, p1

    const-string v1, "createCodec:"

    iget-object v2, v8, Lcom/google/android/gms/internal/ads/zzsz;->zzm:Lcom/google/android/gms/internal/ads/zzam;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzsv;->zza:Ljava/lang/String;

    sget v4, Lcom/google/android/gms/internal/ads/zzfy;->zza:I

    const/16 v6, 0x17

    if-ge v4, v6, :cond_0

    const/high16 v7, -0x40800000    # -1.0f

    goto :goto_0

    :cond_0
    iget v7, v8, Lcom/google/android/gms/internal/ads/zzsz;->zzr:F

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zziq;->zzS()[Lcom/google/android/gms/internal/ads/zzam;

    move-result-object v9

    invoke-virtual {v8, v7, v2, v9}, Lcom/google/android/gms/internal/ads/zzsz;->zzY(FLcom/google/android/gms/internal/ads/zzam;[Lcom/google/android/gms/internal/ads/zzam;)F

    move-result v7

    :goto_0
    iget v9, v8, Lcom/google/android/gms/internal/ads/zzsz;->zze:F

    cmpg-float v9, v7, v9

    if-gtz v9, :cond_1

    const/high16 v7, -0x40800000    # -1.0f

    :cond_1
    invoke-virtual {v8, v2}, Lcom/google/android/gms/internal/ads/zzsz;->zzaA(Lcom/google/android/gms/internal/ads/zzam;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zziq;->zzh()Lcom/google/android/gms/internal/ads/zzel;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v9

    const/4 v11, 0x0

    invoke-virtual {v8, v0, v2, v11, v7}, Lcom/google/android/gms/internal/ads/zzsz;->zzae(Lcom/google/android/gms/internal/ads/zzsv;Lcom/google/android/gms/internal/ads/zzam;Landroid/media/MediaCrypto;F)Lcom/google/android/gms/internal/ads/zzsp;

    move-result-object v12

    const/16 v13, 0x1f

    if-lt v4, v13, :cond_2

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zziq;->zzn()Lcom/google/android/gms/internal/ads/zzpb;

    move-result-object v14

    invoke-static {v12, v14}, Lcom/google/android/gms/internal/ads/zzsw;->zza(Lcom/google/android/gms/internal/ads/zzsp;Lcom/google/android/gms/internal/ads/zzpb;)V

    :cond_2
    :try_start_0
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    const/4 v14, 0x0

    const/4 v15, 0x1

    if-lt v4, v6, :cond_3

    if-lt v4, v13, :cond_3

    iget-object v1, v12, Lcom/google/android/gms/internal/ads/zzsp;->zzc:Lcom/google/android/gms/internal/ads/zzam;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzam;->zzm:Ljava/lang/String;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzcb;->zzb(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzfy;->zzB(I)Ljava/lang/String;

    move-result-object v4

    const-string v11, "Creating an asynchronous MediaCodec adapter for track type "

    invoke-virtual {v11, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v11, "DMCodecAdapterFactory"

    invoke-static {v11, v4}, Lcom/google/android/gms/internal/ads/zzff;->zze(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v4, Lcom/google/android/gms/internal/ads/zzse;

    invoke-direct {v4, v1}, Lcom/google/android/gms/internal/ads/zzse;-><init>(I)V

    invoke-virtual {v4, v15}, Lcom/google/android/gms/internal/ads/zzse;->zzd(Z)V

    invoke-virtual {v4, v12}, Lcom/google/android/gms/internal/ads/zzse;->zzc(Lcom/google/android/gms/internal/ads/zzsp;)Lcom/google/android/gms/internal/ads/zzsg;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_3
    :try_start_1
    iget-object v4, v12, Lcom/google/android/gms/internal/ads/zzsp;->zza:Lcom/google/android/gms/internal/ads/zzsv;

    iget-object v4, v4, Lcom/google/android/gms/internal/ads/zzsv;->zza:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    invoke-static {v4}, Landroid/media/MediaCodec;->createByCodecName(Ljava/lang/String;)Landroid/media/MediaCodec;

    move-result-object v1

    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    const-string v4, "configureCodec"

    invoke-static {v4}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    iget-object v4, v12, Lcom/google/android/gms/internal/ads/zzsp;->zzb:Landroid/media/MediaFormat;

    iget-object v13, v12, Lcom/google/android/gms/internal/ads/zzsp;->zzd:Landroid/view/Surface;

    invoke-virtual {v1, v4, v13, v11, v14}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    invoke-static {}, Landroid/os/Trace;->endSection()V

    const-string v4, "startCodec"

    invoke-static {v4}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/media/MediaCodec;->start()V

    invoke-static {}, Landroid/os/Trace;->endSection()V

    new-instance v4, Lcom/google/android/gms/internal/ads/zztp;

    invoke-direct {v4, v1, v11}, Lcom/google/android/gms/internal/ads/zztp;-><init>(Landroid/media/MediaCodec;Lcom/google/android/gms/internal/ads/zzto;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object v1, v4

    :goto_1
    :try_start_3
    iput-object v1, v8, Lcom/google/android/gms/internal/ads/zzsz;->zzs:Lcom/google/android/gms/internal/ads/zzsr;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zziq;->zzh()Lcom/google/android/gms/internal/ads/zzel;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v16

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzsv;->zze(Lcom/google/android/gms/internal/ads/zzam;)Z

    move-result v1

    const/4 v4, 0x2

    if-nez v1, :cond_29

    new-array v1, v4, [Ljava/lang/Object;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "id="

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v13, v2, Lcom/google/android/gms/internal/ads/zzam;->zzb:Ljava/lang/String;

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, ", mimeType="

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v13, v2, Lcom/google/android/gms/internal/ads/zzam;->zzm:Ljava/lang/String;

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v13, v2, Lcom/google/android/gms/internal/ads/zzam;->zzl:Ljava/lang/String;

    if-eqz v13, :cond_4

    const-string v13, ", container="

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v13, v2, Lcom/google/android/gms/internal/ads/zzam;->zzl:Ljava/lang/String;

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    iget v13, v2, Lcom/google/android/gms/internal/ads/zzam;->zzi:I

    const/4 v6, -0x1

    if-eq v13, v6, :cond_5

    const-string v13, ", bitrate="

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v13, v2, Lcom/google/android/gms/internal/ads/zzam;->zzi:I

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_5
    iget-object v13, v2, Lcom/google/android/gms/internal/ads/zzam;->zzj:Ljava/lang/String;

    if-eqz v13, :cond_6

    const-string v13, ", codecs="

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v13, v2, Lcom/google/android/gms/internal/ads/zzam;->zzj:Ljava/lang/String;

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    iget-object v13, v2, Lcom/google/android/gms/internal/ads/zzam;->zzp:Lcom/google/android/gms/internal/ads/zzae;

    const-string v15, ","

    if-eqz v13, :cond_d

    new-instance v13, Ljava/util/LinkedHashSet;

    invoke-direct {v13}, Ljava/util/LinkedHashSet;-><init>()V

    :goto_2
    iget-object v4, v2, Lcom/google/android/gms/internal/ads/zzam;->zzp:Lcom/google/android/gms/internal/ads/zzae;

    iget v5, v4, Lcom/google/android/gms/internal/ads/zzae;->zzb:I

    if-ge v14, v5, :cond_c

    invoke-virtual {v4, v14}, Lcom/google/android/gms/internal/ads/zzae;->zza(I)Lcom/google/android/gms/internal/ads/zzad;

    move-result-object v4

    iget-object v4, v4, Lcom/google/android/gms/internal/ads/zzad;->zza:Ljava/util/UUID;

    sget-object v5, Lcom/google/android/gms/internal/ads/zzo;->zzb:Ljava/util/UUID;

    invoke-virtual {v4, v5}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    const-string v4, "cenc"

    :goto_3
    invoke-interface {v13, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_7
    sget-object v5, Lcom/google/android/gms/internal/ads/zzo;->zzc:Ljava/util/UUID;

    invoke-virtual {v4, v5}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    const-string v4, "clearkey"

    goto :goto_3

    :cond_8
    sget-object v5, Lcom/google/android/gms/internal/ads/zzo;->zze:Ljava/util/UUID;

    invoke-virtual {v4, v5}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    const-string v4, "playready"

    goto :goto_3

    :cond_9
    sget-object v5, Lcom/google/android/gms/internal/ads/zzo;->zzd:Ljava/util/UUID;

    invoke-virtual {v4, v5}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    const-string v4, "widevine"

    goto :goto_3

    :cond_a
    sget-object v5, Lcom/google/android/gms/internal/ads/zzo;->zza:Ljava/util/UUID;

    invoke-virtual {v4, v5}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_b

    const-string v4, "universal"

    goto :goto_3

    :cond_b
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "unknown ("

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ")"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_3

    :goto_4
    add-int/lit8 v14, v14, 0x1

    const/4 v6, -0x1

    goto :goto_2

    :cond_c
    const-string v4, ", drm=["

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v11, v13, v15}, Lcom/google/android/gms/internal/ads/zzfwt;->zzb(Ljava/lang/StringBuilder;Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0x5d

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_d
    iget v4, v2, Lcom/google/android/gms/internal/ads/zzam;->zzr:I

    const/4 v5, -0x1

    if-eq v4, v5, :cond_e

    iget v4, v2, Lcom/google/android/gms/internal/ads/zzam;->zzs:I

    if-eq v4, v5, :cond_e

    const-string v4, ", res="

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v2, Lcom/google/android/gms/internal/ads/zzam;->zzr:I

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "x"

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v2, Lcom/google/android/gms/internal/ads/zzam;->zzs:I

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_e
    iget-object v4, v2, Lcom/google/android/gms/internal/ads/zzam;->zzy:Lcom/google/android/gms/internal/ads/zzt;

    if-eqz v4, :cond_10

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzt;->zze()Z

    move-result v5

    if-nez v5, :cond_f

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzt;->zzf()Z

    move-result v4

    if-eqz v4, :cond_10

    :cond_f
    const-string v4, ", color="

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v2, Lcom/google/android/gms/internal/ads/zzam;->zzy:Lcom/google/android/gms/internal/ads/zzt;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzt;->zzd()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_10
    iget v4, v2, Lcom/google/android/gms/internal/ads/zzam;->zzt:F

    const/high16 v5, -0x40800000    # -1.0f

    cmpl-float v4, v4, v5

    if-eqz v4, :cond_11

    const-string v4, ", fps="

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v2, Lcom/google/android/gms/internal/ads/zzam;->zzt:F

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    :cond_11
    iget v4, v2, Lcom/google/android/gms/internal/ads/zzam;->zzz:I

    const/4 v5, -0x1

    if-eq v4, v5, :cond_12

    const-string v4, ", channels="

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v2, Lcom/google/android/gms/internal/ads/zzam;->zzz:I

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_12
    iget v4, v2, Lcom/google/android/gms/internal/ads/zzam;->zzA:I

    if-eq v4, v5, :cond_13

    const-string v4, ", sample_rate="

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v2, Lcom/google/android/gms/internal/ads/zzam;->zzA:I

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_13
    iget-object v4, v2, Lcom/google/android/gms/internal/ads/zzam;->zzd:Ljava/lang/String;

    if-eqz v4, :cond_14

    const-string v4, ", language="

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v2, Lcom/google/android/gms/internal/ads/zzam;->zzd:Ljava/lang/String;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_14
    iget-object v4, v2, Lcom/google/android/gms/internal/ads/zzam;->zzc:Ljava/lang/String;

    if-eqz v4, :cond_15

    const-string v4, ", label="

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v2, Lcom/google/android/gms/internal/ads/zzam;->zzc:Ljava/lang/String;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_15
    iget v4, v2, Lcom/google/android/gms/internal/ads/zzam;->zze:I

    const-string v5, "]"

    if-eqz v4, :cond_18

    const-string v4, ", selectionFlags=["

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v2, Lcom/google/android/gms/internal/ads/zzam;->zze:I

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    and-int/lit8 v13, v4, 0x1

    if-eqz v13, :cond_16

    const-string v13, "default"

    invoke-interface {v6, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_16
    const/4 v13, 0x2

    and-int/2addr v4, v13

    if-eqz v4, :cond_17

    const-string v4, "forced"

    invoke-interface {v6, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_17
    invoke-static {v11, v6, v15}, Lcom/google/android/gms/internal/ads/zzfwt;->zzb(Ljava/lang/StringBuilder;Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_18
    iget v4, v2, Lcom/google/android/gms/internal/ads/zzam;->zzf:I

    if-eqz v4, :cond_28

    const-string v4, ", roleFlags=["

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v2, Lcom/google/android/gms/internal/ads/zzam;->zzf:I

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    and-int/lit8 v13, v4, 0x1

    if-eqz v13, :cond_19

    const-string v13, "main"

    invoke-interface {v6, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_19
    and-int/lit8 v13, v4, 0x2

    if-eqz v13, :cond_1a

    const-string v13, "alt"

    invoke-interface {v6, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1a
    and-int/lit8 v13, v4, 0x4

    if-eqz v13, :cond_1b

    const-string v13, "supplementary"

    invoke-interface {v6, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1b
    and-int/lit8 v13, v4, 0x8

    if-eqz v13, :cond_1c

    const-string v13, "commentary"

    invoke-interface {v6, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1c
    and-int/lit8 v13, v4, 0x10

    if-eqz v13, :cond_1d

    const-string v13, "dub"

    invoke-interface {v6, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1d
    and-int/lit8 v13, v4, 0x20

    if-eqz v13, :cond_1e

    const-string v13, "emergency"

    invoke-interface {v6, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1e
    and-int/lit8 v13, v4, 0x40

    if-eqz v13, :cond_1f

    const-string v13, "caption"

    invoke-interface {v6, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1f
    and-int/lit16 v13, v4, 0x80

    if-eqz v13, :cond_20

    const-string v13, "subtitle"

    invoke-interface {v6, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_20
    and-int/lit16 v13, v4, 0x100

    if-eqz v13, :cond_21

    const-string v13, "sign"

    invoke-interface {v6, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_21
    and-int/lit16 v13, v4, 0x200

    if-eqz v13, :cond_22

    const-string v13, "describes-video"

    invoke-interface {v6, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_22
    and-int/lit16 v13, v4, 0x400

    if-eqz v13, :cond_23

    const-string v13, "describes-music"

    invoke-interface {v6, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_23
    and-int/lit16 v13, v4, 0x800

    if-eqz v13, :cond_24

    const-string v13, "enhanced-intelligibility"

    invoke-interface {v6, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_24
    and-int/lit16 v13, v4, 0x1000

    if-eqz v13, :cond_25

    const-string v13, "transcribes-dialog"

    invoke-interface {v6, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_25
    and-int/lit16 v13, v4, 0x2000

    if-eqz v13, :cond_26

    const-string v13, "easy-read"

    invoke-interface {v6, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_26
    and-int/lit16 v4, v4, 0x4000

    if-eqz v4, :cond_27

    const-string v4, "trick-play"

    invoke-interface {v6, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_27
    invoke-static {v11, v6, v15}, Lcom/google/android/gms/internal/ads/zzfwt;->zzb(Ljava/lang/StringBuilder;Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_28
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v13, 0x0

    aput-object v4, v1, v13

    const/4 v4, 0x1

    aput-object v3, v1, v4

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v5, "Format exceeds selected codec\'s capabilities [%s, %s]"

    invoke-static {v4, v5, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "MediaCodecRenderer"

    invoke-static {v4, v1}, Lcom/google/android/gms/internal/ads/zzff;->zzf(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    :cond_29
    move v13, v14

    :goto_5
    iput-object v0, v8, Lcom/google/android/gms/internal/ads/zzsz;->zzz:Lcom/google/android/gms/internal/ads/zzsv;

    iput v7, v8, Lcom/google/android/gms/internal/ads/zzsz;->zzw:F

    iput-object v2, v8, Lcom/google/android/gms/internal/ads/zzsz;->zzt:Lcom/google/android/gms/internal/ads/zzam;

    sget v1, Lcom/google/android/gms/internal/ads/zzfy;->zza:I

    const/16 v2, 0x19

    if-gt v1, v2, :cond_2b

    const-string v4, "OMX.Exynos.avc.dec.secure"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2b

    sget-object v4, Lcom/google/android/gms/internal/ads/zzfy;->zzd:Ljava/lang/String;

    const-string v5, "SM-T585"

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_2a

    const-string v5, "SM-A510"

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_2a

    const-string v5, "SM-A520"

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_2a

    const-string v5, "SM-J700"

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2b

    :cond_2a
    const/4 v4, 0x2

    goto :goto_6

    :cond_2b
    const/16 v4, 0x18

    if-ge v1, v4, :cond_2e

    const-string v4, "OMX.Nvidia.h264.decode"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2c

    const-string v4, "OMX.Nvidia.h264.decode.secure"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2e

    :cond_2c
    sget-object v4, Lcom/google/android/gms/internal/ads/zzfy;->zzb:Ljava/lang/String;

    const-string v5, "flounder"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2d

    const-string v5, "flounder_lte"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2d

    const-string v5, "grouper"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2d

    const-string v5, "tilapia"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2e

    :cond_2d
    const/4 v4, 0x1

    goto :goto_6

    :cond_2e
    move v4, v13

    :goto_6
    iput v4, v8, Lcom/google/android/gms/internal/ads/zzsz;->zzA:I

    iget-object v4, v8, Lcom/google/android/gms/internal/ads/zzsz;->zzt:Lcom/google/android/gms/internal/ads/zzam;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v4, 0x1d

    if-ne v1, v4, :cond_2f

    const-string v5, "c2.android.aac.decoder"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2f

    const/4 v5, 0x1

    goto :goto_7

    :cond_2f
    move v5, v13

    :goto_7
    iput-boolean v5, v8, Lcom/google/android/gms/internal/ads/zzsz;->zzB:Z

    const/16 v5, 0x17

    if-gt v1, v5, :cond_31

    const-string v5, "OMX.google.vorbis.decoder"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_30

    goto :goto_8

    :cond_30
    const/4 v5, 0x1

    goto :goto_9

    :cond_31
    :goto_8
    move v5, v13

    :goto_9
    iput-boolean v5, v8, Lcom/google/android/gms/internal/ads/zzsz;->zzC:Z

    const/16 v5, 0x15

    if-ne v1, v5, :cond_32

    const-string v5, "OMX.google.aac.decoder"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_32

    const/4 v5, 0x1

    goto :goto_a

    :cond_32
    move v5, v13

    :goto_a
    iput-boolean v5, v8, Lcom/google/android/gms/internal/ads/zzsz;->zzD:Z

    iget-object v5, v8, Lcom/google/android/gms/internal/ads/zzsz;->zzt:Lcom/google/android/gms/internal/ads/zzam;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzsv;->zza:Ljava/lang/String;

    if-gt v1, v2, :cond_34

    const-string v2, "OMX.rk.video_decoder.avc"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_33

    goto :goto_c

    :cond_33
    :goto_b
    const/4 v14, 0x1

    goto :goto_d

    :cond_34
    :goto_c
    if-gt v1, v4, :cond_35

    const-string v1, "OMX.broadcom.video_decoder.tunnel"

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_33

    const-string v1, "OMX.broadcom.video_decoder.tunnel.secure"

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_33

    const-string v1, "OMX.bcm.vdec.avc.tunnel"

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_33

    const-string v1, "OMX.bcm.vdec.avc.tunnel.secure"

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_33

    const-string v1, "OMX.bcm.vdec.hevc.tunnel"

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_33

    const-string v1, "OMX.bcm.vdec.hevc.tunnel.secure"

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_33

    :cond_35
    const-string v1, "Amazon"

    sget-object v2, Lcom/google/android/gms/internal/ads/zzfy;->zzc:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_36

    const-string v1, "AFTS"

    sget-object v2, Lcom/google/android/gms/internal/ads/zzfy;->zzd:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_36

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/zzsv;->zzf:Z

    if-eqz v0, :cond_36

    goto :goto_b

    :cond_36
    move v14, v13

    :goto_d
    iput-boolean v14, v8, Lcom/google/android/gms/internal/ads/zzsz;->zzG:Z

    iget-object v0, v8, Lcom/google/android/gms/internal/ads/zzsz;->zzs:Lcom/google/android/gms/internal/ads/zzsr;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zziq;->zzbf()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_37

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zziq;->zzh()Lcom/google/android/gms/internal/ads/zzel;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    const-wide/16 v4, 0x3e8

    add-long/2addr v0, v4

    iput-wide v0, v8, Lcom/google/android/gms/internal/ads/zzsz;->zzH:J

    :cond_37
    iget-object v0, v8, Lcom/google/android/gms/internal/ads/zzsz;->zza:Lcom/google/android/gms/internal/ads/zzir;

    iget v1, v0, Lcom/google/android/gms/internal/ads/zzir;->zza:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, v0, Lcom/google/android/gms/internal/ads/zzir;->zza:I

    sub-long v6, v16, v9

    move-object/from16 v1, p0

    move-object v2, v3

    move-object v3, v12

    move-wide/from16 v4, v16

    invoke-virtual/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/zzsz;->zzaj(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzsp;JJ)V

    return-void

    :catch_0
    move-exception v0

    goto :goto_e

    :catch_1
    move-exception v0

    :goto_e
    move-object v11, v1

    goto :goto_f

    :catch_2
    move-exception v0

    goto :goto_f

    :catch_3
    move-exception v0

    :goto_f
    if-eqz v11, :cond_38

    :try_start_4
    invoke-virtual {v11}, Landroid/media/MediaCodec;->release()V

    :cond_38
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catchall_0
    move-exception v0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0
.end method


# virtual methods
.method protected zzB()V
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzac()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzaB()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzag:Lcom/google/android/gms/internal/ads/zzrz;

    return-void

    :catchall_0
    move-exception v1

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzag:Lcom/google/android/gms/internal/ads/zzrz;

    throw v1
.end method

.method protected final zzE([Lcom/google/android/gms/internal/ads/zzam;JJLcom/google/android/gms/internal/ads/zzur;)V
    .locals 12

    move-object v0, p0

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzsz;->zzac:Lcom/google/android/gms/internal/ads/zzsy;

    iget-wide v1, v1, Lcom/google/android/gms/internal/ads/zzsy;->zzd:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/ads/zzsy;

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    move-object v5, v1

    move-wide v8, p2

    move-wide/from16 v10, p4

    invoke-direct/range {v5 .. v11}, Lcom/google/android/gms/internal/ads/zzsy;-><init>(JJJ)V

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/zzsz;->zzaN(Lcom/google/android/gms/internal/ads/zzsy;)V

    return-void

    :cond_0
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzsz;->zzk:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzsz;->zzX:J

    cmp-long v5, v1, v3

    if-eqz v5, :cond_1

    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzsz;->zzad:J

    cmp-long v7, v5, v3

    if-eqz v7, :cond_3

    cmp-long v1, v5, v1

    if-ltz v1, :cond_3

    :cond_1
    new-instance v1, Lcom/google/android/gms/internal/ads/zzsy;

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    move-object v5, v1

    move-wide v8, p2

    move-wide/from16 v10, p4

    invoke-direct/range {v5 .. v11}, Lcom/google/android/gms/internal/ads/zzsy;-><init>(JJJ)V

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/zzsz;->zzaN(Lcom/google/android/gms/internal/ads/zzsy;)V

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzsz;->zzac:Lcom/google/android/gms/internal/ads/zzsy;

    iget-wide v1, v1, Lcom/google/android/gms/internal/ads/zzsy;->zzd:J

    cmp-long v1, v1, v3

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzan()V

    :cond_2
    return-void

    :cond_3
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzsz;->zzk:Ljava/util/ArrayDeque;

    new-instance v9, Lcom/google/android/gms/internal/ads/zzsy;

    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/zzsz;->zzX:J

    move-object v2, v9

    move-wide v5, p2

    move-wide/from16 v7, p4

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/ads/zzsy;-><init>(JJJ)V

    invoke-virtual {v1, v9}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public zzL(FF)V
    .locals 0

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzr:F

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzt:Lcom/google/android/gms/internal/ads/zzam;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzsz;->zzaV(Lcom/google/android/gms/internal/ads/zzam;)Z

    return-void
.end method

.method public zzU(JJ)V
    .locals 23

    move-object/from16 v15, p0

    const/4 v14, 0x1

    const/4 v13, 0x0

    :try_start_0
    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzaa:Z

    if-eqz v0, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzao()V

    return-void

    :cond_0
    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzm:Lcom/google/android/gms/internal/ads/zzam;

    const/4 v11, 0x2

    if-nez v0, :cond_2

    invoke-direct {v15, v11}, Lcom/google/android/gms/internal/ads/zzsz;->zzaT(I)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    :goto_0
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzax()V

    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzN:Z

    if-eqz v0, :cond_15

    const-string v0, "bypassRender"

    sget v1, Lcom/google/android/gms/internal/ads/zzfy;->zza:I

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :cond_3
    :goto_1
    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzaa:Z

    xor-int/2addr v0, v14

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzek;->zzf(Z)V

    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzi:Lcom/google/android/gms/internal/ads/zzsn;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzsn;->zzp()Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzih;->zzc:Ljava/nio/ByteBuffer;

    iget v8, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzJ:I

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzsn;->zzl()I

    move-result v10

    iget-wide v11, v0, Lcom/google/android/gms/internal/ads/zzih;->zze:J

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zziq;->zzf()J

    move-result-wide v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzsn;->zzm()J

    move-result-wide v3

    invoke-direct {v15, v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzsz;->zzaS(JJ)Z

    move-result v0

    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzi:Lcom/google/android/gms/internal/ads/zzsn;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzib;->zzf()Z

    move-result v16

    iget-object v9, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzn:Lcom/google/android/gms/internal/ads/zzam;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_c

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v6, 0x0

    const/16 v17, 0x0

    move-object/from16 v1, p0

    move-wide/from16 v2, p1

    move-wide/from16 v4, p3

    move-object/from16 v18, v9

    move/from16 v9, v17

    move v13, v0

    move/from16 v14, v16

    move-object/from16 v15, v18

    :try_start_1
    invoke-virtual/range {v1 .. v15}, Lcom/google/android/gms/internal/ads/zzsz;->zzap(JJLcom/google/android/gms/internal/ads/zzsr;Ljava/nio/ByteBuffer;IIIJZZLcom/google/android/gms/internal/ads/zzam;)Z

    move-result v0
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    if-eqz v0, :cond_4

    move-object/from16 v15, p0

    :try_start_2
    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzi:Lcom/google/android/gms/internal/ads/zzsn;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzsn;->zzm()J

    move-result-wide v0

    invoke-virtual {v15, v0, v1}, Lcom/google/android/gms/internal/ads/zzsz;->zzay(J)V

    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzi:Lcom/google/android/gms/internal/ads/zzsn;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzib;->zzb()V

    goto :goto_2

    :cond_4
    move-object/from16 v15, p0

    const/4 v13, 0x0

    const/4 v14, 0x1

    goto/16 :goto_6

    :catch_0
    move-exception v0

    const/4 v2, 0x1

    const/16 v19, 0x0

    goto/16 :goto_11

    :cond_5
    :goto_2
    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzZ:Z
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_2

    const/4 v14, 0x1

    if-eqz v0, :cond_6

    :try_start_3
    iput-boolean v14, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzaa:Z

    const/4 v13, 0x0

    goto/16 :goto_6

    :cond_6
    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzO:Z

    if-eqz v0, :cond_7

    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzi:Lcom/google/android/gms/internal/ads/zzsn;

    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzh:Lcom/google/android/gms/internal/ads/zzih;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzsn;->zzo(Lcom/google/android/gms/internal/ads/zzih;)Z

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzek;->zzf(Z)V
    :try_end_3
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_1

    const/4 v13, 0x0

    :try_start_4
    iput-boolean v13, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzO:Z

    goto :goto_3

    :cond_7
    const/4 v13, 0x0

    :goto_3
    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzP:Z

    if-eqz v0, :cond_8

    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzi:Lcom/google/android/gms/internal/ads/zzsn;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzsn;->zzp()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzac()V

    iput-boolean v13, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzP:Z

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzax()V

    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzN:Z

    if-eqz v0, :cond_14

    :cond_8
    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzZ:Z

    xor-int/2addr v0, v14

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzek;->zzf(Z)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zziq;->zzbi()Lcom/google/android/gms/internal/ads/zzlb;

    move-result-object v0

    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzh:Lcom/google/android/gms/internal/ads/zzih;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzib;->zzb()V

    :cond_9
    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzh:Lcom/google/android/gms/internal/ads/zzih;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzib;->zzb()V

    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzh:Lcom/google/android/gms/internal/ads/zzih;

    invoke-virtual {v15, v0, v1, v13}, Lcom/google/android/gms/internal/ads/zziq;->zzbg(Lcom/google/android/gms/internal/ads/zzlb;Lcom/google/android/gms/internal/ads/zzih;I)I

    move-result v1

    const/4 v2, -0x5

    if-eq v1, v2, :cond_12

    const/4 v2, -0x4

    if-eq v1, v2, :cond_a

    goto/16 :goto_5

    :cond_a
    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzh:Lcom/google/android/gms/internal/ads/zzih;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzib;->zzf()Z

    move-result v1

    if-eqz v1, :cond_b

    iput-boolean v14, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzZ:Z

    goto/16 :goto_5

    :cond_b
    iget-boolean v1, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzab:Z
    :try_end_4
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_c

    const-string v2, "audio/opus"

    if-eqz v1, :cond_d

    :try_start_5
    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzm:Lcom/google/android/gms/internal/ads/zzam;
    :try_end_5
    .catch Ljava/lang/IllegalStateException; {:try_start_5 .. :try_end_5} :catch_c

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_6
    iput-object v1, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzn:Lcom/google/android/gms/internal/ads/zzam;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzam;->zzm:Ljava/lang/String;

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzn:Lcom/google/android/gms/internal/ads/zzam;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzam;->zzo:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_c

    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzn:Lcom/google/android/gms/internal/ads/zzam;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzam;->zzo:Ljava/util/List;

    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzadq;->zza([B)I

    move-result v1

    iget-object v3, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzn:Lcom/google/android/gms/internal/ads/zzam;
    :try_end_6
    .catch Ljava/lang/IllegalStateException; {:try_start_6 .. :try_end_6} :catch_c

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_7
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzam;->zzb()Lcom/google/android/gms/internal/ads/zzak;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/ads/zzak;->zzF(I)Lcom/google/android/gms/internal/ads/zzak;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzak;->zzac()Lcom/google/android/gms/internal/ads/zzam;

    move-result-object v1

    iput-object v1, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzn:Lcom/google/android/gms/internal/ads/zzam;

    :cond_c
    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzn:Lcom/google/android/gms/internal/ads/zzam;

    const/4 v3, 0x0

    invoke-virtual {v15, v1, v3}, Lcom/google/android/gms/internal/ads/zzsz;->zzal(Lcom/google/android/gms/internal/ads/zzam;Landroid/media/MediaFormat;)V

    iput-boolean v13, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzab:Z

    :cond_d
    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzh:Lcom/google/android/gms/internal/ads/zzih;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzih;->zzj()V

    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzn:Lcom/google/android/gms/internal/ads/zzam;

    if-eqz v1, :cond_f

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzam;->zzm:Ljava/lang/String;

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzh:Lcom/google/android/gms/internal/ads/zzih;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzib;->zze()Z

    move-result v2

    if-eqz v2, :cond_e

    iget-object v2, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzn:Lcom/google/android/gms/internal/ads/zzam;

    iput-object v2, v1, Lcom/google/android/gms/internal/ads/zzih;->zza:Lcom/google/android/gms/internal/ads/zzam;

    invoke-virtual {v15, v1}, Lcom/google/android/gms/internal/ads/zzsz;->zzah(Lcom/google/android/gms/internal/ads/zzih;)V

    :cond_e
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zziq;->zzf()J

    move-result-wide v1

    iget-object v3, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzh:Lcom/google/android/gms/internal/ads/zzih;

    iget-wide v4, v3, Lcom/google/android/gms/internal/ads/zzih;->zze:J

    invoke-static {v1, v2, v4, v5}, Lcom/google/android/gms/internal/ads/zzadq;->zzf(JJ)Z

    move-result v1

    if-eqz v1, :cond_f

    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzl:Lcom/google/android/gms/internal/ads/zzrk;

    iget-object v2, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzn:Lcom/google/android/gms/internal/ads/zzam;
    :try_end_7
    .catch Ljava/lang/IllegalStateException; {:try_start_7 .. :try_end_7} :catch_c

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_8
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzam;->zzo:Ljava/util/List;

    invoke-virtual {v1, v3, v2}, Lcom/google/android/gms/internal/ads/zzrk;->zza(Lcom/google/android/gms/internal/ads/zzih;Ljava/util/List;)V

    :cond_f
    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzi:Lcom/google/android/gms/internal/ads/zzsn;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzsn;->zzp()Z

    move-result v2

    if-nez v2, :cond_10

    goto :goto_4

    :cond_10
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zziq;->zzf()J

    move-result-wide v2

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzsn;->zzm()J

    move-result-wide v4

    invoke-direct {v15, v2, v3, v4, v5}, Lcom/google/android/gms/internal/ads/zzsz;->zzaS(JJ)Z

    move-result v1

    iget-object v4, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzh:Lcom/google/android/gms/internal/ads/zzih;

    iget-wide v4, v4, Lcom/google/android/gms/internal/ads/zzih;->zze:J

    invoke-direct {v15, v2, v3, v4, v5}, Lcom/google/android/gms/internal/ads/zzsz;->zzaS(JJ)Z

    move-result v2

    if-ne v1, v2, :cond_11

    :goto_4
    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzi:Lcom/google/android/gms/internal/ads/zzsn;

    iget-object v2, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzh:Lcom/google/android/gms/internal/ads/zzih;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzsn;->zzo(Lcom/google/android/gms/internal/ads/zzih;)Z

    move-result v1

    if-nez v1, :cond_9

    :cond_11
    iput-boolean v14, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzO:Z

    goto :goto_5

    :cond_12
    invoke-virtual {v15, v0}, Lcom/google/android/gms/internal/ads/zzsz;->zzab(Lcom/google/android/gms/internal/ads/zzlb;)Lcom/google/android/gms/internal/ads/zzis;

    :goto_5
    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzi:Lcom/google/android/gms/internal/ads/zzsn;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzsn;->zzp()Z

    move-result v1

    if-eqz v1, :cond_13

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzih;->zzj()V

    :cond_13
    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzi:Lcom/google/android/gms/internal/ads/zzsn;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzsn;->zzp()Z

    move-result v0

    if-nez v0, :cond_3

    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzZ:Z

    if-nez v0, :cond_3

    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzP:Z

    if-eqz v0, :cond_14

    goto/16 :goto_1

    :cond_14
    :goto_6
    invoke-static {}, Landroid/os/Trace;->endSection()V

    move/from16 v19, v13

    move v2, v14

    move-object v1, v15

    goto/16 :goto_15

    :catch_1
    move-exception v0

    move v2, v14

    move-object v1, v15

    goto :goto_7

    :catch_2
    move-exception v0

    move-object v1, v15

    const/4 v2, 0x1

    :goto_7
    const/16 v19, 0x0

    goto/16 :goto_17

    :cond_15
    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzs:Lcom/google/android/gms/internal/ads/zzsr;
    :try_end_8
    .catch Ljava/lang/IllegalStateException; {:try_start_8 .. :try_end_8} :catch_c

    if-eqz v0, :cond_2b

    :try_start_9
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zziq;->zzh()Lcom/google/android/gms/internal/ads/zzel;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v9

    const-string v0, "drainAndFeed"

    sget v1, Lcom/google/android/gms/internal/ads/zzfy;->zza:I

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :goto_8
    iget-object v6, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzs:Lcom/google/android/gms/internal/ads/zzsr;
    :try_end_9
    .catch Ljava/lang/IllegalStateException; {:try_start_9 .. :try_end_9} :catch_9

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_a
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzaR()Z

    move-result v0
    :try_end_a
    .catch Ljava/lang/IllegalStateException; {:try_start_a .. :try_end_a} :catch_9

    if-nez v0, :cond_23

    :try_start_b
    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzD:Z

    if-eqz v0, :cond_16

    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzV:Z
    :try_end_b
    .catch Ljava/lang/IllegalStateException; {:try_start_b .. :try_end_b} :catch_c

    if-eqz v0, :cond_16

    :try_start_c
    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzj:Landroid/media/MediaCodec$BufferInfo;

    invoke-interface {v6, v0}, Lcom/google/android/gms/internal/ads/zzsr;->zzb(Landroid/media/MediaCodec$BufferInfo;)I

    move-result v0
    :try_end_c
    .catch Ljava/lang/IllegalStateException; {:try_start_c .. :try_end_c} :catch_3

    goto :goto_9

    :catch_3
    :try_start_d
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzaK()V

    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzaa:Z

    if-eqz v0, :cond_1a

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzaB()V

    goto :goto_b

    :cond_16
    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzj:Landroid/media/MediaCodec$BufferInfo;

    invoke-interface {v6, v0}, Lcom/google/android/gms/internal/ads/zzsr;->zzb(Landroid/media/MediaCodec$BufferInfo;)I

    move-result v0

    :goto_9
    if-gez v0, :cond_1b

    const/4 v1, -0x2

    if-ne v0, v1, :cond_18

    iput-boolean v14, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzW:Z

    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzs:Lcom/google/android/gms/internal/ads/zzsr;
    :try_end_d
    .catch Ljava/lang/IllegalStateException; {:try_start_d .. :try_end_d} :catch_c

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_e
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzsr;->zzc()Landroid/media/MediaFormat;

    move-result-object v0

    iget v1, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzA:I

    if-eqz v1, :cond_17

    const-string v1, "width"

    invoke-virtual {v0, v1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v1

    const/16 v2, 0x20

    if-ne v1, v2, :cond_17

    const-string v1, "height"

    invoke-virtual {v0, v1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v1

    if-ne v1, v2, :cond_17

    iput-boolean v14, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzF:Z

    goto :goto_c

    :cond_17
    iput-object v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzu:Landroid/media/MediaFormat;

    iput-boolean v14, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzv:Z

    goto :goto_c

    :cond_18
    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzG:Z

    if-eqz v0, :cond_1a

    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzZ:Z

    if-nez v0, :cond_19

    iget v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzS:I

    if-ne v0, v11, :cond_1a

    :cond_19
    :goto_a
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzaK()V

    :cond_1a
    :goto_b
    move-wide v2, v9

    move/from16 v19, v13

    move-object v1, v15

    goto/16 :goto_14

    :cond_1b
    iget-boolean v1, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzF:Z

    if-eqz v1, :cond_1c

    iput-boolean v13, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzF:Z

    invoke-interface {v6, v0, v13}, Lcom/google/android/gms/internal/ads/zzsr;->zzn(IZ)V

    :goto_c
    move-wide v2, v9

    move/from16 v16, v11

    move/from16 v19, v13

    move-object v1, v15

    goto/16 :goto_13

    :cond_1c
    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzj:Landroid/media/MediaCodec$BufferInfo;

    iget v2, v1, Landroid/media/MediaCodec$BufferInfo;->size:I

    if-nez v2, :cond_1d

    iget v1, v1, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v1, v1, 0x4

    if-eqz v1, :cond_1d

    goto :goto_a

    :cond_1d
    iput v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzJ:I

    invoke-interface {v6, v0}, Lcom/google/android/gms/internal/ads/zzsr;->zzg(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzK:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_1e

    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzj:Landroid/media/MediaCodec$BufferInfo;

    iget v1, v1, Landroid/media/MediaCodec$BufferInfo;->offset:I

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzK:Ljava/nio/ByteBuffer;

    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzj:Landroid/media/MediaCodec$BufferInfo;

    iget v2, v1, Landroid/media/MediaCodec$BufferInfo;->offset:I

    iget v1, v1, Landroid/media/MediaCodec$BufferInfo;->size:I

    add-int/2addr v2, v1

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    :cond_1e
    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzj:Landroid/media/MediaCodec$BufferInfo;

    iget-wide v0, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zziq;->zzf()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_1f

    move v0, v14

    goto :goto_d

    :cond_1f
    move v0, v13

    :goto_d
    iput-boolean v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzL:Z

    iget-wide v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzY:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v0, v2

    if-eqz v2, :cond_20

    iget-object v2, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzj:Landroid/media/MediaCodec$BufferInfo;

    iget-wide v2, v2, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    cmp-long v0, v0, v2

    if-gtz v0, :cond_20

    move v0, v14

    goto :goto_e

    :cond_20
    move v0, v13

    :goto_e
    iput-boolean v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzM:Z

    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzj:Landroid/media/MediaCodec$BufferInfo;

    iget-wide v0, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iget-object v2, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzac:Lcom/google/android/gms/internal/ads/zzsy;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzsy;->zze:Lcom/google/android/gms/internal/ads/zzfv;

    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/internal/ads/zzfv;->zzc(J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzam;

    if-nez v0, :cond_21

    iget-boolean v1, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzae:Z

    if-eqz v1, :cond_21

    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzu:Landroid/media/MediaFormat;

    if-eqz v1, :cond_21

    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzac:Lcom/google/android/gms/internal/ads/zzsy;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzsy;->zze:Lcom/google/android/gms/internal/ads/zzfv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfv;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzam;

    :cond_21
    if-eqz v0, :cond_22

    iput-object v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzn:Lcom/google/android/gms/internal/ads/zzam;

    goto :goto_f

    :cond_22
    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzv:Z

    if-eqz v0, :cond_23

    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzn:Lcom/google/android/gms/internal/ads/zzam;

    if-eqz v0, :cond_23

    :goto_f
    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzn:Lcom/google/android/gms/internal/ads/zzam;
    :try_end_e
    .catch Ljava/lang/IllegalStateException; {:try_start_e .. :try_end_e} :catch_c

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_f
    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzu:Landroid/media/MediaFormat;

    invoke-virtual {v15, v0, v1}, Lcom/google/android/gms/internal/ads/zzsz;->zzal(Lcom/google/android/gms/internal/ads/zzam;Landroid/media/MediaFormat;)V

    iput-boolean v13, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzv:Z

    iput-boolean v13, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzae:Z
    :try_end_f
    .catch Ljava/lang/IllegalStateException; {:try_start_f .. :try_end_f} :catch_c

    :cond_23
    :try_start_10
    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzD:Z
    :try_end_10
    .catch Ljava/lang/IllegalStateException; {:try_start_10 .. :try_end_10} :catch_9

    if-eqz v0, :cond_25

    :try_start_11
    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzV:Z
    :try_end_11
    .catch Ljava/lang/IllegalStateException; {:try_start_11 .. :try_end_11} :catch_c

    if-eqz v0, :cond_25

    :try_start_12
    iget-object v7, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzK:Ljava/nio/ByteBuffer;

    iget v8, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzJ:I

    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzj:Landroid/media/MediaCodec$BufferInfo;

    iget v12, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    iget-wide v4, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzL:Z

    iget-boolean v2, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzM:Z

    iget-object v3, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzn:Lcom/google/android/gms/internal/ads/zzam;
    :try_end_12
    .catch Ljava/lang/IllegalStateException; {:try_start_12 .. :try_end_12} :catch_4

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v16, 0x1

    move-object/from16 v1, p0

    move/from16 v17, v2

    move-object/from16 v18, v3

    move-wide/from16 v2, p1

    move-wide/from16 v19, v4

    move-wide/from16 v4, p3

    move-wide/from16 v21, v9

    move v9, v12

    move/from16 v10, v16

    move/from16 v16, v11

    move-wide/from16 v11, v19

    move/from16 v19, v13

    move v13, v0

    move/from16 v14, v17

    move-object/from16 v15, v18

    :try_start_13
    invoke-virtual/range {v1 .. v15}, Lcom/google/android/gms/internal/ads/zzsz;->zzap(JJLcom/google/android/gms/internal/ads/zzsr;Ljava/nio/ByteBuffer;IIIJZZLcom/google/android/gms/internal/ads/zzam;)Z

    move-result v0
    :try_end_13
    .catch Ljava/lang/IllegalStateException; {:try_start_13 .. :try_end_13} :catch_5

    goto :goto_12

    :catch_4
    move-wide/from16 v21, v9

    move/from16 v19, v13

    :catch_5
    :try_start_14
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzaK()V
    :try_end_14
    .catch Ljava/lang/IllegalStateException; {:try_start_14 .. :try_end_14} :catch_6

    move-object/from16 v15, p0

    :try_start_15
    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzaa:Z

    if-eqz v0, :cond_24

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzaB()V

    :cond_24
    move-object v1, v15

    :goto_10
    move-wide/from16 v2, v21

    goto :goto_14

    :catch_6
    move-exception v0

    const/4 v2, 0x1

    :goto_11
    move-object/from16 v1, p0

    goto/16 :goto_17

    :cond_25
    move-wide/from16 v21, v9

    move/from16 v16, v11

    move/from16 v19, v13

    iget-object v7, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzK:Ljava/nio/ByteBuffer;

    iget v8, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzJ:I

    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzj:Landroid/media/MediaCodec$BufferInfo;

    iget v9, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    iget-wide v11, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iget-boolean v13, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzL:Z

    iget-boolean v14, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzM:Z

    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zzsz;->zzn:Lcom/google/android/gms/internal/ads/zzam;
    :try_end_15
    .catch Ljava/lang/IllegalStateException; {:try_start_15 .. :try_end_15} :catch_8

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v10, 0x1

    move-object/from16 v1, p0

    move-wide/from16 v2, p1

    move-wide/from16 v4, p3

    move-object v15, v0

    :try_start_16
    invoke-virtual/range {v1 .. v15}, Lcom/google/android/gms/internal/ads/zzsz;->zzap(JJLcom/google/android/gms/internal/ads/zzsr;Ljava/nio/ByteBuffer;IIIJZZLcom/google/android/gms/internal/ads/zzam;)Z

    move-result v0
    :try_end_16
    .catch Ljava/lang/IllegalStateException; {:try_start_16 .. :try_end_16} :catch_7

    :goto_12
    if-eqz v0, :cond_28

    move-object/from16 v1, p0

    :try_start_17
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzsz;->zzj:Landroid/media/MediaCodec$BufferInfo;

    iget-wide v2, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzsz;->zzay(J)V

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzsz;->zzj:Landroid/media/MediaCodec$BufferInfo;

    iget v0, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v0, v0, 0x4

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzaM()V

    if-eqz v0, :cond_26

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzaK()V

    goto :goto_10

    :cond_26
    move-wide/from16 v2, v21

    :goto_13
    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzsz;->zzaU(J)Z

    move-result v0

    if-nez v0, :cond_27

    goto :goto_14

    :cond_27
    move-object v15, v1

    move-wide v9, v2

    move/from16 v11, v16

    move/from16 v13, v19

    const/4 v14, 0x1

    goto/16 :goto_8

    :cond_28
    move-object/from16 v1, p0

    goto :goto_10

    :cond_29
    :goto_14
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzaQ()Z

    move-result v0

    if-eqz v0, :cond_2a

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzsz;->zzaU(J)Z

    move-result v0

    if-nez v0, :cond_29

    :cond_2a
    invoke-static {}, Landroid/os/Trace;->endSection()V

    const/4 v2, 0x1

    goto :goto_15

    :catch_7
    move-exception v0

    move-object/from16 v1, p0

    goto :goto_16

    :catch_8
    move-exception v0

    move-object v1, v15

    goto :goto_16

    :catch_9
    move-exception v0

    move/from16 v19, v13

    move-object v1, v15

    move v2, v14

    goto :goto_17

    :cond_2b
    move/from16 v19, v13

    move-object v1, v15

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzsz;->zza:Lcom/google/android/gms/internal/ads/zzir;

    iget v2, v0, Lcom/google/android/gms/internal/ads/zzir;->zzd:I

    invoke-virtual/range {p0 .. p2}, Lcom/google/android/gms/internal/ads/zziq;->zzd(J)I

    move-result v3

    add-int/2addr v2, v3

    iput v2, v0, Lcom/google/android/gms/internal/ads/zzir;->zzd:I
    :try_end_17
    .catch Ljava/lang/IllegalStateException; {:try_start_17 .. :try_end_17} :catch_b

    const/4 v2, 0x1

    :try_start_18
    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/zzsz;->zzaT(I)Z

    :goto_15
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzsz;->zza:Lcom/google/android/gms/internal/ads/zzir;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzir;->zza()V
    :try_end_18
    .catch Ljava/lang/IllegalStateException; {:try_start_18 .. :try_end_18} :catch_a

    return-void

    :catch_a
    move-exception v0

    goto :goto_17

    :catch_b
    move-exception v0

    :goto_16
    const/4 v2, 0x1

    goto :goto_17

    :catch_c
    move-exception v0

    move/from16 v19, v13

    move v2, v14

    move-object v1, v15

    :goto_17
    sget v3, Lcom/google/android/gms/internal/ads/zzfy;->zza:I

    instance-of v3, v0, Landroid/media/MediaCodec$CodecException;

    if-eqz v3, :cond_2c

    goto :goto_18

    :cond_2c
    invoke-virtual {v0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v4

    array-length v5, v4

    if-lez v5, :cond_2f

    aget-object v4, v4, v19

    invoke-virtual {v4}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "android.media.MediaCodec"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2f

    :goto_18
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzsz;->zzai(Ljava/lang/Exception;)V

    if-eqz v3, :cond_2d

    move-object v3, v0

    check-cast v3, Landroid/media/MediaCodec$CodecException;

    invoke-virtual {v3}, Landroid/media/MediaCodec$CodecException;->isRecoverable()Z

    move-result v3

    if-eqz v3, :cond_2d

    move v14, v2

    goto :goto_19

    :cond_2d
    move/from16 v14, v19

    :goto_19
    if-eqz v14, :cond_2e

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzaB()V

    :cond_2e
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzsz;->zzz:Lcom/google/android/gms/internal/ads/zzsv;

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ads/zzsz;->zzav(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzsv;)Lcom/google/android/gms/internal/ads/zzst;

    move-result-object v0

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzsz;->zzm:Lcom/google/android/gms/internal/ads/zzam;

    const/16 v3, 0xfa3

    invoke-virtual {v1, v0, v2, v14, v3}, Lcom/google/android/gms/internal/ads/zziq;->zzi(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzam;ZI)Lcom/google/android/gms/internal/ads/zziz;

    move-result-object v0

    throw v0

    :cond_2f
    throw v0
.end method

.method public zzV()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzaa:Z

    return v0
.end method

.method public zzW()Z
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzm:Lcom/google/android/gms/internal/ads/zzam;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zziq;->zzR()Z

    move-result v0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzaR()Z

    move-result v0

    if-nez v0, :cond_1

    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzH:J

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v3, v5

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zziq;->zzh()Lcom/google/android/gms/internal/ads/zzel;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    iget-wide v5, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzH:J

    cmp-long v0, v3, v5

    if-ltz v0, :cond_0

    goto :goto_0

    :cond_0
    return v2

    :cond_1
    move v1, v2

    :cond_2
    :goto_0
    return v1
.end method

.method public final zzX(Lcom/google/android/gms/internal/ads/zzam;)I
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzd:Lcom/google/android/gms/internal/ads/zztb;

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/ads/zzsz;->zzZ(Lcom/google/android/gms/internal/ads/zztb;Lcom/google/android/gms/internal/ads/zzam;)I

    move-result p1
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzth; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception v0

    const/4 v1, 0x0

    const/16 v2, 0xfa2

    invoke-virtual {p0, v0, p1, v1, v2}, Lcom/google/android/gms/internal/ads/zziq;->zzi(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzam;ZI)Lcom/google/android/gms/internal/ads/zziz;

    move-result-object p1

    throw p1
.end method

.method protected zzY(FLcom/google/android/gms/internal/ads/zzam;[Lcom/google/android/gms/internal/ads/zzam;)F
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method protected abstract zzZ(Lcom/google/android/gms/internal/ads/zztb;Lcom/google/android/gms/internal/ads/zzam;)I
.end method

.method protected zzaA(Lcom/google/android/gms/internal/ads/zzam;)V
    .locals 0

    return-void
.end method

.method protected final zzaB()V
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzs:Lcom/google/android/gms/internal/ads/zzsr;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzsr;->zzl()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zza:Lcom/google/android/gms/internal/ads/zzir;

    iget v2, v1, Lcom/google/android/gms/internal/ads/zzir;->zzb:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v1, Lcom/google/android/gms/internal/ads/zzir;->zzb:I

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzz:Lcom/google/android/gms/internal/ads/zzsv;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_1
    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzsv;->zza:Ljava/lang/String;

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ads/zzsz;->zzak(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_0
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzs:Lcom/google/android/gms/internal/ads/zzsr;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzo:Landroid/media/MediaCrypto;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzaf:Lcom/google/android/gms/internal/ads/zzrz;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzaD()V

    return-void

    :catchall_0
    move-exception v1

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzs:Lcom/google/android/gms/internal/ads/zzsr;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzo:Landroid/media/MediaCrypto;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzaf:Lcom/google/android/gms/internal/ads/zzrz;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzaD()V

    throw v1
.end method

.method protected zzaC()V
    .locals 3

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzaL()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzaM()V

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzH:J

    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzV:Z

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzU:Z

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzE:Z

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzF:Z

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzL:Z

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzM:Z

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzX:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzY:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzad:J

    iput v2, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzS:I

    iput v2, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzT:I

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzQ:Z

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzR:I

    return-void
.end method

.method protected final zzaD()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzaC()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzx:Ljava/util/ArrayDeque;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzz:Lcom/google/android/gms/internal/ads/zzsv;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzt:Lcom/google/android/gms/internal/ads/zzam;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzu:Landroid/media/MediaFormat;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzv:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzW:Z

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzw:F

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzA:I

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzB:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzC:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzD:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzG:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzQ:Z

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzR:I

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzp:Z

    return-void
.end method

.method protected final zzaE()Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzaF()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzax()V

    :cond_0
    return v0
.end method

.method protected final zzaF()Z
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzs:Lcom/google/android/gms/internal/ads/zzsr;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzT:I

    const/4 v2, 0x3

    const/4 v3, 0x1

    if-eq v0, v2, :cond_5

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzB:Z

    if-eqz v2, :cond_1

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzW:Z

    if-eqz v2, :cond_5

    :cond_1
    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzC:Z

    if-eqz v2, :cond_2

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzV:Z

    if-nez v2, :cond_5

    :cond_2
    const/4 v2, 0x2

    if-ne v0, v2, :cond_4

    sget v0, Lcom/google/android/gms/internal/ads/zzfy;->zza:I

    const/16 v2, 0x17

    if-lt v0, v2, :cond_3

    move v4, v3

    goto :goto_0

    :cond_3
    move v4, v1

    :goto_0
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzek;->zzf(Z)V

    if-lt v0, v2, :cond_4

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzaO()V
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zziz; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    const-string v1, "MediaCodecRenderer"

    const-string v2, "Failed to update the DRM session, releasing the codec instead."

    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/ads/zzff;->zzg(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzaB()V

    return v3

    :cond_4
    :goto_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzag()V

    return v1

    :cond_5
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzaB()V

    return v3
.end method

.method protected final zzaG()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzN:Z

    return v0
.end method

.method protected final zzaH(Lcom/google/android/gms/internal/ads/zzam;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzag:Lcom/google/android/gms/internal/ads/zzrz;

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzsz;->zzaq(Lcom/google/android/gms/internal/ads/zzam;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method protected zzaI(Lcom/google/android/gms/internal/ads/zzsv;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method protected zzaa(Lcom/google/android/gms/internal/ads/zzsv;Lcom/google/android/gms/internal/ads/zzam;Lcom/google/android/gms/internal/ads/zzam;)Lcom/google/android/gms/internal/ads/zzis;
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method protected zzab(Lcom/google/android/gms/internal/ads/zzlb;)Lcom/google/android/gms/internal/ads/zzis;
    .locals 11

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzab:Z

    iget-object v4, p1, Lcom/google/android/gms/internal/ads/zzlb;->zza:Lcom/google/android/gms/internal/ads/zzam;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v4, Lcom/google/android/gms/internal/ads/zzam;->zzm:Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz v1, :cond_13

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzlb;->zzb:Lcom/google/android/gms/internal/ads/zzrz;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzag:Lcom/google/android/gms/internal/ads/zzrz;

    iput-object v4, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzm:Lcom/google/android/gms/internal/ads/zzam;

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzN:Z

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzP:Z

    return-object v3

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzs:Lcom/google/android/gms/internal/ads/zzsr;

    if-nez v1, :cond_1

    iput-object v3, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzx:Ljava/util/ArrayDeque;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzax()V

    return-object v3

    :cond_1
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzz:Lcom/google/android/gms/internal/ads/zzsv;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzt:Lcom/google/android/gms/internal/ads/zzam;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzaf:Lcom/google/android/gms/internal/ads/zzrz;

    if-ne v6, p1, :cond_12

    if-eq p1, v6, :cond_2

    move p1, v0

    goto :goto_0

    :cond_2
    move p1, v2

    :goto_0
    if-eqz p1, :cond_4

    sget v6, Lcom/google/android/gms/internal/ads/zzfy;->zza:I

    const/16 v7, 0x17

    if-lt v6, v7, :cond_3

    goto :goto_1

    :cond_3
    move v6, v2

    goto :goto_2

    :cond_4
    :goto_1
    move v6, v0

    :goto_2
    invoke-static {v6}, Lcom/google/android/gms/internal/ads/zzek;->zzf(Z)V

    invoke-virtual {p0, v3, v5, v4}, Lcom/google/android/gms/internal/ads/zzsz;->zzaa(Lcom/google/android/gms/internal/ads/zzsv;Lcom/google/android/gms/internal/ads/zzam;Lcom/google/android/gms/internal/ads/zzam;)Lcom/google/android/gms/internal/ads/zzis;

    move-result-object v6

    iget v7, v6, Lcom/google/android/gms/internal/ads/zzis;->zzd:I

    const/4 v8, 0x3

    if-eqz v7, :cond_e

    const/16 v9, 0x10

    const/4 v10, 0x2

    if-eq v7, v0, :cond_a

    if-eq v7, v10, :cond_6

    invoke-direct {p0, v4}, Lcom/google/android/gms/internal/ads/zzsz;->zzaV(Lcom/google/android/gms/internal/ads/zzam;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_4

    :cond_5
    iput-object v4, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzt:Lcom/google/android/gms/internal/ads/zzam;

    if-eqz p1, :cond_f

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzaP()Z

    move-result p1

    if-nez p1, :cond_f

    goto :goto_6

    :cond_6
    invoke-direct {p0, v4}, Lcom/google/android/gms/internal/ads/zzsz;->zzaV(Lcom/google/android/gms/internal/ads/zzam;)Z

    move-result v7

    if-nez v7, :cond_7

    goto :goto_4

    :cond_7
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzQ:Z

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzR:I

    iget v7, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzA:I

    if-eq v7, v10, :cond_9

    if-ne v7, v0, :cond_8

    iget v7, v4, Lcom/google/android/gms/internal/ads/zzam;->zzr:I

    iget v9, v5, Lcom/google/android/gms/internal/ads/zzam;->zzr:I

    if-ne v7, v9, :cond_8

    iget v7, v4, Lcom/google/android/gms/internal/ads/zzam;->zzs:I

    iget v9, v5, Lcom/google/android/gms/internal/ads/zzam;->zzs:I

    if-ne v7, v9, :cond_8

    goto :goto_3

    :cond_8
    move v0, v2

    :cond_9
    :goto_3
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzE:Z

    iput-object v4, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzt:Lcom/google/android/gms/internal/ads/zzam;

    if-eqz p1, :cond_f

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzaP()Z

    move-result p1

    if-nez p1, :cond_f

    goto :goto_6

    :cond_a
    invoke-direct {p0, v4}, Lcom/google/android/gms/internal/ads/zzsz;->zzaV(Lcom/google/android/gms/internal/ads/zzam;)Z

    move-result v7

    if-nez v7, :cond_b

    :goto_4
    move v10, v9

    goto :goto_6

    :cond_b
    iput-object v4, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzt:Lcom/google/android/gms/internal/ads/zzam;

    if-eqz p1, :cond_c

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzaP()Z

    move-result p1

    if-nez p1, :cond_f

    goto :goto_6

    :cond_c
    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzU:Z

    if-eqz p1, :cond_f

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzS:I

    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzC:Z

    if-eqz p1, :cond_d

    iput v8, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzT:I

    goto :goto_6

    :cond_d
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzT:I

    goto :goto_5

    :cond_e
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzad()V

    :cond_f
    :goto_5
    move v10, v2

    :goto_6
    iget p1, v6, Lcom/google/android/gms/internal/ads/zzis;->zzd:I

    if-eqz p1, :cond_11

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzs:Lcom/google/android/gms/internal/ads/zzsr;

    if-ne p1, v1, :cond_10

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzT:I

    if-ne p1, v8, :cond_11

    :cond_10
    iget-object v2, v3, Lcom/google/android/gms/internal/ads/zzsv;->zza:Ljava/lang/String;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzis;

    const/4 v0, 0x0

    move-object v1, p1

    move-object v3, v5

    move v5, v0

    move v6, v10

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzis;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzam;Lcom/google/android/gms/internal/ads/zzam;II)V

    return-object p1

    :cond_11
    return-object v6

    :cond_12
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzad()V

    iget-object v2, v3, Lcom/google/android/gms/internal/ads/zzsv;->zza:Ljava/lang/String;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzis;

    const/4 v0, 0x0

    const/16 v6, 0x80

    move-object v1, p1

    move-object v3, v5

    move v5, v0

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzis;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzam;Lcom/google/android/gms/internal/ads/zzam;II)V

    return-object p1

    :cond_13
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Sample MIME type is null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    const/16 v0, 0xfa5

    invoke-virtual {p0, p1, v4, v2, v0}, Lcom/google/android/gms/internal/ads/zziq;->zzi(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzam;ZI)Lcom/google/android/gms/internal/ads/zziz;

    move-result-object p1

    throw p1
.end method

.method protected abstract zzae(Lcom/google/android/gms/internal/ads/zzsv;Lcom/google/android/gms/internal/ads/zzam;Landroid/media/MediaCrypto;F)Lcom/google/android/gms/internal/ads/zzsp;
.end method

.method protected abstract zzaf(Lcom/google/android/gms/internal/ads/zztb;Lcom/google/android/gms/internal/ads/zzam;Z)Ljava/util/List;
.end method

.method protected zzah(Lcom/google/android/gms/internal/ads/zzih;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method protected zzai(Ljava/lang/Exception;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method protected zzaj(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzsp;JJ)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method protected zzak(Ljava/lang/String;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method protected zzal(Lcom/google/android/gms/internal/ads/zzam;Landroid/media/MediaFormat;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method protected zzan()V
    .locals 0

    return-void
.end method

.method protected zzao()V
    .locals 0

    return-void
.end method

.method protected abstract zzap(JJLcom/google/android/gms/internal/ads/zzsr;Ljava/nio/ByteBuffer;IIIJZZLcom/google/android/gms/internal/ads/zzam;)Z
.end method

.method protected zzaq(Lcom/google/android/gms/internal/ads/zzam;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method protected zzar(Lcom/google/android/gms/internal/ads/zzih;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method protected final zzas()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzac:Lcom/google/android/gms/internal/ads/zzsy;

    iget-wide v0, v0, Lcom/google/android/gms/internal/ads/zzsy;->zzd:J

    return-wide v0
.end method

.method protected final zzat()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzac:Lcom/google/android/gms/internal/ads/zzsy;

    iget-wide v0, v0, Lcom/google/android/gms/internal/ads/zzsy;->zzc:J

    return-wide v0
.end method

.method protected final zzau()Lcom/google/android/gms/internal/ads/zzsr;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzs:Lcom/google/android/gms/internal/ads/zzsr;

    return-object v0
.end method

.method protected zzav(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzsv;)Lcom/google/android/gms/internal/ads/zzst;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzst;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzst;-><init>(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzsv;)V

    return-object v0
.end method

.method protected final zzaw()Lcom/google/android/gms/internal/ads/zzsv;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzz:Lcom/google/android/gms/internal/ads/zzsv;

    return-object v0
.end method

.method protected final zzax()V
    .locals 10

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzs:Lcom/google/android/gms/internal/ads/zzsr;

    if-nez v0, :cond_b

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzN:Z

    if-nez v0, :cond_b

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzm:Lcom/google/android/gms/internal/ads/zzam;

    if-nez v0, :cond_0

    goto/16 :goto_4

    :cond_0
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzsz;->zzaH(Lcom/google/android/gms/internal/ads/zzam;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzm:Lcom/google/android/gms/internal/ads/zzam;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzac()V

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzam;->zzm:Ljava/lang/String;

    const-string v2, "audio/mp4a-latm"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "audio/mpeg"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "audio/opus"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzi:Lcom/google/android/gms/internal/ads/zzsn;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzsn;->zzn(I)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzi:Lcom/google/android/gms/internal/ads/zzsn;

    const/16 v2, 0x20

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzsn;->zzn(I)V

    :goto_0
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzN:Z

    return-void

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzag:Lcom/google/android/gms/internal/ads/zzrz;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzaf:Lcom/google/android/gms/internal/ads/zzrz;

    if-eqz v0, :cond_3

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzek;->zzf(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzaf:Lcom/google/android/gms/internal/ads/zzrz;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzm:Lcom/google/android/gms/internal/ads/zzam;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-boolean v1, Lcom/google/android/gms/internal/ads/zzsa;->zza:Z

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzrz;->zza()Lcom/google/android/gms/internal/ads/zzrq;

    :cond_3
    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzm:Lcom/google/android/gms/internal/ads/zzam;
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzsx; {:try_start_0 .. :try_end_0} :catch_3

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_1
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzx:Ljava/util/ArrayDeque;
    :try_end_1
    .catch Lcom/google/android/gms/internal/ads/zzsx; {:try_start_1 .. :try_end_1} :catch_3

    const/4 v3, 0x0

    if-nez v2, :cond_5

    :try_start_2
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzd:Lcom/google/android/gms/internal/ads/zztb;

    invoke-virtual {p0, v2, v1, v0}, Lcom/google/android/gms/internal/ads/zzsz;->zzaf(Lcom/google/android/gms/internal/ads/zztb;Lcom/google/android/gms/internal/ads/zzam;Z)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    new-instance v4, Ljava/util/ArrayDeque;

    invoke-direct {v4}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v4, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzx:Ljava/util/ArrayDeque;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_4

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzx:Ljava/util/ArrayDeque;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/zzsv;

    invoke-virtual {v4, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    :cond_4
    iput-object v3, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzy:Lcom/google/android/gms/internal/ads/zzsx;
    :try_end_2
    .catch Lcom/google/android/gms/internal/ads/zzth; {:try_start_2 .. :try_end_2} :catch_0
    .catch Lcom/google/android/gms/internal/ads/zzsx; {:try_start_2 .. :try_end_2} :catch_3

    goto :goto_1

    :catch_0
    move-exception v2

    :try_start_3
    new-instance v3, Lcom/google/android/gms/internal/ads/zzsx;

    const v4, -0xc34e

    invoke-direct {v3, v1, v2, v0, v4}, Lcom/google/android/gms/internal/ads/zzsx;-><init>(Lcom/google/android/gms/internal/ads/zzam;Ljava/lang/Throwable;ZI)V

    throw v3

    :cond_5
    :goto_1
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzx:Ljava/util/ArrayDeque;

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_a

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzx:Ljava/util/ArrayDeque;
    :try_end_3
    .catch Lcom/google/android/gms/internal/ads/zzsx; {:try_start_3 .. :try_end_3} :catch_3

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_4
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->peekFirst()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/ads/zzsv;

    :goto_2
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzs:Lcom/google/android/gms/internal/ads/zzsr;

    if-nez v5, :cond_9

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->peekFirst()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/ads/zzsv;
    :try_end_4
    .catch Lcom/google/android/gms/internal/ads/zzsx; {:try_start_4 .. :try_end_4} :catch_3

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_5
    invoke-virtual {p0, v5}, Lcom/google/android/gms/internal/ads/zzsz;->zzaI(Lcom/google/android/gms/internal/ads/zzsv;)Z

    move-result v6
    :try_end_5
    .catch Lcom/google/android/gms/internal/ads/zzsx; {:try_start_5 .. :try_end_5} :catch_3

    if-eqz v6, :cond_b

    :try_start_6
    invoke-direct {p0, v5, v3}, Lcom/google/android/gms/internal/ads/zzsz;->zzam(Lcom/google/android/gms/internal/ads/zzsv;Landroid/media/MediaCrypto;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    goto :goto_2

    :catch_1
    move-exception v6

    const-string v7, "MediaCodecRenderer"

    if-ne v5, v4, :cond_6

    :try_start_7
    const-string v6, "Preferred decoder instantiation failed. Sleeping for 50ms then retrying."

    invoke-static {v7, v6}, Lcom/google/android/gms/internal/ads/zzff;->zzf(Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 v8, 0x32

    invoke-static {v8, v9}, Ljava/lang/Thread;->sleep(J)V

    invoke-direct {p0, v5, v3}, Lcom/google/android/gms/internal/ads/zzsz;->zzam(Lcom/google/android/gms/internal/ads/zzsv;Landroid/media/MediaCrypto;)V

    goto :goto_2

    :cond_6
    throw v6
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2

    :catch_2
    move-exception v6

    :try_start_8
    iget-object v8, v5, Lcom/google/android/gms/internal/ads/zzsv;->zza:Ljava/lang/String;

    const-string v9, "Failed to initialize decoder: "

    invoke-virtual {v9, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8, v6}, Lcom/google/android/gms/internal/ads/zzff;->zzg(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    new-instance v7, Lcom/google/android/gms/internal/ads/zzsx;

    invoke-direct {v7, v1, v6, v0, v5}, Lcom/google/android/gms/internal/ads/zzsx;-><init>(Lcom/google/android/gms/internal/ads/zzam;Ljava/lang/Throwable;ZLcom/google/android/gms/internal/ads/zzsv;)V

    invoke-virtual {p0, v7}, Lcom/google/android/gms/internal/ads/zzsz;->zzai(Ljava/lang/Exception;)V

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzy:Lcom/google/android/gms/internal/ads/zzsx;

    if-nez v5, :cond_7

    iput-object v7, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzy:Lcom/google/android/gms/internal/ads/zzsx;

    goto :goto_3

    :cond_7
    invoke-static {v5, v7}, Lcom/google/android/gms/internal/ads/zzsx;->zza(Lcom/google/android/gms/internal/ads/zzsx;Lcom/google/android/gms/internal/ads/zzsx;)Lcom/google/android/gms/internal/ads/zzsx;

    move-result-object v5

    iput-object v5, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzy:Lcom/google/android/gms/internal/ads/zzsx;

    :goto_3
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_8

    goto :goto_2

    :cond_8
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzy:Lcom/google/android/gms/internal/ads/zzsx;

    throw v1

    :cond_9
    iput-object v3, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzx:Ljava/util/ArrayDeque;

    return-void

    :cond_a
    new-instance v2, Lcom/google/android/gms/internal/ads/zzsx;

    const v4, -0xc34f

    invoke-direct {v2, v1, v3, v0, v4}, Lcom/google/android/gms/internal/ads/zzsx;-><init>(Lcom/google/android/gms/internal/ads/zzam;Ljava/lang/Throwable;ZI)V

    throw v2
    :try_end_8
    .catch Lcom/google/android/gms/internal/ads/zzsx; {:try_start_8 .. :try_end_8} :catch_3

    :catch_3
    move-exception v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzm:Lcom/google/android/gms/internal/ads/zzam;

    const/16 v3, 0xfa1

    invoke-virtual {p0, v1, v2, v0, v3}, Lcom/google/android/gms/internal/ads/zziq;->zzi(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzam;ZI)Lcom/google/android/gms/internal/ads/zziz;

    move-result-object v0

    throw v0

    :cond_b
    :goto_4
    return-void
.end method

.method protected zzay(J)V
    .locals 2

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzad:J

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzk:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzk:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzsy;

    iget-wide v0, v0, Lcom/google/android/gms/internal/ads/zzsy;->zzb:J

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzk:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzsy;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzsz;->zzaN(Lcom/google/android/gms/internal/ads/zzsy;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzan()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected zzaz(Lcom/google/android/gms/internal/ads/zzih;)V
    .locals 0

    return-void
.end method

.method public final zze()I
    .locals 1

    const/16 v0, 0x8

    return v0
.end method

.method protected zzw()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzm:Lcom/google/android/gms/internal/ads/zzam;

    sget-object v0, Lcom/google/android/gms/internal/ads/zzsy;->zza:Lcom/google/android/gms/internal/ads/zzsy;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzsz;->zzaN(Lcom/google/android/gms/internal/ads/zzsy;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzk:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzaF()Z

    return-void
.end method

.method protected zzx(ZZ)V
    .locals 0

    new-instance p1, Lcom/google/android/gms/internal/ads/zzir;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzir;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zza:Lcom/google/android/gms/internal/ads/zzir;

    return-void
.end method

.method protected zzz(JZ)V
    .locals 0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzZ:Z

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzaa:Z

    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzN:Z

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzi:Lcom/google/android/gms/internal/ads/zzsn;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzib;->zzb()V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzh:Lcom/google/android/gms/internal/ads/zzih;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzib;->zzb()V

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzO:Z

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzl:Lcom/google/android/gms/internal/ads/zzrk;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzrk;->zzb()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzsz;->zzaE()Z

    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzac:Lcom/google/android/gms/internal/ads/zzsy;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzsy;->zze:Lcom/google/android/gms/internal/ads/zzfv;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfv;->zza()I

    move-result p2

    if-lez p2, :cond_1

    const/4 p2, 0x1

    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzab:Z

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfv;->zze()V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzsz;->zzk:Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    return-void
.end method

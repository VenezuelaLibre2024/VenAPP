.class final Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfd;
.super Ljava/io/OutputStream;
.source "SourceFile"


# instance fields
.field private zza:J


# direct methods
.method constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfd;->zza:J

    return-void
.end method


# virtual methods
.method public final write(I)V
    .locals 4

    iget-wide v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfd;->zza:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfd;->zza:J

    return-void
.end method

.method public final write([B)V
    .locals 4

    iget-wide v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfd;->zza:J

    array-length p1, p1

    int-to-long v2, p1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfd;->zza:J

    return-void
.end method

.method public final write([BII)V
    .locals 2

    if-ltz p2, :cond_0

    array-length p1, p1

    if-gt p2, p1, :cond_0

    if-ltz p3, :cond_0

    add-int/2addr p2, p3

    if-gt p2, p1, :cond_0

    if-ltz p2, :cond_0

    iget-wide p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfd;->zza:J

    int-to-long v0, p3

    add-long/2addr p1, v0

    iput-wide p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfd;->zza:J

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method final zza()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfd;->zza:J

    return-wide v0
.end method

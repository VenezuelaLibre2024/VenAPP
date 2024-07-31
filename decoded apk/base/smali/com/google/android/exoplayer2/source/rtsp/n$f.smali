.class final Lcom/google/android/exoplayer2/source/rtsp/n$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv7/v0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/source/rtsp/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "f"
.end annotation


# instance fields
.field private final a:I

.field final synthetic b:Lcom/google/android/exoplayer2/source/rtsp/n;


# direct methods
.method public constructor <init>(Lcom/google/android/exoplayer2/source/rtsp/n;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/rtsp/n$f;->b:Lcom/google/android/exoplayer2/source/rtsp/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/google/android/exoplayer2/source/rtsp/n$f;->a:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/n$f;->b:Lcom/google/android/exoplayer2/source/rtsp/n;

    invoke-static {v0}, Lcom/google/android/exoplayer2/source/rtsp/n;->d(Lcom/google/android/exoplayer2/source/rtsp/n;)Lcom/google/android/exoplayer2/source/rtsp/RtspMediaSource$c;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/n$f;->b:Lcom/google/android/exoplayer2/source/rtsp/n;

    invoke-static {v0}, Lcom/google/android/exoplayer2/source/rtsp/n;->d(Lcom/google/android/exoplayer2/source/rtsp/n;)Lcom/google/android/exoplayer2/source/rtsp/RtspMediaSource$c;

    move-result-object v0

    throw v0
.end method

.method public d()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/n$f;->b:Lcom/google/android/exoplayer2/source/rtsp/n;

    iget v1, p0, Lcom/google/android/exoplayer2/source/rtsp/n$f;->a:I

    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/source/rtsp/n;->Q(I)Z

    move-result v0

    return v0
.end method

.method public p(J)I
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/n$f;->b:Lcom/google/android/exoplayer2/source/rtsp/n;

    iget v1, p0, Lcom/google/android/exoplayer2/source/rtsp/n$f;->a:I

    invoke-virtual {v0, v1, p1, p2}, Lcom/google/android/exoplayer2/source/rtsp/n;->Y(IJ)I

    move-result p1

    return p1
.end method

.method public q(Lt6/v1;Lw6/g;I)I
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/n$f;->b:Lcom/google/android/exoplayer2/source/rtsp/n;

    iget v1, p0, Lcom/google/android/exoplayer2/source/rtsp/n$f;->a:I

    invoke-virtual {v0, v1, p1, p2, p3}, Lcom/google/android/exoplayer2/source/rtsp/n;->U(ILt6/v1;Lw6/g;I)I

    move-result p1

    return p1
.end method

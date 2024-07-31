.class final Lcom/google/android/exoplayer2/source/rtsp/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/exoplayer2/source/rtsp/b$a;


# instance fields
.field private final a:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/google/android/exoplayer2/source/rtsp/f0;->a:J

    return-void
.end method


# virtual methods
.method public a(I)Lcom/google/android/exoplayer2/source/rtsp/b;
    .locals 3

    new-instance v0, Lcom/google/android/exoplayer2/source/rtsp/e0;

    iget-wide v1, p0, Lcom/google/android/exoplayer2/source/rtsp/f0;->a:J

    invoke-direct {v0, v1, v2}, Lcom/google/android/exoplayer2/source/rtsp/e0;-><init>(J)V

    mul-int/lit8 p1, p1, 0x2

    invoke-static {p1}, Lc8/b;->a(I)Ls8/n;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/source/rtsp/e0;->o(Ls8/n;)J

    return-object v0
.end method
